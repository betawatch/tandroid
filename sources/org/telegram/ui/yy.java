package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yy extends org.telegram.ui.Cells.n4 {
    public final /* synthetic */ iz D;
    public final TextView r;
    public final bi.rc s;
    public int w;
    public final org.telegram.ui.Components.z4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yy(iz izVar, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.D = izVar;
        int i7 = org.telegram.ui.ActionBar.l6.L6;
        g6Var = ((org.telegram.ui.ActionBar.f2) izVar).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.z6, izVar.getResourceProvider());
        textView.setText(org.telegram.messenger.id.M0(izVar.getUserConfig().q() ? 2131750620 : 2131750619, null));
        textView.setGravity(5);
        int i10 = (org.telegram.messenger.id.a0 ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, c8.ha.d(-1, -1.0f, i10, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        bi.rc rcVar = new bi.rc(this, getContext());
        this.s = rcVar;
        this.x = new org.telegram.ui.Components.z4(rcVar, 320L, org.telegram.ui.Components.xq.h, 0);
        rcVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        rcVar.setTypeface(org.telegram.messenger.g0.o());
        rcVar.setGravity(5);
        rcVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.id.a0 ? 3 : 5) | 48;
        float f11 = this.b;
        addView(rcVar, c8.ha.d(-1, -1.0f, i11, f11, 16.66f, f11, this.c));
    }

    public final void d(int i7, boolean z9) {
        iz izVar = this.D;
        String M0 = org.telegram.messenger.id.M0(izVar.getUserConfig().q() ? 2131750620 : 2131750619, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i10 = 0;
        boolean z10 = i7 < 0;
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.l6.r8;
            i10 = izVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.w = i10;
        bi.rc rcVar = this.s;
        if (!z10) {
            rcVar.setEmojiColor(i10);
        }
        if (!z9) {
            this.x.a(this.w, true);
        }
        if (z10 != this.y) {
            this.y = z10;
            ViewPropertyAnimator duration = textView.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            duration.setInterpolator(xqVar).start();
            rcVar.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(xqVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z9) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        bi.rc rcVar = this.s;
        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, rcVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z9 && !org.telegram.messenger.id.a0) {
            z10 = true;
        }
        rcVar.c(m10, z10, true);
    }
}
