package zh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                s7 s7Var = (s7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i11 = s7Var.c;
                int i12 = s7Var.d;
                long j3 = s7Var.f;
                int i13 = 0;
                if (j3 == 0) {
                    s5 y3 = s5.y(i11, s7Var.e);
                    ArrayList arrayList2 = y3.q[i12];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = o7.a;
                        h51 J = h51.J(o7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.q = false;
                        arrayList.add(J);
                    }
                    if (!y3.u[i12]) {
                        arrayList.add(h51.o(arrayList.size(), 7));
                        arrayList.add(h51.o(arrayList.size(), 7));
                        arrayList.add(h51.o(arrayList.size(), 7));
                        break;
                    }
                } else {
                    o g10 = o.g(i11);
                    ArrayList arrayList3 = g10.k(j3).a[i12];
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        int i16 = o7.a;
                        h51 J2 = h51.J(o7.class);
                        J2.G = (TL_stars.StarsTransaction) obj4;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(h51.o(arrayList.size(), 7));
                        arrayList.add(h51.o(arrayList.size(), 7));
                        arrayList.add(h51.o(arrayList.size(), 7));
                        break;
                    }
                }
                break;
            default:
                ig.e2.V((ig.e2) notificationCenterDelegate, (ArrayList) obj, (v51) obj2);
                break;
        }
    }
}
