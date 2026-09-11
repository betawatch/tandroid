package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import di.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v51;
import org.telegram.ui.sk;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class y1 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new y1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        z1 z1Var = (z1) view;
        String str = h51Var.n;
        String str2 = (String) h51Var.l;
        long j3 = h51Var.B;
        ImageView imageView = z1Var.a;
        z1Var.b.setText(str);
        sk skVar = z1Var.c;
        skVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            skVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            skVar.setScaleX(1.3f);
            skVar.setScaleY(1.3f);
        } else {
            skVar.setTranslationY(0.0f);
            skVar.setScaleX(1.0f);
            skVar.setScaleY(1.0f);
        }
        z1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        q5 q5Var = z1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            z1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            z1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(z1Var.d);
        } else {
            oq oqVar = new oq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new e4(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            oqVar.h = dp;
            oqVar.n = dp2;
            imageView.setImageDrawable(oqVar);
        }
        z1Var.f = z10;
        z1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new z1(context);
    }
}
