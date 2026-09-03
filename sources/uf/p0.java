package uf;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p0 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ MessagesController f;
    public final /* synthetic */ u0 h;

    public p0(u0 u0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = u0Var;
        this.a = chat;
        this.b = str;
        this.c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u0 u0Var = this.h;
        if (u0Var.B != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j10 = this.c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = u0Var.f0 + 1;
        u0Var.f0 = i11;
        u0Var.g0 = ConnectionsManager.getInstance(u0Var.f).sendRequest(tL_channels_getParticipants, new lf.i0(this, i11, this.d, this.e, this.f, 13));
    }
}
