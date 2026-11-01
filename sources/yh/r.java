package yh;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.jo;
import org.telegram.messenger.m5;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.z60;
import org.telegram.ui.nb1;
import org.telegram.ui.un;
import r0.g1;
import r0.j1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements p20, r0.m, q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ r(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        g1 g1Var = j1Var.a;
        i0.c f7 = g1Var.f(527);
        z zVar = this.b;
        zVar.K1 = f7;
        zVar.L1 = g1Var.f(519);
        zVar.w1.j(i0.L(56.0f) + zVar.K1.b, zVar.K1.d, false);
        zVar.y1.invalidate();
        return j1.b;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        int i10 = z.M1;
        Object obj = b51Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        z zVar = this.b;
        boolean z14 = true;
        if (!z13) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j11 = user.id;
                boolean t10 = i20.t(user);
                TLRPC.Chat chat = zVar.m1;
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
        TLRPC.Chat chat3 = zVar.m1;
        z10 = chat3 != null && (chat2.creator || w3.y(27, chat3));
        j10 = j12;
        z12 = V;
        z11 = false;
        if (z10) {
            z60 F = z60.F(zVar.c, null, view);
            F.c(R.drawable.msg_cancel, dd.L0(2131751915, null), new jo(zVar, z11, z12, j10, 3), true);
            F.W(zVar.r1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j10;
        TLRPC.Chat chat;
        int i10 = this.a;
        z zVar = this.b;
        switch (i10) {
            case 0:
                zVar.L0((b51) obj);
                break;
            case 1:
            default:
                int i11 = z.M1;
                zVar.I0((b51) obj);
                break;
            case 2:
                int i12 = z.M1;
                zVar.L0((b51) obj);
                break;
            case 3:
                b51 b51Var = (b51) obj;
                View view = (View) obj2;
                k2 k2Var = zVar.q1;
                if (!zVar.I0(b51Var)) {
                    int i13 = b51Var.d;
                    boolean z10 = false;
                    if (i13 != 101) {
                        if (i13 != 100) {
                            Object obj3 = b51Var.G;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z10 = w3.V(chat2);
                                j10 = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b10 = e0.b(zVar.a, j10);
                            if (b10 != 1 && b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 == 4) {
                                        m5.n(null, z10 ? 2131751930 : 2131751927, new cc((FrameLayout) zVar.b, zVar.I0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    u70 u70Var = new u70(zVar.getContext(), chat, null, zVar.q1, zVar.I0);
                                    u70Var.p1 = new cc((FrameLayout) zVar.b, zVar.I0);
                                    u70Var.show();
                                    break;
                                }
                            } else {
                                if (k2Var instanceof un) {
                                    un unVar = (un) k2Var;
                                    TLRPC.Chat chat3 = unVar.e;
                                    TLRPC.User j11 = unVar.j();
                                    if ((chat3 != null && chat3.id == (-j10)) || (j11 != null && j11.id == j10)) {
                                        zVar.dismiss();
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
                                    gg.e.a(unVar2, hs.a(j10, wp.r1(zVar.a).f7.getLong(a1.g.l(chat.id, "forumlasttopic"), 1L)));
                                    k2Var.presentFragment(unVar2);
                                } else {
                                    k2Var.presentFragment(new nb1(bundle));
                                }
                                zVar.dismiss();
                                break;
                            }
                        } else {
                            zVar.k1.E(1);
                            zVar.D1.e();
                            break;
                        }
                    } else {
                        zVar.n1 = !zVar.n1;
                        wp.r1(zVar.a).b5(zVar.l1, zVar.n1);
                        if (!(view instanceof s8)) {
                            zVar.r1.d.f3.O(false);
                            break;
                        } else {
                            ((s8) view).getCheckBox().c(zVar.n1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
