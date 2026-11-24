// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum yrb implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("present"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("not-supported");

    public static final Parcelable.Creator<yrb> CREATOR = new lbd((byte) 8);
    public final String a;

    yrb(String str) {
        this.a = str;
    }

    public static yrb a(String str) {
        for (yrb yrbVar : values()) {
            if (str.equals(yrbVar.a)) {
                return yrbVar;
            }
        }
        throw new zrb(kt6.o("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
