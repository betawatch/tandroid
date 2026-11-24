// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class zh9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new zh9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        TL_iv.RichText richText;
        ai9 ai9Var = (ai9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        yh9 yh9Var = (yh9) c4cVar.I;
        mc9 mc9Var = ai9Var.r;
        ai9Var.a = lk0Var;
        ai9Var.s = yh9Var;
        ai9Var.f(gl.L(16.0f), gl.L(1.0f), gl.L(16.0f), gl.L(8.0f));
        ai9Var.c(lk0Var);
        if (yh9Var != null) {
            richText = (TL_iv.RichText) ((fe9) yh9Var).a.u3.get(Long.valueOf(lk0Var.t));
        } else {
            richText = null;
        }
        if (String.valueOf(mc9Var.getText()).equals(yi9.l(richText))) {
            return;
        }
        mc9Var.setTextSilently(vu3.m(yi9.r(richText, null, true), mc9Var.getPaint().getFontMetricsInt(), false, null, 0));
        mc9Var.f();
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ai9(context, wjbVar);
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
