package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wv0 extends v4.o {
    public int b;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public int g;
    public int h;
    public final /* synthetic */ ProfileActivity i;

    public wv0(ProfileActivity profileActivity) {
        this.i = profileActivity;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        ProfileActivity profileActivity = this.i;
        if (i10 < profileActivity.v4 || i10 >= profileActivity.w4 || i7 < this.g || i7 >= this.h) {
            int i11 = this.c.get(i7, -1);
            return i11 == this.d.get(i10, -1) && i11 >= 0;
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        return (!isEmpty ? (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i7 - this.g)).intValue()) : (TLRPC.ChatParticipant) arrayList2.get(i7 - this.g)).user_id == (!profileActivity.D2.isEmpty() ? (TLRPC.ChatParticipant) profileActivity.S4.get(((Integer) profileActivity.T4.get(i10 - profileActivity.v4)).intValue()) : (TLRPC.ChatParticipant) profileActivity.S4.get(i10 - profileActivity.v4)).user_id;
    }

    @Override // v4.o
    public final int d() {
        return this.i.O2;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.i;
        g(1, profileActivity.P2, sparseIntArray);
        g(2, profileActivity.Q2, sparseIntArray);
        g(3, profileActivity.T2, sparseIntArray);
        g(4, profileActivity.U2, sparseIntArray);
        g(5, profileActivity.W2, sparseIntArray);
        g(6, profileActivity.X2, sparseIntArray);
        g(7, profileActivity.b3, sparseIntArray);
        g(8, profileActivity.Y2, sparseIntArray);
        g(9, profileActivity.d3, sparseIntArray);
        g(10, profileActivity.c3, sparseIntArray);
        g(11, profileActivity.Z2, sparseIntArray);
        g(12, profileActivity.a3, sparseIntArray);
        g(13, profileActivity.e3, sparseIntArray);
        g(14, profileActivity.f3, sparseIntArray);
        g(15, profileActivity.g3, sparseIntArray);
        g(16, profileActivity.h3, sparseIntArray);
        g(17, profileActivity.d4, sparseIntArray);
        g(18, profileActivity.e4, sparseIntArray);
        g(19, profileActivity.g4, sparseIntArray);
        g(20, profileActivity.i4, sparseIntArray);
        g(21, profileActivity.h4, sparseIntArray);
        g(22, profileActivity.i3, sparseIntArray);
        g(23, profileActivity.j3, sparseIntArray);
        g(24, profileActivity.m3, sparseIntArray);
        g(25, profileActivity.k3, sparseIntArray);
        g(26, profileActivity.l3, sparseIntArray);
        g(27, profileActivity.n3, sparseIntArray);
        g(28, profileActivity.o3, sparseIntArray);
        g(29, profileActivity.p3, sparseIntArray);
        g(30, profileActivity.q3, sparseIntArray);
        g(31, profileActivity.r3, sparseIntArray);
        g(32, profileActivity.s3, sparseIntArray);
        g(33, profileActivity.t3, sparseIntArray);
        g(34, profileActivity.u3, sparseIntArray);
        g(35, profileActivity.v3, sparseIntArray);
        g(36, profileActivity.w3, sparseIntArray);
        g(37, profileActivity.x3, sparseIntArray);
        g(38, profileActivity.y3, sparseIntArray);
        g(39, profileActivity.z3, sparseIntArray);
        g(40, profileActivity.A3, sparseIntArray);
        g(41, profileActivity.B3, sparseIntArray);
        g(42, profileActivity.C3, sparseIntArray);
        g(43, profileActivity.D3, sparseIntArray);
        g(44, profileActivity.E3, sparseIntArray);
        g(45, profileActivity.F3, sparseIntArray);
        g(46, profileActivity.G3, sparseIntArray);
        g(47, profileActivity.H3, sparseIntArray);
        g(48, profileActivity.I3, sparseIntArray);
        g(49, profileActivity.J3, sparseIntArray);
        g(50, profileActivity.K3, sparseIntArray);
        g(51, profileActivity.L3, sparseIntArray);
        g(52, profileActivity.M3, sparseIntArray);
        g(53, profileActivity.N3, sparseIntArray);
        g(54, profileActivity.Z3, sparseIntArray);
        g(55, profileActivity.O3, sparseIntArray);
        g(56, profileActivity.S3, sparseIntArray);
        g(57, profileActivity.T3, sparseIntArray);
        g(58, profileActivity.U3, sparseIntArray);
        g(59, profileActivity.k4, sparseIntArray);
        g(60, profileActivity.V3, sparseIntArray);
        g(61, profileActivity.W3, sparseIntArray);
        g(62, profileActivity.X3, sparseIntArray);
        g(63, profileActivity.Y3, sparseIntArray);
        g(64, profileActivity.a4, sparseIntArray);
        g(65, profileActivity.r4, sparseIntArray);
        g(66, profileActivity.s4, sparseIntArray);
        g(67, profileActivity.t4, sparseIntArray);
        g(68, profileActivity.u4, sparseIntArray);
        g(69, profileActivity.x4, sparseIntArray);
        g(70, profileActivity.y4, sparseIntArray);
        g(71, profileActivity.z4, sparseIntArray);
        g(72, profileActivity.A4, sparseIntArray);
        g(73, profileActivity.B4, sparseIntArray);
        g(74, profileActivity.H4, sparseIntArray);
        g(75, profileActivity.I4, sparseIntArray);
        g(76, profileActivity.F4, sparseIntArray);
        g(77, profileActivity.L4, sparseIntArray);
        g(78, profileActivity.M4, sparseIntArray);
        g(79, profileActivity.b4, sparseIntArray);
        g(80, profileActivity.c4, sparseIntArray);
        g(81, profileActivity.N4, sparseIntArray);
        g(82, profileActivity.O4, sparseIntArray);
        g(83, profileActivity.R3, sparseIntArray);
        g(84, profileActivity.P3, sparseIntArray);
        g(85, profileActivity.Q3, sparseIntArray);
        g(86, profileActivity.V2, sparseIntArray);
        g(87, profileActivity.R2, sparseIntArray);
        g(88, profileActivity.C4, sparseIntArray);
        g(89, profileActivity.D4, sparseIntArray);
        g(90, profileActivity.E4, sparseIntArray);
        g(91, profileActivity.G4, sparseIntArray);
        g(92, profileActivity.j4, sparseIntArray);
        g(93, profileActivity.o4, sparseIntArray);
        i7 = profileActivity.botPermissionLocation;
        g(94, i7, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(95, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(96, i11, sparseIntArray);
        g(97, profileActivity.q4, sparseIntArray);
        g(98, profileActivity.S2, sparseIntArray);
        g(99, profileActivity.l4, sparseIntArray);
        g(100, profileActivity.m4, sparseIntArray);
        g(101, profileActivity.n4, sparseIntArray);
    }
}
