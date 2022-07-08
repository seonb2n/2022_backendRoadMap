@Slf4j
public class CorsFilter implements Filter {

    static List<String> allowOriginList = new ArrayList<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(">>> CorsFilter init");
        allowOriginList.add("접근 허용하고자 하는 도메인");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        var method = request.getMethod();
        var origin = request.getHeader("origin");

        if (method.equals("OPTIONS") && origin != null && !allowOriginList.contains(origin)) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        log.info(">>> CorsFilter Do");
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Methods", "POST");
        chain.doFilter(req, response);
    }
}
