// default package

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        j47 j47Var;
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
                int i = ChatActivityEnterView.r7;
                uv1 uv1Var = chatActivityEnterView.e6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean u1 = chatActivityEnterView.u1();
                if (!z && (j47Var = chatActivityEnterView.M0) != null) {
                    j47Var.f(!u1);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.d6 = !u1;
                    gl.r(uv1Var);
                    gl.e3(uv1Var, 500L);
                    break;
                }
                break;
            case 2:
                x02 x02Var = (x02) obj;
                d dVar = x02Var.Z1;
                if (x02Var.N2 != 0) {
                    x02Var.W3.y0();
                    x02Var.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    b68 b68Var = new b68(hashMap, arrayList, 0, true, (mu1) dVar);
                    m02 m02Var = new m02(x02Var, hashMap, arrayList);
                    u58 u58Var = b68Var.a;
                    u58Var.t0 = m02Var;
                    u58 u58Var2 = b68Var.b;
                    u58Var2.t0 = m02Var;
                    u58Var.u0 = new s34((Object) b68Var, (byte) 23);
                    u58Var2.u0 = new pj4((Object) b68Var, (byte) 24);
                    int i2 = x02Var.P3;
                    boolean z2 = x02Var.Q3;
                    u58Var.j0(i2, z2);
                    u58Var2.j0(i2, z2);
                    if (z) {
                        dVar.showAsSheet(b68Var);
                    } else {
                        dVar.presentFragment(b68Var);
                    }
                    x02Var.dismiss();
                    break;
                }
            case 3:
                pkb pkbVar = (pkb) obj;
                for (int i3 = 0; i3 < 2; i3++) {
                    z92 z92Var = ((z92[]) pkbVar.b)[i3];
                    ((y92) z92Var.d).a(z92Var == view, true);
                }
                gba.m1 = z;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("useThreeLinesLayout", gba.m1);
                edit.apply();
                kk7.e().k(3, Boolean.TRUE);
                break;
            case 4:
                s36 s36Var = (s36) obj;
                if (!z) {
                    ahb ahbVar = s36Var.n;
                    if (ahbVar == null || !ahbVar.e.h) {
                        ahb ahbVar2 = (ahb) view;
                        boolean z3 = ahbVar2.e.h;
                        ahbVar2.setChecked(!z3);
                        s36Var.d0(z3);
                        ahb ahbVar3 = s36Var.n;
                        if (ahbVar3 != null) {
                            if (ahbVar2.e.h) {
                                ahbVar3.setChecked(false);
                                s36Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                s36Var.r.setVisibility(8);
                                break;
                            } else if (s36Var.e == null) {
                                ahbVar3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i4 = -s36Var.N;
                        s36Var.N = i4;
                        gl.B3(i4, ahbVar, null);
                        break;
                    }
                }
                break;
            case 5:
                y28 y28Var = (y28) obj;
                boolean z4 = !z;
                na7 q1 = na7.q1(y28Var.s2);
                if (q1.Q3 != z4) {
                    SharedPreferences.Editor edit2 = q1.X3.edit();
                    q1.Q3 = z4;
                    edit2.putBoolean("storyQualityFull", z4).apply();
                    q1.getNotificationCenter().k(kk7.n3, new Object[0]);
                }
                new u21(y28Var.S0, y28Var.r0).I(R.raw.chats_infotip, k96.M0(!z ? 2131744267 : 2131744270, null), k96.M0(!z ? 2131744268 : 2131744271, null)).j();
                s28 s28Var = y28Var.j1;
                if (s28Var != null) {
                    s28Var.a();
                    break;
                }
                break;
            default:
                s28 s28Var2 = (s28) obj;
                t76 t76Var = t76.N;
                if (t76Var != null) {
                    t76Var.D(!z);
                }
                s28 s28Var3 = s28Var2.x.j1;
                if (s28Var3 != null) {
                    s28Var3.a();
                    break;
                }
                break;
        }
    }
}
