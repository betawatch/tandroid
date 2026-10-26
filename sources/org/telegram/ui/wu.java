package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements ux, rs {
    public final /* synthetic */ zu a;

    public /* synthetic */ wu(zu zuVar) {
        this.a = zuVar;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean K(cy cyVar) {
        return false;
    }

    @Override // org.telegram.ui.rs
    public void b(TLRPC.User user) {
        this.a.m0(user);
    }

    @Override // org.telegram.ui.ux
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        zu zuVar = this.a;
        zuVar.m0(zuVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
