package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class w71 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.x5, org.telegram.messenger.ls {
    public FrameLayout A0;
    public n71 A1;
    public org.telegram.ui.Components.z20 B0;
    public n71 B1;
    public AnimatorSet C0;
    public Object C1;
    public final int D;
    public t4 D0;
    public Bitmap D1;
    public final int E;
    public v61 E0;
    public boolean E1;
    public final int F;
    public v61 F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public String H1;
    public final boolean I;
    public AnimatorSet I0;
    public int I1;
    public final long J;
    public AnimatorSet J0;
    public v71 J1;
    public final long K;
    public org.telegram.ui.Components.x61[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.x61[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.ah0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.r0 P1;
    public long Q;
    public f61 Q0;
    public ValueAnimator Q1;
    public a80 R;
    public u71 R0;
    public bi.m5 R1;
    public final org.telegram.ui.ActionBar.r5 S;
    public v4.b0 S0;
    public u61 S1;
    public final org.telegram.ui.ActionBar.r5 T;
    public org.telegram.ui.Cells.n4 T0;
    public final org.telegram.ui.Components.a10 T1;
    public final org.telegram.ui.ActionBar.r5 U;
    public org.telegram.ui.Cells.h0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.r5 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.vp W;
    public final HashMap W0;
    public TL_stories.TL_premium_boostsStatus W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public final Runnable Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final x61 a;
    public boolean a0;
    public int a1;
    public float a2;
    public final int b;
    public fi.p5 b0;
    public int b1;
    public boolean b2;
    public Scroller c;
    public FrameLayout c0;
    public int c1;
    public int c2;
    public final boolean d;
    public TextView d0;
    public int d1;
    public ValueAnimator d2;
    public fi.w2 e;
    public TextView e0;
    public int e1;
    public boolean e2;
    public org.telegram.ui.ActionBar.r0 f;
    public final org.telegram.ui.ActionBar.k6 f0;
    public int f1;
    public TextView f2;
    public final boolean g0;
    public int g1;
    public WeakReference g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public BitmapDrawable h2;
    public final boolean i0;
    public int i1;
    public cc i2;
    public ArrayList j0;
    public int j1;
    public float j2;
    public c5.k k0;
    public int k1;
    public ValueAnimator k2;
    public bi.x5 l0;
    public int l1;
    public UndoView m0;
    public float m1;
    public int n;
    public FrameLayout n0;
    public float n1;
    public org.telegram.ui.Components.qj0 o0;
    public float o1;
    public l4 p0;
    public float p1;
    public org.telegram.ui.Components.q00 q0;
    public o71 q1;
    public Drawable r;
    public org.telegram.messenger.ij r0;
    public org.telegram.ui.Components.wp r1;
    public int s;
    public boolean s0;
    public AnimatorSet s1;
    public org.telegram.ui.ActionBar.k t0;
    public final PorterDuff.Mode t1;
    public org.telegram.ui.ActionBar.l0 u0;
    public int u1;
    public s61 v0;
    public org.telegram.ui.Components.f9 v1;
    public final org.telegram.ui.ActionBar.i6 w;
    public s71 w0;
    public org.telegram.ui.Components.z61 w1;
    public boolean x;
    public final m71[] x0;
    public Bitmap x1;
    public final int y;
    public m71 y0;
    public Bitmap y1;
    public FrameLayout z0;
    public float z1;

    public w71(Object obj, Bitmap bitmap, boolean z9) {
        super(null);
        this.a = new x61(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.S = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.T = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.U = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.V = r5Var4;
        this.Y = -1;
        this.Z = new j61(this, 0);
        this.x0 = new m71[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.m1 = 0.5f;
        this.o1 = 0.0f;
        this.t1 = PorterDuff.Mode.SRC_IN;
        this.z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.a10(getParentActivity(), new z61(this));
        this.U1 = false;
        this.V1 = false;
        this.b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z9;
        if (obj instanceof sc1) {
            sc1 sc1Var = (sc1) obj;
            this.F1 = sc1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = sc1Var.g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = sc1Var.h;
                this.m1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.l6.I.q()) {
                    this.m1 *= -1.0f;
                }
            }
        }
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    public static void Z(w71 w71Var, org.telegram.messenger.e3 e3Var) {
        if (w71Var.getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(23, w71Var.currentAccount, w71Var.getParentActivity(), w71Var, w71Var.a);
        i0Var.A1(e3Var);
        i0Var.z1(w71Var.W1, true);
        i0Var.B1(w71Var.K1);
        if (!w71Var.Z0()) {
            i0Var.I2 = new j61(w71Var, 1);
        }
        w71Var.showDialog(i0Var);
    }

    public static void a0(w71 w71Var) {
        org.telegram.ui.ActionBar.k6 k6Var = org.telegram.ui.ActionBar.l6.M;
        if (k6Var == null) {
            return;
        }
        int i7 = k6Var.Z;
        org.telegram.ui.ActionBar.i6 k10 = i7 >= 0 ? (org.telegram.ui.ActionBar.i6) k6Var.a0.get(i7) : k6Var.k(false);
        if (w71Var.w != null) {
            w71Var.b1();
            org.telegram.ui.ActionBar.l6.z1(w71Var.f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.l6.M != null) {
                org.telegram.ui.ActionBar.l6.O = false;
                org.telegram.ui.ActionBar.l6.P = false;
                org.telegram.ui.ActionBar.l6.M = null;
            }
            org.telegram.ui.ActionBar.l6.u(w71Var.f0, true, w71Var.g0);
            ((ActionBarLayout) w71Var.parentLayout).X(false, false);
        } else {
            ((ActionBarLayout) w71Var.parentLayout).X(false, false);
            File file = new File(w71Var.f0.b);
            org.telegram.ui.ActionBar.k6 k6Var2 = w71Var.f0;
            org.telegram.ui.ActionBar.l6.v(file, k6Var2.a, k6Var2.F, false);
            org.telegram.messenger.qp.s1(w71Var.f0.E).x4(w71Var.f0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", w71Var.f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) w71Var.getParentLayout().getFragmentStack().get(Math.max(0, w71Var.getParentLayout().getFragmentStack().size() - 2));
        w71Var.finishFragment();
        if (w71Var.b == 0) {
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.p4, k6Var, k10, Boolean.valueOf(w71Var.i0));
        }
        org.telegram.ui.ActionBar.l6.M1(f2Var);
    }

    public static /* synthetic */ void b0(w71 w71Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = w71Var.W0;
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            w71Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z9 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_wallPapers.wallpapers.get(i7) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i7);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            w71Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (i6Var != null && (str = i6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            w71Var.X0 = tL_wallPaper2;
                            w71Var.g1(false);
                            w71Var.o1();
                        } else if (i6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = w71Var.X0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z9 = true;
                    }
                }
            }
            if (!z9 && (tL_wallPaper = w71Var.X0) != null) {
                w71Var.V0.add(0, tL_wallPaper);
            }
            u71 u71Var = w71Var.R0;
            if (u71Var != null) {
                u71Var.f();
            }
            org.telegram.messenger.yr.a0(w71Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (w71Var.X0 != null || i6Var == null || TextUtils.isEmpty(i6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = i6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(w71Var.currentAccount).bindRequestToGuid(w71Var.getConnectionsManager().sendRequest(getwallpaper, new q61(w71Var, 0)), w71Var.classGuid);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        o1();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        o1();
    }

    public final void Q0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        int i7 = 1;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) View.SCALE_X, this.z1), ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) View.SCALE_Y, this.z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.xq.g);
        this.C0.addListener(new b71(this, i7));
        this.C0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z9) {
        int i7;
        boolean z10;
        File A;
        boolean z11;
        boolean z12;
        File file;
        Bitmap n10;
        Object obj;
        float f10;
        boolean z13;
        TLRPC.TL_wallPaper tL_wallPaper;
        File file2;
        String str;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_wallPaper tL_wallPaper2;
        File A2;
        String str2;
        int i13;
        int i14;
        int i15;
        Object obj2;
        long j3;
        boolean z14;
        TLRPC.TL_wallPaper tL_wallPaper3;
        boolean z15;
        boolean z16;
        float f11;
        TLRPC.UserFull b22;
        int i16 = 2;
        if (this.K1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                getMessagesController().G0().b(this.K1, this.W1, new m61(this, i16));
                return;
            } else if (this.W1 == null) {
                return;
            }
        }
        if (!getUserConfig().q() && z9) {
            showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.k6 k6Var = org.telegram.ui.ActionBar.l6.I;
        String j10 = k6Var.j(null, this.G1);
        int i17 = 0;
        String j11 = this.G1 ? k6Var.j(null, false) : j10;
        File file3 = new File(org.telegram.messenger.t0.h(), j10);
        Object obj3 = this.C1;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
            if (this.y1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    this.y1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    Bitmap n11 = imageReceiver.n();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        n11.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                z11 = false;
                if (!z11) {
                    TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) this.C1;
                    org.telegram.messenger.w7.G(this.currentAccount);
                    try {
                        z11 = org.telegram.messenger.g0.E(org.telegram.messenger.w7.J(tL_wallPaper4.document, null, true, true), file3);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        z11 = false;
                    }
                }
                z12 = false;
                i7 = 4;
            }
            z11 = true;
            if (!z11) {
            }
            z12 = false;
            i7 = 4;
        } else if (obj3 instanceof sc1) {
            if (this.X0 != null) {
                try {
                    n10 = this.y0.getImageReceiver().n();
                    i7 = 4;
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 4;
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    if (this.d1 == 0) {
                        if (this.c1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.k9.d(this.i1), new int[]{this.a1, this.c1});
                            gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                            gradientDrawable.draw(canvas);
                        } else {
                            canvas.drawColor(this.a1);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
                    paint.setAlpha((int) (Math.abs(this.m1) * 255.0f));
                    canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    if (this.d1 != 0) {
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                    } else {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                    }
                    fileOutputStream3.close();
                } catch (Throwable th3) {
                    th = th3;
                    org.telegram.messenger.a8.g(th, true);
                    z11 = false;
                    z12 = false;
                    if (this.G1) {
                    }
                    obj = this.C1;
                    int i18 = 45;
                    if (obj instanceof TLRPC.TL_wallPaper) {
                    }
                    file2 = null;
                    org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                    d6Var.a = j11;
                    d6Var.b = j10;
                    d6Var.c = str;
                    d6Var.i = this.G1;
                    d6Var.j = this.F1;
                    d6Var.d = i17;
                    d6Var.e = i10;
                    d6Var.f = i11;
                    d6Var.g = i12;
                    d6Var.h = i18;
                    if (this.N1) {
                    }
                    d6Var.k = this.m1;
                    obj2 = this.C1;
                    if (obj2 instanceof sc1) {
                    }
                    j3 = this.K1;
                    d6Var.n = j3;
                    if (j3 != 0) {
                    }
                    d6Var.o = z9;
                    org.telegram.messenger.qp.s1(this.currentAccount).z4(file2, d6Var, str == null && this.K1 == 0, 0L);
                    if (!z13) {
                    }
                    tL_wallPaper3 = tL_wallPaper;
                    z15 = z14;
                    if (z15) {
                    }
                }
            } else {
                i7 = 4;
            }
            z12 = false;
            z11 = true;
        } else {
            i7 = 4;
            if (obj3 instanceof tc1) {
                tc1 tc1Var = (tc1) obj3;
                if (tc1Var.b == 0 && !"t".equals(tc1Var.a)) {
                    try {
                        if (!this.b2 || this.Y1 == this.Z1) {
                            File file4 = tc1Var.e;
                            file = file4 != null ? file4 : tc1Var.d;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap((int) this.a2, this.D1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            canvas2.translate(-((this.Y1 / this.X1) * (this.D1.getWidth() - createBitmap2.getWidth())), 0.0f);
                            canvas2.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
                            tc1Var.d = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream4 = new FileOutputStream(tc1Var.d);
                            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            createBitmap2.recycle();
                            file = tc1Var.d;
                        }
                        z12 = file.equals(file3);
                        if (!z12) {
                            try {
                                z11 = org.telegram.messenger.g0.E(file, file3);
                            } catch (Exception e13) {
                                e = e13;
                                org.telegram.messenger.a8.g(e, true);
                                z11 = false;
                                if (this.G1) {
                                }
                                obj = this.C1;
                                int i182 = 45;
                                if (obj instanceof TLRPC.TL_wallPaper) {
                                }
                                file2 = null;
                                org.telegram.ui.ActionBar.d6 d6Var2 = new org.telegram.ui.ActionBar.d6();
                                d6Var2.a = j11;
                                d6Var2.b = j10;
                                d6Var2.c = str;
                                d6Var2.i = this.G1;
                                d6Var2.j = this.F1;
                                d6Var2.d = i17;
                                d6Var2.e = i10;
                                d6Var2.f = i11;
                                d6Var2.g = i12;
                                d6Var2.h = i182;
                                if (this.N1) {
                                }
                                d6Var2.k = this.m1;
                                obj2 = this.C1;
                                if (obj2 instanceof sc1) {
                                }
                                j3 = this.K1;
                                d6Var2.n = j3;
                                if (j3 != 0) {
                                }
                                d6Var2.o = z9;
                                org.telegram.messenger.qp.s1(this.currentAccount).z4(file2, d6Var2, str == null && this.K1 == 0, 0L);
                                if (!z13) {
                                }
                                tL_wallPaper3 = tL_wallPaper;
                                z15 = z14;
                                if (z15) {
                                }
                            }
                        }
                        z11 = true;
                    } catch (Exception e14) {
                        e = e14;
                        z12 = false;
                    }
                }
                z12 = false;
                z11 = true;
            } else {
                if (obj3 instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj3;
                    TLRPC.Photo photo = kfVar.K;
                    if (photo != null) {
                        z10 = true;
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.I1, true, null, false);
                        org.telegram.messenger.w7.G(this.currentAccount);
                        A = org.telegram.messenger.w7.J(w10, null, true, true);
                    } else {
                        z10 = true;
                        A = org.telegram.messenger.gc.A(kfVar.C);
                    }
                    try {
                        z11 = org.telegram.messenger.g0.E(A, file3);
                    } catch (Exception e15) {
                        org.telegram.messenger.a8.g(e15, z10);
                        z11 = false;
                    }
                    z12 = false;
                }
                z11 = false;
                z12 = false;
            }
        }
        if (this.G1) {
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(new File(org.telegram.messenger.t0.h(), j11));
                this.x1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                fileOutputStream5.close();
                z11 = true;
            } catch (Throwable th4) {
                org.telegram.messenger.a8.g(th4, true);
                z11 = false;
            }
        }
        obj = this.C1;
        int i1822 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper5 = (TLRPC.TL_wallPaper) obj;
            z13 = z11;
            f10 = 0.0f;
            tL_wallPaper = tL_wallPaper5;
            str = tL_wallPaper5.slug;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else if (obj instanceof sc1) {
            if ("d".equals(((sc1) obj).a)) {
                f10 = 0.0f;
                i14 = 0;
                i15 = 0;
                i13 = 0;
                str2 = "d";
            } else {
                TLRPC.TL_wallPaper tL_wallPaper6 = this.X0;
                str2 = tL_wallPaper6 != null ? tL_wallPaper6.slug : "c";
                i13 = this.a1;
                int i19 = this.c1;
                i14 = this.d1;
                f10 = 0.0f;
                i15 = this.e1;
                i1822 = this.i1;
                i17 = i19;
            }
            String str3 = str2;
            i11 = i14;
            str = str3;
            int i20 = i13;
            i12 = i15;
            i10 = i17;
            i17 = i20;
            z13 = z11;
            tL_wallPaper = null;
        } else {
            f10 = 0.0f;
            if (obj instanceof tc1) {
                tc1 tc1Var2 = (tc1) obj;
                str = tc1Var2.a;
                z13 = z11;
                file2 = tc1Var2.d;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i17 = 0;
                tL_wallPaper = null;
            } else {
                if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar2 = (org.telegram.messenger.kf) obj;
                    TLRPC.Photo photo2 = kfVar2.K;
                    if (photo2 != null) {
                        tL_wallPaper2 = null;
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo2.sizes, this.I1, true, null, false);
                        org.telegram.messenger.w7.G(this.currentAccount);
                        A2 = org.telegram.messenger.w7.J(w11, null, true, true);
                    } else {
                        tL_wallPaper2 = null;
                        A2 = org.telegram.messenger.gc.A(kfVar2.C);
                    }
                    z13 = z11;
                    file2 = A2;
                    str = "";
                    tL_wallPaper = tL_wallPaper2;
                } else {
                    z13 = z11;
                    tL_wallPaper = null;
                    file2 = null;
                    str = "d";
                }
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i17 = 0;
            }
            org.telegram.ui.ActionBar.d6 d6Var22 = new org.telegram.ui.ActionBar.d6();
            d6Var22.a = j11;
            d6Var22.b = j10;
            d6Var22.c = str;
            d6Var22.i = this.G1;
            d6Var22.j = this.F1;
            d6Var22.d = i17;
            d6Var22.e = i10;
            d6Var22.f = i11;
            d6Var22.g = i12;
            d6Var22.h = i1822;
            if (this.N1) {
                float f12 = this.o1;
                if (f12 >= f10) {
                    d6Var22.k = f12;
                    obj2 = this.C1;
                    if (obj2 instanceof sc1) {
                        sc1 sc1Var = (sc1) obj2;
                        String str4 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                        float f13 = sc1Var.h;
                        if (f13 < f10 && !org.telegram.ui.ActionBar.l6.I.q()) {
                            f13 *= -1.0f;
                        }
                        if (sc1Var.l != null && sc1Var.b == i17 && sc1Var.c == i10 && sc1Var.d == i11 && sc1Var.e == i12 && TextUtils.equals(sc1Var.a, str4) && sc1Var.f == i1822 && (this.X0 == null || Math.abs(f13 - this.m1) < 0.001f)) {
                            TLRPC.WallPaper wallPaper = sc1Var.l;
                            d6Var22.l = wallPaper.id;
                            d6Var22.m = wallPaper.access_hash;
                        }
                    }
                    j3 = this.K1;
                    d6Var22.n = j3;
                    if (j3 != 0 && (b22 = getMessagesController().b2(this.K1)) != null) {
                        d6Var22.t = b22.wallpaper;
                    }
                    d6Var22.o = z9;
                    org.telegram.messenger.qp.s1(this.currentAccount).z4(file2, d6Var22, str == null && this.K1 == 0, 0L);
                    if (!z13) {
                        z14 = true;
                    } else {
                        if (this.K1 != 0) {
                            if (file2 == null || getMessagesController().R2 != d6Var22) {
                                z16 = false;
                                org.telegram.messenger.d4.f(this.currentAccount).u(this.K1, null, d6Var22, this.r0, new ai.m0(24));
                                tL_wallPaper3 = tL_wallPaper;
                            } else {
                                tL_wallPaper3 = new TLRPC.TL_wallPaper();
                                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                tL_wallPaper3.settings = tL_wallPaperSettings;
                                tL_wallPaperSettings.intensity = (int) (d6Var22.k * 100.0f);
                                tL_wallPaperSettings.blur = d6Var22.i;
                                tL_wallPaperSettings.motion = d6Var22.j;
                                tL_wallPaper3.uploadingImage = file2.getAbsolutePath();
                                Bitmap createBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                Canvas canvas3 = new Canvas(createBitmap3);
                                float max = Math.max(50.0f / this.y0.getMeasuredWidth(), 50.0f / this.y0.getMeasuredHeight());
                                canvas3.scale(max, max);
                                if (this.y0.getMeasuredHeight() > this.y0.getMeasuredWidth()) {
                                    f11 = f10;
                                    canvas3.translate(f11, (-(this.y0.getMeasuredHeight() - this.y0.getMeasuredWidth())) / 2.0f);
                                } else {
                                    f11 = f10;
                                    canvas3.translate((-(this.y0.getMeasuredWidth() - this.y0.getMeasuredHeight())) / 2.0f, f11);
                                }
                                float f14 = this.o1;
                                this.o1 = f11;
                                this.y0.draw(canvas3);
                                this.o1 = f14;
                                Utilities.blurBitmap(createBitmap3, 3);
                                tL_wallPaper3.stripedThumb = createBitmap3;
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                org.telegram.messenger.gz.C(this.currentAccount);
                                tL_messageService.random_id = org.telegram.messenger.gz.E();
                                tL_messageService.dialog_id = this.K1;
                                tL_messageService.unread = true;
                                tL_messageService.out = true;
                                int j12 = getUserConfig().j();
                                tL_messageService.id = j12;
                                tL_messageService.local_id = j12;
                                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.K1));
                                if (org.telegram.messenger.t3.T(M0)) {
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_messageService.from_id = tL_peerChannel;
                                    tL_peerChannel.channel_id = M0.id;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_messageService.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = M0.id;
                                } else {
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_messageService.from_id = tL_peerUser;
                                    tL_peerUser.user_id = getUserConfig().e();
                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                    tL_messageService.peer_id = tL_peerUser2;
                                    tL_peerUser2.user_id = this.K1;
                                }
                                tL_messageService.flags |= 256;
                                tL_messageService.date = getConnectionsManager().getCurrentTime();
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                tL_messageService.action = tL_messageActionSetChatWallPaper;
                                tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper3;
                                tL_messageActionSetChatWallPaper.for_both = z9;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new org.telegram.messenger.ij(this.currentAccount, tL_messageService, false, false));
                                new ArrayList().add(tL_messageService);
                                org.telegram.messenger.qp.s1(this.currentAccount).l5(0, this.K1, arrayList);
                                if (this.K1 >= 0) {
                                    TLRPC.UserFull b23 = getMessagesController().b2(this.K1);
                                    if (b23 != null) {
                                        b23.wallpaper = tL_wallPaper3;
                                        org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.E0, Long.valueOf(this.K1), b23);
                                    }
                                } else {
                                    TLRPC.ChatFull N0 = getMessagesController().N0(-this.K1);
                                    if (N0 != null) {
                                        N0.wallpaper = tL_wallPaper3;
                                        org.telegram.messenger.qs f15 = org.telegram.messenger.qs.f(this.currentAccount);
                                        z16 = false;
                                        Object[] objArr = new Object[i7];
                                        objArr[0] = N0;
                                        objArr[1] = 0;
                                        Boolean bool = Boolean.FALSE;
                                        objArr[2] = bool;
                                        objArr[3] = bool;
                                        f15.k(org.telegram.messenger.qs.T, objArr);
                                    }
                                }
                                z16 = false;
                            }
                            this.e2 = true;
                            v71 v71Var = this.J1;
                            if (v71Var != null) {
                                v71Var.a(tL_wallPaper3);
                            }
                            finishFragment();
                            z15 = z16;
                            if (z15) {
                                return;
                            }
                            v71 v71Var2 = this.J1;
                            if (v71Var2 != null) {
                                v71Var2.a(tL_wallPaper3);
                            }
                            finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.l6.c0 = getThemedColor(org.telegram.ui.ActionBar.l6.Zc);
                        org.telegram.ui.ActionBar.l6.I.v("t".equals(d6Var22.c) ? null : d6Var22);
                        z14 = true;
                        org.telegram.ui.ActionBar.l6.u1(true);
                        if (!z12) {
                            org.telegram.messenger.gc.D().Q(Utilities.a(file3.getAbsolutePath()) + "@100_100");
                        }
                    }
                    tL_wallPaper3 = tL_wallPaper;
                    z15 = z14;
                    if (z15) {
                    }
                }
            }
            d6Var22.k = this.m1;
            obj2 = this.C1;
            if (obj2 instanceof sc1) {
            }
            j3 = this.K1;
            d6Var22.n = j3;
            if (j3 != 0) {
                d6Var22.t = b22.wallpaper;
            }
            d6Var22.o = z9;
            org.telegram.messenger.qp.s1(this.currentAccount).z4(file2, d6Var22, str == null && this.K1 == 0, 0L);
            if (!z13) {
            }
            tL_wallPaper3 = tL_wallPaper;
            z15 = z14;
            if (z15) {
            }
        }
        file2 = null;
        org.telegram.ui.ActionBar.d6 d6Var222 = new org.telegram.ui.ActionBar.d6();
        d6Var222.a = j11;
        d6Var222.b = j10;
        d6Var222.c = str;
        d6Var222.i = this.G1;
        d6Var222.j = this.F1;
        d6Var222.d = i17;
        d6Var222.e = i10;
        d6Var222.f = i11;
        d6Var222.g = i12;
        d6Var222.h = i1822;
        if (this.N1) {
        }
        d6Var222.k = this.m1;
        obj2 = this.C1;
        if (obj2 instanceof sc1) {
        }
        j3 = this.K1;
        d6Var222.n = j3;
        if (j3 != 0) {
        }
        d6Var222.o = z9;
        org.telegram.messenger.qp.s1(this.currentAccount).z4(file2, d6Var222, str == null && this.K1 == 0, 0L);
        if (!z13) {
        }
        tL_wallPaper3 = tL_wallPaper;
        z15 = z14;
        if (z15) {
        }
    }

    public final void S0(boolean z9) {
        int i7 = this.b;
        if (i7 == 2) {
            if (z9) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.l6.p();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.z4);
        org.telegram.ui.ActionBar.i6 i6Var = this.w;
        if (i7 == 1) {
            if (this.h0) {
                i6Var.c = this.y;
                i6Var.d = this.D;
                i6Var.e = this.E;
                i6Var.f = this.F;
                i6Var.g = this.G;
                i6Var.h = this.H;
                i6Var.i = this.I;
                i6Var.j = this.J;
                i6Var.k = this.K;
                i6Var.l = this.L;
                i6Var.m = this.M;
                i6Var.n = this.P;
                i6Var.o = this.O;
                i6Var.p = this.N;
            }
            org.telegram.ui.ActionBar.l6.z1(this.f0, false, true, false, false, false);
        } else {
            if (i6Var != null) {
                org.telegram.ui.ActionBar.l6.z1(this.f0, false, this.i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).X(false, false);
            if (this.i0) {
                org.telegram.ui.ActionBar.k6 k6Var = this.f0;
                if (k6Var.b != null && org.telegram.ui.ActionBar.l6.H.get(k6Var.m()) == null) {
                    new File(k6Var.b).delete();
                }
            }
        }
        if (z9) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.h2;
        }
        WeakReference weakReference2 = this.g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.g2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.h2 = null;
            return null;
        }
        this.g2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(createBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(createBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
        this.h2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.h2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r6.F1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r6.m1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(boolean z9) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.i6 i6Var = this.w;
            if (i6Var.c == this.y && i6Var.d == this.D && i6Var.e == this.E && i6Var.f == this.F && i6Var.g == this.G && i6Var.h == this.H && i6Var.i == this.I && i6Var.j == this.J && i6Var.k == this.K && i6Var.l == this.L && i6Var.m == this.M && Math.abs(i6Var.p - this.N) <= 0.001f && i6Var.n == this.P) {
                String str = i6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                    }
                    if (tL_wallPaper2 != null) {
                    }
                }
            }
            if (!z9) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131745944, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131745945, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745946, null), new l61(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, null), new l61(this, 4));
            showDialog(u1Var);
            return false;
        }
        return true;
    }

    public final void V0() {
        int themedColor;
        fi.w2 w2Var = this.e;
        int i7 = 0;
        if (w2Var != null) {
            w2Var.H(getThemedColor(org.telegram.ui.ActionBar.l6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.l6.E8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.d6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        t4 t4Var = this.D0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        if (this.q1 != null) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.l6.h5));
            } else {
                this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.l6.h5));
                if (this.b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            }
        }
        if (this.K0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr = this.K0;
                if (i10 >= x61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var = x61VarArr[i10];
                if (x61Var != null) {
                    x61Var.invalidate();
                }
                i10++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr2 = this.L0;
                if (i7 >= x61VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var2 = x61VarArr2[i7];
                if (x61Var2 != null) {
                    x61Var2.invalidate();
                }
                i7++;
            }
        }
        TextView textView = this.f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, this.a);
        }
        org.telegram.ui.Components.vp vpVar = this.W;
        if (vpVar != null) {
            vpVar.invalidate();
        }
        org.telegram.ui.Components.q00 q00Var = this.q0;
        if (q00Var != null) {
            q00Var.updateColors();
        }
    }

    public final int W0() {
        return org.telegram.messenger.t3.U(this.currentAccount, -this.K1) ? getMessagesController().u5 : getMessagesController().z5;
    }

    public final ArrayList X0() {
        f6 f6Var = new f6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.t0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.t0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.E8));
        org.telegram.ui.Components.vp vpVar = this.W;
        int i7 = 2;
        if (vpVar != null) {
            org.telegram.ui.ActionBar.r0 r0Var = vpVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = vpVar.E;
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                arrayList.add(new org.telegram.ui.ActionBar.u6(editTextBoldCursorArr[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.u6(editTextBoldCursorArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.u6(editTextBoldCursorArr[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.u6(vpVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.I5));
            if (r0Var != null) {
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(vpVar, i7);
                arrayList.add(new org.telegram.ui.ActionBar.u6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.u6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.u6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.u6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i11 = 0; i11 < frameLayoutArr.length; i11++) {
            }
            for (int i12 = 0; i12 < this.P0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.O0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.N0.length; i14++) {
            }
            org.telegram.ui.ActionBar.r5 r5Var = this.S;
            org.telegram.ui.ActionBar.r5 r5Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r5Var, r5Var2}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.rb));
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r5Var, r5Var2}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r5Var, r5Var2}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.tb));
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Qb));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.ActionBar.u6) arrayList.get(i15)).n = this.a;
        }
        return arrayList;
    }

    public final boolean Y0(int i7) {
        int E0;
        long j3;
        if (this.h0) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.w;
        if (i7 == 1 || i7 == 2) {
            long j10 = this.J;
            if (j10 == 0) {
                int E02 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Be);
                int i10 = (int) i6Var.j;
                if (i10 == 0) {
                    i10 = E02;
                }
                if (i10 != E02) {
                    return true;
                }
            } else if (j10 != i6Var.j) {
                return true;
            }
            long j11 = this.K;
            long j12 = this.M;
            long j13 = this.L;
            if (j11 == 0 && j13 == 0 && j12 == 0) {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == 0) {
                        E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                        j3 = i6Var.k;
                    } else if (i11 == 1) {
                        E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                        j3 = i6Var.l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ee);
                        j3 = i6Var.m;
                    }
                    int i12 = (int) j3;
                    if (i12 == 0 && j3 != 0) {
                        i12 = 0;
                    } else if (i12 == 0) {
                        i12 = E0;
                    }
                    if (i12 != E0) {
                        return true;
                    }
                }
            } else if (j11 != i6Var.k || j13 != i6Var.l || j12 != i6Var.m) {
                return true;
            }
            if (i6Var.n != this.P) {
                return true;
            }
        }
        if (i7 == 1 || i7 == 3) {
            if (this.y != i6Var.d) {
                return true;
            }
            int i13 = this.E;
            if (i13 == 0) {
                int i14 = i6Var.e;
                if (i14 != 0 && i14 != i6Var.c) {
                    return true;
                }
            } else if (i13 != i6Var.e) {
                return true;
            }
            int i15 = this.F;
            if (i15 != 0) {
                if (i15 != i6Var.f) {
                    return true;
                }
            } else if (i6Var.f != 0) {
                return true;
            }
            int i16 = this.G;
            if (i16 != 0) {
                if (i16 != i6Var.g) {
                    return true;
                }
            } else if (i6Var.g != 0) {
                return true;
            }
            int i17 = this.H;
            if (i17 != 0) {
                if (i17 != i6Var.h) {
                    return true;
                }
            } else if (i6Var.h != 0) {
                return true;
            }
            if (this.I != i6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        return (q4Var == null || q4Var.getBottomSheet() == null) ? false : true;
    }

    public final void a1() {
        bi.m5 m5Var = this.R1;
        if (m5Var != null) {
            m5Var.invalidate();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.z0.getChildAt(i7).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.A0.getChildAt(i10).invalidate();
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr = this.K0;
                if (i11 >= x61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var = x61VarArr[i11];
                if (x61Var != null) {
                    x61Var.setDimAmount(this.N1 ? this.o1 * this.p1 : 0.0f);
                    this.K0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.o0 != null) {
            for (int i12 = 0; i12 < this.o0.getChildCount(); i12++) {
                View childAt = this.o0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.v0 != null) {
            for (int i13 = 0; i13 < this.v0.getChildCount(); i13++) {
                View childAt2 = this.v0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        n71 n71Var = this.A1;
        if (n71Var != null) {
            n71Var.invalidate();
        }
        n71 n71Var2 = this.B1;
        if (n71Var2 != null) {
            n71Var2.invalidate();
        }
        t4 t4Var = this.D0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.i6 i6Var = this.w;
        if (i6Var == null || TextUtils.isEmpty(i6Var.o)) {
            return;
        }
        try {
            File e10 = i6Var.e();
            Drawable background = this.y0.getBackground();
            Bitmap n10 = this.y0.getImageReceiver().n();
            if (background instanceof org.telegram.ui.Components.ra0) {
                FileOutputStream fileOutputStream = new FileOutputStream(e10);
                n10.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            background.setBounds(0, 0, n10.getWidth(), n10.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
            paint.setAlpha((int) (this.m1 * 255.0f));
            canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(e10);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void c1() {
        d1(2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0fea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x094f A[EDGE_INSN: B:248:0x094f->B:249:0x094f BREAK  A[LOOP:2: B:198:0x0860->B:224:0x0944], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0dec  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa A[LOOP:0: B:45:0x01a6->B:47:0x01aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d7 A[EDGE_INSN: B:48:0x01d7->B:49:0x01d7 BREAK  A[LOOP:0: B:45:0x01a6->B:47:0x01aa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0e8a  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v21 */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z9;
        org.telegram.ui.ActionBar.q4 q4Var;
        final int i7;
        int i10;
        int i11;
        m71[] m71VarArr;
        boolean z10;
        int i12;
        float f10;
        int i13;
        int i14;
        Object obj;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i17;
        final int i18;
        x61 x61Var;
        int i19;
        org.telegram.ui.ActionBar.i6 i6Var2;
        final int i20;
        FrameLayout.LayoutParams e10;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.k6 k6Var;
        ?? r14;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.Components.ny0 ny0Var;
        final int i21;
        org.telegram.ui.ActionBar.q4 q4Var2;
        this.S.p = (x61) getResourceProvider();
        this.T.p = (x61) getResourceProvider();
        this.U.p = (x61) getResourceProvider();
        this.V.p = (x61) getResourceProvider();
        int i22 = 1;
        this.hasOwnBackground = true;
        o71 o71Var = this.q1;
        int i23 = 0;
        boolean z11 = (o71Var == null || this.K1 == 0) ? false : true;
        this.M1 = z11;
        if (z11) {
            Object obj2 = this.C1;
            if (!(obj2 instanceof tc1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z9 = true;
            this.N1 = z9;
            if (z9) {
                this.p1 = o71Var.a() ? 1.0f : 0.0f;
            }
            q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).A()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.n0 = new FrameLayout(context);
            i7 = 3;
            if (this.N1 && org.telegram.messenger.iz.S < 3) {
                org.telegram.messenger.g0.i3(new j61(this, i7), 2000L);
            }
            this.actionBar.r().a(0, R.drawable.outline_header_search).M().J(new i71()).setSearchFieldHint(org.telegram.messenger.id.L0(2131745836));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.r4());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(org.telegram.messenger.id.L0(2131744172));
            k0 k0Var = new k0(26, context, this);
            this.n0 = k0Var;
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, k0Var, getResourceProvider());
            this.n0.addView(this.actionBar, c8.ha.c(-2.0f, -1));
            org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context);
            this.o0 = qj0Var;
            qj0Var.setVerticalScrollBarEnabled(true);
            this.o0.setItemAnimator(null);
            this.o0.setLayoutAnimation(null);
            this.o0.setLayoutManager(new v4.b0(1, false));
            final int i24 = 2;
            this.o0.setVerticalScrollbarPosition(!org.telegram.messenger.id.a0 ? 1 : 2);
            org.telegram.ui.Components.qj0 qj0Var2 = this.o0;
            i10 = this.b;
            qj0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i10 == 0 ? 12.0f : 0.0f));
            this.o0.setOnItemClickListener(new org.telegram.ui.Components.g7(i24));
            this.n0.addView(this.o0, c8.ha.e(-1, -1, 51));
            org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider);
            this.q0 = q00Var;
            q00Var.setImageResource(R.drawable.floating_pencil);
            this.n0.addView(this.q0, org.telegram.ui.Components.q00.b());
            l4 l4Var = new l4(context);
            this.p0 = l4Var;
            this.o0.setAdapter(l4Var);
            this.u0 = new org.telegram.ui.ActionBar.l0(i24, context, this);
            this.w0 = new s71(context, this);
            this.t0 = createActionBar(context);
            if (org.telegram.messenger.g0.Q1()) {
                this.t0.setOccupyStatusBar(false);
            }
            this.t0.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.t0.setActionBarMenuOnItemClick(new l71(this));
            i11 = 0;
            while (true) {
                m71VarArr = this.x0;
                if (i11 < 2) {
                    break;
                }
                m71VarArr[i11] = new m71(this, (Activity) getContext());
                this.u0.addView(m71VarArr[i11], c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i11++;
            }
            m71 m71Var = m71VarArr[0];
            this.y0 = m71Var;
            m71Var.setVisibility(0);
            m71VarArr[1].setVisibility(8);
            if (i10 == 2) {
                this.y0.getImageReceiver().d0(new l61(this, i23));
            }
            z10 = this.w0.e;
            org.telegram.ui.ActionBar.k6 k6Var2 = this.f0;
            final int i25 = 4;
            if (!z10) {
                this.t0.setTitle("Telegram Beta Chat");
                this.t0.setSubtitle(org.telegram.messenger.id.G(505, "Members", new Object[0]));
            } else if (i10 == 2) {
                if (this.K1 != 0) {
                    this.t0.setTitle(org.telegram.messenger.id.L0(2131742952));
                } else {
                    this.t0.setTitle(org.telegram.messenger.id.L0(2131753741));
                }
                org.telegram.ui.ActionBar.y r10 = this.t0.r();
                Object obj3 = this.C1;
                if ((obj3 instanceof tc1) && ((tc1) obj3).e != null) {
                    r10.a(7, R.drawable.msg_header_draw);
                }
                if (this.K1 == 0) {
                    boolean z12 = org.telegram.messenger.r2.a;
                    Object obj4 = this.C1;
                    if (((obj4 instanceof sc1) && !"d".equals(((sc1) obj4).a)) || (this.C1 instanceof TLRPC.TL_wallPaper)) {
                        r10.a(5, R.drawable.msg_header_share);
                    }
                }
                if (this.K1 != 0 && this.M1) {
                    org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
                    this.O1 = ah0Var;
                    this.P1 = r10.d(6, ah0Var);
                    this.O1.h = true;
                    o71 o71Var2 = this.q1;
                    if (o71Var2 == null || o71Var2.a()) {
                        this.O1.M(35);
                        this.O1.P(36);
                    } else {
                        this.O1.P(0);
                        this.O1.M(0);
                    }
                    this.O1.Z = true;
                    int v02 = org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.J9);
                    this.O1.Q(v02, "Sunny");
                    this.O1.Q(v02, "Path 6");
                    this.O1.Q(v02, "Path");
                    this.O1.Q(v02, "Path 5");
                    this.O1.o();
                }
            } else if (i10 == 1) {
                org.telegram.ui.ActionBar.y r11 = this.t0.r();
                this.f = r11.e(4, org.telegram.messenger.id.L0(2131745946));
                fi.w2 w2Var = new fi.w2(this, context, r11);
                this.e = w2Var;
                w2Var.setSubMenuOpenSide(1);
                this.e.f(2, org.telegram.messenger.id.L0(2131752016));
                this.e.f(1, org.telegram.messenger.id.L0(2131752015));
                this.e.f(3, org.telegram.messenger.id.L0(2131752014));
                this.e.K();
                this.e.setForceSmoothKeyboard(true);
                this.t0.addView(this.e, c8.ha.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.k61
                    public final /* synthetic */ w71 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                this.b.S0(false);
                                break;
                            case 1:
                                w71.a0(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.R0(false);
                                break;
                            default:
                                this.b.R0(true);
                                break;
                        }
                    }
                });
                TextView textView = new TextView(context);
                this.h = textView;
                textView.setImportantForAccessibility(2);
                this.h.setGravity(3);
                this.h.setSingleLine(true);
                this.h.setLines(1);
                this.h.setMaxLines(1);
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                TextView textView2 = this.h;
                int i26 = org.telegram.ui.ActionBar.l6.A8;
                org.telegram.ui.ActionBar.s6.U(textView2, i26, getResourceProvider());
                this.h.setTypeface(org.telegram.messenger.g0.o());
                this.h.setText(org.telegram.messenger.id.L0(2131752015));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                org.telegram.ui.ActionBar.s6.x(this.h, mutate, i26, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                this.h.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                this.e.addView(this.h, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = k6Var2.F;
                String n10 = tL_theme != null ? tL_theme.title : k6Var2.n();
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                this.t0.setTitle(n10);
                TLRPC.TL_theme tL_theme2 = k6Var2.F;
                if (tL_theme2 == null || (i12 = tL_theme2.installs_count) <= 0) {
                    this.t0.setSubtitle(org.telegram.messenger.id.w((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.t0.setSubtitle(org.telegram.messenger.id.G(i12, "ThemeInstallCount", new Object[0]));
                }
            }
            this.v0 = new s61(context, this);
            t61 t61Var = new t61(this);
            t61Var.S();
            this.v0.setItemAnimator(t61Var);
            this.v0.setVerticalScrollBarEnabled(true);
            this.v0.setOverScrollMode(2);
            if (i10 != 2) {
                this.v0.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, (org.telegram.messenger.g0.L(72 + ((this.L1 || this.K1 <= 0) ? 0 : 58)) - 12) + (Z0() ? org.telegram.messenger.g0.n : 0));
            } else if (i10 == 1) {
                this.v0.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(16.0f));
            } else {
                this.v0.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
            }
            this.v0.setClipToPadding(false);
            this.v0.setLayoutManager(new v4.b0(1, true));
            this.v0.setVerticalScrollbarPosition(!org.telegram.messenger.id.a0 ? 1 : 2);
            if (i10 != 1) {
                this.u0.addView(this.v0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.v0.setOnItemClickListener(new l61(this, i22));
                f10 = 16.0f;
                i13 = -1;
            } else {
                f10 = 16.0f;
                i13 = -1;
                this.u0.addView(this.v0, c8.ha.e(-1, -1, 51));
            }
            this.v0.setOnScrollListener(new d21(this, i7));
            this.u0.addView(this.t0, c8.ha.c(-2.0f, i13));
            org.telegram.ui.Components.z61 z61Var = new org.telegram.ui.Components.z61(context);
            this.w1 = z61Var;
            z61Var.b(new l61(this, i24));
            org.telegram.ui.ActionBar.i6 i6Var4 = this.w;
            if (i10 != 1 || i10 == 2) {
                if (i10 != 2) {
                    t4 t4Var = new t4(this, context, Z0());
                    this.D0 = t4Var;
                    t4Var.setWillNotDraw(false);
                    i14 = 2;
                    this.D0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + (Z0() ? org.telegram.messenger.g0.n : 0));
                    this.u0.addView(this.D0, c8.ha.e(-1, 0, 81));
                    n71 n71Var = new n71(context, this);
                    this.A1 = n71Var;
                    c8.ka.b(n71Var, 0.033f, 1.2f);
                    m1(false);
                    this.A1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.k61
                        public final /* synthetic */ w71 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i7) {
                                case 0:
                                    this.b.S0(false);
                                    break;
                                case 1:
                                    w71.a0(this.b);
                                    break;
                                case 2:
                                    this.b.e.U(null, null);
                                    break;
                                case 3:
                                    this.b.R0(false);
                                    break;
                                default:
                                    this.b.R0(true);
                                    break;
                            }
                        }
                    });
                    if (this.K1 <= 0 || this.L1 || this.r0 != null) {
                        this.D0.addView(this.A1, c8.ha.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        n71 n71Var2 = new n71(context, this);
                        this.B1 = n71Var2;
                        c8.ka.b(n71Var2, 0.033f, 1.2f);
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.K1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().q()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.Z(2131754211, org.telegram.messenger.t10.p(a22)));
                        this.B1.d(spannableStringBuilder);
                        try {
                            n71 n71Var3 = this.B1;
                            CharSequence b10 = n71Var3.b();
                            ny0Var = this.B1.a;
                            n71Var3.d(org.telegram.messenger.i6.l(b10, ny0Var.h(), false));
                        } catch (Exception unused) {
                        }
                        this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.k61
                            public final /* synthetic */ w71 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i25) {
                                    case 0:
                                        this.b.S0(false);
                                        break;
                                    case 1:
                                        w71.a0(this.b);
                                        break;
                                    case 2:
                                        this.b.e.U(null, null);
                                        break;
                                    case 3:
                                        this.b.R0(false);
                                        break;
                                    default:
                                        this.b.R0(true);
                                        break;
                                }
                            }
                        });
                        this.D0.addView(this.A1, c8.ha.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.D0.addView(this.B1, c8.ha.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.N1) {
                        bi.m5 m5Var = new bi.m5(this, (Activity) getContext());
                        this.R1 = m5Var;
                        m5Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                        this.u0.addView(this.R1, c8.ha.e(org.telegram.messenger.qs.z3, 76, 49));
                        u61 u61Var = new u61((Activity) getContext());
                        this.S1 = u61Var;
                        u61Var.d(this.o1);
                        this.S1.b();
                        this.S1.c(new m61(this, i23));
                        this.R1.addView(this.S1);
                        o71 o71Var3 = this.q1;
                        if (o71Var3 != null) {
                            this.S1.setVisibility(o71Var3.a() ? 0 : 8);
                            this.S1.setAlpha(this.q1.a() ? 1.0f : 0.0f);
                            this.S1.d(this.q1.a() ? this.o1 : 0.0f);
                        }
                    }
                } else {
                    i14 = 2;
                }
                Rect rect = new Rect();
                Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
                this.r = h;
                h.getPadding(rect);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.d6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                obj = this.C1;
                if (i10 != 1 || (obj instanceof sc1)) {
                    if ((obj instanceof sc1) || !"d".equals(((sc1) obj).a)) {
                        i15 = 3;
                        String[] strArr = new String[i15];
                        int[] iArr = new int[i15];
                        this.K0 = new org.telegram.ui.Components.x61[i15];
                        if (i15 != 0) {
                            this.z0 = new FrameLayout(context);
                            if (i10 == 1 || (this.C1 instanceof sc1)) {
                                strArr[0] = org.telegram.messenger.id.L0(2131753745);
                                strArr[1] = org.telegram.messenger.id.L0(2131753742);
                                strArr[i14] = org.telegram.messenger.id.L0(2131753743);
                            } else {
                                strArr[0] = org.telegram.messenger.id.L0(2131753750);
                                strArr[1] = org.telegram.messenger.id.L0(2131753743);
                            }
                            int i27 = 0;
                            i17 = 0;
                            while (i27 < i15) {
                                int i28 = i22;
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i27]));
                                iArr[i27] = ceil;
                                i17 = Math.max(i17, ceil);
                                i27++;
                                i22 = i28;
                                i6Var4 = i6Var4;
                            }
                            i16 = i22;
                            i6Var = i6Var4;
                            v61 v61Var = new v61(this, context, 0);
                            this.E0 = v61Var;
                            v61Var.setWillNotDraw(false);
                            this.E0.setVisibility(this.c1 != 0 ? 0 : 4);
                            this.E0.setScaleX(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setScaleY(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setAlpha(this.c1 != 0 ? 1.0f : 0.0f);
                            this.E0.setTag(this.c1 != 0 ? Integer.valueOf(i16) : null);
                            this.z0.addView(this.E0, c8.ha.e(48, 48, 17));
                            this.E0.setOnClickListener(new w61(this, i23));
                            ImageView imageView = new ImageView(context);
                            this.G0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.G0.setImageResource(R.drawable.bg_rotate_large);
                            this.E0.addView(this.G0, c8.ha.e(-2, -2, 17));
                        } else {
                            i16 = 1;
                            i6Var = i6Var4;
                            i17 = 0;
                        }
                        i18 = 0;
                        while (true) {
                            x61Var = this.a;
                            if (i18 >= i15) {
                                break;
                            }
                            this.K0[i18] = new org.telegram.ui.Components.x61(context, ((i10 == i16 || (this.C1 instanceof sc1)) && i18 == 0) ? i23 : 1, this.y0, x61Var);
                            this.K0[i18].setBackgroundColor(this.a1);
                            org.telegram.ui.Components.x61 x61Var2 = this.K0[i18];
                            String str = strArr[i18];
                            int i29 = iArr[i18];
                            x61Var2.f = str;
                            x61Var2.h = i29;
                            x61Var2.n = i17;
                            int i30 = 1;
                            if (i10 != 1) {
                                if (this.C1 instanceof sc1) {
                                    i30 = 1;
                                } else {
                                    x61Var2.a(i18 == 0 ? this.G1 : this.F1, false);
                                    i6Var3 = i6Var;
                                    int L = org.telegram.messenger.g0.L(56.0f) + i17;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, -2);
                                    layoutParams.gravity = 17;
                                    if (i15 != 3) {
                                        if (i18 == 0 || i18 == 2) {
                                            layoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                        } else {
                                            layoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                        }
                                    } else if (i18 == 1) {
                                        layoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                    } else {
                                        layoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                    }
                                    this.z0.addView(this.K0[i18], layoutParams);
                                    final org.telegram.ui.Components.x61 x61Var3 = this.K0[i18];
                                    final int i31 = 0;
                                    x61Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n61
                                        public final /* synthetic */ w71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i31) {
                                                case 0:
                                                    w71 w71Var = this.b;
                                                    int i32 = w71Var.b;
                                                    FrameLayout[] frameLayoutArr = w71Var.M0;
                                                    if (w71Var.z0.getAlpha() == 1.0f && w71Var.s1 == null) {
                                                        int i33 = i18;
                                                        org.telegram.ui.Components.x61 x61Var4 = x61Var3;
                                                        if ((i32 != 1 && !(w71Var.C1 instanceof sc1)) || i33 != 2) {
                                                            if (i33 != 1 || (i32 != 1 && !(w71Var.C1 instanceof sc1))) {
                                                                if (!(w71Var.C1 instanceof sc1)) {
                                                                    if (i32 != 1) {
                                                                        x61Var4.a(!x61Var4.s, true);
                                                                        if (i33 != 0) {
                                                                            boolean z13 = x61Var4.s;
                                                                            w71Var.F1 = z13;
                                                                            w71Var.w1.c(z13);
                                                                            w71Var.Q0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = x61Var4.s;
                                                                            w71Var.G1 = z14;
                                                                            if (z14) {
                                                                                w71Var.y0.getImageReceiver().U0 = true;
                                                                            }
                                                                            w71Var.n1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    w71Var.k1(i33, frameLayoutArr[i33].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (w71Var.K0[1].s) {
                                                                    w71Var.Z0 = w71Var.X0;
                                                                    w71Var.y0.setImageDrawable(null);
                                                                    w71Var.X0 = null;
                                                                    w71Var.F1 = false;
                                                                    w71Var.o1();
                                                                    w71Var.Q0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i32 == 1) {
                                                                            w71Var.k1(0, true, true);
                                                                        } else {
                                                                            w71Var.k1(i33, frameLayoutArr[i33].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    w71Var.e1(w71Var.Z0 != null ? -1 : 0);
                                                                    if (i32 == 1) {
                                                                        w71Var.k1(1, true, true);
                                                                    } else {
                                                                        w71Var.k1(i33, frameLayoutArr[i33].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                w71Var.K0[1].a(w71Var.X0 != null, true);
                                                                w71Var.s1();
                                                                w71Var.Q0.g1();
                                                                w71Var.q1();
                                                                break;
                                                            }
                                                        } else {
                                                            x61Var4.a(!x61Var4.s, true);
                                                            boolean z15 = x61Var4.s;
                                                            w71Var.F1 = z15;
                                                            w71Var.w1.c(z15);
                                                            w71Var.Q0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    w71 w71Var2 = this.b;
                                                    if (w71Var2.A0.getAlpha() == 1.0f && i18 == 0) {
                                                        org.telegram.ui.Components.x61 x61Var5 = x61Var3;
                                                        x61Var5.a(!x61Var5.s, true);
                                                        w71Var2.w.i = x61Var5.s;
                                                        org.telegram.ui.ActionBar.l6.t1(true, true);
                                                        w71Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i18 != 2) {
                                        this.K0[i18].setAlpha(0.0f);
                                        this.K0[i18].setVisibility(4);
                                    }
                                    i18++;
                                    i6Var = i6Var3;
                                    i23 = 0;
                                    i14 = 2;
                                    i16 = 1;
                                }
                            }
                            if (i18 == i30) {
                                i6Var3 = i6Var;
                                x61Var2.a((this.X0 == null && (i6Var == null || TextUtils.isEmpty(i6Var3.o))) ? false : true, false);
                            } else {
                                i6Var3 = i6Var;
                                if (i18 == i14) {
                                    x61Var2.a(this.F1, false);
                                }
                            }
                            int L2 = org.telegram.messenger.g0.L(56.0f) + i17;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L2, -2);
                            layoutParams2.gravity = 17;
                            if (i15 != 3) {
                            }
                            this.z0.addView(this.K0[i18], layoutParams2);
                            final org.telegram.ui.Components.x61 x61Var32 = this.K0[i18];
                            final int i312 = 0;
                            x61Var32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n61
                                public final /* synthetic */ w71 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i312) {
                                        case 0:
                                            w71 w71Var = this.b;
                                            int i32 = w71Var.b;
                                            FrameLayout[] frameLayoutArr = w71Var.M0;
                                            if (w71Var.z0.getAlpha() == 1.0f && w71Var.s1 == null) {
                                                int i33 = i18;
                                                org.telegram.ui.Components.x61 x61Var4 = x61Var32;
                                                if ((i32 != 1 && !(w71Var.C1 instanceof sc1)) || i33 != 2) {
                                                    if (i33 != 1 || (i32 != 1 && !(w71Var.C1 instanceof sc1))) {
                                                        if (!(w71Var.C1 instanceof sc1)) {
                                                            if (i32 != 1) {
                                                                x61Var4.a(!x61Var4.s, true);
                                                                if (i33 != 0) {
                                                                    boolean z13 = x61Var4.s;
                                                                    w71Var.F1 = z13;
                                                                    w71Var.w1.c(z13);
                                                                    w71Var.Q0();
                                                                    break;
                                                                } else {
                                                                    boolean z14 = x61Var4.s;
                                                                    w71Var.G1 = z14;
                                                                    if (z14) {
                                                                        w71Var.y0.getImageReceiver().U0 = true;
                                                                    }
                                                                    w71Var.n1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            w71Var.k1(i33, frameLayoutArr[i33].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (w71Var.K0[1].s) {
                                                            w71Var.Z0 = w71Var.X0;
                                                            w71Var.y0.setImageDrawable(null);
                                                            w71Var.X0 = null;
                                                            w71Var.F1 = false;
                                                            w71Var.o1();
                                                            w71Var.Q0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i32 == 1) {
                                                                    w71Var.k1(0, true, true);
                                                                } else {
                                                                    w71Var.k1(i33, frameLayoutArr[i33].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            w71Var.e1(w71Var.Z0 != null ? -1 : 0);
                                                            if (i32 == 1) {
                                                                w71Var.k1(1, true, true);
                                                            } else {
                                                                w71Var.k1(i33, frameLayoutArr[i33].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        w71Var.K0[1].a(w71Var.X0 != null, true);
                                                        w71Var.s1();
                                                        w71Var.Q0.g1();
                                                        w71Var.q1();
                                                        break;
                                                    }
                                                } else {
                                                    x61Var4.a(!x61Var4.s, true);
                                                    boolean z15 = x61Var4.s;
                                                    w71Var.F1 = z15;
                                                    w71Var.w1.c(z15);
                                                    w71Var.Q0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            w71 w71Var2 = this.b;
                                            if (w71Var2.A0.getAlpha() == 1.0f && i18 == 0) {
                                                org.telegram.ui.Components.x61 x61Var5 = x61Var32;
                                                x61Var5.a(!x61Var5.s, true);
                                                w71Var2.w.i = x61Var5.s;
                                                org.telegram.ui.ActionBar.l6.t1(true, true);
                                                w71Var2.v0.g1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i18 != 2) {
                            }
                            i18++;
                            i6Var = i6Var3;
                            i23 = 0;
                            i14 = 2;
                            i16 = 1;
                        }
                        i19 = i16;
                        i6Var2 = i6Var;
                        if (i10 == i19) {
                            int[] iArr2 = new int[2];
                            this.L0 = new org.telegram.ui.Components.x61[2];
                            this.A0 = new FrameLayout(context);
                            String[] strArr2 = {org.telegram.messenger.id.L0(2131753752), org.telegram.messenger.id.L0(2131753745)};
                            int i32 = 0;
                            int i33 = 0;
                            for (int i34 = 2; i32 < i34; i34 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i32]));
                                iArr2[i32] = ceil2;
                                i33 = Math.max(i33, ceil2);
                                i32++;
                            }
                            if (i6Var2 != null) {
                                v61 v61Var2 = new v61(this, context, 1);
                                this.F0 = v61Var2;
                                v61Var2.setWillNotDraw(false);
                                this.F0.setVisibility(i6Var2.f != 0 ? 0 : 4);
                                this.F0.setScaleX(i6Var2.f != 0 ? 1.0f : 0.1f);
                                this.F0.setScaleY(i6Var2.f != 0 ? 1.0f : 0.1f);
                                this.F0.setAlpha(i6Var2.f != 0 ? 1.0f : 0.0f);
                                this.A0.addView(this.F0, c8.ha.e(48, 48, 17));
                                this.F0.setOnClickListener(new w61(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.H0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.H0.setImageResource(R.drawable.bg_rotate_large);
                                this.F0.addView(this.H0, c8.ha.e(-2, -2, 17));
                                final int i35 = 0;
                                while (i35 < 2) {
                                    this.L0[i35] = new org.telegram.ui.Components.x61(context, i35 == 0, this.y0, x61Var);
                                    org.telegram.ui.Components.x61 x61Var4 = this.L0[i35];
                                    String str2 = strArr2[i35];
                                    int i36 = iArr2[i35];
                                    x61Var4.f = str2;
                                    x61Var4.h = i36;
                                    x61Var4.n = i33;
                                    if (i35 == 0) {
                                        x61Var4.a(i6Var2.i, false);
                                    }
                                    int L3 = org.telegram.messenger.g0.L(56.0f) + i33;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(L3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i35 == 1) {
                                        layoutParams3.leftMargin = org.telegram.messenger.g0.L(10.0f) + (L3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = org.telegram.messenger.g0.L(10.0f) + (L3 / 2);
                                    }
                                    this.A0.addView(this.L0[i35], layoutParams3);
                                    final org.telegram.ui.Components.x61 x61Var5 = this.L0[i35];
                                    final int i37 = 1;
                                    x61Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n61
                                        public final /* synthetic */ w71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i37) {
                                                case 0:
                                                    w71 w71Var = this.b;
                                                    int i322 = w71Var.b;
                                                    FrameLayout[] frameLayoutArr = w71Var.M0;
                                                    if (w71Var.z0.getAlpha() == 1.0f && w71Var.s1 == null) {
                                                        int i332 = i35;
                                                        org.telegram.ui.Components.x61 x61Var42 = x61Var5;
                                                        if ((i322 != 1 && !(w71Var.C1 instanceof sc1)) || i332 != 2) {
                                                            if (i332 != 1 || (i322 != 1 && !(w71Var.C1 instanceof sc1))) {
                                                                if (!(w71Var.C1 instanceof sc1)) {
                                                                    if (i322 != 1) {
                                                                        x61Var42.a(!x61Var42.s, true);
                                                                        if (i332 != 0) {
                                                                            boolean z13 = x61Var42.s;
                                                                            w71Var.F1 = z13;
                                                                            w71Var.w1.c(z13);
                                                                            w71Var.Q0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = x61Var42.s;
                                                                            w71Var.G1 = z14;
                                                                            if (z14) {
                                                                                w71Var.y0.getImageReceiver().U0 = true;
                                                                            }
                                                                            w71Var.n1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    w71Var.k1(i332, frameLayoutArr[i332].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (w71Var.K0[1].s) {
                                                                    w71Var.Z0 = w71Var.X0;
                                                                    w71Var.y0.setImageDrawable(null);
                                                                    w71Var.X0 = null;
                                                                    w71Var.F1 = false;
                                                                    w71Var.o1();
                                                                    w71Var.Q0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i322 == 1) {
                                                                            w71Var.k1(0, true, true);
                                                                        } else {
                                                                            w71Var.k1(i332, frameLayoutArr[i332].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    w71Var.e1(w71Var.Z0 != null ? -1 : 0);
                                                                    if (i322 == 1) {
                                                                        w71Var.k1(1, true, true);
                                                                    } else {
                                                                        w71Var.k1(i332, frameLayoutArr[i332].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                w71Var.K0[1].a(w71Var.X0 != null, true);
                                                                w71Var.s1();
                                                                w71Var.Q0.g1();
                                                                w71Var.q1();
                                                                break;
                                                            }
                                                        } else {
                                                            x61Var42.a(!x61Var42.s, true);
                                                            boolean z15 = x61Var42.s;
                                                            w71Var.F1 = z15;
                                                            w71Var.w1.c(z15);
                                                            w71Var.Q0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    w71 w71Var2 = this.b;
                                                    if (w71Var2.A0.getAlpha() == 1.0f && i35 == 0) {
                                                        org.telegram.ui.Components.x61 x61Var52 = x61Var5;
                                                        x61Var52.a(!x61Var52.s, true);
                                                        w71Var2.w.i = x61Var52.s;
                                                        org.telegram.ui.ActionBar.l6.t1(true, true);
                                                        w71Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i35++;
                                }
                            }
                            i19 = 1;
                        }
                        if (i10 != i19 || (this.C1 instanceof sc1)) {
                            this.G1 = false;
                            i20 = 0;
                            while (i20 < 2) {
                                y61 y61Var = new y61(this, context, i20, rect);
                                ViewGroup[] viewGroupArr = this.M0;
                                viewGroupArr[i20] = y61Var;
                                if (i20 == 1 || i10 == 2) {
                                    y61Var.setVisibility(4);
                                }
                                viewGroupArr[i20].setWillNotDraw(false);
                                int i38 = org.telegram.messenger.qs.w4;
                                int i39 = org.telegram.messenger.qs.n5;
                                if (i10 == 2) {
                                    if (i20 == 0) {
                                        i39 = 321;
                                    }
                                    e10 = c8.ha.e(-1, i39, 83);
                                } else {
                                    if (i20 == 0) {
                                        i39 = 273;
                                    }
                                    e10 = c8.ha.e(-1, i39, 83);
                                }
                                if (i20 == 0) {
                                    if (i10 == 2) {
                                        i38 = 321;
                                    }
                                    f11 = i38;
                                } else {
                                    f11 = 316.0f;
                                }
                                e10.height = org.telegram.messenger.g0.L(f11);
                                if (Z0()) {
                                    e10.height += org.telegram.messenger.g0.n;
                                }
                                if (i20 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect2 = org.telegram.messenger.g0.Q;
                                    drawable2.getPadding(rect2);
                                    e10.height = org.telegram.messenger.g0.L(12.0f) + rect2.top + e10.height;
                                }
                                viewGroupArr[i20].setPadding(0, i20 == 0 ? org.telegram.messenger.g0.L(12.0f) + rect.top : 0, 0, Z0() ? org.telegram.messenger.g0.n : 0);
                                this.u0.addView(viewGroupArr[i20], e10);
                                if (i20 == 1 || i10 == 2) {
                                    bi.x5 x5Var = new bi.x5(this, context, 27);
                                    ViewGroup[] viewGroupArr2 = this.P0;
                                    viewGroupArr2[i20] = x5Var;
                                    x5Var.setWillNotDraw(false);
                                    viewGroupArr2[i20].setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
                                    viewGroupArr2[i20].setClickable(true);
                                    f12 = 21.0f;
                                    viewGroupArr[i20].addView(viewGroupArr2[i20], c8.ha.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.N0;
                                    textViewArr[i20] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i20].setTypeface(org.telegram.messenger.g0.o());
                                    TextView textView4 = textViewArr[i20];
                                    int i40 = org.telegram.ui.ActionBar.l6.pf;
                                    org.telegram.ui.ActionBar.s6.U(textView4, i40, getResourceProvider());
                                    textViewArr[i20].setText(org.telegram.messenger.id.L0(2131752589));
                                    textViewArr[i20].setGravity(17);
                                    textViewArr[i20].setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                                    TextView textView5 = textViewArr[i20];
                                    int i41 = org.telegram.ui.ActionBar.l6.i6;
                                    k6Var = k6Var2;
                                    org.telegram.ui.ActionBar.s6.Q(textView5, org.telegram.ui.ActionBar.l6.g0(getThemedColor(i41), 0), null, org.telegram.ui.ActionBar.s6.M(i41), getResourceProvider());
                                    viewGroupArr2[i20].addView(textViewArr[i20], c8.ha.e(-2, -1, 51));
                                    final int i42 = 0;
                                    textViewArr[i20].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r61
                                        public final /* synthetic */ w71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i42) {
                                                case 0:
                                                    w71 w71Var = this.b;
                                                    if (w71Var.s1 == null) {
                                                        int i43 = i20;
                                                        if (i43 == 0) {
                                                            w71Var.i1 = w71Var.j1;
                                                            w71Var.f1(w71Var.h1, 3, true);
                                                            w71Var.f1(w71Var.g1, 2, true);
                                                            w71Var.f1(w71Var.f1, 1, true);
                                                            w71Var.f1(w71Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = w71Var.Y0;
                                                            w71Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                w71Var.y0.setImageDrawable(null);
                                                            } else {
                                                                m71 m71Var2 = w71Var.y0;
                                                                org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_wallPaper2.document);
                                                                String str3 = w71Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = w71Var.X0;
                                                                m71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str3, null, "jpg", b11, null);
                                                            }
                                                            w71Var.K0[1].a(w71Var.X0 != null, false);
                                                            float f13 = w71Var.n1;
                                                            w71Var.m1 = f13;
                                                            w71Var.U0.setProgress(f13);
                                                            w71Var.y0.getImageReceiver().setAlpha(w71Var.m1);
                                                            w71Var.o1();
                                                            w71Var.s1();
                                                        }
                                                        if (w71Var.b != 2) {
                                                            if (w71Var.X0 == null) {
                                                                if (w71Var.F1) {
                                                                    w71Var.F1 = false;
                                                                    w71Var.K0[0].a(false, true);
                                                                    w71Var.Q0();
                                                                }
                                                                w71Var.q1();
                                                            }
                                                            w71Var.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            w71Var.k1(i43, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    w71 w71Var2 = this.b;
                                                    if (w71Var2.s1 == null) {
                                                        if (w71Var2.b != 2) {
                                                            w71Var2.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            w71Var2.k1(i20, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.O0;
                                    textViewArr2[i20] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i20].setTypeface(org.telegram.messenger.g0.o());
                                    org.telegram.ui.ActionBar.s6.U(textViewArr2[i20], i40, getResourceProvider());
                                    textViewArr2[i20].setText(org.telegram.messenger.id.L0(2131754216));
                                    textViewArr2[i20].setGravity(17);
                                    textViewArr2[i20].setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                                    org.telegram.ui.ActionBar.s6.Q(textViewArr2[i20], org.telegram.ui.ActionBar.l6.g0(getThemedColor(i41), 0), null, org.telegram.ui.ActionBar.s6.M(i41), getResourceProvider());
                                    viewGroupArr2[i20].addView(textViewArr2[i20], c8.ha.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i20];
                                    r14 = 1;
                                    final char c10 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r61
                                        public final /* synthetic */ w71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c10) {
                                                case 0:
                                                    w71 w71Var = this.b;
                                                    if (w71Var.s1 == null) {
                                                        int i43 = i20;
                                                        if (i43 == 0) {
                                                            w71Var.i1 = w71Var.j1;
                                                            w71Var.f1(w71Var.h1, 3, true);
                                                            w71Var.f1(w71Var.g1, 2, true);
                                                            w71Var.f1(w71Var.f1, 1, true);
                                                            w71Var.f1(w71Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = w71Var.Y0;
                                                            w71Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                w71Var.y0.setImageDrawable(null);
                                                            } else {
                                                                m71 m71Var2 = w71Var.y0;
                                                                org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_wallPaper2.document);
                                                                String str3 = w71Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = w71Var.X0;
                                                                m71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str3, null, "jpg", b11, null);
                                                            }
                                                            w71Var.K0[1].a(w71Var.X0 != null, false);
                                                            float f13 = w71Var.n1;
                                                            w71Var.m1 = f13;
                                                            w71Var.U0.setProgress(f13);
                                                            w71Var.y0.getImageReceiver().setAlpha(w71Var.m1);
                                                            w71Var.o1();
                                                            w71Var.s1();
                                                        }
                                                        if (w71Var.b != 2) {
                                                            if (w71Var.X0 == null) {
                                                                if (w71Var.F1) {
                                                                    w71Var.F1 = false;
                                                                    w71Var.K0[0].a(false, true);
                                                                    w71Var.Q0();
                                                                }
                                                                w71Var.q1();
                                                            }
                                                            w71Var.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            w71Var.k1(i43, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    w71 w71Var2 = this.b;
                                                    if (w71Var2.s1 == null) {
                                                        if (w71Var2.b != 2) {
                                                            w71Var2.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            w71Var2.k1(i20, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    k6Var = k6Var2;
                                    r14 = 1;
                                    f12 = 21.0f;
                                }
                                if (i20 == r14) {
                                    TextView textView8 = new TextView(context);
                                    this.f2 = textView8;
                                    textView8.setLines(r14);
                                    this.f2.setSingleLine(r14);
                                    this.f2.setText(org.telegram.messenger.id.L0(2131753749));
                                    org.telegram.ui.ActionBar.s6.U(this.f2, org.telegram.ui.ActionBar.l6.G6, getResourceProvider());
                                    this.f2.setTextSize(r14, 20.0f);
                                    this.f2.setTypeface(org.telegram.messenger.g0.o());
                                    this.f2.setPadding(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(8.0f));
                                    this.f2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.f2.setGravity(16);
                                    viewGroupArr[i20].addView(this.f2, c8.ha.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    f61 f61Var = new f61(context);
                                    this.Q0 = f61Var;
                                    v4.b0 b0Var = new v4.b0(0, false);
                                    this.S0 = b0Var;
                                    f61Var.setLayoutManager(b0Var);
                                    f61 f61Var2 = this.Q0;
                                    u71 u71Var = new u71(context, this);
                                    this.R0 = u71Var;
                                    f61Var2.setAdapter(u71Var);
                                    this.Q0.i(new di.k(14));
                                    viewGroupArr[i20].addView(this.Q0, c8.ha.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.Q0.setOnItemClickListener(new zx0(this, 7));
                                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
                                    this.T0 = n4Var;
                                    n4Var.setText(org.telegram.messenger.id.L0(2131753744));
                                    viewGroupArr[i20].addView(this.T0, c8.ha.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(context, (x61) getResourceProvider());
                                    this.U0 = h0Var;
                                    h0Var.setProgress(this.m1);
                                    this.U0.setReportChanges(true);
                                    this.U0.setDelegate(new z61(this));
                                    viewGroupArr[i20].addView(this.U0, c8.ha.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(context, this.h0, new a71(this));
                                    this.W = vpVar;
                                    vpVar.setResourcesProvider(getResourceProvider());
                                    if (i10 == 1) {
                                        viewGroupArr[i20].addView(this.W, c8.ha.e(-1, -1, 1));
                                        if (k6Var.q()) {
                                            this.W.setMinBrightness(0.2f);
                                        } else {
                                            this.W.setMinBrightness(0.05f);
                                            this.W.setMaxBrightness(0.8f);
                                        }
                                        if (i6Var2 != null) {
                                            int i43 = i6Var2.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.vp vpVar2 = this.W;
                                            Y0(1);
                                            vpVar2.f(1, 2, i43, false);
                                            this.W.e(i6Var2.c, 0);
                                            int i44 = i6Var2.d;
                                            if (i44 != 0) {
                                                this.W.e(i44, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i20].addView(this.W, c8.ha.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i20++;
                                k6Var2 = k6Var;
                            }
                        }
                        o1();
                        if (!this.y0.getImageReceiver().I()) {
                            this.u0.setBackgroundColor(-16777216);
                        }
                        if (i10 != 1 && !(this.C1 instanceof sc1)) {
                            this.y0.getImageReceiver().c0(true);
                        }
                    }
                    i15 = 0;
                    String[] strArr3 = new String[i15];
                    int[] iArr3 = new int[i15];
                    this.K0 = new org.telegram.ui.Components.x61[i15];
                    if (i15 != 0) {
                    }
                    i18 = 0;
                    while (true) {
                        x61Var = this.a;
                        if (i18 >= i15) {
                        }
                        i18++;
                        i6Var = i6Var3;
                        i23 = 0;
                        i14 = 2;
                        i16 = 1;
                    }
                    i19 = i16;
                    i6Var2 = i6Var;
                    if (i10 == i19) {
                    }
                    if (i10 != i19) {
                    }
                    this.G1 = false;
                    i20 = 0;
                    while (i20 < 2) {
                    }
                    o1();
                    if (!this.y0.getImageReceiver().I()) {
                    }
                    if (i10 != 1) {
                        this.y0.getImageReceiver().c0(true);
                    }
                } else {
                    if (!(obj instanceof tc1) || !"t".equals(((tc1) obj).a)) {
                        i15 = i14;
                        String[] strArr32 = new String[i15];
                        int[] iArr32 = new int[i15];
                        this.K0 = new org.telegram.ui.Components.x61[i15];
                        if (i15 != 0) {
                        }
                        i18 = 0;
                        while (true) {
                            x61Var = this.a;
                            if (i18 >= i15) {
                            }
                            i18++;
                            i6Var = i6Var3;
                            i23 = 0;
                            i14 = 2;
                            i16 = 1;
                        }
                        i19 = i16;
                        i6Var2 = i6Var;
                        if (i10 == i19) {
                        }
                        if (i10 != i19) {
                        }
                        this.G1 = false;
                        i20 = 0;
                        while (i20 < 2) {
                        }
                        o1();
                        if (!this.y0.getImageReceiver().I()) {
                        }
                        if (i10 != 1) {
                        }
                    }
                    i15 = 0;
                    String[] strArr322 = new String[i15];
                    int[] iArr322 = new int[i15];
                    this.K0 = new org.telegram.ui.Components.x61[i15];
                    if (i15 != 0) {
                    }
                    i18 = 0;
                    while (true) {
                        x61Var = this.a;
                        if (i18 >= i15) {
                        }
                        i18++;
                        i6Var = i6Var3;
                        i23 = 0;
                        i14 = 2;
                        i16 = 1;
                    }
                    i19 = i16;
                    i6Var2 = i6Var;
                    if (i10 == i19) {
                    }
                    if (i10 != i19) {
                    }
                    this.G1 = false;
                    i20 = 0;
                    while (i20 < 2) {
                    }
                    o1();
                    if (!this.y0.getImageReceiver().I()) {
                    }
                    if (i10 != 1) {
                    }
                }
            } else {
                i6Var2 = i6Var4;
            }
            this.v0.setAdapter(this.w0);
            bi.x5 x5Var2 = new bi.x5(this, context, 28);
            this.l0 = x5Var2;
            x5Var2.setWillNotDraw(false);
            bi.x5 x5Var3 = this.l0;
            this.fragmentView = x5Var3;
            ViewTreeObserver viewTreeObserver = x5Var3.getViewTreeObserver();
            a80 a80Var = new a80(this, 1);
            this.R = a80Var;
            viewTreeObserver.addOnGlobalLayoutListener(a80Var);
            c5.k kVar = new c5.k(context);
            this.k0 = kVar;
            kVar.b(new k2(this, 2));
            this.k0.setAdapter(new org.telegram.ui.Components.b20(this, 3));
            org.telegram.messenger.g0.C3(this.k0, getThemedColor(org.telegram.ui.ActionBar.l6.s8));
            this.l0.addView(this.k0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.m0 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.l0.addView(this.m0, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i10 != 0) {
                View view = new View(context);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view, getResourceProvider());
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                this.l0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.c0 = frameLayout;
                boolean z13 = this.d;
                if (z13) {
                    int i45 = org.telegram.ui.ActionBar.l6.d6;
                    frameLayout.setBackgroundColor(z13 ? org.telegram.ui.ActionBar.l6.F0(i45) : getThemedColor(i45));
                } else {
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, frameLayout, getResourceProvider());
                }
                this.l0.addView(this.c0, c8.ha.e(-1, 48, 83));
                fi.p5 p5Var = new fi.p5(context, this);
                this.b0 = p5Var;
                this.c0.addView(p5Var, c8.ha.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.e0 = textView9;
                textView9.setTextSize(1, 14.0f);
                if (z13) {
                    TextView textView10 = this.e0;
                    int i46 = org.telegram.ui.ActionBar.l6.pf;
                    textView10.setTextColor(z13 ? org.telegram.ui.ActionBar.l6.F0(i46) : getThemedColor(i46));
                } else {
                    org.telegram.ui.ActionBar.s6.U(this.e0, org.telegram.ui.ActionBar.l6.pf, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.g0(251658240, 0));
                this.e0.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
                this.e0.setText(org.telegram.messenger.id.L0(2131752589));
                this.e0.setTypeface(org.telegram.messenger.g0.o());
                this.c0.addView(this.e0, c8.ha.e(-2, -1, 51));
                final int i47 = 0;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.k61
                    public final /* synthetic */ w71 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i47) {
                            case 0:
                                this.b.S0(false);
                                break;
                            case 1:
                                w71.a0(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.R0(false);
                                break;
                            default:
                                this.b.R0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.d0 = textView11;
                textView11.setTextSize(1, 14.0f);
                if (z13) {
                    TextView textView12 = this.d0;
                    int i48 = org.telegram.ui.ActionBar.l6.pf;
                    textView12.setTextColor(z13 ? org.telegram.ui.ActionBar.l6.F0(i48) : getThemedColor(i48));
                } else {
                    org.telegram.ui.ActionBar.s6.U(this.d0, org.telegram.ui.ActionBar.l6.pf, getResourceProvider());
                }
                this.d0.setGravity(17);
                this.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.g0(251658240, 0));
                this.d0.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
                this.d0.setText(org.telegram.messenger.id.L0(2131754216));
                this.d0.setTypeface(org.telegram.messenger.g0.o());
                this.c0.addView(this.d0, c8.ha.e(-2, -1, 53));
                i21 = 1;
                this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.k61
                    public final /* synthetic */ w71 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i21) {
                            case 0:
                                this.b.S0(false);
                                break;
                            case 1:
                                w71.a0(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.R0(false);
                                break;
                            default:
                                this.b.R0(true);
                                break;
                        }
                    }
                });
            } else {
                i21 = 1;
            }
            if (i10 == i21 && !org.telegram.ui.ActionBar.l6.c1() && i6Var2 != null && i6Var2.j != 4294967296L) {
                c1();
            }
            this.j0 = X0();
            g1(true);
            r1(false);
            this.c = new Scroller(getContext());
            q4Var2 = this.parentLayout;
            if (q4Var2 != null && q4Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.l6.h5));
                if (i10 == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            }
            return this.fragmentView;
        }
        z9 = false;
        this.N1 = z9;
        if (z9) {
        }
        q4Var = this.parentLayout;
        if (q4Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.n0 = new FrameLayout(context);
        i7 = 3;
        if (this.N1) {
            org.telegram.messenger.g0.i3(new j61(this, i7), 2000L);
        }
        this.actionBar.r().a(0, R.drawable.outline_header_search).M().J(new i71()).setSearchFieldHint(org.telegram.messenger.id.L0(2131745836));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.r4());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(org.telegram.messenger.id.L0(2131744172));
        k0 k0Var2 = new k0(26, context, this);
        this.n0 = k0Var2;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, k0Var2, getResourceProvider());
        this.n0.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        org.telegram.ui.Components.qj0 qj0Var3 = new org.telegram.ui.Components.qj0(context);
        this.o0 = qj0Var3;
        qj0Var3.setVerticalScrollBarEnabled(true);
        this.o0.setItemAnimator(null);
        this.o0.setLayoutAnimation(null);
        this.o0.setLayoutManager(new v4.b0(1, false));
        final int i242 = 2;
        this.o0.setVerticalScrollbarPosition(!org.telegram.messenger.id.a0 ? 1 : 2);
        org.telegram.ui.Components.qj0 qj0Var22 = this.o0;
        i10 = this.b;
        qj0Var22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i10 == 0 ? 12.0f : 0.0f));
        this.o0.setOnItemClickListener(new org.telegram.ui.Components.g7(i242));
        this.n0.addView(this.o0, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.q00 q00Var2 = new org.telegram.ui.Components.q00(context, this.resourceProvider);
        this.q0 = q00Var2;
        q00Var2.setImageResource(R.drawable.floating_pencil);
        this.n0.addView(this.q0, org.telegram.ui.Components.q00.b());
        l4 l4Var2 = new l4(context);
        this.p0 = l4Var2;
        this.o0.setAdapter(l4Var2);
        this.u0 = new org.telegram.ui.ActionBar.l0(i242, context, this);
        this.w0 = new s71(context, this);
        this.t0 = createActionBar(context);
        if (org.telegram.messenger.g0.Q1()) {
        }
        this.t0.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.t0.setActionBarMenuOnItemClick(new l71(this));
        i11 = 0;
        while (true) {
            m71VarArr = this.x0;
            if (i11 < 2) {
            }
            m71VarArr[i11] = new m71(this, (Activity) getContext());
            this.u0.addView(m71VarArr[i11], c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i11++;
        }
        m71 m71Var2 = m71VarArr[0];
        this.y0 = m71Var2;
        m71Var2.setVisibility(0);
        m71VarArr[1].setVisibility(8);
        if (i10 == 2) {
        }
        z10 = this.w0.e;
        org.telegram.ui.ActionBar.k6 k6Var22 = this.f0;
        final int i252 = 4;
        if (!z10) {
        }
        this.v0 = new s61(context, this);
        t61 t61Var2 = new t61(this);
        t61Var2.S();
        this.v0.setItemAnimator(t61Var2);
        this.v0.setVerticalScrollBarEnabled(true);
        this.v0.setOverScrollMode(2);
        if (i10 != 2) {
        }
        this.v0.setClipToPadding(false);
        this.v0.setLayoutManager(new v4.b0(1, true));
        this.v0.setVerticalScrollbarPosition(!org.telegram.messenger.id.a0 ? 1 : 2);
        if (i10 != 1) {
        }
        this.v0.setOnScrollListener(new d21(this, i7));
        this.u0.addView(this.t0, c8.ha.c(-2.0f, i13));
        org.telegram.ui.Components.z61 z61Var2 = new org.telegram.ui.Components.z61(context);
        this.w1 = z61Var2;
        z61Var2.b(new l61(this, i242));
        org.telegram.ui.ActionBar.i6 i6Var42 = this.w;
        if (i10 != 1) {
        }
        if (i10 != 2) {
        }
        Rect rect3 = new Rect();
        Drawable h7 = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.r = h7;
        h7.getPadding(rect3);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.l6.d6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        obj = this.C1;
        if (i10 != 1) {
        }
        if (obj instanceof sc1) {
        }
        i15 = 3;
        String[] strArr3222 = new String[i15];
        int[] iArr3222 = new int[i15];
        this.K0 = new org.telegram.ui.Components.x61[i15];
        if (i15 != 0) {
        }
        i18 = 0;
        while (true) {
            x61Var = this.a;
            if (i18 >= i15) {
            }
            i18++;
            i6Var = i6Var3;
            i23 = 0;
            i14 = 2;
            i16 = 1;
        }
        i19 = i16;
        i6Var2 = i6Var;
        if (i10 == i19) {
        }
        if (i10 != i19) {
        }
        this.G1 = false;
        i20 = 0;
        while (i20 < 2) {
        }
        o1();
        if (!this.y0.getImageReceiver().I()) {
        }
        if (i10 != 1) {
        }
        this.v0.setAdapter(this.w0);
        bi.x5 x5Var22 = new bi.x5(this, context, 28);
        this.l0 = x5Var22;
        x5Var22.setWillNotDraw(false);
        bi.x5 x5Var32 = this.l0;
        this.fragmentView = x5Var32;
        ViewTreeObserver viewTreeObserver2 = x5Var32.getViewTreeObserver();
        a80 a80Var2 = new a80(this, 1);
        this.R = a80Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(a80Var2);
        c5.k kVar2 = new c5.k(context);
        this.k0 = kVar2;
        kVar2.b(new k2(this, 2));
        this.k0.setAdapter(new org.telegram.ui.Components.b20(this, 3));
        org.telegram.messenger.g0.C3(this.k0, getThemedColor(org.telegram.ui.ActionBar.l6.s8));
        this.l0.addView(this.k0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.m0 = undoView2;
        undoView2.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.l0.addView(this.m0, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i10 != 0) {
        }
        if (i10 == i21) {
            c1();
        }
        this.j0 = X0();
        g1(true);
        r1(false);
        this.c = new Scroller(getContext());
        q4Var2 = this.parentLayout;
        if (q4Var2 != null) {
            this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.l6.h5));
            if (i10 == 2) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(int i7, boolean z9) {
        org.telegram.ui.ActionBar.i6 i6Var;
        int i10;
        if (getParentActivity() == null || this.n == i7 || this.s1 != null || (i6Var = this.w) == null) {
            return;
        }
        if (z9 && i7 == 2 && (org.telegram.ui.ActionBar.l6.c1() || i6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131752550, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            if (!org.telegram.ui.ActionBar.l6.c1() || (org.telegram.ui.ActionBar.l6.c1() && org.telegram.ui.ActionBar.l6.I.i0.d != 0)) {
                u1Var.T = org.telegram.messenger.id.M0(2131752549, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new l61(this, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751771, null), new l61(this, 6));
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131752529, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752552, null), new l61(this, 7));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            }
            showDialog(u1Var);
            return;
        }
        int i11 = this.n;
        this.n = i7;
        if (i7 == 1) {
            i10 = i11;
            this.h.setText(org.telegram.messenger.id.M0(2131752015, null));
            int i12 = i6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.vp vpVar = this.W;
            Y0(1);
            vpVar.f(1, 2, i12, false);
            this.W.e(i6Var.c, 0);
            int i13 = i6Var.d;
            if (i13 != 0) {
                this.W.e(i13, 1);
            }
            if (i10 == 2 || (i10 == 3 && i6Var.g != 0)) {
                this.w0.s(0);
            }
        } else if (i7 != 2) {
            if (i7 == 3) {
                this.h.setText(org.telegram.messenger.id.M0(2131752014, null));
                int i14 = i6Var.f != 0 ? i6Var.h != 0 ? 4 : i6Var.g != 0 ? 3 : 2 : 1;
                org.telegram.ui.Components.vp vpVar2 = this.W;
                Y0(3);
                vpVar2.f(2, 4, i14, true);
                this.W.e(i6Var.h, 3);
                this.W.e(i6Var.g, 2);
                this.W.e(i6Var.f, 1);
                org.telegram.ui.Components.vp vpVar3 = this.W;
                int i15 = i6Var.e;
                if (i15 == 0) {
                    i15 = i6Var.c;
                }
                vpVar3.e(i15, 0);
                this.L0[1].b(0, i6Var.e);
                this.L0[1].b(1, i6Var.f);
                this.L0[1].b(2, i6Var.g);
                this.L0[1].b(3, i6Var.h);
                if (i6Var.g != 0) {
                    if (i11 == 1) {
                        this.w0.i(0);
                    } else {
                        this.w0.g(0);
                    }
                } else if (i11 == 2) {
                    this.w0.s(0);
                }
                this.v0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                j1();
            }
            i10 = i11;
        } else {
            this.h.setText(org.telegram.messenger.id.M0(2131752016, null));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.Be);
            int i16 = org.telegram.ui.ActionBar.l6.Ce;
            int themedColor2 = org.telegram.ui.ActionBar.l6.f1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.l6.De;
            int themedColor3 = org.telegram.ui.ActionBar.l6.f1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.l6.Ee;
            int themedColor4 = org.telegram.ui.ActionBar.l6.f1(i18) ? getThemedColor(i18) : 0;
            long j3 = i6Var.k;
            int i19 = (int) j3;
            if (i19 == 0 && j3 != 0) {
                themedColor2 = 0;
            }
            long j10 = i6Var.l;
            int i20 = (int) j10;
            if (i20 == 0 && j10 != 0) {
                themedColor3 = 0;
            }
            long j11 = i6Var.m;
            int i21 = (int) j11;
            if (i21 == 0 && j11 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) i6Var.j;
            int i23 = (i19 == 0 && themedColor2 == 0) ? 1 : (i21 == 0 && themedColor4 == 0) ? (i20 == 0 && themedColor3 == 0) ? 2 : 3 : 4;
            org.telegram.ui.Components.vp vpVar4 = this.W;
            Y0(2);
            vpVar4.f(2, 4, i23, false);
            org.telegram.ui.Components.vp vpVar5 = this.W;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            vpVar5.e(i21, 3);
            org.telegram.ui.Components.vp vpVar6 = this.W;
            if (i20 == 0) {
                i20 = themedColor3;
            }
            vpVar6.e(i20, 2);
            org.telegram.ui.Components.vp vpVar7 = this.W;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            vpVar7.e(i19, 1);
            org.telegram.ui.Components.vp vpVar8 = this.W;
            if (i22 != 0) {
                themedColor = i22;
            }
            vpVar8.e(themedColor, 0);
            i10 = i11;
            if (i10 == 1 || i6Var.g == 0) {
                this.w0.i(0);
            } else {
                this.w0.g(0);
            }
            this.v0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
        }
        if (i7 != 1 && i7 != 3) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
            return;
        }
        if (i10 == 2 && this.M0[1].getVisibility() == 0) {
            k1(0, true, true);
        }
        if (i7 != 1) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        } else if (this.f0.q()) {
            this.W.setMinBrightness(0.2f);
        } else {
            this.W.setMinBrightness(0.05f);
            this.W.setMaxBrightness(0.8f);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i7 == org.telegram.messenger.qs.p3) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.i4) {
            org.telegram.ui.Components.qj0 qj0Var = this.o0;
            if (qj0Var == null) {
                return;
            }
            int childCount = qj0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.o0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) childAt).j0(0, true);
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.j4) {
            s61 s61Var = this.v0;
            if (s61Var != null) {
                s61Var.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.z4) {
            if (this.u0 != null) {
                g1(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f4) {
            Object obj = this.C1;
            if (obj instanceof tc1) {
                tc1 tc1Var = (tc1) obj;
                if (tc1Var.a == null) {
                    tc1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j3 = 0;
        if (i7 != org.telegram.messenger.qs.e4) {
            if (i7 != org.telegram.messenger.qs.u5 || this.K1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.V0.clear();
        HashMap hashMap = this.W0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z9 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.V0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.i6 i6Var = this.w;
                if (i6Var != null && (str = i6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                    g1(false);
                    o1();
                } else if (i6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        String str2 = tL_wallPaper2.slug;
                        if (str2 != null) {
                            if (!str2.equals(wallPaper.slug)) {
                            }
                        }
                    }
                }
                z9 = true;
            }
        }
        if (!z9 && (tL_wallPaper = this.X0) != null) {
            this.V0.add(0, tL_wallPaper);
        }
        u71 u71Var = this.R0;
        if (u71Var != null) {
            u71Var.f();
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j3 = org.telegram.messenger.ui.p(j3, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new q61(this, 1)), this.classGuid);
    }

    public final void e1(int i7) {
        TLRPC.TL_wallPaper tL_wallPaper = (i7 < 0 || i7 >= this.V0.size()) ? this.Z0 : (TLRPC.TL_wallPaper) this.V0.get(i7);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d2.cancel();
        }
        m71[] m71VarArr = this.x0;
        m71 m71Var = m71VarArr[0];
        m71 m71Var2 = m71VarArr[1];
        m71VarArr[0] = m71Var2;
        m71VarArr[1] = m71Var;
        this.u0.removeView(m71Var2);
        this.u0.addView(m71VarArr[0], this.u0.indexOfChild(m71VarArr[1]) + 1);
        m71 m71Var3 = m71VarArr[0];
        this.y0 = m71Var3;
        m71Var3.setBackground(m71VarArr[1].getBackground());
        p1();
        m71VarArr[1].setVisibility(0);
        m71VarArr[1].setAlpha(1.0f);
        this.y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d2 = ofFloat;
        ofFloat.addUpdateListener(new ki(2, this));
        this.d2.addListener(new b71(this, 0));
        this.d2.setInterpolator(org.telegram.ui.Components.xq.f);
        this.d2.setDuration(300L);
        this.d2.start();
        this.y0.getImageReceiver().s1 = org.telegram.messenger.qs.X4;
        this.y0.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_wallPaper.document), this.H1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.y0.d();
        this.X0 = tL_wallPaper;
        this.F1 = this.K0[2].s;
        o1();
    }

    public final void f1(int i7, int i10, boolean z9) {
        org.telegram.ui.Components.ra0 ra0Var;
        if (i10 == 0) {
            this.a1 = i7;
        } else if (i10 == 1) {
            this.c1 = i7;
        } else if (i10 == 2) {
            this.d1 = i7;
        } else if (i10 == 3) {
            this.e1 = i7;
        }
        r1(z9);
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr = this.K0;
                if (i11 >= x61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var = x61VarArr[i11];
                if (x61Var != null) {
                    x61Var.b(i10, i7);
                }
                i11++;
            }
        }
        if (this.d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.l6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.y0.getBackground();
            if (background instanceof org.telegram.ui.Components.ra0) {
                ra0Var = (org.telegram.ui.Components.ra0) background;
            } else {
                ra0Var = new org.telegram.ui.Components.ra0();
                ra0Var.q(this.y0);
                if (this.E1) {
                    ra0Var.m(false);
                }
            }
            ra0Var.n(this.a1, this.c1, this.d1, this.e1);
            this.y0.setBackground(ra0Var);
            this.k1 = ra0Var.f();
            this.l1 = 754974720;
        } else if (this.c1 != 0) {
            this.y0.setBackground(new GradientDrawable(org.telegram.ui.Components.k9.d(this.i1), new int[]{this.a1, this.c1}));
            int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(this.a1, this.c1), false);
            this.l1 = V0;
            this.k1 = V0;
        } else {
            this.y0.setBackgroundColor(this.a1);
            int V02 = org.telegram.messenger.g0.V0(this.a1, false);
            this.l1 = V02;
            this.k1 = V02;
        }
        int i12 = org.telegram.ui.ActionBar.l6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.l6.f1(i12);
        x61 x61Var2 = this.a;
        if (!f12 || (this.y0.getBackground() instanceof org.telegram.ui.Components.ra0)) {
            x61Var2.k(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        } else if (org.telegram.ui.ActionBar.l6.t0() instanceof org.telegram.ui.Components.ra0) {
            getThemedColor(i12);
            x61Var2.k(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.Wc, x61Var2, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.Wc, x61Var2, PorterDuff.Mode.MULTIPLY);
        }
        m71 m71Var = this.y0;
        if (m71Var != null) {
            m71Var.getImageReceiver().o1 = new PorterDuffColorFilter(this.k1, this.t1);
            this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
            this.y0.invalidate();
            if (org.telegram.ui.ActionBar.l6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.ra0)) {
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.m1 < 0.0f) {
                    this.y0.getImageReceiver().m0(((org.telegram.ui.Components.ra0) this.y0.getBackground()).k);
                }
            } else {
                this.y0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.U0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.m1);
            }
        }
        s61 s61Var = this.v0;
        if (s61Var != null) {
            s61Var.g1();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.z0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.A0.getChildAt(i14).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(boolean z9) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.ra0 ra0Var;
        org.telegram.ui.ActionBar.i6 i6Var = this.w;
        int i7 = 0;
        int i10 = this.b;
        if (i10 == 0 && i6Var == null) {
            this.y0.setBackground(org.telegram.ui.ActionBar.l6.s0());
        } else {
            if (i10 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize w10 = z9 ? org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, 100, false, null, false) : null;
                    BitmapDrawable bitmapDrawable = w10 instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(org.telegram.messenger.gc.F("b", w10.bytes)) : null;
                    m71 m71Var = this.y0;
                    m71Var.a.r0(org.telegram.messenger.hc.b(tL_wallPaper.document), this.H1, org.telegram.messenger.hc.c(w10, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    m71Var.d();
                } else if (obj instanceof sc1) {
                    sc1 sc1Var = (sc1) obj;
                    int i11 = sc1Var.f;
                    int i12 = sc1Var.e;
                    int i13 = sc1Var.d;
                    int i14 = sc1Var.c;
                    int i15 = sc1Var.b;
                    this.i1 = i11;
                    f1(i15, 0, false);
                    if (i14 != 0) {
                        f1(i14, 1, false);
                    }
                    f1(i13, 2, false);
                    f1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        m71 m71Var2 = this.y0;
                        org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        m71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(sc1Var.a)) {
                        Point point = org.telegram.messenger.g0.q;
                        this.y0.setImageBitmap(org.telegram.messenger.sz.d(R.raw.default_pattern, Math.min(point.x, point.y), Math.max(point.x, point.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.ra0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof tc1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.y0.setImageBitmap(bitmap);
                    } else {
                        tc1 tc1Var = (tc1) obj;
                        File file = tc1Var.e;
                        if (file != null) {
                            this.y0.h(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = tc1Var.d;
                            if (file2 != null) {
                                this.y0.h(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(tc1Var.a)) {
                                m71 m71Var3 = this.y0;
                                m71Var3.setImageDrawable(org.telegram.ui.ActionBar.l6.Z0(m71Var3, false));
                            } else {
                                int i16 = tc1Var.b;
                                if (i16 != 0) {
                                    this.y0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    TLRPC.Photo photo = kfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(kfVar.K.sizes, this.I1, true, null, false);
                        TLRPC.PhotoSize photoSize = w12 != w11 ? w12 : null;
                        this.y0.g(1, photoSize != null ? photoSize.size : 0, kfVar, this.H1, "100_100_b", "jpg", org.telegram.messenger.hc.i(photoSize, kfVar.K), org.telegram.messenger.hc.i(w11, kfVar.K));
                    } else {
                        m71 m71Var4 = this.y0;
                        String str2 = kfVar.C;
                        String str3 = this.H1;
                        String str4 = kfVar.D;
                        m71Var4.getClass();
                        m71Var4.n(org.telegram.messenger.hc.g(str2), str3, org.telegram.messenger.hc.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (i6Var == null) {
                this.y0.setBackground(org.telegram.ui.ActionBar.l6.s0());
            } else {
                org.telegram.ui.Components.f9 f9Var = this.v1;
                if (f9Var != null) {
                    f9Var.dispose();
                    this.v1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Be);
                int i17 = (int) i6Var.j;
                if (i17 != 0) {
                    E0 = i17;
                }
                int E02 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                long j3 = i6Var.k;
                int i18 = (int) j3;
                if (i18 == 0 && j3 != 0) {
                    E02 = 0;
                } else if (i18 != 0) {
                    E02 = i18;
                }
                int E03 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                long j10 = i6Var.l;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E03 = 0;
                } else if (i19 != 0) {
                    E03 = i19;
                }
                int E04 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ee);
                long j11 = i6Var.m;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E04 = 0;
                } else if (i20 != 0) {
                    E04 = i20;
                }
                if (TextUtils.isEmpty(i6Var.o) || org.telegram.ui.ActionBar.l6.c1()) {
                    Drawable t02 = org.telegram.ui.ActionBar.l6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.ra0) {
                            ((org.telegram.ui.Components.ra0) t02).q(this.y0);
                        }
                        this.y0.setBackground(t02);
                    }
                } else {
                    if (E03 != 0) {
                        Drawable background = this.y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.ra0) {
                            ra0Var = (org.telegram.ui.Components.ra0) background;
                        } else {
                            org.telegram.ui.Components.ra0 ra0Var2 = new org.telegram.ui.Components.ra0();
                            ra0Var2.q(this.y0);
                            ra0Var = ra0Var2;
                            if (this.E1) {
                                ra0Var2.m(false);
                                ra0Var = ra0Var2;
                            }
                        }
                        ra0Var.n(E0, E02, E03, E04);
                        colorDrawable = ra0Var;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(org.telegram.ui.Components.k9.d(i6Var.n), new int[]{E0, E02});
                        this.v1 = k9Var.f(org.telegram.ui.Components.n.x(0.5f, 3), new f71(this, i7), 100L);
                        colorDrawable = k9Var;
                    } else {
                        colorDrawable = new ColorDrawable(E0);
                    }
                    this.y0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        m71 m71Var5 = this.y0;
                        org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        m71Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.g0.V0(E0, false);
                    this.l1 = V0;
                    this.k1 = V0;
                } else if (E03 != 0) {
                    this.k1 = org.telegram.ui.Components.ra0.g(E0, E02, E03, E04);
                    this.l1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(E0, E02), false);
                    this.l1 = V02;
                    this.k1 = V02;
                }
                m71 m71Var6 = this.y0;
                if (m71Var6 != null) {
                    m71Var6.getImageReceiver().o1 = new PorterDuffColorFilter(this.k1, this.t1);
                    this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
                    this.y0.invalidate();
                    if (org.telegram.ui.ActionBar.l6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.ra0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.m1 < 0.0f) {
                            this.y0.getImageReceiver().m0(((org.telegram.ui.Components.ra0) this.y0.getBackground()).k);
                        }
                    } else {
                        this.y0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.U0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.m1);
                    }
                }
                if (this.K0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.x61[] x61VarArr = this.K0;
                        if (i21 >= x61VarArr.length) {
                            break;
                        }
                        x61VarArr[i21].b(0, E0);
                        this.K0[i21].b(1, E02);
                        this.K0[i21].b(2, E03);
                        this.K0[i21].b(3, E04);
                        i21++;
                    }
                }
                ImageView imageView = this.G0;
                x61 x61Var = this.a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.Wc, x61Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.Wc, x61Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.E1 = false;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.u1;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return this.M1 ? X0() : super.getThemeDescriptions();
    }

    public final void h1(long j3) {
        this.K1 = j3;
        this.L1 = j3 == 0 || j3 == getUserConfig().e();
    }

    public final void i1(org.telegram.ui.Cells.t0 t0Var) {
        float f10;
        if (this.y0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.y0.getMeasuredWidth() - (Math.max(this.y0.getMeasuredWidth() / width, this.y0.getMeasuredHeight() / r0.i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f10 = this.Y1 + 0.0f;
        }
        float y10 = t0Var.getY() - ((-this.y0.J) + 0.0f);
        int measuredHeight = this.y0.getMeasuredHeight();
        float f11 = this.N1 ? this.o1 * this.p1 : 0.0f;
        t0Var.w0 = true;
        t0Var.v0 = measuredHeight;
        t0Var.t0 = y10;
        t0Var.u0 = f10;
        t0Var.b2 = f11;
        t0Var.c2.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f)));
        t0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.b2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m));
    }

    public final void j1() {
        if (this.u0 == null || this.L0 == null || this.w.g == 0) {
            return;
        }
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        if (e12.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.B0 == null) {
            org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(getParentActivity(), 8);
            this.B0 = z20Var;
            z20Var.setShowingDuration(5000L);
            this.B0.setAlpha(0.0f);
            this.B0.setVisibility(4);
            this.B0.setText(org.telegram.messenger.id.M0(2131753751, null));
            this.B0.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
            this.l0.addView(this.B0, c8.ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        org.telegram.messenger.g0.i3(new ax0(15, this, e12), 500L);
    }

    public final void k1(int i7, boolean z9, boolean z10) {
        int indexOf;
        boolean z11 = z9 && i7 == 1 && this.X0 != null;
        int i10 = this.b;
        if (z9) {
            if (i7 != 0) {
                this.Y0 = this.X0;
                this.n1 = this.m1;
                this.R0.f();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i10 == 2 ? 1 : 0);
                    }
                    this.S0.h1(indexOf, (this.Q0.getMeasuredWidth() - org.telegram.messenger.g0.L(124.0f)) / 2);
                }
            } else if (i10 == 2) {
                this.b1 = this.a1;
                int i11 = this.c1;
                this.f1 = i11;
                int i12 = this.d1;
                this.g1 = i12;
                int i13 = this.e1;
                this.h1 = i13;
                this.j1 = this.P;
                this.W.f(0, 4, i13 != 0 ? 4 : i12 != 0 ? 3 : i11 != 0 ? 2 : 1, false);
                this.W.e(this.e1, 3);
                this.W.e(this.d1, 2);
                this.W.e(this.c1, 1);
                this.W.e(this.a1, 0);
            }
        }
        if (i10 == 1 || i10 == 2) {
            this.K0[z11 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.U0;
            if (!h0Var.M) {
                float f10 = this.m1;
                if (f10 < 0.0f) {
                    float f11 = -f10;
                    this.m1 = f11;
                    h0Var.setProgress(f11);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (!z10) {
            char c10 = i7 == 0 ? (char) 1 : (char) 0;
            if (z9) {
                frameLayoutArr[i7].setVisibility(0);
                if (i10 == 1) {
                    this.v0.setTranslationY(i7 == 1 ? -org.telegram.messenger.g0.L(21.0f) : 0.0f);
                    this.K0[2].setAlpha(z11 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z11 ? 0.0f : 1.0f);
                    if (i7 == 1) {
                        frameLayoutArr[i7].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    org.telegram.messenger.g0.v1(this.W.E[1]);
                } else if (i10 == 2) {
                    this.v0.setTranslationY(org.telegram.messenger.g0.L((this.B1 == null ? 0 : 58) + 72) + (-org.telegram.messenger.g0.L(i7 == 0 ? 343.0f : 316.0f)) + (Z0() ? org.telegram.messenger.g0.n : 0));
                    this.K0[2].setAlpha(z11 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z11 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c10].getVisibility() == 0) {
                        frameLayoutArr[c10].setAlpha(0.0f);
                        frameLayoutArr[i7].setAlpha(1.0f);
                        frameLayoutArr[i7].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i7].setTranslationY(0.0f);
                    }
                } else {
                    if (i7 == 1) {
                        frameLayoutArr[i7].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    org.telegram.messenger.g0.v1(this.W.E[1]);
                }
            } else {
                this.v0.setTranslationY(0.0f);
                frameLayoutArr[i7].setTranslationY(r9.getMeasuredHeight());
                this.K0[0].setAlpha(1.0f);
                this.K0[2].setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
            }
            if (z9 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z9) {
                frameLayoutArr[i7].setVisibility(4);
            }
            if (i10 == 1 || i10 == 2) {
                this.K0[z11 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i7 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.s1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i14 = i7 == 0 ? 1 : 0;
        if (z9) {
            frameLayoutArr[i7].setVisibility(0);
            if (i10 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.v0, (Property<s61, Float>) View.TRANSLATION_Y, i7 == 1 ? -org.telegram.messenger.g0.L(21.0f) : 0.0f));
                org.telegram.ui.Components.x61 x61Var = this.K0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x61Var, (Property<org.telegram.ui.Components.x61, Float>) property, z11 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x61, Float>) property, z11 ? 0.0f : 1.0f));
                if (i7 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) property, 0.0f));
                }
                org.telegram.messenger.g0.v1(this.W.E[1]);
            } else if (i10 == 2) {
                s61 s61Var = this.v0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(s61Var, (Property<s61, Float>) property2, org.telegram.messenger.g0.L((this.B1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i7].getMeasuredHeight()) + (Z0() ? org.telegram.messenger.g0.n : 0)));
                org.telegram.ui.Components.x61 x61Var2 = this.K0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x61Var2, (Property<org.telegram.ui.Components.x61, Float>) property3, z11 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x61, Float>) property3, z11 ? 0.0f : 1.0f));
                if (frameLayoutArr[i14].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i7].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i7 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                org.telegram.messenger.g0.v1(this.W.E[1]);
            }
        } else {
            s61 s61Var2 = this.v0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(s61Var2, (Property<s61, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.x61 x61Var3 = this.K0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(x61Var3, (Property<org.telegram.ui.Components.x61, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.x61, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.y0, (Property<m71, Float>) property5, 1.0f));
        }
        this.s1.playTogether(arrayList2);
        this.s1.addListener(new e71(this, z9, i14, i7, z11));
        this.s1.setInterpolator(org.telegram.ui.Components.xq.g);
        this.s1.setDuration(200L);
        this.s1.start();
    }

    public final void l1() {
        if (this.i2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (Z0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.P1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.P1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i7 = 2;
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        cc ccVar = new cc(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f10, (this.P1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.i2 = ccVar;
        ccVar.setOnTouchListener(new ei.b(i7));
        this.j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new fi.ea(this, 3));
        this.k2.addListener(new b71(this, 4));
        this.k2.setDuration(400L);
        this.k2.setInterpolator(org.telegram.ui.Components.ks.e);
        this.k2.start();
        frameLayout.addView(this.i2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new j61(this, i7));
    }

    public final void m1(boolean z9) {
        long j3 = this.K1;
        if (j3 > 0) {
            this.A1.d(org.telegram.messenger.id.M0(2131754212, null));
            return;
        }
        if (j3 >= 0) {
            this.A1.d(org.telegram.messenger.id.M0(2131754214, null));
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.K1));
        int i7 = 1;
        if (M0 == null) {
            this.A1.d(org.telegram.messenger.id.a0(null, null, 2131754213, org.telegram.messenger.id.M0(2131754904, null).toLowerCase()));
            return;
        }
        this.A1.d(org.telegram.messenger.id.a0(null, null, 2131754213, M0.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.r1 == null) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
                this.r1 = wpVar;
                wpVar.n = 1;
            }
            spannableStringBuilder.setSpan(this.r1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.id.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
            this.A1.c(spannableStringBuilder, z9);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
        if (tL_premium_boostsStatus2 != null) {
            this.A1.c(null, z9);
            return;
        }
        if (this.K1 >= 0 || this.U1 || this.V1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.U1 = true;
        getMessagesController().G0().a(this.K1, new m61(this, i7));
    }

    public final void n1() {
        if (this.G1 && this.x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.y1 = bitmap;
                this.x1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    this.y1 = imageReceiver.n();
                    this.x1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (!this.G1) {
            g1(false);
            return;
        }
        Bitmap bitmap2 = this.x1;
        if (bitmap2 != null) {
            this.y0.setImageBitmap(bitmap2);
        }
    }

    public final void o1() {
        File A;
        String name;
        int i7;
        long j3;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z9 = obj instanceof TLRPC.TL_wallPaper;
        if (z9 || (obj instanceof org.telegram.messenger.kf)) {
            if (z9) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                org.telegram.messenger.w7.G(this.currentAccount);
                file = org.telegram.messenger.w7.J(tL_wallPaper.document, null, true, true);
                j3 = tL_wallPaper.document.size;
            } else {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                TLRPC.Photo photo = kfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.I1, true, null, false);
                    org.telegram.messenger.w7.G(this.currentAccount);
                    A = org.telegram.messenger.w7.J(w10, null, true, true);
                    name = org.telegram.messenger.w7.r(null, w10);
                    i7 = w10.size;
                } else {
                    A = org.telegram.messenger.gc.A(kfVar.C);
                    name = A.getName();
                    i7 = kfVar.G;
                }
                j3 = i7;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.b;
            if (exists) {
                org.telegram.messenger.z5.q(this.currentAccount).v(this);
                this.y0.invalidate();
                if (i10 == 2) {
                    if (j3 == 0 || this.K1 != 0) {
                        this.t0.setSubtitle(null);
                    } else {
                        this.t0.setSubtitle(org.telegram.messenger.g0.i0(j3, false, false));
                    }
                }
            } else {
                org.telegram.messenger.z5.q(this.currentAccount).a(str, null, this);
                if (i10 == 2 && this.K1 == 0) {
                    this.t0.setSubtitle(org.telegram.messenger.id.M0(2131748778, null));
                }
                this.y0.invalidate();
            }
            if (this.X0 == null && (frameLayout = this.z0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i10 == 0) {
                this.d0.setEnabled(exists);
                this.d0.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i10 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.D0.setEnabled(exists);
            n71 n71Var = this.A1;
            if (n71Var != null) {
                n71Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            n71 n71Var2 = this.B1;
            if (n71Var2 != null) {
                n71Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!U0(z9)) {
            return false;
        }
        S0(true);
        return super.onBackPressed(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null || q4Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.l6.h5));
        if (this.b != 2 || this.K1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().E0(-16777216);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.p3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.j4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.u5);
        int i7 = this.b;
        if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.z4);
        }
        if (i7 == 2 || i7 == 1) {
            org.telegram.ui.ActionBar.l6.N = true;
        }
        if (i7 == 0 && this.w == null) {
            this.F1 = org.telegram.ui.ActionBar.l6.i0;
        } else {
            Point point = org.telegram.messenger.g0.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.p));
            sb2.append("_");
            this.H1 = a8.p0.n((int) (max / org.telegram.messenger.g0.p), "_f", sb2);
            this.I1 = Math.max(point.x, point.y);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f4);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.e4);
            this.u1 = org.telegram.messenger.z5.q(this.currentAccount).k();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                org.telegram.messenger.yr.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.p3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.j4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.u5);
        bi.x5 x5Var = this.l0;
        if (x5Var != null && this.R != null) {
            x5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i7 = this.b;
        if ((i7 == 2 || i7 == 1) && this.q1 == null) {
            org.telegram.messenger.g0.h3(new p61(0));
        }
        int i10 = org.telegram.messenger.qs.z4;
        if (i7 == 2) {
            Bitmap bitmap = this.x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.x1 = null;
            }
            this.a.k(null, null, null);
            org.telegram.messenger.qs.e().k(i10, new Object[0]);
        } else if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.qs.e().n(this, i10);
        }
        if (i7 != 0 || this.w != null) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f4);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.e4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.w1.c(false);
        }
        org.telegram.ui.ActionBar.l6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.p0;
        if (l4Var != null) {
            l4Var.f();
        }
        s71 s71Var = this.w0;
        if (s71Var != null) {
            s71Var.f();
        }
        if (this.F1) {
            this.w1.c(true);
        }
        org.telegram.ui.ActionBar.l6.b = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                c5.k kVar = this.k0;
                if (kVar != null) {
                    org.telegram.messenger.g0.C3(kVar, getThemedColor(org.telegram.ui.ActionBar.l6.s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.l6.Jj));
                    this.U0.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        if (z9 || this.b != 2) {
            return;
        }
        this.a.k(null, null, null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.z4, new Object[0]);
    }

    public final void p1() {
        this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
        this.y0.invalidate();
        this.Q0.g1();
        if (this.m1 >= 0.0f) {
            this.y0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.y0.getImageReceiver().Z(null);
            }
            if (this.y0.getBackground() instanceof org.telegram.ui.Components.ra0) {
                this.y0.getImageReceiver().m0(((org.telegram.ui.Components.ra0) this.y0.getBackground()).k);
            }
        }
        this.a.k(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        a1();
    }

    public final void q1() {
        int i7 = this.b;
        if (i7 == 1 || i7 == 2) {
            if (this.X0 == null && (this.C1 instanceof sc1)) {
                this.K0[2].a(false, true);
            }
            this.K0[this.X0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.x61 x61Var = this.K0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(x61Var, (Property<org.telegram.ui.Components.x61, Float>) property, this.X0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x61, Float>) property, this.X0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new c71(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.K0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.X0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.K0[0].a(false, true);
        }
        this.K0[0].setEnabled(this.X0 != null);
        if (this.X0 != null) {
            this.K0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.K0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int L = (org.telegram.messenger.g0.L(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x61, Float>) View.ALPHA, this.X0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.x61 x61Var2 = this.K0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(x61Var2, (Property<org.telegram.ui.Components.x61, Float>) property2, this.X0 != null ? 0.0f : L));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.x61, Float>) property2, this.X0 == null ? -L : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new d71(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x008d, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r23.c1 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(boolean z9) {
        int i7;
        int i10;
        char c10;
        float f10;
        int i11;
        v61 v61Var;
        boolean z10;
        int i12;
        BlendMode blendMode;
        int i13 = Build.VERSION.SDK_INT;
        int i14 = this.b;
        org.telegram.ui.ActionBar.i6 i6Var = this.w;
        if (i13 >= 29) {
            if (i14 == 0) {
                i12 = i6Var != null ? (int) i6Var.l : getThemedColor(org.telegram.ui.ActionBar.l6.De);
            } else if (i14 == 1) {
                i12 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                long j3 = i6Var.l;
                int i15 = (int) j3;
                if (i15 != 0 || j3 == 0) {
                    if (i15 != 0) {
                        i12 = i15;
                    }
                }
                i12 = 0;
            } else {
                if (this.C1 instanceof sc1) {
                    i12 = this.d1;
                }
                i12 = 0;
            }
            if (i12 == 0 || this.m1 < 0.0f) {
                this.y0.getImageReceiver().Z(null);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
            }
        }
        int i16 = 2;
        if (this.E0 != null) {
            if (i14 != 2) {
                if (i14 == 1) {
                    int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                    long j10 = i6Var.k;
                    int i17 = (int) j10;
                    if (i17 == 0 && j10 != 0) {
                        E0 = 0;
                    } else if (i17 != 0) {
                        E0 = i17;
                    }
                }
                z10 = false;
            }
            boolean z11 = this.E0.getTag() != null;
            this.E0.setTag(z10 ? 1 : null);
            if (z11 != z10) {
                if (z10) {
                    this.E0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.I0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z9) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<v61, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
                    c10 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<v61, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f);
                    f10 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.E0, (Property<v61, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.x61 x61Var = this.K0[0];
                    Property property = View.TRANSLATION_X;
                    i10 = 3;
                    i11 = 5;
                    i7 = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(x61Var, (Property<org.telegram.ui.Components.x61, Float>) property, z10 ? org.telegram.messenger.g0.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.x61, Float>) property, z10 ? -org.telegram.messenger.g0.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.x61, Float>) property, z10 ? org.telegram.messenger.g0.L(34.0f) : 0.0f));
                    this.I0.setDuration(180L);
                    this.I0.addListener(new b71(this, i16));
                    this.I0.setInterpolator(org.telegram.ui.Components.xq.g);
                    this.I0.start();
                } else {
                    i7 = 0;
                    i10 = 3;
                    c10 = 4;
                    f10 = 1.0f;
                    i11 = 5;
                    this.E0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.E0.setScaleX(z10 ? 1.0f : 0.0f);
                    this.E0.setScaleY(z10 ? 1.0f : 0.0f);
                    this.K0[0].setTranslationX(z10 ? org.telegram.messenger.g0.L(34.0f) : 0.0f);
                    this.K0[1].setTranslationX(z10 ? -org.telegram.messenger.g0.L(34.0f) : 0.0f);
                    this.K0[2].setTranslationX(z10 ? org.telegram.messenger.g0.L(34.0f) : 0.0f);
                }
                v61Var = this.F0;
                if (v61Var == null) {
                    int i18 = v61Var.getTag() != null ? 1 : i7;
                    this.F0.setTag(1);
                    if (i18 != 1) {
                        this.F0.setVisibility(i7);
                        AnimatorSet animatorSet3 = this.J0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z9) {
                            float f11 = f10;
                            this.F0.setAlpha(f11);
                            this.F0.setScaleX(f11);
                            this.F0.setScaleY(f11);
                            this.L0[0].setTranslationX(-org.telegram.messenger.g0.L(34.0f));
                            this.L0[1].setTranslationX(org.telegram.messenger.g0.L(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.J0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.F0, (Property<v61, Float>) View.ALPHA, f10);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.F0, (Property<v61, Float>) View.SCALE_X, f10);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.F0, (Property<v61, Float>) View.SCALE_Y, f10);
                        org.telegram.ui.Components.x61 x61Var2 = this.L0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(x61Var2, (Property<org.telegram.ui.Components.x61, Float>) property2, -org.telegram.messenger.g0.L(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.L0[1], (Property<org.telegram.ui.Components.x61, Float>) property2, org.telegram.messenger.g0.L(34.0f));
                        Animator[] animatorArr = new Animator[i11];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[i10] = ofFloat7;
                        animatorArr[c10] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.J0.setDuration(180L);
                        this.J0.addListener(new b71(this, i10));
                        this.J0.setInterpolator(org.telegram.ui.Components.xq.g);
                        this.J0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i7 = 0;
        i10 = 3;
        c10 = 4;
        f10 = 1.0f;
        i11 = 5;
        v61Var = this.F0;
        if (v61Var == null) {
        }
    }

    public final void s1() {
        int childCount = this.Q0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.Q0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).w(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.a.a = g6Var;
    }

    public w71(org.telegram.ui.ActionBar.k6 k6Var, boolean z9, int i7, boolean z10, boolean z11) {
        super(null);
        this.a = new x61(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.S = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.T = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.U = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.V = r5Var4;
        this.Y = -1;
        this.Z = new j61(this, 0);
        this.x0 = new m71[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.m1 = 0.5f;
        this.o1 = 0.0f;
        this.t1 = PorterDuff.Mode.SRC_IN;
        this.z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.a10(getParentActivity(), new z61(this));
        this.U1 = false;
        this.V1 = false;
        this.b = i7;
        this.g0 = z11;
        this.f0 = k6Var;
        this.i0 = z9;
        this.h0 = z10;
        if (i7 == 1) {
            org.telegram.ui.ActionBar.i6 k10 = k6Var.k(!z10);
            this.w = k10;
            if (k10 != null) {
                this.d = false;
                this.y = k10.c;
                this.D = k10.d;
                this.E = k10.e;
                this.F = k10.f;
                this.G = k10.g;
                this.H = k10.h;
                this.I = k10.i;
                this.J = k10.j;
                this.K = k10.k;
                this.L = k10.l;
                this.M = k10.m;
                this.N = k10.p;
                this.O = k10.o;
                this.P = k10.n;
            }
        } else {
            if (i7 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.i6 k11 = k6Var.k(false);
            this.w = k11;
            if (k11 != null) {
                this.X0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.w;
        if (i6Var != null) {
            this.F1 = i6Var.q;
            if (!TextUtils.isEmpty(i6Var.o)) {
                this.m1 = this.w.p;
            }
            org.telegram.ui.ActionBar.l6.M = org.telegram.ui.ActionBar.l6.D0();
            org.telegram.ui.ActionBar.l6.O = true;
            org.telegram.ui.ActionBar.l6.P = true;
            org.telegram.ui.ActionBar.l6.u(k6Var, false, false);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.u4, new Object[0]);
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }

    public w71(org.telegram.ui.ActionBar.k6 k6Var) {
        this(k6Var, false, 0, false, false);
    }
}
