package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements yx, ss {
    public final /* synthetic */ cv a;

    public /* synthetic */ zu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        return false;
    }

    @Override // org.telegram.ui.ss
    public void d(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
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
