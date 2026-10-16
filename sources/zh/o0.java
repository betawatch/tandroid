package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class o0 extends l61 {
    static {
        l61.setup(new o0());
    }

    public static m61 a(int i10, n0 n0Var) {
        m61 J = m61.J(o0.class);
        J.u = 1;
        J.z = i10;
        J.G = n0Var;
        return J;
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        String str;
        p0 p0Var = (p0) view;
        n0 n0Var = (n0) m61Var.G;
        int i10 = m61Var.z;
        Integer[] numArr = new Integer[1];
        p0Var.s = i10 == 0;
        z9 z9Var = p0Var.d;
        TextView textView = p0Var.e;
        yh.e1 e1Var = p0Var.c;
        p0Var.v = n0Var;
        if (i10 == 0) {
            e1Var.d(null);
            e1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var.c;
            textView.setText(stargiftattributemodel.name);
            p0.a(p0Var, stargiftattributemodel.document, 80, m61Var.G, true);
            z9Var.setColorFilter(null);
            e1Var.w = org.telegram.ui.ActionBar.g6.Oh;
            str = r3.K1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var.b;
            e1Var.d(stargiftattributebackdrop);
            e1Var.e(stargiftattributepattern);
            e1Var.w = org.telegram.ui.ActionBar.g6.d6;
            textView.setText(stargiftattributebackdrop.name);
            p0.a(p0Var, stargiftattributepattern.document, 48, m61Var.G, false);
            z9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = r3.K1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = n0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = n0Var.b;
            e1Var.d(stargiftattributebackdrop2);
            e1Var.e(stargiftattributepattern2);
            e1Var.w = org.telegram.ui.ActionBar.g6.d6;
            textView.setText(stargiftattributepattern2.name);
            p0.a(p0Var, stargiftattributepattern2.document, 64, m61Var.G, false);
            z9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = r3.K1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, p0Var.a) : -1);
        p0Var.f.setText(str);
        p0Var.h = numArr[0];
        p0Var.b();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new p0(context, c6Var);
    }
}
