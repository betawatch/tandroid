package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yz extends org.telegram.ui.Cells.p4 {
    public final /* synthetic */ i00 D;
    public final TextView r;
    public final xz s;
    public int w;
    public final org.telegram.ui.Components.w4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yz(i00 i00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.p6 p6Var;
        this.D = i00Var;
        int i10 = org.telegram.ui.ActionBar.t6.L6;
        p6Var = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.z6, i00Var.getResourceProvider());
        textView.setText(org.telegram.messenger.cd.L0(i00Var.getUserConfig().q() ? 2131750621 : 2131750620, null));
        textView.setGravity(5);
        int i11 = (org.telegram.messenger.cd.X ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.b6.d(-1, -1.0f, i11, f7, 16.66f, f7, this.c));
        textView.setAlpha(0.0f);
        xz xzVar = new xz(this, getContext());
        this.s = xzVar;
        this.x = new org.telegram.ui.Components.w4(xzVar, 320L, org.telegram.ui.Components.gr.h, 0);
        xzVar.setTextSize(org.telegram.messenger.i0.L(10.0f));
        xzVar.setTypeface(org.telegram.messenger.i0.o());
        xzVar.setGravity(5);
        xzVar.setPadding(org.telegram.messenger.i0.L(4.66f), 0, org.telegram.messenger.i0.L(4.66f), 0);
        int i12 = (org.telegram.messenger.cd.X ? 3 : 5) | 48;
        float f10 = this.b;
        addView(xzVar, w7.b6.d(-1, -1.0f, i12, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        i00 i00Var = this.D;
        String L0 = org.telegram.messenger.cd.L0(i00Var.getUserConfig().q() ? 2131750621 : 2131750620, null);
        TextView textView = this.r;
        textView.setText(L0);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.t6.r8;
            i11 = i00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.w = i11;
        xz xzVar = this.s;
        if (!z11) {
            xzVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.x.a(this.w, true);
        }
        if (z11 != this.y) {
            this.y = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            duration.setInterpolator(grVar).start();
            xzVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        xz xzVar = this.s;
        CharSequence m10 = org.telegram.messenger.k6.m(charSequence, xzVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.cd.X) {
            z11 = true;
        }
        xzVar.c(m10, z11, true);
    }
}
