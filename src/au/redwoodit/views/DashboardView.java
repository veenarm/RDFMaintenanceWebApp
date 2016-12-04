package au.redwoodit.views;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@ViewScoped
@Named
public class DashboardView {

    public String getVersion() {
        return FacesContext.class.getPackage().getImplementationVendor() + " - " + FacesContext.class.getPackage().getImplementationVersion();
    }

}
