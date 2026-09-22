package s6;

import java.util.Comparator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k6.c cVar = (k6.c) obj;
        k6.c cVar2 = (k6.c) obj2;
        return !cVar.a.equals(cVar2.a) ? cVar.a.compareTo(cVar2.a) : (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
