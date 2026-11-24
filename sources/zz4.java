// default package

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zz4 extends hh0 {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zz4(int i, f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(context, looper, r5, i, new cf9((Object) f05Var, (byte) 20), new oo8(g05Var, (byte) 25), (String) ovbVar.e);
        lbf lbfVar;
        synchronized (lbf.g) {
            lbf lbfVar2 = lbf.h;
            if (lbfVar2 == null) {
                lbfVar2 = new lbf(context.getApplicationContext(), context.getMainLooper());
                lbf.h = lbfVar2;
            }
            lbfVar = lbfVar2;
        }
        Object obj = d05.d;
        ite.h(f05Var);
        ite.h(g05Var);
        Set set = (Set) ovbVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                dq9.m("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.E = set;
    }
}
