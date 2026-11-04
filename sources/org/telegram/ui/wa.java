package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wa extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ kb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(kb kbVar, va vaVar) {
        super(vaVar, -2, -2);
        this.o = kbVar;
    }

    @Override // org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        kb kbVar = this.o;
        if (kbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ac.e();
        kbVar.G0 = null;
    }
}
