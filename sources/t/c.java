package t;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c {
    public static final c b;
    public final HashSet a;

    static {
        new c(Collections.EMPTY_LIST);
        new c(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new c(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        new c(Arrays.asList(ForegroundCarColorSpan.class));
        b = new c(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        new c(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new c(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new c(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public c(List list) {
        this.a = new HashSet(list);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.a.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
            }
        }
    }
}
