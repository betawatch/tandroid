// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xx8 extends c4 {
    public static final Parcelable.Creator<xx8> CREATOR = new m9d((byte) 28);
    public final ay8 a;
    public final t51 b;

    public xx8(String str, int i) {
        xve.h(str);
        try {
            this.a = ay8.a(str);
            try {
                this.b = t51.a(i);
            } catch (s51 e) {
                throw new IllegalArgumentException(e);
            }
        } catch (zx8 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xx8)) {
            return false;
        }
        xx8 xx8Var = (xx8) obj;
        return this.a.equals(xx8Var.a) && this.b.equals(xx8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return c00.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        this.a.getClass();
        bye.l(parcel, 2, "public-key");
        bye.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        bye.s(parcel, r);
    }
}
