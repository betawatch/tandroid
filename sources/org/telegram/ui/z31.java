package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements org.telegram.ui.Components.sj0, te.b {
    public final /* synthetic */ c51 a;

    public /* synthetic */ z31(c51 c51Var) {
        this.a = c51Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        final c51 c51Var = this.a;
        org.telegram.ui.ActionBar.t1[] t1VarArr = c51Var.h0;
        h41 h41Var = c51Var.X;
        int i10 = h41Var.J;
        final int i11 = 0;
        final int i12 = 1;
        if (i7 < i10 || i7 > h41Var.K) {
            int i13 = h41Var.V;
            if (i7 >= i13 && i7 <= h41Var.W) {
                ((v41) c51Var.R.get(i7 - i13)).c(c51Var.a, c51Var, t1VarArr, true);
                return true;
            }
            int i14 = h41Var.S;
            if (i7 >= i14 && i7 <= h41Var.T) {
                ((v41) c51Var.P.get(i7 - i14)).c(c51Var.a, c51Var, t1VarArr, true);
                return true;
            }
            int i15 = h41Var.Y;
            if (i7 >= i15 && i7 <= h41Var.Z) {
                ((v41) c51Var.Q.get(i7 - i15)).c(c51Var.a, c51Var, t1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.gj gjVar = ((z41) c51Var.z0.get(i7 - i10)).b;
            if (!gjVar.x4()) {
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(c51Var, view);
                I.c(R.drawable.msg_stats, org.telegram.messenger.hd.N0(2131743304, null), new Runnable() { // from class: org.telegram.ui.y31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new og0(gjVar));
                                break;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.b);
                                bundle.putInt("message_id", gjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new bn(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.c(R.drawable.msg_msgbubble3, org.telegram.messenger.hd.N0(2131743305, null), new Runnable() { // from class: org.telegram.ui.y31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new og0(gjVar));
                                break;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.b);
                                bundle.putInt("message_id", gjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new bn(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.X(c51Var.T.U0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
