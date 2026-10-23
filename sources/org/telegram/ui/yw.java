package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class yw extends o51 {
    public final /* synthetic */ cy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(cy cyVar, xw xwVar) {
        super(xwVar);
        this.e = cyVar;
    }

    @Override // org.telegram.ui.o51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
