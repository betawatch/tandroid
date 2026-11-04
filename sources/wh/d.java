package wh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import u4.b0;
import u4.t0;
import xg.e1;
import xg.w0;
import zh.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d extends t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        switch (this.a) {
            case 1:
                if (i3 == 1) {
                    g0.v1(((w0) this.b).R1.getEditText());
                    break;
                }
                break;
            case 2:
                if (i3 == 1) {
                    g0.v1(((e1) this.b).S1.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 0:
                ((h) this.b).f1();
                break;
            case 3:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                k kVar = (k) this.b;
                zh.e eVar = kVar.C;
                if (kVar.x && !kVar.w && b0Var != null) {
                    if (kVar.f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
