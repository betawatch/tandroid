package yh;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ r(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        boolean z10;
        ArrayList arrayList;
        int i10 = this.a;
        boolean z11 = true;
        int i11 = 2;
        int i12 = 0;
        a0 a0Var = this.b;
        switch (i10) {
            case 0:
                a0Var.J0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    a0Var.getClass();
                    break;
                } else {
                    f1.s((FrameLayout) a0Var.b, a0Var.I0, tL_error, false);
                    break;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                a0Var.o1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList2 != null) {
                        a0Var.H1 = arrayList2;
                        if (!arrayList2.isEmpty()) {
                            a0Var.t1.d.f3.O(false);
                            a0Var.k1.E(2);
                            break;
                        } else {
                            m5.n(null, 2131751905, new cc((FrameLayout) a0Var.b, a0Var.I0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    f1.s((FrameLayout) a0Var.b, a0Var.I0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i13 = a0.M1;
                a0Var.J0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                int i14 = a0.M1;
                arrayList3.add(a51.E(99, Math.min(i0.L(176.0f) + i0.m, (int) (i0.q.y * 0.25f))));
                arrayList3.add(a51.E(0, i0.L(56.0f)));
                String L0 = cd.L0(2131751849, null);
                a51 a51Var = new a51(39);
                a51Var.d = 101;
                a51Var.l = L0;
                a51Var.z = 0;
                a51Var.L(a0Var.n1);
                arrayList3.add(a51Var);
                arrayList3.add(a51.B(2, cd.L0(2131751848, null)));
                e0 e0Var = a0Var.D1;
                if (e0Var.n && e0Var.l == 1 && (arrayList = e0Var.j) != null && arrayList.size() == 1) {
                    arrayList3.add(a51.t(3, cd.L0(2131751904, null)));
                    e0Var.c(arrayList3);
                    arrayList3.add(a51.E(5, i0.L(14.33f)));
                } else {
                    int i15 = e0Var.l;
                    if (i15 > 0) {
                        int i16 = e0Var.p;
                        String L02 = i15 == i16 ? cd.L0(2131751895, null) : cd.G(i15, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i16 > 0 ? Integer.toString(i16) : null;
                        int i17 = zh.i.b;
                        a51 K = a51.K(zh.i.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.l = L02;
                        K.n = num;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.q = true;
                        arrayList3.add(K);
                        arrayList3.add(a51.E(5, i0.L(14.33f)));
                    }
                }
                ji.f x10 = vp.r1(a0Var.a).x(a0Var.l1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.c;
                ArrayList arrayList7 = (ArrayList) x10.b;
                if (arrayList7.isEmpty()) {
                    z10 = false;
                } else {
                    arrayList3.add(a51.t(21, cd.L0(2131751878, null)));
                    int size = arrayList7.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj3 = arrayList7.get(i18);
                        i18++;
                        arrayList3.add(b0.i((zo) obj3, a0Var));
                    }
                    z10 = true;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(a51.E(22, i0.L(12.0f)));
                    }
                    arrayList3.add(a51.t(23, cd.L0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj4 = arrayList6.get(i19);
                        i19++;
                        arrayList3.add(b0.i((zo) obj4, a0Var));
                    }
                    z10 = true;
                }
                if (arrayList5.isEmpty()) {
                    z11 = z10;
                } else {
                    if (z10) {
                        arrayList3.add(a51.E(24, i0.L(12.0f)));
                    }
                    arrayList3.add(a51.t(25, cd.L0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj5 = arrayList5.get(i20);
                        i20++;
                        arrayList3.add(b0.i((zo) obj5, a0Var));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(a51.E(26, i0.L(12.0f)));
                    }
                    arrayList3.add(a51.t(27, cd.L0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i12 < size4) {
                        Object obj6 = arrayList4.get(i12);
                        i12++;
                        arrayList3.add(b0.i((zo) obj6, a0Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                e0 e0Var2 = a0Var.D1;
                arrayList8.add(a51.E(99, (int) (i0.q.y * 0.35f)));
                arrayList8.add(a51.E(0, i0.L(48.0f)));
                if (w3.w(2, a0Var.m1)) {
                    arrayList8.add(a51.B(1, i0.G2(i0.T2(cd.L0(2131751894, null), new t(a0Var, i11)), true)));
                } else {
                    arrayList8.add(a51.B(1, cd.L0(2131751893, null)));
                }
                arrayList8.add(a51.j(2, a0Var.C1));
                arrayList8.add(a51.t(3, cd.G(e0Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                e0Var2.c(arrayList8);
                break;
        }
    }
}
