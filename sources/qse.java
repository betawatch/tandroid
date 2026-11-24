// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class qse {
    public static final sa9 a(Throwable th) {
        th.getClass();
        return new sa9(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof sa9) {
            throw ((sa9) obj).a;
        }
    }
}
