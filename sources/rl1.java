// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rl1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ rl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.pc(false);
                break;
            default:
                zu1Var.pc(false);
                break;
        }
    }
}
