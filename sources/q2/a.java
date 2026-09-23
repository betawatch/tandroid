package q2;

import android.graphics.Bitmap;
import h2.j;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
