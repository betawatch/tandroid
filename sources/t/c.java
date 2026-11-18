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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
