package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;

    public /* synthetic */ zm0(go0 go0Var, int i10) {
        this.a = i10;
        this.b = go0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        go0 go0Var = this.b;
        switch (i10) {
            case 0:
                if (go0Var.getParentActivity() != null) {
                    go0Var.G0(null);
                    break;
                }
                break;
            case 1:
                go0 go0Var2 = new go0(go0Var.b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.x0, go0Var.I0, go0Var.U0, null, go0Var.r0, go0Var.W0);
                go0Var2.c1 = go0Var.c1;
                go0Var2.d1 = go0Var.d1;
                go0Var2.T = new ln0(go0Var);
                go0Var.presentFragment(go0Var2);
                break;
            case 2:
                go0 go0Var3 = new go0(go0Var.b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.x0, go0Var.I0, go0Var.U0, null, go0Var.r0, go0Var.W0);
                go0Var3.c1 = go0Var.c1;
                go0Var3.d1 = go0Var.d1;
                go0Var3.T = new mn0(go0Var);
                go0Var.presentFragment(go0Var3);
                break;
            case 3:
                go0 go0Var4 = new go0(go0Var.b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.x0, go0Var.I0, go0Var.U0, null, go0Var.r0, go0Var.W0);
                go0Var4.c1 = go0Var.c1;
                go0Var4.d1 = go0Var.d1;
                go0Var4.T = new nn0(go0Var);
                go0Var.presentFragment(go0Var4);
                break;
            case 4:
                go0 go0Var5 = new go0(go0Var.b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.x0, go0Var.I0, go0Var.U0, null, go0Var.r0, go0Var.W0);
                go0Var5.c1 = go0Var.c1;
                go0Var5.d1 = go0Var.d1;
                go0Var5.T = new on0(go0Var);
                go0Var.presentFragment(go0Var5);
                break;
            case 5:
                if (!go0Var.P0) {
                    boolean z10 = !go0Var.F;
                    go0Var.F = z10;
                    go0Var.V.setChecked(z10);
                    go0Var.W.a(go0Var.F, true);
                    break;
                }
                break;
            case 6:
                go0.Z(go0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(go0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (go0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.g0.g(R.string.TurnPasswordOffPassport, r4.c.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new dn0(go0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                go0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(go0Var.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !go0Var.T0;
                go0Var.T0 = z11;
                go0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !go0Var.U0;
                go0Var.U0 = z12;
                go0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !go0Var.U0;
                go0Var.U0 = z13;
                go0Var.L.setChecked(z13);
                break;
            case 11:
                go0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = go0Var.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    } else {
                        j6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                go0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = go0.p0();
                    if (go0Var.K0 == null || go0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new tn0(go0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new tn0(go0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(go0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = go0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, go0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(go0Var.L0)) {
                        jSONObject.put("countryCode", go0Var.L0);
                    }
                    jSONObject.put("currencyCode", go0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", go0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = go0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.c = new l2.f(jVar, 24);
                    b10.d = new k6.c[]{v8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), go0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                go0Var.v0 = false;
                go0Var.t0();
                break;
            default:
                go0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(go0Var.f[0]);
                break;
        }
    }
}
