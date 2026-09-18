package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;

    public /* synthetic */ z60(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.c = o2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                g70 g70Var = (g70) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !g70Var.a0.isEmpty()) {
                            g70Var.h.c((org.telegram.ui.Components.m30) hg.k0.h(1, g70Var.a0));
                            g70Var.s0();
                            g70Var.k0();
                            break;
                        }
                    } else {
                        this.b = g70Var.f.r.length() == 0;
                        break;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) hg.k0.h(1, arrayList);
                            usersSelectActivity.b.b(m30Var);
                            if (usersSelectActivity.x == 2) {
                                if (m30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.J &= -2;
                                } else if (m30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.J &= -3;
                                } else if (m30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.J &= -5;
                                } else if (m30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.J &= -9;
                                }
                            } else if (m30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                            } else if (m30Var.getUid() == -9223372036854775801L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                            }
                            usersSelectActivity.Y();
                            usersSelectActivity.W();
                            break;
                        }
                    } else {
                        this.b = usersSelectActivity.c.length() == 0;
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
