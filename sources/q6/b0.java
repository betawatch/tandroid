package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(3);
    public final b7.w0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        b6.m.h(bArr);
        this.a = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        this.b = str;
        this.c = str2;
        b6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return b6.m.l(this.a, b0Var.a) && b6.m.l(this.b, b0Var.b) && b6.m.l(this.c, b0Var.c) && b6.m.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder t6 = android.support.v4.media.a.t("PublicKeyCredentialUserEntity{\n id=", i6.b.c(this.a.u()), ", \n name='");
        t6.append(this.b);
        t6.append("', \n icon='");
        t6.append(this.c);
        t6.append("', \n displayName='");
        return android.support.v4.media.a.r(t6, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 2, this.a.u());
        g5.l(parcel, 3, this.b);
        g5.l(parcel, 4, this.c);
        g5.l(parcel, 5, this.d);
        g5.r(parcel, q10);
    }
}
