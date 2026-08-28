package ru.noties.jlatexmath.awt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class BasicStroke implements Stroke {
    public static final int CAP_BUTT = 0;
    public static final int JOIN_MITER = 0;
    private final float miterLimit;
    private final float width;

    public BasicStroke(float f10, int i9, int i10) {
        this(f10, i9, i10, 10.0f);
    }

    @Override // ru.noties.jlatexmath.awt.Stroke
    public float miterLimit() {
        return this.miterLimit;
    }

    public String toString() {
        return "BasicStroke{width=" + this.width + ", miterLimit=" + this.miterLimit + '}';
    }

    @Override // ru.noties.jlatexmath.awt.Stroke
    public float width() {
        return this.width;
    }

    public BasicStroke(float f10, int i9, int i10, float f11) {
        this.width = f10;
        this.miterLimit = f11;
    }
}
