package qh;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
