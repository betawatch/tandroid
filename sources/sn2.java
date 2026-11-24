// default package

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn2 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eo2 b;

    public /* synthetic */ sn2(eo2 eo2Var, byte b) {
        this.a = b;
        this.b = eo2Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        boolean z2 = true;
        byte b2 = 2;
        int i = 0;
        eo2 eo2Var = this.b;
        switch (b) {
            case 0:
                eo2Var.E0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ug8.u((FrameLayout) eo2Var.b, eo2Var.J0, tL_error, false);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                eo2Var.r1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList != null) {
                        eo2Var.K1 = arrayList;
                        if (!arrayList.isEmpty()) {
                            eo2Var.w1.d.g3.O(false);
                            eo2Var.n1.E(2);
                            break;
                        } else {
                            ir2.v(null, 2131751893, new u21((FrameLayout) eo2Var.b, eo2Var.J0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    ug8.u((FrameLayout) eo2Var.b, eo2Var.J0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i2 = eo2.P1;
                eo2Var.E0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj;
                int i3 = eo2.P1;
                arrayList2.add(c4c.E(99, Math.min(gl.L(176.0f) + gl.m, (int) (gl.q.y * 0.25f))));
                arrayList2.add(c4c.E(0, gl.L(56.0f)));
                String M0 = k96.M0(2131751837, null);
                c4c c4cVar = new c4c(39);
                c4cVar.d = 101;
                c4cVar.m = M0;
                c4cVar.A = 0;
                c4cVar.L(eo2Var.q1);
                arrayList2.add(c4cVar);
                arrayList2.add(c4c.B(2, k96.M0(2131751836, null)));
                mo2 mo2Var = eo2Var.G1;
                if (mo2Var.n && mo2Var.l == 1 && mo2Var.j.size() == 1) {
                    arrayList2.add(c4c.t(3, k96.M0(2131751892, null)));
                    mo2Var.c(arrayList2);
                    arrayList2.add(c4c.E(5, gl.L(14.33f)));
                } else {
                    int i4 = mo2Var.l;
                    if (i4 > 0) {
                        int i5 = mo2Var.p;
                        String M02 = i4 == i5 ? k96.M0(2131751883, null) : k96.G(i4, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i5 > 0 ? Integer.toString(i5) : null;
                        int i6 = qn2.b;
                        c4c K = c4c.K(qn2.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.m = M02;
                        K.o = num;
                        K.C = -66560164762966547L;
                        K.r = true;
                        arrayList2.add(K);
                        arrayList2.add(c4c.E(5, gl.L(14.33f)));
                    }
                }
                c5a u = na7.q1(eo2Var.a).u(eo2Var.o1);
                ArrayList arrayList3 = (ArrayList) u.e;
                ArrayList arrayList4 = (ArrayList) u.d;
                ArrayList arrayList5 = (ArrayList) u.c;
                ArrayList arrayList6 = (ArrayList) u.b;
                if (arrayList6.isEmpty()) {
                    z = false;
                } else {
                    arrayList2.add(c4c.t(21, k96.M0(2131751866, null)));
                    int size = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList6.get(i7);
                        i7++;
                        arrayList2.add(io2.i((s97) obj3, eo2Var));
                    }
                    z = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z) {
                        arrayList2.add(c4c.E(22, gl.L(12.0f)));
                    }
                    arrayList2.add(c4c.t(23, k96.M0(2131751863, null)));
                    int size2 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj4 = arrayList5.get(i8);
                        i8++;
                        arrayList2.add(io2.i((s97) obj4, eo2Var));
                    }
                    z = true;
                }
                if (arrayList4.isEmpty()) {
                    z2 = z;
                } else {
                    if (z) {
                        arrayList2.add(c4c.E(24, gl.L(12.0f)));
                    }
                    arrayList2.add(c4c.t(25, k96.M0(2131751864, null)));
                    int size3 = arrayList4.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj5 = arrayList4.get(i9);
                        i9++;
                        arrayList2.add(io2.i((s97) obj5, eo2Var));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    if (z2) {
                        arrayList2.add(c4c.E(26, gl.L(12.0f)));
                    }
                    arrayList2.add(c4c.t(27, k96.M0(2131751861, null)));
                    int size4 = arrayList3.size();
                    while (i < size4) {
                        Object obj6 = arrayList3.get(i);
                        i++;
                        arrayList2.add(io2.i((s97) obj6, eo2Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList7 = (ArrayList) obj;
                int i10 = eo2.P1;
                mo2 mo2Var2 = eo2Var.G1;
                arrayList7.add(c4c.E(99, (int) (gl.q.y * 0.35f)));
                arrayList7.add(c4c.E(0, gl.L(48.0f)));
                if (hc2.w(2, eo2Var.p1)) {
                    arrayList7.add(c4c.B(1, gl.E2(gl.O2(k96.M0(2131751882, null), -1, 0, new un2(eo2Var, b2), null), true)));
                } else {
                    arrayList7.add(c4c.B(1, k96.M0(2131751881, null)));
                }
                arrayList7.add(c4c.j(2, eo2Var.F1));
                arrayList7.add(c4c.t(3, k96.G(mo2Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                mo2Var2.c(arrayList7);
                break;
        }
    }
}
