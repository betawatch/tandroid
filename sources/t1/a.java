package t1;

import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    public final s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s fragment, String str) {
        super(str);
        i.e(fragment, "fragment");
        this.a = fragment;
    }
}
