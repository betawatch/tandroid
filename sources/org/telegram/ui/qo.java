package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, id0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo b;

    public /* synthetic */ qo(zo zoVar, int i10) {
        this.a = i10;
        this.b = zoVar;
    }

    @Override // org.telegram.ui.id0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        zo zoVar = this.b;
        TLRPC.ChatFull chatFull = zoVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        zoVar.p0(false, true);
        zoVar.getMessagesController().loadFullChat(zoVar.w0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.j0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
                this.b.j0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        zo zoVar = this.b;
        zoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            zoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-zoVar.w0));
        } else {
            zoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        zoVar.finishFragment();
        zoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-zoVar.x0.id), null, zoVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j10));
                break;
            default:
                zo zoVar = this.b;
                if (j10 == 0) {
                    zoVar.N0 = false;
                    break;
                } else {
                    zoVar.w0 = j10;
                    zoVar.x0 = zoVar.getMessagesController().getChat(Long.valueOf(j10));
                    zoVar.N0 = false;
                    TLRPC.ChatFull chatFull = zoVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    zoVar.j0();
                    break;
                }
        }
    }
}
