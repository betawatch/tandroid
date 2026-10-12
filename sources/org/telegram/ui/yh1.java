package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yh1 extends org.telegram.ui.Components.k61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new yh1());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        zh1 zh1Var = (zh1) view;
        int i10 = l61Var.k;
        CharSequence charSequence = l61Var.l;
        CharSequence charSequence2 = l61Var.m;
        boolean z11 = l61Var.q;
        boolean z12 = l61Var.r;
        int i11 = l61Var.z;
        TextView textView = zh1Var.d;
        TextView textView2 = zh1Var.e;
        ImageView imageView = zh1Var.f;
        zh1Var.h = z11;
        zh1Var.n = z12;
        ImageView imageView2 = zh1Var.b;
        imageView2.setImageResource(i10);
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        textView2.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int dp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        zh1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.c6 c6Var = zh1Var.a;
        int w02 = org.telegram.ui.ActionBar.g6.w0(zh1Var.n ? org.telegram.ui.ActionBar.g6.q7 : zh1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(zh1Var.n ? org.telegram.ui.ActionBar.g6.q7 : zh1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(zh1Var.n ? org.telegram.ui.ActionBar.g6.p7 : zh1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(zh1Var.n ? org.telegram.ui.ActionBar.g6.p7 : zh1Var.h ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, c6Var));
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new zh1(context, c6Var);
    }
}
