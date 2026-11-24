// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t08 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ t08(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                if (pVar.getParentActivity() != null) {
                    pVar.M0(null);
                    break;
                }
                break;
            case 1:
                p pVar2 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar2.d1 = pVar.d1;
                pVar2.e1 = pVar.e1;
                pVar2.U = new e18(pVar);
                pVar.presentFragment(pVar2);
                break;
            case 2:
                p pVar3 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar3.d1 = pVar.d1;
                pVar3.e1 = pVar.e1;
                pVar3.U = new f18(pVar);
                pVar.presentFragment(pVar3);
                break;
            case 3:
                p pVar4 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar4.d1 = pVar.d1;
                pVar4.e1 = pVar.e1;
                pVar4.U = new g18(pVar);
                pVar.presentFragment(pVar4);
                break;
            case 4:
                p pVar5 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar5.d1 = pVar.d1;
                pVar5.e1 = pVar.e1;
                pVar5.U = new h18(pVar);
                pVar.presentFragment(pVar5);
                break;
            case 5:
                if (!pVar.Q0) {
                    boolean z = !pVar.G;
                    pVar.G = z;
                    pVar.W.setChecked(z);
                    pVar.X.a(pVar.G, true);
                    break;
                }
                break;
            case 6:
                pVar.p0();
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pVar.getParentActivity());
                String M0 = jb6.M0(2131743627, null);
                if (pVar.b0.has_secure_values) {
                    StringBuilder k = b10.k(M0, "\n\n");
                    k.append(jb6.M0(2131743628, null));
                    M0 = k.toString();
                }
                he heVar = alertDialog$Builder.a;
                heVar.U = M0;
                heVar.S = jb6.M0(2131743626, null);
                alertDialog$Builder.j(jb6.M0(2131751372, null), new y08(pVar, (byte) 3));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                pVar.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, pVar.Z0);
                    break;
                }
                break;
            case 8:
                boolean z2 = !pVar.U0;
                pVar.U0 = z2;
                pVar.M.setChecked(z2);
                break;
            case 9:
                boolean z3 = !pVar.V0;
                pVar.V0 = z3;
                pVar.M.setChecked(z3);
                break;
            case 10:
                boolean z4 = !pVar.V0;
                pVar.V0 = z4;
                pVar.M.setChecked(z4);
                break;
            case 11:
                int intValue = ((Integer) view.getTag()).intValue();
                int i = 0;
                while (true) {
                    w09[] w09VarArr = pVar.h;
                    if (i >= w09VarArr.length) {
                        break;
                    } else {
                        w09VarArr[i].a(intValue == i, true);
                        i++;
                    }
                }
            case 12:
                pVar.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject d0 = p.d0();
                    if (pVar.L0 == null || pVar.N0 != null) {
                        d0.put("tokenizationSpecification", new if7(pVar, (byte) 4));
                    } else {
                        d0.put("tokenizationSpecification", new if7(pVar, (byte) 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(d0));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(pVar.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = pVar.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", pVar.g0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(pVar.M0)) {
                        jSONObject.put("countryCode", pVar.M0);
                    }
                    jSONObject.put("currencyCode", pVar.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", pVar.q0));
                    String jSONObject2 = put.toString();
                    r08 r08Var = new r08();
                    r08Var.r = true;
                    ite.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    r08Var.s = jSONObject2;
                    ua4 ua4Var = pVar.e;
                    ua4Var.getClass();
                    bib b2 = cib.b();
                    b2.a = new oo8(r08Var, (byte) 28);
                    b2.c = new o94[]{bmd.a};
                    b2.b = true;
                    b2.d = (char) 23707;
                    l80.a(ua4Var.e(1, b2.a()), pVar.getParentActivity());
                    break;
                } catch (JSONException e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 13:
                pVar.w0 = false;
                pVar.i0();
                break;
            default:
                pVar.f[0].requestFocus();
                gm.E3(pVar.f[0]);
                break;
        }
    }
}
