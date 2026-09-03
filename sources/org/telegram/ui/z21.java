package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z21 extends n61 {
    public final /* synthetic */ b31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z21(b31 b31Var, y21 y21Var) {
        super(y21Var);
        this.e = b31Var;
    }

    @Override // org.telegram.ui.n61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
