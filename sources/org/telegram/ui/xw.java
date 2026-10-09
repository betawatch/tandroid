package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xw implements i70 {
    public final /* synthetic */ ty a;

    public xw(ty tyVar) {
        this.a = tyVar;
    }

    @Override // org.telegram.ui.i70
    public final void a(j70 j70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        ty tyVar = this.a;
        ny nyVar = tyVar.C2;
        if (tyVar.B2) {
            tyVar.removeSelfFromStack();
        }
        nyVar.w(tyVar, arrayList, null, true, tyVar.J2, tyVar.K2, tyVar.L2, null);
    }
}
