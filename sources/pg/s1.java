package pg;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
