package q6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import m.q3;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class h extends d implements com.google.android.gms.common.api.c {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, Looper looper, int i7, q3 q3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i10) {
        super(context, looper, r5, i7, new n(kVar), new n(lVar), (String) q3Var.e);
        synchronized (l0.g) {
            try {
                if (l0.h == null) {
                    l0.h = new l0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0 l0Var = l0.h;
        Object obj = n6.d.d;
        m.g(kVar);
        m.g(lVar);
        Set set = (Set) q3Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.E = set;
    }
}
