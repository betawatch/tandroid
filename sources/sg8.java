// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sg8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu5 b;

    public /* synthetic */ sg8(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                u31.e();
                bu5Var.r();
                break;
            default:
                u31.e();
                bu5Var.r();
                break;
        }
    }
}
