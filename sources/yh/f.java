package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mz;
import v4.b0;
import v4.s0;
import zh.l3;
import zh.m3;
import zh.o3;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                m3 m3Var = (m3) this.b;
                for (int i11 = 0; i11 < m3Var.f.getChildCount(); i11++) {
                    if (m3Var.f.getChildAt(i11) instanceof mz) {
                        m3Var.d.g(false);
                        break;
                    }
                }
                break;
            case 2:
                ((l3) this.b).d1();
                break;
            default:
                o3 o3Var = (o3) this.b;
                if (o3Var.e1()) {
                    o3Var.Q1.a();
                    break;
                }
                break;
        }
    }
}
