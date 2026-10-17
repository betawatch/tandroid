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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo0 b;

    public /* synthetic */ zm0(fo0 fo0Var, int i10) {
        this.a = i10;
        this.b = fo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        fo0 fo0Var = this.b;
        switch (i10) {
            case 0:
                if (fo0Var.getParentActivity() != null) {
                    fo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                fo0 fo0Var2 = new fo0(fo0Var.b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.x0, fo0Var.I0, fo0Var.U0, null, fo0Var.r0, fo0Var.W0);
                fo0Var2.c1 = fo0Var.c1;
                fo0Var2.d1 = fo0Var.d1;
                fo0Var2.T = new kn0(fo0Var);
                fo0Var.presentFragment(fo0Var2);
                break;
            case 2:
                fo0 fo0Var3 = new fo0(fo0Var.b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.x0, fo0Var.I0, fo0Var.U0, null, fo0Var.r0, fo0Var.W0);
                fo0Var3.c1 = fo0Var.c1;
                fo0Var3.d1 = fo0Var.d1;
                fo0Var3.T = new ln0(fo0Var);
                fo0Var.presentFragment(fo0Var3);
                break;
            case 3:
                fo0 fo0Var4 = new fo0(fo0Var.b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.x0, fo0Var.I0, fo0Var.U0, null, fo0Var.r0, fo0Var.W0);
                fo0Var4.c1 = fo0Var.c1;
                fo0Var4.d1 = fo0Var.d1;
                fo0Var4.T = new mn0(fo0Var);
                fo0Var.presentFragment(fo0Var4);
                break;
            case 4:
                fo0 fo0Var5 = new fo0(fo0Var.b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.x0, fo0Var.I0, fo0Var.U0, null, fo0Var.r0, fo0Var.W0);
                fo0Var5.c1 = fo0Var.c1;
                fo0Var5.d1 = fo0Var.d1;
                fo0Var5.T = new nn0(fo0Var);
                fo0Var.presentFragment(fo0Var5);
                break;
            case 5:
                if (!fo0Var.P0) {
                    boolean z10 = !fo0Var.F;
                    fo0Var.F = z10;
                    fo0Var.V.setChecked(z10);
                    fo0Var.W.a(fo0Var.F, true);
                    break;
                }
                break;
            case 6:
                fo0.Z(fo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (fo0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, r.c.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new dn0(fo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                fo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(fo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !fo0Var.T0;
                fo0Var.T0 = z11;
                fo0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !fo0Var.U0;
                fo0Var.U0 = z12;
                fo0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !fo0Var.U0;
                fo0Var.U0 = z13;
                fo0Var.L.setChecked(z13);
                break;
            case 11:
                fo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = fo0Var.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    } else {
                        j6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                fo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = fo0.p0();
                    if (fo0Var.K0 == null || fo0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new sn0(fo0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new sn0(fo0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(fo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = fo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, fo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(fo0Var.L0)) {
                        jSONObject.put("countryCode", fo0Var.L0);
                    }
                    jSONObject.put("currencyCode", fo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", fo0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = fo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.c = new l2.f(jVar, 24);
                    b10.d = new k6.c[]{v8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), fo0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                fo0Var.v0 = false;
                fo0Var.t0();
                break;
            default:
                fo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(fo0Var.f[0]);
                break;
        }
    }
}
