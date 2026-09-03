package vf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
import qh.u9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v {
    public final Context a;
    public final int b;
    public final g6 c;
    public final p2 d;
    public final Runnable e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public TL_account.TL_businessBotRecipients l;
    public int m;
    public boolean n;

    public v(p2 p2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = p2Var.getContext();
        this.b = p2Var.getCurrentAccount();
        this.d = p2Var;
        this.e = runnable;
        this.c = p2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, w51 w51Var, boolean z4) {
        String str;
        String str2;
        w51Var.U();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = y3.h(R.string.FilterExistingChats, e2.c.l(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = w.c.e(str2, ", ");
                }
                str2 = y3.h(R.string.FilterNewChats, e2.c.l(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = w.c.e(str2, ", ");
                }
                str2 = y3.h(R.string.FilterContacts, e2.c.l(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = w.c.e(str2, ", ");
                }
                str2 = y3.h(R.string.FilterNonContacts, e2.c.l(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder l10 = e2.c.l(str2);
                    l10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str2 = l10.toString();
                } else {
                    StringBuilder f10 = w.c.f(str2, " + ");
                    f10.append(arrayList2.size());
                    str2 = f10.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            h51 f11 = h51.f(LocaleController.getString(R.string.BusinessChatsIncluded), str2, 101);
            f11.g = z4;
            arrayList.add(f11);
        }
        boolean z10 = this.i;
        if (z10 || this.h) {
            if (!z10 || this.h) {
                if ((d & 1) != 0) {
                    str = y3.h(R.string.FilterExistingChats, e2.c.l(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = w.c.e(str, ", ");
                    }
                    str = y3.h(R.string.FilterNewChats, e2.c.l(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = w.c.e(str, ", ");
                    }
                    str = y3.h(R.string.FilterContacts, e2.c.l(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = w.c.e(str, ", ");
                    }
                    str = y3.h(R.string.FilterNonContacts, e2.c.l(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder l11 = e2.c.l(str);
                    l11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str = l11.toString();
                } else {
                    StringBuilder f12 = w.c.f(str, " + ");
                    f12.append(arrayList3.size());
                    str = f12.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            h51 f13 = h51.f(LocaleController.getString(R.string.BusinessChatsExcluded), str, 103);
            f13.g = z4;
            arrayList.add(f13);
        }
        w51Var.T();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z4 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z4;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z4 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList2.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i10));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList.get(i11)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i11));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        tL_businessBotRecipients.existing_chats = (d & 1) != 0;
        tL_businessBotRecipients.new_chats = (d & 2) != 0;
        tL_businessBotRecipients.contacts = (d & 4) != 0;
        tL_businessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z4 = this.h;
        tL_businessBotRecipients.exclude_selected = z4;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z4 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList2.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i10));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i10));
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (messagesController2.getInputUser(((Long) arrayList.get(i11)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i11));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i11));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        return this.h ? this.g : this.f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        tL_inputBusinessRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessRecipients.non_contacts = (d & 8) != 0;
        boolean z4 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z4;
        ArrayList arrayList = z4 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_inputBusinessRecipients.users.add(inputUser);
                }
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        tL_businessRecipients.existing_chats = (d & 1) != 0;
        tL_businessRecipients.new_chats = (d & 2) != 0;
        tL_businessRecipients.contacts = (d & 4) != 0;
        tL_businessRecipients.non_contacts = (d & 8) != 0;
        boolean z4 = this.h;
        tL_businessRecipients.exclude_selected = z4;
        ArrayList arrayList = z4 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_businessRecipients.users.add((Long) arrayList.get(i10));
                }
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.l;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.h || (tL_businessBotRecipients.flags & (-49)) != d()) {
            return true;
        }
        boolean z4 = this.h;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z4 ? arrayList : this.j;
        if (arrayList2.size() != this.l.users.size()) {
            return true;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (!this.l.users.contains(arrayList2.get(i10))) {
                return true;
            }
        }
        if (this.i && !this.h) {
            if (arrayList.size() != this.l.exclude_users.size()) {
                return true;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!this.l.exclude_users.contains(arrayList.get(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(h51 h51Var) {
        int i10 = h51Var.d;
        p2 p2Var = this.d;
        boolean z4 = false;
        if (i10 == 101 || i10 == 103) {
            boolean z10 = i10 == 101;
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z10 ? this.j : this.k, z10);
            usersSelectActivity.x = 2;
            usersSelectActivity.D = false;
            usersSelectActivity.C = (!this.i || this.h || z10) ? false : true;
            usersSelectActivity.D = false;
            if (!z10 && this.n) {
                z4 = true;
            }
            usersSelectActivity.E = z4;
            usersSelectActivity.n = new jh.q(9, this, z10);
            if (p2Var != null) {
                p2Var.presentFragment(usersSelectActivity);
                return true;
            }
            p2 U = LaunchActivity.U();
            if (U == null) {
                return true;
            }
            n2 n2Var = new n2();
            n2Var.a = true;
            U.showAsSheet(usersSelectActivity, n2Var);
            return true;
        }
        Runnable runnable = this.e;
        if (i10 == 102) {
            runnable.run();
            return true;
        }
        if (i10 == 104) {
            runnable.run();
            return true;
        }
        if (h51Var.a != 11) {
            return false;
        }
        boolean z11 = h51Var.w;
        String peerName = MessagesController.getInstance(this.b).getPeerName(h51Var.x);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a, 0, this.c);
        String string = LocaleController.getString(!z11 ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle);
        d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString(!z11 ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, peerName);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z11, h51Var, 12));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (p2Var != null) {
            p2Var.showDialog(d2Var);
            return true;
        }
        d2Var.show();
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.i = true;
        this.l = tL_businessBotRecipients;
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.g = 0;
            this.f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z4 = tL_businessBotRecipients.exclude_selected;
        this.h = z4;
        if (z4) {
            this.f = 0;
            this.g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l.users);
            return;
        }
        this.f = tL_businessBotRecipients.flags & (-49);
        this.g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.l.users);
        arrayList2.addAll(this.l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.l;
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.g = 0;
            this.f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z4 = tL_businessBotRecipients2.exclude_selected;
        this.h = z4;
        if (z4) {
            this.f = 0;
            this.g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l.users);
            return;
        }
        this.f = tL_businessBotRecipients2.flags & (-49);
        this.g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.l.users);
        arrayList2.addAll(this.l.exclude_users);
    }

    public final boolean k(h61 h61Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        View x12 = h61Var.x1(101);
        int i10 = -this.m;
        this.m = i10;
        AndroidUtilities.shakeViewSpring(x12, i10);
        h61Var.x0(h61Var.w1(101));
        return false;
    }

    public v(Context context, int i10, u9 u9Var, g6 g6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i10;
        this.d = null;
        this.e = u9Var;
        this.c = g6Var;
    }
}
