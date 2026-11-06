package v4;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ f0(RecyclerView recyclerView, int i7) {
        this.a = i7;
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
                l0 l0Var = recyclerView2.c0;
                if (l0Var != null) {
                    l0Var.m();
                }
                recyclerView2.A0 = false;
                break;
        }
    }
}
