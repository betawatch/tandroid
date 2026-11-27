// default package

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rt4 extends LruCache {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rt4(int i, byte b) {
        super(i);
        this.a = b;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (!bitmap.isRecycled() && !st4.f0.containsKey(str)) {
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
                return ((iz4) obj2).d;
            case 2:
                qe8 qe8Var = (qe8) obj2;
                return Math.max(1, ve8.a(qe8Var.q) + ve8.a(qe8Var.o) + ve8.a(qe8Var.n) + ve8.a(qe8Var.m) + ve8.a(qe8Var.l) + ve8.a(qe8Var.k) + ve8.a(qe8Var.j));
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
