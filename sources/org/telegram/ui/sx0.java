package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sx0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ tx0 d;

    public sx0(tx0 tx0Var, Context context) {
        this.d = tx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.e;
    }

    @Override // f2.o0
    public final int j(int i10) {
        tx0 tx0Var = this.d;
        if (i10 == tx0Var.w) {
            return 4;
        }
        if (i10 == tx0Var.n) {
            return 3;
        }
        if (i10 == tx0Var.f) {
            return 2;
        }
        return (i10 == tx0Var.h || i10 == tx0Var.v) ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String string;
        tx0 tx0Var = this.d;
        int i11 = tx0Var.y;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = tx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    a5Var.b(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != tx0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = tx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.y3.j(new StringBuilder("+"), user.phone, se.b.c());
                }
                a5Var.b(user, null, string, i10 != tx0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 != tx0Var.h) {
                if (i10 == tx0Var.v) {
                    z8Var.setFixedSize(12);
                    z8Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                z8Var.setFixedSize(0);
                z8Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            if (i11 == 1) {
                x4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == tx0Var.n) {
            if (i11 == 1) {
                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", tx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                l4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout z8Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                z8Var = new org.telegram.ui.Cells.z8(context);
            } else if (i10 == 2) {
                z8Var = new org.telegram.ui.Cells.x4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                frameLayout = l4Var;
            } else {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                n8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                frameLayout = n8Var;
            }
            frameLayout = z8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.c, null, true);
            a5Var.setDelegate(new kl0(this, 10));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.dl0(frameLayout);
    }
}
