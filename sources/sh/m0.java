package sh;

import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.z4;
import vh.y1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.c;
                o0Var.i = null;
                o0Var.g.l(this.b);
                o0Var.l++;
                o0Var.a();
                n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.d();
                    break;
                }
                break;
            case 1:
                vh.p pVar = (vh.p) this.c;
                z4.M(pVar.b.c0.getParentActivity(), this.b, new o2.o(pVar, 29), pVar.a);
                break;
            default:
                y1 y1Var = (y1) this.c;
                z4.M(y1Var.getParentActivity(), this.b, new qk0(y1Var, 18), y1Var.getResourceProvider());
                break;
        }
    }
}
