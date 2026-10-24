package zh;

import java.io.IOException;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m0 implements y2.m {
    public final /* synthetic */ Object a;

    public /* synthetic */ m0(Object obj) {
        this.a = obj;
    }

    @Override // y2.m
    public void a() {
        l2.h hVar = (l2.h) this.a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }
}
