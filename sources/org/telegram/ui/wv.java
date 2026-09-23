package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ wv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                ryVar.getClass();
                ryVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", ryVar.U1).apply();
                ryVar.k3(false);
                break;
            default:
                ry ryVar2 = this.b;
                ryVar2.getClass();
                ryVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", ryVar2.U1).commit();
                ryVar2.k3(false);
                break;
        }
    }
}
