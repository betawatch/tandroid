// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zr1 extends ow9 {
    public final /* synthetic */ zu1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(zu1 zu1Var, Context context, zu1 zu1Var2, int i, long j, vnb vnbVar) {
        super(context, zu1Var2, i, j, vnbVar);
        this.J = zu1Var;
    }

    @Override // ow9
    public final void b(boolean z) {
        zu1 zu1Var = this.J;
        zu1Var.F5();
        zu1Var.D5();
        gs1 gs1Var = zu1Var.Mb;
        if (gs1Var != null) {
            gs1Var.setTranslationY(zu1Var.T9 + getCurrentHeight());
        }
        if (z) {
            zu1Var.aa = true;
            zu1Var.Rc();
        }
    }

    @Override // ow9
    public final boolean f(w49 w49Var) {
        int i;
        zu1 zu1Var = this.J;
        zu1Var.F3 = w49Var;
        zu1Var.G3 = w49Var != null;
        if (w49Var == null) {
            ls6 mediaDataController = zu1Var.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            zu1Var.Jb(false);
            zu1Var.nd(0, 0, -1);
        }
        zu1Var.qd();
        zu1Var.dd();
        zu1Var.I3 = zu1Var.k0.getSearchField().getText().toString();
        ls6 mediaDataController2 = zu1Var.getMediaDataController();
        String str = zu1Var.I3;
        long j = zu1Var.l6;
        long j2 = zu1Var.d7;
        i = ((e) zu1Var).classGuid;
        mediaDataController2.Z1(str, j, j2, i, 0, zu1Var.s4, false, zu1Var.D3, zu1Var.E3, (TextUtils.isEmpty(zu1Var.I3) && zu1Var.F3 == null) ? false : true, zu1Var.F3);
        hl.t1(zu1Var.k0.getSearchField());
        return true;
    }

    @Override // ow9
    public final void h(boolean z) {
        super.h(z);
        zu1 zu1Var = this.J;
        s7 s7Var = zu1Var.k0;
        g(s7Var != null && s7Var.w() && a() && zu1Var.J3 == null);
    }
}
