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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;

    public /* synthetic */ qn0(wo0 wo0Var, int i10) {
        this.a = i10;
        this.b = wo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        wo0 wo0Var = this.b;
        switch (i10) {
            case 0:
                if (wo0Var.getParentActivity() != null) {
                    wo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                wo0 wo0Var2 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                wo0Var2.c1 = wo0Var.c1;
                wo0Var2.d1 = wo0Var.d1;
                wo0Var2.T = new bo0(wo0Var);
                wo0Var.presentFragment(wo0Var2);
                break;
            case 2:
                wo0 wo0Var3 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                wo0Var3.c1 = wo0Var.c1;
                wo0Var3.d1 = wo0Var.d1;
                wo0Var3.T = new co0(wo0Var);
                wo0Var.presentFragment(wo0Var3);
                break;
            case 3:
                wo0 wo0Var4 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                wo0Var4.c1 = wo0Var.c1;
                wo0Var4.d1 = wo0Var.d1;
                wo0Var4.T = new do0(wo0Var);
                wo0Var.presentFragment(wo0Var4);
                break;
            case 4:
                wo0 wo0Var5 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                wo0Var5.c1 = wo0Var.c1;
                wo0Var5.d1 = wo0Var.d1;
                wo0Var5.T = new eo0(wo0Var);
                wo0Var.presentFragment(wo0Var5);
                break;
            case 5:
                if (!wo0Var.P0) {
                    boolean z10 = !wo0Var.F;
                    wo0Var.F = z10;
                    wo0Var.V.setChecked(z10);
                    wo0Var.W.a(wo0Var.F, true);
                    break;
                }
                break;
            case 6:
                wo0.Z(wo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (wo0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.a2.h(R.string.TurnPasswordOffPassport, w.f.g(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.T = string;
                d2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new un0(wo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wo0Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(wo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !wo0Var.T0;
                wo0Var.T0 = z11;
                wo0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !wo0Var.U0;
                wo0Var.U0 = z12;
                wo0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !wo0Var.U0;
                wo0Var.U0 = z13;
                wo0Var.L.setChecked(z13);
                break;
            case 11:
                wo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.l6[] l6VarArr = wo0Var.h;
                    if (i11 >= l6VarArr.length) {
                        break;
                    } else {
                        l6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                wo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = wo0.p0();
                    if (wo0Var.K0 == null || wo0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new jo0(wo0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new jo0(wo0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(wo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = wo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, wo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(wo0Var.L0)) {
                        jSONObject.put("countryCode", wo0Var.L0);
                    }
                    jSONObject.put("currencyCode", wo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", wo0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = wo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.c = new o0.b(jVar);
                    e.d = new k6.c[]{v8.p.b};
                    e.b = true;
                    e.a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), wo0Var.getParentActivity());
                    break;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                wo0Var.v0 = false;
                wo0Var.t0();
                break;
            default:
                wo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(wo0Var.f[0]);
                break;
        }
    }
}
