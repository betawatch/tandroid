package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p0 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new p0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) n41Var.G;
        x2 x2Var = (x2) n41Var.H;
        d1 d1Var = q0Var.d;
        boolean z11 = q0Var.f != aVar;
        q0Var.f = aVar;
        q0Var.h = x2Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            q0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = v5.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (v5.q(0, r10.length(), r10) & 1) != 0;
            }
            d1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(d1Var.getText()).equals(v5.l(pageblockdetails.title))) {
                d1Var.setTextSilently(r10);
                d1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new q0(context, c6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
