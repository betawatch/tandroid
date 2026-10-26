package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s81 implements org.telegram.ui.Components.bm0, oe.d {
    public final /* synthetic */ w91 a;

    public /* synthetic */ s81(w91 w91Var) {
        this.a = w91Var;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.p0();
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        final w91 w91Var = this.a;
        org.telegram.ui.ActionBar.e2[] e2VarArr = w91Var.g0;
        b91 b91Var = w91Var.W;
        int i11 = b91Var.I;
        if (i10 < i11 || i10 > b91Var.J) {
            int i12 = b91Var.U;
            if (i10 >= i12 && i10 <= b91Var.V) {
                ((p91) w91Var.Q.get(i10 - i12)).c(w91Var.a, w91Var, e2VarArr, true);
                return true;
            }
            int i13 = b91Var.R;
            if (i10 >= i13 && i10 <= b91Var.S) {
                ((p91) w91Var.O.get(i10 - i13)).c(w91Var.a, w91Var, e2VarArr, true);
                return true;
            }
            int i14 = b91Var.X;
            if (i10 >= i14 && i10 <= b91Var.Y) {
                ((p91) w91Var.P.get(i10 - i14)).c(w91Var.a, w91Var, e2VarArr, true);
                return true;
            }
        } else {
            final MessageObject messageObject = ((t91) w91Var.y0.get(i10 - i11)).b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(w91Var, view);
                final int i15 = 0;
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.r81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                w91 w91Var2 = w91Var;
                                w91Var2.getClass();
                                w91Var2.presentFragment(new vi0(messageObject));
                                break;
                            default:
                                w91 w91Var3 = w91Var;
                                w91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", w91Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                w91Var3.presentFragment(new un(bundle), false);
                                break;
                        }
                    }
                }, false);
                final int i16 = 1;
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.r81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                w91 w91Var2 = w91Var;
                                w91Var2.getClass();
                                w91Var2.presentFragment(new vi0(messageObject));
                                break;
                            default:
                                w91 w91Var3 = w91Var;
                                w91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", w91Var3.b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                w91Var3.presentFragment(new un(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(w91Var.S.V0(view, false));
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
