package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ xv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                qyVar.getClass();
                qyVar.R1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar.R1).apply();
                qyVar.k3(false);
                break;
            default:
                qy qyVar2 = this.b;
                qyVar2.getClass();
                qyVar2.R1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar2.R1).commit();
                qyVar2.k3(false);
                break;
        }
    }
}
