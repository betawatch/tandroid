package sf;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ll0;
import org.telegram.ui.mp0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u {
    public static volatile u[] e = new u[4];
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

    public u(int i10) {
        this.a = i10;
    }

    public static u d(int i10) {
        u uVar;
        u uVar2 = e[i10];
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (f[i10]) {
            try {
                uVar = e[i10];
                if (uVar == null) {
                    u[] uVarArr = e;
                    u uVar3 = new u(i10);
                    uVarArr[i10] = uVar3;
                    uVar = uVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public final void a(r rVar, String str) {
        TL_account.TL_businessChatLink c3 = c(str);
        if (c3 != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c3);
            arrayList.remove(c3);
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            tc.a0(rVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new ll0(this, indexOf, c3, 15), new a(this, str, c3, 3)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, ld ldVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new eg.z(this, tL_businessChatLink, ldVar, 25));
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

    public final void e(boolean z10, boolean z11) {
        if (this.c) {
            return;
        }
        if (!this.d || (z11 && !z10)) {
            this.c = true;
            int i10 = this.a;
            if (z10) {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new mp0(this, messagesStorage, z11, 10));
            } else {
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new t(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new nh.w0(1, arrayList, messagesStorage));
    }
}
