// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qw8 extends b4 {
    public static final Parcelable.Creator<qw8> CREATOR = new v6d((byte) 29);
    public final String a;
    public final String b;
    public final String c;

    public qw8(String str, String str2, String str3) {
        ite.h(str);
        this.a = str;
        ite.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qw8)) {
            return false;
        }
        qw8 qw8Var = (qw8) obj;
        return fse.a(this.a, qw8Var.a) && fse.a(this.b, qw8Var.b) && fse.a(this.c, qw8Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.a);
        sb.append("', \n name='");
        sb.append(this.b);
        sb.append("', \n icon='");
        return b10.j(sb, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
