package sg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.vt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class l0 {
    public final float a;
    public final float b;
    public final PointF c;
    public final PointF d;
    public final float e;
    public final PointF f;
    public final PointF g;

    public l0(w8.a aVar, Bitmap bitmap, vt0 vt0Var, boolean z10) {
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (w8.c cVar : aVar.b) {
            PointF pointF5 = cVar.a;
            int i7 = cVar.b;
            if (i7 == 4) {
                pointF = b(pointF5, bitmap, vt0Var, z10);
            } else if (i7 == 5) {
                pointF3 = b(pointF5, bitmap, vt0Var, z10);
            } else if (i7 == 10) {
                pointF2 = b(pointF5, bitmap, vt0Var, z10);
            } else if (i7 == 11) {
                pointF4 = b(pointF5, bitmap, vt0Var, z10);
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

    public static PointF b(PointF pointF, Bitmap bitmap, vt0 vt0Var, boolean z10) {
        return new PointF((vt0Var.a * pointF.x) / (z10 ? bitmap.getHeight() : bitmap.getWidth()), (vt0Var.b * pointF.y) / (z10 ? bitmap.getWidth() : bitmap.getHeight()));
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
