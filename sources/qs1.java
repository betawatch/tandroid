// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qs1 implements jt1 {
    public final /* synthetic */ zu1 a;
    public final /* synthetic */ zu1 b;

    public qs1(zu1 zu1Var, zu1 zu1Var2) {
        this.b = zu1Var;
        this.a = zu1Var2;
    }

    @Override // jt1
    public final void F(boolean z, boolean z2) {
        q11 q11Var;
        int i;
        zu1 zu1Var = this.b;
        if (!z) {
            r47 r47Var = (r47) zu1Var.X4.get(Integer.valueOf(zu1Var.Z4));
            if (r47Var == null) {
                r47Var = (r47) zu1Var.G6[0].get(zu1Var.Z4);
            }
            zu1Var.Jc(r47Var);
            return;
        }
        ArrayList arrayList = new ArrayList(zu1Var.V4);
        ArrayList arrayList2 = new ArrayList(zu1Var.X4.values());
        v21 v21Var = null;
        if (z2) {
            i = ((e) zu1Var).currentAccount;
            SharedPreferences sharedPreferences = uc7.s1(i).W3;
            if (zu1Var.V4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + zu1Var.l6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + zu1Var.l6, ((Integer) zu1Var.V4.get(0)).intValue()).commit();
            }
            zu1Var.gd(0, true);
        } else {
            zu1Var.getNotificationCenter().k(jn7.t0, Long.valueOf(zu1Var.l6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        v21 v21Var2 = zu1Var.P3;
        if (v21Var2 != null) {
            v21Var2.b();
        }
        zu1Var.Q3 = true;
        int i2 = zu1Var.R3 + 1;
        zu1Var.R3 = i2;
        boolean z3 = zu1Var.x4;
        zu1 zu1Var2 = this.a;
        int c7 = z3 ? zu1Var2.c7() : zu1Var.c7();
        if (!zu1Var.x4) {
            zu1Var2 = zu1Var;
        }
        ArrayList arrayList3 = new ArrayList(zu1Var2.V4);
        l5a l5aVar = new l5a(this, z2, arrayList, arrayList2, c7, i2);
        ps1 ps1Var = new ps1(this, z2, arrayList3, i2);
        xu1 xu1Var = zu1Var.Ba;
        if (zu1Var.getParentActivity() == null) {
            ps1Var.run();
        } else {
            if (z2) {
                s21 s21Var = new s21(zu1Var.getParentActivity(), xu1Var);
                s21Var.g(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                s21Var.b.setText(ob6.M0(2131746951, null));
                s21Var.c.setText(ob6.M0(2131746950, null));
                q11Var = s21Var;
            } else {
                c21 c21Var = new c21(zu1Var.getParentActivity(), xu1Var);
                c21Var.g(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                c21Var.b.setText(ob6.G(c7, "MessagesUnpinned", new Object[0]));
                q11Var = c21Var;
            }
            t21 t21Var = new t21(xu1Var, zu1Var.getParentActivity(), true);
            t21Var.b = l5aVar;
            t21Var.c = ps1Var;
            q11Var.setButton(t21Var);
            v21Var = v21.g(zu1Var, q11Var, 5000);
        }
        zu1Var.P3 = v21Var;
    }

    @Override // jt1
    public final void O(String str) {
        this.b.ta(str, false);
    }

    @Override // jt1
    public final void c0(int i) {
        this.b.J(i, 0, 0, 0, true, true);
    }
}
