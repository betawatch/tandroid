package td;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a extends sd.a {
    @Override // sd.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current(...)");
        return current;
    }
}
