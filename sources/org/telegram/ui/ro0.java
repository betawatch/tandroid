package org.telegram.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ro0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 a;
    public final /* synthetic */ PhotoViewer b;

    public ro0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.i6 i6Var) {
        this.b = photoViewer;
        this.a = i6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.T4 == null && photoViewer.b5 == null) {
            if (photoViewer.a5 != null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                org.telegram.messenger.fc fcVar = photoViewer.a5;
                File J = org.telegram.messenger.w7.J(fcVar == null ? null : fcVar.f, PhotoViewer.m1(fcVar), photoViewer.z5 != 0 || photoViewer.B5, true);
                File file = new File(org.telegram.messenger.w7.z(4), J.getName());
                org.telegram.messenger.w7.G(photoViewer.U);
                org.telegram.messenger.fc fcVar2 = photoViewer.a5;
                File J2 = org.telegram.messenger.w7.J(fcVar2 != null ? fcVar2.f : null, PhotoViewer.m1(fcVar2), false, true);
                if (!J.exists() && !file.exists() && !J2.exists()) {
                    return false;
                }
            } else if (photoViewer.j7 != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x040f, code lost:
    
        if (a8.p0.B(r3) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07ff, code lost:
    
        if (r4 == org.telegram.messenger.j10.i(r13).e()) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0803, code lost:
    
        if (r8 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0805, code lost:
    
        r4 = r7.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x080f, code lost:
    
        if (org.telegram.messenger.mp.u1(r4).f3 == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0811, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0814, code lost:
    
        r5 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x081c, code lost:
    
        if (r5.k.action == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x081e, code lost:
    
        r5 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0828, code lost:
    
        if ((r5.k.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x082b, code lost:
    
        r2 = null;
        r6 = 2131752578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0831, code lost:
    
        r5 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0839, code lost:
    
        if (r5.N3() != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x083b, code lost:
    
        if (r4 != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0841, code lost:
    
        if (org.telegram.messenger.v3.N(r9) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0843, code lost:
    
        r4 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x084c, code lost:
    
        if ((r10 - r4.k.date) > r12) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x084e, code lost:
    
        r5 = r7.E;
        r4 = new android.widget.FrameLayout(r5);
        r5 = r8;
        r10 = r7.E;
        r8 = new org.telegram.ui.Cells.d2(1, r10, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0868, code lost:
    
        if (r9 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x086a, code lost:
    
        r2 = null;
        r8.e(org.telegram.messenger.gd.M0(2131751529, "DeleteForAll"), "", false, false, false);
        r6 = 2131752578;
        r5 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08ad, code lost:
    
        if (org.telegram.messenger.gd.a0 == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08af, code lost:
    
        r9 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x08ba, code lost:
    
        if (org.telegram.messenger.gd.a0 == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08bc, code lost:
    
        r10 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08c5, code lost:
    
        r8.setPadding(r9, 0, r10, 0);
        r4.addView(r8, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.k8(r5, r0));
        r3.o(r4);
        r3.a.H = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08c1, code lost:
    
        r10 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08b4, code lost:
    
        r9 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0885, code lost:
    
        r2 = null;
        r9 = org.telegram.messenger.gd.Y(2131751528, "DeleteForUser", org.telegram.messenger.o10.j(r5));
        r6 = 2131752578;
        r5 = 5;
        r8.e(r9, "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0813, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0801, code lost:
    
        if (r9 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06d1, code lost:
    
        if (r8 == r12) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06e1, code lost:
    
        if (r8.H4() != false) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:553:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r3v21, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v36, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.PhotoViewer] */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        int i10;
        org.telegram.messenger.fj fjVar3;
        int i11;
        Activity activity;
        Activity activity2;
        org.telegram.messenger.fj fjVar4;
        org.telegram.messenger.fj fjVar5;
        org.telegram.messenger.fj fjVar6;
        rq0 rq0Var;
        rq0 rq0Var2;
        int i12;
        Activity activity3;
        org.telegram.messenger.fj fjVar7;
        Activity activity4;
        org.telegram.messenger.fj fjVar8;
        org.telegram.messenger.fj fjVar9;
        org.telegram.messenger.fj fjVar10;
        Activity activity5;
        org.telegram.messenger.fj fjVar11;
        Activity activity6;
        org.telegram.messenger.fj fjVar12;
        org.telegram.messenger.fj fjVar13;
        org.telegram.messenger.fj fjVar14;
        org.telegram.messenger.fj fjVar15;
        TLObject tLObject;
        Activity activity7;
        org.telegram.messenger.fj fjVar16;
        org.telegram.ui.Components.iw0 iw0Var;
        org.telegram.messenger.fj fjVar17;
        org.telegram.messenger.fc fcVar;
        org.telegram.messenger.fc fcVar2;
        TLRPC.Photo photo;
        org.telegram.messenger.fc fcVar3;
        org.telegram.messenger.fc fcVar4;
        TLRPC.Photo photo2;
        int i13;
        Activity activity8;
        long j3;
        org.telegram.messenger.fc fcVar5;
        org.telegram.messenger.fc fcVar6;
        org.telegram.messenger.fj fjVar18;
        int i14;
        int i15;
        org.telegram.messenger.fc fcVar7;
        org.telegram.messenger.fc fcVar8;
        org.telegram.messenger.fc fcVar9;
        String str;
        uq0 uq0Var;
        int i16;
        org.telegram.messenger.fc fcVar10;
        org.telegram.messenger.fc fcVar11;
        int i17;
        int i18;
        long j10;
        int i19;
        long j11;
        int i20;
        long j12;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        long j13;
        UndoView undoView;
        long j14;
        org.telegram.messenger.fc fcVar12;
        org.telegram.messenger.fc fcVar13;
        int i32;
        int i33;
        int i34;
        org.telegram.messenger.fj fjVar19;
        rq0 rq0Var3;
        rq0 rq0Var4;
        int i35;
        int i36;
        int i37;
        rq0 rq0Var5;
        org.telegram.messenger.fj fjVar20;
        bn bnVar;
        int i38;
        int i39;
        org.telegram.messenger.fj fjVar21;
        bn bnVar2;
        bn bnVar3;
        org.telegram.messenger.fj fjVar22;
        int i40;
        org.telegram.messenger.fj fjVar23;
        org.telegram.ui.ActionBar.r0 r0Var;
        View findViewWithTag;
        org.telegram.ui.Components.ke0 ke0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        uq0 uq0Var2;
        org.telegram.messenger.fj fjVar24;
        boolean z10;
        Activity activity10;
        uq0 uq0Var3;
        String b02;
        org.telegram.messenger.fc fcVar14;
        org.telegram.messenger.fj fjVar25;
        org.telegram.messenger.fj fjVar26;
        org.telegram.messenger.fj fjVar27;
        org.telegram.messenger.fj fjVar28;
        org.telegram.messenger.fc fcVar15;
        org.telegram.messenger.fc fcVar16;
        org.telegram.messenger.fj fjVar29;
        TextView textView;
        org.telegram.messenger.fj fjVar30;
        org.telegram.messenger.fj fjVar31;
        int i41;
        TLRPC.Chat O0;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        org.telegram.messenger.fj fjVar32;
        org.telegram.messenger.fj fjVar33;
        int i48;
        Activity activity11;
        uq0 uq0Var4;
        uq0 uq0Var5;
        org.telegram.messenger.fj fjVar34;
        Activity activity12;
        org.telegram.messenger.fj fjVar35;
        boolean z11;
        Activity activity13;
        org.telegram.messenger.fj fjVar36;
        ArrayList arrayList;
        bn bnVar4;
        String str2;
        org.telegram.messenger.aj ajVar;
        org.telegram.messenger.fj fjVar37;
        org.telegram.messenger.fj fjVar38;
        bn bnVar5;
        Activity activity14;
        ?? r02;
        Activity activity15;
        int w12;
        int w13;
        int w14;
        bn bnVar6;
        org.telegram.messenger.fj fjVar39;
        org.telegram.messenger.fj fjVar40;
        int i49;
        uq0 uq0Var6;
        org.telegram.messenger.fj fjVar41;
        org.telegram.messenger.fj fjVar42;
        org.telegram.messenger.fj fjVar43;
        String str3;
        bn bnVar7;
        int i50;
        org.telegram.messenger.fj fjVar44;
        org.telegram.messenger.fj fjVar45;
        bn bnVar8;
        Activity activity16;
        Activity activity17;
        bn bnVar9;
        oi.y3 i110;
        org.telegram.ui.Components.q7 q7Var;
        rq0 rq0Var6;
        Activity activity18;
        Activity activity19;
        bn bnVar10;
        org.telegram.messenger.aj ajVar2;
        org.telegram.messenger.fj fjVar46;
        Activity activity20;
        org.telegram.messenger.fj fjVar47;
        String M0;
        int w15;
        View d;
        int w16;
        int w17;
        org.telegram.messenger.fj fjVar48;
        org.telegram.messenger.fj fjVar49;
        org.telegram.messenger.fj fjVar50;
        org.telegram.messenger.fc fcVar17;
        rq0 rq0Var7;
        boolean z12;
        File file;
        rq0 rq0Var8;
        int i51;
        rq0 rq0Var9;
        int i52;
        org.telegram.messenger.fc fcVar18;
        int i53;
        org.telegram.messenger.fc fcVar19;
        long j15;
        boolean z13;
        File J;
        int i54;
        org.telegram.messenger.fc fcVar20;
        boolean z14;
        org.telegram.messenger.fj fjVar51;
        ?? r32;
        File file2;
        Activity activity21;
        Activity activity22;
        org.telegram.messenger.fj fjVar52;
        TLRPC.Document document;
        int i55;
        int i56;
        org.telegram.messenger.fj fjVar53;
        org.telegram.messenger.fj fjVar54;
        org.telegram.messenger.fj fjVar55;
        int i57;
        org.telegram.messenger.fj fjVar56;
        org.telegram.messenger.fj fjVar57;
        org.telegram.messenger.fj fjVar58;
        org.telegram.messenger.fj fjVar59;
        int i58;
        TLObject l1;
        int i59;
        bn bnVar11;
        org.telegram.messenger.fj fjVar60;
        boolean z15;
        boolean F1;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        boolean z16 = true;
        z16 = true;
        z16 = true;
        ?? r72 = this.b;
        int i60 = 0;
        if (i7 == -1) {
            vp0 vp0Var = r72.M1;
            if (vp0Var == null || !vp0Var.n0()) {
                F1 = r72.F1();
                if (F1) {
                    r72.x0(false);
                    return;
                } else {
                    r72.z0(true, false);
                    return;
                }
            }
            return;
        }
        final int i61 = 0;
        if (i7 == 2) {
            rq0Var6 = r72.j7;
            if (rq0Var6 != null) {
                z15 = r72.l2;
                if (!z15) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.b) {
                activity18 = r72.E;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = r72.E;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            bnVar10 = r72.l4;
            if (bnVar10 != null) {
                bnVar11 = r72.l4;
                fjVar60 = r72.T4;
                ajVar2 = bnVar11.U8(fjVar60.c1());
            } else {
                ajVar2 = null;
            }
            if (ajVar2 != null) {
                arrayList2.addAll(ajVar2.d);
            } else {
                fjVar46 = r72.T4;
                arrayList2.add(fjVar46);
            }
            if (arrayList2.size() > 1) {
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                for (int i62 = 0; i62 < arrayList2.size(); i62++) {
                    org.telegram.messenger.fj fjVar61 = (org.telegram.messenger.fj) arrayList2.get(i62);
                    if (fjVar61.D3()) {
                        z19 = true;
                    } else if (fjVar61.H4()) {
                        z17 = true;
                    } else {
                        z18 = true;
                    }
                }
                activity20 = r72.E;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, i6Var);
                alertDialog$Builder.l(org.telegram.messenger.gd.M0(2131745746, "SaveGroupMedia"));
                alertDialog$Builder.g(org.telegram.messenger.gd.M0(2131745745, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.J = org.telegram.ui.ActionBar.n6.gh;
                fjVar47 = r72.T4;
                if (fjVar47 != null) {
                    fjVar48 = r72.T4;
                    if (fjVar48.H4()) {
                        fjVar49 = r72.T4;
                        if (!fjVar49.D3()) {
                            M0 = org.telegram.messenger.gd.M0(2131743907, "ThisMedia");
                            final int i63 = true ? 1 : 0;
                            alertDialog$Builder.h(M0, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.jo0
                                public final /* synthetic */ ro0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.r1
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i64) {
                                    File M;
                                    switch (i63) {
                                        case 0:
                                            ro0 ro0Var = this.b;
                                            ro0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer2 = ro0Var.b;
                                            arrayList3.add(photoViewer2.T4);
                                            PhotoViewer.u(photoViewer2, arrayList3);
                                            break;
                                        default:
                                            ro0 ro0Var2 = this.b;
                                            PhotoViewer photoViewer3 = ro0Var2.b;
                                            org.telegram.messenger.fj fjVar62 = photoViewer3.T4;
                                            if (fjVar62 != null) {
                                                File file3 = null;
                                                if ((org.telegram.messenger.fj.n1(fjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(photoViewer3.T4.k).webpage != null && org.telegram.messenger.fj.n1(photoViewer3.T4.k).webpage.document == null) {
                                                    TLObject l12 = photoViewer3.l1(photoViewer3.P4, null);
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    M = org.telegram.messenger.w7.J(l12, null, true, true);
                                                } else {
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    M = org.telegram.messenger.w7.M(photoViewer3.T4.k, false, true);
                                                }
                                                boolean L4 = org.telegram.messenger.fj.L4(photoViewer3.T4.k);
                                                boolean D3 = photoViewer3.T4.D3();
                                                if (D3) {
                                                    TLRPC.Document document2 = org.telegram.messenger.fj.n1(photoViewer3.T4.k) != null ? org.telegram.messenger.fj.n1(photoViewer3.T4.k).document : null;
                                                    if (document2 != null) {
                                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                                        File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                        if (J2 == null || !J2.exists()) {
                                                            org.telegram.messenger.w7.G(photoViewer3.U);
                                                            file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                        } else {
                                                            file3 = J2;
                                                        }
                                                    }
                                                }
                                                if (!D3) {
                                                    if (M != null && M.exists()) {
                                                        MediaController.d0(M.toString(), photoViewer3.E, L4 ? 1 : 0, null, null, new lo0(ro0Var2, L4, 0));
                                                        break;
                                                    } else {
                                                        photoViewer3.S2();
                                                        break;
                                                    }
                                                } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                                    MediaController.e0(M.toString(), file3.toString(), photoViewer3.E, new io0(ro0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer3.S2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final boolean z20 = z17;
                            final boolean z21 = z18;
                            final boolean z22 = z19;
                            alertDialog$Builder.k((!z17 || z19) ? org.telegram.messenger.gd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.gd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.oo0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i64) {
                                    File M;
                                    ro0 ro0Var = ro0.this;
                                    PhotoViewer photoViewer2 = ro0Var.b;
                                    int[] iArr = new int[1];
                                    final tn0 tn0Var = new tn0(ro0Var, new int[1], iArr, z20, z21, z22);
                                    int i65 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i65 >= arrayList3.size()) {
                                            return;
                                        }
                                        org.telegram.messenger.fj fjVar62 = (org.telegram.messenger.fj) arrayList3.get(i65);
                                        if (fjVar62 != null) {
                                            File file3 = null;
                                            if ((org.telegram.messenger.fj.n1(fjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(fjVar62.k).webpage != null && org.telegram.messenger.fj.n1(fjVar62.k).webpage.document == null) {
                                                org.telegram.messenger.w7.G(photoViewer2.U);
                                                M = org.telegram.messenger.w7.J(photoViewer2.l1(photoViewer2.P4, null), null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer2.U);
                                                M = org.telegram.messenger.w7.M(fjVar62.k, false, true);
                                            }
                                            boolean L4 = org.telegram.messenger.fj.L4(fjVar62.k);
                                            boolean D3 = fjVar62.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = org.telegram.messenger.fj.n1(fjVar62.k) != null ? org.telegram.messenger.fj.n1(fjVar62.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer2.U);
                                                    File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer2.U);
                                                        file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                    } else {
                                                        file3 = J2;
                                                    }
                                                }
                                            }
                                            if (D3 && M != null && M.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i66 = 1;
                                                    MediaController.d0(M.toString(), photoViewer2.E, 0, null, null, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ko0
                                                        @Override // org.telegram.messenger.x10
                                                        public final void a(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i67 = 0;
                                                    MediaController.e0(M.toString(), file3.toString(), photoViewer2.E, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ko0
                                                        @Override // org.telegram.messenger.x10
                                                        public final void a(Object obj) {
                                                            switch (i67) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!D3 && M != null && M.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i68 = 2;
                                                MediaController.d0(M.toString(), photoViewer2.E, L4 ? 1 : 0, null, null, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ko0
                                                    @Override // org.telegram.messenger.x10
                                                    public final void a(Object obj) {
                                                        switch (i68) {
                                                            case 0:
                                                                org.telegram.messenger.g0.g3(tn0Var);
                                                                break;
                                                            case 1:
                                                                org.telegram.messenger.g0.g3(tn0Var);
                                                                break;
                                                            default:
                                                                org.telegram.messenger.g0.g3(tn0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i65++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131752578, "Cancel"), new l60(7));
                            org.telegram.ui.ActionBar.u1 a10 = alertDialog$Builder.a();
                            w15 = r72.w1(org.telegram.ui.ActionBar.n6.lh);
                            a10.j(w15);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i64 = org.telegram.ui.ActionBar.n6.q7;
                                org.telegram.ui.ActionBar.u6.U((TextView) d, i64, r72.w2);
                                w17 = r72.w1(i64);
                                d.setBackground(org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(3.0f), w17));
                                ViewGroup viewGroup = a10.u0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            w16 = r72.w1(org.telegram.ui.ActionBar.n6.Yg);
                            a10.p(w16);
                            return;
                        }
                    }
                }
                M0 = org.telegram.messenger.gd.M0(2131743906, "ThisPhoto");
                final int i632 = true ? 1 : 0;
                alertDialog$Builder.h(M0, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.jo0
                    public final /* synthetic */ ro0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.r1
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i642) {
                        File M;
                        switch (i632) {
                            case 0:
                                ro0 ro0Var = this.b;
                                ro0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer2 = ro0Var.b;
                                arrayList3.add(photoViewer2.T4);
                                PhotoViewer.u(photoViewer2, arrayList3);
                                break;
                            default:
                                ro0 ro0Var2 = this.b;
                                PhotoViewer photoViewer3 = ro0Var2.b;
                                org.telegram.messenger.fj fjVar62 = photoViewer3.T4;
                                if (fjVar62 != null) {
                                    File file3 = null;
                                    if ((org.telegram.messenger.fj.n1(fjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(photoViewer3.T4.k).webpage != null && org.telegram.messenger.fj.n1(photoViewer3.T4.k).webpage.document == null) {
                                        TLObject l12 = photoViewer3.l1(photoViewer3.P4, null);
                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                        M = org.telegram.messenger.w7.J(l12, null, true, true);
                                    } else {
                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                        M = org.telegram.messenger.w7.M(photoViewer3.T4.k, false, true);
                                    }
                                    boolean L4 = org.telegram.messenger.fj.L4(photoViewer3.T4.k);
                                    boolean D3 = photoViewer3.T4.D3();
                                    if (D3) {
                                        TLRPC.Document document2 = org.telegram.messenger.fj.n1(photoViewer3.T4.k) != null ? org.telegram.messenger.fj.n1(photoViewer3.T4.k).document : null;
                                        if (document2 != null) {
                                            org.telegram.messenger.w7.G(photoViewer3.U);
                                            File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                            if (J2 == null || !J2.exists()) {
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                            } else {
                                                file3 = J2;
                                            }
                                        }
                                    }
                                    if (!D3) {
                                        if (M != null && M.exists()) {
                                            MediaController.d0(M.toString(), photoViewer3.E, L4 ? 1 : 0, null, null, new lo0(ro0Var2, L4, 0));
                                            break;
                                        } else {
                                            photoViewer3.S2();
                                            break;
                                        }
                                    } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                        MediaController.e0(M.toString(), file3.toString(), photoViewer3.E, new io0(ro0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer3.S2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                final boolean z202 = z17;
                final boolean z212 = z18;
                final boolean z222 = z19;
                alertDialog$Builder.k((!z17 || z19) ? org.telegram.messenger.gd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.gd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.oo0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i642) {
                        File M;
                        ro0 ro0Var = ro0.this;
                        PhotoViewer photoViewer2 = ro0Var.b;
                        int[] iArr = new int[1];
                        final tn0 tn0Var = new tn0(ro0Var, new int[1], iArr, z202, z212, z222);
                        int i65 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i65 >= arrayList3.size()) {
                                return;
                            }
                            org.telegram.messenger.fj fjVar62 = (org.telegram.messenger.fj) arrayList3.get(i65);
                            if (fjVar62 != null) {
                                File file3 = null;
                                if ((org.telegram.messenger.fj.n1(fjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(fjVar62.k).webpage != null && org.telegram.messenger.fj.n1(fjVar62.k).webpage.document == null) {
                                    org.telegram.messenger.w7.G(photoViewer2.U);
                                    M = org.telegram.messenger.w7.J(photoViewer2.l1(photoViewer2.P4, null), null, true, true);
                                } else {
                                    org.telegram.messenger.w7.G(photoViewer2.U);
                                    M = org.telegram.messenger.w7.M(fjVar62.k, false, true);
                                }
                                boolean L4 = org.telegram.messenger.fj.L4(fjVar62.k);
                                boolean D3 = fjVar62.D3();
                                if (D3) {
                                    TLRPC.Document document2 = org.telegram.messenger.fj.n1(fjVar62.k) != null ? org.telegram.messenger.fj.n1(fjVar62.k).document : null;
                                    if (document2 != null) {
                                        org.telegram.messenger.w7.G(photoViewer2.U);
                                        File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                        if (J2 == null || !J2.exists()) {
                                            org.telegram.messenger.w7.G(photoViewer2.U);
                                            file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                        } else {
                                            file3 = J2;
                                        }
                                    }
                                }
                                if (D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i66 = 1;
                                        MediaController.d0(M.toString(), photoViewer2.E, 0, null, null, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ko0
                                            @Override // org.telegram.messenger.x10
                                            public final void a(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        org.telegram.messenger.g0.g3(tn0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.g3(tn0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.g3(tn0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i67 = 0;
                                        MediaController.e0(M.toString(), file3.toString(), photoViewer2.E, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ko0
                                            @Override // org.telegram.messenger.x10
                                            public final void a(Object obj) {
                                                switch (i67) {
                                                    case 0:
                                                        org.telegram.messenger.g0.g3(tn0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.g3(tn0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.g3(tn0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i68 = 2;
                                    MediaController.d0(M.toString(), photoViewer2.E, L4 ? 1 : 0, null, null, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ko0
                                        @Override // org.telegram.messenger.x10
                                        public final void a(Object obj) {
                                            switch (i68) {
                                                case 0:
                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.g3(tn0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i65++;
                        }
                    }
                });
                alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131752578, "Cancel"), new l60(7));
                org.telegram.ui.ActionBar.u1 a102 = alertDialog$Builder.a();
                w15 = r72.w1(org.telegram.ui.ActionBar.n6.lh);
                a102.j(w15);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                w16 = r72.w1(org.telegram.ui.ActionBar.n6.Yg);
                a102.p(w16);
                return;
            }
            fjVar50 = r72.T4;
            if (fjVar50 != null) {
                fjVar55 = r72.T4;
                if (org.telegram.messenger.fj.n1(fjVar55.k) instanceof TLRPC.TL_messageMediaWebPage) {
                    fjVar58 = r72.T4;
                    if (org.telegram.messenger.fj.n1(fjVar58.k).webpage != null) {
                        fjVar59 = r72.T4;
                        if (org.telegram.messenger.fj.n1(fjVar59.k).webpage.document == null) {
                            i58 = r72.P4;
                            l1 = r72.l1(i58, null);
                            i59 = r72.U;
                            org.telegram.messenger.w7.G(i59);
                            file = org.telegram.messenger.w7.K(l1, true);
                            if (!file.exists()) {
                                file = new File(org.telegram.messenger.w7.z(4), file.getName());
                            }
                            fjVar57 = r72.T4;
                            z12 = fjVar57.H4();
                        }
                    }
                }
                i57 = r72.U;
                org.telegram.messenger.w7.G(i57);
                fjVar56 = r72.T4;
                file = org.telegram.messenger.w7.L(fjVar56.k);
                fjVar57 = r72.T4;
                z12 = fjVar57.H4();
            } else {
                fcVar17 = r72.a5;
                if (fcVar17 != null) {
                    fcVar18 = r72.a5;
                    String m12 = PhotoViewer.m1(fcVar18);
                    i53 = r72.U;
                    org.telegram.messenger.w7.G(i53);
                    fcVar19 = r72.a5;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar19 == null ? null : fcVar19.f;
                    j15 = r72.z5;
                    if (j15 == 0) {
                        z14 = r72.B5;
                        if (!z14) {
                            z13 = false;
                            J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, m12, z13, true);
                            if (J != null && !J.exists()) {
                                i54 = r72.U;
                                org.telegram.messenger.w7.G(i54);
                                fcVar20 = r72.a5;
                                J = org.telegram.messenger.w7.J(fcVar20 != null ? null : fcVar20.f, m12, false, true);
                            }
                            if (m12 != null) {
                                m12 = m12.toLowerCase();
                            }
                            File file3 = J;
                            z12 = m12 == null && (m12.equals("webm") || m12.equals("mp4") || m12.equals("gif"));
                            file = file3;
                        }
                    }
                    z13 = true;
                    J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, m12, z13, true);
                    if (J != null) {
                        i54 = r72.U;
                        org.telegram.messenger.w7.G(i54);
                        fcVar20 = r72.a5;
                        J = org.telegram.messenger.w7.J(fcVar20 != null ? null : fcVar20.f, m12, false, true);
                    }
                    if (m12 != null) {
                    }
                    File file32 = J;
                    z12 = m12 == null && (m12.equals("webm") || m12.equals("mp4") || m12.equals("gif"));
                    file = file32;
                } else {
                    rq0Var7 = r72.j7;
                    if (rq0Var7 != null) {
                        rq0Var8 = r72.j7;
                        i51 = r72.P4;
                        file = rq0Var8.b(i51);
                        rq0Var9 = r72.j7;
                        i52 = r72.P4;
                        z12 = rq0Var9.a(i52);
                    } else {
                        z12 = false;
                        file = null;
                    }
                }
            }
            if (file != null && !file.exists()) {
                file = new File(org.telegram.messenger.w7.z(4), file.getName());
            }
            fjVar51 = r72.T4;
            if (fjVar51 != null) {
                fjVar54 = r72.T4;
                if (fjVar54.D3()) {
                    r32 = true;
                    if (r32 != false) {
                        fjVar52 = r72.T4;
                        if (org.telegram.messenger.fj.n1(fjVar52.k) != null) {
                            fjVar53 = r72.T4;
                            document = org.telegram.messenger.fj.n1(fjVar53.k).document;
                        } else {
                            document = null;
                        }
                        if (document != null) {
                            i55 = r72.U;
                            org.telegram.messenger.w7.G(i55);
                            file2 = org.telegram.messenger.w7.K(document, false);
                            if (file2 == null || !file2.exists()) {
                                i56 = r72.U;
                                org.telegram.messenger.w7.G(i56);
                                file2 = org.telegram.messenger.w7.K(document, true);
                            }
                            if (r32 != true) {
                                if (file == null || !file.exists()) {
                                    r72.S2();
                                    return;
                                }
                                String file4 = file.toString();
                                activity21 = r72.E;
                                MediaController.d0(file4, activity21, z12 ? 1 : 0, null, null, new lo0(this, z12, 1));
                                return;
                            }
                            if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                r72.S2();
                                return;
                            }
                            String file5 = file.toString();
                            String file6 = file2.toString();
                            activity22 = r72.E;
                            MediaController.e0(file5, file6, activity22, new io0(this, 0));
                            return;
                        }
                    }
                    file2 = null;
                    if (r32 != true) {
                    }
                }
            }
            r32 = false;
            if (r32 != false) {
            }
            file2 = null;
            if (r32 != true) {
            }
        } else {
            if (i7 == 24) {
                wf.b J2 = wf.b.J();
                i110 = r72.i1();
                J2.Q(i110);
                q7Var = r72.H0;
                q7Var.performClick();
                return;
            }
            if (i7 == 3) {
                if (r72.E5 != 0) {
                    r72.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", r72.E5);
                    org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(bundle, null);
                    bnVar8 = r72.l4;
                    if (bnVar8 != null) {
                        bnVar9 = r72.l4;
                        i90Var.e0(bnVar9.Q8());
                    }
                    r72.z0(false, false);
                    activity16 = r72.E;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = r72.E;
                        ((LaunchActivity) activity17).u0(i90Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 5 || i7 == 21) {
                fjVar = r72.T4;
                if (fjVar == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = r72.E5;
                fjVar2 = r72.T4;
                if (fjVar2 != null) {
                    fjVar5 = r72.T4;
                    j16 = fjVar5.A0();
                }
                if (org.telegram.messenger.n5.C(j16)) {
                    bundle2.putInt("enc_id", org.telegram.messenger.n5.h(j16));
                } else if (org.telegram.messenger.n5.E(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i10 = r72.U;
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-j16));
                    if (O02 != null && O02.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -O02.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                fjVar3 = r72.T4;
                bundle2.putInt("message_id", fjVar3.e1());
                if (i7 == 21) {
                    fjVar4 = r72.T4;
                    bundle2.putInt("reply_to", fjVar4.e1());
                }
                i11 = r72.U;
                org.telegram.messenger.ks.f(i11).k(org.telegram.messenger.ks.t, new Object[0]);
                activity = r72.E;
                if (activity instanceof LaunchActivity) {
                    activity2 = r72.E;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.u0(new bn(bundle2), launchActivity.R() > 1 || org.telegram.messenger.g0.Q1(), true);
                }
                r72.z0(false, false);
                r72.T4 = null;
                VideoAds videoAds = r72.U4;
                if (videoAds != null) {
                    videoAds.stop();
                    r72.U4 = null;
                    return;
                }
                return;
            }
            if (i7 == 25) {
                if (r72.m4 != null) {
                    uq0Var6 = r72.d;
                    if (uq0Var6 == null) {
                        return;
                    }
                    fjVar41 = r72.T4;
                    if (fjVar41 != null) {
                        fjVar42 = r72.T4;
                        if (fjVar42.k == null) {
                            return;
                        }
                        fjVar43 = r72.T4;
                        if (!TextUtils.isEmpty(fjVar43.k.attachPath)) {
                            fjVar45 = r72.T4;
                            str3 = fjVar45.k.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = r72.U;
                            org.telegram.messenger.w7.G(i50);
                            fjVar44 = r72.T4;
                            File N = org.telegram.messenger.w7.N(fjVar44.k);
                            if (N != null && N.exists()) {
                                str3 = N.getAbsolutePath();
                            }
                        }
                        String str4 = str3;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        bnVar7 = r72.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new org.telegram.messenger.ef(0, str4, 0, false, 0, 0));
                        this.b.f2(arrayList3, 0, 11, false, new po0(), bnVar7);
                        r72.S0(null, null, false, null);
                        r72.k2();
                        ns.p().w();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 4) {
                fjVar34 = r72.T4;
                if (fjVar34 == null) {
                    return;
                }
                activity12 = r72.E;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                fjVar35 = r72.T4;
                if (!fjVar35.r1) {
                    fjVar40 = r72.T4;
                    long A0 = fjVar40.A0();
                    if (org.telegram.messenger.n5.z(A0)) {
                        i49 = r72.U;
                        z11 = org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(i49).O0(Long.valueOf(-A0)));
                        activity13 = r72.E;
                        fjVar36 = r72.T4;
                        ((LaunchActivity) activity13).O0(fjVar36.K1);
                        arrayList = new ArrayList(1);
                        bnVar4 = r72.l4;
                        if (bnVar4 == null) {
                            bnVar6 = r72.l4;
                            fjVar39 = r72.T4;
                            str2 = "Cancel";
                            ajVar = bnVar6.U8(fjVar39.c1());
                        } else {
                            str2 = "Cancel";
                            ajVar = null;
                        }
                        if (ajVar == null) {
                            arrayList.addAll(ajVar.d);
                        } else {
                            fjVar37 = r72.T4;
                            arrayList.add(fjVar37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.u(r72, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            cx cxVar = new cx(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            fjVar38 = r72.T4;
                            arrayList4.add(fjVar38);
                            bnVar5 = r72.l4;
                            cxVar.E2 = new z6(this, arrayList4, bnVar5, 18);
                            activity14 = r72.E;
                            ((LaunchActivity) activity14).u0(cxVar, false, true);
                            r72.z0(false, false);
                            return;
                        }
                        for (int i65 = 0; i65 < arrayList.size(); i65++) {
                            if (!((org.telegram.messenger.fj) arrayList.get(i65)).R3() || ((org.telegram.messenger.fj) arrayList.get(i65)).H4()) {
                                r02 = false;
                                break;
                            }
                        }
                        r02 = true;
                        activity15 = r72.E;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, i6Var);
                        alertDialog$Builder2.l(org.telegram.messenger.gd.M0(2131750569, "ForwardGroupMedia"));
                        alertDialog$Builder2.g(org.telegram.messenger.gd.M0(2131750568, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.J = org.telegram.ui.ActionBar.n6.gh;
                        alertDialog$Builder2.h(r02 != false ? org.telegram.messenger.gd.M0(2131743906, "ThisPhoto") : org.telegram.messenger.gd.M0(2131743907, "ThisMedia"), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.jo0
                            public final /* synthetic */ ro0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.r1
                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i642) {
                                File M;
                                switch (i61) {
                                    case 0:
                                        ro0 ro0Var = this.b;
                                        ro0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer2 = ro0Var.b;
                                        arrayList32.add(photoViewer2.T4);
                                        PhotoViewer.u(photoViewer2, arrayList32);
                                        break;
                                    default:
                                        ro0 ro0Var2 = this.b;
                                        PhotoViewer photoViewer3 = ro0Var2.b;
                                        org.telegram.messenger.fj fjVar62 = photoViewer3.T4;
                                        if (fjVar62 != null) {
                                            File file33 = null;
                                            if ((org.telegram.messenger.fj.n1(fjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(photoViewer3.T4.k).webpage != null && org.telegram.messenger.fj.n1(photoViewer3.T4.k).webpage.document == null) {
                                                TLObject l12 = photoViewer3.l1(photoViewer3.P4, null);
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                M = org.telegram.messenger.w7.J(l12, null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                M = org.telegram.messenger.w7.M(photoViewer3.T4.k, false, true);
                                            }
                                            boolean L4 = org.telegram.messenger.fj.L4(photoViewer3.T4.k);
                                            boolean D3 = photoViewer3.T4.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = org.telegram.messenger.fj.n1(photoViewer3.T4.k) != null ? org.telegram.messenger.fj.n1(photoViewer3.T4.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    File J22 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                    if (J22 == null || !J22.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                                        file33 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                    } else {
                                                        file33 = J22;
                                                    }
                                                }
                                            }
                                            if (!D3) {
                                                if (M != null && M.exists()) {
                                                    MediaController.d0(M.toString(), photoViewer3.E, L4 ? 1 : 0, null, null, new lo0(ro0Var2, L4, 0));
                                                    break;
                                                } else {
                                                    photoViewer3.S2();
                                                    break;
                                                }
                                            } else if (M != null && M.exists() && file33 != null && file33.exists()) {
                                                MediaController.e0(M.toString(), file33.toString(), photoViewer3.E, new io0(ro0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer3.S2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(r02 != false ? org.telegram.messenger.gd.G(arrayList.size(), "AllNPhotos", new Object[0]) : org.telegram.messenger.gd.G(arrayList.size(), "AllNMedia", new Object[0]), new aj0(6, this, arrayList));
                        alertDialog$Builder2.i(org.telegram.messenger.gd.M0(2131752578, str2), new l60(8));
                        org.telegram.ui.ActionBar.u1 a11 = alertDialog$Builder2.a();
                        w12 = r72.w1(org.telegram.ui.ActionBar.n6.lh);
                        a11.j(w12);
                        a11.show();
                        View d2 = a11.d(-3);
                        if (d2 instanceof TextView) {
                            int i66 = org.telegram.ui.ActionBar.n6.q7;
                            org.telegram.ui.ActionBar.u6.U((TextView) d2, i66, r72.w2);
                            w14 = r72.w1(i66);
                            d2.setBackground(org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(3.0f), w14));
                            ViewGroup viewGroup2 = a11.u0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d2.bringToFront();
                            }
                        }
                        w13 = r72.w1(org.telegram.ui.ActionBar.n6.Yg);
                        a11.p(w13);
                        return;
                    }
                }
                z11 = false;
                activity13 = r72.E;
                fjVar36 = r72.T4;
                ((LaunchActivity) activity13).O0(fjVar36.K1);
                arrayList = new ArrayList(1);
                bnVar4 = r72.l4;
                if (bnVar4 == null) {
                }
                if (ajVar == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i7 == 18) {
                    PhotoViewer.v(r72);
                    return;
                }
                if (i7 == 26) {
                    activity11 = r72.E;
                    if (activity11 != null) {
                        uq0Var4 = r72.d;
                        if (uq0Var4 == null) {
                            return;
                        }
                        uq0Var5 = r72.d;
                        uq0Var5.J();
                        r72.z0(true, false);
                        return;
                    }
                    return;
                }
                if (i7 == 7) {
                    activity9 = r72.E;
                    if (activity9 == null) {
                        return;
                    }
                    uq0Var2 = r72.d;
                    if (uq0Var2 == null) {
                        return;
                    }
                    fjVar24 = r72.T4;
                    if (fjVar24 != null) {
                        fjVar32 = r72.T4;
                        if (!fjVar32.r1) {
                            fjVar33 = r72.T4;
                            long A02 = fjVar33.A0();
                            if (org.telegram.messenger.n5.z(A02)) {
                                i48 = r72.U;
                                z10 = org.telegram.messenger.v3.T(org.telegram.messenger.mp.u1(i48).O0(Long.valueOf(-A02)));
                                activity10 = r72.E;
                                ?? alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                uq0Var3 = r72.d;
                                b02 = uq0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(org.telegram.messenger.gd.M0(2131754092, "AreYouSureDeletePhotoTitle"));
                                    alertDialog$Builder3.g(b02);
                                } else {
                                    if (!r72.t4) {
                                        fcVar14 = r72.a5;
                                        if (fcVar14 != null) {
                                            fcVar15 = r72.a5;
                                            fcVar16 = r72.Z4;
                                        }
                                        fjVar25 = r72.T4;
                                        if (fjVar25 != null) {
                                            fjVar28 = r72.T4;
                                        }
                                        fjVar26 = r72.T4;
                                        if (fjVar26 != null) {
                                            fjVar27 = r72.T4;
                                            if (fjVar27.q3()) {
                                                alertDialog$Builder3.l(org.telegram.messenger.gd.M0(2131754095, "AreYouSureDeleteGIFTitle"));
                                                if (z10) {
                                                    alertDialog$Builder3.g(org.telegram.messenger.gd.Y(2131754096, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(org.telegram.messenger.gd.Y(2131754097, "AreYouSureDeleteGIF", new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(org.telegram.messenger.gd.M0(2131754092, "AreYouSureDeletePhotoTitle"));
                                        if (z10) {
                                            alertDialog$Builder3.g(org.telegram.messenger.gd.Y(2131754093, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(org.telegram.messenger.gd.Y(2131754094, "AreYouSureDeletePhoto", new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(org.telegram.messenger.gd.M0(2131754081, "AreYouSureDeleteVideoTitle"));
                                    if (z10) {
                                        alertDialog$Builder3.g(org.telegram.messenger.gd.Y(2131754082, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(org.telegram.messenger.gd.Y(2131754083, "AreYouSureDeleteVideo", new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                fjVar29 = r72.T4;
                                if (fjVar29 != null) {
                                    fjVar30 = r72.T4;
                                    if (!fjVar30.r1) {
                                        fjVar31 = r72.T4;
                                        long A03 = fjVar31.A0();
                                        if (!org.telegram.messenger.n5.C(A03)) {
                                            if (org.telegram.messenger.n5.E(A03)) {
                                                i47 = r72.U;
                                                user = org.telegram.messenger.mp.u1(i47).c2(Long.valueOf(A03));
                                                O0 = null;
                                            } else {
                                                i41 = r72.U;
                                                O0 = org.telegram.messenger.mp.u1(i41).O0(Long.valueOf(-A03));
                                                user = null;
                                            }
                                            if (user != null || !org.telegram.messenger.v3.T(O0)) {
                                                i42 = r72.U;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = r72.U;
                                                    i44 = org.telegram.messenger.mp.u1(i46).e3;
                                                } else {
                                                    i43 = r72.U;
                                                    i44 = org.telegram.messenger.mp.u1(i43).d3;
                                                }
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = r72.U;
                                                }
                                            }
                                        }
                                    }
                                }
                                int i67 = 2131752578;
                                org.telegram.ui.ActionBar.r1 r1Var = null;
                                alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131751587, "Delete"), new aj0(7, this, zArr));
                                alertDialog$Builder3.h(org.telegram.messenger.gd.M0(i67, "Cancel"), r1Var);
                                org.telegram.ui.ActionBar.u1 a12 = alertDialog$Builder3.a();
                                r72.Q2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, r72.w2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = r72.E;
                    ?? alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    uq0Var3 = r72.d;
                    b02 = uq0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    fjVar29 = r72.T4;
                    if (fjVar29 != null) {
                    }
                    int i672 = 2131752578;
                    org.telegram.ui.ActionBar.r1 r1Var2 = null;
                    alertDialog$Builder32.k(org.telegram.messenger.gd.M0(2131751587, "Delete"), new aj0(7, this, zArr2));
                    alertDialog$Builder32.h(org.telegram.messenger.gd.M0(i672, "Cancel"), r1Var2);
                    org.telegram.ui.ActionBar.u1 a122 = alertDialog$Builder32.a();
                    r72.Q2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    if (i7 == 9 || i7 == 16) {
                        PhotoViewer.x(r72);
                        return;
                    }
                    if (i7 == 10) {
                        try {
                            if (r72.t4) {
                                activity5 = r72.E;
                                fjVar11 = r72.T4;
                                vf.c.t(activity5, org.telegram.messenger.fj.n1(fjVar11.k).webpage.url);
                                r72.z0(false, false);
                                return;
                            }
                            fjVar6 = r72.T4;
                            if (fjVar6 == null) {
                                rq0Var = r72.j7;
                                if (rq0Var != null) {
                                    rq0Var2 = r72.j7;
                                    i12 = r72.P4;
                                    TLObject d10 = rq0Var2.d(i12);
                                    activity3 = r72.E;
                                    if (org.telegram.messenger.g0.v2(d10, activity3)) {
                                        r72.z0(false, false);
                                        return;
                                    } else {
                                        r72.S2();
                                        return;
                                    }
                                }
                                return;
                            }
                            fjVar7 = r72.T4;
                            activity4 = r72.E;
                            fjVar8 = r72.T4;
                            if (!fjVar8.H4()) {
                                fjVar9 = r72.T4;
                                if (!fjVar9.R3()) {
                                    fjVar10 = r72.T4;
                                    if (!fjVar10.t4()) {
                                        z16 = false;
                                    }
                                }
                            }
                            if (org.telegram.messenger.g0.u2(fjVar7, activity4, i6Var, z16)) {
                                r72.z0(false, false);
                                return;
                            } else {
                                r72.S2();
                                return;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.f(e10);
                            return;
                        }
                    }
                    if (i7 == 11 || i7 == 13) {
                        activity6 = r72.E;
                        if (activity6 != null) {
                            fjVar12 = r72.T4;
                            if (fjVar12 == null) {
                                return;
                            }
                            fjVar13 = r72.T4;
                            if (org.telegram.messenger.fj.n1(fjVar13.k) instanceof TLRPC.TL_messageMediaPhoto) {
                                fjVar17 = r72.T4;
                                tLObject = org.telegram.messenger.fj.n1(fjVar17.k).photo;
                            } else {
                                fjVar14 = r72.T4;
                                if (!(org.telegram.messenger.fj.n1(fjVar14.k) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                fjVar15 = r72.T4;
                                tLObject = org.telegram.messenger.fj.n1(fjVar15.k).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = r72.E;
                            fjVar16 = r72.T4;
                            r72.U3 = new qo0(this, activity7, fjVar16, tLObject2, this.a);
                            iw0Var = r72.U3;
                            iw0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i7 == 6) {
                        r0Var = r72.p0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!r72.t4) {
                            r72.f3();
                            return;
                        }
                        ke0Var = r72.g0;
                        if (ke0Var.e()) {
                            if (PhotoViewer.g9 != null) {
                                PhotoViewer.g9.J0();
                            }
                            r72.J3 = true;
                            photoViewer = PhotoViewer.f9;
                            PhotoViewer.g9 = photoViewer;
                            PhotoViewer.f9 = null;
                            r72.e = false;
                            r72.f = false;
                            wq0 wq0Var = r72.d5;
                            if (wq0Var != null && !wq0Var.a.H()) {
                                r72.d5.a.O0(true, true);
                            }
                            r72.m6 = 1.0f;
                            r72.f0.invalidate();
                            r72.M0();
                            return;
                        }
                        return;
                    }
                    if (i7 == 8) {
                        fjVar22 = r72.T4;
                        if (fjVar22 == null) {
                            return;
                        }
                        i40 = r72.U;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i40);
                        fjVar23 = r72.T4;
                        G.d(fjVar23.F0());
                        r72.m2(false);
                        r72.j0.setTag(r3);
                        r72.j0.setVisibility(0);
                        return;
                    }
                    if (i7 == 12) {
                        fjVar19 = r72.T4;
                        if (fjVar19 != null) {
                            fjVar20 = r72.T4;
                            TLRPC.Document F0 = fjVar20.F0();
                            bnVar = r72.l4;
                            if (bnVar != null) {
                                bnVar2 = r72.l4;
                                if (bnVar2.a0 != null) {
                                    bnVar3 = r72.l4;
                                    bnVar3.a0.m(F0);
                                    i39 = r72.U;
                                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i39);
                                    fjVar21 = r72.T4;
                                    u12.C4(fjVar21, F0);
                                }
                            }
                            i38 = r72.U;
                            org.telegram.messenger.ri.d0(i38).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = r72.U;
                            org.telegram.messenger.mp u122 = org.telegram.messenger.mp.u1(i39);
                            fjVar21 = r72.T4;
                            u122.C4(fjVar21, F0);
                        } else {
                            rq0Var3 = r72.j7;
                            if (rq0Var3 == null) {
                                return;
                            }
                            rq0Var4 = r72.j7;
                            i35 = r72.P4;
                            TLObject d11 = rq0Var4.d(i35);
                            if (d11 instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d11;
                                i36 = r72.U;
                                org.telegram.messenger.ri.d0(i36).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = r72.U;
                                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i37);
                                rq0Var5 = r72.j7;
                                u13.C4(rq0Var5.g(), document2);
                            }
                        }
                        qq0 qq0Var = r72.f0;
                        if (qq0Var != null) {
                            org.telegram.ui.Components.lc.a0(qq0Var, i6Var).o(org.telegram.ui.Components.kc.E, i6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i7 == 14) {
                        ArrayList arrayList5 = r72.f7;
                        i17 = r72.P4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i17);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(800, photo3.sizes);
                        TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(90, photo3.sizes);
                        i18 = r72.U;
                        org.telegram.messenger.j10 i68 = org.telegram.messenger.j10.i(i18);
                        j10 = r72.z5;
                        if (j10 == i68.n) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = r72.U;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new mo0(this, i68, photo3, i61));
                            i33 = r72.U;
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(i33).c2(Long.valueOf(i68.n));
                            if (c22 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = u11.location;
                                userProfilePhoto.photo_big = u10.location;
                                i68.w(c22);
                                i68.v(true);
                                i34 = r72.U;
                                org.telegram.messenger.ks.f(i34).k(org.telegram.messenger.ks.j0, new Object[0]);
                            }
                        } else {
                            i19 = r72.U;
                            org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(i19);
                            j11 = r72.z5;
                            TLRPC.Chat O03 = u14.O0(Long.valueOf(-j11));
                            if (O03 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i20 = r72.U;
                            org.telegram.messenger.mp u15 = org.telegram.messenger.mp.u1(i20);
                            j12 = r72.z5;
                            u15.B(-j12, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = O03.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = u11.location;
                            chatPhoto.photo_big = u10.location;
                            i21 = r72.U;
                            org.telegram.messenger.ks.f(i21).k(org.telegram.messenger.ks.r, 2);
                        }
                        r72.h7 = org.telegram.messenger.fc.i(u10, photo3);
                        ArrayList arrayList6 = r72.f7;
                        i22 = r72.P4;
                        arrayList6.remove(i22);
                        r72.f7.add(0, photo3);
                        ArrayList arrayList7 = r72.a7;
                        i23 = r72.P4;
                        org.telegram.messenger.fc fcVar21 = (org.telegram.messenger.fc) arrayList7.get(i23);
                        ArrayList arrayList8 = r72.a7;
                        i24 = r72.P4;
                        arrayList8.remove(i24);
                        r72.a7.add(0, fcVar21);
                        ArrayList arrayList9 = r72.b7;
                        i25 = r72.P4;
                        org.telegram.messenger.fc fcVar22 = (org.telegram.messenger.fc) arrayList9.get(i25);
                        ArrayList arrayList10 = r72.b7;
                        i26 = r72.P4;
                        arrayList10.remove(i26);
                        r72.b7.add(0, fcVar22);
                        ArrayList arrayList11 = r72.c7;
                        i27 = r72.P4;
                        Long l10 = (Long) arrayList11.get(i27);
                        ArrayList arrayList12 = r72.c7;
                        i28 = r72.P4;
                        arrayList12.remove(i28);
                        r72.c7.add(0, l10);
                        ArrayList arrayList13 = r72.d7;
                        i29 = r72.P4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i29);
                        ArrayList arrayList14 = r72.d7;
                        i30 = r72.P4;
                        arrayList14.remove(i30);
                        r72.d7.add(0, message);
                        i31 = r72.U;
                        org.telegram.messenger.mp u16 = org.telegram.messenger.mp.u1(i31);
                        j13 = r72.z5;
                        org.telegram.messenger.uo W0 = u16.W0(j13);
                        while (true) {
                            if (i60 >= W0.b.size()) {
                                break;
                            }
                            TLRPC.Photo photo4 = (TLRPC.Photo) W0.b.get(i60);
                            if (photo4 != null && photo4.id == photo3.id) {
                                W0.c(i60);
                                break;
                            }
                            i60++;
                        }
                        r72.P4 = -1;
                        r72.z2(0);
                        org.telegram.ui.Components.w20 w20Var = r72.m1;
                        w20Var.d.clear();
                        w20Var.e.clear();
                        w20Var.c.clear();
                        r72.m1.b();
                        undoView = r72.o1;
                        j14 = r72.z5;
                        fcVar12 = r72.a5;
                        fcVar13 = r72.Z4;
                        undoView.m(j14, fcVar12 == fcVar13 ? null : 1, 22);
                        final int i69 = 0;
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.no0
                            public final /* synthetic */ ro0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i69) {
                                    case 0:
                                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.b.p0;
                                        if (r0Var2 != null) {
                                            r0Var2.u(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.p0.u(19);
                                        photoViewer2.p0.T(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.T(19);
                                        photoViewer3.p0.u(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i7 == 15) {
                        i15 = r72.U;
                        org.telegram.messenger.w7.G(i15);
                        fcVar7 = r72.a5;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = fcVar7 == null ? null : fcVar7.f;
                        fcVar8 = r72.a5;
                        File J3 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, PhotoViewer.m1(fcVar8), true, true);
                        fcVar9 = r72.a5;
                        boolean z23 = fcVar9.p == 2;
                        if (z23) {
                            i16 = r72.U;
                            org.telegram.messenger.w7.G(i16);
                            fcVar10 = r72.Z4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = fcVar10 == null ? null : fcVar10.f;
                            fcVar11 = r72.Z4;
                            str = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated3, PhotoViewer.m1(fcVar11), true, true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        uq0Var = r72.d;
                        uq0Var.f(J3.getAbsolutePath(), str, z23);
                        return;
                    }
                    if (i7 == 19) {
                        int i70 = r72.Q4;
                        if (i70 < 0 || i70 >= r72.Y6.size()) {
                            return;
                        }
                        org.telegram.messenger.fj fjVar62 = (org.telegram.messenger.fj) r72.Y6.get(r72.Q4);
                        r72.n5 = true;
                        final int i71 = true ? 1 : 0;
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.no0
                            public final /* synthetic */ ro0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i71) {
                                    case 0:
                                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.b.p0;
                                        if (r0Var2 != null) {
                                            r0Var2.u(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.p0.u(19);
                                        photoViewer2.p0.T(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.T(19);
                                        photoViewer3.p0.u(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.L(r72);
                        i14 = r72.U;
                        org.telegram.messenger.mp.u1(i14).V1().L(fjVar62, new zn0(r72, 5));
                        return;
                    }
                    if (i7 == 20) {
                        r72.n5 = false;
                        final int i72 = 2;
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.no0
                            public final /* synthetic */ ro0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i72) {
                                    case 0:
                                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.b.p0;
                                        if (r0Var2 != null) {
                                            r0Var2.u(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.p0.u(19);
                                        photoViewer2.p0.T(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.T(19);
                                        photoViewer3.p0.u(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.L(r72);
                        return;
                    }
                    if (i7 == 22) {
                        r72.Z2 = !r72.Z2;
                        boolean z24 = r72.Z2;
                        fjVar18 = r72.T4;
                        org.telegram.ui.Components.f61.n0(fjVar18, z24);
                        org.telegram.ui.Components.f61 f61Var = r72.G2;
                        if (f61Var != null) {
                            f61Var.s0(r72.Z2);
                        }
                        r72.t0.f(r72.Z2);
                        r72.t0.setSelectorColor(r72.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i7 != 23) {
                        return;
                    }
                    fcVar = r72.Z4;
                    if (fcVar != null) {
                        fcVar5 = r72.Z4;
                        if (fcVar5.l != null) {
                            fcVar6 = r72.Z4;
                            photo2 = fcVar6.l;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i13 = r72.U;
                            activity8 = r72.E;
                            j3 = r72.z5;
                            org.telegram.ui.Components.b5.G(i13, activity8, j3, photo, new fi.b());
                            return;
                        }
                    }
                    fcVar2 = r72.a5;
                    if (fcVar2 != null) {
                        fcVar3 = r72.a5;
                        if (fcVar3.l != null) {
                            fcVar4 = r72.a5;
                            photo2 = fcVar4.l;
                            photo = photo2;
                            if (photo == null) {
                            }
                        }
                    }
                    photo = null;
                    if (photo == null) {
                    }
                }
            }
        }
    }
}
