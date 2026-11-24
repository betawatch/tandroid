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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zd implements ed, wu8, bi0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ zd(ci0 ci0Var, Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, nfd nfdVar) {
        this.a = (byte) 1;
        this.c = ci0Var;
        this.d = activity;
        this.b = j5Var;
        this.e = inputStorePaymentPurpose;
        this.f = list;
        this.h = nfdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        continue;
     */
    @Override // wu8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fi0 fi0Var, List list) {
        ci0 ci0Var = (ci0) this.c;
        Activity activity = (Activity) this.d;
        j5 j5Var = (j5) this.b;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = (TLRPC.InputStorePaymentPurpose) this.e;
        List list2 = (List) this.f;
        nfd nfdVar = (nfd) this.h;
        if (fi0Var.a != 0) {
            StringBuilder sb = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
            sb.append(fi0Var.a);
            sb.append(" ");
            de9.s(fi0Var.c, sb);
            ci0Var.l(activity, j5Var, inputStorePaymentPurpose, list2, nfdVar, false);
            return;
        }
        fa4.b("BillingController.launchBillingFlow, checked consumables: OK");
        e57 e57Var = new e57((Object) ci0Var, (Object) activity, (Object) j5Var, (Object) inputStorePaymentPurpose, (Object) list2, (Object) nfdVar, (byte) 2);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            if (purchase.c.optBoolean("acknowledged", true)) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str = ((di0) it2.next()).a.c;
                        if (purchase.c().contains(str)) {
                            atomicInteger.incrementAndGet();
                            fa4.b("BillingController.launchBillingFlow, consuming " + purchase.b());
                            uh0 uh0Var = ci0Var.d;
                            String b = purchase.b();
                            if (b == null) {
                                w26.j("Purchase token must be set");
                                return;
                            } else {
                                ss2 ss2Var = new ss2();
                                ss2Var.a = b;
                                uh0Var.a(ss2Var, new kh(purchase, arrayList, str, atomicInteger, e57Var));
                            }
                        }
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                g1 a = fi0.a();
                a.a = 0;
                ci0Var.m(a.a(), Collections.singletonList(purchase), new nn6((Object) arrayList, (Object) atomicInteger, (Object) e57Var, (byte) 17));
            }
        }
        if (atomicInteger.get() == 0) {
            e57Var.run();
        }
    }

    @Override // bi0
    public final void b(fi0 fi0Var, List list) {
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
                tL_inputStorePaymentPremiumGiftCode.currency = ((kl8) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, ci0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (r0.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore, new kn0(obj3, (Object) list, (Object) fi0Var, obj2, obj, (Object) tL_inputStorePaymentPremiumGiftCode, (byte) 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj6;
                tL_inputStorePaymentPremiumGiveaway.currency = ((kl8) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, ci0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (r0.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore2, new kn0(obj3, (Object) list, (Object) fi0Var, obj2, obj, (Object) tL_inputStorePaymentPremiumGiveaway, (byte) 0));
                break;
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
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
                mu1 mu1Var = (mu1) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                k27 k27Var = (k27) obj2;
                ag2[] ag2VarArr = (ag2[]) obj;
                if (user != null) {
                    ad7 Y = ad7.Y(j5Var.a);
                    Y.a.c(new sa7(Y, mu1Var.a(), user.id, (byte) 3));
                } else {
                    ad7 Y2 = ad7.Y(j5Var.a);
                    Y2.a.c(new sa7(Y2, mu1Var.a(), -chat.id, (byte) 3));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = k27Var.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (ag2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (mu1Var.getParentActivity() != null) {
                        mu1Var.Z5();
                        UndoView undoView = mu1Var.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(j5Var.a).sendRequest(tL_contacts_blockFromReplies, new uf(j5Var, b2));
                break;
            default:
                gx7 gx7Var = (gx7) obj6;
                vx7 vx7Var = gx7Var.a;
                vx7Var.Z[0].setText((String) obj5);
                vx7Var.Z[1].setText((String) obj4);
                vx7Var.Z[2].setText((String) obj3);
                vx7Var.P1(true, true);
                gx7Var.c((oq7) obj2, (wk4) obj);
                break;
        }
    }

    public /* synthetic */ zd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ zd(TLRPC.User user, j5 j5Var, mu1 mu1Var, TLRPC.Chat chat, k27 k27Var, ag2[] ag2VarArr, wjb wjbVar) {
        this.a = (byte) 0;
        this.c = user;
        this.b = j5Var;
        this.d = mu1Var;
        this.e = chat;
        this.f = k27Var;
        this.h = ag2VarArr;
    }
}
