package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.xq;
import v4.b0;
import v4.s0;
import zh.k3;
import zh.l3;
import zh.n3;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f extends s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                m mVar = (m) this.b;
                e eVar = mVar.C;
                if (mVar.x && !mVar.w && b0Var != null) {
                    if (mVar.f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        break;
                    }
                }
                break;
            case 1:
                l3 l3Var = (l3) this.b;
                int i11 = 0;
                while (true) {
                    if (i11 < l3Var.n.getChildCount()) {
                        if (l3Var.n.getChildAt(i11) instanceof mz) {
                            l3Var.d.g(false);
                        } else {
                            i11++;
                        }
                    }
                }
                q.l(l3Var.h.animate().alpha((l3Var.K && l3Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), xq.h, 320L);
                break;
            case 2:
                ((k3) this.b).d1();
                break;
            default:
                n3 n3Var = (n3) this.b;
                if (n3Var.e1()) {
                    n3Var.Q1.a();
                    break;
                }
                break;
        }
    }
}
