// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wwe extends c4 {
    public static final Parcelable.Creator<wwe> CREATOR = new ime(26);
    public final String a;
    public final hhf b;
    public final int c;
    public final byte[] d;

    static {
        ArrayList arrayList = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wwe(String str, hhf hhfVar, int i, byte[] bArr) {
        String str2;
        String str3;
        String str4;
        boolean z = true;
        if (i != -1) {
            if (i >= 0) {
                String[] strArr = eef.a;
                if (i < 10) {
                    str4 = strArr[i];
                    if (str4 == null) {
                        z = false;
                    }
                }
            } else {
                String[] strArr2 = eef.a;
            }
            str4 = null;
            if (str4 == null) {
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        xve.a(sb.toString(), z);
        this.a = str;
        this.b = hhfVar;
        this.c = i;
        this.d = bArr;
        if (i != -1) {
            if (i >= 0) {
                String[] strArr3 = eef.a;
                if (i < 10) {
                    str3 = strArr3[i];
                    if (str3 == null) {
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Invalid section type ");
                        sb2.append(i);
                        str2 = sb2.toString();
                        if (str2 != null) {
                            return;
                        }
                        lq5.j(str2);
                        throw null;
                    }
                }
            } else {
                String[] strArr4 = eef.a;
            }
            str3 = null;
            if (str3 == null) {
            }
        }
        str2 = (str == null || bArr == null) ? null : "Both content and blobContent set";
        if (str2 != null) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.k(parcel, 3, this.b, i);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.c(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
