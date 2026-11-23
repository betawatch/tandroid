package pb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class m extends PhantomReference {
    public final Set a;
    public final androidx.emoji2.text.o b;

    public /* synthetic */ m(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.o oVar) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = oVar;
    }
}
