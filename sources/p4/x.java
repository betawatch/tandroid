package p4;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class x {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final e0 a;

    public x(Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new e0(this, context, str, c1Var, i0Var, i0Var2, i0Var3, sVar, bundle, bundle2, dVar, z10, z11);
    }
}
