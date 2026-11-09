package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(k kVar, m0 m0Var, long j3, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = m0Var;
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
                m0 m0Var = this.c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == m0Var) {
                    kVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    t0 t0Var = (t0) kVar2.k.b;
                    Handler handler = t0Var.i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.a0(rtVar, 1));
                    break;
                }
                break;
        }
    }
}
