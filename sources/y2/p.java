package y2;

import aa.e0;
import aa.j1;
import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Float.compare(((q) obj).c, ((q) obj2).c);
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((e0) ((j1) obj)).a.compareTo(((e0) ((j1) obj2)).a);
        }
    }
}
