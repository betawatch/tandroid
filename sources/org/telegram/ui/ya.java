package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ya extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ mb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(mb mbVar, xa xaVar) {
        super(xaVar, -2, -2);
        this.o = mbVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        mb mbVar = this.o;
        if (mbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.cc.e();
        mbVar.F0 = null;
    }
}
