// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class qi5 extends c5b {
    @Override // android.view.View
    public final void invalidate() {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
