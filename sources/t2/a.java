package t2;

import android.graphics.Bitmap;
import k2.j;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
