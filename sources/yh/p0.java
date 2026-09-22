package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class p0 extends x51 {
    static {
        x51.setup(new p0());
    }

    public static y51 a(int i10, o0 o0Var) {
        y51 J = y51.J(p0.class);
        J.u = 1;
        J.z = i10;
        J.G = o0Var;
        return J;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) y51Var.G;
        int i10 = y51Var.z;
        Integer[] numArr = new Integer[1];
        q0Var.s = i10 == 0;
        v9 v9Var = q0Var.d;
        TextView textView = q0Var.e;
        xh.f1 f1Var = q0Var.c;
        q0Var.v = o0Var;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, y51Var.G, true);
            v9Var.setColorFilter(null);
            f1Var.w = org.telegram.ui.ActionBar.j6.Oh;
            str = y3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.w = org.telegram.ui.ActionBar.j6.d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, y51Var.G, false);
            v9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.w = org.telegram.ui.ActionBar.j6.d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, y51Var.G, false);
            v9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, q0Var.a) : -1);
        q0Var.f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(context, f6Var);
    }
}
