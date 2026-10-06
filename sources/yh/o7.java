package yh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ o7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 0;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                ((p7) notificationCenterDelegate).P((ArrayList) obj, (w61) obj2);
                break;
            case 1:
                w7 w7Var = (w7) notificationCenterDelegate;
                ArrayList arrayList = (ArrayList) obj;
                int i12 = w7Var.c;
                int i13 = w7Var.d;
                long j3 = w7Var.f;
                if (j3 == 0) {
                    u5 y3 = u5.y(i12, w7Var.e);
                    ArrayList arrayList2 = y3.q[i13];
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        int i15 = s7.a;
                        h61 K = h61.K(s7.class);
                        K.G = (TL_stars.StarsTransaction) obj3;
                        K.q = false;
                        arrayList.add(K);
                    }
                    if (!y3.u[i13]) {
                        arrayList.add(h61.q(arrayList.size(), 7));
                        arrayList.add(h61.q(arrayList.size(), 7));
                        arrayList.add(h61.q(arrayList.size(), 7));
                        break;
                    }
                } else {
                    p g10 = p.g(i12);
                    ArrayList arrayList3 = g10.k(j3).a[i13];
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        int i16 = s7.a;
                        h61 K2 = h61.K(s7.class);
                        K2.G = (TL_stars.StarsTransaction) obj4;
                        K2.q = true;
                        arrayList.add(K2);
                    }
                    if (!g10.k(j3).e[i13]) {
                        arrayList.add(h61.q(arrayList.size(), 7));
                        arrayList.add(h61.q(arrayList.size(), 7));
                        arrayList.add(h61.q(arrayList.size(), 7));
                        break;
                    }
                }
                break;
            default:
                zg.o oVar = (zg.o) notificationCenterDelegate;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = oVar.F;
                w8 w8Var = oVar.e;
                if (w8Var != null && oVar.f != null) {
                    arrayList4.add(h61.j(1, w8Var));
                    arrayList4.add(h61.l(2, oVar.f));
                    int i17 = oVar.X;
                    if (i17 == 1 || i17 == 0 || oVar.a) {
                        while (i11 < arrayList5.size()) {
                            View view = (View) arrayList5.get(i11);
                            arrayList4.add(((Boolean) oVar.G.get(i11)).booleanValue() ? h61.l(i11 + 100, view) : h61.j(i11 + 100, view));
                            i11++;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
