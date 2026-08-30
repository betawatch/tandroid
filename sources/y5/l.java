package y5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class l extends a7.c implements y {
    public final int b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        b6.m.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] J0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            l6.b bVar = new l6.b(K0());
            parcel2.writeNoException();
            a7.d.c(parcel2, bVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public abstract byte[] K0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y)) {
            try {
                y yVar = (y) obj;
                if (((l) yVar).b == this.b) {
                    return Arrays.equals(K0(), (byte[]) l6.b.K0(new l6.b(((l) yVar).K0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
