// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pq9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er9 b;

    public /* synthetic */ pq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.K0 = null;
                break;
            default:
                er9Var.dismiss();
                break;
        }
    }
}
