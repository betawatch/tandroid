// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w70 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ th8 b;

    public /* synthetic */ w70(th8 th8Var, byte b) {
        this.a = b;
        this.b = th8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        th8 th8Var = this.b;
        switch (b) {
            case 0:
                th8Var.b(true);
                break;
            case 1:
                th8Var.b(true);
                break;
            case 2:
                th8Var.b(true);
                break;
            default:
                th8Var.b(true);
                break;
        }
    }
}
