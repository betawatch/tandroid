package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(l lVar, n0 n0Var, long j3, int i7) {
        this.a = i7;
        this.b = lVar;
        this.c = n0Var;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.c.post(new b(lVar, this.c, this.d, 1));
                break;
            default:
                l lVar2 = this.b;
                n0 n0Var = this.c;
                long j3 = this.d;
                if (lVar2.U && lVar2.F == n0Var) {
                    lVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + l.z(j3));
                    v0 v0Var = (v0) lVar2.k.a;
                    Handler handler = v0Var.i;
                    ff ffVar = v0Var.d;
                    Objects.requireNonNull(ffVar);
                    handler.post(new vg.o(ffVar, 14));
                    break;
                }
                break;
        }
    }
}
