package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
