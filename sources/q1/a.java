package q1;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.telegram.ui.Cells.f1;
import rd.l;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends k implements l {
    public static final a b = new a(1);

    @Override // rd.l
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int i7 = 0;
            for (byte b10 : (byte[]) value) {
                i7++;
                if (i7 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
            sb2.append((CharSequence) "]");
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return f1.n(((e) entry.getKey()).a, " = ", valueOf, new StringBuilder("  "));
    }
}
