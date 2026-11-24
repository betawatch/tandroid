// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yea extends n39 {
    public final Context c;
    public final vp9 d;
    public boolean h;
    public sca s;
    public final /* synthetic */ nfa y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final z6a n = new z6a(this, 8);
    public final k49 r = new k49();
    public final is5 w = new is5(new r10(this, 7));
    public final HashSet x = new HashSet();

    public yea(nfa nfaVar, Context context) {
        this.y = nfaVar;
        this.c = context;
        vp9 D1 = nfaVar.y1.getMessagesController().D1();
        this.d = D1;
        if (nfaVar.h0()) {
            D1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        up9 up9Var;
        if (view instanceof ue3) {
            ue3 ue3Var = (ue3) view;
            long dialogId = ue3Var.getDialogId();
            int i = 0;
            while (true) {
                arrayList = this.f;
                if (i >= arrayList.size()) {
                    up9Var = null;
                    break;
                } else {
                    if (((up9) arrayList.get(i)).a == dialogId) {
                        up9Var = (up9) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (up9Var == null) {
                return;
            }
            Long valueOf = Long.valueOf(up9Var.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            long j = up9Var.a;
            nfa nfaVar = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(j));
                if (hashSet.size() <= 0 && nfaVar.F1) {
                    nfaVar.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(j));
                if (hashSet.size() > 0 && !nfaVar.F1) {
                    nfaVar.l1(true);
                    r7 r7Var = nfaVar.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility(8);
                    }
                    r7 r7Var2 = nfaVar.w0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                }
            }
            nfaVar.j1(hashSet.size(), true);
            boolean z = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    up9 up9Var2 = (up9) arrayList.get(i2);
                    if (up9Var2.a != longValue) {
                        i2++;
                    } else if (!up9Var2.b) {
                        z = false;
                    }
                }
                if (!z) {
                    break;
                }
            }
            r7 r7Var3 = nfaVar.y0;
            if (r7Var3 != null) {
                r7Var3.setVisibility(z ? 8 : 0);
            }
            r7 r7Var4 = nfaVar.z0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(z ? 0 : 8);
            }
            ue3Var.e0(hashSet.contains(Long.valueOf(up9Var.a)), true);
        }
    }

    public final void F(boolean z) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.j);
        if (z) {
            f();
        }
    }

    @Override // w39
    public final int b() {
        return this.f.size();
    }

    @Override // w39
    public final long c(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                return ((up9) arrayList.get(i)).a;
            }
        }
        return i;
    }

    @Override // w39
    public final int d(int i) {
        return 13;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        if (view instanceof ue3) {
            ue3 ue3Var = (ue3) view;
            ArrayList arrayList = this.f;
            up9 up9Var = (up9) arrayList.get(i);
            ue3Var.f0(up9Var.a, up9Var.d, up9Var.c(), false, false);
            ue3Var.t0 = true;
            ue3Var.e0(this.x.contains(Long.valueOf(up9Var.a)), false);
            ue3Var.t2 = i + 1 < arrayList.size();
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        xea xeaVar = new xea(this, this.c);
        nfa nfaVar = this.y;
        xeaVar.setDialogCellDelegate(nfaVar);
        xeaVar.s0 = true;
        zkb.h(bkb.c6, nfaVar.I1, xeaVar);
        return new y29(xeaVar);
    }
}
