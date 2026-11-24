// default package

import android.util.Range;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ycc {
    public long a;
    public long b;
    public double c;
    public Range d;

    public ycc() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        double doubleValue;
        jte.f(j != -9223372036854775807L);
        jte.f(j2 != -9223372036854775807L);
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            if (this.b != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j;
                this.b = j2;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float f) {
        jte.f(f > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        b();
    }
}
