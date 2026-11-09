package s7;

import java.util.HashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class j {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i7 = 0;
        while (true) {
            String[] strArr = a;
            if (i7 >= 10) {
                return;
            }
            b.put(strArr[i7], Integer.valueOf(i7));
            i7++;
        }
    }
}
