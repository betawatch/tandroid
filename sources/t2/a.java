package t2;

import android.graphics.Bitmap;
import k2.j;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
