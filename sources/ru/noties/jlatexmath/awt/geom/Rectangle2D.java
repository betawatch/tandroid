package ru.noties.jlatexmath.awt.geom;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public abstract class Rectangle2D {

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static class Float extends Rectangle2D {
        public float h;
        public float w;
        public float x;
        public float y;

        public Float(float f10, float f11, float f12, float f13) {
            this.x = f10;
            this.y = f11;
            this.w = f12;
            this.h = f13;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getHeight() {
            return this.h;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getWidth() {
            return this.w;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getX() {
            return this.x;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getY() {
            return this.y;
        }

        public String toString() {
            return "Float{x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + '}';
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
