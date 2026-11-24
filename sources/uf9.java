// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class uf9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new uf9());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L10;
     */
    @Override // b4c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        vf9 vf9Var = (vf9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        re9 re9Var = (re9) c4cVar.I;
        ArrayList arrayList = vf9Var.E;
        vf9Var.a = lk0Var;
        vf9Var.O = re9Var;
        vf9Var.c(lk0Var);
        if (lk0Var != null) {
            lk0 lk0Var2 = vf9Var.a;
            if (lk0Var2 != null) {
                TL_iv.PageBlock pageBlock = lk0Var2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (lk0Var.g == null) {
                lk0Var.g = new iy6();
            }
        }
        vf9Var.p();
        vf9Var.w.b();
        if (vf9Var.a0 >= arrayList.size()) {
            vf9Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        vf9Var.b0 = 0.0f;
        vf9Var.V.e(true, vf9Var.n() ? 1.0f : 0.0f);
        vf9Var.q(false);
        vf9Var.requestLayout();
        vf9Var.invalidate();
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d;
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        vf9 vf9Var = new vf9(context, wjbVar);
        vf9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return vf9Var;
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d;
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
