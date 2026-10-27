package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import fi.u3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.ok;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w1 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new w1());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        x1 x1Var = (x1) view;
        String str = u61Var.n;
        String str2 = (String) u61Var.l;
        long j10 = u61Var.B;
        ImageView imageView = x1Var.a;
        x1Var.b.setText(str);
        ok okVar = x1Var.c;
        okVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            okVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            okVar.setScaleX(1.3f);
            okVar.setScaleY(1.3f);
        } else {
            okVar.setTranslationY(0.0f);
            okVar.setScaleX(1.0f);
            okVar.setScaleY(1.0f);
        }
        x1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        t5 t5Var = x1Var.d;
        if (t5Var != null) {
            t5Var.o(imageView);
            x1Var.d = null;
        }
        x1Var.h = null;
        if (j10 != 0) {
            t5 n10 = t5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(6.0f), y6.o1(0.1f, y6.x0(null, y6.G6, false)));
            x1Var.h = c02;
            ar arVar = new ar(c02, new u3(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            arVar.h = dp;
            arVar.n = dp2;
            imageView.setImageDrawable(arVar);
        }
        x1Var.f = z10;
        x1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new x1(context);
    }
}
