package uf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z extends nl0 {
    public final ArrayList r;
    public final int s;
    public final Context v;
    public final /* synthetic */ c0 w;

    public z(c0 c0Var, Context context) {
        this.w = c0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.s = i10;
        this.v = context;
        arrayList.addAll(p1.f(i10).e());
    }

    @Override // org.telegram.ui.Components.bl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.nl0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.nl0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void W(int i10, int i11, f2.l1 l1Var) {
        if (l1Var.f == 0) {
            l1 l1Var2 = (l1) l1Var.a;
            Object O = O(i10, i11);
            boolean z4 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z4 = false;
            }
            if (O instanceof o1) {
                o1 o1Var = (o1) O;
                l1Var2.a(o1Var, null, z4);
                l1Var2.d.a(this.w.w.contains(Integer.valueOf(o1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.nl0, f2.o0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(p1.f(this.s).e());
        X(false);
        this.w.K();
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l1Var;
        Context context = this.v;
        if (i10 == 0) {
            l1Var = new l1(context, this.w.a, false);
        } else if (i10 != 1) {
            l1Var = new View(context);
            l1Var.setTag(-33024);
        } else {
            l1Var = new View(context);
            l1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
            l1Var.setTag(-33024);
        }
        return new dl0(l1Var);
    }
}
