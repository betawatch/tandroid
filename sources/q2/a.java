package q2;

import android.graphics.Bitmap;
import h2.j;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class a extends j {
    public Bitmap a;
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
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
