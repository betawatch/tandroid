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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sk3 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // qac
    public final void a(Object obj) {
        ylb ylbVar;
        ylb ylbVar2;
        byte b = this.a;
        int i = 0;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((zk3) obj2).M((TLRPC.User) obj);
                break;
            case 1:
                oc7.r1(((gl3) obj2).Q).B3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                ov9 ov9Var = (ov9) ((mm3) obj2);
                sj3 sj3Var = ov9Var.L0;
                if (user != null) {
                    nk3 nk3Var = sj3Var.M0;
                    if (nk3Var != null) {
                        nk3Var.g3();
                    }
                    oc7.r1(sj3Var.K0).B3(null, user, null, 0, null, false, false);
                    ov9Var.Q(user.id, user);
                    break;
                }
                break;
            case 3:
                un3 un3Var = (un3) obj2;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (un3Var.r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(un3Var.z())) {
                            if (un3Var.J == null) {
                                un3Var.J = un3Var.z();
                            }
                            un3Var.D(false);
                            un3Var.w(charSequence2);
                            un3Var.w.setRevert(true);
                            break;
                        }
                    }
                } else {
                    un3Var.getClass();
                    break;
                }
                break;
            case 4:
                vq3 vq3Var = (vq3) obj2;
                rcc rccVar = (rcc) obj;
                k47 k47Var = vq3Var.c;
                if (k47Var != null) {
                    k47Var.r0 = rccVar;
                    MediaController.w().g0(vq3Var.c, false, true, false);
                    break;
                }
                break;
            case 5:
                ((Runnable) obj2).run();
                break;
            case 6:
                a14 a14Var = (a14) obj2;
                if (a14Var != null) {
                    a14Var.run();
                    break;
                }
                break;
            case 7:
                x34 x34Var = (x34) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (x34Var.e ? 2 : x34Var.d ? 0 : 1)) {
                    x34Var.d = intValue == 0;
                    x34Var.e = intValue == 2;
                    qp0 qp0Var = x34Var.h;
                    if (qp0Var != null) {
                        qp0Var.a(Boolean.valueOf(x34Var.c), Boolean.valueOf(x34Var.d), Boolean.valueOf(x34Var.e));
                    }
                    if (x34Var.d && x34Var.getParentLayout() != null) {
                        for (d dVar : x34Var.getParentLayout().getFragmentStack()) {
                            if (dVar instanceof nk3) {
                                dj3 dj3Var = ((nk3) dVar).H3;
                                if (dj3Var.c()) {
                                    dj3Var.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 8:
                ((lh4) obj2).e.g0(true);
                break;
            case 9:
                rk4 rk4Var = (rk4) obj2;
                rk4Var.h(-1.0f);
                gm.d3(new ve4(rk4Var, (Runnable) obj, (byte) 10), 80L);
                break;
            case 10:
                ((tt4) obj2).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + gm.L(80.0f)).setDuration(250L).setInterpolator(gb.w).start();
                break;
            case 11:
                ((pv4) obj2).F((TLObject) obj);
                break;
            case 12:
                ((tx4) obj2).a();
                break;
            case 13:
                ((ra) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 14:
                String str = (String) obj;
                w45.m("approve session", str);
                ((f45) obj2).a(str);
                break;
            case 15:
                n55 n55Var = (n55) obj2;
                n55Var.w = n55Var.d[((Integer) obj).intValue()];
                n55Var.Z(true);
                break;
            case 16:
                ((u85) obj2).c();
                break;
            case 17:
                ((cg5) obj2).c(true);
                break;
            case 18:
                lg5 lg5Var = (lg5) obj2;
                lg5Var.f = (ArrayList) obj;
                va vaVar = lg5Var.a;
                if (vaVar.H) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
            case 19:
                yp5 yp5Var = (yp5) obj2;
                dba dbaVar = (dba) obj;
                e99 e99Var = yp5Var.a;
                if (dbaVar != null) {
                    float currentWeight = e99Var.getCurrentWeight();
                    dbaVar.f = currentWeight;
                    double d = yp5Var.p;
                    if (d > 0.0d) {
                        dbaVar.f = (float) ((d / yp5Var.q) * currentWeight);
                    }
                    if (dbaVar.a.n() == 4) {
                        dbaVar.k *= dbaVar.f;
                    }
                }
                hw7 painting = e99Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new dw7(painting, dbaVar, b2));
                    break;
                }
                break;
            case 20:
                String str2 = LaunchActivity.C1;
                ((w06) obj2).run();
                break;
            case 21:
                ((i46) obj2).p1((HashMap) obj);
                break;
            case 22:
                a66 a66Var = (a66) obj2;
                Long l = (Long) obj;
                int i2 = a66Var.b;
                a66Var.c();
                TLRPC.User W1 = (l == null || l.longValue() <= 0) ? null : oc7.r1(i2).W1(l);
                if (W1 == null || !W1.bot) {
                    mlb.y(null, 2131747868, a66.d(), null);
                    break;
                } else {
                    kr0.a(LaunchActivity.S(), i2, W1);
                    break;
                }
                break;
            case 23:
                ((m86) obj2).d0();
                break;
            case 24:
                wg6 wg6Var = (wg6) obj2;
                String str3 = (String) obj;
                fc4.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    wg6Var.b.setLoading(false);
                    break;
                }
                break;
            case 25:
                lh6 lh6Var = (lh6) obj2;
                List list = (List) obj;
                if (lh6Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        wbc wbcVar = (wbc) list.get(0);
                        Context context = lh6Var.getContext();
                        li0 a = ej4.a(context, wbcVar);
                        mh6 mh6Var = lh6Var.h0;
                        ylbVar = ((d) mh6Var).resourceProvider;
                        mhb mhbVar = new mhb(context, ylbVar);
                        if (a.b != null) {
                            mhbVar.f(jb6.M0(2131750460, null), a.b, null, null);
                        }
                        if (a.a >= 0) {
                            mhbVar.f(jb6.M0(2131750457, null), jb6.a0(null, null, 2131750456, Integer.valueOf(a.a + 1)), null, null);
                        }
                        if (a.c != null) {
                            mhbVar.f(jb6.M0(2131750458, null), a.c.startsWith("+") ? r58.f().e(a.c) : a.c, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(mhbVar, qoe.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        boolean[] zArr = new boolean[1];
                        ylbVar2 = ((d) mh6Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, context);
                        String M0 = jb6.M0(2131750454, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131750455, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.j(jb6.M0(2131750459, null), new nv4(lh6Var, zArr, (byte) 23));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        heVar.setOnDismissListener(new ah(lh6Var, heVar, zArr, (byte) 5));
                        lh6Var.d0 = heVar;
                        heVar.show();
                        break;
                    } else {
                        lh6Var.t(false);
                        break;
                    }
                }
                break;
            case 26:
                pv7 pv7Var = (pv7) obj2;
                TextureView textureView = (TextureView) obj;
                pv7Var.y0 = textureView;
                if (textureView != null) {
                    pv7Var.s0.addView(textureView, 0);
                    break;
                }
                break;
            case 27:
                l57 l57Var = (l57) obj2;
                Integer num = (Integer) obj;
                ArrayList arrayList = l57Var.e.a;
                q47 q47Var = l57Var.f;
                if (((i57) arrayList.get(q47Var.getCurrentPosition())).a != num.intValue()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (((i57) arrayList.get(i3)).a == num.intValue()) {
                                i = i3;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (q47Var.getCurrentPosition() != i) {
                        q47Var.E(i);
                        break;
                    }
                }
                break;
            case 28:
                f57 f57Var = (f57) obj2;
                f57Var.n.y(f57Var.f.T((View) obj));
                break;
            default:
                j67 j67Var = (j67) obj2;
                Integer num2 = (Integer) obj;
                j67Var.getClass();
                boolean z = num2.intValue() - j67Var.d.d > gm.L(20.0f);
                j67Var.b0 = z;
                float f = j67Var.c0;
                if (z) {
                    f = Math.min(f, (j67Var.F.getHeight() - num2.intValue()) - j67Var.d0.getMeasuredHeight());
                }
                j67Var.d0.animate().translationY(f - j67Var.d0.getTop()).setDuration(250L).setInterpolator(gb.w).start();
                break;
        }
    }
}
