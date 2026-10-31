package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rr0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g3 g3Var;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        TL_iv.PageBlock pageBlock = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.b;
                int i14 = PhotoViewer.BackgroundDrawable.g;
                backgroundDrawable.a();
                break;
            case 1:
                fs0 fs0Var = (fs0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fs0Var.a.N0.getLayoutParams();
                ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int y3 = org.telegram.messenger.z20.y(34.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = fs0Var.a;
                int i15 = y3 + (!photoViewer.s ? org.telegram.messenger.i0.m : 0);
                if (i15 != layoutParams.topMargin) {
                    layoutParams.topMargin = i15;
                    photoViewer.N0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fs0Var.a.O0.getLayoutParams();
                int y10 = org.telegram.messenger.z20.y(40.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = fs0Var.a;
                int i16 = y10 + (!photoViewer2.s ? org.telegram.messenger.i0.m : 0);
                if (layoutParams2.topMargin != i16) {
                    layoutParams2.topMargin = i16;
                    photoViewer2.O0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ag.o0) this.b).run();
                break;
            case 3:
                j jVar = (j) this.b;
                jVar.getClass();
                jVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((c1) this.b).a(2, false);
                break;
            case 6:
                h4 h4Var = ((r0) this.b).a;
                h4Var.S0.e();
                Runnable runnable = h4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    h4Var.a0 = null;
                    break;
                }
                break;
            case 7:
                r1 r1Var = (r1) ((o1) this.b).b;
                h4 h4Var2 = r1Var.y;
                View view = h4Var2.O;
                if (view != null) {
                    h4Var2.P.addView(view, w7.b6.c(-1.0f, -1));
                    r1Var.y.P.setVisibility(0);
                    break;
                }
                break;
            case 8:
                gf.f.r(((r1) ((ji.i) this.b).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((b2) this.b).requestLayout();
                break;
            case 10:
                u3 u3Var = (u3) this.b;
                u3Var.release();
                u3Var.K.q();
                break;
            case 11:
                f4 f4Var = (f4) this.b;
                ArrayList arrayList2 = new ArrayList(f4Var.d);
                int size = arrayList2.size();
                h4 h4Var3 = f4Var.M;
                int i17 = size + (h4Var3.K == null ? 0 : 1);
                int[] iArr = new int[i17];
                int[] iArr2 = new int[i17];
                l3 l3Var = h4Var3.u0[0];
                if (l3Var != null && (g3Var = l3Var.b) != null) {
                    Point point = org.telegram.messenger.i0.q;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i17) {
                        boolean z10 = f4Var.I;
                        if (z10 && i18 == 0) {
                            iArr[i13] = i13;
                        } else {
                            int i20 = z10 ? i18 - 1 : i18;
                            TL_iv.PageBlock pageBlock2 = (i20 < 0 || i20 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i20);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                s4.c1 a2 = f4Var.a(g3Var, f4.I(pageBlock2));
                                View view2 = a2.a;
                                int i21 = i19;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i18;
                                i12 = i21;
                                f4Var.H(a2.f, a2, pageBlock3, i20, arrayList2.size(), true);
                                view2.measure(makeMeasureSpec, i10);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i11] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                                }
                                int i22 = i11 - 1;
                                iArr2[i11] = (i22 >= 0 ? 0 : iArr2[i22]) + iArr[i11];
                                i19 = i12 + iArr[i11];
                                i18 = i11 + 1;
                                makeMeasureSpec2 = i10;
                                arrayList2 = arrayList;
                                pageBlock = null;
                                i13 = 0;
                            } else {
                                iArr[i18] = pageBlock2.cachedHeight;
                            }
                        }
                        arrayList = arrayList2;
                        i10 = makeMeasureSpec2;
                        i11 = i18;
                        i12 = i19;
                        int i222 = i11 - 1;
                        iArr2[i11] = (i222 >= 0 ? 0 : iArr2[i222]) + iArr[i11];
                        i19 = i12 + iArr[i11];
                        i18 = i11 + 1;
                        makeMeasureSpec2 = i10;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i13 = 0;
                    }
                    org.telegram.messenger.i0.g3(new ag.o0(f4Var, i19, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                a5 a5Var = (a5) this.b;
                if (!a5Var.x) {
                    a5Var.x = true;
                    org.telegram.ui.Components.nl0.d(new z4(a5Var, i13));
                    break;
                }
                break;
            case 13:
                x5 x5Var = (x5) this.b;
                x5Var.d.clear();
                x5Var.getMessagesController().s7.h(x5Var.e, x5Var.d);
                x5Var.Y();
                x5Var.finishFragment();
                break;
            case 14:
                final z4 z4Var = (z4) this.b;
                ArrayList d12 = org.telegram.messenger.i0.d1();
                File file = (File) d12.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(org.telegram.messenger.tz.h0)) {
                    int size2 = d12.size();
                    while (i13 < size2) {
                        File file2 = (File) d12.get(i13);
                        if (file2.getAbsolutePath().startsWith(org.telegram.messenger.tz.h0) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i13++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    final long blockSizeLong = statFs.getBlockSizeLong();
                    final long availableBlocksLong = statFs.getAvailableBlocksLong();
                    final long blockCountLong = statFs.getBlockCountLong();
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j10 = blockCountLong;
                            long j11 = blockSizeLong;
                            y6.k0 = Long.valueOf(j10 * j11);
                            Long valueOf = Long.valueOf(availableBlocksLong * j11);
                            y6.l0 = valueOf;
                            z4Var.a(y6.k0, valueOf);
                        }
                    });
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 15:
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.b;
                y6.h0 = false;
                long r02 = y6.r0(org.telegram.messenger.b8.j(4), 5);
                long r03 = y6.r0(org.telegram.messenger.b8.j(4), 4);
                long r04 = y6.r0(org.telegram.messenger.b8.j(100), 0) + y6.r0(org.telegram.messenger.b8.j(0), 0);
                long r05 = y6.r0(org.telegram.messenger.b8.j(101), 0) + y6.r0(org.telegram.messenger.b8.j(2), 0);
                long r06 = y6.r0(org.telegram.messenger.b8.j(5), 1) + y6.r0(org.telegram.messenger.b8.j(3), 1);
                long r07 = y6.r0(org.telegram.messenger.b8.j(5), 2) + y6.r0(org.telegram.messenger.b8.j(3), 2);
                long r08 = y6.r0(org.telegram.messenger.b8.j(4), 3) + y6.r0(new File(org.telegram.messenger.b8.j(4), "acache"), 0);
                long r09 = y6.r0(org.telegram.messenger.b8.j(1), 0);
                long r010 = y6.r0(org.telegram.messenger.b8.j(6), 0);
                long r011 = y6.r0(org.telegram.messenger.i0.P0(), 1);
                boolean z11 = org.telegram.messenger.v2.a;
                long j10 = r02 + r03 + r05 + r09 + r04 + r06 + r07 + r08 + r010 + r011;
                y6.j0 = Long.valueOf(j10);
                y6.i0 = System.currentTimeMillis();
                if (!y6.h0) {
                    org.telegram.messenger.i0.g3(new a6(0, j10, q20Var));
                    break;
                }
                break;
            case 16:
                ((p6) this.b).dismiss();
                break;
            case 17:
                u9 u9Var = (u9) ((m4) this.b).b;
                try {
                    CameraView cameraView = u9Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, u9Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = u9Var.d;
                if (cameraView2 != null) {
                    u9Var.g0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                z9 z9Var = (z9) this.b;
                y9 y9Var = z9Var.a;
                if (y9Var != null) {
                    y9Var.requestFocus();
                    org.telegram.messenger.i0.J3(z9Var.a);
                    break;
                }
                break;
            case 19:
                oa oaVar = (oa) this.b;
                String str = oaVar.r;
                if (str == null || str.length() > 0) {
                    oaVar.n = true;
                    oaVar.i0(oaVar.w.size() <= 0);
                    oaVar.n = false;
                    break;
                }
                break;
            case 20:
                ib ibVar = (ib) this.b;
                if (ibVar.W != -1) {
                    ibVar.Y.getNotificationCenter().j(ibVar.W);
                    ibVar.W = -1;
                }
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                sb sbVar = ((rb) this.b).f;
                sbVar.getNotificationCenter().j(sbVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.cc.d0((TLRPC.TL_error) this.b);
                break;
            case 23:
                ((boolean[]) this.b)[0] = true;
                break;
            case 24:
                AtomicReference atomicReference = (AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.ActionBar.l) this.b).invalidate();
                break;
            case 26:
                ((org.telegram.ui.ActionBar.b1) this.b).performClick();
                break;
            case 27:
                ((org.telegram.ui.Components.z60) this.b).s();
                break;
            case 28:
                ((w) this.b).a(Boolean.FALSE);
                break;
            default:
                ((org.telegram.ui.ActionBar.k1) this.b).dismiss();
                break;
        }
    }
}
