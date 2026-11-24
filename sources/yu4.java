// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yu4 implements x74, nw4, bi0 {
    public final /* synthetic */ tv4 a;

    public /* synthetic */ yu4(tv4 tv4Var) {
        this.a = tv4Var;
    }

    @Override // bi0
    public final void b(fi0 fi0Var, List list) {
        int i;
        tv4 tv4Var = this.a;
        ArrayList arrayList = tv4Var.g2;
        Iterator it = list.iterator();
        long j = 0;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            kl8 kl8Var = (kl8) it.next();
            int size = arrayList.size();
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mu4 mu4Var = (mu4) obj;
                    if (mu4Var.h() != null && mu4Var.h().equals(kl8Var.c)) {
                        mu4Var.h = kl8Var;
                        if (mu4Var.f() > j) {
                            j = mu4Var.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((mu4) obj2).g = j;
        }
        gl.c3(new iu4(tv4Var, (byte) 1));
    }

    @Override // nw4
    public final int i() {
        return bkb.v0(bkb.a6, this.a.J0);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        pha phaVar = this.a.u2;
        if (phaVar != null) {
            phaVar.setTitlesAlpha(f);
        }
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
