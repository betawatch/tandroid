package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class za extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ qb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(qb qbVar, ya yaVar) {
        super(yaVar, -2, -2);
        this.o = qbVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        qb qbVar = this.o;
        if (qbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.ec.e();
        qbVar.F0 = null;
    }
}
