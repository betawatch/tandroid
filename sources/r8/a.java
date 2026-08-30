package r8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c3);

    @Override // r8.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
