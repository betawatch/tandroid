package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ lb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(lb lbVar, wa waVar) {
        super(waVar, -2, -2);
        this.o = lbVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        lb lbVar = this.o;
        if (lbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.xb.e();
        lbVar.G0 = null;
    }
}
