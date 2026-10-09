package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ u1(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                s3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    s3Var.skipDismissAnimation();
                }
                s3Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                s3 s3Var2 = this.b;
                s3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    s3Var2.i1 = stargiftupgradepreview.sample_attributes;
                    s3Var2.j1 = stargiftupgradepreview.prices;
                    s3Var2.k1 = stargiftupgradepreview.next_prices;
                    s3Var2.c2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                s3 s3Var3 = this.b;
                s3Var3.L0 = false;
                s3Var3.M0 = true;
                if (savedStarGift != null) {
                    s3Var3.g1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = s3Var3.F0;
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
                        s3Var3.k2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
