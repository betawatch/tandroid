package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                u7 u7Var = (u7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i11 = u7Var.c;
                int i12 = u7Var.d;
                long j3 = u7Var.f;
                int i13 = 0;
                if (j3 == 0) {
                    u5 y3 = u5.y(i11, u7Var.e);
                    ArrayList arrayList2 = y3.q[i12];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = q7.a;
                        i51 J = i51.J(q7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.q = false;
                        arrayList.add(J);
                    }
                    if (!y3.u[i12]) {
                        arrayList.add(i51.o(arrayList.size(), 7));
                        arrayList.add(i51.o(arrayList.size(), 7));
                        arrayList.add(i51.o(arrayList.size(), 7));
                        break;
                    }
                } else {
                    o g10 = o.g(i11);
                    ArrayList arrayList3 = g10.k(j3).a[i12];
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        int i16 = q7.a;
                        i51 J2 = i51.J(q7.class);
                        J2.G = (TL_stars.StarsTransaction) obj4;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(i51.o(arrayList.size(), 7));
                        arrayList.add(i51.o(arrayList.size(), 7));
                        arrayList.add(i51.o(arrayList.size(), 7));
                        break;
                    }
                }
                break;
            default:
                hg.f2.V((hg.f2) notificationCenterDelegate, (ArrayList) obj, (w51) obj2);
                break;
        }
    }
}
