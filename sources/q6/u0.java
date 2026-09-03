package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u0 extends c6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(16);
    public final b7.w0 a;
    public final b7.w0 b;

    public u0(b7.w0 w0Var, b7.w0 w0Var2) {
        this.a = w0Var;
        this.b = w0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return b6.m.l(this.a, u0Var.a) && b6.m.l(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        b7.w0 w0Var = this.a;
        g5.c(parcel, 1, w0Var == null ? null : w0Var.u());
        b7.w0 w0Var2 = this.b;
        g5.c(parcel, 2, w0Var2 != null ? w0Var2.u() : null);
        g5.r(parcel, q10);
    }
}
