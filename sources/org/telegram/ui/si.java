package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class si implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ si(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                cn cnVar = ((ui) this.c).b;
                if (i7 > 0 && cnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.gc.a0(cnVar).m(this.b ? org.telegram.ui.Components.fc.G : org.telegram.ui.Components.fc.I, i7, 0, 0, cnVar.za).j();
                    break;
                }
                break;
            default:
                ti tiVar = (ti) this.c;
                cn cnVar2 = tiVar.b.b;
                if (i7 < 50) {
                    cnVar2.Sa(cnVar2.r4, true);
                    break;
                } else {
                    TLRPC.Chat chat = cnVar2.e;
                    TLRPC.User user = cnVar2.f;
                    boolean z9 = this.b;
                    org.telegram.ui.Components.u4.r(cnVar2, true, chat, user, false, false, false, z9, new w0(tiVar, z9));
                    break;
                }
        }
    }
}
