package qa;

import j$.util.Objects;
import j7.l1;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends va.b {
    public static final m D = new m();
    public static final na.m E = new na.m("closed");
    public final ArrayList A;
    public String B;
    public na.i C;

    public n() {
        super(D);
        this.A = new ArrayList();
        this.C = na.k.a;
    }

    @Override // va.b
    public final void b() {
        na.h hVar = new na.h();
        w(hVar);
        this.A.add(hVar);
    }

    @Override // va.b
    public final void c() {
        na.l lVar = new na.l();
        w(lVar);
        this.A.add(lVar);
    }

    @Override // va.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(E);
    }

    @Override // va.b
    public final void e() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof na.h)) {
            throw new IllegalStateException();
        }
        a4.w.t(1, arrayList);
    }

    @Override // va.b
    public final void f() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof na.l)) {
            throw new IllegalStateException();
        }
        a4.w.t(1, arrayList);
    }

    @Override // va.b
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.A.isEmpty() || this.B != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof na.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.B = str;
    }

    @Override // va.b
    public final va.b i() {
        w(na.k.a);
        return this;
    }

    @Override // va.b
    public final void n(double d) {
        if (this.n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new na.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // va.b
    public final void o(long j10) {
        w(new na.m(Long.valueOf(j10)));
    }

    @Override // va.b
    public final void p(Boolean bool) {
        if (bool == null) {
            w(na.k.a);
        } else {
            w(new na.m(bool));
        }
    }

    @Override // va.b
    public final void q(Number number) {
        if (number == null) {
            w(na.k.a);
            return;
        }
        if (this.n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new na.m(number));
    }

    @Override // va.b
    public final void r(String str) {
        if (str == null) {
            w(na.k.a);
        } else {
            w(new na.m(str));
        }
    }

    @Override // va.b
    public final void s(boolean z10) {
        w(new na.m(Boolean.valueOf(z10)));
    }

    public final na.i u() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return this.C;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final na.i v() {
        return (na.i) l1.i(1, this.A);
    }

    public final void w(na.i iVar) {
        if (this.B != null) {
            if (!(iVar instanceof na.k) || this.v) {
                ((na.l) v()).o(this.B, iVar);
            }
            this.B = null;
            return;
        }
        if (this.A.isEmpty()) {
            this.C = iVar;
            return;
        }
        na.i v = v();
        if (!(v instanceof na.h)) {
            throw new IllegalStateException();
        }
        ((na.h) v).a.add(iVar);
    }

    @Override // va.b, java.io.Flushable
    public final void flush() {
    }
}
