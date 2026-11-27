// default package

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class zi6 {
    public static final le5 a;

    static {
        Object obj;
        int i = chb.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            byte b = 1;
            Iterator it = Arrays.asList(new dk()).iterator();
            it.getClass();
            Iterator it2 = k8a.a(new lt2(new l8a(it, b))).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ((dk) next).getClass();
                    do {
                        ((dk) it2.next()).getClass();
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (((dk) obj) == null) {
                grb.i("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                a = new le5(me5.a(mainLooper), false);
            } else {
                grb.i("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
