package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t40 extends f2.q {
    public final /* synthetic */ s50 b;

    public t40(s50 s50Var) {
        this.b = s50Var;
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
        s50 s50Var = this.b;
        m50 m50Var = s50Var.L;
        int i17 = m50Var.w;
        if (i17 >= 0) {
            int i18 = s50Var.d3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = m50Var.x;
        if (i19 >= 0) {
            int i20 = s50Var.q3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = m50Var.y;
        if (i21 >= 0) {
            int i22 = s50Var.r3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = m50Var.G;
        if (i23 >= 0) {
            int i24 = s50Var.c3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = m50Var.F;
        if (i25 >= 0) {
            int i26 = s50Var.p3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = m50Var.E;
        if (i27 >= 0 && i27 == i11 && i10 == s50Var.o3) {
            return true;
        }
        int i28 = s50Var.E0;
        if (i10 == i28 - 1 && i11 == m50Var.B - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != m50Var.B - 1) {
            if (i11 >= m50Var.C && i11 < m50Var.D && i10 >= (i16 = s50Var.m3) && i10 < s50Var.n3) {
                return ((ChatObject.VideoParticipant) s50Var.A0.get(i10 - i16)).equals((ChatObject.VideoParticipant) s50Var.m0.get(i11 - s50Var.L.C));
            }
            if (i11 >= m50Var.d && i11 < m50Var.e && i10 >= (i15 = s50Var.e3) && i10 < s50Var.f3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) s50Var.z0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(s50Var.W0.visibleParticipants.get(i11 - s50Var.L.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= m50Var.f && i11 < m50Var.h && i10 >= (i14 = s50Var.g3) && i10 < s50Var.h3) {
                return ((Long) s50Var.B0.get(i10 - i14)).equals(s50Var.W0.invitedUsers.get(i11 - s50Var.L.f));
            }
            if (i11 >= m50Var.n && i11 < m50Var.r && i10 >= (i13 = s50Var.i3) && i10 < s50Var.j3) {
                return ((Long) s50Var.C0.get(i10 - i13)).equals(s50Var.W0.shadyJoinParticipants.get(i11 - s50Var.L.n));
            }
            if (i11 >= m50Var.s && i11 < m50Var.v && i10 >= (i12 = s50Var.k3) && i10 < s50Var.l3) {
                return ((Long) s50Var.D0.get(i10 - i12)).equals(s50Var.W0.shadyLeftParticipants.get(i11 - s50Var.L.s));
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
