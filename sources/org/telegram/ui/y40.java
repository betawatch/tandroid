package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y40 extends s4.p {
    public final /* synthetic */ x50 b;

    public y40(x50 x50Var) {
        this.b = x50Var;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        x50 x50Var = this.b;
        r50 r50Var = x50Var.P;
        int i17 = r50Var.w;
        if (i17 >= 0) {
            int i18 = x50Var.h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = r50Var.x;
        if (i19 >= 0) {
            int i20 = x50Var.u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = r50Var.y;
        if (i21 >= 0) {
            int i22 = x50Var.v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = r50Var.K;
        if (i23 >= 0) {
            int i24 = x50Var.g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = r50Var.J;
        if (i25 >= 0) {
            int i26 = x50Var.t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = r50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == x50Var.s3) {
            return true;
        }
        int i28 = x50Var.I0;
        if (i10 == i28 - 1 && i11 == r50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != r50Var.F - 1) {
            if (i11 >= r50Var.G && i11 < r50Var.H && i10 >= (i16 = x50Var.q3) && i10 < x50Var.r3) {
                return ((ChatObject.VideoParticipant) x50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) x50Var.q0.get(i11 - x50Var.P.G));
            }
            if (i11 >= r50Var.d && i11 < r50Var.e && i10 >= (i15 = x50Var.i3) && i10 < x50Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) x50Var.D0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(x50Var.a1.visibleParticipants.get(i11 - x50Var.P.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= r50Var.f && i11 < r50Var.h && i10 >= (i14 = x50Var.k3) && i10 < x50Var.l3) {
                return ((Long) x50Var.F0.get(i10 - i14)).equals(x50Var.a1.invitedUsers.get(i11 - x50Var.P.f));
            }
            if (i11 >= r50Var.n && i11 < r50Var.r && i10 >= (i13 = x50Var.m3) && i10 < x50Var.n3) {
                return ((Long) x50Var.G0.get(i10 - i13)).equals(x50Var.a1.shadyJoinParticipants.get(i11 - x50Var.P.n));
            }
            if (i11 >= r50Var.s && i11 < r50Var.v && i10 >= (i12 = x50Var.o3) && i10 < x50Var.p3) {
                return ((Long) x50Var.H0.get(i10 - i12)).equals(x50Var.a1.shadyLeftParticipants.get(i11 - x50Var.P.s));
            }
        }
        return false;
    }

    @Override // s4.p
    public final int d() {
        return this.b.P.F;
    }

    @Override // s4.p
    public final int e() {
        return this.b.I0;
    }
}
