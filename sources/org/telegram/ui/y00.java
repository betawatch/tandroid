package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y00 extends org.telegram.ui.Cells.m4 {
    public final TextView r;
    public final x00 s;
    public int v;
    public final org.telegram.ui.Components.j5 w;
    public boolean x;
    public final /* synthetic */ k10 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y00(k10 k10Var, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.y = k10Var;
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.m2) k10Var).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(k10Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6));
        org.telegram.messenger.sk.m(k10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i11 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f7 = this.b;
        addView(textView, w7.z5.a(-1.0f, f7, 16.66f, f7, this.c, -1, i11));
        textView.setAlpha(0.0f);
        x00 x00Var = new x00(this, getContext());
        this.s = x00Var;
        this.w = new org.telegram.ui.Components.j5(x00Var, 320L, org.telegram.ui.Components.es.h, 0);
        x00Var.setTextSize(AndroidUtilities.dp(10.0f));
        x00Var.setTypeface(AndroidUtilities.bold());
        x00Var.setGravity(5);
        x00Var.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i12 = LocaleController.isRTL ? 3 : 5;
        float f10 = this.b;
        addView(x00Var, w7.z5.a(-1.0f, f10, 16.66f, f10, this.c, -1, i12 | 48));
    }

    public final void d(int i10, boolean z10) {
        k10 k10Var = this.y;
        String string = LocaleController.getString(k10Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.r;
        textView.setText(string);
        int i11 = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.r8;
            i11 = k10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i11;
        x00 x00Var = this.s;
        if (!z11) {
            x00Var.setEmojiColor(i11);
        }
        if (!z10) {
            this.w.a(this.v, true);
        }
        if (z11 != this.x) {
            this.x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
            duration.setInterpolator(esVar).start();
            x00Var.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(esVar).start();
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
        x00 x00Var = this.s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, x00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        x00Var.c(replaceEmoji, z11, true);
    }
}
