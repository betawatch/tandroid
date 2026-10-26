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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zt0(Object obj, int i10) {
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
        fi.v vVar;
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
                pu0 pu0Var = (pu0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pu0Var.a.N0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int B = org.telegram.messenger.vh.B(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = pu0Var.a;
                int i15 = B + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i15 != layoutParams.topMargin) {
                    layoutParams.topMargin = i15;
                    photoViewer.N0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pu0Var.a.O0.getLayoutParams();
                int B2 = org.telegram.messenger.vh.B(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = pu0Var.a;
                int i16 = B2 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i16) {
                    layoutParams2.topMargin = i16;
                    photoViewer2.O0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ai.h0) this.b).run();
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
                ((c1) this.b).a(2, false);
                break;
            case 6:
                j4 j4Var = ((r0) this.b).a;
                j4Var.S0.unlock();
                Runnable runnable = j4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.a0 = null;
                    break;
                }
                break;
            case 7:
                s1 s1Var = (s1) ((o1) this.b).b;
                j4 j4Var2 = s1Var.x;
                View view = j4Var2.O;
                if (view != null) {
                    j4Var2.P.addView(view, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                    s1Var.x.P.setVisibility(0);
                    break;
                }
                break;
            case 8:
                qf.d.r(((p1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((c2) this.b).requestLayout();
                break;
            case 10:
                v3 v3Var = (v3) this.b;
                v3Var.release();
                v3Var.K.s();
                break;
            case 11:
                h4 h4Var = (h4) this.b;
                ArrayList arrayList2 = new ArrayList(h4Var.d);
                int size = arrayList2.size();
                j4 j4Var3 = h4Var.L;
                int i17 = size + (j4Var3.K == null ? 0 : 1);
                int[] iArr = new int[i17];
                int[] iArr2 = new int[i17];
                m3 m3Var = j4Var3.u0[0];
                if (m3Var != null && (vVar = m3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i17) {
                        boolean z10 = h4Var.H;
                        if (z10 && i18 == 0) {
                            iArr[i13] = i13;
                        } else {
                            int i20 = z10 ? i18 - 1 : i18;
                            TL_iv.PageBlock pageBlock2 = (i20 < 0 || i20 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i20);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                s4.e1 g7 = h4Var.g(vVar, h4.I(pageBlock2));
                                View view2 = g7.a;
                                int i21 = i19;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i18;
                                i12 = i21;
                                h4Var.H(g7.f, g7, pageBlock3, i20, arrayList2.size(), true);
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
                    AndroidUtilities.runOnUIThread(new g4(h4Var, i19, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                f5 f5Var = (f5) this.b;
                if (!f5Var.w) {
                    f5Var.w = true;
                    org.telegram.ui.Components.hn0.d(new e5(f5Var, i13));
                    break;
                }
                break;
            case 13:
                c6 c6Var = (c6) this.b;
                c6Var.d.clear();
                c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
                c6Var.V();
                c6Var.finishFragment();
                break;
            case 14:
                e5 e5Var = (e5) this.b;
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.q0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), e5Var));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                c7.i0 = false;
                long o02 = c7.o0(5, FileLoader.checkDirectory(4));
                long o03 = c7.o0(4, FileLoader.checkDirectory(4));
                long o04 = c7.o0(0, FileLoader.checkDirectory(100)) + c7.o0(0, FileLoader.checkDirectory(0));
                long o05 = c7.o0(0, FileLoader.checkDirectory(101)) + c7.o0(0, FileLoader.checkDirectory(2));
                long o06 = c7.o0(1, FileLoader.checkDirectory(5)) + c7.o0(1, FileLoader.checkDirectory(3));
                long o07 = c7.o0(2, FileLoader.checkDirectory(5)) + c7.o0(2, FileLoader.checkDirectory(3));
                long o08 = c7.o0(3, FileLoader.checkDirectory(4)) + c7.o0(0, new File(FileLoader.checkDirectory(4), "acache"));
                long o09 = c7.o0(0, FileLoader.checkDirectory(1));
                long o010 = c7.o0(0, FileLoader.checkDirectory(6));
                long o011 = c7.o0(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && o011 < 268435456) {
                    o011 = 0;
                }
                long j10 = o02 + o03 + o05 + o09 + o04 + o06 + o07 + o08 + o010 + o011;
                c7.k0 = Long.valueOf(j10);
                c7.j0 = System.currentTimeMillis();
                if (!c7.i0) {
                    AndroidUtilities.runOnUIThread(new f6(j10, 0, callback));
                    break;
                }
                break;
            case 16:
                ((s6) this.b).dismiss();
                break;
            case 17:
                y9 y9Var = (y9) ((y5) this.b).b;
                try {
                    CameraView cameraView = y9Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, y9Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = y9Var.d;
                if (cameraView2 != null) {
                    y9Var.d0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                da daVar = (da) this.b;
                ca caVar = daVar.a;
                if (caVar != null) {
                    caVar.requestFocus();
                    AndroidUtilities.showKeyboard(daVar.a);
                    break;
                }
                break;
            case 19:
                ta taVar = (ta) this.b;
                String str = taVar.r;
                if (str == null || str.length() > 0) {
                    taVar.n = true;
                    taVar.f0(taVar.v.size() <= 0);
                    taVar.n = false;
                    break;
                }
                break;
            case 20:
                mb mbVar = (mb) this.b;
                if (mbVar.W != -1) {
                    mbVar.Y.getNotificationCenter().onAnimationFinish(mbVar.W);
                    mbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                wb wbVar = ((vb) this.b).h;
                wbVar.getNotificationCenter().onAnimationFinish(wbVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.wc.e0((TLRPC.TL_error) this.b);
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
                ((org.telegram.ui.Components.k80) this.b).s();
                break;
            case 27:
                ((y) this.b).run(Boolean.FALSE);
                break;
            case 28:
                ((org.telegram.ui.ActionBar.o1) this.b).dismiss();
                break;
            default:
                ((q6) this.b).run(Boolean.FALSE, null);
                break;
        }
    }
}
