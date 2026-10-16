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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ un0(ap0 ap0Var, int i10) {
        this.a = i10;
        this.b = ap0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ap0 ap0Var = this.b;
        switch (i10) {
            case 0:
                if (ap0Var.getParentActivity() != null) {
                    ap0Var.G0(null);
                    break;
                }
                break;
            case 1:
                ap0 ap0Var2 = new ap0(ap0Var.b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.x0, ap0Var.I0, ap0Var.U0, null, ap0Var.r0, ap0Var.W0);
                ap0Var2.c1 = ap0Var.c1;
                ap0Var2.d1 = ap0Var.d1;
                ap0Var2.T = new fo0(ap0Var);
                ap0Var.presentFragment(ap0Var2);
                break;
            case 2:
                ap0 ap0Var3 = new ap0(ap0Var.b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.x0, ap0Var.I0, ap0Var.U0, null, ap0Var.r0, ap0Var.W0);
                ap0Var3.c1 = ap0Var.c1;
                ap0Var3.d1 = ap0Var.d1;
                ap0Var3.T = new go0(ap0Var);
                ap0Var.presentFragment(ap0Var3);
                break;
            case 3:
                ap0 ap0Var4 = new ap0(ap0Var.b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.x0, ap0Var.I0, ap0Var.U0, null, ap0Var.r0, ap0Var.W0);
                ap0Var4.c1 = ap0Var.c1;
                ap0Var4.d1 = ap0Var.d1;
                ap0Var4.T = new ho0(ap0Var);
                ap0Var.presentFragment(ap0Var4);
                break;
            case 4:
                ap0 ap0Var5 = new ap0(ap0Var.b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.x0, ap0Var.I0, ap0Var.U0, null, ap0Var.r0, ap0Var.W0);
                ap0Var5.c1 = ap0Var.c1;
                ap0Var5.d1 = ap0Var.d1;
                ap0Var5.T = new io0(ap0Var);
                ap0Var.presentFragment(ap0Var5);
                break;
            case 5:
                if (!ap0Var.P0) {
                    boolean z10 = !ap0Var.F;
                    ap0Var.F = z10;
                    ap0Var.V.setChecked(z10);
                    ap0Var.W.a(ap0Var.F, true);
                    break;
                }
                break;
            case 6:
                ap0.Z(ap0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ap0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (ap0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.g0.g(R.string.TurnPasswordOffPassport, t8.b.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.T = string;
                a2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new yn0(ap0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ap0Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !ap0Var.T0;
                ap0Var.T0 = z11;
                ap0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !ap0Var.U0;
                ap0Var.U0 = z12;
                ap0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !ap0Var.U0;
                ap0Var.U0 = z13;
                ap0Var.L.setChecked(z13);
                break;
            case 11:
                ap0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = ap0Var.h;
                    if (i11 >= k6VarArr.length) {
                        break;
                    } else {
                        k6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                ap0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = ap0.p0();
                    if (ap0Var.K0 == null || ap0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new no0(ap0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new no0(ap0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ap0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ap0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, ap0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ap0Var.L0)) {
                        jSONObject.put("countryCode", ap0Var.L0);
                    }
                    jSONObject.put("currencyCode", ap0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ap0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = ap0Var.e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.c = new m.h(jVar, 22);
                    b10.d = new k6.c[]{v8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    v8.a.a(u0Var.e(1, b10.a()), ap0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ap0Var.v0 = false;
                ap0Var.t0();
                break;
            default:
                ap0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(ap0Var.f[0]);
                break;
        }
    }
}
