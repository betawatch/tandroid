// default package

import androidx.car.app.model.DateTimeWithZone;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.TextStyle;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class y93 {
    public static DateTimeWithZone a(ZonedDateTime zonedDateTime) {
        Objects.requireNonNull(zonedDateTime);
        LocalDateTime p = zonedDateTime.p();
        ZoneId zone = zonedDateTime.getZone();
        ZoneOffset offset = zone.getRules().getOffset(p);
        return DateTimeWithZone.create(TimeUnit.SECONDS.toMillis(p.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    }
}
