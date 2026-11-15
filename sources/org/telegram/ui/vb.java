package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc b;

    public /* synthetic */ vb(qc qcVar, int i7) {
        this.a = i7;
        this.b = qcVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                qc qcVar = this.b;
                qcVar.F = wallPaper;
                qcVar.G = wallPaper;
                qcVar.H = wallPaper;
                qcVar.e1(false);
                qcVar.h1(false);
                org.telegram.messenger.g0.i3(new wb(qcVar, 1), 350L);
                break;
            case 1:
                qc.a0(this.b, (org.telegram.messenger.e3) obj);
                break;
            default:
                this.b.d1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
