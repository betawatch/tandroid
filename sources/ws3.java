// default package

import androidx.car.app.model.DurationSpan;
import j$.time.Duration;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ws3 {
    public static DurationSpan a(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }
}
