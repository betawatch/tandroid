package q1;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.telegram.ui.Cells.f1;
import rd.l;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
