package s8;

import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
