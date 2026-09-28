package tg;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
