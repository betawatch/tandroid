package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b {
    public static final b b = new b(new int[]{1, 2});
    public final int[] a;

    public b(int[] iArr) {
        this.a = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        int i7 = icon.i();
        for (int i10 : this.a) {
            if (i7 == i10) {
                if (i7 != 4 || "content".equalsIgnoreCase(icon.j().getScheme())) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
            }
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Custom icon type is not allowed: "));
    }
}
