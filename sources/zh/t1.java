package zh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ t1(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                r3 r3Var = this.b;
                r3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    r3Var.skipDismissAnimation();
                }
                r3Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                r3 r3Var2 = this.b;
                r3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    r3Var2.i1 = stargiftupgradepreview.sample_attributes;
                    r3Var2.j1 = stargiftupgradepreview.prices;
                    r3Var2.k1 = stargiftupgradepreview.next_prices;
                    r3Var2.c2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                r3 r3Var3 = this.b;
                r3Var3.L0 = false;
                r3Var3.M0 = true;
                if (savedStarGift != null) {
                    r3Var3.g1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = r3Var3.F0;
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
                        r3Var3.k2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
