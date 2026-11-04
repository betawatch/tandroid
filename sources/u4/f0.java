package u4;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ f0(RecyclerView recyclerView, int i3) {
        this.a = i3;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b;
                if (recyclerView.J && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.H) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.M) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.L = true;
                        break;
                    }
                }
                break;
            default:
                RecyclerView recyclerView2 = this.b;
                m0 m0Var = recyclerView2.d0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.B0 = false;
                break;
        }
    }
}
