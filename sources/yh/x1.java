package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ x1(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                a4 a4Var = this.b;
                a4Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    a4Var.skipDismissAnimation();
                }
                a4Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                a4 a4Var2 = this.b;
                a4Var2.getClass();
                if (stargiftupgradepreview != null) {
                    a4Var2.h1 = stargiftupgradepreview.sample_attributes;
                    a4Var2.i1 = stargiftupgradepreview.prices;
                    a4Var2.j1 = stargiftupgradepreview.next_prices;
                    a4Var2.b2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                a4 a4Var3 = this.b;
                a4Var3.K0 = false;
                a4Var3.L0 = true;
                if (savedStarGift != null) {
                    a4Var3.f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = a4Var3.E0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z10 = tL_messageActionStarGiftUnique.saved;
                            boolean z11 = !savedStarGift.unsaved;
                            if (z10 != z11) {
                                tL_messageActionStarGiftUnique.saved = z11;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z12 = tL_messageActionStarGift.saved;
                            boolean z13 = !savedStarGift.unsaved;
                            if (z12 != z13) {
                                tL_messageActionStarGift.saved = z13;
                            }
                        }
                        a4Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
