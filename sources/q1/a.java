package q1;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import rd.l;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        return p5.c.m(((e) entry.getKey()).a, " = ", valueOf, new StringBuilder("  "));
    }
}
