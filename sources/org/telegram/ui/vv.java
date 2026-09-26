package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ vv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                qyVar.getClass();
                qyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar.U1).apply();
                qyVar.k3(false);
                break;
            default:
                qy qyVar2 = this.b;
                qyVar2.getClass();
                qyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar2.U1).commit();
                qyVar2.k3(false);
                break;
        }
    }
}
