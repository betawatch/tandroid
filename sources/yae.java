// default package

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yae extends q6f implements Serializable {
    public final MessageDigest b;
    public final int c;
    public final boolean d;
    public final String e;

    public yae() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.b = messageDigest;
            this.c = messageDigest.getDigestLength();
            this.e = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.d = z;
        } catch (NoSuchAlgorithmException e) {
            hz6.e(e);
            throw null;
        }
    }

    public final String toString() {
        return this.e;
    }
}
