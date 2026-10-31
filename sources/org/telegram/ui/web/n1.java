package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.d20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class n1 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new n1());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        o1 o1Var = (o1) view;
        String str = a51Var.n;
        String str2 = (String) a51Var.l;
        long j10 = a51Var.B;
        ImageView imageView = o1Var.a;
        o1Var.b.setText(str);
        q2 q2Var = o1Var.c;
        q2Var.setText(str2);
        if (TextUtils.isEmpty(str)) {
            q2Var.setTranslationY(-org.telegram.messenger.i0.L(14.0f));
            q2Var.setScaleX(1.3f);
            q2Var.setScaleY(1.3f);
        } else {
            q2Var.setTranslationY(0.0f);
            q2Var.setScaleX(1.0f);
            q2Var.setScaleY(1.0f);
        }
        o1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        f5 f5Var = o1Var.d;
        if (f5Var != null) {
            f5Var.n(imageView);
            o1Var.d = null;
        }
        o1Var.h = null;
        if (j10 != 0) {
            f5 m10 = f5.m(d20.s0, j10, null, 1);
            o1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(o1Var.d);
        } else {
            ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, t6.x0(null, t6.G6, false)));
            o1Var.h = d02;
            eq eqVar = new eq(d02, new jg.x0(charSequence));
            int L = org.telegram.messenger.i0.L(28.0f);
            int L2 = org.telegram.messenger.i0.L(28.0f);
            eqVar.h = L;
            eqVar.n = L2;
            imageView.setImageDrawable(eqVar);
        }
        o1Var.f = z10;
        o1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new o1(context);
    }
}
