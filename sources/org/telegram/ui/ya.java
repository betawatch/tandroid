package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ya extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ pb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(pb pbVar, xa xaVar) {
        super(xaVar, -2, -2);
        this.o = pbVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        pb pbVar = this.o;
        if (pbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.gc.e();
        pbVar.F0 = null;
    }
}
