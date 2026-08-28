package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i implements NotificationCenter.NotificationCenterDelegate {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public i(String str, int i9, Runnable runnable) {
        this.b = i9;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i9 = this.b;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.bookmarkAdded);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i9 >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((MessageObject) arrayList2.get(i9)).getId()))) {
                arrayList2.remove(i9);
                i9--;
            }
            i9++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i9 = this.b;
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.bookmarkAdded);
            ConnectionsManager.getInstance(i9).cancelRequestsForGuid(this.e);
            this.n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.n || this.f) {
            return;
        }
        this.n = true;
        int i9 = this.b;
        long clientUserId = UserConfig.getInstance(i9).getClientUserId();
        int i10 = 0;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (true) {
            arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 = Math.min(i11, ((MessageObject) arrayList.get(i10)).getId());
            i10++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i9);
        int i12 = arrayList.isEmpty() ? 30 : 50;
        if (i11 == Integer.MAX_VALUE) {
            i11 = 0;
        }
        mediaDataController.loadMedia(clientUserId, i12, i11, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.mediaDidLoad;
        ArrayList arrayList = this.a;
        if (i9 != i11) {
            if (i9 == NotificationCenter.bookmarkAdded) {
                arrayList.add(0, (MessageObject) objArr[0]);
            }
        } else if (((Integer) objArr[3]).intValue() == this.e) {
            this.n = false;
            ArrayList arrayList2 = (ArrayList) objArr[2];
            this.f = ((Boolean) objArr[5]).booleanValue();
            arrayList.addAll(arrayList2);
            this.c.run();
        }
    }
}
