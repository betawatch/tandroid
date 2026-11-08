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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class qo0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a;
    public final /* synthetic */ PhotoViewer b;

    public qo0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = photoViewer;
        this.a = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.S4 == null && photoViewer.a5 == null) {
            if (photoViewer.Z4 != null) {
                org.telegram.messenger.w7.G(photoViewer.T);
                org.telegram.messenger.hc hcVar = photoViewer.Z4;
                File J = org.telegram.messenger.w7.J(hcVar == null ? null : hcVar.f, PhotoViewer.m1(hcVar), photoViewer.y5 != 0 || photoViewer.A5, true);
                File file = new File(org.telegram.messenger.w7.z(4), J.getName());
                org.telegram.messenger.w7.G(photoViewer.T);
                org.telegram.messenger.hc hcVar2 = photoViewer.Z4;
                File J2 = org.telegram.messenger.w7.J(hcVar2 != null ? hcVar2.f : null, PhotoViewer.m1(hcVar2), false, true);
                if (!J.exists() && !file.exists() && !J2.exists()) {
                    return false;
                }
            } else if (photoViewer.i7 != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0419, code lost:
    
        if (a8.p0.B(r0) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x080d, code lost:
    
        if (r11 == org.telegram.messenger.p10.i(r17).e()) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0811, code lost:
    
        if (r5 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0813, code lost:
    
        r11 = r7.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x081d, code lost:
    
        if (org.telegram.messenger.qp.s1(r11).c3 == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x081f, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0823, code lost:
    
        r12 = r7.S4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x082b, code lost:
    
        if (r12.k.action == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x082d, code lost:
    
        r12 = r7.S4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0837, code lost:
    
        if ((r12.k.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0839, code lost:
    
        r12 = r7.S4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0841, code lost:
    
        if (r12.O3() != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0843, code lost:
    
        if (r11 != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0849, code lost:
    
        if (org.telegram.messenger.t3.N(r9) == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x084b, code lost:
    
        r11 = r7.S4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0855, code lost:
    
        if ((r12 - r11.k.date) > r13) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0857, code lost:
    
        r12 = r7.D;
        r11 = new android.widget.FrameLayout(r12);
        r13 = r7.D;
        r8 = new org.telegram.ui.Cells.c2(1, r13, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0871, code lost:
    
        if (r9 == null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0873, code lost:
    
        r5 = "Cancel";
        r2 = r11;
        r11 = 0;
        r15 = 2131752589;
        r8.e(org.telegram.messenger.id.M0(2131751541, "DeleteForAll"), "", false, false, false);
        r6 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x08bd, code lost:
    
        if (org.telegram.messenger.id.a0 == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x08bf, code lost:
    
        r9 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x08ca, code lost:
    
        if (org.telegram.messenger.id.a0 == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x08cc, code lost:
    
        r10 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x08d5, code lost:
    
        r8.setPadding(r9, r11, r10, r11);
        r2.addView(r8, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.j8(5, r0));
        r3.o(r2);
        r3.a.G = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08d1, code lost:
    
        r10 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08c4, code lost:
    
        r9 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0891, code lost:
    
        r2 = r11;
        r11 = 0;
        r15 = 2131752589;
        r5 = org.telegram.messenger.id.Y(2131751540, "DeleteForUser", org.telegram.messenger.t10.i(r5));
        r5 = "Cancel";
        r6 = 4;
        r8.e(r5, "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0821, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x080f, code lost:
    
        if (r9 != null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x06da, code lost:
    
        if (r9 == r5) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06ea, code lost:
    
        if (r5.I4() != false) goto L325;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:551:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v21, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.PhotoViewer] */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        int i10;
        org.telegram.messenger.ij ijVar3;
        int i11;
        Activity activity;
        Activity activity2;
        org.telegram.messenger.ij ijVar4;
        org.telegram.messenger.ij ijVar5;
        org.telegram.messenger.ij ijVar6;
        qq0 qq0Var;
        qq0 qq0Var2;
        int i12;
        Activity activity3;
        org.telegram.messenger.ij ijVar7;
        Activity activity4;
        org.telegram.messenger.ij ijVar8;
        org.telegram.messenger.ij ijVar9;
        org.telegram.messenger.ij ijVar10;
        Activity activity5;
        org.telegram.messenger.ij ijVar11;
        Activity activity6;
        org.telegram.messenger.ij ijVar12;
        org.telegram.messenger.ij ijVar13;
        org.telegram.messenger.ij ijVar14;
        org.telegram.messenger.ij ijVar15;
        TLObject tLObject;
        Activity activity7;
        org.telegram.messenger.ij ijVar16;
        org.telegram.ui.Components.yv0 yv0Var;
        org.telegram.messenger.ij ijVar17;
        org.telegram.messenger.hc hcVar;
        org.telegram.messenger.hc hcVar2;
        TLRPC.Photo photo;
        org.telegram.messenger.hc hcVar3;
        org.telegram.messenger.hc hcVar4;
        TLRPC.Photo photo2;
        int i13;
        Activity activity8;
        long j3;
        org.telegram.messenger.hc hcVar5;
        org.telegram.messenger.hc hcVar6;
        org.telegram.messenger.ij ijVar18;
        int i14;
        int i15;
        org.telegram.messenger.hc hcVar7;
        org.telegram.messenger.hc hcVar8;
        org.telegram.messenger.hc hcVar9;
        String str;
        uq0 uq0Var;
        int i16;
        org.telegram.messenger.hc hcVar10;
        org.telegram.messenger.hc hcVar11;
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
        org.telegram.messenger.hc hcVar12;
        org.telegram.messenger.hc hcVar13;
        int i32;
        int i33;
        int i34;
        org.telegram.messenger.ij ijVar19;
        qq0 qq0Var3;
        qq0 qq0Var4;
        int i35;
        int i36;
        int i37;
        qq0 qq0Var5;
        org.telegram.messenger.ij ijVar20;
        an anVar;
        int i38;
        int i39;
        org.telegram.messenger.ij ijVar21;
        an anVar2;
        an anVar3;
        org.telegram.messenger.ij ijVar22;
        int i40;
        org.telegram.messenger.ij ijVar23;
        org.telegram.ui.ActionBar.r0 r0Var;
        View findViewWithTag;
        org.telegram.ui.Components.ae0 ae0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        uq0 uq0Var2;
        org.telegram.messenger.ij ijVar24;
        boolean z9;
        Activity activity10;
        uq0 uq0Var3;
        String b02;
        org.telegram.messenger.hc hcVar14;
        org.telegram.messenger.ij ijVar25;
        org.telegram.messenger.ij ijVar26;
        org.telegram.messenger.ij ijVar27;
        org.telegram.messenger.ij ijVar28;
        org.telegram.messenger.hc hcVar15;
        org.telegram.messenger.hc hcVar16;
        org.telegram.messenger.ij ijVar29;
        TextView textView;
        org.telegram.messenger.ij ijVar30;
        org.telegram.messenger.ij ijVar31;
        int i41;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        org.telegram.messenger.ij ijVar32;
        org.telegram.messenger.ij ijVar33;
        int i48;
        Activity activity11;
        uq0 uq0Var4;
        uq0 uq0Var5;
        org.telegram.messenger.ij ijVar34;
        Activity activity12;
        org.telegram.messenger.ij ijVar35;
        boolean z10;
        Activity activity13;
        org.telegram.messenger.ij ijVar36;
        ArrayList arrayList;
        an anVar4;
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.ij ijVar37;
        org.telegram.messenger.ij ijVar38;
        an anVar5;
        Activity activity14;
        ?? r02;
        Activity activity15;
        int w12;
        int w13;
        int w14;
        an anVar6;
        org.telegram.messenger.ij ijVar39;
        org.telegram.messenger.ij ijVar40;
        int i49;
        uq0 uq0Var6;
        org.telegram.messenger.ij ijVar41;
        org.telegram.messenger.ij ijVar42;
        org.telegram.messenger.ij ijVar43;
        String str2;
        an anVar7;
        int i50;
        org.telegram.messenger.ij ijVar44;
        org.telegram.messenger.ij ijVar45;
        an anVar8;
        Activity activity16;
        Activity activity17;
        an anVar9;
        g7.c i110;
        org.telegram.ui.Components.m7 m7Var;
        qq0 qq0Var6;
        Activity activity18;
        Activity activity19;
        an anVar10;
        int i51;
        String str3;
        org.telegram.messenger.dj djVar2;
        org.telegram.messenger.ij ijVar46;
        Activity activity20;
        org.telegram.messenger.ij ijVar47;
        String M02;
        int w15;
        View d;
        int w16;
        int w17;
        org.telegram.messenger.ij ijVar48;
        org.telegram.messenger.ij ijVar49;
        org.telegram.messenger.ij ijVar50;
        org.telegram.messenger.hc hcVar17;
        qq0 qq0Var7;
        boolean z11;
        File file;
        qq0 qq0Var8;
        int i52;
        qq0 qq0Var9;
        int i53;
        org.telegram.messenger.hc hcVar18;
        int i54;
        org.telegram.messenger.hc hcVar19;
        long j15;
        boolean z12;
        File J;
        int i55;
        org.telegram.messenger.hc hcVar20;
        boolean z13;
        org.telegram.messenger.ij ijVar51;
        ?? r32;
        Activity activity21;
        Activity activity22;
        org.telegram.messenger.ij ijVar52;
        TLRPC.Document document;
        int i56;
        int i57;
        org.telegram.messenger.ij ijVar53;
        org.telegram.messenger.ij ijVar54;
        org.telegram.messenger.ij ijVar55;
        int i58;
        org.telegram.messenger.ij ijVar56;
        org.telegram.messenger.ij ijVar57;
        org.telegram.messenger.ij ijVar58;
        org.telegram.messenger.ij ijVar59;
        int i59;
        TLObject l1;
        int i60;
        an anVar11;
        org.telegram.messenger.ij ijVar60;
        boolean z14;
        boolean F1;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        boolean z15 = true;
        z15 = true;
        z15 = true;
        ?? r72 = this.b;
        int i61 = 0;
        if (i7 == -1) {
            up0 up0Var = r72.L1;
            if (up0Var == null || !up0Var.n0()) {
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
        final int i62 = 0;
        File file2 = null;
        if (i7 == 2) {
            qq0Var6 = r72.i7;
            if (qq0Var6 != null) {
                z14 = r72.k2;
                if (!z14) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
                activity18 = r72.D;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = r72.D;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            anVar10 = r72.k4;
            if (anVar10 != null) {
                anVar11 = r72.k4;
                ijVar60 = r72.S4;
                i51 = 4;
                str3 = "ThisPhoto";
                djVar2 = anVar11.S8(ijVar60.d1());
            } else {
                i51 = 4;
                str3 = "ThisPhoto";
                djVar2 = null;
            }
            if (djVar2 != null) {
                arrayList2.addAll(djVar2.d);
            } else {
                ijVar46 = r72.S4;
                arrayList2.add(ijVar46);
            }
            if (arrayList2.size() > 1) {
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                for (int i63 = 0; i63 < arrayList2.size(); i63++) {
                    org.telegram.messenger.ij ijVar61 = (org.telegram.messenger.ij) arrayList2.get(i63);
                    if (ijVar61.E3()) {
                        z18 = true;
                    } else if (ijVar61.I4()) {
                        z16 = true;
                    } else {
                        z17 = true;
                    }
                }
                activity20 = r72.D;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, f6Var);
                alertDialog$Builder.l(org.telegram.messenger.id.M0(2131745944, "SaveGroupMedia"));
                alertDialog$Builder.g(org.telegram.messenger.id.M0(2131745943, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.I = org.telegram.ui.ActionBar.k6.dh;
                ijVar47 = r72.S4;
                if (ijVar47 != null) {
                    ijVar48 = r72.S4;
                    if (ijVar48.I4()) {
                        ijVar49 = r72.S4;
                        if (!ijVar49.E3()) {
                            M02 = org.telegram.messenger.id.M0(2131744145, "ThisMedia");
                            final int i64 = true ? 1 : 0;
                            alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.ho0
                                public final /* synthetic */ qo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i65) {
                                    File M;
                                    switch (i64) {
                                        case 0:
                                            qo0 qo0Var = this.b;
                                            qo0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer2 = qo0Var.b;
                                            arrayList3.add(photoViewer2.S4);
                                            PhotoViewer.u(photoViewer2, arrayList3);
                                            break;
                                        default:
                                            qo0 qo0Var2 = this.b;
                                            PhotoViewer photoViewer3 = qo0Var2.b;
                                            org.telegram.messenger.ij ijVar62 = photoViewer3.S4;
                                            if (ijVar62 != null) {
                                                File file3 = null;
                                                if ((org.telegram.messenger.ij.o1(ijVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.o1(photoViewer3.S4.k).webpage != null && org.telegram.messenger.ij.o1(photoViewer3.S4.k).webpage.document == null) {
                                                    TLObject l12 = photoViewer3.l1(photoViewer3.O4, null);
                                                    org.telegram.messenger.w7.G(photoViewer3.T);
                                                    M = org.telegram.messenger.w7.J(l12, null, true, true);
                                                } else {
                                                    org.telegram.messenger.w7.G(photoViewer3.T);
                                                    M = org.telegram.messenger.w7.M(photoViewer3.S4.k, false, true);
                                                }
                                                boolean M4 = org.telegram.messenger.ij.M4(photoViewer3.S4.k);
                                                boolean E3 = photoViewer3.S4.E3();
                                                if (E3) {
                                                    TLRPC.Document document2 = org.telegram.messenger.ij.o1(photoViewer3.S4.k) != null ? org.telegram.messenger.ij.o1(photoViewer3.S4.k).document : null;
                                                    if (document2 != null) {
                                                        org.telegram.messenger.w7.G(photoViewer3.T);
                                                        File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                        if (J2 == null || !J2.exists()) {
                                                            org.telegram.messenger.w7.G(photoViewer3.T);
                                                            file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                        } else {
                                                            file3 = J2;
                                                        }
                                                    }
                                                }
                                                if (!E3) {
                                                    if (M != null && M.exists()) {
                                                        MediaController.d0(M.toString(), photoViewer3.D, M4 ? 1 : 0, null, null, new ko0(qo0Var2, M4, 0));
                                                        break;
                                                    } else {
                                                        photoViewer3.R2();
                                                        break;
                                                    }
                                                } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                                    MediaController.e0(M.toString(), file3.toString(), photoViewer3.D, new fo0(qo0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer3.R2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            String G = (!z16 || z18) ? org.telegram.messenger.id.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.id.G(arrayList2.size(), "AllNPhotos", new Object[0]);
                            final boolean z19 = z16;
                            final boolean z20 = z17;
                            final boolean z21 = z18;
                            alertDialog$Builder.k(G, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.no0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i65) {
                                    File M;
                                    qo0 qo0Var = qo0.this;
                                    PhotoViewer photoViewer2 = qo0Var.b;
                                    int[] iArr = new int[1];
                                    final on0 on0Var = new on0(qo0Var, new int[1], iArr, z19, z20, z21);
                                    int i66 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i66 >= arrayList3.size()) {
                                            return;
                                        }
                                        org.telegram.messenger.ij ijVar62 = (org.telegram.messenger.ij) arrayList3.get(i66);
                                        if (ijVar62 != null) {
                                            File file3 = null;
                                            if ((org.telegram.messenger.ij.o1(ijVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.o1(ijVar62.k).webpage != null && org.telegram.messenger.ij.o1(ijVar62.k).webpage.document == null) {
                                                org.telegram.messenger.w7.G(photoViewer2.T);
                                                M = org.telegram.messenger.w7.J(photoViewer2.l1(photoViewer2.O4, null), null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer2.T);
                                                M = org.telegram.messenger.w7.M(ijVar62.k, false, true);
                                            }
                                            boolean M4 = org.telegram.messenger.ij.M4(ijVar62.k);
                                            boolean E3 = ijVar62.E3();
                                            if (E3) {
                                                TLRPC.Document document2 = org.telegram.messenger.ij.o1(ijVar62.k) != null ? org.telegram.messenger.ij.o1(ijVar62.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer2.T);
                                                    File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer2.T);
                                                        file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                    } else {
                                                        file3 = J2;
                                                    }
                                                }
                                            }
                                            if (E3 && M != null && M.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i67 = 1;
                                                    MediaController.d0(M.toString(), photoViewer2.D, 0, null, null, new org.telegram.messenger.c20() { // from class: org.telegram.ui.io0
                                                        @Override // org.telegram.messenger.c20
                                                        public final void a(Object obj) {
                                                            switch (i67) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(on0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.h3(on0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(on0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i68 = 0;
                                                    MediaController.e0(M.toString(), file3.toString(), photoViewer2.D, new org.telegram.messenger.c20() { // from class: org.telegram.ui.io0
                                                        @Override // org.telegram.messenger.c20
                                                        public final void a(Object obj) {
                                                            switch (i68) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(on0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.h3(on0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(on0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!E3 && M != null && M.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i69 = 2;
                                                MediaController.d0(M.toString(), photoViewer2.D, M4 ? 1 : 0, null, null, new org.telegram.messenger.c20() { // from class: org.telegram.ui.io0
                                                    @Override // org.telegram.messenger.c20
                                                    public final void a(Object obj) {
                                                        switch (i69) {
                                                            case 0:
                                                                org.telegram.messenger.g0.h3(on0Var);
                                                                break;
                                                            case 1:
                                                                org.telegram.messenger.g0.h3(on0Var);
                                                                break;
                                                            default:
                                                                org.telegram.messenger.g0.h3(on0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i66++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(org.telegram.messenger.id.M0(2131752589, "Cancel"), new go0(0));
                            org.telegram.ui.ActionBar.u1 a10 = alertDialog$Builder.a();
                            w15 = r72.w1(org.telegram.ui.ActionBar.k6.ih);
                            a10.j(w15);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i65 = org.telegram.ui.ActionBar.k6.q7;
                                org.telegram.ui.ActionBar.r6.V((TextView) d, i65, r72.v2);
                                w17 = r72.w1(i65);
                                d.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), w17));
                                ViewGroup viewGroup = a10.t0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            w16 = r72.w1(org.telegram.ui.ActionBar.k6.Vg);
                            a10.p(w16);
                            return;
                        }
                    }
                }
                M02 = org.telegram.messenger.id.M0(2131744144, str3);
                final int i642 = true ? 1 : 0;
                alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.ho0
                    public final /* synthetic */ qo0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i652) {
                        File M;
                        switch (i642) {
                            case 0:
                                qo0 qo0Var = this.b;
                                qo0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer2 = qo0Var.b;
                                arrayList3.add(photoViewer2.S4);
                                PhotoViewer.u(photoViewer2, arrayList3);
                                break;
                            default:
                                qo0 qo0Var2 = this.b;
                                PhotoViewer photoViewer3 = qo0Var2.b;
                                org.telegram.messenger.ij ijVar62 = photoViewer3.S4;
                                if (ijVar62 != null) {
                                    File file3 = null;
                                    if ((org.telegram.messenger.ij.o1(ijVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.o1(photoViewer3.S4.k).webpage != null && org.telegram.messenger.ij.o1(photoViewer3.S4.k).webpage.document == null) {
                                        TLObject l12 = photoViewer3.l1(photoViewer3.O4, null);
                                        org.telegram.messenger.w7.G(photoViewer3.T);
                                        M = org.telegram.messenger.w7.J(l12, null, true, true);
                                    } else {
                                        org.telegram.messenger.w7.G(photoViewer3.T);
                                        M = org.telegram.messenger.w7.M(photoViewer3.S4.k, false, true);
                                    }
                                    boolean M4 = org.telegram.messenger.ij.M4(photoViewer3.S4.k);
                                    boolean E3 = photoViewer3.S4.E3();
                                    if (E3) {
                                        TLRPC.Document document2 = org.telegram.messenger.ij.o1(photoViewer3.S4.k) != null ? org.telegram.messenger.ij.o1(photoViewer3.S4.k).document : null;
                                        if (document2 != null) {
                                            org.telegram.messenger.w7.G(photoViewer3.T);
                                            File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                            if (J2 == null || !J2.exists()) {
                                                org.telegram.messenger.w7.G(photoViewer3.T);
                                                file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                            } else {
                                                file3 = J2;
                                            }
                                        }
                                    }
                                    if (!E3) {
                                        if (M != null && M.exists()) {
                                            MediaController.d0(M.toString(), photoViewer3.D, M4 ? 1 : 0, null, null, new ko0(qo0Var2, M4, 0));
                                            break;
                                        } else {
                                            photoViewer3.R2();
                                            break;
                                        }
                                    } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                        MediaController.e0(M.toString(), file3.toString(), photoViewer3.D, new fo0(qo0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer3.R2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                String G2 = (!z16 || z18) ? org.telegram.messenger.id.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.id.G(arrayList2.size(), "AllNPhotos", new Object[0]);
                final boolean z192 = z16;
                final boolean z202 = z17;
                final boolean z212 = z18;
                alertDialog$Builder.k(G2, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.no0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i652) {
                        File M;
                        qo0 qo0Var = qo0.this;
                        PhotoViewer photoViewer2 = qo0Var.b;
                        int[] iArr = new int[1];
                        final on0 on0Var = new on0(qo0Var, new int[1], iArr, z192, z202, z212);
                        int i66 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i66 >= arrayList3.size()) {
                                return;
                            }
                            org.telegram.messenger.ij ijVar62 = (org.telegram.messenger.ij) arrayList3.get(i66);
                            if (ijVar62 != null) {
                                File file3 = null;
                                if ((org.telegram.messenger.ij.o1(ijVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.o1(ijVar62.k).webpage != null && org.telegram.messenger.ij.o1(ijVar62.k).webpage.document == null) {
                                    org.telegram.messenger.w7.G(photoViewer2.T);
                                    M = org.telegram.messenger.w7.J(photoViewer2.l1(photoViewer2.O4, null), null, true, true);
                                } else {
                                    org.telegram.messenger.w7.G(photoViewer2.T);
                                    M = org.telegram.messenger.w7.M(ijVar62.k, false, true);
                                }
                                boolean M4 = org.telegram.messenger.ij.M4(ijVar62.k);
                                boolean E3 = ijVar62.E3();
                                if (E3) {
                                    TLRPC.Document document2 = org.telegram.messenger.ij.o1(ijVar62.k) != null ? org.telegram.messenger.ij.o1(ijVar62.k).document : null;
                                    if (document2 != null) {
                                        org.telegram.messenger.w7.G(photoViewer2.T);
                                        File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                        if (J2 == null || !J2.exists()) {
                                            org.telegram.messenger.w7.G(photoViewer2.T);
                                            file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                        } else {
                                            file3 = J2;
                                        }
                                    }
                                }
                                if (E3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i67 = 1;
                                        MediaController.d0(M.toString(), photoViewer2.D, 0, null, null, new org.telegram.messenger.c20() { // from class: org.telegram.ui.io0
                                            @Override // org.telegram.messenger.c20
                                            public final void a(Object obj) {
                                                switch (i67) {
                                                    case 0:
                                                        org.telegram.messenger.g0.h3(on0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(on0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.h3(on0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i68 = 0;
                                        MediaController.e0(M.toString(), file3.toString(), photoViewer2.D, new org.telegram.messenger.c20() { // from class: org.telegram.ui.io0
                                            @Override // org.telegram.messenger.c20
                                            public final void a(Object obj) {
                                                switch (i68) {
                                                    case 0:
                                                        org.telegram.messenger.g0.h3(on0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(on0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.h3(on0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!E3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i69 = 2;
                                    MediaController.d0(M.toString(), photoViewer2.D, M4 ? 1 : 0, null, null, new org.telegram.messenger.c20() { // from class: org.telegram.ui.io0
                                        @Override // org.telegram.messenger.c20
                                        public final void a(Object obj) {
                                            switch (i69) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(on0Var);
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(on0Var);
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(on0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i66++;
                        }
                    }
                });
                alertDialog$Builder.i(org.telegram.messenger.id.M0(2131752589, "Cancel"), new go0(0));
                org.telegram.ui.ActionBar.u1 a102 = alertDialog$Builder.a();
                w15 = r72.w1(org.telegram.ui.ActionBar.k6.ih);
                a102.j(w15);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                w16 = r72.w1(org.telegram.ui.ActionBar.k6.Vg);
                a102.p(w16);
                return;
            }
            ijVar50 = r72.S4;
            if (ijVar50 != null) {
                ijVar55 = r72.S4;
                if (org.telegram.messenger.ij.o1(ijVar55.k) instanceof TLRPC.TL_messageMediaWebPage) {
                    ijVar58 = r72.S4;
                    if (org.telegram.messenger.ij.o1(ijVar58.k).webpage != null) {
                        ijVar59 = r72.S4;
                        if (org.telegram.messenger.ij.o1(ijVar59.k).webpage.document == null) {
                            i59 = r72.O4;
                            l1 = r72.l1(i59, null);
                            i60 = r72.T;
                            org.telegram.messenger.w7.G(i60);
                            file = org.telegram.messenger.w7.K(l1, true);
                            if (!file.exists()) {
                                file = new File(org.telegram.messenger.w7.z(i51), file.getName());
                            }
                            ijVar57 = r72.S4;
                            z11 = ijVar57.I4();
                        }
                    }
                }
                i58 = r72.T;
                org.telegram.messenger.w7.G(i58);
                ijVar56 = r72.S4;
                file = org.telegram.messenger.w7.L(ijVar56.k);
                ijVar57 = r72.S4;
                z11 = ijVar57.I4();
            } else {
                hcVar17 = r72.Z4;
                if (hcVar17 != null) {
                    hcVar18 = r72.Z4;
                    String m12 = PhotoViewer.m1(hcVar18);
                    i54 = r72.T;
                    org.telegram.messenger.w7.G(i54);
                    hcVar19 = r72.Z4;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar19 == null ? null : hcVar19.f;
                    j15 = r72.y5;
                    if (j15 == 0) {
                        z13 = r72.A5;
                        if (!z13) {
                            z12 = false;
                            J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, m12, z12, true);
                            if (J != null && !J.exists()) {
                                i55 = r72.T;
                                org.telegram.messenger.w7.G(i55);
                                hcVar20 = r72.Z4;
                                J = org.telegram.messenger.w7.J(hcVar20 != null ? null : hcVar20.f, m12, false, true);
                            }
                            if (m12 != null) {
                                m12 = m12.toLowerCase();
                            }
                            File file3 = J;
                            z11 = m12 == null && (m12.equals("webm") || m12.equals("mp4") || m12.equals("gif"));
                            file = file3;
                        }
                    }
                    z12 = true;
                    J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, m12, z12, true);
                    if (J != null) {
                        i55 = r72.T;
                        org.telegram.messenger.w7.G(i55);
                        hcVar20 = r72.Z4;
                        J = org.telegram.messenger.w7.J(hcVar20 != null ? null : hcVar20.f, m12, false, true);
                    }
                    if (m12 != null) {
                    }
                    File file32 = J;
                    z11 = m12 == null && (m12.equals("webm") || m12.equals("mp4") || m12.equals("gif"));
                    file = file32;
                } else {
                    qq0Var7 = r72.i7;
                    if (qq0Var7 != null) {
                        qq0Var8 = r72.i7;
                        i52 = r72.O4;
                        file = qq0Var8.b(i52);
                        qq0Var9 = r72.i7;
                        i53 = r72.O4;
                        z11 = qq0Var9.a(i53);
                    } else {
                        z11 = false;
                        file = null;
                    }
                }
            }
            if (file != null && !file.exists()) {
                file = new File(org.telegram.messenger.w7.z(i51), file.getName());
            }
            ijVar51 = r72.S4;
            if (ijVar51 != null) {
                ijVar54 = r72.S4;
                if (ijVar54.E3()) {
                    r32 = true;
                    if (r32 != false) {
                        ijVar52 = r72.S4;
                        if (org.telegram.messenger.ij.o1(ijVar52.k) != null) {
                            ijVar53 = r72.S4;
                            document = org.telegram.messenger.ij.o1(ijVar53.k).document;
                        } else {
                            document = null;
                        }
                        if (document != null) {
                            i56 = r72.T;
                            org.telegram.messenger.w7.G(i56);
                            file2 = org.telegram.messenger.w7.K(document, false);
                            if (file2 == null || !file2.exists()) {
                                i57 = r72.T;
                                org.telegram.messenger.w7.G(i57);
                                file2 = org.telegram.messenger.w7.K(document, true);
                            }
                        }
                    }
                    if (r32 == true) {
                        if (file == null || !file.exists()) {
                            r72.R2();
                            return;
                        }
                        String file4 = file.toString();
                        activity21 = r72.D;
                        MediaController.d0(file4, activity21, z11 ? 1 : 0, null, null, new ko0(this, z11, 1));
                        return;
                    }
                    if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                        r72.R2();
                        return;
                    }
                    String file5 = file.toString();
                    String file6 = file2.toString();
                    activity22 = r72.D;
                    MediaController.e0(file5, file6, activity22, new fo0(this, 0));
                    return;
                }
            }
            r32 = false;
            if (r32 != false) {
            }
            if (r32 == true) {
            }
        } else {
            if (i7 == 24) {
                wf.b Z = wf.b.Z();
                i110 = r72.i1();
                Z.h0(i110);
                m7Var = r72.G0;
                m7Var.performClick();
                return;
            }
            if (i7 == 3) {
                if (r72.D5 != 0) {
                    r72.r4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", r72.D5);
                    org.telegram.ui.Components.u80 u80Var = new org.telegram.ui.Components.u80(bundle, null);
                    anVar8 = r72.k4;
                    if (anVar8 != null) {
                        anVar9 = r72.k4;
                        u80Var.e0(anVar9.O8());
                    }
                    r72.z0(false, false);
                    activity16 = r72.D;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = r72.D;
                        ((LaunchActivity) activity17).u0(u80Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 5 || i7 == 21) {
                ijVar = r72.S4;
                if (ijVar == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = r72.D5;
                ijVar2 = r72.S4;
                if (ijVar2 != null) {
                    ijVar5 = r72.S4;
                    j16 = ijVar5.A0();
                }
                if (org.telegram.messenger.m5.C(j16)) {
                    bundle2.putInt("enc_id", org.telegram.messenger.m5.h(j16));
                } else if (org.telegram.messenger.m5.E(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i10 = r72.T;
                    TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-j16));
                    if (M03 != null && M03.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -M03.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                ijVar3 = r72.S4;
                bundle2.putInt("message_id", ijVar3.f1());
                if (i7 == 21) {
                    ijVar4 = r72.S4;
                    bundle2.putInt("reply_to", ijVar4.f1());
                }
                i11 = r72.T;
                org.telegram.messenger.qs.f(i11).k(org.telegram.messenger.qs.t, new Object[0]);
                activity = r72.D;
                if (activity instanceof LaunchActivity) {
                    activity2 = r72.D;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.u0(new an(bundle2), launchActivity.R() > 1 || org.telegram.messenger.g0.Q1(), true);
                }
                r72.z0(false, false);
                r72.S4 = null;
                VideoAds videoAds = r72.T4;
                if (videoAds != null) {
                    videoAds.stop();
                    r72.T4 = null;
                    return;
                }
                return;
            }
            if (i7 == 25) {
                if (r72.l4 != null) {
                    uq0Var6 = r72.d;
                    if (uq0Var6 == null) {
                        return;
                    }
                    ijVar41 = r72.S4;
                    if (ijVar41 != null) {
                        ijVar42 = r72.S4;
                        if (ijVar42.k == null) {
                            return;
                        }
                        ijVar43 = r72.S4;
                        if (!TextUtils.isEmpty(ijVar43.k.attachPath)) {
                            ijVar45 = r72.S4;
                            str2 = ijVar45.k.attachPath;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (TextUtils.isEmpty(str2)) {
                            i50 = r72.T;
                            org.telegram.messenger.w7.G(i50);
                            ijVar44 = r72.S4;
                            File N = org.telegram.messenger.w7.N(ijVar44.k);
                            if (N != null && N.exists()) {
                                str2 = N.getAbsolutePath();
                            }
                        }
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        anVar7 = r72.k4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new org.telegram.messenger.gf(0, str4, 0, false, 0, 0));
                        this.b.e2(arrayList3, 0, 11, false, new oo0(), anVar7);
                        r72.S0(null, null, false, null);
                        r72.j2();
                        ks.p().w();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 4) {
                ijVar34 = r72.S4;
                if (ijVar34 == null) {
                    return;
                }
                activity12 = r72.D;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                ijVar35 = r72.S4;
                if (!ijVar35.p1) {
                    ijVar40 = r72.S4;
                    long A0 = ijVar40.A0();
                    if (org.telegram.messenger.m5.z(A0)) {
                        i49 = r72.T;
                        z10 = org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(i49).M0(Long.valueOf(-A0)));
                        activity13 = r72.D;
                        ijVar36 = r72.S4;
                        ((LaunchActivity) activity13).O0(ijVar36.I1);
                        arrayList = new ArrayList(1);
                        anVar4 = r72.k4;
                        if (anVar4 == null) {
                            anVar6 = r72.k4;
                            ijVar39 = r72.S4;
                            djVar = anVar6.S8(ijVar39.d1());
                        } else {
                            djVar = null;
                        }
                        if (djVar == null) {
                            arrayList.addAll(djVar.d);
                        } else {
                            ijVar37 = r72.S4;
                            arrayList.add(ijVar37);
                        }
                        if (!z10 && arrayList.size() <= 1) {
                            PhotoViewer.u(r72, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            ww wwVar = new ww(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            ijVar38 = r72.S4;
                            arrayList4.add(ijVar38);
                            anVar5 = r72.k4;
                            wwVar.C2 = new a7(this, arrayList4, anVar5, 18);
                            activity14 = r72.D;
                            ((LaunchActivity) activity14).u0(wwVar, false, true);
                            r72.z0(false, false);
                            return;
                        }
                        for (int i66 = 0; i66 < arrayList.size(); i66++) {
                            if (!((org.telegram.messenger.ij) arrayList.get(i66)).S3() || ((org.telegram.messenger.ij) arrayList.get(i66)).I4()) {
                                r02 = false;
                                break;
                            }
                        }
                        r02 = true;
                        activity15 = r72.D;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, f6Var);
                        alertDialog$Builder2.l(org.telegram.messenger.id.M0(2131750586, "ForwardGroupMedia"));
                        alertDialog$Builder2.g(org.telegram.messenger.id.M0(2131750585, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.k6.dh;
                        alertDialog$Builder2.h(r02 != false ? org.telegram.messenger.id.M0(2131744144, "ThisPhoto") : org.telegram.messenger.id.M0(2131744145, "ThisMedia"), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.ho0
                            public final /* synthetic */ qo0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.r1
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i652) {
                                File M;
                                switch (i62) {
                                    case 0:
                                        qo0 qo0Var = this.b;
                                        qo0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer2 = qo0Var.b;
                                        arrayList32.add(photoViewer2.S4);
                                        PhotoViewer.u(photoViewer2, arrayList32);
                                        break;
                                    default:
                                        qo0 qo0Var2 = this.b;
                                        PhotoViewer photoViewer3 = qo0Var2.b;
                                        org.telegram.messenger.ij ijVar62 = photoViewer3.S4;
                                        if (ijVar62 != null) {
                                            File file33 = null;
                                            if ((org.telegram.messenger.ij.o1(ijVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.o1(photoViewer3.S4.k).webpage != null && org.telegram.messenger.ij.o1(photoViewer3.S4.k).webpage.document == null) {
                                                TLObject l12 = photoViewer3.l1(photoViewer3.O4, null);
                                                org.telegram.messenger.w7.G(photoViewer3.T);
                                                M = org.telegram.messenger.w7.J(l12, null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer3.T);
                                                M = org.telegram.messenger.w7.M(photoViewer3.S4.k, false, true);
                                            }
                                            boolean M4 = org.telegram.messenger.ij.M4(photoViewer3.S4.k);
                                            boolean E3 = photoViewer3.S4.E3();
                                            if (E3) {
                                                TLRPC.Document document2 = org.telegram.messenger.ij.o1(photoViewer3.S4.k) != null ? org.telegram.messenger.ij.o1(photoViewer3.S4.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer3.T);
                                                    File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer3.T);
                                                        file33 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                    } else {
                                                        file33 = J2;
                                                    }
                                                }
                                            }
                                            if (!E3) {
                                                if (M != null && M.exists()) {
                                                    MediaController.d0(M.toString(), photoViewer3.D, M4 ? 1 : 0, null, null, new ko0(qo0Var2, M4, 0));
                                                    break;
                                                } else {
                                                    photoViewer3.R2();
                                                    break;
                                                }
                                            } else if (M != null && M.exists() && file33 != null && file33.exists()) {
                                                MediaController.e0(M.toString(), file33.toString(), photoViewer3.D, new fo0(qo0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer3.R2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(r02 != false ? org.telegram.messenger.id.G(arrayList.size(), "AllNPhotos", new Object[0]) : org.telegram.messenger.id.G(arrayList.size(), "AllNMedia", new Object[0]), new lk0(3, this, arrayList));
                        alertDialog$Builder2.i(org.telegram.messenger.id.M0(2131752589, "Cancel"), new go0(1));
                        org.telegram.ui.ActionBar.u1 a11 = alertDialog$Builder2.a();
                        w12 = r72.w1(org.telegram.ui.ActionBar.k6.ih);
                        a11.j(w12);
                        a11.show();
                        View d2 = a11.d(-3);
                        if (d2 instanceof TextView) {
                            int i67 = org.telegram.ui.ActionBar.k6.q7;
                            org.telegram.ui.ActionBar.r6.V((TextView) d2, i67, r72.v2);
                            w14 = r72.w1(i67);
                            d2.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), w14));
                            ViewGroup viewGroup2 = a11.t0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d2.bringToFront();
                            }
                        }
                        w13 = r72.w1(org.telegram.ui.ActionBar.k6.Vg);
                        a11.p(w13);
                        return;
                    }
                }
                z10 = false;
                activity13 = r72.D;
                ijVar36 = r72.S4;
                ((LaunchActivity) activity13).O0(ijVar36.I1);
                arrayList = new ArrayList(1);
                anVar4 = r72.k4;
                if (anVar4 == null) {
                }
                if (djVar == null) {
                }
                if (!z10) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i7 == 18) {
                    PhotoViewer.v(r72);
                    return;
                }
                if (i7 == 26) {
                    activity11 = r72.D;
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
                    activity9 = r72.D;
                    if (activity9 == null) {
                        return;
                    }
                    uq0Var2 = r72.d;
                    if (uq0Var2 == null) {
                        return;
                    }
                    ijVar24 = r72.S4;
                    if (ijVar24 != null) {
                        ijVar32 = r72.S4;
                        if (!ijVar32.p1) {
                            ijVar33 = r72.S4;
                            long A02 = ijVar33.A0();
                            if (org.telegram.messenger.m5.z(A02)) {
                                i48 = r72.T;
                                z9 = org.telegram.messenger.t3.T(org.telegram.messenger.qp.s1(i48).M0(Long.valueOf(-A02)));
                                activity10 = r72.D;
                                ?? alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                uq0Var3 = r72.d;
                                b02 = uq0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(org.telegram.messenger.id.M0(2131754094, "AreYouSureDeletePhotoTitle"));
                                    alertDialog$Builder3.g(b02);
                                } else {
                                    if (!r72.s4) {
                                        hcVar14 = r72.Z4;
                                        if (hcVar14 != null) {
                                            hcVar15 = r72.Z4;
                                            hcVar16 = r72.Y4;
                                        }
                                        ijVar25 = r72.S4;
                                        if (ijVar25 != null) {
                                            ijVar28 = r72.S4;
                                        }
                                        ijVar26 = r72.S4;
                                        if (ijVar26 != null) {
                                            ijVar27 = r72.S4;
                                            if (ijVar27.r3()) {
                                                alertDialog$Builder3.l(org.telegram.messenger.id.M0(2131754097, "AreYouSureDeleteGIFTitle"));
                                                if (z9) {
                                                    alertDialog$Builder3.g(org.telegram.messenger.id.Y(2131754098, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(org.telegram.messenger.id.Y(2131754099, "AreYouSureDeleteGIF", new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(org.telegram.messenger.id.M0(2131754094, "AreYouSureDeletePhotoTitle"));
                                        if (z9) {
                                            alertDialog$Builder3.g(org.telegram.messenger.id.Y(2131754095, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(org.telegram.messenger.id.Y(2131754096, "AreYouSureDeletePhoto", new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(org.telegram.messenger.id.M0(2131754083, "AreYouSureDeleteVideoTitle"));
                                    if (z9) {
                                        alertDialog$Builder3.g(org.telegram.messenger.id.Y(2131754084, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(org.telegram.messenger.id.Y(2131754085, "AreYouSureDeleteVideo", new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                ijVar29 = r72.S4;
                                if (ijVar29 != null) {
                                    ijVar30 = r72.S4;
                                    if (!ijVar30.p1) {
                                        ijVar31 = r72.S4;
                                        long A03 = ijVar31.A0();
                                        if (!org.telegram.messenger.m5.C(A03)) {
                                            if (org.telegram.messenger.m5.E(A03)) {
                                                i47 = r72.T;
                                                user = org.telegram.messenger.qp.s1(i47).a2(Long.valueOf(A03));
                                                M0 = null;
                                            } else {
                                                i41 = r72.T;
                                                M0 = org.telegram.messenger.qp.s1(i41).M0(Long.valueOf(-A03));
                                                user = null;
                                            }
                                            if (user != null || !org.telegram.messenger.t3.T(M0)) {
                                                i42 = r72.T;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = r72.T;
                                                    i44 = org.telegram.messenger.qp.s1(i46).b3;
                                                } else {
                                                    i43 = r72.T;
                                                    i44 = org.telegram.messenger.qp.s1(i43).a3;
                                                }
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = r72.T;
                                                }
                                            }
                                        }
                                    }
                                }
                                String str5 = "Cancel";
                                int i68 = 4;
                                int i69 = 2131752589;
                                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751599, "Delete"), new lk0(i68, this, zArr));
                                alertDialog$Builder3.h(org.telegram.messenger.id.M0(i69, str5), null);
                                org.telegram.ui.ActionBar.u1 a12 = alertDialog$Builder3.a();
                                r72.P2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, r72.v2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z9 = false;
                    activity10 = r72.D;
                    ?? alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    uq0Var3 = r72.d;
                    b02 = uq0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    ijVar29 = r72.S4;
                    if (ijVar29 != null) {
                    }
                    String str52 = "Cancel";
                    int i682 = 4;
                    int i692 = 2131752589;
                    alertDialog$Builder32.k(org.telegram.messenger.id.M0(2131751599, "Delete"), new lk0(i682, this, zArr2));
                    alertDialog$Builder32.h(org.telegram.messenger.id.M0(i692, str52), null);
                    org.telegram.ui.ActionBar.u1 a122 = alertDialog$Builder32.a();
                    r72.P2(alertDialog$Builder32);
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
                            if (r72.s4) {
                                activity5 = r72.D;
                                ijVar11 = r72.S4;
                                vf.c.t(activity5, org.telegram.messenger.ij.o1(ijVar11.k).webpage.url);
                                r72.z0(false, false);
                                return;
                            }
                            ijVar6 = r72.S4;
                            if (ijVar6 == null) {
                                qq0Var = r72.i7;
                                if (qq0Var != null) {
                                    qq0Var2 = r72.i7;
                                    i12 = r72.O4;
                                    TLObject d10 = qq0Var2.d(i12);
                                    activity3 = r72.D;
                                    if (org.telegram.messenger.g0.v2(d10, activity3)) {
                                        r72.z0(false, false);
                                        return;
                                    } else {
                                        r72.R2();
                                        return;
                                    }
                                }
                                return;
                            }
                            ijVar7 = r72.S4;
                            activity4 = r72.D;
                            ijVar8 = r72.S4;
                            if (!ijVar8.I4()) {
                                ijVar9 = r72.S4;
                                if (!ijVar9.S3()) {
                                    ijVar10 = r72.S4;
                                    if (!ijVar10.u4()) {
                                        z15 = false;
                                    }
                                }
                            }
                            if (org.telegram.messenger.g0.u2(ijVar7, activity4, f6Var, z15)) {
                                r72.z0(false, false);
                                return;
                            } else {
                                r72.R2();
                                return;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.f(e10);
                            return;
                        }
                    }
                    if (i7 == 11 || i7 == 13) {
                        activity6 = r72.D;
                        if (activity6 != null) {
                            ijVar12 = r72.S4;
                            if (ijVar12 == null) {
                                return;
                            }
                            ijVar13 = r72.S4;
                            if (org.telegram.messenger.ij.o1(ijVar13.k) instanceof TLRPC.TL_messageMediaPhoto) {
                                ijVar17 = r72.S4;
                                tLObject = org.telegram.messenger.ij.o1(ijVar17.k).photo;
                            } else {
                                ijVar14 = r72.S4;
                                if (!(org.telegram.messenger.ij.o1(ijVar14.k) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                ijVar15 = r72.S4;
                                tLObject = org.telegram.messenger.ij.o1(ijVar15.k).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = r72.D;
                            ijVar16 = r72.S4;
                            r72.T3 = new po0(this, activity7, ijVar16, tLObject2, this.a);
                            yv0Var = r72.T3;
                            yv0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i7 == 6) {
                        r0Var = r72.o0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!r72.s4) {
                            r72.e3();
                            return;
                        }
                        ae0Var = r72.f0;
                        if (ae0Var.e()) {
                            if (PhotoViewer.f9 != null) {
                                PhotoViewer.f9.J0();
                            }
                            r72.I3 = true;
                            photoViewer = PhotoViewer.e9;
                            PhotoViewer.f9 = photoViewer;
                            PhotoViewer.e9 = null;
                            r72.e = false;
                            r72.f = false;
                            wq0 wq0Var = r72.c5;
                            if (wq0Var != null && !wq0Var.a.H()) {
                                r72.c5.a.O0(true, true);
                            }
                            r72.l6 = 1.0f;
                            r72.e0.invalidate();
                            r72.M0();
                            return;
                        }
                        return;
                    }
                    if (i7 == 8) {
                        ijVar22 = r72.S4;
                        if (ijVar22 == null) {
                            return;
                        }
                        i40 = r72.T;
                        org.telegram.messenger.w7 G3 = org.telegram.messenger.w7.G(i40);
                        ijVar23 = r72.S4;
                        G3.d(ijVar23.F0());
                        r72.l2(false);
                        r72.i0.setTag(r3);
                        r72.i0.setVisibility(0);
                        return;
                    }
                    if (i7 == 12) {
                        ijVar19 = r72.S4;
                        if (ijVar19 != null) {
                            ijVar20 = r72.S4;
                            TLRPC.Document F0 = ijVar20.F0();
                            anVar = r72.k4;
                            if (anVar != null) {
                                anVar2 = r72.k4;
                                if (anVar2.Z != null) {
                                    anVar3 = r72.k4;
                                    anVar3.Z.k(F0);
                                    i39 = r72.T;
                                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i39);
                                    ijVar21 = r72.S4;
                                    s12.t4(ijVar21, F0);
                                }
                            }
                            i38 = r72.T;
                            org.telegram.messenger.ui.b0(i38).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = r72.T;
                            org.telegram.messenger.qp s122 = org.telegram.messenger.qp.s1(i39);
                            ijVar21 = r72.S4;
                            s122.t4(ijVar21, F0);
                        } else {
                            qq0Var3 = r72.i7;
                            if (qq0Var3 == null) {
                                return;
                            }
                            qq0Var4 = r72.i7;
                            i35 = r72.O4;
                            TLObject d11 = qq0Var4.d(i35);
                            if (d11 instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d11;
                                i36 = r72.T;
                                org.telegram.messenger.ui.b0(i36).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = r72.T;
                                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i37);
                                qq0Var5 = r72.i7;
                                s13.t4(qq0Var5.g(), document2);
                            }
                        }
                        pq0 pq0Var = r72.e0;
                        if (pq0Var != null) {
                            org.telegram.ui.Components.hc.Z(pq0Var, f6Var).o(org.telegram.ui.Components.gc.D, f6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i7 == 14) {
                        ArrayList arrayList5 = r72.e7;
                        i17 = r72.O4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i17);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(800, photo3.sizes);
                        TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(90, photo3.sizes);
                        i18 = r72.T;
                        org.telegram.messenger.p10 i70 = org.telegram.messenger.p10.i(i18);
                        j10 = r72.y5;
                        if (j10 == i70.n) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = r72.T;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new lo0(this, i70, photo3, i62));
                            i33 = r72.T;
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(i33).a2(Long.valueOf(i70.n));
                            if (a22 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = u11.location;
                                userProfilePhoto.photo_big = u10.location;
                                i70.w(a22);
                                i70.v(true);
                                i34 = r72.T;
                                org.telegram.messenger.qs.f(i34).k(org.telegram.messenger.qs.j0, new Object[0]);
                            }
                        } else {
                            i19 = r72.T;
                            org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(i19);
                            j11 = r72.y5;
                            TLRPC.Chat M04 = s14.M0(Long.valueOf(-j11));
                            if (M04 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i20 = r72.T;
                            org.telegram.messenger.qp s15 = org.telegram.messenger.qp.s1(i20);
                            j12 = r72.y5;
                            s15.B(-j12, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = M04.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = u11.location;
                            chatPhoto.photo_big = u10.location;
                            i21 = r72.T;
                            org.telegram.messenger.qs.f(i21).k(org.telegram.messenger.qs.r, 2);
                        }
                        r72.g7 = org.telegram.messenger.hc.i(u10, photo3);
                        ArrayList arrayList6 = r72.e7;
                        i22 = r72.O4;
                        arrayList6.remove(i22);
                        r72.e7.add(0, photo3);
                        ArrayList arrayList7 = r72.Z6;
                        i23 = r72.O4;
                        org.telegram.messenger.hc hcVar21 = (org.telegram.messenger.hc) arrayList7.get(i23);
                        ArrayList arrayList8 = r72.Z6;
                        i24 = r72.O4;
                        arrayList8.remove(i24);
                        r72.Z6.add(0, hcVar21);
                        ArrayList arrayList9 = r72.a7;
                        i25 = r72.O4;
                        org.telegram.messenger.hc hcVar22 = (org.telegram.messenger.hc) arrayList9.get(i25);
                        ArrayList arrayList10 = r72.a7;
                        i26 = r72.O4;
                        arrayList10.remove(i26);
                        r72.a7.add(0, hcVar22);
                        ArrayList arrayList11 = r72.b7;
                        i27 = r72.O4;
                        Long l10 = (Long) arrayList11.get(i27);
                        ArrayList arrayList12 = r72.b7;
                        i28 = r72.O4;
                        arrayList12.remove(i28);
                        r72.b7.add(0, l10);
                        ArrayList arrayList13 = r72.c7;
                        i29 = r72.O4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i29);
                        ArrayList arrayList14 = r72.c7;
                        i30 = r72.O4;
                        arrayList14.remove(i30);
                        r72.c7.add(0, message);
                        i31 = r72.T;
                        org.telegram.messenger.qp s16 = org.telegram.messenger.qp.s1(i31);
                        j13 = r72.y5;
                        org.telegram.messenger.yo U0 = s16.U0(j13);
                        while (true) {
                            if (i61 >= U0.b.size()) {
                                break;
                            }
                            TLRPC.Photo photo4 = (TLRPC.Photo) U0.b.get(i61);
                            if (photo4 != null && photo4.id == photo3.id) {
                                U0.c(i61);
                                break;
                            }
                            i61++;
                        }
                        r72.O4 = -1;
                        r72.y2(0);
                        org.telegram.ui.Components.l20 l20Var = r72.l1;
                        l20Var.d.clear();
                        l20Var.e.clear();
                        l20Var.c.clear();
                        r72.l1.b();
                        undoView = r72.n1;
                        j14 = r72.y5;
                        hcVar12 = r72.Z4;
                        hcVar13 = r72.Y4;
                        undoView.m(j14, hcVar12 == hcVar13 ? null : 1, 22);
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.mo0
                            public final /* synthetic */ qo0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i62) {
                                    case 0:
                                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.b.o0;
                                        if (r0Var2 != null) {
                                            r0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.t(19);
                                        photoViewer2.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.S(19);
                                        photoViewer3.o0.t(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i7 == 15) {
                        i15 = r72.T;
                        org.telegram.messenger.w7.G(i15);
                        hcVar7 = r72.Z4;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = hcVar7 == null ? null : hcVar7.f;
                        hcVar8 = r72.Z4;
                        File J2 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, PhotoViewer.m1(hcVar8), true, true);
                        hcVar9 = r72.Z4;
                        boolean z22 = hcVar9.p == 2;
                        if (z22) {
                            i16 = r72.T;
                            org.telegram.messenger.w7.G(i16);
                            hcVar10 = r72.Y4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = hcVar10 == null ? null : hcVar10.f;
                            hcVar11 = r72.Y4;
                            str = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated3, PhotoViewer.m1(hcVar11), true, true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        uq0Var = r72.d;
                        uq0Var.f(J2.getAbsolutePath(), str, z22);
                        return;
                    }
                    if (i7 == 19) {
                        int i71 = r72.P4;
                        if (i71 < 0 || i71 >= r72.X6.size()) {
                            return;
                        }
                        org.telegram.messenger.ij ijVar62 = (org.telegram.messenger.ij) r72.X6.get(r72.P4);
                        final int i72 = 1;
                        r72.m5 = true;
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.mo0
                            public final /* synthetic */ qo0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i72) {
                                    case 0:
                                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.b.o0;
                                        if (r0Var2 != null) {
                                            r0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.t(19);
                                        photoViewer2.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.S(19);
                                        photoViewer3.o0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.K(r72);
                        i14 = r72.T;
                        org.telegram.messenger.qp.s1(i14).T1().L(ijVar62, new wn0(r72, 5));
                        return;
                    }
                    if (i7 == 20) {
                        r72.m5 = false;
                        final int i73 = 2;
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.mo0
                            public final /* synthetic */ qo0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i73) {
                                    case 0:
                                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.b.o0;
                                        if (r0Var2 != null) {
                                            r0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.t(19);
                                        photoViewer2.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.S(19);
                                        photoViewer3.o0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.K(r72);
                        return;
                    }
                    if (i7 == 22) {
                        r72.Y2 = !r72.Y2;
                        boolean z23 = r72.Y2;
                        ijVar18 = r72.S4;
                        org.telegram.ui.Components.t51.n0(ijVar18, z23);
                        org.telegram.ui.Components.t51 t51Var = r72.F2;
                        if (t51Var != null) {
                            t51Var.s0(r72.Y2);
                        }
                        r72.s0.f(r72.Y2);
                        r72.s0.setSelectorColor(r72.Y2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i7 != 23) {
                        return;
                    }
                    hcVar = r72.Y4;
                    if (hcVar != null) {
                        hcVar5 = r72.Y4;
                        if (hcVar5.l != null) {
                            hcVar6 = r72.Y4;
                            photo2 = hcVar6.l;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i13 = r72.T;
                            activity8 = r72.D;
                            j3 = r72.y5;
                            org.telegram.ui.Components.v4.G(i13, activity8, j3, photo, new di.b());
                            return;
                        }
                    }
                    hcVar2 = r72.Z4;
                    if (hcVar2 != null) {
                        hcVar3 = r72.Z4;
                        if (hcVar3.l != null) {
                            hcVar4 = r72.Z4;
                            photo2 = hcVar4.l;
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
