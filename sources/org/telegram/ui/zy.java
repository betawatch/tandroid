package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zy extends org.telegram.ui.Cells.n4 {
    public final /* synthetic */ jz D;
    public final TextView r;
    public final bi.rc s;
    public int w;
    public final org.telegram.ui.Components.y4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zy(jz jzVar, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.h6 h6Var;
        this.D = jzVar;
        int i7 = org.telegram.ui.ActionBar.m6.L6;
        h6Var = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.z6, jzVar.getResourceProvider());
        textView.setText(org.telegram.messenger.id.M0(jzVar.getUserConfig().q() ? 2131750620 : 2131750619, null));
        textView.setGravity(5);
        int i10 = (org.telegram.messenger.id.a0 ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, c8.ha.d(-1, -1.0f, i10, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        bi.rc rcVar = new bi.rc(this, getContext());
        this.s = rcVar;
        this.x = new org.telegram.ui.Components.y4(rcVar, 320L, org.telegram.ui.Components.wq.h, 0);
        rcVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        rcVar.setTypeface(org.telegram.messenger.g0.o());
        rcVar.setGravity(5);
        rcVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.id.a0 ? 3 : 5) | 48;
        float f11 = this.b;
        addView(rcVar, c8.ha.d(-1, -1.0f, i11, f11, 16.66f, f11, this.c));
    }

    public final void d(int i7, boolean z9) {
        jz jzVar = this.D;
        String M0 = org.telegram.messenger.id.M0(jzVar.getUserConfig().q() ? 2131750620 : 2131750619, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i10 = 0;
        boolean z10 = i7 < 0;
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.m6.r8;
            i10 = jzVar.getThemedColor(iArr[i7 % iArr.length]);
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
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
            duration.setInterpolator(wqVar).start();
            rcVar.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(wqVar).start();
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
