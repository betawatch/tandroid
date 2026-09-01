package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wz0 extends f2.q {
    public int b;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public int g;
    public int h;
    public final /* synthetic */ ProfileActivity i;

    public wz0(ProfileActivity profileActivity) {
        this.i = profileActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        ProfileActivity profileActivity = this.i;
        if (i11 < profileActivity.r4 || i11 >= profileActivity.s4 || i10 < this.g || i10 >= this.h) {
            int i12 = this.c.get(i10, -1);
            return i12 == this.d.get(i11, -1) && i12 >= 0;
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        return (!isEmpty ? (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.g)).intValue()) : (TLRPC.ChatParticipant) arrayList2.get(i10 - this.g)).user_id == (!profileActivity.z2.isEmpty() ? (TLRPC.ChatParticipant) profileActivity.N4.get(((Integer) profileActivity.O4.get(i11 - profileActivity.r4)).intValue()) : (TLRPC.ChatParticipant) profileActivity.N4.get(i11 - profileActivity.r4)).user_id;
    }

    @Override // f2.q
    public final int d() {
        return this.i.K2;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.i;
        g(1, profileActivity.L2, sparseIntArray);
        g(2, profileActivity.M2, sparseIntArray);
        g(3, profileActivity.P2, sparseIntArray);
        g(4, profileActivity.Q2, sparseIntArray);
        g(5, profileActivity.S2, sparseIntArray);
        g(6, profileActivity.T2, sparseIntArray);
        g(7, profileActivity.X2, sparseIntArray);
        g(8, profileActivity.U2, sparseIntArray);
        g(9, profileActivity.Z2, sparseIntArray);
        g(10, profileActivity.Y2, sparseIntArray);
        g(11, profileActivity.V2, sparseIntArray);
        g(12, profileActivity.W2, sparseIntArray);
        g(13, profileActivity.a3, sparseIntArray);
        g(14, profileActivity.b3, sparseIntArray);
        g(15, profileActivity.c3, sparseIntArray);
        g(16, profileActivity.d3, sparseIntArray);
        g(17, profileActivity.Z3, sparseIntArray);
        g(18, profileActivity.a4, sparseIntArray);
        g(19, profileActivity.c4, sparseIntArray);
        g(20, profileActivity.e4, sparseIntArray);
        g(21, profileActivity.d4, sparseIntArray);
        g(22, profileActivity.e3, sparseIntArray);
        g(23, profileActivity.f3, sparseIntArray);
        g(24, profileActivity.i3, sparseIntArray);
        g(25, profileActivity.g3, sparseIntArray);
        g(26, profileActivity.h3, sparseIntArray);
        g(27, profileActivity.j3, sparseIntArray);
        g(28, profileActivity.k3, sparseIntArray);
        g(29, profileActivity.l3, sparseIntArray);
        g(30, profileActivity.m3, sparseIntArray);
        g(31, profileActivity.n3, sparseIntArray);
        g(32, profileActivity.o3, sparseIntArray);
        g(33, profileActivity.p3, sparseIntArray);
        g(34, profileActivity.q3, sparseIntArray);
        g(35, profileActivity.r3, sparseIntArray);
        g(36, profileActivity.s3, sparseIntArray);
        g(37, profileActivity.t3, sparseIntArray);
        g(38, profileActivity.u3, sparseIntArray);
        g(39, profileActivity.v3, sparseIntArray);
        g(40, profileActivity.w3, sparseIntArray);
        g(41, profileActivity.x3, sparseIntArray);
        g(42, profileActivity.y3, sparseIntArray);
        g(43, profileActivity.z3, sparseIntArray);
        g(44, profileActivity.A3, sparseIntArray);
        g(45, profileActivity.B3, sparseIntArray);
        g(46, profileActivity.C3, sparseIntArray);
        g(47, profileActivity.D3, sparseIntArray);
        g(48, profileActivity.E3, sparseIntArray);
        g(49, profileActivity.F3, sparseIntArray);
        g(50, profileActivity.G3, sparseIntArray);
        g(51, profileActivity.H3, sparseIntArray);
        g(52, profileActivity.I3, sparseIntArray);
        g(53, profileActivity.J3, sparseIntArray);
        g(54, profileActivity.V3, sparseIntArray);
        g(55, profileActivity.K3, sparseIntArray);
        g(56, profileActivity.O3, sparseIntArray);
        g(57, profileActivity.P3, sparseIntArray);
        g(58, profileActivity.Q3, sparseIntArray);
        g(59, profileActivity.g4, sparseIntArray);
        g(60, profileActivity.R3, sparseIntArray);
        g(61, profileActivity.S3, sparseIntArray);
        g(62, profileActivity.T3, sparseIntArray);
        g(63, profileActivity.U3, sparseIntArray);
        g(64, profileActivity.W3, sparseIntArray);
        g(65, profileActivity.n4, sparseIntArray);
        g(66, profileActivity.o4, sparseIntArray);
        g(67, profileActivity.p4, sparseIntArray);
        g(68, profileActivity.q4, sparseIntArray);
        g(69, profileActivity.t4, sparseIntArray);
        g(70, profileActivity.u4, sparseIntArray);
        g(71, profileActivity.v4, sparseIntArray);
        g(72, profileActivity.w4, sparseIntArray);
        g(73, profileActivity.x4, sparseIntArray);
        g(74, profileActivity.D4, sparseIntArray);
        g(75, profileActivity.E4, sparseIntArray);
        g(76, profileActivity.B4, sparseIntArray);
        g(77, profileActivity.G4, sparseIntArray);
        g(78, profileActivity.H4, sparseIntArray);
        g(79, profileActivity.X3, sparseIntArray);
        g(80, profileActivity.Y3, sparseIntArray);
        g(81, profileActivity.I4, sparseIntArray);
        g(82, profileActivity.J4, sparseIntArray);
        g(83, profileActivity.N3, sparseIntArray);
        g(84, profileActivity.L3, sparseIntArray);
        g(85, profileActivity.M3, sparseIntArray);
        g(86, profileActivity.R2, sparseIntArray);
        g(87, profileActivity.N2, sparseIntArray);
        g(88, profileActivity.y4, sparseIntArray);
        g(89, profileActivity.z4, sparseIntArray);
        g(90, profileActivity.A4, sparseIntArray);
        g(91, profileActivity.C4, sparseIntArray);
        g(92, profileActivity.f4, sparseIntArray);
        g(93, profileActivity.k4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.m4, sparseIntArray);
        g(98, profileActivity.O2, sparseIntArray);
        g(99, profileActivity.h4, sparseIntArray);
        g(100, profileActivity.i4, sparseIntArray);
        g(101, profileActivity.j4, sparseIntArray);
    }
}
