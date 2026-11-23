package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import hi.t3;
import org.telegram.messenger.i10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l1 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new l1());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        m1 m1Var = (m1) view;
        String str = n41Var.o;
        String str2 = (String) n41Var.m;
        long j3 = n41Var.C;
        ImageView imageView = m1Var.a;
        m1Var.b.setText(str);
        n2 n2Var = m1Var.c;
        n2Var.setText(str2);
        if (TextUtils.isEmpty(str)) {
            n2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            n2Var.setScaleX(1.3f);
            n2Var.setScaleY(1.3f);
        } else {
            n2Var.setTranslationY(0.0f);
            n2Var.setScaleX(1.0f);
            n2Var.setScaleY(1.0f);
        }
        m1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        o5 o5Var = m1Var.d;
        if (o5Var != null) {
            o5Var.n(imageView);
            m1Var.d = null;
        }
        m1Var.h = null;
        if (j3 != 0) {
            o5 m10 = o5.m(i10.t0, j3, null, 1);
            m1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(m1Var.d);
        } else {
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, n6.x0(null, n6.G6, false)));
            m1Var.h = d02;
            lq lqVar = new lq(d02, new t3(charSequence));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            lqVar.h = L;
            lqVar.n = L2;
            imageView.setImageDrawable(lqVar);
        }
        m1Var.f = z10;
        m1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new m1(context);
    }
}
