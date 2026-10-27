package t6;

import java.util.Comparator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l6.c cVar = (l6.c) obj;
        l6.c cVar2 = (l6.c) obj2;
        return !cVar.a.equals(cVar2.a) ? cVar.a.compareTo(cVar2.a) : (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
