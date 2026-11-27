// default package

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w6(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q67 q67Var;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                s7 s7Var = (s7) obj;
                if (s7Var.y() && z) {
                    if (!s7Var.U) {
                        s7Var.U = true;
                        s7Var.r();
                    }
                }
                s6 s6Var = s7Var.c;
                if (s6Var != null) {
                    s6Var.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    n7 n7Var = s7Var.Q;
                    if (n7Var != null) {
                        n7Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.X7;
                mv1 mv1Var = chatActivityEnterView.p6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean E1 = chatActivityEnterView.E1();
                if (!z && (q67Var = chatActivityEnterView.M0) != null) {
                    q67Var.f(!E1);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.o6 = !E1;
                    hl.r(mv1Var);
                    hl.d3(mv1Var, 500L);
                    break;
                }
                break;
            case 2:
                n12 n12Var = (n12) obj;
                e eVar = n12Var.Z1;
                if (n12Var.N2 != 0) {
                    n12Var.W3.R();
                    n12Var.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    s98 s98Var = new s98(hashMap, arrayList, 0, true, (zu1) eVar);
                    c12 c12Var = new c12(n12Var, hashMap, arrayList);
                    l98 l98Var = s98Var.a;
                    l98Var.t0 = c12Var;
                    l98 l98Var2 = s98Var.b;
                    l98Var2.t0 = c12Var;
                    l98Var.u0 = new v34(s98Var, (byte) 23);
                    l98Var2.u0 = new kj4((Object) s98Var, (byte) 26);
                    int i2 = n12Var.P3;
                    boolean z2 = n12Var.Q3;
                    l98Var.j0(i2, z2);
                    l98Var2.j0(i2, z2);
                    if (z) {
                        eVar.showAsSheet(s98Var);
                    } else {
                        eVar.presentFragment(s98Var);
                    }
                    n12Var.dismiss();
                    break;
                }
            case 3:
                oob oobVar = (oob) obj;
                for (int i3 = 0; i3 < 2; i3++) {
                    pa2 pa2Var = ((pa2[]) oobVar.b)[i3];
                    ((oa2) pa2Var.d).a(pa2Var == view, true);
                }
                xea.l1 = z;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("useThreeLinesLayout", xea.l1);
                edit.apply();
                jn7.e().k(3, Boolean.TRUE);
                break;
            case 4:
                v56 v56Var = (v56) obj;
                if (!z) {
                    wkb wkbVar = v56Var.n;
                    if (wkbVar == null || !wkbVar.e.h) {
                        wkb wkbVar2 = (wkb) view;
                        boolean z3 = wkbVar2.e.h;
                        wkbVar2.setChecked(!z3);
                        v56Var.d0(z3);
                        wkb wkbVar3 = v56Var.n;
                        if (wkbVar3 != null) {
                            if (wkbVar2.e.h) {
                                wkbVar3.setChecked(false);
                                v56Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                v56Var.r.setVisibility(8);
                                break;
                            } else if (v56Var.e == null) {
                                wkbVar3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i4 = -v56Var.N;
                        v56Var.N = i4;
                        hl.A3(i4, wkbVar, null);
                        break;
                    }
                }
                break;
            case 5:
                o68 o68Var = (o68) obj;
                boolean z4 = !z;
                uc7 s1 = uc7.s1(o68Var.m2);
                if (s1.Q3 != z4) {
                    SharedPreferences.Editor edit2 = s1.X3.edit();
                    s1.Q3 = z4;
                    edit2.putBoolean("storyQualityFull", z4).apply();
                    s1.getNotificationCenter().k(jn7.o3, new Object[0]);
                }
                new d31(o68Var.M0, o68Var.l0).I(R.raw.chats_infotip, ob6.M0(!z ? 2131744161 : 2131744164, null), ob6.M0(!z ? 2131744162 : 2131744165, null)).j();
                j68 j68Var = o68Var.d1;
                if (j68Var != null) {
                    j68Var.a();
                    break;
                }
                break;
            default:
                j68 j68Var2 = (j68) obj;
                w96 w96Var = w96.N;
                if (w96Var != null) {
                    w96Var.D(!z);
                }
                j68 j68Var3 = j68Var2.x.d1;
                if (j68Var3 != null) {
                    j68Var3.a();
                    break;
                }
                break;
        }
    }
}
