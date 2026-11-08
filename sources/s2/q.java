package s2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
