// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zb5 extends i46 {
    public final /* synthetic */ ac5 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb5(ac5 ac5Var, ac5 ac5Var2, Activity activity, int i, int i2, ylb ylbVar) {
        super(i, i2, ylbVar, activity, ac5Var2);
        this.S2 = ac5Var;
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        this.S2.C0 = false;
    }

    @Override // my0
    public final void w() {
        this.S2.C0 = false;
    }
}
