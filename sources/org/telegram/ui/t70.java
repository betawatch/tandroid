package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ t70(LaunchActivity launchActivity, TLObject tLObject, int[] iArr, int i10, f70 f70Var, Integer num, Integer num2, Long l4, Integer num3) {
        this.b = launchActivity;
        this.d = tLObject;
        this.f = iArr;
        this.e = i10;
        this.c = f70Var;
        this.h = num;
        this.n = num2;
        this.s = l4;
        this.r = num3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.e;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.n;
        Object obj4 = this.h;
        Object obj5 = this.c;
        Object obj6 = this.f;
        Object obj7 = this.d;
        Object obj8 = this.b;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                f70 f70Var = (f70) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj;
                Integer num3 = (Integer) obj2;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.vp.r1(launchActivity.O).P3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.e, f70Var, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        break;
                    }
                }
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                launchActivity.F0(org.telegram.ui.Components.s4.G(launchActivity, org.telegram.messenger.cd.L0(2131751455, null), org.telegram.messenger.cd.L0(2131748905, null)));
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                f70 f70Var2 = (f70) obj5;
                TLObject tLObject2 = (TLObject) obj7;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj6;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var2.run();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                if (tLObject2 != null) {
                    org.telegram.messenger.vp.r1(i11).V3(authorizationform.users, false);
                    launchActivity2.t0(new ll0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 2:
                se0 se0Var = (se0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.i iVar = (c5.i) obj5;
                c5.m mVar = (c5.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                hf0 hf0Var = se0Var.w;
                vh.d dVar = se0Var.b;
                org.telegram.messenger.f8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        if (tL_error != null) {
                            se0Var.e = tL_error.text;
                            new org.telegram.ui.Components.cc(hf0Var.Z, null).f0(tL_error, false);
                            break;
                        }
                    } else {
                        se0Var.e = "RESPONSE_FALSE";
                        new org.telegram.ui.Components.cc(hf0Var.Z, null).H(R.raw.error, org.telegram.messenger.cd.a0(null, null, 2131743903, "RESPONSE_FALSE"));
                        break;
                    }
                } else {
                    dVar.i(org.telegram.messenger.cd.a0(null, null, 2131745984, iVar.a), false, true);
                    dVar.g(i11 == 7 ? org.telegram.messenger.cd.L0(2131745988, null) : org.telegram.messenger.cd.H(',', "SMSFeePurchaseTextDays", i11), false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new bi.c(se0Var, mVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 10));
                    break;
                }
                break;
            default:
                rh.e6 e6Var = (rh.e6) obj8;
                ((boolean[]) obj7)[0] = true;
                e6Var.Z((org.telegram.messenger.jj) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new rh.n4(e6Var, (boolean[]) obj3, this.e, (org.telegram.messenger.q20) obj2, (org.telegram.messenger.q20) obj));
                break;
        }
    }

    public /* synthetic */ t70(LaunchActivity launchActivity, f70 f70Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.b = launchActivity;
        this.c = f70Var;
        this.d = tLObject;
        this.e = i10;
        this.f = authorizationform;
        this.h = getauthorizationform;
        this.n = str;
        this.r = str2;
        this.s = str3;
    }

    public /* synthetic */ t70(se0 se0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.i iVar, int i10, c5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.b = se0Var;
        this.d = tLObject;
        this.f = tL_error;
        this.c = iVar;
        this.e = i10;
        this.h = mVar;
        this.n = tL_inputStorePaymentAuthCode;
        this.r = str;
        this.s = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ t70(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.jj jjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, org.telegram.messenger.q20 q20Var, org.telegram.messenger.q20 q20Var2) {
        this.b = e6Var;
        this.d = zArr;
        this.f = jjVar;
        this.c = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.n = zArr2;
        this.e = i10;
        this.r = q20Var;
        this.s = q20Var2;
    }
}
