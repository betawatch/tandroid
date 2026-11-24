// default package

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class vi6 {
    public static final ie5 a;

    static {
        Object obj;
        int i = ifb.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            byte b = 1;
            Iterator it = Arrays.asList(new cl()).iterator();
            it.getClass();
            Iterator it2 = u6a.a(new cu2(new v6a(it, b))).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ((cl) next).getClass();
                    do {
                        ((cl) it2.next()).getClass();
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (((cl) obj) == null) {
                dq9.m("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                a = new ie5(je5.a(mainLooper), false);
            } else {
                dq9.m("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
