// default package

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rz3 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rz3(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // qac
    public final void a(Object obj) {
        int i;
        long j;
        byte b = this.a;
        long j2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) obj2;
                osc oscVar = (osc) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(j2), oscVar));
                    break;
                }
                break;
            case 1:
                u0b u0bVar = (u0b) obj2;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    nm7.f(z8c.t0).d(new hq6((Object) u0bVar, (Object) tL_messages_emojiGroups, this.b, (byte) 28));
                    break;
                }
                break;
            case 2:
                v7b v7bVar = (v7b) obj2;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                he heVar = v7bVar.H;
                if (heVar != null) {
                    heVar.b(350L);
                    v7bVar.H = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    while (i < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j = pg3.n(peer);
                            i = j < 0 ? i + 1 : 0;
                        } else {
                            j = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    v7bVar.e(j2, tL_chatParticipants);
                    break;
                }
                break;
            default:
                gm.d3(new qhc(obj2, obj, (byte) 7), Math.max(0L, (j2 + 1200) - SystemClock.uptimeMillis()));
                break;
        }
    }
}
