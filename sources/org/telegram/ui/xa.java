package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        org.telegram.ui.Components.gc.e();
        lbVar.G0 = null;
    }
}
