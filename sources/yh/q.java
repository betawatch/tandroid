package yh;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k20;
import org.telegram.messenger.m5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ q(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        boolean z10;
        ArrayList arrayList;
        int i10 = this.a;
        boolean z11 = true;
        int i11 = 2;
        int i12 = 0;
        z zVar = this.b;
        switch (i10) {
            case 0:
                zVar.J0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    zVar.getClass();
                    break;
                } else {
                    f1.s((FrameLayout) zVar.b, zVar.I0, tL_error, false);
                    break;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                zVar.o1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList2 != null) {
                        zVar.H1 = arrayList2;
                        if (!arrayList2.isEmpty()) {
                            zVar.t1.d.f3.O(false);
                            zVar.k1.E(2);
                            break;
                        } else {
                            m5.n(null, 2131751905, new cc((FrameLayout) zVar.b, zVar.I0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    f1.s((FrameLayout) zVar.b, zVar.I0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i13 = z.M1;
                zVar.J0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                int i14 = z.M1;
                arrayList3.add(b51.E(99, Math.min(i0.L(176.0f) + i0.m, (int) (i0.q.y * 0.25f))));
                arrayList3.add(b51.E(0, i0.L(56.0f)));
                String L0 = dd.L0(2131751849, null);
                b51 b51Var = new b51(39);
                b51Var.d = 101;
                b51Var.l = L0;
                b51Var.z = 0;
                b51Var.L(zVar.n1);
                arrayList3.add(b51Var);
                arrayList3.add(b51.B(2, dd.L0(2131751848, null)));
                d0 d0Var = zVar.D1;
                if (d0Var.n && d0Var.l == 1 && (arrayList = d0Var.j) != null && arrayList.size() == 1) {
                    arrayList3.add(b51.t(3, dd.L0(2131751904, null)));
                    d0Var.c(arrayList3);
                    arrayList3.add(b51.E(5, i0.L(14.33f)));
                } else {
                    int i15 = d0Var.l;
                    if (i15 > 0) {
                        int i16 = d0Var.p;
                        String L02 = i15 == i16 ? dd.L0(2131751895, null) : dd.G(i15, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i16 > 0 ? Integer.toString(i16) : null;
                        int i17 = zh.i.b;
                        b51 K = b51.K(zh.i.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.l = L02;
                        K.n = num;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.q = true;
                        arrayList3.add(K);
                        arrayList3.add(b51.E(5, i0.L(14.33f)));
                    }
                }
                ji.f x10 = wp.r1(zVar.a).x(zVar.l1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.c;
                ArrayList arrayList7 = (ArrayList) x10.b;
                if (arrayList7.isEmpty()) {
                    z10 = false;
                } else {
                    arrayList3.add(b51.t(21, dd.L0(2131751878, null)));
                    int size = arrayList7.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj3 = arrayList7.get(i18);
                        i18++;
                        arrayList3.add(a0.i((ap) obj3, zVar));
                    }
                    z10 = true;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(b51.E(22, i0.L(12.0f)));
                    }
                    arrayList3.add(b51.t(23, dd.L0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj4 = arrayList6.get(i19);
                        i19++;
                        arrayList3.add(a0.i((ap) obj4, zVar));
                    }
                    z10 = true;
                }
                if (arrayList5.isEmpty()) {
                    z11 = z10;
                } else {
                    if (z10) {
                        arrayList3.add(b51.E(24, i0.L(12.0f)));
                    }
                    arrayList3.add(b51.t(25, dd.L0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj5 = arrayList5.get(i20);
                        i20++;
                        arrayList3.add(a0.i((ap) obj5, zVar));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(b51.E(26, i0.L(12.0f)));
                    }
                    arrayList3.add(b51.t(27, dd.L0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i12 < size4) {
                        Object obj6 = arrayList4.get(i12);
                        i12++;
                        arrayList3.add(a0.i((ap) obj6, zVar));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                d0 d0Var2 = zVar.D1;
                arrayList8.add(b51.E(99, (int) (i0.q.y * 0.35f)));
                arrayList8.add(b51.E(0, i0.L(48.0f)));
                if (w3.w(2, zVar.m1)) {
                    arrayList8.add(b51.B(1, i0.G2(i0.T2(dd.L0(2131751894, null), new s(zVar, i11)), true)));
                } else {
                    arrayList8.add(b51.B(1, dd.L0(2131751893, null)));
                }
                arrayList8.add(b51.j(2, zVar.C1));
                arrayList8.add(b51.t(3, dd.G(d0Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                d0Var2.c(arrayList8);
                break;
        }
    }
}
