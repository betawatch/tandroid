// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w60 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf8 b;

    public /* synthetic */ w60(rf8 rf8Var, byte b) {
        this.a = b;
        this.b = rf8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rf8 rf8Var = this.b;
        switch (b) {
            case 0:
                rf8Var.b(true);
                break;
            case 1:
                rf8Var.b(true);
                break;
            case 2:
                rf8Var.b(true);
                break;
            default:
                rf8Var.b(true);
                break;
        }
    }
}
