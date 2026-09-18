package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                v7 v7Var = (v7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i11 = v7Var.c;
                int i12 = v7Var.d;
                long j3 = v7Var.f;
                int i13 = 0;
                if (j3 == 0) {
                    v5 y3 = v5.y(i11, v7Var.e);
                    ArrayList arrayList2 = y3.q[i12];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = r7.a;
                        j51 J = j51.J(r7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.q = false;
                        arrayList.add(J);
                    }
                    if (!y3.u[i12]) {
                        arrayList.add(j51.o(arrayList.size(), 7));
                        arrayList.add(j51.o(arrayList.size(), 7));
                        arrayList.add(j51.o(arrayList.size(), 7));
                        break;
                    }
                } else {
                    o g10 = o.g(i11);
                    ArrayList arrayList3 = g10.k(j3).a[i12];
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        int i16 = r7.a;
                        j51 J2 = j51.J(r7.class);
                        J2.G = (TL_stars.StarsTransaction) obj4;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(j51.o(arrayList.size(), 7));
                        arrayList.add(j51.o(arrayList.size(), 7));
                        arrayList.add(j51.o(arrayList.size(), 7));
                        break;
                    }
                }
                break;
            default:
                hg.e2.V((hg.e2) notificationCenterDelegate, (ArrayList) obj, (x51) obj2);
                break;
        }
    }
}
