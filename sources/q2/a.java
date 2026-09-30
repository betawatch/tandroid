package q2;

import android.graphics.Bitmap;
import h2.j;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
