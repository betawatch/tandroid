// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class rze {
    public static final void a(StringBuilder sb, Iterator it, hcd hcdVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(hcd.a(entry.getKey()));
            sb.append(" : ");
            sb.append(hcd.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(hcd.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(hcd.a(entry2.getValue()));
            }
        }
    }
}
