// default package

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
