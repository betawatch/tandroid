// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pia extends c79 {
    public final Context c;
    public final nt9 d;
    public boolean h;
    public jga s;
    public final /* synthetic */ eja y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ux9 n = new ux9(this, 25);
    public final x79 r = new x79();
    public final lu5 w = new lu5(new s10(this, 7));
    public final HashSet x = new HashSet();

    public pia(eja ejaVar, Context context) {
        this.y = ejaVar;
        this.c = context;
        nt9 F1 = ejaVar.y1.getMessagesController().F1();
        this.d = F1;
        if (ejaVar.h0()) {
            F1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        mt9 mt9Var;
        if (view instanceof of3) {
            of3 of3Var = (of3) view;
            long dialogId = of3Var.getDialogId();
            int i = 0;
            while (true) {
                arrayList = this.f;
                if (i >= arrayList.size()) {
                    mt9Var = null;
                    break;
                } else {
                    if (((mt9) arrayList.get(i)).a == dialogId) {
                        mt9Var = (mt9) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (mt9Var == null) {
                return;
            }
            Long valueOf = Long.valueOf(mt9Var.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            long j = mt9Var.a;
            eja ejaVar = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(j));
                if (hashSet.size() <= 0 && ejaVar.F1) {
                    ejaVar.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(j));
                if (hashSet.size() > 0 && !ejaVar.F1) {
                    ejaVar.l1(true);
                    s7 s7Var = ejaVar.x0;
                    if (s7Var != null) {
                        s7Var.setVisibility(8);
                    }
                    s7 s7Var2 = ejaVar.w0;
                    if (s7Var2 != null) {
                        s7Var2.setVisibility(8);
                    }
                }
            }
            ejaVar.j1(hashSet.size(), true);
            boolean z = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    mt9 mt9Var2 = (mt9) arrayList.get(i2);
                    if (mt9Var2.a != longValue) {
                        i2++;
                    } else if (!mt9Var2.b) {
                        z = false;
                    }
                }
                if (!z) {
                    break;
                }
            }
            s7 s7Var3 = ejaVar.y0;
            if (s7Var3 != null) {
                s7Var3.setVisibility(z ? 8 : 0);
            }
            s7 s7Var4 = ejaVar.z0;
            if (s7Var4 != null) {
                s7Var4.setVisibility(z ? 0 : 8);
            }
            of3Var.d0(hashSet.contains(Long.valueOf(mt9Var.a)), true);
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

    @Override // j79
    public final int b() {
        return this.f.size();
    }

    @Override // j79
    public final long c(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                return ((mt9) arrayList.get(i)).a;
            }
        }
        return i;
    }

    @Override // j79
    public final int d(int i) {
        return 13;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        if (view instanceof of3) {
            of3 of3Var = (of3) view;
            ArrayList arrayList = this.f;
            mt9 mt9Var = (mt9) arrayList.get(i);
            of3Var.e0(mt9Var.a, mt9Var.d, mt9Var.c(), false, false);
            of3Var.t0 = true;
            of3Var.d0(this.x.contains(Long.valueOf(mt9Var.a)), false);
            of3Var.t2 = i + 1 < arrayList.size();
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        oia oiaVar = new oia(this, this.c);
        eja ejaVar = this.y;
        oiaVar.setDialogCellDelegate(ejaVar);
        oiaVar.s0 = true;
        yob.h(aob.d6, ejaVar.I1, oiaVar);
        return new n69(oiaVar);
    }
}
