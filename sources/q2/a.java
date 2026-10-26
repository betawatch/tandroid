package q2;

import android.graphics.Bitmap;
import h2.j;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
