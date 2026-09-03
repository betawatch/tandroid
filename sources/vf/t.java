package vf;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.qc;
import org.telegram.ui.cr0;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t {
    public static volatile t[] e = new t[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f[i10] = new Object();
        }
    }

    public t(int i10) {
        this.a = i10;
    }

    public static t d(int i10) {
        t tVar;
        t tVar2 = e[i10];
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (f[i10]) {
            try {
                tVar = e[i10];
                if (tVar == null) {
                    t[] tVarArr = e;
                    t tVar3 = new t(i10);
                    tVarArr[i10] = tVar3;
                    tVar = tVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    public final void a(q qVar, String str) {
        TL_account.TL_businessChatLink c3 = c(str);
        if (c3 != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c3);
            arrayList.remove(c3);
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            qc.a0(qVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new gu0(this, indexOf, c3, 18), new uf.h1(this, str, c3, 5)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, id idVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new hg.y(this, tL_businessChatLink, idVar, 25));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        break;
                    }
                    if (TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tL_businessChatLink;
    }

    public final void e(boolean z4, boolean z10) {
        if (this.c) {
            return;
        }
        if (!this.d || (z10 && !z4)) {
            this.c = true;
            int i10 = this.a;
            if (z4) {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new cr0(this, messagesStorage, z10, 10));
            } else {
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new s(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new qh.p0(1, arrayList, messagesStorage));
    }
}
