package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements org.telegram.ui.Components.ij0, te.b {
    public final /* synthetic */ z41 a;

    public /* synthetic */ w31(z41 z41Var) {
        this.a = z41Var;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        final z41 z41Var = this.a;
        org.telegram.ui.ActionBar.t1[] t1VarArr = z41Var.h0;
        e41 e41Var = z41Var.X;
        int i10 = e41Var.J;
        final int i11 = 0;
        final int i12 = 1;
        if (i7 < i10 || i7 > e41Var.K) {
            int i13 = e41Var.V;
            if (i7 >= i13 && i7 <= e41Var.W) {
                ((s41) z41Var.R.get(i7 - i13)).c(z41Var.a, z41Var, t1VarArr, true);
                return true;
            }
            int i14 = e41Var.S;
            if (i7 >= i14 && i7 <= e41Var.T) {
                ((s41) z41Var.P.get(i7 - i14)).c(z41Var.a, z41Var, t1VarArr, true);
                return true;
            }
            int i15 = e41Var.Y;
            if (i7 >= i15 && i7 <= e41Var.Z) {
                ((s41) z41Var.Q.get(i7 - i15)).c(z41Var.a, z41Var, t1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.gj gjVar = ((w41) z41Var.z0.get(i7 - i10)).b;
            if (!gjVar.x4()) {
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(z41Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131743549, null), new Runnable() { // from class: org.telegram.ui.v31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                z41 z41Var2 = z41Var;
                                z41Var2.getClass();
                                z41Var2.presentFragment(new jg0(gjVar));
                                break;
                            default:
                                z41 z41Var3 = z41Var;
                                z41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", z41Var3.b);
                                bundle.putInt("message_id", gjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                z41Var3.presentFragment(new an(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.hd.M0(2131743550, null), new Runnable() { // from class: org.telegram.ui.v31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                z41 z41Var2 = z41Var;
                                z41Var2.getClass();
                                z41Var2.presentFragment(new jg0(gjVar));
                                break;
                            default:
                                z41 z41Var3 = z41Var;
                                z41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", z41Var3.b);
                                bundle.putInt("message_id", gjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                z41Var3.presentFragment(new an(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(z41Var.T.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
