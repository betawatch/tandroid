package t2;

import android.graphics.Bitmap;
import k2.j;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
