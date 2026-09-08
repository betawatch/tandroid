package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ xw0(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        kx0 kx0Var = (kx0) obj;
        kx0 kx0Var2 = (kx0) obj2;
        switch (this.a) {
            case 0:
                MessagesController messagesController = this.b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(kx0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController.businessFeaturesTypesToPosition.get(kx0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                MessagesController messagesController2 = this.b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
