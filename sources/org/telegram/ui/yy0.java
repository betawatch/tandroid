package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yy0 extends o51 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(ProfileActivity profileActivity, xy0 xy0Var) {
        super(xy0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.o51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.D5 = null;
    }
}
