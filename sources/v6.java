// default package

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v6(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j67 j67Var;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                if (r7Var.y() && z) {
                    if (!r7Var.U) {
                        r7Var.U = true;
                        r7Var.r();
                    }
                }
                r6 r6Var = r7Var.c;
                if (r6Var != null) {
                    r6Var.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    m7 m7Var = r7Var.Q;
                    if (m7Var != null) {
                        m7Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.z7;
                mw1 mw1Var = chatActivityEnterView.e6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean w1 = chatActivityEnterView.w1();
                if (!z && (j67Var = chatActivityEnterView.M0) != null) {
                    j67Var.f(!w1);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.d6 = !w1;
                    gm.r(mw1Var);
                    gm.d3(mw1Var, 500L);
                    break;
                }
                break;
            case 2:
                i22 i22Var = (i22) obj;
                d dVar = i22Var.Z1;
                if (i22Var.N2 != 0) {
                    i22Var.W3.I();
                    i22Var.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    d88 d88Var = new d88(hashMap, arrayList, 0, true, (yv1) dVar);
                    x12 x12Var = new x12(i22Var, hashMap, arrayList);
                    w78 w78Var = d88Var.a;
                    w78Var.t0 = x12Var;
                    w78 w78Var2 = d88Var.b;
                    w78Var2.t0 = x12Var;
                    w78Var.u0 = new fk3(d88Var);
                    w78Var2.u0 = new k44(d88Var, (byte) 25);
                    int i2 = i22Var.P3;
                    boolean z2 = i22Var.Q3;
                    w78Var.k0(i2, z2);
                    w78Var2.k0(i2, z2);
                    if (z) {
                        dVar.showAsSheet(d88Var);
                    } else {
                        dVar.presentFragment(d88Var);
                    }
                    i22Var.dismiss();
                    break;
                }
            case 3:
                qmb qmbVar = (qmb) obj;
                for (int i3 = 0; i3 < 2; i3++) {
                    kb2 kb2Var = ((kb2[]) qmbVar.b)[i3];
                    ((jb2) kb2Var.d).a(kb2Var == view, true);
                }
                gda.l1 = z;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("useThreeLinesLayout", gda.l1);
                edit.apply();
                nm7.e().k(3, Boolean.TRUE);
                break;
            case 4:
                s56 s56Var = (s56) obj;
                if (!z) {
                    bjb bjbVar = s56Var.n;
                    if (bjbVar == null || !bjbVar.e.h) {
                        bjb bjbVar2 = (bjb) view;
                        boolean z3 = bjbVar2.e.h;
                        bjbVar2.setChecked(!z3);
                        s56Var.e0(z3);
                        bjb bjbVar3 = s56Var.n;
                        if (bjbVar3 != null) {
                            if (bjbVar2.e.h) {
                                bjbVar3.setChecked(false);
                                s56Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                s56Var.r.setVisibility(8);
                                break;
                            } else if (s56Var.e == null) {
                                bjbVar3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i4 = -s56Var.N;
                        s56Var.N = i4;
                        gm.A3(i4, bjbVar, null);
                        break;
                    }
                }
                break;
            case 5:
                a58 a58Var = (a58) obj;
                boolean z4 = !z;
                oc7 r1 = oc7.r1(a58Var.s2);
                if (r1.Q3 != z4) {
                    SharedPreferences.Editor edit2 = r1.X3.edit();
                    r1.Q3 = z4;
                    edit2.putBoolean("storyQualityFull", z4).apply();
                    r1.getNotificationCenter().k(nm7.o3, new Object[0]);
                }
                new c41(a58Var.S0, a58Var.r0).I(R.raw.chats_infotip, jb6.M0(!z ? 2131744193 : 2131744196, null), jb6.M0(!z ? 2131744194 : 2131744197, null)).j();
                v48 v48Var = a58Var.j1;
                if (v48Var != null) {
                    v48Var.a();
                    break;
                }
                break;
            default:
                v48 v48Var2 = (v48) obj;
                s96 s96Var = s96.N;
                if (s96Var != null) {
                    s96Var.D(!z);
                }
                v48 v48Var3 = v48Var2.x.j1;
                if (v48Var3 != null) {
                    v48Var3.a();
                    break;
                }
                break;
        }
    }
}
