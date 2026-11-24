// default package

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn2 implements n8c, no7, o8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eo2 b;

    public /* synthetic */ tn2(eo2 eo2Var, byte b) {
        this.a = b;
        this.b = eo2Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        sxc sxcVar = vxcVar.a;
        io5 f = sxcVar.f(527);
        eo2 eo2Var = this.b;
        eo2Var.N1 = f;
        eo2Var.O1 = sxcVar.f(519);
        eo2Var.z1.j(gl.L(56.0f) + eo2Var.N1.b, eo2Var.N1.d, false);
        eo2Var.B1.invalidate();
        return vxc.b;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        int i = eo2.P1;
        Object obj = c4cVar.H;
        boolean z4 = obj instanceof TLRPC.Chat;
        eo2 eo2Var = this.b;
        boolean z5 = true;
        if (!z4) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j2 = user.id;
                boolean v = l7c.v(user);
                TLRPC.Chat chat = eo2Var.p1;
                z = chat != null && ((user.bot && user.bot_can_edit) || hc2.y(27, chat));
                j = j2;
                z2 = v;
                z3 = false;
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j3 = -chat2.id;
        boolean V = hc2.V(chat2);
        TLRPC.Chat chat3 = eo2Var.p1;
        z = chat3 != null && (chat2.creator || hc2.y(27, chat3));
        j = j3;
        z3 = V;
        z2 = false;
        if (z) {
            cs5 G = cs5.G(eo2Var.c, null, view);
            G.b(R.drawable.msg_cancel, k96.M0(2131751903, null), new mo1(eo2Var, z2, z3, j, (byte) 2), true);
            G.X(eo2Var.u1.d.V0(view, true));
            G.a0();
            return Boolean.valueOf(z5);
        }
        z5 = false;
        return Boolean.valueOf(z5);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j;
        TLRPC.Chat chat;
        byte b = this.a;
        eo2 eo2Var = this.b;
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        switch (b) {
            case 0:
                eo2Var.G0(c4cVar);
                break;
            case 1:
            default:
                int i = eo2.P1;
                eo2Var.D0(c4cVar);
                break;
            case 2:
                int i2 = eo2.P1;
                eo2Var.G0(c4cVar);
                break;
            case 3:
                int i3 = eo2.P1;
                d dVar = eo2Var.t1;
                if (!eo2Var.D0(c4cVar)) {
                    int i4 = c4cVar.d;
                    boolean z = false;
                    if (i4 != 101) {
                        if (i4 != 100) {
                            Object obj3 = c4cVar.H;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z = hc2.V(chat2);
                                j = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b2 = no2.b(eo2Var.a, j);
                            if (b2 != 1 && b2 != 2) {
                                if (b2 != 3) {
                                    if (b2 == 4) {
                                        ir2.v(null, z ? 2131751918 : 2131751915, new u21((FrameLayout) eo2Var.b, eo2Var.J0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    fu5 fu5Var = new fu5(eo2Var.getContext(), chat, null, eo2Var.t1, eo2Var.J0);
                                    fu5Var.s1 = new u21((FrameLayout) eo2Var.b, eo2Var.J0);
                                    fu5Var.show();
                                    break;
                                }
                            } else {
                                if (dVar instanceof mu1) {
                                    mu1 mu1Var = (mu1) dVar;
                                    TLRPC.Chat chat3 = mu1Var.e;
                                    TLRPC.User h = mu1Var.h();
                                    if ((chat3 != null && chat3.id == (-j)) || (h != null && h.id == j)) {
                                        eo2Var.dismiss();
                                        break;
                                    }
                                }
                                Bundle bundle = new Bundle();
                                if (j > 0) {
                                    bundle.putLong("user_id", j);
                                } else {
                                    bundle.putLong("chat_id", -j);
                                }
                                if (!hc2.c0(chat)) {
                                    dVar.presentFragment(new mu1(bundle));
                                } else if (hc2.a(chat)) {
                                    mu1 mu1Var2 = new mu1(bundle);
                                    mm4.a(mu1Var2, zc7.a(j, na7.q1(eo2Var.a).X3.getLong(ls6.n(chat.id, "forumlasttopic"), 1L)));
                                    dVar.presentFragment(mu1Var2);
                                } else {
                                    dVar.presentFragment(new qvb(bundle));
                                }
                                eo2Var.dismiss();
                                break;
                            }
                        } else {
                            eo2Var.n1.E(1);
                            eo2Var.G1.e();
                            break;
                        }
                    } else {
                        eo2Var.q1 = !eo2Var.q1;
                        na7.q1(eo2Var.a).k5(eo2Var.o1, eo2Var.q1);
                        if (!(view instanceof zgb)) {
                            eo2Var.u1.d.g3.O(false);
                            break;
                        } else {
                            ((zgb) view).getCheckBox().c(eo2Var.q1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
