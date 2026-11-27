// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u41 {
    public final Context a;
    public final int b;
    public final vnb c;
    public final e d;
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

    public u41(e eVar, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = eVar.getContext();
        this.b = eVar.getCurrentAccount();
        this.d = eVar;
        this.e = runnable;
        this.c = eVar.getResourceProvider();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r5 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r5 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ArrayList arrayList, l9c l9cVar, boolean z) {
        String str;
        l9cVar.V();
        int d = d();
        str = "";
        if (!this.h) {
            String M0 = (d & 1) != 0 ? ob6.M0(2131750741, null) : "";
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(", ");
                }
                M0 = M0.concat(ob6.M0(2131750692, null));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(", ");
                }
                M0 = M0.concat(ob6.M0(2131750756, null));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(", ");
                }
                M0 = M0.concat(ob6.M0(2131750683, null));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(ob6.H(',', "Chats", arrayList2.size()));
                } else {
                    StringBuilder l = c00.l(M0, " + ");
                    l.append(arrayList2.size());
                    M0 = l.toString();
                }
            }
            if (TextUtils.isEmpty(M0)) {
                M0 = ob6.M0(2131752758, null);
            }
            b8c f = b8c.f(ob6.M0(2131752759, null), M0, 101);
            f.g = z;
            arrayList.add(f);
        }
        boolean z2 = this.i;
        boolean z3 = this.h;
        if (!z2) {
        }
        str = (d & 1) != 0 ? ob6.M0(2131750741, null) : "";
        if ((d & 2) != 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat(", ");
            }
            str = str.concat(ob6.M0(2131750692, null));
        }
        if ((d & 4) != 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat(", ");
            }
            str = str.concat(ob6.M0(2131750756, null));
        }
        if ((d & 8) != 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat(", ");
            }
            str = str.concat(ob6.M0(2131750683, null));
        }
        ArrayList arrayList3 = this.k;
        if (!arrayList3.isEmpty()) {
            if (TextUtils.isEmpty(str)) {
                str = str.concat(ob6.H(',', "Chats", arrayList3.size()));
            } else {
                StringBuilder l2 = c00.l(str, " + ");
                l2.append(arrayList3.size());
                str = l2.toString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = ob6.M0(2131752760, null);
        }
        b8c f2 = b8c.f(ob6.M0(2131752761, null), str, jn7.n1);
        f2.g = z;
        arrayList.add(f2);
        l9cVar.U();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            uc7 s1 = uc7.s1(yac.t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList2.size(); i++) {
                Long l = (Long) arrayList2.get(i);
                l.getClass();
                tL_inputBusinessBotRecipients.users.add(s1.q1(s1.X1(l)));
            }
        }
        if (!this.h) {
            uc7 s12 = uc7.s1(yac.t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Long l2 = (Long) arrayList.get(i2);
                l2.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(s12.q1(s12.X1(l2)));
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
        boolean z = this.h;
        tL_businessBotRecipients.exclude_selected = z;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            uc7 s1 = uc7.s1(yac.t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList2.size(); i++) {
                Long l = (Long) arrayList2.get(i);
                l.getClass();
                s1.q1(s1.X1(l));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i));
            }
        }
        if (!this.h) {
            uc7 s12 = uc7.s1(yac.t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Long l2 = (Long) arrayList.get(i2);
                l2.getClass();
                s12.q1(s12.X1(l2));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i2));
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
        boolean z = this.h;
        tL_inputBusinessRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            uc7 s1 = uc7.s1(yac.t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                tL_inputBusinessRecipients.users.add(s1.q1(s1.X1(l)));
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
        boolean z = this.h;
        tL_businessRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            uc7 s1 = uc7.s1(yac.t0);
            tL_businessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                s1.q1(s1.X1(l));
                tL_businessRecipients.users.add((Long) arrayList.get(i));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.l;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.h || (tL_businessBotRecipients.flags & (-49)) != d()) {
            return true;
        }
        boolean z = this.h;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z ? arrayList : this.j;
        if (arrayList2.size() != this.l.users.size()) {
            return true;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (!this.l.users.contains(arrayList2.get(i))) {
                return true;
            }
        }
        if (this.i && !this.h) {
            if (arrayList.size() != this.l.exclude_users.size()) {
                return true;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!this.l.exclude_users.contains(arrayList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(b8c b8cVar) {
        boolean z;
        int i = b8cVar.d;
        e eVar = this.d;
        byte b = 0;
        byte b2 = 1;
        if (i == 101) {
            z = true;
        } else {
            if (i != 103) {
                Runnable runnable = this.e;
                if (i == 102) {
                    runnable.run();
                    return true;
                }
                if (i == 104) {
                    runnable.run();
                    return true;
                }
                if (b8cVar.a != 11) {
                    return false;
                }
                boolean z2 = b8cVar.x;
                String A1 = uc7.s1(this.b).A1(b8cVar.y, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.c, this.a);
                String M0 = ob6.M0(!z2 ? 2131752667 : 2131752665, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.a0(null, null, !z2 ? 2131752668 : 2131752666, A1);
                alertDialog$Builder.j(ob6.M0(2131746048, null), new bh(this, z2, b8cVar, b2));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                if (eVar != null) {
                    eVar.showDialog(idVar);
                    return true;
                }
                idVar.show();
                return true;
            }
            z = false;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z ? this.j : this.k, z);
        usersSelectActivity.y = (byte) 2;
        usersSelectActivity.H = false;
        boolean z3 = this.i;
        usersSelectActivity.G = (!z3 || this.h || z) ? false : true;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z3;
        usersSelectActivity.J = !z && this.n;
        usersSelectActivity.n = new t41(b, this, z);
        if (eVar != null) {
            eVar.presentFragment(usersSelectActivity);
            return true;
        }
        e S = LaunchActivity.S();
        if (S == null) {
            return true;
        }
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        S.showAsSheet(usersSelectActivity, bg0Var);
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
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.h = z;
        if (z) {
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        this.i = false;
        if (tL_businessRecipients != null) {
            tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            tL_businessBotRecipients = null;
            this.l = null;
        }
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
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.h = z;
        if (z) {
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

    public final boolean k(q9c q9cVar) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        yw0.E.a();
        View C1 = q9cVar.C1(101);
        int i = -this.m;
        this.m = i;
        hl.A3(i, C1, null);
        q9cVar.A0(q9cVar.B1(101));
        return false;
    }

    public u41(Activity activity, int i, vd2 vd2Var, vnb vnbVar) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = activity;
        this.b = i;
        this.d = null;
        this.e = vd2Var;
        this.c = vnbVar;
    }
}
