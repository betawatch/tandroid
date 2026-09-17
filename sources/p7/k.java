package p7;

import java.util.HashMap;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class k {
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
