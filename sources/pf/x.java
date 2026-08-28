package pf;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x {
    public final Context a;
    public final int b;
    public final b6 c;
    public final o2 d;
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

    public x(o2 o2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = o2Var.getContext();
        this.b = o2Var.getCurrentAccount();
        this.d = o2Var;
        this.e = runnable;
        this.c = o2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, z41 z41Var, boolean z10) {
        String str;
        String str2;
        z41Var.U();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = org.telegram.messenger.l0.h(R.string.FilterExistingChats, e2.c.n(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = ta.b.j(str2, ", ");
                }
                str2 = org.telegram.messenger.l0.h(R.string.FilterNewChats, e2.c.n(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = ta.b.j(str2, ", ");
                }
                str2 = org.telegram.messenger.l0.h(R.string.FilterContacts, e2.c.n(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = ta.b.j(str2, ", ");
                }
                str2 = org.telegram.messenger.l0.h(R.string.FilterNonContacts, e2.c.n(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder n10 = e2.c.n(str2);
                    n10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str2 = n10.toString();
                } else {
                    StringBuilder e10 = ta.b.e(str2, " + ");
                    e10.append(arrayList2.size());
                    str2 = e10.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            l41 f10 = l41.f(LocaleController.getString(R.string.BusinessChatsIncluded), str2, 101);
            f10.g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    str = org.telegram.messenger.l0.h(R.string.FilterExistingChats, e2.c.n(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = ta.b.j(str, ", ");
                    }
                    str = org.telegram.messenger.l0.h(R.string.FilterNewChats, e2.c.n(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = ta.b.j(str, ", ");
                    }
                    str = org.telegram.messenger.l0.h(R.string.FilterContacts, e2.c.n(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = ta.b.j(str, ", ");
                    }
                    str = org.telegram.messenger.l0.h(R.string.FilterNonContacts, e2.c.n(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder n11 = e2.c.n(str);
                    n11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str = n11.toString();
                } else {
                    StringBuilder e11 = ta.b.e(str, " + ");
                    e11.append(arrayList3.size());
                    str = e11.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            l41 f11 = l41.f(LocaleController.getString(R.string.BusinessChatsExcluded), str, 103);
            f11.g = z10;
            arrayList.add(f11);
        }
        z41Var.T();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z10 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z10;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z10 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList2.get(i9)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i9));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList.get(i10)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
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
        boolean z10 = this.h;
        tL_businessBotRecipients.exclude_selected = z10;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z10 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                if (messagesController.getInputUser(((Long) arrayList2.get(i9)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i9));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i9));
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (messagesController2.getInputUser(((Long) arrayList.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i10));
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
        boolean z10 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z10;
        ArrayList arrayList = z10 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i9)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i9));
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
        boolean z10 = this.h;
        tL_businessRecipients.exclude_selected = z10;
        ArrayList arrayList = z10 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i9)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i9));
                } else {
                    tL_businessRecipients.users.add((Long) arrayList.get(i9));
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
        boolean z10 = this.h;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z10 ? arrayList : this.j;
        if (arrayList2.size() != this.l.users.size()) {
            return true;
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            if (!this.l.users.contains(arrayList2.get(i9))) {
                return true;
            }
        }
        if (this.i && !this.h) {
            if (arrayList.size() != this.l.exclude_users.size()) {
                return true;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!this.l.exclude_users.contains(arrayList.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(l41 l41Var) {
        int i9 = l41Var.d;
        o2 o2Var = this.d;
        boolean z10 = false;
        if (i9 == 101 || i9 == 103) {
            boolean z11 = i9 == 101;
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z11 ? this.j : this.k, z11);
            usersSelectActivity.x = 2;
            usersSelectActivity.C = false;
            usersSelectActivity.B = (!this.i || this.h || z11) ? false : true;
            usersSelectActivity.C = false;
            if (!z11 && this.n) {
                z10 = true;
            }
            usersSelectActivity.D = z10;
            usersSelectActivity.n = new dh.s(9, this, z11);
            if (o2Var != null) {
                o2Var.presentFragment(usersSelectActivity);
                return true;
            }
            o2 U = LaunchActivity.U();
            if (U == null) {
                return true;
            }
            m2 m2Var = new m2();
            m2Var.a = true;
            U.showAsSheet(usersSelectActivity, m2Var);
            return true;
        }
        Runnable runnable = this.e;
        if (i9 == 102) {
            runnable.run();
            return true;
        }
        if (i9 == 104) {
            runnable.run();
            return true;
        }
        int i10 = 11;
        if (l41Var.a != 11) {
            return false;
        }
        boolean z12 = l41Var.w;
        String peerName = MessagesController.getInstance(this.b).getPeerName(l41Var.x);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a, 0, this.c);
        String string = LocaleController.getString(!z12 ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle);
        c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString(!z12 ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, peerName);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b5.e(this, z12, l41Var, i10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (o2Var != null) {
            o2Var.showDialog(c2Var);
            return true;
        }
        c2Var.show();
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
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
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
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
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

    public final boolean k(i51 i51Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        View y12 = i51Var.y1(101);
        int i9 = -this.m;
        this.m = i9;
        AndroidUtilities.shakeViewSpring(y12, i9);
        i51Var.x0(i51Var.x1(101));
        return false;
    }

    public x(Context context, int i9, mh.m2 m2Var, b6 b6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i9;
        this.d = null;
        this.e = m2Var;
        this.c = b6Var;
    }
}
