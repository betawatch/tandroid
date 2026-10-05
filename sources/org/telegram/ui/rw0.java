package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ rw0(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ex0 ex0Var = (ex0) obj;
        ex0 ex0Var2 = (ex0) obj2;
        switch (this.a) {
            case 0:
                MessagesController messagesController = this.b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ex0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ex0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                MessagesController messagesController2 = this.b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ex0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ex0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
