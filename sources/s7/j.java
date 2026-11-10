package s7;

import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
