// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ q(fu5 fu5Var, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.b = fu5Var;
        this.c = z;
        this.d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.d;
        boolean z = this.c;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                fu5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                fu5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
