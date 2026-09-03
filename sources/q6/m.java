package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(21);
    public final c a;
    public final Boolean b;
    public final j0 c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a2;
        e0 e0Var = null;
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = c.a(str);
            } catch (b | d0 | t0 e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        this.a = a2;
        this.b = bool;
        this.c = str2 == null ? null : j0.a(str2);
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 e() {
        e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var;
        }
        Boolean bool = this.b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return e0.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return b6.m.l(this.a, mVar.a) && b6.m.l(this.b, mVar.b) && b6.m.l(this.c, mVar.c) && b6.m.l(e(), mVar.e());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, e()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder t6 = android.support.v4.media.a.t("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        t6.append(this.b);
        t6.append(", \n requireUserVerification=");
        t6.append(valueOf2);
        t6.append(", \n residentKeyRequirement=");
        return android.support.v4.media.a.r(t6, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        c cVar = this.a;
        g5.l(parcel, 2, cVar == null ? null : cVar.a);
        g5.a(parcel, 3, this.b);
        j0 j0Var = this.c;
        g5.l(parcel, 4, j0Var == null ? null : j0Var.a);
        e0 e6 = e();
        g5.l(parcel, 5, e6 != null ? e6.a : null);
        g5.r(parcel, q10);
    }
}
