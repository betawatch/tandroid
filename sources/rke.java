// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
