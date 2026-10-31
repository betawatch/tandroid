package vg;

import android.graphics.Bitmap;
import android.util.LruCache;
import vh.h2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends LruCache {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.a = i11;
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (!bitmap.isRecycled() && !h2.e0.containsKey(str)) {
                    bitmap.recycle();
                    break;
                }
                break;
            default:
                super.entryRemoved(z10, obj, obj2, obj3);
                break;
        }
    }

    @Override // android.util.LruCache
    public int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((i) obj2).c;
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
