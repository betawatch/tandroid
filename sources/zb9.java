// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class zb9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new zb9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ac9 ac9Var = (ac9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        he9 he9Var = (he9) c4cVar.I;
        mc9 mc9Var = ac9Var.d;
        boolean z2 = ac9Var.f != lk0Var;
        ac9Var.f = lk0Var;
        ac9Var.h = he9Var;
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            ac9Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r = yi9.r(pageblockdetails.title, null, true);
            if (!lk0Var.s) {
                lk0Var.s = true;
                lk0Var.r = r.length() == 0 || (yi9.q(0, r.length(), r) & 1) != 0;
            }
            mc9Var.setAutoBold(lk0Var.r);
            if (z2 || !String.valueOf(mc9Var.getText()).equals(yi9.l(pageblockdetails.title))) {
                mc9Var.setTextSilently(r);
                mc9Var.f();
            }
        }
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ac9(context, wjbVar);
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
