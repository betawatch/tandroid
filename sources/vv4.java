// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv4 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ vv4(zv4 zv4Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = zv4Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                zv4Var.c(runnable);
                break;
            default:
                zv4Var.c(runnable);
                break;
        }
    }
}
