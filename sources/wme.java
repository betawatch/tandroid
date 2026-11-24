// default package

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wme extends dzc implements IInterface {
    public final int b;

    public wme(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 6);
        fre.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] U(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            fi7.g(e);
            return null;
        }
    }

    public abstract byte[] T();

    @Override // dzc
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            bo7 bo7Var = new bo7(T());
            parcel2.writeNoException();
            mgd.b(parcel2, bo7Var);
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
        if (obj instanceof wme) {
            try {
                wme wmeVar = (wme) obj;
                if (wmeVar.b == this.b) {
                    return Arrays.equals(T(), (byte[]) bo7.U(new bo7(wmeVar.T())));
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
