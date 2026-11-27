// default package

import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class use {
    public static int a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        awd.b(i, "expectedSize");
        return i + 1;
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
