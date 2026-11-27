// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xv4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv4 b;

    public /* synthetic */ xv4(zv4 zv4Var, byte b) {
        this.a = b;
        this.b = zv4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                zv4Var.c(null);
                break;
            default:
                zv4Var.d();
                break;
        }
    }
}
