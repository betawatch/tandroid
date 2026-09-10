package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        throw new IllegalArgumentException(hc.b.j(i10, "Custom icon type is not allowed: "));
    }
}
