package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class sn0 extends JSONObject {
    public sn0(fo0 fo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = fo0Var.M0;
                if (obj == null) {
                    sn0 sn0Var = new sn0();
                    sn0Var.put("gateway", "stripe");
                    sn0Var.put("stripe:publishableKey", fo0Var.j0);
                    sn0Var.put("stripe:version", "3.5.0");
                    put("parameters", sn0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                sn0 sn0Var2 = new sn0();
                sn0Var2.put("protocolVersion", "ECv2");
                sn0Var2.put("publicKey", fo0Var.K0);
                put("parameters", sn0Var2);
                break;
        }
    }
}
