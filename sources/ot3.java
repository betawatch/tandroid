// default package

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ot3 extends Dialog {
    public final /* synthetic */ hu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot3(hu0 hu0Var, Context context) {
        super(context);
        this.a = hu0Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        pt3 pt3Var = (pt3) this.a.b;
        pt3Var.a.k(false);
        pt3Var.a.e();
    }
}
