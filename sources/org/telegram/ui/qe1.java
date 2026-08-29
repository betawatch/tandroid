package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sc1((ve1) this.c, (String) this.b, tLObject, 5));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lx0((cg1) this.c, tLObject, (String) this.b, tL_error, 13));
                break;
            case 2:
                cg1 cg1Var = (cg1) this.c;
                byte[] bArr = (byte[]) this.b;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new yf1(cg1Var, tL_error, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new wf1(cg1Var, bArr, 1));
                    break;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new t31(26, (wh1) this.c, (int[]) this.b));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0((boolean[]) this.c, tLObject, (ph.j1) this.b, 20));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0((ph.d3) this.c, tLObject, (org.telegram.ui.ActionBar.c2) this.b, 23));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new lx0((rf.c) this.c, tL_error, (String) this.b, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0((rf.v0) this.c, (String) this.b, tLObject, 26));
                break;
            case 8:
                rf.l1 l1Var = (rf.l1) this.c;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.b;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 29));
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new sf.a(this.c, tLObject, this.b, 2));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(27, (sf.f0) this.c, (org.telegram.ui.Components.i8) this.b));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sf.a(this.c, tLObject, this.b, 7));
                break;
        }
    }
}
