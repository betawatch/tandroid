package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements org.telegram.ui.Components.sj0, te.b {
    public final /* synthetic */ b51 a;

    public /* synthetic */ y31(b51 b51Var) {
        this.a = b51Var;
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        final b51 b51Var = this.a;
        org.telegram.ui.ActionBar.t1[] t1VarArr = b51Var.h0;
        g41 g41Var = b51Var.X;
        int i10 = g41Var.J;
        final int i11 = 0;
        final int i12 = 1;
        if (i7 < i10 || i7 > g41Var.K) {
            int i13 = g41Var.V;
            if (i7 >= i13 && i7 <= g41Var.W) {
                ((u41) b51Var.R.get(i7 - i13)).c(b51Var.a, b51Var, t1VarArr, true);
                return true;
            }
            int i14 = g41Var.S;
            if (i7 >= i14 && i7 <= g41Var.T) {
                ((u41) b51Var.P.get(i7 - i14)).c(b51Var.a, b51Var, t1VarArr, true);
                return true;
            }
            int i15 = g41Var.Y;
            if (i7 >= i15 && i7 <= g41Var.Z) {
                ((u41) b51Var.Q.get(i7 - i15)).c(b51Var.a, b51Var, t1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.fj fjVar = ((y41) b51Var.z0.get(i7 - i10)).b;
            if (!fjVar.x4()) {
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(b51Var, view);
                I.c(R.drawable.msg_stats, org.telegram.messenger.gd.N0(2131743299, null), new Runnable() { // from class: org.telegram.ui.x31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                b51 b51Var2 = b51Var;
                                b51Var2.getClass();
                                b51Var2.presentFragment(new mg0(fjVar));
                                break;
                            default:
                                b51 b51Var3 = b51Var;
                                b51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", b51Var3.b);
                                bundle.putInt("message_id", fjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                b51Var3.presentFragment(new bn(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.c(R.drawable.msg_msgbubble3, org.telegram.messenger.gd.N0(2131743300, null), new Runnable() { // from class: org.telegram.ui.x31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                b51 b51Var2 = b51Var;
                                b51Var2.getClass();
                                b51Var2.presentFragment(new mg0(fjVar));
                                break;
                            default:
                                b51 b51Var3 = b51Var;
                                b51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", b51Var3.b);
                                bundle.putInt("message_id", fjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                b51Var3.presentFragment(new bn(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.X(b51Var.T.U0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // te.b
    public /* synthetic */ void G(float f10, int i7) {
    }
}
