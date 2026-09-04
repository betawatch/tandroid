package za;

import android.os.Message;
import java.util.Comparator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Message) obj).getWhen());
        Long valueOf2 = Long.valueOf(((Message) obj2).getWhen());
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }
}
