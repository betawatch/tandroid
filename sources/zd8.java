// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
