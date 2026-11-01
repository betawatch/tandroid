package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p0 extends a51 {
    static {
        a51.h(new p0());
    }

    public static b51 i(int i10, o0 o0Var) {
        b51 K = b51.K(p0.class);
        K.u = 1;
        K.z = i10;
        K.G = o0Var;
        return K;
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) b51Var.G;
        int i10 = b51Var.z;
        Integer[] numArr = new Integer[1];
        q0Var.s = i10 == 0;
        g9 g9Var = q0Var.d;
        TextView textView = q0Var.e;
        ph.z0 z0Var = q0Var.c;
        q0Var.w = o0Var;
        if (i10 == 0) {
            z0Var.d(null);
            z0Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, b51Var.G, true);
            g9Var.setColorFilter(null);
            z0Var.y = org.telegram.ui.ActionBar.t6.Ci;
            str = e4.G1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.b;
            z0Var.d(stargiftattributebackdrop);
            z0Var.e(stargiftattributepattern);
            z0Var.y = org.telegram.ui.ActionBar.t6.d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, b51Var.G, false);
            g9Var.setColorFilter(new PorterDuffColorFilter(i0.b.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = e4.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.b;
            z0Var.d(stargiftattributebackdrop2);
            z0Var.e(stargiftattributepattern2);
            z0Var.y = org.telegram.ui.ActionBar.t6.d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, b51Var.G, false);
            g9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = e4.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, q0Var.a);
        } else {
            org.telegram.ui.ActionBar.a7.r(textView);
            textView.setTextColor(-1);
        }
        q0Var.f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new q0(context, p6Var);
    }
}
