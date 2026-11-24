// default package

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zoe extends e1d implements IInterface {
    public final int b;

    public zoe(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 6);
        ite.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] U(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            bh7.j(e);
            return null;
        }
    }

    public abstract byte[] T();

    @Override // e1d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            eq7 eq7Var = new eq7(T());
            parcel2.writeNoException();
            nid.b(parcel2, eq7Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zoe) {
            try {
                zoe zoeVar = (zoe) obj;
                if (zoeVar.b == this.b) {
                    return Arrays.equals(T(), (byte[]) eq7.U(new eq7(zoeVar.T())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
