package rh;

import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ w1(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                e4Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    e4Var.N0 = true;
                }
                e4Var.dismiss();
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                e4 e4Var2 = this.b;
                e4Var2.getClass();
                if (stargiftupgradepreview != null) {
                    e4Var2.g3 = stargiftupgradepreview.sample_attributes;
                    e4Var2.h3 = stargiftupgradepreview.prices;
                    e4Var2.i3 = stargiftupgradepreview.next_prices;
                    e4Var2.a2();
                    break;
                }
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                e4 e4Var3 = this.b;
                e4Var3.F2 = false;
                e4Var3.G2 = true;
                if (savedStarGift != null) {
                    e4Var3.e3 = Boolean.valueOf(savedStarGift.unsaved);
                    jj jjVar = e4Var3.z2;
                    if (jjVar != null && (message = jjVar.k) != null) {
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
                        e4Var3.i2(jjVar, null);
                        break;
                    }
                }
                break;
        }
    }
}
