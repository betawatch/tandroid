package rh;

import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.px0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new l5((e6) this.b, tLObject, (Runnable) this.c, 0));
                break;
            case 1:
                th.s0 s0Var = (th.s0) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    vp.r1(s0Var.e).L3(updates, false);
                    break;
                }
                break;
            case 2:
                th.u2 u2Var = (th.u2) this.b;
                vh.w6 w6Var = (vh.w6) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    vp.r1(u2Var.x.l2).L3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new th.r2(w6Var, 0));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new l5((th.q4) this.b, tLObject, (Runnable) this.c, 8));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new px0((th.t4) this.b, tLObject, (q20) this.c, tL_error, 24));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new l5((th.x7) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 10));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new l5((s4.g0) this.b, (String) this.c, tLObject, 11));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new l5((vh.j2) this.b, tLObject, (vp) this.c, 14));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new l5((vh.r6) this.b, tLObject, (vp) this.c, 17));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new l5((boolean[]) this.b, tLObject, (xh.h1) this.c, 23));
                break;
            case 10:
                org.telegram.messenger.i0.g3(new l5((xh.z2) this.b, tLObject, (org.telegram.ui.ActionBar.x1) this.c, 26));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new xh.p2((zf.c) this.b, tL_error, (String) this.c, tLObject, 3));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new l5((s4.g0) this.b, (String) this.c, tLObject, 29));
                break;
            default:
                zf.n1 n1Var = (zf.n1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.i0.g3(new zf.k0(n1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 2));
                    break;
                }
                break;
        }
    }
}
