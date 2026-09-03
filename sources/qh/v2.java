package qh;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class v2 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap.isRecycled() || w2.b0.containsKey(str)) {
            return;
        }
        bitmap.recycle();
    }
}
