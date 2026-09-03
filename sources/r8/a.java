package r8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c3);

    @Override // r8.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
