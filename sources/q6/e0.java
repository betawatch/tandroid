package q6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum e0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("preferred"),
    b("required");

    public static final Parcelable.Creator<e0> CREATOR = new r0(4);
    public final String a;

    e0(String str) {
        this.a = str;
    }

    public static e0 a(String str) {
        for (e0 e0Var : values()) {
            if (str.equals(e0Var.a)) {
                return e0Var;
            }
        }
        throw new d0(android.support.v4.media.a.o("Resident key requirement ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
    }
}
