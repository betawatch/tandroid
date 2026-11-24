// default package

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ww2 {
    public static final Collection a;

    static {
        try {
            byte b = 1;
            Iterator it = Arrays.asList(new dk()).iterator();
            it.getClass();
            a = s4a.a(new rs2(new t4a(it, b)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
