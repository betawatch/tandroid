package y2;

import aa.e0;
import aa.j1;
import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
