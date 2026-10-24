package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vn0 extends JSONObject {
    public vn0(io0 io0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = io0Var.M0;
                if (obj == null) {
                    vn0 vn0Var = new vn0();
                    vn0Var.put("gateway", "stripe");
                    vn0Var.put("stripe:publishableKey", io0Var.j0);
                    vn0Var.put("stripe:version", "3.5.0");
                    put("parameters", vn0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                vn0 vn0Var2 = new vn0();
                vn0Var2.put("protocolVersion", "ECv2");
                vn0Var2.put("publicKey", io0Var.K0);
                put("parameters", vn0Var2);
                break;
        }
    }
}
