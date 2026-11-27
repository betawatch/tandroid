// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xc1 {
    public static final xc1 b;
    public final HashSet a;

    static {
        new xc1(Collections.EMPTY_LIST);
        new xc1(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new xc1(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        new xc1(Arrays.asList(ForegroundCarColorSpan.class));
        b = new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public xc1(List list) {
        this.a = new HashSet(list);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.a.contains(cls)) {
                lq5.j("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
                return;
            }
        }
    }
}
