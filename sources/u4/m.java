package u4;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class m implements n4.a {
    public final String a;
    public final List b;
    public final boolean c;

    public m(String str, List list, boolean z4) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z4;
    }
}
