package pb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
