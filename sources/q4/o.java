package q4;

import a8.p0;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m6.e(26);
    public final h a;
    public final long b;
    public MediaSession.QueueItem c;

    public o(h hVar, long j3) {
        if (j3 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.a = hVar;
        this.b = j3;
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem { Description=");
        sb2.append(this.a);
        sb2.append(", Id=");
        return p0.r(sb2, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        this.a.writeToParcel(parcel, i7);
        parcel.writeLong(this.b);
    }

    public o(Parcel parcel) {
        this.a = h.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
