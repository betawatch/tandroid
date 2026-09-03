package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sg1(4, (ri1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.m1) this.b, (String) this.c, tLObject, 11));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.z2) this.b, tLObject, (MessagesController) this.c, 14));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.y7) this.b, tLObject, (MessagesController) this.c, 17));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((boolean[]) this.b, tLObject, (rh.j1) this.c, 21));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((rh.d3) this.b, tLObject, (org.telegram.ui.ActionBar.d2) this.c, 24));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new dy0(this.b, (Object) tL_error, (String) this.c, (Object) tLObject, 21));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((tf.u0) this.b, (String) this.c, tLObject, 27));
                break;
            case 8:
                tf.l1 l1Var = (tf.l1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new tf.k1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 0));
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new tf.k1((uf.t) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 3));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new uf.d0(0, (uf.f0) this.b, (org.telegram.ui.Components.dw) this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tf.k1((uf.s1) this.b, tLObject, (SharedPreferences) this.c, 8));
                break;
        }
    }
}
