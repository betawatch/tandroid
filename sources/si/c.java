package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ c(k kVar, m0 m0Var, long j10, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = m0Var;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.c.post(new c(kVar, this.c, this.d, 1));
                break;
            default:
                k kVar2 = this.b;
                m0 m0Var = this.c;
                long j10 = this.d;
                if (kVar2.V && kVar2.G == m0Var) {
                    kVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j10));
                    t0 t0Var = (t0) kVar2.k.b;
                    Handler handler = t0Var.i;
                    l2.f fVar = t0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    break;
                }
                break;
        }
    }
}
