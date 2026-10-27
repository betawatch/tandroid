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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class vc1 extends org.telegram.ui.ActionBar.r2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public FrameLayout A0;
    public lc1 A1;
    public org.telegram.ui.Components.t40 B0;
    public lc1 B1;
    public AnimatorSet C0;
    public Object C1;
    public x4 D0;
    public Bitmap D1;
    public final int E;
    public sb1 E0;
    public boolean E1;
    public final int F;
    public sb1 F0;
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
    public uc1 J1;
    public final long K;
    public org.telegram.ui.Components.w91[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.w91[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.yj0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.w0 P1;
    public long Q;
    public bb1 Q0;
    public ValueAnimator Q1;
    public u90 R;
    public tc1 R0;
    public bi.j5 R1;
    public final org.telegram.ui.ActionBar.g6 S;
    public s4.c0 S0;
    public rb1 S1;
    public final org.telegram.ui.ActionBar.g6 T;
    public org.telegram.ui.Cells.q4 T0;
    public final org.telegram.ui.Components.u20 T1;
    public final org.telegram.ui.ActionBar.g6 U;
    public org.telegram.ui.Cells.i0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.g6 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.yq W;
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
    public final ub1 a;
    public boolean a0;
    public int a1;
    public float a2;
    public final int b;
    public fi.f6 b0;
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
    public org.telegram.ui.Components.km e;
    public TextView e0;
    public int e1;
    public boolean e2;
    public org.telegram.ui.ActionBar.w0 f;
    public final org.telegram.ui.ActionBar.x6 f0;
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
    public mc i2;
    public ArrayList j0;
    public int j1;
    public float j2;
    public a5.m k0;
    public int k1;
    public ValueAnimator k2;
    public bh.p l0;
    public int l1;
    public UndoView m0;
    public float m1;
    public int n;
    public FrameLayout n0;
    public float n1;
    public org.telegram.ui.Components.nm0 o0;
    public float o1;
    public nc1 p0;
    public float p1;
    public org.telegram.ui.Components.j20 q0;
    public mc1 q1;
    public Drawable r;
    public MessageObject r0;
    public org.telegram.ui.Components.zq r1;
    public int s;
    public boolean s0;
    public AnimatorSet s1;
    public org.telegram.ui.ActionBar.k t0;
    public final PorterDuff.Mode t1;
    public org.telegram.ui.ActionBar.q0 u0;
    public int u1;
    public final org.telegram.ui.ActionBar.w6 v;
    public pb1 v0;
    public org.telegram.ui.Components.s9 v1;
    public boolean w;
    public rc1 w0;
    public org.telegram.ui.Components.y91 w1;
    public final int x;
    public final kc1[] x0;
    public Bitmap x1;
    public final int y;
    public kc1 y0;
    public Bitmap y1;
    public FrameLayout z0;
    public float z1;

    public vc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new ub1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(this, 0, false);
        this.S = g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(this, 0, true);
        this.T = g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3 = new org.telegram.ui.ActionBar.g6(this, 1, false);
        this.U = g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4 = new org.telegram.ui.ActionBar.g6(this, 1, true);
        this.V = g6Var4;
        this.Y = -1;
        this.Z = new hb1(this, 0);
        this.x0 = new kc1[2];
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
        this.T1 = new org.telegram.ui.Components.u20(getParentActivity(), new wb1(this));
        this.U1 = false;
        this.V1 = false;
        this.b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof di1) {
            di1 di1Var = (di1) obj;
            this.F1 = di1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = di1Var.g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = di1Var.h;
                this.m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.y6.I.q()) {
                    this.m1 *= -1.0f;
                }
            }
        }
        g6Var.v = true;
        g6Var3.v = true;
        g6Var2.v = true;
        g6Var4.v = true;
    }

    public static void V(vc1 vc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (vc1Var.getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(23, vc1Var.currentAccount, vc1Var.getParentActivity(), vc1Var, vc1Var.a);
        j0Var.K1(canApplyBoost);
        j0Var.J1(vc1Var.W1, true);
        j0Var.L1(vc1Var.K1);
        if (!vc1Var.V0()) {
            j0Var.Q0 = new hb1(vc1Var, 1);
        }
        vc1Var.showDialog(j0Var);
    }

    public static void W(vc1 vc1Var) {
        org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.M;
        if (x6Var == null) {
            return;
        }
        int i10 = x6Var.Z;
        org.telegram.ui.ActionBar.w6 k10 = i10 >= 0 ? (org.telegram.ui.ActionBar.w6) x6Var.a0.get(i10) : x6Var.k(false);
        if (vc1Var.v != null) {
            vc1Var.X0();
            org.telegram.ui.ActionBar.y6.w1(vc1Var.f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.y6.M != null) {
                org.telegram.ui.ActionBar.y6.O = false;
                org.telegram.ui.ActionBar.y6.P = false;
                org.telegram.ui.ActionBar.y6.M = null;
            }
            org.telegram.ui.ActionBar.y6.t(vc1Var.f0, true, vc1Var.g0);
            ((ActionBarLayout) vc1Var.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) vc1Var.parentLayout).W(false, false);
            File file = new File(vc1Var.f0.b);
            org.telegram.ui.ActionBar.x6 x6Var2 = vc1Var.f0;
            org.telegram.ui.ActionBar.y6.u(file, x6Var2.a, x6Var2.F, false);
            MessagesController.getInstance(vc1Var.f0.E).saveTheme(vc1Var.f0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", vc1Var.f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) vc1Var.getParentLayout().getFragmentStack().get(Math.max(0, vc1Var.getParentLayout().getFragmentStack().size() - 2));
        vc1Var.finishFragment();
        if (vc1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, x6Var, k10, Boolean.valueOf(vc1Var.i0));
        }
        org.telegram.ui.ActionBar.y6.J1(r2Var);
    }

    public static /* synthetic */ void X(vc1 vc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = vc1Var.W0;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            vc1Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            vc1Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (w6Var != null && (str = w6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            vc1Var.X0 = tL_wallPaper2;
                            vc1Var.c1(false);
                            vc1Var.k1();
                        } else if (w6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = vc1Var.X0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = vc1Var.X0) != null) {
                vc1Var.V0.add(0, tL_wallPaper);
            }
            tc1 tc1Var = vc1Var.R0;
            if (tc1Var != null) {
                tc1Var.l();
            }
            MessagesStorage.getInstance(vc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (vc1Var.X0 != null || w6Var == null || TextUtils.isEmpty(w6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = w6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(vc1Var.currentAccount).bindRequestToGuid(vc1Var.getConnectionsManager().sendRequest(getwallpaper, new nb1(vc1Var, 0)), vc1Var.classGuid);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        int i10 = 1;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) View.SCALE_X, this.z1), ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) View.SCALE_Y, this.z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.ds.g);
        this.C0.addListener(new yb1(this, i10));
        this.C0.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0400  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(boolean z10) {
        int i10;
        ?? r12;
        boolean z11;
        boolean z12;
        ?? r122;
        File file;
        boolean z13;
        Object obj;
        boolean z14;
        String str;
        int i11;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i12;
        int i13;
        File file2;
        File pathToAttach;
        boolean z15;
        int i14;
        int i15;
        Object obj2;
        long j10;
        boolean z16;
        boolean z17;
        boolean z18;
        float f7;
        TLRPC.UserFull userFull;
        Object obj3;
        int i16 = 2;
        if (this.K1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < S0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.K1, this.W1, new kb1(this, i16));
                return;
            } else if (this.W1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
        String j11 = x6Var.j(null, this.G1);
        int i17 = 0;
        String j12 = this.G1 ? x6Var.j(null, false) : j11;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), j11);
        Object obj4 = this.C1;
        if (obj4 instanceof TLRPC.TL_wallPaper) {
            if (this.y1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    i10 = 4;
                    try {
                        this.y1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        z11 = false;
                        if (!z11) {
                        }
                        obj3 = null;
                        z12 = false;
                        r12 = obj3;
                        if (this.G1) {
                        }
                        obj = this.C1;
                        int i18 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6();
                        r6Var.a = j12;
                        r6Var.b = j11;
                        r6Var.c = str;
                        r6Var.i = this.G1;
                        r6Var.j = this.F1;
                        r6Var.d = i17;
                        r6Var.e = i13;
                        r6Var.f = i12;
                        r6Var.g = i14;
                        r6Var.h = i11;
                        if (this.N1) {
                        }
                        r6Var.k = this.m1;
                        obj2 = this.C1;
                        if (obj2 instanceof di1) {
                        }
                        j10 = this.K1;
                        r6Var.n = j10;
                        if (j10 != 0) {
                        }
                        r6Var.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var, str == null && this.K1 == 0, 0L);
                        if (z15) {
                        }
                        z17 = z16;
                        if (z17) {
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    i10 = 4;
                }
            } else {
                i10 = 4;
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    Bitmap bitmap = imageReceiver.getBitmap();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                z11 = false;
                if (!z11) {
                    try {
                        z11 = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.C1).document, true), file3);
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        z11 = false;
                    }
                }
                obj3 = null;
            }
            z11 = true;
            if (!z11) {
            }
            obj3 = null;
        } else {
            i10 = 4;
            boolean z19 = obj4 instanceof di1;
            if (!z19) {
                if (obj4 instanceof ei1) {
                    ei1 ei1Var = (ei1) obj4;
                    if (ei1Var.b != 0 || "t".equals(ei1Var.a)) {
                        r122 = 0;
                        z12 = false;
                        z13 = r122;
                    } else {
                        try {
                        } catch (Exception e13) {
                            e = e13;
                            z19 = false;
                        }
                        try {
                            if (!this.b2 || this.Y1 == this.Z1) {
                                z19 = false;
                                z19 = false;
                                File file4 = ei1Var.e;
                                file = file4 != null ? file4 : ei1Var.d;
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap((int) this.a2, this.D1.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.translate(-((this.Y1 / this.X1) * (this.D1.getWidth() - createBitmap.getWidth())), 0.0f);
                                z19 = false;
                                canvas.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
                                ei1Var.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                FileOutputStream fileOutputStream3 = new FileOutputStream(ei1Var.d);
                                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                                fileOutputStream3.close();
                                createBitmap.recycle();
                                file = ei1Var.d;
                            }
                            z12 = file.equals(file3);
                            z13 = z19;
                            if (!z12) {
                                try {
                                    z11 = AndroidUtilities.copyFile(file, file3);
                                    r12 = z19;
                                } catch (Exception e14) {
                                    e = e14;
                                    FileLog.e(e);
                                    z11 = false;
                                    r12 = z19;
                                    if (this.G1) {
                                    }
                                    obj = this.C1;
                                    int i182 = 45;
                                    if (obj instanceof TLRPC.TL_wallPaper) {
                                    }
                                    org.telegram.ui.ActionBar.r6 r6Var2 = new org.telegram.ui.ActionBar.r6();
                                    r6Var2.a = j12;
                                    r6Var2.b = j11;
                                    r6Var2.c = str;
                                    r6Var2.i = this.G1;
                                    r6Var2.j = this.F1;
                                    r6Var2.d = i17;
                                    r6Var2.e = i13;
                                    r6Var2.f = i12;
                                    r6Var2.g = i14;
                                    r6Var2.h = i11;
                                    if (this.N1) {
                                    }
                                    r6Var2.k = this.m1;
                                    obj2 = this.C1;
                                    if (obj2 instanceof di1) {
                                    }
                                    j10 = this.K1;
                                    r6Var2.n = j10;
                                    if (j10 != 0) {
                                    }
                                    r6Var2.o = z10;
                                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var2, str == null && this.K1 == 0, 0L);
                                    if (z15) {
                                    }
                                    z17 = z16;
                                    if (z17) {
                                    }
                                }
                            }
                        } catch (Exception e15) {
                            e = e15;
                            z12 = false;
                            FileLog.e(e);
                            z11 = false;
                            r12 = z19;
                            if (this.G1) {
                            }
                            obj = this.C1;
                            int i1822 = 45;
                            if (obj instanceof TLRPC.TL_wallPaper) {
                            }
                            org.telegram.ui.ActionBar.r6 r6Var22 = new org.telegram.ui.ActionBar.r6();
                            r6Var22.a = j12;
                            r6Var22.b = j11;
                            r6Var22.c = str;
                            r6Var22.i = this.G1;
                            r6Var22.j = this.F1;
                            r6Var22.d = i17;
                            r6Var22.e = i13;
                            r6Var22.f = i12;
                            r6Var22.g = i14;
                            r6Var22.h = i11;
                            if (this.N1) {
                            }
                            r6Var22.k = this.m1;
                            obj2 = this.C1;
                            if (obj2 instanceof di1) {
                            }
                            j10 = this.K1;
                            r6Var22.n = j10;
                            if (j10 != 0) {
                            }
                            r6Var22.o = z10;
                            MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var22, str == null && this.K1 == 0, 0L);
                            if (z15) {
                            }
                            z17 = z16;
                            if (z17) {
                            }
                        }
                    }
                } else {
                    r12 = 0;
                    obj3 = null;
                    obj3 = null;
                    if (obj4 instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj4;
                        TLRPC.Photo photo = searchImage.photo;
                        try {
                            z11 = AndroidUtilities.copyFile(photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.I1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg"), file3);
                        } catch (Exception e16) {
                            FileLog.e(e16);
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                }
                if (this.G1) {
                }
                obj = this.C1;
                int i18222 = 45;
                if (obj instanceof TLRPC.TL_wallPaper) {
                }
                org.telegram.ui.ActionBar.r6 r6Var222 = new org.telegram.ui.ActionBar.r6();
                r6Var222.a = j12;
                r6Var222.b = j11;
                r6Var222.c = str;
                r6Var222.i = this.G1;
                r6Var222.j = this.F1;
                r6Var222.d = i17;
                r6Var222.e = i13;
                r6Var222.f = i12;
                r6Var222.g = i14;
                r6Var222.h = i11;
                if (this.N1) {
                }
                r6Var222.k = this.m1;
                obj2 = this.C1;
                if (obj2 instanceof di1) {
                }
                j10 = this.K1;
                r6Var222.n = j10;
                if (j10 != 0) {
                }
                r6Var222.o = z10;
                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var222, str == null && this.K1 == 0, 0L);
                if (z15) {
                }
                z17 = z16;
                if (z17) {
                }
            } else if (this.X0 != null) {
                try {
                    Bitmap bitmap2 = this.y0.getImageReceiver().getBitmap();
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    if (this.d1 == 0) {
                        if (this.c1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.x9.d(this.i1), new int[]{this.a1, this.c1});
                            gradientDrawable.setBounds(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                            gradientDrawable.draw(canvas2);
                        } else {
                            canvas2.drawColor(this.a1);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
                    paint.setAlpha((int) (Math.abs(this.m1) * 255.0f));
                    canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream4 = new FileOutputStream(file3);
                    if (this.d1 != 0) {
                        createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream4);
                    } else {
                        createBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                    }
                    fileOutputStream4.close();
                    z12 = false;
                    z11 = true;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    z11 = false;
                    z12 = false;
                }
                r12 = 0;
                if (this.G1) {
                    try {
                        FileOutputStream fileOutputStream5 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), j12));
                        this.x1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                        fileOutputStream5.close();
                        z11 = true;
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                        z11 = false;
                    }
                }
                obj = this.C1;
                int i182222 = 45;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    str = tL_wallPaper.slug;
                    z14 = z12;
                    i13 = 0;
                    file2 = r12;
                    i11 = 45;
                    z15 = z11;
                    i14 = 0;
                    i12 = 0;
                } else if (obj instanceof di1) {
                    if ("d".equals(((di1) obj).a)) {
                        i15 = 0;
                        i12 = 0;
                        i13 = 0;
                        str = "d";
                    } else {
                        TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                        String str2 = tL_wallPaper2 != null ? tL_wallPaper2.slug : "c";
                        int i19 = this.a1;
                        i13 = this.c1;
                        i12 = this.d1;
                        i15 = this.e1;
                        i182222 = this.i1;
                        i17 = i19;
                        str = str2;
                    }
                    int i20 = i182222;
                    z15 = z11;
                    i14 = i15;
                    i11 = i20;
                    z14 = z12;
                    tL_wallPaper = null;
                    file2 = null;
                } else {
                    if (obj instanceof ei1) {
                        ei1 ei1Var2 = (ei1) obj;
                        str = ei1Var2.a;
                        pathToAttach = ei1Var2.d;
                    } else if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj;
                        TLRPC.Photo photo2 = searchImage2.photo;
                        pathToAttach = photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.I1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg");
                        str = "";
                    } else {
                        z14 = z12;
                        str = "d";
                        i11 = 45;
                        tL_wallPaper = null;
                        i17 = 0;
                        i12 = 0;
                        i13 = 0;
                        file2 = null;
                        z15 = z11;
                        i14 = 0;
                    }
                    file2 = pathToAttach;
                    z14 = z12;
                    i11 = 45;
                    tL_wallPaper = null;
                    i17 = 0;
                    i12 = 0;
                    i13 = 0;
                    z15 = z11;
                    i14 = 0;
                }
                org.telegram.ui.ActionBar.r6 r6Var2222 = new org.telegram.ui.ActionBar.r6();
                r6Var2222.a = j12;
                r6Var2222.b = j11;
                r6Var2222.c = str;
                r6Var2222.i = this.G1;
                r6Var2222.j = this.F1;
                r6Var2222.d = i17;
                r6Var2222.e = i13;
                r6Var2222.f = i12;
                r6Var2222.g = i14;
                r6Var2222.h = i11;
                if (this.N1) {
                    float f10 = this.o1;
                    if (f10 >= 0.0f) {
                        r6Var2222.k = f10;
                        obj2 = this.C1;
                        if (obj2 instanceof di1) {
                            di1 di1Var = (di1) obj2;
                            String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                            float f11 = di1Var.h;
                            if (f11 < 0.0f && !org.telegram.ui.ActionBar.y6.I.q()) {
                                f11 *= -1.0f;
                            }
                            if (di1Var.l != null && di1Var.b == i17 && di1Var.c == i13 && di1Var.d == i12 && di1Var.e == i14 && TextUtils.equals(di1Var.a, str3) && di1Var.f == i11 && (this.X0 == null || Math.abs(f11 - this.m1) < 0.001f)) {
                                TLRPC.WallPaper wallPaper = di1Var.l;
                                r6Var2222.l = wallPaper.id;
                                r6Var2222.m = wallPaper.access_hash;
                            }
                        }
                        j10 = this.K1;
                        r6Var2222.n = j10;
                        if (j10 != 0 && (userFull = getMessagesController().getUserFull(this.K1)) != null) {
                            r6Var2222.t = userFull.wallpaper;
                        }
                        r6Var2222.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var2222, str == null && this.K1 == 0, 0L);
                        if (z15) {
                            z16 = true;
                        } else {
                            if (this.K1 != 0) {
                                if (file2 == null || getMessagesController().uploadingWallpaperInfo != r6Var2222) {
                                    z18 = false;
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.K1, null, r6Var2222, this.r0, new ag.c(25));
                                } else {
                                    tL_wallPaper = new TLRPC.TL_wallPaper();
                                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                    tL_wallPaper.settings = tL_wallPaperSettings;
                                    tL_wallPaperSettings.intensity = (int) (r6Var2222.k * 100.0f);
                                    tL_wallPaperSettings.blur = r6Var2222.i;
                                    tL_wallPaperSettings.motion = r6Var2222.j;
                                    tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                    Bitmap createBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                    Canvas canvas3 = new Canvas(createBitmap3);
                                    float max = Math.max(50.0f / this.y0.getMeasuredWidth(), 50.0f / this.y0.getMeasuredHeight());
                                    canvas3.scale(max, max);
                                    if (this.y0.getMeasuredHeight() > this.y0.getMeasuredWidth()) {
                                        f7 = 0.0f;
                                        canvas3.translate(0.0f, (-(this.y0.getMeasuredHeight() - this.y0.getMeasuredWidth())) / 2.0f);
                                    } else {
                                        f7 = 0.0f;
                                        canvas3.translate((-(this.y0.getMeasuredWidth() - this.y0.getMeasuredHeight())) / 2.0f, 0.0f);
                                    }
                                    float f12 = this.o1;
                                    this.o1 = f7;
                                    this.y0.draw(canvas3);
                                    this.o1 = f12;
                                    Utilities.blurBitmap(createBitmap3, 3);
                                    tL_wallPaper.stripedThumb = createBitmap3;
                                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                    tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                                    tL_messageService.dialog_id = this.K1;
                                    tL_messageService.unread = true;
                                    tL_messageService.out = true;
                                    int newMessageId = getUserConfig().getNewMessageId();
                                    tL_messageService.id = newMessageId;
                                    tL_messageService.local_id = newMessageId;
                                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K1));
                                    if (ChatObject.isChannel(chat)) {
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_messageService.from_id = tL_peerChannel;
                                        tL_peerChannel.channel_id = chat.id;
                                        TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                        tL_messageService.peer_id = tL_peerChannel2;
                                        tL_peerChannel2.channel_id = chat.id;
                                    } else {
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        tL_messageService.from_id = tL_peerUser;
                                        tL_peerUser.user_id = getUserConfig().getClientUserId();
                                        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                        tL_messageService.peer_id = tL_peerUser2;
                                        tL_peerUser2.user_id = this.K1;
                                    }
                                    tL_messageService.flags |= 256;
                                    tL_messageService.date = getConnectionsManager().getCurrentTime();
                                    TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                    tL_messageService.action = tL_messageActionSetChatWallPaper;
                                    tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper;
                                    tL_messageActionSetChatWallPaper.for_both = z10;
                                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                                    arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
                                    new ArrayList().add(tL_messageService);
                                    MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.K1, arrayList, 0);
                                    if (this.K1 >= 0) {
                                        TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.K1);
                                        if (userFull2 != null) {
                                            userFull2.wallpaper = tL_wallPaper;
                                            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.K1), userFull2);
                                        }
                                    } else {
                                        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.K1);
                                        if (chatFull != null) {
                                            chatFull.wallpaper = tL_wallPaper;
                                            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                            int i21 = NotificationCenter.chatInfoDidLoad;
                                            z18 = false;
                                            Object[] objArr = new Object[i10];
                                            objArr[0] = chatFull;
                                            objArr[1] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr[2] = bool;
                                            objArr[3] = bool;
                                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i21, objArr);
                                        }
                                    }
                                    z18 = false;
                                }
                                this.e2 = true;
                                uc1 uc1Var = this.J1;
                                if (uc1Var != null) {
                                    uc1Var.a(tL_wallPaper);
                                }
                                finishFragment();
                                z17 = z18;
                                if (z17) {
                                    uc1 uc1Var2 = this.J1;
                                    if (uc1Var2 != null) {
                                        uc1Var2.a(tL_wallPaper);
                                    }
                                    finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.ActionBar.y6.c0 = getThemedColor(org.telegram.ui.ActionBar.y6.lc);
                            org.telegram.ui.ActionBar.y6.I.v("t".equals(r6Var2222.c) ? null : r6Var2222);
                            z16 = true;
                            org.telegram.ui.ActionBar.y6.r1(true);
                            if (!z14) {
                                ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                            }
                        }
                        z17 = z16;
                        if (z17) {
                        }
                    }
                }
                r6Var2222.k = this.m1;
                obj2 = this.C1;
                if (obj2 instanceof di1) {
                }
                j10 = this.K1;
                r6Var2222.n = j10;
                if (j10 != 0) {
                    r6Var2222.t = userFull.wallpaper;
                }
                r6Var2222.o = z10;
                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var2222, str == null && this.K1 == 0, 0L);
                if (z15) {
                }
                z17 = z16;
                if (z17) {
                }
            } else {
                r122 = 0;
                z12 = false;
                z13 = r122;
            }
            z11 = true;
            r12 = z13;
            if (this.G1) {
            }
            obj = this.C1;
            int i1822222 = 45;
            if (obj instanceof TLRPC.TL_wallPaper) {
            }
            org.telegram.ui.ActionBar.r6 r6Var22222 = new org.telegram.ui.ActionBar.r6();
            r6Var22222.a = j12;
            r6Var22222.b = j11;
            r6Var22222.c = str;
            r6Var22222.i = this.G1;
            r6Var22222.j = this.F1;
            r6Var22222.d = i17;
            r6Var22222.e = i13;
            r6Var22222.f = i12;
            r6Var22222.g = i14;
            r6Var22222.h = i11;
            if (this.N1) {
            }
            r6Var22222.k = this.m1;
            obj2 = this.C1;
            if (obj2 instanceof di1) {
            }
            j10 = this.K1;
            r6Var22222.n = j10;
            if (j10 != 0) {
            }
            r6Var22222.o = z10;
            MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var22222, str == null && this.K1 == 0, 0L);
            if (z15) {
            }
            z17 = z16;
            if (z17) {
            }
        }
        z12 = false;
        r12 = obj3;
        if (this.G1) {
        }
        obj = this.C1;
        int i18222222 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
        }
        org.telegram.ui.ActionBar.r6 r6Var222222 = new org.telegram.ui.ActionBar.r6();
        r6Var222222.a = j12;
        r6Var222222.b = j11;
        r6Var222222.c = str;
        r6Var222222.i = this.G1;
        r6Var222222.j = this.F1;
        r6Var222222.d = i17;
        r6Var222222.e = i13;
        r6Var222222.f = i12;
        r6Var222222.g = i14;
        r6Var222222.h = i11;
        if (this.N1) {
        }
        r6Var222222.k = this.m1;
        obj2 = this.C1;
        if (obj2 instanceof di1) {
        }
        j10 = this.K1;
        r6Var222222.n = j10;
        if (j10 != 0) {
        }
        r6Var222222.o = z10;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, r6Var222222, str == null && this.K1 == 0, 0L);
        if (z15) {
        }
        z17 = z16;
        if (z17) {
        }
    }

    public final void O0(boolean z10) {
        int i10 = this.b;
        if (i10 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.y6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (i10 == 1) {
            if (this.h0) {
                w6Var.c = this.x;
                w6Var.d = this.y;
                w6Var.e = this.E;
                w6Var.f = this.F;
                w6Var.g = this.G;
                w6Var.h = this.H;
                w6Var.i = this.I;
                w6Var.j = this.J;
                w6Var.k = this.K;
                w6Var.l = this.L;
                w6Var.m = this.M;
                w6Var.n = this.P;
                w6Var.o = this.O;
                w6Var.p = this.N;
            }
            org.telegram.ui.ActionBar.y6.w1(this.f0, false, true, false, false, false);
        } else {
            if (w6Var != null) {
                org.telegram.ui.ActionBar.y6.w1(this.f0, false, this.i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.i0) {
                org.telegram.ui.ActionBar.x6 x6Var = this.f0;
                if (x6Var.b != null && org.telegram.ui.ActionBar.y6.H.get(x6Var.m()) == null) {
                    new File(x6Var.b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable P0(Drawable drawable) {
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
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
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
    public final boolean Q0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.w6 w6Var = this.v;
            if (w6Var.c == this.x && w6Var.d == this.y && w6Var.e == this.E && w6Var.f == this.F && w6Var.g == this.G && w6Var.h == this.H && w6Var.i == this.I && w6Var.j == this.J && w6Var.k == this.K && w6Var.l == this.L && w6Var.m == this.M && Math.abs(w6Var.p - this.N) <= 0.001f && w6Var.n == this.P) {
                String str = w6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                    }
                    if (tL_wallPaper2 != null) {
                    }
                }
            }
            if (!z10) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.SaveChangesAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.SaveChangesAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new jb1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new jb1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final void R0() {
        int themedColor;
        org.telegram.ui.Components.km kmVar = this.e;
        int i10 = 0;
        if (kmVar != null) {
            kmVar.H(getThemedColor(org.telegram.ui.ActionBar.y6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.d6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        x4 x4Var = this.D0;
        if (x4Var != null) {
            x4Var.invalidate();
        }
        if (this.q1 != null) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var == null || j5Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.y6.h5));
            } else {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.y6.h5));
                if (this.b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                if (i11 >= w91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var = w91VarArr[i11];
                if (w91Var != null) {
                    w91Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr2 = this.L0;
                if (i10 >= w91VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var2 = w91VarArr2[i10];
                if (w91Var2 != null) {
                    w91Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, this.a);
        }
        org.telegram.ui.Components.yq yqVar = this.W;
        if (yqVar != null) {
            yqVar.invalidate();
        }
        org.telegram.ui.Components.j20 j20Var = this.q0;
        if (j20Var != null) {
            j20Var.updateColors();
        }
    }

    public final int S0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.K1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList T0() {
        j6 j6Var = new j6(24, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.t0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.t0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.E8));
        org.telegram.ui.Components.yq yqVar = this.W;
        int i10 = 2;
        if (yqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = yqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = yqVar.E;
            for (int i11 = 0; i11 < editTextBoldCursorArr.length; i11++) {
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i11], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i11], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(yqVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I5));
            if (w0Var != null) {
                org.telegram.ui.Components.b7 b7Var = new org.telegram.ui.Components.b7(yqVar, i10);
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i12 = 0; i12 < frameLayoutArr.length; i12++) {
            }
            for (int i13 = 0; i13 < this.P0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.O0.length; i14++) {
            }
            for (int i15 = 0; i15 < this.N0.length; i15++) {
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.S;
            org.telegram.ui.ActionBar.g6 g6Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{g6Var, g6Var2}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{g6Var, g6Var2}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{g6Var, g6Var2}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.cb));
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.ActionBar.h7) arrayList.get(i16)).n = this.a;
        }
        return arrayList;
    }

    public final boolean U0(int i10) {
        int D0;
        long j10;
        if (this.h0) {
            return false;
        }
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 == 0) {
                int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                int i11 = (int) w6Var.j;
                if (i11 == 0) {
                    i11 = D02;
                }
                if (i11 != D02) {
                    return true;
                }
            } else if (j11 != w6Var.j) {
                return true;
            }
            long j12 = this.K;
            long j13 = this.M;
            long j14 = this.L;
            if (j12 == 0 && j14 == 0 && j13 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                        j10 = w6Var.k;
                    } else if (i12 == 1) {
                        D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                        j10 = w6Var.l;
                    } else {
                        D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                        j10 = w6Var.m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = D0;
                    }
                    if (i13 != D0) {
                        return true;
                    }
                }
            } else if (j12 != w6Var.k || j14 != w6Var.l || j13 != w6Var.m) {
                return true;
            }
            if (w6Var.n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.x != w6Var.d) {
                return true;
            }
            int i14 = this.E;
            if (i14 == 0) {
                int i15 = w6Var.e;
                if (i15 != 0 && i15 != w6Var.c) {
                    return true;
                }
            } else if (i14 != w6Var.e) {
                return true;
            }
            int i16 = this.F;
            if (i16 != 0) {
                if (i16 != w6Var.f) {
                    return true;
                }
            } else if (w6Var.f != 0) {
                return true;
            }
            int i17 = this.G;
            if (i17 != 0) {
                if (i17 != w6Var.g) {
                    return true;
                }
            } else if (w6Var.g != 0) {
                return true;
            }
            int i18 = this.H;
            if (i18 != 0) {
                if (i18 != w6Var.h) {
                    return true;
                }
            } else if (w6Var.h != 0) {
                return true;
            }
            if (this.I != w6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean V0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        return (j5Var == null || j5Var.getBottomSheet() == null) ? false : true;
    }

    public final void W0() {
        bi.j5 j5Var = this.R1;
        if (j5Var != null) {
            j5Var.invalidate();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.z0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.A0.getChildAt(i11).invalidate();
            }
        }
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                if (i12 >= w91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var = w91VarArr[i12];
                if (w91Var != null) {
                    w91Var.setDimAmount(this.N1 ? this.o1 * this.p1 : 0.0f);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.o0 != null) {
            for (int i13 = 0; i13 < this.o0.getChildCount(); i13++) {
                View childAt = this.o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    e1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.v0 != null) {
            for (int i14 = 0; i14 < this.v0.getChildCount(); i14++) {
                View childAt2 = this.v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    e1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        lc1 lc1Var = this.A1;
        if (lc1Var != null) {
            lc1Var.invalidate();
        }
        lc1 lc1Var2 = this.B1;
        if (lc1Var2 != null) {
            lc1Var2.invalidate();
        }
        x4 x4Var = this.D0;
        if (x4Var != null) {
            x4Var.invalidate();
        }
    }

    public final void X0() {
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (w6Var == null || TextUtils.isEmpty(w6Var.o)) {
            return;
        }
        try {
            File d = w6Var.d();
            Drawable background = this.y0.getBackground();
            Bitmap bitmap = this.y0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.vc0) {
                FileOutputStream fileOutputStream = new FileOutputStream(d);
                bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
            paint.setAlpha((int) (this.m1 * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(d);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void Y0() {
        Z0(2, true);
    }

    public final void Z0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.w6 w6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.n == i10 || this.s1 != null || (w6Var = this.v) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.y6.b1() || w6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.y6.b1() || (org.telegram.ui.ActionBar.y6.b1() && org.telegram.ui.ActionBar.y6.I.i0.d != 0)) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new jb1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new jb1(this, 6));
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new jb1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i13 = this.n;
        this.n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = w6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.yq yqVar = this.W;
            U0(1);
            yqVar.f(1, 2, i14, false);
            this.W.e(w6Var.c, 0);
            int i15 = w6Var.d;
            if (i15 != 0) {
                this.W.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && w6Var.g != 0)) {
                this.w0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Nd);
            int i16 = org.telegram.ui.ActionBar.y6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.y6.e1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.y6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.y6.e1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.y6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.y6.e1(i18) ? getThemedColor(i18) : 0;
            long j10 = w6Var.k;
            int i19 = (int) j10;
            if (i19 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = w6Var.l;
            int i20 = (int) j11;
            if (i20 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = w6Var.m;
            int i21 = (int) j12;
            if (i21 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) w6Var.j;
            if (i19 == 0 && themedColor2 == 0) {
                i11 = i20;
                i12 = 1;
            } else if (i21 != 0 || themedColor4 != 0) {
                i11 = i20;
                i12 = 4;
            } else if (i20 == 0 && themedColor3 == 0) {
                i11 = i20;
                i12 = 2;
            } else {
                i11 = i20;
                i12 = 3;
            }
            org.telegram.ui.Components.yq yqVar2 = this.W;
            U0(2);
            yqVar2.f(2, 4, i12, false);
            org.telegram.ui.Components.yq yqVar3 = this.W;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            yqVar3.e(i21, 3);
            org.telegram.ui.Components.yq yqVar4 = this.W;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            yqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.yq yqVar5 = this.W;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            yqVar5.e(i19, 1);
            org.telegram.ui.Components.yq yqVar6 = this.W;
            if (i22 != 0) {
                themedColor = i22;
            }
            yqVar6.e(themedColor, 0);
            if (i13 == 1 || w6Var.g == 0) {
                this.w0.o(0);
            } else {
                this.w0.m(0);
            }
            this.v0.w0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i23 = w6Var.f != 0 ? w6Var.h != 0 ? 4 : w6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.yq yqVar7 = this.W;
            U0(3);
            yqVar7.f(2, 4, i23, true);
            this.W.e(w6Var.h, 3);
            this.W.e(w6Var.g, 2);
            this.W.e(w6Var.f, 1);
            org.telegram.ui.Components.yq yqVar8 = this.W;
            int i24 = w6Var.e;
            if (i24 == 0) {
                i24 = w6Var.c;
            }
            yqVar8.e(i24, 0);
            this.L0[1].b(0, w6Var.e);
            this.L0[1].b(1, w6Var.f);
            this.L0[1].b(2, w6Var.g);
            this.L0[1].b(3, w6Var.h);
            if (w6Var.g != 0) {
                if (i13 == 1) {
                    this.w0.o(0);
                } else {
                    this.w0.m(0);
                }
            } else if (i13 == 2) {
                this.w0.u(0);
            }
            this.v0.w0(0, AndroidUtilities.dp(60.0f), null);
            f1();
        }
        if (i10 != 1 && i10 != 3) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
            return;
        }
        if (i13 == 2 && this.M0[1].getVisibility() == 0) {
            g1(0, true, true);
        }
        if (i10 != 1) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        } else if (this.f0.q()) {
            this.W.setMinBrightness(0.2f);
        } else {
            this.W.setMinBrightness(0.05f);
            this.W.setMaxBrightness(0.8f);
        }
    }

    public final void a1(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.V0.size()) ? this.Z0 : (TLRPC.TL_wallPaper) this.V0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d2.cancel();
        }
        kc1[] kc1VarArr = this.x0;
        kc1 kc1Var = kc1VarArr[0];
        kc1 kc1Var2 = kc1VarArr[1];
        kc1VarArr[0] = kc1Var2;
        kc1VarArr[1] = kc1Var;
        this.u0.removeView(kc1Var2);
        this.u0.addView(kc1VarArr[0], this.u0.indexOfChild(kc1VarArr[1]) + 1);
        kc1 kc1Var3 = kc1VarArr[0];
        this.y0 = kc1Var3;
        kc1Var3.setBackground(kc1VarArr[1].getBackground());
        l1();
        kc1VarArr[1].setVisibility(0);
        kc1VarArr[1].setAlpha(1.0f);
        this.y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d2 = ofFloat;
        ofFloat.addUpdateListener(new yi(2, this));
        this.d2.addListener(new yb1(this, 0));
        this.d2.setInterpolator(org.telegram.ui.Components.ds.f);
        this.d2.setDuration(300L);
        this.d2.start();
        this.y0.getImageReceiver().setCrossfadeDuration(300);
        this.y0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.H1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.y0.d();
        this.X0 = tL_wallPaper;
        this.F1 = this.K0[2].s;
        k1();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
    }

    public final void b1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.vc0 vc0Var;
        if (i11 == 0) {
            this.a1 = i10;
        } else if (i11 == 1) {
            this.c1 = i10;
        } else if (i11 == 2) {
            this.d1 = i10;
        } else if (i11 == 3) {
            this.e1 = i10;
        }
        n1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                if (i12 >= w91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var = w91VarArr[i12];
                if (w91Var != null) {
                    w91Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.y6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.y0.getBackground();
            if (background instanceof org.telegram.ui.Components.vc0) {
                vc0Var = (org.telegram.ui.Components.vc0) background;
            } else {
                vc0Var = new org.telegram.ui.Components.vc0();
                vc0Var.q(this.y0);
                if (this.E1) {
                    vc0Var.m(false);
                }
            }
            vc0Var.n(this.a1, this.c1, this.d1, this.e1);
            this.y0.setBackground(vc0Var);
            this.k1 = vc0Var.f();
            this.l1 = 754974720;
        } else if (this.c1 != 0) {
            this.y0.setBackground(new GradientDrawable(org.telegram.ui.Components.x9.d(this.i1), new int[]{this.a1, this.c1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.a1, this.c1));
            this.l1 = patternColor;
            this.k1 = patternColor;
        } else {
            this.y0.setBackgroundColor(this.a1);
            int patternColor2 = AndroidUtilities.getPatternColor(this.a1);
            this.l1 = patternColor2;
            this.k1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.y6.lc;
        boolean e12 = org.telegram.ui.ActionBar.y6.e1(i13);
        ub1 ub1Var = this.a;
        if (!e12 || (this.y0.getBackground() instanceof org.telegram.ui.Components.vc0)) {
            ub1Var.j(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        } else if (org.telegram.ui.ActionBar.y6.t0() instanceof org.telegram.ui.Components.vc0) {
            getThemedColor(i13);
            ub1Var.j(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.ic, ub1Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.ic, ub1Var, PorterDuff.Mode.MULTIPLY);
        }
        kc1 kc1Var = this.y0;
        if (kc1Var != null) {
            kc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
            this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
            this.y0.invalidate();
            if (org.telegram.ui.ActionBar.y6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.vc0)) {
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setTwoSided(true);
                }
                if (this.m1 < 0.0f) {
                    this.y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.vc0) this.y0.getBackground()).k);
                }
            } else {
                this.y0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                if (i0Var2 != null) {
                    i0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.i0 i0Var3 = this.U0;
            if (i0Var3 != null) {
                i0Var3.setProgress(this.m1);
            }
        }
        pb1 pb1Var = this.v0;
        if (pb1Var != null) {
            pb1Var.g1();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.z0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.A0.getChildAt(i15).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.vc0 vc0Var;
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        int i10 = this.b;
        if (i10 == 0 && w6Var == null) {
            this.y0.setBackground(org.telegram.ui.ActionBar.y6.s0());
        } else {
            if (i10 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    kc1 kc1Var = this.y0;
                    kc1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.H1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    kc1Var.d();
                } else if (obj instanceof di1) {
                    di1 di1Var = (di1) obj;
                    int i11 = di1Var.f;
                    int i12 = di1Var.e;
                    int i13 = di1Var.d;
                    int i14 = di1Var.c;
                    int i15 = di1Var.b;
                    this.i1 = i11;
                    b1(i15, 0, false);
                    if (i14 != 0) {
                        b1(i14, 1, false);
                    }
                    b1(i13, 2, false);
                    b1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        kc1 kc1Var2 = this.y0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        kc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(di1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.y0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.vc0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof ei1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.y0.setImageBitmap(bitmap);
                    } else {
                        ei1 ei1Var = (ei1) obj;
                        File file = ei1Var.e;
                        if (file != null) {
                            this.y0.g(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = ei1Var.d;
                            if (file2 != null) {
                                this.y0.g(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(ei1Var.a)) {
                                kc1 kc1Var3 = this.y0;
                                kc1Var3.setImageDrawable(org.telegram.ui.ActionBar.y6.Y0(kc1Var3, false));
                            } else {
                                int i16 = ei1Var.b;
                                if (i16 != 0) {
                                    this.y0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.I1, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        this.y0.k(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.H1, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", photoSize != null ? photoSize.size : 0, "jpg", searchImage, 1);
                    } else {
                        kc1 kc1Var4 = this.y0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.H1;
                        String str4 = searchImage.thumbUrl;
                        kc1Var4.getClass();
                        kc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (w6Var == null) {
                this.y0.setBackground(org.telegram.ui.ActionBar.y6.s0());
            } else {
                org.telegram.ui.Components.s9 s9Var = this.v1;
                if (s9Var != null) {
                    s9Var.dispose();
                    this.v1 = null;
                }
                int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                int i17 = (int) w6Var.j;
                if (i17 != 0) {
                    D0 = i17;
                }
                int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                long j10 = w6Var.k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    D02 = 0;
                } else if (i18 != 0) {
                    D02 = i18;
                }
                int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                long j11 = w6Var.l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    D03 = 0;
                } else if (i19 != 0) {
                    D03 = i19;
                }
                int D04 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                long j12 = w6Var.m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    D04 = 0;
                } else if (i20 != 0) {
                    D04 = i20;
                }
                if (TextUtils.isEmpty(w6Var.o) || org.telegram.ui.ActionBar.y6.b1()) {
                    Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.vc0) {
                            ((org.telegram.ui.Components.vc0) t02).q(this.y0);
                        }
                        this.y0.setBackground(t02);
                    }
                } else {
                    if (D03 != 0) {
                        Drawable background = this.y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.vc0) {
                            vc0Var = (org.telegram.ui.Components.vc0) background;
                        } else {
                            org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0();
                            vc0Var2.q(this.y0);
                            vc0Var = vc0Var2;
                            if (this.E1) {
                                vc0Var2.m(false);
                                vc0Var = vc0Var2;
                            }
                        }
                        vc0Var.n(D0, D02, D03, D04);
                        colorDrawable = vc0Var;
                    } else if (D02 != 0) {
                        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(org.telegram.ui.Components.x9.d(w6Var.n), new int[]{D0, D02});
                        this.v1 = x9Var.f(jg.s0.e0(0.5f, 3), new cc1(this, 0), 100L);
                        colorDrawable = x9Var;
                    } else {
                        colorDrawable = new ColorDrawable(D0);
                    }
                    this.y0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        kc1 kc1Var5 = this.y0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        kc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (D02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(D0);
                    this.l1 = patternColor;
                    this.k1 = patternColor;
                } else if (D03 != 0) {
                    this.k1 = org.telegram.ui.Components.vc0.g(D0, D02, D03, D04);
                    this.l1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(D0, D02));
                    this.l1 = patternColor2;
                    this.k1 = patternColor2;
                }
                kc1 kc1Var6 = this.y0;
                if (kc1Var6 != null) {
                    kc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
                    this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
                    this.y0.invalidate();
                    if (org.telegram.ui.ActionBar.y6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.vc0)) {
                        org.telegram.ui.Cells.i0 i0Var = this.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                        if (this.m1 < 0.0f) {
                            this.y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.vc0) this.y0.getBackground()).k);
                        }
                    } else {
                        this.y0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                        if (i0Var2 != null) {
                            i0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.i0 i0Var3 = this.U0;
                    if (i0Var3 != null) {
                        i0Var3.setProgress(this.m1);
                    }
                }
                if (this.K0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                        if (i21 >= w91VarArr.length) {
                            break;
                        }
                        w91VarArr[i21].b(0, D0);
                        this.K0[i21].b(1, D02);
                        this.K0[i21].b(2, D03);
                        this.K0[i21].b(3, D04);
                        i21++;
                    }
                }
                ImageView imageView = this.G0;
                ub1 ub1Var = this.a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.ic, ub1Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.ic, ub1Var, PorterDuff.Mode.MULTIPLY);
                }
                W0();
            }
        }
        this.E1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0275, code lost:
    
        if ("d".equals(((org.telegram.ui.di1) r8).a) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x027b, code lost:
    
        if ((r46.C1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0937 A[EDGE_INSN: B:247:0x0937->B:248:0x0937 BREAK  A[LOOP:2: B:196:0x084c->B:223:0x092d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0dd8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6 A[LOOP:0: B:44:0x01a2->B:46:0x01a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d3 A[EDGE_INSN: B:47:0x01d3->B:48:0x01d3 BREAK  A[LOOP:0: B:44:0x01a2->B:46:0x01a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0e3b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0e7b  */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v34 */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.j5 j5Var;
        final int i10;
        int i11;
        int i12;
        kc1[] kc1VarArr;
        boolean z11;
        int i13;
        org.telegram.ui.ActionBar.x6 x6Var;
        int i14;
        Object obj;
        int i15;
        int i16;
        int i17;
        final int i18;
        ub1 ub1Var;
        int i19;
        int i20;
        final int i21;
        float f7;
        ViewGroup[] viewGroupArr;
        ?? r72;
        org.telegram.ui.Components.r11 r11Var;
        final int i22;
        org.telegram.ui.ActionBar.j5 j5Var2;
        this.S.p = (ub1) getResourceProvider();
        this.T.p = (ub1) getResourceProvider();
        this.U.p = (ub1) getResourceProvider();
        this.V.p = (ub1) getResourceProvider();
        int i23 = 1;
        this.hasOwnBackground = true;
        mc1 mc1Var = this.q1;
        int i24 = 0;
        boolean z12 = (mc1Var == null || this.K1 == 0) ? false : true;
        this.M1 = z12;
        if (z12) {
            Object obj2 = this.C1;
            if (!(obj2 instanceof ei1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.N1 = z10;
            if (z10) {
                this.p1 = mc1Var.a() ? 1.0f : 0.0f;
            }
            j5Var = this.parentLayout;
            if (j5Var != null && ((ActionBarLayout) j5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.n0 = new FrameLayout(context);
            i10 = 3;
            if (this.N1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new hb1(this, i10), 2000L);
            }
            this.actionBar.l().a(0, R.drawable.outline_header_search).M().J(new fc1()).setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.k5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            k0 k0Var = new k0(this, context, 26);
            this.n0 = k0Var;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k0Var, getResourceProvider());
            this.n0.addView(this.actionBar, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context);
            this.o0 = nm0Var;
            nm0Var.setVerticalScrollBarEnabled(true);
            this.o0.setItemAnimator(null);
            this.o0.setLayoutAnimation(null);
            this.o0.setLayoutManager(new s4.c0(1, false));
            final int i25 = 2;
            this.o0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.nm0 nm0Var2 = this.o0;
            i11 = this.b;
            nm0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
            this.o0.setOnItemClickListener(new org.telegram.ui.Components.p7(i25));
            this.n0.addView(this.o0, org.telegram.ui.Components.kb1.i(-1, -1, 51));
            org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider);
            this.q0 = j20Var;
            j20Var.setImageResource(R.drawable.floating_pencil);
            this.n0.addView(this.q0, org.telegram.ui.Components.j20.b());
            nc1 nc1Var = new nc1(context);
            this.p0 = nc1Var;
            this.o0.setAdapter(nc1Var);
            this.u0 = new org.telegram.ui.ActionBar.q0(this, context, i25);
            this.w0 = new rc1(context, this);
            this.t0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.t0.setOccupyStatusBar(false);
            }
            this.t0.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            this.t0.setActionBarMenuOnItemClick(new jc1(this));
            i12 = 0;
            while (true) {
                kc1VarArr = this.x0;
                if (i12 < 2) {
                    break;
                }
                kc1VarArr[i12] = new kc1(this, (Activity) getContext());
                this.u0.addView(kc1VarArr[i12], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i12++;
            }
            kc1 kc1Var = kc1VarArr[0];
            this.y0 = kc1Var;
            kc1Var.setVisibility(0);
            kc1VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.y0.getImageReceiver().setDelegate(new jb1(this, i24));
            }
            z11 = this.w0.e;
            org.telegram.ui.ActionBar.x6 x6Var2 = this.f0;
            if (!z11) {
                this.t0.setTitle("Telegram Beta Chat");
                this.t0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
            } else if (i11 == 2) {
                if (this.K1 != 0) {
                    this.t0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.t0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.z l4 = this.t0.l();
                Object obj3 = this.C1;
                if ((obj3 instanceof ei1) && ((ei1) obj3).e != null) {
                    l4.a(7, R.drawable.msg_header_draw);
                }
                if (this.K1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.y6.n0().k(false) == null) {
                        Object obj4 = this.C1;
                        if (obj4 instanceof di1) {
                        }
                    }
                    l4.a(5, R.drawable.msg_header_share);
                }
                if (this.K1 != 0 && this.M1) {
                    org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.O1 = yj0Var;
                    this.P1 = l4.d(6, yj0Var);
                    this.O1.h = true;
                    mc1 mc1Var2 = this.q1;
                    if (mc1Var2 == null || mc1Var2.a()) {
                        this.O1.M(35);
                        this.O1.P(36);
                    } else {
                        this.O1.P(0);
                        this.O1.M(0);
                    }
                    this.O1.Z = true;
                    int v02 = org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.J9);
                    this.O1.Q(v02, "Sunny");
                    this.O1.Q(v02, "Path 6");
                    this.O1.Q(v02, "Path");
                    this.O1.Q(v02, "Path 5");
                    this.O1.o();
                }
            } else if (i11 == 1) {
                org.telegram.ui.ActionBar.z l10 = this.t0.l();
                this.f = l10.e(4, LocaleController.getString(R.string.Save));
                org.telegram.ui.Components.km kmVar = new org.telegram.ui.Components.km(this, context, l10);
                this.e = kmVar;
                kmVar.setSubMenuOpenSide(1);
                this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                this.e.K();
                this.e.setForceSmoothKeyboard(true);
                this.t0.addView(this.e, org.telegram.ui.Components.kb1.h(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                    public final /* synthetic */ vc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                vc1.W(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.N0(false);
                                break;
                            default:
                                this.b.N0(true);
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
                int i26 = org.telegram.ui.ActionBar.y6.A8;
                org.telegram.ui.ActionBar.f7.V(textView2, i26, getResourceProvider());
                this.h.setTypeface(AndroidUtilities.bold());
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                org.telegram.ui.ActionBar.f7.y(this.h, mutate, i26, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                this.e.addView(this.h, org.telegram.ui.Components.kb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = x6Var2.F;
                String n10 = tL_theme != null ? tL_theme.title : x6Var2.n();
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                this.t0.setTitle(n10);
                TLRPC.TL_theme tL_theme2 = x6Var2.F;
                if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                    this.t0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.t0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i13, new Object[0]));
                }
            }
            this.v0 = new pb1(context, this);
            qb1 qb1Var = new qb1(this);
            qb1Var.S();
            this.v0.setItemAnimator(qb1Var);
            this.v0.setVerticalScrollBarEnabled(true);
            this.v0.setOverScrollMode(2);
            if (i11 != 2) {
                this.v0.setPadding(0, AndroidUtilities.dp(4.0f), 0, (AndroidUtilities.dp(72 + ((this.L1 || this.K1 <= 0) ? 0 : 58)) - 12) + (V0() ? AndroidUtilities.navigationBarHeight : 0));
            } else if (i11 == 1) {
                this.v0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
            } else {
                this.v0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }
            this.v0.setClipToPadding(false);
            this.v0.setLayoutManager(new s4.c0(1, true));
            this.v0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            if (i11 != 1) {
                this.u0.addView(this.v0, org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.v0.setOnItemClickListener(new jb1(this, i23));
            } else {
                this.u0.addView(this.v0, org.telegram.ui.Components.kb1.i(-1, -1, 51));
            }
            this.v0.setOnScrollListener(new z81(this, i23));
            this.u0.addView(this.t0, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            org.telegram.ui.Components.y91 y91Var = new org.telegram.ui.Components.y91(context);
            this.w1 = y91Var;
            y91Var.b(new jb1(this, i25));
            org.telegram.ui.ActionBar.w6 w6Var = this.v;
            if (i11 != 1 || i11 == 2) {
                if (i11 != 2) {
                    x4 x4Var = new x4(this, context, V0());
                    this.D0 = x4Var;
                    x4Var.setWillNotDraw(false);
                    i14 = 2;
                    this.D0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (V0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.u0.addView(this.D0, org.telegram.ui.Components.kb1.i(-1, 0, 81));
                    lc1 lc1Var = new lc1(context, this);
                    this.A1 = lc1Var;
                    org.telegram.ui.Components.kb1.c(lc1Var, 0.033f, 1.2f);
                    i1(false);
                    this.A1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                        public final /* synthetic */ vc1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    this.b.O0(false);
                                    break;
                                case 1:
                                    vc1.W(this.b);
                                    break;
                                case 2:
                                    this.b.e.U(null, null);
                                    break;
                                case 3:
                                    this.b.N0(false);
                                    break;
                                default:
                                    this.b.N0(true);
                                    break;
                            }
                        }
                    });
                    x6Var = x6Var2;
                    if (this.K1 <= 0 || this.L1 || this.r0 != null) {
                        this.D0.addView(this.A1, org.telegram.ui.Components.kb1.h(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        lc1 lc1Var2 = new lc1(context, this);
                        this.B1 = lc1Var2;
                        org.telegram.ui.Components.kb1.c(lc1Var2, 0.033f, 1.2f);
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.K1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().isPremium()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                        this.B1.d(spannableStringBuilder);
                        try {
                            lc1 lc1Var3 = this.B1;
                            CharSequence b10 = lc1Var3.b();
                            r11Var = this.B1.a;
                            lc1Var3.d(Emoji.replaceEmoji(b10, r11Var.i(), false));
                        } catch (Exception unused) {
                        }
                        final int i27 = 4;
                        this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                            public final /* synthetic */ vc1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i27) {
                                    case 0:
                                        this.b.O0(false);
                                        break;
                                    case 1:
                                        vc1.W(this.b);
                                        break;
                                    case 2:
                                        this.b.e.U(null, null);
                                        break;
                                    case 3:
                                        this.b.N0(false);
                                        break;
                                    default:
                                        this.b.N0(true);
                                        break;
                                }
                            }
                        });
                        this.D0.addView(this.A1, org.telegram.ui.Components.kb1.h(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.D0.addView(this.B1, org.telegram.ui.Components.kb1.h(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.N1) {
                        bi.j5 j5Var3 = new bi.j5(this, (Activity) getContext());
                        this.R1 = j5Var3;
                        j5Var3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        this.u0.addView(this.R1, org.telegram.ui.Components.kb1.i(222, 76, 49));
                        rb1 rb1Var = new rb1((Activity) getContext());
                        this.S1 = rb1Var;
                        rb1Var.d(this.o1);
                        this.S1.b();
                        this.S1.c(new kb1(this, i24));
                        this.R1.addView(this.S1);
                        mc1 mc1Var3 = this.q1;
                        if (mc1Var3 != null) {
                            this.S1.setVisibility(mc1Var3.a() ? 0 : 8);
                            this.S1.setAlpha(this.q1.a() ? 1.0f : 0.0f);
                            this.S1.d(this.q1.a() ? this.o1 : 0.0f);
                        }
                    }
                } else {
                    x6Var = x6Var2;
                    i14 = 2;
                }
                Rect rect = new Rect();
                Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.r = mutate2;
                mutate2.getPadding(rect);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.d6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                obj = this.C1;
                if (i11 != 1 || (obj instanceof di1)) {
                    if ((obj instanceof di1) || !"d".equals(((di1) obj).a)) {
                        i15 = 3;
                        String[] strArr = new String[i15];
                        int[] iArr = new int[i15];
                        this.K0 = new org.telegram.ui.Components.w91[i15];
                        if (i15 != 0) {
                            this.z0 = new FrameLayout(context);
                            if (i11 == 1 || (this.C1 instanceof di1)) {
                                strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                strArr[i14] = LocaleController.getString(R.string.BackgroundMotion);
                            } else {
                                strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                            }
                            int i28 = 0;
                            i17 = 0;
                            while (i28 < i15) {
                                int i29 = i23;
                                int i30 = i28;
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i28]));
                                iArr[i30] = ceil;
                                i17 = Math.max(i17, ceil);
                                i28 = i30 + 1;
                                i23 = i29;
                            }
                            i16 = i23;
                            sb1 sb1Var = new sb1(this, context, 0);
                            this.E0 = sb1Var;
                            sb1Var.setWillNotDraw(false);
                            this.E0.setVisibility(this.c1 != 0 ? 0 : 4);
                            this.E0.setScaleX(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setScaleY(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setAlpha(this.c1 != 0 ? 1.0f : 0.0f);
                            this.E0.setTag(this.c1 != 0 ? Integer.valueOf(i16) : null);
                            this.z0.addView(this.E0, org.telegram.ui.Components.kb1.i(48, 48, 17));
                            this.E0.setOnClickListener(new tb1(this, 0));
                            ImageView imageView = new ImageView(context);
                            this.G0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.G0.setImageResource(R.drawable.bg_rotate_large);
                            this.E0.addView(this.G0, org.telegram.ui.Components.kb1.i(-2, -2, 17));
                        } else {
                            i16 = 1;
                            i17 = 0;
                        }
                        i18 = 0;
                        while (true) {
                            ub1Var = this.a;
                            if (i18 >= i15) {
                                break;
                            }
                            this.K0[i18] = new org.telegram.ui.Components.w91(context, ((i11 == i16 || (this.C1 instanceof di1)) && i18 == 0) ? false : true, this.y0, ub1Var);
                            this.K0[i18].setBackgroundColor(this.a1);
                            org.telegram.ui.Components.w91 w91Var = this.K0[i18];
                            String str = strArr[i18];
                            int i31 = iArr[i18];
                            w91Var.f = str;
                            w91Var.h = i31;
                            w91Var.n = i17;
                            int i32 = 1;
                            if (i11 != 1) {
                                if (this.C1 instanceof di1) {
                                    i32 = 1;
                                } else {
                                    w91Var.a(i18 == 0 ? this.G1 : this.F1, false);
                                    int dp = AndroidUtilities.dp(56.0f) + i17;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, -2);
                                    layoutParams.gravity = 17;
                                    if (i15 != 3) {
                                        if (i18 == 0 || i18 == 2) {
                                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                        } else {
                                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                        }
                                    } else if (i18 == 1) {
                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                    } else {
                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                    }
                                    this.z0.addView(this.K0[i18], layoutParams);
                                    final org.telegram.ui.Components.w91 w91Var2 = this.K0[i18];
                                    final int i33 = 0;
                                    w91Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb1
                                        public final /* synthetic */ vc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i33) {
                                                case 0:
                                                    vc1 vc1Var = this.b;
                                                    int i34 = vc1Var.b;
                                                    FrameLayout[] frameLayoutArr = vc1Var.M0;
                                                    if (vc1Var.z0.getAlpha() == 1.0f && vc1Var.s1 == null) {
                                                        int i35 = i18;
                                                        org.telegram.ui.Components.w91 w91Var3 = w91Var2;
                                                        if ((i34 != 1 && !(vc1Var.C1 instanceof di1)) || i35 != 2) {
                                                            if (i35 != 1 || (i34 != 1 && !(vc1Var.C1 instanceof di1))) {
                                                                if (!(vc1Var.C1 instanceof di1)) {
                                                                    if (i34 != 1) {
                                                                        w91Var3.a(!w91Var3.s, true);
                                                                        if (i35 != 0) {
                                                                            boolean z13 = w91Var3.s;
                                                                            vc1Var.F1 = z13;
                                                                            vc1Var.w1.c(z13);
                                                                            vc1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = w91Var3.s;
                                                                            vc1Var.G1 = z14;
                                                                            if (z14) {
                                                                                vc1Var.y0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            vc1Var.j1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    vc1Var.g1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (vc1Var.K0[1].s) {
                                                                    vc1Var.Z0 = vc1Var.X0;
                                                                    vc1Var.y0.setImageDrawable(null);
                                                                    vc1Var.X0 = null;
                                                                    vc1Var.F1 = false;
                                                                    vc1Var.k1();
                                                                    vc1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i34 == 1) {
                                                                            vc1Var.g1(0, true, true);
                                                                        } else {
                                                                            vc1Var.g1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    vc1Var.a1(vc1Var.Z0 != null ? -1 : 0);
                                                                    if (i34 == 1) {
                                                                        vc1Var.g1(1, true, true);
                                                                    } else {
                                                                        vc1Var.g1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                vc1Var.K0[1].a(vc1Var.X0 != null, true);
                                                                vc1Var.o1();
                                                                vc1Var.Q0.g1();
                                                                vc1Var.m1();
                                                                break;
                                                            }
                                                        } else {
                                                            w91Var3.a(!w91Var3.s, true);
                                                            boolean z15 = w91Var3.s;
                                                            vc1Var.F1 = z15;
                                                            vc1Var.w1.c(z15);
                                                            vc1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    vc1 vc1Var2 = this.b;
                                                    if (vc1Var2.A0.getAlpha() == 1.0f && i18 == 0) {
                                                        org.telegram.ui.Components.w91 w91Var4 = w91Var2;
                                                        w91Var4.a(!w91Var4.s, true);
                                                        vc1Var2.v.i = w91Var4.s;
                                                        org.telegram.ui.ActionBar.y6.q1(true, true);
                                                        vc1Var2.v0.g1();
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
                                    i14 = 2;
                                    i16 = 1;
                                }
                            }
                            if (i18 == i32) {
                                w91Var.a((this.X0 == null && (w6Var == null || TextUtils.isEmpty(w6Var.o))) ? false : true, false);
                            } else if (i18 == i14) {
                                w91Var.a(this.F1, false);
                            }
                            int dp2 = AndroidUtilities.dp(56.0f) + i17;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp2, -2);
                            layoutParams2.gravity = 17;
                            if (i15 != 3) {
                            }
                            this.z0.addView(this.K0[i18], layoutParams2);
                            final org.telegram.ui.Components.w91 w91Var22 = this.K0[i18];
                            final int i332 = 0;
                            w91Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb1
                                public final /* synthetic */ vc1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i332) {
                                        case 0:
                                            vc1 vc1Var = this.b;
                                            int i34 = vc1Var.b;
                                            FrameLayout[] frameLayoutArr = vc1Var.M0;
                                            if (vc1Var.z0.getAlpha() == 1.0f && vc1Var.s1 == null) {
                                                int i35 = i18;
                                                org.telegram.ui.Components.w91 w91Var3 = w91Var22;
                                                if ((i34 != 1 && !(vc1Var.C1 instanceof di1)) || i35 != 2) {
                                                    if (i35 != 1 || (i34 != 1 && !(vc1Var.C1 instanceof di1))) {
                                                        if (!(vc1Var.C1 instanceof di1)) {
                                                            if (i34 != 1) {
                                                                w91Var3.a(!w91Var3.s, true);
                                                                if (i35 != 0) {
                                                                    boolean z13 = w91Var3.s;
                                                                    vc1Var.F1 = z13;
                                                                    vc1Var.w1.c(z13);
                                                                    vc1Var.M0();
                                                                    break;
                                                                } else {
                                                                    boolean z14 = w91Var3.s;
                                                                    vc1Var.G1 = z14;
                                                                    if (z14) {
                                                                        vc1Var.y0.getImageReceiver().setForceCrossfade(true);
                                                                    }
                                                                    vc1Var.j1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            vc1Var.g1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (vc1Var.K0[1].s) {
                                                            vc1Var.Z0 = vc1Var.X0;
                                                            vc1Var.y0.setImageDrawable(null);
                                                            vc1Var.X0 = null;
                                                            vc1Var.F1 = false;
                                                            vc1Var.k1();
                                                            vc1Var.M0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i34 == 1) {
                                                                    vc1Var.g1(0, true, true);
                                                                } else {
                                                                    vc1Var.g1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            vc1Var.a1(vc1Var.Z0 != null ? -1 : 0);
                                                            if (i34 == 1) {
                                                                vc1Var.g1(1, true, true);
                                                            } else {
                                                                vc1Var.g1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        vc1Var.K0[1].a(vc1Var.X0 != null, true);
                                                        vc1Var.o1();
                                                        vc1Var.Q0.g1();
                                                        vc1Var.m1();
                                                        break;
                                                    }
                                                } else {
                                                    w91Var3.a(!w91Var3.s, true);
                                                    boolean z15 = w91Var3.s;
                                                    vc1Var.F1 = z15;
                                                    vc1Var.w1.c(z15);
                                                    vc1Var.M0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            vc1 vc1Var2 = this.b;
                                            if (vc1Var2.A0.getAlpha() == 1.0f && i18 == 0) {
                                                org.telegram.ui.Components.w91 w91Var4 = w91Var22;
                                                w91Var4.a(!w91Var4.s, true);
                                                vc1Var2.v.i = w91Var4.s;
                                                org.telegram.ui.ActionBar.y6.q1(true, true);
                                                vc1Var2.v0.g1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i18 != 2) {
                            }
                            i18++;
                            i14 = 2;
                            i16 = 1;
                        }
                        i19 = i16;
                        if (i11 == i19) {
                            int[] iArr2 = new int[2];
                            this.L0 = new org.telegram.ui.Components.w91[2];
                            this.A0 = new FrameLayout(context);
                            String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 2; i34 < i36; i36 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i34]));
                                iArr2[i34] = ceil2;
                                i35 = Math.max(i35, ceil2);
                                i34++;
                            }
                            if (w6Var != null) {
                                sb1 sb1Var2 = new sb1(this, context, 1);
                                this.F0 = sb1Var2;
                                sb1Var2.setWillNotDraw(false);
                                this.F0.setVisibility(w6Var.f != 0 ? 0 : 4);
                                this.F0.setScaleX(w6Var.f != 0 ? 1.0f : 0.1f);
                                this.F0.setScaleY(w6Var.f != 0 ? 1.0f : 0.1f);
                                this.F0.setAlpha(w6Var.f != 0 ? 1.0f : 0.0f);
                                this.A0.addView(this.F0, org.telegram.ui.Components.kb1.i(48, 48, 17));
                                this.F0.setOnClickListener(new tb1(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.H0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.H0.setImageResource(R.drawable.bg_rotate_large);
                                this.F0.addView(this.H0, org.telegram.ui.Components.kb1.i(-2, -2, 17));
                                final int i37 = 0;
                                while (i37 < 2) {
                                    this.L0[i37] = new org.telegram.ui.Components.w91(context, i37 == 0, this.y0, ub1Var);
                                    org.telegram.ui.Components.w91 w91Var3 = this.L0[i37];
                                    String str2 = strArr2[i37];
                                    int i38 = iArr2[i37];
                                    w91Var3.f = str2;
                                    w91Var3.h = i38;
                                    w91Var3.n = i35;
                                    if (i37 == 0) {
                                        w91Var3.a(w6Var.i, false);
                                    }
                                    int dp3 = AndroidUtilities.dp(56.0f) + i35;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i37 == 1) {
                                        layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    }
                                    this.A0.addView(this.L0[i37], layoutParams3);
                                    final org.telegram.ui.Components.w91 w91Var4 = this.L0[i37];
                                    final int i39 = 1;
                                    w91Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb1
                                        public final /* synthetic */ vc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i39) {
                                                case 0:
                                                    vc1 vc1Var = this.b;
                                                    int i342 = vc1Var.b;
                                                    FrameLayout[] frameLayoutArr = vc1Var.M0;
                                                    if (vc1Var.z0.getAlpha() == 1.0f && vc1Var.s1 == null) {
                                                        int i352 = i37;
                                                        org.telegram.ui.Components.w91 w91Var32 = w91Var4;
                                                        if ((i342 != 1 && !(vc1Var.C1 instanceof di1)) || i352 != 2) {
                                                            if (i352 != 1 || (i342 != 1 && !(vc1Var.C1 instanceof di1))) {
                                                                if (!(vc1Var.C1 instanceof di1)) {
                                                                    if (i342 != 1) {
                                                                        w91Var32.a(!w91Var32.s, true);
                                                                        if (i352 != 0) {
                                                                            boolean z13 = w91Var32.s;
                                                                            vc1Var.F1 = z13;
                                                                            vc1Var.w1.c(z13);
                                                                            vc1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = w91Var32.s;
                                                                            vc1Var.G1 = z14;
                                                                            if (z14) {
                                                                                vc1Var.y0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            vc1Var.j1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    vc1Var.g1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (vc1Var.K0[1].s) {
                                                                    vc1Var.Z0 = vc1Var.X0;
                                                                    vc1Var.y0.setImageDrawable(null);
                                                                    vc1Var.X0 = null;
                                                                    vc1Var.F1 = false;
                                                                    vc1Var.k1();
                                                                    vc1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i342 == 1) {
                                                                            vc1Var.g1(0, true, true);
                                                                        } else {
                                                                            vc1Var.g1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    vc1Var.a1(vc1Var.Z0 != null ? -1 : 0);
                                                                    if (i342 == 1) {
                                                                        vc1Var.g1(1, true, true);
                                                                    } else {
                                                                        vc1Var.g1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                vc1Var.K0[1].a(vc1Var.X0 != null, true);
                                                                vc1Var.o1();
                                                                vc1Var.Q0.g1();
                                                                vc1Var.m1();
                                                                break;
                                                            }
                                                        } else {
                                                            w91Var32.a(!w91Var32.s, true);
                                                            boolean z15 = w91Var32.s;
                                                            vc1Var.F1 = z15;
                                                            vc1Var.w1.c(z15);
                                                            vc1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    vc1 vc1Var2 = this.b;
                                                    if (vc1Var2.A0.getAlpha() == 1.0f && i37 == 0) {
                                                        org.telegram.ui.Components.w91 w91Var42 = w91Var4;
                                                        w91Var42.a(!w91Var42.s, true);
                                                        vc1Var2.v.i = w91Var42.s;
                                                        org.telegram.ui.ActionBar.y6.q1(true, true);
                                                        vc1Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i37++;
                                }
                            }
                            i20 = 1;
                        } else {
                            i20 = i19;
                        }
                        if (i11 != i20 || (this.C1 instanceof di1)) {
                            this.G1 = false;
                            i21 = 0;
                            while (i21 < 2) {
                                vb1 vb1Var = new vb1(this, context, i21, rect);
                                ViewGroup[] viewGroupArr2 = this.M0;
                                viewGroupArr2[i21] = vb1Var;
                                if (i21 == 1 || i11 == 2) {
                                    vb1Var.setVisibility(4);
                                }
                                viewGroupArr2[i21].setWillNotDraw(false);
                                FrameLayout.LayoutParams i40 = i11 == 2 ? org.telegram.ui.Components.kb1.i(-1, i21 == 0 ? 321 : 316, 83) : org.telegram.ui.Components.kb1.i(-1, i21 == 0 ? 273 : 316, 83);
                                i40.height = AndroidUtilities.dp(i21 == 0 ? i11 == 2 ? 321 : 273 : 316.0f);
                                if (V0()) {
                                    i40.height += AndroidUtilities.navigationBarHeight;
                                }
                                if (i21 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect2 = AndroidUtilities.rectTmp2;
                                    drawable2.getPadding(rect2);
                                    i40.height = AndroidUtilities.dp(12.0f) + rect2.top + i40.height;
                                }
                                viewGroupArr2[i21].setPadding(0, i21 == 0 ? AndroidUtilities.dp(12.0f) + rect.top : 0, 0, V0() ? AndroidUtilities.navigationBarHeight : 0);
                                this.u0.addView(viewGroupArr2[i21], i40);
                                if (i21 == 1 || i11 == 2) {
                                    bh.p pVar = new bh.p(this, context, 25);
                                    ViewGroup[] viewGroupArr3 = this.P0;
                                    viewGroupArr3[i21] = pVar;
                                    pVar.setWillNotDraw(false);
                                    viewGroupArr3[i21].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                    viewGroupArr3[i21].setClickable(true);
                                    f7 = 21.0f;
                                    viewGroupArr2[i21].addView(viewGroupArr3[i21], org.telegram.ui.Components.kb1.i(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.N0;
                                    textViewArr[i21] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i21].setTypeface(AndroidUtilities.bold());
                                    TextView textView4 = textViewArr[i21];
                                    int i41 = org.telegram.ui.ActionBar.y6.Ae;
                                    org.telegram.ui.ActionBar.f7.V(textView4, i41, getResourceProvider());
                                    textViewArr[i21].setText(LocaleController.getString(R.string.Cancel));
                                    textViewArr[i21].setGravity(17);
                                    textViewArr[i21].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    TextView textView5 = textViewArr[i21];
                                    int i42 = org.telegram.ui.ActionBar.y6.i6;
                                    viewGroupArr = viewGroupArr2;
                                    org.telegram.ui.ActionBar.f7.R(textView5, org.telegram.ui.ActionBar.y6.f0(getThemedColor(i42), 0), null, org.telegram.ui.ActionBar.f7.N(i42), getResourceProvider());
                                    viewGroupArr3[i21].addView(textViewArr[i21], org.telegram.ui.Components.kb1.i(-2, -1, 51));
                                    final int i43 = 0;
                                    textViewArr[i21].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ob1
                                        public final /* synthetic */ vc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i43) {
                                                case 0:
                                                    vc1 vc1Var = this.b;
                                                    if (vc1Var.s1 == null) {
                                                        int i44 = i21;
                                                        if (i44 == 0) {
                                                            vc1Var.i1 = vc1Var.j1;
                                                            vc1Var.b1(vc1Var.h1, 3, true);
                                                            vc1Var.b1(vc1Var.g1, 2, true);
                                                            vc1Var.b1(vc1Var.f1, 1, true);
                                                            vc1Var.b1(vc1Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = vc1Var.Y0;
                                                            vc1Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                vc1Var.y0.setImageDrawable(null);
                                                            } else {
                                                                kc1 kc1Var2 = vc1Var.y0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = vc1Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = vc1Var.X0;
                                                                kc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            vc1Var.K0[1].a(vc1Var.X0 != null, false);
                                                            float f10 = vc1Var.n1;
                                                            vc1Var.m1 = f10;
                                                            vc1Var.U0.setProgress(f10);
                                                            vc1Var.y0.getImageReceiver().setAlpha(vc1Var.m1);
                                                            vc1Var.k1();
                                                            vc1Var.o1();
                                                        }
                                                        if (vc1Var.b != 2) {
                                                            if (vc1Var.X0 == null) {
                                                                if (vc1Var.F1) {
                                                                    vc1Var.F1 = false;
                                                                    vc1Var.K0[0].a(false, true);
                                                                    vc1Var.M0();
                                                                }
                                                                vc1Var.m1();
                                                            }
                                                            vc1Var.g1(0, true, true);
                                                            break;
                                                        } else {
                                                            vc1Var.g1(i44, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    vc1 vc1Var2 = this.b;
                                                    if (vc1Var2.s1 == null) {
                                                        if (vc1Var2.b != 2) {
                                                            vc1Var2.g1(0, true, true);
                                                            break;
                                                        } else {
                                                            vc1Var2.g1(i21, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.O0;
                                    textViewArr2[i21] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i21].setTypeface(AndroidUtilities.bold());
                                    org.telegram.ui.ActionBar.f7.V(textViewArr2[i21], i41, getResourceProvider());
                                    textViewArr2[i21].setText(LocaleController.getString(R.string.ApplyTheme));
                                    textViewArr2[i21].setGravity(17);
                                    textViewArr2[i21].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    org.telegram.ui.ActionBar.f7.R(textViewArr2[i21], org.telegram.ui.ActionBar.y6.f0(getThemedColor(i42), 0), null, org.telegram.ui.ActionBar.f7.N(i42), getResourceProvider());
                                    viewGroupArr3[i21].addView(textViewArr2[i21], org.telegram.ui.Components.kb1.i(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i21];
                                    r72 = 1;
                                    final char c10 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ob1
                                        public final /* synthetic */ vc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c10) {
                                                case 0:
                                                    vc1 vc1Var = this.b;
                                                    if (vc1Var.s1 == null) {
                                                        int i44 = i21;
                                                        if (i44 == 0) {
                                                            vc1Var.i1 = vc1Var.j1;
                                                            vc1Var.b1(vc1Var.h1, 3, true);
                                                            vc1Var.b1(vc1Var.g1, 2, true);
                                                            vc1Var.b1(vc1Var.f1, 1, true);
                                                            vc1Var.b1(vc1Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = vc1Var.Y0;
                                                            vc1Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                vc1Var.y0.setImageDrawable(null);
                                                            } else {
                                                                kc1 kc1Var2 = vc1Var.y0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = vc1Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = vc1Var.X0;
                                                                kc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            vc1Var.K0[1].a(vc1Var.X0 != null, false);
                                                            float f10 = vc1Var.n1;
                                                            vc1Var.m1 = f10;
                                                            vc1Var.U0.setProgress(f10);
                                                            vc1Var.y0.getImageReceiver().setAlpha(vc1Var.m1);
                                                            vc1Var.k1();
                                                            vc1Var.o1();
                                                        }
                                                        if (vc1Var.b != 2) {
                                                            if (vc1Var.X0 == null) {
                                                                if (vc1Var.F1) {
                                                                    vc1Var.F1 = false;
                                                                    vc1Var.K0[0].a(false, true);
                                                                    vc1Var.M0();
                                                                }
                                                                vc1Var.m1();
                                                            }
                                                            vc1Var.g1(0, true, true);
                                                            break;
                                                        } else {
                                                            vc1Var.g1(i44, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    vc1 vc1Var2 = this.b;
                                                    if (vc1Var2.s1 == null) {
                                                        if (vc1Var2.b != 2) {
                                                            vc1Var2.g1(0, true, true);
                                                            break;
                                                        } else {
                                                            vc1Var2.g1(i21, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    viewGroupArr = viewGroupArr2;
                                    r72 = 1;
                                    f7 = 21.0f;
                                }
                                if (i21 == r72) {
                                    TextView textView8 = new TextView(context);
                                    this.f2 = textView8;
                                    textView8.setLines(r72);
                                    this.f2.setSingleLine(r72);
                                    this.f2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                    org.telegram.ui.ActionBar.f7.V(this.f2, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
                                    this.f2.setTextSize(r72, 20.0f);
                                    this.f2.setTypeface(AndroidUtilities.bold());
                                    this.f2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(8.0f));
                                    this.f2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.f2.setGravity(16);
                                    viewGroupArr[i21].addView(this.f2, org.telegram.ui.Components.kb1.h(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    bb1 bb1Var = new bb1(context);
                                    this.Q0 = bb1Var;
                                    s4.c0 c0Var = new s4.c0(0, false);
                                    this.S0 = c0Var;
                                    bb1Var.setLayoutManager(c0Var);
                                    bb1 bb1Var2 = this.Q0;
                                    tc1 tc1Var = new tc1(context, this);
                                    this.R0 = tc1Var;
                                    bb1Var2.setAdapter(tc1Var);
                                    this.Q0.i(new di.l(9));
                                    viewGroupArr[i21].addView(this.Q0, org.telegram.ui.Components.kb1.h(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.Q0.setOnItemClickListener(new o11(this, 8));
                                    org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
                                    this.T0 = q4Var;
                                    q4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                    viewGroupArr[i21].addView(this.T0, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context, (ub1) getResourceProvider());
                                    this.U0 = i0Var;
                                    i0Var.setProgress(this.m1);
                                    this.U0.setReportChanges(true);
                                    this.U0.setDelegate(new wb1(this));
                                    viewGroupArr[i21].addView(this.U0, org.telegram.ui.Components.kb1.h(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(context, this.h0, new xb1(this));
                                    this.W = yqVar;
                                    yqVar.setResourcesProvider(getResourceProvider());
                                    if (i11 == 1) {
                                        viewGroupArr[i21].addView(this.W, org.telegram.ui.Components.kb1.i(-1, -1, 1));
                                        if (x6Var.q()) {
                                            this.W.setMinBrightness(0.2f);
                                        } else {
                                            this.W.setMinBrightness(0.05f);
                                            this.W.setMaxBrightness(0.8f);
                                        }
                                        if (w6Var != null) {
                                            int i44 = w6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.yq yqVar2 = this.W;
                                            U0(1);
                                            yqVar2.f(1, 2, i44, false);
                                            this.W.e(w6Var.c, 0);
                                            int i45 = w6Var.d;
                                            if (i45 != 0) {
                                                this.W.e(i45, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i21].addView(this.W, org.telegram.ui.Components.kb1.h(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i21++;
                            }
                        }
                        k1();
                        if (!this.y0.getImageReceiver().hasBitmapImage()) {
                            this.u0.setBackgroundColor(-16777216);
                        }
                        if (i11 != 1 && !(this.C1 instanceof di1)) {
                            this.y0.getImageReceiver().setCrossfadeWithOldImage(true);
                        }
                    }
                    i15 = 0;
                    String[] strArr3 = new String[i15];
                    int[] iArr3 = new int[i15];
                    this.K0 = new org.telegram.ui.Components.w91[i15];
                    if (i15 != 0) {
                    }
                    i18 = 0;
                    while (true) {
                        ub1Var = this.a;
                        if (i18 >= i15) {
                        }
                        i18++;
                        i14 = 2;
                        i16 = 1;
                    }
                    i19 = i16;
                    if (i11 == i19) {
                    }
                    if (i11 != i20) {
                    }
                    this.G1 = false;
                    i21 = 0;
                    while (i21 < 2) {
                    }
                    k1();
                    if (!this.y0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                        this.y0.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                } else {
                    if (!(obj instanceof ei1) || !"t".equals(((ei1) obj).a)) {
                        i15 = i14;
                        String[] strArr32 = new String[i15];
                        int[] iArr32 = new int[i15];
                        this.K0 = new org.telegram.ui.Components.w91[i15];
                        if (i15 != 0) {
                        }
                        i18 = 0;
                        while (true) {
                            ub1Var = this.a;
                            if (i18 >= i15) {
                            }
                            i18++;
                            i14 = 2;
                            i16 = 1;
                        }
                        i19 = i16;
                        if (i11 == i19) {
                        }
                        if (i11 != i20) {
                        }
                        this.G1 = false;
                        i21 = 0;
                        while (i21 < 2) {
                        }
                        k1();
                        if (!this.y0.getImageReceiver().hasBitmapImage()) {
                        }
                        if (i11 != 1) {
                        }
                    }
                    i15 = 0;
                    String[] strArr322 = new String[i15];
                    int[] iArr322 = new int[i15];
                    this.K0 = new org.telegram.ui.Components.w91[i15];
                    if (i15 != 0) {
                    }
                    i18 = 0;
                    while (true) {
                        ub1Var = this.a;
                        if (i18 >= i15) {
                        }
                        i18++;
                        i14 = 2;
                        i16 = 1;
                    }
                    i19 = i16;
                    if (i11 == i19) {
                    }
                    if (i11 != i20) {
                    }
                    this.G1 = false;
                    i21 = 0;
                    while (i21 < 2) {
                    }
                    k1();
                    if (!this.y0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                    }
                }
            }
            this.v0.setAdapter(this.w0);
            bh.p pVar2 = new bh.p(this, context, 26);
            this.l0 = pVar2;
            pVar2.setWillNotDraw(false);
            bh.p pVar3 = this.l0;
            this.fragmentView = pVar3;
            ViewTreeObserver viewTreeObserver = pVar3.getViewTreeObserver();
            int i46 = 1;
            u90 u90Var = new u90(this, i46);
            this.R = u90Var;
            viewTreeObserver.addOnGlobalLayoutListener(u90Var);
            a5.m mVar = new a5.m(context);
            this.k0 = mVar;
            mVar.b(new l2(this, 2));
            this.k0.setAdapter(new q70(this, i46));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.k0, getThemedColor(org.telegram.ui.ActionBar.y6.s8));
            this.l0.addView(this.k0, org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.m0 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.l0.addView(this.m0, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i11 != 0) {
                View view = new View(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, getResourceProvider());
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                this.l0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.c0 = frameLayout;
                boolean z13 = this.d;
                if (z13) {
                    int i47 = org.telegram.ui.ActionBar.y6.d6;
                    frameLayout.setBackgroundColor(z13 ? org.telegram.ui.ActionBar.y6.E0(i47) : getThemedColor(i47));
                } else {
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout, getResourceProvider());
                }
                this.l0.addView(this.c0, org.telegram.ui.Components.kb1.i(-1, 48, 83));
                fi.f6 f6Var = new fi.f6(context, this);
                this.b0 = f6Var;
                this.c0.addView(f6Var, org.telegram.ui.Components.kb1.i(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.e0 = textView9;
                textView9.setTextSize(1, 14.0f);
                if (z13) {
                    TextView textView10 = this.e0;
                    int i48 = org.telegram.ui.ActionBar.y6.Ae;
                    textView10.setTextColor(z13 ? org.telegram.ui.ActionBar.y6.E0(i48) : getThemedColor(i48));
                } else {
                    org.telegram.ui.ActionBar.f7.V(this.e0, org.telegram.ui.ActionBar.y6.Ae, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.f0(251658240, 0));
                this.e0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.e0.setText(LocaleController.getString(R.string.Cancel));
                this.e0.setTypeface(AndroidUtilities.bold());
                this.c0.addView(this.e0, org.telegram.ui.Components.kb1.i(-2, -1, 51));
                final int i49 = 0;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                    public final /* synthetic */ vc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i49) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                vc1.W(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.N0(false);
                                break;
                            default:
                                this.b.N0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.d0 = textView11;
                textView11.setTextSize(1, 14.0f);
                if (z13) {
                    TextView textView12 = this.d0;
                    int i50 = org.telegram.ui.ActionBar.y6.Ae;
                    textView12.setTextColor(z13 ? org.telegram.ui.ActionBar.y6.E0(i50) : getThemedColor(i50));
                } else {
                    org.telegram.ui.ActionBar.f7.V(this.d0, org.telegram.ui.ActionBar.y6.Ae, getResourceProvider());
                }
                this.d0.setGravity(17);
                this.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.f0(251658240, 0));
                this.d0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.d0.setText(LocaleController.getString(R.string.ApplyTheme));
                this.d0.setTypeface(AndroidUtilities.bold());
                this.c0.addView(this.d0, org.telegram.ui.Components.kb1.i(-2, -1, 53));
                i22 = 1;
                this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                    public final /* synthetic */ vc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i22) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                vc1.W(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.N0(false);
                                break;
                            default:
                                this.b.N0(true);
                                break;
                        }
                    }
                });
            } else {
                i22 = 1;
            }
            if (i11 == i22 && !org.telegram.ui.ActionBar.y6.b1() && w6Var != null && w6Var.j != 4294967296L) {
                Y0();
            }
            this.j0 = T0();
            c1(true);
            n1(false);
            this.c = new Scroller(getContext());
            j5Var2 = this.parentLayout;
            if (j5Var2 != null && j5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.y6.h5));
                if (i11 == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
            return this.fragmentView;
        }
        z10 = false;
        this.N1 = z10;
        if (z10) {
        }
        j5Var = this.parentLayout;
        if (j5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.n0 = new FrameLayout(context);
        i10 = 3;
        if (this.N1) {
            AndroidUtilities.runOnUIThread(new hb1(this, i10), 2000L);
        }
        this.actionBar.l().a(0, R.drawable.outline_header_search).M().J(new fc1()).setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.k5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        k0 k0Var2 = new k0(this, context, 26);
        this.n0 = k0Var2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k0Var2, getResourceProvider());
        this.n0.addView(this.actionBar, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        org.telegram.ui.Components.nm0 nm0Var3 = new org.telegram.ui.Components.nm0(context);
        this.o0 = nm0Var3;
        nm0Var3.setVerticalScrollBarEnabled(true);
        this.o0.setItemAnimator(null);
        this.o0.setLayoutAnimation(null);
        this.o0.setLayoutManager(new s4.c0(1, false));
        final int i252 = 2;
        this.o0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.nm0 nm0Var22 = this.o0;
        i11 = this.b;
        nm0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
        this.o0.setOnItemClickListener(new org.telegram.ui.Components.p7(i252));
        this.n0.addView(this.o0, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        org.telegram.ui.Components.j20 j20Var2 = new org.telegram.ui.Components.j20(context, this.resourceProvider);
        this.q0 = j20Var2;
        j20Var2.setImageResource(R.drawable.floating_pencil);
        this.n0.addView(this.q0, org.telegram.ui.Components.j20.b());
        nc1 nc1Var2 = new nc1(context);
        this.p0 = nc1Var2;
        this.o0.setAdapter(nc1Var2);
        this.u0 = new org.telegram.ui.ActionBar.q0(this, context, i252);
        this.w0 = new rc1(context, this);
        this.t0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        this.t0.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.t0.setActionBarMenuOnItemClick(new jc1(this));
        i12 = 0;
        while (true) {
            kc1VarArr = this.x0;
            if (i12 < 2) {
            }
            kc1VarArr[i12] = new kc1(this, (Activity) getContext());
            this.u0.addView(kc1VarArr[i12], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i12++;
        }
        kc1 kc1Var2 = kc1VarArr[0];
        this.y0 = kc1Var2;
        kc1Var2.setVisibility(0);
        kc1VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z11 = this.w0.e;
        org.telegram.ui.ActionBar.x6 x6Var22 = this.f0;
        if (!z11) {
        }
        this.v0 = new pb1(context, this);
        qb1 qb1Var2 = new qb1(this);
        qb1Var2.S();
        this.v0.setItemAnimator(qb1Var2);
        this.v0.setVerticalScrollBarEnabled(true);
        this.v0.setOverScrollMode(2);
        if (i11 != 2) {
        }
        this.v0.setClipToPadding(false);
        this.v0.setLayoutManager(new s4.c0(1, true));
        this.v0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        if (i11 != 1) {
        }
        this.v0.setOnScrollListener(new z81(this, i23));
        this.u0.addView(this.t0, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        org.telegram.ui.Components.y91 y91Var2 = new org.telegram.ui.Components.y91(context);
        this.w1 = y91Var2;
        y91Var2.b(new jb1(this, i252));
        org.telegram.ui.ActionBar.w6 w6Var2 = this.v;
        if (i11 != 1) {
        }
        if (i11 != 2) {
        }
        Rect rect3 = new Rect();
        Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate22;
        mutate22.getPadding(rect3);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.d6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        obj = this.C1;
        if (i11 != 1) {
        }
        if (obj instanceof di1) {
        }
        i15 = 3;
        String[] strArr3222 = new String[i15];
        int[] iArr3222 = new int[i15];
        this.K0 = new org.telegram.ui.Components.w91[i15];
        if (i15 != 0) {
        }
        i18 = 0;
        while (true) {
            ub1Var = this.a;
            if (i18 >= i15) {
            }
            i18++;
            i14 = 2;
            i16 = 1;
        }
        i19 = i16;
        if (i11 == i19) {
        }
        if (i11 != i20) {
        }
        this.G1 = false;
        i21 = 0;
        while (i21 < 2) {
        }
        k1();
        if (!this.y0.getImageReceiver().hasBitmapImage()) {
        }
        if (i11 != 1) {
        }
        this.v0.setAdapter(this.w0);
        bh.p pVar22 = new bh.p(this, context, 26);
        this.l0 = pVar22;
        pVar22.setWillNotDraw(false);
        bh.p pVar32 = this.l0;
        this.fragmentView = pVar32;
        ViewTreeObserver viewTreeObserver2 = pVar32.getViewTreeObserver();
        int i462 = 1;
        u90 u90Var2 = new u90(this, i462);
        this.R = u90Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(u90Var2);
        a5.m mVar2 = new a5.m(context);
        this.k0 = mVar2;
        mVar2.b(new l2(this, 2));
        this.k0.setAdapter(new q70(this, i462));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.k0, getThemedColor(org.telegram.ui.ActionBar.y6.s8));
        this.l0.addView(this.k0, org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.m0 = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.l0.addView(this.m0, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i11 != 0) {
        }
        if (i11 == i22) {
            Y0();
        }
        this.j0 = T0();
        c1(true);
        n1(false);
        this.c = new Scroller(getContext());
        j5Var2 = this.parentLayout;
        if (j5Var2 != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.y6.h5));
            if (i11 == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(long j10) {
        this.K1 = j10;
        this.L1 = j10 == 0 || j10 == getUserConfig().getClientUserId();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                i1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.nm0 nm0Var = this.o0;
            if (nm0Var == null) {
                return;
            }
            int childCount = nm0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.o0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) childAt).a0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            pb1 pb1Var = this.v0;
            if (pb1Var != null) {
                pb1Var.g1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.u0 != null) {
                c1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.C1;
            if (obj instanceof ei1) {
                ei1 ei1Var = (ei1) obj;
                if (ei1Var.a == null) {
                    ei1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.wallpaperSettedToUser || this.K1 == 0) {
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
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.V0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.w6 w6Var = this.v;
                if (w6Var != null && (str = w6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                    c1(false);
                    k1();
                } else if (w6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        String str2 = tL_wallPaper2.slug;
                        if (str2 != null) {
                            if (!str2.equals(wallPaper.slug)) {
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (!z10 && (tL_wallPaper = this.X0) != null) {
            this.V0.add(0, tL_wallPaper);
        }
        tc1 tc1Var = this.R0;
        if (tc1Var != null) {
            tc1Var.l();
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j10 = MediaDataController.calcHash(j10, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new nb1(this, 1)), this.classGuid);
    }

    public final void e1(org.telegram.ui.Cells.v0 v0Var) {
        float f7;
        if (this.y0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.y0.getMeasuredWidth() - (Math.max(this.y0.getMeasuredWidth() / width, this.y0.getMeasuredHeight() / r0.i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = v0Var.getY() - ((-this.y0.J) + 0.0f);
        int measuredHeight = this.y0.getMeasuredHeight();
        float f10 = this.N1 ? this.o1 * this.p1 : 0.0f;
        v0Var.w0 = true;
        v0Var.v0 = measuredHeight;
        v0Var.t0 = y3;
        v0Var.u0 = f7;
        v0Var.b2 = f10;
        v0Var.c2.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    public final void f1() {
        if (this.u0 == null || this.L0 == null || this.v.g == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.B0 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(getParentActivity(), 8);
            this.B0 = t40Var;
            t40Var.setShowingDuration(5000L);
            this.B0.setAlpha(0.0f);
            this.B0.setVisibility(4);
            this.B0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.B0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.l0.addView(this.B0, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new by0(28, this, globalMainSettings), 500L);
    }

    public final void g1(int i10, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i10 == 1 && this.X0 != null;
        int i11 = this.b;
        if (z10) {
            if (i10 != 0) {
                this.Y0 = this.X0;
                this.n1 = this.m1;
                this.R0.l();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i11 == 2 ? 1 : 0);
                    }
                    this.S0.h1(indexOf, (this.Q0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i11 == 2) {
                this.b1 = this.a1;
                int i12 = this.c1;
                this.f1 = i12;
                int i13 = this.d1;
                this.g1 = i13;
                int i14 = this.e1;
                this.h1 = i14;
                this.j1 = this.P;
                this.W.f(0, 4, i14 != 0 ? 4 : i13 != 0 ? 3 : i12 != 0 ? 2 : 1, false);
                this.W.e(this.e1, 3);
                this.W.e(this.d1, 2);
                this.W.e(this.c1, 1);
                this.W.e(this.a1, 0);
            }
        }
        if (i11 == 1 || i11 == 2) {
            this.K0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.i0 i0Var = this.U0;
            if (!i0Var.M) {
                float f7 = this.m1;
                if (f7 < 0.0f) {
                    float f10 = -f7;
                    this.m1 = f10;
                    i0Var.setProgress(f10);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (!z11) {
            char c10 = i10 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i11 == 1) {
                    this.v0.setTranslationY(i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.K0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                } else if (i11 == 2) {
                    this.v0.setTranslationY(AndroidUtilities.dp((this.B1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i10 == 0 ? 343.0f : 316.0f)) + (V0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.K0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c10].getVisibility() == 0) {
                        frameLayoutArr[c10].setAlpha(0.0f);
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    }
                } else {
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                }
            } else {
                this.v0.setTranslationY(0.0f);
                frameLayoutArr[i10].setTranslationY(r9.getMeasuredHeight());
                this.K0[0].setAlpha(1.0f);
                this.K0[2].setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i11 == 1 || i11 == 2) {
                this.K0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.s1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i15 = i10 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i11 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.v0, (Property<pb1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.w91 w91Var = this.K0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(w91Var, (Property<org.telegram.ui.Components.w91, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.w91, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            } else if (i11 == 2) {
                pb1 pb1Var = this.v0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(pb1Var, (Property<pb1, Float>) property2, AndroidUtilities.dp((this.B1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (V0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.w91 w91Var2 = this.K0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(w91Var2, (Property<org.telegram.ui.Components.w91, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.w91, Float>) property3, z12 ? 0.0f : 1.0f));
                if (frameLayoutArr[i15].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            }
        } else {
            pb1 pb1Var2 = this.v0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(pb1Var2, (Property<pb1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.w91 w91Var3 = this.K0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(w91Var3, (Property<org.telegram.ui.Components.w91, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.w91, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.y0, (Property<kc1, Float>) property5, 1.0f));
        }
        this.s1.playTogether(arrayList2);
        this.s1.addListener(new bc1(this, z10, i15, i10, z12));
        this.s1.setInterpolator(org.telegram.ui.Components.ds.g);
        this.s1.setDuration(200L);
        this.s1.start();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.u1;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return this.M1 ? T0() : super.getThemeDescriptions();
    }

    public final void h1() {
        if (this.i2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (V0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
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
        int i10 = 2;
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        mc mcVar = new mc(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.i2 = mcVar;
        mcVar.setOnTouchListener(new ei.d(i10));
        this.j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new fi.bb(this, 3));
        this.k2.addListener(new yb1(this, 4));
        this.k2.setDuration(400L);
        this.k2.setInterpolator(org.telegram.ui.Components.ut.e);
        this.k2.start();
        frameLayout.addView(this.i2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new hb1(this, i10));
    }

    public final void i1(boolean z10) {
        long j10 = this.K1;
        if (j10 > 0) {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j10 >= 0) {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K1));
        int i10 = 1;
        if (chat == null) {
            this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < S0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.r1 == null) {
                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_switch_lock, 0);
                this.r1 = zqVar;
                zqVar.setTopOffset(1);
            }
            spannableStringBuilder.setSpan(this.r1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", S0(), new Object[0]));
            this.A1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
        if (tL_premium_boostsStatus2 != null) {
            this.A1.c(null, z10);
            return;
        }
        if (this.K1 >= 0 || this.U1 || this.V1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.U1 = true;
        getMessagesController().getBoostsController().getBoostsStats(this.K1, new kb1(this, i10));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.b2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void j1() {
        if (this.G1 && this.x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.y1 = bitmap;
                this.x1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.y1 = imageReceiver.getBitmap();
                    this.x1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.G1) {
            c1(false);
            return;
        }
        Bitmap bitmap2 = this.x1;
        if (bitmap2 != null) {
            this.y0.setImageBitmap(bitmap2);
        }
    }

    public final void k1() {
        File httpFilePath;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                j10 = tL_wallPaper.document.size;
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.I1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j10 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.y0.invalidate();
                if (i11 == 2) {
                    if (j10 == 0 || this.K1 != 0) {
                        this.t0.setSubtitle(null);
                    } else {
                        this.t0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.t0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.y0.invalidate();
            }
            if (this.X0 == null && (frameLayout = this.z0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.d0.setEnabled(exists);
                this.d0.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.D0.setEnabled(exists);
            lc1 lc1Var = this.A1;
            if (lc1Var != null) {
                lc1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            lc1 lc1Var2 = this.B1;
            if (lc1Var2 != null) {
                lc1Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void l1() {
        this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
        this.y0.invalidate();
        this.Q0.g1();
        if (this.m1 >= 0.0f) {
            this.y0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.y0.getImageReceiver().setBlendMode(null);
            }
            if (this.y0.getBackground() instanceof org.telegram.ui.Components.vc0) {
                this.y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.vc0) this.y0.getBackground()).k);
            }
        }
        this.a.j(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        W0();
    }

    public final void m1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.X0 == null && (this.C1 instanceof di1)) {
                this.K0[2].a(false, true);
            }
            this.K0[this.X0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.w91 w91Var = this.K0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(w91Var, (Property<org.telegram.ui.Components.w91, Float>) property, this.X0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.w91, Float>) property, this.X0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new zb1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.g);
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
        int dp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.w91, Float>) View.ALPHA, this.X0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.w91 w91Var2 = this.K0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(w91Var2, (Property<org.telegram.ui.Components.w91, Float>) property2, this.X0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.w91, Float>) property2, this.X0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.ds.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new ac1(this));
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
    public final void n1(boolean z10) {
        int i10;
        int i11;
        char c10;
        float f7;
        int i12;
        sb1 sb1Var;
        boolean z11;
        int i13;
        BlendMode blendMode;
        int i14 = Build.VERSION.SDK_INT;
        int i15 = this.b;
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (i14 >= 29) {
            if (i15 == 0) {
                i13 = w6Var != null ? (int) w6Var.l : getThemedColor(org.telegram.ui.ActionBar.y6.Pd);
            } else if (i15 == 1) {
                i13 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                long j10 = w6Var.l;
                int i16 = (int) j10;
                if (i16 != 0 || j10 == 0) {
                    if (i16 != 0) {
                        i13 = i16;
                    }
                }
                i13 = 0;
            } else {
                if (this.C1 instanceof di1) {
                    i13 = this.d1;
                }
                i13 = 0;
            }
            if (i13 == 0 || this.m1 < 0.0f) {
                this.y0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i17 = 2;
        if (this.E0 != null) {
            if (i15 != 2) {
                if (i15 == 1) {
                    int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                    long j11 = w6Var.k;
                    int i18 = (int) j11;
                    if (i18 == 0 && j11 != 0) {
                        D0 = 0;
                    } else if (i18 != 0) {
                        D0 = i18;
                    }
                }
                z11 = false;
            }
            boolean z12 = this.E0.getTag() != null;
            this.E0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.E0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.I0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<sb1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c10 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<sb1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f7 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.E0, (Property<sb1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.w91 w91Var = this.K0[0];
                    Property property = View.TRANSLATION_X;
                    i11 = 3;
                    i12 = 5;
                    i10 = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(w91Var, (Property<org.telegram.ui.Components.w91, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.w91, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.w91, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.I0.setDuration(180L);
                    this.I0.addListener(new yb1(this, i17));
                    this.I0.setInterpolator(org.telegram.ui.Components.ds.g);
                    this.I0.start();
                } else {
                    i10 = 0;
                    i11 = 3;
                    c10 = 4;
                    f7 = 1.0f;
                    i12 = 5;
                    this.E0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.E0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.E0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.K0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.K0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.K0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                sb1Var = this.F0;
                if (sb1Var == null) {
                    int i19 = sb1Var.getTag() != null ? 1 : i10;
                    this.F0.setTag(1);
                    if (i19 != 1) {
                        this.F0.setVisibility(i10);
                        AnimatorSet animatorSet3 = this.J0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            float f10 = f7;
                            this.F0.setAlpha(f10);
                            this.F0.setScaleX(f10);
                            this.F0.setScaleY(f10);
                            this.L0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                            this.L0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.J0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.F0, (Property<sb1, Float>) View.ALPHA, f7);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.F0, (Property<sb1, Float>) View.SCALE_X, f7);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.F0, (Property<sb1, Float>) View.SCALE_Y, f7);
                        org.telegram.ui.Components.w91 w91Var2 = this.L0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(w91Var2, (Property<org.telegram.ui.Components.w91, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.L0[1], (Property<org.telegram.ui.Components.w91, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[i12];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[i11] = ofFloat7;
                        animatorArr[c10] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.J0.setDuration(180L);
                        this.J0.addListener(new yb1(this, i11));
                        this.J0.setInterpolator(org.telegram.ui.Components.ds.g);
                        this.J0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i10 = 0;
        i11 = 3;
        c10 = 4;
        f7 = 1.0f;
        i12 = 5;
        sb1Var = this.F0;
        if (sb1Var == null) {
        }
    }

    public final void o1() {
        int childCount = this.Q0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.o5) {
                ((org.telegram.ui.Cells.o5) childAt).u(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!Q0(z10)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var == null || j5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.y6.h5));
        if (this.b != 2 || this.K1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        k1();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.y6.N = true;
        }
        if (i10 == 0 && this.v == null) {
            this.F1 = org.telegram.ui.ActionBar.y6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.H1 = a1.g.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.I1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersDidLoad);
            this.u1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        bh.p pVar = this.l0;
        if (pVar != null && this.R != null) {
            pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.q1 == null) {
            AndroidUtilities.runOnUIThread(new w90(9));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.x1 = null;
            }
            this.a.j(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.v != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.w1.c(false);
        }
        org.telegram.ui.ActionBar.y6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        nc1 nc1Var = this.p0;
        if (nc1Var != null) {
            nc1Var.l();
        }
        rc1 rc1Var = this.w0;
        if (rc1Var != null) {
            rc1Var.l();
        }
        if (this.F1) {
            this.w1.c(true);
        }
        org.telegram.ui.ActionBar.y6.b = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        k1();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            R0();
            try {
                a5.m mVar = this.k0;
                if (mVar != null) {
                    AndroidUtilities.setViewPagerEdgeEffectColor(mVar, getThemedColor(org.telegram.ui.ActionBar.y6.s8));
                }
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
                    this.U0.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.b != 2) {
            return;
        }
        this.a.j(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setResourceProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.a.a = u6Var;
    }

    public vc1(org.telegram.ui.ActionBar.x6 x6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.a = new ub1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(this, 0, false);
        this.S = g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(this, 0, true);
        this.T = g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3 = new org.telegram.ui.ActionBar.g6(this, 1, false);
        this.U = g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4 = new org.telegram.ui.ActionBar.g6(this, 1, true);
        this.V = g6Var4;
        this.Y = -1;
        this.Z = new hb1(this, 0);
        this.x0 = new kc1[2];
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
        this.T1 = new org.telegram.ui.Components.u20(getParentActivity(), new wb1(this));
        this.U1 = false;
        this.V1 = false;
        this.b = i10;
        this.g0 = z12;
        this.f0 = x6Var;
        this.i0 = z10;
        this.h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.w6 k10 = x6Var.k(!z11);
            this.v = k10;
            if (k10 != null) {
                this.d = false;
                this.x = k10.c;
                this.y = k10.d;
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
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.w6 k11 = x6Var.k(false);
            this.v = k11;
            if (k11 != null) {
                this.X0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (w6Var != null) {
            this.F1 = w6Var.q;
            if (!TextUtils.isEmpty(w6Var.o)) {
                this.m1 = this.v.p;
            }
            org.telegram.ui.ActionBar.y6.M = org.telegram.ui.ActionBar.y6.C0();
            org.telegram.ui.ActionBar.y6.O = true;
            org.telegram.ui.ActionBar.y6.P = true;
            org.telegram.ui.ActionBar.y6.t(x6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        g6Var.v = true;
        g6Var3.v = true;
        g6Var2.v = true;
        g6Var4.v = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public vc1(org.telegram.ui.ActionBar.x6 x6Var) {
        this(x6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
