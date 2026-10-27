package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new d(1);
    public final g a;
    public final int b;
    public final int c;
    public final int d;

    public f(g gVar, int i10, int i11, int i12) {
        this.a = gVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final void b(y8.c cVar) {
        g gVar = this.a;
        int i10 = this.b;
        if (i10 == 1) {
            cVar.onChannelOpened(gVar);
            return;
        }
        int i11 = this.d;
        int i12 = this.c;
        if (i10 == 2) {
            cVar.onChannelClosed(gVar, i12, i11);
            return;
        }
        if (i10 == 3) {
            cVar.onInputClosed(gVar, i12, i11);
        } else {
            if (i10 == 4) {
                cVar.onOutputClosed(gVar, i12, i11);
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
        StringBuilder w10 = a1.g.w("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        w10.append(num2);
        w10.append(", appErrorCode=");
        w10.append(this.d);
        w10.append("]");
        return w10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.a, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
