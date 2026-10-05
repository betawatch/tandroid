package tg;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                this.b.U(false);
                break;
        }
    }
}
