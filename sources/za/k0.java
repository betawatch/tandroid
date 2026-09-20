package za;

import android.os.Message;
import java.util.Comparator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
