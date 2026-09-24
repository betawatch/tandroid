package q2;

import android.graphics.Bitmap;
import h2.j;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class a extends j {
    public Bitmap a;
    public final /* synthetic */ c b;

    public a(c cVar) {
        this.b = cVar;
    }

    @Override // h2.j, h2.a
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // h2.j
    public final void release() {
        this.b.n(this);
    }
}
