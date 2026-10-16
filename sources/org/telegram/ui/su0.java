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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class su0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ su0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0305  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        di.v vVar;
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
                iv0 iv0Var = (iv0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iv0Var.a.N0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int A = org.telegram.messenger.sk.A(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = iv0Var.a;
                int i15 = A + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i15 != layoutParams.topMargin) {
                    layoutParams.topMargin = i15;
                    photoViewer.N0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) iv0Var.a.O0.getLayoutParams();
                int A2 = org.telegram.messenger.sk.A(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = iv0Var.a;
                int i16 = A2 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i16) {
                    layoutParams2.topMargin = i16;
                    photoViewer2.O0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ah.o) this.b).run();
                break;
            case 3:
                l lVar = (l) this.b;
                lVar.getClass();
                lVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((f1) this.b).a(2, false);
                break;
            case 6:
                k4 k4Var = ((t0) this.b).a;
                k4Var.R0.unlock();
                Runnable runnable = k4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    k4Var.a0 = null;
                    break;
                }
                break;
            case 7:
                v1 v1Var = (v1) ((r1) this.b).b;
                k4 k4Var2 = v1Var.x;
                View view = k4Var2.O;
                if (view != null) {
                    k4Var2.P.addView(view, w7.z5.d(-1.0f, -1));
                    v1Var.x.P.setVisibility(0);
                    break;
                }
                break;
            case 8:
                pf.d.r(((s1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((f2) this.b).requestLayout();
                break;
            case 10:
                x3 x3Var = (x3) this.b;
                x3Var.release();
                x3Var.K.s();
                break;
            case 11:
                i4 i4Var = (i4) this.b;
                ArrayList arrayList2 = new ArrayList(i4Var.d);
                int size = arrayList2.size();
                k4 k4Var3 = i4Var.L;
                int i17 = size + (k4Var3.K == null ? 0 : 1);
                int[] iArr = new int[i17];
                int[] iArr2 = new int[i17];
                o3 o3Var = k4Var3.u0[0];
                if (o3Var != null && (vVar = o3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i17) {
                        boolean z10 = i4Var.H;
                        if (z10 && i18 == 0) {
                            iArr[i13] = i13;
                        } else {
                            int i20 = z10 ? i18 - 1 : i18;
                            TL_iv.PageBlock pageBlock2 = (i20 < 0 || i20 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i20);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                s4.b1 d = i4Var.d(vVar, i4.I(pageBlock2));
                                View view2 = d.a;
                                int i21 = i19;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i18;
                                i12 = i21;
                                i4Var.H(d.f, d, pageBlock3, i20, arrayList2.size(), true);
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
                    AndroidUtilities.runOnUIThread(new ah.o(i4Var, i19, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                g5 g5Var = (g5) this.b;
                if (!g5Var.w) {
                    g5Var.w = true;
                    org.telegram.ui.Components.cn0.d(new f5(g5Var, i13));
                    break;
                }
                break;
            case 13:
                e6 e6Var = (e6) this.b;
                e6Var.d.clear();
                e6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var.e, e6Var.d);
                e6Var.U();
                e6Var.finishFragment();
                break;
            case 14:
                f5 f5Var = (f5) this.b;
                ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                File file = rootDirs.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    int size2 = rootDirs.size();
                    while (i13 < size2) {
                        File file2 = rootDirs.get(i13);
                        if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i13++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.n0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), f5Var));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                d7.k0 = false;
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
                d7.m0 = Long.valueOf(j10);
                d7.l0 = System.currentTimeMillis();
                if (!d7.k0) {
                    AndroidUtilities.runOnUIThread(new j6(j10, 0, callback));
                    break;
                }
                break;
            case 16:
                ((s6) this.b).dismiss();
                break;
            case 17:
                z9 z9Var = (z9) ((a6) this.b).b;
                try {
                    CameraView cameraView = z9Var.c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, z9Var.c.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = z9Var.c;
                if (cameraView2 != null) {
                    z9Var.c0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                ea eaVar = (ea) this.b;
                da daVar = eaVar.a;
                if (daVar != null) {
                    daVar.requestFocus();
                    AndroidUtilities.showKeyboard(eaVar.a);
                    break;
                }
                break;
            case 19:
                va vaVar = (va) this.b;
                String str = vaVar.r;
                if (str == null || str.length() > 0) {
                    vaVar.n = true;
                    vaVar.e0(vaVar.v.size() <= 0);
                    vaVar.n = false;
                    break;
                }
                break;
            case 20:
                qb qbVar = (qb) this.b;
                if (qbVar.W != -1) {
                    qbVar.Y.getNotificationCenter().onAnimationFinish(qbVar.W);
                    qbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                ac acVar = ((zb) this.b).f;
                acVar.getNotificationCenter().onAnimationFinish(acVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.zc.d0((TLRPC.TL_error) this.b);
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
                ((org.telegram.ui.Components.l80) this.b).s();
                break;
            case 27:
                ((z) this.b).run(Boolean.FALSE);
                break;
            case 28:
                ((org.telegram.ui.ActionBar.m1) this.b).dismiss();
                break;
            default:
                ((q6) this.b).run(Boolean.FALSE, null);
                break;
        }
    }
}
