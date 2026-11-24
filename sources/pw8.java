// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pw8 extends b4 {
    public static final Parcelable.Creator<pw8> CREATOR = new v6d((byte) 28);
    public final sw8 a;
    public final s61 b;

    public pw8(String str, int i) {
        ite.h(str);
        try {
            this.a = sw8.a(str);
            try {
                this.b = s61.a(i);
            } catch (r61 e) {
                throw new IllegalArgumentException(e);
            }
        } catch (rw8 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pw8)) {
            return false;
        }
        pw8 pw8Var = (pw8) obj;
        return this.a.equals(pw8Var.a) && this.b.equals(pw8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return b10.i("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        this.a.getClass();
        mve.l(parcel, 2, "public-key");
        mve.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        mve.s(parcel, r);
    }
}
