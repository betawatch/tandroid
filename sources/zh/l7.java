package zh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ l7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i11 = m7Var.c;
                int i12 = m7Var.d;
                long j10 = m7Var.f;
                int i13 = 0;
                if (j10 == 0) {
                    n5 y3 = n5.y(i11, m7Var.e);
                    ArrayList arrayList2 = y3.q[i12];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = i7.a;
                        l61 J = l61.J(i7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.q = false;
                        arrayList.add(J);
                    }
                    if (!y3.u[i12]) {
                        arrayList.add(l61.o(arrayList.size(), 7));
                        arrayList.add(l61.o(arrayList.size(), 7));
                        arrayList.add(l61.o(arrayList.size(), 7));
                        break;
                    }
                } else {
                    p g10 = p.g(i11);
                    ArrayList arrayList3 = g10.k(j10).a[i12];
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        int i16 = i7.a;
                        l61 J2 = l61.J(i7.class);
                        J2.G = (TL_stars.StarsTransaction) obj4;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                    if (!g10.k(j10).e[i12]) {
                        arrayList.add(l61.o(arrayList.size(), 7));
                        arrayList.add(l61.o(arrayList.size(), 7));
                        arrayList.add(l61.o(arrayList.size(), 7));
                        break;
                    }
                }
                break;
            default:
                ig.e2.V((ig.e2) notificationCenterDelegate, (ArrayList) obj, (z61) obj2);
                break;
        }
    }
}
