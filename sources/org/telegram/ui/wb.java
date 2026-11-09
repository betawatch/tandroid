package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
