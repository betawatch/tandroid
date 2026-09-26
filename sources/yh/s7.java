package yh;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i11 = t7Var.c;
                int i12 = t7Var.d;
                long j3 = t7Var.f;
                int i13 = 0;
                if (j3 == 0) {
                    s5 y3 = s5.y(i11, t7Var.e);
                    ArrayList arrayList2 = y3.q[i12];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = p7.a;
                        v51 J = v51.J(p7.class);
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
                    o g10 = o.g(i11);
                    ArrayList arrayList3 = g10.k(j3).a[i12];
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        int i16 = p7.a;
                        v51 J2 = v51.J(p7.class);
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
                hg.f2.V((hg.f2) notificationCenterDelegate, (ArrayList) obj, (j61) obj2);
                break;
        }
    }
}
