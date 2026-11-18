package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements org.telegram.messenger.nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ri(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                bn bnVar = ((ti) this.c).b;
                if (i7 > 0 && bnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.lc.b0(bnVar).m(this.b ? org.telegram.ui.Components.kc.H : org.telegram.ui.Components.kc.J, i7, 0, 0, bnVar.Ba).j();
                    break;
                }
                break;
            default:
                si siVar = (si) this.c;
                bn bnVar2 = siVar.b.b;
                if (i7 < 50) {
                    bnVar2.Ta(bnVar2.s4, true);
                    break;
                } else {
                    TLRPC.Chat chat = bnVar2.e;
                    TLRPC.User user = bnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.b5.r(bnVar2, true, chat, user, false, false, false, z10, new w0(siVar, z10));
                    break;
                }
        }
    }
}
