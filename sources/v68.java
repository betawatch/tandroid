// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class v68 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public v68(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
