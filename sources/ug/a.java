package ug;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a {
    public WeakReference a;
    public long b;
    public boolean c = true;

    public final boolean a(Bitmap bitmap) {
        if (this.c) {
            return true;
        }
        WeakReference weakReference = this.a;
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) != bitmap) {
            return true;
        }
        return ((bitmap == null || bitmap.isRecycled()) ? 0L : (long) bitmap.getGenerationId()) != this.b;
    }

    public final void b(Bitmap bitmap) {
        this.a = bitmap != null ? new WeakReference(bitmap) : null;
        this.b = (bitmap == null || bitmap.isRecycled()) ? 0L : bitmap.getGenerationId();
        this.c = false;
    }
}
