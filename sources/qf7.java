// default package

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qf7 extends JSONObject {
    public qf7(p pVar, byte b) {
        switch (b) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = pVar.N0;
                if (obj == null) {
                    qf7 qf7Var = new qf7();
                    qf7Var.put("gateway", "stripe");
                    qf7Var.put("stripe:publishableKey", pVar.k0);
                    qf7Var.put("stripe:version", "3.5.0");
                    put("parameters", qf7Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                qf7 qf7Var2 = new qf7();
                qf7Var2.put("protocolVersion", "ECv2");
                qf7Var2.put("publicKey", pVar.L0);
                put("parameters", qf7Var2);
                break;
        }
    }
}
