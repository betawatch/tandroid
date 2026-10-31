package v7;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class k5 {
    public static Map a(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return com.google.android.gms.internal.cast.r0.n;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }
}
