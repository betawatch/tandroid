package w5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import z5.x;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class m extends c7.a implements x {
    public final int b;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 11);
        z5.l.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] J0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // c7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            j6.b bVar = new j6.b(K0());
            parcel2.writeNoException();
            y6.a.c(parcel2, bVar);
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
        if (obj != null && (obj instanceof x)) {
            try {
                x xVar = (x) obj;
                if (((m) xVar).b == this.b) {
                    return Arrays.equals(K0(), (byte[]) j6.b.K0(new j6.b(((m) xVar).K0())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
