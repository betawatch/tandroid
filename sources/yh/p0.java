package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class p0 extends u51 {
    static {
        u51.setup(new p0());
    }

    public static v51 a(int i10, o0 o0Var) {
        v51 J = v51.J(p0.class);
        J.u = 1;
        J.z = i10;
        J.G = o0Var;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) v51Var.G;
        int i10 = v51Var.z;
        Integer[] numArr = new Integer[1];
        q0Var.s = i10 == 0;
        w9 w9Var = q0Var.d;
        TextView textView = q0Var.e;
        xh.f1 f1Var = q0Var.c;
        q0Var.v = o0Var;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, v51Var.G, true);
            w9Var.setColorFilter(null);
            f1Var.w = org.telegram.ui.ActionBar.h6.Oh;
            str = x3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.w = org.telegram.ui.ActionBar.h6.d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, v51Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = x3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.w = org.telegram.ui.ActionBar.h6.d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, v51Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = x3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, q0Var.a) : -1);
        q0Var.f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q0(context, d6Var);
    }
}
