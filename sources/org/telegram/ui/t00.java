package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t00 extends org.telegram.ui.Cells.l4 {
    public final TextView r;
    public final s00 s;
    public int v;
    public final org.telegram.ui.Components.h5 w;
    public boolean x;
    public final /* synthetic */ f10 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t00(f10 f10Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.y = f10Var;
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(f10Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6));
        org.telegram.messenger.wl.k(f10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.x5.d(-1, -1.0f, i11, f7, 16.66f, f7, this.c));
        textView.setAlpha(0.0f);
        s00 s00Var = new s00(this, getContext());
        this.s = s00Var;
        this.w = new org.telegram.ui.Components.h5(s00Var, 320L, org.telegram.ui.Components.pr.h, 0);
        s00Var.setTextSize(AndroidUtilities.dp(10.0f));
        s00Var.setTypeface(AndroidUtilities.bold());
        s00Var.setGravity(5);
        s00Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(s00Var, w7.x5.d(-1, -1.0f, i12 | 48, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        f10 f10Var = this.y;
        String string = LocaleController.getString(f10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.j6.r8;
            i11 = f10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        s00 s00Var = this.s;
        if (!z11) {
            s00Var.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            duration.setInterpolator(prVar).start();
            s00Var.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(prVar).start();
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
        s00 s00Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, s00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        s00Var.c(replaceEmoji, z11, true);
    }
}
