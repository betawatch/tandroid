package x6;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 extends a implements Serializable {
    public final MessageDigest e;
    public final int f;
    public final boolean h;
    public final String n;

    public i0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f = messageDigest.getDigestLength();
            this.n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.h = z10;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.n;
    }
}
