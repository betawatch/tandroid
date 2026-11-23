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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y6 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public static volatile boolean i0 = false;
    public static long j0;
    public static Long k0;
    public static Long l0;
    public static Long m0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public j6 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public te.a T;
    public te.a U;
    public int[] V;
    public float[] W;
    public v6 X;
    public l6 Y;
    public q6 Z;
    public w6 a;
    public zt a0;
    public di.b1 b;
    public long b0;
    public org.telegram.ui.ActionBar.t1 c;
    public org.telegram.ui.Components.st0 c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.y0 d0;
    public long e;
    public ei.c e0;
    public long f;
    public final ArrayList f0;
    public final ArrayList g0;
    public long h;
    public boolean h0;
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
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.S = -1;
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
    }

    public static void Z(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        if (z10) {
            org.telegram.messenger.ec.D().j();
        }
        try {
            org.telegram.ui.ActionBar.t1 t1Var = y6Var.c;
            if (t1Var != null) {
                t1Var.dismiss();
                y6Var.c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        y6Var.getMediaDataController().A0.b();
        org.telegram.messenger.g0.h3(new bi.e4(y6Var, j3, 21), 150L);
        org.telegram.messenger.ri.d0(y6Var.currentAccount).w(true);
        org.telegram.messenger.e8 e8Var = y6Var.getFileLoader().d;
        e8Var.d();
        e8Var.a.c(new c6(y6Var, 1));
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
        boolean z10;
        ?? r13;
        boolean z11;
        boolean z12;
        File j3;
        int i11;
        char c11;
        bi.w3 w3Var;
        char c12;
        int i12;
        char c13;
        boolean z13 = true;
        int[] iArr = {0};
        boolean[] zArr = y6Var.d;
        ?? r122 = 2;
        int i13 = 3;
        char c14 = 4;
        char c15 = 5;
        int i14 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        bi.j5 j5Var = new bi.j5(n6Var, iArr, i14, 4);
        bi.w3 w3Var2 = new bi.w3(i14, 4, currentTimeMillis, n6Var, iArr);
        long j10 = 0;
        boolean z14 = true;
        int i15 = 0;
        boolean z15 = false;
        while (i15 < 10) {
            if (zArr[i15]) {
                if (i15 == 0) {
                    j10 += y6Var.y;
                    z10 = false;
                    r13 = 0;
                } else {
                    if (i15 == z13) {
                        j10 += y6Var.E;
                        z11 = r122 == true ? 1 : 0;
                    } else if (i15 == r122) {
                        j10 += y6Var.r;
                        z10 = z13;
                        r13 = i13;
                    } else if (i15 == i13) {
                        j10 += y6Var.x;
                        z10 = r122;
                        r13 = i13;
                    } else if (i15 == 4) {
                        j10 += y6Var.s;
                        z11 = z13;
                    } else if (i15 == 5) {
                        j10 += y6Var.w;
                        z10 = false;
                        r13 = 6;
                    } else if (i15 == 6) {
                        j10 += y6Var.G;
                        z10 = false;
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
                                j10 += y6Var.F;
                                r12 = z13;
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
                                        org.telegram.messenger.a8.g(e10, z13);
                                    }
                                }
                                if (i15 == 9) {
                                    j3 = org.telegram.messenger.g0.P0();
                                    z12 = z13;
                                } else if (i10 == 100) {
                                    z12 = z13;
                                    j3 = new File(org.telegram.messenger.w7.j(4), "acache");
                                } else {
                                    z12 = z13;
                                    j3 = org.telegram.messenger.w7.j(i10);
                                }
                                if (j3 != null) {
                                    n0(j3.getAbsolutePath(), r12, null, j5Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                w3Var2.run();
                                if (i10 == 100) {
                                    File j11 = org.telegram.messenger.w7.j(4);
                                    if (j11 != null) {
                                        n0(j11.getAbsolutePath(), 3, null, j5Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    w3Var2.run();
                                }
                                if (i10 == 0 || i10 == 2) {
                                    File j12 = org.telegram.messenger.w7.j(i10 == 0 ? 100 : 101);
                                    i11 = 101;
                                    if (j12 != null) {
                                        n0(j12.getAbsolutePath(), r12, null, j5Var);
                                    }
                                    c11 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    w3Var2.run();
                                } else {
                                    c11 = 0;
                                    i11 = 101;
                                }
                                if (i10 == 3) {
                                    File j13 = org.telegram.messenger.w7.j(5);
                                    if (j13 != null) {
                                        n0(j13.getAbsolutePath(), r12, null, j5Var);
                                    }
                                    iArr[c11] = iArr[c11] + 1;
                                    w3Var2.run();
                                }
                                if (i15 == 9) {
                                    y6Var.F = s0(org.telegram.messenger.g0.P0(), z12 ? 1 : 0);
                                } else {
                                    boolean z16 = z12;
                                    if (i10 == 4) {
                                        y6Var.f = s0(org.telegram.messenger.w7.j(4), 5);
                                        y6Var.n = s0(org.telegram.messenger.w7.j(4), 4);
                                        z15 = z16 ? 1 : 0;
                                        i12 = 2;
                                        c12 = 5;
                                        c13 = 4;
                                        w3Var = w3Var2;
                                    } else if (i10 == z16) {
                                        y6Var.s = s0(org.telegram.messenger.w7.j(z16 ? 1 : 0), r12);
                                    } else if (i10 == 6) {
                                        y6Var.w = s0(org.telegram.messenger.w7.j(6), r12);
                                    } else {
                                        if (i10 == 3) {
                                            if (r12 == z16) {
                                                w3Var = w3Var2;
                                                long s02 = s0(org.telegram.messenger.w7.j(3), r12);
                                                y6Var.r = s02;
                                                c12 = 5;
                                                y6Var.r = s0(org.telegram.messenger.w7.j(5), r12) + s02;
                                            } else {
                                                w3Var = w3Var2;
                                                c12 = 5;
                                                long s03 = s0(org.telegram.messenger.w7.j(3), r12);
                                                y6Var.x = s03;
                                                y6Var.x = s0(org.telegram.messenger.w7.j(5), r12) + s03;
                                            }
                                            i12 = 2;
                                        } else {
                                            w3Var = w3Var2;
                                            c12 = 5;
                                            if (i10 == 0) {
                                                long s04 = s0(org.telegram.messenger.w7.j(0), r12);
                                                y6Var.y = s04;
                                                y6Var.y = s0(org.telegram.messenger.w7.j(100), r12) + s04;
                                                z15 = true;
                                                i12 = 2;
                                            } else {
                                                i12 = 2;
                                                if (i10 == 2) {
                                                    long s05 = s0(org.telegram.messenger.w7.j(2), r12);
                                                    y6Var.E = s05;
                                                    y6Var.E = s0(org.telegram.messenger.w7.j(i11), r12) + s05;
                                                } else if (i10 == 100) {
                                                    c13 = 4;
                                                    y6Var.G = s0(new File(org.telegram.messenger.w7.j(4), "acache"), r12);
                                                    long s06 = s0(org.telegram.messenger.w7.j(4), 3);
                                                    y6Var.h = s06;
                                                    y6Var.G += s06;
                                                    z15 = true;
                                                }
                                            }
                                        }
                                        c13 = 4;
                                    }
                                }
                            }
                            w3Var = w3Var2;
                            i12 = 2;
                            c12 = 5;
                            c13 = 4;
                        }
                        i10 = 4;
                        r12 = c10;
                        if (i10 != -1) {
                        }
                        w3Var = w3Var2;
                        i12 = 2;
                        c12 = 5;
                        c13 = 4;
                    }
                    z10 = false;
                    r13 = z11;
                }
                i7 = 7;
                r12 = z10;
                i10 = r13;
                if (i10 != -1) {
                }
                w3Var = w3Var2;
                i12 = 2;
                c12 = 5;
                c13 = 4;
            } else {
                c13 = c14;
                c12 = c15;
                z14 = false;
                w3Var = w3Var2;
                i12 = r122 == true ? 1 : 0;
            }
            i15++;
            r122 = i12;
            w3Var2 = w3Var;
            c15 = c12;
            c14 = c13;
            z13 = true;
            i13 = 3;
        }
        long j14 = y6Var.f + y6Var.n + y6Var.F + y6Var.E + y6Var.s + y6Var.y + y6Var.r + y6Var.x + y6Var.G + y6Var.w;
        k0 = Long.valueOf(j14);
        y6Var.H = j14;
        j0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        y6Var.I = statFs.getBlockCountLong() * blockSizeLong;
        y6Var.J = availableBlocksLong * blockSizeLong;
        if (z14) {
            org.telegram.messenger.e8 e8Var = org.telegram.messenger.w7.G(y6Var.currentAccount).d;
            e8Var.f.clear();
            e8Var.h(new org.telegram.messenger.a(e8Var, 8));
        }
        org.telegram.messenger.w7.G(y6Var.currentAccount).i();
        org.telegram.messenger.g0.g3(new ai.f2(y6Var, z15, j10, o6Var));
    }

    public static void c0(y6 y6Var, org.telegram.ui.ActionBar.t1 t1Var) {
        org.telegram.messenger.w7.G(y6Var.currentAccount).i();
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, y6Var.getParentActivity(), null);
        y6Var.c = t1Var;
        t1Var.j0 = false;
        t1Var.r(500L);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(y6Var.currentAccount);
        u12.Q1.b();
        u12.M1.b();
        u12.N1.b();
        u12.O1.b();
        u12.P1.b();
        if (z10) {
            org.telegram.messenger.tr messagesStorage = y6Var.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.pq(messagesStorage, 12));
        } else {
            org.telegram.messenger.tr messagesStorage2 = y6Var.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.pq(messagesStorage2, 16));
        }
    }

    public static void i0(y6 y6Var) {
        String G;
        boolean z10 = false;
        if (y6Var.e0.j.size() <= 0) {
            y6Var.N.f(false);
            return;
        }
        if (y6Var.N != null) {
            if (y6Var.e0.l.isEmpty()) {
                G = org.telegram.messenger.gd.G(y6Var.e0.j.size(), "Files", Integer.valueOf(y6Var.e0.j.size()));
            } else {
                ArrayList arrayList = y6Var.e0.b;
                int size = arrayList.size();
                int i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s6 s6Var = (s6) obj;
                    if (y6Var.e0.l.contains(Long.valueOf(s6Var.a))) {
                        i7 += s6Var.b;
                    }
                }
                int size2 = y6Var.e0.j.size() - i7;
                G = size2 > 0 ? a8.p0.E(org.telegram.messenger.gd.G(y6Var.e0.l.size(), "Chats", Integer.valueOf(y6Var.e0.l.size())), ", ", org.telegram.messenger.gd.G(size2, "Files", Integer.valueOf(size2))) : org.telegram.messenger.gd.G(y6Var.e0.l.size(), "Chats", Integer.valueOf(y6Var.e0.l.size()));
            }
            String i02 = org.telegram.messenger.g0.i0(y6Var.e0.k, false, false);
            org.telegram.ui.ActionBar.z4 z4Var = y6Var.simpleActionBar;
            boolean z11 = org.telegram.messenger.gd.a0;
            z4Var.q();
            z4Var.f.c(i02, !z11 && z4Var.y() && z4Var.H, true);
            org.telegram.ui.ActionBar.z4 z4Var2 = y6Var.simpleActionBar;
            boolean z12 = org.telegram.messenger.gd.a0;
            z4Var2.q();
            if (z4Var2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(z4Var2.getContext(), true, true, true);
                    z4Var2.h = n6Var;
                    n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    z4Var2.h.setTextColor(z4Var2.f0);
                    z4Var2.h.setGravity(19);
                    z4Var2.h.setEllipsizeByGradient(true);
                    z4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.kr.h);
                    z4Var2.addView(z4Var2.h, z4Var2.indexOfChild(z4Var2.b), c8.na.e(-1, 18, 51));
                    z4Var2.l();
                }
                y6Var.N.f(true);
            }
            org.telegram.ui.Components.n6 n6Var2 = z4Var2.h;
            boolean z13 = (n6Var2 == null || n6Var2.getTag() == null) ? false : true;
            z4Var2.h.c(G, !z12 && z4Var2.y() && z4Var2.H, true);
            z4Var2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            org.telegram.ui.Components.n6 n6Var3 = z4Var2.h;
            if (n6Var3 != null && n6Var3.getTag() != null) {
                z10 = true;
            }
            if (z13 != z10) {
                z4Var2.requestLayout();
            }
            y6Var.N.f(true);
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
        if (y6Var.e0.j.size() == 0 || y6Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131752086, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752083, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752089, null), new z5(y6Var, 2));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        y6Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }

    public static void l0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131748578, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131748580, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.f3.p("LocalDatabaseClearText2", null, 2131748579, new Object[]{org.telegram.messenger.g0.i0(y6Var.e, false, false)}, spannableStringBuilder);
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752637, null), new ab.z(3, y6Var, z10));
        y6Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }

    public static void m0(org.telegram.messenger.w10 w10Var) {
        Long l10 = k0;
        if (l10 != null) {
            w10Var.a(l10);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new hq0(w10Var, 15));
    }

    public static void n0(String str, int i7, int[] iArr, org.telegram.messenger.w10 w10Var) {
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
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i7 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i7 == 2) {
                        }
                    }
                    if (z11) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i7 == 3) {
                        }
                    }
                    if (z12) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z12 && i7 == 4) {
                    }
                }
                if (!file2.isDirectory()) {
                    file2.delete();
                    int i10 = iArr[0] + 1;
                    iArr[0] = i10;
                    if (w10Var != null) {
                        w10Var.a(Float.valueOf(i10 / p02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    n0(a8.p0.E(str, "/", name), i7, iArr, w10Var);
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
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i7 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i7 == 2) {
                        }
                    }
                    if (z11) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i7 == 3) {
                        }
                    }
                    if (z12) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z12 && i7 == 4) {
                    }
                }
                i10 = file2.isDirectory() ? i10 + p0(i7, str + "/" + name) : i10 + 1;
            }
        }
        return i10;
    }

    public static void r0(a5 a5Var) {
        Long l10;
        Long l11 = l0;
        if (l11 == null || (l10 = m0) == null) {
            Utilities.f.c(new hq0(a5Var, 14));
        } else {
            a5Var.a(l11, l10);
        }
    }

    public static long s0(File file, int i7) {
        if (file != null && !i0) {
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

    public final void A0(boolean z10) {
        long j3;
        boolean z11;
        float[] fArr;
        ei.c cVar;
        org.telegram.ui.Components.st0 st0Var = this.c0;
        boolean z12 = st0Var != null && st0Var.f0;
        boolean z13 = (!z10 || System.currentTimeMillis() - this.b0 >= 80) ? z10 : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new u6(9, (String) null));
        arrayList2.add(new u6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            z11 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(u6.b(0, this.y, org.telegram.messenger.gd.N0(2131748570, null), org.telegram.ui.ActionBar.n6.ck));
            }
            if (this.E > 0) {
                arrayList3.add(u6.b(1, this.E, org.telegram.messenger.gd.N0(2131748566, null), org.telegram.ui.ActionBar.n6.Yj));
            }
            if (this.r > 0) {
                arrayList3.add(u6.b(2, this.r, org.telegram.messenger.gd.N0(2131748575, null), org.telegram.ui.ActionBar.n6.Zj));
            }
            if (this.x > 0) {
                j3 = 0;
                arrayList3.add(u6.b(3, this.x, org.telegram.messenger.gd.N0(2131748572, null), org.telegram.ui.ActionBar.n6.gk));
            } else {
                j3 = 0;
            }
            if (this.s > j3) {
                arrayList3.add(u6.b(4, this.s, org.telegram.messenger.gd.N0(2131748582, null), org.telegram.ui.ActionBar.n6.dk));
            }
            if (this.w > j3) {
                arrayList3.add(u6.b(5, this.w, org.telegram.messenger.gd.N0(2131748567, null), org.telegram.ui.ActionBar.n6.ak));
            }
            if (this.G > j3) {
                arrayList3.add(u6.b(6, this.G, org.telegram.messenger.gd.N0(2131748568, null), org.telegram.ui.ActionBar.n6.ek));
            }
            if (this.f > j3) {
                arrayList3.add(u6.b(7, this.f, org.telegram.messenger.gd.N0(2131748569, null), org.telegram.ui.ActionBar.n6.hk));
            }
            if (this.n > j3) {
                arrayList3.add(u6.b(8, this.n, org.telegram.messenger.gd.N0(2131748573, null), org.telegram.ui.ActionBar.n6.gk));
            }
            if (this.F > j3) {
                arrayList3.add(u6.b(9, this.F, org.telegram.messenger.gd.N0(2131748574, null), org.telegram.ui.ActionBar.n6.bk));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
            } else {
                Collections.sort(arrayList3, new org.telegram.messenger.dl(27));
                ((u6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.W == null) {
                    this.W = new float[11];
                }
                int i7 = 0;
                while (true) {
                    fArr = this.W;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    fArr[i7] = w0(i7);
                    i7++;
                }
                if (this.V == null) {
                    this.V = new int[11];
                }
                org.telegram.messenger.g0.e3(fArr, this.V);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((u6) arrayList3.get(i11)).i = true;
                        j10 += ((u6) arrayList3.get(i11)).g;
                        i10 += this.V[((u6) arrayList3.get(i11)).f];
                    }
                    this.V[10] = i10;
                    arrayList2.add(u6.b(-1, j10, org.telegram.messenger.gd.N0(2131748571, null), org.telegram.ui.ActionBar.n6.bk));
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
            arrayList2.add(new u6(13, (String) null));
            String N0 = org.telegram.messenger.gd.N0(2131744573, null);
            u6 u6Var = new u6(1);
            u6Var.e = N0;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, org.telegram.messenger.gd.N0(2131753864, null)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String N02 = org.telegram.messenger.gd.N0(2131748865, null);
        u6 u6Var2 = new u6(1);
        u6Var2.e = N02;
        arrayList2.add(u6Var2);
        if (this.I > j3) {
            arrayList2.add(new u6(3, org.telegram.messenger.gd.N0(2131748477, null)));
            arrayList2.add(new u6(14));
            String N03 = org.telegram.messenger.gd.N0(2131748476, null);
            u6 u6Var3 = new u6(1);
            u6Var3.e = N03;
            arrayList2.add(u6Var3);
        }
        this.S = -1;
        if (z11 && (cVar = this.e0) != null && !cVar.h()) {
            this.S = arrayList2.size();
            arrayList2.add(new u6(8, (String) null));
        }
        w6 w6Var = this.a;
        if (w6Var != null) {
            if (z13) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.f();
            }
        }
        j6 j6Var = this.N;
        if (j6Var != null) {
            j6Var.d();
        }
        org.telegram.ui.Components.st0 st0Var2 = this.c0;
        if (st0Var2 != null) {
            if (z12 && this.S != -1) {
                st0Var2.a();
            }
            org.telegram.ui.Components.st0 st0Var3 = this.c0;
            st0Var3.B();
            st0Var3.requestLayout();
            st0Var3.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131744575, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 29));
        this.simpleActionBar.q().c(1, 0, org.telegram.messenger.gd.N0(2131752637, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
        int i10 = 3;
        org.telegram.ui.ActionBar.y0 e10 = this.simpleActionBar.t().b(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131752064, null));
        this.d0 = e10;
        int i11 = org.telegram.ui.ActionBar.n6.p7;
        e10.setIconColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        this.d0.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q7, false));
        this.d0.h(0.12f, i11);
        boolean z10 = org.telegram.messenger.s2.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131752064, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new w6(i7, context, this);
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context);
        this.c0 = st0Var;
        st0Var.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new h6(this));
        org.telegram.ui.Components.st0 st0Var2 = this.c0;
        this.fragmentView = st0Var2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, st0Var2, null);
        di.b1 b1Var = new di.b1(7, context, this);
        this.b = b1Var;
        b1Var.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        di.b1 b1Var2 = this.b;
        org.telegram.ui.Components.st0 st0Var3 = this.c0;
        st0Var3.getClass();
        int i12 = 5;
        b1Var2.setLayoutManager(new jg.i0(i12, st0Var3, objArr3 == true ? 1 : 0));
        this.c0.u(this.b, new z5(this, i10));
        this.b.setAdapter(this.a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        i6Var.o(krVar);
        i6Var.C = false;
        i6Var.m = false;
        this.b.setItemAnimator(i6Var);
        this.b.setOnItemClickListener(new z5(this, 4));
        this.b.j(new g3(this, i10));
        View view = new View(context);
        this.P = view;
        st0Var2.addView(view, c8.na.e(-1, 0, 48));
        this.T = new te.a(0, new z5(this, i12), krVar, 380L, false);
        this.U = new te.a(1, new z5(this, objArr2 == true ? 1 : 0), krVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(st0Var2, this.b, this.simpleActionBar, this.resourceProvider);
        j6 j6Var = new j6(this, context, this, this.glassEngine, this.c0);
        this.N = j6Var;
        j6Var.E = true;
        FrameLayout frameLayout = j6Var.c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        fh.g c10 = getBaseSimpleGlass().c.c(this.O, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.st0 st0Var4 = this.c0;
        j6 j6Var2 = this.N;
        org.telegram.ui.Components.k71 viewPager = j6Var2.getViewPager();
        j6 j6Var3 = this.N;
        Objects.requireNonNull(j6Var3);
        st0Var4.x(j6Var2, viewPager, new w0(j6Var3, 8));
        this.c0.y(this.O);
        this.O.setLayoutParams(c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new h6(this));
        this.N.setCacheModel(this.e0);
        getBaseSimpleGlass().o = new di.f(i10, this, new a6(objArr == true ? 1 : 0, st0Var2));
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        v0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O4) {
            try {
                org.telegram.ui.ActionBar.t1 t1Var = this.c;
                if (t1Var != null) {
                    t1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = org.telegram.messenger.tr.a0(this.currentAccount).S();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131752064, null));
                    this.d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.gu0.class, org.telegram.ui.Components.sw0.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Components.sw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Kj));
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Components.sw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ck));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.dk));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ek));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.fk));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.st0 st0Var;
        return this.N == null || motionEvent == null || (st0Var = this.c0) == null || !st0Var.c() || this.c0.j(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(s6 s6Var, org.telegram.ui.Components.pw0[] pw0VarArr, ei.c cVar) {
        t6 t6Var;
        HashSet hashSet;
        long j3;
        int i7;
        long j10;
        org.telegram.ui.Components.pw0 pw0Var;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        t1Var.j0 = false;
        t1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((pw0VarArr == null || ((pw0Var = pw0VarArr[i10]) != null && pw0Var.c)) && (t6Var = (t6) s6Var.d.get(i10)) != null) {
                hashSet2.addAll(t6Var.b);
                hashSet = hashSet2;
                long j12 = s6Var.c;
                long j13 = t6Var.a;
                s6Var.c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.y -= t6Var.a;
                } else if (i10 == 1) {
                    this.E -= t6Var.a;
                } else if (i10 == 2) {
                    this.r -= t6Var.a;
                } else if (i10 == 3) {
                    this.x -= t6Var.a;
                } else if (i10 == 4) {
                    this.s -= t6Var.a;
                } else if (i10 == 5) {
                    this.G -= t6Var.a;
                } else {
                    char c10 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < t6Var.b.size()) {
                            ei.b bVar = (ei.b) t6Var.b.get(i11);
                            String absolutePath = ((ei.b) t6Var.b.get(i11)).a.getAbsolutePath();
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
                                    this.E -= bVar.c;
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
            this.e0.b.remove(s6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.j.iterator();
            while (it.hasNext()) {
                ei.b bVar2 = (ei.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    s6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.y -= bVar2.c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.c;
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
            ei.b bVar3 = (ei.b) it2.next();
            ei.c cVar2 = this.e0;
            if (cVar2.j.remove(bVar3)) {
                cVar2.k -= bVar3.c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.fc Q = org.telegram.ui.Components.kc.b0(this).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.a0(null, null, 2131752633, org.telegram.messenger.g0.i0(j14 - this.H, false, false)));
        Q.r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.e8 e8Var = getFileLoader().d;
        e8Var.getClass();
        e8Var.h(new org.telegram.messenger.z4(12, e8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.K.c(new o1(this, arrayList, t1Var, 3));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        ei.c cVar = this.e0;
        if (cVar == null || cVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.e0.d();
            j6 j6Var = this.N;
            if (j6Var != null) {
                j6Var.f(false);
                this.N.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.ks.O4);
        this.e = org.telegram.messenger.tr.a0(this.currentAccount).S();
        Utilities.e.c(new c6(this, 2));
        this.b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.O4);
        try {
            org.telegram.ui.ActionBar.t1 t1Var = this.c;
            if (t1Var != null) {
                t1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        v0(i10, i12);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i7 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (b9Var = FilesMigrationService.e) == null) {
                return;
            }
            b9Var.J0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.y0 y0Var = this.d0;
            if (y0Var != null) {
                y0Var.setIconColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p7, false));
            }
            zt ztVar = this.a0;
            if (ztVar != null) {
                ztVar.v0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
            }
            try {
                org.telegram.ui.ActionBar.y0 y0Var2 = this.d0;
                if (y0Var2 != null) {
                    y0Var2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.h0) {
            this.h0 = true;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void q0(File file, int i7, LongSparseArray longSparseArray, ei.c cVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (i0) {
                    break;
                }
                if (file2.isDirectory()) {
                    q0(file2, i7, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.d8 e10 = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i10 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i7;
                    ei.b bVar = new ei.b(file2);
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
            ArrayList arrayList = this.g0;
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i7, int i10) {
        this.Q = i7;
        this.R = i10;
        di.b1 b1Var = this.b;
        if (b1Var == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
        int D = org.telegram.messenger.m10.D(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
        int D2 = org.telegram.messenger.m10.D(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.z3(b1Var, 0, D, 0, D2);
        b1Var.setPadding(0, (currentActionBarHeight + i7) - D, 0, i10 - D2);
        View view = this.P;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            this.P.setLayoutParams(layoutParams);
            z0();
        }
        if (this.c0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            this.c0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            org.telegram.ui.Components.st0 st0Var = this.c0;
            st0Var.B();
            st0Var.requestLayout();
            st0Var.invalidate();
        }
    }

    public final long w0(int i7) {
        switch (i7) {
            case 0:
                return this.y;
            case 1:
                return this.E;
            case 2:
                return this.r;
            case 3:
                return this.x;
            case 4:
                return this.s;
            case 5:
                return this.w;
            case 6:
                return this.G;
            case 7:
                return this.f;
            case 8:
                return this.n;
            case 9:
                return this.F;
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
        ArrayList arrayList = this.g0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                u6 u6Var = (u6) arrayList.get(i12);
                if (u6Var.a != 11 || u6Var.i || (i11 = u6Var.f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.q2.E.a();
            if (view != null) {
                org.telegram.messenger.g0.E3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
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
            if (childAt instanceof org.telegram.ui.Cells.d2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.a == 11) {
                        int i17 = u6Var4.f;
                        if (i17 < 0) {
                            ((org.telegram.ui.Cells.d2) childAt).c(!t02, true);
                        } else {
                            ((org.telegram.ui.Cells.d2) childAt).c(zArr[i17], true);
                        }
                    }
                }
            }
        }
        y0();
    }

    public final void y0() {
        v6 v6Var = this.X;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.pc[] pcVarArr = new org.telegram.ui.Components.pc[11];
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i7);
                    if (u6Var.a == 11) {
                        int i10 = u6Var.f;
                        boolean[] zArr = this.d;
                        if (i10 >= 0) {
                            long j3 = u6Var.g;
                            boolean z12 = zArr[i10];
                            org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc();
                            pcVar.c = j3;
                            pcVar.b = z12;
                            pcVarArr[i10] = pcVar;
                        } else if (this.M) {
                            long j10 = u6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.pc pcVar2 = new org.telegram.ui.Components.pc();
                            pcVar2.c = j10;
                            pcVar2.b = z13;
                            pcVarArr[10] = pcVar2;
                        }
                    }
                    i7++;
                }
                if (System.currentTimeMillis() - this.b0 < 80) {
                    this.X.n.e(true, 0.0f);
                }
                this.X.f(this.H, true, pcVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.pc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.pc[0]);
            }
        }
        q6 q6Var = this.Z;
        if (q6Var == null || this.L) {
            return;
        }
        y6 y6Var = q6Var.d;
        boolean[] zArr2 = y6Var.d;
        long j11 = (zArr2[0] ? y6Var.y : 0L) + (zArr2[1] ? y6Var.E : 0L) + (zArr2[2] ? y6Var.r : 0L) + (zArr2[3] ? y6Var.x : 0L) + (zArr2[4] ? y6Var.s : 0L) + (zArr2[5] ? y6Var.w : 0L) + (zArr2[6] ? y6Var.G : 0L) + (zArr2[7] ? y6Var.f : 0L) + (zArr2[8] ? y6Var.n : 0L) + (zArr2[9] ? y6Var.F : 0L);
        ArrayList arrayList2 = y6Var.g0;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList2.size()) {
                z10 = true;
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
        q6Var.a(j11, z10);
    }

    public final void z0() {
        View view = this.P;
        if (view == null) {
            return;
        }
        te.a aVar = this.T;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.U;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }
}
