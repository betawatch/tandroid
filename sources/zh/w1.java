package zh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ w1(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    w3Var.skipDismissAnimation();
                }
                w3Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                w3 w3Var2 = this.b;
                w3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    w3Var2.h1 = stargiftupgradepreview.sample_attributes;
                    w3Var2.i1 = stargiftupgradepreview.prices;
                    w3Var2.j1 = stargiftupgradepreview.next_prices;
                    w3Var2.b2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                w3 w3Var3 = this.b;
                w3Var3.K0 = false;
                w3Var3.L0 = true;
                if (savedStarGift != null) {
                    w3Var3.f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = w3Var3.E0;
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
                        w3Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
