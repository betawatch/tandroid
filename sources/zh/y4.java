package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ y4(s5 s5Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = s5Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s5 s5Var = this.b;
                int i10 = s5Var.a;
                s5Var.A = false;
                TLObject tLObject = this.c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i10).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i10).putChats(starsStatus.chats, false);
                    s5Var.z.addAll(starsStatus.subscriptions);
                    s5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 1:
                s5 s5Var2 = this.b;
                int i11 = s5Var2.a;
                s5Var2.x = false;
                TLObject tLObject2 = this.c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i11).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i11).putChats(starsStatus2.chats, false);
                    s5Var2.v.addAll(starsStatus2.subscriptions);
                    s5Var2.y = (starsStatus2.flags & 4) == 0;
                    s5Var2.w = starsStatus2.subscriptions_next_offset;
                    s5Var2.k0(starsStatus2.balance);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.c;
                boolean z10 = tLObject3 instanceof Vector;
                final s5 s5Var3 = this.b;
                if (z10) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    s5Var3.i = true;
                }
                s5Var3.j = arrayList;
                s5Var3.h = false;
                NotificationCenter.getInstance(s5Var3.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    final int i13 = 0;
                    Runnable runnable = new Runnable() { // from class: zh.a5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i14 >= arrayList5.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i15 = 1;
                                            final s5 s5Var4 = s5Var3;
                                            billingController.queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i15) {
                                                        case 0:
                                                            final int i16 = 1;
                                                            final s5 s5Var5 = s5Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i16) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17 = 0; i17 < list2.size(); i17++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7 = arrayList6;
                                                                                            if (i18 >= arrayList7.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i18)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var6 = s5Var5;
                                                                                if (s5Var6.m != null) {
                                                                                    for (int i19 = 0; i19 < s5Var6.m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var6.m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var6.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList6;
                                                                                            if (i21 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var7 = s5Var5;
                                                                                if (s5Var7.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var7.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var7.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var7.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList6;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var5;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i17 = 2;
                                                            final s5 s5Var6 = s5Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i172 = 0; i172 < list2.size(); i172++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i172);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList7;
                                                                                            if (i18 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i18)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var62 = s5Var6;
                                                                                if (s5Var62.m != null) {
                                                                                    for (int i19 = 0; i19 < s5Var62.m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var62.m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList7;
                                                                                            if (i21 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var7 = s5Var6;
                                                                                if (s5Var7.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var7.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var7.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var7.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList7;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var6;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i18 = 0;
                                                            final s5 s5Var7 = s5Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i172 = 0; i172 < list2.size(); i172++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i172);
                                                                                        int i182 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList8;
                                                                                            if (i182 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i182)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i182);
                                                                                            } else {
                                                                                                i182++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var62 = s5Var7;
                                                                                if (s5Var62.m != null) {
                                                                                    for (int i19 = 0; i19 < s5Var62.m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var62.m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i21 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar = new c5.a();
                                            aVar.b = "inapp";
                                            aVar.a = ((TL_stars.TL_starsTopupOption) arrayList5.get(i14)).store_product;
                                            arrayList4.add(aVar.a());
                                            i14++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i16 >= arrayList7.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i17 = 2;
                                            final s5 s5Var5 = s5Var3;
                                            billingController2.queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i17) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final s5 s5Var52 = s5Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i172 = 0; i172 < list2.size(); i172++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i172);
                                                                                        int i182 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList62;
                                                                                            if (i182 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i182)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i182);
                                                                                            } else {
                                                                                                i182++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var62 = s5Var52;
                                                                                if (s5Var62.m != null) {
                                                                                    for (int i19 = 0; i19 < s5Var62.m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var62.m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i21 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var52;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList62;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var52;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final s5 s5Var6 = s5Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i182 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i182 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i182)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i182);
                                                                                            } else {
                                                                                                i182++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var62 = s5Var6;
                                                                                if (s5Var62.m != null) {
                                                                                    for (int i19 = 0; i19 < s5Var62.m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var62.m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i21 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var6;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList72;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var6;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i18 = 0;
                                                            final s5 s5Var7 = s5Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i182 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList8;
                                                                                            if (i182 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i182)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i182);
                                                                                            } else {
                                                                                                i182++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var62 = s5Var7;
                                                                                if (s5Var62.m != null) {
                                                                                    for (int i19 = 0; i19 < s5Var62.m.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var62.m.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i21 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i24 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = ((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product;
                                            arrayList6.add(aVar2.a());
                                            i16++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i18 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i18 >= arrayList9.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i19 = 0;
                                            final s5 s5Var6 = s5Var3;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final s5 s5Var52 = s5Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i182 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i182 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i182)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i182);
                                                                                            } else {
                                                                                                i182++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var62 = s5Var52;
                                                                                if (s5Var62.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var62.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var62.m.get(i192);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i21 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var52;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var52;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final s5 s5Var62 = s5Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i182 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i182 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i182)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i182);
                                                                                            } else {
                                                                                                i182++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i21 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i18)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable);
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.c;
                boolean z11 = tLObject4 instanceof Vector;
                final s5 s5Var4 = this.b;
                if (z11) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList6.get(i14);
                        i14++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    s5Var4.l = true;
                }
                s5Var4.m = arrayList4;
                s5Var4.k = false;
                NotificationCenter.getInstance(s5Var4.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final int i15 = 1;
                    Runnable runnable2 = new Runnable() { // from class: zh.a5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i142 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i142 >= arrayList52.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i152 = 1;
                                            final s5 s5Var42 = s5Var4;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i152) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final s5 s5Var52 = s5Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var52;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList62;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var52;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var52;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final s5 s5Var62 = s5Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar = new c5.a();
                                            aVar.b = "inapp";
                                            aVar.a = ((TL_stars.TL_starsTopupOption) arrayList52.get(i142)).store_product;
                                            arrayList42.add(aVar.a());
                                            i142++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i16 >= arrayList7.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i17 = 2;
                                            final s5 s5Var5 = s5Var4;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i17) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final s5 s5Var52 = s5Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var52;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var52;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var52;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final s5 s5Var62 = s5Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = ((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i16++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i18 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i18 >= arrayList9.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i19 = 0;
                                            final s5 s5Var6 = s5Var4;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final s5 s5Var52 = s5Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var52;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var52;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var52;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final s5 s5Var62 = s5Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i18)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable2);
                        break;
                    } else {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.c;
                boolean z12 = tLObject5 instanceof Vector;
                final s5 s5Var5 = this.b;
                if (z12) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj3 = arrayList9.get(i16);
                        i16++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    s5Var5.o = true;
                }
                s5Var5.p = arrayList7;
                s5Var5.n = false;
                NotificationCenter.getInstance(s5Var5.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final int i17 = 2;
                    Runnable runnable3 = new Runnable() { // from class: zh.a5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i142 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i142 >= arrayList52.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i152 = 1;
                                            final s5 s5Var42 = s5Var5;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i152) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final s5 s5Var52 = s5Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var52;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var52;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var52;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final s5 s5Var62 = s5Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar = new c5.a();
                                            aVar.b = "inapp";
                                            aVar.a = ((TL_stars.TL_starsTopupOption) arrayList52.get(i142)).store_product;
                                            arrayList42.add(aVar.a());
                                            i142++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i162 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i162 >= arrayList72.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i172 = 2;
                                            final s5 s5Var52 = s5Var5;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i172) {
                                                        case 0:
                                                            final int i1622 = 1;
                                                            final s5 s5Var522 = s5Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i1622) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1722 = 0; i1722 < list2.size(); i1722++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i1722);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1822 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var522;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var522;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var522;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i1722 = 2;
                                                            final s5 s5Var62 = s5Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i1722) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17222 = 0; i17222 < list2.size(); i17222++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i17222);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i1822 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList722;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17222 = 0; i17222 < list2.size(); i17222++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i17222);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList82;
                                                                                            if (i1822 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i24 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = ((TL_stars.TL_starsGiftOption) arrayList72.get(i162)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i162++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList82 = new ArrayList();
                                    int i18 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i18 >= arrayList92.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i19 = 0;
                                            final s5 s5Var6 = s5Var5;
                                            billingController3.queryProductDetails(arrayList82, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: zh.h4
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final c5.h hVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i1622 = 1;
                                                            final s5 s5Var522 = s5Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i1622) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17222 = 0; i17222 < list2.size(); i17222++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i17222);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList622;
                                                                                            if (i1822 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var522;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var522;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList622;
                                                                                            if (i24 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var522;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i1722 = 2;
                                                            final s5 s5Var62 = s5Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i1722) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17222 = 0; i17222 < list2.size(); i17222++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i17222);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i1822 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var62;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i21 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var62;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList722;
                                                                                            if (i24 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var62;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final s5 s5Var7 = s5Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.k a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.k a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.k a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            c5.h hVar2 = hVar;
                                                                            if (hVar2.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17222 = 0; i17222 < list2.size(); i17222++) {
                                                                                        c5.o oVar = (c5.o) list2.get(i17222);
                                                                                        int i1822 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList822;
                                                                                            if (i1822 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1822)).store_product.equals(oVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1822);
                                                                                            } else {
                                                                                                i1822++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = oVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var622 = s5Var7;
                                                                                if (s5Var622.m != null) {
                                                                                    for (int i192 = 0; i192 < s5Var622.m.size(); i192++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) s5Var622.m.get(i192);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            c5.h hVar3 = hVar;
                                                                            if (hVar3.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                        c5.o oVar2 = (c5.o) list3.get(i20);
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8222 = arrayList822;
                                                                                            if (i21 >= arrayList8222.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i21)).store_product.equals(oVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = oVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var72 = s5Var7;
                                                                                if (s5Var72.p != null) {
                                                                                    for (int i22 = 0; i22 < s5Var72.p.size(); i22++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) s5Var72.p.get(i22);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            c5.h hVar4 = hVar;
                                                                            if (hVar4.a != 0) {
                                                                                s5.e("BILLING_" + BillingController.getResponseCodeString(hVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i23 = 0; i23 < list4.size(); i23++) {
                                                                                        c5.o oVar3 = (c5.o) list4.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList822;
                                                                                            if (i24 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i24)).store_product.equals(oVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = oVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                s5 s5Var8 = s5Var7;
                                                                                if (s5Var8.j != null) {
                                                                                    for (int i25 = 0; i25 < s5Var8.j.size(); i25++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) s5Var8.j.get(i25);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(s5Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i18)).store_product;
                                            arrayList82.add(aVar3.a());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                MessagesController.getInstance(this.b.a).processUpdates((TLRPC.Updates) this.c, false);
                break;
        }
    }
}
