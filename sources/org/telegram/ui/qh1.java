package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qh1 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new qh1());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        rh1 rh1Var = (rh1) view;
        int i10 = j51Var.k;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        boolean z11 = j51Var.q;
        boolean z12 = j51Var.r;
        int i11 = j51Var.z;
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

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new rh1(context, f6Var);
    }
}
