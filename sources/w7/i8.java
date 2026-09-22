package w7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class i8 {
    public static int a(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
