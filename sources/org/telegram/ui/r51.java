package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements org.telegram.ui.Components.ik0, fe.e {
    public final /* synthetic */ u61 a;

    public /* synthetic */ r51(u61 u61Var) {
        this.a = u61Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        final u61 u61Var = this.a;
        org.telegram.ui.ActionBar.x1[] x1VarArr = u61Var.g0;
        z51 z51Var = u61Var.W;
        int i11 = z51Var.I;
        final int i12 = 0;
        final int i13 = 1;
        if (i10 < i11 || i10 > z51Var.J) {
            int i14 = z51Var.U;
            if (i10 >= i14 && i10 <= z51Var.V) {
                ((n61) u61Var.Q.get(i10 - i14)).c(u61Var.a, u61Var, x1VarArr, true);
                return true;
            }
            int i15 = z51Var.R;
            if (i10 >= i15 && i10 <= z51Var.S) {
                ((n61) u61Var.O.get(i10 - i15)).c(u61Var.a, u61Var, x1VarArr, true);
                return true;
            }
            int i16 = z51Var.X;
            if (i10 >= i16 && i10 <= z51Var.Y) {
                ((n61) u61Var.P.get(i10 - i16)).c(u61Var.a, u61Var, x1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.jj jjVar = ((r61) u61Var.y0.get(i10 - i11)).b;
            if (!jjVar.x4()) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(u61Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.cd.L0(2131743575, null), new Runnable() { // from class: org.telegram.ui.q51
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                u61 u61Var2 = u61Var;
                                u61Var2.getClass();
                                u61Var2.presentFragment(new sh0(jjVar));
                                break;
                            default:
                                u61 u61Var3 = u61Var;
                                u61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", u61Var3.b);
                                bundle.putInt("message_id", jjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                u61Var3.presentFragment(new un(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.cd.L0(2131743576, null), new Runnable() { // from class: org.telegram.ui.q51
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                u61 u61Var2 = u61Var;
                                u61Var2.getClass();
                                u61Var2.presentFragment(new sh0(jjVar));
                                break;
                            default:
                                u61 u61Var3 = u61Var;
                                u61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", u61Var3.b);
                                bundle.putInt("message_id", jjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                u61Var3.presentFragment(new un(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(u61Var.S.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.s0();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
