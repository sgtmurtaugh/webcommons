package de.ckraus.webcommons.mapper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class TypeMapperServletRequestFacade implements ServletRequest {

    private ServletRequest servletRequest;


    /**
     * Constructor
     * @param servletRequest
     */
    public TypeMapperServletRequestFacade(ServletRequest servletRequest ) {
       super();
       this.servletRequest = servletRequest;
    }


    public ServletRequest getRequest() {
        return this.servletRequest;
    }

    public Object getAttribute(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getAttribute(s);
    }

    public Enumeration getAttributeNames() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getAttributeNames();
    }

    public String getCharacterEncoding() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getCharacterEncoding();
    }

    public void setCharacterEncoding(String s) throws UnsupportedEncodingException {
        if (this.getRequest() != null) {
            this.getRequest().setCharacterEncoding(s);
        }
    }

    public int getContentLength() {
        return this.getRequest() == null
                ? 0
                : this.getRequest().getContentLength();
    }

    public String getContentType() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getContentType();
    }

    public ServletInputStream getInputStream() throws IOException {
        return this.getRequest() == null
                ? null
                : this.getRequest().getInputStream();
    }

    public String getParameter(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getParameter(s);
    }

    public Enumeration getParameterNames() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getParameterNames();
    }

    public String[] getParameterValues(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getParameterValues(s);
    }

    public Map getParameterMap() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getParameterMap();
    }

    public String getProtocol() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getProtocol();
    }

    public String getScheme() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getScheme();
    }

    public String getServerName() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getServerName();
    }

    public int getServerPort() {
        return this.getRequest() == null
                ? 0
                : this.getRequest().getServerPort();
    }

    public BufferedReader getReader() throws IOException {
        return this.getRequest() == null
                ? null
                : this.getRequest().getReader();
    }

    public String getRemoteAddr() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRemoteAddr();
    }

    public String getRemoteHost() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRemoteHost();
    }

    public void setAttribute(String s, Object o) {
        if (this.getRequest() != null) {
            this.getRequest().setAttribute(s, o);
        }
    }

    public void removeAttribute(String s) {
        if (this.getRequest() != null) {
            this.getRequest().removeAttribute(s);
        }
    }

    public Locale getLocale() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getLocale();
    }

    public Enumeration getLocales() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getLocales();
    }

    public boolean isSecure() {
        return this.getRequest() != null && this.getRequest().isSecure();
    }

    public RequestDispatcher getRequestDispatcher(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRequestDispatcher(s);
    }

    /**
     *
     * @param s
     * @return
     * @deprecated
     */
    @Deprecated
    public String getRealPath(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRealPath(s);
    }

    public int getRemotePort() {
        return this.getRequest() == null
                ? 0
                : this.getRequest().getRemotePort();
    }

    public String getLocalName() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getLocalName();
    }

    public String getLocalAddr() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getLocalAddr();
    }

    public int getLocalPort() {
        return this.getRequest() == null
                ? 0
                : this.getRequest().getLocalPort();
    }

}
