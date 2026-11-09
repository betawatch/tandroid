package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements org.telegram.ui.Components.ej0, te.b {
    public final /* synthetic */ d51 a;

    public /* synthetic */ z31(d51 d51Var) {
        this.a = d51Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        final d51 d51Var = this.a;
        org.telegram.ui.ActionBar.u1[] u1VarArr = d51Var.g0;
        h41 h41Var = d51Var.W;
        int i10 = h41Var.I;
        final int i11 = 0;
        final int i12 = 1;
        if (i7 < i10 || i7 > h41Var.J) {
            int i13 = h41Var.U;
            if (i7 >= i13 && i7 <= h41Var.V) {
                ((w41) d51Var.Q.get(i7 - i13)).c(d51Var.a, d51Var, u1VarArr, true);
                return true;
            }
            int i14 = h41Var.R;
            if (i7 >= i14 && i7 <= h41Var.S) {
                ((w41) d51Var.O.get(i7 - i14)).c(d51Var.a, d51Var, u1VarArr, true);
                return true;
            }
            int i15 = h41Var.X;
            if (i7 >= i15 && i7 <= h41Var.Y) {
                ((w41) d51Var.P.get(i7 - i15)).c(d51Var.a, d51Var, u1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.ij ijVar = ((a51) d51Var.y0.get(i7 - i10)).b;
            if (!ijVar.x4()) {
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(d51Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.id.M0(2131743549, null), new Runnable() { // from class: org.telegram.ui.y31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d51 d51Var2 = d51Var;
                                d51Var2.getClass();
                                d51Var2.presentFragment(new lg0(ijVar));
                                break;
                            default:
                                d51 d51Var3 = d51Var;
                                d51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", d51Var3.b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                d51Var3.presentFragment(new cn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.id.M0(2131743550, null), new Runnable() { // from class: org.telegram.ui.y31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                d51 d51Var2 = d51Var;
                                d51Var2.getClass();
                                d51Var2.presentFragment(new lg0(ijVar));
                                break;
                            default:
                                d51 d51Var3 = d51Var;
                                d51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", d51Var3.b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                d51Var3.presentFragment(new cn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(d51Var.S.U0(view, false));
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
