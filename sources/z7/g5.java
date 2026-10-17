package z7;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g5 {
    public static Bundle a(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static ja.c b(int i10, n4.s sVar) {
        s sVar2 = new s(i10);
        if (((HashMap) sVar.c) == null) {
            sVar.c = new HashMap();
        }
        ((HashMap) sVar.c).put(w.class, sVar2);
        return new ja.c((String) sVar.b, ((HashMap) sVar.c) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) sVar.c)));
    }
}
