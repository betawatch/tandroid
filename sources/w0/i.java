package w0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class i extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.i.e(type, "type");
    }
}
