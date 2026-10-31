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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
