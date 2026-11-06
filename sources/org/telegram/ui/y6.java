package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y6 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static volatile boolean h0 = false;
    public static long i0;
    public static Long j0;
    public static Long k0;
    public static Long l0;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public i6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public te.a S;
    public te.a T;
    public int[] U;
    public float[] V;
    public v6 W;
    public k6 X;
    public q6 Y;
    public wt Z;
    public w6 a;
    public long a0;
    public bi.q1 b;
    public org.telegram.ui.Components.ht0 b0;
    public org.telegram.ui.ActionBar.u1 c;
    public org.telegram.ui.ActionBar.z0 c0;
    public final boolean[] d;
    public ci.c d0;
    public long e;
    public final ArrayList e0;
    public long f;
    public final ArrayList f0;
    public boolean g0;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;
    public long y;

    public y6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f = -1L;
        this.h = -1L;
        this.n = -1L;
        this.r = -1L;
        this.s = -1L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.R = -1;
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
    }

    public static void Z(y6 y6Var, boolean z9, long j3, o6 o6Var) {
        if (z9) {
            org.telegram.messenger.gc.D().j();
        }
        try {
            org.telegram.ui.ActionBar.u1 u1Var = y6Var.c;
            if (u1Var != null) {
                u1Var.dismiss();
                y6Var.c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        y6Var.getMediaDataController().z0.b();
        org.telegram.messenger.g0.i3(new bi.r3(y6Var, j3, 20), 150L);
        org.telegram.messenger.ui.b0(y6Var.currentAccount).u(true);
        org.telegram.messenger.f8 f8Var = y6Var.getFileLoader().d;
        f8Var.d();
        f8Var.a.c(new b6(y6Var, 1));
        o6Var.run();
    }

    public static /* synthetic */ void a0(y6 y6Var, float f10) {
        y6Var.simpleActionBar.setTitlesAlpha(f10);
        y6Var.z0();
        y6Var.fragmentView.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(y6 y6Var, n6 n6Var, o6 o6Var) {
        int i7;
        int i10;
        ?? r12;
        char c10;
        boolean z9;
        ?? r13;
        boolean z10;
        boolean z11;
        File j3;
        int i11;
        char c11;
        bi.f9 f9Var;
        char c12;
        int i12;
        char c13;
        boolean z12 = true;
        int[] iArr = {0};
        boolean[] zArr = y6Var.d;
        ?? r122 = 2;
        int i13 = 3;
        char c14 = 4;
        char c15 = 5;
        int i14 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        hi.d4 d4Var = new hi.d4(n6Var, iArr, i14, 3);
        bi.f9 f9Var2 = new bi.f9(i14, 3, currentTimeMillis, n6Var, iArr);
        long j10 = 0;
        boolean z13 = true;
        int i15 = 0;
        boolean z14 = false;
        while (i15 < 10) {
            if (zArr[i15]) {
                if (i15 == 0) {
                    j10 += y6Var.y;
                    z9 = false;
                    r13 = 0;
                } else {
                    if (i15 == z12) {
                        j10 += y6Var.D;
                        z10 = r122 == true ? 1 : 0;
                    } else if (i15 == r122) {
                        j10 += y6Var.r;
                        z9 = z12;
                        r13 = i13;
                    } else if (i15 == i13) {
                        j10 += y6Var.x;
                        z9 = r122;
                        r13 = i13;
                    } else if (i15 == 4) {
                        j10 += y6Var.s;
                        z10 = z12;
                    } else if (i15 == 5) {
                        j10 += y6Var.w;
                        z9 = false;
                        r13 = 6;
                    } else if (i15 == 6) {
                        j10 += y6Var.F;
                        z9 = false;
                        r13 = 100;
                    } else {
                        i7 = 7;
                        if (i15 == 7) {
                            j10 += y6Var.f;
                            c10 = 5;
                        } else if (i15 == 8) {
                            j10 += y6Var.n;
                            c10 = 4;
                        } else {
                            if (i15 == 9) {
                                j10 += y6Var.E;
                                r12 = z12;
                                i10 = 0;
                            } else {
                                i10 = -1;
                                r12 = 0;
                            }
                            if (i10 != -1) {
                                if (i15 == i7) {
                                    try {
                                        n0(org.telegram.messenger.t0.i().getAbsolutePath(), 0, null, null);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, z12);
                                    }
                                }
                                if (i15 == 9) {
                                    j3 = org.telegram.messenger.g0.P0();
                                    z11 = z12;
                                } else if (i10 == 100) {
                                    z11 = z12;
                                    j3 = new File(org.telegram.messenger.w7.j(4), "acache");
                                } else {
                                    z11 = z12;
                                    j3 = org.telegram.messenger.w7.j(i10);
                                }
                                if (j3 != null) {
                                    n0(j3.getAbsolutePath(), r12, null, d4Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                f9Var2.run();
                                if (i10 == 100) {
                                    File j11 = org.telegram.messenger.w7.j(4);
                                    if (j11 != null) {
                                        n0(j11.getAbsolutePath(), 3, null, d4Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    f9Var2.run();
                                }
                                if (i10 == 0 || i10 == 2) {
                                    File j12 = org.telegram.messenger.w7.j(i10 == 0 ? 100 : 101);
                                    i11 = 101;
                                    if (j12 != null) {
                                        n0(j12.getAbsolutePath(), r12, null, d4Var);
                                    }
                                    c11 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    f9Var2.run();
                                } else {
                                    c11 = 0;
                                    i11 = 101;
                                }
                                if (i10 == 3) {
                                    File j13 = org.telegram.messenger.w7.j(5);
                                    if (j13 != null) {
                                        n0(j13.getAbsolutePath(), r12, null, d4Var);
                                    }
                                    iArr[c11] = iArr[c11] + 1;
                                    f9Var2.run();
                                }
                                if (i15 == 9) {
                                    y6Var.E = s0(org.telegram.messenger.g0.P0(), z11 ? 1 : 0);
                                } else {
                                    boolean z15 = z11;
                                    if (i10 == 4) {
                                        y6Var.f = s0(org.telegram.messenger.w7.j(4), 5);
                                        y6Var.n = s0(org.telegram.messenger.w7.j(4), 4);
                                        z14 = z15 ? 1 : 0;
                                        i12 = 2;
                                        c12 = 5;
                                        c13 = 4;
                                        f9Var = f9Var2;
                                    } else if (i10 == z15) {
                                        y6Var.s = s0(org.telegram.messenger.w7.j(z15 ? 1 : 0), r12);
                                    } else if (i10 == 6) {
                                        y6Var.w = s0(org.telegram.messenger.w7.j(6), r12);
                                    } else {
                                        if (i10 == 3) {
                                            if (r12 == z15) {
                                                f9Var = f9Var2;
                                                long s02 = s0(org.telegram.messenger.w7.j(3), r12);
                                                y6Var.r = s02;
                                                c12 = 5;
                                                y6Var.r = s0(org.telegram.messenger.w7.j(5), r12) + s02;
                                            } else {
                                                f9Var = f9Var2;
                                                c12 = 5;
                                                long s03 = s0(org.telegram.messenger.w7.j(3), r12);
                                                y6Var.x = s03;
                                                y6Var.x = s0(org.telegram.messenger.w7.j(5), r12) + s03;
                                            }
                                            i12 = 2;
                                        } else {
                                            f9Var = f9Var2;
                                            c12 = 5;
                                            if (i10 == 0) {
                                                long s04 = s0(org.telegram.messenger.w7.j(0), r12);
                                                y6Var.y = s04;
                                                y6Var.y = s0(org.telegram.messenger.w7.j(100), r12) + s04;
                                                z14 = true;
                                                i12 = 2;
                                            } else {
                                                i12 = 2;
                                                if (i10 == 2) {
                                                    long s05 = s0(org.telegram.messenger.w7.j(2), r12);
                                                    y6Var.D = s05;
                                                    y6Var.D = s0(org.telegram.messenger.w7.j(i11), r12) + s05;
                                                } else if (i10 == 100) {
                                                    c13 = 4;
                                                    y6Var.F = s0(new File(org.telegram.messenger.w7.j(4), "acache"), r12);
                                                    long s06 = s0(org.telegram.messenger.w7.j(4), 3);
                                                    y6Var.h = s06;
                                                    y6Var.F += s06;
                                                    z14 = true;
                                                }
                                            }
                                        }
                                        c13 = 4;
                                    }
                                }
                            }
                            f9Var = f9Var2;
                            i12 = 2;
                            c12 = 5;
                            c13 = 4;
                        }
                        i10 = 4;
                        r12 = c10;
                        if (i10 != -1) {
                        }
                        f9Var = f9Var2;
                        i12 = 2;
                        c12 = 5;
                        c13 = 4;
                    }
                    z9 = false;
                    r13 = z10;
                }
                i7 = 7;
                r12 = z9;
                i10 = r13;
                if (i10 != -1) {
                }
                f9Var = f9Var2;
                i12 = 2;
                c12 = 5;
                c13 = 4;
            } else {
                c13 = c14;
                c12 = c15;
                z13 = false;
                f9Var = f9Var2;
                i12 = r122 == true ? 1 : 0;
            }
            i15++;
            r122 = i12;
            f9Var2 = f9Var;
            c15 = c12;
            c14 = c13;
            z12 = true;
            i13 = 3;
        }
        long j14 = y6Var.f + y6Var.n + y6Var.E + y6Var.D + y6Var.s + y6Var.y + y6Var.r + y6Var.x + y6Var.F + y6Var.w;
        j0 = Long.valueOf(j14);
        y6Var.G = j14;
        i0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        y6Var.H = statFs.getBlockCountLong() * blockSizeLong;
        y6Var.I = availableBlocksLong * blockSizeLong;
        if (z13) {
            org.telegram.messenger.f8 f8Var = org.telegram.messenger.w7.G(y6Var.currentAccount).d;
            f8Var.f.clear();
            f8Var.h(new org.telegram.messenger.a(f8Var, 8));
        }
        org.telegram.messenger.w7.G(y6Var.currentAccount).i();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.video.n(y6Var, z14, j10, o6Var));
    }

    public static void c0(y6 y6Var, org.telegram.ui.ActionBar.u1 u1Var) {
        org.telegram.messenger.w7.G(y6Var.currentAccount).i();
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(y6 y6Var, boolean z9) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, y6Var.getParentActivity(), null);
        y6Var.c = u1Var;
        u1Var.i0 = false;
        u1Var.r(500L);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(y6Var.currentAccount);
        s12.N1.b();
        s12.J1.b();
        s12.K1.b();
        s12.L1.b();
        s12.M1.b();
        if (z9) {
            org.telegram.messenger.yr messagesStorage = y6Var.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.qq(messagesStorage, 12));
        } else {
            org.telegram.messenger.yr messagesStorage2 = y6Var.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.qq(messagesStorage2, 16));
        }
    }

    public static void i0(y6 y6Var) {
        String G;
        boolean z9 = false;
        if (y6Var.d0.j.size() <= 0) {
            y6Var.M.f(false);
            return;
        }
        if (y6Var.M != null) {
            if (y6Var.d0.l.isEmpty()) {
                G = org.telegram.messenger.hd.G(y6Var.d0.j.size(), "Files", Integer.valueOf(y6Var.d0.j.size()));
            } else {
                ArrayList arrayList = y6Var.d0.b;
                int size = arrayList.size();
                int i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s6 s6Var = (s6) obj;
                    if (y6Var.d0.l.contains(Long.valueOf(s6Var.a))) {
                        i7 += s6Var.b;
                    }
                }
                int size2 = y6Var.d0.j.size() - i7;
                G = size2 > 0 ? a8.p0.D(org.telegram.messenger.hd.G(y6Var.d0.l.size(), "Chats", Integer.valueOf(y6Var.d0.l.size())), ", ", org.telegram.messenger.hd.G(size2, "Files", Integer.valueOf(size2))) : org.telegram.messenger.hd.G(y6Var.d0.l.size(), "Chats", Integer.valueOf(y6Var.d0.l.size()));
            }
            String i02 = org.telegram.messenger.g0.i0(y6Var.d0.k, false, false);
            org.telegram.ui.ActionBar.y4 y4Var = y6Var.simpleActionBar;
            boolean z10 = org.telegram.messenger.hd.a0;
            y4Var.l();
            y4Var.f.c(i02, !z10 && y4Var.t() && y4Var.G, true);
            org.telegram.ui.ActionBar.y4 y4Var2 = y6Var.simpleActionBar;
            boolean z11 = org.telegram.messenger.hd.a0;
            y4Var2.l();
            if (y4Var2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(y4Var2.getContext(), true, true, true);
                    y4Var2.h = j6Var;
                    j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    y4Var2.h.setTextColor(y4Var2.e0);
                    y4Var2.h.setGravity(19);
                    y4Var2.h.setEllipsizeByGradient(true);
                    y4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.xq.h);
                    y4Var2.addView(y4Var2.h, y4Var2.indexOfChild(y4Var2.b), c8.ha.e(-1, 18, 51));
                    y4Var2.g();
                }
                y6Var.M.f(true);
            }
            org.telegram.ui.Components.j6 j6Var2 = y4Var2.h;
            boolean z12 = (j6Var2 == null || j6Var2.getTag() == null) ? false : true;
            y4Var2.h.c(G, !z11 && y4Var2.t() && y4Var2.G, true);
            y4Var2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            org.telegram.ui.Components.j6 j6Var3 = y4Var2.h;
            if (j6Var3 != null && j6Var3.getTag() != null) {
                z9 = true;
            }
            if (z12 != z9) {
                y4Var2.requestLayout();
            }
            y6Var.M.f(true);
        }
    }

    public static String j0(y6 y6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void k0(y6 y6Var) {
        if (y6Var.d0.j.size() == 0 || y6Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131752098, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752095, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new y5(y6Var, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        y6Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void l0(y6 y6Var, boolean z9) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131748770, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748772, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.k5.q("LocalDatabaseClearText2", null, 2131748771, new Object[]{org.telegram.messenger.g0.i0(y6Var.e, false, false)}, spannableStringBuilder);
        u1Var.T = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752649, null), new ab.y(3, y6Var, z9));
        y6Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void m0(org.telegram.messenger.c20 c20Var) {
        Long l10 = j0;
        if (l10 != null) {
            c20Var.a(l10);
            if (System.currentTimeMillis() - i0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new fq0(c20Var, 15));
    }

    public static void n0(String str, int i7, int[] iArr, org.telegram.messenger.c20 c20Var) {
        File[] listFiles;
        int p02 = p0(i7, str);
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
                if (i7 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z9 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z10 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z11 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z9) {
                        if (i7 == 1) {
                        }
                    }
                    if (!z9) {
                        if (i7 == 2) {
                        }
                    }
                    if (z10) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z10) {
                        if (i7 == 3) {
                        }
                    }
                    if (z11) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z11 && i7 == 4) {
                    }
                }
                if (!file2.isDirectory()) {
                    file2.delete();
                    int i10 = iArr[0] + 1;
                    iArr[0] = i10;
                    if (c20Var != null) {
                        c20Var.a(Float.valueOf(i10 / p02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    n0(a8.p0.D(str, "/", name), i7, iArr, c20Var);
                }
            }
        }
    }

    public static int p0(int i7, String str) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i10 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i7 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z9 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z10 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z11 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z9) {
                        if (i7 == 1) {
                        }
                    }
                    if (!z9) {
                        if (i7 == 2) {
                        }
                    }
                    if (z10) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z10) {
                        if (i7 == 3) {
                        }
                    }
                    if (z11) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z11 && i7 == 4) {
                    }
                }
                i10 = file2.isDirectory() ? i10 + p0(i7, str + "/" + name) : i10 + 1;
            }
        }
        return i10;
    }

    public static void r0(a5 a5Var) {
        Long l10;
        Long l11 = k0;
        if (l11 == null || (l10 = l0) == null) {
            Utilities.f.c(new fq0(a5Var, 14));
        } else {
            a5Var.a(l11, l10);
        }
    }

    public static long s0(File file, int i7) {
        if (file != null && !h0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i7, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean u0(int i7, String str) {
        if (str == null || org.telegram.messenger.w7.j(i7) == null) {
            return false;
        }
        return str.contains(org.telegram.messenger.w7.j(i7).getAbsolutePath());
    }

    public final void A0(boolean z9) {
        long j3;
        boolean z10;
        float[] fArr;
        ci.c cVar;
        org.telegram.ui.Components.ht0 ht0Var = this.b0;
        boolean z11 = ht0Var != null && ht0Var.e0;
        boolean z12 = (!z9 || System.currentTimeMillis() - this.a0 >= 80) ? z9 : false;
        ArrayList arrayList = this.e0;
        arrayList.clear();
        ArrayList arrayList2 = this.f0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new u6(9, (String) null));
        arrayList2.add(new u6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            z10 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(u6.b(0, this.y, org.telegram.messenger.hd.M0(2131748762, null), org.telegram.ui.ActionBar.k6.Zj));
            }
            if (this.D > 0) {
                arrayList3.add(u6.b(1, this.D, org.telegram.messenger.hd.M0(2131748758, null), org.telegram.ui.ActionBar.k6.Vj));
            }
            if (this.r > 0) {
                arrayList3.add(u6.b(2, this.r, org.telegram.messenger.hd.M0(2131748767, null), org.telegram.ui.ActionBar.k6.Wj));
            }
            if (this.x > 0) {
                j3 = 0;
                arrayList3.add(u6.b(3, this.x, org.telegram.messenger.hd.M0(2131748764, null), org.telegram.ui.ActionBar.k6.dk));
            } else {
                j3 = 0;
            }
            if (this.s > j3) {
                arrayList3.add(u6.b(4, this.s, org.telegram.messenger.hd.M0(2131748774, null), org.telegram.ui.ActionBar.k6.ak));
            }
            if (this.w > j3) {
                arrayList3.add(u6.b(5, this.w, org.telegram.messenger.hd.M0(2131748759, null), org.telegram.ui.ActionBar.k6.Xj));
            }
            if (this.F > j3) {
                arrayList3.add(u6.b(6, this.F, org.telegram.messenger.hd.M0(2131748760, null), org.telegram.ui.ActionBar.k6.bk));
            }
            if (this.f > j3) {
                arrayList3.add(u6.b(7, this.f, org.telegram.messenger.hd.M0(2131748761, null), org.telegram.ui.ActionBar.k6.ek));
            }
            if (this.n > j3) {
                arrayList3.add(u6.b(8, this.n, org.telegram.messenger.hd.M0(2131748765, null), org.telegram.ui.ActionBar.k6.dk));
            }
            if (this.E > j3) {
                arrayList3.add(u6.b(9, this.E, org.telegram.messenger.hd.M0(2131748766, null), org.telegram.ui.ActionBar.k6.Yj));
            }
            if (arrayList3.isEmpty()) {
                z10 = false;
            } else {
                Collections.sort(arrayList3, new org.telegram.messenger.vj(28));
                ((u6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.V == null) {
                    this.V = new float[11];
                }
                int i7 = 0;
                while (true) {
                    fArr = this.V;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    fArr[i7] = w0(i7);
                    i7++;
                }
                if (this.U == null) {
                    this.U = new int[11];
                }
                org.telegram.messenger.g0.f3(fArr, this.U);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((u6) arrayList3.get(i11)).i = true;
                        j10 += ((u6) arrayList3.get(i11)).g;
                        i10 += this.U[((u6) arrayList3.get(i11)).f];
                    }
                    this.U[10] = i10;
                    arrayList2.add(u6.b(-1, j10, org.telegram.messenger.hd.M0(2131748763, null), org.telegram.ui.ActionBar.k6.Yj));
                    if (!this.L) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z10 = true;
            }
        }
        if (z10) {
            arrayList2.size();
            arrayList2.add(new u6(13, (String) null));
            String M0 = org.telegram.messenger.hd.M0(2131744815, null);
            u6 u6Var = new u6(1);
            u6Var.e = M0;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, org.telegram.messenger.hd.M0(2131753867, null)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String M02 = org.telegram.messenger.hd.M0(2131749057, null);
        u6 u6Var2 = new u6(1);
        u6Var2.e = M02;
        arrayList2.add(u6Var2);
        if (this.H > j3) {
            arrayList2.add(new u6(3, org.telegram.messenger.hd.M0(2131748669, null)));
            arrayList2.add(new u6(14));
            String M03 = org.telegram.messenger.hd.M0(2131748668, null);
            u6 u6Var3 = new u6(1);
            u6Var3.e = M03;
            arrayList2.add(u6Var3);
        }
        this.R = -1;
        if (z10 && (cVar = this.d0) != null && !cVar.h()) {
            this.R = arrayList2.size();
            arrayList2.add(new u6(8, (String) null));
        }
        w6 w6Var = this.a;
        if (w6Var != null) {
            if (z12) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.f();
            }
        }
        i6 i6Var = this.M;
        if (i6Var != null) {
            i6Var.d();
        }
        org.telegram.ui.Components.ht0 ht0Var2 = this.b0;
        if (ht0Var2 != null) {
            if (z11 && this.R != -1) {
                ht0Var2.a();
            }
            org.telegram.ui.Components.ht0 ht0Var3 = this.b0;
            ht0Var3.B();
            ht0Var3.requestLayout();
            ht0Var3.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131744817, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 26));
        this.simpleActionBar.l().c(1, 0, org.telegram.messenger.hd.M0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        int i10 = 3;
        org.telegram.ui.ActionBar.z0 e10 = this.simpleActionBar.o().b(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131752076, null));
        this.c0 = e10;
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        e10.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.c0.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
        this.c0.h(0.12f, i11);
        boolean z9 = org.telegram.messenger.r2.a;
        if (this.c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752076, null));
            this.c0.setText(spannableStringBuilder);
        }
        this.a = new w6(i7, context, this);
        org.telegram.ui.Components.ht0 ht0Var = new org.telegram.ui.Components.ht0(context);
        this.b0 = ht0Var;
        ht0Var.setDebugLoggingEnabled(true);
        this.b0.setCommonInsetsManagedExternally(true);
        this.b0.setGeometry(new g6(this));
        org.telegram.ui.Components.ht0 ht0Var2 = this.b0;
        this.fragmentView = ht0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, ht0Var2, null);
        bi.q1 q1Var = new bi.q1(7, context, this);
        this.b = q1Var;
        q1Var.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        bi.q1 q1Var2 = this.b;
        org.telegram.ui.Components.ht0 ht0Var3 = this.b0;
        ht0Var3.getClass();
        int i12 = 5;
        q1Var2.setLayoutManager(new jg.i0(i12, ht0Var3, objArr3 == true ? 1 : 0));
        this.b0.u(this.b, new y5(this, i10));
        this.b.setAdapter(this.a);
        h6 h6Var = new h6(this);
        h6Var.n(350L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        h6Var.o(xqVar);
        h6Var.C = false;
        h6Var.m = false;
        this.b.setItemAnimator(h6Var);
        this.b.setOnItemClickListener(new y5(this, 4));
        this.b.j(new g3(this, i10));
        View view = new View(context);
        this.O = view;
        ht0Var2.addView(view, c8.ha.e(-1, 0, 48));
        this.S = new te.a(0, new y5(this, i12), xqVar, 380L, false);
        this.T = new te.a(1, new y5(this, objArr2 == true ? 1 : 0), xqVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(ht0Var2, this.b, this.simpleActionBar, this.resourceProvider);
        i6 i6Var = new i6(this, context, this, this.glassEngine, this.b0);
        this.M = i6Var;
        i6Var.D = true;
        FrameLayout frameLayout = i6Var.c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.N = frameLayout;
        fh.g c10 = getBaseSimpleGlass().c.c(this.N, null, false);
        c10.p(c8.g0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.ht0 ht0Var4 = this.b0;
        i6 i6Var2 = this.M;
        org.telegram.ui.Components.p61 viewPager = i6Var2.getViewPager();
        i6 i6Var3 = this.M;
        Objects.requireNonNull(i6Var3);
        ht0Var4.x(i6Var2, viewPager, new w0(i6Var3, 8));
        this.b0.y(this.N);
        this.N.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new g6(this));
        this.M.setCacheModel(this.d0);
        getBaseSimpleGlass().o = new bi.g(i12, this, new z5(objArr == true ? 1 : 0, ht0Var2));
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.simpleActionBar.setBackground(null);
        v0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.L4) {
            try {
                org.telegram.ui.ActionBar.u1 u1Var = this.c;
                if (u1Var != null) {
                    u1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = org.telegram.messenger.yr.a0(this.currentAccount).S();
                if (this.c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752076, null));
                    this.c0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        f6 f6Var = new f6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.vt0.class, org.telegram.ui.Components.hw0.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.hw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hj));
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.hw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ck));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return !this.g0 ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.ht0 ht0Var;
        return this.M == null || motionEvent == null || (ht0Var = this.b0) == null || !ht0Var.c() || this.b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(s6 s6Var, org.telegram.ui.Components.ew0[] ew0VarArr, ci.c cVar) {
        t6 t6Var;
        HashSet hashSet;
        long j3;
        int i7;
        long j10;
        org.telegram.ui.Components.ew0 ew0Var;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        u1Var.i0 = false;
        u1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((ew0VarArr == null || ((ew0Var = ew0VarArr[i10]) != null && ew0Var.c)) && (t6Var = (t6) s6Var.d.get(i10)) != null) {
                hashSet2.addAll(t6Var.b);
                hashSet = hashSet2;
                long j12 = s6Var.c;
                long j13 = t6Var.a;
                s6Var.c = j12 - j13;
                this.G -= j13;
                this.I += j13;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.y -= t6Var.a;
                } else if (i10 == 1) {
                    this.D -= t6Var.a;
                } else if (i10 == 2) {
                    this.r -= t6Var.a;
                } else if (i10 == 3) {
                    this.x -= t6Var.a;
                } else if (i10 == 4) {
                    this.s -= t6Var.a;
                } else if (i10 == 5) {
                    this.F -= t6Var.a;
                } else {
                    char c10 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < t6Var.b.size()) {
                            ci.b bVar = (ci.b) t6Var.b.get(i11);
                            String absolutePath = ((ci.b) t6Var.b.get(i11)).a.getAbsolutePath();
                            char c11 = u0(6, absolutePath) ? c10 : (u0(0, absolutePath) || u0(100, absolutePath)) ? (char) 0 : (u0(2, absolutePath) || u0(101, absolutePath)) ? (char) 1 : (char) 6;
                            if (c11 == c10) {
                                i7 = i11;
                                j10 = j11;
                                this.w -= bVar.c;
                            } else {
                                i7 = i11;
                                j10 = j11;
                                if (c11 == 0) {
                                    this.y -= bVar.c;
                                } else if (c11 == 1) {
                                    this.D -= bVar.c;
                                } else {
                                    this.f -= bVar.c;
                                }
                            }
                            i11 = i7 + 1;
                            j11 = j10;
                            c10 = 7;
                        }
                    } else {
                        j3 = j11;
                        this.f -= t6Var.a;
                        i10++;
                        hashSet2 = hashSet;
                        j11 = j3;
                    }
                }
            } else {
                hashSet = hashSet2;
            }
            j3 = j11;
            i10++;
            hashSet2 = hashSet;
            j11 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (s6Var.d.size() == 0) {
            this.d0.b.remove(s6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.j.iterator();
            while (it.hasNext()) {
                ci.b bVar2 = (ci.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.G;
                    long j16 = bVar2.c;
                    this.G = j15 - j16;
                    this.I += j16;
                    hashSet4.add(bVar2);
                    s6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.y -= bVar2.c;
                    } else if (i12 == 1) {
                        this.D -= bVar2.c;
                    } else if (i12 == 2) {
                        this.r -= bVar2.c;
                    } else if (i12 == 3) {
                        this.x -= bVar2.c;
                    } else if (i12 == 4) {
                        this.s -= bVar2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ci.b bVar3 = (ci.b) it2.next();
            ci.c cVar2 = this.d0;
            if (cVar2.j.remove(bVar3)) {
                cVar2.k -= bVar3.c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(this).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j14 - this.G, false, false)));
        Q.r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.f8 f8Var = getFileLoader().d;
        f8Var.getClass();
        f8Var.h(new org.telegram.messenger.y4(12, f8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.J.c(new o1(this, arrayList, u1Var, 3));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        ci.c cVar = this.d0;
        if (cVar == null || cVar.j.isEmpty()) {
            return super.onBackPressed(z9);
        }
        if (z9) {
            this.d0.d();
            i6 i6Var = this.M;
            if (i6Var != null) {
                i6Var.f(false);
                this.M.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        h0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.qs.L4);
        this.e = org.telegram.messenger.yr.a0(this.currentAccount).S();
        Utilities.e.c(new b6(this, 2));
        this.a0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.L4);
        try {
            org.telegram.ui.ActionBar.u1 u1Var = this.c;
            if (u1Var != null) {
                u1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        h0 = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        v0(i10, i12);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.c9 c9Var;
        if (i7 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (c9Var = FilesMigrationService.e) == null) {
                return;
            }
            c9Var.I0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.z0 z0Var = this.c0;
            if (z0Var != null) {
                z0Var.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
            }
            wt wtVar = this.Z;
            if (wtVar != null) {
                wtVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
            }
            try {
                org.telegram.ui.ActionBar.z0 z0Var2 = this.c0;
                if (z0Var2 != null) {
                    z0Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        if (f10 > 0.5f && !this.g0) {
            this.g0 = true;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z9, f10);
    }

    public final void q0(File file, int i7, LongSparseArray longSparseArray, ci.c cVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (h0) {
                    break;
                }
                if (file2.isDirectory()) {
                    q0(file2, i7, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.e8 e10 = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i10 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i7;
                    ci.b bVar = new ci.b(file2);
                    long length = file2.length();
                    bVar.c = length;
                    if (e10 != null) {
                        bVar.b = e10.a;
                        bVar.g = e10.b;
                        int i11 = e10.c;
                        bVar.h = i11;
                        if (i11 == 23 && length > 0) {
                            i10 = 7;
                        }
                    }
                    bVar.d = i10;
                    long j3 = bVar.b;
                    if (j3 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j3, null);
                        if (s6Var == null) {
                            s6Var = new s6(bVar.b);
                            longSparseArray.put(bVar.b, s6Var);
                        }
                        s6Var.a(bVar, i10);
                    }
                    if (i10 != 6) {
                        cVar.e(i10).add(bVar);
                    }
                }
            }
        }
    }

    public final boolean t0() {
        int i7;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f0;
            if (i10 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i10);
            if (u6Var.a == 11 && !u6Var.i && (i7 = u6Var.f) >= 0) {
                zArr2[i7] = true;
            }
            i10++;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (!zArr2[i11] && !zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i7, int i10) {
        this.P = i7;
        this.Q = i10;
        bi.q1 q1Var = this.b;
        if (q1Var == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
        int C = org.telegram.messenger.camera.q.C(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
        int C2 = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.B3(q1Var, 0, C, 0, C2);
        q1Var.setPadding(0, (currentActionBarHeight + i7) - C, 0, i10 - C2);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            this.O.setLayoutParams(layoutParams);
            z0();
        }
        if (this.b0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            this.b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            org.telegram.ui.Components.ht0 ht0Var = this.b0;
            ht0Var.B();
            ht0Var.requestLayout();
            ht0Var.invalidate();
        }
    }

    public final long w0(int i7) {
        switch (i7) {
            case 0:
                return this.y;
            case 1:
                return this.D;
            case 2:
                return this.r;
            case 3:
                return this.x;
            case 4:
                return this.s;
            case 5:
                return this.w;
            case 6:
                return this.F;
            case 7:
                return this.f;
            case 8:
                return this.n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void x0(View view) {
        int i7;
        int i10;
        int i11;
        boolean t02 = t0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                u6 u6Var = (u6) arrayList.get(i12);
                if (u6Var.a != 11 || u6Var.i || (i11 = u6Var.f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.p2.D.a();
            if (view != null) {
                org.telegram.messenger.g0.G3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var2 = (u6) arrayList.get(i13);
                if (u6Var2.a == 11 && !u6Var2.i && (i10 = u6Var2.f) >= 0) {
                    zArr2[i10] = true;
                }
            }
            for (int i14 = 0; i14 < length; i14++) {
                if (!zArr2[i14]) {
                    zArr[i14] = !t02;
                }
            }
        } else {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                u6 u6Var3 = (u6) arrayList.get(i15);
                if (u6Var3.a == 11 && u6Var3.i && (i7 = u6Var3.f) >= 0) {
                    zArr[i7] = !t02;
                }
            }
        }
        for (int i16 = 0; i16 < this.b.getChildCount(); i16++) {
            View childAt = this.b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.a == 11) {
                        int i17 = u6Var4.f;
                        if (i17 < 0) {
                            ((org.telegram.ui.Cells.c2) childAt).c(!t02, true);
                        } else {
                            ((org.telegram.ui.Cells.c2) childAt).c(zArr[i17], true);
                        }
                    }
                }
            }
        }
        y0();
    }

    public final void y0() {
        v6 v6Var = this.W;
        boolean z9 = false;
        if (v6Var != null) {
            boolean z10 = this.K;
            if (!z10 && this.G > 0) {
                org.telegram.ui.Components.mc[] mcVarArr = new org.telegram.ui.Components.mc[11];
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f0;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i7);
                    if (u6Var.a == 11) {
                        int i10 = u6Var.f;
                        boolean[] zArr = this.d;
                        if (i10 >= 0) {
                            long j3 = u6Var.g;
                            boolean z11 = zArr[i10];
                            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc();
                            mcVar.c = j3;
                            mcVar.b = z11;
                            mcVarArr[i10] = mcVar;
                        } else if (this.L) {
                            long j10 = u6Var.g;
                            boolean z12 = zArr[10];
                            org.telegram.ui.Components.mc mcVar2 = new org.telegram.ui.Components.mc();
                            mcVar2.c = j10;
                            mcVar2.b = z12;
                            mcVarArr[10] = mcVar2;
                        }
                    }
                    i7++;
                }
                if (System.currentTimeMillis() - this.a0 < 80) {
                    this.W.n.e(true, 0.0f);
                }
                this.W.f(this.G, true, mcVarArr);
            } else if (z10) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.mc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.mc[0]);
            }
        }
        q6 q6Var = this.Y;
        if (q6Var == null || this.K) {
            return;
        }
        y6 y6Var = q6Var.d;
        boolean[] zArr2 = y6Var.d;
        long j11 = (zArr2[0] ? y6Var.y : 0L) + (zArr2[1] ? y6Var.D : 0L) + (zArr2[2] ? y6Var.r : 0L) + (zArr2[3] ? y6Var.x : 0L) + (zArr2[4] ? y6Var.s : 0L) + (zArr2[5] ? y6Var.w : 0L) + (zArr2[6] ? y6Var.F : 0L) + (zArr2[7] ? y6Var.f : 0L) + (zArr2[8] ? y6Var.n : 0L) + (zArr2[9] ? y6Var.E : 0L);
        ArrayList arrayList2 = y6Var.f0;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList2.size()) {
                z9 = true;
                break;
            }
            u6 u6Var2 = (u6) arrayList2.get(i11);
            if (u6Var2.a == 11) {
                int i12 = u6Var2.f;
                if (i12 < 0) {
                    i12 = zArr2.length - 1;
                }
                if (!zArr2[i12]) {
                    break;
                }
            }
            i11++;
        }
        q6Var.a(j11, z9);
    }

    public final void z0() {
        View view = this.O;
        if (view == null) {
            return;
        }
        te.a aVar = this.S;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.T;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }
}
