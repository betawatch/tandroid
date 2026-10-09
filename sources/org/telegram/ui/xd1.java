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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class xd1 extends org.telegram.ui.ActionBar.n2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.z40 A0;
    public nd1 A1;
    public AnimatorSet B0;
    public Object B1;
    public u4 C0;
    public Bitmap C1;
    public vc1 D0;
    public boolean D1;
    public final int E;
    public vc1 E0;
    public boolean E1;
    public final int F;
    public ImageView F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public String G1;
    public final boolean H;
    public AnimatorSet H0;
    public int H1;
    public final long I;
    public AnimatorSet I0;
    public wd1 I1;
    public final long J;
    public org.telegram.ui.Components.p91[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.p91[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.ck0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.v0 O1;
    public long P;
    public fc1 P0;
    public ValueAnimator P1;
    public fa0 Q;
    public vd1 Q0;
    public t5 Q1;
    public final org.telegram.ui.ActionBar.q5 R;
    public s4.d0 R0;
    public uc1 R1;
    public final org.telegram.ui.ActionBar.q5 S;
    public org.telegram.ui.Cells.m4 S0;
    public final org.telegram.ui.Components.a30 S1;
    public final org.telegram.ui.ActionBar.q5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.q5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.cr V;
    public final HashMap V0;
    public TL_stories.TL_premium_boostsStatus V1;
    public int W;
    public TLRPC.TL_wallPaper W0;
    public float W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public final Runnable Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public boolean Z;
    public int Z0;
    public float Z1;
    public final xc1 a;
    public ci.r6 a0;
    public int a1;
    public boolean a2;
    public final int b;
    public FrameLayout b0;
    public int b1;
    public int b2;
    public Scroller c;
    public TextView c0;
    public int c1;
    public ValueAnimator c2;
    public final boolean d;
    public TextView d0;
    public int d1;
    public boolean d2;
    public org.telegram.ui.Components.pm e;
    public final org.telegram.ui.ActionBar.h6 e0;
    public int e1;
    public TextView e2;
    public org.telegram.ui.ActionBar.v0 f;
    public final boolean f0;
    public int f1;
    public WeakReference f2;
    public final boolean g0;
    public int g1;
    public BitmapDrawable g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public lc h2;
    public ArrayList i0;
    public int i1;
    public float i2;
    public z4.g j0;
    public int j1;
    public ValueAnimator j2;
    public ci.m6 k0;
    public int k1;
    public UndoView l0;
    public float l1;
    public FrameLayout m0;
    public float m1;
    public int n;
    public org.telegram.ui.Components.qm0 n0;
    public float n1;
    public pd1 o0;
    public float o1;
    public org.telegram.ui.Components.p20 p0;
    public od1 p1;
    public MessageObject q0;
    public org.telegram.ui.Components.er q1;
    public Drawable r;
    public boolean r0;
    public AnimatorSet r1;
    public final org.telegram.ui.ActionBar.g6 s;
    public org.telegram.ui.ActionBar.k s0;
    public final PorterDuff.Mode s1;
    public org.telegram.ui.ActionBar.q0 t0;
    public int t1;
    public sc1 u0;
    public org.telegram.ui.Components.s9 u1;
    public boolean v;
    public td1 v0;
    public org.telegram.ui.Components.r91 v1;
    public final int w;
    public final md1[] w0;
    public Bitmap w1;
    public final int x;
    public md1 x0;
    public Bitmap x1;
    public final int y;
    public FrameLayout y0;
    public float y1;
    public FrameLayout z0;
    public nd1 z1;

    public xd1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new xc1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.R = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.S = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.T = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.U = q5Var4;
        this.X = -1;
        this.Y = new kc1(this, 0);
        this.w0 = new md1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.n1 = 0.0f;
        this.s1 = PorterDuff.Mode.SRC_IN;
        this.y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.a30(getParentActivity(), new zc1(this));
        this.T1 = false;
        this.U1 = false;
        this.b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof ij1) {
            ij1 ij1Var = (ij1) obj;
            this.E1 = ij1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = ij1Var.g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = ij1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.i6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    public static void U(xd1 xd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (xd1Var.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(23, xd1Var.currentAccount, xd1Var.getParentActivity(), xd1Var, xd1Var.a);
        j0Var.H1(canApplyBoost);
        j0Var.G1(xd1Var.V1, true);
        j0Var.I1(xd1Var.J1);
        if (!xd1Var.U0()) {
            j0Var.Q0 = new kc1(xd1Var, 1);
        }
        xd1Var.showDialog(j0Var);
    }

    public static void V(xd1 xd1Var) {
        org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.M;
        if (h6Var == null) {
            return;
        }
        int i10 = h6Var.Z;
        org.telegram.ui.ActionBar.g6 k10 = i10 >= 0 ? (org.telegram.ui.ActionBar.g6) h6Var.a0.get(i10) : h6Var.k(false);
        if (xd1Var.s != null) {
            xd1Var.W0();
            org.telegram.ui.ActionBar.i6.u1(xd1Var.e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.i6.M != null) {
                org.telegram.ui.ActionBar.i6.O = false;
                org.telegram.ui.ActionBar.i6.P = false;
                org.telegram.ui.ActionBar.i6.M = null;
            }
            org.telegram.ui.ActionBar.i6.t(xd1Var.e0, true, xd1Var.f0);
            ((ActionBarLayout) xd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) xd1Var.parentLayout).U(false, false);
            File file = new File(xd1Var.e0.b);
            org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var.e0;
            org.telegram.ui.ActionBar.i6.u(file, h6Var2.a, h6Var2.F, false);
            MessagesController.getInstance(xd1Var.e0.E).saveTheme(xd1Var.e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", xd1Var.e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) xd1Var.getParentLayout().getFragmentStack().get(Math.max(0, xd1Var.getParentLayout().getFragmentStack().size() - 2));
        xd1Var.finishFragment();
        if (xd1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, h6Var, k10, Boolean.valueOf(xd1Var.h0));
        }
        org.telegram.ui.ActionBar.i6.G1(n2Var);
    }

    public static /* synthetic */ void W(xd1 xd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = xd1Var.V0;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            xd1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            xd1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (g6Var != null && (str = g6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            xd1Var.W0 = tL_wallPaper2;
                            xd1Var.b1(false);
                            xd1Var.j1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = xd1Var.W0;
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
            if (!z10 && (tL_wallPaper = xd1Var.W0) != null) {
                xd1Var.U0.add(0, tL_wallPaper);
            }
            vd1 vd1Var = xd1Var.Q0;
            if (vd1Var != null) {
                vd1Var.l();
            }
            MessagesStorage.getInstance(xd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (xd1Var.W0 != null || g6Var == null || TextUtils.isEmpty(g6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = g6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(xd1Var.currentAccount).bindRequestToGuid(xd1Var.getConnectionsManager().sendRequest(getwallpaper, new qc1(xd1Var, 0)), xd1Var.classGuid);
    }

    public static /* synthetic */ void X(xd1 xd1Var) {
        org.telegram.ui.Components.pm pmVar = xd1Var.e;
        int i10 = 0;
        if (pmVar != null) {
            pmVar.B(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
            xd1Var.e.G(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
        }
        Drawable drawable = xd1Var.r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = xd1Var.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (xd1Var.p1 != null) {
            org.telegram.ui.ActionBar.d5 d5Var = xd1Var.parentLayout;
            if (d5Var == null || d5Var.getBottomSheet() == null) {
                xd1Var.setNavigationBarColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
            } else {
                xd1Var.parentLayout.getBottomSheet().fixNavigationBar(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
                if (xd1Var.b == 2 && xd1Var.J1 != 0) {
                    xd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (xd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.p91[] p91VarArr = xd1Var.J0;
                if (i11 >= p91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.p91 p91Var = p91VarArr[i11];
                if (p91Var != null) {
                    p91Var.invalidate();
                }
                i11++;
            }
        }
        if (xd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.p91[] p91VarArr2 = xd1Var.K0;
                if (i10 >= p91VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.p91 p91Var2 = p91VarArr2[i10];
                if (p91Var2 != null) {
                    p91Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = xd1Var.e2;
        if (textView != null) {
            textView.setTextColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        }
        org.telegram.ui.Components.cr crVar = xd1Var.V;
        if (crVar != null) {
            crVar.invalidate();
        }
        org.telegram.ui.Components.p20 p20Var = xd1Var.p0;
        if (p20Var != null) {
            p20Var.g();
        }
    }

    public final void M0() {
        AnimatorSet animatorSet = this.B0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.B0 = animatorSet2;
        int i10 = 1;
        if (this.E1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) View.SCALE_X, this.y1), ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) View.SCALE_Y, this.y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.hs.g);
        this.B0.addListener(new bd1(this, i10));
        this.B0.start();
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
        long j3;
        boolean z16;
        boolean z17;
        boolean z18;
        float f7;
        TLRPC.UserFull userFull;
        Object obj3;
        int i16 = 2;
        if (this.J1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.J1, this.V1, new nc1(this, i16));
                return;
            } else if (this.V1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
        String j10 = h6Var.j(null, this.F1);
        int i17 = 0;
        String j11 = this.F1 ? h6Var.j(null, false) : j10;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), j10);
        Object obj4 = this.B1;
        if (obj4 instanceof TLRPC.TL_wallPaper) {
            if (this.x1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    i10 = 4;
                    try {
                        this.x1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e);
                        z11 = false;
                        if (!z11) {
                        }
                        obj3 = null;
                        z12 = false;
                        r12 = obj3;
                        if (this.F1) {
                        }
                        obj = this.B1;
                        int i18 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.a = j11;
                        b6Var.b = j10;
                        b6Var.c = str;
                        b6Var.i = this.F1;
                        b6Var.j = this.E1;
                        b6Var.d = i17;
                        b6Var.e = i13;
                        b6Var.f = i12;
                        b6Var.g = i14;
                        b6Var.h = i11;
                        if (this.M1) {
                        }
                        b6Var.k = this.l1;
                        obj2 = this.B1;
                        if (obj2 instanceof ij1) {
                        }
                        j3 = this.J1;
                        b6Var.n = j3;
                        if (j3 != 0) {
                        }
                        b6Var.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var, str == null && this.J1 == 0, 0L);
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
                ImageReceiver imageReceiver = this.x0.getImageReceiver();
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
                        z11 = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.B1).document, true), file3);
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
            boolean z19 = obj4 instanceof ij1;
            if (!z19) {
                if (obj4 instanceof jj1) {
                    jj1 jj1Var = (jj1) obj4;
                    if (jj1Var.b != 0 || "t".equals(jj1Var.a)) {
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
                            if (!this.a2 || this.X1 == this.Y1) {
                                z19 = false;
                                z19 = false;
                                File file4 = jj1Var.e;
                                file = file4 != null ? file4 : jj1Var.d;
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap((int) this.Z1, this.C1.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.translate(-((this.X1 / this.W1) * (this.C1.getWidth() - createBitmap.getWidth())), 0.0f);
                                z19 = false;
                                canvas.drawBitmap(this.C1, 0.0f, 0.0f, (Paint) null);
                                jj1Var.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                FileOutputStream fileOutputStream3 = new FileOutputStream(jj1Var.d);
                                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                                fileOutputStream3.close();
                                createBitmap.recycle();
                                file = jj1Var.d;
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
                                    if (this.F1) {
                                    }
                                    obj = this.B1;
                                    int i182 = 45;
                                    if (obj instanceof TLRPC.TL_wallPaper) {
                                    }
                                    org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6();
                                    b6Var2.a = j11;
                                    b6Var2.b = j10;
                                    b6Var2.c = str;
                                    b6Var2.i = this.F1;
                                    b6Var2.j = this.E1;
                                    b6Var2.d = i17;
                                    b6Var2.e = i13;
                                    b6Var2.f = i12;
                                    b6Var2.g = i14;
                                    b6Var2.h = i11;
                                    if (this.M1) {
                                    }
                                    b6Var2.k = this.l1;
                                    obj2 = this.B1;
                                    if (obj2 instanceof ij1) {
                                    }
                                    j3 = this.J1;
                                    b6Var2.n = j3;
                                    if (j3 != 0) {
                                    }
                                    b6Var2.o = z10;
                                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var2, str == null && this.J1 == 0, 0L);
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
                            if (this.F1) {
                            }
                            obj = this.B1;
                            int i1822 = 45;
                            if (obj instanceof TLRPC.TL_wallPaper) {
                            }
                            org.telegram.ui.ActionBar.b6 b6Var22 = new org.telegram.ui.ActionBar.b6();
                            b6Var22.a = j11;
                            b6Var22.b = j10;
                            b6Var22.c = str;
                            b6Var22.i = this.F1;
                            b6Var22.j = this.E1;
                            b6Var22.d = i17;
                            b6Var22.e = i13;
                            b6Var22.f = i12;
                            b6Var22.g = i14;
                            b6Var22.h = i11;
                            if (this.M1) {
                            }
                            b6Var22.k = this.l1;
                            obj2 = this.B1;
                            if (obj2 instanceof ij1) {
                            }
                            j3 = this.J1;
                            b6Var22.n = j3;
                            if (j3 != 0) {
                            }
                            b6Var22.o = z10;
                            MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var22, str == null && this.J1 == 0, 0L);
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
                            z11 = AndroidUtilities.copyFile(photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.H1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg"), file3);
                        } catch (Exception e16) {
                            FileLog.e(e16);
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                }
                if (this.F1) {
                }
                obj = this.B1;
                int i18222 = 45;
                if (obj instanceof TLRPC.TL_wallPaper) {
                }
                org.telegram.ui.ActionBar.b6 b6Var222 = new org.telegram.ui.ActionBar.b6();
                b6Var222.a = j11;
                b6Var222.b = j10;
                b6Var222.c = str;
                b6Var222.i = this.F1;
                b6Var222.j = this.E1;
                b6Var222.d = i17;
                b6Var222.e = i13;
                b6Var222.f = i12;
                b6Var222.g = i14;
                b6Var222.h = i11;
                if (this.M1) {
                }
                b6Var222.k = this.l1;
                obj2 = this.B1;
                if (obj2 instanceof ij1) {
                }
                j3 = this.J1;
                b6Var222.n = j3;
                if (j3 != 0) {
                }
                b6Var222.o = z10;
                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var222, str == null && this.J1 == 0, 0L);
                if (z15) {
                }
                z17 = z16;
                if (z17) {
                }
            } else if (this.W0 != null) {
                try {
                    Bitmap bitmap2 = this.x0.getImageReceiver().getBitmap();
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    if (this.c1 == 0) {
                        if (this.b1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.x9.d(this.h1), new int[]{this.Z0, this.b1});
                            gradientDrawable.setBounds(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                            gradientDrawable.draw(canvas2);
                        } else {
                            canvas2.drawColor(this.Z0);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
                    paint.setAlpha((int) (Math.abs(this.l1) * 255.0f));
                    canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream4 = new FileOutputStream(file3);
                    if (this.c1 != 0) {
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
                if (this.F1) {
                    try {
                        FileOutputStream fileOutputStream5 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), j11));
                        this.w1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                        fileOutputStream5.close();
                        z11 = true;
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                        z11 = false;
                    }
                }
                obj = this.B1;
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
                } else if (obj instanceof ij1) {
                    if ("d".equals(((ij1) obj).a)) {
                        i15 = 0;
                        i12 = 0;
                        i13 = 0;
                        str = "d";
                    } else {
                        TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                        String str2 = tL_wallPaper2 != null ? tL_wallPaper2.slug : "c";
                        int i19 = this.Z0;
                        i13 = this.b1;
                        i12 = this.c1;
                        i15 = this.d1;
                        i182222 = this.h1;
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
                    if (obj instanceof jj1) {
                        jj1 jj1Var2 = (jj1) obj;
                        str = jj1Var2.a;
                        pathToAttach = jj1Var2.d;
                    } else if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj;
                        TLRPC.Photo photo2 = searchImage2.photo;
                        pathToAttach = photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.H1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg");
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
                org.telegram.ui.ActionBar.b6 b6Var2222 = new org.telegram.ui.ActionBar.b6();
                b6Var2222.a = j11;
                b6Var2222.b = j10;
                b6Var2222.c = str;
                b6Var2222.i = this.F1;
                b6Var2222.j = this.E1;
                b6Var2222.d = i17;
                b6Var2222.e = i13;
                b6Var2222.f = i12;
                b6Var2222.g = i14;
                b6Var2222.h = i11;
                if (this.M1) {
                    float f10 = this.n1;
                    if (f10 >= 0.0f) {
                        b6Var2222.k = f10;
                        obj2 = this.B1;
                        if (obj2 instanceof ij1) {
                            ij1 ij1Var = (ij1) obj2;
                            String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                            float f11 = ij1Var.h;
                            if (f11 < 0.0f && !org.telegram.ui.ActionBar.i6.I.q()) {
                                f11 *= -1.0f;
                            }
                            if (ij1Var.l != null && ij1Var.b == i17 && ij1Var.c == i13 && ij1Var.d == i12 && ij1Var.e == i14 && TextUtils.equals(ij1Var.a, str3) && ij1Var.f == i11 && (this.W0 == null || Math.abs(f11 - this.l1) < 0.001f)) {
                                TLRPC.WallPaper wallPaper = ij1Var.l;
                                b6Var2222.l = wallPaper.id;
                                b6Var2222.m = wallPaper.access_hash;
                            }
                        }
                        j3 = this.J1;
                        b6Var2222.n = j3;
                        if (j3 != 0 && (userFull = getMessagesController().getUserFull(this.J1)) != null) {
                            b6Var2222.t = userFull.wallpaper;
                        }
                        b6Var2222.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var2222, str == null && this.J1 == 0, 0L);
                        if (z15) {
                            z16 = true;
                        } else {
                            if (this.J1 != 0) {
                                if (file2 == null || getMessagesController().uploadingWallpaperInfo != b6Var2222) {
                                    z18 = false;
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.J1, null, b6Var2222, this.q0, new ai.f(18));
                                } else {
                                    tL_wallPaper = new TLRPC.TL_wallPaper();
                                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                    tL_wallPaper.settings = tL_wallPaperSettings;
                                    tL_wallPaperSettings.intensity = (int) (b6Var2222.k * 100.0f);
                                    tL_wallPaperSettings.blur = b6Var2222.i;
                                    tL_wallPaperSettings.motion = b6Var2222.j;
                                    tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                    Bitmap createBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                    Canvas canvas3 = new Canvas(createBitmap3);
                                    float max = Math.max(50.0f / this.x0.getMeasuredWidth(), 50.0f / this.x0.getMeasuredHeight());
                                    canvas3.scale(max, max);
                                    if (this.x0.getMeasuredHeight() > this.x0.getMeasuredWidth()) {
                                        f7 = 0.0f;
                                        canvas3.translate(0.0f, (-(this.x0.getMeasuredHeight() - this.x0.getMeasuredWidth())) / 2.0f);
                                    } else {
                                        f7 = 0.0f;
                                        canvas3.translate((-(this.x0.getMeasuredWidth() - this.x0.getMeasuredHeight())) / 2.0f, 0.0f);
                                    }
                                    float f12 = this.n1;
                                    this.n1 = f7;
                                    this.x0.draw(canvas3);
                                    this.n1 = f12;
                                    Utilities.blurBitmap(createBitmap3, 3);
                                    tL_wallPaper.stripedThumb = createBitmap3;
                                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                    tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                                    tL_messageService.dialog_id = this.J1;
                                    tL_messageService.unread = true;
                                    tL_messageService.out = true;
                                    int newMessageId = getUserConfig().getNewMessageId();
                                    tL_messageService.id = newMessageId;
                                    tL_messageService.local_id = newMessageId;
                                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
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
                                        tL_peerUser2.user_id = this.J1;
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
                                    MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.J1, arrayList, 0);
                                    if (this.J1 >= 0) {
                                        TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.J1);
                                        if (userFull2 != null) {
                                            userFull2.wallpaper = tL_wallPaper;
                                            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.J1), userFull2);
                                        }
                                    } else {
                                        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.J1);
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
                                this.d2 = true;
                                wd1 wd1Var = this.I1;
                                if (wd1Var != null) {
                                    wd1Var.a(tL_wallPaper);
                                }
                                finishFragment();
                                z17 = z18;
                                if (z17) {
                                    wd1 wd1Var2 = this.I1;
                                    if (wd1Var2 != null) {
                                        wd1Var2.a(tL_wallPaper);
                                    }
                                    finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.ActionBar.i6.c0 = getThemedColor(org.telegram.ui.ActionBar.i6.lc);
                            org.telegram.ui.ActionBar.i6.I.v("t".equals(b6Var2222.c) ? null : b6Var2222);
                            z16 = true;
                            org.telegram.ui.ActionBar.i6.p1(true);
                            if (!z14) {
                                ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                            }
                        }
                        z17 = z16;
                        if (z17) {
                        }
                    }
                }
                b6Var2222.k = this.l1;
                obj2 = this.B1;
                if (obj2 instanceof ij1) {
                }
                j3 = this.J1;
                b6Var2222.n = j3;
                if (j3 != 0) {
                    b6Var2222.t = userFull.wallpaper;
                }
                b6Var2222.o = z10;
                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var2222, str == null && this.J1 == 0, 0L);
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
            if (this.F1) {
            }
            obj = this.B1;
            int i1822222 = 45;
            if (obj instanceof TLRPC.TL_wallPaper) {
            }
            org.telegram.ui.ActionBar.b6 b6Var22222 = new org.telegram.ui.ActionBar.b6();
            b6Var22222.a = j11;
            b6Var22222.b = j10;
            b6Var22222.c = str;
            b6Var22222.i = this.F1;
            b6Var22222.j = this.E1;
            b6Var22222.d = i17;
            b6Var22222.e = i13;
            b6Var22222.f = i12;
            b6Var22222.g = i14;
            b6Var22222.h = i11;
            if (this.M1) {
            }
            b6Var22222.k = this.l1;
            obj2 = this.B1;
            if (obj2 instanceof ij1) {
            }
            j3 = this.J1;
            b6Var22222.n = j3;
            if (j3 != 0) {
            }
            b6Var22222.o = z10;
            MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var22222, str == null && this.J1 == 0, 0L);
            if (z15) {
            }
            z17 = z16;
            if (z17) {
            }
        }
        z12 = false;
        r12 = obj3;
        if (this.F1) {
        }
        obj = this.B1;
        int i18222222 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
        }
        org.telegram.ui.ActionBar.b6 b6Var222222 = new org.telegram.ui.ActionBar.b6();
        b6Var222222.a = j11;
        b6Var222222.b = j10;
        b6Var222222.c = str;
        b6Var222222.i = this.F1;
        b6Var222222.j = this.E1;
        b6Var222222.d = i17;
        b6Var222222.e = i13;
        b6Var222222.f = i12;
        b6Var222222.g = i14;
        b6Var222222.h = i11;
        if (this.M1) {
        }
        b6Var222222.k = this.l1;
        obj2 = this.B1;
        if (obj2 instanceof ij1) {
        }
        j3 = this.J1;
        b6Var222222.n = j3;
        if (j3 != 0) {
        }
        b6Var222222.o = z10;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var222222, str == null && this.J1 == 0, 0L);
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
        org.telegram.ui.ActionBar.i6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        if (i10 == 1) {
            if (this.g0) {
                g6Var.c = this.w;
                g6Var.d = this.x;
                g6Var.e = this.y;
                g6Var.f = this.E;
                g6Var.g = this.F;
                g6Var.h = this.G;
                g6Var.i = this.H;
                g6Var.j = this.I;
                g6Var.k = this.J;
                g6Var.l = this.K;
                g6Var.m = this.L;
                g6Var.n = this.O;
                g6Var.o = this.N;
                g6Var.p = this.M;
            }
            org.telegram.ui.ActionBar.i6.u1(this.e0, false, true, false, false, false);
        } else {
            if (g6Var != null) {
                org.telegram.ui.ActionBar.i6.u1(this.e0, false, this.h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.h0) {
                org.telegram.ui.ActionBar.h6 h6Var = this.e0;
                if (h6Var.b != null && org.telegram.ui.ActionBar.i6.H.get(h6Var.m()) == null) {
                    new File(h6Var.b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.g2;
        }
        WeakReference weakReference2 = this.f2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.g2 = null;
            return null;
        }
        this.f2 = new WeakReference(drawable);
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
        this.g2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r6.E1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r6.l1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.g6 g6Var = this.s;
            if (g6Var.c == this.w && g6Var.d == this.x && g6Var.e == this.y && g6Var.f == this.E && g6Var.g == this.F && g6Var.h == this.G && g6Var.i == this.H && g6Var.j == this.I && g6Var.k == this.J && g6Var.l == this.K && g6Var.m == this.L && Math.abs(g6Var.p - this.M) <= 0.001f && g6Var.n == this.O) {
                String str = g6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.W0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new mc1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new mc1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        wy0 wy0Var = new wy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayout, 1, null, null, null, wy0Var, i10));
        z4.g gVar = this.j0;
        int i11 = org.telegram.ui.ActionBar.i6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.i6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.i6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s0, TLObject.FLAG_31, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s0, TLObject.FLAG_30, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.b0, 1, null, null, null, null, i10));
            TextView textView = this.d0;
            int i14 = org.telegram.ui.ActionBar.i6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.cr crVar = this.V;
        if (crVar != null) {
            org.telegram.ui.ActionBar.v0 v0Var = crVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = crVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.i6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.i6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.i6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.l6));
            }
            org.telegram.ui.ActionBar.k0 k0Var = crVar.F;
            int i17 = org.telegram.ui.ActionBar.i6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(k0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.k0 k0Var2 = crVar.F;
            int i18 = org.telegram.ui.ActionBar.i6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.k6(k0Var2, 32, null, null, null, null, i18));
            if (v0Var != null) {
                org.telegram.ui.Components.a7 a7Var = new org.telegram.ui.Components.a7(crVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 0, null, null, null, a7Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 0, null, null, null, a7Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.i3}, null, org.telegram.ui.ActionBar.i6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.i6.j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.i3}, null, org.telegram.ui.ActionBar.i6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.i6.j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.i3}, null, org.telegram.ui.ActionBar.i6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.C0, 0, null, org.telegram.ui.ActionBar.i6.j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.N0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.M0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.T0, 0, new Class[]{org.telegram.ui.Components.kp0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.T0, 0, new Class[]{org.telegram.ui.Components.kp0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.S0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.m3, org.telegram.ui.ActionBar.i6.q3}, null, org.telegram.ui.ActionBar.i6.ra));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.n3, org.telegram.ui.ActionBar.i6.r3}, null, org.telegram.ui.ActionBar.i6.dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.i6.m3.A;
            int i23 = org.telegram.ui.ActionBar.i6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.q3.A, null, i23));
            org.telegram.ui.ActionBar.q5 q5Var = this.R;
            org.telegram.ui.ActionBar.q5 q5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.p3, org.telegram.ui.ActionBar.i6.t3}, null, org.telegram.ui.ActionBar.i6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.o3.A;
            int i24 = org.telegram.ui.ActionBar.i6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.s3.A, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.z3}, null, org.telegram.ui.ActionBar.i6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.sc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.ab));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.db));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.ad));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.fb));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.nd));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.od));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.k6) arrayList.get(i25)).o = this.a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int C0;
        long j3;
        if (this.g0) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        if (i10 == 1 || i10 == 2) {
            long j10 = this.I;
            if (j10 == 0) {
                int C02 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Nd);
                int i11 = (int) g6Var.j;
                if (i11 == 0) {
                    i11 = C02;
                }
                if (i11 != C02) {
                    return true;
                }
            } else if (j10 != g6Var.j) {
                return true;
            }
            long j11 = this.J;
            long j12 = this.L;
            long j13 = this.K;
            if (j11 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Od);
                        j3 = g6Var.k;
                    } else if (i12 == 1) {
                        C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                        j3 = g6Var.l;
                    } else {
                        C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Qd);
                        j3 = g6Var.m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = C0;
                    }
                    if (i13 != C0) {
                        return true;
                    }
                }
            } else if (j11 != g6Var.k || j13 != g6Var.l || j12 != g6Var.m) {
                return true;
            }
            if (g6Var.n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.w != g6Var.d) {
                return true;
            }
            int i14 = this.y;
            if (i14 == 0) {
                int i15 = g6Var.e;
                if (i15 != 0 && i15 != g6Var.c) {
                    return true;
                }
            } else if (i14 != g6Var.e) {
                return true;
            }
            int i16 = this.E;
            if (i16 != 0) {
                if (i16 != g6Var.f) {
                    return true;
                }
            } else if (g6Var.f != 0) {
                return true;
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != g6Var.g) {
                    return true;
                }
            } else if (g6Var.g != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != g6Var.h) {
                    return true;
                }
            } else if (g6Var.h != 0) {
                return true;
            }
            if (this.H != g6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        return (d5Var == null || d5Var.getBottomSheet() == null) ? false : true;
    }

    public final void V0() {
        t5 t5Var = this.Q1;
        if (t5Var != null) {
            t5Var.invalidate();
        }
        FrameLayout frameLayout = this.y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.y0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.z0.getChildAt(i11).invalidate();
            }
        }
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.p91[] p91VarArr = this.J0;
                if (i12 >= p91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.p91 p91Var = p91VarArr[i12];
                if (p91Var != null) {
                    p91Var.setDimAmount(this.M1 ? this.n1 * this.o1 : 0.0f);
                    this.J0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.n0 != null) {
            for (int i13 = 0; i13 < this.n0.getChildCount(); i13++) {
                View childAt = this.n0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.u0 != null) {
            for (int i14 = 0; i14 < this.u0.getChildCount(); i14++) {
                View childAt2 = this.u0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        nd1 nd1Var = this.z1;
        if (nd1Var != null) {
            nd1Var.invalidate();
        }
        nd1 nd1Var2 = this.A1;
        if (nd1Var2 != null) {
            nd1Var2.invalidate();
        }
        u4 u4Var = this.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        if (g6Var == null || TextUtils.isEmpty(g6Var.o)) {
            return;
        }
        try {
            File d = g6Var.d();
            Drawable background = this.x0.getBackground();
            Bitmap bitmap = this.x0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.cd0) {
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
            paint.setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
            paint.setAlpha((int) (this.l1 * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(d);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.n == i10 || this.r1 != null || (g6Var = this.s) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.i6.a1() || g6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.i6.a1() || (org.telegram.ui.ActionBar.i6.a1() && org.telegram.ui.ActionBar.i6.I.i0.d != 0)) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mc1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new mc1(this, 6));
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new mc1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i13 = this.n;
        this.n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = g6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.cr crVar = this.V;
            T0(1);
            crVar.f(1, 2, i14, false);
            this.V.e(g6Var.c, 0);
            int i15 = g6Var.d;
            if (i15 != 0) {
                this.V.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && g6Var.g != 0)) {
                this.v0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Nd);
            int i16 = org.telegram.ui.ActionBar.i6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.i6.d1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.i6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.i6.d1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.i6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.i6.d1(i18) ? getThemedColor(i18) : 0;
            long j3 = g6Var.k;
            int i19 = (int) j3;
            if (i19 == 0 && j3 != 0) {
                themedColor2 = 0;
            }
            long j10 = g6Var.l;
            int i20 = (int) j10;
            if (i20 == 0 && j10 != 0) {
                themedColor3 = 0;
            }
            long j11 = g6Var.m;
            int i21 = (int) j11;
            if (i21 == 0 && j11 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) g6Var.j;
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
            org.telegram.ui.Components.cr crVar2 = this.V;
            T0(2);
            crVar2.f(2, 4, i12, false);
            org.telegram.ui.Components.cr crVar3 = this.V;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            crVar3.e(i21, 3);
            org.telegram.ui.Components.cr crVar4 = this.V;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            crVar4.e(themedColor3, 2);
            org.telegram.ui.Components.cr crVar5 = this.V;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            crVar5.e(i19, 1);
            org.telegram.ui.Components.cr crVar6 = this.V;
            if (i22 != 0) {
                themedColor = i22;
            }
            crVar6.e(themedColor, 0);
            if (i13 == 1 || g6Var.g == 0) {
                this.v0.o(0);
            } else {
                this.v0.m(0);
            }
            this.u0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i23 = g6Var.f != 0 ? g6Var.h != 0 ? 4 : g6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.cr crVar7 = this.V;
            T0(3);
            crVar7.f(2, 4, i23, true);
            this.V.e(g6Var.h, 3);
            this.V.e(g6Var.g, 2);
            this.V.e(g6Var.f, 1);
            org.telegram.ui.Components.cr crVar8 = this.V;
            int i24 = g6Var.e;
            if (i24 == 0) {
                i24 = g6Var.c;
            }
            crVar8.e(i24, 0);
            this.K0[1].b(0, g6Var.e);
            this.K0[1].b(1, g6Var.f);
            this.K0[1].b(2, g6Var.g);
            this.K0[1].b(3, g6Var.h);
            if (g6Var.g != 0) {
                if (i13 == 1) {
                    this.v0.o(0);
                } else {
                    this.v0.m(0);
                }
            } else if (i13 == 2) {
                this.v0.u(0);
            }
            this.u0.v0(0, AndroidUtilities.dp(60.0f), null);
            e1();
        }
        if (i10 != 1 && i10 != 3) {
            this.V.setMinBrightness(0.0f);
            this.V.setMaxBrightness(1.0f);
            return;
        }
        if (i13 == 2 && this.L0[1].getVisibility() == 0) {
            f1(0, true, true);
        }
        if (i10 != 1) {
            this.V.setMinBrightness(0.0f);
            this.V.setMaxBrightness(1.0f);
        } else if (this.e0.q()) {
            this.V.setMinBrightness(0.2f);
        } else {
            this.V.setMinBrightness(0.05f);
            this.V.setMaxBrightness(0.8f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.U0.size()) ? this.Y0 : (TLRPC.TL_wallPaper) this.U0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.c2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c2.cancel();
        }
        md1[] md1VarArr = this.w0;
        md1 md1Var = md1VarArr[0];
        md1 md1Var2 = md1VarArr[1];
        md1VarArr[0] = md1Var2;
        md1VarArr[1] = md1Var;
        this.t0.removeView(md1Var2);
        this.t0.addView(md1VarArr[0], this.t0.indexOfChild(md1VarArr[1]) + 1);
        md1 md1Var3 = md1VarArr[0];
        this.x0 = md1Var3;
        md1Var3.setBackground(md1VarArr[1].getBackground());
        k1();
        md1VarArr[1].setVisibility(0);
        md1VarArr[1].setAlpha(1.0f);
        this.x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c2 = ofFloat;
        ofFloat.addUpdateListener(new dj(2, this));
        this.c2.addListener(new bd1(this, 0));
        this.c2.setInterpolator(org.telegram.ui.Components.hs.f);
        this.c2.setDuration(300L);
        this.c2.start();
        this.x0.getImageReceiver().setCrossfadeDuration(300);
        this.x0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.x0.d();
        this.W0 = tL_wallPaper;
        this.E1 = this.J0[2].s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.cd0 cd0Var;
        if (i11 == 0) {
            this.Z0 = i10;
        } else if (i11 == 1) {
            this.b1 = i10;
        } else if (i11 == 2) {
            this.c1 = i10;
        } else if (i11 == 3) {
            this.d1 = i10;
        }
        m1(z10);
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.p91[] p91VarArr = this.J0;
                if (i12 >= p91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.p91 p91Var = p91VarArr[i12];
                if (p91Var != null) {
                    p91Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.i6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.x0.getBackground();
            if (background instanceof org.telegram.ui.Components.cd0) {
                cd0Var = (org.telegram.ui.Components.cd0) background;
            } else {
                cd0Var = new org.telegram.ui.Components.cd0();
                cd0Var.r(this.x0);
                if (this.D1) {
                    cd0Var.m(false);
                }
            }
            cd0Var.n(this.Z0, this.b1, this.c1, this.d1);
            this.x0.setBackground(cd0Var);
            this.j1 = cd0Var.f();
            this.k1 = 754974720;
        } else if (this.b1 != 0) {
            this.x0.setBackground(new GradientDrawable(org.telegram.ui.Components.x9.d(this.h1), new int[]{this.Z0, this.b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.b1));
            this.k1 = patternColor;
            this.j1 = patternColor;
        } else {
            this.x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.k1 = patternColor2;
            this.j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.i6.lc;
        boolean d12 = org.telegram.ui.ActionBar.i6.d1(i13);
        xc1 xc1Var = this.a;
        if (!d12 || (this.x0.getBackground() instanceof org.telegram.ui.Components.cd0)) {
            xc1Var.b(this.x0.getBackground(), this.x0.getBackground(), Float.valueOf(this.l1));
        } else if (org.telegram.ui.ActionBar.i6.t0() instanceof org.telegram.ui.Components.cd0) {
            getThemedColor(i13);
            xc1Var.b(this.x0.getBackground(), this.x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.ic), PorterDuff.Mode.MULTIPLY));
        }
        md1 md1Var = this.x0;
        if (md1Var != null) {
            md1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
            this.x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.x0.invalidate();
            if (org.telegram.ui.ActionBar.i6.I.q() && (this.x0.getBackground() instanceof org.telegram.ui.Components.cd0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.cd0) this.x0.getBackground()).k);
                }
            } else {
                this.x0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.T0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.l1);
            }
        }
        sc1 sc1Var = this.u0;
        if (sc1Var != null) {
            sc1Var.f1();
        }
        FrameLayout frameLayout = this.y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.y0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.z0.getChildAt(i15).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.cd0 cd0Var;
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        int i10 = this.b;
        if (i10 == 0 && g6Var == null) {
            this.x0.setBackground(org.telegram.ui.ActionBar.i6.s0());
        } else {
            if (i10 == 2) {
                Object obj = this.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    md1 md1Var = this.x0;
                    md1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    md1Var.d();
                } else if (obj instanceof ij1) {
                    ij1 ij1Var = (ij1) obj;
                    int i11 = ij1Var.f;
                    int i12 = ij1Var.e;
                    int i13 = ij1Var.d;
                    int i14 = ij1Var.c;
                    int i15 = ij1Var.b;
                    this.h1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        md1 md1Var2 = this.x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        md1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(ij1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.cd0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof jj1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.x0.setImageBitmap(bitmap);
                    } else {
                        jj1 jj1Var = (jj1) obj;
                        File file = jj1Var.e;
                        if (file != null) {
                            this.x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = jj1Var.d;
                            if (file2 != null) {
                                this.x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(jj1Var.a)) {
                                md1 md1Var3 = this.x0;
                                md1Var3.setImageDrawable(org.telegram.ui.ActionBar.i6.X0(md1Var3, false));
                            } else {
                                int i16 = jj1Var.b;
                                if (i16 != 0) {
                                    this.x0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.H1, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        this.x0.k(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.G1, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", photoSize != null ? photoSize.size : 0, "jpg", searchImage, 1);
                    } else {
                        md1 md1Var4 = this.x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        md1Var4.getClass();
                        md1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (g6Var == null) {
                this.x0.setBackground(org.telegram.ui.ActionBar.i6.s0());
            } else {
                org.telegram.ui.Components.s9 s9Var = this.u1;
                if (s9Var != null) {
                    s9Var.dispose();
                    this.u1 = null;
                }
                int C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Nd);
                int i17 = (int) g6Var.j;
                if (i17 != 0) {
                    C0 = i17;
                }
                int C02 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Od);
                long j3 = g6Var.k;
                int i18 = (int) j3;
                if (i18 == 0 && j3 != 0) {
                    C02 = 0;
                } else if (i18 != 0) {
                    C02 = i18;
                }
                int C03 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                long j10 = g6Var.l;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    C03 = 0;
                } else if (i19 != 0) {
                    C03 = i19;
                }
                int C04 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Qd);
                long j11 = g6Var.m;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    C04 = 0;
                } else if (i20 != 0) {
                    C04 = i20;
                }
                if (TextUtils.isEmpty(g6Var.o) || org.telegram.ui.ActionBar.i6.a1()) {
                    Drawable t02 = org.telegram.ui.ActionBar.i6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.cd0) {
                            ((org.telegram.ui.Components.cd0) t02).r(this.x0);
                        }
                        this.x0.setBackground(t02);
                    }
                } else {
                    if (C03 != 0) {
                        Drawable background = this.x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.cd0) {
                            cd0Var = (org.telegram.ui.Components.cd0) background;
                        } else {
                            org.telegram.ui.Components.cd0 cd0Var2 = new org.telegram.ui.Components.cd0();
                            cd0Var2.r(this.x0);
                            cd0Var = cd0Var2;
                            if (this.D1) {
                                cd0Var2.m(false);
                                cd0Var = cd0Var2;
                            }
                        }
                        cd0Var.n(C0, C02, C03, C04);
                        colorDrawable = cd0Var;
                    } else if (C02 != 0) {
                        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(org.telegram.ui.Components.x9.d(g6Var.n), new int[]{C0, C02});
                        this.u1 = x9Var.f(l2.f.s(0.5f, 3), new fd1(this, 0), 100L);
                        colorDrawable = x9Var;
                    } else {
                        colorDrawable = new ColorDrawable(C0);
                    }
                    this.x0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        md1 md1Var5 = this.x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        md1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (C02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(C0);
                    this.k1 = patternColor;
                    this.j1 = patternColor;
                } else if (C03 != 0) {
                    this.j1 = org.telegram.ui.Components.cd0.g(C0, C02, C03, C04);
                    this.k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(C0, C02));
                    this.k1 = patternColor2;
                    this.j1 = patternColor2;
                }
                md1 md1Var6 = this.x0;
                if (md1Var6 != null) {
                    md1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
                    this.x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.x0.invalidate();
                    if (org.telegram.ui.ActionBar.i6.I.q() && (this.x0.getBackground() instanceof org.telegram.ui.Components.cd0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.cd0) this.x0.getBackground()).k);
                        }
                    } else {
                        this.x0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.T0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.l1);
                    }
                }
                if (this.J0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.p91[] p91VarArr = this.J0;
                        if (i21 >= p91VarArr.length) {
                            break;
                        }
                        p91VarArr[i21].b(0, C0);
                        this.J0[i21].b(1, C02);
                        this.J0[i21].b(2, C03);
                        this.J0[i21].b(3, C04);
                        i21++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.D1 = false;
    }

    public final void c1(long j3) {
        this.J1 = j3;
        this.K1 = j3 == 0 || j3 == getUserConfig().getClientUserId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0271, code lost:
    
        if ("d".equals(((org.telegram.ui.ij1) r11).a) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0277, code lost:
    
        if ((r46.B1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0fa7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0938 A[EDGE_INSN: B:235:0x0938->B:236:0x0938 BREAK  A[LOOP:2: B:185:0x084f->B:211:0x092d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e A[LOOP:0: B:45:0x019a->B:47:0x019e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb A[EDGE_INSN: B:48:0x01cb->B:49:0x01cb BREAK  A[LOOP:0: B:45:0x019a->B:47:0x019e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e2d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0e6d  */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v88 */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        final int i10;
        int i11;
        int i12;
        md1[] md1VarArr;
        boolean z11;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i13;
        float f7;
        int i14;
        int i15;
        Object obj;
        int i16;
        int i17;
        Rect rect;
        int i18;
        final int i19;
        xc1 xc1Var;
        int i20;
        int i21;
        final int i22;
        float f10;
        org.telegram.ui.ActionBar.h6 h6Var2;
        ?? r92;
        org.telegram.ui.Components.l11 l11Var;
        final int i23;
        org.telegram.ui.ActionBar.d5 d5Var2;
        this.R.p = (xc1) getResourceProvider();
        this.S.p = (xc1) getResourceProvider();
        this.T.p = (xc1) getResourceProvider();
        this.U.p = (xc1) getResourceProvider();
        int i24 = 1;
        this.hasOwnBackground = true;
        od1 od1Var = this.p1;
        int i25 = 0;
        boolean z12 = (od1Var == null || this.J1 == 0) ? false : true;
        this.L1 = z12;
        if (z12) {
            Object obj2 = this.B1;
            if (!(obj2 instanceof jj1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.M1 = z10;
            if (z10) {
                this.o1 = od1Var.a() ? 1.0f : 0.0f;
            }
            d5Var = this.parentLayout;
            if (d5Var != null && ((ActionBarLayout) d5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.m0 = new FrameLayout(context);
            i10 = 3;
            if (this.M1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new kc1(this, i10), 2000L);
            }
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new id1();
            a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.e5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            k0 k0Var = new k0(this, context, 24);
            this.m0 = k0Var;
            k0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            this.m0.addView(this.actionBar, w7.x5.d(-2.0f, -1));
            org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context);
            this.n0 = qm0Var;
            qm0Var.setVerticalScrollBarEnabled(true);
            this.n0.setItemAnimator(null);
            this.n0.setLayoutAnimation(null);
            this.n0.setLayoutManager(new s4.d0(1, false));
            final int i26 = 2;
            this.n0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.qm0 qm0Var2 = this.n0;
            i11 = this.b;
            qm0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
            this.n0.setOnItemClickListener(new org.telegram.ui.Components.o7(i26));
            this.m0.addView(this.n0, w7.x5.e(-1, -1, 51));
            org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(context, this.resourceProvider);
            this.p0 = p20Var;
            p20Var.setImageResource(R.drawable.floating_pencil);
            this.m0.addView(this.p0, org.telegram.ui.Components.p20.b());
            pd1 pd1Var = new pd1(context);
            this.o0 = pd1Var;
            this.n0.setAdapter(pd1Var);
            this.t0 = new org.telegram.ui.ActionBar.q0(this, context, i10);
            this.v0 = new td1(context, this);
            this.s0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.s0.setOccupyStatusBar(false);
            }
            hg.c.v(false, this.s0);
            this.s0.setActionBarMenuOnItemClick(new ld1(this));
            i12 = 0;
            while (true) {
                md1VarArr = this.w0;
                if (i12 < 2) {
                    break;
                }
                md1VarArr[i12] = new md1(this, (Activity) getContext());
                this.t0.addView(md1VarArr[i12], w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
                i12++;
            }
            md1 md1Var = md1VarArr[0];
            this.x0 = md1Var;
            md1Var.setVisibility(0);
            md1VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.x0.getImageReceiver().setDelegate(new mc1(this, i25));
            }
            z11 = this.v0.e;
            org.telegram.ui.ActionBar.h6 h6Var3 = this.e0;
            final int i27 = 4;
            if (!z11) {
                this.s0.setTitle("Telegram Beta Chat");
                this.s0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
                h6Var = h6Var3;
            } else if (i11 == 2) {
                h6Var = h6Var3;
                if (this.J1 != 0) {
                    this.s0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.s0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.z o9 = this.s0.o();
                Object obj3 = this.B1;
                if ((obj3 instanceof jj1) && ((jj1) obj3).e != null) {
                    o9.a(7, R.drawable.msg_header_draw);
                }
                if (this.J1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.i6.n0().k(false) == null) {
                        Object obj4 = this.B1;
                        if (obj4 instanceof ij1) {
                        }
                    }
                    o9.a(5, R.drawable.msg_header_share);
                }
                if (this.J1 != 0 && this.L1) {
                    org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.N1 = ck0Var;
                    this.O1 = o9.d(6, ck0Var);
                    this.N1.h = true;
                    od1 od1Var2 = this.p1;
                    if (od1Var2 == null || od1Var2.a()) {
                        this.N1.M(35);
                        this.N1.P(36);
                    } else {
                        this.N1.P(0);
                        this.N1.M(0);
                    }
                    this.N1.Z = true;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J9);
                    this.N1.Q(v02, "Sunny");
                    this.N1.Q(v02, "Path 6");
                    this.N1.Q(v02, "Path");
                    this.N1.Q(v02, "Path 5");
                    this.N1.o();
                }
            } else {
                h6Var = h6Var3;
                if (i11 == 1) {
                    org.telegram.ui.ActionBar.z o10 = this.s0.o();
                    this.f = o10.e(4, LocaleController.getString(R.string.Save));
                    org.telegram.ui.Components.pm pmVar = new org.telegram.ui.Components.pm(this, context, o10);
                    this.e = pmVar;
                    pmVar.setSubMenuOpenSide(1);
                    this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                    this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                    this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                    this.e.D();
                    this.e.setForceSmoothKeyboard(true);
                    this.s0.addView(this.e, w7.x5.a(-1.0f, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f, -2, 51));
                    this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lc1
                        public final /* synthetic */ xd1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    this.b.O0(false);
                                    break;
                                case 1:
                                    xd1.V(this.b);
                                    break;
                                case 2:
                                    this.b.e.M(null, null);
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
                    int i28 = org.telegram.ui.ActionBar.i6.A8;
                    textView2.setTextColor(getThemedColor(i28));
                    this.h.setTypeface(AndroidUtilities.bold());
                    this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i28), PorterDuff.Mode.MULTIPLY));
                    this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                    this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                    this.e.addView(this.h, w7.x5.a(-2.0f, 16.0f, 0.0f, 0.0f, 1.0f, -2, 16));
                } else {
                    TLRPC.TL_theme tL_theme = h6Var.F;
                    String n10 = tL_theme != null ? tL_theme.title : h6Var.n();
                    int lastIndexOf = n10.lastIndexOf(".attheme");
                    if (lastIndexOf >= 0) {
                        n10 = n10.substring(0, lastIndexOf);
                    }
                    this.s0.setTitle(n10);
                    TLRPC.TL_theme tL_theme2 = h6Var.F;
                    if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                        this.s0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                    } else {
                        this.s0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i13, new Object[0]));
                    }
                }
            }
            this.u0 = new sc1(context, this);
            tc1 tc1Var = new tc1(this);
            tc1Var.S();
            this.u0.setItemAnimator(tc1Var);
            this.u0.setVerticalScrollBarEnabled(true);
            this.u0.setOverScrollMode(2);
            if (i11 != 2) {
                f7 = 16.0f;
                this.u0.setPadding(0, AndroidUtilities.dp(4.0f), 0, (AndroidUtilities.dp(72 + ((this.K1 || this.J1 <= 0) ? 0 : 58)) - 12) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
            } else {
                f7 = 16.0f;
                if (i11 == 1) {
                    this.u0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                } else {
                    this.u0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                }
            }
            this.u0.setClipToPadding(false);
            this.u0.setLayoutManager(new s4.d0(1, true));
            this.u0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            if (i11 != 1) {
                this.t0.addView(this.u0, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 273.0f, -1, 51));
                this.u0.setOnItemClickListener(new mc1(this, i24));
                i14 = -1;
            } else {
                i14 = -1;
                this.t0.addView(this.u0, w7.x5.e(-1, -1, 51));
            }
            this.u0.setOnScrollListener(new i3(this, 29));
            this.t0.addView(this.s0, w7.x5.d(-2.0f, i14));
            org.telegram.ui.Components.r91 r91Var = new org.telegram.ui.Components.r91(context);
            this.v1 = r91Var;
            r91Var.b(new mc1(this, i26));
            org.telegram.ui.ActionBar.g6 g6Var = this.s;
            if (i11 != 1 || i11 == 2) {
                if (i11 != 2) {
                    u4 u4Var = new u4(this, context, U0());
                    this.C0 = u4Var;
                    u4Var.setWillNotDraw(false);
                    i15 = 2;
                    this.C0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.t0.addView(this.C0, w7.x5.e(-1, 0, 81));
                    nd1 nd1Var = new nd1(context, this);
                    this.z1 = nd1Var;
                    w7.z5.b(nd1Var, 0.033f, 1.2f);
                    h1(false);
                    this.z1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lc1
                        public final /* synthetic */ xd1 b;

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
                                    xd1.V(this.b);
                                    break;
                                case 2:
                                    this.b.e.M(null, null);
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
                    if (this.J1 <= 0 || this.K1 || this.q0 != null) {
                        this.C0.addView(this.z1, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
                    } else {
                        nd1 nd1Var2 = new nd1(context, this);
                        this.A1 = nd1Var2;
                        w7.z5.b(nd1Var2, 0.033f, 1.2f);
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.J1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().isPremium()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                        this.A1.d(spannableStringBuilder);
                        try {
                            nd1 nd1Var3 = this.A1;
                            CharSequence b10 = nd1Var3.b();
                            l11Var = this.A1.a;
                            nd1Var3.d(Emoji.replaceEmoji(b10, l11Var.i(), false));
                        } catch (Exception unused) {
                        }
                        this.A1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lc1
                            public final /* synthetic */ xd1 b;

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
                                        xd1.V(this.b);
                                        break;
                                    case 2:
                                        this.b.e.M(null, null);
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
                        this.C0.addView(this.z1, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 58.0f, -1, 81));
                        this.C0.addView(this.A1, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
                    }
                    if (this.M1) {
                        t5 t5Var = new t5(this, (Activity) getContext());
                        this.Q1 = t5Var;
                        t5Var.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                        this.t0.addView(this.Q1, w7.x5.e(222, 76, 49));
                        uc1 uc1Var = new uc1((Activity) getContext());
                        this.R1 = uc1Var;
                        uc1Var.d(this.n1);
                        this.R1.b();
                        this.R1.c(new nc1(this, i25));
                        this.Q1.addView(this.R1);
                        od1 od1Var3 = this.p1;
                        if (od1Var3 != null) {
                            this.R1.setVisibility(od1Var3.a() ? 0 : 8);
                            this.R1.setAlpha(this.p1.a() ? 1.0f : 0.0f);
                            this.R1.d(this.p1.a() ? this.n1 : 0.0f);
                        }
                    }
                } else {
                    i15 = 2;
                }
                Rect rect2 = new Rect();
                Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.r = mutate2;
                mutate2.getPadding(rect2);
                this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.d6), PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                obj = this.B1;
                if (i11 != 1 || (obj instanceof ij1)) {
                    if ((obj instanceof ij1) || !"d".equals(((ij1) obj).a)) {
                        i16 = 3;
                        String[] strArr = new String[i16];
                        int[] iArr = new int[i16];
                        this.J0 = new org.telegram.ui.Components.p91[i16];
                        if (i16 != 0) {
                            this.y0 = new FrameLayout(context);
                            if (i11 == 1 || (this.B1 instanceof ij1)) {
                                strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                strArr[i15] = LocaleController.getString(R.string.BackgroundMotion);
                            } else {
                                strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                            }
                            i18 = 0;
                            int i29 = 0;
                            while (i29 < i16) {
                                int i30 = i24;
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i29]));
                                iArr[i29] = ceil;
                                i18 = Math.max(i18, ceil);
                                i29++;
                                i24 = i30;
                                rect2 = rect2;
                            }
                            i17 = i24;
                            rect = rect2;
                            vc1 vc1Var = new vc1(this, context, 0);
                            this.D0 = vc1Var;
                            vc1Var.setWillNotDraw(false);
                            this.D0.setVisibility(this.b1 != 0 ? 0 : 4);
                            this.D0.setScaleX(this.b1 != 0 ? 1.0f : 0.1f);
                            this.D0.setScaleY(this.b1 != 0 ? 1.0f : 0.1f);
                            this.D0.setAlpha(this.b1 != 0 ? 1.0f : 0.0f);
                            this.D0.setTag(this.b1 != 0 ? Integer.valueOf(i17) : null);
                            this.y0.addView(this.D0, w7.x5.e(48, 48, 17));
                            this.D0.setOnClickListener(new wc1(this, i25));
                            ImageView imageView = new ImageView(context);
                            this.F0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.F0.setImageResource(R.drawable.bg_rotate_large);
                            this.D0.addView(this.F0, w7.x5.e(-2, -2, 17));
                        } else {
                            i17 = 1;
                            rect = rect2;
                            i18 = 0;
                        }
                        i19 = 0;
                        while (true) {
                            xc1Var = this.a;
                            if (i19 >= i16) {
                                break;
                            }
                            this.J0[i19] = new org.telegram.ui.Components.p91(context, ((i11 == i17 || (this.B1 instanceof ij1)) && i19 == 0) ? i25 : 1, this.x0, xc1Var);
                            this.J0[i19].setBackgroundColor(this.Z0);
                            org.telegram.ui.Components.p91 p91Var = this.J0[i19];
                            String str = strArr[i19];
                            int i31 = iArr[i19];
                            p91Var.f = str;
                            p91Var.h = i31;
                            p91Var.n = i18;
                            int i32 = 1;
                            if (i11 != 1) {
                                if (this.B1 instanceof ij1) {
                                    i32 = 1;
                                } else {
                                    p91Var.a(i19 == 0 ? this.F1 : this.E1, false);
                                    int dp = AndroidUtilities.dp(56.0f) + i18;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, -2);
                                    layoutParams.gravity = 17;
                                    if (i16 != 3) {
                                        if (i19 == 0 || i19 == 2) {
                                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                        } else {
                                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                        }
                                    } else if (i19 == 1) {
                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                    } else {
                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                    }
                                    this.y0.addView(this.J0[i19], layoutParams);
                                    final org.telegram.ui.Components.p91 p91Var2 = this.J0[i19];
                                    final int i33 = 0;
                                    p91Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oc1
                                        public final /* synthetic */ xd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i33) {
                                                case 0:
                                                    xd1 xd1Var = this.b;
                                                    int i34 = xd1Var.b;
                                                    FrameLayout[] frameLayoutArr = xd1Var.L0;
                                                    if (xd1Var.y0.getAlpha() == 1.0f && xd1Var.r1 == null) {
                                                        int i35 = i19;
                                                        org.telegram.ui.Components.p91 p91Var3 = p91Var2;
                                                        if ((i34 != 1 && !(xd1Var.B1 instanceof ij1)) || i35 != 2) {
                                                            if (i35 != 1 || (i34 != 1 && !(xd1Var.B1 instanceof ij1))) {
                                                                if (!(xd1Var.B1 instanceof ij1)) {
                                                                    if (i34 != 1) {
                                                                        p91Var3.a(!p91Var3.s, true);
                                                                        if (i35 != 0) {
                                                                            boolean z13 = p91Var3.s;
                                                                            xd1Var.E1 = z13;
                                                                            xd1Var.v1.c(z13);
                                                                            xd1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = p91Var3.s;
                                                                            xd1Var.F1 = z14;
                                                                            if (z14) {
                                                                                xd1Var.x0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            xd1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    xd1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (xd1Var.J0[1].s) {
                                                                    xd1Var.Y0 = xd1Var.W0;
                                                                    xd1Var.x0.setImageDrawable(null);
                                                                    xd1Var.W0 = null;
                                                                    xd1Var.E1 = false;
                                                                    xd1Var.j1();
                                                                    xd1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i34 == 1) {
                                                                            xd1Var.f1(0, true, true);
                                                                        } else {
                                                                            xd1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    xd1Var.Z0(xd1Var.Y0 != null ? -1 : 0);
                                                                    if (i34 == 1) {
                                                                        xd1Var.f1(1, true, true);
                                                                    } else {
                                                                        xd1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                xd1Var.J0[1].a(xd1Var.W0 != null, true);
                                                                xd1Var.n1();
                                                                xd1Var.P0.f1();
                                                                xd1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            p91Var3.a(!p91Var3.s, true);
                                                            boolean z15 = p91Var3.s;
                                                            xd1Var.E1 = z15;
                                                            xd1Var.v1.c(z15);
                                                            xd1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xd1 xd1Var2 = this.b;
                                                    if (xd1Var2.z0.getAlpha() == 1.0f && i19 == 0) {
                                                        org.telegram.ui.Components.p91 p91Var4 = p91Var2;
                                                        p91Var4.a(!p91Var4.s, true);
                                                        xd1Var2.s.i = p91Var4.s;
                                                        org.telegram.ui.ActionBar.i6.o1(true, true);
                                                        xd1Var2.u0.f1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i19 != 2) {
                                        this.J0[i19].setAlpha(0.0f);
                                        this.J0[i19].setVisibility(4);
                                    }
                                    i19++;
                                    i25 = 0;
                                    i15 = 2;
                                    i17 = 1;
                                }
                            }
                            if (i19 == i32) {
                                p91Var.a((this.W0 == null && (g6Var == null || TextUtils.isEmpty(g6Var.o))) ? false : true, false);
                            } else if (i19 == i15) {
                                p91Var.a(this.E1, false);
                            }
                            int dp2 = AndroidUtilities.dp(56.0f) + i18;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp2, -2);
                            layoutParams2.gravity = 17;
                            if (i16 != 3) {
                            }
                            this.y0.addView(this.J0[i19], layoutParams2);
                            final org.telegram.ui.Components.p91 p91Var22 = this.J0[i19];
                            final int i332 = 0;
                            p91Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oc1
                                public final /* synthetic */ xd1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i332) {
                                        case 0:
                                            xd1 xd1Var = this.b;
                                            int i34 = xd1Var.b;
                                            FrameLayout[] frameLayoutArr = xd1Var.L0;
                                            if (xd1Var.y0.getAlpha() == 1.0f && xd1Var.r1 == null) {
                                                int i35 = i19;
                                                org.telegram.ui.Components.p91 p91Var3 = p91Var22;
                                                if ((i34 != 1 && !(xd1Var.B1 instanceof ij1)) || i35 != 2) {
                                                    if (i35 != 1 || (i34 != 1 && !(xd1Var.B1 instanceof ij1))) {
                                                        if (!(xd1Var.B1 instanceof ij1)) {
                                                            if (i34 != 1) {
                                                                p91Var3.a(!p91Var3.s, true);
                                                                if (i35 != 0) {
                                                                    boolean z13 = p91Var3.s;
                                                                    xd1Var.E1 = z13;
                                                                    xd1Var.v1.c(z13);
                                                                    xd1Var.M0();
                                                                    break;
                                                                } else {
                                                                    boolean z14 = p91Var3.s;
                                                                    xd1Var.F1 = z14;
                                                                    if (z14) {
                                                                        xd1Var.x0.getImageReceiver().setForceCrossfade(true);
                                                                    }
                                                                    xd1Var.i1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            xd1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (xd1Var.J0[1].s) {
                                                            xd1Var.Y0 = xd1Var.W0;
                                                            xd1Var.x0.setImageDrawable(null);
                                                            xd1Var.W0 = null;
                                                            xd1Var.E1 = false;
                                                            xd1Var.j1();
                                                            xd1Var.M0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i34 == 1) {
                                                                    xd1Var.f1(0, true, true);
                                                                } else {
                                                                    xd1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            xd1Var.Z0(xd1Var.Y0 != null ? -1 : 0);
                                                            if (i34 == 1) {
                                                                xd1Var.f1(1, true, true);
                                                            } else {
                                                                xd1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        xd1Var.J0[1].a(xd1Var.W0 != null, true);
                                                        xd1Var.n1();
                                                        xd1Var.P0.f1();
                                                        xd1Var.l1();
                                                        break;
                                                    }
                                                } else {
                                                    p91Var3.a(!p91Var3.s, true);
                                                    boolean z15 = p91Var3.s;
                                                    xd1Var.E1 = z15;
                                                    xd1Var.v1.c(z15);
                                                    xd1Var.M0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            xd1 xd1Var2 = this.b;
                                            if (xd1Var2.z0.getAlpha() == 1.0f && i19 == 0) {
                                                org.telegram.ui.Components.p91 p91Var4 = p91Var22;
                                                p91Var4.a(!p91Var4.s, true);
                                                xd1Var2.s.i = p91Var4.s;
                                                org.telegram.ui.ActionBar.i6.o1(true, true);
                                                xd1Var2.u0.f1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i19 != 2) {
                            }
                            i19++;
                            i25 = 0;
                            i15 = 2;
                            i17 = 1;
                        }
                        i20 = i17;
                        if (i11 == i20) {
                            int[] iArr2 = new int[2];
                            this.K0 = new org.telegram.ui.Components.p91[2];
                            this.z0 = new FrameLayout(context);
                            String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 2; i34 < i36; i36 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i34]));
                                iArr2[i34] = ceil2;
                                i35 = Math.max(i35, ceil2);
                                i34++;
                            }
                            if (g6Var != null) {
                                vc1 vc1Var2 = new vc1(this, context, 1);
                                this.E0 = vc1Var2;
                                vc1Var2.setWillNotDraw(false);
                                this.E0.setVisibility(g6Var.f != 0 ? 0 : 4);
                                this.E0.setScaleX(g6Var.f != 0 ? 1.0f : 0.1f);
                                this.E0.setScaleY(g6Var.f != 0 ? 1.0f : 0.1f);
                                this.E0.setAlpha(g6Var.f != 0 ? 1.0f : 0.0f);
                                this.z0.addView(this.E0, w7.x5.e(48, 48, 17));
                                this.E0.setOnClickListener(new wc1(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.G0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.G0.setImageResource(R.drawable.bg_rotate_large);
                                this.E0.addView(this.G0, w7.x5.e(-2, -2, 17));
                                final int i37 = 0;
                                while (i37 < 2) {
                                    this.K0[i37] = new org.telegram.ui.Components.p91(context, i37 == 0, this.x0, xc1Var);
                                    org.telegram.ui.Components.p91 p91Var3 = this.K0[i37];
                                    String str2 = strArr2[i37];
                                    int i38 = iArr2[i37];
                                    p91Var3.f = str2;
                                    p91Var3.h = i38;
                                    p91Var3.n = i35;
                                    if (i37 == 0) {
                                        p91Var3.a(g6Var.i, false);
                                    }
                                    int dp3 = AndroidUtilities.dp(56.0f) + i35;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i37 == 1) {
                                        layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    }
                                    this.z0.addView(this.K0[i37], layoutParams3);
                                    final org.telegram.ui.Components.p91 p91Var4 = this.K0[i37];
                                    final int i39 = 1;
                                    p91Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oc1
                                        public final /* synthetic */ xd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i39) {
                                                case 0:
                                                    xd1 xd1Var = this.b;
                                                    int i342 = xd1Var.b;
                                                    FrameLayout[] frameLayoutArr = xd1Var.L0;
                                                    if (xd1Var.y0.getAlpha() == 1.0f && xd1Var.r1 == null) {
                                                        int i352 = i37;
                                                        org.telegram.ui.Components.p91 p91Var32 = p91Var4;
                                                        if ((i342 != 1 && !(xd1Var.B1 instanceof ij1)) || i352 != 2) {
                                                            if (i352 != 1 || (i342 != 1 && !(xd1Var.B1 instanceof ij1))) {
                                                                if (!(xd1Var.B1 instanceof ij1)) {
                                                                    if (i342 != 1) {
                                                                        p91Var32.a(!p91Var32.s, true);
                                                                        if (i352 != 0) {
                                                                            boolean z13 = p91Var32.s;
                                                                            xd1Var.E1 = z13;
                                                                            xd1Var.v1.c(z13);
                                                                            xd1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = p91Var32.s;
                                                                            xd1Var.F1 = z14;
                                                                            if (z14) {
                                                                                xd1Var.x0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            xd1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    xd1Var.f1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (xd1Var.J0[1].s) {
                                                                    xd1Var.Y0 = xd1Var.W0;
                                                                    xd1Var.x0.setImageDrawable(null);
                                                                    xd1Var.W0 = null;
                                                                    xd1Var.E1 = false;
                                                                    xd1Var.j1();
                                                                    xd1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i342 == 1) {
                                                                            xd1Var.f1(0, true, true);
                                                                        } else {
                                                                            xd1Var.f1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    xd1Var.Z0(xd1Var.Y0 != null ? -1 : 0);
                                                                    if (i342 == 1) {
                                                                        xd1Var.f1(1, true, true);
                                                                    } else {
                                                                        xd1Var.f1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                xd1Var.J0[1].a(xd1Var.W0 != null, true);
                                                                xd1Var.n1();
                                                                xd1Var.P0.f1();
                                                                xd1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            p91Var32.a(!p91Var32.s, true);
                                                            boolean z15 = p91Var32.s;
                                                            xd1Var.E1 = z15;
                                                            xd1Var.v1.c(z15);
                                                            xd1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xd1 xd1Var2 = this.b;
                                                    if (xd1Var2.z0.getAlpha() == 1.0f && i37 == 0) {
                                                        org.telegram.ui.Components.p91 p91Var42 = p91Var4;
                                                        p91Var42.a(!p91Var42.s, true);
                                                        xd1Var2.s.i = p91Var42.s;
                                                        org.telegram.ui.ActionBar.i6.o1(true, true);
                                                        xd1Var2.u0.f1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i37++;
                                }
                            }
                            i21 = 1;
                        } else {
                            i21 = i20;
                        }
                        if (i11 != i21 || (this.B1 instanceof ij1)) {
                            this.F1 = false;
                            i22 = 0;
                            while (i22 < 2) {
                                Rect rect3 = rect;
                                yc1 yc1Var = new yc1(this, context, i22, rect3);
                                ViewGroup[] viewGroupArr = this.L0;
                                viewGroupArr[i22] = yc1Var;
                                if (i22 == 1 || i11 == 2) {
                                    yc1Var.setVisibility(4);
                                }
                                viewGroupArr[i22].setWillNotDraw(false);
                                FrameLayout.LayoutParams e7 = i11 == 2 ? w7.x5.e(-1, i22 == 0 ? 321 : 316, 83) : w7.x5.e(-1, i22 == 0 ? 273 : 316, 83);
                                e7.height = AndroidUtilities.dp(i22 == 0 ? i11 == 2 ? 321 : 273 : 316.0f);
                                if (U0()) {
                                    e7.height += AndroidUtilities.navigationBarHeight;
                                }
                                if (i22 == 0) {
                                    Drawable drawable = this.r;
                                    Rect rect4 = AndroidUtilities.rectTmp2;
                                    drawable.getPadding(rect4);
                                    e7.height = AndroidUtilities.dp(12.0f) + rect4.top + e7.height;
                                }
                                viewGroupArr[i22].setPadding(0, i22 == 0 ? AndroidUtilities.dp(12.0f) + rect3.top : 0, 0, U0() ? AndroidUtilities.navigationBarHeight : 0);
                                this.t0.addView(viewGroupArr[i22], e7);
                                if (i22 == 1 || i11 == 2) {
                                    ci.m6 m6Var = new ci.m6(this, context, 25);
                                    ViewGroup[] viewGroupArr2 = this.O0;
                                    viewGroupArr2[i22] = m6Var;
                                    m6Var.setWillNotDraw(false);
                                    viewGroupArr2[i22].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                    viewGroupArr2[i22].setClickable(true);
                                    f10 = 21.0f;
                                    viewGroupArr[i22].addView(viewGroupArr2[i22], w7.x5.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.M0;
                                    textViewArr[i22] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i22].setTypeface(AndroidUtilities.bold());
                                    TextView textView4 = textViewArr[i22];
                                    int i40 = org.telegram.ui.ActionBar.i6.Ae;
                                    textView4.setTextColor(getThemedColor(i40));
                                    textViewArr[i22].setText(LocaleController.getString(R.string.Cancel));
                                    textViewArr[i22].setGravity(17);
                                    textViewArr[i22].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    TextView textView5 = textViewArr[i22];
                                    int i41 = org.telegram.ui.ActionBar.i6.i6;
                                    textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i41), 0));
                                    rect = rect3;
                                    h6Var2 = h6Var;
                                    viewGroupArr2[i22].addView(textViewArr[i22], w7.x5.e(-2, -1, 51));
                                    TextView textView6 = textViewArr[i22];
                                    final int i42 = 0;
                                    textView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rc1
                                        public final /* synthetic */ xd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i42) {
                                                case 0:
                                                    xd1 xd1Var = this.b;
                                                    if (xd1Var.r1 == null) {
                                                        int i43 = i22;
                                                        if (i43 == 0) {
                                                            xd1Var.h1 = xd1Var.i1;
                                                            xd1Var.a1(xd1Var.g1, 3, true);
                                                            xd1Var.a1(xd1Var.f1, 2, true);
                                                            xd1Var.a1(xd1Var.e1, 1, true);
                                                            xd1Var.a1(xd1Var.a1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = xd1Var.X0;
                                                            xd1Var.W0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                xd1Var.x0.setImageDrawable(null);
                                                            } else {
                                                                md1 md1Var2 = xd1Var.x0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = xd1Var.G1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = xd1Var.W0;
                                                                md1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            xd1Var.J0[1].a(xd1Var.W0 != null, false);
                                                            float f11 = xd1Var.m1;
                                                            xd1Var.l1 = f11;
                                                            xd1Var.T0.setProgress(f11);
                                                            xd1Var.x0.getImageReceiver().setAlpha(xd1Var.l1);
                                                            xd1Var.j1();
                                                            xd1Var.n1();
                                                        }
                                                        if (xd1Var.b != 2) {
                                                            if (xd1Var.W0 == null) {
                                                                if (xd1Var.E1) {
                                                                    xd1Var.E1 = false;
                                                                    xd1Var.J0[0].a(false, true);
                                                                    xd1Var.M0();
                                                                }
                                                                xd1Var.l1();
                                                            }
                                                            xd1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            xd1Var.f1(i43, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xd1 xd1Var2 = this.b;
                                                    if (xd1Var2.r1 == null) {
                                                        if (xd1Var2.b != 2) {
                                                            xd1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            xd1Var2.f1(i22, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView7 = new TextView(context);
                                    TextView[] textViewArr2 = this.N0;
                                    textViewArr2[i22] = textView7;
                                    textView7.setTextSize(1, 15.0f);
                                    textViewArr2[i22].setTypeface(AndroidUtilities.bold());
                                    textViewArr2[i22].setTextColor(getThemedColor(i40));
                                    textViewArr2[i22].setText(LocaleController.getString(R.string.ApplyTheme));
                                    textViewArr2[i22].setGravity(17);
                                    textViewArr2[i22].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    textViewArr2[i22].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i41), 0));
                                    viewGroupArr2[i22].addView(textViewArr2[i22], w7.x5.e(-2, -1, 53));
                                    TextView textView8 = textViewArr2[i22];
                                    r92 = 1;
                                    final char c10 = 1 == true ? 1 : 0;
                                    textView8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rc1
                                        public final /* synthetic */ xd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c10) {
                                                case 0:
                                                    xd1 xd1Var = this.b;
                                                    if (xd1Var.r1 == null) {
                                                        int i43 = i22;
                                                        if (i43 == 0) {
                                                            xd1Var.h1 = xd1Var.i1;
                                                            xd1Var.a1(xd1Var.g1, 3, true);
                                                            xd1Var.a1(xd1Var.f1, 2, true);
                                                            xd1Var.a1(xd1Var.e1, 1, true);
                                                            xd1Var.a1(xd1Var.a1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = xd1Var.X0;
                                                            xd1Var.W0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                xd1Var.x0.setImageDrawable(null);
                                                            } else {
                                                                md1 md1Var2 = xd1Var.x0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = xd1Var.G1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = xd1Var.W0;
                                                                md1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            xd1Var.J0[1].a(xd1Var.W0 != null, false);
                                                            float f11 = xd1Var.m1;
                                                            xd1Var.l1 = f11;
                                                            xd1Var.T0.setProgress(f11);
                                                            xd1Var.x0.getImageReceiver().setAlpha(xd1Var.l1);
                                                            xd1Var.j1();
                                                            xd1Var.n1();
                                                        }
                                                        if (xd1Var.b != 2) {
                                                            if (xd1Var.W0 == null) {
                                                                if (xd1Var.E1) {
                                                                    xd1Var.E1 = false;
                                                                    xd1Var.J0[0].a(false, true);
                                                                    xd1Var.M0();
                                                                }
                                                                xd1Var.l1();
                                                            }
                                                            xd1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            xd1Var.f1(i43, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xd1 xd1Var2 = this.b;
                                                    if (xd1Var2.r1 == null) {
                                                        if (xd1Var2.b != 2) {
                                                            xd1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            xd1Var2.f1(i22, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    rect = rect3;
                                    h6Var2 = h6Var;
                                    r92 = 1;
                                    f10 = 21.0f;
                                }
                                if (i22 == r92) {
                                    TextView textView9 = new TextView(context);
                                    this.e2 = textView9;
                                    textView9.setLines(r92);
                                    this.e2.setSingleLine(r92);
                                    this.e2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                    this.e2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                                    this.e2.setTextSize(r92, 20.0f);
                                    this.e2.setTypeface(AndroidUtilities.bold());
                                    this.e2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                                    this.e2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.e2.setGravity(16);
                                    viewGroupArr[i22].addView(this.e2, w7.x5.a(48.0f, 0.0f, 21.0f, 0.0f, 0.0f, -1, 51));
                                    fc1 fc1Var = new fc1(context);
                                    this.P0 = fc1Var;
                                    s4.d0 d0Var = new s4.d0(0, false);
                                    this.R0 = d0Var;
                                    fc1Var.setLayoutManager(d0Var);
                                    fc1 fc1Var2 = this.P0;
                                    vd1 vd1Var = new vd1(context, this);
                                    this.Q0 = vd1Var;
                                    fc1Var2.setAdapter(vd1Var);
                                    this.P0.i(new ai.t(9));
                                    viewGroupArr[i22].addView(this.P0, w7.x5.a(100.0f, 0.0f, 76.0f, 0.0f, 0.0f, -1, 51));
                                    this.P0.setOnItemClickListener(new z21(this, 8));
                                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
                                    this.S0 = m4Var;
                                    m4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                    viewGroupArr[i22].addView(this.S0, w7.x5.a(-2.0f, 0.0f, 175.0f, 0.0f, 0.0f, -1, 51));
                                    org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(context, (xc1) getResourceProvider());
                                    this.T0 = j0Var;
                                    j0Var.setProgress(this.l1);
                                    this.T0.setReportChanges(true);
                                    this.T0.setDelegate(new zc1(this));
                                    viewGroupArr[i22].addView(this.T0, w7.x5.a(38.0f, 5.0f, 211.0f, 5.0f, 0.0f, -1, 51));
                                } else {
                                    org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(context, this.g0, new ad1(this));
                                    this.V = crVar;
                                    crVar.setResourcesProvider(getResourceProvider());
                                    if (i11 == 1) {
                                        viewGroupArr[i22].addView(this.V, w7.x5.e(-1, -1, 1));
                                        if (h6Var2.q()) {
                                            this.V.setMinBrightness(0.2f);
                                        } else {
                                            this.V.setMinBrightness(0.05f);
                                            this.V.setMaxBrightness(0.8f);
                                        }
                                        if (g6Var != null) {
                                            int i43 = g6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.cr crVar2 = this.V;
                                            T0(1);
                                            crVar2.f(1, 2, i43, false);
                                            this.V.e(g6Var.c, 0);
                                            int i44 = g6Var.d;
                                            if (i44 != 0) {
                                                this.V.e(i44, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i22].addView(this.V, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 1));
                                    }
                                }
                                i22++;
                                h6Var = h6Var2;
                            }
                        }
                        j1();
                        if (!this.x0.getImageReceiver().hasBitmapImage()) {
                            this.t0.setBackgroundColor(-16777216);
                        }
                        if (i11 != 1 && !(this.B1 instanceof ij1)) {
                            this.x0.getImageReceiver().setCrossfadeWithOldImage(true);
                        }
                    }
                    i16 = 0;
                    String[] strArr3 = new String[i16];
                    int[] iArr3 = new int[i16];
                    this.J0 = new org.telegram.ui.Components.p91[i16];
                    if (i16 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        xc1Var = this.a;
                        if (i19 >= i16) {
                        }
                        i19++;
                        i25 = 0;
                        i15 = 2;
                        i17 = 1;
                    }
                    i20 = i17;
                    if (i11 == i20) {
                    }
                    if (i11 != i21) {
                    }
                    this.F1 = false;
                    i22 = 0;
                    while (i22 < 2) {
                    }
                    j1();
                    if (!this.x0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                        this.x0.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                } else {
                    if (!(obj instanceof jj1) || !"t".equals(((jj1) obj).a)) {
                        i16 = i15;
                        String[] strArr32 = new String[i16];
                        int[] iArr32 = new int[i16];
                        this.J0 = new org.telegram.ui.Components.p91[i16];
                        if (i16 != 0) {
                        }
                        i19 = 0;
                        while (true) {
                            xc1Var = this.a;
                            if (i19 >= i16) {
                            }
                            i19++;
                            i25 = 0;
                            i15 = 2;
                            i17 = 1;
                        }
                        i20 = i17;
                        if (i11 == i20) {
                        }
                        if (i11 != i21) {
                        }
                        this.F1 = false;
                        i22 = 0;
                        while (i22 < 2) {
                        }
                        j1();
                        if (!this.x0.getImageReceiver().hasBitmapImage()) {
                        }
                        if (i11 != 1) {
                        }
                    }
                    i16 = 0;
                    String[] strArr322 = new String[i16];
                    int[] iArr322 = new int[i16];
                    this.J0 = new org.telegram.ui.Components.p91[i16];
                    if (i16 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        xc1Var = this.a;
                        if (i19 >= i16) {
                        }
                        i19++;
                        i25 = 0;
                        i15 = 2;
                        i17 = 1;
                    }
                    i20 = i17;
                    if (i11 == i20) {
                    }
                    if (i11 != i21) {
                    }
                    this.F1 = false;
                    i22 = 0;
                    while (i22 < 2) {
                    }
                    j1();
                    if (!this.x0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                    }
                }
            }
            this.u0.setAdapter(this.v0);
            ci.m6 m6Var2 = new ci.m6(this, context, 26);
            this.k0 = m6Var2;
            m6Var2.setWillNotDraw(false);
            ci.m6 m6Var3 = this.k0;
            this.fragmentView = m6Var3;
            ViewTreeObserver viewTreeObserver = m6Var3.getViewTreeObserver();
            int i45 = 1;
            fa0 fa0Var = new fa0(this, i45);
            this.Q = fa0Var;
            viewTreeObserver.addOnGlobalLayoutListener(fa0Var);
            z4.g gVar = new z4.g(context);
            this.j0 = gVar;
            gVar.b(new m2(this, 2));
            this.j0.setAdapter(new c80(this, i45));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.j0, getThemedColor(org.telegram.ui.ActionBar.i6.s8));
            this.k0.addView(this.j0, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f, -1, 51));
            UndoView undoView = new UndoView(context, this);
            this.l0 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.k0.addView(this.l0, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
            if (i11 != 0) {
                View view = new View(context);
                view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.V5));
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                this.k0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.b0 = frameLayout;
                int i46 = org.telegram.ui.ActionBar.i6.d6;
                boolean z13 = this.d;
                frameLayout.setBackgroundColor(z13 ? org.telegram.ui.ActionBar.i6.D0(i46) : getThemedColor(i46));
                this.k0.addView(this.b0, w7.x5.e(-1, 48, 83));
                ci.r6 r6Var = new ci.r6(context, this);
                this.a0 = r6Var;
                this.b0.addView(r6Var, w7.x5.e(22, 8, 17));
                TextView textView10 = new TextView(context);
                this.d0 = textView10;
                textView10.setTextSize(1, 14.0f);
                TextView textView11 = this.d0;
                int i47 = org.telegram.ui.ActionBar.i6.Ae;
                textView11.setTextColor(z13 ? org.telegram.ui.ActionBar.i6.D0(i47) : getThemedColor(i47));
                this.d0.setGravity(17);
                this.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(251658240, 0));
                this.d0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.d0.setText(LocaleController.getString(R.string.Cancel));
                this.d0.setTypeface(AndroidUtilities.bold());
                this.b0.addView(this.d0, w7.x5.e(-2, -1, 51));
                final int i48 = 0;
                this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lc1
                    public final /* synthetic */ xd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i48) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                xd1.V(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
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
                TextView textView12 = new TextView(context);
                this.c0 = textView12;
                textView12.setTextSize(1, 14.0f);
                this.c0.setTextColor(z13 ? org.telegram.ui.ActionBar.i6.D0(i47) : getThemedColor(i47));
                this.c0.setGravity(17);
                this.c0.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(251658240, 0));
                this.c0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.c0.setText(LocaleController.getString(R.string.ApplyTheme));
                this.c0.setTypeface(AndroidUtilities.bold());
                this.b0.addView(this.c0, w7.x5.e(-2, -1, 53));
                i23 = 1;
                this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lc1
                    public final /* synthetic */ xd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i23) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                xd1.V(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
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
                i23 = 1;
            }
            if (i11 == i23 && !org.telegram.ui.ActionBar.i6.a1() && g6Var != null && g6Var.j != 4294967296L) {
                X0();
            }
            this.i0 = S0();
            b1(true);
            m1(false);
            this.c = new Scroller(getContext());
            d5Var2 = this.parentLayout;
            if (d5Var2 != null && d5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
                if (i11 == 2 && this.J1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
            return this.fragmentView;
        }
        z10 = false;
        this.M1 = z10;
        if (z10) {
        }
        d5Var = this.parentLayout;
        if (d5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.m0 = new FrameLayout(context);
        i10 = 3;
        if (this.M1) {
            AndroidUtilities.runOnUIThread(new kc1(this, i10), 2000L);
        }
        org.telegram.ui.ActionBar.v0 a22 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a22.F();
        a22.H = new id1();
        a22.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.e5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        k0 k0Var2 = new k0(this, context, 24);
        this.m0 = k0Var2;
        k0Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        this.m0.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        org.telegram.ui.Components.qm0 qm0Var3 = new org.telegram.ui.Components.qm0(context);
        this.n0 = qm0Var3;
        qm0Var3.setVerticalScrollBarEnabled(true);
        this.n0.setItemAnimator(null);
        this.n0.setLayoutAnimation(null);
        this.n0.setLayoutManager(new s4.d0(1, false));
        final int i262 = 2;
        this.n0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.qm0 qm0Var22 = this.n0;
        i11 = this.b;
        qm0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
        this.n0.setOnItemClickListener(new org.telegram.ui.Components.o7(i262));
        this.m0.addView(this.n0, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(context, this.resourceProvider);
        this.p0 = p20Var2;
        p20Var2.setImageResource(R.drawable.floating_pencil);
        this.m0.addView(this.p0, org.telegram.ui.Components.p20.b());
        pd1 pd1Var2 = new pd1(context);
        this.o0 = pd1Var2;
        this.n0.setAdapter(pd1Var2);
        this.t0 = new org.telegram.ui.ActionBar.q0(this, context, i10);
        this.v0 = new td1(context, this);
        this.s0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        hg.c.v(false, this.s0);
        this.s0.setActionBarMenuOnItemClick(new ld1(this));
        i12 = 0;
        while (true) {
            md1VarArr = this.w0;
            if (i12 < 2) {
            }
            md1VarArr[i12] = new md1(this, (Activity) getContext());
            this.t0.addView(md1VarArr[i12], w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
            i12++;
        }
        md1 md1Var2 = md1VarArr[0];
        this.x0 = md1Var2;
        md1Var2.setVisibility(0);
        md1VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z11 = this.v0.e;
        org.telegram.ui.ActionBar.h6 h6Var32 = this.e0;
        final int i272 = 4;
        if (!z11) {
        }
        this.u0 = new sc1(context, this);
        tc1 tc1Var2 = new tc1(this);
        tc1Var2.S();
        this.u0.setItemAnimator(tc1Var2);
        this.u0.setVerticalScrollBarEnabled(true);
        this.u0.setOverScrollMode(2);
        if (i11 != 2) {
        }
        this.u0.setClipToPadding(false);
        this.u0.setLayoutManager(new s4.d0(1, true));
        this.u0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        if (i11 != 1) {
        }
        this.u0.setOnScrollListener(new i3(this, 29));
        this.t0.addView(this.s0, w7.x5.d(-2.0f, i14));
        org.telegram.ui.Components.r91 r91Var2 = new org.telegram.ui.Components.r91(context);
        this.v1 = r91Var2;
        r91Var2.b(new mc1(this, i262));
        org.telegram.ui.ActionBar.g6 g6Var2 = this.s;
        if (i11 != 1) {
        }
        if (i11 != 2) {
        }
        Rect rect22 = new Rect();
        Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate22;
        mutate22.getPadding(rect22);
        this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.d6), PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        obj = this.B1;
        if (i11 != 1) {
        }
        if (obj instanceof ij1) {
        }
        i16 = 3;
        String[] strArr3222 = new String[i16];
        int[] iArr3222 = new int[i16];
        this.J0 = new org.telegram.ui.Components.p91[i16];
        if (i16 != 0) {
        }
        i19 = 0;
        while (true) {
            xc1Var = this.a;
            if (i19 >= i16) {
            }
            i19++;
            i25 = 0;
            i15 = 2;
            i17 = 1;
        }
        i20 = i17;
        if (i11 == i20) {
        }
        if (i11 != i21) {
        }
        this.F1 = false;
        i22 = 0;
        while (i22 < 2) {
        }
        j1();
        if (!this.x0.getImageReceiver().hasBitmapImage()) {
        }
        if (i11 != 1) {
        }
        this.u0.setAdapter(this.v0);
        ci.m6 m6Var22 = new ci.m6(this, context, 26);
        this.k0 = m6Var22;
        m6Var22.setWillNotDraw(false);
        ci.m6 m6Var32 = this.k0;
        this.fragmentView = m6Var32;
        ViewTreeObserver viewTreeObserver2 = m6Var32.getViewTreeObserver();
        int i452 = 1;
        fa0 fa0Var2 = new fa0(this, i452);
        this.Q = fa0Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(fa0Var2);
        z4.g gVar2 = new z4.g(context);
        this.j0 = gVar2;
        gVar2.b(new m2(this, 2));
        this.j0.setAdapter(new c80(this, i452));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.j0, getThemedColor(org.telegram.ui.ActionBar.i6.s8));
        this.k0.addView(this.j0, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f, -1, 51));
        UndoView undoView2 = new UndoView(context, this);
        this.l0 = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.k0.addView(this.l0, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        if (i11 != 0) {
        }
        if (i11 == i23) {
            X0();
        }
        this.i0 = S0();
        b1(true);
        m1(false);
        this.c = new Scroller(getContext());
        d5Var2 = this.parentLayout;
        if (d5Var2 != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
            if (i11 == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        float f7;
        if (this.x0 == null) {
            return;
        }
        Bitmap bitmap = this.a.r;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.x0.getMeasuredWidth() - (Math.max(this.x0.getMeasuredWidth() / width, this.x0.getMeasuredHeight() / r0.r.getHeight()) * width)) / 2.0f) + this.X1 + 0.0f;
        } else {
            f7 = this.X1 + 0.0f;
        }
        float y3 = w0Var.getY() - ((-this.x0.J) + 0.0f);
        int measuredHeight = this.x0.getMeasuredHeight();
        float f10 = this.M1 ? this.n1 * this.o1 : 0.0f;
        w0Var.w0 = true;
        w0Var.v0 = measuredHeight;
        w0Var.t0 = y3;
        w0Var.u0 = f7;
        w0Var.b2 = f10;
        w0Var.c2.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        w0Var.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.J1 == ((Long) objArr[2]).longValue()) {
                this.V1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.qm0 qm0Var = this.n0;
            if (qm0Var == null) {
                return;
            }
            int childCount = qm0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.n0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            sc1 sc1Var = this.u0;
            if (sc1Var != null) {
                sc1Var.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.t0 != null) {
                b1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.B1;
            if (obj instanceof jj1) {
                jj1 jj1Var = (jj1) obj;
                if (jj1Var.a == null) {
                    jj1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j3 = 0;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.wallpaperSettedToUser || this.J1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.U0.clear();
        HashMap hashMap = this.V0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.U0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.g6 g6Var = this.s;
                if (g6Var != null && (str = g6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.W0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (g6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
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
        if (!z10 && (tL_wallPaper = this.W0) != null) {
            this.U0.add(0, tL_wallPaper);
        }
        vd1 vd1Var = this.Q0;
        if (vd1Var != null) {
            vd1Var.l();
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j3 = MediaDataController.calcHash(j3, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new qc1(this, 1)), this.classGuid);
    }

    public final void e1() {
        if (this.t0 == null || this.K0 == null || this.s.g == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.A0 == null) {
            org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(getParentActivity(), 8);
            this.A0 = z40Var;
            z40Var.setShowingDuration(5000L);
            this.A0.setAlpha(0.0f);
            this.A0.setVisibility(4);
            this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.k0.addView(this.A0, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
        AndroidUtilities.runOnUIThread(new n31(15, this, globalMainSettings), 500L);
    }

    public final void f1(int i10, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i10 == 1 && this.W0 != null;
        int i11 = this.b;
        if (z10) {
            if (i10 != 0) {
                this.X0 = this.W0;
                this.m1 = this.l1;
                this.Q0.l();
                ArrayList arrayList = this.U0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.W0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i11 == 2 ? 1 : 0);
                    }
                    this.R0.h1(indexOf, (this.P0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i11 == 2) {
                this.a1 = this.Z0;
                int i12 = this.b1;
                this.e1 = i12;
                int i13 = this.c1;
                this.f1 = i13;
                int i14 = this.d1;
                this.g1 = i14;
                this.i1 = this.O;
                this.V.f(0, 4, i14 != 0 ? 4 : i13 != 0 ? 3 : i12 != 0 ? 2 : 1, false);
                this.V.e(this.d1, 3);
                this.V.e(this.c1, 2);
                this.V.e(this.b1, 1);
                this.V.e(this.Z0, 0);
            }
        }
        if (i11 == 1 || i11 == 2) {
            this.J0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.T0;
            if (!j0Var.L) {
                float f7 = this.l1;
                if (f7 < 0.0f) {
                    float f10 = -f7;
                    this.l1 = f10;
                    j0Var.setProgress(f10);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (!z11) {
            char c10 = i10 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i11 == 1) {
                    this.u0.setTranslationY(i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.J0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.J0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                } else if (i11 == 2) {
                    this.u0.setTranslationY(AndroidUtilities.dp((this.A1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i10 == 0 ? 343.0f : 316.0f)) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.J0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.J0[0].setAlpha(z12 ? 0.0f : 1.0f);
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
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                }
            } else {
                this.u0.setTranslationY(0.0f);
                frameLayoutArr[i10].setTranslationY(r9.getMeasuredHeight());
                this.J0[0].setAlpha(1.0f);
                this.J0[2].setAlpha(1.0f);
                this.x0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i11 == 1 || i11 == 2) {
                this.J0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.r1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i15 = i10 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i11 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.u0, (Property<sc1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.p91 p91Var = this.J0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(p91Var, (Property<org.telegram.ui.Components.p91, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.p91, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i11 == 2) {
                sc1 sc1Var = this.u0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(sc1Var, (Property<sc1, Float>) property2, AndroidUtilities.dp((this.A1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.p91 p91Var2 = this.J0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(p91Var2, (Property<org.telegram.ui.Components.p91, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.p91, Float>) property3, z12 ? 0.0f : 1.0f));
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
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            }
        } else {
            sc1 sc1Var2 = this.u0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(sc1Var2, (Property<sc1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.p91 p91Var3 = this.J0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(p91Var3, (Property<org.telegram.ui.Components.p91, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], (Property<org.telegram.ui.Components.p91, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.x0, (Property<md1, Float>) property5, 1.0f));
        }
        this.r1.playTogether(arrayList2);
        this.r1.addListener(new ed1(this, z10, i15, i10, z12));
        this.r1.setInterpolator(org.telegram.ui.Components.hs.g);
        this.r1.setDuration(200L);
        this.r1.start();
    }

    public final void g1() {
        if (this.h2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (U0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.O1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.O1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i10 = 2;
        int[] iArr = new int[2];
        this.O1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        lc lcVar = new lc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.h2 = lcVar;
        lcVar.setOnTouchListener(new bi.d(i10));
        this.i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j2 = ofFloat;
        ofFloat.addUpdateListener(new ci.ub(this, 3));
        this.j2.addListener(new bd1(this, 4));
        this.j2.setDuration(400L);
        this.j2.setInterpolator(org.telegram.ui.Components.au.e);
        this.j2.start();
        frameLayout.addView(this.h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new kc1(this, i10));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.t1;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return this.L1 ? S0() : super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        long j3 = this.J1;
        if (j3 > 0) {
            this.z1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j3 >= 0) {
            this.z1.d(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
        int i10 = 1;
        if (chat == null) {
            this.z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.q1 == null) {
                org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.mini_switch_lock, 0);
                this.q1 = erVar;
                erVar.setTopOffset(1);
            }
            spannableStringBuilder.setSpan(this.q1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
            this.z1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.V1;
        if (tL_premium_boostsStatus2 != null) {
            this.z1.c(null, z10);
            return;
        }
        if (this.J1 >= 0 || this.T1 || this.U1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.T1 = true;
        getMessagesController().getBoostsController().getBoostsStats(this.J1, new nc1(this, i10));
    }

    public final void i1() {
        if (this.F1 && this.w1 == null) {
            Bitmap bitmap = this.C1;
            if (bitmap != null) {
                this.x1 = bitmap;
                this.w1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.x0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.x1 = imageReceiver.getBitmap();
                    this.w1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.F1) {
            b1(false);
            return;
        }
        Bitmap bitmap2 = this.w1;
        if (bitmap2 != null) {
            this.x0.setImageBitmap(bitmap2);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.a2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i10;
        long j3;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.W0;
        if (obj == null) {
            obj = this.B1;
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
                j3 = tL_wallPaper.document.size;
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.H1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j3 = i10;
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
                this.x0.invalidate();
                if (i11 == 2) {
                    if (j3 == 0 || this.J1 != 0) {
                        this.s0.setSubtitle(null);
                    } else {
                        this.s0.setSubtitle(AndroidUtilities.formatFileSize(j3));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.J1 == 0) {
                    this.s0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.x0.invalidate();
            }
            if (this.W0 == null && (frameLayout = this.y0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.c0.setEnabled(exists);
                this.c0.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.C0.setEnabled(exists);
            nd1 nd1Var = this.z1;
            if (nd1Var != null) {
                nd1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            nd1 nd1Var2 = this.A1;
            if (nd1Var2 != null) {
                nd1Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void k1() {
        this.x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.x0.invalidate();
        this.P0.f1();
        if (this.l1 >= 0.0f) {
            this.x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.x0.getImageReceiver().setBlendMode(null);
            }
            if (this.x0.getBackground() instanceof org.telegram.ui.Components.cd0) {
                this.x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.cd0) this.x0.getBackground()).k);
            }
        }
        this.a.b(this.x0.getBackground(), this.x0.getBackground(), Float.valueOf(this.l1));
        V0();
    }

    public final void l1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.W0 == null && (this.B1 instanceof ij1)) {
                this.J0[2].a(false, true);
            }
            this.J0[this.W0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.p91 p91Var = this.J0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(p91Var, (Property<org.telegram.ui.Components.p91, Float>) property, this.W0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.p91, Float>) property, this.W0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new cd1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.hs.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.J0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.W0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.J0[0].a(false, true);
        }
        this.J0[0].setEnabled(this.W0 != null);
        if (this.W0 != null) {
            this.J0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int dp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.p91, Float>) View.ALPHA, this.W0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.p91 p91Var2 = this.J0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(p91Var2, (Property<org.telegram.ui.Components.p91, Float>) property2, this.W0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J0[1], (Property<org.telegram.ui.Components.p91, Float>) property2, this.W0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.hs.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new dd1(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x008d, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r23.b1 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(boolean z10) {
        int i10;
        int i11;
        char c10;
        float f7;
        int i12;
        vc1 vc1Var;
        boolean z11;
        int i13;
        BlendMode blendMode;
        int i14 = Build.VERSION.SDK_INT;
        int i15 = this.b;
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        if (i14 >= 29) {
            if (i15 == 0) {
                i13 = g6Var != null ? (int) g6Var.l : getThemedColor(org.telegram.ui.ActionBar.i6.Pd);
            } else if (i15 == 1) {
                i13 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                long j3 = g6Var.l;
                int i16 = (int) j3;
                if (i16 != 0 || j3 == 0) {
                    if (i16 != 0) {
                        i13 = i16;
                    }
                }
                i13 = 0;
            } else {
                if (this.B1 instanceof ij1) {
                    i13 = this.c1;
                }
                i13 = 0;
            }
            if (i13 == 0 || this.l1 < 0.0f) {
                this.x0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i17 = 2;
        if (this.D0 != null) {
            if (i15 != 2) {
                if (i15 == 1) {
                    int C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Od);
                    long j10 = g6Var.k;
                    int i18 = (int) j10;
                    if (i18 == 0 && j10 != 0) {
                        C0 = 0;
                    } else if (i18 != 0) {
                        C0 = i18;
                    }
                }
                z11 = false;
            }
            boolean z12 = this.D0.getTag() != null;
            this.D0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.D0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.H0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.H0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.D0, (Property<vc1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c10 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.D0, (Property<vc1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f7 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.D0, (Property<vc1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.p91 p91Var = this.J0[0];
                    Property property = View.TRANSLATION_X;
                    i11 = 3;
                    i12 = 5;
                    i10 = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(p91Var, (Property<org.telegram.ui.Components.p91, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.J0[1], (Property<org.telegram.ui.Components.p91, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.J0[2], (Property<org.telegram.ui.Components.p91, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.H0.setDuration(180L);
                    this.H0.addListener(new bd1(this, i17));
                    this.H0.setInterpolator(org.telegram.ui.Components.hs.g);
                    this.H0.start();
                } else {
                    i10 = 0;
                    i11 = 3;
                    c10 = 4;
                    f7 = 1.0f;
                    i12 = 5;
                    this.D0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.D0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.D0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.J0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.J0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.J0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                vc1Var = this.E0;
                if (vc1Var == null) {
                    int i19 = vc1Var.getTag() != null ? 1 : i10;
                    this.E0.setTag(1);
                    if (i19 != 1) {
                        this.E0.setVisibility(i10);
                        AnimatorSet animatorSet3 = this.I0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            float f10 = f7;
                            this.E0.setAlpha(f10);
                            this.E0.setScaleX(f10);
                            this.E0.setScaleY(f10);
                            this.K0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                            this.K0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.I0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E0, (Property<vc1, Float>) View.ALPHA, f7);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.E0, (Property<vc1, Float>) View.SCALE_X, f7);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.E0, (Property<vc1, Float>) View.SCALE_Y, f7);
                        org.telegram.ui.Components.p91 p91Var2 = this.K0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(p91Var2, (Property<org.telegram.ui.Components.p91, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.p91, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[i12];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[i11] = ofFloat7;
                        animatorArr[c10] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.I0.setDuration(180L);
                        this.I0.addListener(new bd1(this, i11));
                        this.I0.setInterpolator(org.telegram.ui.Components.hs.g);
                        this.I0.start();
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
        vc1Var = this.E0;
        if (vc1Var == null) {
        }
    }

    public final void n1() {
        int childCount = this.P0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k5) {
                ((org.telegram.ui.Cells.k5) childAt).u(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!Q0(z10)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var == null || d5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
        if (this.b != 2 || this.J1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.i6.N = true;
        }
        if (i10 == 0 && this.s == null) {
            this.E1 = org.telegram.ui.ActionBar.i6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a1.g.o((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.H1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.t1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.U0 == null) {
                this.U0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        ci.m6 m6Var = this.k0;
        if (m6Var != null && this.Q != null) {
            m6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.p1 == null) {
            AndroidUtilities.runOnUIThread(new t21(3));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.w1;
            if (bitmap != null) {
                bitmap.recycle();
                this.w1 = null;
            }
            this.a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        if (this.E1) {
            this.v1.c(false);
        }
        org.telegram.ui.ActionBar.i6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        pd1 pd1Var = this.o0;
        if (pd1Var != null) {
            pd1Var.l();
        }
        td1 td1Var = this.v0;
        if (td1Var != null) {
            td1Var.l();
        }
        if (this.E1) {
            this.v1.c(true);
        }
        org.telegram.ui.ActionBar.i6.b = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.b != 2) {
            return;
        }
        this.a.b(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.a.a = e6Var;
    }

    public xd1(org.telegram.ui.ActionBar.h6 h6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.a = new xc1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.R = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.S = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.T = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.U = q5Var4;
        this.X = -1;
        this.Y = new kc1(this, 0);
        this.w0 = new md1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.n1 = 0.0f;
        this.s1 = PorterDuff.Mode.SRC_IN;
        this.y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.a30(getParentActivity(), new zc1(this));
        this.T1 = false;
        this.U1 = false;
        this.b = i10;
        this.f0 = z12;
        this.e0 = h6Var;
        this.h0 = z10;
        this.g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.g6 k10 = h6Var.k(!z11);
            this.s = k10;
            if (k10 != null) {
                this.d = false;
                this.w = k10.c;
                this.x = k10.d;
                this.y = k10.e;
                this.E = k10.f;
                this.F = k10.g;
                this.G = k10.h;
                this.H = k10.i;
                this.I = k10.j;
                this.J = k10.k;
                this.K = k10.l;
                this.L = k10.m;
                this.M = k10.p;
                this.N = k10.o;
                this.O = k10.n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.g6 k11 = h6Var.k(false);
            this.s = k11;
            if (k11 != null) {
                this.W0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        if (g6Var != null) {
            this.E1 = g6Var.q;
            if (!TextUtils.isEmpty(g6Var.o)) {
                this.l1 = this.s.p;
            }
            org.telegram.ui.ActionBar.i6.M = org.telegram.ui.ActionBar.i6.B0();
            org.telegram.ui.ActionBar.i6.O = true;
            org.telegram.ui.ActionBar.i6.P = true;
            org.telegram.ui.ActionBar.i6.t(h6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    public xd1(org.telegram.ui.ActionBar.h6 h6Var) {
        this(h6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
