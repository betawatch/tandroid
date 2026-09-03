package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;

    public /* synthetic */ t60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.c = p2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                a70 a70Var = (a70) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !a70Var.X.isEmpty()) {
                            a70Var.h.c((org.telegram.ui.Components.o30) kf.k0.i(1, a70Var.X));
                            a70Var.s0();
                            a70Var.k0();
                            break;
                        }
                    } else {
                        this.b = a70Var.f.r.length() == 0;
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
                            org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) kf.k0.i(1, arrayList);
                            usersSelectActivity.b.b(o30Var);
                            if (usersSelectActivity.x == 2) {
                                if (o30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.G &= -2;
                                } else if (o30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.G &= -3;
                                } else if (o30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.G &= -5;
                                } else if (o30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.G &= -9;
                                }
                            } else if (o30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.G;
                            } else if (o30Var.getUid() == -9223372036854775801L) {
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
