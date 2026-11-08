package w0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class i extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.j.e(type, "type");
    }
}
