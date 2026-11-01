package wc;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class c {
    public static final Map a;

    static {
        Map map;
        try {
            Field declaredField = ue.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map map2 = Collections.EMPTY_MAP;
            th2.printStackTrace();
            map = map2;
        }
        a = map;
    }
}
