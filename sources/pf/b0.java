package pf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b0 extends sk0 {
    public final ArrayList r;
    public final int s;
    public final Context v;
    public final /* synthetic */ e0 w;

    public b0(e0 e0Var, Context context) {
        this.w = e0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i9 = UserConfig.selectedAccount;
        this.s = i9;
        this.v = context;
        arrayList.addAll(r1.f(i9).e());
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        if (i9 == 0 || i9 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        if (i9 != 0 && i10 >= 0) {
            ArrayList arrayList = this.r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        return i9 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        return (i9 == 0 || i9 == 2 || i10 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        if (q1Var.f == 0) {
            m1 m1Var = (m1) q1Var.a;
            Object O = O(i9, i10);
            boolean z10 = true;
            if (i9 == 1 && i10 == M(i9) - 1) {
                z10 = false;
            }
            if (O instanceof q1) {
                q1 q1Var2 = (q1) O;
                m1Var.a(q1Var2, null, z10);
                m1Var.d.a(this.w.w.contains(Integer.valueOf(q1Var2.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.sk0, f2.r0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(r1.f(this.s).e());
        X(false);
        this.w.K();
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m1Var;
        Context context = this.v;
        if (i9 == 0) {
            m1Var = new m1(context, this.w.a, false);
        } else if (i9 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new ik0(m1Var);
    }
}
