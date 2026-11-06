package s2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class q implements w2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public q(String str, List list, boolean z9) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z9;
    }
}
