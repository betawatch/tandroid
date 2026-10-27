package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu implements xx, ts {
    public final /* synthetic */ bv a;

    public /* synthetic */ yu(bv bvVar) {
        this.a = bvVar;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.ts
    public void b(TLRPC.User user) {
        this.a.m0(user);
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        bv bvVar = this.a;
        bvVar.m0(bvVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
