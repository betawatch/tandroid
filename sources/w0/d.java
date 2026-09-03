package w0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class d extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.j.e(type, "type");
    }
}
