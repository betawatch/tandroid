// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rke {
    public static volatile rke a;
    public static volatile rke b;
    public static final rke c;

    static {
        rke rkeVar = new rke();
        Map map = Collections.EMPTY_MAP;
        c = rkeVar;
    }

    public static void a() {
        if (a == null) {
            synchronized (rke.class) {
                if (a == null) {
                    a = c;
                }
            }
        }
    }
}
