package ru.noties.jlatexmath.awt.geom;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class Line2D {

    /* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
    public static class Float {
        public double x1;
        public double x2;
        public double y1;
        public double y2;

        public Float() {
        }

        public void setLine(double d, double d2, double d10, double d11) {
            this.x1 = d;
            this.y1 = d2;
            this.x2 = d10;
            this.y2 = d11;
        }

        public String toString() {
            return "Float{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + '}';
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }
    }
}
