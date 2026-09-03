package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.pk;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class v1 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new v1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        w1 w1Var = (w1) view;
        String str = h51Var.n;
        String str2 = (String) h51Var.l;
        long j10 = h51Var.B;
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
            pq pqVar = new pq(k6.b0(AndroidUtilities.dp(6.0f), k6.l1(0.1f, k6.w0(null, k6.G6, false))), new eg.i1(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            pqVar.h = dp;
            pqVar.n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        w1Var.f = z4;
        w1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new w1(context);
    }
}
