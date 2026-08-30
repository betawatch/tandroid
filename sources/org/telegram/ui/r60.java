package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r60 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;

    public /* synthetic */ r60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.c = p2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                y60 y60Var = (y60) this.c;
                if (i10 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !y60Var.X.isEmpty()) {
                            y60Var.h.c((org.telegram.ui.Components.n30) kh.a2.i(1, y60Var.X));
                            y60Var.s0();
                            y60Var.k0();
                            break;
                        }
                    } else {
                        this.b = y60Var.f.r.length() == 0;
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
                            org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) kh.a2.i(1, arrayList);
                            usersSelectActivity.b.b(n30Var);
                            if (usersSelectActivity.x == 2) {
                                if (n30Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.G &= -2;
                                } else if (n30Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.G &= -3;
                                } else if (n30Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.G &= -5;
                                } else if (n30Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.G &= -9;
                                }
                            } else if (n30Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775806L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775805L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775804L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775803L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775802L) {
                                usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.G;
                            } else if (n30Var.getUid() == -9223372036854775801L) {
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
