// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wr0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gs0 b;

    public /* synthetic */ wr0(gs0 gs0Var, byte b) {
        this.a = b;
        this.b = gs0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gs0 gs0Var = this.b;
        switch (b) {
            case 0:
                kea keaVar = gs0Var.a0;
                t3b t3bVar = gs0Var.a;
                keaVar.a(t3bVar == null ? "" : t3bVar.E);
                break;
            default:
                gs0Var.a0.b(gs0Var.a.E);
                break;
        }
    }
}
