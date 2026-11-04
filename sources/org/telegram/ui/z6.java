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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z6 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public k6 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public qe.a T;
    public qe.a U;
    public int[] V;
    public float[] W;
    public w6 X;
    public m6 Y;
    public r6 Z;
    public x6 a;
    public ut a0;
    public ci.j1 b;
    public long b0;
    public org.telegram.ui.ActionBar.s1 c;
    public org.telegram.ui.Components.gt0 c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.y0 d0;
    public long e;
    public di.c e0;
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

    public z6() {
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

    public static void Z(z6 z6Var, boolean z10, long j10, p6 p6Var) {
        if (z10) {
            org.telegram.messenger.zb.D().j();
        }
        try {
            org.telegram.ui.ActionBar.s1 s1Var = z6Var.c;
            if (s1Var != null) {
                s1Var.dismiss();
                z6Var.c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        z6Var.getMediaDataController().A0.b();
        org.telegram.messenger.g0.i3(new ci.e3(z6Var, j10, 20), 150L);
        org.telegram.messenger.li.b0(z6Var.currentAccount).u(true);
        org.telegram.messenger.f8 f8Var = z6Var.getFileLoader().d;
        f8Var.d();
        f8Var.a.c(new d6(z6Var, 1));
        p6Var.run();
    }

    public static /* synthetic */ void a0(z6 z6Var, float f10) {
        z6Var.simpleActionBar.setTitlesAlpha(f10);
        z6Var.z0();
        z6Var.fragmentView.invalidate();
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
    public static void b0(z6 z6Var, o6 o6Var, p6 p6Var) {
        int i3;
        int i10;
        ?? r12;
        char c2;
        boolean z10;
        ?? r13;
        boolean z11;
        boolean z12;
        File j10;
        int i11;
        char c10;
        ci.f8 f8Var;
        char c11;
        int i12;
        char c12;
        boolean z13 = true;
        int[] iArr = {0};
        boolean[] zArr = z6Var.d;
        ?? r122 = 2;
        int i13 = 3;
        char c13 = 4;
        char c14 = 5;
        int i14 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        ai.g3 g3Var = new ai.g3(o6Var, iArr, i14, 4);
        ci.f8 f8Var2 = new ci.f8(i14, 3, currentTimeMillis, o6Var, iArr);
        long j11 = 0;
        boolean z14 = true;
        int i15 = 0;
        boolean z15 = false;
        while (i15 < 10) {
            if (zArr[i15]) {
                if (i15 == 0) {
                    j11 += z6Var.y;
                    z10 = false;
                    r13 = 0;
                } else {
                    if (i15 == z13) {
                        j11 += z6Var.E;
                        z11 = r122 == true ? 1 : 0;
                    } else if (i15 == r122) {
                        j11 += z6Var.r;
                        z10 = z13;
                        r13 = i13;
                    } else if (i15 == i13) {
                        j11 += z6Var.x;
                        z10 = r122;
                        r13 = i13;
                    } else if (i15 == 4) {
                        j11 += z6Var.s;
                        z11 = z13;
                    } else if (i15 == 5) {
                        j11 += z6Var.w;
                        z10 = false;
                        r13 = 6;
                    } else if (i15 == 6) {
                        j11 += z6Var.G;
                        z10 = false;
                        r13 = 100;
                    } else {
                        i3 = 7;
                        if (i15 == 7) {
                            j11 += z6Var.f;
                            c2 = 5;
                        } else if (i15 == 8) {
                            j11 += z6Var.n;
                            c2 = 4;
                        } else {
                            if (i15 == 9) {
                                j11 += z6Var.F;
                                r12 = z13;
                                i10 = 0;
                            } else {
                                i10 = -1;
                                r12 = 0;
                            }
                            if (i10 != -1) {
                                if (i15 == i3) {
                                    try {
                                        n0(org.telegram.messenger.t0.i().getAbsolutePath(), 0, null, null);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, z13);
                                    }
                                }
                                if (i15 == 9) {
                                    j10 = org.telegram.messenger.g0.P0();
                                    z12 = z13;
                                } else if (i10 == 100) {
                                    z12 = z13;
                                    j10 = new File(org.telegram.messenger.w7.j(4), "acache");
                                } else {
                                    z12 = z13;
                                    j10 = org.telegram.messenger.w7.j(i10);
                                }
                                if (j10 != null) {
                                    n0(j10.getAbsolutePath(), r12, null, g3Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                f8Var2.run();
                                if (i10 == 100) {
                                    File j12 = org.telegram.messenger.w7.j(4);
                                    if (j12 != null) {
                                        n0(j12.getAbsolutePath(), 3, null, g3Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    f8Var2.run();
                                }
                                if (i10 == 0 || i10 == 2) {
                                    File j13 = org.telegram.messenger.w7.j(i10 == 0 ? 100 : 101);
                                    i11 = 101;
                                    if (j13 != null) {
                                        n0(j13.getAbsolutePath(), r12, null, g3Var);
                                    }
                                    c10 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    f8Var2.run();
                                } else {
                                    c10 = 0;
                                    i11 = 101;
                                }
                                if (i10 == 3) {
                                    File j14 = org.telegram.messenger.w7.j(5);
                                    if (j14 != null) {
                                        n0(j14.getAbsolutePath(), r12, null, g3Var);
                                    }
                                    iArr[c10] = iArr[c10] + 1;
                                    f8Var2.run();
                                }
                                if (i15 == 9) {
                                    z6Var.F = s0(org.telegram.messenger.g0.P0(), z12 ? 1 : 0);
                                } else {
                                    boolean z16 = z12;
                                    if (i10 == 4) {
                                        z6Var.f = s0(org.telegram.messenger.w7.j(4), 5);
                                        z6Var.n = s0(org.telegram.messenger.w7.j(4), 4);
                                        z15 = z16 ? 1 : 0;
                                        i12 = 2;
                                        c11 = 5;
                                        c12 = 4;
                                        f8Var = f8Var2;
                                    } else if (i10 == z16) {
                                        z6Var.s = s0(org.telegram.messenger.w7.j(z16 ? 1 : 0), r12);
                                    } else if (i10 == 6) {
                                        z6Var.w = s0(org.telegram.messenger.w7.j(6), r12);
                                    } else {
                                        if (i10 == 3) {
                                            if (r12 == z16) {
                                                f8Var = f8Var2;
                                                long s02 = s0(org.telegram.messenger.w7.j(3), r12);
                                                z6Var.r = s02;
                                                c11 = 5;
                                                z6Var.r = s0(org.telegram.messenger.w7.j(5), r12) + s02;
                                            } else {
                                                f8Var = f8Var2;
                                                c11 = 5;
                                                long s03 = s0(org.telegram.messenger.w7.j(3), r12);
                                                z6Var.x = s03;
                                                z6Var.x = s0(org.telegram.messenger.w7.j(5), r12) + s03;
                                            }
                                            i12 = 2;
                                        } else {
                                            f8Var = f8Var2;
                                            c11 = 5;
                                            if (i10 == 0) {
                                                long s04 = s0(org.telegram.messenger.w7.j(0), r12);
                                                z6Var.y = s04;
                                                z6Var.y = s0(org.telegram.messenger.w7.j(100), r12) + s04;
                                                z15 = true;
                                                i12 = 2;
                                            } else {
                                                i12 = 2;
                                                if (i10 == 2) {
                                                    long s05 = s0(org.telegram.messenger.w7.j(2), r12);
                                                    z6Var.E = s05;
                                                    z6Var.E = s0(org.telegram.messenger.w7.j(i11), r12) + s05;
                                                } else if (i10 == 100) {
                                                    c12 = 4;
                                                    z6Var.G = s0(new File(org.telegram.messenger.w7.j(4), "acache"), r12);
                                                    long s06 = s0(org.telegram.messenger.w7.j(4), 3);
                                                    z6Var.h = s06;
                                                    z6Var.G += s06;
                                                    z15 = true;
                                                }
                                            }
                                        }
                                        c12 = 4;
                                    }
                                }
                            }
                            f8Var = f8Var2;
                            i12 = 2;
                            c11 = 5;
                            c12 = 4;
                        }
                        i10 = 4;
                        r12 = c2;
                        if (i10 != -1) {
                        }
                        f8Var = f8Var2;
                        i12 = 2;
                        c11 = 5;
                        c12 = 4;
                    }
                    z10 = false;
                    r13 = z11;
                }
                i3 = 7;
                r12 = z10;
                i10 = r13;
                if (i10 != -1) {
                }
                f8Var = f8Var2;
                i12 = 2;
                c11 = 5;
                c12 = 4;
            } else {
                c12 = c13;
                c11 = c14;
                z14 = false;
                f8Var = f8Var2;
                i12 = r122 == true ? 1 : 0;
            }
            i15++;
            r122 = i12;
            f8Var2 = f8Var;
            c14 = c11;
            c13 = c12;
            z13 = true;
            i13 = 3;
        }
        long j15 = z6Var.f + z6Var.n + z6Var.F + z6Var.E + z6Var.s + z6Var.y + z6Var.r + z6Var.x + z6Var.G + z6Var.w;
        k0 = Long.valueOf(j15);
        z6Var.H = j15;
        j0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        z6Var.I = statFs.getBlockCountLong() * blockSizeLong;
        z6Var.J = availableBlocksLong * blockSizeLong;
        if (z14) {
            org.telegram.messenger.f8 f8Var3 = org.telegram.messenger.w7.G(z6Var.currentAccount).d;
            f8Var3.f.clear();
            f8Var3.h(new org.telegram.messenger.a(f8Var3, 8));
        }
        org.telegram.messenger.w7.G(z6Var.currentAccount).i();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.video.o(z6Var, z15, j11, p6Var));
    }

    public static void c0(z6 z6Var, org.telegram.ui.ActionBar.s1 s1Var) {
        org.telegram.messenger.w7.G(z6Var.currentAccount).i();
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(z6 z6Var, boolean z10) {
        if (z6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, z6Var.getParentActivity(), null);
        z6Var.c = s1Var;
        s1Var.j0 = false;
        s1Var.r(500L);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(z6Var.currentAccount);
        s12.O1.b();
        s12.K1.b();
        s12.L1.b();
        s12.M1.b();
        s12.N1.b();
        if (z10) {
            org.telegram.messenger.qr messagesStorage = z6Var.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.hq(messagesStorage, 12));
        } else {
            org.telegram.messenger.qr messagesStorage2 = z6Var.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.hq(messagesStorage2, 16));
        }
    }

    public static void i0(z6 z6Var) {
        String G;
        boolean z10 = false;
        if (z6Var.e0.j.size() <= 0) {
            z6Var.N.f(false);
            return;
        }
        if (z6Var.N != null) {
            if (z6Var.e0.l.isEmpty()) {
                G = org.telegram.messenger.bd.G(z6Var.e0.j.size(), "Files", Integer.valueOf(z6Var.e0.j.size()));
            } else {
                ArrayList arrayList = z6Var.e0.b;
                int size = arrayList.size();
                int i3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    t6 t6Var = (t6) obj;
                    if (z6Var.e0.l.contains(Long.valueOf(t6Var.a))) {
                        i3 += t6Var.b;
                    }
                }
                int size2 = z6Var.e0.j.size() - i3;
                G = size2 > 0 ? a1.g.C(org.telegram.messenger.bd.G(z6Var.e0.l.size(), "Chats", Integer.valueOf(z6Var.e0.l.size())), ", ", org.telegram.messenger.bd.G(size2, "Files", Integer.valueOf(size2))) : org.telegram.messenger.bd.G(z6Var.e0.l.size(), "Chats", Integer.valueOf(z6Var.e0.l.size()));
            }
            String i02 = org.telegram.messenger.g0.i0(z6Var.e0.k, false, false);
            org.telegram.ui.ActionBar.y4 y4Var = z6Var.simpleActionBar;
            boolean z11 = org.telegram.messenger.bd.a0;
            y4Var.l();
            y4Var.f.c(i02, !z11 && y4Var.t() && y4Var.H, true);
            org.telegram.ui.ActionBar.y4 y4Var2 = z6Var.simpleActionBar;
            boolean z12 = org.telegram.messenger.bd.a0;
            y4Var2.l();
            if (y4Var2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(y4Var2.getContext(), true, true, true);
                    y4Var2.h = h6Var;
                    h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    y4Var2.h.setTextColor(y4Var2.f0);
                    y4Var2.h.setGravity(19);
                    y4Var2.h.setEllipsizeByGradient(true);
                    y4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.xq.h);
                    y4Var2.addView(y4Var2.h, y4Var2.indexOfChild(y4Var2.b), b8.mf.e(-1, 18, 51));
                    y4Var2.g();
                }
                z6Var.N.f(true);
            }
            org.telegram.ui.Components.h6 h6Var2 = y4Var2.h;
            boolean z13 = (h6Var2 == null || h6Var2.getTag() == null) ? false : true;
            y4Var2.h.c(G, !z12 && y4Var2.t() && y4Var2.H, true);
            y4Var2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            org.telegram.ui.Components.h6 h6Var3 = y4Var2.h;
            if (h6Var3 != null && h6Var3.getTag() != null) {
                z10 = true;
            }
            if (z13 != z10) {
                y4Var2.requestLayout();
            }
            z6Var.N.f(true);
        }
    }

    public static String j0(z6 z6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void k0(z6 z6Var) {
        if (z6Var.e0.j.size() == 0 || z6Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131752098, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752095, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752101, null), new a6(z6Var, 2));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        z6Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void l0(z6 z6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131748779, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748781, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.k5.q("LocalDatabaseClearText2", null, 2131748780, new Object[]{org.telegram.messenger.g0.i0(z6Var.e, false, false)}, spannableStringBuilder);
        s1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752649, null), new ei.f(5, z6Var, z10));
        z6Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void m0(org.telegram.messenger.u10 u10Var) {
        Long l10 = k0;
        if (l10 != null) {
            u10Var.a(l10);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new xp0(u10Var, 15));
    }

    public static void n0(String str, int i3, int[] iArr, org.telegram.messenger.u10 u10Var) {
        File[] listFiles;
        int p02 = p0(i3, str);
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
                if (i3 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i3 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i3 == 2) {
                        }
                    }
                    if (z11) {
                        if (i3 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i3 == 3) {
                        }
                    }
                    if (z12) {
                        if (i3 == 5) {
                        }
                    }
                    if (!z12 && i3 == 4) {
                    }
                }
                if (!file2.isDirectory()) {
                    file2.delete();
                    int i10 = iArr[0] + 1;
                    iArr[0] = i10;
                    if (u10Var != null) {
                        u10Var.a(Float.valueOf(i10 / p02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    n0(a1.g.C(str, "/", name), i3, iArr, u10Var);
                }
            }
        }
    }

    public static int p0(int i3, String str) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i10 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i3 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i3 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i3 == 2) {
                        }
                    }
                    if (z11) {
                        if (i3 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i3 == 3) {
                        }
                    }
                    if (z12) {
                        if (i3 == 5) {
                        }
                    }
                    if (!z12 && i3 == 4) {
                    }
                }
                i10 = file2.isDirectory() ? i10 + p0(i3, str + "/" + name) : i10 + 1;
            }
        }
        return i10;
    }

    public static void r0(c5 c5Var) {
        Long l10;
        Long l11 = l0;
        if (l11 == null || (l10 = m0) == null) {
            Utilities.f.c(new xp0(c5Var, 14));
        } else {
            c5Var.a(l11, l10);
        }
    }

    public static long s0(File file, int i3) {
        if (file != null && !i0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i3, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean u0(int i3, String str) {
        if (str == null || org.telegram.messenger.w7.j(i3) == null) {
            return false;
        }
        return str.contains(org.telegram.messenger.w7.j(i3).getAbsolutePath());
    }

    public final void A0(boolean z10) {
        long j10;
        boolean z11;
        float[] fArr;
        di.c cVar;
        org.telegram.ui.Components.gt0 gt0Var = this.c0;
        boolean z12 = gt0Var != null && gt0Var.f0;
        boolean z13 = (!z10 || System.currentTimeMillis() - this.b0 >= 80) ? z10 : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new v6(9, (String) null));
        arrayList2.add(new v6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            z11 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(v6.b(0, this.y, org.telegram.messenger.bd.M0(2131748771, null), org.telegram.ui.ActionBar.k6.Zj));
            }
            if (this.E > 0) {
                arrayList3.add(v6.b(1, this.E, org.telegram.messenger.bd.M0(2131748767, null), org.telegram.ui.ActionBar.k6.Vj));
            }
            if (this.r > 0) {
                arrayList3.add(v6.b(2, this.r, org.telegram.messenger.bd.M0(2131748776, null), org.telegram.ui.ActionBar.k6.Wj));
            }
            if (this.x > 0) {
                j10 = 0;
                arrayList3.add(v6.b(3, this.x, org.telegram.messenger.bd.M0(2131748773, null), org.telegram.ui.ActionBar.k6.dk));
            } else {
                j10 = 0;
            }
            if (this.s > j10) {
                arrayList3.add(v6.b(4, this.s, org.telegram.messenger.bd.M0(2131748783, null), org.telegram.ui.ActionBar.k6.ak));
            }
            if (this.w > j10) {
                arrayList3.add(v6.b(5, this.w, org.telegram.messenger.bd.M0(2131748768, null), org.telegram.ui.ActionBar.k6.Xj));
            }
            if (this.G > j10) {
                arrayList3.add(v6.b(6, this.G, org.telegram.messenger.bd.M0(2131748769, null), org.telegram.ui.ActionBar.k6.bk));
            }
            if (this.f > j10) {
                arrayList3.add(v6.b(7, this.f, org.telegram.messenger.bd.M0(2131748770, null), org.telegram.ui.ActionBar.k6.ek));
            }
            if (this.n > j10) {
                arrayList3.add(v6.b(8, this.n, org.telegram.messenger.bd.M0(2131748774, null), org.telegram.ui.ActionBar.k6.dk));
            }
            if (this.F > j10) {
                arrayList3.add(v6.b(9, this.F, org.telegram.messenger.bd.M0(2131748775, null), org.telegram.ui.ActionBar.k6.Yj));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
            } else {
                Collections.sort(arrayList3, new org.telegram.messenger.tq(18));
                ((v6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.W == null) {
                    this.W = new float[11];
                }
                int i3 = 0;
                while (true) {
                    fArr = this.W;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    fArr[i3] = w0(i3);
                    i3++;
                }
                if (this.V == null) {
                    this.V = new int[11];
                }
                org.telegram.messenger.g0.f3(fArr, this.V);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((v6) arrayList3.get(i11)).i = true;
                        j11 += ((v6) arrayList3.get(i11)).g;
                        i10 += this.V[((v6) arrayList3.get(i11)).f];
                    }
                    this.V[10] = i10;
                    arrayList2.add(v6.b(-1, j11, org.telegram.messenger.bd.M0(2131748772, null), org.telegram.ui.ActionBar.k6.Yj));
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
            arrayList2.add(new v6(13, (String) null));
            String M0 = org.telegram.messenger.bd.M0(2131744824, null);
            v6 v6Var = new v6(1);
            v6Var.e = M0;
            arrayList2.add(v6Var);
        }
        arrayList2.add(new v6(3, org.telegram.messenger.bd.M0(2131753867, null)));
        arrayList2.add(new v6(0, 0));
        arrayList2.add(new v6(1, 0));
        arrayList2.add(new v6(2, 0));
        arrayList2.add(new v6(3, 0));
        String M02 = org.telegram.messenger.bd.M0(2131749066, null);
        v6 v6Var2 = new v6(1);
        v6Var2.e = M02;
        arrayList2.add(v6Var2);
        if (this.I > j10) {
            arrayList2.add(new v6(3, org.telegram.messenger.bd.M0(2131748678, null)));
            arrayList2.add(new v6(14));
            String M03 = org.telegram.messenger.bd.M0(2131748677, null);
            v6 v6Var3 = new v6(1);
            v6Var3.e = M03;
            arrayList2.add(v6Var3);
        }
        this.S = -1;
        if (z11 && (cVar = this.e0) != null && !cVar.h()) {
            this.S = arrayList2.size();
            arrayList2.add(new v6(8, (String) null));
        }
        x6 x6Var = this.a;
        if (x6Var != null) {
            if (z13) {
                x6Var.E(arrayList, arrayList2);
            } else {
                x6Var.f();
            }
        }
        k6 k6Var = this.N;
        if (k6Var != null) {
            k6Var.d();
        }
        org.telegram.ui.Components.gt0 gt0Var2 = this.c0;
        if (gt0Var2 != null) {
            if (z12 && this.S != -1) {
                gt0Var2.a();
            }
            org.telegram.ui.Components.gt0 gt0Var3 = this.c0;
            gt0Var3.B();
            gt0Var3.requestLayout();
            gt0Var3.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131744826, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 27));
        this.simpleActionBar.l().c(1, 0, org.telegram.messenger.bd.M0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        int i10 = 3;
        org.telegram.ui.ActionBar.y0 e10 = this.simpleActionBar.o().b(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131752076, null));
        this.d0 = e10;
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        e10.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.d0.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
        this.d0.h(0.12f, i11);
        boolean z10 = org.telegram.messenger.r2.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131752076, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new x6(i3, context, this);
        org.telegram.ui.Components.gt0 gt0Var = new org.telegram.ui.Components.gt0(context);
        this.c0 = gt0Var;
        gt0Var.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new i6(this));
        org.telegram.ui.Components.gt0 gt0Var2 = this.c0;
        this.fragmentView = gt0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, gt0Var2, null);
        ci.j1 j1Var = new ci.j1(7, context, this);
        this.b = j1Var;
        j1Var.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        ci.j1 j1Var2 = this.b;
        org.telegram.ui.Components.gt0 gt0Var3 = this.c0;
        gt0Var3.getClass();
        int i12 = 5;
        j1Var2.setLayoutManager(new kg.f0(i12, gt0Var3, objArr3 == true ? 1 : 0));
        this.c0.u(this.b, new a6(this, i10));
        this.b.setAdapter(this.a);
        j6 j6Var = new j6(this);
        j6Var.n(350L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        j6Var.o(xqVar);
        j6Var.C = false;
        j6Var.m = false;
        this.b.setItemAnimator(j6Var);
        this.b.setOnItemClickListener(new a6(this, 4));
        this.b.j(new h3(this, i10));
        View view = new View(context);
        this.P = view;
        gt0Var2.addView(view, b8.mf.e(-1, 0, 48));
        this.T = new qe.a(0, new a6(this, i12), xqVar, 380L, false);
        this.U = new qe.a(1, new a6(this, objArr2 == true ? 1 : 0), xqVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(gt0Var2, this.b, this.simpleActionBar, this.resourceProvider);
        k6 k6Var = new k6(this, context, this, this.glassEngine, this.c0);
        this.N = k6Var;
        k6Var.E = true;
        FrameLayout frameLayout = k6Var.c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        gh.g c2 = getBaseSimpleGlass().c.c(this.O, null, false);
        c2.p(b8.cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c2);
        org.telegram.ui.Components.gt0 gt0Var4 = this.c0;
        k6 k6Var2 = this.N;
        org.telegram.ui.Components.n61 viewPager = k6Var2.getViewPager();
        k6 k6Var3 = this.N;
        Objects.requireNonNull(k6Var3);
        gt0Var4.x(k6Var2, viewPager, new x0(k6Var3, 8));
        this.c0.y(this.O);
        this.O.setLayoutParams(b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new i6(this));
        this.N.setCacheModel(this.e0);
        getBaseSimpleGlass().n = new ci.g(i10, this, new b6(objArr == true ? 1 : 0, gt0Var2));
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        v0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.L4) {
            try {
                org.telegram.ui.ActionBar.s1 s1Var = this.c;
                if (s1Var != null) {
                    s1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = org.telegram.messenger.qr.a0(this.currentAccount).S();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131752076, null));
                    this.d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        h6 h6Var = new h6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Components.ut0.class, org.telegram.ui.Components.gw0.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hj));
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.h5));
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.gt0 gt0Var;
        return this.N == null || motionEvent == null || (gt0Var = this.c0) == null || !gt0Var.c() || this.c0.j(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(t6 t6Var, org.telegram.ui.Components.dw0[] dw0VarArr, di.c cVar) {
        u6 u6Var;
        HashSet hashSet;
        long j10;
        int i3;
        long j11;
        org.telegram.ui.Components.dw0 dw0Var;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
        s1Var.j0 = false;
        s1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j12 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((dw0VarArr == null || ((dw0Var = dw0VarArr[i10]) != null && dw0Var.c)) && (u6Var = (u6) t6Var.d.get(i10)) != null) {
                hashSet2.addAll(u6Var.b);
                hashSet = hashSet2;
                long j13 = t6Var.c;
                long j14 = u6Var.a;
                t6Var.c = j13 - j14;
                this.H -= j14;
                this.J += j14;
                t6Var.d.delete(i10);
                if (i10 == 0) {
                    this.y -= u6Var.a;
                } else if (i10 == 1) {
                    this.E -= u6Var.a;
                } else if (i10 == 2) {
                    this.r -= u6Var.a;
                } else if (i10 == 3) {
                    this.x -= u6Var.a;
                } else if (i10 == 4) {
                    this.s -= u6Var.a;
                } else if (i10 == 5) {
                    this.G -= u6Var.a;
                } else {
                    char c2 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < u6Var.b.size()) {
                            di.b bVar = (di.b) u6Var.b.get(i11);
                            String absolutePath = ((di.b) u6Var.b.get(i11)).a.getAbsolutePath();
                            char c10 = u0(6, absolutePath) ? c2 : (u0(0, absolutePath) || u0(100, absolutePath)) ? (char) 0 : (u0(2, absolutePath) || u0(101, absolutePath)) ? (char) 1 : (char) 6;
                            if (c10 == c2) {
                                i3 = i11;
                                j11 = j12;
                                this.w -= bVar.c;
                            } else {
                                i3 = i11;
                                j11 = j12;
                                if (c10 == 0) {
                                    this.y -= bVar.c;
                                } else if (c10 == 1) {
                                    this.E -= bVar.c;
                                } else {
                                    this.f -= bVar.c;
                                }
                            }
                            i11 = i3 + 1;
                            j12 = j11;
                            c2 = 7;
                        }
                    } else {
                        j10 = j12;
                        this.f -= u6Var.a;
                        i10++;
                        hashSet2 = hashSet;
                        j12 = j10;
                    }
                }
            } else {
                hashSet = hashSet2;
            }
            j10 = j12;
            i10++;
            hashSet2 = hashSet;
            j12 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j15 = j12;
        if (t6Var.d.size() == 0) {
            this.e0.b.remove(t6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.j.iterator();
            while (it.hasNext()) {
                di.b bVar2 = (di.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j16 = this.H;
                    long j17 = bVar2.c;
                    this.H = j16 - j17;
                    this.J += j17;
                    hashSet4.add(bVar2);
                    t6Var.b(bVar2);
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
            di.b bVar3 = (di.b) it2.next();
            di.c cVar2 = this.e0;
            if (cVar2.j.remove(bVar3)) {
                cVar2.k -= bVar3.c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(this).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j15 - this.H, false, false)));
        Q.r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.f8 f8Var = getFileLoader().d;
        f8Var.getClass();
        f8Var.h(new org.telegram.messenger.y4(12, f8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.K.c(new p1(this, arrayList, s1Var, 3));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        di.c cVar = this.e0;
        if (cVar == null || cVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.e0.d();
            k6 k6Var = this.N;
            if (k6Var != null) {
                k6Var.f(false);
                this.N.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.hs.L4);
        this.e = org.telegram.messenger.qr.a0(this.currentAccount).S();
        Utilities.e.c(new d6(this, 2));
        this.b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.L4);
        try {
            org.telegram.ui.ActionBar.s1 s1Var = this.c;
            if (s1Var != null) {
                s1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        v0(i10, i12);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i3 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (b9Var = FilesMigrationService.e) == null) {
                return;
            }
            b9Var.I0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.y0 y0Var = this.d0;
            if (y0Var != null) {
                y0Var.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
            }
            ut utVar = this.a0;
            if (utVar != null) {
                utVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
            }
            try {
                org.telegram.ui.ActionBar.y0 y0Var2 = this.d0;
                if (y0Var2 != null) {
                    y0Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.h0) {
            this.h0 = true;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void q0(File file, int i3, LongSparseArray longSparseArray, di.c cVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (i0) {
                    break;
                }
                if (file2.isDirectory()) {
                    q0(file2, i3, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.e8 e10 = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i10 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i3;
                    di.b bVar = new di.b(file2);
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
                    long j10 = bVar.b;
                    if (j10 != 0) {
                        t6 t6Var = (t6) longSparseArray.get(j10, null);
                        if (t6Var == null) {
                            t6Var = new t6(bVar.b);
                            longSparseArray.put(bVar.b, t6Var);
                        }
                        t6Var.a(bVar, i10);
                    }
                    if (i10 != 6) {
                        cVar.e(i10).add(bVar);
                    }
                }
            }
        }
    }

    public final boolean t0() {
        int i3;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i10 >= arrayList.size()) {
                break;
            }
            v6 v6Var = (v6) arrayList.get(i10);
            if (v6Var.a == 11 && !v6Var.i && (i3 = v6Var.f) >= 0) {
                zArr2[i3] = true;
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i3, int i10) {
        this.Q = i3;
        this.R = i10;
        ci.j1 j1Var = this.b;
        if (j1Var == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
        int C = org.telegram.messenger.camera.q.C(48.0f, i3, -org.telegram.messenger.g0.L(8.0f));
        int C2 = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.B3(j1Var, 0, C, 0, C2);
        j1Var.setPadding(0, (currentActionBarHeight + i3) - C, 0, i10 - C2);
        View view = this.P;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
            this.P.setLayoutParams(layoutParams);
            z0();
        }
        if (this.c0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            this.c0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            org.telegram.ui.Components.gt0 gt0Var = this.c0;
            gt0Var.B();
            gt0Var.requestLayout();
            gt0Var.invalidate();
        }
    }

    public final long w0(int i3) {
        switch (i3) {
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
        int i3;
        int i10;
        int i11;
        boolean t02 = t0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                v6 v6Var = (v6) arrayList.get(i12);
                if (v6Var.a != 11 || v6Var.i || (i11 = v6Var.f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.p2.E.a();
            if (view != null) {
                org.telegram.messenger.g0.G3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                v6 v6Var2 = (v6) arrayList.get(i13);
                if (v6Var2.a == 11 && !v6Var2.i && (i10 = v6Var2.f) >= 0) {
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
                v6 v6Var3 = (v6) arrayList.get(i15);
                if (v6Var3.a == 11 && v6Var3.i && (i3 = v6Var3.f) >= 0) {
                    zArr[i3] = !t02;
                }
            }
        }
        for (int i16 = 0; i16 < this.b.getChildCount(); i16++) {
            View childAt = this.b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    v6 v6Var4 = (v6) arrayList.get(R);
                    if (v6Var4.a == 11) {
                        int i17 = v6Var4.f;
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
        w6 w6Var = this.X;
        boolean z10 = false;
        if (w6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.kc[] kcVarArr = new org.telegram.ui.Components.kc[11];
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    v6 v6Var = (v6) arrayList.get(i3);
                    if (v6Var.a == 11) {
                        int i10 = v6Var.f;
                        boolean[] zArr = this.d;
                        if (i10 >= 0) {
                            long j10 = v6Var.g;
                            boolean z12 = zArr[i10];
                            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc();
                            kcVar.c = j10;
                            kcVar.b = z12;
                            kcVarArr[i10] = kcVar;
                        } else if (this.M) {
                            long j11 = v6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.kc kcVar2 = new org.telegram.ui.Components.kc();
                            kcVar2.c = j11;
                            kcVar2.b = z13;
                            kcVarArr[10] = kcVar2;
                        }
                    }
                    i3++;
                }
                if (System.currentTimeMillis() - this.b0 < 80) {
                    this.X.n.e(true, 0.0f);
                }
                this.X.f(this.H, true, kcVarArr);
            } else if (z11) {
                w6Var.f(-1L, true, new org.telegram.ui.Components.kc[0]);
            } else {
                w6Var.f(0L, true, new org.telegram.ui.Components.kc[0]);
            }
        }
        r6 r6Var = this.Z;
        if (r6Var == null || this.L) {
            return;
        }
        z6 z6Var = r6Var.d;
        boolean[] zArr2 = z6Var.d;
        long j12 = (zArr2[0] ? z6Var.y : 0L) + (zArr2[1] ? z6Var.E : 0L) + (zArr2[2] ? z6Var.r : 0L) + (zArr2[3] ? z6Var.x : 0L) + (zArr2[4] ? z6Var.s : 0L) + (zArr2[5] ? z6Var.w : 0L) + (zArr2[6] ? z6Var.G : 0L) + (zArr2[7] ? z6Var.f : 0L) + (zArr2[8] ? z6Var.n : 0L) + (zArr2[9] ? z6Var.F : 0L);
        ArrayList arrayList2 = z6Var.g0;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList2.size()) {
                z10 = true;
                break;
            }
            v6 v6Var2 = (v6) arrayList2.get(i11);
            if (v6Var2.a == 11) {
                int i12 = v6Var2.f;
                if (i12 < 0) {
                    i12 = zArr2.length - 1;
                }
                if (!zArr2[i12]) {
                    break;
                }
            }
            i11++;
        }
        r6Var.a(j12, z10);
    }

    public final void z0() {
        View view = this.P;
        if (view == null) {
            return;
        }
        qe.a aVar = this.T;
        float f10 = aVar == null ? 0.0f : aVar.e;
        qe.a aVar2 = this.U;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }
}
