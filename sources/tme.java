// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tme {
    public static volatile tme a;
    public static volatile tme b;
    public static final tme c;

    static {
        tme tmeVar = new tme();
        Map map = Collections.EMPTY_MAP;
        c = tmeVar;
    }

    public static void a() {
        if (a == null) {
            synchronized (tme.class) {
                if (a == null) {
                    a = c;
                }
            }
        }
    }
}
