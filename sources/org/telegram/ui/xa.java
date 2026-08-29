package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ ob o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(ob obVar, wa waVar) {
        super(waVar, -2, -2);
        this.o = obVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ob obVar = this.o;
        if (obVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.mc.e();
        obVar.F0 = null;
    }
}
