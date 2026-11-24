// default package

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zu3 extends Dialog {
    public final /* synthetic */ qv0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu3(qv0 qv0Var, Context context) {
        super(context);
        this.a = qv0Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        av3 av3Var = (av3) this.a.b;
        av3Var.a.k(false);
        av3Var.a.e();
    }
}
