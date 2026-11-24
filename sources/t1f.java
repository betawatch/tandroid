// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class t1f {
    public static final void a(StringBuilder sb, Iterator it, jed jedVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(jed.a(entry.getKey()));
            sb.append(" : ");
            sb.append(jed.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(jed.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(jed.a(entry2.getValue()));
            }
        }
    }
}
