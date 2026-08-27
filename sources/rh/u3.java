package rh;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class u3 {
    public String a;
    public boolean b;
    public String c;
    public HashMap d;
    public final ArrayList e = new ArrayList();

    public final String a(String str) {
        HashMap hashMap = this.d;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get(str);
    }

    public final boolean b(String str) {
        HashMap hashMap = this.d;
        return hashMap != null && hashMap.containsKey(str);
    }
}
