package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class rn0 extends JSONObject {
    public rn0(eo0 eo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = eo0Var.M0;
                if (obj == null) {
                    rn0 rn0Var = new rn0();
                    rn0Var.put("gateway", "stripe");
                    rn0Var.put("stripe:publishableKey", eo0Var.j0);
                    rn0Var.put("stripe:version", "3.5.0");
                    put("parameters", rn0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                rn0 rn0Var2 = new rn0();
                rn0Var2.put("protocolVersion", "ECv2");
                rn0Var2.put("publicKey", eo0Var.K0);
                put("parameters", rn0Var2);
                break;
        }
    }
}
