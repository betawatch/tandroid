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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.pk;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class x1 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new x1());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        y1 y1Var = (y1) view;
        String str = v51Var.n;
        String str2 = (String) v51Var.l;
        long j3 = v51Var.B;
        ImageView imageView = y1Var.a;
        y1Var.b.setText(str);
        pk pkVar = y1Var.c;
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
        y1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        q5 q5Var = y1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            y1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            qq qqVar = new qq(h6.b0(AndroidUtilities.dp(6.0f), h6.l1(0.1f, h6.w0(null, h6.G6, false))), new d4(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            qqVar.h = dp;
            qqVar.n = dp2;
            imageView.setImageDrawable(qqVar);
        }
        y1Var.f = z10;
        y1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new y1(context);
    }
}
