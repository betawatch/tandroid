package org.telegram.ui;

import android.animation.AnimatorSet;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yt0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0316  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m3 m3Var;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        TL_iv.PageBlock pageBlock = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.b;
                int i15 = PhotoViewer.BackgroundDrawable.g;
                backgroundDrawable.a();
                break;
            case 1:
                pu0 pu0Var = (pu0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pu0Var.a.K0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int x10 = b.x(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = pu0Var.a;
                int i16 = x10 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i16 != layoutParams.topMargin) {
                    layoutParams.topMargin = i16;
                    photoViewer.K0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pu0Var.a.L0.getLayoutParams();
                int x11 = b.x(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = pu0Var.a;
                int i17 = x11 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i17) {
                    layoutParams2.topMargin = i17;
                    photoViewer2.L0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ah.a) this.b).run();
                break;
            case 3:
                n nVar = (n) this.b;
                nVar.getClass();
                nVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((g1) this.b).a(2, false);
                break;
            case 6:
                n4 n4Var = ((v0) this.b).a;
                n4Var.O0.unlock();
                Runnable runnable = n4Var.X;
                if (runnable != null) {
                    runnable.run();
                    n4Var.X = null;
                    break;
                }
                break;
            case 7:
                w1 w1Var = (w1) ((s1) this.b).b;
                n4 n4Var2 = w1Var.x;
                View view = n4Var2.L;
                if (view != null) {
                    n4Var2.M.addView(view, k7.b6.c(-1.0f, -1));
                    w1Var.x.M.setVisibility(0);
                    break;
                }
                break;
            case 8:
                ze.d.s(((t1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((g2) this.b).requestLayout();
                break;
            case 10:
                a4 a4Var = (a4) this.b;
                a4Var.release();
                a4Var.H.s();
                break;
            case 11:
                l4 l4Var = (l4) this.b;
                ArrayList arrayList2 = new ArrayList(l4Var.d);
                int size = arrayList2.size();
                n4 n4Var3 = l4Var.I;
                int i18 = size + (n4Var3.H == null ? 0 : 1);
                int[] iArr = new int[i18];
                int[] iArr2 = new int[i18];
                r3 r3Var = n4Var3.r0[0];
                if (r3Var != null && (m3Var = r3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i18) {
                        boolean z4 = l4Var.E;
                        if (z4 && i19 == 0) {
                            iArr[i14] = i14;
                        } else {
                            int i21 = z4 ? i19 - 1 : i19;
                            TL_iv.PageBlock pageBlock2 = (i21 < 0 || i21 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i21);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                f2.l1 g10 = l4Var.g(m3Var, l4.I(pageBlock2));
                                View view2 = g10.a;
                                int i22 = i20;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i19;
                                i12 = i22;
                                l4Var.H(g10.f, g10, pageBlock3, i21, arrayList2.size(), true);
                                view2.measure(makeMeasureSpec, i10);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i11] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                                }
                                int i23 = i11 - 1;
                                iArr2[i11] = (i23 >= 0 ? 0 : iArr2[i23]) + iArr[i11];
                                i20 = i12 + iArr[i11];
                                i19 = i11 + 1;
                                makeMeasureSpec2 = i10;
                                arrayList2 = arrayList;
                                pageBlock = null;
                                i14 = 0;
                            } else {
                                iArr[i19] = pageBlock2.cachedHeight;
                            }
                        }
                        arrayList = arrayList2;
                        i10 = makeMeasureSpec2;
                        i11 = i19;
                        i12 = i20;
                        int i232 = i11 - 1;
                        iArr2[i11] = (i232 >= 0 ? 0 : iArr2[i232]) + iArr[i11];
                        i20 = i12 + iArr[i11];
                        i19 = i11 + 1;
                        makeMeasureSpec2 = i10;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i14 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new ah.a(l4Var, i20, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                g5 g5Var = (g5) this.b;
                if (!g5Var.w) {
                    g5Var.w = true;
                    org.telegram.ui.Components.hm0.d(new f5(g5Var, i14));
                    break;
                }
                break;
            case 13:
                f6 f6Var = (f6) this.b;
                f6Var.d.clear();
                f6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(f6Var.e, f6Var.d);
                f6Var.U();
                f6Var.finishFragment();
                break;
            case 14:
                f5 f5Var = (f5) this.b;
                ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                File file = rootDirs.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    int size2 = rootDirs.size();
                    while (i14 < size2) {
                        File file2 = rootDirs.get(i14);
                        if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i14++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), f5Var));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                d7.h0 = false;
                long q02 = d7.q0(5, FileLoader.checkDirectory(4));
                long q03 = d7.q0(4, FileLoader.checkDirectory(4));
                long q04 = d7.q0(0, FileLoader.checkDirectory(100)) + d7.q0(0, FileLoader.checkDirectory(0));
                long q05 = d7.q0(0, FileLoader.checkDirectory(101)) + d7.q0(0, FileLoader.checkDirectory(2));
                long q06 = d7.q0(1, FileLoader.checkDirectory(5)) + d7.q0(1, FileLoader.checkDirectory(3));
                long q07 = d7.q0(2, FileLoader.checkDirectory(5)) + d7.q0(2, FileLoader.checkDirectory(3));
                long q08 = d7.q0(3, FileLoader.checkDirectory(4)) + d7.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                long q09 = d7.q0(0, FileLoader.checkDirectory(1));
                long q010 = d7.q0(0, FileLoader.checkDirectory(6));
                long q011 = d7.q0(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && q011 < 268435456) {
                    q011 = 0;
                }
                long j10 = q02 + q03 + q05 + q09 + q04 + q06 + q07 + q08 + q010 + q011;
                d7.j0 = Long.valueOf(j10);
                d7.i0 = System.currentTimeMillis();
                if (!d7.h0) {
                    AndroidUtilities.runOnUIThread(new k6(j10, 0, callback));
                    break;
                }
                break;
            case 16:
                ((t6) this.b).dismiss();
                break;
            case 17:
                x9 x9Var = (x9) ((b6) this.b).b;
                try {
                    CameraView cameraView = x9Var.c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, x9Var.c.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = x9Var.c;
                if (cameraView2 != null) {
                    x9Var.c0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                ca caVar = (ca) this.b;
                ba baVar = caVar.a;
                if (baVar != null) {
                    baVar.requestFocus();
                    AndroidUtilities.showKeyboard(caVar.a);
                    break;
                }
                break;
            case 19:
                ra raVar = (ra) this.b;
                String str = raVar.r;
                if (str == null || str.length() > 0) {
                    raVar.n = true;
                    raVar.e0(raVar.v.size() <= 0);
                    raVar.n = false;
                    break;
                }
                break;
            case 20:
                kb kbVar = (kb) this.b;
                if (kbVar.W != -1) {
                    kbVar.Y.getNotificationCenter().onAnimationFinish(kbVar.W);
                    kbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                ub ubVar = ((tb) this.b).f;
                ubVar.getNotificationCenter().onAnimationFinish(ubVar.L0);
                break;
            case 22:
                org.telegram.ui.Components.qc.b0((TLRPC.TL_error) this.b);
                break;
            case 23:
                AtomicReference atomicReference = (AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.ActionBar.k) this.b).invalidate();
                break;
            case 25:
                ((org.telegram.ui.Components.p70) this.b).s();
                break;
            case 26:
                ((b0) this.b).run(Boolean.FALSE);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.p1) this.b).dismiss();
                break;
            case 28:
                ((r6) this.b).run(Boolean.FALSE, null);
                break;
            default:
                dg.l0 l0Var = (dg.l0) this.b;
                i13 = ((org.telegram.ui.ActionBar.p2) ((zn) l0Var.e)).currentAccount;
                NotificationCenter.getInstance(i13).onAnimationFinish(l0Var.b);
                break;
        }
    }
}
