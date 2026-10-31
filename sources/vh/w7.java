package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
