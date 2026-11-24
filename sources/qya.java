// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qya implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xza b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ qya(xza xzaVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = xzaVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.c;
        xza xzaVar = this.b;
        switch (b) {
            case 0:
                z3b z3bVar = xzaVar.D0;
                z3bVar.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!z3bVar.j.containsKey((Integer) obj)) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z3bVar.q(0, arrayList, z)) {
                    xzaVar.m0();
                    xzaVar.r0();
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = xzaVar.w0;
                ArrayList arrayList3 = xzaVar.v0;
                xzaVar.A0 = false;
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        k47 k47Var = (k47) arrayList.get(i3);
                        int i4 = xzaVar.t0.get(k47Var.e1(), -1);
                        if (i4 >= 0 && ((uza) arrayList3.get(i4)).b() == k47Var.e1()) {
                            ((uza) arrayList3.get(i4)).b = k47Var;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i < size3) {
                            uza uzaVar = (uza) arrayList3.get(i);
                            if (uzaVar.b == null) {
                                xzaVar.s0 = uzaVar.b();
                            } else {
                                arrayList2.add(uzaVar);
                                i++;
                            }
                        }
                    }
                    xzaVar.r0();
                    xzaVar.T.setItemAnimator(null);
                    xzaVar.C0.e();
                    break;
                }
                break;
        }
    }
}
