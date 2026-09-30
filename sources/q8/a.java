package q8;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class a {
    public static final Object c = new Object();
    public static int d;
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (c) {
            try {
                int i11 = this.a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.a.append(i10, i12);
                this.b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
