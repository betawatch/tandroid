package s5;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r extends LruCache {
    public final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c cVar) {
        super(20);
        this.a = cVar;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        if (z4) {
            b6.m.h(arrayList);
            arrayList.add(num);
        }
    }
}
