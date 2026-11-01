package p2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class q implements t2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public q(String str, List list, boolean z10) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z10;
    }
}
