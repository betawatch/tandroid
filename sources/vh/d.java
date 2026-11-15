package vh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import v4.b0;
import v4.t0;
import wg.c1;
import wg.u0;
import zh.l;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d extends t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 1) {
                    g0.v1(((u0) this.b).U1.getEditText());
                    break;
                }
                break;
            case 2:
                if (i7 == 1) {
                    g0.v1(((c1) this.b).V1.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // v4.t0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((h) this.b).f1();
                break;
            case 3:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                l lVar = (l) this.b;
                zh.e eVar = lVar.C;
                if (lVar.x && !lVar.w && b0Var != null) {
                    if (lVar.f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
