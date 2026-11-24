// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y71 extends d implements jm7 {
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
    public k71 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public fn0 T;
    public fn0 U;
    public int[] V;
    public float[] W;
    public v71 X;
    public m71 Y;
    public q71 Z;
    public w71 a;
    public wf3 a0;
    public fv b;
    public long b0;
    public he c;
    public fja c0;
    public final boolean[] d;
    public a8 d0;
    public long e;
    public c81 e0;
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

    public y71() {
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

    public static void d0(qac qacVar) {
        Long l = k0;
        if (l != null) {
            qacVar.a(l);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new mo0(qacVar, (byte) 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e0(String str, int i, int[] iArr, h71 h71Var) {
        File[] listFiles;
        int j02 = j0(i, str);
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
                if (i > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z2 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z3 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z) {
                        if (i == 1) {
                        }
                        if (z2) {
                            if (i == 3) {
                            }
                            if (z3) {
                            }
                        } else {
                            if (i == 5) {
                            }
                            if (z3) {
                                if (i == 4) {
                                }
                            } else if (i == 5) {
                            }
                        }
                    } else {
                        if (i == 2) {
                        }
                        if (z2) {
                        }
                    }
                }
                if (!file2.isDirectory()) {
                    file2.delete();
                    int i2 = iArr[0] + 1;
                    iArr[0] = i2;
                    if (h71Var != null) {
                        h71Var.a(Float.valueOf(i2 / j02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    e0(td4.q(str, "/", name), i, iArr, h71Var);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j0(int i, String str) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i2 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z2 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z3 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z) {
                        if (i == 1) {
                        }
                        if (z2) {
                            if (i == 3) {
                            }
                            if (z3) {
                            }
                        } else {
                            if (i == 5) {
                            }
                            if (z3) {
                                if (i == 4) {
                                }
                            } else if (i == 5) {
                            }
                        }
                    } else {
                        if (i == 2) {
                        }
                        if (z2) {
                        }
                    }
                }
                i2 = file2.isDirectory() ? i2 + j0(i, str + "/" + name) : i2 + 1;
            }
        }
        return i2;
    }

    public static String l0(float f) {
        if (f < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void m0(h92 h92Var) {
        Long l;
        Long l2 = l0;
        if (l2 == null || (l = m0) == null) {
            Utilities.f.c(new yt0(h92Var, (byte) 13));
        } else {
            h92Var.a(l2, l);
        }
    }

    public static long n0(File file, int i) {
        if (file == null || i0) {
            return 0L;
        }
        if (file.isDirectory()) {
            return Utilities.getDirSize(file.getAbsolutePath(), i, false);
        }
        if (file.isFile()) {
            return file.length();
        }
        return 0L;
    }

    public static boolean t0(int i, String str) {
        if (str == null || bc4.j(i) == null) {
            return false;
        }
        return str.contains(bc4.j(i).getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(boolean z) {
        boolean z2;
        float[] fArr;
        w71 w71Var;
        k71 k71Var;
        fja fjaVar;
        c81 c81Var;
        fja fjaVar2 = this.c0;
        boolean z3 = fjaVar2 != null && fjaVar2.f0;
        boolean z4 = (!z || System.currentTimeMillis() - this.b0 >= 80) ? z : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new u71(9, (String) null));
        arrayList2.add(new u71(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new u71(12, (String) null));
            arrayList2.add(new u71(12, (String) null));
            arrayList2.add(new u71(12, (String) null));
            arrayList2.add(new u71(12, (String) null));
            arrayList2.add(new u71(12, (String) null));
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(u71.b(0, this.y, jb6.M0(2131748520, null), cmb.bk));
            }
            if (this.E > 0) {
                arrayList3.add(u71.b(1, this.E, jb6.M0(2131748516, null), cmb.Xj));
            }
            if (this.r > 0) {
                arrayList3.add(u71.b(2, this.r, jb6.M0(2131748525, null), cmb.Yj));
            }
            if (this.x > 0) {
                arrayList3.add(u71.b(3, this.x, jb6.M0(2131748522, null), cmb.fk));
            }
            if (this.s > 0) {
                arrayList3.add(u71.b(4, this.s, jb6.M0(2131748532, null), cmb.ck));
            }
            if (this.w > 0) {
                arrayList3.add(u71.b(5, this.w, jb6.M0(2131748517, null), cmb.Zj));
            }
            if (this.G > 0) {
                arrayList3.add(u71.b(6, this.G, jb6.M0(2131748518, null), cmb.dk));
            }
            if (this.f > 0) {
                arrayList3.add(u71.b(7, this.f, jb6.M0(2131748519, null), cmb.gk));
            }
            if (this.n > 0) {
                arrayList3.add(u71.b(8, this.n, jb6.M0(2131748523, null), cmb.fk));
            }
            if (this.F > 0) {
                arrayList3.add(u71.b(9, this.F, jb6.M0(2131748524, null), cmb.ak));
            }
            if (arrayList3.isEmpty()) {
                z2 = false;
                if (z2) {
                    arrayList2.size();
                    arrayList2.add(new u71(13, (String) null));
                    String M0 = jb6.M0(2131744503, null);
                    u71 u71Var = new u71(1);
                    u71Var.e = M0;
                    arrayList2.add(u71Var);
                }
                arrayList2.add(new u71(3, jb6.M0(2131753832, null)));
                arrayList2.add(new u71(0, 0));
                arrayList2.add(new u71(1, 0));
                arrayList2.add(new u71(2, 0));
                arrayList2.add(new u71(3, 0));
                String M02 = jb6.M0(2131748815, null);
                u71 u71Var2 = new u71(1);
                u71Var2.e = M02;
                arrayList2.add(u71Var2);
                if (this.I > 0) {
                    arrayList2.add(new u71(3, jb6.M0(2131748427, null)));
                    arrayList2.add(new u71(14));
                    String M03 = jb6.M0(2131748426, null);
                    u71 u71Var3 = new u71(1);
                    u71Var3.e = M03;
                    arrayList2.add(u71Var3);
                }
                this.S = -1;
                if (z2 && (c81Var = this.e0) != null && !c81Var.h()) {
                    this.S = arrayList2.size();
                    arrayList2.add(new u71(8, (String) null));
                }
                w71Var = this.a;
                if (w71Var != null) {
                    if (z4) {
                        w71Var.E(arrayList, arrayList2);
                    } else {
                        w71Var.f();
                    }
                }
                k71Var = this.N;
                if (k71Var != null) {
                    k71Var.d();
                }
                fjaVar = this.c0;
                if (fjaVar == null) {
                    if (z3 && this.S != -1) {
                        fjaVar.a();
                    }
                    fja fjaVar3 = this.c0;
                    fjaVar3.C();
                    fjaVar3.requestLayout();
                    fjaVar3.invalidate();
                    return;
                }
                return;
            }
            Collections.sort(arrayList3, new sa((byte) 13));
            ((u71) arrayList3.get(arrayList3.size() - 1)).j = true;
            if (this.W == null) {
                this.W = new float[11];
            }
            int i = 0;
            while (true) {
                fArr = this.W;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = v0(i);
                i++;
            }
            int[] iArr = this.V;
            if (iArr == null) {
                iArr = new int[11];
                this.V = iArr;
            }
            gm.a3(fArr, iArr);
            if (arrayList3.size() > 5) {
                arrayList2.addAll(arrayList3.subList(0, 4));
                long j = 0;
                int i2 = 0;
                for (int i3 = 4; i3 < arrayList3.size(); i3++) {
                    ((u71) arrayList3.get(i3)).i = true;
                    j += ((u71) arrayList3.get(i3)).g;
                    i2 += this.V[((u71) arrayList3.get(i3)).f];
                }
                this.V[10] = i2;
                arrayList2.add(u71.b(-1, j, jb6.M0(2131748521, null), cmb.ak));
                if (!this.M) {
                    arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                }
            } else {
                arrayList2.addAll(arrayList3);
            }
        }
        z2 = true;
        if (z2) {
        }
        arrayList2.add(new u71(3, jb6.M0(2131753832, null)));
        arrayList2.add(new u71(0, 0));
        arrayList2.add(new u71(1, 0));
        arrayList2.add(new u71(2, 0));
        arrayList2.add(new u71(3, 0));
        String M022 = jb6.M0(2131748815, null);
        u71 u71Var22 = new u71(1);
        u71Var22.e = M022;
        arrayList2.add(u71Var22);
        if (this.I > 0) {
        }
        this.S = -1;
        if (z2) {
            this.S = arrayList2.size();
            arrayList2.add(new u71(8, (String) null));
        }
        w71Var = this.a;
        if (w71Var != null) {
        }
        k71Var = this.N;
        if (k71Var != null) {
        }
        fjaVar = this.c0;
        if (fjaVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.L6));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        byte b = 0;
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setTitle(jb6.M0(2131744505, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 14));
        this.simpleActionBar.q().b(1, 0, jb6.M0(2131752602, null), null, 0, null).getTextView().setTextColor(cmb.w0(null, cmb.Ei, false));
        byte b2 = 3;
        a8 e = this.simpleActionBar.t().a(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, jb6.M0(2131752013, null));
        this.d0 = e;
        int i = cmb.o7;
        e.setIconColor(cmb.w0(null, i, false));
        this.d0.setTextColor(cmb.w0(null, cmb.p7, false));
        this.d0.h(0.12f, i);
        boolean z = e21.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131752013, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new w71(this, context, b);
        fja fjaVar = new fja(context);
        this.c0 = fjaVar;
        fjaVar.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        byte b3 = 12;
        this.c0.setGeometry(new nl9(this, b3));
        fja fjaVar2 = this.c0;
        this.fragmentView = fjaVar2;
        anb.h(cmb.Z6, null, fjaVar2);
        fv fvVar = new fv(b2, context, this);
        this.b = fvVar;
        fvVar.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        fv fvVar2 = this.b;
        fja fjaVar3 = this.c0;
        fjaVar3.getClass();
        byte b4 = 5;
        fvVar2.setLayoutManager(new jg2((Object) fjaVar3, b4));
        this.c0.v(this.b, new d71(this, b2));
        this.b.setAdapter(this.a);
        j71 j71Var = new j71(this);
        j71Var.n(350L);
        d53 d53Var = d53.h;
        j71Var.o(d53Var);
        j71Var.C = false;
        j71Var.m = false;
        this.b.setItemAnimator(j71Var);
        this.b.setOnItemClickListener(new d71(this, (byte) 4));
        this.b.j(new y(this, b3));
        View view = new View(context);
        this.P = view;
        fjaVar2.addView(view, qoe.e(-1, 0, 48));
        this.T = new fn0(0, new d71(this, b4), d53Var, 380L, false);
        this.U = new fn0(1, new d71(this, b), d53Var, 380L, false);
        z0();
        getBaseSimpleGlass().f(fjaVar2, this.b, this.simpleActionBar, this.resourceProvider);
        k71 k71Var = new k71(this, context, this, this.glassEngine, this.c0);
        this.N = k71Var;
        k71Var.E = true;
        FrameLayout frameLayout = k71Var.c;
        gm.B2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        im0 c = getBaseSimpleGlass().c.c(this.O, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.q(gm.L(9.66f));
        c.r(gm.L(18.0f));
        frameLayout.setBackground(c);
        fja fjaVar4 = this.c0;
        k71 k71Var2 = this.N;
        wgc viewPager = k71Var2.getViewPager();
        k71 k71Var3 = this.N;
        Objects.requireNonNull(k71Var3);
        fjaVar4.y(k71Var2, viewPager, new xg0(k71Var3, (byte) 23));
        this.c0.z(this.O);
        this.O.setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new sz4(this));
        this.N.setCacheModel(this.e0);
        getBaseSimpleGlass().o = new dh0(this, new xg0(fjaVar2, (byte) 22), b2);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        u0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.P4) {
            try {
                he heVar = this.c;
                if (heVar != null) {
                    heVar.dismiss();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = cf7.Y(this.currentAccount).Q();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131752013, null));
                    this.d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    public final void f0(s71 s71Var, f35[] f35VarArr, c81 c81Var) {
        t71 t71Var;
        HashSet hashSet;
        long j;
        long j2;
        f35 f35Var;
        he heVar = new he(3, null, getParentActivity());
        heVar.j0 = false;
        heVar.q(500L);
        HashSet hashSet2 = new HashSet();
        long j3 = this.H;
        int i = 0;
        while (i < 8) {
            if ((f35VarArr == null || ((f35Var = f35VarArr[i]) != null && f35Var.b)) && (t71Var = (t71) s71Var.d.get(i)) != null) {
                hashSet2.addAll(t71Var.b);
                hashSet = hashSet2;
                long j4 = s71Var.c;
                long j5 = t71Var.a;
                s71Var.c = j4 - j5;
                this.H -= j5;
                this.J += j5;
                s71Var.d.delete(i);
                if (i == 0) {
                    this.y -= t71Var.a;
                } else if (i == 1) {
                    this.E -= t71Var.a;
                } else if (i == 2) {
                    this.r -= t71Var.a;
                } else if (i == 3) {
                    this.x -= t71Var.a;
                } else if (i == 4) {
                    this.s -= t71Var.a;
                } else if (i == 5) {
                    this.G -= t71Var.a;
                } else {
                    char c = 7;
                    if (i == 7) {
                        int i2 = 0;
                        while (i2 < t71Var.b.size()) {
                            b81 b81Var = (b81) t71Var.b.get(i2);
                            String absolutePath = ((b81) t71Var.b.get(i2)).a.getAbsolutePath();
                            char c2 = t0(6, absolutePath) ? c : (t0(0, absolutePath) || t0(100, absolutePath)) ? (char) 0 : (t0(2, absolutePath) || t0(101, absolutePath)) ? (char) 1 : (char) 6;
                            int i3 = i2;
                            if (c2 == c) {
                                j2 = j3;
                                this.w -= b81Var.c;
                            } else {
                                j2 = j3;
                                if (c2 == 0) {
                                    this.y -= b81Var.c;
                                } else if (c2 == 1) {
                                    this.E -= b81Var.c;
                                } else {
                                    this.f -= b81Var.c;
                                }
                            }
                            i2 = i3 + 1;
                            j3 = j2;
                            c = 7;
                        }
                    } else {
                        j = j3;
                        this.f -= t71Var.a;
                        i++;
                        hashSet2 = hashSet;
                        j3 = j;
                    }
                }
            } else {
                hashSet = hashSet2;
            }
            j = j3;
            i++;
            hashSet2 = hashSet;
            j3 = j;
        }
        HashSet hashSet3 = hashSet2;
        long j6 = j3;
        if (s71Var.d.size() == 0) {
            this.e0.b.remove(s71Var);
        }
        A0(true);
        if (c81Var != null) {
            Iterator it = c81Var.j.iterator();
            while (it.hasNext()) {
                b81 b81Var2 = (b81) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(b81Var2)) {
                    long j7 = this.H;
                    long j8 = b81Var2.c;
                    this.H = j7 - j8;
                    this.J += j8;
                    hashSet4.add(b81Var2);
                    s71Var.b(b81Var2);
                    byte b = b81Var2.d;
                    if (b == 0) {
                        this.y -= b81Var2.c;
                    } else if (b == 1) {
                        this.E -= b81Var2.c;
                    } else if (b == 2) {
                        this.r -= b81Var2.c;
                    } else if (b == 3) {
                        this.x -= b81Var2.c;
                    } else if (b == 4) {
                        this.s -= b81Var2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            b81 b81Var3 = (b81) it2.next();
            c81 c81Var2 = this.e0;
            if (c81Var2.j.remove(b81Var3)) {
                c81Var2.k -= b81Var3.c;
            }
            ArrayList e = c81Var2.e(b81Var3.d);
            if (e != null) {
                e.remove(b81Var3);
            }
        }
        u31 Q = c41.b0(this).Q(R.raw.ic_delete, 36, jb6.a0(null, null, 2131752598, gm.i0(j6 - this.H, false, false)));
        Q.s = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        lc4 lc4Var = getFileLoader().d;
        lc4Var.getClass();
        lc4Var.h(new pv3(lc4Var, arrayList, (byte) 26));
        getFileLoader().c();
        getFileLoader().getClass();
        bc4.K.c(new tv0(this, arrayList, heVar, (byte) 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(p pVar, o71 o71Var) {
        boolean[] zArr;
        int i;
        int i2;
        int i3;
        h71 h71Var;
        long j;
        int i4;
        int i5;
        int i6;
        char c;
        File file;
        byte b = 0;
        int[] iArr = {0};
        boolean[] zArr2 = this.d;
        int i7 = 2;
        int i8 = 3;
        int i9 = 4;
        int i10 = (zArr2[0] ? 2 : 0) + (zArr2[1] ? 2 : 0) + (zArr2[2] ? 2 : 0) + (zArr2[3] ? 2 : 0) + (zArr2[4] ? 1 : 0) + (zArr2[5] ? 2 : 0) + (zArr2[6] ? 1 : 0) + (zArr2[7] ? 1 : 0) + (zArr2[8] ? 1 : 0) + (zArr2[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        h71 h71Var2 = new h71(pVar, iArr, i10, b);
        o77 o77Var = new o77((Object) pVar, (Object) iArr, i10, currentTimeMillis, (byte) 4);
        long j2 = 0;
        boolean z = true;
        int i11 = 0;
        boolean z2 = false;
        while (i11 < 10) {
            if (zArr2[i11]) {
                zArr = zArr2;
                if (i11 == 0) {
                    j = j2 + this.y;
                    i3 = i9;
                    h71Var = h71Var2;
                    i = 7;
                    i4 = 0;
                } else if (i11 == 1) {
                    j = j2 + this.E;
                    i4 = i7;
                    i3 = i9;
                    h71Var = h71Var2;
                    i = 7;
                } else {
                    if (i11 == i7) {
                        j = j2 + this.r;
                        i4 = i8;
                        i3 = i9;
                        h71Var = h71Var2;
                        i = 7;
                        i2 = 9;
                        i9 = 1;
                    } else {
                        if (i11 == i8) {
                            j = j2 + this.x;
                            i4 = i8;
                            i3 = i9;
                            h71Var = h71Var2;
                            i = 7;
                            i9 = i7;
                        } else if (i11 == i9) {
                            j = j2 + this.s;
                            i3 = i9;
                            h71Var = h71Var2;
                            i = 7;
                            i2 = 9;
                            i9 = 0;
                            i4 = 1;
                        } else if (i11 == 5) {
                            j = j2 + this.w;
                            i3 = i9;
                            h71Var = h71Var2;
                            i = 7;
                            i4 = 6;
                        } else if (i11 == 6) {
                            j = j2 + this.G;
                            i3 = i9;
                            h71Var = h71Var2;
                            i = 7;
                            i4 = 100;
                        } else {
                            i = 7;
                            if (i11 == 7) {
                                j = j2 + this.f;
                                i4 = i9;
                                i3 = i4;
                                h71Var = h71Var2;
                                i2 = 9;
                                i9 = 5;
                            } else if (i11 == 8) {
                                j = j2 + this.n;
                                i4 = i9;
                                i3 = i4;
                                h71Var = h71Var2;
                            } else {
                                i2 = 9;
                                i3 = i9;
                                h71Var = h71Var2;
                                if (i11 == 9) {
                                    i9 = 1;
                                    j = j2 + this.F;
                                    i4 = 0;
                                } else {
                                    j = j2;
                                    i9 = 0;
                                    i4 = -1;
                                }
                            }
                        }
                        i2 = 9;
                    }
                    if (i4 != -1) {
                        h71Var2 = h71Var;
                    } else {
                        if (i11 == i) {
                            try {
                                file = new File(a.h(), "rasterized/wallpaper");
                                file.mkdirs();
                            } catch (Exception e) {
                                try {
                                    fc4.g(e, true);
                                    file = null;
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                            }
                            e0(file.getAbsolutePath(), 0, null, null);
                        }
                        File O0 = i11 == i2 ? gm.O0() : i4 == 100 ? new File(bc4.j(i3), "acache") : bc4.j(i4);
                        if (O0 != null) {
                            h71Var2 = h71Var;
                            e0(O0.getAbsolutePath(), i9, null, h71Var2);
                        } else {
                            h71Var2 = h71Var;
                        }
                        iArr[0] = iArr[0] + 1;
                        o77Var.run();
                        if (i4 == 100) {
                            File j3 = bc4.j(i3);
                            if (j3 != null) {
                                e0(j3.getAbsolutePath(), 3, null, h71Var2);
                            }
                            iArr[0] = iArr[0] + 1;
                            o77Var.run();
                        }
                        if (i4 == 0) {
                            i5 = 100;
                        } else if (i4 == 2) {
                            i5 = 101;
                        } else {
                            c = 0;
                            i6 = 101;
                            if (i4 == 3) {
                                File j4 = bc4.j(5);
                                if (j4 != null) {
                                    e0(j4.getAbsolutePath(), i9, null, h71Var2);
                                }
                                iArr[c] = iArr[c] + 1;
                                o77Var.run();
                            }
                            if (i11 != i2) {
                                this.F = n0(gm.O0(), 1);
                            } else {
                                if (i4 == i3) {
                                    this.f = n0(bc4.j(i3), 5);
                                    this.n = n0(bc4.j(i3), i3);
                                } else {
                                    if (i4 == 1) {
                                        this.s = n0(bc4.j(1), i9);
                                    } else if (i4 == 6) {
                                        this.w = n0(bc4.j(6), i9);
                                    } else if (i4 == 3) {
                                        if (i9 == 1) {
                                            long n0 = n0(bc4.j(3), i9);
                                            this.r = n0;
                                            this.r = n0(bc4.j(5), i9) + n0;
                                        } else {
                                            long n02 = n0(bc4.j(3), i9);
                                            this.x = n02;
                                            this.x = n0(bc4.j(5), i9) + n02;
                                        }
                                    } else if (i4 == 0) {
                                        long n03 = n0(bc4.j(0), i9);
                                        this.y = n03;
                                        this.y = n0(bc4.j(100), i9) + n03;
                                    } else if (i4 == 2) {
                                        long n04 = n0(bc4.j(2), i9);
                                        this.E = n04;
                                        this.E = n0(bc4.j(i6), i9) + n04;
                                    } else if (i4 == 100) {
                                        i3 = 4;
                                        this.G = n0(new File(bc4.j(4), "acache"), i9);
                                        long n05 = n0(bc4.j(4), 3);
                                        this.h = n05;
                                        this.G += n05;
                                        z2 = true;
                                    }
                                    i3 = 4;
                                }
                                z2 = true;
                                j2 = j;
                                i3 = 4;
                            }
                        }
                        File j5 = bc4.j(i5);
                        i6 = 101;
                        if (j5 != null) {
                            e0(j5.getAbsolutePath(), i9, null, h71Var2);
                        }
                        c = 0;
                        iArr[0] = iArr[0] + 1;
                        o77Var.run();
                        if (i4 == 3) {
                        }
                        if (i11 != i2) {
                        }
                    }
                    j2 = j;
                }
                i2 = 9;
                i9 = 0;
                if (i4 != -1) {
                }
                j2 = j;
            } else {
                zArr = zArr2;
                i3 = i9;
                z = false;
            }
            i11++;
            i9 = i3;
            zArr2 = zArr;
            i7 = 2;
            i8 = 3;
        }
        long j6 = this.f + this.n + this.F + this.E + this.s + this.y + this.r + this.x + this.G + this.w;
        k0 = Long.valueOf(j6);
        this.H = j6;
        j0 = System.currentTimeMillis();
        Arrays.fill(zArr2, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        this.I = statFs.getBlockCountLong() * blockSizeLong;
        this.J = availableBlocksLong * blockSizeLong;
        if (z) {
            lc4 lc4Var = bc4.G(this.currentAccount).d;
            lc4Var.f.clear();
            lc4Var.h(new a14((Object) lc4Var, (byte) 12));
        }
        bc4.G(this.currentAccount).i();
        gm.c3(new i71((byte) 0, j2, (jm7) this, (Object) o71Var, z2));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        t10 t10Var = new t10(this, (byte) 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, hla.class, j3b.class, jf5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.b, 0, new Class[]{j3b.class}, new String[]{"paintFill"}, (Drawable[]) null, (bnb) null, cmb.Jj));
        int i = cmb.x6;
        arrayList.add(new cnb(this.b, 0, new Class[]{j3b.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.g5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Xj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ak));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.bk));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ck));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.dk));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ek));
        return arrayList;
    }

    public final void h0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131748528, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131748530, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        kt6.t("LocalDatabaseClearText2", null, 2131748529, new Object[]{gm.i0(this.e, false, false)}, spannableStringBuilder);
        heVar.U = spannableStringBuilder;
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131752602, null), new s51((byte) 1, this, z));
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public final void i0() {
        if (this.e0.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131752035, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752032, null);
        alertDialog$Builder.j(jb6.M0(2131752038, null), new d71(this, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : gm.B(cmb.w0(null, cmb.Z6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        fja fjaVar;
        return this.N == null || motionEvent == null || (fjaVar = this.c0) == null || !fjaVar.c() || this.c0.o(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(File file, int i, LongSparseArray longSparseArray, c81 c81Var) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (i0) {
                return;
            }
            if (file2.isDirectory()) {
                k0(file2, i, longSparseArray, c81Var);
            } else if (!file2.getName().equals(".nomedia")) {
                kc4 e = getFileLoader().d.e(file2, null);
                String lowerCase = file2.getName().toLowerCase();
                int i2 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i;
                b81 b81Var = new b81(file2);
                long length = file2.length();
                b81Var.c = length;
                byte b = i2;
                if (e != null) {
                    b81Var.b = e.a;
                    b81Var.g = e.b;
                    int i3 = e.c;
                    b81Var.h = i3;
                    b = i2;
                    if (i3 == 23) {
                        b = i2;
                        if (length > 0) {
                            b = 7;
                        }
                    }
                }
                b81Var.d = b;
                long j = b81Var.b;
                if (j != 0) {
                    s71 s71Var = (s71) longSparseArray.get(j, null);
                    s71 s71Var2 = s71Var;
                    if (s71Var == null) {
                        s71 s71Var3 = new s71(b81Var.b);
                        longSparseArray.put(b81Var.b, s71Var3);
                        s71Var2 = s71Var3;
                    }
                    s71Var2.a(b81Var, b);
                }
                if (b != 6) {
                    c81Var.e(b).add(b81Var);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        int i;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i2 >= arrayList.size()) {
                break;
            }
            u71 u71Var = (u71) arrayList.get(i2);
            if (u71Var.a == 11 && !u71Var.i && (i = u71Var.f) >= 0) {
                zArr2[i] = true;
            }
            i2++;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (!zArr2[i3] && !zArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        c81 c81Var = this.e0;
        if (c81Var == null || c81Var.j.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.e0.d();
            k71 k71Var = this.N;
            if (k71Var != null) {
                k71Var.f(false);
                this.N.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().b(this, nm7.P4);
        this.e = cf7.Y(this.currentAccount).Q();
        Utilities.e.c(new e71(this, (byte) 2));
        this.b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.P4);
        try {
            he heVar = this.c;
            if (heVar != null) {
                heVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        u0(i2, i4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        yb0 yb0Var;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (yb0Var = FilesMigrationService.e) == null) {
                return;
            }
            yb0Var.D0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a8 a8Var = this.d0;
            if (a8Var != null) {
                a8Var.setIconColor(cmb.w0(null, cmb.o7, false));
            }
            wf3 wf3Var = this.a0;
            if (wf3Var != null) {
                wf3Var.s0(cmb.w0(null, cmb.g5, false));
            }
            try {
                a8 a8Var2 = this.d0;
                if (a8Var2 != null) {
                    a8Var2.setTextColor(cmb.w0(null, cmb.p7, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.h0) {
            this.h0 = true;
            nm7.e().k(nm7.v4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void p0(he heVar) {
        bc4.G(this.currentAccount).i();
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q0(boolean z, long j, o71 o71Var) {
        if (z) {
            fn5.z().f();
        }
        byte b = 1;
        try {
            he heVar = this.c;
            if (heVar != null) {
                heVar.dismiss();
                this.c = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        getMediaDataController().A0.b();
        gm.d3(new fu((Object) this, j, (byte) 5), 150L);
        hs6.d0(this.currentAccount).w(true);
        lc4 lc4Var = getFileLoader().d;
        lc4Var.d();
        lc4Var.a.c(new e71(this, b));
        o71Var.run();
    }

    public final void r0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        he heVar = new he(3, null, getParentActivity());
        this.c = heVar;
        heVar.j0 = false;
        heVar.q(500L);
        oc7 r1 = oc7.r1(this.currentAccount);
        r1.G1.b();
        r1.C1.b();
        r1.D1.b();
        r1.E1.b();
        r1.F1.b();
        if (z) {
            cf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new xd7(messagesStorage, (byte) 12));
        } else {
            cf7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new xd7(messagesStorage2, (byte) 16));
        }
    }

    public final /* synthetic */ void s0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        z0();
        this.fragmentView.invalidate();
    }

    public final void u0(int i, int i2) {
        this.Q = i;
        this.R = i2;
        fv fvVar = this.b;
        if (fvVar != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2;
            int x = b10.x(48.0f, i, -gm.L(8.0f));
            int x2 = b10.x(48.0f, i2, -gm.L(8.0f));
            gm.v3(fvVar, 0, x, 0, x2);
            fvVar.setPadding(0, (currentActionBarHeight + i) - x, 0, i2 - x2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = gm.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                this.c0.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                fja fjaVar = this.c0;
                fjaVar.C();
                fjaVar.requestLayout();
                fjaVar.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final long v0(int i) {
        switch (i) {
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

    public final void w0(View view) {
        int i;
        int i2;
        int i3;
        boolean o0 = o0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (o0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                u71 u71Var = (u71) arrayList.get(i4);
                if (u71Var.a != 11 || u71Var.i || (i3 = u71Var.f) < 0 || !zArr[i3]) {
                }
            }
            xx0.E.a();
            if (view != null) {
                gm.A3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                u71 u71Var2 = (u71) arrayList.get(i5);
                if (u71Var2.a == 11 && !u71Var2.i && (i2 = u71Var2.f) >= 0) {
                    zArr2[i2] = true;
                }
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (!zArr2[i6]) {
                    zArr[i6] = !o0;
                }
            }
        } else {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                u71 u71Var3 = (u71) arrayList.get(i7);
                if (u71Var3.a == 11 && u71Var3.i && (i = u71Var3.f) >= 0) {
                    zArr[i] = !o0;
                }
            }
        }
        for (int i8 = 0; i8 < this.b.getChildCount(); i8++) {
            View childAt = this.b.getChildAt(i8);
            if (childAt instanceof oh2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u71 u71Var4 = (u71) arrayList.get(R);
                    if (u71Var4.a == 11) {
                        int i9 = u71Var4.f;
                        if (i9 < 0) {
                            ((oh2) childAt).c(!o0, true);
                        } else {
                            ((oh2) childAt).c(zArr[i9], true);
                        }
                    }
                }
            }
        }
        y0();
    }

    public final void x0() {
        String G;
        int size = this.e0.j.size();
        k71 k71Var = this.N;
        boolean z = false;
        if (size <= 0) {
            k71Var.f(false);
            return;
        }
        if (k71Var != null) {
            boolean isEmpty = this.e0.l.isEmpty();
            c81 c81Var = this.e0;
            if (isEmpty) {
                G = jb6.G(c81Var.j.size(), "Files", Integer.valueOf(this.e0.j.size()));
            } else {
                ArrayList arrayList = c81Var.b;
                int size2 = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    s71 s71Var = (s71) obj;
                    if (this.e0.l.contains(Long.valueOf(s71Var.a))) {
                        i += s71Var.b;
                    }
                }
                int size3 = this.e0.j.size() - i;
                c81 c81Var2 = this.e0;
                G = size3 > 0 ? kt6.o(jb6.G(c81Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size())), ", ", jb6.G(size3, "Files", Integer.valueOf(size3))) : jb6.G(c81Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size()));
            }
            String i02 = gm.i0(this.e0.k, false, false);
            rja rjaVar = this.simpleActionBar;
            boolean z2 = jb6.a0;
            rjaVar.q();
            rjaVar.f.c(i02, !z2 && rjaVar.y() && rjaVar.H, true);
            rja rjaVar2 = this.simpleActionBar;
            boolean z3 = jb6.a0;
            rjaVar2.q();
            if (rjaVar2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    io ioVar = new io(rjaVar2.getContext(), true, true, true);
                    rjaVar2.h = ioVar;
                    ioVar.setTextSize(gm.L(14.0f));
                    rjaVar2.h.setTextColor(rjaVar2.f0);
                    rjaVar2.h.setGravity(19);
                    rjaVar2.h.setEllipsizeByGradient(true);
                    rjaVar2.h.b(0.35f, 320L, d53.h);
                    rjaVar2.addView(rjaVar2.h, rjaVar2.indexOfChild(rjaVar2.b), qoe.e(-1, 18, 51));
                    rjaVar2.l();
                }
                this.N.f(true);
            }
            io ioVar2 = rjaVar2.h;
            boolean z4 = (ioVar2 == null || ioVar2.getTag() == null) ? false : true;
            rjaVar2.h.c(G, !z3 && rjaVar2.y() && rjaVar2.H, true);
            rjaVar2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            io ioVar3 = rjaVar2.h;
            if (ioVar3 != null && ioVar3.getTag() != null) {
                z = true;
            }
            if (z4 != z) {
                rjaVar2.requestLayout();
            }
            this.N.f(true);
        }
    }

    public final void y0() {
        v71 v71Var = this.X;
        boolean z = false;
        if (v71Var != null) {
            if (this.L) {
                v71Var.e(-1L, true, new x61[0]);
            } else if (this.H > 0) {
                x61[] x61VarArr = new x61[11];
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    u71 u71Var = (u71) arrayList.get(i);
                    if (u71Var.a == 11) {
                        int i2 = u71Var.f;
                        boolean[] zArr = this.d;
                        if (i2 >= 0) {
                            long j = u71Var.g;
                            boolean z2 = zArr[i2];
                            x61 x61Var = new x61();
                            x61Var.c = j;
                            x61Var.b = z2;
                            x61VarArr[i2] = x61Var;
                        } else if (this.M) {
                            long j2 = u71Var.g;
                            boolean z3 = zArr[10];
                            x61 x61Var2 = new x61();
                            x61Var2.c = j2;
                            x61Var2.b = z3;
                            x61VarArr[10] = x61Var2;
                        }
                    }
                    i++;
                }
                if (System.currentTimeMillis() - this.b0 < 80) {
                    this.X.n.e(true, 0.0f);
                }
                this.X.e(this.H, true, x61VarArr);
            } else {
                v71Var.e(0L, true, new x61[0]);
            }
        }
        q71 q71Var = this.Z;
        if (q71Var == null || this.L) {
            return;
        }
        y71 y71Var = q71Var.d;
        boolean[] zArr2 = y71Var.d;
        long j3 = (zArr2[0] ? y71Var.y : 0L) + (zArr2[1] ? y71Var.E : 0L) + (zArr2[2] ? y71Var.r : 0L) + (zArr2[3] ? y71Var.x : 0L) + (zArr2[4] ? y71Var.s : 0L) + (zArr2[5] ? y71Var.w : 0L) + (zArr2[6] ? y71Var.G : 0L) + (zArr2[7] ? y71Var.f : 0L) + (zArr2[8] ? y71Var.n : 0L) + (zArr2[9] ? y71Var.F : 0L);
        ArrayList arrayList2 = y71Var.g0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList2.size()) {
                z = true;
                break;
            }
            u71 u71Var2 = (u71) arrayList2.get(i3);
            if (u71Var2.a == 11) {
                int i4 = u71Var2.f;
                if (i4 < 0) {
                    i4 = zArr2.length - 1;
                }
                if (!zArr2[i4]) {
                    break;
                }
            }
            i3++;
        }
        q71Var.a(j3, z);
    }

    public final void z0() {
        View view = this.P;
        if (view == null) {
            return;
        }
        fn0 fn0Var = this.T;
        float f = fn0Var == null ? 0.0f : fn0Var.e;
        fn0 fn0Var2 = this.U;
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - (fn0Var2 != null ? fn0Var2.e : 0.0f)) * gm.L(44.0f)));
    }
}
