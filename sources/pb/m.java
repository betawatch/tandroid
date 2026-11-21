package pb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
