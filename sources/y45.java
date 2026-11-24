// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class y45 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j55 b;

    public /* synthetic */ y45(j55 j55Var, byte b) {
        this.a = b;
        this.b = j55Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        j55 j55Var = this.b;
        switch (b) {
            case 0:
                if (!j55Var.a() && !j55Var.d) {
                    j55Var.d = false;
                    if (!j55Var.f) {
                        j55Var.f = true;
                        j55Var.b.c();
                    }
                    if (!j55Var.e) {
                        j55Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                if (!j55Var.a() && !j55Var.d) {
                    j55Var.d = false;
                    if (!j55Var.f) {
                        j55Var.f = true;
                        j55Var.b.c();
                    }
                    if (!j55Var.e) {
                        j55Var.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
