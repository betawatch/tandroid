// default package

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u5d implements g6d {
    public final i6d a;

    public u5d(i6d i6dVar) {
        this.a = i6dVar;
    }

    @Override // g6d
    public final void F0(int i) {
        i6d i6dVar = this.a;
        i6dVar.h();
        i6dVar.p.z0(i);
    }

    @Override // g6d
    public final jg0 c(jg0 jg0Var) {
        i6d i6dVar = this.a;
        try {
            d6d d6dVar = i6dVar.o;
            qx6 qx6Var = d6dVar.N;
            ((Set) qx6Var.b).add(jg0Var);
            jg0Var.g.set((b7d) qx6Var.c);
            xn xnVar = jg0Var.o;
            d05 d05Var = (d05) d6dVar.F.get(xnVar);
            xve.i(d05Var, "Appropriate Api was not requested.");
            if (!d05Var.q() && i6dVar.i.containsKey(xnVar)) {
                jg0Var.o(new Status(17, null, null, null));
                return jg0Var;
            }
            try {
                jg0Var.n(d05Var);
            } catch (DeadObjectException e) {
                jg0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                jg0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
            return jg0Var;
        } catch (DeadObjectException unused) {
            t5d t5dVar = new t5d(this, this);
            b6d b6dVar = i6dVar.e;
            b6dVar.sendMessage(b6dVar.obtainMessage(1, t5dVar));
            return jg0Var;
        }
    }

    @Override // g6d
    public final boolean m1() {
        i6d i6dVar = this.a;
        i6dVar.o.getClass();
        i6dVar.h();
        return true;
    }

    @Override // g6d
    public final void H1() {
    }

    @Override // g6d
    public final void a() {
    }

    @Override // g6d
    public final void J(Bundle bundle) {
    }

    @Override // g6d
    public final void x1(ws2 ws2Var, zn znVar, boolean z) {
    }
}
