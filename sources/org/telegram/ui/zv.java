package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zv extends i11 {
    public final /* synthetic */ cx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(cx cxVar, yv yvVar) {
        super(yvVar);
        this.e = cxVar;
    }

    @Override // org.telegram.ui.i11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
