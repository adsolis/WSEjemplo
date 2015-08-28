package mc.com.sintelti;

public class EjemploWSBeanProxy implements mc.com.sintelti.EjemploWSBean {
  private String _endpoint = null;
  private mc.com.sintelti.EjemploWSBean ejemploWSBean = null;
  
  public EjemploWSBeanProxy() {
    _initEjemploWSBeanProxy();
  }
  
  public EjemploWSBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initEjemploWSBeanProxy();
  }
  
  private void _initEjemploWSBeanProxy() {
    try {
      ejemploWSBean = (new mc.com.sintelti.EjemploWSBeanServiceLocator()).getEjemploWSBean();
      if (ejemploWSBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ejemploWSBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ejemploWSBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ejemploWSBean != null)
      ((javax.xml.rpc.Stub)ejemploWSBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc.com.sintelti.EjemploWSBean getEjemploWSBean() {
    if (ejemploWSBean == null)
      _initEjemploWSBeanProxy();
    return ejemploWSBean;
  }
  
  public java.lang.Object crearPersona(java.lang.String nombre, java.lang.String apellidos, java.lang.String puesto) throws java.rmi.RemoteException{
    if (ejemploWSBean == null)
      _initEjemploWSBeanProxy();
    return ejemploWSBean.crearPersona(nombre, apellidos, puesto);
  }
  
  
}