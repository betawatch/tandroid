package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ ub(pc pcVar, int i3) {
        this.a = i3;
        this.b = pcVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                pc pcVar = this.b;
                pcVar.F = wallPaper;
                pcVar.G = wallPaper;
                pcVar.H = wallPaper;
                pcVar.e1(false);
                pcVar.h1(false);
                org.telegram.messenger.g0.i3(new vb(pcVar, 1), 350L);
                break;
            case 1:
                pc.a0(this.b, (org.telegram.messenger.e3) obj);
                break;
            default:
                this.b.d1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
