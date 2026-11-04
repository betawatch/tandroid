package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ty extends org.telegram.ui.Cells.n4 {
    public final /* synthetic */ ez E;
    public final TextView r;
    public final ci.kb s;
    public int w;
    public final org.telegram.ui.Components.x4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ty(ez ezVar, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.E = ezVar;
        int i3 = org.telegram.ui.ActionBar.k6.L6;
        e6Var = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.z6, ezVar.getResourceProvider());
        textView.setText(org.telegram.messenger.bd.M0(ezVar.getUserConfig().q() ? 2131750621 : 2131750620, null));
        textView.setGravity(5);
        int i10 = (org.telegram.messenger.bd.a0 ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, b8.mf.d(-1, -1.0f, i10, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        ci.kb kbVar = new ci.kb(this, getContext());
        this.s = kbVar;
        this.x = new org.telegram.ui.Components.x4(kbVar, 320L, org.telegram.ui.Components.xq.h, 0);
        kbVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        kbVar.setTypeface(org.telegram.messenger.g0.o());
        kbVar.setGravity(5);
        kbVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.bd.a0 ? 3 : 5) | 48;
        float f11 = this.b;
        addView(kbVar, b8.mf.d(-1, -1.0f, i11, f11, 16.66f, f11, this.c));
    }

    public final void d(int i3, boolean z10) {
        ez ezVar = this.E;
        String M0 = org.telegram.messenger.bd.M0(ezVar.getUserConfig().q() ? 2131750621 : 2131750620, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i10 = 0;
        boolean z11 = i3 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.k6.r8;
            i10 = ezVar.getThemedColor(iArr[i3 % iArr.length]);
        }
        this.w = i10;
        ci.kb kbVar = this.s;
        if (!z11) {
            kbVar.setEmojiColor(i10);
        }
        if (!z10) {
            this.x.a(this.w, true);
        }
        if (z11 != this.y) {
            this.y = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            duration.setInterpolator(xqVar).start();
            kbVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(xqVar).start();
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
        ci.kb kbVar = this.s;
        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, kbVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.bd.a0) {
            z11 = true;
        }
        kbVar.c(m10, z11, true);
    }
}
