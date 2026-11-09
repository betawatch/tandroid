package sg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.ot0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m0 {
    public final float a;
    public final float b;
    public final PointF c;
    public final PointF d;
    public final float e;
    public final PointF f;
    public final PointF g;

    public m0(w8.a aVar, Bitmap bitmap, ot0 ot0Var, boolean z9) {
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (w8.c cVar : aVar.b) {
            PointF pointF5 = cVar.a;
            int i7 = cVar.b;
            if (i7 == 4) {
                pointF = b(pointF5, bitmap, ot0Var, z9);
            } else if (i7 == 5) {
                pointF3 = b(pointF5, bitmap, ot0Var, z9);
            } else if (i7 == 10) {
                pointF2 = b(pointF5, bitmap, ot0Var, z9);
            } else if (i7 == 11) {
                pointF4 = b(pointF5, bitmap, ot0Var, z9);
            }
        }
        if (pointF != null && pointF2 != null) {
            if (pointF.x < pointF2.x) {
                PointF pointF6 = pointF2;
                pointF2 = pointF;
                pointF = pointF6;
            }
            PointF pointF7 = new PointF((pointF2.x * 0.5f) + (pointF.x * 0.5f), (pointF2.y * 0.5f) + (pointF.y * 0.5f));
            this.d = pointF7;
            float hypot = (float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.e = hypot;
            this.b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.a = 2.35f * hypot;
            float f10 = hypot * 0.8f;
            double radians = (float) Math.toRadians(r0 - 90.0f);
            this.c = new PointF((((float) Math.cos(radians)) * f10) + pointF7.x, (f10 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 == null || pointF4 == null) {
            return;
        }
        if (pointF3.x < pointF4.x) {
            PointF pointF8 = pointF4;
            pointF4 = pointF3;
            pointF3 = pointF8;
        }
        PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
        this.f = pointF9;
        float f11 = this.e * 0.7f;
        double radians2 = (float) Math.toRadians(this.b + 90.0f);
        this.g = new PointF((((float) Math.cos(radians2)) * f11) + pointF9.x, (f11 * ((float) Math.sin(radians2))) + pointF9.y);
    }

    public static PointF b(PointF pointF, Bitmap bitmap, ot0 ot0Var, boolean z9) {
        return new PointF((ot0Var.a * pointF.x) / (z9 ? bitmap.getHeight() : bitmap.getWidth()), (ot0Var.b * pointF.y) / (z9 ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public final PointF a(int i7) {
        if (i7 == 0) {
            return this.c;
        }
        if (i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f;
        }
        if (i7 != 3) {
            return null;
        }
        return this.g;
    }
}
