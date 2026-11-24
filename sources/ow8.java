// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ow8 extends b4 {
    public static final Parcelable.Creator<ow8> CREATOR;
    public final sw8 a;
    public final rce b;
    public final ArrayList c;

    static {
        okd.y(2, ygd.a, ygd.b);
        CREATOR = new v6d((byte) 27);
    }

    public ow8(String str, byte[] bArr, ArrayList arrayList) {
        rce rceVar = rce.c;
        rce o = rce.o(bArr.length, bArr);
        ite.h(str);
        try {
            this.a = sw8.a(str);
            this.b = o;
            this.c = arrayList;
        } catch (rw8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ow8)) {
            return false;
        }
        ow8 ow8Var = (ow8) obj;
        ArrayList arrayList = ow8Var.c;
        if (!this.a.equals(ow8Var.a) || !fse.a(this.b, ow8Var.b)) {
            return false;
        }
        ArrayList arrayList2 = this.c;
        return arrayList2 == null ? arrayList == null : arrayList != null && arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String b = xpd.b(this.b.p());
        return b10.j(mlb.m("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", b, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        this.a.getClass();
        mve.l(parcel, 2, "public-key");
        mve.c(parcel, 3, this.b.p());
        mve.p(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
