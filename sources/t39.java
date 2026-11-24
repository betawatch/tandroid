// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t39 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ t39(RecyclerView recyclerView, byte b) {
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
                b49 b49Var = recyclerView.d0;
                if (b49Var != null) {
                    b49Var.m();
                }
                recyclerView.B0 = false;
                break;
        }
    }
}
