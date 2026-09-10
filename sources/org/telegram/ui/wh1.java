package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wh1 extends org.telegram.ui.Components.u51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new wh1());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        xh1 xh1Var = (xh1) view;
        int i10 = v51Var.k;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        boolean z11 = v51Var.q;
        boolean z12 = v51Var.r;
        int i11 = v51Var.z;
        TextView textView = xh1Var.d;
        TextView textView2 = xh1Var.e;
        ImageView imageView = xh1Var.f;
        xh1Var.h = z11;
        xh1Var.n = z12;
        ImageView imageView2 = xh1Var.b;
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
        xh1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = xh1Var.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(xh1Var.n ? org.telegram.ui.ActionBar.j6.q7 : xh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(xh1Var.n ? org.telegram.ui.ActionBar.j6.q7 : xh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(xh1Var.n ? org.telegram.ui.ActionBar.j6.p7 : xh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(xh1Var.n ? org.telegram.ui.ActionBar.j6.p7 : xh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, f6Var));
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new xh1(context, f6Var);
    }
}
