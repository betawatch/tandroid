package q6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new l4.j(19);
    public final String a;

    c(String str) {
        this.a = str;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (str.equals(cVar.a)) {
                return cVar;
            }
        }
        throw new b(android.support.v4.media.a.o("Attachment ", str, " not supported"));
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
