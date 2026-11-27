// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wc2 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public wc2(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        this.a = groupCallParticipant;
        this.b = z;
    }

    public final void a(int i, int i2, vc2 vc2Var) {
        float f = i / i2;
        if (this.c != f) {
            this.c = f;
            if (j95.u5 || vc2Var.f.size() % 2 != 1) {
                return;
            }
            vc2Var.D();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wc2.class == obj.getClass()) {
            wc2 wc2Var = (wc2) obj;
            if (this.b == wc2Var.b && r47.B1(this.a.peer) == r47.B1(wc2Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
