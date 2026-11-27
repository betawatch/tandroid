// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
