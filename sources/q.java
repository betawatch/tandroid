// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ q(bu5 bu5Var, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.b = bu5Var;
        this.c = z;
        this.d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.d;
        boolean z = this.c;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                bu5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
