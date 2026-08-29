package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i10 = icon.i();
        for (int i11 : this.a) {
            if (i10 == i11) {
                if (i10 != 4 || "content".equalsIgnoreCase(icon.j().getScheme())) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
            }
        }
        throw new IllegalArgumentException(l1.k(i10, "Custom icon type is not allowed: "));
    }
}
