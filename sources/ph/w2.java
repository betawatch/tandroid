package ph;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class w2 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap.isRecycled() || x2.b0.containsKey(str)) {
            return;
        }
        bitmap.recycle();
    }
}
