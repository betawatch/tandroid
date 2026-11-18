package pb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
