package p7;

import java.util.HashMap;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
