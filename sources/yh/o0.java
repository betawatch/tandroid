package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o0 extends o61 {
    static {
        o61.setup(new o0());
    }

    public static p61 a(int i10, n0 n0Var) {
        p61 J = p61.J(o0.class);
        J.u = 1;
        J.z = i10;
        J.G = n0Var;
        return J;
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        String str;
        p0 p0Var = (p0) view;
        n0 n0Var = (n0) p61Var.G;
        int i10 = p61Var.z;
        Integer[] numArr = new Integer[1];
        p0Var.s = i10 == 0;
        y9 y9Var = p0Var.d;
        TextView textView = p0Var.e;
        xh.g1 g1Var = p0Var.c;
        p0Var.v = n0Var;
        if (i10 == 0) {
            g1Var.d(null);
            g1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var.c;
            textView.setText(stargiftattributemodel.name);
            p0.a(p0Var, stargiftattributemodel.document, 80, p61Var.G, true);
            y9Var.setColorFilter(null);
            g1Var.w = org.telegram.ui.ActionBar.i6.Oh;
            str = s3.K1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var.b;
            g1Var.d(stargiftattributebackdrop);
            g1Var.e(stargiftattributepattern);
            g1Var.w = org.telegram.ui.ActionBar.i6.d6;
            textView.setText(stargiftattributebackdrop.name);
            p0.a(p0Var, stargiftattributepattern.document, 48, p61Var.G, false);
            y9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = s3.K1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = n0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = n0Var.b;
            g1Var.d(stargiftattributebackdrop2);
            g1Var.e(stargiftattributepattern2);
            g1Var.w = org.telegram.ui.ActionBar.i6.d6;
            textView.setText(stargiftattributepattern2.name);
            p0.a(p0Var, stargiftattributepattern2.document, 64, p61Var.G, false);
            y9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = s3.K1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, p0Var.a) : -1);
        p0Var.f.setText(str);
        p0Var.h = numArr[0];
        p0Var.b();
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p0(context, e6Var);
    }
}
