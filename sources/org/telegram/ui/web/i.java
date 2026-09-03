package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public i(String str, int i10, Runnable runnable) {
        this.b = i10;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.bookmarkAdded);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i10 >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((MessageObject) arrayList2.get(i10)).getId()))) {
                arrayList2.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i10 = this.b;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.bookmarkAdded);
            ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.e);
            this.n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.n || this.f) {
            return;
        }
        this.n = true;
        int i10 = this.b;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        int i11 = 0;
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (true) {
            arrayList = this.a;
            if (i11 >= arrayList.size()) {
                break;
            }
            i12 = Math.min(i12, ((MessageObject) arrayList.get(i11)).getId());
            i11++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        int i13 = arrayList.isEmpty() ? 30 : 50;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        mediaDataController.loadMedia(clientUserId, i13, i12, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.mediaDidLoad;
        ArrayList arrayList = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.bookmarkAdded) {
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
