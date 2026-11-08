package s7;

import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
