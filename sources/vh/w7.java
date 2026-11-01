package vh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w7 implements y1 {
    public final /* synthetic */ o8 a;

    public w7(o8 o8Var) {
        this.a = o8Var;
    }

    @Override // vh.y1
    public final void setInvert(float f7) {
        o8 o8Var = this.a;
        org.telegram.messenger.i0.n3(o8Var.n, f7 > 0.5f);
        org.telegram.messenger.i0.q3(o8Var.n, f7 > 0.5f);
    }

    @Override // vh.y1
    public final void invalidate() {
    }
}
