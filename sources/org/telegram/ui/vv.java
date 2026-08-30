package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ vv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                oy oyVar = this.b;
                oyVar.getClass();
                oyVar.R1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", oyVar.R1).apply();
                oyVar.k3(false);
                break;
            default:
                oy oyVar2 = this.b;
                oyVar2.getClass();
                oyVar2.R1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", oyVar2.R1).commit();
                oyVar2.k3(false);
                break;
        }
    }
}
