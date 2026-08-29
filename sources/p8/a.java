package p8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c3);

    @Override // p8.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
