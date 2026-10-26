package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w40 extends s4.p {
    public final /* synthetic */ v50 b;

    public w40(v50 v50Var) {
        this.b = v50Var;
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
        v50 v50Var = this.b;
        p50 p50Var = v50Var.P;
        int i17 = p50Var.w;
        if (i17 >= 0) {
            int i18 = v50Var.h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = p50Var.x;
        if (i19 >= 0) {
            int i20 = v50Var.u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = p50Var.y;
        if (i21 >= 0) {
            int i22 = v50Var.v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = p50Var.K;
        if (i23 >= 0) {
            int i24 = v50Var.g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = p50Var.J;
        if (i25 >= 0) {
            int i26 = v50Var.t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = p50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == v50Var.s3) {
            return true;
        }
        int i28 = v50Var.I0;
        if (i10 == i28 - 1 && i11 == p50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != p50Var.F - 1) {
            if (i11 >= p50Var.G && i11 < p50Var.H && i10 >= (i16 = v50Var.q3) && i10 < v50Var.r3) {
                return ((ChatObject.VideoParticipant) v50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) v50Var.q0.get(i11 - v50Var.P.G));
            }
            if (i11 >= p50Var.d && i11 < p50Var.e && i10 >= (i15 = v50Var.i3) && i10 < v50Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) v50Var.D0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(v50Var.a1.visibleParticipants.get(i11 - v50Var.P.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= p50Var.f && i11 < p50Var.h && i10 >= (i14 = v50Var.k3) && i10 < v50Var.l3) {
                return ((Long) v50Var.F0.get(i10 - i14)).equals(v50Var.a1.invitedUsers.get(i11 - v50Var.P.f));
            }
            if (i11 >= p50Var.n && i11 < p50Var.r && i10 >= (i13 = v50Var.m3) && i10 < v50Var.n3) {
                return ((Long) v50Var.G0.get(i10 - i13)).equals(v50Var.a1.shadyJoinParticipants.get(i11 - v50Var.P.n));
            }
            if (i11 >= p50Var.s && i11 < p50Var.v && i10 >= (i12 = v50Var.o3) && i10 < v50Var.p3) {
                return ((Long) v50Var.H0.get(i10 - i12)).equals(v50Var.a1.shadyLeftParticipants.get(i11 - v50Var.P.s));
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
