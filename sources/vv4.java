// default package

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv4 b;

    public /* synthetic */ vv4(xv4 xv4Var, byte b) {
        this.a = b;
        this.b = xv4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                xv4Var.c(null);
                break;
            default:
                LinearLayout linearLayout = xv4Var.e;
                if (linearLayout != null && !xv4Var.O) {
                    xv4Var.e = null;
                    xv4Var.h(linearLayout, false);
                    break;
                }
                break;
        }
    }
}
