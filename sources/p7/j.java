package p7;

import java.util.HashMap;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
