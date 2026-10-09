package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.tk;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x1 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new x1());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        y1 y1Var = (y1) view;
        String str = p61Var.n;
        String str2 = (String) p61Var.l;
        long j3 = p61Var.B;
        ImageView imageView = y1Var.a;
        y1Var.b.setText(str);
        tk tkVar = y1Var.c;
        tkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            tkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            tkVar.setScaleX(1.3f);
            tkVar.setScaleY(1.3f);
        } else {
            tkVar.setTranslationY(0.0f);
            tkVar.setScaleX(1.0f);
            tkVar.setScaleY(1.0f);
        }
        y1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        s5 s5Var = y1Var.d;
        if (s5Var != null) {
            s5Var.o(imageView);
            y1Var.d = null;
        }
        if (j3 != 0) {
            s5 n10 = s5.n(UserConfig.selectedAccount, j3, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            fr frVar = new fr(i6.c0(AndroidUtilities.dp(6.0f), i6.m1(0.1f, i6.x0(null, i6.G6, false))), new c4(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            frVar.h = dp;
            frVar.n = dp2;
            imageView.setImageDrawable(frVar);
        }
        y1Var.f = z10;
        y1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new y1(context);
    }
}
