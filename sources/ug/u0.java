package ug;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ u0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                y0Var.e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                break;
            default:
                this.b.X(false);
                break;
        }
    }
}
