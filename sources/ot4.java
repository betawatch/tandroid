// default package

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ot4 extends LruCache {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot4(int i, byte b) {
        super(i);
        this.a = b;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (!bitmap.isRecycled() && !pt4.f0.containsKey(str)) {
                    bitmap.recycle();
                    break;
                }
                break;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                break;
        }
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                return ((ez4) obj2).d;
            case 2:
                ed8 ed8Var = (ed8) obj2;
                return Math.max(1, jd8.a(ed8Var.q) + jd8.a(ed8Var.o) + jd8.a(ed8Var.n) + jd8.a(ed8Var.m) + jd8.a(ed8Var.l) + jd8.a(ed8Var.k) + jd8.a(ed8Var.j));
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
