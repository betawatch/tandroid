// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class th1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;

    public /* synthetic */ th1(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final qac qacVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new uh1(tLObject, qacVar, tL_error));
                break;
            case 1:
                qacVar.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                break;
            case 2:
                final byte b2 = 0;
                gm.c3(new Runnable() { // from class: rua
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        byte b3 = b2;
                        qac qacVar2 = qacVar;
                        TLObject tLObject2 = tLObject;
                        switch (b3) {
                            case 0:
                                if (!(tLObject2 instanceof TL_account.paidMessagesRevenue)) {
                                    qacVar2.a(0L);
                                    break;
                                } else {
                                    qacVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    break;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hs6.d0(z8c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hs6.d0(z8c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hs6.d0(z8c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                qacVar2.a(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: rua
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        byte b32 = b3;
                        qac qacVar2 = qacVar;
                        TLObject tLObject2 = tLObject;
                        switch (b32) {
                            case 0:
                                if (!(tLObject2 instanceof TL_account.paidMessagesRevenue)) {
                                    qacVar2.a(0L);
                                    break;
                                } else {
                                    qacVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    break;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hs6.d0(z8c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hs6.d0(z8c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hs6.d0(z8c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                qacVar2.a(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
