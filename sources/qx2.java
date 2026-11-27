// default package

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class qx2 {
    public static final Collection a;

    static {
        try {
            byte b = 1;
            Iterator it = Arrays.asList(new ek()).iterator();
            it.getClass();
            a = k8a.a(new lt2(new l8a(it, b)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
