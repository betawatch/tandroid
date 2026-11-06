package w1;

import androidx.fragment.app.r;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    public final r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r fragment, String str) {
        super(str);
        j.e(fragment, "fragment");
        this.a = fragment;
    }
}
