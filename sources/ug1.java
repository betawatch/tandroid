// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;

    public /* synthetic */ ug1(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final pcc pccVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new vg1(tLObject, pccVar, tL_error));
                break;
            case 1:
                pccVar.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                break;
            case 2:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: swa
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        byte b3 = b2;
                        pcc pccVar2 = pccVar;
                        TLObject tLObject2 = tLObject;
                        switch (b3) {
                            case 0:
                                if (!(tLObject2 instanceof TL_account.paidMessagesRevenue)) {
                                    pccVar2.a(0L);
                                    break;
                                } else {
                                    pccVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    break;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    ls6.d0(yac.t0).L1(tL_messages_stickerSet, true);
                                    if (!ls6.d0(yac.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        ls6.d0(yac.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                pccVar2.a(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: swa
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        byte b32 = b3;
                        pcc pccVar2 = pccVar;
                        TLObject tLObject2 = tLObject;
                        switch (b32) {
                            case 0:
                                if (!(tLObject2 instanceof TL_account.paidMessagesRevenue)) {
                                    pccVar2.a(0L);
                                    break;
                                } else {
                                    pccVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    break;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    ls6.d0(yac.t0).L1(tL_messages_stickerSet, true);
                                    if (!ls6.d0(yac.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        ls6.d0(yac.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                pccVar2.a(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
