package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ tv0(MessagesController messagesController, int i9) {
        this.a = i9;
        this.b = messagesController;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        gw0 gw0Var = (gw0) obj;
        gw0 gw0Var2 = (gw0) obj2;
        switch (this.a) {
            case 0:
                MessagesController messagesController = this.b;
                i9 = messagesController.businessFeaturesTypesToPosition.get(gw0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = messagesController.businessFeaturesTypesToPosition.get(gw0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                MessagesController messagesController2 = this.b;
                i9 = messagesController2.premiumFeaturesTypesToPosition.get(gw0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(gw0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i9 - i10;
    }
}
