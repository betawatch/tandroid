package y8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    public final void b(x8.c cVar) {
        f fVar = this.a;
        int i10 = this.b;
        if (i10 == 1) {
            cVar.onChannelOpened(fVar);
            return;
        }
        int i11 = this.d;
        int i12 = this.c;
        if (i10 == 2) {
            cVar.onChannelClosed(fVar, i12, i11);
            return;
        }
        if (i10 == 3) {
            cVar.onInputClosed(fVar, i12, i11);
        } else {
            if (i10 == 4) {
                cVar.onOutputClosed(fVar, i12, i11);
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
        StringBuilder w10 = a4.a.w("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        w10.append(num2);
        w10.append(", appErrorCode=");
        w10.append(this.d);
        w10.append("]");
        return w10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.a, i10);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
