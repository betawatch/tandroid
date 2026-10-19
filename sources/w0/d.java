package w0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class d extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.i.e(type, "type");
    }
}
