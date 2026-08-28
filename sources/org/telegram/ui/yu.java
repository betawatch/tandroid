package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu implements wx, ts {
    public final /* synthetic */ bv a;

    public /* synthetic */ yu(bv bvVar) {
        this.a = bvVar;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.ts
    public void b(TLRPC.User user) {
        this.a.k0(user);
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        bv bvVar = this.a;
        bvVar.k0(bvVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
