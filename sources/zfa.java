// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zfa extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ nha f;

    public zfa(nha nhaVar, Context context) {
        this.f = nhaVar;
        this.c = context;
        E(false);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(boolean z) {
        nha nhaVar = this.f;
        long j = nhaVar.m1;
        d dVar = nhaVar.y1;
        if (dVar != null) {
            if (pg3.y(j)) {
                TLRPC.Chat L0 = oc7.r1(dVar.getCurrentAccount()).L0(Long.valueOf(-j));
                if (L0 == null || !sd2.V(L0)) {
                    return;
                }
            } else if (oc7.r1(dVar.getCurrentAccount()).W1(Long.valueOf(j)) == null) {
                return;
            }
            qb7 K0 = oc7.r1(dVar.getCurrentAccount()).K0(j);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i = 0;
            if (K0 != null) {
                ArrayList arrayList2 = K0.b;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && sd2.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !z8c.h(dVar.getCurrentAccount()).p()) {
                i = K0.c;
            }
            this.e = i;
            if (z) {
                f();
            }
        }
    }

    @Override // y59
    public final int b() {
        return this.d.size();
    }

    @Override // y59
    public final int d(int i) {
        return (this.e <= 0 || i != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        ut8 ut8Var;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 17) {
            if (!(view instanceof ut8)) {
                return;
            } else {
                ut8Var = (ut8) view;
            }
        } else if (i2 != 18) {
            ut8Var = null;
        } else if (!(view instanceof lga)) {
            return;
        } else {
            ut8Var = ((lga) view).b;
        }
        ut8 ut8Var2 = ut8Var;
        if (ut8Var2 != null) {
            ArrayList arrayList = this.d;
            ut8Var2.x(arrayList.get(i), null, null, null, false, false);
            ut8Var2.N = i != arrayList.size() - 1;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View ut8Var;
        nha nhaVar = this.f;
        if (i == 18) {
            d dVar = nhaVar.y1;
            ut8Var = new lga(dVar == null ? z8c.t0 : dVar.getCurrentAccount(), this.c, nhaVar.m1 > 0, nhaVar.I1, new c0a(this, (byte) 14));
        } else {
            ut8Var = new ut8(this.c, nhaVar.I1);
        }
        ut8Var.setLayoutParams(new g69(-1, -2));
        return new b59(ut8Var);
    }
}
