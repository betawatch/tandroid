package pg;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class s1 {
    public int a;
    public float b;
    public float c;

    public s1(float f7, float f10, int i10) {
        this.a = i10;
        this.b = f7;
        this.c = f10;
    }

    public final Object clone() {
        return new s1(this.b, this.c, this.a);
    }
}
