package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ lb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(lb lbVar, wa waVar) {
        super(waVar, -2, -2);
        this.o = lbVar;
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
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
