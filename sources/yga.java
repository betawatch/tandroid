// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yga extends ow9 {
    public final /* synthetic */ eja J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yga(eja ejaVar, Context context, e eVar, int i, long j, vnb vnbVar) {
        super(context, eVar, i, j, vnbVar);
        this.J = ejaVar;
    }

    @Override // ow9
    public final void b(boolean z) {
        bha bhaVar = this.J.L0;
        bhaVar.setAlpha(1.0f - this.F);
        bhaVar.setPivotX(bhaVar.getWidth() / 2.0f);
        bhaVar.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        bhaVar.setPivotY(hl.L(48.0f));
        bhaVar.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // ow9
    public final boolean f(w49 w49Var) {
        mha mhaVar;
        eja ejaVar = this.J;
        s7 s7Var = ejaVar.q0;
        if (s7Var == null) {
            return false;
        }
        ejaVar.Z0 = w49Var;
        String obj = s7Var.getSearchField().getText().toString();
        ejaVar.X0 = (obj.length() == 0 && ejaVar.Z0 == null) ? false : true;
        ejaVar.z1(false);
        int i = ejaVar.n0[0].F;
        if (i == 11) {
            qia qiaVar = ejaVar.V;
            if (qiaVar != null) {
                qiaVar.E(ejaVar.Z0, obj);
            }
            hl.t1(s7Var.getSearchField());
            return true;
        }
        if (i == 12 && (mhaVar = ejaVar.W) != null) {
            gv1 gv1Var = mhaVar.a;
            zr1 zr1Var = gv1Var.D1;
            if (zr1Var != null) {
                zr1Var.e(w49Var, true);
            }
            boolean z = (TextUtils.isEmpty(gv1Var.I3) && gv1Var.F3 == null) ? false : true;
            gv1Var.H3 = z;
            gv1Var.r0 = z;
            gv1Var.Pc(false);
            gv1Var.qd();
        }
        return true;
    }

    @Override // ow9
    public final void h(boolean z) {
        super.h(z);
        eja ejaVar = this.J;
        yga ygaVar = ejaVar.M0;
        g(ejaVar.Y0 && (ejaVar.getSelectedTab() == 11 || ejaVar.getSelectedTab() == 12) && ygaVar.a());
        s7 s7Var = ejaVar.p0;
        if (s7Var != null) {
            int i = (a() && ejaVar.y1.getUserConfig().p()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            e29 e29Var = s7Var.y;
            if (e29Var != null && s7Var.E != i) {
                if (z) {
                    s7Var.E = i;
                    hl.L3(e29Var, i);
                } else {
                    s7Var.E = i;
                    e29Var.setImageResource(i);
                }
            }
        }
        s7 s7Var2 = ejaVar.q0;
        if (s7Var2 != null) {
            s7Var2.setSearchFieldHint(ob6.M0((ygaVar != null && ygaVar.a() && ejaVar.getSelectedTab() == 11) ? 2131745596 : 2131745564, null));
        }
    }
}
