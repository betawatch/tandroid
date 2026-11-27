// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zd8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ae8 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ zd8(ae8 ae8Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = ae8Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        ae8 ae8Var = this.b;
        switch (b) {
            case 0:
                ula ulaVar = ae8Var.d;
                if (ulaVar.I) {
                    ae8Var.I = runnable;
                    ulaVar.a(true);
                    break;
                }
                break;
            default:
                ula ulaVar2 = ae8Var.d;
                if (ulaVar2.I) {
                    ae8Var.I = runnable;
                    ulaVar2.a(true);
                    break;
                }
                break;
        }
    }
}
