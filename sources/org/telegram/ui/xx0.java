package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xx0 extends e11 {
    public final /* synthetic */ zx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0(zx0 zx0Var, wx0 wx0Var) {
        super(wx0Var);
        this.e = zx0Var;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
