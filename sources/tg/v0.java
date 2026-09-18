package tg;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ v0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                z0Var.e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                break;
            default:
                this.b.W(false);
                break;
        }
    }
}
