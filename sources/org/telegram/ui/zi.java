package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zi(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        switch (this.a) {
            case 0:
                qn qnVar = ((bj) this.c).b;
                if (i9 > 0 && qnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.oc.a0(qnVar).m(this.b ? org.telegram.ui.Components.nc.C : org.telegram.ui.Components.nc.E, i9, 0, 0, qnVar.aa).j();
                    break;
                }
                break;
            default:
                aj ajVar = (aj) this.c;
                qn qnVar2 = ajVar.b.b;
                if (i9 < 50) {
                    qnVar2.qa(qnVar2.Z3, true);
                    break;
                } else {
                    TLRPC.Chat chat = qnVar2.e;
                    TLRPC.User user = qnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.y4.s(qnVar2, true, chat, user, false, false, false, z10, new b1(ajVar, z10));
                    break;
                }
        }
    }
}
