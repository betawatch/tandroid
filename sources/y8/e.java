package y8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f a;
    public final int b;
    public final int c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.a = fVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final void b(x8.a aVar) {
        f fVar = this.a;
        int i10 = this.b;
        if (i10 == 1) {
            aVar.b(fVar);
            return;
        }
        if (i10 == 2) {
            aVar.d(fVar);
            return;
        }
        if (i10 == 3) {
            aVar.c(fVar);
        } else {
            if (i10 == 4) {
                aVar.a(fVar);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i10);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i10 = this.b;
        String num = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Integer.toString(i10) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i11 = this.c;
        String num2 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? Integer.toString(i11) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder v = a1.g.v("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        v.append(num2);
        v.append(", appErrorCode=");
        v.append(this.d);
        v.append("]");
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 2, this.a, i10);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
