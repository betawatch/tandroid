// default package

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class owc {
    public static final qwc a;

    static {
        qwc jk2Var;
        try {
            jk2Var = new oo8((WebViewProviderFactoryBoundaryInterface) oz0.a(WebViewProviderFactoryBoundaryInterface.class, g0f.a()), (byte) 23);
        } catch (ClassNotFoundException unused) {
            jk2Var = new jk2((byte) 2);
        } catch (IllegalAccessException e) {
            e = e;
            rjb.m(e);
            return;
        } catch (NoSuchMethodException e2) {
            e = e2;
            rjb.m(e);
            return;
        } catch (InvocationTargetException e3) {
            e = e3;
            rjb.m(e);
            return;
        }
        a = jk2Var;
    }
}
