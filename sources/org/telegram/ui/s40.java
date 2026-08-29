package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s40 extends f2.q {
    public final /* synthetic */ r50 b;

    public s40(r50 r50Var) {
        this.b = r50Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r50 r50Var = this.b;
        l50 l50Var = r50Var.L;
        int i17 = l50Var.w;
        if (i17 >= 0) {
            int i18 = r50Var.d3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = l50Var.x;
        if (i19 >= 0) {
            int i20 = r50Var.q3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = l50Var.y;
        if (i21 >= 0) {
            int i22 = r50Var.r3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = l50Var.G;
        if (i23 >= 0) {
            int i24 = r50Var.c3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = l50Var.F;
        if (i25 >= 0) {
            int i26 = r50Var.p3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = l50Var.E;
        if (i27 >= 0 && i27 == i11 && i10 == r50Var.o3) {
            return true;
        }
        int i28 = r50Var.E0;
        if (i10 == i28 - 1 && i11 == l50Var.B - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != l50Var.B - 1) {
            if (i11 >= l50Var.C && i11 < l50Var.D && i10 >= (i16 = r50Var.m3) && i10 < r50Var.n3) {
                return ((ChatObject.VideoParticipant) r50Var.A0.get(i10 - i16)).equals((ChatObject.VideoParticipant) r50Var.m0.get(i11 - r50Var.L.C));
            }
            if (i11 >= l50Var.d && i11 < l50Var.e && i10 >= (i15 = r50Var.e3) && i10 < r50Var.f3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r50Var.z0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(r50Var.W0.visibleParticipants.get(i11 - r50Var.L.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= l50Var.f && i11 < l50Var.h && i10 >= (i14 = r50Var.g3) && i10 < r50Var.h3) {
                return ((Long) r50Var.B0.get(i10 - i14)).equals(r50Var.W0.invitedUsers.get(i11 - r50Var.L.f));
            }
            if (i11 >= l50Var.n && i11 < l50Var.r && i10 >= (i13 = r50Var.i3) && i10 < r50Var.j3) {
                return ((Long) r50Var.C0.get(i10 - i13)).equals(r50Var.W0.shadyJoinParticipants.get(i11 - r50Var.L.n));
            }
            if (i11 >= l50Var.s && i11 < l50Var.v && i10 >= (i12 = r50Var.k3) && i10 < r50Var.l3) {
                return ((Long) r50Var.D0.get(i10 - i12)).equals(r50Var.W0.shadyLeftParticipants.get(i11 - r50Var.L.s));
            }
        }
        return false;
    }

    @Override // f2.q
    public final int d() {
        return this.b.L.B;
    }

    @Override // f2.q
    public final int e() {
        return this.b.E0;
    }
}
