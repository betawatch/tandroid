package ru.noties.jlatexmath.awt.geom;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class Line2D {

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class Float {
        public double x1;
        public double x2;
        public double y1;
        public double y2;

        public Float() {
        }

        public void setLine(double d, double d10, double d11, double d12) {
            this.x1 = d;
            this.y1 = d10;
            this.x2 = d11;
            this.y2 = d12;
        }

        public String toString() {
            return "Float{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
