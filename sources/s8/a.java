package s8;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public static final Object c = new Object();
    public static int d;
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();

    public final int a(int i3) {
        synchronized (c) {
            try {
                int i10 = this.a.get(i3, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.a.append(i3, i11);
                this.b.append(i11, i3);
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
