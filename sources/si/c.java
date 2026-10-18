package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ c(k kVar, l0 l0Var, long j10, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = l0Var;
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
                l0 l0Var = this.c;
                long j10 = this.d;
                if (kVar2.V && kVar2.G == l0Var) {
                    kVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j10));
                    s0 s0Var = (s0) kVar2.k.b;
                    Handler handler = s0Var.i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    break;
                }
                break;
        }
    }
}
