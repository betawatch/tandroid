package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r40 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;

    public /* synthetic */ r40(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.c = f2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = this.c;
        switch (i10) {
            case 0:
                y40 y40Var = (y40) f2Var;
                if (i7 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !y40Var.a0.isEmpty()) {
                            y40Var.h.c((org.telegram.ui.Components.d20) jg.g.i(1, y40Var.a0));
                            y40Var.x0();
                            y40Var.p0();
                            break;
                        }
                    } else {
                        this.b = y40Var.f.r.length() == 0;
                    }
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) f2Var;
                ArrayList arrayList = usersSelectActivity.P;
                if (i7 == 67) {
                    if (keyEvent.getAction() != 0) {
                        if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                            org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) jg.g.i(1, arrayList);
                            usersSelectActivity.b.b(d20Var);
                            if (usersSelectActivity.y == 2) {
                                if (d20Var.getUid() == -9223372036854775800L) {
                                    usersSelectActivity.K &= -2;
                                } else if (d20Var.getUid() == -9223372036854775799L) {
                                    usersSelectActivity.K &= -3;
                                } else if (d20Var.getUid() == Long.MIN_VALUE) {
                                    usersSelectActivity.K &= -5;
                                } else if (d20Var.getUid() == -9223372036854775807L) {
                                    usersSelectActivity.K &= -9;
                                }
                            } else if (d20Var.getUid() == Long.MIN_VALUE) {
                                int i11 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -2;
                            } else if (d20Var.getUid() == -9223372036854775807L) {
                                int i12 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -3;
                            } else if (d20Var.getUid() == -9223372036854775806L) {
                                int i13 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -5;
                            } else if (d20Var.getUid() == -9223372036854775805L) {
                                int i14 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -9;
                            } else if (d20Var.getUid() == -9223372036854775804L) {
                                int i15 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -17;
                            } else if (d20Var.getUid() == -9223372036854775803L) {
                                int i16 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -33;
                            } else if (d20Var.getUid() == -9223372036854775802L) {
                                int i17 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -65;
                            } else if (d20Var.getUid() == -9223372036854775801L) {
                                int i18 = org.telegram.messenger.qp.C8;
                                usersSelectActivity.K &= -129;
                            }
                            usersSelectActivity.d0();
                            usersSelectActivity.b0();
                            break;
                        }
                    } else {
                        this.b = usersSelectActivity.c.length() == 0;
                    }
                }
                break;
        }
        return true;
    }
}
