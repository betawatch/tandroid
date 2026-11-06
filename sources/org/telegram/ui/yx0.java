package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yx0 extends h11 {
    public final /* synthetic */ ay0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(ay0 ay0Var, xx0 xx0Var) {
        super(xx0Var);
        this.e = ay0Var;
    }

    @Override // org.telegram.ui.h11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
