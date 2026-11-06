package w1;

import androidx.fragment.app.r;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
