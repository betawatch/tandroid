package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v00 extends org.telegram.ui.Cells.m4 {
    public final TextView r;
    public final u00 s;
    public int v;
    public final org.telegram.ui.Components.g5 w;
    public boolean x;
    public final /* synthetic */ h10 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v00(h10 h10Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.y = h10Var;
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(h10Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6));
        org.telegram.messenger.em.k(h10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.a6.d(-1, -1.0f, i11, f7, 16.66f, f7, this.c));
        textView.setAlpha(0.0f);
        u00 u00Var = new u00(this, getContext());
        this.s = u00Var;
        this.w = new org.telegram.ui.Components.g5(u00Var, 320L, org.telegram.ui.Components.wr.h, 0);
        u00Var.setTextSize(AndroidUtilities.dp(10.0f));
        u00Var.setTypeface(AndroidUtilities.bold());
        u00Var.setGravity(5);
        u00Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(u00Var, w7.a6.d(-1, -1.0f, i12 | 48, f10, 16.66f, f10, this.c));
    }

    public final void d(int i10, boolean z10) {
        h10 h10Var = this.y;
        String string = LocaleController.getString(h10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.j6.r8;
            i11 = h10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        u00 u00Var = this.s;
        if (!z11) {
            u00Var.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
            duration.setInterpolator(wrVar).start();
            u00Var.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(wrVar).start();
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
        u00 u00Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, u00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        u00Var.c(replaceEmoji, z11, true);
    }
}
