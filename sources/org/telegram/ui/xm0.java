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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo0 b;

    public /* synthetic */ xm0(bo0 bo0Var, int i10) {
        this.a = i10;
        this.b = bo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        bo0 bo0Var = this.b;
        switch (i10) {
            case 0:
                if (bo0Var.getParentActivity() != null) {
                    bo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                bo0 bo0Var2 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 0, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                bo0Var2.Y0 = bo0Var.Y0;
                bo0Var2.Z0 = bo0Var.Z0;
                bo0Var2.P = new hn0(bo0Var);
                bo0Var.presentFragment(bo0Var2);
                break;
            case 2:
                bo0 bo0Var3 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 0, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                bo0Var3.Y0 = bo0Var.Y0;
                bo0Var3.Z0 = bo0Var.Z0;
                bo0Var3.P = new in0(bo0Var);
                bo0Var.presentFragment(bo0Var3);
                break;
            case 3:
                bo0 bo0Var4 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 0, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                bo0Var4.Y0 = bo0Var.Y0;
                bo0Var4.Z0 = bo0Var.Z0;
                bo0Var4.P = new jn0(bo0Var);
                bo0Var.presentFragment(bo0Var4);
                break;
            case 4:
                bo0 bo0Var5 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 0, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                bo0Var5.Y0 = bo0Var.Y0;
                bo0Var5.Z0 = bo0Var.Z0;
                bo0Var5.P = new kn0(bo0Var);
                bo0Var.presentFragment(bo0Var5);
                break;
            case 5:
                if (!bo0Var.L0) {
                    boolean z10 = !bo0Var.B;
                    bo0Var.B = z10;
                    bo0Var.R.setChecked(z10);
                    bo0Var.S.a(bo0Var.B, true);
                    break;
                }
                break;
            case 6:
                bo0.Z(bo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (bo0Var.W.has_secure_values) {
                    string = org.telegram.messenger.x3.i(R.string.TurnPasswordOffPassport, u3.c.f(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.P = string;
                c2Var.N = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new bn0(bo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                bo0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(bo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !bo0Var.P0;
                bo0Var.P0 = z11;
                bo0Var.H.setChecked(z11);
                break;
            case 9:
                boolean z12 = !bo0Var.Q0;
                bo0Var.Q0 = z12;
                bo0Var.H.setChecked(z12);
                break;
            case 10:
                boolean z13 = !bo0Var.Q0;
                bo0Var.Q0 = z13;
                bo0Var.H.setChecked(z13);
                break;
            case 11:
                bo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.h6[] h6VarArr = bo0Var.h;
                    if (i11 >= h6VarArr.length) {
                        break;
                    } else {
                        h6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                bo0Var.L.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = bo0.p0();
                    if (bo0Var.G0 == null || bo0Var.I0 != null) {
                        p02.put("tokenizationSpecification", new h9.f(bo0Var, 4));
                    } else {
                        p02.put("tokenizationSpecification", new h9.f(bo0Var, 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(bo0Var.y0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = bo0Var.C0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, bo0Var.y0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(bo0Var.H0)) {
                        jSONObject.put("countryCode", bo0Var.H0);
                    }
                    jSONObject.put("currencyCode", bo0Var.y0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", bo0Var.l0));
                    String jSONObject2 = put.toString();
                    h8.j jVar = new h8.j();
                    jVar.r = true;
                    z5.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = bo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.c = new m5.i(jVar, 17);
                    b10.d = new w5.c[]{h8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    h8.a.a(v0Var.e(1, b10.b()), bo0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 13:
                bo0Var.r0 = false;
                bo0Var.t0();
                break;
            default:
                bo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(bo0Var.f[0]);
                break;
        }
    }
}
