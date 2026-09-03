package u4;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
