package p7;

import java.util.HashMap;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class j {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = a;
            if (i10 >= 10) {
                return;
            }
            b.put(strArr[i10], Integer.valueOf(i10));
            i10++;
        }
    }
}
