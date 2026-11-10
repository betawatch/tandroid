package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.Components.bc.e();
        mbVar.F0 = null;
    }
}
