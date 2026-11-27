// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pha extends iu5 {
    public jga e;
    public final /* synthetic */ eja f;

    public pha(eja ejaVar) {
        this.f = ejaVar;
    }

    @Override // iu5
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        super.a(recyclerView, f89Var);
        f89Var.a.setPressed(false);
    }

    @Override // iu5
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        j79 adapter = recyclerView.getAdapter();
        bja bjaVar = adapter instanceof bja ? (bja) adapter : null;
        if (!l() || bjaVar == null || !bjaVar.M(f89Var.b())) {
            return iu5.m(0, 0);
        }
        zha zhaVar = this.f.n0[0];
        jga jgaVar = zhaVar != null ? zhaVar.h : null;
        this.e = jgaVar;
        if (jgaVar != null) {
            jgaVar.setItemAnimator(zhaVar.d);
        }
        return iu5.m(15, 0);
    }

    @Override // iu5
    public final boolean l() {
        eja ejaVar = this.f;
        if (ejaVar.F1) {
            return true;
        }
        fga fgaVar = ejaVar.c0;
        return fgaVar != null && fgaVar.f;
    }

    @Override // iu5
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        v5b v5bVar;
        ArrayList arrayList;
        j79 adapter = recyclerView.getAdapter();
        bja bjaVar = adapter instanceof bja ? (bja) adapter : null;
        if (bjaVar == null || !bjaVar.M(f89Var.b()) || !bjaVar.M(f89Var2.b())) {
            return false;
        }
        int b = f89Var.b();
        int b2 = f89Var2.b();
        ArrayList arrayList2 = bjaVar.E;
        if (!bjaVar.h && (v5bVar = bjaVar.s) != null && b >= 0 && b < v5bVar.i.size() && b2 >= 0 && b2 < bjaVar.s.i.size()) {
            if ((bjaVar.s instanceof p5b) || bjaVar.n > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < bjaVar.s.i.size(); i++) {
                    arrayList.add(Integer.valueOf(((r47) bjaVar.s.i.get(i)).e1()));
                }
            } else {
                arrayList = new ArrayList(bjaVar.s.g);
            }
            if (!bjaVar.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                bjaVar.F = true;
            }
            r47 r47Var = (r47) bjaVar.s.i.get(b);
            arrayList.remove(Integer.valueOf(r47Var.e1()));
            arrayList.add(Utilities.j(b2, arrayList.size(), 0), Integer.valueOf(r47Var.e1()));
            bjaVar.s.C(arrayList, false);
            bjaVar.j(b, b2);
        }
        return true;
    }

    @Override // iu5
    public final void q(f89 f89Var, int i) {
        v5b v5bVar;
        ArrayList arrayList;
        jga jgaVar = this.e;
        if (jgaVar != null && f89Var != null) {
            jgaVar.f1(false);
        }
        jga jgaVar2 = this.e;
        if (i != 0) {
            if (jgaVar2 != null) {
                jgaVar2.K0(false);
            }
            if (f89Var != null) {
                f89Var.a.setPressed(true);
                return;
            }
            return;
        }
        if (jgaVar2 != null && (jgaVar2.getAdapter() instanceof bja)) {
            bja bjaVar = (bja) this.e.getAdapter();
            ArrayList arrayList2 = bjaVar.E;
            if (!bjaVar.h && (v5bVar = bjaVar.s) != null && bjaVar.F) {
                if ((v5bVar instanceof p5b) || bjaVar.n > 0) {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < bjaVar.s.i.size(); i2++) {
                        arrayList.add(Integer.valueOf(((r47) bjaVar.s.i.get(i2)).e1()));
                    }
                } else {
                    arrayList = v5bVar.g;
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
                    bjaVar.s.C(arrayList, true);
                }
                bjaVar.F = false;
            }
        }
        jga jgaVar3 = this.e;
        if (jgaVar3 != null) {
            jgaVar3.setItemAnimator(null);
        }
    }

    @Override // iu5
    public final void r(f89 f89Var) {
    }
}
