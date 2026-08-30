package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.pk;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class v1 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new v1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        w1 w1Var = (w1) view;
        String str = i51Var.n;
        String str2 = (String) i51Var.l;
        long j10 = i51Var.B;
        ImageView imageView = w1Var.a;
        w1Var.b.setText(str);
        pk pkVar = w1Var.c;
        pkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            pkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            pkVar.setScaleX(1.3f);
            pkVar.setScaleY(1.3f);
        } else {
            pkVar.setTranslationY(0.0f);
            pkVar.setScaleX(1.0f);
            pkVar.setScaleY(1.0f);
        }
        w1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        l5 l5Var = w1Var.d;
        if (l5Var != null) {
            l5Var.o(imageView);
            w1Var.d = null;
        }
        if (j10 != 0) {
            l5 n10 = l5.n(UserConfig.selectedAccount, j10, null, 1);
            w1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(w1Var.d);
        } else {
            nq nqVar = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new dg.k1(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            nqVar.h = dp;
            nqVar.n = dp2;
            imageView.setImageDrawable(nqVar);
        }
        w1Var.f = z4;
        w1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new w1(context);
    }
}
