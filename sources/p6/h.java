package p6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h extends d implements com.google.android.gms.common.api.c {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, Looper looper, int i3, o3 o3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i10) {
        super(context, looper, r5, i3, new n(kVar), new n(lVar), (String) o3Var.e);
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
        Object obj = m6.d.d;
        m.g(kVar);
        m.g(lVar);
        Set set = (Set) o3Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.E = set;
    }
}
