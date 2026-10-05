package sf;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b {
    public final Rect a = new Rect();
    public final Point b = new Point();

    public final PictureInPictureParams.Builder a() {
        int i10;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.b;
        int i11 = point.x;
        if (i11 <= 0 || (i10 = point.y) <= 0) {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        } else {
            double d = i11 / i10;
            Rational rational = d < 0.45d ? new Rational(45, 100) : d > 2.35d ? new Rational(235, 100) : new Rational(point.x, point.y);
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        }
        Rect rect = this.a;
        if (rect.isEmpty()) {
            builder.setSourceRectHint(null);
            return builder;
        }
        builder.setSourceRectHint(rect);
        return builder;
    }

    public final boolean b() {
        if (this.a.isEmpty()) {
            return false;
        }
        Point point = this.b;
        return point.x > 0 && point.y > 0;
    }

    public final boolean c(int i10, int i11) {
        Point point = this.b;
        if (point.x == i10 && point.y == i11) {
            return false;
        }
        point.set(i10, i11);
        return true;
    }
}
