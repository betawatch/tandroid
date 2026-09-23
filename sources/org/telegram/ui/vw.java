package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vw implements h70 {
    public final /* synthetic */ ry a;

    public vw(ry ryVar) {
        this.a = ryVar;
    }

    @Override // org.telegram.ui.h70
    public final void a(i70 i70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        ry ryVar = this.a;
        ly lyVar = ryVar.C2;
        if (ryVar.B2) {
            ryVar.removeSelfFromStack();
        }
        lyVar.u(ryVar, arrayList, null, true, ryVar.J2, ryVar.K2, ryVar.L2, null);
    }
}
