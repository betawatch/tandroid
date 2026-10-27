package vd;

import com.google.android.gms.common.api.internal.m1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends a {
    public final m1 b = new m1(2);

    @Override // vd.a
    public final Random a() {
        Object obj = this.b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
