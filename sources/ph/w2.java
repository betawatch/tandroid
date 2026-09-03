package ph;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
