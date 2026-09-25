package td;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class a extends sd.a {
    @Override // sd.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
