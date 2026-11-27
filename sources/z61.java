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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z61 extends e implements fn7 {
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
    public l61 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public fm0 T;
    public fm0 U;
    public int[] V;
    public float[] W;
    public w61 X;
    public n61 Y;
    public r61 Z;
    public x61 a;
    public df3 a0;
    public gu b;
    public long b0;
    public id c;
    public wka c0;
    public final boolean[] d;
    public b8 d0;
    public long e;
    public d71 e0;
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

    public z61() {
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

    public static void c0(pcc pccVar) {
        Long l = k0;
        if (l != null) {
            pccVar.a(l);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new jn0(pccVar, (byte) 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, int i, int[] iArr, i61 i61Var) {
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
                    if (i61Var != null) {
                        i61Var.a(Float.valueOf(i2 / i02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    d0(qd4.p(str, "/", name), i, iArr, i61Var);
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

    public static void l0(n82 n82Var) {
        Long l;
        Long l2 = l0;
        if (l2 == null || (l = m0) == null) {
            Utilities.f.c(new fv0(n82Var, (byte) 12));
        } else {
            n82Var.a(l2, l);
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
        if (str == null || xb4.j(i) == null) {
            return false;
        }
        return str.contains(xb4.j(i).getAbsolutePath());
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
        x61 x61Var;
        l61 l61Var;
        wka wkaVar;
        d71 d71Var;
        wka wkaVar2 = this.c0;
        boolean z3 = wkaVar2 != null && wkaVar2.f0;
        boolean z4 = (!z || System.currentTimeMillis() - this.b0 >= 80) ? z : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new v61(9, (String) null));
        arrayList2.add(new v61(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new v61(12, (String) null));
            arrayList2.add(new v61(12, (String) null));
            arrayList2.add(new v61(12, (String) null));
            arrayList2.add(new v61(12, (String) null));
            arrayList2.add(new v61(12, (String) null));
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                arrayList3.add(v61.b(0, this.y, ob6.M0(2131748517, null), aob.ck));
            }
            if (this.E > 0) {
                arrayList3.add(v61.b(1, this.E, ob6.M0(2131748513, null), aob.Yj));
            }
            if (this.r > 0) {
                arrayList3.add(v61.b(2, this.r, ob6.M0(2131748522, null), aob.Zj));
            }
            if (this.x > 0) {
                arrayList3.add(v61.b(3, this.x, ob6.M0(2131748519, null), aob.gk));
            }
            if (this.s > 0) {
                arrayList3.add(v61.b(4, this.s, ob6.M0(2131748529, null), aob.dk));
            }
            if (this.w > 0) {
                arrayList3.add(v61.b(5, this.w, ob6.M0(2131748514, null), aob.ak));
            }
            if (this.G > 0) {
                arrayList3.add(v61.b(6, this.G, ob6.M0(2131748515, null), aob.ek));
            }
            if (this.f > 0) {
                arrayList3.add(v61.b(7, this.f, ob6.M0(2131748516, null), aob.hk));
            }
            if (this.n > 0) {
                arrayList3.add(v61.b(8, this.n, ob6.M0(2131748520, null), aob.gk));
            }
            if (this.F > 0) {
                arrayList3.add(v61.b(9, this.F, ob6.M0(2131748521, null), aob.bk));
            }
            if (arrayList3.isEmpty()) {
                z2 = false;
                if (z2) {
                    arrayList2.size();
                    arrayList2.add(new v61(13, (String) null));
                    String M0 = ob6.M0(2131744471, null);
                    v61 v61Var = new v61(1);
                    v61Var.e = M0;
                    arrayList2.add(v61Var);
                }
                arrayList2.add(new v61(3, ob6.M0(2131753860, null)));
                arrayList2.add(new v61(0, 0));
                arrayList2.add(new v61(1, 0));
                arrayList2.add(new v61(2, 0));
                arrayList2.add(new v61(3, 0));
                String M02 = ob6.M0(2131748812, null);
                v61 v61Var2 = new v61(1);
                v61Var2.e = M02;
                arrayList2.add(v61Var2);
                if (this.I > 0) {
                    arrayList2.add(new v61(3, ob6.M0(2131748424, null)));
                    arrayList2.add(new v61(14));
                    String M03 = ob6.M0(2131748423, null);
                    v61 v61Var3 = new v61(1);
                    v61Var3.e = M03;
                    arrayList2.add(v61Var3);
                }
                this.S = -1;
                if (z2 && (d71Var = this.e0) != null && !d71Var.h()) {
                    this.S = arrayList2.size();
                    arrayList2.add(new v61(8, (String) null));
                }
                x61Var = this.a;
                if (x61Var != null) {
                    if (z4) {
                        x61Var.E(arrayList, arrayList2);
                    } else {
                        x61Var.f();
                    }
                }
                l61Var = this.N;
                if (l61Var != null) {
                    l61Var.d();
                }
                wkaVar = this.c0;
                if (wkaVar == null) {
                    if (z3 && this.S != -1) {
                        wkaVar.a();
                    }
                    wka wkaVar3 = this.c0;
                    wkaVar3.C();
                    wkaVar3.requestLayout();
                    wkaVar3.invalidate();
                    return;
                }
                return;
            }
            Collections.sort(arrayList3, new ta((byte) 13));
            ((v61) arrayList3.get(arrayList3.size() - 1)).j = true;
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
            hl.a3(fArr, iArr);
            if (arrayList3.size() > 5) {
                arrayList2.addAll(arrayList3.subList(0, 4));
                long j = 0;
                int i2 = 0;
                for (int i3 = 4; i3 < arrayList3.size(); i3++) {
                    ((v61) arrayList3.get(i3)).i = true;
                    j += ((v61) arrayList3.get(i3)).g;
                    i2 += this.V[((v61) arrayList3.get(i3)).f];
                }
                this.V[10] = i2;
                arrayList2.add(v61.b(-1, j, ob6.M0(2131748518, null), aob.bk));
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
        arrayList2.add(new v61(3, ob6.M0(2131753860, null)));
        arrayList2.add(new v61(0, 0));
        arrayList2.add(new v61(1, 0));
        arrayList2.add(new v61(2, 0));
        arrayList2.add(new v61(3, 0));
        String M022 = ob6.M0(2131748812, null);
        v61 v61Var22 = new v61(1);
        v61Var22.e = M022;
        arrayList2.add(v61Var22);
        if (this.I > 0) {
        }
        this.S = -1;
        if (z2) {
            this.S = arrayList2.size();
            arrayList2.add(new v61(8, (String) null));
        }
        x61Var = this.a;
        if (x61Var != null) {
        }
        l61Var = this.N;
        if (l61Var != null) {
        }
        wkaVar = this.c0;
        if (wkaVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.N6));
        hashSet.add(Integer.valueOf(aob.M6));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        byte b = 0;
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setTitle(ob6.M0(2131744473, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 14));
        this.simpleActionBar.r().b(1, 0, ob6.M0(2131752630, null), null, 0, null).getTextView().setTextColor(aob.w0(null, aob.Fi, false));
        byte b2 = 2;
        byte b3 = 3;
        b8 e = this.simpleActionBar.v().a(2, R.drawable.ic_ab_other).e(3, R.drawable.msg_delete, ob6.M0(2131752041, null));
        this.d0 = e;
        int i = aob.p7;
        e.setIconColor(aob.w0(null, i, false));
        this.d0.setTextColor(aob.w0(null, aob.q7, false));
        this.d0.h(0.12f, i);
        boolean z = f11.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131752041, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new x61(this, context, b);
        wka wkaVar = new wka(context);
        this.c0 = wkaVar;
        wkaVar.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new zm9((Object) this, (byte) 12));
        wka wkaVar2 = this.c0;
        this.fragmentView = wkaVar2;
        yob.h(aob.a7, null, wkaVar2);
        gu guVar = new gu(b3, context, this);
        this.b = guVar;
        guVar.s1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        gu guVar2 = this.b;
        wka wkaVar3 = this.c0;
        wkaVar3.getClass();
        byte b4 = 5;
        guVar2.setLayoutManager(new of2((Object) wkaVar3, b4));
        this.c0.v(this.b, new f61(this, b2));
        this.b.setAdapter(this.a);
        k61 k61Var = new k61(this);
        k61Var.n(350L);
        k43 k43Var = k43.h;
        k61Var.o(k43Var);
        k61Var.C = false;
        k61Var.m = false;
        this.b.setItemAnimator(k61Var);
        this.b.setOnItemClickListener(new f61(this, b3));
        this.b.j(new y(this, (byte) 11));
        View view = new View(context);
        this.P = view;
        wkaVar2.addView(view, tre.e(-1, 0, 48));
        this.T = new fm0(0, new f61(this, (byte) 4), k43Var, 380L, false);
        this.U = new fm0(1, new f61(this, b4), k43Var, 380L, false);
        z0();
        getBaseSimpleGlass().h(wkaVar2, this.b, this.simpleActionBar, this.resourceProvider);
        l61 l61Var = new l61(this, context, this, this.glassEngine, this.c0);
        this.N = l61Var;
        l61Var.E = true;
        FrameLayout frameLayout = l61Var.c;
        hl.B2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        jl0 c = getBaseSimpleGlass().c.c(this.O, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.q(hl.L(9.66f));
        c.r(hl.L(18.0f));
        frameLayout.setBackground(c);
        wka wkaVar4 = this.c0;
        l61 l61Var2 = this.N;
        vic viewPager = l61Var2.getViewPager();
        l61 l61Var3 = this.N;
        Objects.requireNonNull(l61Var3);
        wkaVar4.y(l61Var2, viewPager, new tg0(l61Var3, (byte) 21));
        this.c0.z(this.O);
        this.O.setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new wz4(this));
        this.N.setCacheModel(this.e0);
        getBaseSimpleGlass().o = new dg0(this, new tg0(wkaVar2, (byte) 20), b3);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        t0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.O4) {
            try {
                id idVar = this.c;
                if (idVar != null) {
                    idVar.dismiss();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = kf7.a0(this.currentAccount).S();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131752041, null));
                    this.d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    public final void e0(t61 t61Var, j35[] j35VarArr, d71 d71Var) {
        u61 u61Var;
        HashSet hashSet;
        long j;
        long j2;
        j35 j35Var;
        id idVar = new id(3, null, getParentActivity());
        idVar.j0 = false;
        idVar.q(500L);
        HashSet hashSet2 = new HashSet();
        long j3 = this.H;
        int i = 0;
        while (i < 8) {
            if ((j35VarArr == null || ((j35Var = j35VarArr[i]) != null && j35Var.b)) && (u61Var = (u61) t61Var.d.get(i)) != null) {
                hashSet2.addAll(u61Var.b);
                hashSet = hashSet2;
                long j4 = t61Var.c;
                long j5 = u61Var.a;
                t61Var.c = j4 - j5;
                this.H -= j5;
                this.J += j5;
                t61Var.d.delete(i);
                if (i == 0) {
                    this.y -= u61Var.a;
                } else if (i == 1) {
                    this.E -= u61Var.a;
                } else if (i == 2) {
                    this.r -= u61Var.a;
                } else if (i == 3) {
                    this.x -= u61Var.a;
                } else if (i == 4) {
                    this.s -= u61Var.a;
                } else if (i == 5) {
                    this.G -= u61Var.a;
                } else {
                    char c = 7;
                    if (i == 7) {
                        int i2 = 0;
                        while (i2 < u61Var.b.size()) {
                            c71 c71Var = (c71) u61Var.b.get(i2);
                            String absolutePath = ((c71) u61Var.b.get(i2)).a.getAbsolutePath();
                            char c2 = s0(6, absolutePath) ? c : (s0(0, absolutePath) || s0(100, absolutePath)) ? (char) 0 : (s0(2, absolutePath) || s0(101, absolutePath)) ? (char) 1 : (char) 6;
                            int i3 = i2;
                            if (c2 == c) {
                                j2 = j3;
                                this.w -= c71Var.c;
                            } else {
                                j2 = j3;
                                if (c2 == 0) {
                                    this.y -= c71Var.c;
                                } else if (c2 == 1) {
                                    this.E -= c71Var.c;
                                } else {
                                    this.f -= c71Var.c;
                                }
                            }
                            i2 = i3 + 1;
                            j3 = j2;
                            c = 7;
                        }
                    } else {
                        j = j3;
                        this.f -= u61Var.a;
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
        if (t61Var.d.size() == 0) {
            this.e0.b.remove(t61Var);
        }
        A0(true);
        if (d71Var != null) {
            Iterator it = d71Var.j.iterator();
            while (it.hasNext()) {
                c71 c71Var2 = (c71) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(c71Var2)) {
                    long j7 = this.H;
                    long j8 = c71Var2.c;
                    this.H = j7 - j8;
                    this.J += j8;
                    hashSet4.add(c71Var2);
                    t61Var.b(c71Var2);
                    byte b = c71Var2.d;
                    if (b == 0) {
                        this.y -= c71Var2.c;
                    } else if (b == 1) {
                        this.E -= c71Var2.c;
                    } else if (b == 2) {
                        this.r -= c71Var2.c;
                    } else if (b == 3) {
                        this.x -= c71Var2.c;
                    } else if (b == 4) {
                        this.s -= c71Var2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            c71 c71Var3 = (c71) it2.next();
            d71 d71Var2 = this.e0;
            if (d71Var2.j.remove(c71Var3)) {
                d71Var2.k -= c71Var3.c;
            }
            ArrayList e = d71Var2.e(c71Var3.d);
            if (e != null) {
                e.remove(c71Var3);
            }
        }
        v21 Q = d31.b0(this).Q(R.raw.ic_delete, 36, ob6.a0(null, null, 2131752626, hl.i0(j6 - this.H, false, false)));
        Q.s = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        ic4 ic4Var = getFileLoader().d;
        ic4Var.getClass();
        ic4Var.h(new vx3(ic4Var, arrayList, (byte) 22));
        getFileLoader().c();
        getFileLoader().getClass();
        xb4.K.c(new tu0(this, arrayList, idVar, (byte) 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(p pVar, p61 p61Var) {
        boolean[] zArr;
        int i;
        int i2;
        int i3;
        i61 i61Var;
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
        i61 i61Var2 = new i61(pVar, iArr, i10, b);
        r77 r77Var = new r77((Object) pVar, (Object) iArr, i10, currentTimeMillis, (byte) 4);
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
                    i61Var = i61Var2;
                    i = 7;
                    i4 = 0;
                } else if (i11 == 1) {
                    j = j2 + this.E;
                    i4 = i7;
                    i3 = i9;
                    i61Var = i61Var2;
                    i = 7;
                } else {
                    if (i11 == i7) {
                        j = j2 + this.r;
                        i4 = i8;
                        i3 = i9;
                        i61Var = i61Var2;
                        i = 7;
                        i2 = 9;
                        i9 = 1;
                    } else {
                        if (i11 == i8) {
                            j = j2 + this.x;
                            i4 = i8;
                            i3 = i9;
                            i61Var = i61Var2;
                            i = 7;
                            i9 = i7;
                        } else if (i11 == i9) {
                            j = j2 + this.s;
                            i3 = i9;
                            i61Var = i61Var2;
                            i = 7;
                            i2 = 9;
                            i9 = 0;
                            i4 = 1;
                        } else if (i11 == 5) {
                            j = j2 + this.w;
                            i3 = i9;
                            i61Var = i61Var2;
                            i = 7;
                            i4 = 6;
                        } else if (i11 == 6) {
                            j = j2 + this.G;
                            i3 = i9;
                            i61Var = i61Var2;
                            i = 7;
                            i4 = 100;
                        } else {
                            i = 7;
                            if (i11 == 7) {
                                j = j2 + this.f;
                                i4 = i9;
                                i3 = i4;
                                i61Var = i61Var2;
                                i2 = 9;
                                i9 = 5;
                            } else if (i11 == 8) {
                                j = j2 + this.n;
                                i4 = i9;
                                i3 = i4;
                                i61Var = i61Var2;
                            } else {
                                i2 = 9;
                                i3 = i9;
                                i61Var = i61Var2;
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
                        i61Var2 = i61Var;
                    } else {
                        if (i11 == i) {
                            try {
                                file = new File(a.h(), "rasterized/wallpaper");
                                file.mkdirs();
                            } catch (Exception e) {
                                try {
                                    cc4.g(e, true);
                                    file = null;
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                            }
                            d0(file.getAbsolutePath(), 0, null, null);
                        }
                        File O0 = i11 == i2 ? hl.O0() : i4 == 100 ? new File(xb4.j(i3), "acache") : xb4.j(i4);
                        if (O0 != null) {
                            i61Var2 = i61Var;
                            d0(O0.getAbsolutePath(), i9, null, i61Var2);
                        } else {
                            i61Var2 = i61Var;
                        }
                        iArr[0] = iArr[0] + 1;
                        r77Var.run();
                        if (i4 == 100) {
                            File j3 = xb4.j(i3);
                            if (j3 != null) {
                                d0(j3.getAbsolutePath(), 3, null, i61Var2);
                            }
                            iArr[0] = iArr[0] + 1;
                            r77Var.run();
                        }
                        if (i4 == 0) {
                            i5 = 100;
                        } else if (i4 == 2) {
                            i5 = 101;
                        } else {
                            c = 0;
                            i6 = 101;
                            if (i4 == 3) {
                                File j4 = xb4.j(5);
                                if (j4 != null) {
                                    d0(j4.getAbsolutePath(), i9, null, i61Var2);
                                }
                                iArr[c] = iArr[c] + 1;
                                r77Var.run();
                            }
                            if (i11 != i2) {
                                this.F = m0(hl.O0(), 1);
                            } else {
                                if (i4 == i3) {
                                    this.f = m0(xb4.j(i3), 5);
                                    this.n = m0(xb4.j(i3), i3);
                                } else {
                                    if (i4 == 1) {
                                        this.s = m0(xb4.j(1), i9);
                                    } else if (i4 == 6) {
                                        this.w = m0(xb4.j(6), i9);
                                    } else if (i4 == 3) {
                                        if (i9 == 1) {
                                            long m02 = m0(xb4.j(3), i9);
                                            this.r = m02;
                                            this.r = m0(xb4.j(5), i9) + m02;
                                        } else {
                                            long m03 = m0(xb4.j(3), i9);
                                            this.x = m03;
                                            this.x = m0(xb4.j(5), i9) + m03;
                                        }
                                    } else if (i4 == 0) {
                                        long m04 = m0(xb4.j(0), i9);
                                        this.y = m04;
                                        this.y = m0(xb4.j(100), i9) + m04;
                                    } else if (i4 == 2) {
                                        long m05 = m0(xb4.j(2), i9);
                                        this.E = m05;
                                        this.E = m0(xb4.j(i6), i9) + m05;
                                    } else if (i4 == 100) {
                                        i3 = 4;
                                        this.G = m0(new File(xb4.j(4), "acache"), i9);
                                        long m06 = m0(xb4.j(4), 3);
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
                        File j5 = xb4.j(i5);
                        i6 = 101;
                        if (j5 != null) {
                            d0(j5.getAbsolutePath(), i9, null, i61Var2);
                        }
                        c = 0;
                        iArr[0] = iArr[0] + 1;
                        r77Var.run();
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
            ic4 ic4Var = xb4.G(this.currentAccount).d;
            ic4Var.f.clear();
            ic4Var.h(new lw3((Object) ic4Var, (byte) 18));
        }
        xb4.G(this.currentAccount).i();
        hl.c3(new j61((byte) 0, j2, (fn7) this, (Object) p61Var, z2));
    }

    public final void g0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131748525, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131748527, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        qu6.s("LocalDatabaseClearText2", null, 2131748526, new Object[]{hl.i0(this.e, false, false)}, spannableStringBuilder);
        idVar.U = spannableStringBuilder;
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131752630, null), new t41((byte) 1, this, z));
        showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        u00 u00Var = new u00(this, (byte) 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, zma.class, e5b.class, mf5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 0, new Class[]{e5b.class}, new String[]{"paintFill"}, (Drawable[]) null, (zob) null, aob.Kj));
        int i = aob.y6;
        arrayList.add(new apb(this.b, 0, new Class[]{e5b.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.h5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Yj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Zj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ak));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.bk));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ck));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.dk));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ek));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.fk));
        return arrayList;
    }

    public final void h0() {
        if (this.e0.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131752063, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752060, null);
        alertDialog$Builder.j(ob6.M0(2131752066, null), new f61(this, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : hl.B(aob.w0(null, aob.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wka wkaVar;
        return this.N == null || motionEvent == null || (wkaVar = this.c0) == null || !wkaVar.c() || this.c0.o(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(File file, int i, LongSparseArray longSparseArray, d71 d71Var) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (i0) {
                return;
            }
            if (file2.isDirectory()) {
                j0(file2, i, longSparseArray, d71Var);
            } else if (!file2.getName().equals(".nomedia")) {
                hc4 e = getFileLoader().d.e(file2, null);
                String lowerCase = file2.getName().toLowerCase();
                int i2 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i;
                c71 c71Var = new c71(file2);
                long length = file2.length();
                c71Var.c = length;
                byte b = i2;
                if (e != null) {
                    c71Var.b = e.a;
                    c71Var.g = e.b;
                    int i3 = e.c;
                    c71Var.h = i3;
                    b = i2;
                    if (i3 == 23) {
                        b = i2;
                        if (length > 0) {
                            b = 7;
                        }
                    }
                }
                c71Var.d = b;
                long j = c71Var.b;
                if (j != 0) {
                    t61 t61Var = (t61) longSparseArray.get(j, null);
                    t61 t61Var2 = t61Var;
                    if (t61Var == null) {
                        t61 t61Var3 = new t61(c71Var.b);
                        longSparseArray.put(c71Var.b, t61Var3);
                        t61Var2 = t61Var3;
                    }
                    t61Var2.a(c71Var, b);
                }
                if (b != 6) {
                    d71Var.e(b).add(c71Var);
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
            v61 v61Var = (v61) arrayList.get(i2);
            if (v61Var.a == 11 && !v61Var.i && (i = v61Var.f) >= 0) {
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(id idVar) {
        xb4.G(this.currentAccount).i();
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        d71 d71Var = this.e0;
        if (d71Var == null || d71Var.j.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.e0.d();
            l61 l61Var = this.N;
            if (l61Var != null) {
                l61Var.f(false);
                this.N.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().b(this, jn7.O4);
        this.e = kf7.a0(this.currentAccount).S();
        Utilities.e.c(new e61(this, (byte) 2));
        this.b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.O4);
        try {
            id idVar = this.c;
            if (idVar != null) {
                idVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        t0(i2, i4);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ab0 ab0Var;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (ab0Var = FilesMigrationService.e) == null) {
                return;
            }
            ab0Var.E0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            b8 b8Var = this.d0;
            if (b8Var != null) {
                b8Var.setIconColor(aob.w0(null, aob.p7, false));
            }
            df3 df3Var = this.a0;
            if (df3Var != null) {
                df3Var.s0(aob.w0(null, aob.h5, false));
            }
            try {
                b8 b8Var2 = this.d0;
                if (b8Var2 != null) {
                    b8Var2.setTextColor(aob.w0(null, aob.q7, false));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.h0) {
            this.h0 = true;
            jn7.e().k(jn7.u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void p0(boolean z, long j, p61 p61Var) {
        if (z) {
            in5.z().f();
        }
        byte b = 1;
        try {
            id idVar = this.c;
            if (idVar != null) {
                idVar.dismiss();
                this.c = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        getMediaDataController().A0.b();
        hl.d3(new kt((Object) this, j, (byte) 5), 150L);
        ls6.d0(this.currentAccount).w(true);
        ic4 ic4Var = getFileLoader().d;
        ic4Var.d();
        ic4Var.a.c(new e61(this, b));
        p61Var.run();
    }

    public final void q0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        id idVar = new id(3, null, getParentActivity());
        this.c = idVar;
        idVar.j0 = false;
        idVar.q(500L);
        uc7 s1 = uc7.s1(this.currentAccount);
        s1.G1.b();
        s1.C1.b();
        s1.D1.b();
        s1.E1.b();
        s1.F1.b();
        if (z) {
            kf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new hd7(messagesStorage, (byte) 17));
        } else {
            kf7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new hd7(messagesStorage2, (byte) 21));
        }
    }

    public final /* synthetic */ void r0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        z0();
        this.fragmentView.invalidate();
    }

    public final void t0(int i, int i2) {
        this.Q = i;
        this.R = i2;
        gu guVar = this.b;
        if (guVar != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2;
            int y = c00.y(48.0f, i, -hl.L(8.0f));
            int y2 = c00.y(48.0f, i2, -hl.L(8.0f));
            hl.v3(guVar, 0, y, 0, y2);
            guVar.setPadding(0, (currentActionBarHeight + i) - y, 0, i2 - y2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = hl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                this.c0.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                wka wkaVar = this.c0;
                wkaVar.C();
                wkaVar.requestLayout();
                wkaVar.invalidate();
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(View view) {
        int i;
        int i2;
        int i3;
        boolean n0 = n0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (n0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                v61 v61Var = (v61) arrayList.get(i4);
                if (v61Var.a != 11 || v61Var.i || (i3 = v61Var.f) < 0 || !zArr[i3]) {
                }
            }
            yw0.E.a();
            if (view != null) {
                hl.A3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                v61 v61Var2 = (v61) arrayList.get(i5);
                if (v61Var2.a == 11 && !v61Var2.i && (i2 = v61Var2.f) >= 0) {
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
                v61 v61Var3 = (v61) arrayList.get(i7);
                if (v61Var3.a == 11 && v61Var3.i && (i = v61Var3.f) >= 0) {
                    zArr[i] = !n0;
                }
            }
        }
        for (int i8 = 0; i8 < this.b.getChildCount(); i8++) {
            View childAt = this.b.getChildAt(i8);
            if (childAt instanceof sg2) {
                this.b.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    v61 v61Var4 = (v61) arrayList.get(S);
                    if (v61Var4.a == 11) {
                        int i9 = v61Var4.f;
                        if (i9 < 0) {
                            ((sg2) childAt).c(!n0, true);
                        } else {
                            ((sg2) childAt).c(zArr[i9], true);
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
        l61 l61Var = this.N;
        boolean z = false;
        if (size <= 0) {
            l61Var.f(false);
            return;
        }
        if (l61Var != null) {
            boolean isEmpty = this.e0.l.isEmpty();
            d71 d71Var = this.e0;
            if (isEmpty) {
                G = ob6.G(d71Var.j.size(), "Files", Integer.valueOf(this.e0.j.size()));
            } else {
                ArrayList arrayList = d71Var.b;
                int size2 = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    t61 t61Var = (t61) obj;
                    if (this.e0.l.contains(Long.valueOf(t61Var.a))) {
                        i += t61Var.b;
                    }
                }
                int size3 = this.e0.j.size() - i;
                d71 d71Var2 = this.e0;
                G = size3 > 0 ? qd4.y(ob6.G(d71Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size())), ", ", ob6.G(size3, "Files", Integer.valueOf(size3))) : ob6.G(d71Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size()));
            }
            String i02 = hl.i0(this.e0.k, false, false);
            jla jlaVar = this.simpleActionBar;
            boolean z2 = ob6.a0;
            jlaVar.r();
            jlaVar.f.c(i02, !z2 && jlaVar.A() && jlaVar.M, true);
            jla jlaVar2 = this.simpleActionBar;
            boolean z3 = ob6.a0;
            jlaVar2.r();
            if (jlaVar2.h == null) {
                if (!TextUtils.isEmpty(G)) {
                    in inVar = new in(jlaVar2.getContext(), true, true, true);
                    jlaVar2.h = inVar;
                    inVar.setTextSize(hl.L(14.0f));
                    jlaVar2.h.setTextColor(jlaVar2.l0);
                    jlaVar2.h.setGravity(19);
                    jlaVar2.h.setEllipsizeByGradient(true);
                    jlaVar2.h.b(0.35f, 320L, k43.h);
                    jlaVar2.addView(jlaVar2.h, jlaVar2.indexOfChild(jlaVar2.b), tre.e(-1, 18, 51));
                    jlaVar2.l();
                }
                this.N.f(true);
            }
            in inVar2 = jlaVar2.h;
            boolean z4 = (inVar2 == null || inVar2.getTag() == null) ? false : true;
            jlaVar2.h.c(G, !z3 && jlaVar2.A() && jlaVar2.M, true);
            jlaVar2.h.setTag(TextUtils.isEmpty(G) ? null : 1);
            in inVar3 = jlaVar2.h;
            if (inVar3 != null && inVar3.getTag() != null) {
                z = true;
            }
            if (z4 != z) {
                jlaVar2.requestLayout();
            }
            this.N.f(true);
        }
    }

    public final void y0() {
        w61 w61Var = this.X;
        boolean z = false;
        if (w61Var != null) {
            if (this.L) {
                w61Var.e(-1L, true, new y51[0]);
            } else if (this.H > 0) {
                y51[] y51VarArr = new y51[11];
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    v61 v61Var = (v61) arrayList.get(i);
                    if (v61Var.a == 11) {
                        int i2 = v61Var.f;
                        boolean[] zArr = this.d;
                        if (i2 >= 0) {
                            long j = v61Var.g;
                            boolean z2 = zArr[i2];
                            y51 y51Var = new y51();
                            y51Var.c = j;
                            y51Var.b = z2;
                            y51VarArr[i2] = y51Var;
                        } else if (this.M) {
                            long j2 = v61Var.g;
                            boolean z3 = zArr[10];
                            y51 y51Var2 = new y51();
                            y51Var2.c = j2;
                            y51Var2.b = z3;
                            y51VarArr[10] = y51Var2;
                        }
                    }
                    i++;
                }
                if (System.currentTimeMillis() - this.b0 < 80) {
                    this.X.n.e(true, 0.0f);
                }
                this.X.e(this.H, true, y51VarArr);
            } else {
                w61Var.e(0L, true, new y51[0]);
            }
        }
        r61 r61Var = this.Z;
        if (r61Var == null || this.L) {
            return;
        }
        z61 z61Var = r61Var.d;
        boolean[] zArr2 = z61Var.d;
        long j3 = (zArr2[0] ? z61Var.y : 0L) + (zArr2[1] ? z61Var.E : 0L) + (zArr2[2] ? z61Var.r : 0L) + (zArr2[3] ? z61Var.x : 0L) + (zArr2[4] ? z61Var.s : 0L) + (zArr2[5] ? z61Var.w : 0L) + (zArr2[6] ? z61Var.G : 0L) + (zArr2[7] ? z61Var.f : 0L) + (zArr2[8] ? z61Var.n : 0L) + (zArr2[9] ? z61Var.F : 0L);
        ArrayList arrayList2 = z61Var.g0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList2.size()) {
                z = true;
                break;
            }
            v61 v61Var2 = (v61) arrayList2.get(i3);
            if (v61Var2.a == 11) {
                int i4 = v61Var2.f;
                if (i4 < 0) {
                    i4 = zArr2.length - 1;
                }
                if (!zArr2[i4]) {
                    break;
                }
            }
            i3++;
        }
        r61Var.a(j3, z);
    }

    public final void z0() {
        View view = this.P;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.T;
        float f = fm0Var == null ? 0.0f : fm0Var.e;
        fm0 fm0Var2 = this.U;
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - (fm0Var2 != null ? fm0Var2.e : 0.0f)) * hl.L(44.0f)));
    }
}
