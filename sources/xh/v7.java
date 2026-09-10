package xh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                w7 w7Var = (w7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i11 = w7Var.c;
                int i12 = w7Var.d;
                long j3 = w7Var.f;
                int i13 = 0;
                if (j3 == 0) {
                    v5 y3 = v5.y(i11, w7Var.e);
                    ArrayList arrayList2 = y3.q[i12];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = s7.a;
                        v51 J = v51.J(s7.class);
                        J.G = (TL_stars.StarsTransaction) obj3;
                        J.q = false;
                        arrayList.add(J);
                    }
                    if (!y3.u[i12]) {
                        arrayList.add(v51.o(arrayList.size(), 7));
                        arrayList.add(v51.o(arrayList.size(), 7));
                        arrayList.add(v51.o(arrayList.size(), 7));
                        break;
                    }
                } else {
                    p g10 = p.g(i11);
                    ArrayList arrayList3 = g10.k(j3).a[i12];
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        int i16 = s7.a;
                        v51 J2 = v51.J(s7.class);
                        J2.G = (TL_stars.StarsTransaction) obj4;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                    if (!g10.k(j3).e[i12]) {
                        arrayList.add(v51.o(arrayList.size(), 7));
                        arrayList.add(v51.o(arrayList.size(), 7));
                        arrayList.add(v51.o(arrayList.size(), 7));
                        break;
                    }
                }
                break;
            default:
                gg.n2.V((gg.n2) notificationCenterDelegate, (ArrayList) obj, (j61) obj2);
                break;
        }
    }
}
