// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zda extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ nfa f;

    public zda(nfa nfaVar, Context context) {
        this.f = nfaVar;
        this.c = context;
        E(false);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E(boolean z) {
        nfa nfaVar = this.f;
        long j = nfaVar.m1;
        d dVar = nfaVar.y1;
        if (dVar != null) {
            if (cf3.y(j)) {
                TLRPC.Chat K0 = na7.q1(dVar.getCurrentAccount()).K0(Long.valueOf(-j));
                if (K0 == null || !hc2.V(K0)) {
                    return;
                }
            } else if (na7.q1(dVar.getCurrentAccount()).V1(Long.valueOf(j)) == null) {
                return;
            }
            p97 J0 = na7.q1(dVar.getCurrentAccount()).J0(j);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i = 0;
            if (J0 != null) {
                ArrayList arrayList2 = J0.b;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && hc2.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !y6c.h(dVar.getCurrentAccount()).p()) {
                i = J0.c;
            }
            this.e = i;
            if (z) {
                f();
            }
        }
    }

    @Override // w39
    public final int b() {
        return this.d.size();
    }

    @Override // w39
    public final int d(int i) {
        return (this.e <= 0 || i != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        rr8 rr8Var;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 17) {
            if (!(view instanceof rr8)) {
                return;
            } else {
                rr8Var = (rr8) view;
            }
        } else if (i2 != 18) {
            rr8Var = null;
        } else if (!(view instanceof lea)) {
            return;
        } else {
            rr8Var = ((lea) view).b;
        }
        rr8 rr8Var2 = rr8Var;
        if (rr8Var2 != null) {
            ArrayList arrayList = this.d;
            rr8Var2.z(arrayList.get(i), null, null, null, false, false);
            rr8Var2.N = i != arrayList.size() - 1;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View rr8Var;
        nfa nfaVar = this.f;
        if (i == 18) {
            d dVar = nfaVar.y1;
            rr8Var = new lea(dVar == null ? y6c.t0 : dVar.getCurrentAccount(), this.c, nfaVar.m1 > 0, nfaVar.I1, new z6a(this, (byte) 6));
        } else {
            rr8Var = new rr8(this.c, nfaVar.I1);
        }
        rr8Var.setLayoutParams(new e49(-1, -2));
        return new y29(rr8Var);
    }
}
