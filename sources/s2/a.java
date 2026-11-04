package s2;

import android.graphics.Bitmap;
import j2.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends j {
    public Bitmap a;
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // j2.j, j2.a
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // j2.j
    public final void release() {
        this.b.n(this);
    }
}
