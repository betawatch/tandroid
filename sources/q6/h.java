package q6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import m.o3;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class h extends d implements com.google.android.gms.common.api.c {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, Looper looper, int i7, o3 o3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i10) {
        super(context, looper, r5, i7, new n(kVar), new n(lVar), (String) o3Var.e);
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
