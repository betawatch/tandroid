package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zl0 extends e11 {
    public final /* synthetic */ cm0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(cm0 cm0Var, yl0 yl0Var) {
        super(yl0Var);
        this.e = cm0Var;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
