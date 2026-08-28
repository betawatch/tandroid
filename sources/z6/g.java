package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends y5.a {
    public final String a;
    public final k b;
    public final int c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new w7.i(20);

    static {
        ArrayList arrayList = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, k kVar, int i9, byte[] bArr) {
        String str2;
        String str3;
        String str4 = null;
        boolean z10 = true;
        int i10 = e;
        if (i9 != i10) {
            if (i9 >= 0) {
                String[] strArr = j.a;
                if (i9 < 10) {
                    str3 = strArr[i9];
                    if (str3 == null) {
                        z10 = false;
                    }
                }
            } else {
                String[] strArr2 = j.a;
            }
            str3 = null;
            if (str3 == null) {
            }
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid section type ");
        sb2.append(i9);
        x5.l.a(sb2.toString(), z10);
        this.a = str;
        this.b = kVar;
        this.c = i9;
        this.d = bArr;
        if (i9 != i10) {
            if (i9 >= 0) {
                String[] strArr3 = j.a;
                if (i9 < 10) {
                    str2 = strArr3[i9];
                    if (str2 == null) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("Invalid section type ");
                        sb3.append(i9);
                        str4 = sb3.toString();
                        if (str4 == null) {
                            throw new IllegalArgumentException(str4);
                        }
                        return;
                    }
                }
            } else {
                String[] strArr4 = j.a;
            }
            str2 = null;
            if (str2 == null) {
            }
        }
        if (str != null && bArr != null) {
            str4 = "Both content and blobContent set";
        }
        if (str4 == null) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.k(parcel, 3, this.b, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.c(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
