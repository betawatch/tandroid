package ru.noties.jlatexmath.awt.geom;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public abstract class Rectangle2D {

    /* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
    public static class Float extends Rectangle2D {
        public float h;
        public float w;
        public float x;
        public float y;

        public Float(float f7, float f10, float f11, float f12) {
            this.x = f7;
            this.y = f10;
            this.w = f11;
            this.h = f12;
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
