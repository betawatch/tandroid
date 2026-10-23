package ug;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ t0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                x0Var.e0.clear();
                x0Var.Y.d.b(true);
                x0Var.b0(true, false);
                break;
            default:
                this.b.W(false);
                break;
        }
    }
}
