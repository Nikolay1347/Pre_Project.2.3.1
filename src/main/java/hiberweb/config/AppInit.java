package hiberweb.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public AppInit() {
        }

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return null;
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] {WebConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] {"/"};
        }
}
