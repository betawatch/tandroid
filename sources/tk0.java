// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tk0 extends na3 {
    public Bitmap a;
    public final /* synthetic */ vk0 b;

    public tk0(vk0 vk0Var) {
        this.b = vk0Var;
    }

    @Override // na3, v11
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // na3
    public final void release() {
        this.b.o(this);
    }
}
