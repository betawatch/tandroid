package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qh1 extends org.telegram.ui.Components.v51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new qh1());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        rh1 rh1Var = (rh1) view;
        int i10 = w51Var.k;
        CharSequence charSequence = w51Var.l;
        CharSequence charSequence2 = w51Var.m;
        boolean z11 = w51Var.q;
        boolean z12 = w51Var.r;
        int i11 = w51Var.z;
        TextView textView = rh1Var.d;
        TextView textView2 = rh1Var.e;
        ImageView imageView = rh1Var.f;
        rh1Var.h = z11;
        rh1Var.n = z12;
        ImageView imageView2 = rh1Var.b;
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
        rh1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = rh1Var.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(rh1Var.n ? org.telegram.ui.ActionBar.j6.q7 : rh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(rh1Var.n ? org.telegram.ui.ActionBar.j6.q7 : rh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(rh1Var.n ? org.telegram.ui.ActionBar.j6.p7 : rh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(rh1Var.n ? org.telegram.ui.ActionBar.j6.p7 : rh1Var.h ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, f6Var));
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new rh1(context, f6Var);
    }
}
