// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class rz8 extends e {
    public boolean E;
    public boolean F;
    public jz8 G;
    public boolean H;
    public final nz8 I;
    public int J;
    public final Paint K;
    public float L;
    public final int[] M;
    public final int[] N;
    public LinearGradient O;
    public final Paint P;
    public final Matrix Q;
    public final Paint R;
    public final RectF S;
    public final float[] T;
    public final int[] U;
    public final int[] V;
    public LinearGradient W;
    public int X;
    public int Y;
    public int Z;
    public long a;
    public yy8 a0;
    public long b;
    public int b0;
    public xh4 c;
    public int c0;
    public f09 d;
    public int d0;
    public vz8 e;
    public float e0;
    public FrameLayout f;
    public boolean f0;
    public LinearGradient g0;
    public pz8 h;
    public final Paint h0;
    public final RectF i0;
    public final int[] j0;
    public final int[] k0;
    public final int[] l0;
    public final Path m0;
    public float n;
    public final RectF n0;
    public Paint o0;
    public final so4 p0;
    public final RectF q0;
    public float r;
    public boolean r0;
    public float s;
    public Boolean s0;
    public float w;
    public float x;
    public ny3 y;

    public rz8(Bundle bundle) {
        super(bundle);
        this.I = new nz8(this, (byte) 0);
        this.K = new Paint();
        this.L = Float.NaN;
        this.M = new int[2];
        this.N = new int[2];
        this.P = new Paint();
        this.Q = new Matrix();
        this.R = new Paint(1);
        this.S = new RectF();
        this.T = new float[2];
        this.U = new int[2];
        this.V = new int[2];
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.h0 = new Paint();
        this.i0 = new RectF();
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.l0 = new int[2];
        this.m0 = new Path();
        this.n0 = new RectF();
        this.p0 = new so4();
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Z(viewGroup.getChildAt(i));
            }
        }
    }

    public static void c0(e eVar) {
        la1.i0(eVar.getParentActivity(), 1, new ed(eVar.getCurrentAccount(), (Object) eVar, (byte) 14));
    }

    public static LinearGradient i0(boolean z) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            float f = i / 8.0f;
            float B = xnb.B(f, 2.0f, 3.0f, f * f);
            if (!z) {
                B = 1.0f - B;
            }
            iArr[i] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i] = f;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void Y() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            hl.h3(parentActivity, false);
            hl.n3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.s0 == null) {
                    this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void a0(AnimatorSet animatorSet) {
        k0();
        boolean z = !this.E;
        int i = this.currentAccount;
        this.Z = i;
        this.X = jn7.f(i).p(null, -1, z);
        this.Y = jn7.e().p(null, -1, z);
        animatorSet.start();
    }

    public final void b0() {
        f09 f09Var;
        if (this.h == null || (f09Var = this.d) == null || f09Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - hl.L(10.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams.height == max && layoutParams.leftMargin == r2 && layoutParams.rightMargin == width) {
            return;
        }
        layoutParams.height = max;
        layoutParams.leftMargin = r2;
        layoutParams.rightMargin = width;
        this.h.setLayoutParams(layoutParams);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            jz8Var.g();
            this.G = null;
        }
        vz8 vz8Var = this.e;
        if (vz8Var != null) {
            vz8Var.l();
            this.e = null;
        }
        super.clearViews();
        f09 f09Var = this.d;
        if (f09Var != null) {
            f09Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.a0 = null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final a createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ab, code lost:
    
        if (r5 != 1) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01be  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z;
        tz8 tz8Var;
        long j;
        char c;
        boolean startsWith;
        tz8 tz8Var2;
        TLRPC.ShareTheme shareTheme;
        int i = this.currentAccount;
        qy8[] qy8VarArr = qy8.f;
        if (qy8VarArr[i] == null) {
            qy8VarArr[i] = new qy8(i);
        }
        qy8 qy8Var = qy8VarArr[i];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = qy8Var.b;
        nd0.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = qy8Var.b;
        sa8 sa8Var = new sa8(this, qy8Var, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, (byte) 14);
        byte b = 6;
        byte b2 = 0;
        if (qy8Var.d) {
            sa8Var.run();
        } else {
            qy8Var.e.add(sa8Var);
            if (!qy8Var.c) {
                qy8Var.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = qy8Var.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(qy8Var.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new ic(b2), new hj8(qy8Var, b));
            }
        }
        Activity parentActivity = getParentActivity();
        fu7 fu7Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).t1 : null;
        if (fu7Var != null && this.c == null) {
            xh4 xh4Var = new xh4((Object) fu7Var, (byte) 18);
            fu7Var.b.add(xh4Var);
            fu7Var.a();
            this.c = xh4Var;
        }
        int i2 = this.currentAccount;
        long j2 = this.a;
        long j3 = this.b;
        uc7 s1 = uc7.s1(i2);
        String k = c00.k(new StringBuilder("https://"), s1.N2, "/");
        long j4 = 0;
        if (j2 != 0 || j3 == 0) {
            if (j2 == yac.h(i2).e()) {
                str = "";
                z = true;
            } else {
                str = "";
                z = false;
            }
            TLRPC.User X1 = s1.X1(Long.valueOf(j2));
            String p = X1 != null ? lbc.p(X1) : null;
            if (p != null) {
                j = 0;
                tz8Var = new tz8(k.concat(p), p, true, false, z, j2, z);
            } else if (z) {
                if (X1 != null && X1.phone != null) {
                    ArrayList v = lv2.r(i2).v(6);
                    if (v != null) {
                        int size = v.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = v.get(i3);
                            i3++;
                            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) obj;
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowAll)) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    break;
                                }
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c = 1;
                                    break;
                                }
                            } else {
                                c = 0;
                                break;
                            }
                        }
                        c = 2;
                        if (c == 2) {
                            ArrayList v2 = lv2.r(i2).v(7);
                            if (v2 != null && !v2.isEmpty()) {
                                int size2 = v2.size();
                                int i4 = 0;
                                while (i4 < size2) {
                                    Object obj2 = v2.get(i4);
                                    i4++;
                                    TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) obj2;
                                    if (!(privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll)) {
                                        if ((privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            startsWith = X1.phone.startsWith("+");
                            String str2 = X1.phone;
                            if (!startsWith) {
                                str2 = c00.i("+", str2);
                            }
                            String str3 = str2;
                            j = 0;
                            tz8Var = new tz8(c00.i(k, str3), str3, false, false, true, j2, true);
                        }
                        if (c != 0) {
                        }
                        startsWith = X1.phone.startsWith("+");
                        String str22 = X1.phone;
                        if (!startsWith) {
                        }
                        String str32 = str22;
                        j = 0;
                        tz8Var = new tz8(c00.i(k, str32), str32, false, false, true, j2, true);
                    }
                    j4 = 0;
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = s1.M4;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : s1.M4;
                String str4 = tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null;
                j = j4;
                tz8Var = new tz8(str4, X1 != null ? lbc.r(X1) : str, false, true, true, j2, true);
            } else {
                j = 0;
                tz8Var = new tz8(k, X1 != null ? lbc.r(X1) : str, false, false, false, j2, false);
            }
            tz8Var2 = tz8Var;
        } else {
            TLRPC.Chat M0 = s1.M0(Long.valueOf(j3));
            String K = xc2.K(M0, false);
            if (K != null) {
                tz8Var2 = new tz8(k.concat(K), K, true, false, false, -j3, xc2.w(1, M0));
                j = 0;
            } else {
                j = 0;
                tz8Var2 = new tz8(k, M0 != null ? M0.title : "", false, false, false, -j3, false);
            }
        }
        this.f = new FrameLayout(context);
        f09 f09Var = new f09(context, this.currentAccount, tz8Var2.a, tz8Var2.b, tz8Var2.c, new v34(this, (byte) 29));
        this.d = f09Var;
        this.f.addView(f09Var, tre.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.E);
        this.d.setRevealOpening(true);
        if (this.H) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.I, 680L);
        } else {
            boolean O1 = hl.O1();
            f09 f09Var2 = this.d;
            if (O1) {
                f09Var2.setReveal(1.0f);
                f09Var2.S4 = false;
            } else {
                f09Var2.setReveal(0.0f);
            }
        }
        this.fragmentView = this.f;
        vz8 vz8Var = this.e;
        if (vz8Var != null) {
            vz8Var.l();
        }
        int i5 = this.currentAccount;
        f09 f09Var3 = this.d;
        vz8 vz8Var2 = new vz8(i5, f09Var3, tz8Var2);
        this.e = vz8Var2;
        boolean z2 = tz8Var2.d;
        f09Var3.setTimerOnly(z2);
        f09Var3.setTemporaryLink(z2);
        LongSparseArray h = vz8.h(i5);
        long j5 = tz8Var2.f;
        uz8 uz8Var = (uz8) h.get(j5);
        if (uz8Var != null) {
            shareTheme = uz8Var.a;
        } else {
            uc7 s12 = uc7.s1(i5);
            if (j5 > j) {
                TLRPC.UserFull Y1 = s12.Y1(j5);
                if (Y1 != null) {
                    shareTheme = Y1.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull N0 = s12.N0(-j5);
                if (N0 != null) {
                    shareTheme = N0.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            }
        }
        if (shareTheme != null) {
            f09Var3.setInstantTheme(true);
            vz8Var2.a(shareTheme);
            f09Var3.setInstantTheme(false);
        }
        boolean z3 = tz8Var2.g;
        f09Var3.setThemeEditable(z3);
        if (z3) {
            f09Var3.setGiftsOwner(j5);
        }
        if (tz8Var2.e) {
            jn7.f(i5).b(vz8Var2, jn7.k0);
            if (z2) {
                uc7 s13 = uc7.s1(i5);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = s13.M4;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : s13.M4;
                vz8Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    vz8Var2.m();
                } else {
                    f09Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            vz8Var2.r();
            vz8Var2.g();
            vz8Var2.p();
        } else {
            f09Var3.setFeeStars(j);
            vz8Var2.g();
        }
        return this.f;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        yx4 yx4Var = new yx4(getParentActivity(), this.currentAccount, getUserConfig().e(), null, null);
        if (!yx4Var.n2) {
            yx4Var.n2 = true;
            uya uyaVar = yx4Var.p2;
            if (uyaVar != null && (uyaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) yx4Var.p2.getParent();
                int indexOfChild = viewGroup.indexOfChild(yx4Var.p2);
                viewGroup.removeView(yx4Var.p2);
                uya uyaVar2 = new uya(yx4Var.getContext(), jn7.Y3, 2);
                yx4Var.p2 = uyaVar2;
                viewGroup.addView(uyaVar2, indexOfChild, tre.c(-1.0f, -1));
            }
            p66 p66Var = yx4Var.q2;
            if (p66Var != null) {
                String M0 = ob6.M0(2131750247, null);
                b21 b21Var = yx4Var.e2;
                b21Var.setText(M0);
                b21Var.setBreakStrategy(2);
                p66Var.setVisibility(8);
            }
            yx4Var.T1.O(false);
        }
        yx4Var.show();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (this.G != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.j7);
        rectF2.set(this.d.g7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - hl.L(20.0f), (this.f.getHeight() / 2.0f) - hl.L(20.0f), (this.f.getWidth() / 2.0f) + hl.L(20.0f), (this.f.getHeight() / 2.0f) + hl.L(20.0f));
        }
        this.d.setScanHidden(true);
        jz8 jz8Var = new jz8(getParentActivity(), rectF, rectF2, new pq8((Object) this, (byte) 2));
        this.G = jz8Var;
        jz8Var.setButtonLabel(ob6.M0(2131746197, null));
        jz8 jz8Var2 = this.G;
        jz8Var2.setOnGallery(new hp8(this, jz8Var2, (byte) 26));
        this.f.addView(this.G, tre.c(-1.0f, -1));
    }

    public final void f0(float f, float f2, boolean z) {
        pz8 pz8Var = this.h;
        if (!z) {
            if (pz8Var != null && pz8Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            ny3 ny3Var = this.y;
            if (ny3Var == null || ny3Var.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(4);
            return;
        }
        if (pz8Var == null) {
            if (getParentActivity() == null) {
                return;
            }
            pz8 pz8Var2 = new pz8(this, getParentActivity(), this.currentAccount, new oz8(this));
            this.h = pz8Var2;
            pz8Var2.setOutlineProvider(new qz8(this, (byte) 0));
            this.h.setClipToOutline(true);
            ny3 ny3Var2 = new ny3(getParentActivity(), new xh4((Object) this, (byte) 26));
            this.y = ny3Var2;
            ny3Var2.b = this.h;
            this.d.setOnPicksChanged(new nz8(this, (byte) 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, tre.e(-1, -1, 48));
            b0();
            this.f.post(new nz8(this, (byte) 2));
        }
        b0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.leftMargin;
        int i3 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, tre.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        if (layoutParams2.height != i || layoutParams2.leftMargin != i2 || layoutParams2.rightMargin != i3) {
            layoutParams2.height = i;
            layoutParams2.leftMargin = i2;
            layoutParams2.rightMargin = i3;
            this.y.setLayoutParams(layoutParams2);
        }
        this.y.setTranslationY(f);
        this.y.setAlpha(f2);
        this.y.invalidateOutline();
        this.y.invalidate();
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        int t0 = this.d.t0();
        d09 d09Var = this.d.n;
        int i4 = t0 ^ (d09Var != null ? d09Var.h : 872415231);
        if (this.h.getTranslationY() != f || i4 != this.J) {
            this.h.setTranslationY(f);
            this.J = i4;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f2);
        pz8 pz8Var3 = this.h;
        f09 f09Var = this.d;
        d09 d09Var2 = f09Var.n;
        int i5 = d09Var2 != null ? d09Var2.b : -16777216;
        if (i5 != f09Var.b2) {
            f09Var.b2 = i5;
            f09Var.c2 = (vm2.f(0.13f, -1, f09.D0(0.75f, 1.3f, 0.16f, i5)) & 16777215) | (-1728053248);
        }
        pz8Var3.setHeaderColor(f09Var.c2);
        if (this.h.getVisibility() != 0) {
            pz8 pz8Var4 = this.h;
            if (pz8Var4.K) {
                pz8Var4.K = false;
                pz8Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.r0) {
            return;
        }
        j0();
    }

    public final void g0() {
        f09 f09Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (f09Var = this.d) == null || f09Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || f11.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.F = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.e.c(new hp8(this, T0, (byte) 25));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0(String str) {
        f09 f09Var;
        if (getParentActivity() == null || (f09Var = this.d) == null || f09Var.getCurrentLink() == null) {
            return;
        }
        Bitmap T0 = this.d.T0();
        Uri B0 = T0 != null ? hl.B0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
        Intent intent = new Intent("android.intent.action.SEND");
        if (B0 != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", B0);
            intent.addFlags(1);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        try {
            getParentActivity().startActivity(Intent.createChooser(intent, ob6.M0(2131748924, null)));
        } catch (ActivityNotFoundException e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        pz8 pz8Var;
        if (this.r0 || (pz8Var = this.h) == null) {
            return;
        }
        cz8 tabs = pz8Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(hl.L(20.0f));
        float[] fArr = ehd.a[0];
        int ceil = (int) Math.ceil(hl.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i = ceil - 3;
        this.b0 = Math.max(0, i);
        this.c0 = Math.max(0, i);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new m88((Object) this, (Object) tabs, (byte) 18);
        tabs.b = new kz8(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i2 = this.b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i2, this.c0, i2, this.d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new qz8(this, (byte) 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = hl.L(10.0f);
            int L2 = hl.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        yy8 grid = this.h.getGrid();
        this.r0 = true;
        grid.g3 = new lz8(this, grid, tabs);
        grid.f3 = new vy2(this, grid, (byte) 2);
        ny3 ny3Var = this.y;
        byte b = 9;
        if (ny3Var.U != grid) {
            ny3Var.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new to2(ny3Var, b));
        }
        int L3 = hl.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, hl.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        l0();
        grid.setClipToPadding(false);
        grid.j(new bj1(this, tabs, b));
        tabs.bringToFront();
    }

    public final void k0() {
        if (this.X >= 0) {
            jn7.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            jn7.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void l0() {
        f09 f09Var;
        yy8 yy8Var = this.a0;
        if (yy8Var == null || (f09Var = this.d) == null) {
            return;
        }
        int L = hl.L(f09Var.J.isEmpty() ? 12.0f : 73.0f);
        if (yy8Var.getPaddingBottom() != L) {
            yy8Var.setPadding(yy8Var.getPaddingLeft(), yy8Var.getPaddingTop(), yy8Var.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            if (z) {
                jz8Var.e();
            }
            return false;
        }
        f09 f09Var = this.d;
        if (f09Var != null) {
            float f = f09Var.l1;
            if (f > 0.5f || f09Var.g1 > 0.5f) {
                if (z) {
                    if (f > 0.5f) {
                        f09Var.m1 = 0.0f;
                    } else if (f09Var.g1 > 0.5f) {
                        f09Var.h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (this.d == null || hl.O1()) {
            return null;
        }
        this.d.setRevealOpening(z);
        float f = 1.0f;
        float f2 = 0.0f;
        this.d.setReveal(z ? 0.0f : 1.0f);
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.addUpdateListener(new pv7(this, (byte) 25));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new rw((Object) this, z, (Object) runnable, (byte) 9));
        hl.c3(new hp8(this, animatorSet, (byte) 24));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.E = bundle3 != null && bundle3.getBoolean("immediate") && xea.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0();
        xh4 xh4Var = this.c;
        if (xh4Var != null) {
            fu7 fu7Var = (fu7) xh4Var.b;
            if (fu7Var.b.remove(xh4Var)) {
                fu7Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            jz8Var.g();
            this.G = null;
        }
        vz8 vz8Var = this.e;
        if (vz8Var != null) {
            vz8Var.l();
            this.e = null;
        }
        f09 f09Var = this.d;
        if (f09Var != null) {
            f09Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        jz8 jz8Var = this.G;
        if (jz8Var != null) {
            jz8Var.g();
            jz8 jz8Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(jz8Var2);
            }
            if (this.G == jz8Var2) {
                this.G = null;
            }
            f09 f09Var = this.d;
            if (f09Var != null) {
                f09Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.s0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.s0.booleanValue());
        this.s0 = null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 4) {
            boolean z = iArr.length > 0 && iArr[0] == 0;
            if (this.F && z) {
                this.F = false;
                g0();
            }
            this.F = false;
            return;
        }
        if (getParentActivity() == null || i != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            e0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
        alertDialog$Builder.j(ob6.M0(2131747027, null), new kz8(this));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        int i2 = aob.L5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, aob.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        Y();
        if (getParentActivity() != null) {
            hl.h3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.H = true;
            f09 f09Var = this.d;
            if (f09Var != null) {
                f09Var.setReveal(1.0f);
            }
        }
        if (!z || z2 || this.f == null) {
            return;
        }
        float f = sy8.S;
        long j = 0;
        if (Build.VERSION.SDK_INT >= 29 && xea.o() == 2) {
            j = Math.max(0L, Math.round(ehd.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        nz8 nz8Var = this.I;
        frameLayout.removeCallbacks(nz8Var);
        this.f.postDelayed(nz8Var, j + 680);
    }
}
