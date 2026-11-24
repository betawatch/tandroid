// default package

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class st0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ st0(au0 au0Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        this.d = au0Var;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z;
        this.c = j;
        this.n = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        ArrayList arrayList5;
        switch (this.a) {
            case 0:
                ((au0) this.d).t0((TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
            case 1:
                boolean z = true;
                hs6 hs6Var = (hs6) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z2 = this.b;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                vh6 vh6Var = (vh6) this.n;
                long j = this.c;
                hs6Var.getMessagesController().d4(arrayList6, z2);
                hs6Var.getMessagesController().X3(arrayList7, z2);
                int size = arrayList8.size();
                int i = 0;
                boolean z3 = false;
                while (i < size) {
                    k47 k47Var = (k47) arrayList8.get(i);
                    SparseArray sparseArray = (SparseArray) vh6Var.f(k47.B0(k47Var.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(k47Var.e1())) != null) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            k47 k47Var2 = (k47) arrayList.get(i2);
                            k47Var2.C = k47Var;
                            k47Var2.m();
                            TLRPC.MessageAction messageAction = k47Var2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                k47Var2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                k47Var2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                k47Var2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                k47Var2.p0(null, z);
                            }
                            i2++;
                            z = true;
                        }
                        z3 = true;
                    }
                    i++;
                    z = true;
                }
                if (z3) {
                    hs6Var.getNotificationCenter().k(56, Long.valueOf(j), arrayList8, vh6Var);
                    return;
                }
                return;
            case 2:
                n07 n07Var = (n07) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z4 = this.b;
                long j2 = this.c;
                p07 p07Var = (p07) this.h;
                n07Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z4) {
                        n07Var.a.put(j2, tL_messages_chatInviteImporters);
                    }
                }
                p07Var.run(tLObject, tL_error);
                return;
            case 3:
                jva jvaVar = (jva) this.d;
                jac jacVar = (jac) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.h;
                long j3 = this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.n;
                boolean z5 = this.b;
                if (jvaVar.e) {
                    jvaVar.f(tL_payments_paymentFormStarGift, starGift, j3, tL_textWithEntities, z5, jacVar);
                    return;
                } else {
                    jva.c("NO_BALANCE");
                    jacVar.a(Boolean.FALSE, null);
                    return;
                }
            default:
                b3c b3cVar = (b3c) this.d;
                x2c x2cVar = (x2c) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z6 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j4 = this.c;
                HashSet hashSet = (HashSet) this.h;
                synchronized (b3cVar) {
                    arrayList2 = x2cVar.b;
                    arrayList3 = x2cVar.d;
                    arrayList4 = x2cVar.c;
                    str = x2cVar.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList9 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList9.size());
                    for (int i3 = 0; i3 < min; i3++) {
                        ((nac) arrayList3.get(i3)).a(Boolean.valueOf(z6), (Integer) arrayList2.get(i3), s1c.L0((TLRPC.TL_textWithEntities) arrayList4.get(i3), arrayList9.get(i3)), str);
                    }
                } else {
                    if (tL_error2 == null) {
                        arrayList5 = arrayList3;
                    } else if ("TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                        int i4 = 0;
                        while (i4 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i4)).intValue();
                            nac nacVar = (nac) arrayList3.get(i4);
                            ArrayList arrayList10 = arrayList3;
                            String str2 = str;
                            s1c.D0(((TLRPC.TL_textWithEntities) arrayList4.get(i4)).text, null, str2, new n2c(b3cVar, nacVar, z6, intValue, str2, j4, (byte) 1));
                            i4++;
                            arrayList3 = arrayList10;
                            str = str2;
                            arrayList4 = arrayList4;
                        }
                    } else {
                        arrayList5 = arrayList3;
                        if ("TO_LANG_INVALID".equals(tL_error2.text)) {
                            b3cVar.K(j4, false);
                            nm7.e().k(nm7.T4, 1, jb6.M0(2131743633, null));
                        } else if ("QUOTA_EXCEEDED".equals(tL_error2.text)) {
                            nm7.e().k(nm7.T4, 1, jb6.M0(2131743634, null));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                        ((nac) arrayList5.get(i5)).a(Boolean.valueOf(z6), (Integer) arrayList2.get(i5), null, x2cVar.e);
                    }
                }
                synchronized (b3cVar) {
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        hashSet.remove(arrayList2.get(i6));
                    }
                }
                return;
        }
    }

    public /* synthetic */ st0(hs6 hs6Var, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, vh6 vh6Var, long j) {
        this.d = hs6Var;
        this.e = arrayList;
        this.b = z;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = vh6Var;
        this.c = j;
    }

    public /* synthetic */ st0(n07 n07Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, long j, p07 p07Var) {
        this.d = n07Var;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.b = z;
        this.c = j;
        this.h = p07Var;
    }

    public /* synthetic */ st0(jva jvaVar, jac jacVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        this.d = jvaVar;
        this.e = jacVar;
        this.f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.c = j;
        this.n = tL_textWithEntities;
        this.b = z;
    }

    public /* synthetic */ st0(b3c b3cVar, x2c x2cVar, TLObject tLObject, boolean z, TLRPC.TL_error tL_error, long j, HashSet hashSet) {
        this.d = b3cVar;
        this.f = x2cVar;
        this.n = tLObject;
        this.b = z;
        this.e = tL_error;
        this.c = j;
        this.h = hashSet;
    }
}
