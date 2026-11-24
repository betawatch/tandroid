// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yfa extends eu5 {
    public sea e;
    public final /* synthetic */ nha f;

    public yfa(nha nhaVar) {
        this.f = nhaVar;
    }

    @Override // eu5
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        super.a(recyclerView, u69Var);
        u69Var.a.setPressed(false);
    }

    @Override // eu5
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        y59 adapter = recyclerView.getAdapter();
        kha khaVar = adapter instanceof kha ? (kha) adapter : null;
        if (!l() || khaVar == null || !khaVar.M(u69Var.b())) {
            return eu5.m(0, 0);
        }
        iga igaVar = this.f.n0[0];
        sea seaVar = igaVar != null ? igaVar.h : null;
        this.e = seaVar;
        if (seaVar != null) {
            seaVar.setItemAnimator(igaVar.d);
        }
        return eu5.m(15, 0);
    }

    @Override // eu5
    public final boolean l() {
        nha nhaVar = this.f;
        if (nhaVar.F1) {
            return true;
        }
        oea oeaVar = nhaVar.c0;
        return oeaVar != null && oeaVar.f;
    }

    @Override // eu5
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        z3b z3bVar;
        ArrayList arrayList;
        y59 adapter = recyclerView.getAdapter();
        kha khaVar = adapter instanceof kha ? (kha) adapter : null;
        if (khaVar == null || !khaVar.M(u69Var.b()) || !khaVar.M(u69Var2.b())) {
            return false;
        }
        int b = u69Var.b();
        int b2 = u69Var2.b();
        ArrayList arrayList2 = khaVar.E;
        if (!khaVar.h && (z3bVar = khaVar.s) != null && b >= 0 && b < z3bVar.i.size() && b2 >= 0 && b2 < khaVar.s.i.size()) {
            if ((khaVar.s instanceof t3b) || khaVar.n > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < khaVar.s.i.size(); i++) {
                    arrayList.add(Integer.valueOf(((k47) khaVar.s.i.get(i)).e1()));
                }
            } else {
                arrayList = new ArrayList(khaVar.s.g);
            }
            if (!khaVar.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                khaVar.F = true;
            }
            k47 k47Var = (k47) khaVar.s.i.get(b);
            arrayList.remove(Integer.valueOf(k47Var.e1()));
            arrayList.add(Utilities.j(b2, arrayList.size(), 0), Integer.valueOf(k47Var.e1()));
            khaVar.s.C(arrayList, false);
            khaVar.j(b, b2);
        }
        return true;
    }

    @Override // eu5
    public final void q(u69 u69Var, int i) {
        z3b z3bVar;
        ArrayList arrayList;
        sea seaVar = this.e;
        if (seaVar != null && u69Var != null) {
            seaVar.e1(false);
        }
        sea seaVar2 = this.e;
        if (i != 0) {
            if (seaVar2 != null) {
                seaVar2.J0(false);
            }
            if (u69Var != null) {
                u69Var.a.setPressed(true);
                return;
            }
            return;
        }
        if (seaVar2 != null && (seaVar2.getAdapter() instanceof kha)) {
            kha khaVar = (kha) this.e.getAdapter();
            ArrayList arrayList2 = khaVar.E;
            if (!khaVar.h && (z3bVar = khaVar.s) != null && khaVar.F) {
                if ((z3bVar instanceof t3b) || khaVar.n > 0) {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < khaVar.s.i.size(); i2++) {
                        arrayList.add(Integer.valueOf(((k47) khaVar.s.i.get(i2)).e1()));
                    }
                } else {
                    arrayList = z3bVar.g;
                }
                boolean z = arrayList2.size() != arrayList.size();
                if (!z) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        if (arrayList2.get(i3) != arrayList.get(i3)) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
                if (z) {
                    khaVar.s.C(arrayList, true);
                }
                khaVar.F = false;
            }
        }
        sea seaVar3 = this.e;
        if (seaVar3 != null) {
            seaVar3.setItemAnimator(null);
        }
    }

    @Override // eu5
    public final void r(u69 u69Var) {
    }
}
