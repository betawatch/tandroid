package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.pk;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class w1 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new w1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        x1 x1Var = (x1) view;
        String str = h51Var.n;
        String str2 = (String) h51Var.l;
        long j3 = h51Var.B;
        ImageView imageView = x1Var.a;
        x1Var.b.setText(str);
        pk pkVar = x1Var.c;
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
        x1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        q5 q5Var = x1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            x1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            qq qqVar = new qq(h6.b0(AndroidUtilities.dp(6.0f), h6.l1(0.1f, h6.w0(null, h6.G6, false))), new d4(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            qqVar.h = dp;
            qqVar.n = dp2;
            imageView.setImageDrawable(qqVar);
        }
        x1Var.f = z10;
        x1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new x1(context);
    }
}
