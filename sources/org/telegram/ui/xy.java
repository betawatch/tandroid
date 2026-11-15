package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xy extends org.telegram.ui.Cells.n4 {
    public final /* synthetic */ hz E;
    public final TextView r;
    public final di.ab s;
    public int w;
    public final org.telegram.ui.Components.x4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xy(hz hzVar, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.E = hzVar;
        int i7 = org.telegram.ui.ActionBar.j6.L6;
        e6Var = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.z6, hzVar.getResourceProvider());
        textView.setText(org.telegram.messenger.hd.M0(hzVar.getUserConfig().q() ? 2131750620 : 2131750619, null));
        textView.setGravity(5);
        int i10 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, c8.ja.d(-1, -1.0f, i10, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        di.ab abVar = new di.ab(this, getContext());
        this.s = abVar;
        this.x = new org.telegram.ui.Components.x4(abVar, 320L, org.telegram.ui.Components.er.h, 0);
        abVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        abVar.setTypeface(org.telegram.messenger.g0.o());
        abVar.setGravity(5);
        abVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 48;
        float f11 = this.b;
        addView(abVar, c8.ja.d(-1, -1.0f, i11, f11, 16.66f, f11, this.c));
    }

    public final void d(int i7, boolean z10) {
        hz hzVar = this.E;
        String M0 = org.telegram.messenger.hd.M0(hzVar.getUserConfig().q() ? 2131750620 : 2131750619, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i10 = 0;
        boolean z11 = i7 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.j6.r8;
            i10 = hzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.w = i10;
        di.ab abVar = this.s;
        if (!z11) {
            abVar.setEmojiColor(i10);
        }
        if (!z10) {
            this.x.a(this.w, true);
        }
        if (z11 != this.y) {
            this.y = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            duration.setInterpolator(erVar).start();
            abVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar).start();
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
        di.ab abVar = this.s;
        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, abVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.hd.a0) {
            z11 = true;
        }
        abVar.c(m10, z11, true);
    }
}
