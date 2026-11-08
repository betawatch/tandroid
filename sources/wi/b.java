package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                if (kVar2.V && kVar2.G == m0Var) {
                    kVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.A(j3));
                    t0 t0Var = (t0) kVar2.k.b;
                    Handler handler = t0Var.i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.p(rtVar, 3));
                    break;
                }
                break;
        }
    }
}
