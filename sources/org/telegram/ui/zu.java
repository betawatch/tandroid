package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements xx, ts {
    public final /* synthetic */ cv a;

    public /* synthetic */ zu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.ts
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        cv cvVar = this.a;
        cvVar.l0(cvVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
