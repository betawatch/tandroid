// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zw4 implements g94, py4, bj0 {
    public final /* synthetic */ ux4 a;

    public /* synthetic */ zw4(ux4 ux4Var) {
        this.a = ux4Var;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        rja rjaVar = this.a.u2;
        if (rjaVar != null) {
            rjaVar.setTitlesAlpha(f);
        }
    }

    @Override // bj0
    public final void b(fj0 fj0Var, List list) {
        int i;
        ux4 ux4Var = this.a;
        ArrayList arrayList = ux4Var.g2;
        Iterator it = list.iterator();
        long j = 0;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ln8 ln8Var = (ln8) it.next();
            int size = arrayList.size();
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nw4 nw4Var = (nw4) obj;
                    if (nw4Var.h() != null && nw4Var.h().equals(ln8Var.c)) {
                        nw4Var.h = ln8Var;
                        if (nw4Var.f() > j) {
                            j = nw4Var.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((nw4) obj2).g = j;
        }
        gm.c3(new qn4(ux4Var, (byte) 8));
    }

    @Override // py4
    public final int i() {
        return cmb.v0(cmb.a6, this.a.J0);
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
