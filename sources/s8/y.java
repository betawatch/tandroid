package s8;

import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class y extends com.google.android.gms.common.api.internal.w {
    @Override // com.google.android.gms.common.api.internal.w
    public final com.google.android.gms.common.api.internal.w c(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public final z i() {
        int i10 = this.a;
        if (i10 == 0) {
            int i11 = z.c;
            return o0.s;
        }
        if (i10 != 1) {
            z t6 = z.t(i10, this.c);
            this.a = t6.size();
            this.b = true;
            return t6;
        }
        Object obj = this.c[0];
        Objects.requireNonNull(obj);
        int i12 = z.c;
        return new t0(obj);
    }
}
