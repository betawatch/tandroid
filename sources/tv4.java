// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tv4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv4 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ tv4(xv4 xv4Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = xv4Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                xv4Var.c(runnable);
                break;
            default:
                xv4Var.c(runnable);
                break;
        }
    }
}
