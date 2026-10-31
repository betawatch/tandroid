package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(26);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.g(bArr);
            l.g(str);
        }
        this.a = z10;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Arrays.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        h0.c(parcel, 2, this.b);
        h0.l(parcel, 3, this.c);
        h0.r(parcel, q6);
    }
}
