package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class q0 extends g61 {
    static {
        g61.setup(new q0());
    }

    public static h61 a(int i10, p0 p0Var) {
        h61 K = h61.K(q0.class);
        K.u = 1;
        K.z = i10;
        K.G = p0Var;
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        String str;
        r0 r0Var = (r0) view;
        p0 p0Var = (p0) h61Var.G;
        int i10 = h61Var.z;
        Integer[] numArr = new Integer[1];
        r0Var.s = i10 == 0;
        w9 w9Var = r0Var.d;
        TextView textView = r0Var.e;
        xh.f1 f1Var = r0Var.c;
        r0Var.v = p0Var;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = p0Var.c;
            textView.setText(stargiftattributemodel.name);
            r0.a(r0Var, stargiftattributemodel.document, 80, h61Var.G, true);
            w9Var.setColorFilter(null);
            f1Var.w = org.telegram.ui.ActionBar.i6.Oh;
            str = y3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = p0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = p0Var.b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.w = org.telegram.ui.ActionBar.i6.d6;
            textView.setText(stargiftattributebackdrop.name);
            r0.a(r0Var, stargiftattributepattern.document, 48, h61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = p0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = p0Var.b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.w = org.telegram.ui.ActionBar.i6.d6;
            textView.setText(stargiftattributepattern2.name);
            r0.a(r0Var, stargiftattributepattern2.document, 64, h61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, r0Var.a) : -1);
        r0Var.f.setText(str);
        r0Var.h = numArr[0];
        r0Var.b();
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r0(context, d6Var);
    }
}
