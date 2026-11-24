package ru.noties.jlatexmath.awt.geom;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class Line2D {

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Float {
        public double x1;
        public double x2;
        public double y1;
        public double y2;

        public Float(float f, float f2, float f3, float f4) {
            setLine(f, f2, f3, f4);
        }

        public void setLine(double d, double d2, double d3, double d4) {
            this.x1 = d;
            this.y1 = d2;
            this.x2 = d3;
            this.y2 = d4;
        }

        public String toString() {
            return "Float{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + '}';
        }

        public Float() {
        }
    }
}
