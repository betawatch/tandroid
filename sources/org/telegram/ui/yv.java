package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ yv(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                tyVar.getClass();
                tyVar.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", tyVar.U1).apply();
                tyVar.h3(false);
                break;
            default:
                ty tyVar2 = this.b;
                tyVar2.getClass();
                tyVar2.U1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", tyVar2.U1).commit();
                tyVar2.h3(false);
                break;
        }
    }
}
