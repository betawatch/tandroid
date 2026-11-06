package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc b;

    public /* synthetic */ wb(rc rcVar, int i7) {
        this.a = i7;
        this.b = rcVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                rc rcVar = this.b;
                rcVar.E = wallPaper;
                rcVar.F = wallPaper;
                rcVar.G = wallPaper;
                rcVar.e1(false);
                rcVar.h1(false);
                org.telegram.messenger.g0.i3(new xb(rcVar, 1), 350L);
                break;
            case 1:
                rc.a0(this.b, (org.telegram.messenger.e3) obj);
                break;
            default:
                this.b.d1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
