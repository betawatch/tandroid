// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class yb0 {
    public final xb0 a = new xb0(this, 0);
    public final kk7 b = kk7.f(y6c.t0);
    public final TLObject c;
    public final int d;
    public final int e;
    public ac0 f;
    public boolean g;

    public yb0(int i, int i2, TLObject tLObject) {
        this.c = tLObject;
        this.d = i;
        this.e = i2;
    }

    public void a() {
        na7.q1(y6c.t0).Y2(this.d, ((TLRPC.Chat) this.c).id, false);
    }

    public void b(Object... objArr) {
        boolean z;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.c).id && (z = this.g)) {
            if (z) {
                this.g = false;
                this.b.n(this.a, this.e);
            }
            this.f.accept(chatFull);
        }
    }
}
