package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ x1(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                y3 y3Var = this.b;
                y3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    y3Var.skipDismissAnimation();
                }
                y3Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                y3 y3Var2 = this.b;
                y3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    y3Var2.h1 = stargiftupgradepreview.sample_attributes;
                    y3Var2.i1 = stargiftupgradepreview.prices;
                    y3Var2.j1 = stargiftupgradepreview.next_prices;
                    y3Var2.b2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                y3 y3Var3 = this.b;
                y3Var3.K0 = false;
                y3Var3.L0 = true;
                if (savedStarGift != null) {
                    y3Var3.f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = y3Var3.E0;
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
                        y3Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
