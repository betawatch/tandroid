package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u21 extends i61 {
    public final /* synthetic */ w21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(w21 w21Var, t21 t21Var) {
        super(t21Var);
        this.e = w21Var;
    }

    @Override // org.telegram.ui.i61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
