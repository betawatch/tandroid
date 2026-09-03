package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q0 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new q0());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        r0 r0Var = (r0) view;
        a aVar = (a) h51Var.G;
        z2 z2Var = (z2) h51Var.H;
        e1 e1Var = r0Var.d;
        boolean z10 = r0Var.f != aVar;
        r0Var.f = aVar;
        r0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            r0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = x5.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (x5.q(0, r10.length(), r10) & 1) != 0;
            }
            e1Var.setAutoBold(aVar.r);
            if (z10 || !String.valueOf(e1Var.getText()).equals(x5.l(pageblockdetails.title))) {
                e1Var.setTextSilently(r10);
                e1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new r0(context, g6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
