package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ wv(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                pyVar.getClass();
                pyVar.R1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", pyVar.R1).apply();
                pyVar.k3(false);
                break;
            default:
                py pyVar2 = this.b;
                pyVar2.getClass();
                pyVar2.R1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", pyVar2.R1).commit();
                pyVar2.k3(false);
                break;
        }
    }
}
