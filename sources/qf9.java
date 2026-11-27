// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class qf9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new qf9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        rf9 rf9Var = (rf9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        yh9 yh9Var = (yh9) b8cVar.I;
        dg9 dg9Var = rf9Var.d;
        boolean z2 = rf9Var.f != mk0Var;
        rf9Var.f = mk0Var;
        rf9Var.h = yh9Var;
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            rf9Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r = mm9.r(pageblockdetails.title, null, true);
            if (!mk0Var.s) {
                mk0Var.s = true;
                mk0Var.r = r.length() == 0 || (mm9.q(0, r.length(), r) & 1) != 0;
            }
            dg9Var.setAutoBold(mk0Var.r);
            if (z2 || !String.valueOf(dg9Var.getText()).equals(mm9.l(pageblockdetails.title))) {
                dg9Var.setTextSilently(r);
                dg9Var.f();
            }
        }
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new rf9(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
