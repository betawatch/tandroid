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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo0 b;

    public /* synthetic */ rn0(xo0 xo0Var, int i10) {
        this.a = i10;
        this.b = xo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        xo0 xo0Var = this.b;
        switch (i10) {
            case 0:
                if (xo0Var.getParentActivity() != null) {
                    xo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                xo0 xo0Var2 = new xo0(xo0Var.b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 0, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.x0, xo0Var.I0, xo0Var.U0, null, xo0Var.r0, xo0Var.W0);
                xo0Var2.c1 = xo0Var.c1;
                xo0Var2.d1 = xo0Var.d1;
                xo0Var2.T = new co0(xo0Var);
                xo0Var.presentFragment(xo0Var2);
                break;
            case 2:
                xo0 xo0Var3 = new xo0(xo0Var.b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 0, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.x0, xo0Var.I0, xo0Var.U0, null, xo0Var.r0, xo0Var.W0);
                xo0Var3.c1 = xo0Var.c1;
                xo0Var3.d1 = xo0Var.d1;
                xo0Var3.T = new do0(xo0Var);
                xo0Var.presentFragment(xo0Var3);
                break;
            case 3:
                xo0 xo0Var4 = new xo0(xo0Var.b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 0, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.x0, xo0Var.I0, xo0Var.U0, null, xo0Var.r0, xo0Var.W0);
                xo0Var4.c1 = xo0Var.c1;
                xo0Var4.d1 = xo0Var.d1;
                xo0Var4.T = new eo0(xo0Var);
                xo0Var.presentFragment(xo0Var4);
                break;
            case 4:
                xo0 xo0Var5 = new xo0(xo0Var.b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 0, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.x0, xo0Var.I0, xo0Var.U0, null, xo0Var.r0, xo0Var.W0);
                xo0Var5.c1 = xo0Var.c1;
                xo0Var5.d1 = xo0Var.d1;
                xo0Var5.T = new fo0(xo0Var);
                xo0Var.presentFragment(xo0Var5);
                break;
            case 5:
                if (!xo0Var.P0) {
                    boolean z10 = !xo0Var.F;
                    xo0Var.F = z10;
                    xo0Var.V.setChecked(z10);
                    xo0Var.W.a(xo0Var.F, true);
                    break;
                }
                break;
            case 6:
                xo0.Z(xo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (xo0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.w1.h(R.string.TurnPasswordOffPassport, w.f.g(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new vn0(xo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                xo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(xo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !xo0Var.T0;
                xo0Var.T0 = z11;
                xo0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !xo0Var.U0;
                xo0Var.U0 = z12;
                xo0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !xo0Var.U0;
                xo0Var.U0 = z13;
                xo0Var.L.setChecked(z13);
                break;
            case 11:
                xo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = xo0Var.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    } else {
                        j6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                xo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = xo0.p0();
                    if (xo0Var.K0 == null || xo0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new ko0(xo0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new ko0(xo0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(xo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = xo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, xo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(xo0Var.L0)) {
                        jSONObject.put("countryCode", xo0Var.L0);
                    }
                    jSONObject.put("currencyCode", xo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", xo0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = xo0Var.e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                    e7.c = new mg.n(jVar, 20);
                    e7.d = new k6.c[]{v8.p.b};
                    e7.b = true;
                    e7.a = 23707;
                    v8.a.a(u0Var.e(1, e7.a()), xo0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                xo0Var.v0 = false;
                xo0Var.t0();
                break;
            default:
                xo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(xo0Var.f[0]);
                break;
        }
    }
}
