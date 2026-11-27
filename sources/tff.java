// default package

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tff extends LruCache {
    public final /* synthetic */ bu6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tff(bu6 bu6Var) {
        super(20);
        this.a = bu6Var;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        if (z) {
            xve.h(arrayList);
            arrayList.add(num);
        }
    }
}
