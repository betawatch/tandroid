package tg;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
