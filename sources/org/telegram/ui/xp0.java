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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gi.v vVar;
        ArrayList arrayList;
        int i3;
        int i10;
        int i11;
        TL_iv.PageBlock pageBlock = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.b;
                int i13 = PhotoViewer.BackgroundDrawable.g;
                backgroundDrawable.a();
                break;
            case 1:
                lq0 lq0Var = (lq0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lq0Var.a.O0.getLayoutParams();
                ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int y9 = org.telegram.messenger.camera.q.y(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = lq0Var.a;
                int i14 = y9 + (!photoViewer.s ? org.telegram.messenger.g0.m : 0);
                if (i14 != layoutParams.topMargin) {
                    layoutParams.topMargin = i14;
                    photoViewer.O0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) lq0Var.a.P0.getLayoutParams();
                int y10 = org.telegram.messenger.camera.q.y(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = lq0Var.a;
                int i15 = y10 + (!photoViewer2.s ? org.telegram.messenger.g0.m : 0);
                if (layoutParams2.topMargin != i15) {
                    layoutParams2.topMargin = i15;
                    photoViewer2.P0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ai.e3) this.b).run();
                break;
            case 3:
                k kVar = (k) this.b;
                kVar.getClass();
                kVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((b1) this.b).a(2, false);
                break;
            case 6:
                i4 i4Var = ((q0) this.b).a;
                i4Var.T0.e();
                Runnable runnable = i4Var.b0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.b0 = null;
                    break;
                }
                break;
            case 7:
                r1 r1Var = (r1) ((n1) this.b).b;
                i4 i4Var2 = r1Var.y;
                View view = i4Var2.P;
                if (view != null) {
                    i4Var2.Q.addView(view, b8.mf.c(-1.0f, -1));
                    r1Var.y.Q.setVisibility(0);
                    break;
                }
                break;
            case 8:
                sf.c.t(((r1) ((o1) this.b).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((b2) this.b).requestLayout();
                break;
            case 10:
                u3 u3Var = (u3) this.b;
                u3Var.release();
                u3Var.L.q();
                break;
            case 11:
                g4 g4Var = (g4) this.b;
                ArrayList arrayList2 = new ArrayList(g4Var.d);
                int size = arrayList2.size();
                i4 i4Var3 = g4Var.N;
                int i16 = size + (i4Var3.L == null ? 0 : 1);
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                l3 l3Var = i4Var3.v0[0];
                if (l3Var != null && (vVar = l3Var.b) != null) {
                    Point point = org.telegram.messenger.g0.q;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31);
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i16) {
                        boolean z10 = g4Var.J;
                        if (z10 && i17 == 0) {
                            iArr[i12] = i12;
                        } else {
                            int i19 = z10 ? i17 - 1 : i17;
                            TL_iv.PageBlock pageBlock2 = (i19 < 0 || i19 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i19);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                u4.d1 a10 = g4Var.a(vVar, g4.I(pageBlock2));
                                View view2 = a10.a;
                                int i20 = i18;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i3 = makeMeasureSpec2;
                                i10 = i17;
                                i11 = i20;
                                g4Var.H(a10.f, a10, pageBlock3, i19, arrayList2.size(), true);
                                view2.measure(makeMeasureSpec, i3);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i10] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                                }
                                int i21 = i10 - 1;
                                iArr2[i10] = (i21 >= 0 ? 0 : iArr2[i21]) + iArr[i10];
                                i18 = i11 + iArr[i10];
                                i17 = i10 + 1;
                                makeMeasureSpec2 = i3;
                                arrayList2 = arrayList;
                                pageBlock = null;
                                i12 = 0;
                            } else {
                                iArr[i17] = pageBlock2.cachedHeight;
                            }
                        }
                        arrayList = arrayList2;
                        i3 = makeMeasureSpec2;
                        i10 = i17;
                        i11 = i18;
                        int i212 = i10 - 1;
                        iArr2[i10] = (i212 >= 0 ? 0 : iArr2[i212]) + iArr[i10];
                        i18 = i11 + iArr[i10];
                        i17 = i10 + 1;
                        makeMeasureSpec2 = i3;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i12 = 0;
                    }
                    org.telegram.messenger.g0.h3(new f4(g4Var, i18, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                d5 d5Var = (d5) this.b;
                if (!d5Var.x) {
                    d5Var.x = true;
                    org.telegram.ui.Components.nk0.d(new c5(d5Var, i12));
                    break;
                }
                break;
            case 13:
                z5 z5Var = (z5) this.b;
                z5Var.d.clear();
                z5Var.getMessagesController().r7.h(z5Var.e, z5Var.d);
                z5Var.Z();
                z5Var.finishFragment();
                break;
            case 14:
                final c5 c5Var = (c5) this.b;
                ArrayList d12 = org.telegram.messenger.g0.d1();
                File file = (File) d12.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(org.telegram.messenger.az.h0)) {
                    int size2 = d12.size();
                    while (i12 < size2) {
                        File file2 = (File) d12.get(i12);
                        if (file2.getAbsolutePath().startsWith(org.telegram.messenger.az.h0) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i12++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    final long blockSizeLong = statFs.getBlockSizeLong();
                    final long availableBlocksLong = statFs.getAvailableBlocksLong();
                    final long blockCountLong = statFs.getBlockCountLong();
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.e6
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j10 = blockCountLong;
                            long j11 = blockSizeLong;
                            z6.l0 = Long.valueOf(j10 * j11);
                            Long valueOf = Long.valueOf(availableBlocksLong * j11);
                            z6.m0 = valueOf;
                            c5Var.a(z6.l0, valueOf);
                        }
                    });
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 15:
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.b;
                z6.i0 = false;
                long s02 = z6.s0(org.telegram.messenger.w7.j(4), 5);
                long s03 = z6.s0(org.telegram.messenger.w7.j(4), 4);
                long s04 = z6.s0(org.telegram.messenger.w7.j(100), 0) + z6.s0(org.telegram.messenger.w7.j(0), 0);
                long s05 = z6.s0(org.telegram.messenger.w7.j(101), 0) + z6.s0(org.telegram.messenger.w7.j(2), 0);
                long s06 = z6.s0(org.telegram.messenger.w7.j(5), 1) + z6.s0(org.telegram.messenger.w7.j(3), 1);
                long s07 = z6.s0(org.telegram.messenger.w7.j(5), 2) + z6.s0(org.telegram.messenger.w7.j(3), 2);
                long s08 = z6.s0(org.telegram.messenger.w7.j(4), 3) + z6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                long s09 = z6.s0(org.telegram.messenger.w7.j(1), 0);
                long s010 = z6.s0(org.telegram.messenger.w7.j(6), 0);
                long s011 = z6.s0(org.telegram.messenger.g0.P0(), 1);
                boolean z11 = org.telegram.messenger.r2.a;
                long j10 = s02 + s03 + s05 + s09 + s04 + s06 + s07 + s08 + s010 + s011;
                z6.k0 = Long.valueOf(j10);
                z6.j0 = System.currentTimeMillis();
                if (!z6.i0) {
                    org.telegram.messenger.g0.h3(new c6(0, j10, u10Var));
                    break;
                }
                break;
            case 16:
                ((q6) this.b).dismiss();
                break;
            case 17:
                s9 s9Var = (s9) ((o4) this.b).b;
                try {
                    CameraView cameraView = s9Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, s9Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = s9Var.d;
                if (cameraView2 != null) {
                    s9Var.h0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                x9 x9Var = (x9) this.b;
                w9 w9Var = x9Var.a;
                if (w9Var != null) {
                    w9Var.requestFocus();
                    org.telegram.messenger.g0.K3(x9Var.a);
                    break;
                }
                break;
            case 19:
                ka kaVar = (ka) this.b;
                String str = kaVar.r;
                if (str == null || str.length() > 0) {
                    kaVar.n = true;
                    kaVar.j0(kaVar.w.size() <= 0);
                    kaVar.n = false;
                    break;
                }
                break;
            case 20:
                bb bbVar = (bb) this.b;
                if (bbVar.W != -1) {
                    bbVar.Y.getNotificationCenter().j(bbVar.W);
                    bbVar.W = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                kb kbVar = ((jb) this.b).f;
                kbVar.getNotificationCenter().j(kbVar.L0);
                break;
            case 22:
                org.telegram.ui.Components.fc.d0((TLRPC.TL_error) this.b);
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
                ((org.telegram.ui.ActionBar.k) this.b).invalidate();
                break;
            case 26:
                ((org.telegram.ui.ActionBar.y0) this.b).performClick();
                break;
            case 27:
                ((org.telegram.ui.Components.f60) this.b).s();
                break;
            case 28:
                ((z) this.b).a(Boolean.FALSE);
                break;
            default:
                ((org.telegram.ui.ActionBar.f1) this.b).dismiss();
                break;
        }
    }
}
