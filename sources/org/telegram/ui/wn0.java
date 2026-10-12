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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public /* synthetic */ wn0(cp0 cp0Var, int i10) {
        this.a = i10;
        this.b = cp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        cp0 cp0Var = this.b;
        switch (i10) {
            case 0:
                if (cp0Var.getParentActivity() != null) {
                    cp0Var.G0(null);
                    break;
                }
                break;
            case 1:
                cp0 cp0Var2 = new cp0(cp0Var.b1, cp0Var.C0, cp0Var.N0, cp0Var.O0, 0, cp0Var.E0, cp0Var.G0, cp0Var.H0, null, cp0Var.x0, cp0Var.I0, cp0Var.U0, null, cp0Var.r0, cp0Var.W0);
                cp0Var2.c1 = cp0Var.c1;
                cp0Var2.d1 = cp0Var.d1;
                cp0Var2.T = new ho0(cp0Var);
                cp0Var.presentFragment(cp0Var2);
                break;
            case 2:
                cp0 cp0Var3 = new cp0(cp0Var.b1, cp0Var.C0, cp0Var.N0, cp0Var.O0, 0, cp0Var.E0, cp0Var.G0, cp0Var.H0, null, cp0Var.x0, cp0Var.I0, cp0Var.U0, null, cp0Var.r0, cp0Var.W0);
                cp0Var3.c1 = cp0Var.c1;
                cp0Var3.d1 = cp0Var.d1;
                cp0Var3.T = new io0(cp0Var);
                cp0Var.presentFragment(cp0Var3);
                break;
            case 3:
                cp0 cp0Var4 = new cp0(cp0Var.b1, cp0Var.C0, cp0Var.N0, cp0Var.O0, 0, cp0Var.E0, cp0Var.G0, cp0Var.H0, null, cp0Var.x0, cp0Var.I0, cp0Var.U0, null, cp0Var.r0, cp0Var.W0);
                cp0Var4.c1 = cp0Var.c1;
                cp0Var4.d1 = cp0Var.d1;
                cp0Var4.T = new jo0(cp0Var);
                cp0Var.presentFragment(cp0Var4);
                break;
            case 4:
                cp0 cp0Var5 = new cp0(cp0Var.b1, cp0Var.C0, cp0Var.N0, cp0Var.O0, 0, cp0Var.E0, cp0Var.G0, cp0Var.H0, null, cp0Var.x0, cp0Var.I0, cp0Var.U0, null, cp0Var.r0, cp0Var.W0);
                cp0Var5.c1 = cp0Var.c1;
                cp0Var5.d1 = cp0Var.d1;
                cp0Var5.T = new ko0(cp0Var);
                cp0Var.presentFragment(cp0Var5);
                break;
            case 5:
                if (!cp0Var.P0) {
                    boolean z10 = !cp0Var.F;
                    cp0Var.F = z10;
                    cp0Var.V.setChecked(z10);
                    cp0Var.W.a(cp0Var.F, true);
                    break;
                }
                break;
            case 6:
                cp0.Z(cp0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cp0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (cp0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.q.h(R.string.TurnPasswordOffPassport, t8.b.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.T = string;
                a2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new ao0(cp0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                cp0Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(cp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !cp0Var.T0;
                cp0Var.T0 = z11;
                cp0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !cp0Var.U0;
                cp0Var.U0 = z12;
                cp0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !cp0Var.U0;
                cp0Var.U0 = z13;
                cp0Var.L.setChecked(z13);
                break;
            case 11:
                cp0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = cp0Var.h;
                    if (i11 >= k6VarArr.length) {
                        break;
                    } else {
                        k6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                cp0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = cp0.p0();
                    if (cp0Var.K0 == null || cp0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new po0(cp0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new po0(cp0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(cp0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = cp0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, cp0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(cp0Var.L0)) {
                        jSONObject.put("countryCode", cp0Var.L0);
                    }
                    jSONObject.put("currencyCode", cp0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", cp0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = cp0Var.e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.c = new ji.d4(jVar, 29);
                    b10.d = new k6.c[]{v8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    v8.a.a(u0Var.e(1, b10.a()), cp0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                cp0Var.v0 = false;
                cp0Var.t0();
                break;
            default:
                cp0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(cp0Var.f[0]);
                break;
        }
    }
}
