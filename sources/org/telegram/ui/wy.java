package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wy extends org.telegram.ui.Cells.n4 {
    public final /* synthetic */ gz D;
    public final TextView r;
    public final bi.rc s;
    public int w;
    public final org.telegram.ui.Components.z4 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wy(gz gzVar, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.D = gzVar;
        int i7 = org.telegram.ui.ActionBar.k6.L6;
        f6Var = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.z6, gzVar.getResourceProvider());
        textView.setText(org.telegram.messenger.hd.M0(gzVar.getUserConfig().q() ? 2131750621 : 2131750620, null));
        textView.setGravity(5);
        int i10 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 48;
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
        int i11 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 48;
        float f11 = this.b;
        addView(rcVar, c8.ha.d(-1, -1.0f, i11, f11, 16.66f, f11, this.c));
    }

    public final void d(int i7, boolean z9) {
        gz gzVar = this.D;
        String M0 = org.telegram.messenger.hd.M0(gzVar.getUserConfig().q() ? 2131750621 : 2131750620, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i10 = 0;
        boolean z10 = i7 < 0;
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.k6.r8;
            i10 = gzVar.getThemedColor(iArr[i7 % iArr.length]);
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
        if (z9 && !org.telegram.messenger.hd.a0) {
            z10 = true;
        }
        rcVar.c(m10, z10, true);
    }
}
