package t8;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public static final Object c = new Object();
    public static int d;
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();

    public final int a(int i7) {
        synchronized (c) {
            try {
                int i10 = this.a.get(i7, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.a.append(i7, i11);
                this.b.append(i11, i7);
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
