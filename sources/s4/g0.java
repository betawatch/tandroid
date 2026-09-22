package s4;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ g0(RecyclerView recyclerView, int i10) {
        this.a = i10;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b;
                if (recyclerView.I && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.G) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.L) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.K = true;
                        break;
                    }
                }
                break;
            default:
                RecyclerView recyclerView2 = this.b;
                m0 m0Var = recyclerView2.c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.z0 = false;
                break;
        }
    }
}
