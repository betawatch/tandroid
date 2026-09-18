package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sw(wy wyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.b = c2Var;
        this.e = user;
        this.f = chat;
        this.c = j3;
        this.g = tL_messages_checkHistoryImportPeer;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gw((wy) this.d, this.b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f, this.c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gw((yh.a4) this.d, (nf.e) this.e, this.b, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.c, (CharSequence) this.g));
                break;
        }
    }

    public /* synthetic */ sw(yh.a4 a4Var, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = a4Var;
        this.e = eVar;
        this.b = c2Var;
        this.f = tL_starGiftUnique;
        this.c = j3;
        this.g = charSequence;
    }
}
