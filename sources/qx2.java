// default package

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
