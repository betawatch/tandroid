package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rp0 extends c71 {
    public final /* synthetic */ up0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(up0 up0Var, qp0 qp0Var) {
        super(qp0Var);
        this.e = up0Var;
    }

    @Override // org.telegram.ui.c71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
