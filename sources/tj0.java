// default package

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tj0 {
    public WeakReference a;
    public long b;
    public boolean c = true;

    public final boolean a(Bitmap bitmap) {
        if (this.c) {
            return true;
        }
        WeakReference weakReference = this.a;
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) == bitmap) {
            return ((bitmap == null || bitmap.isRecycled()) ? 0L : (long) bitmap.getGenerationId()) != this.b;
        }
        return true;
    }

    public final void b(Bitmap bitmap) {
        this.a = bitmap != null ? new WeakReference(bitmap) : null;
        this.b = (bitmap == null || bitmap.isRecycled()) ? 0L : bitmap.getGenerationId();
        this.c = false;
    }
}
