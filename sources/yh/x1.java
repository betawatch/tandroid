package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ x1(z3 z3Var, int i10) {
        this.a = i10;
        this.b = z3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                z3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    z3Var.skipDismissAnimation();
                }
                z3Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                z3 z3Var2 = this.b;
                z3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    z3Var2.h1 = stargiftupgradepreview.sample_attributes;
                    z3Var2.i1 = stargiftupgradepreview.prices;
                    z3Var2.j1 = stargiftupgradepreview.next_prices;
                    z3Var2.b2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                z3 z3Var3 = this.b;
                z3Var3.K0 = false;
                z3Var3.L0 = true;
                if (savedStarGift != null) {
                    z3Var3.f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = z3Var3.E0;
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
                        z3Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
