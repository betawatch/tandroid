package yh;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.io;
import org.telegram.messenger.m5;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.z60;
import org.telegram.ui.pb1;
import org.telegram.ui.un;
import r0.g1;
import r0.j1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements o20, r0.m, p20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ s(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        g1 g1Var = j1Var.a;
        i0.c f7 = g1Var.f(527);
        a0 a0Var = this.b;
        a0Var.K1 = f7;
        a0Var.L1 = g1Var.f(519);
        a0Var.w1.j(i0.L(56.0f) + a0Var.K1.b, a0Var.K1.d, false);
        a0Var.y1.invalidate();
        return j1.b;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        int i10 = a0.M1;
        Object obj = a51Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        a0 a0Var = this.b;
        boolean z14 = true;
        if (!z13) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j11 = user.id;
                boolean t10 = h20.t(user);
                TLRPC.Chat chat = a0Var.m1;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || w3.y(27, chat));
                j10 = j11;
                z11 = t10;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j12 = -chat2.id;
        boolean V = w3.V(chat2);
        TLRPC.Chat chat3 = a0Var.m1;
        z10 = chat3 != null && (chat2.creator || w3.y(27, chat3));
        j10 = j12;
        z12 = V;
        z11 = false;
        if (z10) {
            z60 F = z60.F(a0Var.c, null, view);
            F.c(R.drawable.msg_cancel, cd.L0(2131751915, null), new io(a0Var, z11, z12, j10, 3), true);
            F.W(a0Var.r1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j10;
        TLRPC.Chat chat;
        int i10 = this.a;
        a0 a0Var = this.b;
        switch (i10) {
            case 0:
                a0Var.L0((a51) obj);
                break;
            case 1:
            default:
                int i11 = a0.M1;
                a0Var.I0((a51) obj);
                break;
            case 2:
                int i12 = a0.M1;
                a0Var.L0((a51) obj);
                break;
            case 3:
                a51 a51Var = (a51) obj;
                View view = (View) obj2;
                k2 k2Var = a0Var.q1;
                if (!a0Var.I0(a51Var)) {
                    int i13 = a51Var.d;
                    boolean z10 = false;
                    if (i13 != 101) {
                        if (i13 != 100) {
                            Object obj3 = a51Var.G;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z10 = w3.V(chat2);
                                j10 = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b10 = f0.b(a0Var.a, j10);
                            if (b10 != 1 && b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 == 4) {
                                        m5.n(null, z10 ? 2131751930 : 2131751927, new cc((FrameLayout) a0Var.b, a0Var.I0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    u70 u70Var = new u70(a0Var.getContext(), chat, null, a0Var.q1, a0Var.I0);
                                    u70Var.p1 = new cc((FrameLayout) a0Var.b, a0Var.I0);
                                    u70Var.show();
                                    break;
                                }
                            } else {
                                if (k2Var instanceof un) {
                                    un unVar = (un) k2Var;
                                    TLRPC.Chat chat3 = unVar.e;
                                    TLRPC.User j11 = unVar.j();
                                    if ((chat3 != null && chat3.id == (-j10)) || (j11 != null && j11.id == j10)) {
                                        a0Var.dismiss();
                                        break;
                                    }
                                }
                                Bundle bundle = new Bundle();
                                if (j10 > 0) {
                                    bundle.putLong("user_id", j10);
                                } else {
                                    bundle.putLong("chat_id", -j10);
                                }
                                if (!w3.c0(chat)) {
                                    k2Var.presentFragment(new un(bundle));
                                } else if (w3.a(chat)) {
                                    un unVar2 = new un(bundle);
                                    gg.e.a(unVar2, gs.a(j10, vp.r1(a0Var.a).f7.getLong(a1.g.l(chat.id, "forumlasttopic"), 1L)));
                                    k2Var.presentFragment(unVar2);
                                } else {
                                    k2Var.presentFragment(new pb1(bundle));
                                }
                                a0Var.dismiss();
                                break;
                            }
                        } else {
                            a0Var.k1.E(1);
                            a0Var.D1.e();
                            break;
                        }
                    } else {
                        a0Var.n1 = !a0Var.n1;
                        vp.r1(a0Var.a).b5(a0Var.l1, a0Var.n1);
                        if (!(view instanceof s8)) {
                            a0Var.r1.d.f3.O(false);
                            break;
                        } else {
                            ((s8) view).getCheckBox().c(a0Var.n1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
