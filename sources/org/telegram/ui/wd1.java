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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class wd1 extends org.telegram.ui.ActionBar.n2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.i40 A0;
    public md1 A1;
    public AnimatorSet B0;
    public Object B1;
    public u4 C0;
    public Bitmap C1;
    public uc1 D0;
    public boolean D1;
    public final int E;
    public uc1 E0;
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
    public vd1 I1;
    public final long J;
    public org.telegram.ui.Components.j81[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.j81[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.xi0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.v0 O1;
    public long P;
    public ec1 P0;
    public ValueAnimator P1;
    public ha0 Q;
    public ud1 Q0;
    public t5 Q1;
    public final org.telegram.ui.ActionBar.q5 R;
    public s4.c0 R0;
    public tc1 R1;
    public final org.telegram.ui.ActionBar.q5 S;
    public org.telegram.ui.Cells.l4 S0;
    public final org.telegram.ui.Components.j20 S1;
    public final org.telegram.ui.ActionBar.q5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.q5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.lq V;
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
    public final wc1 a;
    public di.r6 a0;
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
    public org.telegram.ui.Components.yl e;
    public final org.telegram.ui.ActionBar.i6 e0;
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
    public mc h2;
    public ArrayList i0;
    public int i1;
    public float i2;
    public z4.g j0;
    public int j1;
    public ValueAnimator j2;
    public ah.w k0;
    public int k1;
    public UndoView l0;
    public float l1;
    public FrameLayout m0;
    public float m1;
    public int n;
    public org.telegram.ui.Components.ll0 n0;
    public float n1;
    public od1 o0;
    public float o1;
    public org.telegram.ui.Components.y10 p0;
    public nd1 p1;
    public MessageObject q0;
    public org.telegram.ui.Components.nq q1;
    public Drawable r;
    public boolean r0;
    public AnimatorSet r1;
    public final org.telegram.ui.ActionBar.h6 s;
    public org.telegram.ui.ActionBar.k s0;
    public final PorterDuff.Mode s1;
    public org.telegram.ui.ActionBar.q0 t0;
    public int t1;
    public rc1 u0;
    public org.telegram.ui.Components.r9 u1;
    public boolean v;
    public sd1 v0;
    public org.telegram.ui.Components.l81 v1;
    public final int w;
    public final ld1[] w0;
    public Bitmap w1;
    public final int x;
    public ld1 x0;
    public Bitmap x1;
    public final int y;
    public FrameLayout y0;
    public float y1;
    public FrameLayout z0;
    public md1 z1;

    public wd1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new wc1(this);
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
        this.Y = new jc1(this, 0);
        this.w0 = new ld1[2];
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
        this.S1 = new org.telegram.ui.Components.j20(getParentActivity(), new yc1(this));
        this.T1 = false;
        this.U1 = false;
        this.b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof gj1) {
            gj1 gj1Var = (gj1) obj;
            this.E1 = gj1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = gj1Var.g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = gj1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    public static void U(wd1 wd1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.M;
        if (i6Var == null) {
            return;
        }
        int i10 = i6Var.Z;
        org.telegram.ui.ActionBar.h6 k10 = i10 >= 0 ? (org.telegram.ui.ActionBar.h6) i6Var.a0.get(i10) : i6Var.k(false);
        if (wd1Var.s != null) {
            wd1Var.W0();
            org.telegram.ui.ActionBar.j6.t1(wd1Var.e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.j6.M != null) {
                org.telegram.ui.ActionBar.j6.O = false;
                org.telegram.ui.ActionBar.j6.P = false;
                org.telegram.ui.ActionBar.j6.M = null;
            }
            org.telegram.ui.ActionBar.j6.t(wd1Var.e0, true, wd1Var.f0);
            ((ActionBarLayout) wd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) wd1Var.parentLayout).U(false, false);
            File file = new File(wd1Var.e0.b);
            org.telegram.ui.ActionBar.i6 i6Var2 = wd1Var.e0;
            org.telegram.ui.ActionBar.j6.u(file, i6Var2.a, i6Var2.F, false);
            MessagesController.getInstance(wd1Var.e0.E).saveTheme(wd1Var.e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", wd1Var.e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) wd1Var.getParentLayout().getFragmentStack().get(Math.max(0, wd1Var.getParentLayout().getFragmentStack().size() - 2));
        wd1Var.finishFragment();
        if (wd1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, i6Var, k10, Boolean.valueOf(wd1Var.h0));
        }
        org.telegram.ui.ActionBar.j6.F1(n2Var);
    }

    public static void V(wd1 wd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (wd1Var.getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(23, wd1Var.currentAccount, wd1Var.getParentActivity(), wd1Var, wd1Var.a);
        k0Var.G1(canApplyBoost);
        k0Var.F1(wd1Var.V1, true);
        k0Var.H1(wd1Var.J1);
        if (!wd1Var.U0()) {
            k0Var.Q0 = new jc1(wd1Var, 1);
        }
        wd1Var.showDialog(k0Var);
    }

    public static /* synthetic */ void W(wd1 wd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = wd1Var.V0;
        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            wd1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            wd1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (h6Var != null && (str = h6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            wd1Var.W0 = tL_wallPaper2;
                            wd1Var.b1(false);
                            wd1Var.j1();
                        } else if (h6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = wd1Var.W0;
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
            if (!z10 && (tL_wallPaper = wd1Var.W0) != null) {
                wd1Var.U0.add(0, tL_wallPaper);
            }
            ud1 ud1Var = wd1Var.Q0;
            if (ud1Var != null) {
                ud1Var.l();
            }
            MessagesStorage.getInstance(wd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (wd1Var.W0 != null || h6Var == null || TextUtils.isEmpty(h6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = h6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(wd1Var.currentAccount).bindRequestToGuid(wd1Var.getConnectionsManager().sendRequest(getwallpaper, new pc1(wd1Var, 0)), wd1Var.classGuid);
    }

    public static /* synthetic */ void X(wd1 wd1Var) {
        org.telegram.ui.Components.yl ylVar = wd1Var.e;
        int i10 = 0;
        if (ylVar != null) {
            ylVar.B(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            wd1Var.e.G(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        }
        Drawable drawable = wd1Var.r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = wd1Var.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (wd1Var.p1 != null) {
            org.telegram.ui.ActionBar.d5 d5Var = wd1Var.parentLayout;
            if (d5Var == null || d5Var.getBottomSheet() == null) {
                wd1Var.setNavigationBarColor(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            } else {
                wd1Var.parentLayout.getBottomSheet().fixNavigationBar(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                if (wd1Var.b == 2 && wd1Var.J1 != 0) {
                    wd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (wd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.j81[] j81VarArr = wd1Var.J0;
                if (i11 >= j81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.j81 j81Var = j81VarArr[i11];
                if (j81Var != null) {
                    j81Var.invalidate();
                }
                i11++;
            }
        }
        if (wd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.j81[] j81VarArr2 = wd1Var.K0;
                if (i10 >= j81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.j81 j81Var2 = j81VarArr2[i10];
                if (j81Var2 != null) {
                    j81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = wd1Var.e2;
        if (textView != null) {
            textView.setTextColor(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        }
        org.telegram.ui.Components.lq lqVar = wd1Var.V;
        if (lqVar != null) {
            lqVar.invalidate();
        }
        org.telegram.ui.Components.y10 y10Var = wd1Var.p0;
        if (y10Var != null) {
            y10Var.g();
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) View.SCALE_X, this.y1), ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) View.SCALE_Y, this.y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.pr.g);
        this.B0.addListener(new ad1(this, i10));
        this.B0.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fe  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(boolean z10) {
        Object obj;
        boolean z11;
        Object obj2;
        boolean z12;
        File file;
        ?? r11;
        Object obj3;
        boolean z13;
        boolean z14;
        String str;
        int i10;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i11;
        int i12;
        int i13;
        int i14;
        File pathToAttach;
        File file2;
        int i15;
        int i16;
        Object obj4;
        long j3;
        TLRPC.TL_wallPaper tL_wallPaper2;
        boolean z15;
        float f7;
        TLRPC.UserFull userFull;
        int i17 = 1;
        if (this.J1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.J1, this.V1, new oc1(this, i17));
                return;
            } else if (this.V1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        String j10 = i6Var.j(null, this.F1);
        int i18 = 0;
        String j11 = this.F1 ? i6Var.j(null, false) : j10;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), j10);
        Object obj5 = this.B1;
        if (obj5 instanceof TLRPC.TL_wallPaper) {
            if (this.x1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        this.x1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e);
                        z11 = false;
                        if (!z11) {
                        }
                        obj = null;
                        z12 = false;
                        r11 = obj;
                        if (this.F1) {
                        }
                        obj3 = this.B1;
                        int i19 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i11 = 45;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.a = j11;
                        b6Var.b = j10;
                        b6Var.c = str;
                        b6Var.i = this.F1;
                        b6Var.j = this.E1;
                        b6Var.d = i12;
                        b6Var.e = i14;
                        b6Var.f = i13;
                        b6Var.g = i10;
                        b6Var.h = i11;
                        if (this.M1) {
                        }
                        b6Var.k = this.l1;
                        obj4 = this.B1;
                        if (obj4 instanceof gj1) {
                        }
                        j3 = this.J1;
                        b6Var.n = j3;
                        if (j3 != 0) {
                        }
                        b6Var.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var, str == null && this.J1 == 0, 0L);
                        if (z13) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z15 = true;
                        if (z15) {
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } else {
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
                obj = null;
            }
            z11 = true;
            if (!z11) {
            }
            obj = null;
        } else {
            boolean z16 = obj5 instanceof gj1;
            if (z16) {
                if (this.W0 != null) {
                    try {
                        Bitmap bitmap2 = this.x0.getImageReceiver().getBitmap();
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        if (this.c1 == 0) {
                            if (this.b1 != 0) {
                                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.w9.d(this.h1), new int[]{this.Z0, this.b1});
                                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                                gradientDrawable.draw(canvas);
                            } else {
                                canvas.drawColor(this.Z0);
                            }
                        }
                        Paint paint = new Paint(2);
                        paint.setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
                        paint.setAlpha((int) (Math.abs(this.l1) * 255.0f));
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                        if (this.c1 != 0) {
                            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                        } else {
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                        }
                        fileOutputStream3.close();
                        z11 = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z11 = false;
                    }
                    z12 = false;
                    r11 = 0;
                    if (this.F1) {
                        try {
                            FileOutputStream fileOutputStream4 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), j11));
                            this.w1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            z11 = true;
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                            z11 = false;
                        }
                    }
                    obj3 = this.B1;
                    int i192 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        if (obj3 instanceof gj1) {
                            if ("d".equals(((gj1) obj3).a)) {
                                str = "d";
                                i15 = 0;
                                i16 = 0;
                                i14 = 0;
                            } else {
                                TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                                String str2 = tL_wallPaper3 != null ? tL_wallPaper3.slug : "c";
                                int i20 = this.Z0;
                                i14 = this.b1;
                                i15 = this.c1;
                                i16 = this.d1;
                                i192 = this.h1;
                                i18 = i20;
                                str = str2;
                            }
                            int i21 = i192;
                            z13 = z11;
                            i10 = i16;
                            i13 = i15;
                            i12 = i18;
                            i11 = i21;
                            z14 = z12;
                            tL_wallPaper = null;
                        } else {
                            if (obj3 instanceof hj1) {
                                hj1 hj1Var = (hj1) obj3;
                                str = hj1Var.a;
                                pathToAttach = hj1Var.d;
                            } else if (obj3 instanceof MediaController.SearchImage) {
                                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj3;
                                TLRPC.Photo photo = searchImage.photo;
                                pathToAttach = photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.H1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                str = "";
                            } else {
                                z13 = z11;
                                z14 = z12;
                                str = "d";
                                i10 = 0;
                                tL_wallPaper = null;
                                i11 = 45;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                            }
                            z13 = z11;
                            z14 = z12;
                            file2 = pathToAttach;
                            i10 = 0;
                            tL_wallPaper = null;
                        }
                        file2 = null;
                        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6();
                        b6Var2.a = j11;
                        b6Var2.b = j10;
                        b6Var2.c = str;
                        b6Var2.i = this.F1;
                        b6Var2.j = this.E1;
                        b6Var2.d = i12;
                        b6Var2.e = i14;
                        b6Var2.f = i13;
                        b6Var2.g = i10;
                        b6Var2.h = i11;
                        if (this.M1) {
                            float f10 = this.n1;
                            if (f10 >= 0.0f) {
                                b6Var2.k = f10;
                                obj4 = this.B1;
                                if (obj4 instanceof gj1) {
                                    gj1 gj1Var = (gj1) obj4;
                                    String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                                    float f11 = gj1Var.h;
                                    if (f11 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                                        f11 *= -1.0f;
                                    }
                                    if (gj1Var.l != null && gj1Var.b == i12 && gj1Var.c == i14 && gj1Var.d == i13 && gj1Var.e == i10 && TextUtils.equals(gj1Var.a, str3) && gj1Var.f == i11 && (this.W0 == null || Math.abs(f11 - this.l1) < 0.001f)) {
                                        TLRPC.WallPaper wallPaper = gj1Var.l;
                                        b6Var2.l = wallPaper.id;
                                        b6Var2.m = wallPaper.access_hash;
                                    }
                                }
                                j3 = this.J1;
                                b6Var2.n = j3;
                                if (j3 != 0 && (userFull = getMessagesController().getUserFull(this.J1)) != null) {
                                    b6Var2.t = userFull.wallpaper;
                                }
                                b6Var2.o = z10;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var2, str == null && this.J1 == 0, 0L);
                                if (z13) {
                                    if (this.J1 != 0) {
                                        if (file2 == null || getMessagesController().uploadingWallpaperInfo != b6Var2) {
                                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.J1, null, b6Var2, this.q0, new ah.j(19));
                                        } else {
                                            tL_wallPaper = new TLRPC.TL_wallPaper();
                                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                            tL_wallPaper.settings = tL_wallPaperSettings;
                                            tL_wallPaperSettings.intensity = (int) (b6Var2.k * 100.0f);
                                            tL_wallPaperSettings.blur = b6Var2.i;
                                            tL_wallPaperSettings.motion = b6Var2.j;
                                            tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                            Bitmap createBitmap2 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                            Canvas canvas2 = new Canvas(createBitmap2);
                                            float max = Math.max(50.0f / this.x0.getMeasuredWidth(), 50.0f / this.x0.getMeasuredHeight());
                                            canvas2.scale(max, max);
                                            if (this.x0.getMeasuredHeight() > this.x0.getMeasuredWidth()) {
                                                f7 = 0.0f;
                                                canvas2.translate(0.0f, (-(this.x0.getMeasuredHeight() - this.x0.getMeasuredWidth())) / 2.0f);
                                            } else {
                                                f7 = 0.0f;
                                                canvas2.translate((-(this.x0.getMeasuredWidth() - this.x0.getMeasuredHeight())) / 2.0f, 0.0f);
                                            }
                                            float f12 = this.n1;
                                            this.n1 = f7;
                                            this.x0.draw(canvas2);
                                            this.n1 = f12;
                                            Utilities.blurBitmap(createBitmap2, 3);
                                            tL_wallPaper.stripedThumb = createBitmap2;
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
                                                    int i22 = NotificationCenter.chatInfoDidLoad;
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, chatFull, 0, bool, bool);
                                                }
                                            }
                                        }
                                        this.d2 = true;
                                        vd1 vd1Var = this.I1;
                                        if (vd1Var != null) {
                                            vd1Var.a(tL_wallPaper);
                                        }
                                        finishFragment();
                                        tL_wallPaper2 = tL_wallPaper;
                                        z15 = false;
                                        if (z15) {
                                            vd1 vd1Var2 = this.I1;
                                            if (vd1Var2 != null) {
                                                vd1Var2.a(tL_wallPaper2);
                                            }
                                            finishFragment();
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.j6.c0 = getThemedColor(org.telegram.ui.ActionBar.j6.lc);
                                    org.telegram.ui.ActionBar.j6.I.v("t".equals(b6Var2.c) ? null : b6Var2);
                                    org.telegram.ui.ActionBar.j6.o1(true);
                                    if (!z14) {
                                        ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                                    }
                                }
                                tL_wallPaper2 = tL_wallPaper;
                                z15 = true;
                                if (z15) {
                                }
                            }
                        }
                        b6Var2.k = this.l1;
                        obj4 = this.B1;
                        if (obj4 instanceof gj1) {
                        }
                        j3 = this.J1;
                        b6Var2.n = j3;
                        if (j3 != 0) {
                            b6Var2.t = userFull.wallpaper;
                        }
                        b6Var2.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var2, str == null && this.J1 == 0, 0L);
                        if (z13) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z15 = true;
                        if (z15) {
                        }
                    } else {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        str = tL_wallPaper.slug;
                        z13 = z11;
                        z14 = z12;
                        file2 = r11;
                        i10 = 0;
                    }
                    i11 = 45;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    org.telegram.ui.ActionBar.b6 b6Var22 = new org.telegram.ui.ActionBar.b6();
                    b6Var22.a = j11;
                    b6Var22.b = j10;
                    b6Var22.c = str;
                    b6Var22.i = this.F1;
                    b6Var22.j = this.E1;
                    b6Var22.d = i12;
                    b6Var22.e = i14;
                    b6Var22.f = i13;
                    b6Var22.g = i10;
                    b6Var22.h = i11;
                    if (this.M1) {
                    }
                    b6Var22.k = this.l1;
                    obj4 = this.B1;
                    if (obj4 instanceof gj1) {
                    }
                    j3 = this.J1;
                    b6Var22.n = j3;
                    if (j3 != 0) {
                    }
                    b6Var22.o = z10;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var22, str == null && this.J1 == 0, 0L);
                    if (z13) {
                    }
                    tL_wallPaper2 = tL_wallPaper;
                    z15 = true;
                    if (z15) {
                    }
                } else {
                    obj2 = null;
                    z11 = true;
                    obj = obj2;
                }
            } else if (obj5 instanceof hj1) {
                hj1 hj1Var2 = (hj1) obj5;
                if (hj1Var2.b != 0 || "t".equals(hj1Var2.a)) {
                    obj2 = null;
                    z11 = true;
                    obj = obj2;
                } else {
                    try {
                    } catch (Exception e13) {
                        e = e13;
                        z16 = false;
                    }
                    try {
                        if (!this.a2 || this.X1 == this.Y1) {
                            z16 = false;
                            z16 = false;
                            File file4 = hj1Var2.e;
                            file = file4 != null ? file4 : hj1Var2.d;
                        } else {
                            Bitmap createBitmap3 = Bitmap.createBitmap((int) this.Z1, this.C1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas3 = new Canvas(createBitmap3);
                            canvas3.translate(-((this.X1 / this.W1) * (this.C1.getWidth() - createBitmap3.getWidth())), 0.0f);
                            z16 = false;
                            canvas3.drawBitmap(this.C1, 0.0f, 0.0f, (Paint) null);
                            hj1Var2.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream5 = new FileOutputStream(hj1Var2.d);
                            createBitmap3.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                            fileOutputStream5.close();
                            createBitmap3.recycle();
                            file = hj1Var2.d;
                        }
                        z12 = file.equals(file3);
                        if (z12) {
                            z11 = true;
                            r11 = z16;
                        } else {
                            try {
                                z11 = AndroidUtilities.copyFile(file, file3);
                                r11 = z16;
                            } catch (Exception e14) {
                                e = e14;
                                FileLog.e(e);
                                z11 = false;
                                r11 = z16;
                                if (this.F1) {
                                }
                                obj3 = this.B1;
                                int i1922 = 45;
                                if (obj3 instanceof TLRPC.TL_wallPaper) {
                                }
                                i11 = 45;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                                org.telegram.ui.ActionBar.b6 b6Var222 = new org.telegram.ui.ActionBar.b6();
                                b6Var222.a = j11;
                                b6Var222.b = j10;
                                b6Var222.c = str;
                                b6Var222.i = this.F1;
                                b6Var222.j = this.E1;
                                b6Var222.d = i12;
                                b6Var222.e = i14;
                                b6Var222.f = i13;
                                b6Var222.g = i10;
                                b6Var222.h = i11;
                                if (this.M1) {
                                }
                                b6Var222.k = this.l1;
                                obj4 = this.B1;
                                if (obj4 instanceof gj1) {
                                }
                                j3 = this.J1;
                                b6Var222.n = j3;
                                if (j3 != 0) {
                                }
                                b6Var222.o = z10;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var222, str == null && this.J1 == 0, 0L);
                                if (z13) {
                                }
                                tL_wallPaper2 = tL_wallPaper;
                                z15 = true;
                                if (z15) {
                                }
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        z12 = false;
                        FileLog.e(e);
                        z11 = false;
                        r11 = z16;
                        if (this.F1) {
                        }
                        obj3 = this.B1;
                        int i19222 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i11 = 45;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        org.telegram.ui.ActionBar.b6 b6Var2222 = new org.telegram.ui.ActionBar.b6();
                        b6Var2222.a = j11;
                        b6Var2222.b = j10;
                        b6Var2222.c = str;
                        b6Var2222.i = this.F1;
                        b6Var2222.j = this.E1;
                        b6Var2222.d = i12;
                        b6Var2222.e = i14;
                        b6Var2222.f = i13;
                        b6Var2222.g = i10;
                        b6Var2222.h = i11;
                        if (this.M1) {
                        }
                        b6Var2222.k = this.l1;
                        obj4 = this.B1;
                        if (obj4 instanceof gj1) {
                        }
                        j3 = this.J1;
                        b6Var2222.n = j3;
                        if (j3 != 0) {
                        }
                        b6Var2222.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var2222, str == null && this.J1 == 0, 0L);
                        if (z13) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z15 = true;
                        if (z15) {
                        }
                    }
                    if (this.F1) {
                    }
                    obj3 = this.B1;
                    int i192222 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                    }
                    i11 = 45;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    org.telegram.ui.ActionBar.b6 b6Var22222 = new org.telegram.ui.ActionBar.b6();
                    b6Var22222.a = j11;
                    b6Var22222.b = j10;
                    b6Var22222.c = str;
                    b6Var22222.i = this.F1;
                    b6Var22222.j = this.E1;
                    b6Var22222.d = i12;
                    b6Var22222.e = i14;
                    b6Var22222.f = i13;
                    b6Var22222.g = i10;
                    b6Var22222.h = i11;
                    if (this.M1) {
                    }
                    b6Var22222.k = this.l1;
                    obj4 = this.B1;
                    if (obj4 instanceof gj1) {
                    }
                    j3 = this.J1;
                    b6Var22222.n = j3;
                    if (j3 != 0) {
                    }
                    b6Var22222.o = z10;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var22222, str == null && this.J1 == 0, 0L);
                    if (z13) {
                    }
                    tL_wallPaper2 = tL_wallPaper;
                    z15 = true;
                    if (z15) {
                    }
                }
            } else {
                obj = null;
                obj = null;
                if (obj5 instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj5;
                    TLRPC.Photo photo2 = searchImage2.photo;
                    try {
                        z11 = AndroidUtilities.copyFile(photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.H1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg"), file3);
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                }
                z11 = false;
            }
        }
        z12 = false;
        r11 = obj;
        if (this.F1) {
        }
        obj3 = this.B1;
        int i1922222 = 45;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
        }
        i11 = 45;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        org.telegram.ui.ActionBar.b6 b6Var222222 = new org.telegram.ui.ActionBar.b6();
        b6Var222222.a = j11;
        b6Var222222.b = j10;
        b6Var222222.c = str;
        b6Var222222.i = this.F1;
        b6Var222222.j = this.E1;
        b6Var222222.d = i12;
        b6Var222222.e = i14;
        b6Var222222.f = i13;
        b6Var222222.g = i10;
        b6Var222222.h = i11;
        if (this.M1) {
        }
        b6Var222222.k = this.l1;
        obj4 = this.B1;
        if (obj4 instanceof gj1) {
        }
        j3 = this.J1;
        b6Var222222.n = j3;
        if (j3 != 0) {
        }
        b6Var222222.o = z10;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, b6Var222222, str == null && this.J1 == 0, 0L);
        if (z13) {
        }
        tL_wallPaper2 = tL_wallPaper;
        z15 = true;
        if (z15) {
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
        org.telegram.ui.ActionBar.j6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (i10 == 1) {
            if (this.g0) {
                h6Var.c = this.w;
                h6Var.d = this.x;
                h6Var.e = this.y;
                h6Var.f = this.E;
                h6Var.g = this.F;
                h6Var.h = this.G;
                h6Var.i = this.H;
                h6Var.j = this.I;
                h6Var.k = this.J;
                h6Var.l = this.K;
                h6Var.m = this.L;
                h6Var.n = this.O;
                h6Var.o = this.N;
                h6Var.p = this.M;
            }
            org.telegram.ui.ActionBar.j6.t1(this.e0, false, true, false, false, false);
        } else {
            if (h6Var != null) {
                org.telegram.ui.ActionBar.j6.t1(this.e0, false, this.h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.h0) {
                org.telegram.ui.ActionBar.i6 i6Var = this.e0;
                if (i6Var.b != null && org.telegram.ui.ActionBar.j6.H.get(i6Var.m()) == null) {
                    new File(i6Var.b).delete();
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
    
        if (r0.q == r7.E1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r7.l1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.h6 h6Var = this.s;
            if (h6Var.c == this.w && h6Var.d == this.x && h6Var.e == this.y && h6Var.f == this.E && h6Var.g == this.F && h6Var.h == this.G && h6Var.i == this.H && h6Var.j == this.I && h6Var.k == this.J && h6Var.l == this.K && h6Var.m == this.L && Math.abs(h6Var.p - this.M) <= 0.001f && h6Var.n == this.O) {
                String str = h6Var.o;
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new lc1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new lc1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        xy0 xy0Var = new xy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, xy0Var, i10));
        z4.g gVar = this.j0;
        int i11 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s0, TLObject.FLAG_31, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s0, TLObject.FLAG_30, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 1, null, null, null, null, i10));
            TextView textView = this.d0;
            int i14 = org.telegram.ui.ActionBar.j6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.lq lqVar = this.V;
        if (lqVar != null) {
            org.telegram.ui.ActionBar.v0 v0Var = lqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = lqVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
            }
            org.telegram.ui.ActionBar.k0 k0Var = lqVar.F;
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(k0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.k0 k0Var2 = lqVar.F;
            int i18 = org.telegram.ui.ActionBar.j6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.l6(k0Var2, 32, null, null, null, null, i18));
            if (v0Var != null) {
                org.telegram.ui.Components.z6 z6Var = new org.telegram.ui.Components.z6(lqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, z6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, z6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C0, 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.N0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.M0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.T0, 0, new Class[]{org.telegram.ui.Components.fo0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.T0, 0, new Class[]{org.telegram.ui.Components.fo0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.S0, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.m3.y;
            int i23 = org.telegram.ui.ActionBar.j6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.q3.y, null, i23));
            org.telegram.ui.ActionBar.q5 q5Var = this.R;
            org.telegram.ui.ActionBar.q5 q5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.o3.y;
            int i24 = org.telegram.ui.ActionBar.j6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.s3.y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ab));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.l6) arrayList.get(i25)).o = this.a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j3;
        if (this.g0) {
            return false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (i10 == 1 || i10 == 2) {
            long j10 = this.I;
            if (j10 == 0) {
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i11 = (int) h6Var.j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            } else if (j10 != h6Var.j) {
                return true;
            }
            long j11 = this.L;
            long j12 = this.K;
            long j13 = this.J;
            if (j13 == 0 && j12 == 0 && j11 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        j3 = h6Var.k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        j3 = h6Var.l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        j3 = h6Var.m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j13 != h6Var.k || j12 != h6Var.l || j11 != h6Var.m) {
                return true;
            }
            if (h6Var.n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.w != h6Var.d) {
                return true;
            }
            int i14 = this.y;
            if (i14 == 0) {
                int i15 = h6Var.e;
                if (i15 != 0 && i15 != h6Var.c) {
                    return true;
                }
            } else if (i14 != h6Var.e) {
                return true;
            }
            int i16 = this.E;
            if (i16 != 0) {
                if (i16 != h6Var.f) {
                    return true;
                }
            } else if (h6Var.f != 0) {
                return true;
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != h6Var.g) {
                    return true;
                }
            } else if (h6Var.g != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != h6Var.h) {
                    return true;
                }
            } else if (h6Var.h != 0) {
                return true;
            }
            if (this.H != h6Var.i) {
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
                org.telegram.ui.Components.j81[] j81VarArr = this.J0;
                if (i12 >= j81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.j81 j81Var = j81VarArr[i12];
                if (j81Var != null) {
                    j81Var.setDimAmount(this.M1 ? this.n1 * this.o1 : 0.0f);
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
        md1 md1Var = this.z1;
        if (md1Var != null) {
            md1Var.invalidate();
        }
        md1 md1Var2 = this.A1;
        if (md1Var2 != null) {
            md1Var2.invalidate();
        }
        u4 u4Var = this.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (h6Var == null || TextUtils.isEmpty(h6Var.o)) {
            return;
        }
        try {
            File d = h6Var.d();
            Drawable background = this.x0.getBackground();
            Bitmap bitmap = this.x0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.dc0) {
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
        org.telegram.ui.ActionBar.h6 h6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.n == i10 || this.r1 != null || (h6Var = this.s) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.j6.Z0() || h6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.j6.Z0() || (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.i0.d != 0)) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lc1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new lc1(this, 6));
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new lc1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i13 = this.n;
        this.n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = h6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.lq lqVar = this.V;
            T0(1);
            lqVar.f(1, 2, i14, false);
            this.V.e(h6Var.c, 0);
            int i15 = h6Var.d;
            if (i15 != 0) {
                this.V.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && h6Var.g != 0)) {
                this.v0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Nd);
            int i16 = org.telegram.ui.ActionBar.j6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.j6.c1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.j6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.j6.c1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.j6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.j6.c1(i18) ? getThemedColor(i18) : 0;
            long j3 = h6Var.k;
            int i19 = (int) j3;
            if (i19 == 0 && j3 != 0) {
                themedColor2 = 0;
            }
            long j10 = h6Var.l;
            int i20 = (int) j10;
            if (i20 == 0 && j10 != 0) {
                themedColor3 = 0;
            }
            long j11 = h6Var.m;
            int i21 = (int) j11;
            if (i21 == 0 && j11 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) h6Var.j;
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
            org.telegram.ui.Components.lq lqVar2 = this.V;
            T0(2);
            lqVar2.f(2, 4, i12, false);
            org.telegram.ui.Components.lq lqVar3 = this.V;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            lqVar3.e(i21, 3);
            org.telegram.ui.Components.lq lqVar4 = this.V;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            lqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.lq lqVar5 = this.V;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            lqVar5.e(i19, 1);
            org.telegram.ui.Components.lq lqVar6 = this.V;
            if (i22 != 0) {
                themedColor = i22;
            }
            lqVar6.e(themedColor, 0);
            if (i13 == 1 || h6Var.g == 0) {
                this.v0.o(0);
            } else {
                this.v0.m(0);
            }
            this.u0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i23 = h6Var.f != 0 ? h6Var.h != 0 ? 4 : h6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.lq lqVar7 = this.V;
            T0(3);
            lqVar7.f(2, 4, i23, true);
            this.V.e(h6Var.h, 3);
            this.V.e(h6Var.g, 2);
            this.V.e(h6Var.f, 1);
            org.telegram.ui.Components.lq lqVar8 = this.V;
            int i24 = h6Var.e;
            if (i24 == 0) {
                i24 = h6Var.c;
            }
            lqVar8.e(i24, 0);
            this.K0[1].b(0, h6Var.e);
            this.K0[1].b(1, h6Var.f);
            this.K0[1].b(2, h6Var.g);
            this.K0[1].b(3, h6Var.h);
            if (h6Var.g != 0) {
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
        ld1[] ld1VarArr = this.w0;
        ld1 ld1Var = ld1VarArr[0];
        ld1 ld1Var2 = ld1VarArr[1];
        ld1VarArr[0] = ld1Var2;
        ld1VarArr[1] = ld1Var;
        this.t0.removeView(ld1Var2);
        this.t0.addView(ld1VarArr[0], this.t0.indexOfChild(ld1VarArr[1]) + 1);
        ld1 ld1Var3 = ld1VarArr[0];
        this.x0 = ld1Var3;
        ld1Var3.setBackground(ld1VarArr[1].getBackground());
        k1();
        ld1VarArr[1].setVisibility(0);
        ld1VarArr[1].setAlpha(1.0f);
        this.x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c2 = ofFloat;
        ofFloat.addUpdateListener(new cj(2, this));
        this.c2.addListener(new ad1(this, 0));
        this.c2.setInterpolator(org.telegram.ui.Components.pr.f);
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
        org.telegram.ui.Components.dc0 dc0Var;
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
                org.telegram.ui.Components.j81[] j81VarArr = this.J0;
                if (i12 >= j81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.j81 j81Var = j81VarArr[i12];
                if (j81Var != null) {
                    j81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.j6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.x0.getBackground();
            if (background instanceof org.telegram.ui.Components.dc0) {
                dc0Var = (org.telegram.ui.Components.dc0) background;
            } else {
                dc0Var = new org.telegram.ui.Components.dc0();
                dc0Var.r(this.x0);
                if (this.D1) {
                    dc0Var.m(false);
                }
            }
            dc0Var.n(this.Z0, this.b1, this.c1, this.d1);
            this.x0.setBackground(dc0Var);
            this.j1 = dc0Var.f();
            this.k1 = 754974720;
        } else if (this.b1 != 0) {
            this.x0.setBackground(new GradientDrawable(org.telegram.ui.Components.w9.d(this.h1), new int[]{this.Z0, this.b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.b1));
            this.k1 = patternColor;
            this.j1 = patternColor;
        } else {
            this.x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.k1 = patternColor2;
            this.j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.j6.lc;
        boolean c12 = org.telegram.ui.ActionBar.j6.c1(i13);
        wc1 wc1Var = this.a;
        if (!c12 || (this.x0.getBackground() instanceof org.telegram.ui.Components.dc0)) {
            wc1Var.b(this.x0.getBackground(), this.x0.getBackground(), Float.valueOf(this.l1));
        } else if (org.telegram.ui.ActionBar.j6.s0() instanceof org.telegram.ui.Components.dc0) {
            getThemedColor(i13);
            wc1Var.b(this.x0.getBackground(), this.x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ld1 ld1Var = this.x0;
        if (ld1Var != null) {
            ld1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
            this.x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.x0.invalidate();
            if (org.telegram.ui.ActionBar.j6.I.q() && (this.x0.getBackground() instanceof org.telegram.ui.Components.dc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.dc0) this.x0.getBackground()).k);
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
        rc1 rc1Var = this.u0;
        if (rc1Var != null) {
            rc1Var.e1();
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
        org.telegram.ui.Components.dc0 dc0Var;
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        int i10 = this.b;
        if (i10 == 0 && h6Var == null) {
            this.x0.setBackground(org.telegram.ui.ActionBar.j6.r0());
        } else {
            if (i10 == 2) {
                Object obj = this.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    ld1 ld1Var = this.x0;
                    ld1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    ld1Var.d();
                } else if (obj instanceof gj1) {
                    gj1 gj1Var = (gj1) obj;
                    int i11 = gj1Var.f;
                    int i12 = gj1Var.e;
                    int i13 = gj1Var.d;
                    int i14 = gj1Var.c;
                    int i15 = gj1Var.b;
                    this.h1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        ld1 ld1Var2 = this.x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        ld1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(gj1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.dc0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof hj1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.x0.setImageBitmap(bitmap);
                    } else {
                        hj1 hj1Var = (hj1) obj;
                        File file = hj1Var.e;
                        if (file != null) {
                            this.x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = hj1Var.d;
                            if (file2 != null) {
                                this.x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(hj1Var.a)) {
                                ld1 ld1Var3 = this.x0;
                                ld1Var3.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(ld1Var3, false));
                            } else {
                                int i16 = hj1Var.b;
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
                        ld1 ld1Var4 = this.x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        ld1Var4.getClass();
                        ld1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (h6Var == null) {
                this.x0.setBackground(org.telegram.ui.ActionBar.j6.r0());
            } else {
                org.telegram.ui.Components.r9 r9Var = this.u1;
                if (r9Var != null) {
                    r9Var.dispose();
                    this.u1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i17 = (int) h6Var.j;
                if (i17 != 0) {
                    B0 = i17;
                }
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                long j3 = h6Var.k;
                int i18 = (int) j3;
                if (i18 == 0 && j3 != 0) {
                    B02 = 0;
                } else if (i18 != 0) {
                    B02 = i18;
                }
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j10 = h6Var.l;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    B03 = 0;
                } else if (i19 != 0) {
                    B03 = i19;
                }
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                long j11 = h6Var.m;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    B04 = 0;
                } else if (i20 != 0) {
                    B04 = i20;
                }
                if (TextUtils.isEmpty(h6Var.o) || org.telegram.ui.ActionBar.j6.Z0()) {
                    Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.dc0) {
                            ((org.telegram.ui.Components.dc0) s02).r(this.x0);
                        }
                        this.x0.setBackground(s02);
                    }
                } else {
                    if (B03 != 0) {
                        Drawable background = this.x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.dc0) {
                            dc0Var = (org.telegram.ui.Components.dc0) background;
                        } else {
                            org.telegram.ui.Components.dc0 dc0Var2 = new org.telegram.ui.Components.dc0();
                            dc0Var2.r(this.x0);
                            dc0Var = dc0Var2;
                            if (this.D1) {
                                dc0Var2.m(false);
                                dc0Var = dc0Var2;
                            }
                        }
                        dc0Var.n(B0, B02, B03, B04);
                        colorDrawable = dc0Var;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(org.telegram.ui.Components.w9.d(h6Var.n), new int[]{B0, B02});
                        this.u1 = w9Var.f(l.d.s(0.5f, 3), new ed1(this, 0), 100L);
                        colorDrawable = w9Var;
                    } else {
                        colorDrawable = new ColorDrawable(B0);
                    }
                    this.x0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        ld1 ld1Var5 = this.x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        ld1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.k1 = patternColor;
                    this.j1 = patternColor;
                } else if (B03 != 0) {
                    this.j1 = org.telegram.ui.Components.dc0.g(B0, B02, B03, B04);
                    this.k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.k1 = patternColor2;
                    this.j1 = patternColor2;
                }
                ld1 ld1Var6 = this.x0;
                if (ld1Var6 != null) {
                    ld1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.j1, this.s1));
                    this.x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.x0.invalidate();
                    if (org.telegram.ui.ActionBar.j6.I.q() && (this.x0.getBackground() instanceof org.telegram.ui.Components.dc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.dc0) this.x0.getBackground()).k);
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
                        org.telegram.ui.Components.j81[] j81VarArr = this.J0;
                        if (i21 >= j81VarArr.length) {
                            break;
                        }
                        j81VarArr[i21].b(0, B0);
                        this.J0[i21].b(1, B02);
                        this.J0[i21].b(2, B03);
                        this.J0[i21].b(3, B04);
                        i21++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
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
    /* JADX WARN: Code restructure failed: missing block: B:403:0x026f, code lost:
    
        if ("d".equals(((org.telegram.ui.gj1) r5).a) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0275, code lost:
    
        if ((r47.B1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0f9d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0932 A[EDGE_INSN: B:235:0x0932->B:236:0x0932 BREAK  A[LOOP:2: B:185:0x084f->B:211:0x092b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0dba  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e A[LOOP:0: B:45:0x019a->B:47:0x019e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb A[EDGE_INSN: B:48:0x01cb->B:49:0x01cb BREAK  A[LOOP:0: B:45:0x019a->B:47:0x019e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e27  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0e63  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v28 */
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
        ld1[] ld1VarArr;
        boolean z11;
        int i13;
        org.telegram.ui.ActionBar.i6 i6Var;
        float f7;
        int i14;
        org.telegram.ui.ActionBar.i6 i6Var2;
        char c10;
        Object obj;
        int i15;
        TextPaint textPaint;
        int i16;
        final int i17;
        wc1 wc1Var;
        final int i18;
        float f10;
        org.telegram.ui.ActionBar.i6 i6Var3;
        Rect rect;
        ?? r10;
        org.telegram.ui.Components.f01 f01Var;
        final int i19;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i20;
        this.R.p = (wc1) getResourceProvider();
        this.S.p = (wc1) getResourceProvider();
        this.T.p = (wc1) getResourceProvider();
        this.U.p = (wc1) getResourceProvider();
        int i21 = 1;
        this.hasOwnBackground = true;
        nd1 nd1Var = this.p1;
        int i22 = 0;
        boolean z12 = (nd1Var == null || this.J1 == 0) ? false : true;
        this.L1 = z12;
        if (z12) {
            Object obj2 = this.B1;
            if (!(obj2 instanceof hj1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.M1 = z10;
            if (z10) {
                this.o1 = nd1Var.a() ? 1.0f : 0.0f;
            }
            d5Var = this.parentLayout;
            if (d5Var != null && ((ActionBarLayout) d5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.m0 = new FrameLayout(context);
            i10 = 3;
            if (this.M1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new jc1(this, i10), 2000L);
            }
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new hd1();
            a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.e5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            j0 j0Var = new j0(this, context, 24);
            this.m0 = j0Var;
            j0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            this.m0.addView(this.actionBar, w7.x5.c(-2.0f, -1));
            org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context);
            this.n0 = ll0Var;
            ll0Var.setVerticalScrollBarEnabled(true);
            this.n0.setItemAnimator(null);
            this.n0.setLayoutAnimation(null);
            this.n0.setLayoutManager(new s4.c0(1, false));
            final int i23 = 2;
            this.n0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.ll0 ll0Var2 = this.n0;
            i11 = this.b;
            ll0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
            this.n0.setOnItemClickListener(new org.telegram.ui.Components.n7(i23));
            this.m0.addView(this.n0, w7.x5.e(-1, -1, 51));
            org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider);
            this.p0 = y10Var;
            y10Var.setImageResource(R.drawable.floating_pencil);
            this.m0.addView(this.p0, org.telegram.ui.Components.y10.b());
            od1 od1Var = new od1(context);
            this.o0 = od1Var;
            this.n0.setAdapter(od1Var);
            this.t0 = new org.telegram.ui.ActionBar.q0(this, context, i10);
            this.v0 = new sd1(context, this);
            this.s0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.s0.setOccupyStatusBar(false);
            }
            i2.g.x(false, this.s0);
            this.s0.setActionBarMenuOnItemClick(new kd1(this));
            i12 = 0;
            while (true) {
                ld1VarArr = this.w0;
                if (i12 < 2) {
                    break;
                }
                ld1VarArr[i12] = new ld1(this, (Activity) getContext());
                this.t0.addView(ld1VarArr[i12], w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i12++;
            }
            ld1 ld1Var = ld1VarArr[0];
            this.x0 = ld1Var;
            ld1Var.setVisibility(0);
            ld1VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.x0.getImageReceiver().setDelegate(new lc1(this, i22));
            }
            z11 = this.v0.e;
            org.telegram.ui.ActionBar.i6 i6Var4 = this.e0;
            final int i24 = 4;
            if (!z11) {
                this.s0.setTitle("Telegram Beta Chat");
                this.s0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
            } else if (i11 == 2) {
                if (this.J1 != 0) {
                    this.s0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.s0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.z n10 = this.s0.n();
                Object obj3 = this.B1;
                if ((obj3 instanceof hj1) && ((hj1) obj3).e != null) {
                    n10.a(7, R.drawable.msg_header_draw);
                }
                if (this.J1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.j6.m0().k(false) == null) {
                        Object obj4 = this.B1;
                        if (obj4 instanceof gj1) {
                        }
                    }
                    n10.a(5, R.drawable.msg_header_share);
                }
                if (this.J1 != 0 && this.L1) {
                    org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.N1 = xi0Var;
                    this.O1 = n10.d(6, xi0Var);
                    this.N1.h = true;
                    nd1 nd1Var2 = this.p1;
                    if (nd1Var2 == null || nd1Var2.a()) {
                        this.N1.K(35);
                        this.N1.N(36);
                    } else {
                        this.N1.N(0);
                        this.N1.K(0);
                    }
                    this.N1.a0 = true;
                    int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.J9);
                    this.N1.O(u02, "Sunny");
                    this.N1.O(u02, "Path 6");
                    this.N1.O(u02, "Path");
                    this.N1.O(u02, "Path 5");
                    this.N1.m();
                }
            } else if (i11 == 1) {
                org.telegram.ui.ActionBar.z n11 = this.s0.n();
                this.f = n11.e(4, LocaleController.getString(R.string.Save));
                org.telegram.ui.Components.yl ylVar = new org.telegram.ui.Components.yl(this, context, n11);
                this.e = ylVar;
                ylVar.setSubMenuOpenSide(1);
                this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                this.e.D();
                this.e.setForceSmoothKeyboard(true);
                this.s0.addView(this.e, w7.x5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kc1
                    public final /* synthetic */ wd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                wd1.U(this.b);
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
                int i25 = org.telegram.ui.ActionBar.j6.A8;
                textView2.setTextColor(getThemedColor(i25));
                this.h.setTypeface(AndroidUtilities.bold());
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), PorterDuff.Mode.MULTIPLY));
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                this.e.addView(this.h, w7.x5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = i6Var4.F;
                String n12 = tL_theme != null ? tL_theme.title : i6Var4.n();
                int lastIndexOf = n12.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    n12 = n12.substring(0, lastIndexOf);
                }
                this.s0.setTitle(n12);
                TLRPC.TL_theme tL_theme2 = i6Var4.F;
                if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                    this.s0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.s0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i13, new Object[0]));
                }
            }
            this.u0 = new rc1(context, this);
            sc1 sc1Var = new sc1(this);
            sc1Var.S();
            this.u0.setItemAnimator(sc1Var);
            this.u0.setVerticalScrollBarEnabled(true);
            this.u0.setOverScrollMode(2);
            if (i11 != 2) {
                rc1 rc1Var = this.u0;
                int dp = AndroidUtilities.dp(4.0f);
                if (this.K1) {
                    i6Var = i6Var4;
                    f7 = 16.0f;
                } else {
                    i6Var = i6Var4;
                    f7 = 16.0f;
                    if (this.J1 > 0) {
                        i20 = 58;
                        rc1Var.setPadding(0, dp, 0, (AndroidUtilities.dp(72 + i20) - 12) + (!U0() ? AndroidUtilities.navigationBarHeight : 0));
                    }
                }
                i20 = 0;
                rc1Var.setPadding(0, dp, 0, (AndroidUtilities.dp(72 + i20) - 12) + (!U0() ? AndroidUtilities.navigationBarHeight : 0));
            } else {
                i6Var = i6Var4;
                f7 = 16.0f;
                if (i11 == 1) {
                    this.u0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                } else {
                    this.u0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                }
            }
            this.u0.setClipToPadding(false);
            this.u0.setLayoutManager(new s4.c0(1, true));
            this.u0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            if (i11 != 1) {
                this.t0.addView(this.u0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.u0.setOnItemClickListener(new lc1(this, i21));
                i14 = -1;
            } else {
                i14 = -1;
                this.t0.addView(this.u0, w7.x5.e(-1, -1, 51));
            }
            this.u0.setOnScrollListener(new i3(this, 29));
            this.t0.addView(this.s0, w7.x5.c(-2.0f, i14));
            org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(context);
            this.v1 = l81Var;
            l81Var.b(new lc1(this, i23));
            org.telegram.ui.ActionBar.h6 h6Var = this.s;
            if (i11 != 1 || i11 == 2) {
                if (i11 != 2) {
                    u4 u4Var = new u4(this, context, U0());
                    this.C0 = u4Var;
                    u4Var.setWillNotDraw(false);
                    c10 = 2;
                    this.C0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.t0.addView(this.C0, w7.x5.e(-1, 0, 81));
                    md1 md1Var = new md1(context, this);
                    this.z1 = md1Var;
                    w7.z5.b(md1Var, 0.033f, 1.2f);
                    h1(false);
                    this.z1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kc1
                        public final /* synthetic */ wd1 b;

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
                                    wd1.U(this.b);
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
                    i6Var2 = i6Var;
                    if (this.J1 <= 0 || this.K1 || this.q0 != null) {
                        this.C0.addView(this.z1, w7.x5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        md1 md1Var2 = new md1(context, this);
                        this.A1 = md1Var2;
                        w7.z5.b(md1Var2, 0.033f, 1.2f);
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.J1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().isPremium()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                        this.A1.d(spannableStringBuilder);
                        try {
                            md1 md1Var3 = this.A1;
                            CharSequence b10 = md1Var3.b();
                            f01Var = this.A1.a;
                            md1Var3.d(Emoji.replaceEmoji(b10, f01Var.i(), false));
                        } catch (Exception unused) {
                        }
                        this.A1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kc1
                            public final /* synthetic */ wd1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        this.b.O0(false);
                                        break;
                                    case 1:
                                        wd1.U(this.b);
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
                        this.C0.addView(this.z1, w7.x5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.C0.addView(this.A1, w7.x5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.M1) {
                        t5 t5Var = new t5(this, (Activity) getContext());
                        this.Q1 = t5Var;
                        t5Var.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                        this.t0.addView(this.Q1, w7.x5.e(222, 76, 49));
                        tc1 tc1Var = new tc1((Activity) getContext());
                        this.R1 = tc1Var;
                        tc1Var.d(this.n1);
                        this.R1.b();
                        this.R1.c(new t3(this, 21));
                        this.Q1.addView(this.R1);
                        nd1 nd1Var3 = this.p1;
                        if (nd1Var3 != null) {
                            this.R1.setVisibility(nd1Var3.a() ? 0 : 8);
                            this.R1.setAlpha(this.p1.a() ? 1.0f : 0.0f);
                            this.R1.d(this.p1.a() ? this.n1 : 0.0f);
                        }
                    }
                } else {
                    i6Var2 = i6Var;
                    c10 = 2;
                }
                Rect rect2 = new Rect();
                Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.r = mutate2;
                mutate2.getPadding(rect2);
                this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.d6), PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint2 = new TextPaint(1);
                textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint2.setTypeface(AndroidUtilities.bold());
                obj = this.B1;
                if (i11 != 1 || (obj instanceof gj1)) {
                    if ((obj instanceof gj1) || !"d".equals(((gj1) obj).a)) {
                        i15 = 3;
                        String[] strArr = new String[i15];
                        int[] iArr = new int[i15];
                        this.J0 = new org.telegram.ui.Components.j81[i15];
                        if (i15 != 0) {
                            this.y0 = new FrameLayout(context);
                            if (i11 == 1 || (this.B1 instanceof gj1)) {
                                strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                strArr[c10] = LocaleController.getString(R.string.BackgroundMotion);
                            } else {
                                strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                            }
                            int i26 = 0;
                            i16 = 0;
                            while (i26 < i15) {
                                int ceil = (int) Math.ceil(textPaint2.measureText(strArr[i26]));
                                iArr[i26] = ceil;
                                i16 = Math.max(i16, ceil);
                                i26++;
                                textPaint2 = textPaint2;
                            }
                            textPaint = textPaint2;
                            uc1 uc1Var = new uc1(this, context, 0);
                            this.D0 = uc1Var;
                            uc1Var.setWillNotDraw(false);
                            this.D0.setVisibility(this.b1 != 0 ? 0 : 4);
                            this.D0.setScaleX(this.b1 != 0 ? 1.0f : 0.1f);
                            this.D0.setScaleY(this.b1 != 0 ? 1.0f : 0.1f);
                            this.D0.setAlpha(this.b1 != 0 ? 1.0f : 0.0f);
                            this.D0.setTag(this.b1 != 0 ? 1 : null);
                            this.y0.addView(this.D0, w7.x5.e(48, 48, 17));
                            this.D0.setOnClickListener(new vc1(this, i22));
                            ImageView imageView = new ImageView(context);
                            this.F0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.F0.setImageResource(R.drawable.bg_rotate_large);
                            this.D0.addView(this.F0, w7.x5.e(-2, -2, 17));
                        } else {
                            textPaint = textPaint2;
                            i16 = 0;
                        }
                        i17 = 0;
                        while (true) {
                            wc1Var = this.a;
                            if (i17 >= i15) {
                                break;
                            }
                            this.J0[i17] = new org.telegram.ui.Components.j81(context, ((i11 == 1 || (this.B1 instanceof gj1)) && i17 == 0) ? false : true, this.x0, wc1Var);
                            this.J0[i17].setBackgroundColor(this.Z0);
                            org.telegram.ui.Components.j81 j81Var = this.J0[i17];
                            String str = strArr[i17];
                            int i27 = iArr[i17];
                            j81Var.f = str;
                            j81Var.h = i27;
                            j81Var.n = i16;
                            int i28 = 1;
                            if (i11 != 1) {
                                if (this.B1 instanceof gj1) {
                                    i28 = 1;
                                } else {
                                    j81Var.a(i17 == 0 ? this.F1 : this.E1, false);
                                    int dp2 = AndroidUtilities.dp(56.0f) + i16;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp2, -2);
                                    layoutParams.gravity = 17;
                                    if (i15 != 3) {
                                        if (i17 == 0 || i17 == 2) {
                                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                        } else {
                                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                        }
                                    } else if (i17 == 1) {
                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                    } else {
                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                    }
                                    this.y0.addView(this.J0[i17], layoutParams);
                                    final org.telegram.ui.Components.j81 j81Var2 = this.J0[i17];
                                    final int i29 = 0;
                                    j81Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mc1
                                        public final /* synthetic */ wd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i29) {
                                                case 0:
                                                    wd1 wd1Var = this.b;
                                                    int i30 = wd1Var.b;
                                                    FrameLayout[] frameLayoutArr = wd1Var.L0;
                                                    if (wd1Var.y0.getAlpha() == 1.0f && wd1Var.r1 == null) {
                                                        int i31 = i17;
                                                        org.telegram.ui.Components.j81 j81Var3 = j81Var2;
                                                        if ((i30 != 1 && !(wd1Var.B1 instanceof gj1)) || i31 != 2) {
                                                            if (i31 != 1 || (i30 != 1 && !(wd1Var.B1 instanceof gj1))) {
                                                                if (!(wd1Var.B1 instanceof gj1)) {
                                                                    if (i30 != 1) {
                                                                        j81Var3.a(!j81Var3.s, true);
                                                                        if (i31 != 0) {
                                                                            boolean z13 = j81Var3.s;
                                                                            wd1Var.E1 = z13;
                                                                            wd1Var.v1.c(z13);
                                                                            wd1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = j81Var3.s;
                                                                            wd1Var.F1 = z14;
                                                                            if (z14) {
                                                                                wd1Var.x0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            wd1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    wd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (wd1Var.J0[1].s) {
                                                                    wd1Var.Y0 = wd1Var.W0;
                                                                    wd1Var.x0.setImageDrawable(null);
                                                                    wd1Var.W0 = null;
                                                                    wd1Var.E1 = false;
                                                                    wd1Var.j1();
                                                                    wd1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i30 == 1) {
                                                                            wd1Var.f1(0, true, true);
                                                                        } else {
                                                                            wd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    wd1Var.Z0(wd1Var.Y0 != null ? -1 : 0);
                                                                    if (i30 == 1) {
                                                                        wd1Var.f1(1, true, true);
                                                                    } else {
                                                                        wd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                wd1Var.J0[1].a(wd1Var.W0 != null, true);
                                                                wd1Var.n1();
                                                                wd1Var.P0.e1();
                                                                wd1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            j81Var3.a(!j81Var3.s, true);
                                                            boolean z15 = j81Var3.s;
                                                            wd1Var.E1 = z15;
                                                            wd1Var.v1.c(z15);
                                                            wd1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    wd1 wd1Var2 = this.b;
                                                    if (wd1Var2.z0.getAlpha() == 1.0f && i17 == 0) {
                                                        org.telegram.ui.Components.j81 j81Var4 = j81Var2;
                                                        j81Var4.a(!j81Var4.s, true);
                                                        wd1Var2.s.i = j81Var4.s;
                                                        org.telegram.ui.ActionBar.j6.n1(true, true);
                                                        wd1Var2.u0.e1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i17 != 2) {
                                        this.J0[i17].setAlpha(0.0f);
                                        this.J0[i17].setVisibility(4);
                                    }
                                    i17++;
                                }
                            }
                            if (i17 == i28) {
                                j81Var.a((this.W0 == null && (h6Var == null || TextUtils.isEmpty(h6Var.o))) ? false : true, false);
                            } else if (i17 == 2) {
                                j81Var.a(this.E1, false);
                            }
                            int dp22 = AndroidUtilities.dp(56.0f) + i16;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp22, -2);
                            layoutParams2.gravity = 17;
                            if (i15 != 3) {
                            }
                            this.y0.addView(this.J0[i17], layoutParams2);
                            final org.telegram.ui.Components.j81 j81Var22 = this.J0[i17];
                            final int i292 = 0;
                            j81Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mc1
                                public final /* synthetic */ wd1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i292) {
                                        case 0:
                                            wd1 wd1Var = this.b;
                                            int i30 = wd1Var.b;
                                            FrameLayout[] frameLayoutArr = wd1Var.L0;
                                            if (wd1Var.y0.getAlpha() == 1.0f && wd1Var.r1 == null) {
                                                int i31 = i17;
                                                org.telegram.ui.Components.j81 j81Var3 = j81Var22;
                                                if ((i30 != 1 && !(wd1Var.B1 instanceof gj1)) || i31 != 2) {
                                                    if (i31 != 1 || (i30 != 1 && !(wd1Var.B1 instanceof gj1))) {
                                                        if (!(wd1Var.B1 instanceof gj1)) {
                                                            if (i30 != 1) {
                                                                j81Var3.a(!j81Var3.s, true);
                                                                if (i31 != 0) {
                                                                    boolean z13 = j81Var3.s;
                                                                    wd1Var.E1 = z13;
                                                                    wd1Var.v1.c(z13);
                                                                    wd1Var.M0();
                                                                    break;
                                                                } else {
                                                                    boolean z14 = j81Var3.s;
                                                                    wd1Var.F1 = z14;
                                                                    if (z14) {
                                                                        wd1Var.x0.getImageReceiver().setForceCrossfade(true);
                                                                    }
                                                                    wd1Var.i1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            wd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (wd1Var.J0[1].s) {
                                                            wd1Var.Y0 = wd1Var.W0;
                                                            wd1Var.x0.setImageDrawable(null);
                                                            wd1Var.W0 = null;
                                                            wd1Var.E1 = false;
                                                            wd1Var.j1();
                                                            wd1Var.M0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i30 == 1) {
                                                                    wd1Var.f1(0, true, true);
                                                                } else {
                                                                    wd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            wd1Var.Z0(wd1Var.Y0 != null ? -1 : 0);
                                                            if (i30 == 1) {
                                                                wd1Var.f1(1, true, true);
                                                            } else {
                                                                wd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        wd1Var.J0[1].a(wd1Var.W0 != null, true);
                                                        wd1Var.n1();
                                                        wd1Var.P0.e1();
                                                        wd1Var.l1();
                                                        break;
                                                    }
                                                } else {
                                                    j81Var3.a(!j81Var3.s, true);
                                                    boolean z15 = j81Var3.s;
                                                    wd1Var.E1 = z15;
                                                    wd1Var.v1.c(z15);
                                                    wd1Var.M0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            wd1 wd1Var2 = this.b;
                                            if (wd1Var2.z0.getAlpha() == 1.0f && i17 == 0) {
                                                org.telegram.ui.Components.j81 j81Var4 = j81Var22;
                                                j81Var4.a(!j81Var4.s, true);
                                                wd1Var2.s.i = j81Var4.s;
                                                org.telegram.ui.ActionBar.j6.n1(true, true);
                                                wd1Var2.u0.e1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i17 != 2) {
                            }
                            i17++;
                        }
                        if (i11 == 1) {
                            int[] iArr2 = new int[2];
                            this.K0 = new org.telegram.ui.Components.j81[2];
                            this.z0 = new FrameLayout(context);
                            String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                            int i30 = 0;
                            int i31 = 0;
                            for (int i32 = 2; i30 < i32; i32 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i30]));
                                iArr2[i30] = ceil2;
                                i31 = Math.max(i31, ceil2);
                                i30++;
                            }
                            if (h6Var != null) {
                                uc1 uc1Var2 = new uc1(this, context, 1);
                                this.E0 = uc1Var2;
                                uc1Var2.setWillNotDraw(false);
                                this.E0.setVisibility(h6Var.f != 0 ? 0 : 4);
                                this.E0.setScaleX(h6Var.f != 0 ? 1.0f : 0.1f);
                                this.E0.setScaleY(h6Var.f != 0 ? 1.0f : 0.1f);
                                this.E0.setAlpha(h6Var.f != 0 ? 1.0f : 0.0f);
                                this.z0.addView(this.E0, w7.x5.e(48, 48, 17));
                                this.E0.setOnClickListener(new vc1(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.G0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.G0.setImageResource(R.drawable.bg_rotate_large);
                                this.E0.addView(this.G0, w7.x5.e(-2, -2, 17));
                                final int i33 = 0;
                                while (i33 < 2) {
                                    this.K0[i33] = new org.telegram.ui.Components.j81(context, i33 == 0, this.x0, wc1Var);
                                    org.telegram.ui.Components.j81 j81Var3 = this.K0[i33];
                                    String str2 = strArr2[i33];
                                    int i34 = iArr2[i33];
                                    j81Var3.f = str2;
                                    j81Var3.h = i34;
                                    j81Var3.n = i31;
                                    if (i33 == 0) {
                                        j81Var3.a(h6Var.i, false);
                                    }
                                    int dp3 = AndroidUtilities.dp(56.0f) + i31;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i33 == 1) {
                                        layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    }
                                    this.z0.addView(this.K0[i33], layoutParams3);
                                    final org.telegram.ui.Components.j81 j81Var4 = this.K0[i33];
                                    final int i35 = 1;
                                    j81Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mc1
                                        public final /* synthetic */ wd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i35) {
                                                case 0:
                                                    wd1 wd1Var = this.b;
                                                    int i302 = wd1Var.b;
                                                    FrameLayout[] frameLayoutArr = wd1Var.L0;
                                                    if (wd1Var.y0.getAlpha() == 1.0f && wd1Var.r1 == null) {
                                                        int i312 = i33;
                                                        org.telegram.ui.Components.j81 j81Var32 = j81Var4;
                                                        if ((i302 != 1 && !(wd1Var.B1 instanceof gj1)) || i312 != 2) {
                                                            if (i312 != 1 || (i302 != 1 && !(wd1Var.B1 instanceof gj1))) {
                                                                if (!(wd1Var.B1 instanceof gj1)) {
                                                                    if (i302 != 1) {
                                                                        j81Var32.a(!j81Var32.s, true);
                                                                        if (i312 != 0) {
                                                                            boolean z13 = j81Var32.s;
                                                                            wd1Var.E1 = z13;
                                                                            wd1Var.v1.c(z13);
                                                                            wd1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = j81Var32.s;
                                                                            wd1Var.F1 = z14;
                                                                            if (z14) {
                                                                                wd1Var.x0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            wd1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    wd1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (wd1Var.J0[1].s) {
                                                                    wd1Var.Y0 = wd1Var.W0;
                                                                    wd1Var.x0.setImageDrawable(null);
                                                                    wd1Var.W0 = null;
                                                                    wd1Var.E1 = false;
                                                                    wd1Var.j1();
                                                                    wd1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i302 == 1) {
                                                                            wd1Var.f1(0, true, true);
                                                                        } else {
                                                                            wd1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    wd1Var.Z0(wd1Var.Y0 != null ? -1 : 0);
                                                                    if (i302 == 1) {
                                                                        wd1Var.f1(1, true, true);
                                                                    } else {
                                                                        wd1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                wd1Var.J0[1].a(wd1Var.W0 != null, true);
                                                                wd1Var.n1();
                                                                wd1Var.P0.e1();
                                                                wd1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            j81Var32.a(!j81Var32.s, true);
                                                            boolean z15 = j81Var32.s;
                                                            wd1Var.E1 = z15;
                                                            wd1Var.v1.c(z15);
                                                            wd1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    wd1 wd1Var2 = this.b;
                                                    if (wd1Var2.z0.getAlpha() == 1.0f && i33 == 0) {
                                                        org.telegram.ui.Components.j81 j81Var42 = j81Var4;
                                                        j81Var42.a(!j81Var42.s, true);
                                                        wd1Var2.s.i = j81Var42.s;
                                                        org.telegram.ui.ActionBar.j6.n1(true, true);
                                                        wd1Var2.u0.e1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i33++;
                                }
                            }
                        }
                        if (i11 != 1 || (this.B1 instanceof gj1)) {
                            this.F1 = false;
                            i18 = 0;
                            while (i18 < 2) {
                                xc1 xc1Var = new xc1(this, context, i18, rect2);
                                ViewGroup[] viewGroupArr = this.L0;
                                viewGroupArr[i18] = xc1Var;
                                if (i18 == 1 || i11 == 2) {
                                    xc1Var.setVisibility(4);
                                }
                                viewGroupArr[i18].setWillNotDraw(false);
                                FrameLayout.LayoutParams e7 = i11 == 2 ? w7.x5.e(-1, i18 == 0 ? 321 : 316, 83) : w7.x5.e(-1, i18 == 0 ? 273 : 316, 83);
                                e7.height = AndroidUtilities.dp(i18 == 0 ? i11 == 2 ? 321 : 273 : 316.0f);
                                if (U0()) {
                                    e7.height += AndroidUtilities.navigationBarHeight;
                                }
                                if (i18 == 0) {
                                    Drawable drawable = this.r;
                                    Rect rect3 = AndroidUtilities.rectTmp2;
                                    drawable.getPadding(rect3);
                                    e7.height = AndroidUtilities.dp(12.0f) + rect3.top + e7.height;
                                }
                                viewGroupArr[i18].setPadding(0, i18 == 0 ? AndroidUtilities.dp(12.0f) + rect2.top : 0, 0, U0() ? AndroidUtilities.navigationBarHeight : 0);
                                this.t0.addView(viewGroupArr[i18], e7);
                                if (i18 == 1 || i11 == 2) {
                                    ah.w wVar = new ah.w(this, context, 27);
                                    ViewGroup[] viewGroupArr2 = this.O0;
                                    viewGroupArr2[i18] = wVar;
                                    wVar.setWillNotDraw(false);
                                    viewGroupArr2[i18].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                    viewGroupArr2[i18].setClickable(true);
                                    f10 = 21.0f;
                                    viewGroupArr[i18].addView(viewGroupArr2[i18], w7.x5.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.M0;
                                    textViewArr[i18] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i18].setTypeface(AndroidUtilities.bold());
                                    TextView textView4 = textViewArr[i18];
                                    int i36 = org.telegram.ui.ActionBar.j6.Ae;
                                    textView4.setTextColor(getThemedColor(i36));
                                    textViewArr[i18].setText(LocaleController.getString(R.string.Cancel));
                                    textViewArr[i18].setGravity(17);
                                    textViewArr[i18].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    TextView textView5 = textViewArr[i18];
                                    int i37 = org.telegram.ui.ActionBar.j6.i6;
                                    textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(getThemedColor(i37), 0));
                                    i6Var3 = i6Var2;
                                    rect = rect2;
                                    viewGroupArr2[i18].addView(textViewArr[i18], w7.x5.e(-2, -1, 51));
                                    final int i38 = 0;
                                    textViewArr[i18].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qc1
                                        public final /* synthetic */ wd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i38) {
                                                case 0:
                                                    wd1 wd1Var = this.b;
                                                    if (wd1Var.r1 == null) {
                                                        int i39 = i18;
                                                        if (i39 == 0) {
                                                            wd1Var.h1 = wd1Var.i1;
                                                            wd1Var.a1(wd1Var.g1, 3, true);
                                                            wd1Var.a1(wd1Var.f1, 2, true);
                                                            wd1Var.a1(wd1Var.e1, 1, true);
                                                            wd1Var.a1(wd1Var.a1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = wd1Var.X0;
                                                            wd1Var.W0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                wd1Var.x0.setImageDrawable(null);
                                                            } else {
                                                                ld1 ld1Var2 = wd1Var.x0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = wd1Var.G1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = wd1Var.W0;
                                                                ld1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            wd1Var.J0[1].a(wd1Var.W0 != null, false);
                                                            float f11 = wd1Var.m1;
                                                            wd1Var.l1 = f11;
                                                            wd1Var.T0.setProgress(f11);
                                                            wd1Var.x0.getImageReceiver().setAlpha(wd1Var.l1);
                                                            wd1Var.j1();
                                                            wd1Var.n1();
                                                        }
                                                        if (wd1Var.b != 2) {
                                                            if (wd1Var.W0 == null) {
                                                                if (wd1Var.E1) {
                                                                    wd1Var.E1 = false;
                                                                    wd1Var.J0[0].a(false, true);
                                                                    wd1Var.M0();
                                                                }
                                                                wd1Var.l1();
                                                            }
                                                            wd1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            wd1Var.f1(i39, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    wd1 wd1Var2 = this.b;
                                                    if (wd1Var2.r1 == null) {
                                                        if (wd1Var2.b != 2) {
                                                            wd1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            wd1Var2.f1(i18, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.N0;
                                    textViewArr2[i18] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i18].setTypeface(AndroidUtilities.bold());
                                    textViewArr2[i18].setTextColor(getThemedColor(i36));
                                    textViewArr2[i18].setText(LocaleController.getString(R.string.ApplyTheme));
                                    textViewArr2[i18].setGravity(17);
                                    textViewArr2[i18].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    textViewArr2[i18].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(getThemedColor(i37), 0));
                                    viewGroupArr2[i18].addView(textViewArr2[i18], w7.x5.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i18];
                                    r10 = 1;
                                    final char c11 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qc1
                                        public final /* synthetic */ wd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c11) {
                                                case 0:
                                                    wd1 wd1Var = this.b;
                                                    if (wd1Var.r1 == null) {
                                                        int i39 = i18;
                                                        if (i39 == 0) {
                                                            wd1Var.h1 = wd1Var.i1;
                                                            wd1Var.a1(wd1Var.g1, 3, true);
                                                            wd1Var.a1(wd1Var.f1, 2, true);
                                                            wd1Var.a1(wd1Var.e1, 1, true);
                                                            wd1Var.a1(wd1Var.a1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = wd1Var.X0;
                                                            wd1Var.W0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                wd1Var.x0.setImageDrawable(null);
                                                            } else {
                                                                ld1 ld1Var2 = wd1Var.x0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = wd1Var.G1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = wd1Var.W0;
                                                                ld1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            wd1Var.J0[1].a(wd1Var.W0 != null, false);
                                                            float f11 = wd1Var.m1;
                                                            wd1Var.l1 = f11;
                                                            wd1Var.T0.setProgress(f11);
                                                            wd1Var.x0.getImageReceiver().setAlpha(wd1Var.l1);
                                                            wd1Var.j1();
                                                            wd1Var.n1();
                                                        }
                                                        if (wd1Var.b != 2) {
                                                            if (wd1Var.W0 == null) {
                                                                if (wd1Var.E1) {
                                                                    wd1Var.E1 = false;
                                                                    wd1Var.J0[0].a(false, true);
                                                                    wd1Var.M0();
                                                                }
                                                                wd1Var.l1();
                                                            }
                                                            wd1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            wd1Var.f1(i39, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    wd1 wd1Var2 = this.b;
                                                    if (wd1Var2.r1 == null) {
                                                        if (wd1Var2.b != 2) {
                                                            wd1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            wd1Var2.f1(i18, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    i6Var3 = i6Var2;
                                    rect = rect2;
                                    r10 = 1;
                                    f10 = 21.0f;
                                }
                                if (i18 == r10) {
                                    TextView textView8 = new TextView(context);
                                    this.e2 = textView8;
                                    textView8.setLines(r10);
                                    this.e2.setSingleLine(r10);
                                    this.e2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                    this.e2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                                    this.e2.setTextSize(r10, 20.0f);
                                    this.e2.setTypeface(AndroidUtilities.bold());
                                    this.e2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                                    this.e2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.e2.setGravity(16);
                                    viewGroupArr[i18].addView(this.e2, w7.x5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    ec1 ec1Var = new ec1(context);
                                    this.P0 = ec1Var;
                                    s4.c0 c0Var = new s4.c0(0, false);
                                    this.R0 = c0Var;
                                    ec1Var.setLayoutManager(c0Var);
                                    ec1 ec1Var2 = this.P0;
                                    ud1 ud1Var = new ud1(context, this);
                                    this.Q0 = ud1Var;
                                    ec1Var2.setAdapter(ud1Var);
                                    this.P0.i(new bi.o(9));
                                    viewGroupArr[i18].addView(this.P0, w7.x5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.P0.setOnItemClickListener(new b31(this, 7));
                                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
                                    this.S0 = l4Var;
                                    l4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                    viewGroupArr[i18].addView(this.S0, w7.x5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.j0 j0Var2 = new org.telegram.ui.Cells.j0(context, (wc1) getResourceProvider());
                                    this.T0 = j0Var2;
                                    j0Var2.setProgress(this.l1);
                                    this.T0.setReportChanges(true);
                                    this.T0.setDelegate(new yc1(this));
                                    viewGroupArr[i18].addView(this.T0, w7.x5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(context, this.g0, new zc1(this));
                                    this.V = lqVar;
                                    lqVar.setResourcesProvider(getResourceProvider());
                                    if (i11 == 1) {
                                        viewGroupArr[i18].addView(this.V, w7.x5.e(-1, -1, 1));
                                        if (i6Var3.q()) {
                                            this.V.setMinBrightness(0.2f);
                                        } else {
                                            this.V.setMinBrightness(0.05f);
                                            this.V.setMaxBrightness(0.8f);
                                        }
                                        if (h6Var != null) {
                                            int i39 = h6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.lq lqVar2 = this.V;
                                            T0(1);
                                            lqVar2.f(1, 2, i39, false);
                                            this.V.e(h6Var.c, 0);
                                            int i40 = h6Var.d;
                                            if (i40 != 0) {
                                                this.V.e(i40, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i18].addView(this.V, w7.x5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i18++;
                                i6Var2 = i6Var3;
                                rect2 = rect;
                            }
                        }
                        j1();
                        if (!this.x0.getImageReceiver().hasBitmapImage()) {
                            this.t0.setBackgroundColor(-16777216);
                        }
                        if (i11 != 1 && !(this.B1 instanceof gj1)) {
                            this.x0.getImageReceiver().setCrossfadeWithOldImage(true);
                        }
                    }
                    i15 = 0;
                    String[] strArr3 = new String[i15];
                    int[] iArr3 = new int[i15];
                    this.J0 = new org.telegram.ui.Components.j81[i15];
                    if (i15 != 0) {
                    }
                    i17 = 0;
                    while (true) {
                        wc1Var = this.a;
                        if (i17 >= i15) {
                        }
                        i17++;
                    }
                    if (i11 == 1) {
                    }
                    if (i11 != 1) {
                    }
                    this.F1 = false;
                    i18 = 0;
                    while (i18 < 2) {
                    }
                    j1();
                    if (!this.x0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                        this.x0.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                } else {
                    if (!(obj instanceof hj1) || !"t".equals(((hj1) obj).a)) {
                        i15 = 2;
                        String[] strArr32 = new String[i15];
                        int[] iArr32 = new int[i15];
                        this.J0 = new org.telegram.ui.Components.j81[i15];
                        if (i15 != 0) {
                        }
                        i17 = 0;
                        while (true) {
                            wc1Var = this.a;
                            if (i17 >= i15) {
                            }
                            i17++;
                        }
                        if (i11 == 1) {
                        }
                        if (i11 != 1) {
                        }
                        this.F1 = false;
                        i18 = 0;
                        while (i18 < 2) {
                        }
                        j1();
                        if (!this.x0.getImageReceiver().hasBitmapImage()) {
                        }
                        if (i11 != 1) {
                        }
                    }
                    i15 = 0;
                    String[] strArr322 = new String[i15];
                    int[] iArr322 = new int[i15];
                    this.J0 = new org.telegram.ui.Components.j81[i15];
                    if (i15 != 0) {
                    }
                    i17 = 0;
                    while (true) {
                        wc1Var = this.a;
                        if (i17 >= i15) {
                        }
                        i17++;
                    }
                    if (i11 == 1) {
                    }
                    if (i11 != 1) {
                    }
                    this.F1 = false;
                    i18 = 0;
                    while (i18 < 2) {
                    }
                    j1();
                    if (!this.x0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                    }
                }
            }
            this.u0.setAdapter(this.v0);
            ah.w wVar2 = new ah.w(this, context, 28);
            this.k0 = wVar2;
            wVar2.setWillNotDraw(false);
            ah.w wVar3 = this.k0;
            this.fragmentView = wVar3;
            ViewTreeObserver viewTreeObserver = wVar3.getViewTreeObserver();
            int i41 = 1;
            ha0 ha0Var = new ha0(this, i41);
            this.Q = ha0Var;
            viewTreeObserver.addOnGlobalLayoutListener(ha0Var);
            z4.g gVar = new z4.g(context);
            this.j0 = gVar;
            gVar.b(new m2(this, 2));
            this.j0.setAdapter(new c80(this, i41));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.j0, getThemedColor(org.telegram.ui.ActionBar.j6.s8));
            this.k0.addView(this.j0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.l0 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.k0.addView(this.l0, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i11 != 0) {
                View view = new View(context);
                view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                this.k0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.b0 = frameLayout;
                int i42 = org.telegram.ui.ActionBar.j6.d6;
                boolean z13 = this.d;
                frameLayout.setBackgroundColor(z13 ? org.telegram.ui.ActionBar.j6.C0(i42) : getThemedColor(i42));
                this.k0.addView(this.b0, w7.x5.e(-1, 48, 83));
                di.r6 r6Var = new di.r6(context, this);
                this.a0 = r6Var;
                this.b0.addView(r6Var, w7.x5.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.d0 = textView9;
                textView9.setTextSize(1, 14.0f);
                TextView textView10 = this.d0;
                int i43 = org.telegram.ui.ActionBar.j6.Ae;
                textView10.setTextColor(z13 ? org.telegram.ui.ActionBar.j6.C0(i43) : getThemedColor(i43));
                this.d0.setGravity(17);
                this.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(251658240, 0));
                this.d0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.d0.setText(LocaleController.getString(R.string.Cancel));
                this.d0.setTypeface(AndroidUtilities.bold());
                this.b0.addView(this.d0, w7.x5.e(-2, -1, 51));
                final int i44 = 0;
                this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kc1
                    public final /* synthetic */ wd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i44) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                wd1.U(this.b);
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
                TextView textView11 = new TextView(context);
                this.c0 = textView11;
                textView11.setTextSize(1, 14.0f);
                this.c0.setTextColor(z13 ? org.telegram.ui.ActionBar.j6.C0(i43) : getThemedColor(i43));
                this.c0.setGravity(17);
                this.c0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(251658240, 0));
                this.c0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.c0.setText(LocaleController.getString(R.string.ApplyTheme));
                this.c0.setTypeface(AndroidUtilities.bold());
                this.b0.addView(this.c0, w7.x5.e(-2, -1, 53));
                i19 = 1;
                this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kc1
                    public final /* synthetic */ wd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                wd1.U(this.b);
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
                i19 = 1;
            }
            if (i11 == i19 && !org.telegram.ui.ActionBar.j6.Z0() && h6Var != null && h6Var.j != 4294967296L) {
                X0();
            }
            this.i0 = S0();
            b1(true);
            m1(false);
            this.c = new Scroller(getContext());
            d5Var2 = this.parentLayout;
            if (d5Var2 != null && d5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
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
            AndroidUtilities.runOnUIThread(new jc1(this, i10), 2000L);
        }
        org.telegram.ui.ActionBar.v0 a22 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a22.F();
        a22.H = new hd1();
        a22.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.e5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        j0 j0Var3 = new j0(this, context, 24);
        this.m0 = j0Var3;
        j0Var3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.m0.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var3 = new org.telegram.ui.Components.ll0(context);
        this.n0 = ll0Var3;
        ll0Var3.setVerticalScrollBarEnabled(true);
        this.n0.setItemAnimator(null);
        this.n0.setLayoutAnimation(null);
        this.n0.setLayoutManager(new s4.c0(1, false));
        final int i232 = 2;
        this.n0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.ll0 ll0Var22 = this.n0;
        i11 = this.b;
        ll0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
        this.n0.setOnItemClickListener(new org.telegram.ui.Components.n7(i232));
        this.m0.addView(this.n0, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(context, this.resourceProvider);
        this.p0 = y10Var2;
        y10Var2.setImageResource(R.drawable.floating_pencil);
        this.m0.addView(this.p0, org.telegram.ui.Components.y10.b());
        od1 od1Var2 = new od1(context);
        this.o0 = od1Var2;
        this.n0.setAdapter(od1Var2);
        this.t0 = new org.telegram.ui.ActionBar.q0(this, context, i10);
        this.v0 = new sd1(context, this);
        this.s0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        i2.g.x(false, this.s0);
        this.s0.setActionBarMenuOnItemClick(new kd1(this));
        i12 = 0;
        while (true) {
            ld1VarArr = this.w0;
            if (i12 < 2) {
            }
            ld1VarArr[i12] = new ld1(this, (Activity) getContext());
            this.t0.addView(ld1VarArr[i12], w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i12++;
        }
        ld1 ld1Var2 = ld1VarArr[0];
        this.x0 = ld1Var2;
        ld1Var2.setVisibility(0);
        ld1VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z11 = this.v0.e;
        org.telegram.ui.ActionBar.i6 i6Var42 = this.e0;
        final int i242 = 4;
        if (!z11) {
        }
        this.u0 = new rc1(context, this);
        sc1 sc1Var2 = new sc1(this);
        sc1Var2.S();
        this.u0.setItemAnimator(sc1Var2);
        this.u0.setVerticalScrollBarEnabled(true);
        this.u0.setOverScrollMode(2);
        if (i11 != 2) {
        }
        this.u0.setClipToPadding(false);
        this.u0.setLayoutManager(new s4.c0(1, true));
        this.u0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        if (i11 != 1) {
        }
        this.u0.setOnScrollListener(new i3(this, 29));
        this.t0.addView(this.s0, w7.x5.c(-2.0f, i14));
        org.telegram.ui.Components.l81 l81Var2 = new org.telegram.ui.Components.l81(context);
        this.v1 = l81Var2;
        l81Var2.b(new lc1(this, i232));
        org.telegram.ui.ActionBar.h6 h6Var2 = this.s;
        if (i11 != 1) {
        }
        if (i11 != 2) {
        }
        Rect rect22 = new Rect();
        Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate22;
        mutate22.getPadding(rect22);
        this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.d6), PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint22 = new TextPaint(1);
        textPaint22.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint22.setTypeface(AndroidUtilities.bold());
        obj = this.B1;
        if (i11 != 1) {
        }
        if (obj instanceof gj1) {
        }
        i15 = 3;
        String[] strArr3222 = new String[i15];
        int[] iArr3222 = new int[i15];
        this.J0 = new org.telegram.ui.Components.j81[i15];
        if (i15 != 0) {
        }
        i17 = 0;
        while (true) {
            wc1Var = this.a;
            if (i17 >= i15) {
            }
            i17++;
        }
        if (i11 == 1) {
        }
        if (i11 != 1) {
        }
        this.F1 = false;
        i18 = 0;
        while (i18 < 2) {
        }
        j1();
        if (!this.x0.getImageReceiver().hasBitmapImage()) {
        }
        if (i11 != 1) {
        }
        this.u0.setAdapter(this.v0);
        ah.w wVar22 = new ah.w(this, context, 28);
        this.k0 = wVar22;
        wVar22.setWillNotDraw(false);
        ah.w wVar32 = this.k0;
        this.fragmentView = wVar32;
        ViewTreeObserver viewTreeObserver2 = wVar32.getViewTreeObserver();
        int i412 = 1;
        ha0 ha0Var2 = new ha0(this, i412);
        this.Q = ha0Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(ha0Var2);
        z4.g gVar2 = new z4.g(context);
        this.j0 = gVar2;
        gVar2.b(new m2(this, 2));
        this.j0.setAdapter(new c80(this, i412));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.j0, getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        this.k0.addView(this.j0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.l0 = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.k0.addView(this.l0, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i11 != 0) {
        }
        if (i11 == i19) {
            X0();
        }
        this.i0 = S0();
        b1(true);
        m1(false);
        this.c = new Scroller(getContext());
        d5Var2 = this.parentLayout;
        if (d5Var2 != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
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
        w0Var.S1 = f10;
        w0Var.T1.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
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
            org.telegram.ui.Components.ll0 ll0Var = this.n0;
            if (ll0Var == null) {
                return;
            }
            int childCount = ll0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.n0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            rc1 rc1Var = this.u0;
            if (rc1Var != null) {
                rc1Var.e1();
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
            if (obj instanceof hj1) {
                hj1 hj1Var = (hj1) obj;
                if (hj1Var.a == null) {
                    hj1Var.a = (String) objArr[0];
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
                org.telegram.ui.ActionBar.h6 h6Var = this.s;
                if (h6Var != null && (str = h6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.W0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (h6Var == null) {
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
        ud1 ud1Var = this.Q0;
        if (ud1Var != null) {
            ud1Var.l();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new pc1(this, 1)), this.classGuid);
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
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(getParentActivity(), 8);
            this.A0 = i40Var;
            i40Var.setShowingDuration(5000L);
            this.A0.setAlpha(0.0f);
            this.A0.setVisibility(4);
            this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.k0.addView(this.A0, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new w81(7, this, globalMainSettings), 500L);
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
                arrayList2.add(ObjectAnimator.ofFloat(this.u0, (Property<rc1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.j81 j81Var = this.J0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(j81Var, (Property<org.telegram.ui.Components.j81, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.j81, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i11 == 2) {
                rc1 rc1Var = this.u0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(rc1Var, (Property<rc1, Float>) property2, AndroidUtilities.dp((this.A1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.j81 j81Var2 = this.J0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(j81Var2, (Property<org.telegram.ui.Components.j81, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.j81, Float>) property3, z12 ? 0.0f : 1.0f));
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
            rc1 rc1Var2 = this.u0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(rc1Var2, (Property<rc1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.j81 j81Var3 = this.J0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(j81Var3, (Property<org.telegram.ui.Components.j81, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], (Property<org.telegram.ui.Components.j81, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.x0, (Property<ld1, Float>) property5, 1.0f));
        }
        this.r1.playTogether(arrayList2);
        this.r1.addListener(new dd1(this, z10, i15, i10, z12));
        this.r1.setInterpolator(org.telegram.ui.Components.pr.g);
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
        mc mcVar = new mc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.h2 = mcVar;
        mcVar.setOnTouchListener(new ci.d(i10));
        this.i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j2 = ofFloat;
        ofFloat.addUpdateListener(new di.yb(this, 3));
        this.j2.addListener(new ad1(this, 4));
        this.j2.setDuration(400L);
        this.j2.setInterpolator(org.telegram.ui.Components.jt.e);
        this.j2.start();
        frameLayout.addView(this.h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new jc1(this, i10));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.t1;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
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
        int i10 = 0;
        if (chat == null) {
            this.z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.q1 == null) {
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_switch_lock, 0);
                this.q1 = nqVar;
                nqVar.setTopOffset(1);
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
        getMessagesController().getBoostsController().getBoostsStats(this.J1, new oc1(this, i10));
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
            md1 md1Var = this.z1;
            if (md1Var != null) {
                md1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            md1 md1Var2 = this.A1;
            if (md1Var2 != null) {
                md1Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void k1() {
        this.x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.x0.invalidate();
        this.P0.e1();
        if (this.l1 >= 0.0f) {
            this.x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.x0.getImageReceiver().setBlendMode(null);
            }
            if (this.x0.getBackground() instanceof org.telegram.ui.Components.dc0) {
                this.x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.dc0) this.x0.getBackground()).k);
            }
        }
        this.a.b(this.x0.getBackground(), this.x0.getBackground(), Float.valueOf(this.l1));
        V0();
    }

    public final void l1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.W0 == null && (this.B1 instanceof gj1)) {
                this.J0[2].a(false, true);
            }
            this.J0[this.W0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.j81 j81Var = this.J0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(j81Var, (Property<org.telegram.ui.Components.j81, Float>) property, this.W0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.j81, Float>) property, this.W0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new bd1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.g);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J0[0], (Property<org.telegram.ui.Components.j81, Float>) View.ALPHA, this.W0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.j81 j81Var2 = this.J0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(j81Var2, (Property<org.telegram.ui.Components.j81, Float>) property2, this.W0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J0[1], (Property<org.telegram.ui.Components.j81, Float>) property2, this.W0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new cd1(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x008e, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r23.b1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(boolean z10) {
        char c10;
        char c11;
        float f7;
        uc1 uc1Var;
        boolean z11;
        int i10;
        BlendMode blendMode;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = this.b;
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (i11 >= 29) {
            if (i12 == 0) {
                i10 = h6Var != null ? (int) h6Var.l : getThemedColor(org.telegram.ui.ActionBar.j6.Pd);
            } else if (i12 == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j3 = h6Var.l;
                int i13 = (int) j3;
                if (i13 != 0 || j3 == 0) {
                    if (i13 != 0) {
                        B0 = i13;
                    }
                    i10 = B0;
                }
                i10 = 0;
            } else {
                if (this.B1 instanceof gj1) {
                    i10 = this.c1;
                }
                i10 = 0;
            }
            if (i10 == 0 || this.l1 < 0.0f) {
                this.x0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i14 = 2;
        if (this.D0 != null) {
            if (i12 != 2) {
                if (i12 == 1) {
                    int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                    long j10 = h6Var.k;
                    int i15 = (int) j10;
                    if (i15 == 0 && j10 != 0) {
                        B02 = 0;
                    } else if (i15 != 0) {
                        B02 = i15;
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
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.D0, (Property<uc1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c11 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.D0, (Property<uc1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f7 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.D0, (Property<uc1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.j81 j81Var = this.J0[0];
                    Property property = View.TRANSLATION_X;
                    c10 = 3;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(j81Var, (Property<org.telegram.ui.Components.j81, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.J0[1], (Property<org.telegram.ui.Components.j81, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.J0[2], (Property<org.telegram.ui.Components.j81, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.H0.setDuration(180L);
                    this.H0.addListener(new ad1(this, i14));
                    this.H0.setInterpolator(org.telegram.ui.Components.pr.g);
                    this.H0.start();
                } else {
                    c10 = 3;
                    c11 = 4;
                    f7 = 1.0f;
                    this.D0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.D0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.D0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.J0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.J0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.J0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                uc1Var = this.E0;
                if (uc1Var == null) {
                    boolean z13 = uc1Var.getTag() != null;
                    this.E0.setTag(1);
                    if (!z13) {
                        this.E0.setVisibility(0);
                        AnimatorSet animatorSet3 = this.I0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            this.E0.setAlpha(1.0f);
                            this.E0.setScaleX(1.0f);
                            this.E0.setScaleY(1.0f);
                            this.K0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                            this.K0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.I0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E0, (Property<uc1, Float>) View.ALPHA, f7);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.E0, (Property<uc1, Float>) View.SCALE_X, f7);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.E0, (Property<uc1, Float>) View.SCALE_Y, f7);
                        org.telegram.ui.Components.j81 j81Var2 = this.K0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j81Var2, (Property<org.telegram.ui.Components.j81, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.j81, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[5];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[c10] = ofFloat7;
                        animatorArr[c11] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.I0.setDuration(180L);
                        this.I0.addListener(new ad1(this, 3));
                        this.I0.setInterpolator(org.telegram.ui.Components.pr.g);
                        this.I0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c10 = 3;
        c11 = 4;
        f7 = 1.0f;
        uc1Var = this.E0;
        if (uc1Var == null) {
        }
    }

    public final void n1() {
        int childCount = this.P0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).u(true);
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
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
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
            org.telegram.ui.ActionBar.j6.N = true;
        }
        if (i10 == 0 && this.s == null) {
            this.E1 = org.telegram.ui.ActionBar.j6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a4.a.n((int) (max / AndroidUtilities.density), "_f", sb2);
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
        ah.w wVar = this.k0;
        if (wVar != null && this.Q != null) {
            wVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.p1 == null) {
            AndroidUtilities.runOnUIThread(new q31(2));
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
        org.telegram.ui.ActionBar.j6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        od1 od1Var = this.o0;
        if (od1Var != null) {
            od1Var.l();
        }
        sd1 sd1Var = this.v0;
        if (sd1Var != null) {
            sd1Var.l();
        }
        if (this.E1) {
            this.v1.c(true);
        }
        org.telegram.ui.ActionBar.j6.b = true;
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.a.a = f6Var;
    }

    public wd1(org.telegram.ui.ActionBar.i6 i6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.a = new wc1(this);
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
        this.Y = new jc1(this, 0);
        this.w0 = new ld1[2];
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
        this.S1 = new org.telegram.ui.Components.j20(getParentActivity(), new yc1(this));
        this.T1 = false;
        this.U1 = false;
        this.b = i10;
        this.f0 = z12;
        this.e0 = i6Var;
        this.h0 = z10;
        this.g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.h6 k10 = i6Var.k(!z11);
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
            org.telegram.ui.ActionBar.h6 k11 = i6Var.k(false);
            this.s = k11;
            if (k11 != null) {
                this.W0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (h6Var != null) {
            this.E1 = h6Var.q;
            if (!TextUtils.isEmpty(h6Var.o)) {
                this.l1 = this.s.p;
            }
            org.telegram.ui.ActionBar.j6.M = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.j6.O = true;
            org.telegram.ui.ActionBar.j6.P = true;
            org.telegram.ui.ActionBar.j6.t(i6Var, false, false);
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

    public wd1(org.telegram.ui.ActionBar.i6 i6Var) {
        this(i6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
