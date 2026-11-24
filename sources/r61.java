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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r61 extends d implements gk7 {
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
    public d61 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public fm0 T;
    public fm0 U;
    public int[] V;
    public float[] W;
    public o61 X;
    public f61 Y;
    public j61 Z;
    public p61 a;
    public je3 a0;
    public fu b;
    public long b0;
    public hd c;
    public dha c0;
    public final boolean[] d;
    public a8 d0;
    public long e;
    public v61 e0;
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

    public r61() {
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

    public static void c0(p8c p8cVar) {
        Long l = k0;
        if (l != null) {
            p8cVar.a(l);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new mn0(p8cVar, (byte) 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, int i, int[] iArr, a61 a61Var) {
        File[] listFiles;
        int i02 = i0(i, str);
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
                    if (a61Var != null) {
                        a61Var.a(Float.valueOf(i2 / i02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    d0(tb4.p(str, "/", name), i, iArr, a61Var);
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
    public static int i0(int i, String str) {
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
                i2 = file2.isDirectory() ? i2 + i0(i, str + "/" + name) : i2 + 1;
            }
        }
        return i2;
    }

    public static String k0(float f) {
        if (f < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void l0(w72 w72Var) {
        Long l;
        Long l2 = l0;
        if (l2 == null || (l = m0) == null) {
            Utilities.f.c(new nv0(w72Var, (byte) 10));
        } else {
            w72Var.a(l2, l);
        }
    }

    public static long m0(File file, int i) {
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

    public static boolean s0(int i, String str) {
        if (str == null || ba4.j(i) == null) {
            return false;
        }
        return str.contains(ba4.j(i).getAbsolutePath());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.M6));
        hashSet.add(Integer.valueOf(bkb.L6));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        byte b = 0;
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setTitle(k96.M0(2131744579, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 13));
        this.simpleActionBar.q().b(1, 0, k96.M0(2131752637, null), null, 0, null).getTextView().setTextColor(bkb.w0(null, bkb.Ei, false));
        byte b2 = 3;
        a8 e = this.simpleActionBar.t().a(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, k96.M0(2131752064, null));
        this.d0 = e;
        int i = bkb.o7;
        e.setIconColor(bkb.w0(null, i, false));
        this.d0.setTextColor(bkb.w0(null, bkb.p7, false));
        this.d0.h(0.12f, i);
        boolean z = w01.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k96.M0(2131752064, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new p61(this, context, b);
        dha dhaVar = new dha(context);
        this.c0 = dhaVar;
        dhaVar.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new lj9((Object) this, (byte) 12));
        dha dhaVar2 = this.c0;
        this.fragmentView = dhaVar2;
        zkb.h(bkb.Z6, null, dhaVar2);
        fu fuVar = new fu(b2, context, this);
        this.b = fuVar;
        fuVar.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        fu fuVar2 = this.b;
        dha dhaVar3 = this.c0;
        dhaVar3.getClass();
        byte b3 = 5;
        fuVar2.setLayoutManager(new xe2((Object) dhaVar3, b3));
        this.c0.v(this.b, new w51(this, b2));
        this.b.setAdapter(this.a);
        c61 c61Var = new c61(this);
        c61Var.n(350L);
        s33 s33Var = s33.h;
        c61Var.o(s33Var);
        c61Var.C = false;
        c61Var.m = false;
        this.b.setItemAnimator(c61Var);
        this.b.setOnItemClickListener(new w51(this, (byte) 4));
        this.b.j(new y(this, (byte) 11));
        View view = new View(context);
        this.P = view;
        dhaVar2.addView(view, nme.e(-1, 0, 48));
        this.T = new fm0(0, new w51(this, b3), s33Var, 380L, false);
        this.U = new fm0(1, new w51(this, b), s33Var, 380L, false);
        y0();
        getBaseSimpleGlass().f(dhaVar2, this.b, this.simpleActionBar, this.resourceProvider);
        d61 d61Var = new d61(this, context, this, this.glassEngine, this.c0);
        this.N = d61Var;
        d61Var.E = true;
        FrameLayout frameLayout = d61Var.c;
        gl.B2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        il0 c = getBaseSimpleGlass().c.c(this.O, null, false);
        c.p(nod.l(this.resourceProvider));
        c.q(gl.L(9.66f));
        c.r(gl.L(18.0f));
        frameLayout.setBackground(c);
        dha dhaVar4 = this.c0;
        d61 d61Var2 = this.N;
        wec viewPager = d61Var2.getViewPager();
        d61 d61Var3 = this.N;
        Objects.requireNonNull(d61Var3);
        dhaVar4.y(d61Var2, viewPager, new sg0(d61Var3, (byte) 20));
        this.c0.z(this.O);
        this.O.setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new qx4(this));
        this.N.setCacheModel(this.e0);
        getBaseSimpleGlass().o = new cg0(this, new sg0(dhaVar2, (byte) 19), b2);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        t0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N4) {
            try {
                hd hdVar = this.c;
                if (hdVar != null) {
                    hdVar.dismiss();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = ad7.Y(this.currentAccount).Q();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) k96.M0(2131752064, null));
                    this.d0.setText(spannableStringBuilder);
                }
                z0(true);
            }
        }
    }

    public final void e0(l61 l61Var, f15[] f15VarArr, v61 v61Var) {
        byte b;
        m61 m61Var;
        HashSet hashSet;
        long j;
        long j2;
        f15 f15Var;
        hd hdVar = new hd(3, null, getParentActivity());
        hdVar.j0 = false;
        hdVar.q(500L);
        HashSet hashSet2 = new HashSet();
        long j3 = this.H;
        int i = 0;
        while (true) {
            b = 8;
            if (i >= 8) {
                break;
            }
            if ((f15VarArr == null || ((f15Var = f15VarArr[i]) != null && f15Var.b)) && (m61Var = (m61) l61Var.d.get(i)) != null) {
                hashSet2.addAll(m61Var.b);
                hashSet = hashSet2;
                long j4 = l61Var.c;
                long j5 = m61Var.a;
                l61Var.c = j4 - j5;
                this.H -= j5;
                this.J += j5;
                l61Var.d.delete(i);
                if (i == 0) {
                    this.y -= m61Var.a;
                } else if (i == 1) {
                    this.E -= m61Var.a;
                } else if (i == 2) {
                    this.r -= m61Var.a;
                } else if (i == 3) {
                    this.x -= m61Var.a;
                } else if (i == 4) {
                    this.s -= m61Var.a;
                } else if (i == 5) {
                    this.G -= m61Var.a;
                } else {
                    char c = 7;
                    if (i == 7) {
                        int i2 = 0;
                        while (i2 < m61Var.b.size()) {
                            u61 u61Var = (u61) m61Var.b.get(i2);
                            String absolutePath = ((u61) m61Var.b.get(i2)).a.getAbsolutePath();
                            char c2 = s0(6, absolutePath) ? c : (s0(0, absolutePath) || s0(100, absolutePath)) ? (char) 0 : (s0(2, absolutePath) || s0(101, absolutePath)) ? (char) 1 : (char) 6;
                            int i3 = i2;
                            if (c2 == c) {
                                j2 = j3;
                                this.w -= u61Var.c;
                            } else {
                                j2 = j3;
                                if (c2 == 0) {
                                    this.y -= u61Var.c;
                                } else if (c2 == 1) {
                                    this.E -= u61Var.c;
                                } else {
                                    this.f -= u61Var.c;
                                }
                            }
                            i2 = i3 + 1;
                            j3 = j2;
                            c = 7;
                        }
                    } else {
                        j = j3;
                        this.f -= m61Var.a;
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
        if (l61Var.d.size() == 0) {
            this.e0.b.remove(l61Var);
        }
        z0(true);
        if (v61Var != null) {
            Iterator it = v61Var.j.iterator();
            while (it.hasNext()) {
                u61 u61Var2 = (u61) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(u61Var2)) {
                    long j7 = this.H;
                    long j8 = u61Var2.c;
                    this.H = j7 - j8;
                    this.J += j8;
                    hashSet4.add(u61Var2);
                    l61Var.b(u61Var2);
                    byte b2 = u61Var2.d;
                    if (b2 == 0) {
                        this.y -= u61Var2.c;
                    } else if (b2 == 1) {
                        this.E -= u61Var2.c;
                    } else if (b2 == 2) {
                        this.r -= u61Var2.c;
                    } else if (b2 == 3) {
                        this.x -= u61Var2.c;
                    } else if (b2 == 4) {
                        this.s -= u61Var2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            u61 u61Var3 = (u61) it2.next();
            v61 v61Var2 = this.e0;
            if (v61Var2.j.remove(u61Var3)) {
                v61Var2.k -= u61Var3.c;
            }
            ArrayList e = v61Var2.e(u61Var3.d);
            if (e != null) {
                e.remove(u61Var3);
            }
        }
        m21 Q = u21.b0(this).Q(R.raw.ic_delete, 36, k96.a0(null, null, 2131752633, gl.i0(j6 - this.H, false, false)));
        Q.r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        la4 la4Var = getFileLoader().d;
        la4Var.getClass();
        la4Var.h(new eu3(la4Var, arrayList, (byte) 25));
        getFileLoader().c();
        getFileLoader().getClass();
        ba4.K.c(new fv0(this, arrayList, hdVar, b));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(p pVar, h61 h61Var) {
        boolean[] zArr;
        int i;
        int i2;
        int i3;
        a61 a61Var;
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
        a61 a61Var2 = new a61(pVar, iArr, i10, b);
        o57 o57Var = new o57((Object) pVar, (Object) iArr, i10, currentTimeMillis, (byte) 4);
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
                    a61Var = a61Var2;
                    i = 7;
                    i4 = 0;
                } else if (i11 == 1) {
                    j = j2 + this.E;
                    i4 = i7;
                    i3 = i9;
                    a61Var = a61Var2;
                    i = 7;
                } else {
                    if (i11 == i7) {
                        j = j2 + this.r;
                        i4 = i8;
                        i3 = i9;
                        a61Var = a61Var2;
                        i = 7;
                        i2 = 9;
                        i9 = 1;
                    } else {
                        if (i11 == i8) {
                            j = j2 + this.x;
                            i4 = i8;
                            i3 = i9;
                            a61Var = a61Var2;
                            i = 7;
                            i9 = i7;
                        } else if (i11 == i9) {
                            j = j2 + this.s;
                            i3 = i9;
                            a61Var = a61Var2;
                            i = 7;
                            i2 = 9;
                            i9 = 0;
                            i4 = 1;
                        } else if (i11 == 5) {
                            j = j2 + this.w;
                            i3 = i9;
                            a61Var = a61Var2;
                            i = 7;
                            i4 = 6;
                        } else if (i11 == 6) {
                            j = j2 + this.G;
                            i3 = i9;
                            a61Var = a61Var2;
                            i = 7;
                            i4 = 100;
                        } else {
                            i = 7;
                            if (i11 == 7) {
                                j = j2 + this.f;
                                i4 = i9;
                                i3 = i4;
                                a61Var = a61Var2;
                                i2 = 9;
                                i9 = 5;
                            } else if (i11 == 8) {
                                j = j2 + this.n;
                                i4 = i9;
                                i3 = i4;
                                a61Var = a61Var2;
                            } else {
                                i2 = 9;
                                i3 = i9;
                                a61Var = a61Var2;
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
                        a61Var2 = a61Var;
                    } else {
                        if (i11 == i) {
                            try {
                                file = new File(a.h(), "rasterized/wallpaper");
                                file.mkdirs();
                            } catch (Exception e) {
                                try {
                                    fa4.g(e, true);
                                    file = null;
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                            }
                            d0(file.getAbsolutePath(), 0, null, null);
                        }
                        File O0 = i11 == i2 ? gl.O0() : i4 == 100 ? new File(ba4.j(i3), "acache") : ba4.j(i4);
                        if (O0 != null) {
                            a61Var2 = a61Var;
                            d0(O0.getAbsolutePath(), i9, null, a61Var2);
                        } else {
                            a61Var2 = a61Var;
                        }
                        iArr[0] = iArr[0] + 1;
                        o57Var.run();
                        if (i4 == 100) {
                            File j3 = ba4.j(i3);
                            if (j3 != null) {
                                d0(j3.getAbsolutePath(), 3, null, a61Var2);
                            }
                            iArr[0] = iArr[0] + 1;
                            o57Var.run();
                        }
                        if (i4 == 0) {
                            i5 = 100;
                        } else if (i4 == 2) {
                            i5 = 101;
                        } else {
                            c = 0;
                            i6 = 101;
                            if (i4 == 3) {
                                File j4 = ba4.j(5);
                                if (j4 != null) {
                                    d0(j4.getAbsolutePath(), i9, null, a61Var2);
                                }
                                iArr[c] = iArr[c] + 1;
                                o57Var.run();
                            }
                            if (i11 != i2) {
                                this.F = m0(gl.O0(), 1);
                            } else {
                                if (i4 == i3) {
                                    this.f = m0(ba4.j(i3), 5);
                                    this.n = m0(ba4.j(i3), i3);
                                } else {
                                    if (i4 == 1) {
                                        this.s = m0(ba4.j(1), i9);
                                    } else if (i4 == 6) {
                                        this.w = m0(ba4.j(6), i9);
                                    } else if (i4 == 3) {
                                        if (i9 == 1) {
                                            long m02 = m0(ba4.j(3), i9);
                                            this.r = m02;
                                            this.r = m0(ba4.j(5), i9) + m02;
                                        } else {
                                            long m03 = m0(ba4.j(3), i9);
                                            this.x = m03;
                                            this.x = m0(ba4.j(5), i9) + m03;
                                        }
                                    } else if (i4 == 0) {
                                        long m04 = m0(ba4.j(0), i9);
                                        this.y = m04;
                                        this.y = m0(ba4.j(100), i9) + m04;
                                    } else if (i4 == 2) {
                                        long m05 = m0(ba4.j(2), i9);
                                        this.E = m05;
                                        this.E = m0(ba4.j(i6), i9) + m05;
                                    } else if (i4 == 100) {
                                        i3 = 4;
                                        this.G = m0(new File(ba4.j(4), "acache"), i9);
                                        long m06 = m0(ba4.j(4), 3);
                                        this.h = m06;
                                        this.G += m06;
                                        z2 = true;
                                    }
                                    i3 = 4;
                                }
                                z2 = true;
                                j2 = j;
                                i3 = 4;
                            }
                        }
                        File j5 = ba4.j(i5);
                        i6 = 101;
                        if (j5 != null) {
                            d0(j5.getAbsolutePath(), i9, null, a61Var2);
                        }
                        c = 0;
                        iArr[0] = iArr[0] + 1;
                        o57Var.run();
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
            la4 la4Var = ba4.G(this.currentAccount).d;
            la4Var.f.clear();
            la4Var.h(new s54((Object) la4Var, (byte) 5));
        }
        ba4.G(this.currentAccount).i();
        gl.c3(new b61((byte) 0, j2, (gk7) this, (Object) h61Var, z2));
    }

    public final void g0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131748579, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) k96.M0(2131748581, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        ls6.s("LocalDatabaseClearText2", null, 2131748580, new Object[]{gl.i0(this.e, false, false)}, spannableStringBuilder);
        hdVar.U = spannableStringBuilder;
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131752637, null), new l41((byte) 1, this, z));
        showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        t00 t00Var = new t00(this, (byte) 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, fja.class, h1b.class, ld5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 0, new Class[]{h1b.class}, new String[]{"paintFill"}, (Drawable[]) null, (alb) null, bkb.Jj));
        int i = bkb.x6;
        arrayList.add(new blb(this.b, 0, new Class[]{h1b.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.g5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Xj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ak));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.bk));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ck));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.dk));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ek));
        return arrayList;
    }

    public final void h0() {
        if (this.e0.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131752086, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752083, null);
        alertDialog$Builder.j(k96.M0(2131752089, null), new w51(this, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : gl.B(bkb.w0(null, bkb.Z6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        dha dhaVar;
        return this.N == null || motionEvent == null || (dhaVar = this.c0) == null || !dhaVar.c() || this.c0.o(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(File file, int i, LongSparseArray longSparseArray, v61 v61Var) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (i0) {
                return;
            }
            if (file2.isDirectory()) {
                j0(file2, i, longSparseArray, v61Var);
            } else if (!file2.getName().equals(".nomedia")) {
                ka4 e = getFileLoader().d.e(file2, null);
                String lowerCase = file2.getName().toLowerCase();
                int i2 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i;
                u61 u61Var = new u61(file2);
                long length = file2.length();
                u61Var.c = length;
                byte b = i2;
                if (e != null) {
                    u61Var.b = e.a;
                    u61Var.g = e.b;
                    int i3 = e.c;
                    u61Var.h = i3;
                    b = i2;
                    if (i3 == 23) {
                        b = i2;
                        if (length > 0) {
                            b = 7;
                        }
                    }
                }
                u61Var.d = b;
                long j = u61Var.b;
                if (j != 0) {
                    l61 l61Var = (l61) longSparseArray.get(j, null);
                    l61 l61Var2 = l61Var;
                    if (l61Var == null) {
                        l61 l61Var3 = new l61(u61Var.b);
                        longSparseArray.put(u61Var.b, l61Var3);
                        l61Var2 = l61Var3;
                    }
                    l61Var2.a(u61Var, b);
                }
                if (b != 6) {
                    v61Var.e(b).add(u61Var);
                }
            }
        }
    }

    public final boolean n0() {
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
            n61 n61Var = (n61) arrayList.get(i2);
            if (n61Var.a == 11 && !n61Var.i && (i = n61Var.f) >= 0) {
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
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(hd hdVar) {
        ba4.G(this.currentAccount).i();
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        v61 v61Var = this.e0;
        if (v61Var == null || v61Var.j.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.e0.d();
            d61 d61Var = this.N;
            if (d61Var != null) {
                d61Var.f(false);
                this.N.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().b(this, kk7.N4);
        this.e = ad7.Y(this.currentAccount).Q();
        Utilities.e.c(new x51(this, (byte) 2));
        this.b0 = System.currentTimeMillis();
        z0(false);
        x0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.N4);
        try {
            hd hdVar = this.c;
            if (hdVar != null) {
                hdVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        t0(i2, i4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ya0 ya0Var;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (ya0Var = FilesMigrationService.e) == null) {
                return;
            }
            ya0Var.D0();
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
                a8Var.setIconColor(bkb.w0(null, bkb.o7, false));
            }
            je3 je3Var = this.a0;
            if (je3Var != null) {
                je3Var.s0(bkb.w0(null, bkb.g5, false));
            }
            try {
                a8 a8Var2 = this.d0;
                if (a8Var2 != null) {
                    a8Var2.setTextColor(bkb.w0(null, bkb.p7, false));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.h0) {
            this.h0 = true;
            kk7.e().k(kk7.t4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void p0(boolean z, long j, h61 h61Var) {
        if (z) {
            fl5.z().f();
        }
        byte b = 1;
        try {
            hd hdVar = this.c;
            if (hdVar != null) {
                hdVar.dismiss();
                this.c = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        getMediaDataController().A0.b();
        gl.d3(new et((Object) this, j, (byte) 5), 150L);
        hq6.d0(this.currentAccount).w(true);
        la4 la4Var = getFileLoader().d;
        la4Var.d();
        la4Var.a.c(new x51(this, b));
        h61Var.run();
    }

    public final void q0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        hd hdVar = new hd(3, null, getParentActivity());
        this.c = hdVar;
        hdVar.j0 = false;
        hdVar.q(500L);
        na7 q1 = na7.q1(this.currentAccount);
        q1.G1.b();
        q1.C1.b();
        q1.D1.b();
        q1.E1.b();
        q1.F1.b();
        if (z) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new vb7(messagesStorage, (byte) 12));
        } else {
            ad7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new vb7(messagesStorage2, (byte) 16));
        }
    }

    public final /* synthetic */ void r0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        y0();
        this.fragmentView.invalidate();
    }

    public final void t0(int i, int i2) {
        this.Q = i;
        this.R = i2;
        fu fuVar = this.b;
        if (fuVar != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2;
            int x = b00.x(48.0f, i, -gl.L(8.0f));
            int x2 = b00.x(48.0f, i2, -gl.L(8.0f));
            gl.v3(fuVar, 0, x, 0, x2);
            fuVar.setPadding(0, (currentActionBarHeight + i) - x, 0, i2 - x2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = gl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
                this.P.setLayoutParams(layoutParams);
                y0();
            }
            if (this.c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                this.c0.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                dha dhaVar = this.c0;
                dhaVar.C();
                dhaVar.requestLayout();
                dhaVar.invalidate();
            }
        }
    }

    public final long u0(int i) {
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

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(View view) {
        int i;
        int i2;
        int i3;
        boolean n0 = n0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (n0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                n61 n61Var = (n61) arrayList.get(i4);
                if (n61Var.a != 11 || n61Var.i || (i3 = n61Var.f) < 0 || !zArr[i3]) {
                }
            }
            pw0.E.a();
            if (view != null) {
                gl.A3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                n61 n61Var2 = (n61) arrayList.get(i5);
                if (n61Var2.a == 11 && !n61Var2.i && (i2 = n61Var2.f) >= 0) {
                    zArr2[i2] = true;
                }
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (!zArr2[i6]) {
                    zArr[i6] = !n0;
                }
            }
        } else {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                n61 n61Var3 = (n61) arrayList.get(i7);
                if (n61Var3.a == 11 && n61Var3.i && (i = n61Var3.f) >= 0) {
                    zArr[i] = !n0;
                }
            }
        }
        for (int i8 = 0; i8 < this.b.getChildCount(); i8++) {
            View childAt = this.b.getChildAt(i8);
            if (childAt instanceof ag2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    n61 n61Var4 = (n61) arrayList.get(R);
                    if (n61Var4.a == 11) {
                        int i9 = n61Var4.f;
                        if (i9 < 0) {
                            ((ag2) childAt).c(!n0, true);
                        } else {
                            ((ag2) childAt).c(zArr[i9], true);
                        }
                    }
                }
            }
        }
        x0();
    }

    public final void w0() {
        String G;
        int size = this.e0.j.size();
        d61 d61Var = this.N;
        boolean z = false;
        if (size <= 0) {
            d61Var.f(false);
            return;
        }
        if (d61Var != null) {
            boolean isEmpty = this.e0.l.isEmpty();
            v61 v61Var = this.e0;
            if (isEmpty) {
                G = k96.G(v61Var.j.size(), "Files", Integer.valueOf(this.e0.j.size()));
            } else {
                ArrayList arrayList = v61Var.b;
                int size2 = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    l61 l61Var = (l61) obj;
                    if (this.e0.l.contains(Long.valueOf(l61Var.a))) {
                        i += l61Var.b;
                    }
                }
                int size3 = this.e0.j.size() - i;
                v61 v61Var2 = this.e0;
                G = size3 > 0 ? tb4.y(k96.G(v61Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size())), ", ", k96.G(size3, "Files", Integer.valueOf(size3))) : k96.G(v61Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size()));
            }
            String i02 = gl.i0(this.e0.k, false, false);
            pha phaVar = this.simpleActionBar;
            boolean z2 = k96.a0;
            phaVar.q();
            phaVar.f.c(i02, !z2 && phaVar.y() && phaVar.H, true);
            pha phaVar2 = this.simpleActionBar;
            boolean z3 = k96.a0;
            phaVar2.q();
            if (phaVar2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    hn hnVar = new hn(phaVar2.getContext(), true, true, true);
                    phaVar2.h = hnVar;
                    hnVar.setTextSize(gl.L(14.0f));
                    phaVar2.h.setTextColor(phaVar2.f0);
                    phaVar2.h.setGravity(19);
                    phaVar2.h.setEllipsizeByGradient(true);
                    phaVar2.h.b(0.35f, 320L, s33.h);
                    phaVar2.addView(phaVar2.h, phaVar2.indexOfChild(phaVar2.b), nme.e(-1, 18, 51));
                    phaVar2.k();
                }
                this.N.f(true);
            }
            hn hnVar2 = phaVar2.h;
            boolean z4 = (hnVar2 == null || hnVar2.getTag() == null) ? false : true;
            phaVar2.h.c(G, !z3 && phaVar2.y() && phaVar2.H, true);
            phaVar2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            hn hnVar3 = phaVar2.h;
            if (hnVar3 != null && hnVar3.getTag() != null) {
                z = true;
            }
            if (z4 != z) {
                phaVar2.requestLayout();
            }
            this.N.f(true);
        }
    }

    public final void x0() {
        o61 o61Var = this.X;
        boolean z = false;
        if (o61Var != null) {
            if (this.L) {
                o61Var.e(-1L, true, new q51[0]);
            } else if (this.H > 0) {
                q51[] q51VarArr = new q51[11];
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    n61 n61Var = (n61) arrayList.get(i);
                    if (n61Var.a == 11) {
                        int i2 = n61Var.f;
                        boolean[] zArr = this.d;
                        if (i2 >= 0) {
                            long j = n61Var.g;
                            boolean z2 = zArr[i2];
                            q51 q51Var = new q51();
                            q51Var.c = j;
                            q51Var.b = z2;
                            q51VarArr[i2] = q51Var;
                        } else if (this.M) {
                            long j2 = n61Var.g;
                            boolean z3 = zArr[10];
                            q51 q51Var2 = new q51();
                            q51Var2.c = j2;
                            q51Var2.b = z3;
                            q51VarArr[10] = q51Var2;
                        }
                    }
                    i++;
                }
                if (System.currentTimeMillis() - this.b0 < 80) {
                    this.X.n.e(true, 0.0f);
                }
                this.X.e(this.H, true, q51VarArr);
            } else {
                o61Var.e(0L, true, new q51[0]);
            }
        }
        j61 j61Var = this.Z;
        if (j61Var == null || this.L) {
            return;
        }
        r61 r61Var = j61Var.d;
        boolean[] zArr2 = r61Var.d;
        long j3 = (zArr2[0] ? r61Var.y : 0L) + (zArr2[1] ? r61Var.E : 0L) + (zArr2[2] ? r61Var.r : 0L) + (zArr2[3] ? r61Var.x : 0L) + (zArr2[4] ? r61Var.s : 0L) + (zArr2[5] ? r61Var.w : 0L) + (zArr2[6] ? r61Var.G : 0L) + (zArr2[7] ? r61Var.f : 0L) + (zArr2[8] ? r61Var.n : 0L) + (zArr2[9] ? r61Var.F : 0L);
        ArrayList arrayList2 = r61Var.g0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList2.size()) {
                z = true;
                break;
            }
            n61 n61Var2 = (n61) arrayList2.get(i3);
            if (n61Var2.a == 11) {
                int i4 = n61Var2.f;
                if (i4 < 0) {
                    i4 = zArr2.length - 1;
                }
                if (!zArr2[i4]) {
                    break;
                }
            }
            i3++;
        }
        j61Var.a(j3, z);
    }

    public final void y0() {
        View view = this.P;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.T;
        float f = fm0Var == null ? 0.0f : fm0Var.e;
        fm0 fm0Var2 = this.U;
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - (fm0Var2 != null ? fm0Var2.e : 0.0f)) * gl.L(44.0f)));
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
    public final void z0(boolean z) {
        boolean z2;
        float[] fArr;
        p61 p61Var;
        d61 d61Var;
        dha dhaVar;
        v61 v61Var;
        dha dhaVar2 = this.c0;
        boolean z3 = dhaVar2 != null && dhaVar2.f0;
        boolean z4 = (!z || System.currentTimeMillis() - this.b0 >= 80) ? z : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new n61(9, (String) null));
        arrayList2.add(new n61(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new n61(12, (String) null));
            arrayList2.add(new n61(12, (String) null));
            arrayList2.add(new n61(12, (String) null));
            arrayList2.add(new n61(12, (String) null));
            arrayList2.add(new n61(12, (String) null));
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(n61.b(0, this.y, k96.M0(2131748571, null), bkb.bk));
            }
            if (this.E > 0) {
                arrayList3.add(n61.b(1, this.E, k96.M0(2131748567, null), bkb.Xj));
            }
            if (this.r > 0) {
                arrayList3.add(n61.b(2, this.r, k96.M0(2131748576, null), bkb.Yj));
            }
            if (this.x > 0) {
                arrayList3.add(n61.b(3, this.x, k96.M0(2131748573, null), bkb.fk));
            }
            if (this.s > 0) {
                arrayList3.add(n61.b(4, this.s, k96.M0(2131748583, null), bkb.ck));
            }
            if (this.w > 0) {
                arrayList3.add(n61.b(5, this.w, k96.M0(2131748568, null), bkb.Zj));
            }
            if (this.G > 0) {
                arrayList3.add(n61.b(6, this.G, k96.M0(2131748569, null), bkb.dk));
            }
            if (this.f > 0) {
                arrayList3.add(n61.b(7, this.f, k96.M0(2131748570, null), bkb.gk));
            }
            if (this.n > 0) {
                arrayList3.add(n61.b(8, this.n, k96.M0(2131748574, null), bkb.fk));
            }
            if (this.F > 0) {
                arrayList3.add(n61.b(9, this.F, k96.M0(2131748575, null), bkb.ak));
            }
            if (arrayList3.isEmpty()) {
                z2 = false;
                if (z2) {
                    arrayList2.size();
                    arrayList2.add(new n61(13, (String) null));
                    String M0 = k96.M0(2131744577, null);
                    n61 n61Var = new n61(1);
                    n61Var.e = M0;
                    arrayList2.add(n61Var);
                }
                arrayList2.add(new n61(3, k96.M0(2131753864, null)));
                arrayList2.add(new n61(0, 0));
                arrayList2.add(new n61(1, 0));
                arrayList2.add(new n61(2, 0));
                arrayList2.add(new n61(3, 0));
                String M02 = k96.M0(2131748866, null);
                n61 n61Var2 = new n61(1);
                n61Var2.e = M02;
                arrayList2.add(n61Var2);
                if (this.I > 0) {
                    arrayList2.add(new n61(3, k96.M0(2131748478, null)));
                    arrayList2.add(new n61(14));
                    String M03 = k96.M0(2131748477, null);
                    n61 n61Var3 = new n61(1);
                    n61Var3.e = M03;
                    arrayList2.add(n61Var3);
                }
                this.S = -1;
                if (z2 && (v61Var = this.e0) != null && !v61Var.h()) {
                    this.S = arrayList2.size();
                    arrayList2.add(new n61(8, (String) null));
                }
                p61Var = this.a;
                if (p61Var != null) {
                    if (z4) {
                        p61Var.E(arrayList, arrayList2);
                    } else {
                        p61Var.f();
                    }
                }
                d61Var = this.N;
                if (d61Var != null) {
                    d61Var.d();
                }
                dhaVar = this.c0;
                if (dhaVar == null) {
                    if (z3 && this.S != -1) {
                        dhaVar.a();
                    }
                    dha dhaVar3 = this.c0;
                    dhaVar3.C();
                    dhaVar3.requestLayout();
                    dhaVar3.invalidate();
                    return;
                }
                return;
            }
            Collections.sort(arrayList3, new sa((byte) 13));
            ((n61) arrayList3.get(arrayList3.size() - 1)).j = true;
            if (this.W == null) {
                this.W = new float[11];
            }
            int i = 0;
            while (true) {
                fArr = this.W;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = u0(i);
                i++;
            }
            int[] iArr = this.V;
            if (iArr == null) {
                iArr = new int[11];
                this.V = iArr;
            }
            gl.a3(fArr, iArr);
            if (arrayList3.size() > 5) {
                arrayList2.addAll(arrayList3.subList(0, 4));
                long j = 0;
                int i2 = 0;
                for (int i3 = 4; i3 < arrayList3.size(); i3++) {
                    ((n61) arrayList3.get(i3)).i = true;
                    j += ((n61) arrayList3.get(i3)).g;
                    i2 += this.V[((n61) arrayList3.get(i3)).f];
                }
                this.V[10] = i2;
                arrayList2.add(n61.b(-1, j, k96.M0(2131748572, null), bkb.ak));
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
        arrayList2.add(new n61(3, k96.M0(2131753864, null)));
        arrayList2.add(new n61(0, 0));
        arrayList2.add(new n61(1, 0));
        arrayList2.add(new n61(2, 0));
        arrayList2.add(new n61(3, 0));
        String M022 = k96.M0(2131748866, null);
        n61 n61Var22 = new n61(1);
        n61Var22.e = M022;
        arrayList2.add(n61Var22);
        if (this.I > 0) {
        }
        this.S = -1;
        if (z2) {
            this.S = arrayList2.size();
            arrayList2.add(new n61(8, (String) null));
        }
        p61Var = this.a;
        if (p61Var != null) {
        }
        d61Var = this.N;
        if (d61Var != null) {
        }
        dhaVar = this.c0;
        if (dhaVar == null) {
        }
    }
}
