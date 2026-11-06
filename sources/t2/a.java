package t2;

import android.graphics.Bitmap;
import k2.j;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a extends j {
    public Bitmap a;
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // k2.j, k2.a
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // k2.j
    public final void release() {
        this.b.n(this);
    }
}
