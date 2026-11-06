package p4;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class x {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final d0 a;

    public x(Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, pb.b bVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z9, boolean z10) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new d0(this, context, str, c1Var, i0Var, i0Var2, i0Var3, bVar, bundle, bundle2, dVar, z9, z10);
    }
}
