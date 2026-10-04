package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class r91 implements org.telegram.ui.Components.ol0, le.d {
    public final /* synthetic */ va1 a;

    public /* synthetic */ r91(va1 va1Var) {
        this.a = va1Var;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.a.n0();
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        final va1 va1Var = this.a;
        org.telegram.ui.ActionBar.b2[] b2VarArr = va1Var.g0;
        aa1 aa1Var = va1Var.W;
        int i11 = aa1Var.I;
        if (i10 < i11 || i10 > aa1Var.J) {
            int i12 = aa1Var.U;
            if (i10 >= i12 && i10 <= aa1Var.V) {
                ((oa1) va1Var.Q.get(i10 - i12)).c(va1Var.a, va1Var, b2VarArr, true);
                return true;
            }
            int i13 = aa1Var.R;
            if (i10 >= i13 && i10 <= aa1Var.S) {
                ((oa1) va1Var.O.get(i10 - i13)).c(va1Var.a, va1Var, b2VarArr, true);
                return true;
            }
            int i14 = aa1Var.X;
            if (i10 >= i14 && i10 <= aa1Var.Y) {
                ((oa1) va1Var.P.get(i10 - i14)).c(va1Var.a, va1Var, b2VarArr, true);
                return true;
            }
        } else {
            final MessageObject messageObject = ((sa1) va1Var.y0.get(i10 - i11)).b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(va1Var, view);
                final int i15 = 0;
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.q91
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                va1 va1Var2 = va1Var;
                                va1Var2.getClass();
                                va1Var2.presentFragment(new hj0(messageObject));
                                break;
                            default:
                                va1 va1Var3 = va1Var;
                                va1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", va1Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                va1Var3.presentFragment(new yn(bundle), false);
                                break;
                        }
                    }
                }, false);
                final int i16 = 1;
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.q91
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                va1 va1Var2 = va1Var;
                                va1Var2.getClass();
                                va1Var2.presentFragment(new hj0(messageObject));
                                break;
                            default:
                                va1 va1Var3 = va1Var;
                                va1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", va1Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                va1Var3.presentFragment(new yn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(va1Var.S.W0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
