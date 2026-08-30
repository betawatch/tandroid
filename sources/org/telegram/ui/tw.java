package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tw implements d70 {
    public final /* synthetic */ oy a;

    public tw(oy oyVar) {
        this.a = oyVar;
    }

    @Override // org.telegram.ui.d70
    public final void a(e70 e70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        oy oyVar = this.a;
        iy iyVar = oyVar.z2;
        if (oyVar.y2) {
            oyVar.removeSelfFromStack();
        }
        iyVar.w(oyVar, arrayList, null, true, oyVar.G2, oyVar.H2, oyVar.I2, null);
    }
}
