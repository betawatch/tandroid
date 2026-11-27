// default package

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zj3 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // pcc
    public final void a(Object obj) {
        vnb vnbVar;
        vnb vnbVar2;
        byte b = this.a;
        byte b2 = 6;
        int i = 0;
        byte b3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((gk3) obj2).M((TLRPC.User) obj);
                break;
            case 1:
                uc7.s1(((nk3) obj2).Q).G3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                gx9 gx9Var = (gx9) ((tl3) obj2);
                bj3 bj3Var = gx9Var.L0;
                if (user != null) {
                    uj3 uj3Var = bj3Var.M0;
                    if (uj3Var != null) {
                        uj3Var.g3();
                    }
                    uc7.s1(bj3Var.K0).G3(null, user, null, 0, null, false, false);
                    gx9Var.Q(user.id, user);
                    break;
                }
                break;
            case 3:
                bn3 bn3Var = (bn3) obj2;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (bn3Var.r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(bn3Var.B())) {
                            if (bn3Var.J == null) {
                                bn3Var.J = bn3Var.B();
                            }
                            bn3Var.G(false);
                            bn3Var.y(charSequence2);
                            bn3Var.w.setRevert(true);
                            break;
                        }
                    }
                } else {
                    bn3Var.getClass();
                    break;
                }
                break;
            case 4:
                cq3 cq3Var = (cq3) obj2;
                oec oecVar = (oec) obj;
                r47 r47Var = cq3Var.c;
                if (r47Var != null) {
                    r47Var.r0 = oecVar;
                    MediaController.z().j0(cq3Var.c, false, true, false);
                    break;
                }
                break;
            case 5:
                ((Runnable) obj2).run();
                break;
            case 6:
                lw3 lw3Var = (lw3) obj2;
                if (lw3Var != null) {
                    lw3Var.run();
                    break;
                }
                break;
            case 7:
                h34 h34Var = (h34) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (h34Var.e ? 2 : h34Var.d ? 0 : 1)) {
                    h34Var.d = intValue == 0;
                    h34Var.e = intValue == 2;
                    qo0 qo0Var = h34Var.h;
                    if (qo0Var != null) {
                        qo0Var.a(Boolean.valueOf(h34Var.c), Boolean.valueOf(h34Var.d), Boolean.valueOf(h34Var.e));
                    }
                    if (h34Var.d && h34Var.getParentLayout() != null) {
                        for (e eVar : h34Var.getParentLayout().getFragmentStack()) {
                            if (eVar instanceof uj3) {
                                li3 li3Var = ((uj3) eVar).H3;
                                if (li3Var.c()) {
                                    li3Var.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 8:
                ((ih4) obj2).e.f0(true);
                break;
            case 9:
                rk4 rk4Var = (rk4) obj2;
                rk4Var.h(-1.0f);
                hl.d3(new se4(rk4Var, (Runnable) obj, b2), 80L);
                break;
            case 10:
                ((wt4) obj2).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + hl.L(80.0f)).setDuration(250L).setInterpolator(hb.w).start();
                break;
            case 11:
                ((rv4) obj2).F((TLObject) obj);
                break;
            case 12:
                ((xx4) obj2).a();
                break;
            case 13:
                ((sa) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 14:
                String str = (String) obj;
                a55.m("approve session", str);
                ((o45) obj2).a(str);
                break;
            case 15:
                r55 r55Var = (r55) obj2;
                r55Var.w = r55Var.d[((Integer) obj).intValue()];
                r55Var.Y(true);
                break;
            case 16:
                ((y85) obj2).c();
                break;
            case 17:
                ((fg5) obj2).c(true);
                break;
            case 18:
                ng5 ng5Var = (ng5) obj2;
                ng5Var.f = (ArrayList) obj;
                wa waVar = ng5Var.a;
                if (waVar.H) {
                    waVar.g3.O(true);
                    break;
                }
                break;
            case 19:
                bq5 bq5Var = (bq5) obj2;
                uca ucaVar = (uca) obj;
                pa9 pa9Var = bq5Var.a;
                if (ucaVar != null) {
                    float currentWeight = pa9Var.getCurrentWeight();
                    ucaVar.f = currentWeight;
                    double d = bq5Var.p;
                    if (d > 0.0d) {
                        ucaVar.f = (float) ((d / bq5Var.q) * currentWeight);
                    }
                    if (ucaVar.a.n() == 4) {
                        ucaVar.k *= ucaVar.f;
                    }
                }
                nx7 painting = pa9Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new jx7(painting, ucaVar, b3));
                    break;
                }
                break;
            case 20:
                String str2 = LaunchActivity.C1;
                ((w06) obj2).run();
                break;
            case 21:
                ((l46) obj2).q1((HashMap) obj);
                break;
            case 22:
                e66 e66Var = (e66) obj2;
                Long l = (Long) obj;
                int i2 = e66Var.b;
                e66Var.c();
                TLRPC.User X1 = (l == null || l.longValue() <= 0) ? null : uc7.s1(i2).X1(l);
                if (X1 == null || !X1.bot) {
                    xnb.x(null, 2131747865, e66.d(), null);
                    break;
                } else {
                    kq0.a(LaunchActivity.S(), i2, X1);
                    break;
                }
                break;
            case 23:
                ((q86) obj2).c0();
                break;
            case 24:
                zg6 zg6Var = (zg6) obj2;
                String str3 = (String) obj;
                cc4.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    zg6Var.b.setLoading(false);
                    break;
                }
                break;
            case 25:
                ph6 ph6Var = (ph6) obj2;
                List list = (List) obj;
                if (ph6Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        vdc vdcVar = (vdc) list.get(0);
                        Context context = ph6Var.getContext();
                        mh0 a = dj4.a(context, vdcVar);
                        qh6 qh6Var = ph6Var.h0;
                        vnbVar = ((e) qh6Var).resourceProvider;
                        hjb hjbVar = new hjb(context, vnbVar);
                        if (a.b != null) {
                            hjbVar.f(ob6.M0(2131750488, null), a.b, null, null);
                        }
                        if (a.a >= 0) {
                            hjbVar.f(ob6.M0(2131750485, null), ob6.a0(null, null, 2131750484, Integer.valueOf(a.a + 1)), null, null);
                        }
                        if (a.c != null) {
                            hjbVar.f(ob6.M0(2131750486, null), a.c.startsWith("+") ? f78.f().e(a.c) : a.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(hjbVar, tre.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        boolean[] zArr = new boolean[1];
                        vnbVar2 = ((e) qh6Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, context);
                        String M0 = ob6.M0(2131750482, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131750483, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.j(ob6.M0(2131750487, null), new u34(ph6Var, zArr, (byte) 27));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        idVar.setOnDismissListener(new cf(ph6Var, idVar, zArr, b2));
                        ph6Var.d0 = idVar;
                        idVar.show();
                        break;
                    } else {
                        ph6Var.t(false);
                        break;
                    }
                }
                break;
            case 26:
                vw7 vw7Var = (vw7) obj2;
                TextureView textureView = (TextureView) obj;
                vw7Var.y0 = textureView;
                if (textureView != null) {
                    vw7Var.s0.addView(textureView, 0);
                    break;
                }
                break;
            case 27:
                s57 s57Var = (s57) obj2;
                Integer num = (Integer) obj;
                ArrayList arrayList = s57Var.e.a;
                x47 x47Var = s57Var.f;
                if (((p57) arrayList.get(x47Var.getCurrentPosition())).a != num.intValue()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (((p57) arrayList.get(i3)).a == num.intValue()) {
                                i = i3;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (x47Var.getCurrentPosition() != i) {
                        x47Var.F(i);
                        break;
                    }
                }
                break;
            case 28:
                m57 m57Var = (m57) obj2;
                m57Var.n.y(m57Var.f.U((View) obj));
                break;
            default:
                q67 q67Var = (q67) obj2;
                Integer num2 = (Integer) obj;
                q67Var.getClass();
                boolean z = num2.intValue() - q67Var.d.d > hl.L(20.0f);
                q67Var.b0 = z;
                float f = q67Var.c0;
                if (z) {
                    f = Math.min(f, (q67Var.F.getHeight() - num2.intValue()) - q67Var.d0.getMeasuredHeight());
                }
                q67Var.d0.animate().translationY(f - q67Var.d0.getTop()).setDuration(250L).setInterpolator(hb.w).start();
                break;
        }
    }
}
