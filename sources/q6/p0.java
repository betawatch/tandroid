package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        StringBuilder l10 = ai.l("HmacSecretExtension{coseKeyAgreement=", c3, ", saltEnc=", c10, ", saltAuth=");
        l10.append(c11);
        l10.append(", getPinUvAuthProtocol=");
        return android.support.v4.media.a.m(this.d, "}", l10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        b7.w0 w0Var = this.a;
        f5.c(parcel, 1, w0Var == null ? null : w0Var.u());
        b7.w0 w0Var2 = this.b;
        f5.c(parcel, 2, w0Var2 == null ? null : w0Var2.u());
        b7.w0 w0Var3 = this.c;
        f5.c(parcel, 3, w0Var3 != null ? w0Var3.u() : null);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
