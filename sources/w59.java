// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w59 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ w59(RecyclerView recyclerView, byte b) {
        this.a = b;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
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
                d69 d69Var = recyclerView.d0;
                if (d69Var != null) {
                    d69Var.m();
                }
                recyclerView.B0 = false;
                break;
        }
    }
}
