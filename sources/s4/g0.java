package s4;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
