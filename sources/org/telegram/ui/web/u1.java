package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.jk;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u1 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new u1());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        v1 v1Var = (v1) view;
        String str = w41Var.n;
        String str2 = (String) w41Var.l;
        long j10 = w41Var.B;
        ImageView imageView = v1Var.a;
        v1Var.b.setText(str);
        jk jkVar = v1Var.c;
        jkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            jkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            jkVar.setScaleX(1.3f);
            jkVar.setScaleY(1.3f);
        } else {
            jkVar.setTranslationY(0.0f);
            jkVar.setScaleX(1.0f);
            jkVar.setScaleY(1.0f);
        }
        v1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        p5 p5Var = v1Var.d;
        if (p5Var != null) {
            p5Var.o(imageView);
            v1Var.d = null;
        }
        if (j10 != 0) {
            p5 n10 = p5.n(UserConfig.selectedAccount, j10, null, 1);
            v1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(v1Var.d);
        } else {
            jq jqVar = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, g6.w0(null, g6.G6, false))), new bg.m1(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            jqVar.h = dp;
            jqVar.n = dp2;
            imageView.setImageDrawable(jqVar);
        }
        v1Var.f = z10;
        v1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new v1(context);
    }
}
