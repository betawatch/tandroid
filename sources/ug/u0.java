package ug;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
