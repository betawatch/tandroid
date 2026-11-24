// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yda extends fs5 {
    public sca e;
    public final /* synthetic */ nfa f;

    public yda(nfa nfaVar) {
        this.f = nfaVar;
    }

    @Override // fs5
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        super.a(recyclerView, s49Var);
        s49Var.a.setPressed(false);
    }

    @Override // fs5
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        w39 adapter = recyclerView.getAdapter();
        kfa kfaVar = adapter instanceof kfa ? (kfa) adapter : null;
        if (!l() || kfaVar == null || !kfaVar.M(s49Var.b())) {
            return fs5.m(0, 0);
        }
        iea ieaVar = this.f.n0[0];
        sca scaVar = ieaVar != null ? ieaVar.h : null;
        this.e = scaVar;
        if (scaVar != null) {
            scaVar.setItemAnimator(ieaVar.d);
        }
        return fs5.m(15, 0);
    }

    @Override // fs5
    public final boolean l() {
        nfa nfaVar = this.f;
        if (nfaVar.F1) {
            return true;
        }
        oca ocaVar = nfaVar.c0;
        return ocaVar != null && ocaVar.f;
    }

    @Override // fs5
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        y1b y1bVar;
        ArrayList arrayList;
        w39 adapter = recyclerView.getAdapter();
        kfa kfaVar = adapter instanceof kfa ? (kfa) adapter : null;
        if (kfaVar == null || !kfaVar.M(s49Var.b()) || !kfaVar.M(s49Var2.b())) {
            return false;
        }
        int b = s49Var.b();
        int b2 = s49Var2.b();
        ArrayList arrayList2 = kfaVar.E;
        if (!kfaVar.h && (y1bVar = kfaVar.s) != null && b >= 0 && b < y1bVar.i.size() && b2 >= 0 && b2 < kfaVar.s.i.size()) {
            if ((kfaVar.s instanceof s1b) || kfaVar.n > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < kfaVar.s.i.size(); i++) {
                    arrayList.add(Integer.valueOf(((k27) kfaVar.s.i.get(i)).e1()));
                }
            } else {
                arrayList = new ArrayList(kfaVar.s.g);
            }
            if (!kfaVar.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                kfaVar.F = true;
            }
            k27 k27Var = (k27) kfaVar.s.i.get(b);
            arrayList.remove(Integer.valueOf(k27Var.e1()));
            arrayList.add(Utilities.j(b2, arrayList.size(), 0), Integer.valueOf(k27Var.e1()));
            kfaVar.s.C(arrayList, false);
            kfaVar.j(b, b2);
        }
        return true;
    }

    @Override // fs5
    public final void q(s49 s49Var, int i) {
        y1b y1bVar;
        ArrayList arrayList;
        sca scaVar = this.e;
        if (scaVar != null && s49Var != null) {
            scaVar.e1(false);
        }
        sca scaVar2 = this.e;
        if (i != 0) {
            if (scaVar2 != null) {
                scaVar2.J0(false);
            }
            if (s49Var != null) {
                s49Var.a.setPressed(true);
                return;
            }
            return;
        }
        if (scaVar2 != null && (scaVar2.getAdapter() instanceof kfa)) {
            kfa kfaVar = (kfa) this.e.getAdapter();
            ArrayList arrayList2 = kfaVar.E;
            if (!kfaVar.h && (y1bVar = kfaVar.s) != null && kfaVar.F) {
                if ((y1bVar instanceof s1b) || kfaVar.n > 0) {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < kfaVar.s.i.size(); i2++) {
                        arrayList.add(Integer.valueOf(((k27) kfaVar.s.i.get(i2)).e1()));
                    }
                } else {
                    arrayList = y1bVar.g;
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
                    kfaVar.s.C(arrayList, true);
                }
                kfaVar.F = false;
            }
        }
        sca scaVar3 = this.e;
        if (scaVar3 != null) {
            scaVar3.setItemAnimator(null);
        }
    }

    @Override // fs5
    public final void r(s49 s49Var) {
    }
}
