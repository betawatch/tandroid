package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class tn0 extends JSONObject {
    public tn0(go0 go0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = go0Var.M0;
                if (obj == null) {
                    tn0 tn0Var = new tn0();
                    tn0Var.put("gateway", "stripe");
                    tn0Var.put("stripe:publishableKey", go0Var.j0);
                    tn0Var.put("stripe:version", "3.5.0");
                    put("parameters", tn0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                tn0 tn0Var2 = new tn0();
                tn0Var2.put("protocolVersion", "ECv2");
                tn0Var2.put("publicKey", go0Var.K0);
                put("parameters", tn0Var2);
                break;
        }
    }
}
