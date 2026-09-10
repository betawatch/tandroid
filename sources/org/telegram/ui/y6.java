package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y6 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean k0 = false;
    public static long l0;
    public static Long m0;
    public static Long n0;
    public static Long o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public v6 N;
    public int[] O;
    public float[] P;
    public u6 Q;
    public k6 R;
    public p6 S;
    public lv T;
    public long U;
    public h6 V;
    public org.telegram.ui.ActionBar.g1 W;
    public org.telegram.ui.ActionBar.g1 X;
    public yh.b Y;
    public final ArrayList Z;
    public w6 a;
    public final ArrayList a0;
    public bi.y1 b;
    public boolean b0;
    public s4.c0 c;
    public org.telegram.ui.ActionBar.z c0;
    public org.telegram.ui.ActionBar.d2 d;
    public org.telegram.ui.Components.o6 d0;
    public final boolean[] e;
    public org.telegram.ui.Components.o6 e0;
    public long f;
    public TextView f0;
    public ValueAnimator g0;
    public long h;
    public float h0;
    public boolean i0;
    public float j0;
    public long n;
    public long r;
    public long s;
    public long v;
    public long w;
    public long x;
    public long y;

    public y6() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f = -1L;
        this.h = -1L;
        this.n = -1L;
        this.r = -1L;
        this.s = -1L;
        this.v = -1L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.j0 = 1.0f;
    }

    public static void U(y6 y6Var, boolean z10, long j3, n6 n6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.d2 d2Var = y6Var.d;
            if (d2Var != null) {
                d2Var.dismiss();
                y6Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        y6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bi.va(y6Var, j3, 14), 150L);
        MediaDataController.getInstance(y6Var.currentAccount).checkAllMedia(true);
        y6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new d6(y6Var, 1));
        n6Var.run();
    }

    public static void V(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(y6Var.getParentActivity(), 3, null);
        y6Var.d = d2Var;
        d2Var.g0 = false;
        d2Var.q(500L);
        MessagesController.getInstance(y6Var.currentAccount).clearQueryTime();
        if (z10) {
            y6Var.getMessagesStorage().fullReset();
        } else {
            y6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(y6 y6Var, m6 m6Var, n6 n6Var) {
        int i10;
        org.telegram.messenger.p7 p7Var;
        int i11;
        char c10;
        int i12 = 1;
        int[] iArr = {0};
        boolean[] zArr = y6Var.e;
        int i13 = 2;
        int i14 = 3;
        int i15 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        di.v4 v4Var = new di.v4(m6Var, iArr, i15, 2);
        org.telegram.messenger.p7 p7Var2 = new org.telegram.messenger.p7(m6Var, iArr, i15, currentTimeMillis, 12);
        long j3 = 0;
        int i16 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (i16 < 10) {
            if (zArr[i16]) {
                if (i16 == 0) {
                    j3 += y6Var.y;
                    p7Var = p7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 0;
                } else if (i16 == i12) {
                    j3 += y6Var.E;
                    p7Var = p7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 2;
                } else if (i16 == i13) {
                    j3 += y6Var.s;
                    p7Var = p7Var2;
                    i11 = 9;
                    i13 = 1;
                } else if (i16 == i14) {
                    j3 += y6Var.x;
                    p7Var = p7Var2;
                    i11 = 9;
                } else if (i16 == 4) {
                    j3 += y6Var.v;
                    p7Var = p7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 1;
                } else if (i16 == 5) {
                    j3 += y6Var.w;
                    p7Var = p7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 6;
                } else if (i16 == 6) {
                    j3 += y6Var.G;
                    p7Var = p7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 100;
                } else {
                    i10 = 7;
                    if (i16 == 7) {
                        p7Var = p7Var2;
                        j3 += y6Var.h;
                        i11 = 9;
                        i13 = 5;
                    } else {
                        p7Var = p7Var2;
                        if (i16 == 8) {
                            j3 += y6Var.r;
                            i11 = 9;
                            i13 = 4;
                        } else {
                            i11 = 9;
                            if (i16 == 9) {
                                j3 += y6Var.F;
                                i13 = 1;
                                i14 = 0;
                            } else {
                                i13 = 0;
                                i14 = -1;
                            }
                            if (i14 != -1) {
                                if (i16 == i10) {
                                    try {
                                        k0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                File logsDir = i16 == i11 ? AndroidUtilities.getLogsDir() : i14 == 100 ? new File(FileLoader.checkDirectory(4), "acache") : FileLoader.checkDirectory(i14);
                                if (logsDir != null) {
                                    k0(logsDir.getAbsolutePath(), i13, null, v4Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                p7Var.run();
                                if (i14 == 100) {
                                    File checkDirectory = FileLoader.checkDirectory(4);
                                    if (checkDirectory != null) {
                                        k0(checkDirectory.getAbsolutePath(), 3, null, v4Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    p7Var.run();
                                }
                                if (i14 == 0 || i14 == 2) {
                                    File checkDirectory2 = FileLoader.checkDirectory(i14 == 0 ? 100 : 101);
                                    if (checkDirectory2 != null) {
                                        k0(checkDirectory2.getAbsolutePath(), i13, null, v4Var);
                                    }
                                    c10 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    p7Var.run();
                                } else {
                                    c10 = 0;
                                }
                                if (i14 == 3) {
                                    File checkDirectory3 = FileLoader.checkDirectory(5);
                                    if (checkDirectory3 != null) {
                                        k0(checkDirectory3.getAbsolutePath(), i13, null, v4Var);
                                    }
                                    iArr[c10] = iArr[c10] + 1;
                                    p7Var.run();
                                }
                                if (i16 == i11) {
                                    y6Var.F = q0(1, AndroidUtilities.getLogsDir());
                                } else if (i14 == 4) {
                                    y6Var.h = q0(5, FileLoader.checkDirectory(4));
                                    y6Var.r = q0(4, FileLoader.checkDirectory(4));
                                    z10 = true;
                                } else if (i14 == 1) {
                                    y6Var.v = q0(i13, FileLoader.checkDirectory(1));
                                } else if (i14 == 6) {
                                    y6Var.w = q0(i13, FileLoader.checkDirectory(6));
                                } else {
                                    if (i14 == 3) {
                                        if (i13 == 1) {
                                            long q02 = q0(i13, FileLoader.checkDirectory(3));
                                            y6Var.s = q02;
                                            y6Var.s = q0(i13, FileLoader.checkDirectory(5)) + q02;
                                        } else {
                                            long q03 = q0(i13, FileLoader.checkDirectory(3));
                                            y6Var.x = q03;
                                            y6Var.x = q0(i13, FileLoader.checkDirectory(5)) + q03;
                                        }
                                    } else if (i14 == 0) {
                                        long q04 = q0(i13, FileLoader.checkDirectory(0));
                                        y6Var.y = q04;
                                        y6Var.y = q0(i13, FileLoader.checkDirectory(100)) + q04;
                                        z10 = true;
                                    } else if (i14 == 2) {
                                        long q05 = q0(i13, FileLoader.checkDirectory(2));
                                        y6Var.E = q05;
                                        y6Var.E = q0(i13, FileLoader.checkDirectory(101)) + q05;
                                    } else if (i14 == 100) {
                                        y6Var.G = q0(i13, new File(FileLoader.checkDirectory(4), "acache"));
                                        long q06 = q0(3, FileLoader.checkDirectory(4));
                                        y6Var.n = q06;
                                        y6Var.G += q06;
                                        z10 = true;
                                        i16++;
                                        p7Var2 = p7Var;
                                        i12 = 1;
                                        i13 = 2;
                                        i14 = 3;
                                    }
                                    i16++;
                                    p7Var2 = p7Var;
                                    i12 = 1;
                                    i13 = 2;
                                    i14 = 3;
                                }
                            }
                        }
                    }
                    i14 = 4;
                    if (i14 != -1) {
                    }
                }
                i10 = 7;
                if (i14 != -1) {
                }
            } else {
                p7Var = p7Var2;
                z11 = false;
            }
            i16++;
            p7Var2 = p7Var;
            i12 = 1;
            i13 = 2;
            i14 = 3;
        }
        long j10 = y6Var.h + y6Var.r + y6Var.F + y6Var.E + y6Var.v + y6Var.y + y6Var.s + y6Var.x + y6Var.G + y6Var.w;
        m0 = Long.valueOf(j10);
        y6Var.H = j10;
        l0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        y6Var.I = statFs.getBlockCountLong() * blockSizeLong;
        y6Var.J = availableBlocksLong * blockSizeLong;
        if (z11) {
            FileLoader.getInstance(y6Var.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(y6Var.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.a9(y6Var, z10, j3, n6Var, 8));
    }

    public static void X(y6 y6Var, ValueAnimator valueAnimator) {
        y6Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), (int) (y6Var.h0 * 255.0f)));
        y6Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), (int) (y6Var.h0 * 255.0f)));
        y6Var.fragmentView.invalidate();
    }

    public static /* synthetic */ void Y(y6 y6Var, org.telegram.ui.ActionBar.d2 d2Var) {
        FileLoader.getInstance(y6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void b0(y6 y6Var, boolean z10) {
        if (z10 != y6Var.i0) {
            ValueAnimator valueAnimator = y6Var.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = y6Var.h0;
            y6Var.i0 = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            y6Var.g0 = ofFloat;
            ofFloat.addUpdateListener(new d3(y6Var, 2));
            y6Var.g0.setInterpolator(org.telegram.ui.Components.wr.h);
            y6Var.g0.setDuration(380L);
            y6Var.g0.start();
        }
    }

    public static String c0(y6 y6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(y6Var.f))));
        d2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new gg.d0(3, y6Var, z10));
        y6Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public static void g0(y6 y6Var) {
        String formatPluralString;
        if (y6Var.Y.j.size() <= 0) {
            y6Var.N.e(false);
            return;
        }
        if (y6Var.N != null) {
            if (y6Var.Y.l.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Files", y6Var.Y.j.size(), Integer.valueOf(y6Var.Y.j.size()));
            } else {
                ArrayList arrayList = y6Var.Y.b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    r6 r6Var = (r6) obj;
                    if (y6Var.Y.l.contains(Long.valueOf(r6Var.a))) {
                        i10 += r6Var.b;
                    }
                }
                int size2 = y6Var.Y.j.size() - i10;
                formatPluralString = size2 > 0 ? a4.a.C(LocaleController.formatPluralString("Chats", y6Var.Y.l.size(), Integer.valueOf(y6Var.Y.l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", y6Var.Y.l.size(), Integer.valueOf(y6Var.Y.l.size()));
            }
            y6Var.d0.c(AndroidUtilities.formatFileSize(y6Var.Y.k), !LocaleController.isRTL, true);
            y6Var.e0.c(formatPluralString, !LocaleController.isRTL, true);
            y6Var.N.e(true);
        }
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new mu0(callback, 15));
    }

    public static void k0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        int n02 = n0(i10, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 2) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i10 == 3) {
                        }
                    }
                    if (z12) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z12 && i10 == 4) {
                    }
                }
                if (!file2.isDirectory()) {
                    file2.delete();
                    int i11 = iArr[0] + 1;
                    iArr[0] = i11;
                    if (callback != null) {
                        callback.run(Float.valueOf(i11 / n02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    k0(a4.a.C(str, "/", name), i10, iArr, callback);
                }
            }
        }
    }

    public static int n0(int i10, String str) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i11 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 2) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i10 == 3) {
                        }
                    }
                    if (z12) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z12 && i10 == 4) {
                    }
                }
                i11 = file2.isDirectory() ? i11 + n0(i10, str + "/" + name) : i11 + 1;
            }
        }
        return i11;
    }

    public static void p0(b5 b5Var) {
        Long l4;
        Long l10 = n0;
        if (l10 == null || (l4 = o0) == null) {
            Utilities.cacheClearQueue.postRunnable(new mu0(b5Var, 14));
        } else {
            b5Var.run(l10, l4);
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !k0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean s0(int i10, String str) {
        if (str == null || FileLoader.checkDirectory(i10) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        int i10 = 1;
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        lVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), false);
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 22));
        this.c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c0.addView(frameLayout, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.d0 = o6Var;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        o6Var.b(0.35f, 350L, wrVar);
        this.d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.d0.setTypeface(AndroidUtilities.bold());
        this.d0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        frameLayout.addView(this.d0, w7.a6.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.e0 = o6Var2;
        o6Var2.b(0.35f, 350L, wrVar);
        this.e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.e0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
        frameLayout.addView(this.e0, w7.a6.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f0.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f0.setTypeface(AndroidUtilities.bold());
        this.f0.setGravity(17);
        this.f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f0, w7.a6.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f0, w7.a6.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e;
        int i12 = org.telegram.ui.ActionBar.j6.p7;
        e.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.W;
        int i13 = org.telegram.ui.ActionBar.j6.q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        int i14 = 4;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.a = new w6(this, context);
        h6 h6Var = new h6(this, context);
        this.V = h6Var;
        this.fragmentView = h6Var;
        h6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        bi.y1 y1Var = new bi.y1(this, context, i14);
        this.b = y1Var;
        y1Var.o1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setPadding(0, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.b.setClipToPadding(false);
        bi.y1 y1Var2 = this.b;
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        y1Var2.setLayoutManager(c0Var);
        h6Var.addView(this.b, w7.a6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        i6Var.o(wrVar);
        i6Var.C = false;
        i6Var.m = false;
        this.b.setItemAnimator(i6Var);
        this.b.setOnItemClickListener(new c6(this));
        this.b.j(new bi.eb(this, i10));
        h6Var.addView(this.actionBar, w7.a6.c(-2.0f, -1));
        this.V.setTargetListView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.d2 d2Var = this.d;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.a != null) {
                this.f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.W != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.W.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.ew0.class, org.telegram.ui.Components.ry0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.py0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.oj));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return !this.b0 ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        v6 v6Var = this.N;
        if (v6Var == null || motionEvent == null) {
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        v6Var.getHitRect(rect);
        return !rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) || this.N.h.b == 0;
    }

    public final void l0(r6 r6Var, org.telegram.ui.Components.oy0[] oy0VarArr, yh.b bVar) {
        s6 s6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.oy0 oy0Var;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        d2Var.g0 = false;
        d2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((oy0VarArr == null || ((oy0Var = oy0VarArr[i10]) != null && oy0Var.c)) && (s6Var = (s6) r6Var.d.get(i10)) != null) {
                ArrayList arrayList = s6Var.b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = r6Var.c;
                j3 = j10;
                long j12 = s6Var.a;
                r6Var.c = j11 - j12;
                this.H -= j12;
                this.J += j12;
                r6Var.d.delete(i10);
                if (i10 == 0) {
                    this.y -= s6Var.a;
                } else if (i10 == 1) {
                    this.E -= s6Var.a;
                } else if (i10 == 2) {
                    this.s -= s6Var.a;
                } else if (i10 == 3) {
                    this.x -= s6Var.a;
                } else if (i10 == 4) {
                    this.v -= s6Var.a;
                } else if (i10 == 5) {
                    this.G -= s6Var.a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        yh.a aVar = (yh.a) arrayList.get(i11);
                        String absolutePath = ((yh.a) arrayList.get(i11)).a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.w -= aVar.c;
                        } else if (c10 == 0) {
                            this.y -= aVar.c;
                        } else if (c10 == 1) {
                            this.E -= aVar.c;
                        } else {
                            this.h -= aVar.c;
                        }
                    }
                } else {
                    this.h -= s6Var.a;
                }
            } else {
                hashSet = hashSet2;
                j3 = j10;
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (r6Var.d.size() == 0) {
            this.Y.b.remove(r6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.j.iterator();
            while (it.hasNext()) {
                yh.a aVar2 = (yh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.H;
                    long j15 = aVar2.c;
                    this.H = j14 - j15;
                    this.J += j15;
                    hashSet4.add(aVar2);
                    r6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.y -= aVar2.c;
                    } else if (i12 == 1) {
                        this.E -= aVar2.c;
                    } else if (i12 == 2) {
                        this.s -= aVar2.c;
                    } else if (i12 == 3) {
                        this.x -= aVar2.c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            yh.a aVar3 = (yh.a) it2.next();
            yh.b bVar2 = this.Y;
            if (bVar2.j.remove(aVar3)) {
                bVar2.k -= aVar3.c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.pc Q = org.telegram.ui.Components.wc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.H)));
        Q.r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new s1(this, arrayList2, d2Var, 3));
    }

    public final void m0() {
        if (this.Y.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearCache);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearCacheForChats);
        alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new c6(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, yh.b bVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    yh.a aVar = new yh.a(file2);
                    long length = file2.length();
                    aVar.c = length;
                    if (fileDialogId != null) {
                        aVar.b = fileDialogId.dialogId;
                        aVar.g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.b;
                    if (j3 != 0) {
                        r6 r6Var = (r6) longSparseArray.get(j3, null);
                        if (r6Var == null) {
                            r6Var = new r6(aVar.b);
                            longSparseArray.put(aVar.b, r6Var);
                        }
                        r6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        yh.b bVar = this.Y;
        if (bVar == null || bVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.Y.d();
            v6 v6Var = this.N;
            if (v6Var != null) {
                v6Var.e(false);
                this.N.d();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new d6(this, 2));
        this.U = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.d2 d2Var = this.d;
            if (d2Var != null) {
                d2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        k0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                return;
            }
            filesMigrationBottomSheet.migrateOldFolder();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        this.a.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.b0) {
            this.b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            t6 t6Var = (t6) arrayList.get(i11);
            if (t6Var.a == 11 && !t6Var.i && (i10 = t6Var.f) >= 0) {
                zArr2[i10] = true;
            }
            i11++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (!zArr2[i12] && !zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    public final long t0(int i10) {
        switch (i10) {
            case 0:
                return this.y;
            case 1:
                return this.E;
            case 2:
                return this.s;
            case 3:
                return this.x;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.r;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void u0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.e;
        ArrayList arrayList = this.a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                t6 t6Var = (t6) arrayList.get(i13);
                if (t6Var.a != 11 || t6Var.i || (i12 = t6Var.f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                t6 t6Var2 = (t6) arrayList.get(i14);
                if (t6Var2.a == 11 && !t6Var2.i && (i11 = t6Var2.f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !r02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                t6 t6Var3 = (t6) arrayList.get(i16);
                if (t6Var3.a == 11 && t6Var3.i && (i10 = t6Var3.f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.b.getChildCount(); i17++) {
            View childAt = this.b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    t6 t6Var4 = (t6) arrayList.get(R);
                    if (t6Var4.a == 11) {
                        int i18 = t6Var4.f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.z1) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.z1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        u6 u6Var = this.Q;
        boolean z10 = false;
        if (u6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.bd[] bdVarArr = new org.telegram.ui.Components.bd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    t6 t6Var = (t6) arrayList.get(i10);
                    if (t6Var.a == 11) {
                        int i11 = t6Var.f;
                        boolean[] zArr = this.e;
                        if (i11 >= 0) {
                            long j3 = t6Var.g;
                            boolean z12 = zArr[i11];
                            org.telegram.ui.Components.bd bdVar = new org.telegram.ui.Components.bd();
                            bdVar.c = j3;
                            bdVar.b = z12;
                            bdVarArr[i11] = bdVar;
                        } else if (this.M) {
                            long j10 = t6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.bd bdVar2 = new org.telegram.ui.Components.bd();
                            bdVar2.c = j10;
                            bdVar2.b = z13;
                            bdVarArr[10] = bdVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.n.d(0.0f, true);
                }
                this.Q.f(this.H, true, bdVarArr);
            } else if (z11) {
                u6Var.f(-1L, true, new org.telegram.ui.Components.bd[0]);
            } else {
                u6Var.f(0L, true, new org.telegram.ui.Components.bd[0]);
            }
        }
        p6 p6Var = this.S;
        if (p6Var == null || this.L) {
            return;
        }
        y6 y6Var = p6Var.d;
        boolean[] zArr2 = y6Var.e;
        long j11 = (zArr2[0] ? y6Var.y : 0L) + (zArr2[1] ? y6Var.E : 0L) + (zArr2[2] ? y6Var.s : 0L) + (zArr2[3] ? y6Var.x : 0L) + (zArr2[4] ? y6Var.v : 0L) + (zArr2[5] ? y6Var.w : 0L) + (zArr2[6] ? y6Var.G : 0L) + (zArr2[7] ? y6Var.h : 0L) + (zArr2[8] ? y6Var.r : 0L) + (zArr2[9] ? y6Var.F : 0L);
        ArrayList arrayList2 = y6Var.a0;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                z10 = true;
                break;
            }
            t6 t6Var2 = (t6) arrayList2.get(i12);
            if (t6Var2.a == 11) {
                int i13 = t6Var2.f;
                if (i13 < 0) {
                    i13 = zArr2.length - 1;
                }
                if (!zArr2[i13]) {
                    break;
                }
            }
            i12++;
        }
        p6Var.a(j11, z10);
    }

    public final void w0(boolean z10) {
        char c10;
        long j3;
        boolean z11;
        float[] fArr;
        yh.b bVar;
        boolean z12 = (!z10 || System.currentTimeMillis() - this.U >= 80) ? z10 : false;
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new t6(9, (String) null));
        arrayList2.add(new t6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            z11 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                c10 = '\n';
                arrayList3.add(t6.b(0, this.y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(t6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.s > 0) {
                arrayList3.add(t6.b(2, this.s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.x > 0) {
                arrayList3.add(t6.b(3, this.x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(t6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.w > 0) {
                j3 = 0;
                arrayList3.add(t6.b(5, this.w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j3 = 0;
            }
            if (this.G > j3) {
                arrayList3.add(t6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.h > j3) {
                arrayList3.add(t6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.r > j3) {
                arrayList3.add(t6.b(8, this.r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.F > j3) {
                arrayList3.add(t6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
            } else {
                Collections.sort(arrayList3, new a4.e(21));
                ((t6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.P == null) {
                    this.P = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.P;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = t0(i10);
                    i10++;
                }
                if (this.O == null) {
                    this.O = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.O);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((t6) arrayList3.get(i12)).i = true;
                        j10 += ((t6) arrayList3.get(i12)).g;
                        i11 += this.O[((t6) arrayList3.get(i12)).f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(t6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
                    if (!this.M) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList2.size();
            arrayList2.add(new t6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            t6 t6Var = new t6(1);
            t6Var.e = string;
            arrayList2.add(t6Var);
        }
        arrayList2.add(new t6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new t6(0, 0));
        arrayList2.add(new t6(1, 0));
        arrayList2.add(new t6(2, 0));
        arrayList2.add(new t6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        t6 t6Var2 = new t6(1);
        t6Var2.e = string2;
        arrayList2.add(t6Var2);
        if (this.I > j3) {
            arrayList2.add(new t6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new t6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            t6 t6Var3 = new t6(1);
            t6Var3.e = string3;
            arrayList2.add(t6Var3);
        }
        if (z11 && (bVar = this.Y) != null && !bVar.h()) {
            arrayList2.add(new t6(8, (String) null));
        }
        w6 w6Var = this.a;
        if (w6Var != null) {
            if (z12) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.l();
            }
        }
        v6 v6Var = this.N;
        if (v6Var != null) {
            v6Var.c();
        }
    }
}
