// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ow9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw9 b;

    public /* synthetic */ ow9(tw9 tw9Var, byte b) {
        this.a = b;
        this.b = tw9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        tw9 tw9Var = this.b;
        switch (b) {
            case 0:
                if (tw9Var.Z == null) {
                    tw9Var.dismiss();
                    break;
                }
                break;
            default:
                tw9Var.dismiss();
                break;
        }
    }
}
