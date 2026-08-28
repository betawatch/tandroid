package ya;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends PhantomReference {
    public final Set a;
    public final androidx.emoji2.text.m b;

    public /* synthetic */ l(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.m mVar) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = mVar;
    }
}
