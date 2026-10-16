package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                fo foVar = ((sj) this.c).b;
                if (i10 > 0 && foVar.getParentActivity() != null) {
                    org.telegram.ui.Components.zc.a0(foVar).m(this.b ? org.telegram.ui.Components.yc.G : org.telegram.ui.Components.yc.I, i10, 0, 0, foVar.ea).j();
                    break;
                }
                break;
            default:
                rj rjVar = (rj) this.c;
                fo foVar2 = rjVar.b.b;
                if (i10 < 50) {
                    foVar2.va(foVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = foVar2.e;
                    TLRPC.User user = foVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.g5.r(foVar2, true, chat, user, false, false, false, z10, new b1(rjVar, z10));
                    break;
                }
        }
    }
}
