package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new l4.j(25);
    public final b7.w0 a;
    public final b7.w0 b;
    public final b7.w0 c;
    public final int d;

    public p0(b7.w0 w0Var, b7.w0 w0Var2, b7.w0 w0Var3, int i10) {
        this.a = w0Var;
        this.b = w0Var2;
        this.c = w0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return b6.m.l(this.a, p0Var.a) && b6.m.l(this.b, p0Var.b) && b6.m.l(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        b7.w0 w0Var = this.a;
        String c3 = i6.b.c(w0Var == null ? null : w0Var.u());
        b7.w0 w0Var2 = this.b;
        String c10 = i6.b.c(w0Var2 == null ? null : w0Var2.u());
        b7.w0 w0Var3 = this.c;
        String c11 = i6.b.c(w0Var3 != null ? w0Var3.u() : null);
        StringBuilder m9 = yh.m("HmacSecretExtension{coseKeyAgreement=", c3, ", saltEnc=", c10, ", saltAuth=");
        m9.append(c11);
        m9.append(", getPinUvAuthProtocol=");
        return android.support.v4.media.a.m(this.d, "}", m9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        b7.w0 w0Var = this.a;
        g5.c(parcel, 1, w0Var == null ? null : w0Var.u());
        b7.w0 w0Var2 = this.b;
        g5.c(parcel, 2, w0Var2 == null ? null : w0Var2.u());
        b7.w0 w0Var3 = this.c;
        g5.c(parcel, 3, w0Var3 != null ? w0Var3.u() : null);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.r(parcel, q10);
    }
}
