package sf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a0 extends fl0 {
    public final ArrayList r;
    public final int s;
    public final Context v;
    public final /* synthetic */ d0 w;

    public a0(d0 d0Var, Context context) {
        this.w = d0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.s = i10;
        this.v = context;
        arrayList.addAll(s1.f(i10).e());
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.fl0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.fl0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void W(int i10, int i11, f2.n1 n1Var) {
        if (n1Var.f == 0) {
            m1 m1Var = (m1) n1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof r1) {
                r1 r1Var = (r1) O;
                m1Var.a(r1Var, null, z10);
                m1Var.d.a(this.w.w.contains(Integer.valueOf(r1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.fl0, f2.p0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(s1.f(this.s).e());
        X(false);
        this.w.K();
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.v;
        if (i10 == 0) {
            m1Var = new m1(context, this.w.a, false);
        } else if (i10 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new vk0(m1Var);
    }
}
