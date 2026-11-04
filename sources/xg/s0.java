package xg;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i3) {
        this.a = i3;
        this.b = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.X1.clear();
                w0Var.R1.d.b(true);
                w0Var.n1(true, false);
                break;
            default:
                this.b.i1(false);
                break;
        }
    }
}
