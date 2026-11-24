// default package

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
