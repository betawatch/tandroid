package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;

    public /* synthetic */ s60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.c = p2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                z60 z60Var = (z60) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !z60Var.X.isEmpty()) {
                            z60Var.h.c((org.telegram.ui.Components.p30) l.d.i(1, z60Var.X));
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
                ArrayList arrayList = usersSelectActivity.L;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) l.d.i(1, arrayList);
                            usersSelectActivity.b.b(p30Var);
                            if (usersSelectActivity.x == 2) {
                                if (p30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.G &= -2;
                                } else if (p30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.G &= -3;
                                } else if (p30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.G &= -5;
                                } else if (p30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.G &= -9;
                                }
                            } else if (p30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.G;
                            } else if (p30Var.getUid() == -9223372036854775801L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.G;
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
