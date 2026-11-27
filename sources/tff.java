// default package

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
