package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zg1 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new zg1());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        ah1 ah1Var = (ah1) view;
        int i10 = j51Var.k;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        boolean z10 = j51Var.q;
        boolean z11 = j51Var.r;
        int i11 = j51Var.z;
        TextView textView = ah1Var.d;
        TextView textView2 = ah1Var.e;
        ImageView imageView = ah1Var.f;
        ah1Var.h = z10;
        ah1Var.n = z11;
        ImageView imageView2 = ah1Var.b;
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
        ah1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.g6 g6Var = ah1Var.a;
        int v02 = org.telegram.ui.ActionBar.k6.v0(ah1Var.n ? org.telegram.ui.ActionBar.k6.q7 : ah1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.G6, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(ah1Var.n ? org.telegram.ui.ActionBar.k6.q7 : ah1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.G6, g6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(ah1Var.n ? org.telegram.ui.ActionBar.k6.p7 : ah1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.G6, g6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(ah1Var.n ? org.telegram.ui.ActionBar.k6.p7 : ah1Var.h ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, g6Var));
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ah1(context, g6Var);
    }
}
