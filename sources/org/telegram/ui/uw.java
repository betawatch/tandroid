package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uw implements e70 {
    public final /* synthetic */ py a;

    public uw(py pyVar) {
        this.a = pyVar;
    }

    @Override // org.telegram.ui.e70
    public final void a(f70 f70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        py pyVar = this.a;
        jy jyVar = pyVar.z2;
        if (pyVar.y2) {
            pyVar.removeSelfFromStack();
        }
        jyVar.v(pyVar, arrayList, null, true, pyVar.G2, pyVar.H2, pyVar.I2, null);
    }
}
