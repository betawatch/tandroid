package vh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ i7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b;
                o8Var.X0.x(3, false);
                o8Var.q0 = null;
                break;
            default:
                d8 d8Var = this.b.X0;
                if (d8Var != null) {
                    d8Var.x(4, false);
                    break;
                }
                break;
        }
    }
}
