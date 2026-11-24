// default package

import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class rq2 extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rq2(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(dataPosition);
        sb.append(" size=");
        sb.append(dataSize);
    }

    public rq2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
