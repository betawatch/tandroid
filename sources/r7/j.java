package r7;

import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class j {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i3 = 0;
        while (true) {
            String[] strArr = a;
            if (i3 >= 10) {
                return;
            }
            b.put(strArr[i3], Integer.valueOf(i3));
            i3++;
        }
    }
}
