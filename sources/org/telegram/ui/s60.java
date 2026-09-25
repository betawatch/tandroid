package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class s60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;

    public /* synthetic */ s60(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.c = m2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                z60 z60Var = (z60) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !z60Var.a0.isEmpty()) {
                            z60Var.h.c((org.telegram.ui.Components.n30) hg.c.g(1, z60Var.a0));
                            z60Var.s0();
                            z60Var.k0();
                            break;
                        }
                    } else {
                        this.b = z60Var.f.r.length() == 0;
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
                            org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) hg.c.g(1, arrayList);
                            usersSelectActivity.b.b(n30Var);
                            if (usersSelectActivity.x == 2) {
                                if (n30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.J &= -2;
                                } else if (n30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.J &= -3;
                                } else if (n30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.J &= -5;
                                } else if (n30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.J &= -9;
                                }
                            } else if (n30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                            } else if (n30Var.getUid() == -9223372036854775801L) {
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
