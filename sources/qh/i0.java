package qh;

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
import bi.t3;
import java.util.ArrayList;
import kg.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.k9;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.u41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kj0;
import org.telegram.ui.u9;
import org.telegram.ui.web.v1;
import ph.l1;
import rh.o7;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class i0 extends k2 {
    public boolean D;
    public boolean E;
    public y F;
    public boolean G;
    public final d0 H;
    public int I;
    public final Paint J;
    public float K;
    public final int[] L;
    public final int[] M;
    public LinearGradient N;
    public final Paint O;
    public final Matrix P;
    public final Paint Q;
    public final RectF R;
    public final float[] S;
    public final int[] T;
    public final int[] U;
    public LinearGradient V;
    public int W;
    public int X;
    public int Y;
    public m Z;
    public long a;
    public int a0;
    public long b;
    public int b0;
    public org.telegram.ui.e c;
    public int c0;
    public x0 d;
    public float d0;
    public m0 e;
    public boolean e0;
    public FrameLayout f;
    public LinearGradient f0;
    public final Paint g0;
    public g0 h;
    public final RectF h0;
    public final int[] i0;
    public final int[] j0;
    public final int[] k0;
    public final Path l0;
    public final RectF m0;
    public float n;
    public Paint n0;
    public final k9 o0;
    public final RectF p0;
    public boolean q0;
    public float r;
    public Boolean r0;
    public float s;
    public float w;
    public float x;
    public c y;

    public i0(Bundle bundle) {
        super(bundle);
        this.H = new d0(this, 0);
        this.J = new Paint();
        this.K = Float.NaN;
        this.L = new int[2];
        this.M = new int[2];
        this.O = new Paint();
        this.P = new Matrix();
        this.Q = new Paint(1);
        this.R = new RectF();
        this.S = new float[2];
        this.T = new int[2];
        this.U = new int[2];
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.g0 = new Paint();
        this.h0 = new RectF();
        this.i0 = new int[2];
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.l0 = new Path();
        this.m0 = new RectF();
        this.o0 = new k9(3);
        this.p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Y(i0 i0Var, AnimatorSet animatorSet) {
        i0Var.k0();
        boolean z10 = !i0Var.D;
        int i10 = i0Var.currentAccount;
        i0Var.Y = i10;
        i0Var.W = zs.f(i10).q(null, -1, z10);
        i0Var.X = zs.e().q(null, -1, z10);
        animatorSet.start();
    }

    public static void Z(i0 i0Var) {
        if (i0Var.getParentActivity() == null) {
            return;
        }
        l1 l1Var = new l1(i0Var.getParentActivity(), i0Var.currentAccount, i0Var.getUserConfig().e(), null, null);
        if (!l1Var.l2) {
            l1Var.l2 = true;
            o7 o7Var = l1Var.n2;
            if (o7Var != null && (o7Var.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) l1Var.n2.getParent();
                int indexOfChild = viewGroup.indexOfChild(l1Var.n2);
                viewGroup.removeView(l1Var.n2);
                o7 o7Var2 = new o7(l1Var.getContext(), zs.Z3, 2, 0);
                l1Var.n2 = o7Var2;
                viewGroup.addView(o7Var2, indexOfChild, b6.c(-1.0f, -1));
            }
            p80 p80Var = l1Var.o2;
            if (p80Var != null) {
                String L0 = cd.L0(2131750297, null);
                t1 t1Var = l1Var.c2;
                t1Var.setText(L0);
                t1Var.setBreakStrategy(2);
                p80Var.setVisibility(8);
            }
            l1Var.Q1.O(false);
        }
        l1Var.show();
    }

    public static void b0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                b0(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void d0(k2 k2Var) {
        u9.i0(k2Var.getParentActivity(), 1, new c5.x(k2Var.getCurrentAccount(), k2Var, 15));
    }

    public static LinearGradient i0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float D = c3.i0.D(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                D = 1.0f - D;
            }
            iArr[i10] = ((int) ((D * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void a0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        Window window = parentActivity.getWindow();
        org.telegram.messenger.i0.l3(parentActivity, false);
        org.telegram.messenger.i0.r3(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.r0 == null) {
                this.r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            }
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public final void c0() {
        x0 x0Var;
        if (this.h == null || (x0Var = this.d) == null || x0Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - org.telegram.messenger.i0.L(10.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams.height == max && layoutParams.leftMargin == r2 && layoutParams.rightMargin == width) {
            return;
        }
        layoutParams.height = max;
        layoutParams.leftMargin = r2;
        layoutParams.rightMargin = width;
        this.h.setLayoutParams(layoutParams);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.g();
            this.F = null;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.l();
            this.e = null;
        }
        super.clearViews();
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.Z = null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b0, code lost:
    
        if (r3 != 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c0  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z10;
        k0 k0Var;
        long j10;
        ArrayList v;
        char c10;
        String str2;
        k0 k0Var2;
        TLRPC.ShareTheme shareTheme;
        int i10 = this.currentAccount;
        e[] eVarArr = e.f;
        if (eVarArr[i10] == null) {
            eVarArr[i10] = new e(i10);
        }
        e eVar = eVarArr[i10];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = eVar.b;
        a.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = eVar.b;
        u41 u41Var = new u41(this, eVar, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, 17);
        if (eVar.d) {
            u41Var.run();
        } else {
            eVar.e.add(u41Var);
            if (!eVar.c) {
                eVar.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = eVar.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(eVar.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new a3.b(1), new d(eVar, 0));
            }
        }
        Activity parentActivity = getParentActivity();
        kj0 kj0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).u1 : null;
        if (kj0Var != null && this.c == null) {
            org.telegram.ui.e eVar2 = new org.telegram.ui.e(kj0Var, 26);
            kj0Var.b.add(eVar2);
            kj0Var.a();
            this.c = eVar2;
        }
        int i11 = this.currentAccount;
        long j11 = this.a;
        long j12 = this.b;
        vp r12 = vp.r1(i11);
        String r10 = a1.g.r(new StringBuilder("https://"), r12.U2, "/");
        if (j11 != 0 || j12 == 0) {
            if (j11 == d20.i(i11).e()) {
                str = "";
                z10 = true;
            } else {
                str = "";
                z10 = false;
            }
            TLRPC.User Z1 = r12.Z1(Long.valueOf(j11));
            String n10 = Z1 != null ? h20.n(Z1) : null;
            if (n10 != null) {
                j10 = 0;
                k0Var = new k0(sc.e.A(r10, n10), n10, true, false, z10, j11, z10);
            } else if (z10) {
                if (Z1 != null && Z1.phone != null && (v = i5.r(i11).v(6)) != null) {
                    int size = v.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = v.get(i12);
                        i12++;
                        TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) obj;
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                            c10 = 0;
                            break;
                        }
                        if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                            break;
                        }
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                            c10 = 1;
                            break;
                        }
                    }
                    c10 = 2;
                    if (c10 == 2) {
                        ArrayList v10 = i5.r(i11).v(7);
                        if (v10 != null && !v10.isEmpty()) {
                            int size2 = v10.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj2 = v10.get(i13);
                                i13++;
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
                        if (Z1.phone.startsWith("+")) {
                            str2 = "+" + Z1.phone;
                        } else {
                            str2 = Z1.phone;
                        }
                        String str3 = str2;
                        j10 = 0;
                        k0Var = new k0(sc.e.A(r10, str3), str3, false, false, true, j11, true);
                    }
                    if (c10 != 0) {
                    }
                    if (Z1.phone.startsWith("+")) {
                    }
                    String str32 = str2;
                    j10 = 0;
                    k0Var = new k0(sc.e.A(r10, str32), str32, false, false, true, j11, true);
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = r12.Y7;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : r12.Y7;
                String str4 = tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null;
                j10 = 0;
                k0Var = new k0(str4, Z1 != null ? h20.p(Z1) : str, false, true, true, j11, true);
            } else {
                j10 = 0;
                k0Var = new k0(r10, Z1 != null ? h20.p(Z1) : str, false, false, false, j11, false);
            }
            k0Var2 = k0Var;
        } else {
            TLRPC.Chat L0 = r12.L0(Long.valueOf(j12));
            String K = w3.K(L0, false);
            if (K != null) {
                k0Var2 = new k0(sc.e.A(r10, K), K, true, false, false, -j12, w3.w(1, L0));
                j10 = 0;
            } else {
                String str5 = L0 != null ? L0.title : "";
                j10 = 0;
                k0Var2 = new k0(r10, str5, false, false, false, -j12, false);
            }
        }
        this.f = new FrameLayout(context);
        x0 x0Var = new x0(context, this.currentAccount, k0Var2.a, k0Var2.b, k0Var2.c, new l2.f(this, 23));
        this.d = x0Var;
        this.f.addView(x0Var, b6.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.D);
        this.d.setRevealOpening(true);
        if (this.G) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.H, 680L);
        } else if (org.telegram.messenger.i0.Q1()) {
            x0 x0Var2 = this.d;
            x0Var2.setReveal(1.0f);
            x0Var2.S4 = false;
        } else {
            this.d.setReveal(0.0f);
        }
        this.fragmentView = this.f;
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.l();
        }
        int i14 = this.currentAccount;
        x0 x0Var3 = this.d;
        m0 m0Var2 = new m0(i14, x0Var3, k0Var2);
        this.e = m0Var2;
        boolean z11 = k0Var2.d;
        x0Var3.setTimerOnly(z11);
        x0Var3.setTemporaryLink(z11);
        LongSparseArray h = m0.h(i14);
        long j13 = k0Var2.f;
        l0 l0Var = (l0) h.get(j13);
        if (l0Var != null) {
            shareTheme = l0Var.a;
        } else {
            vp r13 = vp.r1(i14);
            if (j13 > j10) {
                TLRPC.UserFull a2 = r13.a2(j13);
                if (a2 != null) {
                    shareTheme = a2.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull M0 = r13.M0(-j13);
                if (M0 != null) {
                    shareTheme = M0.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            }
        }
        if (shareTheme != null) {
            x0Var3.setInstantTheme(true);
            m0Var2.a(shareTheme);
            x0Var3.setInstantTheme(false);
        }
        boolean z12 = k0Var2.g;
        x0Var3.setThemeEditable(z12);
        if (z12) {
            x0Var3.setGiftsOwner(j13);
        }
        if (k0Var2.e) {
            zs.f(i14).c(m0Var2, zs.k0);
            if (z11) {
                vp r14 = vp.r1(i14);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = r14.Y7;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : r14.Y7;
                m0Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    m0Var2.m();
                } else {
                    x0Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            m0Var2.r();
            m0Var2.g();
            m0Var2.p();
        } else {
            x0Var3.setFeeStars(j10);
            m0Var2.g();
        }
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (this.F != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.j7);
        rectF2.set(this.d.g7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - org.telegram.messenger.i0.L(20.0f), (this.f.getHeight() / 2.0f) - org.telegram.messenger.i0.L(20.0f), (this.f.getWidth() / 2.0f) + org.telegram.messenger.i0.L(20.0f), (this.f.getHeight() / 2.0f) + org.telegram.messenger.i0.L(20.0f));
        }
        this.d.setScanHidden(true);
        y yVar = new y(getParentActivity(), rectF, rectF2, new n2.u(this, 18));
        this.F = yVar;
        yVar.setButtonLabel(cd.L0(2131746485, null));
        y yVar2 = this.F;
        yVar2.setOnGallery(new v1(19, this, yVar2));
        this.f.addView(this.F, b6.c(-1.0f, -1));
    }

    public final void f0(float f7, float f10, boolean z10) {
        if (!z10) {
            g0 g0Var = this.h;
            if (g0Var != null && g0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.y;
            if (cVar == null || cVar.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(4);
            return;
        }
        if (this.h == null) {
            if (getParentActivity() == null) {
                return;
            }
            g0 g0Var2 = new g0(this, getParentActivity(), this.currentAccount, new f0(this));
            this.h = g0Var2;
            g0Var2.setOutlineProvider(new h0(this, 0));
            this.h.setClipToOutline(true);
            c cVar2 = new c(getParentActivity(), new k2.m0(this));
            this.y = cVar2;
            cVar2.b = this.h;
            this.d.setOnPicksChanged(new d0(this, 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, b6.e(-1, -1, 48));
            c0();
            this.f.post(new d0(this, 2));
        }
        c0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i10 = layoutParams.height;
        int i11 = layoutParams.leftMargin;
        int i12 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, b6.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        if (layoutParams2.height != i10 || layoutParams2.leftMargin != i11 || layoutParams2.rightMargin != i12) {
            layoutParams2.height = i10;
            layoutParams2.leftMargin = i11;
            layoutParams2.rightMargin = i12;
            this.y.setLayoutParams(layoutParams2);
        }
        this.y.setTranslationY(f7);
        this.y.setAlpha(f10);
        this.y.invalidateOutline();
        this.y.invalidate();
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        int t02 = this.d.t0();
        v0 v0Var = this.d.n;
        int i13 = t02 ^ (v0Var != null ? v0Var.h : 872415231);
        if (this.h.getTranslationY() != f7 || i13 != this.I) {
            this.h.setTranslationY(f7);
            this.I = i13;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        g0 g0Var3 = this.h;
        x0 x0Var = this.d;
        v0 v0Var2 = x0Var.n;
        int i14 = v0Var2 != null ? v0Var2.b : -16777216;
        if (i14 != x0Var.a2) {
            x0Var.a2 = i14;
            x0Var.b2 = (i0.b.f(0.13f, -1, x0.D0(0.75f, 1.3f, 0.16f, i14)) & 16777215) | (-1728053248);
        }
        g0Var3.setHeaderColor(x0Var.b2);
        if (this.h.getVisibility() != 0) {
            g0 g0Var4 = this.h;
            if (g0Var4.J) {
                g0Var4.J = false;
                g0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.q0) {
            return;
        }
        j0();
    }

    public final void g0() {
        x0 x0Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (x0Var = this.d) == null || x0Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || v2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.E = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 == null) {
                return;
            }
            Utilities.e.c(new v1(18, this, T0));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0(String str) {
        x0 x0Var;
        if (getParentActivity() == null || (x0Var = this.d) == null || x0Var.getCurrentLink() == null) {
            return;
        }
        Bitmap T0 = this.d.T0();
        Uri C0 = T0 != null ? org.telegram.messenger.i0.C0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
        Intent intent = new Intent("android.intent.action.SEND");
        if (C0 != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", C0);
            intent.addFlags(1);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        try {
            getParentActivity().startActivity(Intent.createChooser(intent, cd.L0(2131749180, null)));
        } catch (ActivityNotFoundException e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        g0 g0Var;
        if (this.q0 || (g0Var = this.h) == null) {
            return;
        }
        q tabs = g0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(20.0f));
        float[] fArr = y0.a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.i0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.a0 = Math.max(0, i10);
        this.b0 = Math.max(0, i10);
        this.c0 = Math.max(0, ceil - 4);
        tabs.a = new org.telegram.ui.web.k0(8, this, tabs);
        tabs.b = new z(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.b0, i11, this.c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new h0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = org.telegram.messenger.i0.L(10.0f);
            int L2 = org.telegram.messenger.i0.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        m grid = this.h.getGrid();
        this.q0 = true;
        grid.f3 = new a0(this, grid, tabs);
        grid.e3 = new b0(this, grid);
        c cVar = this.y;
        if (cVar.T != grid) {
            cVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new bu0(cVar, 14));
        }
        int L3 = org.telegram.messenger.i0.L(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.i0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        l0();
        grid.setClipToPadding(false);
        grid.j(new t3(11, this, tabs));
        tabs.bringToFront();
    }

    public final void k0() {
        if (this.W >= 0) {
            zs.f(this.Y).j(this.W);
        }
        if (this.X >= 0) {
            zs.e().j(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    public final void l0() {
        x0 x0Var;
        m mVar = this.Z;
        if (mVar == null || (x0Var = this.d) == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(x0Var.I.isEmpty() ? 12.0f : 73.0f);
        if (mVar.getPaddingBottom() != L) {
            mVar.setPadding(mVar.getPaddingLeft(), mVar.getPaddingTop(), mVar.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        y yVar = this.F;
        if (yVar != null) {
            if (z10) {
                yVar.e();
            }
            return false;
        }
        x0 x0Var = this.d;
        if (x0Var != null) {
            float f7 = x0Var.k1;
            if (f7 > 0.5f || x0Var.f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        x0Var.l1 = 0.0f;
                    } else if (x0Var.f1 > 0.5f) {
                        x0Var.g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.d == null || org.telegram.messenger.i0.Q1()) {
            return null;
        }
        this.d.setRevealOpening(z10);
        this.d.setReveal(z10 ? 0.0f : 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new e0(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z10 ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new androidx.fragment.app.g(this, z10, runnable, 13));
        org.telegram.messenger.i0.g3(new v1(17, this, animatorSet));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.D = bundle3 != null && bundle3.getBoolean("immediate") && tz.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0();
        org.telegram.ui.e eVar = this.c;
        if (eVar != null) {
            kj0 kj0Var = (kj0) eVar.b;
            if (kj0Var.b.remove(eVar)) {
                kj0Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.g();
            this.F = null;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.l();
            this.e = null;
        }
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        y yVar = this.F;
        if (yVar != null) {
            yVar.g();
            y yVar2 = this.F;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(yVar2);
            }
            if (this.F == yVar2) {
                this.F = null;
            }
            x0 x0Var = this.d;
            if (x0Var != null) {
                x0Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.r0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.r0.booleanValue());
        this.r0 = null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 4) {
            boolean z10 = iArr.length > 0 && iArr[0] == 0;
            if (this.E && z10) {
                this.E = false;
                g0();
            }
            this.E = false;
            return;
        }
        if (getParentActivity() == null || i10 != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            e0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(cd.L0(2131746518, null));
        alertDialog$Builder.k(cd.L0(2131747316, null), new z(this));
        alertDialog$Builder.h(cd.L0(2131751772, null), null);
        int i11 = t6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, t6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        a0();
        if (getParentActivity() != null) {
            org.telegram.messenger.i0.l3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        x0 x0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.G = true;
        }
        if (z10 && (x0Var = this.d) != null) {
            x0Var.setReveal(1.0f);
        }
        if (!z10 || z11 || this.f == null) {
            return;
        }
        float f7 = g.S;
        long j10 = 0;
        if (Build.VERSION.SDK_INT >= 29 && tz.o() == 2) {
            j10 = Math.max(0L, Math.round(y0.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        d0 d0Var = this.H;
        frameLayout.removeCallbacks(d0Var);
        this.f.postDelayed(d0Var, j10 + 680);
    }
}
