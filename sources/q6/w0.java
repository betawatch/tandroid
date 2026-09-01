package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class w0 extends c6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(23);
    public final long a;
    public final b7.w0 b;
    public final b7.w0 c;
    public final b7.w0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        b6.m.h(bArr);
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t9 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t10 = b7.w0.t(bArr3.length, bArr3);
        this.a = j10;
        this.b = t6;
        this.c = t9;
        this.d = t10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && b6.m.l(this.b, w0Var.b) && b6.m.l(this.c, w0Var.c) && b6.m.l(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        g5.c(parcel, 2, this.b.u());
        g5.c(parcel, 3, this.c.u());
        g5.c(parcel, 4, this.d.u());
        g5.r(parcel, q10);
    }
}
