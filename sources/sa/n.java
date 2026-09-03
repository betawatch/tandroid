package sa;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends xa.b {
    public static final m E = new m();
    public static final pa.m F = new pa.m("closed");
    public final ArrayList B;
    public String C;
    public pa.i D;

    public n() {
        super(E);
        this.B = new ArrayList();
        this.D = pa.k.a;
    }

    @Override // xa.b
    public final void b() {
        pa.h hVar = new pa.h();
        w(hVar);
        this.B.add(hVar);
    }

    @Override // xa.b
    public final void c() {
        pa.l lVar = new pa.l();
        w(lVar);
        this.B.add(lVar);
    }

    @Override // xa.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(F);
    }

    @Override // xa.b
    public final void e() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty() || this.C != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof pa.h)) {
            throw new IllegalStateException();
        }
        android.support.v4.media.a.u(1, arrayList);
    }

    @Override // xa.b
    public final void f() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty() || this.C != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof pa.l)) {
            throw new IllegalStateException();
        }
        android.support.v4.media.a.u(1, arrayList);
    }

    @Override // xa.b
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.B.isEmpty() || this.C != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof pa.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.C = str;
    }

    @Override // xa.b
    public final xa.b i() {
        w(pa.k.a);
        return this;
    }

    @Override // xa.b
    public final void n(double d) {
        if (this.n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new pa.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // xa.b
    public final void o(long j10) {
        w(new pa.m(Long.valueOf(j10)));
    }

    @Override // xa.b
    public final void p(Boolean bool) {
        if (bool == null) {
            w(pa.k.a);
        } else {
            w(new pa.m(bool));
        }
    }

    @Override // xa.b
    public final void q(Number number) {
        if (number == null) {
            w(pa.k.a);
            return;
        }
        if (this.n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new pa.m(number));
    }

    @Override // xa.b
    public final void r(String str) {
        if (str == null) {
            w(pa.k.a);
        } else {
            w(new pa.m(str));
        }
    }

    @Override // xa.b
    public final void s(boolean z4) {
        w(new pa.m(Boolean.valueOf(z4)));
    }

    public final pa.i u() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            return this.D;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final pa.i v() {
        return (pa.i) kf.k0.i(1, this.B);
    }

    public final void w(pa.i iVar) {
        if (this.C != null) {
            if (!(iVar instanceof pa.k) || this.v) {
                ((pa.l) v()).o(this.C, iVar);
            }
            this.C = null;
            return;
        }
        if (this.B.isEmpty()) {
            this.D = iVar;
            return;
        }
        pa.i v = v();
        if (!(v instanceof pa.h)) {
            throw new IllegalStateException();
        }
        ((pa.h) v).a.add(iVar);
    }

    @Override // xa.b, java.io.Flushable
    public final void flush() {
    }
}
