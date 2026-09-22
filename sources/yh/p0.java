package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class p0 extends h51 {
    static {
        h51.setup(new p0());
    }

    public static i51 a(int i10, o0 o0Var) {
        i51 J = i51.J(p0.class);
        J.u = 1;
        J.z = i10;
        J.G = o0Var;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) i51Var.G;
        int i10 = i51Var.z;
        Integer[] numArr = new Integer[1];
        q0Var.s = i10 == 0;
        u9 u9Var = q0Var.d;
        TextView textView = q0Var.e;
        xh.e1 e1Var = q0Var.c;
        q0Var.v = o0Var;
        if (i10 == 0) {
            e1Var.d(null);
            e1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, i51Var.G, true);
            u9Var.setColorFilter(null);
            e1Var.w = org.telegram.ui.ActionBar.i6.Oh;
            str = z3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.b;
            e1Var.d(stargiftattributebackdrop);
            e1Var.e(stargiftattributepattern);
            e1Var.w = org.telegram.ui.ActionBar.i6.d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, i51Var.G, false);
            u9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = z3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.b;
            e1Var.d(stargiftattributebackdrop2);
            e1Var.e(stargiftattributepattern2);
            e1Var.w = org.telegram.ui.ActionBar.i6.d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, i51Var.G, false);
            u9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = z3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, q0Var.a) : -1);
        q0Var.f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new q0(context, e6Var);
    }
}
