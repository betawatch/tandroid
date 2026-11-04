package p1;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import od.l;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends k implements l {
    public static final a b = new a(1);

    @Override // od.l
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int i3 = 0;
            for (byte b10 : (byte[]) value) {
                i3++;
                if (i3 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
            sb2.append((CharSequence) "]");
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return f1.r(((e) entry.getKey()).a, " = ", valueOf, new StringBuilder("  "));
    }
}
