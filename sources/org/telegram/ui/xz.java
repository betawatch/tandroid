package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xz extends org.telegram.ui.Cells.p4 {
    public final /* synthetic */ h00 D;
    public final TextView r;
    public final wz s;
    public int w;
    public final org.telegram.ui.Components.w4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xz(h00 h00Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.p6 p6Var;
        this.D = h00Var;
        int i10 = org.telegram.ui.ActionBar.t6.L6;
        p6Var = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.z6, h00Var.getResourceProvider());
        textView.setText(org.telegram.messenger.dd.L0(h00Var.getUserConfig().q() ? 2131750621 : 2131750620, null));
        textView.setGravity(5);
        int i11 = (org.telegram.messenger.dd.X ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.b6.d(-1, -1.0f, i11, f7, 16.66f, f7, this.c));
        textView.setAlpha(0.0f);
        wz wzVar = new wz(this, getContext());
        this.s = wzVar;
        this.x = new org.telegram.ui.Components.w4(wzVar, 320L, org.telegram.ui.Components.gr.h, 0);
        wzVar.setTextSize(org.telegram.messenger.i0.L(10.0f));
        wzVar.setTypeface(org.telegram.messenger.i0.o());
        wzVar.setGravity(5);
        wzVar.setPadding(org.telegram.messenger.i0.L(4.66f), 0, org.telegram.messenger.i0.L(4.66f), 0);
        int i12 = (org.telegram.messenger.dd.X ? 3 : 5) | 48;
        float f10 = this.b;
        addView(wzVar, w7.b6.d(-1, -1.0f, i12, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        h00 h00Var = this.D;
        String L0 = org.telegram.messenger.dd.L0(h00Var.getUserConfig().q() ? 2131750621 : 2131750620, null);
        TextView textView = this.r;
        textView.setText(L0);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.t6.r8;
            i11 = h00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.w = i11;
        wz wzVar = this.s;
        if (!z11) {
            wzVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.x.a(this.w, true);
        }
        if (z11 != this.y) {
            this.y = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            duration.setInterpolator(grVar).start();
            wzVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar).start();
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
        wz wzVar = this.s;
        CharSequence m10 = org.telegram.messenger.k6.m(charSequence, wzVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.dd.X) {
            z11 = true;
        }
        wzVar.c(m10, z11, true);
    }
}
