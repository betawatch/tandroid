package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p0 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new p0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) l41Var.G;
        w2 w2Var = (w2) l41Var.H;
        d1 d1Var = q0Var.d;
        boolean z11 = q0Var.f != aVar;
        q0Var.f = aVar;
        q0Var.h = w2Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            q0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = u5.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (u5.q(0, r10.length(), r10) & 1) != 0;
            }
            d1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(d1Var.getText()).equals(u5.l(pageblockdetails.title))) {
                d1Var.setTextSilently(r10);
                d1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new q0(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
