package vh;

import org.telegram.messenger.is;
import org.telegram.messenger.wp;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q8(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t8 t8Var = ((z8) this.c).a;
                if (t8Var != null) {
                    t8Var.j(this.b, false);
                    break;
                }
                break;
            case 1:
                yh.z zVar = (yh.z) this.c;
                wp.r1(zVar.a).O2(this.b, zVar.l1, true, false, new yh.q(zVar, 1));
                break;
            case 2:
                yh.d0 d0Var = (yh.d0) this.c;
                d0Var.i = null;
                d0Var.g.l(this.b);
                d0Var.l++;
                d0Var.a();
                yh.c0 c0Var = d0Var.h;
                if (c0Var != null) {
                    c0Var.b();
                    break;
                }
                break;
            default:
                zf.z zVar2 = (zf.z) this.c;
                long j10 = this.b;
                zVar2.getClass();
                try {
                    is.a0(zVar2.s0).b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
        }
    }
}
