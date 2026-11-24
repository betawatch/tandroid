// default package

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements ee, xw8, bj0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ze(cj0 cj0Var, Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ohd ohdVar) {
        this.a = (byte) 1;
        this.c = cj0Var;
        this.d = activity;
        this.b = j5Var;
        this.e = inputStorePaymentPurpose;
        this.f = list;
        this.h = ohdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        continue;
     */
    @Override // xw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fj0 fj0Var, List list) {
        cj0 cj0Var = (cj0) this.c;
        Activity activity = (Activity) this.d;
        j5 j5Var = (j5) this.b;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = (TLRPC.InputStorePaymentPurpose) this.e;
        List list2 = (List) this.f;
        ohd ohdVar = (ohd) this.h;
        if (fj0Var.a != 0) {
            StringBuilder sb = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
            sb.append(fj0Var.a);
            sb.append(" ");
            hg9.r(fj0Var.c, sb);
            cj0Var.l(activity, j5Var, inputStorePaymentPurpose, list2, ohdVar, false);
            return;
        }
        fc4.b("BillingController.launchBillingFlow, checked consumables: OK");
        e77 e77Var = new e77((Object) cj0Var, (Object) activity, (Object) j5Var, (Object) inputStorePaymentPurpose, (Object) list2, (Object) ohdVar, (byte) 2);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            if (purchase.c.optBoolean("acknowledged", true)) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str = ((dj0) it2.next()).a.c;
                        if (purchase.c().contains(str)) {
                            atomicInteger.incrementAndGet();
                            fc4.b("BillingController.launchBillingFlow, consuming " + purchase.b());
                            ui0 ui0Var = cj0Var.d;
                            String b = purchase.b();
                            if (b == null) {
                                u36.j("Purchase token must be set");
                                return;
                            } else {
                                du2 du2Var = new du2();
                                du2Var.b = b;
                                ui0Var.a(du2Var, new ki(purchase, arrayList, str, atomicInteger, e77Var));
                            }
                        }
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                g1 a = fj0.a();
                a.a = 0;
                cj0Var.m(a.a(), Collections.singletonList(purchase), new op6((Object) arrayList, (Object) atomicInteger, (Object) e77Var, (byte) 17));
            }
        }
        if (atomicInteger.get() == 0) {
            e77Var.run();
        }
    }

    @Override // bj0
    public final void b(fj0 fj0Var, List list) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj6;
                tL_inputStorePaymentPremiumGiftCode.currency = ((ln8) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, cj0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (r0.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore, new ko0(obj3, (Object) list, (Object) fj0Var, obj2, obj, (Object) tL_inputStorePaymentPremiumGiftCode, (byte) 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj6;
                tL_inputStorePaymentPremiumGiveaway.currency = ((ln8) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, cj0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (r0.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore2, new ko0(obj3, (Object) list, (Object) fj0Var, obj2, obj, (Object) tL_inputStorePaymentPremiumGiveaway, (byte) 0));
                break;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj6;
                j5 j5Var = (j5) obj5;
                yv1 yv1Var = (yv1) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                k47 k47Var = (k47) obj2;
                oh2[] oh2VarArr = (oh2[]) obj;
                if (user != null) {
                    cf7 Y = cf7.Y(j5Var.a);
                    Y.a.c(new tc7(Y, yv1Var.a(), user.id, (byte) 3));
                } else {
                    cf7 Y2 = cf7.Y(j5Var.a);
                    Y2.a.c(new tc7(Y2, yv1Var.a(), -chat.id, (byte) 3));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = k47Var.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (oh2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (yv1Var.getParentActivity() != null) {
                        yv1Var.i6();
                        UndoView undoView = yv1Var.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(j5Var.a).sendRequest(tL_contacts_blockFromReplies, new tg(j5Var, b2));
                break;
            default:
                iz7 iz7Var = (iz7) obj6;
                xz7 xz7Var = iz7Var.a;
                xz7Var.Z[0].setText((String) obj5);
                xz7Var.Z[1].setText((String) obj4);
                xz7Var.Z[2].setText((String) obj3);
                xz7Var.Q1(true, true);
                iz7Var.c((kl7) obj2, (wm4) obj);
                break;
        }
    }

    public /* synthetic */ ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ ze(TLRPC.User user, j5 j5Var, yv1 yv1Var, TLRPC.Chat chat, k47 k47Var, oh2[] oh2VarArr, ylb ylbVar) {
        this.a = (byte) 0;
        this.c = user;
        this.b = j5Var;
        this.d = yv1Var;
        this.e = chat;
        this.f = k47Var;
        this.h = oh2VarArr;
    }
}
