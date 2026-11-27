// default package

import android.os.Parcel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class zp2 extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zp2(String str, Parcel parcel) {
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

    public zp2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
