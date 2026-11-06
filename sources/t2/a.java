package t2;

import android.graphics.Bitmap;
import k2.j;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
