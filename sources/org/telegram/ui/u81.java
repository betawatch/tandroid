package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u81 implements org.telegram.ui.Components.cm0, oe.d {
    public final /* synthetic */ y91 a;

    public /* synthetic */ u81(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.p0();
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        final y91 y91Var = this.a;
        org.telegram.ui.ActionBar.e2[] e2VarArr = y91Var.g0;
        d91 d91Var = y91Var.W;
        int i11 = d91Var.I;
        if (i10 < i11 || i10 > d91Var.J) {
            int i12 = d91Var.U;
            if (i10 >= i12 && i10 <= d91Var.V) {
                ((r91) y91Var.Q.get(i10 - i12)).c(y91Var.a, y91Var, e2VarArr, true);
                return true;
            }
            int i13 = d91Var.R;
            if (i10 >= i13 && i10 <= d91Var.S) {
                ((r91) y91Var.O.get(i10 - i13)).c(y91Var.a, y91Var, e2VarArr, true);
                return true;
            }
            int i14 = d91Var.X;
            if (i10 >= i14 && i10 <= d91Var.Y) {
                ((r91) y91Var.P.get(i10 - i14)).c(y91Var.a, y91Var, e2VarArr, true);
                return true;
            }
        } else {
            final MessageObject messageObject = ((v91) y91Var.y0.get(i10 - i11)).b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(y91Var, view);
                final int i15 = 0;
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.t81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                y91 y91Var2 = y91Var;
                                y91Var2.getClass();
                                y91Var2.presentFragment(new xi0(messageObject));
                                break;
                            default:
                                y91 y91Var3 = y91Var;
                                y91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", y91Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                y91Var3.presentFragment(new wn(bundle), false);
                                break;
                        }
                    }
                }, false);
                final int i16 = 1;
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.t81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                y91 y91Var2 = y91Var;
                                y91Var2.getClass();
                                y91Var2.presentFragment(new xi0(messageObject));
                                break;
                            default:
                                y91 y91Var3 = y91Var;
                                y91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", y91Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                y91Var3.presentFragment(new wn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(y91Var.S.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
