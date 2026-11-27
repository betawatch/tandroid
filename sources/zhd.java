// default package

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zhd {
    public final ffd a;
    public boolean b;
    public long c;
    public long d;

    public zhd(ffd ffdVar) {
        if (ffdVar != null) {
            this.a = ffdVar;
        } else {
            p3d.h("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            grb.i("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.a();
        }
    }

    public final String toString() {
        String str;
        long a = this.b ? (this.a.a() - this.d) + this.c : this.c;
        TimeUnit timeUnit = a / 86400000000000L > 0 ? TimeUnit.DAYS : a / 3600000000000L > 0 ? TimeUnit.HOURS : a / 60000000000L > 0 ? TimeUnit.MINUTES : a / 1000000000 > 0 ? TimeUnit.SECONDS : a / 1000000 > 0 ? TimeUnit.MILLISECONDS : a / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(a / r2.convert(1L, timeUnit)));
        switch (uhd.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                lq5.f();
                return null;
        }
        return qd4.y(format, " ", str);
    }
}
