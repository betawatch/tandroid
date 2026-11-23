package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Cells.aa;
import ug.u1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(k kVar, n0 n0Var, long j3, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = n0Var;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.c.post(new b(kVar, this.c, this.d, 1));
                break;
            default:
                k kVar2 = this.b;
                n0 n0Var = this.c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    kVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.k.a;
                    Handler handler = u0Var.i;
                    aa aaVar = u0Var.d;
                    Objects.requireNonNull(aaVar);
                    handler.post(new u1(aaVar, 17));
                    break;
                }
                break;
        }
    }
}
