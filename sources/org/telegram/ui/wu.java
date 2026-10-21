package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements vx, qs {
    public final /* synthetic */ av a;

    public /* synthetic */ wu(av avVar) {
        this.a = avVar;
    }

    @Override // org.telegram.ui.vx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.vx
    public /* synthetic */ boolean J(cy cyVar) {
        return false;
    }

    @Override // org.telegram.ui.qs
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.vx
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        av avVar = this.a;
        avVar.l0(avVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
