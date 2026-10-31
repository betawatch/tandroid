package vh;

import org.telegram.messenger.hs;
import org.telegram.messenger.vp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                yh.a0 a0Var = (yh.a0) this.c;
                vp.r1(a0Var.a).O2(this.b, a0Var.l1, true, false, new yh.r(a0Var, 1));
                break;
            case 2:
                yh.e0 e0Var = (yh.e0) this.c;
                e0Var.i = null;
                e0Var.g.l(this.b);
                e0Var.l++;
                e0Var.a();
                yh.d0 d0Var = e0Var.h;
                if (d0Var != null) {
                    d0Var.b();
                    break;
                }
                break;
            default:
                zf.z zVar = (zf.z) this.c;
                long j10 = this.b;
                zVar.getClass();
                try {
                    hs.a0(zVar.s0).b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
        }
    }
}
