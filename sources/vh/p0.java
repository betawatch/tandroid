package vh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new p0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) i51Var.G;
        z2 z2Var = (z2) i51Var.H;
        d1 d1Var = q0Var.d;
        boolean z10 = q0Var.f != aVar;
        q0Var.f = aVar;
        q0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            q0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = x5.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (x5.q(0, r10.length(), r10) & 1) != 0;
            }
            d1Var.setAutoBold(aVar.r);
            if (z10 || !String.valueOf(d1Var.getText()).equals(x5.l(pageblockdetails.title))) {
                d1Var.setTextSilently(r10);
                d1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new q0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
