package zf;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.q8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ vp f;
    public final /* synthetic */ x0 h;

    public s0(x0 x0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, vp vpVar) {
        this.h = x0Var;
        this.a = chat;
        this.b = str;
        this.c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f = vpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var = this.h;
        if (x0Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = vp.h1(this.a);
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
        int i11 = x0Var.i0 + 1;
        x0Var.i0 = i11;
        x0Var.j0 = ConnectionsManager.getInstance(x0Var.f).sendRequest(tL_channels_getParticipants, new q8(this, i11, this.d, this.e, this.f, 14));
    }
}
