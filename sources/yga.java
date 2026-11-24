// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yga extends q59 {
    public final Context c;
    public final wr9 d;
    public boolean h;
    public sea s;
    public final /* synthetic */ nha y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final c0a n = new c0a(this, 16);
    public final m69 r = new m69();
    public final hu5 w = new hu5(new r20(this, 7));
    public final HashSet x = new HashSet();

    public yga(nha nhaVar, Context context) {
        this.y = nhaVar;
        this.c = context;
        wr9 E1 = nhaVar.y1.getMessagesController().E1();
        this.d = E1;
        if (nhaVar.h0()) {
            E1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        vr9 vr9Var;
        if (view instanceof hg3) {
            hg3 hg3Var = (hg3) view;
            long dialogId = hg3Var.getDialogId();
            int i = 0;
            while (true) {
                arrayList = this.f;
                if (i >= arrayList.size()) {
                    vr9Var = null;
                    break;
                } else {
                    if (((vr9) arrayList.get(i)).a == dialogId) {
                        vr9Var = (vr9) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (vr9Var == null) {
                return;
            }
            Long valueOf = Long.valueOf(vr9Var.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            long j = vr9Var.a;
            nha nhaVar = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(j));
                if (hashSet.size() <= 0 && nhaVar.F1) {
                    nhaVar.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(j));
                if (hashSet.size() > 0 && !nhaVar.F1) {
                    nhaVar.l1(true);
                    r7 r7Var = nhaVar.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility(8);
                    }
                    r7 r7Var2 = nhaVar.w0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                }
            }
            nhaVar.j1(hashSet.size(), true);
            boolean z = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    vr9 vr9Var2 = (vr9) arrayList.get(i2);
                    if (vr9Var2.a != longValue) {
                        i2++;
                    } else if (!vr9Var2.b) {
                        z = false;
                    }
                }
                if (!z) {
                    break;
                }
            }
            r7 r7Var3 = nhaVar.y0;
            if (r7Var3 != null) {
                r7Var3.setVisibility(z ? 8 : 0);
            }
            r7 r7Var4 = nhaVar.z0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(z ? 0 : 8);
            }
            hg3Var.d0(hashSet.contains(Long.valueOf(vr9Var.a)), true);
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

    @Override // y59
    public final int b() {
        return this.f.size();
    }

    @Override // y59
    public final long c(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                return ((vr9) arrayList.get(i)).a;
            }
        }
        return i;
    }

    @Override // y59
    public final int d(int i) {
        return 13;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        if (view instanceof hg3) {
            hg3 hg3Var = (hg3) view;
            ArrayList arrayList = this.f;
            vr9 vr9Var = (vr9) arrayList.get(i);
            hg3Var.e0(vr9Var.a, vr9Var.d, vr9Var.c(), false, false);
            hg3Var.t0 = true;
            hg3Var.d0(this.x.contains(Long.valueOf(vr9Var.a)), false);
            hg3Var.t2 = i + 1 < arrayList.size();
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        xga xgaVar = new xga(this, this.c);
        nha nhaVar = this.y;
        xgaVar.setDialogCellDelegate(nhaVar);
        xgaVar.s0 = true;
        anb.h(cmb.c6, nhaVar.I1, xgaVar);
        return new b59(xgaVar);
    }
}
