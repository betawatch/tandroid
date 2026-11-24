// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qve {
    public static xr9 a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new xr9();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                hashMap.put(str, bundle2.get(str));
            }
            return new xr9(hashMap);
        }
        ClassLoader classLoader = xr9.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            dq9.m("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new xr9(linkedHashMap);
    }
}
