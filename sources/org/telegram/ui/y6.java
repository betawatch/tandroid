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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y6 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public j6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public fe.b S;
    public fe.b T;
    public int[] U;
    public float[] V;
    public v6 W;
    public l6 X;
    public q6 Y;
    public zu Z;
    public w6 a;
    public long a0;
    public ag.b1 b;
    public org.telegram.ui.Components.ku0 b0;
    public org.telegram.ui.ActionBar.x1 c;
    public org.telegram.ui.ActionBar.b1 c0;
    public final boolean[] d;
    public sh.b d0;
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

    public static void Y(y6 y6Var, boolean z10, long j10, o6 o6Var) {
        if (z10) {
            org.telegram.messenger.hc.D().j();
        }
        try {
            org.telegram.ui.ActionBar.x1 x1Var = y6Var.c;
            if (x1Var != null) {
                x1Var.dismiss();
                y6Var.c = null;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        y6Var.getMediaDataController().z0.b();
        org.telegram.messenger.i0.h3(new bi.e(y6Var, j10, 9), 150L);
        org.telegram.messenger.ui.b0(y6Var.currentAccount).u(true);
        org.telegram.messenger.k8 k8Var = y6Var.getFileLoader().d;
        k8Var.d();
        k8Var.a.c(new b6(y6Var, 1));
        o6Var.run();
    }

    public static /* synthetic */ void Z(y6 y6Var, float f7) {
        y6Var.simpleActionBar.setTitlesAlpha(f7);
        y6Var.y0();
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
    public static void a0(y6 y6Var, n6 n6Var, o6 o6Var) {
        int i10;
        int i11;
        ?? r12;
        char c10;
        boolean z10;
        ?? r13;
        boolean z11;
        boolean z12;
        File j10;
        int i12;
        char c11;
        z zVar;
        char c12;
        int i13;
        char c13;
        boolean z13 = true;
        int[] iArr = {0};
        boolean[] zArr = y6Var.d;
        ?? r122 = 2;
        int i14 = 3;
        char c14 = 4;
        char c15 = 5;
        int i15 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        jg.o2 o2Var = new jg.o2(n6Var, iArr, i15, 2);
        z zVar2 = new z(i15, 1, currentTimeMillis, n6Var, iArr);
        long j11 = 0;
        boolean z14 = true;
        int i16 = 0;
        boolean z15 = false;
        while (i16 < 10) {
            if (zArr[i16]) {
                if (i16 == 0) {
                    j11 += y6Var.y;
                    z10 = false;
                    r13 = 0;
                } else {
                    if (i16 == z13) {
                        j11 += y6Var.D;
                        z11 = r122 == true ? 1 : 0;
                    } else if (i16 == r122) {
                        j11 += y6Var.r;
                        z10 = z13;
                        r13 = i14;
                    } else if (i16 == i14) {
                        j11 += y6Var.x;
                        z10 = r122;
                        r13 = i14;
                    } else if (i16 == 4) {
                        j11 += y6Var.s;
                        z11 = z13;
                    } else if (i16 == 5) {
                        j11 += y6Var.w;
                        z10 = false;
                        r13 = 6;
                    } else if (i16 == 6) {
                        j11 += y6Var.F;
                        z10 = false;
                        r13 = 100;
                    } else {
                        i10 = 7;
                        if (i16 == 7) {
                            j11 += y6Var.f;
                            c10 = 5;
                        } else if (i16 == 8) {
                            j11 += y6Var.n;
                            c10 = 4;
                        } else {
                            if (i16 == 9) {
                                j11 += y6Var.E;
                                r12 = z13;
                                i11 = 0;
                            } else {
                                i11 = -1;
                                r12 = 0;
                            }
                            if (i11 != -1) {
                                if (i16 == i10) {
                                    try {
                                        m0(org.telegram.messenger.w0.i().getAbsolutePath(), 0, null, null);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, z13);
                                    }
                                }
                                if (i16 == 9) {
                                    j10 = org.telegram.messenger.i0.P0();
                                    z12 = z13;
                                } else if (i11 == 100) {
                                    z12 = z13;
                                    j10 = new File(org.telegram.messenger.b8.j(4), "acache");
                                } else {
                                    z12 = z13;
                                    j10 = org.telegram.messenger.b8.j(i11);
                                }
                                if (j10 != null) {
                                    m0(j10.getAbsolutePath(), r12, null, o2Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                zVar2.run();
                                if (i11 == 100) {
                                    File j12 = org.telegram.messenger.b8.j(4);
                                    if (j12 != null) {
                                        m0(j12.getAbsolutePath(), 3, null, o2Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    zVar2.run();
                                }
                                if (i11 == 0 || i11 == 2) {
                                    File j13 = org.telegram.messenger.b8.j(i11 == 0 ? 100 : 101);
                                    i12 = 101;
                                    if (j13 != null) {
                                        m0(j13.getAbsolutePath(), r12, null, o2Var);
                                    }
                                    c11 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    zVar2.run();
                                } else {
                                    c11 = 0;
                                    i12 = 101;
                                }
                                if (i11 == 3) {
                                    File j14 = org.telegram.messenger.b8.j(5);
                                    if (j14 != null) {
                                        m0(j14.getAbsolutePath(), r12, null, o2Var);
                                    }
                                    iArr[c11] = iArr[c11] + 1;
                                    zVar2.run();
                                }
                                if (i16 == 9) {
                                    y6Var.E = r0(org.telegram.messenger.i0.P0(), z12 ? 1 : 0);
                                } else {
                                    boolean z16 = z12;
                                    if (i11 == 4) {
                                        y6Var.f = r0(org.telegram.messenger.b8.j(4), 5);
                                        y6Var.n = r0(org.telegram.messenger.b8.j(4), 4);
                                        z15 = z16 ? 1 : 0;
                                        i13 = 2;
                                        c12 = 5;
                                        c13 = 4;
                                        zVar = zVar2;
                                    } else if (i11 == z16) {
                                        y6Var.s = r0(org.telegram.messenger.b8.j(z16 ? 1 : 0), r12);
                                    } else if (i11 == 6) {
                                        y6Var.w = r0(org.telegram.messenger.b8.j(6), r12);
                                    } else {
                                        if (i11 == 3) {
                                            if (r12 == z16) {
                                                zVar = zVar2;
                                                long r02 = r0(org.telegram.messenger.b8.j(3), r12);
                                                y6Var.r = r02;
                                                c12 = 5;
                                                y6Var.r = r0(org.telegram.messenger.b8.j(5), r12) + r02;
                                            } else {
                                                zVar = zVar2;
                                                c12 = 5;
                                                long r03 = r0(org.telegram.messenger.b8.j(3), r12);
                                                y6Var.x = r03;
                                                y6Var.x = r0(org.telegram.messenger.b8.j(5), r12) + r03;
                                            }
                                            i13 = 2;
                                        } else {
                                            zVar = zVar2;
                                            c12 = 5;
                                            if (i11 == 0) {
                                                long r04 = r0(org.telegram.messenger.b8.j(0), r12);
                                                y6Var.y = r04;
                                                y6Var.y = r0(org.telegram.messenger.b8.j(100), r12) + r04;
                                                z15 = true;
                                                i13 = 2;
                                            } else {
                                                i13 = 2;
                                                if (i11 == 2) {
                                                    long r05 = r0(org.telegram.messenger.b8.j(2), r12);
                                                    y6Var.D = r05;
                                                    y6Var.D = r0(org.telegram.messenger.b8.j(i12), r12) + r05;
                                                } else if (i11 == 100) {
                                                    c13 = 4;
                                                    y6Var.F = r0(new File(org.telegram.messenger.b8.j(4), "acache"), r12);
                                                    long r06 = r0(org.telegram.messenger.b8.j(4), 3);
                                                    y6Var.h = r06;
                                                    y6Var.F += r06;
                                                    z15 = true;
                                                }
                                            }
                                        }
                                        c13 = 4;
                                    }
                                }
                            }
                            zVar = zVar2;
                            i13 = 2;
                            c12 = 5;
                            c13 = 4;
                        }
                        i11 = 4;
                        r12 = c10;
                        if (i11 != -1) {
                        }
                        zVar = zVar2;
                        i13 = 2;
                        c12 = 5;
                        c13 = 4;
                    }
                    z10 = false;
                    r13 = z11;
                }
                i10 = 7;
                r12 = z10;
                i11 = r13;
                if (i11 != -1) {
                }
                zVar = zVar2;
                i13 = 2;
                c12 = 5;
                c13 = 4;
            } else {
                c13 = c14;
                c12 = c15;
                z14 = false;
                zVar = zVar2;
                i13 = r122 == true ? 1 : 0;
            }
            i16++;
            r122 = i13;
            zVar2 = zVar;
            c15 = c12;
            c14 = c13;
            z13 = true;
            i14 = 3;
        }
        long j15 = y6Var.f + y6Var.n + y6Var.E + y6Var.D + y6Var.s + y6Var.y + y6Var.r + y6Var.x + y6Var.F + y6Var.w;
        j0 = Long.valueOf(j15);
        y6Var.G = j15;
        i0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        y6Var.H = statFs.getBlockCountLong() * blockSizeLong;
        y6Var.I = availableBlocksLong * blockSizeLong;
        if (z14) {
            org.telegram.messenger.k8 k8Var = org.telegram.messenger.b8.G(y6Var.currentAccount).d;
            k8Var.f.clear();
            k8Var.h(new org.telegram.messenger.a(k8Var, 8));
        }
        org.telegram.messenger.b8.G(y6Var.currentAccount).i();
        org.telegram.messenger.i0.g3(new org.telegram.messenger.video.o(y6Var, z15, j11, o6Var));
    }

    public static void b0(y6 y6Var, org.telegram.ui.ActionBar.x1 x1Var) {
        org.telegram.messenger.b8.G(y6Var.currentAccount).i();
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void c0(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, y6Var.getParentActivity(), null);
        y6Var.c = x1Var;
        x1Var.i0 = false;
        x1Var.r(500L);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(y6Var.currentAccount);
        r12.N1.b();
        r12.J1.b();
        r12.K1.b();
        r12.L1.b();
        r12.M1.b();
        if (z10) {
            org.telegram.messenger.hs messagesStorage = y6Var.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.br(messagesStorage, 12));
        } else {
            org.telegram.messenger.hs messagesStorage2 = y6Var.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.br(messagesStorage2, 15));
        }
    }

    public static void h0(y6 y6Var) {
        String G;
        boolean z10 = false;
        if (y6Var.d0.j.size() <= 0) {
            y6Var.M.f(false);
            return;
        }
        if (y6Var.M != null) {
            if (y6Var.d0.l.isEmpty()) {
                G = org.telegram.messenger.cd.G(y6Var.d0.j.size(), "Files", Integer.valueOf(y6Var.d0.j.size()));
            } else {
                ArrayList arrayList = y6Var.d0.b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    s6 s6Var = (s6) obj;
                    if (y6Var.d0.l.contains(Long.valueOf(s6Var.a))) {
                        i10 += s6Var.b;
                    }
                }
                int size2 = y6Var.d0.j.size() - i10;
                G = size2 > 0 ? a1.g.C(org.telegram.messenger.cd.G(y6Var.d0.l.size(), "Chats", Integer.valueOf(y6Var.d0.l.size())), ", ", org.telegram.messenger.cd.G(size2, "Files", Integer.valueOf(size2))) : org.telegram.messenger.cd.G(y6Var.d0.l.size(), "Chats", Integer.valueOf(y6Var.d0.l.size()));
            }
            String i02 = org.telegram.messenger.i0.i0(y6Var.d0.k, false, false);
            org.telegram.ui.ActionBar.i5 i5Var = y6Var.simpleActionBar;
            boolean z11 = org.telegram.messenger.cd.X;
            i5Var.l();
            i5Var.f.c(i02, !z11 && i5Var.t() && i5Var.G, true);
            org.telegram.ui.ActionBar.i5 i5Var2 = y6Var.simpleActionBar;
            boolean z12 = org.telegram.messenger.cd.X;
            i5Var2.l();
            if (i5Var2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(i5Var2.getContext(), true, true, true);
                    i5Var2.h = f6Var;
                    f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                    i5Var2.h.setTextColor(i5Var2.e0);
                    i5Var2.h.setGravity(19);
                    i5Var2.h.setEllipsizeByGradient(true);
                    i5Var2.h.b(0.35f, 320L, org.telegram.ui.Components.gr.h);
                    i5Var2.addView(i5Var2.h, i5Var2.indexOfChild(i5Var2.b), w7.b6.e(-1, 18, 51));
                    i5Var2.g();
                }
                y6Var.M.f(true);
            }
            org.telegram.ui.Components.f6 f6Var2 = i5Var2.h;
            boolean z13 = (f6Var2 == null || f6Var2.getTag() == null) ? false : true;
            i5Var2.h.c(G, !z12 && i5Var2.t() && i5Var2.G, true);
            i5Var2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            org.telegram.ui.Components.f6 f6Var3 = i5Var2.h;
            if (f6Var3 != null && f6Var3.getTag() != null) {
                z10 = true;
            }
            if (z13 != z10) {
                i5Var2.requestLayout();
            }
            y6Var.M.f(true);
        }
    }

    public static String i0(y6 y6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void j0(y6 y6Var) {
        if (y6Var.d0.j.size() == 0 || y6Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131752098, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752095, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752101, null), new y5(y6Var, 2));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        y6Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public static void k0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131748781, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131748783, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.m5.p("LocalDatabaseClearText2", null, 2131748782, new Object[]{org.telegram.messenger.i0.i0(y6Var.e, false, false)}, spannableStringBuilder);
        x1Var.T = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752649, null), new ag.w0(5, y6Var, z10));
        y6Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public static void l0(org.telegram.messenger.q20 q20Var) {
        Long l4 = j0;
        if (l4 != null) {
            q20Var.a(l4);
            if (System.currentTimeMillis() - i0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new rr0(q20Var, 15));
    }

    public static void m0(String str, int i10, int[] iArr, org.telegram.messenger.q20 q20Var) {
        File[] listFiles;
        int o02 = o0(i10, str);
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
                    if (q20Var != null) {
                        q20Var.a(Float.valueOf(i11 / o02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    m0(a1.g.C(str, "/", name), i10, iArr, q20Var);
                }
            }
        }
    }

    public static int o0(int i10, String str) {
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
                i11 = file2.isDirectory() ? i11 + o0(i10, str + "/" + name) : i11 + 1;
            }
        }
        return i11;
    }

    public static void q0(z4 z4Var) {
        Long l4;
        Long l10 = k0;
        if (l10 == null || (l4 = l0) == null) {
            Utilities.f.c(new rr0(z4Var, 14));
        } else {
            z4Var.a(l10, l4);
        }
    }

    public static long r0(File file, int i10) {
        if (file != null && !h0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean t0(int i10, String str) {
        if (str == null || org.telegram.messenger.b8.j(i10) == null) {
            return false;
        }
        return str.contains(org.telegram.messenger.b8.j(i10).getAbsolutePath());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131744834, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 16));
        this.simpleActionBar.l().c(1, 0, org.telegram.messenger.cd.L0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        int i11 = 2;
        int i12 = 3;
        org.telegram.ui.ActionBar.b1 e = this.simpleActionBar.o().b(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131752076, null));
        this.c0 = e;
        int i13 = org.telegram.ui.ActionBar.t6.p7;
        e.setIconColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        this.c0.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false));
        this.c0.h(0.12f, i13);
        boolean z10 = org.telegram.messenger.v2.a;
        if (this.c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131752076, null));
            this.c0.setText(spannableStringBuilder);
        }
        this.a = new w6(i10, context, this);
        org.telegram.ui.Components.ku0 ku0Var = new org.telegram.ui.Components.ku0(context);
        this.b0 = ku0Var;
        ku0Var.setDebugLoggingEnabled(true);
        this.b0.setCommonInsetsManagedExternally(true);
        this.b0.setGeometry(new h6(this));
        org.telegram.ui.Components.ku0 ku0Var2 = this.b0;
        this.fragmentView = ku0Var2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, ku0Var2, null);
        ag.b1 b1Var = new ag.b1(this, context, i11);
        this.b = b1Var;
        b1Var.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        ag.b1 b1Var2 = this.b;
        org.telegram.ui.Components.ku0 ku0Var3 = this.b0;
        ku0Var3.getClass();
        int i14 = 4;
        b1Var2.setLayoutManager(new br((Object) ku0Var3, i14));
        this.b0.u(this.b, new y5(this, i12));
        this.b.setAdapter(this.a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        i6Var.o(grVar);
        i6Var.C = false;
        i6Var.m = false;
        this.b.setItemAnimator(i6Var);
        this.b.setOnItemClickListener(new y5(this, i14));
        this.b.j(new h3(this, i12));
        View view = new View(context);
        this.O = view;
        ku0Var2.addView(view, w7.b6.e(-1, 0, 48));
        this.S = new fe.b(0, new y5(this, 5), grVar, 380L, false);
        this.T = new fe.b(1, new y5(this, i10), grVar, 380L, false);
        y0();
        getBaseSimpleGlass().f(ku0Var2, this.b, this.simpleActionBar, this.resourceProvider);
        j6 j6Var = new j6(this, context, this, this.glassEngine, this.b0);
        this.M = j6Var;
        j6Var.D = true;
        FrameLayout frameLayout = j6Var.c;
        org.telegram.messenger.i0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.N = frameLayout;
        vg.f c10 = getBaseSimpleGlass().c.c(this.N, null, false);
        c10.o(w7.b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.ku0 ku0Var4 = this.b0;
        j6 j6Var2 = this.M;
        org.telegram.ui.Components.w71 viewPager = j6Var2.getViewPager();
        j6 j6Var3 = this.M;
        Objects.requireNonNull(j6Var3);
        ku0Var4.x(j6Var2, viewPager, new y0(j6Var3, 8));
        this.b0.y(this.N);
        this.N.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new h6(this));
        this.M.setCacheModel(this.d0);
        getBaseSimpleGlass().m = new ei.a(i11, this, new z5(i10, ku0Var2));
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.simpleActionBar.setBackground(null);
        u0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.L4) {
            try {
                org.telegram.ui.ActionBar.x1 x1Var = this.c;
                if (x1Var != null) {
                    x1Var.dismiss();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = org.telegram.messenger.hs.a0(this.currentAccount).S();
                if (this.c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131752076, null));
                    this.c0.setText(spannableStringBuilder);
                }
                z0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.yu0.class, org.telegram.ui.Components.lx0.class, org.telegram.ui.Cells.p4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Components.lx0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hj));
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Components.lx0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Vj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ck));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return !this.g0 ? super.isLightStatusBar() : org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.ku0 ku0Var;
        return this.M == null || motionEvent == null || (ku0Var = this.b0) == null || !ku0Var.c() || this.b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().b == 0;
    }

    public final void n0(s6 s6Var, org.telegram.ui.Components.ix0[] ix0VarArr, sh.b bVar) {
        t6 t6Var;
        HashSet hashSet;
        long j10;
        int i10;
        long j11;
        org.telegram.ui.Components.ix0 ix0Var;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
        x1Var.i0 = false;
        x1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j12 = this.G;
        int i11 = 0;
        while (i11 < 8) {
            if ((ix0VarArr == null || ((ix0Var = ix0VarArr[i11]) != null && ix0Var.c)) && (t6Var = (t6) s6Var.d.get(i11)) != null) {
                hashSet2.addAll(t6Var.b);
                hashSet = hashSet2;
                long j13 = s6Var.c;
                long j14 = t6Var.a;
                s6Var.c = j13 - j14;
                this.G -= j14;
                this.I += j14;
                s6Var.d.delete(i11);
                if (i11 == 0) {
                    this.y -= t6Var.a;
                } else if (i11 == 1) {
                    this.D -= t6Var.a;
                } else if (i11 == 2) {
                    this.r -= t6Var.a;
                } else if (i11 == 3) {
                    this.x -= t6Var.a;
                } else if (i11 == 4) {
                    this.s -= t6Var.a;
                } else if (i11 == 5) {
                    this.F -= t6Var.a;
                } else {
                    char c10 = 7;
                    if (i11 == 7) {
                        int i12 = 0;
                        while (i12 < t6Var.b.size()) {
                            sh.a aVar = (sh.a) t6Var.b.get(i12);
                            String absolutePath = ((sh.a) t6Var.b.get(i12)).a.getAbsolutePath();
                            char c11 = t0(6, absolutePath) ? c10 : (t0(0, absolutePath) || t0(100, absolutePath)) ? (char) 0 : (t0(2, absolutePath) || t0(101, absolutePath)) ? (char) 1 : (char) 6;
                            if (c11 == c10) {
                                i10 = i12;
                                j11 = j12;
                                this.w -= aVar.c;
                            } else {
                                i10 = i12;
                                j11 = j12;
                                if (c11 == 0) {
                                    this.y -= aVar.c;
                                } else if (c11 == 1) {
                                    this.D -= aVar.c;
                                } else {
                                    this.f -= aVar.c;
                                }
                            }
                            i12 = i10 + 1;
                            j12 = j11;
                            c10 = 7;
                        }
                    } else {
                        j10 = j12;
                        this.f -= t6Var.a;
                        i11++;
                        hashSet2 = hashSet;
                        j12 = j10;
                    }
                }
            } else {
                hashSet = hashSet2;
            }
            j10 = j12;
            i11++;
            hashSet2 = hashSet;
            j12 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j15 = j12;
        if (s6Var.d.size() == 0) {
            this.d0.b.remove(s6Var);
        }
        z0(true);
        if (bVar != null) {
            Iterator it = bVar.j.iterator();
            while (it.hasNext()) {
                sh.a aVar2 = (sh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j16 = this.G;
                    long j17 = aVar2.c;
                    this.G = j16 - j17;
                    this.I += j17;
                    hashSet4.add(aVar2);
                    s6Var.b(aVar2);
                    int i13 = aVar2.d;
                    if (i13 == 0) {
                        this.y -= aVar2.c;
                    } else if (i13 == 1) {
                        this.D -= aVar2.c;
                    } else if (i13 == 2) {
                        this.r -= aVar2.c;
                    } else if (i13 == 3) {
                        this.x -= aVar2.c;
                    } else if (i13 == 4) {
                        this.s -= aVar2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            sh.a aVar3 = (sh.a) it2.next();
            sh.b bVar2 = this.d0;
            if (bVar2.j.remove(aVar3)) {
                bVar2.k -= aVar3.c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(this).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.a0(null, null, 2131752645, org.telegram.messenger.i0.i0(j15 - this.G, false, false)));
        Q.r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.k8 k8Var = getFileLoader().d;
        k8Var.getClass();
        k8Var.h(new org.telegram.messenger.t6(10, k8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.b8.J.c(new p1(this, arrayList, x1Var, 3));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        sh.b bVar = this.d0;
        if (bVar == null || bVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.d0.d();
            j6 j6Var = this.M;
            if (j6Var != null) {
                j6Var.f(false);
                this.M.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        h0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.zs.L4);
        this.e = org.telegram.messenger.hs.a0(this.currentAccount).S();
        Utilities.e.c(new b6(this, 2));
        this.a0 = System.currentTimeMillis();
        z0(false);
        x0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.L4);
        try {
            org.telegram.ui.ActionBar.x1 x1Var = this.c;
            if (x1Var != null) {
                x1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        h0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        u0(i11, i13);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.messenger.h9 h9Var;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (h9Var = FilesMigrationService.e) == null) {
                return;
            }
            h9Var.I0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.b1 b1Var = this.c0;
            if (b1Var != null) {
                b1Var.setIconColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p7, false));
            }
            zu zuVar = this.Z;
            if (zuVar != null) {
                zuVar.v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
            }
            try {
                org.telegram.ui.ActionBar.b1 b1Var2 = this.c0;
                if (b1Var2 != null) {
                    b1Var2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.g0) {
            this.g0 = true;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void p0(File file, int i10, LongSparseArray longSparseArray, sh.b bVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (h0) {
                    break;
                }
                if (file2.isDirectory()) {
                    p0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.j8 e = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    sh.a aVar = new sh.a(file2);
                    long length = file2.length();
                    aVar.c = length;
                    if (e != null) {
                        aVar.b = e.a;
                        aVar.g = e.b;
                        int i12 = e.c;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j10 = aVar.b;
                    if (j10 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j10, null);
                        if (s6Var == null) {
                            s6Var = new s6(aVar.b);
                            longSparseArray.put(aVar.b, s6Var);
                        }
                        s6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    public final boolean s0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f0;
            if (i11 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i11);
            if (u6Var.a == 11 && !u6Var.i && (i10 = u6Var.f) >= 0) {
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

    public final void u0(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
        ag.b1 b1Var = this.b;
        if (b1Var == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2;
        int C = org.telegram.messenger.z20.C(48.0f, i10, -org.telegram.messenger.i0.L(8.0f));
        int C2 = org.telegram.messenger.z20.C(48.0f, i11, -org.telegram.messenger.i0.L(8.0f));
        org.telegram.messenger.i0.A3(b1Var, 0, C, 0, C2);
        b1Var.setPadding(0, (currentActionBarHeight + i10) - C, 0, i11 - C2);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            this.O.setLayoutParams(layoutParams);
            y0();
        }
        if (this.b0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            this.b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            org.telegram.ui.Components.ku0 ku0Var = this.b0;
            ku0Var.B();
            ku0Var.requestLayout();
            ku0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final long v0(int i10) {
        switch (i10) {
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

    public final void w0(View view) {
        int i10;
        int i11;
        int i12;
        boolean s02 = s0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f0;
        if (s02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var = (u6) arrayList.get(i13);
                if (u6Var.a != 11 || u6Var.i || (i12 = u6Var.f) < 0 || !zArr[i12]) {
                }
            }
            org.telegram.messenger.t2.D.a();
            if (view != null) {
                org.telegram.messenger.i0.F3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                u6 u6Var2 = (u6) arrayList.get(i14);
                if (u6Var2.a == 11 && !u6Var2.i && (i11 = u6Var2.f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !s02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                u6 u6Var3 = (u6) arrayList.get(i16);
                if (u6Var3.a == 11 && u6Var3.i && (i10 = u6Var3.f) >= 0) {
                    zArr[i10] = !s02;
                }
            }
        }
        for (int i17 = 0; i17 < this.b.getChildCount(); i17++) {
            View childAt = this.b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.a == 11) {
                        int i18 = u6Var4.f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.c2) childAt).c(!s02, true);
                        } else {
                            ((org.telegram.ui.Cells.c2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        x0();
    }

    public final void x0() {
        v6 v6Var = this.W;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.hc[] hcVarArr = new org.telegram.ui.Components.hc[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i10);
                    if (u6Var.a == 11) {
                        int i11 = u6Var.f;
                        boolean[] zArr = this.d;
                        if (i11 >= 0) {
                            long j10 = u6Var.g;
                            boolean z12 = zArr[i11];
                            org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc();
                            hcVar.c = j10;
                            hcVar.b = z12;
                            hcVarArr[i11] = hcVar;
                        } else if (this.L) {
                            long j11 = u6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.hc hcVar2 = new org.telegram.ui.Components.hc();
                            hcVar2.c = j11;
                            hcVar2.b = z13;
                            hcVarArr[10] = hcVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.a0 < 80) {
                    this.W.n.e(true, 0.0f);
                }
                this.W.f(this.G, true, hcVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.hc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.hc[0]);
            }
        }
        q6 q6Var = this.Y;
        if (q6Var == null || this.K) {
            return;
        }
        y6 y6Var = q6Var.d;
        boolean[] zArr2 = y6Var.d;
        long j12 = (zArr2[0] ? y6Var.y : 0L) + (zArr2[1] ? y6Var.D : 0L) + (zArr2[2] ? y6Var.r : 0L) + (zArr2[3] ? y6Var.x : 0L) + (zArr2[4] ? y6Var.s : 0L) + (zArr2[5] ? y6Var.w : 0L) + (zArr2[6] ? y6Var.F : 0L) + (zArr2[7] ? y6Var.f : 0L) + (zArr2[8] ? y6Var.n : 0L) + (zArr2[9] ? y6Var.E : 0L);
        ArrayList arrayList2 = y6Var.f0;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                z10 = true;
                break;
            }
            u6 u6Var2 = (u6) arrayList2.get(i12);
            if (u6Var2.a == 11) {
                int i13 = u6Var2.f;
                if (i13 < 0) {
                    i13 = zArr2.length - 1;
                }
                if (!zArr2[i13]) {
                    break;
                }
            }
            i12++;
        }
        q6Var.a(j12, z10);
    }

    public final void y0() {
        View view = this.O;
        if (view == null) {
            return;
        }
        fe.b bVar = this.S;
        float f7 = bVar == null ? 0.0f : bVar.e;
        fe.b bVar2 = this.T;
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * org.telegram.messenger.i0.L(44.0f)));
    }

    public final void z0(boolean z10) {
        long j10;
        boolean z11;
        float[] fArr;
        sh.b bVar;
        org.telegram.ui.Components.ku0 ku0Var = this.b0;
        int i10 = 0;
        boolean z12 = ku0Var != null && ku0Var.e0;
        boolean z13 = (!z10 || System.currentTimeMillis() - this.a0 >= 80) ? z10 : false;
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
            z11 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(u6.b(0, this.y, org.telegram.messenger.cd.L0(2131748773, null), org.telegram.ui.ActionBar.t6.Zj));
            }
            if (this.D > 0) {
                arrayList3.add(u6.b(1, this.D, org.telegram.messenger.cd.L0(2131748769, null), org.telegram.ui.ActionBar.t6.Vj));
            }
            if (this.r > 0) {
                arrayList3.add(u6.b(2, this.r, org.telegram.messenger.cd.L0(2131748778, null), org.telegram.ui.ActionBar.t6.Wj));
            }
            if (this.x > 0) {
                j10 = 0;
                arrayList3.add(u6.b(3, this.x, org.telegram.messenger.cd.L0(2131748775, null), org.telegram.ui.ActionBar.t6.dk));
            } else {
                j10 = 0;
            }
            if (this.s > j10) {
                arrayList3.add(u6.b(4, this.s, org.telegram.messenger.cd.L0(2131748785, null), org.telegram.ui.ActionBar.t6.ak));
            }
            if (this.w > j10) {
                arrayList3.add(u6.b(5, this.w, org.telegram.messenger.cd.L0(2131748770, null), org.telegram.ui.ActionBar.t6.Xj));
            }
            if (this.F > j10) {
                arrayList3.add(u6.b(6, this.F, org.telegram.messenger.cd.L0(2131748771, null), org.telegram.ui.ActionBar.t6.bk));
            }
            if (this.f > j10) {
                arrayList3.add(u6.b(7, this.f, org.telegram.messenger.cd.L0(2131748772, null), org.telegram.ui.ActionBar.t6.ek));
            }
            if (this.n > j10) {
                arrayList3.add(u6.b(8, this.n, org.telegram.messenger.cd.L0(2131748776, null), org.telegram.ui.ActionBar.t6.dk));
            }
            if (this.E > j10) {
                arrayList3.add(u6.b(9, this.E, org.telegram.messenger.cd.L0(2131748777, null), org.telegram.ui.ActionBar.t6.Yj));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
            } else {
                Collections.sort(arrayList3, new f6(i10));
                ((u6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.V == null) {
                    this.V = new float[11];
                }
                int i11 = 0;
                while (true) {
                    fArr = this.V;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    fArr[i11] = v0(i11);
                    i11++;
                }
                if (this.U == null) {
                    this.U = new int[11];
                }
                org.telegram.messenger.i0.e3(fArr, this.U);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    int i12 = 0;
                    long j11 = j10;
                    for (int i13 = 4; i13 < arrayList3.size(); i13++) {
                        ((u6) arrayList3.get(i13)).i = true;
                        j11 += ((u6) arrayList3.get(i13)).g;
                        i12 += this.U[((u6) arrayList3.get(i13)).f];
                    }
                    this.U[10] = i12;
                    arrayList2.add(u6.b(-1, j11, org.telegram.messenger.cd.L0(2131748774, null), org.telegram.ui.ActionBar.t6.Yj));
                    if (!this.L) {
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
            String L0 = org.telegram.messenger.cd.L0(2131744832, null);
            u6 u6Var = new u6(1);
            u6Var.e = L0;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, org.telegram.messenger.cd.L0(2131753867, null)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String L02 = org.telegram.messenger.cd.L0(2131749068, null);
        u6 u6Var2 = new u6(1);
        u6Var2.e = L02;
        arrayList2.add(u6Var2);
        if (this.H > j10) {
            arrayList2.add(new u6(3, org.telegram.messenger.cd.L0(2131748685, null)));
            arrayList2.add(new u6(14));
            String L03 = org.telegram.messenger.cd.L0(2131748684, null);
            u6 u6Var3 = new u6(1);
            u6Var3.e = L03;
            arrayList2.add(u6Var3);
        }
        this.R = -1;
        if (z11 && (bVar = this.d0) != null && !bVar.h()) {
            this.R = arrayList2.size();
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
        j6 j6Var = this.M;
        if (j6Var != null) {
            j6Var.d();
        }
        org.telegram.ui.Components.ku0 ku0Var2 = this.b0;
        if (ku0Var2 != null) {
            if (z12 && this.R != -1) {
                ku0Var2.a();
            }
            org.telegram.ui.Components.ku0 ku0Var3 = this.b0;
            ku0Var3.B();
            ku0Var3.requestLayout();
            ku0Var3.invalidate();
        }
    }
}
