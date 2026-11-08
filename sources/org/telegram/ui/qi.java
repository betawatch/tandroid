package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                an anVar = ((si) this.c).b;
                if (i7 > 0 && anVar.getParentActivity() != null) {
                    org.telegram.ui.Components.hc.a0(anVar).m(this.b ? org.telegram.ui.Components.gc.G : org.telegram.ui.Components.gc.I, i7, 0, 0, anVar.xa).j();
                    break;
                }
                break;
            default:
                ri riVar = (ri) this.c;
                an anVar2 = riVar.b.b;
                if (i7 < 50) {
                    anVar2.Qa(anVar2.r4, true);
                    break;
                } else {
                    TLRPC.Chat chat = anVar2.e;
                    TLRPC.User user = anVar2.f;
                    boolean z9 = this.b;
                    org.telegram.ui.Components.v4.r(anVar2, true, chat, user, false, false, false, z9, new w0(riVar, z9));
                    break;
                }
        }
    }
}
