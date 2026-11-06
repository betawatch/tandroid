package q7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i0 extends a implements Serializable {
    public final MessageDigest e;
    public final int f;
    public final boolean h;
    public final String n;

    public i0() {
        boolean z9;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f = messageDigest.getDigestLength();
            this.n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z9 = true;
            } catch (CloneNotSupportedException unused) {
                z9 = false;
            }
            this.h = z9;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.n;
    }
}
