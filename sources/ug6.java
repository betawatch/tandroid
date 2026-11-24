// default package

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ug6 {
    public static final kc5 a;

    static {
        Object obj;
        int i = hdb.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            byte b = 1;
            Iterator it = Arrays.asList(new ck()).iterator();
            it.getClass();
            Iterator it2 = s4a.a(new rs2(new t4a(it, b))).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ((ck) next).getClass();
                    do {
                        ((ck) it2.next()).getClass();
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (((ck) obj) == null) {
                sc8.j("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                a = new kc5(lc5.a(mainLooper), false);
            } else {
                sc8.j("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
