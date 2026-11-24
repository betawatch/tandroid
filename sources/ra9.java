// default package

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ra9 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zb9 b;

    public /* synthetic */ ra9(zb9 zb9Var, byte b) {
        this.a = b;
        this.b = zb9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r12 != false) goto L22;
     */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        l7c l7cVar;
        byte b = this.a;
        zb9 zb9Var = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qb9 qb9Var = zb9Var.d;
                int i = qb9Var.e;
                HashSet hashSet = qb9Var.l;
                ArrayList arrayList = qb9Var.h;
                HashSet hashSet2 = qb9Var.k;
                ArrayList arrayList2 = qb9Var.g;
                HashSet hashSet3 = qb9Var.j;
                ArrayList arrayList3 = qb9Var.f;
                boolean z = false;
                if (i <= 12 && !qb9Var.f()) {
                    boolean z2 = qb9Var.r;
                    boolean z3 = qb9Var.s;
                    boolean z4 = qb9Var.t;
                    qb9Var.j();
                    boolean z5 = (qb9Var.g() && !qb9Var.r) || (qb9Var.h() && !qb9Var.s);
                    qb9Var.r = z2;
                    qb9Var.s = z3;
                    qb9Var.t = z4;
                    break;
                }
                zb9Var.h0(true, true);
                t34 t34Var = zb9Var.f;
                if (t34Var != null && (l7cVar = t34Var.g3) != null) {
                    l7cVar.O(true);
                    if (booleanValue) {
                        zb9Var.f.w0(0);
                    }
                }
                zb9Var.l0();
                ib9 ib9Var = zb9Var.F;
                if (ib9Var != null) {
                    ib9Var.setSorting(qb9Var.p);
                }
                if (zb9Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    zb9Var.G.setValue((size <= 0 || size == arrayList3.size()) ? jb6.M0(2131749956, null) : jb6.H(',', "Gift2ResaleFilterModels", size));
                }
                if (zb9Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    zb9Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? jb6.M0(2131749960, null) : jb6.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (zb9Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    zb9Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? jb6.M0(2131749952, null) : jb6.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (zb9Var.f != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < zb9Var.f.getChildCount()) {
                            if (zb9Var.f.getChildAt(i2) instanceof tk4) {
                                qb9Var.l(false);
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                if ((qb9Var.y || qb9Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z = true;
                }
                zb9Var.a.a(z, true);
                break;
            default:
                zb9Var.c0((Integer) obj);
                break;
        }
    }
}
