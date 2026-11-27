// default package

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pf7 extends JSONObject {
    public pf7(p pVar, byte b) {
        switch (b) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = pVar.N0;
                if (obj == null) {
                    pf7 pf7Var = new pf7();
                    pf7Var.put("gateway", "stripe");
                    pf7Var.put("stripe:publishableKey", pVar.k0);
                    pf7Var.put("stripe:version", "3.5.0");
                    put("parameters", pf7Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                pf7 pf7Var2 = new pf7();
                pf7Var2.put("protocolVersion", "ECv2");
                pf7Var2.put("publicKey", pVar.L0);
                put("parameters", pf7Var2);
                break;
        }
    }
}
