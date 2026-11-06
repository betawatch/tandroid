package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements org.telegram.ui.Components.dj0, te.b {
    public final /* synthetic */ c51 a;

    public /* synthetic */ y31(c51 c51Var) {
        this.a = c51Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        final c51 c51Var = this.a;
        org.telegram.ui.ActionBar.u1[] u1VarArr = c51Var.g0;
        g41 g41Var = c51Var.W;
        int i10 = g41Var.I;
        final int i11 = 0;
        final int i12 = 1;
        if (i7 < i10 || i7 > g41Var.J) {
            int i13 = g41Var.U;
            if (i7 >= i13 && i7 <= g41Var.V) {
                ((v41) c51Var.Q.get(i7 - i13)).c(c51Var.a, c51Var, u1VarArr, true);
                return true;
            }
            int i14 = g41Var.R;
            if (i7 >= i14 && i7 <= g41Var.S) {
                ((v41) c51Var.O.get(i7 - i14)).c(c51Var.a, c51Var, u1VarArr, true);
                return true;
            }
            int i15 = g41Var.X;
            if (i7 >= i15 && i7 <= g41Var.Y) {
                ((v41) c51Var.P.get(i7 - i15)).c(c51Var.a, c51Var, u1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.ij ijVar = ((z41) c51Var.y0.get(i7 - i10)).b;
            if (!ijVar.y4()) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(c51Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131743550, null), new Runnable() { // from class: org.telegram.ui.x31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new jg0(ijVar));
                                break;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.b);
                                bundle.putInt("message_id", ijVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new an(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.hd.M0(2131743551, null), new Runnable() { // from class: org.telegram.ui.x31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new jg0(ijVar));
                                break;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.b);
                                bundle.putInt("message_id", ijVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new an(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(c51Var.S.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
