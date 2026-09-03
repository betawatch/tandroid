package vh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new q0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        r0 r0Var = (r0) view;
        a aVar = (a) i51Var.G;
        a3 a3Var = (a3) i51Var.H;
        e1 e1Var = r0Var.d;
        boolean z10 = r0Var.f != aVar;
        r0Var.f = aVar;
        r0Var.h = a3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            r0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = y5.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (y5.q(0, r10.length(), r10) & 1) != 0;
            }
            e1Var.setAutoBold(aVar.r);
            if (z10 || !String.valueOf(e1Var.getText()).equals(y5.l(pageblockdetails.title))) {
                e1Var.setTextSilently(r10);
                e1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new r0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
