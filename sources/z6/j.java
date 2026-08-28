package z6;

import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i9 = 0;
        while (true) {
            String[] strArr = a;
            if (i9 >= 10) {
                return;
            }
            b.put(strArr[i9], Integer.valueOf(i9));
            i9++;
        }
    }
}
