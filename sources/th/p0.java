package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p0 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new p0());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) w41Var.G;
        x2 x2Var = (x2) w41Var.H;
        d1 d1Var = q0Var.d;
        boolean z11 = q0Var.f != aVar;
        q0Var.f = aVar;
        q0Var.h = x2Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            q0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r6 = v5.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r6.length() == 0 || (v5.q(0, r6.length(), r6) & 1) != 0;
            }
            d1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(d1Var.getText()).equals(v5.l(pageblockdetails.title))) {
                d1Var.setTextSilently(r6);
                d1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new q0(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean isClickable() {
        return false;
    }
}
