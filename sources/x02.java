// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class x02 extends fx0 implements gk7, ax0, x74 {
    public static final /* synthetic */ int G4 = 0;
    public boolean A1;
    public final wz1 A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final zz1 B2;
    public final hn B3;
    public eb1 B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final cq3 C4;
    public f D1;
    public final int[] D2;
    public int D3;
    public final ix4 D4;
    public int E1;
    public final wz1 E2;
    public k27 E3;
    public final kl0 E4;
    public int F1;
    public final e02 F2;
    public boolean F3;
    public final vw0 F4;
    public boolean G1;
    public final TextPaint G2;
    public final int G3;
    public boolean H1;
    public final RectF H2;
    public boolean H3;
    public boolean I1;
    public final Paint I2;
    public boolean I3;
    public boolean J1;
    public AnimatorSet J2;
    public boolean J3;
    public ul5 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final st L2;
    public boolean L3;
    public final yv7 M1;
    public final b02 M2;
    public boolean M3;
    public f72 N1;
    public byte N2;
    public boolean N3;
    public wl5 O1;
    public wf0 O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public t22 R1;
    public boolean R2;
    public boolean R3;
    public e12 S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final x10 U2;
    public ValueAnimator U3;
    public final ql0 V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public v02 W3;
    public float X1;
    public final r7 X2;
    public y52 X3;
    public final i02 Y1;
    public final gk2 Y2;
    public final int[] Y3;
    public final d Z1;
    public final r7 Z2;
    public int Z3;
    public final boolean a2;
    public je5 a3;
    public float a4;
    public bx1 b2;
    public final r7 b3;
    public float b4;
    public boolean c2;
    public final t8 c3;
    public boolean c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float d3;
    public float d4;
    public k22 e2;
    public float e3;
    public final boolean e4;
    public h12 f2;
    public final wz1 f3;
    public boolean f4;
    public k62 g2;
    public final TextView g3;
    public final ArrayList g4;
    public k62 h2;
    public final r7 h3;
    public final Rect h4;
    public c42 i2;
    public final LinearLayout i3;
    public float i4;
    public d32 j2;
    public final ImageView j3;
    public boolean j4;
    public m52 k2;
    public final LinearLayout k3;
    public int k4;
    public final fm0 l1;
    public v12 l2;
    public final TextView l3;
    public final i02 l4;
    public final fm0 m1;
    public p62 m2;
    public float m3;
    public yla m4;
    public final fm0 n1;
    public e32 n2;
    public boolean n3;
    public AnimatorSet n4;
    public final fm0 o1;
    public e32 o2;
    public final k02 o3;
    public int o4;
    public final fm0 p1;
    public e72 p2;
    public boolean p3;
    public int p4;
    public final fm0 q1;
    public r32 q2;
    public Object q3;
    public boolean q4;
    public final k79 r1;
    public boolean r2;
    public boolean r3;
    public boolean r4;
    public ku1 s1;
    public float s2;
    public final ry1 s3;
    public boolean s4;
    public final hn t1;
    public final p02[] t2;
    public final yz1 t3;
    public b42 t4;
    public final hn u1;
    public final LongSparseArray u2;
    public final wz1 u3;
    public boolean u4;
    public final ImageView v1;
    public p02 v2;
    public final xz1 v3;
    public boolean v4;
    public final gc w1;
    public p02 w2;
    public final t26 w3;
    public File w4;
    public final ImageView x1;
    public final il0 x2;
    public final u02 x3;
    public double[] x4;
    public final gc y1;
    public final il0 y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final u31 z2;
    public final RadialProgressView z3;
    public boolean z4;

    public x02(Context context, d dVar, boolean z, boolean z2, boolean z3, final wjb wjbVar) {
        super(1, wjbVar, context, false);
        kl0 kl0Var;
        kl0 kl0Var2;
        r7 r7Var;
        t8 t8Var;
        float f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i;
        s33 s33Var = s33.h;
        this.l1 = new fm0(0, this, s33Var, 380L, false);
        this.m1 = new fm0(1, this, s33Var, 380L, false);
        this.n1 = new fm0(2, this, s33Var, 380L, false);
        this.o1 = new fm0(3, this, s33Var, 380L, false);
        this.p1 = new fm0(4, this, s33Var, 380L, true);
        this.q1 = new fm0(5, this, s33Var, 320L, false);
        k79 k79Var = new k79(new fz1(this, (byte) 2), s33Var, 380L);
        this.r1 = k79Var;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new i02(this, (byte) 0);
        this.c2 = false;
        p02[] p02VarArr = new p02[12];
        this.t2 = p02VarArr;
        this.u2 = new LongSparseArray();
        this.D2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G2 = textPaint;
        this.H2 = new RectF();
        this.I2 = new Paint(1);
        this.R2 = true;
        this.S2 = 1.0f;
        this.y3 = false;
        this.A3 = false;
        int i2 = y6c.t0;
        this.G3 = i2;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.P3 = -1;
        this.Q3 = true;
        this.V3 = gl.L(85.0f);
        this.Y3 = new int[2];
        new Paint(1);
        this.f4 = false;
        ArrayList arrayList = new ArrayList();
        this.g4 = arrayList;
        Rect rect = new Rect();
        this.h4 = rect;
        this.l4 = new i02(this, (byte) 1);
        this.r4 = true;
        this.s4 = false;
        this.z4 = false;
        this.A4 = false;
        this.y = true;
        ix4 ix4Var = new ix4();
        this.D4 = ix4Var;
        ix4Var.a(bkb.v0(bkb.c6, this.J0));
        this.X0.E.add(new ow4(ix4Var, new fz1(this, (byte) 4)));
        if (Build.VERSION.SDK_INT < 31 || !gba.f()) {
            this.C4 = null;
            kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
            this.E4 = kl0Var;
            kl0Var2 = new kl0(ix4Var, ix4Var, ix4Var);
        } else {
            cq3 cq3Var = new cq3(false);
            this.C4 = cq3Var;
            this.X0.a(cq3Var);
            lx4 lx4Var = new lx4(ix4Var);
            lx4Var.f = ix4Var;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            lx4 lx4Var2 = new lx4(null);
            lx4Var2.f = ix4Var;
            lx4Var2.d = cq3Var;
            lx4Var2.e = -3;
            kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
            this.E4 = kl0Var;
            kl0Var.k = true;
            int L = e66.e(262144) ? gl.L(8.0f) : gl.L(48.0f);
            kl0Var.d = L;
            kl0Var.e = L;
            kl0Var2 = new kl0(lx4Var2, lx4Var2, lx4Var2);
            kl0Var2.k = true;
            int L2 = gl.L(48.0f);
            kl0Var2.d = L2;
            kl0Var2.e = L2;
        }
        kl0 kl0Var3 = kl0Var;
        kl0 kl0Var4 = new kl0(ix4Var, ix4Var, ix4Var);
        this.F4 = new vw0(this, (byte) 2);
        this.e4 = z;
        this.a2 = (dVar instanceof mu1) && dVar.isInBubbleMode();
        this.l0 = new OvershootInterpolator(0.7f);
        this.Z1 = dVar;
        this.G = true;
        this.z0 = this;
        kk7.f(i2).b(this, kk7.S0);
        kk7.f(i2).b(this, kk7.Y4);
        kk7.f(i2).b(this, kk7.h5);
        kk7.f(i2).b(this, kk7.E1);
        arrayList.add(rect);
        k02 k02Var = new k02(this, context);
        this.o3 = k02Var;
        k02Var.setDelegate(new l02(this));
        this.b = k02Var;
        k02Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.setPadding(i3, 0, i3, 0);
        x10 x10Var = new x10(this, context, wjbVar, (byte) 1);
        this.U2 = x10Var;
        x10Var.d1 = true;
        x10Var.setForcedMenuWidth(gl.L(46.0f));
        x10Var.setBackButtonDrawable(new ed0(false));
        int i4 = bkb.i5;
        zkb.l(x10Var, 1, i4, wjbVar);
        int i5 = bkb.H5;
        zkb.l(x10Var, 3, i5, wjbVar);
        zkb.l(x10Var, 5, i4, wjbVar);
        x10Var.setOccupyStatusBar(true);
        x10Var.setAlpha(0.0f);
        x10Var.setActionBarMenuOnItemClick(new r8(this, (byte) 22));
        kl0 kl0Var5 = kl0Var2;
        r7 r7Var2 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
        this.X2 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(R.drawable.ic_ab_other);
        r7Var2.setContentDescription(k96.M0(2131754838, null));
        r7Var2.setVisibility(4);
        r7Var2.setAlpha(0.0f);
        r7Var2.setScaleX(0.6f);
        r7Var2.setScaleY(0.6f);
        r7Var2.setSubMenuOpenSide(2);
        r7Var2.setDelegate(new fz1(this, (byte) 10));
        r7Var2.setAdditionalYOffset(gl.L(72.0f));
        r7Var2.setTranslationX(gl.L(1.0f));
        ff0 f0 = bkb.f0(bkb.v0(i5, this.J0), 6, -1);
        vkb M = zkb.M(i5);
        r7Var2.setBackground(f0);
        zkb.j(r7Var2, f0, null, M, wjbVar);
        final byte b = 5;
        r7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b2 = b;
                x02 x02Var = this.b;
                switch (b2) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout2.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i6);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var3 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var3.getWidth() / 2.0f) + r7Var3.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        r7 r7Var3 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
        this.Z2 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        gk2 gk2Var = new gk2();
        this.Y2 = gk2Var;
        r7Var3.setIcon(gk2Var);
        r7Var3.setContentDescription(k96.M0(2131754838, null));
        r7Var3.setVisibility(8);
        r7Var3.setAlpha(0.0f);
        r7Var3.setScaleX(0.6f);
        r7Var3.setScaleY(0.6f);
        r7Var3.setAdditionalYOffset(gl.L(72.0f));
        r7Var3.setTranslationX(-gl.L(3.0f));
        final byte b2 = 6;
        ff0 f02 = bkb.f0(bkb.v0(i5, this.J0), 6, -1);
        vkb M2 = zkb.M(i5);
        r7Var3.setBackground(f02);
        zkb.j(r7Var3, f02, null, M2, wjbVar);
        r7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b2;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout2.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i6);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        t8 t8Var2 = new t8(this, context);
        zkb.X(t8Var2, bkb.Ii, wjbVar);
        t8Var2.setText(k96.M0(2131751741, null));
        t8Var2.setTypeface(gl.o());
        t8Var2.setTextSize(1, 14.0f);
        t8Var2.setVisibility(4);
        t8Var2.setAlpha(0.0f);
        t8Var2.setGravity(17);
        t8Var2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        t8Var2.setTranslationX(-gl.L(12.0f));
        final byte b3 = 7;
        t8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b3;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout2.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i6);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        ote.a(t8Var2);
        this.c3 = t8Var2;
        G1();
        if (dVar != null) {
            r7Var = r7Var3;
            t8Var = t8Var2;
            f = 14.0f;
            r7 r7Var4 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
            this.b3 = r7Var4;
            r7Var4.setLongClickEnabled(false);
            r7Var4.setIcon(R.drawable.outline_header_search);
            r7Var4.setContentDescription(k96.M0(2131745644, null));
            r7Var4.setVisibility(4);
            r7Var4.setAlpha(0.0f);
            r7Var4.setTranslationX(-gl.L(42.0f));
            ff0 f03 = bkb.f0(bkb.v0(i5, this.J0), 6, -1);
            vkb M3 = zkb.M(i5);
            r7Var4.setBackground(f03);
            zkb.j(r7Var4, f03, null, M3, wjbVar);
            r7Var4.setOnClickListener(new v6((byte) 2, this, z2));
        } else {
            r7Var = r7Var3;
            t8Var = t8Var2;
            f = 14.0f;
        }
        r7 r7Var5 = new r7(context, null, 0, bkb.v0(i4, this.J0), false, wjbVar);
        this.h3 = r7Var5;
        r7Var5.setLongClickEnabled(false);
        r7Var5.setIcon(R.drawable.ic_ab_other);
        r7Var5.setContentDescription(k96.M0(2131754838, null));
        final byte b4 = 8;
        r7Var5.setVisibility(8);
        ff0 f04 = bkb.f0(bkb.v0(i5, this.J0), 3, -1);
        vkb M4 = zkb.M(i5);
        r7Var5.setBackground(f04);
        zkb.j(r7Var5, f04, null, M4, wjbVar);
        final byte b5 = 2;
        r7Var5.e(1, R.drawable.msg_addbot, k96.M0(2131744640, null)).setOnClickListener(new View.OnClickListener(this) { // from class: kz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b6 = b5;
                wjb wjbVar2 = wjbVar;
                final x02 x02Var = this.b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                char c = 1;
                char c2 = 1;
                switch (b6) {
                    case 0:
                        zz1 zz1Var = x02Var.B2;
                        if (zz1Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(x02Var.getContext(), wjbVar2);
                            a1Var.o1(zz1Var.getText());
                            final Object[] objArr3 = objArr2 == true ? 1 : 0;
                            a1Var.e2 = new p8c() { // from class: lz1
                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b7 = objArr3;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b7) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            b02 b02Var = x02Var2.M2;
                                            b02Var.setText(charSequence);
                                            b02Var.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            a1Var.m1(x02Var.T1, x02Var.E3 != null, new mz1(x02Var, objArr == true ? 1 : 0));
                            a1Var.show();
                            break;
                        }
                        break;
                    case 1:
                        b02 b02Var = x02Var.M2;
                        if (b02Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(x02Var.getContext(), wjbVar2);
                            a1Var2.o1(b02Var.getText());
                            final char c3 = c2 == true ? 1 : 0;
                            a1Var2.e2 = new p8c() { // from class: lz1
                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b7 = c3;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b7) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            a1Var2.m1(x02Var.T1, x02Var.E3 != null, new mz1(x02Var, c == true ? 1 : 0));
                            a1Var2.show();
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = x02Var.Z1;
                        r0.S1(null, dVar2, wjbVar2);
                        PhotoViewer.r0().T1(x02Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i6 = x02Var.P3;
                        boolean z4 = x02Var.Q3;
                        r02.h = i6;
                        r02.n = z4;
                        if (!x02Var.W3.f0()) {
                            gl.t1(dVar2.getFragmentView().findFocus());
                            gl.t1(x02Var.c.findFocus());
                        }
                        File w = f4b.w(x02Var.G3, "webp");
                        Point point = gl.q;
                        int i7 = point.x;
                        int i8 = point.y;
                        if (i7 > 1080 || i8 > 1080) {
                            float min = Math.min(i7, i8) / 1080.0f;
                            i7 = (int) (i7 * min);
                            i8 = (int) (i8 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jm6Var);
                        PhotoViewer.r0().n1(arrayList2, 0, 11, false, new o02(x02Var, jm6Var), dVar2 instanceof mu1 ? (mu1) dVar2 : null);
                        if (x02Var.A1) {
                            PhotoViewer.r0().V(null, null, true, x02Var.D1);
                            break;
                        }
                        break;
                }
            }
        });
        r7Var5.setMenuYOffset(gl.L(-12.0f));
        r7Var5.setAdditionalXOffset(gl.L(12.0f));
        r7Var5.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b4;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout2.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i6);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        final byte b6 = 0;
        wz1 wz1Var = new wz1(this, context, b6);
        this.f3 = wz1Var;
        wz1Var.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b6;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = x02Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout2.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i6);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        wz1Var.setAlpha(0.0f);
        wz1Var.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g3 = textView;
        tb4.w(textView, i4, wjbVar, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, nme.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(imageView, mutate, i4, wjbVar, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, nme.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        wz1Var.addView(linearLayout, nme.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        zkb.x(imageView2, mutate2, i4, wjbVar, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, nme.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l3 = textView2;
        tb4.w(textView2, i4, wjbVar, 1, 16.0f);
        de9.q(textView2, 19, "AttachMediaPreview", 2131753955);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, nme.r(-2, -2, 16));
        wz1Var.addView(linearLayout2, nme.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = new ChatAttachAlertPhotoLayout(this, context, z, z3, wjbVar);
        this.d2 = chatAttachAlertPhotoLayout2;
        p02VarArr[0] = chatAttachAlertPhotoLayout2;
        chatAttachAlertPhotoLayout2.setTranslationX(0.0f);
        this.v2 = chatAttachAlertPhotoLayout2;
        this.T2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout2, nme.c(-1.0f, -1));
        ry1 ry1Var = new ry1(context);
        this.s3 = ry1Var;
        ry1Var.setup(kl0Var4);
        ry1Var.setFadeTopAlpha(0);
        ry1Var.setFadeHeightTop(gl.L(48.0f));
        ry1Var.setFadeHeightBottom(gl.L(48.0f));
        ry1Var.setFadeZoneTop(gl.L(5.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m);
        this.b.addView(ry1Var, nme.g());
        this.b.addView(wz1Var, nme.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        st stVar = new st(context, (byte) 5);
        this.L2 = stVar;
        this.b.addView(stVar, nme.e(-1, -2, 55));
        this.b.addView(x10Var, nme.c(-2.0f, -1));
        this.b.addView(r7Var2, nme.e(48, 48, 53));
        this.b.addView(r7Var, nme.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        r7 r7Var6 = this.b3;
        if (r7Var6 != null) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
            this.b.addView(r7Var6, nme.e(48, 48, 53));
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout2;
        }
        wz1Var.addView(r7Var5, nme.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(t8Var, nme.e(-2, 48, 53));
        wz1 wz1Var2 = new wz1(this, context, (byte) 1);
        this.u3 = wz1Var2;
        xz1 xz1Var = new xz1(context, (byte) 0);
        this.v3 = xz1Var;
        xz1Var.setClipChildren(true);
        xz1Var.setClipToPadding(false);
        u02 u02Var = new u02(this, context);
        this.x3 = u02Var;
        xz1Var.setAdapter(u02Var);
        t26 t26Var = new t26(0, false);
        this.w3 = t26Var;
        xz1Var.setLayoutManager(t26Var);
        xz1Var.setVerticalScrollBarEnabled(false);
        xz1Var.setHorizontalScrollBarEnabled(false);
        xz1Var.setItemAnimator(null);
        xz1Var.setLayoutAnimation(null);
        zkb.l(xz1Var, 21, bkb.z5, wjbVar);
        xz1Var.z2 = true;
        xz1Var.setOverScrollMode(2);
        qw4 qw4Var = this.X0;
        kl0Var3.j = qw4Var;
        kl0Var5.j = qw4Var;
        kl0Var4.j = qw4Var;
        yz1 yz1Var = new yz1(this, context, (byte) 0);
        this.t3 = yz1Var;
        ql0 ql0Var = new ql0(kl0Var4.c(yz1Var, null, false));
        this.V1 = ql0Var;
        if (gba.f()) {
            e66.e(262144);
        }
        ql0Var.b(gl.L(72.0f), true);
        this.b.addView(yz1Var, nme.g());
        il0 c = kl0Var3.c(wz1Var2, nod.g(wjbVar), false);
        c.r(gl.L(28.0f));
        c.q(gl.L(7.0f));
        wz1Var2.setBackground(c);
        xz1Var.setPadding(gl.L(11.0f), gl.L(11.0f), gl.L(11.0f), gl.L(11.0f));
        xz1Var.setClipToOutline(true);
        int L3 = gl.L(11.0f);
        float L4 = gl.L(28.0f);
        xi xiVar = zdc.a;
        xz1Var.setOutlineProvider(new xdc(L3, L4));
        xz1Var.setImportantForAccessibility(1);
        wz1Var2.addView(xz1Var, nme.g());
        this.b.addView(wz1Var2, nme.e(-1, 70, 81));
        xz1Var.setOnItemClickListener(new k0(this, wjbVar, (byte) 8));
        xz1Var.setOnItemLongClickListener(new fz1(this, (byte) 3));
        hn hnVar = new hn(context, true, false, true);
        this.B3 = hnVar;
        hnVar.setVisibility(8);
        hnVar.setAlpha(0.0f);
        hnVar.setGravity(17);
        hnVar.setTypeface(gl.o());
        int L5 = gl.L(16.0f);
        hnVar.setPadding(L5, 0, L5, 0);
        hnVar.setTextSize(gl.L(f));
        final byte b7 = 1;
        hnVar.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b7;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout22.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i6);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        this.b.addView(hnVar, nme.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z3 = radialProgressView;
        radialProgressView.setSize(gl.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, nme.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i6 = bkb.y6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView3, i6, wjbVar, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final byte b8 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b8;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i62 = 0; i62 < chatAttachAlertPhotoLayout22.F.getChildCount(); i62++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i62);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        wz1 wz1Var3 = new wz1(this, context, b8);
        this.A2 = wz1Var3;
        u31 u31Var = new u31(this, context);
        this.z2 = u31Var;
        wz1Var3.addView(u31Var, nme.e(-1, -1, kk7.D1));
        il0 c2 = kl0Var5.c(k02Var, nod.n(wjbVar), false);
        this.x2 = c2;
        c2.U = true;
        c2.s(gl.L(29.0f), gl.L(29.0f), 0.0f, 0.0f);
        c2.u(gl.L(32.0f));
        c2.S.g = 0.4f;
        c2.n();
        il0 c3 = kl0Var3.c(u31Var, nod.n(wjbVar), false);
        this.y2 = c3;
        c3.r(gl.L(22.0f));
        c3.q(gl.L(7.0f));
        u31Var.setPadding(gl.L(7.0f), gl.L(5.0f), gl.L(7.0f), gl.L(5.0f));
        wz1Var3.setWillNotDraw(false);
        wz1Var3.setVisibility(4);
        wz1Var3.setAlpha(0.0f);
        this.b.addView(wz1Var3, nme.e(-1, -2, 83));
        wz1Var3.setOnTouchListener(new jz1((byte) 0));
        hn hnVar2 = new hn(context, false, false, false);
        this.t1 = hnVar2;
        hnVar2.setAllowCancel(true);
        hnVar2.setScaleProperty(0.6f);
        hnVar2.setVisibility(8);
        hnVar2.setTextSize(gl.L(15.0f));
        int i7 = bkb.x6;
        zkb.U(hnVar2, i7, wjbVar);
        hnVar2.setTypeface(gl.o());
        hnVar2.setGravity(17);
        u31Var.addView(hnVar2, nme.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.v1 = imageView4;
        gc gcVar = new gc(context);
        this.w1 = gcVar;
        imageView4.setImageDrawable(gcVar);
        imageView4.setScaleType(scaleType);
        int i8 = bkb.Ml;
        zkb.s(imageView4, i8, wjbVar, mode);
        int i9 = bkb.h6;
        ff0 f05 = bkb.f0(bkb.v0(i9, this.J0), 1, gl.L(16.0f));
        vkb M5 = zkb.M(i9);
        imageView4.setBackground(f05);
        zkb.j(imageView4, f05, null, M5, wjbVar);
        u31Var.addView(imageView4, nme.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView4);
        final byte b9 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: kz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b9;
                wjb wjbVar2 = wjbVar;
                final x02 x02Var = this.b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                char c4 = 1;
                char c22 = 1;
                switch (b62) {
                    case 0:
                        zz1 zz1Var = x02Var.B2;
                        if (zz1Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(x02Var.getContext(), wjbVar2);
                            a1Var.o1(zz1Var.getText());
                            final byte objArr3 = objArr2 == true ? 1 : 0;
                            a1Var.e2 = new p8c() { // from class: lz1
                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b72 = objArr3;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            a1Var.m1(x02Var.T1, x02Var.E3 != null, new mz1(x02Var, objArr == true ? 1 : 0));
                            a1Var.show();
                            break;
                        }
                        break;
                    case 1:
                        b02 b02Var = x02Var.M2;
                        if (b02Var != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(x02Var.getContext(), wjbVar2);
                            a1Var2.o1(b02Var.getText());
                            final byte c32 = c22 == true ? 1 : 0;
                            a1Var2.e2 = new p8c() { // from class: lz1
                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b72 = c32;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            zz1 zz1Var2 = x02Var2.B2;
                                            zz1Var2.setText(charSequence);
                                            zz1Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            a1Var2.m1(x02Var.T1, x02Var.E3 != null, new mz1(x02Var, c4 == true ? 1 : 0));
                            a1Var2.show();
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = x02Var.Z1;
                        r0.S1(null, dVar2, wjbVar2);
                        PhotoViewer.r0().T1(x02Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i62 = x02Var.P3;
                        boolean z4 = x02Var.Q3;
                        r02.h = i62;
                        r02.n = z4;
                        if (!x02Var.W3.f0()) {
                            gl.t1(dVar2.getFragmentView().findFocus());
                            gl.t1(x02Var.c.findFocus());
                        }
                        File w = f4b.w(x02Var.G3, "webp");
                        Point point = gl.q;
                        int i72 = point.x;
                        int i82 = point.y;
                        if (i72 > 1080 || i82 > 1080) {
                            float min = Math.min(i72, i82) / 1080.0f;
                            i72 = (int) (i72 * min);
                            i82 = (int) (i82 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i72, i82, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jm6Var);
                        PhotoViewer.r0().n1(arrayList2, 0, 11, false, new o02(x02Var, jm6Var), dVar2 instanceof mu1 ? (mu1) dVar2 : null);
                        if (x02Var.A1) {
                            PhotoViewer.r0().V(null, null, true, x02Var.D1);
                            break;
                        }
                        break;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.E1 = na7.q1(y6c.t0).F0();
        zz1 zz1Var = new zz1(this, context, k02Var, wjbVar);
        this.B2 = zz1Var;
        zz1Var.K = true;
        zz1Var.setHint(k96.M0(2131754451, "AddCaption"));
        zz1Var.s();
        zz1Var.getEditText().setLayoutParams(nme.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        zz1Var.getEditText().addTextChangedListener(new a02(this, (byte) 0));
        u31Var.addView(zz1Var, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        u31Var.setClipChildren(false);
        wz1Var3.setClipChildren(false);
        zz1Var.setClipChildren(false);
        stVar.setPadding(gl.L(10.0f), gl.L(2.0f), gl.L(10.0f), gl.L(10.0f));
        stVar.setWillNotDraw(false);
        b02 b02Var = new b02(this, context, k02Var, wjbVar);
        this.M2 = b02Var;
        b02Var.K = true;
        b02Var.getEditText().addTextChangedListener(new d02(this, dVar));
        b02Var.getEditText().setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
        b02Var.getEditText().setLayoutParams(nme.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        b02Var.getEditText().setTextSize(1, 17.0f);
        b02Var.getEmojiButton().setLayoutParams(nme.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        b02Var.setHint(k96.M0(2131754451, "AddCaption"));
        stVar.addView(b02Var, nme.e(-1, -2, kk7.D1));
        stVar.setAlpha(0.0f);
        stVar.setVisibility(8);
        zz1Var.addView(imageView3, nme.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        il0 c4 = kl0Var3.c(stVar, nod.n(wjbVar), false);
        c4.r(gl.L(22.0f));
        c4.q(gl.L(7.0f));
        stVar.setBackground(c4);
        stVar.setPadding(gl.L(11.0f), gl.L(9.0f), gl.L(11.0f), gl.L(9.0f));
        hn hnVar3 = new hn(context, false, false, false);
        this.u1 = hnVar3;
        hnVar3.setScaleProperty(0.6f);
        hnVar3.setVisibility(8);
        hnVar3.setTextSize(gl.L(15.0f));
        zkb.U(hnVar3, i7, wjbVar);
        hnVar3.setTypeface(gl.o());
        hnVar3.setGravity(17);
        hnVar3.setAllowCancel(true);
        stVar.addView(hnVar3, nme.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        zkb.s(imageView5, bkb.Ne, wjbVar, mode2);
        b02Var.addView(imageView5, nme.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final byte b10 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b10;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i62 = 0; i62 < chatAttachAlertPhotoLayout22.F.getChildCount(); i62++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i62);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.x1 = imageView6;
        gc gcVar2 = new gc(context);
        this.y1 = gcVar2;
        imageView6.setImageDrawable(gcVar2);
        imageView6.setScaleType(scaleType);
        zkb.s(imageView6, i8, wjbVar, mode);
        ff0 f06 = bkb.f0(bkb.v0(i9, this.J0), 1, gl.L(16.0f));
        vkb M6 = zkb.M(i9);
        imageView6.setBackground(f06);
        zkb.j(imageView6, f06, null, M6, wjbVar);
        stVar.addView(imageView6, nme.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView6);
        final byte b11 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: kz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b11;
                wjb wjbVar2 = wjbVar;
                final x02 x02Var = this.b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                char c42 = 1;
                char c22 = 1;
                switch (b62) {
                    case 0:
                        zz1 zz1Var2 = x02Var.B2;
                        if (zz1Var2 != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var = new a1(x02Var.getContext(), wjbVar2);
                            a1Var.o1(zz1Var2.getText());
                            final byte objArr3 = objArr2 == true ? 1 : 0;
                            a1Var.e2 = new p8c() { // from class: lz1
                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b72 = objArr3;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            zz1 zz1Var22 = x02Var2.B2;
                                            zz1Var22.setText(charSequence);
                                            zz1Var22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            b02 b02Var2 = x02Var2.M2;
                                            b02Var2.setText(charSequence);
                                            b02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            a1Var.m1(x02Var.T1, x02Var.E3 != null, new mz1(x02Var, objArr == true ? 1 : 0));
                            a1Var.show();
                            break;
                        }
                        break;
                    case 1:
                        b02 b02Var2 = x02Var.M2;
                        if (b02Var2 != null) {
                            na7.c1().edit().putInt("aihintshown", 3).apply();
                            a1 a1Var2 = new a1(x02Var.getContext(), wjbVar2);
                            a1Var2.o1(b02Var2.getText());
                            final byte c32 = c22 == true ? 1 : 0;
                            a1Var2.e2 = new p8c() { // from class: lz1
                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b72 = c32;
                                    x02 x02Var2 = x02Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            zz1 zz1Var22 = x02Var2.B2;
                                            zz1Var22.setText(charSequence);
                                            zz1Var22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            b02 b02Var22 = x02Var2.M2;
                                            b02Var22.setText(charSequence);
                                            b02Var22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            a1Var2.m1(x02Var.T1, x02Var.E3 != null, new mz1(x02Var, c42 == true ? 1 : 0));
                            a1Var2.show();
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        d dVar2 = x02Var.Z1;
                        r0.S1(null, dVar2, wjbVar2);
                        PhotoViewer.r0().T1(x02Var);
                        PhotoViewer r02 = PhotoViewer.r0();
                        int i62 = x02Var.P3;
                        boolean z4 = x02Var.Q3;
                        r02.h = i62;
                        r02.n = z4;
                        if (!x02Var.W3.f0()) {
                            gl.t1(dVar2.getFragmentView().findFocus());
                            gl.t1(x02Var.c.findFocus());
                        }
                        File w = f4b.w(x02Var.G3, "webp");
                        Point point = gl.q;
                        int i72 = point.x;
                        int i82 = point.y;
                        if (i72 > 1080 || i82 > 1080) {
                            float min = Math.min(i72, i82) / 1080.0f;
                            i72 = (int) (i72 * min);
                            i82 = (int) (i82 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i72, i82, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(jm6Var);
                        PhotoViewer.r0().n1(arrayList2, 0, 11, false, new o02(x02Var, jm6Var), dVar2 instanceof mu1 ? (mu1) dVar2 : null);
                        if (x02Var.A1) {
                            PhotoViewer.r0().V(null, null, true, x02Var.D1);
                            break;
                        }
                        break;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        wz1 wz1Var4 = new wz1(this, context, (byte) 3);
        this.E2 = wz1Var4;
        wz1Var4.setFocusable(true);
        wz1Var4.setFocusableInTouchMode(true);
        wz1Var4.setVisibility(4);
        wz1Var4.setScaleX(0.2f);
        wz1Var4.setScaleY(0.2f);
        wz1Var4.setAlpha(0.0f);
        wz1Var4.setClipChildren(false);
        wz1Var4.setClipToPadding(false);
        this.b.addView(wz1Var4, nme.e(kk7.u1, 50, 85));
        e02 e02Var = new e02(this, wjbVar, context);
        this.F2 = e02Var;
        e02Var.setImportantForAccessibility(2);
        wz1Var4.addView(e02Var, nme.e(-1, -1, kk7.D1));
        e02Var.setTranslationX(this.u0);
        int L6 = gl.L(52.0f);
        int L7 = gl.L(38.0f);
        e02Var.L = L6;
        e02Var.M = L7;
        float L8 = gl.L(7.0f);
        float L9 = gl.L(6.0f);
        e02Var.P = L8;
        e02Var.Q = L9;
        e02Var.s0 = true;
        final byte b12 = 4;
        e02Var.setOnClickListener(new View.OnClickListener(this) { // from class: iz1
            public final /* synthetic */ x02 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s12 s12Var;
                byte b22 = b12;
                x02 x02Var = this.b;
                switch (b22) {
                    case 0:
                        x02Var.J1(x02Var.v2 != x02Var.k2);
                        break;
                    case 1:
                        long j = x02Var.T2;
                        if (j < 0 && (s12Var = (s12) x02Var.u2.get(-j)) != null) {
                            hv0 webViewContainer = s12Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = x02Var.W1;
                        if (!z4) {
                            x02Var.q1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = x02Var.W1;
                        if (z5) {
                            x02Var.q1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        x02Var.i1();
                        break;
                    case 5:
                        x02Var.X2.U(null, null);
                        break;
                    case 6:
                        if (x02Var.d2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z6 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout22 = x02Var.d2;
                            chatAttachAlertPhotoLayout22.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof jm6) {
                                        jm6 jm6Var = (jm6) entry.getValue();
                                        if (jm6Var.d()) {
                                            jm6Var.O = Boolean.valueOf(T);
                                            for (int i62 = 0; i62 < chatAttachAlertPhotoLayout22.F.getChildCount(); i62++) {
                                                View childAt = chatAttachAlertPhotoLayout22.F.getChildAt(i62);
                                                if (childAt instanceof o48) {
                                                    o48 o48Var = (o48) childAt;
                                                    if (o48Var.getPhotoEntry() == jm6Var) {
                                                        o48Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                gba.f1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout22.y0();
                            }
                            x02Var.I1(true);
                            r7 r7Var32 = x02Var.Z2;
                            je5 je5Var = x02Var.a3;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            je5 je5Var2 = new je5(x02Var.getContext(), 1);
                            x02Var.a3 = je5Var2;
                            je5Var2.t(gl.T2(k96.M0(!T ? 2131748640 : 2131748641, null)));
                            x02Var.a3.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            x02Var.a3.o(1.0f, -((x02Var.b.getWidth() - ((r7Var32.getWidth() / 2.0f) + r7Var32.getX())) - gl.L(14.0f)));
                            x02Var.a3.setTranslationY(x02Var.X2.getTranslationY());
                            je5 je5Var3 = x02Var.a3;
                            je5Var3.r0 = new kx1(x02Var, je5Var2, (byte) 4);
                            x02Var.b.addView(je5Var3, nme.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            x02Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        p02 p02Var = x02Var.v2;
                        if (p02Var != null) {
                            p02Var.x(40);
                            break;
                        }
                        break;
                    default:
                        x02Var.h3.U(null, null);
                        break;
                }
            }
        });
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout;
        e02Var.setOnLongClickListener(new nm1(this, context, wjbVar, dVar, (byte) 1));
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setTypeface(gl.o());
        yz1 yz1Var2 = new yz1(this, context, (byte) 1);
        yz1Var2.setAlpha(0.0f);
        yz1Var2.setScaleX(0.2f);
        yz1Var2.setScaleY(0.2f);
        if (z) {
            H0();
            i = -1;
            this.G0 = -1;
        } else {
            i = -1;
        }
        chatAttachAlertPhotoLayout3.F.getFastScroll().a(kl0Var3, nod.n(wjbVar));
        yv7 yv7Var = new yv7(context);
        this.M1 = yv7Var;
        this.b.addView(yv7Var, nme.c(-1.0f, i));
        nl0 nl0Var = new nl0(wjbVar);
        nl0Var.e = new fz1(this, (byte) 5);
        nl0Var.c = new fz1(this, (byte) 6);
        nl0Var.d = new fz1(this, (byte) 7);
        nl0Var.b = new fz1(this, (byte) 8);
        float N = gl.N(3.3333333f);
        float N2 = gl.N(0.6666667f);
        nl0Var.n = N;
        nl0Var.r = N2;
        float N3 = gl.N(1.0f);
        float N4 = gl.N(0.6666667f);
        nl0Var.f = N3;
        nl0Var.h = N4;
        x10Var.P(kl0Var3, nl0Var, false);
        k79Var.h(1L, false);
        this.X0.i(this.b);
        qw4 qw4Var2 = this.X0;
        qw4Var2.a = new fz1(this, (byte) 9);
        qw4Var2.d = new ax4(gl.L(48.0f));
    }

    public static boolean b1(TLRPC.User user) {
        return (user == null || l7c.C(user) || l7c.u(user) || l7c.y(user) || l7c.B(user.id) || l7c.A(user) || l7c.t(user) || user.id == 489000 || na7.E2(user)) ? false : true;
    }

    public static void n1(p02 p02Var) {
        if (p02Var != null) {
            int i = zkb.b;
            Object tag = p02Var.getTag(R.id.theme_generation);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return;
            }
            p02Var.setTag(R.id.theme_generation, Integer.valueOf(i));
            try {
                zkb.c0(p02Var, true);
                p02Var.d();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // fx0
    public final boolean A0() {
        p02 p02Var = this.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        return p02Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1;
    }

    public final void A1(p02 p02Var) {
        long j = this.T2;
        f72 f72Var = this.N1;
        if (p02Var == f72Var) {
            j = f72Var.s;
        } else if (p02Var == this.d2) {
            j = 1;
        } else if (p02Var == this.f2) {
            j = 3;
        } else if (p02Var == this.j2) {
            j = 4;
        } else if (p02Var == this.e2) {
            j = 5;
        } else if (p02Var == this.i2) {
            j = 6;
        } else if (p02Var == this.g2) {
            j = 9;
        } else if (p02Var == this.l2) {
            j = 10;
        } else if (p02Var == this.m2) {
            j = 11;
        } else if (p02Var == this.h2) {
            j = 12;
        } else if (p02Var == this.n2) {
            j = 14;
        } else if (p02Var == this.o2) {
            j = 13;
        } else if (p02Var == this.p2) {
            j = 16;
        } else if (p02Var == this.q2) {
            j = 17;
        }
        B1(p02Var, j, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B1(p02 p02Var, long j, boolean z) {
        b52 b52Var;
        b52 b52Var2;
        Float f;
        int i;
        Float valueOf = Float.valueOf(0.0f);
        if (this.q3 == null && this.J2 == null) {
            p02 p02Var2 = this.v2;
            if (p02Var2 == p02Var) {
                p02Var2.K();
                return;
            }
            int i2 = 0;
            if (p02Var == this.h2 && !y6c.h(this.G3).p()) {
                new jh8(this.Z1, 39, false).show();
                return;
            }
            this.p1.a(j == 1, z);
            this.r1.h(Long.valueOf(j), z);
            this.A3 = false;
            this.y3 = false;
            this.C3 = 0.0f;
            this.B3.setVisibility(8);
            RadialProgressView radialProgressView = this.z3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            wz1 wz1Var = this.u3;
            wz1Var.setAlpha(1.0f);
            wz1Var.setTranslationY(this.C3);
            int i3 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u2;
                if (i3 >= longSparseArray.size()) {
                    break;
                }
                ((s12) longSparseArray.valueAt(i3)).setMeasureOffsetY(0);
                i3++;
            }
            this.T2 = j;
            xz1 xz1Var = this.v3;
            int childCount = xz1Var.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = xz1Var.getChildAt(i4);
                if (childAt instanceof r02) {
                    r02 r02Var = (r02) childAt;
                    i = childCount;
                    f = valueOf;
                    r02Var.a.f(((long) r02Var.b) == r02Var.c.T2, true);
                } else {
                    f = valueOf;
                    i = childCount;
                    if (childAt instanceof q02) {
                        ((q02) childAt).a(true);
                    }
                }
                i4++;
                childCount = i;
                valueOf = f;
            }
            Float f2 = valueOf;
            int firstOffset = (this.v2.getFirstOffset() - gl.L(11.0f)) - this.Y3[0];
            this.w2 = p02Var;
            K0(p02Var);
            int i5 = this.w2.j() != 0 ? 0 : 4;
            x10 x10Var = this.U2;
            x10Var.setVisibility(i5);
            if (x10Var.o0) {
                x10Var.n(true);
            }
            this.v2.v();
            p02 p02Var3 = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if (p02Var3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w2.I(this.v2);
            this.w2.setVisibility(0);
            if (p02Var.getParent() != null) {
                this.b.removeView(this.w2);
            }
            int indexOfChild = this.b.indexOfChild(this.v2);
            if (this.w2.getParent() != this.b) {
                n1(this.w2);
                ViewGroup viewGroup = this.b;
                p02 p02Var4 = this.w2;
                if (p02Var4 != this.i2) {
                    indexOfChild++;
                }
                viewGroup.addView(p02Var4, indexOfChild, nme.c(-1.0f, -1));
            }
            vq0 vq0Var = new vq0(this, (byte) 6);
            p02 p02Var5 = this.v2;
            boolean z2 = p02Var5 instanceof m52;
            i02 i02Var = this.Y1;
            if (z2 || (this.w2 instanceof m52)) {
                int max = Math.max(this.w2.getWidth(), this.v2.getWidth());
                p02 p02Var6 = this.w2;
                if (p02Var6 instanceof m52) {
                    p02Var6.setTranslationX(max);
                    p02 p02Var7 = this.v2;
                    if ((p02Var7 instanceof ChatAttachAlertPhotoLayout) && (b52Var2 = ((ChatAttachAlertPhotoLayout) p02Var7).Q) != null) {
                        b52Var2.setVisibility(4);
                    }
                } else {
                    this.v2.setTranslationX(-max);
                    p02 p02Var8 = this.w2;
                    if (p02Var8 == chatAttachAlertPhotoLayout && (b52Var = ((ChatAttachAlertPhotoLayout) p02Var8).Q) != null) {
                        b52Var.setVisibility(0);
                    }
                }
                this.w2.setAlpha(1.0f);
                this.v2.setAlpha(1.0f);
                if (z) {
                    p02 p02Var9 = this.v2;
                    i02Var.getClass();
                    i02Var.a(p02Var9, f2);
                    gl.d3(new jn1(this, p02Var, vq0Var, (byte) 11));
                } else {
                    Object[] objArr = this.w2.getCurrentItemTop() <= p02Var.getButtonsHideOffset();
                    this.v2.w(1.0f);
                    this.w2.w(1.0f);
                    this.v2.m(this.i4);
                    this.w2.m(this.i4);
                    this.b.invalidate();
                    this.X0.g();
                    p02 p02Var10 = this.v2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    i02Var.getClass();
                    i02Var.a(p02Var10, valueOf2);
                    x10Var.setTag(objArr != false ? 1 : null);
                    vq0Var.run();
                }
            } else if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.w2.setAlpha(0.0f);
                this.w2.setTranslationY(gl.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.v2, (Property<p02, Float>) View.TRANSLATION_Y, gl.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v2, i02Var, 0.0f, 1.0f), ObjectAnimator.ofFloat(x10Var, (Property<x10, Float>) View.ALPHA, x10Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(s33.f);
                animatorSet.addListener(new f02(this, firstOffset, vq0Var, null == true ? 1 : 0));
                this.q3 = animatorSet;
                p02 p02Var11 = this.v2;
                i02Var.getClass();
                i02Var.a(p02Var11, f2);
                animatorSet.start();
            } else {
                p02Var5.setAlpha(0.0f);
                vq0Var.run();
                K1(0);
                this.b.invalidate();
            }
            if (this.j4 && !(p02Var instanceof s12)) {
                this.j4 = false;
                x10Var.updateColors();
                x10Var.invalidate();
                d1();
            }
            if (j == 1 || j == 6 || j == 17 || (p02Var instanceof s12)) {
                i2 = gl.L(46.0f);
            } else if (j == 4) {
                i2 = gl.L(84.0f);
            }
            x10Var.setForcedMenuWidth(i2);
        }
    }

    public final void C1(boolean z, Boolean bool) {
        x02 x02Var;
        if (this.g2 == null) {
            x02Var = this;
            k62 k62Var = new k62(x02Var, getContext(), false, this.J0, bool);
            x02Var.g2 = k62Var;
            x02Var.t2[1] = k62Var;
            k62Var.setDelegate(new fz1(x02Var, (byte) 17));
        } else {
            x02Var = this;
        }
        x02Var.B1(x02Var.g2, 9L, z);
    }

    public final void D1(boolean z, boolean z2) {
        Integer num;
        p02 p02Var;
        this.n1.a(z, z2);
        x10 x10Var = this.U2;
        Object tag = x10Var.getTag();
        if (z) {
            if (tag != null) {
                return;
            } else {
                num = 1;
            }
        } else if (tag == null) {
            return;
        } else {
            num = null;
        }
        x10Var.setTag(num);
        AnimatorSet animatorSet = this.V2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V2 = null;
        }
        boolean z3 = (this.z1 || this.Q2 || (this.N2 == 0 && this.n3) || this.v2 != this.d2 || (!this.I3 && !this.J3)) ? false : true;
        if (this.v2 == this.N1) {
            z3 = false;
        }
        wz1 wz1Var = this.u3;
        r7 r7Var = this.X2;
        if (z) {
            if (z3) {
                r7Var.setVisibility(0);
                r7Var.setClickable(true);
            }
        } else if (this.P2 && this.A2.getTag() == null) {
            wz1Var.setVisibility(0);
        }
        d dVar = this.Z1;
        if (dVar != null) {
            if (z) {
                gl.m3(this, bm2.h(bkb.v0(this.e4 ? bkb.jh : bkb.g5, this.J0)) > 0.699999988079071d);
            } else {
                gl.m3(this, dVar.isLightStatusBar());
            }
        }
        byte b = 4;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z ? 1.0f : 0.0f) - x10Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x10Var, (Property<x10, Float>) property, z ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new gz1(this, b));
            arrayList.add(ofFloat);
            if (z3) {
                arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
            }
            this.V2.playTogether(arrayList);
            this.V2.addListener(new y7((byte) 15, (Object) this, z));
            this.V2.setInterpolator(s33.h);
            this.V2.setDuration(380L);
            this.V2.start();
            return;
        }
        if (z && this.P2 && ((p02Var = this.v2) == null || p02Var.N())) {
            wz1Var.setVisibility(4);
        }
        x10Var.setAlpha(z ? 1.0f : 0.0f);
        if (z3) {
            r7Var.setAlpha(z ? 1.0f : 0.0f);
            r7Var.setScaleX(z ? 1.0f : 0.6f);
            r7Var.setScaleY(z ? 1.0f : 0.6f);
        }
        if (z) {
            return;
        }
        r7 r7Var2 = this.b3;
        if (r7Var2 != null) {
            r7Var2.setVisibility(4);
        }
        if (this.N2 == 0 && this.n3) {
            return;
        }
        r7Var.setVisibility(4);
    }

    @Override // fx0
    public final boolean E() {
        return false;
    }

    public final void E0() {
        if (U0().a.length() <= 0) {
            return;
        }
        this.v2.a(U0().getText());
    }

    public final void E1() {
        float alpha;
        int[] iArr = this.D2;
        zz1 zz1Var = this.B2;
        zz1Var.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            p02 p02Var = this.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((p02Var == chatAttachAlertPhotoLayout || p02Var == this.k2) && this.W1) {
                st stVar = this.L2;
                alpha = (stVar.getAlpha() * stVar.getMeasuredHeight()) + (stVar.getY() - this.B4.getTop());
            } else {
                alpha = -zz1Var.getHeight();
            }
            if (Math.abs(this.B4.getTranslationY() - alpha) > 0.5f) {
                this.B4.setTranslationY(alpha);
                this.B4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                }
            }
        }
        N0();
    }

    @Override // fx0
    public final boolean F() {
        return this.v2.b();
    }

    public final boolean F0() {
        d dVar = this.Z1;
        return (dVar instanceof mu1) && ((mu1) dVar).O4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0071, code lost:
    
        if (r14.n3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r14.Q2 == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F1(int i) {
        d dVar;
        boolean z;
        boolean z2;
        boolean z3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.q3 == null) {
            int selectedItemsCount = this.v2.getSelectedItemsCount();
            e02 e02Var = this.F2;
            if (selectedItemsCount == 0) {
                e02Var.f(0, i != 0);
                z1(false, i != 0);
            } else {
                if (z1(true, i != 0) || i == 0) {
                    e02Var.f(selectedItemsCount, i != 0);
                    e02Var.a();
                } else {
                    e02Var.f(selectedItemsCount, true);
                    e02Var.a();
                }
            }
            this.v2.F(selectedItemsCount);
            I0(i != 0);
            if (this.v2 == this.d2 && (((z = (dVar = this.Z1) instanceof mu1)) || this.N2 != 0 || this.Q2)) {
                if (selectedItemsCount == 0) {
                    if (!this.n3) {
                        if (this.N2 == 0) {
                        }
                    }
                    this.n3 = (selectedItemsCount == 0 && this.N2 == 0 && !this.Q2) ? false : true;
                    AnimatorSet animatorSet = this.W2;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.W2 = null;
                    }
                    byte b = this.N2;
                    x10 x10Var = this.U2;
                    r7 r7Var = this.b3;
                    if (b != 0 && r7Var != null && x10Var.getTag() != null && z) {
                        mu1 mu1Var = (mu1) dVar;
                        if (!hc2.T(mu1Var.e) || (tL_chatBannedRights = mu1Var.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                            z2 = true;
                            z3 = this.n3;
                            wz1 wz1Var = this.f3;
                            r7 r7Var2 = this.X2;
                            if (!z3) {
                                if (this.N2 == 0 && !this.Q2) {
                                    r7Var2.setVisibility(0);
                                    r7Var2.setClickable(true);
                                }
                                wz1Var.setVisibility(0);
                            } else if (x10Var.getTag() != null && r7Var != null) {
                                r7Var.setVisibility(0);
                            }
                            if (i != 0) {
                                if (x10Var.getTag() == null && this.N2 == 0 && !this.Q2) {
                                    r7Var2.setAlpha(this.n3 ? 1.0f : 0.0f);
                                    r7Var2.setScaleX(this.n3 ? 1.0f : 0.6f);
                                    r7Var2.setScaleY(this.n3 ? 1.0f : 0.6f);
                                }
                                wz1Var.setAlpha(this.n3 ? 1.0f : 0.0f);
                                if (z2) {
                                    r7Var.setAlpha(this.n3 ? 0.0f : 1.0f);
                                }
                                if (this.n3 && r7Var != null) {
                                    r7Var.setVisibility(4);
                                }
                            } else {
                                this.W2 = new AnimatorSet();
                                ArrayList arrayList = new ArrayList();
                                if (x10Var.getTag() == null && this.N2 == 0 && !this.Q2) {
                                    arrayList.add(ObjectAnimator.ofFloat(r7Var2, (Property<r7, Float>) View.ALPHA, this.n3 ? 1.0f : 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(r7Var2, (Property<r7, Float>) View.SCALE_X, this.n3 ? 1.0f : 0.6f));
                                    arrayList.add(ObjectAnimator.ofFloat(r7Var2, (Property<r7, Float>) View.SCALE_Y, this.n3 ? 1.0f : 0.6f));
                                }
                                Property property = View.ALPHA;
                                arrayList.add(ObjectAnimator.ofFloat(wz1Var, (Property<wz1, Float>) property, this.n3 ? 1.0f : 0.0f));
                                if (z2) {
                                    arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property, this.n3 ? 0.0f : 1.0f));
                                }
                                this.W2.playTogether(arrayList);
                                this.W2.addListener(new bb1((Object) this, (byte) 13));
                                this.W2.setDuration(180L);
                                this.W2.start();
                            }
                        }
                    }
                    z2 = false;
                    z3 = this.n3;
                    wz1 wz1Var2 = this.f3;
                    r7 r7Var22 = this.X2;
                    if (!z3) {
                    }
                    if (i != 0) {
                    }
                }
            }
            I1(i != 0);
            k27 k27Var = this.E3;
            long K1 = (k27Var == null || k27Var.o5()) ? na7.q1(this.G3).K1(V0()) : 0L;
            p02 p02Var = this.v2;
            e02Var.i(R0() + (p02Var != null ? p02Var.getSelectedItemsCount() : 0), K1, true);
            zz1 zz1Var = this.B2;
            if (zz1Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zz1Var.getLayoutParams();
                int max = Math.max(gl.L(48.0f), e02Var.l());
                if (marginLayoutParams.rightMargin != max) {
                    marginLayoutParams.rightMargin = max;
                    zz1Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public final boolean G0(CharSequence charSequence) {
        d dVar = this.Z1;
        if (!(dVar instanceof mu1)) {
            return false;
        }
        return ChatActivityEnterView.K(this.G3, ((mu1) dVar).a(), dVar, charSequence);
    }

    public final void G1() {
        float f;
        p02 p02Var = this.v2;
        boolean i = p02Var == null ? false : p02Var.i();
        t8 t8Var = this.c3;
        t8Var.setEnabled(i);
        p02 p02Var2 = this.v2;
        if (p02Var2 != null) {
            f = ((p02Var2.i() ? 1.0f : 0.5f) * (this.w2 == null ? 1.0f : this.X1)) + 0.0f;
        } else {
            f = 0.0f;
        }
        p02 p02Var3 = this.w2;
        if (p02Var3 != null) {
            f = tb4.A(1.0f, this.X1, p02Var3.i() ? 1.0f : 0.5f, f);
        }
        this.d3 = f;
        if (t8Var != null) {
            float f2 = f * this.e3;
            t8Var.setAlpha(f2);
            t8Var.setVisibility(f2 <= 0.0f ? 4 : 0);
        }
    }

    @Override // fx0
    public final void H() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            yla ylaVar = this.m4;
            if (ylaVar != null) {
                ylaVar.d();
            }
            AnimatorSet animatorSet2 = this.n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = (byte) 0;
        }
    }

    public final void H0() {
        xz1 xz1Var = this.v3;
        if (xz1Var == null) {
            return;
        }
        int childCount = xz1Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xz1Var.getChildAt(i);
        }
        boolean z = this.e4;
        zkb.X(this.g3, z ? bkb.Xg : bkb.i5, this.J0);
        zkb.X(this.l3, z ? bkb.Xg : bkb.i5, this.J0);
        zkb.X(this.c3, bkb.Ii, this.J0);
        int v0 = bkb.v0(z ? bkb.Xg : bkb.i5, this.J0);
        boolean z2 = (this.q4 && v0 == this.p4) ? false : true;
        this.q4 = true;
        this.p4 = v0;
        r7 r7Var = this.X2;
        if (z2) {
            r7Var.setIconColor(v0);
        }
        bkb.A1(bkb.v0(z ? bkb.Yg : bkb.H5, this.J0), r7Var.getBackground());
        int i2 = bkb.D8;
        r7Var.O(bkb.v0(i2, this.J0), false);
        r7Var.O(bkb.v0(i2, this.J0), true);
        r7Var.I(bkb.v0(bkb.F8, this.J0));
        r7 r7Var2 = this.Z2;
        if (r7Var2 != null && z2) {
            r7Var2.setIconColor(v0);
        }
        r7 r7Var3 = this.b3;
        if (r7Var3 != null) {
            if (z2) {
                r7Var3.setIconColor(v0);
            }
            bkb.A1(bkb.v0(z ? bkb.Yg : bkb.H5, this.J0), r7Var3.getBackground());
        }
        zz1 zz1Var = this.B2;
        wjb wjbVar = zz1Var.N;
        mt3 mt3Var = zz1Var.a;
        int i3 = zz1Var.M;
        if (i3 == 0) {
            mt3Var.setHintTextColor(bkb.v0(bkb.G6, wjbVar));
            int i4 = bkb.F6;
            mt3Var.setCursorColor(bkb.v0(i4, wjbVar));
            mt3Var.setTextColor(bkb.v0(i4, wjbVar));
        } else if (i3 == 2 || i3 == 3) {
            mt3Var.setHintTextColor(-1929379841);
            mt3Var.setTextColor(-1);
            mt3Var.setCursorColor(-1);
            mt3Var.setHandlesColor(-1);
            mt3Var.setHighlightColor(822083583);
            mt3Var.E = -1;
        } else {
            mt3Var.setHintTextColor(bkb.v0(bkb.s5, wjbVar));
            mt3Var.setTextColor(bkb.v0(bkb.i5, wjbVar));
        }
        zz1Var.c.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.Ne, wjbVar), PorterDuff.Mode.MULTIPLY));
        nt3 nt3Var = zz1Var.d;
        if (nt3Var != null) {
            nt3Var.updateColors();
        }
        zkb.l(xz1Var, 21, bkb.z5, this.J0);
        int i5 = z ? bkb.Xg : bkb.i5;
        wjb wjbVar2 = this.J0;
        x10 x10Var = this.U2;
        zkb.l(x10Var, 1, i5, wjbVar2);
        zkb.l(x10Var, 3, z ? bkb.Yg : bkb.H5, this.J0);
        zkb.l(x10Var, 5, z ? bkb.Xg : bkb.i5, this.J0);
        int Y0 = Y0(false);
        bkb.A1(Y0, this.s0);
        ix4 ix4Var = this.D4;
        if (ix4Var.b != Y0) {
            ix4Var.a(Y0);
            ry1 ry1Var = this.s3;
            if (ry1Var != null) {
                ry1Var.invalidate();
            }
            yz1 yz1Var = this.t3;
            if (yz1Var != null) {
                yz1Var.invalidate();
            }
        }
        this.b.invalidate();
        int i6 = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i6 >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i6];
            if (p02Var != null) {
                p02Var.d();
            }
            i6++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            M(bkb.g5);
            return;
        }
        this.G0 = -1;
        this.H0 = bkb.v0(bkb.h5, this.J0);
        gl.p3(this, bkb.v0(bkb.g5, this.J0), false, null);
        gl.j3(this, ((double) gl.B(this.H0)) > 0.721d);
    }

    public final void H1(p02 p02Var, int i) {
        if (p02Var != null) {
            cq3 cq3Var = this.C4;
            if (cq3Var != null && Build.VERSION.SDK_INT >= 31) {
                cq3Var.f(0.0f, i);
            }
            int currentItemTop = p02Var.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z = false;
                boolean z2 = p02Var == this.v2 && currentItemTop <= p02Var.getButtonsHideOffset();
                this.L1 = z2;
                if (p02Var == this.v2) {
                    D1(z2, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p02Var.getLayoutParams();
                int z3 = b00.z(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
                p02 p02Var2 = this.v2;
                int i2 = p02Var2 == p02Var ? 0 : 1;
                if ((p02Var2 instanceof m52) || (this.w2 instanceof m52)) {
                    Object obj = this.q3;
                    if ((obj instanceof yla) && ((yla) obj).f) {
                        z = true;
                    }
                }
                int[] iArr = this.Y3;
                int i3 = iArr[i2];
                if (i3 == z3 && !z) {
                    if (i != 0) {
                        this.Z3 = i3;
                    }
                } else {
                    this.Z3 = i3;
                    iArr[i2] = z3;
                    K1(i2);
                    this.b.invalidate();
                }
            }
        }
    }

    @Override // fx0
    public void I() {
        v02 v02Var = this.W3;
        if (v02Var != null) {
            v02Var.z2(new vq0(this, (byte) 5));
        } else {
            o1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (k27.c3(r0.k) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(boolean z) {
        boolean z2;
        d dVar = this.Z1;
        if (dVar == null || !(dVar instanceof mu1)) {
            return;
        }
        mu1 mu1Var = (mu1) dVar;
        rt3 rt3Var = this.W1 ? this.M2 : this.B2;
        String obj = rt3Var != null ? rt3Var.getText().toString() : null;
        if (this.E3 == null) {
            p02 p02Var = this.v2;
            z2 = true;
            if (p02Var != null) {
            }
            if (t34.g(this.G3).e(obj, mu1Var.v8) <= 0) {
                k27 k27Var = mu1Var.F5;
                if (k27Var != null) {
                }
            }
            this.q1.a(z2, z);
            if (z2 || !a1()) {
            }
            q1(false, z);
            return;
        }
        z2 = false;
        this.q1.a(z2, z);
        if (z2) {
        }
    }

    public final void I1(boolean z) {
        gk2 gk2Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout == null || (gk2Var = this.Y2) == null) {
            return;
        }
        boolean z2 = this.n3 && this.c2 && this.v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.e0();
        boolean z3 = !ChatAttachAlertPhotoLayout.T();
        gk2Var.f = z3;
        if (!z) {
            ((lm) gk2Var.g).a(z3);
        }
        gk2Var.invalidateSelf();
        r7 r7Var = this.Z2;
        if (z && this.n3) {
            r7Var.setVisibility(0);
            r7Var.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(s33.h).withEndAction(new qz1(this, z2, r4)).start();
        } else {
            r7Var.setVisibility(z2 ? (byte) 0 : (byte) 8);
            r7Var.setAlpha(z2 ? 1.0f : 0.0f);
            r7Var.setScaleX(z2 ? 1.0f : 0.6f);
            r7Var.setScaleY(z2 ? 1.0f : 0.6f);
        }
    }

    @Override // fx0
    public final void J(int i) {
        super.J(i);
        this.v2.s(i);
    }

    public final void J0() {
        float f = this.m1.e;
        this.t3.setTranslationY(gl.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.n1.e))), 1.0f - ((1.0f - this.l1.e) * f)));
    }

    public final void J1(boolean z) {
        p02 p02Var = this.d2;
        if (!z) {
            A1(p02Var);
            return;
        }
        if (this.G1) {
            if (this.k2 == null) {
                Context context = getContext();
                wjb wjbVar = this.s1;
                if (wjbVar == null) {
                    wjbVar = this.J0;
                }
                m52 m52Var = new m52(this, wjbVar, context);
                m52Var.E = 0.0f;
                m52Var.F = 0.0f;
                m52Var.G = 0.0f;
                m52Var.H = 0.0f;
                m52Var.I = 0.0f;
                m52Var.J = 0.0f;
                m52Var.K = null;
                m52Var.L = false;
                m52Var.N = 0.0f;
                m52Var.R = false;
                m52Var.T = false;
                Point point = gl.q;
                m52Var.U = point.y > point.x;
                m52Var.n = wjbVar;
                m52Var.f = true;
                m52Var.setWillNotDraw(false);
                x02 x02Var = m52Var.b;
                r6 t = x02Var.U2.t();
                TextView textView = new TextView(context);
                m52Var.y = textView;
                wjb wjbVar2 = m52Var.a;
                w42 w42Var = new w42(m52Var, context, t, wjbVar2, (byte) 1);
                x02Var.U2.addView(w42Var, 0, nme.d(-2, -1.0f, 51, gl.O1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                zkb.X(textView, bkb.i5, wjbVar2);
                textView.setText(k96.M0(2131753955, null));
                textView.setTypeface(gl.o());
                textView.setCompoundDrawablePadding(gl.L(4.0f));
                textView.setPadding(0, 0, gl.L(10.0f), 0);
                textView.setAlpha(0.0f);
                w42Var.addView(textView, nme.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                fu fuVar = new fu(m52Var, context, wjbVar2, (byte) 10);
                m52Var.r = fuVar;
                fuVar.setAdapter(new jr(m52Var, (byte) 3));
                t26 t26Var = new t26(1, false);
                m52Var.s = t26Var;
                fuVar.setLayoutManager(t26Var);
                fuVar.setClipChildren(false);
                fuVar.setClipToPadding(false);
                fuVar.setOverScrollMode(2);
                fuVar.setVerticalScrollBarEnabled(false);
                l52 l52Var = new l52(m52Var, context);
                m52Var.w = l52Var;
                l52Var.setClipToPadding(true);
                l52Var.setClipChildren(true);
                m52Var.addView(fuVar, nme.c(-1.0f, -1));
                m52Var.Q = x02Var.d2;
                l52Var.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = m52Var.Q;
                l52Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                l52Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                l52Var.c();
                UndoView undoView = new UndoView(context, null, false, x02Var.s1);
                m52Var.x = undoView;
                undoView.setEnterOffsetMargin(gl.L(32.0f));
                m52Var.addView(undoView, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                m52Var.O = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.k2 = m52Var;
                m52Var.bringToFront();
            }
            p02 p02Var2 = this.v2;
            m52 m52Var2 = this.k2;
            if (p02Var2 != m52Var2) {
                p02Var = m52Var2;
            }
            A1(p02Var);
        }
    }

    public final void K0(p02 p02Var) {
        boolean e = p02Var.e();
        ry1 ry1Var = this.s3;
        if (ry1Var != null) {
            ry1Var.setFadeHeightBottom(e ? 0 : gl.L(48.0f));
        }
        yz1 yz1Var = this.t3;
        if (yz1Var != null) {
            yz1Var.setVisibility(e ? 4 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i) {
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        t8 t8Var;
        float max;
        int i3;
        p02 p02Var;
        float f5 = this.n1.e;
        p02 p02Var2 = i == 0 ? this.v2 : this.w2;
        if (p02Var2 == null || p02Var2.getVisibility() != 0) {
            return;
        }
        int X0 = X0(i);
        if (p02Var2 == this.g2 || p02Var2 == this.h2) {
            Typeface typeface = gl.a;
        } else {
            Typeface typeface2 = gl.a;
        }
        org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        if (gl.O1()) {
            i2 = 16;
        } else {
            Point point = gl.q;
            i2 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.U2.getAlpha();
        wz1 wz1Var = this.f3;
        float L = alpha != 0.0f ? 0.0f : gl.L((1.0f - wz1Var.getAlpha()) * 26.0f);
        boolean z = this.n3;
        r7 r7Var = this.X2;
        st stVar = this.L2;
        if (z && this.N2 == 0 && !this.Q2) {
            r7Var.setTranslationY(Math.max((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(3.0f)) - gl.L(i2 + 37), ((X0 - gl.L((i2 * f5) + 37.0f)) + L) - (stVar.getAlpha() * stVar.getMeasuredHeight())) + this.i4);
        } else {
            r7Var.setTranslationY(((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(3.0f)) - gl.L(i2 + 37)) + this.i4);
        }
        r7 r7Var2 = this.Z2;
        if (r7Var2 != null) {
            r7Var2.setTranslationY(r7Var.getTranslationY());
        }
        je5 je5Var = this.a3;
        if (je5Var != null) {
            je5Var.setTranslationY(r7Var.getTranslationY());
        }
        float min = (this.z1 && this.p3 && (p02Var = this.w2) != null) ? this.v2 != null ? Math.min(p02Var.getTranslationY(), this.v2.getTranslationY()) : p02Var.getTranslationY() : 0.0f;
        r7 r7Var3 = this.b3;
        if (r7Var3 != null) {
            r7Var3.setTranslationY(((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(4.0f)) - gl.L(i2 + 37)) + this.i4);
        }
        float L2 = ((((X0 - gl.L((i2 * f5) + 25.0f)) + L) + this.i4) + min) - (stVar.getAlpha() * stVar.getMeasuredHeight());
        this.m3 = L2;
        wz1Var.setTranslationY(Math.max(this.i4, L2));
        stVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.i4, (wz1Var.getAlpha() * gl.L(26.0f)) + this.m3 + gl.L(8.0f)));
        if (this.W1) {
            E1();
        }
        N0();
        int i4 = 59;
        if (this.g2 != null) {
            if (gl.O1()) {
                i3 = 63;
            } else {
                Point point2 = gl.q;
                i3 = point2.x > point2.y ? 53 : 59;
            }
            k62 k62Var = this.g2;
            if (k62Var == this.w2) {
                f2 = (k62Var.getTranslationY() + X0(1)) - gl.L(((i3 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                f = this.X1;
            } else if (k62Var == this.v2) {
                f2 = (k62Var.getTranslationY() + X0(0)) - gl.L(((i3 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                f = this.w2 == null ? 1.0f : 1.0f - this.X1;
            }
            if (this.h2 != null) {
                if (gl.O1()) {
                    i4 = 63;
                } else {
                    Point point3 = gl.q;
                    if (point3.x > point3.y) {
                        i4 = 53;
                    }
                }
                k62 k62Var2 = this.h2;
                if (k62Var2 == this.w2) {
                    f4 = (k62Var2.getTranslationY() + X0(1)) - gl.L(((i4 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                    f3 = this.X1;
                } else if (k62Var2 == this.v2) {
                    f4 = (k62Var2.getTranslationY() + X0(0)) - gl.L(((i4 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                    f3 = this.w2 == null ? 1.0f : 1.0f - this.X1;
                }
                t8Var = this.c3;
                if (t8Var != null) {
                    int measuredWidth = k96.a0 ? (this.b.getMeasuredWidth() - t8Var.getMeasuredWidth()) - gl.L(62.0f) : 0;
                    if (f <= 0.0f) {
                        f2 = 0.0f;
                    } else if (f3 > 0.0f) {
                        max = gl.R1(f2, f4, f3);
                        t8Var.setTranslationY(Math.max(0.0f, max) + this.i4);
                        t8Var.setTranslationX(-((measuredWidth * (1.0f - f5)) + gl.L((7.0f * r6) + 12.0f)));
                    }
                    if (f3 <= 0.0f) {
                        f4 = 0.0f;
                    }
                    max = Math.max(f2, f4);
                    t8Var.setTranslationY(Math.max(0.0f, max) + this.i4);
                    t8Var.setTranslationX(-((measuredWidth * (1.0f - f5)) + gl.L((7.0f * r6) + 12.0f)));
                }
                float max2 = Math.max(f3, f);
                this.e3 = max2;
                if (t8Var != null) {
                    float f6 = this.d3 * max2;
                    t8Var.setAlpha(f6);
                    t8Var.setVisibility(f6 <= 0.0f ? 4 : 0);
                    return;
                }
                return;
            }
            f3 = 0.0f;
            f4 = 0.0f;
            t8Var = this.c3;
            if (t8Var != null) {
            }
            float max22 = Math.max(f3, f);
            this.e3 = max22;
            if (t8Var != null) {
            }
        }
        f = 0.0f;
        f2 = 0.0f;
        if (this.h2 != null) {
        }
        f3 = 0.0f;
        f4 = 0.0f;
        t8Var = this.c3;
        if (t8Var != null) {
        }
        float max222 = Math.max(f3, f);
        this.e3 = max222;
        if (t8Var != null) {
        }
    }

    public final void L0() {
        x10 x10Var;
        ry1 ry1Var = this.s3;
        if (ry1Var == null || (x10Var = this.U2) == null) {
            return;
        }
        p02 p02Var = this.w2;
        if (p02Var == null) {
            p02Var = this.v2;
        }
        int i = 0;
        boolean z = p02Var != null && p02Var.f();
        wjb wjbVar = this.J0;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        if (!z && x10Var.getVisibility() == 0) {
            i = (int) (x10Var.getAlpha() * (a ? kk7.d4 : kk7.p2));
        }
        ry1Var.setFadeTopAlpha(i);
    }

    public final void L1() {
        int i = 0;
        K1(0);
        this.o3.invalidate();
        st stVar = this.L2;
        stVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            s42 s42Var = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.W();
            if (s42Var != null && s42Var.getFastScroll() != null) {
                v29 fastScroll = s42Var.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.W1) {
                    i = (int) (stVar.getAlpha() * stVar.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i;
                s42Var.getFastScroll().invalidate();
            }
        }
        E1();
        N0();
    }

    public final void M0() {
        un4.d(this.C2, yjb.C(this.o1.e, this.p1.e, zfe.a(this.q1.e), this.O3 ? 0.0f : 1.0f));
    }

    public final void N0() {
        e02 e02Var = this.F2;
        wz1 wz1Var = this.E2;
        st stVar = this.L2;
        if (stVar == null || stVar.getVisibility() != 0 || stVar.getAlpha() == 0.0f) {
            wz1Var.setTranslationY(this.d4);
            e02Var.setAlpha(1.0f);
            return;
        }
        float f = this.l1.e;
        float abs = Math.abs(gl.R1(-1.0f, 1.0f, f));
        e02Var.setAlpha(abs * abs * abs * abs);
        wz1Var.setTranslationY(gl.R1(this.d4, ((stVar.getTranslationY() + stVar.getTop()) - wz1Var.getTop()) + gl.L(8.0f), s33.j.getInterpolation(f)));
    }

    public final void O0() {
        eb1 eb1Var = new eb1(this, getContext(), this.T1, LaunchActivity.Q(), this.J0, (byte) 1);
        this.B4 = eb1Var;
        eb1Var.p(new l69(this, (byte) 20));
        ViewGroup viewGroup = this.b;
        viewGroup.addView(this.B4, viewGroup.indexOfChild(this.A2), nme.e(-1, -1, 83));
        eb1 eb1Var2 = this.B4;
        eb1Var2.getAdapter().c = false;
        eb1Var2.getAdapter().d = false;
        eb1Var2.getAdapter().e = false;
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            eb1Var2.getAdapter().n0 = false;
            mu1 mu1Var = (mu1) dVar;
            kz6 adapter = eb1Var2.getAdapter();
            mu1Var.h();
            TLRPC.Chat chat = mu1Var.e;
            adapter.getClass();
            adapter.m0 = chat;
            eb1Var2.getAdapter().V(mu1Var.r8);
            eb1Var2.getAdapter().f0 = mu1Var.e != null;
        } else {
            eb1Var2.getAdapter().n0 = true;
            eb1Var2.getAdapter().V(null);
            eb1Var2.getAdapter().f0 = false;
        }
        eb1Var2.getAdapter().g0 = false;
        E1();
    }

    public final void P0(int i) {
        this.P2 = true;
        this.u3.setVisibility(0);
        this.B1 = true;
        this.C1 = i;
        this.N2 = (byte) 0;
        this.z1 = false;
        this.A1 = false;
        this.D1 = null;
        r7 r7Var = this.h3;
        if (r7Var != null) {
            this.g3.setTranslationY(0.0f);
            r7Var.setVisibility(8);
        }
    }

    public final void Q0(f fVar) {
        String M0 = k96.M0(2131752110, null);
        TextView textView = this.g3;
        textView.setText(M0);
        this.P2 = false;
        this.u3.setVisibility(8);
        this.N2 = (byte) 1;
        this.z1 = true;
        this.A1 = true;
        this.c2 = false;
        this.D1 = fVar;
        r7 r7Var = this.h3;
        if (r7Var != null) {
            textView.setTranslationY(-gl.L(8.0f));
            r7Var.setVisibility(0);
            r7Var.setClickable(true);
            r7Var.setAlpha(1.0f);
            r7Var.setScaleX(1.0f);
            r7Var.setScaleY(1.0f);
        }
    }

    public final int R0() {
        o27 o27Var;
        m27 m27Var;
        d dVar = this.Z1;
        if (!(dVar instanceof mu1) || (o27Var = ((mu1) dVar).x5) == null || (m27Var = o27Var.b) == null) {
            return 0;
        }
        return m27Var.g.size();
    }

    @Override // fx0
    public final ArrayList S() {
        ArrayList<blb> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h5));
                return arrayList;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null && (themeDescriptions = p02Var.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i++;
        }
    }

    public final TLRPC.Chat S0() {
        d dVar = this.Z1;
        return dVar instanceof mu1 ? ((mu1) dVar).e : na7.q1(this.G3).K0(Long.valueOf(-this.T1));
    }

    public final float T0() {
        return r3.getMeasuredHeight() - ((1.0f - this.A2.getAlpha()) * (r3.getMeasuredHeight() - gl.L(84.0f)));
    }

    public final rt3 U0() {
        p02 p02Var;
        return (this.W1 && ((p02Var = this.v2) == this.d2 || p02Var == this.k2)) ? this.M2 : this.B2;
    }

    public final long V0() {
        d dVar = this.Z1;
        return dVar instanceof mu1 ? ((mu1) dVar).a() : this.T1;
    }

    public final int W0() {
        p02 p02Var = this.v2;
        k62 k62Var = this.g2;
        if (p02Var == k62Var && k62Var.F != null) {
            return k62Var.getEmojiPadding();
        }
        k62 k62Var2 = this.h2;
        return (p02Var != k62Var2 || k62Var2.F == null) ? this.W1 ? this.M2.getEmojiPadding() : this.B2.getEmojiPadding() : k62Var2.getEmojiPadding();
    }

    public final int X0(int i) {
        p02 p02Var = this.w2;
        int[] iArr = this.Y3;
        if (p02Var == null || !((this.v2 instanceof m52) || (p02Var instanceof m52))) {
            return iArr[i];
        }
        return gl.U1(this.X1, iArr[0], iArr[1]);
    }

    public final int Y0(boolean z) {
        x10 x10Var;
        if (this.e4) {
            return bkb.v0(bkb.jh, this.J0);
        }
        wjb wjbVar = this.J0;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        Iterator it = this.r1.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            long longValue = ((Long) u46Var.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f += u46Var.c();
            }
        }
        float a2 = moe.a(f, 0.0f, 1.0f);
        if (z && (x10Var = this.U2) != null && x10Var.getVisibility() == 0) {
            a2 *= 1.0f - x10Var.getAlpha();
        }
        return bm2.f(a2, bkb.v0(bkb.g5, this.J0), bkb.v0(a ? bkb.Z6 : bkb.h5, this.J0));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        x02 x02Var;
        b52 b52Var;
        xl6 xl6Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        p02 p02Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.K2 = 0L;
        this.F2.setEffect(0L);
        byte b = 0;
        this.A3 = false;
        this.y3 = false;
        this.C3 = 0.0f;
        this.B3.setVisibility(8);
        RadialProgressView radialProgressView = this.z3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        wz1 wz1Var = this.u3;
        wz1Var.setAlpha(1.0f);
        wz1Var.setTranslationY(0.0f);
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.u2;
            if (i >= longSparseArray.size()) {
                break;
            }
            ((s12) longSparseArray.valueAt(i)).setMeasureOffsetY(0);
            i++;
        }
        byte b2 = this.N2;
        d dVar = this.Z1;
        if (b2 != 2) {
            if (dVar instanceof mu1) {
                mu1 mu1Var = (mu1) dVar;
                chat = mu1Var.e;
                user = mu1Var.h();
            } else {
                long j = this.T1;
                int i2 = this.G3;
                if (j >= 0) {
                    user = na7.q1(i2).V1(Long.valueOf(this.T1));
                    chat = null;
                } else if (j < 0) {
                    chat = na7.q1(i2).K0(Long.valueOf(-this.T1));
                    user = null;
                }
            }
            z = dVar instanceof mu1;
            if ((z && this.N2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.I3 = hc2.p(chat);
                    this.J3 = hc2.u(chat);
                    this.K3 = hc2.o(chat);
                    this.L3 = hc2.r(chat);
                    this.M3 = !hc2.V(chat) && hc2.r(chat);
                    this.N3 = hc2.q(chat);
                    this.H3 = hc2.l(chat);
                } else {
                    this.L3 = l7c.u(user) || l7c.C(user);
                    this.M3 = !z || ((mu1) dVar).h == null;
                }
            }
            if (this.A1) {
                this.I3 = true;
                this.J3 = true;
            }
            if (this.O3) {
                this.L3 = false;
                this.M3 = false;
            }
            zz1 zz1Var = this.B2;
            if (z || this.N2 == 2) {
                zz1Var.setVisibility(this.Q1 ? 0 : 4);
            }
            boolean z2 = this.J3;
            boolean z3 = this.I3;
            boolean z4 = this.H3;
            chatAttachAlertPhotoLayout = this.d2;
            x02Var = chatAttachAlertPhotoLayout.b;
            g24 g24Var = chatAttachAlertPhotoLayout.I;
            boolean z5 = !z2 || z3;
            chatAttachAlertPhotoLayout.w0 = z5;
            chatAttachAlertPhotoLayout.x0 = z2;
            chatAttachAlertPhotoLayout.y0 = z3;
            chatAttachAlertPhotoLayout.A0 = z4;
            b52Var = chatAttachAlertPhotoLayout.Q;
            if (b52Var != null) {
                b52Var.setAlpha(z5 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.Q.setEnabled(chatAttachAlertPhotoLayout.w0);
            }
            if (!((x02Var.Z1 instanceof mu1) && x02Var.S0() == null) && x02Var.N2 == 0) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
                if (chatAttachAlertPhotoLayout.w0) {
                    g24Var.setText(k96.M0(2131747988, null));
                    g24Var.a(0, 0, 0);
                } else {
                    TLRPC.Chat S0 = x02Var.S0();
                    g24Var.a(R.raw.media_forbidden, kk7.f2, kk7.f2);
                    if (hc2.P(7, S0)) {
                        g24Var.setText(k96.M0(2131749368, null));
                    } else if (gl.B1(S0.banned_rights)) {
                        g24Var.setText(k96.a0("AttachMediaRestrictedForever", null, 2131753952, new Object[0]));
                    } else {
                        g24Var.setText(k96.a0("AttachMediaRestricted", null, 2131753953, k96.v(S0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.t0()) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            } else {
                chatAttachAlertPhotoLayout.V0 = MediaController.b2;
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.g0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
                for (int i3 = 0; i3 < Math.min(100, chatAttachAlertPhotoLayout.V0.e.size()); i3++) {
                    ((jm6) chatAttachAlertPhotoLayout.V0.e.get(i3)).e();
                }
            }
            chatAttachAlertPhotoLayout.a0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.g1(0, 1000000);
            chatAttachAlertPhotoLayout.G.g1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(k96.M0(2131752226, null));
            xl6Var = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = xl6Var;
            if (xl6Var != null) {
                chatAttachAlertPhotoLayout.Y0 = false;
                if (g24Var != null) {
                    g24Var.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            zz1Var.k(true);
            this.M2.k(true);
            this.r3 = false;
            v0(false);
            if (!this.I1 || this.J1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.i2 == null) {
                    c42 c42Var = new c42(this, getContext(), this.J0, (this.B1 || this.J1 || this.O3) ? false : true);
                    this.i2 = c42Var;
                    this.t2[5] = c42Var;
                    b42 b42Var = this.t4;
                    if (b42Var != null) {
                        c42Var.setDelegate(b42Var);
                    } else {
                        c42Var.setDelegate(new fz1(this, b));
                    }
                }
                this.T2 = 5L;
                p02Var = this.i2;
            } else if (this.H1) {
                m1(false);
                p02Var = this.j2;
                this.T2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                k27 k27Var = this.E3;
                if (k27Var != null) {
                    int i4 = this.D3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i4 == -1) {
                        this.P2 = true;
                        if (k27Var.I3()) {
                            k1(false);
                            p02Var = this.f2;
                            this.T2 = 3L;
                        } else if (this.E3.U2()) {
                            m1(false);
                            p02Var = this.j2;
                            this.T2 = 4L;
                        } else {
                            this.T2 = 1L;
                        }
                    } else {
                        if (i4 == 2) {
                            k1(false);
                            p02Var = this.f2;
                            this.T2 = 3L;
                        } else if (i4 == 1) {
                            m1(false);
                            p02Var = this.j2;
                            this.T2 = 4L;
                        } else {
                            this.T2 = 1L;
                            p02Var = chatAttachAlertPhotoLayout2;
                        }
                        this.P2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.P2 = this.N2 == 0 && !this.Q2;
                    this.T2 = 1L;
                }
                p02Var = chatAttachAlertPhotoLayout2;
            }
            wz1Var.setVisibility(this.P2 ? 0 : 8);
            if (this.v2 != p02Var) {
                x10 x10Var = this.U2;
                if (x10Var.o0) {
                    x10Var.n(true);
                }
                this.b.removeView(this.v2);
                this.v2.v();
                this.v2.setVisibility(8);
                this.v2.u();
                this.v2 = p02Var;
                this.r0 = true;
                if (p02Var.getParent() == null) {
                    n1(this.v2);
                    this.b.addView(this.v2, 0, nme.c(-1.0f, -1));
                }
                p02Var.setAlpha(1.0f);
                p02Var.setVisibility(0);
                p02Var.I(null);
                p02Var.J();
                K0(p02Var);
                x10Var.setVisibility(p02Var.j() != 0 ? 0 : 4);
                q1(this.W1, false);
                G1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.v2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            F1(0);
            this.x3.f();
            U0().setText("");
            this.w3.g1(0, 1000000);
        }
        user = null;
        chat = null;
        z = dVar instanceof mu1;
        if (z) {
            if (chat != null) {
            }
            if (this.A1) {
            }
            if (this.O3) {
            }
            zz1 zz1Var2 = this.B2;
            if (z) {
            }
            zz1Var2.setVisibility(this.Q1 ? 0 : 4);
            boolean z22 = this.J3;
            boolean z32 = this.I3;
            boolean z42 = this.H3;
            chatAttachAlertPhotoLayout = this.d2;
            x02Var = chatAttachAlertPhotoLayout.b;
            g24 g24Var2 = chatAttachAlertPhotoLayout.I;
            if (z22) {
            }
            chatAttachAlertPhotoLayout.w0 = z5;
            chatAttachAlertPhotoLayout.x0 = z22;
            chatAttachAlertPhotoLayout.y0 = z32;
            chatAttachAlertPhotoLayout.A0 = z42;
            b52Var = chatAttachAlertPhotoLayout.Q;
            if (b52Var != null) {
            }
            if (x02Var.Z1 instanceof mu1) {
            }
            chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            if (chatAttachAlertPhotoLayout.w0) {
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.g0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
            }
            chatAttachAlertPhotoLayout.a0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.g1(0, 1000000);
            chatAttachAlertPhotoLayout.G.g1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(k96.M0(2131752226, null));
            xl6Var = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = xl6Var;
            if (xl6Var != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            zz1Var2.k(true);
            this.M2.k(true);
            this.r3 = false;
            v0(false);
            if (this.I1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.i2 == null) {
            }
            this.T2 = 5L;
            p02Var = this.i2;
            wz1Var.setVisibility(this.P2 ? 0 : 8);
            if (this.v2 != p02Var) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.v2 != chatAttachAlertPhotoLayout3) {
            }
            F1(0);
            this.x3.f();
            U0().setText("");
            this.w3.g1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.A1) {
        }
        if (this.O3) {
        }
        zz1 zz1Var22 = this.B2;
        if (z) {
        }
        zz1Var22.setVisibility(this.Q1 ? 0 : 4);
        boolean z222 = this.J3;
        boolean z322 = this.I3;
        boolean z422 = this.H3;
        chatAttachAlertPhotoLayout = this.d2;
        x02Var = chatAttachAlertPhotoLayout.b;
        g24 g24Var22 = chatAttachAlertPhotoLayout.I;
        if (z222) {
        }
        chatAttachAlertPhotoLayout.w0 = z5;
        chatAttachAlertPhotoLayout.x0 = z222;
        chatAttachAlertPhotoLayout.y0 = z322;
        chatAttachAlertPhotoLayout.A0 = z422;
        b52Var = chatAttachAlertPhotoLayout.Q;
        if (b52Var != null) {
        }
        if (x02Var.Z1 instanceof mu1) {
        }
        chatAttachAlertPhotoLayout.V0 = MediaController.a2;
        if (chatAttachAlertPhotoLayout.w0) {
        }
        chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.g0();
        if (chatAttachAlertPhotoLayout.V0 != null) {
        }
        chatAttachAlertPhotoLayout.a0();
        chatAttachAlertPhotoLayout.B0(false);
        chatAttachAlertPhotoLayout.s.g1(0, 1000000);
        chatAttachAlertPhotoLayout.G.g1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(k96.M0(2131752226, null));
        xl6Var = chatAttachAlertPhotoLayout.V0;
        chatAttachAlertPhotoLayout.U0 = xl6Var;
        if (xl6Var != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        zz1Var22.k(true);
        this.M2.k(true);
        this.r3 = false;
        v0(false);
        if (this.I1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.i2 == null) {
        }
        this.T2 = 5L;
        p02Var = this.i2;
        wz1Var.setVisibility(this.P2 ? 0 : 8);
        if (this.v2 != p02Var) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.v2 != chatAttachAlertPhotoLayout3) {
        }
        F1(0);
        this.x3.f();
        U0().setText("");
        this.w3.g1(0, 1000000);
    }

    @Override // fx0, zf0
    public final void a(boolean z) {
        if (z) {
            this.A4 = z;
        }
        dismiss();
    }

    public final boolean a1() {
        if (!this.W1) {
            return false;
        }
        p02 p02Var = this.v2;
        return p02Var == this.d2 || p02Var == this.k2;
    }

    @Override // fx0
    public final boolean c0(MotionEvent motionEvent) {
        return this.v2.o(motionEvent);
    }

    public final void c1(EditTextBoldCursor editTextBoldCursor, boolean z) {
        v02 v02Var = this.W3;
        if (v02Var == null || this.r3) {
            return;
        }
        boolean f0 = v02Var.f0();
        this.r3 = true;
        gl.e3(new mn6((Object) this, (Object) editTextBoldCursor, z, (byte) 12), f0 ? 200L : 0L);
    }

    public final void d1() {
        if (this.s0 == null || this.b == null) {
            return;
        }
        int Y0 = Y0(false);
        bkb.A1(Y0, this.s0);
        ix4 ix4Var = this.D4;
        if (ix4Var.b != Y0) {
            ix4Var.a(Y0);
            ry1 ry1Var = this.s3;
            if (ry1Var != null) {
                ry1Var.invalidate();
            }
            yz1 yz1Var = this.t3;
            if (yz1Var != null) {
                yz1Var.invalidate();
            }
        }
        G1();
        this.b.invalidate();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.S0 && i != kk7.Y4 && i != kk7.E1) {
            if (i == kk7.h5) {
                this.E1 = na7.q1(y6c.t0).F0();
            }
        } else {
            u02 u02Var = this.x3;
            if (u02Var != null) {
                u02Var.f();
            }
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        b02 b02Var;
        zz1 zz1Var;
        if (this.v2.r() || this.J) {
            return;
        }
        p02 p02Var = this.v2;
        r32 r32Var = this.q2;
        byte b = 1;
        boolean z = (p02Var != r32Var || r32Var == null || r32Var.L || r32Var.Q0 == null) ? false : true;
        this.r2 = z;
        if (!z && (zz1Var = this.B2) != null) {
            gl.t1(zz1Var.getEditText());
        }
        if (!this.r2 && (b02Var = this.M2) != null) {
            gl.t1(b02Var.getEditText());
        }
        this.u2.clear();
        d dVar = this.Z1;
        if (dVar == null) {
            dVar = LaunchActivity.Q();
        }
        if (this.A4 || dVar == null || this.v2.getSelectedItemsCount() <= 0 || this.z1) {
            int i = 0;
            while (true) {
                p02[] p02VarArr = this.t2;
                if (i >= p02VarArr.length) {
                    break;
                }
                p02 p02Var2 = p02VarArr[i];
                if (p02Var2 != null && this.v2 != p02Var2) {
                    p02Var2.r();
                }
                i++;
            }
            gl.p3(this, bm2.o(bkb.v0(bkb.Z6, this.J0), 0), true, new fz1(this, (byte) 11));
            if (dVar != null) {
                gl.m3(this, dVar.isLightStatusBar());
            }
            this.f4 = false;
            super.dismiss();
            this.A4 = false;
            return;
        }
        if (this.z4) {
            return;
        }
        this.z4 = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, dVar.getParentActivity());
        String M0 = k96.M0(2131751387, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131751388, null);
        alertDialog$Builder.j(k96.M0(2131751394, null), new fz1(this, b));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        hdVar.setOnCancelListener(new ur0(this, (byte) 3));
        hdVar.O = new n1(this, (byte) 14);
        hdVar.show();
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, this.J0);
        }
    }

    public final void e1() {
        int i = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.q();
            }
            i++;
        }
        int i2 = this.G3;
        kk7.f(i2).n(this, kk7.S0);
        kk7.f(i2).n(this, kk7.Y4);
        kk7.f(i2).n(this, kk7.h5);
        kk7.f(i2).n(this, kk7.E1);
        this.P1 = true;
        zz1 zz1Var = this.B2;
        if (zz1Var != null) {
            zz1Var.o();
        }
        b02 b02Var = this.M2;
        if (b02Var != null) {
            b02Var.o();
        }
    }

    public final void f1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String q = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : l7c.q(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.G3).b.bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a0 = k96.a0("BotRemoveFromMenu", null, 2131752990, q);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = k96.M0(2131752989, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        if (tL_attachMenuBot == null) {
            a0 = k96.a0("BotRemoveInlineFromMenu", null, 2131752988, q);
        }
        hdVar.U = gl.T2(a0);
        alertDialog$Builder.j(k96.M0(2131747638, "OK"), new ie((Object) this, (Object) tL_attachMenuBot, (Object) user, (byte) 20));
        ug8.y("Cancel", 2131752577, alertDialog$Builder, null);
    }

    @Override // fx0
    public final boolean g0() {
        TL_wallet.walletTransaction wallettransaction;
        final r32 r32Var = this.q2;
        final byte b = 0;
        if (r32Var != null && this.v2 == r32Var) {
            final vq0 vq0Var = new vq0(this, (byte) 2);
            int i = r32Var.n;
            ppc ppcVar = r32Var.S;
            x02 x02Var = r32Var.b;
            final byte b2 = 1;
            AnimatorSet animatorSet = null;
            if (!r32Var.L && (wallettransaction = r32Var.Q0) != null && r32Var.R0 == null && r32Var.S0 == null) {
                if (r32Var.T0) {
                    hmc hmcVar = new hmc();
                    hmcVar.setCurrentAccount(i);
                    d dVar = x02Var.Z1;
                    if (dVar != null && dVar.presentFragment(hmcVar, false, true)) {
                        cqc cqcVar = new cqc(x02Var.c, x02Var.b, ppcVar.getDiamondView(), hmcVar, r32Var.Q0, new Runnable() { // from class: h32
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b;
                                vq0 vq0Var2 = vq0Var;
                                r32 r32Var2 = r32Var;
                                switch (b3) {
                                    case 0:
                                        if (!r32Var2.L) {
                                            vq0Var2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!r32Var2.L) {
                                            vq0Var2.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, x02Var);
                        r32Var.S0 = cqcVar;
                        animatorSet = cqcVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    lnc diamondView = ppcVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        d dVar2 = x02Var.Z1;
                        if (dVar2 instanceof mu1) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (mu1Var.getCurrentAccount() == i && mu1Var.a() == r32Var.r.id && mu1Var.g4 == 0 && mu1Var.getFragmentView() != null && mu1Var.getFragmentView().isAttachedToWindow()) {
                                anc ancVar = new anc(x02Var.c, x02Var.b, ppcVar.getDiamondView(), mu1Var, r32Var.Q0, new Runnable() { // from class: h32
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        vq0 vq0Var2 = vq0Var;
                                        r32 r32Var2 = r32Var;
                                        switch (b3) {
                                            case 0:
                                                if (!r32Var2.L) {
                                                    vq0Var2.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!r32Var2.L) {
                                                    vq0Var2.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, x02Var);
                                r32Var.R0 = ancVar;
                                animatorSet = ancVar.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = (byte) 2;
                return true;
            }
        }
        return false;
    }

    public final void g1() {
        int i = 0;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                this.c4 = true;
                return;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.B();
            }
            i++;
        }
    }

    @Override // fx0
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        azc azcVar = chatAttachAlertPhotoLayout.m0;
        yc ycVar = chatAttachAlertPhotoLayout.k0;
        s42 s42Var = chatAttachAlertPhotoLayout.r;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z = i5 < i6;
        int i7 = gl.n;
        if (view == ycVar) {
            if (z) {
                if (s42Var.getVisibility() == 0) {
                    ycVar.layout(0, ls6.x(222.0f, i4, i7), i5, ls6.x(96.0f, i4, i7));
                    return true;
                }
                ycVar.layout(0, ls6.x(126.0f, i4, i7), i5, i4 - i7);
                return true;
            }
            if (s42Var.getVisibility() == 0) {
                ycVar.layout(ls6.x(222.0f, i3, i7), 0, i3 - gl.L(96.0f), i6 - i7);
                return true;
            }
            ycVar.layout(ls6.x(126.0f, i3, i7), 0, i3, i6 - i7);
            return true;
        }
        if (view == azcVar) {
            if (z) {
                if (s42Var.getVisibility() == 0) {
                    azcVar.layout(0, ls6.x(310.0f, i4, i7), i5, ls6.x(260.0f, i4, i7));
                    return true;
                }
                azcVar.layout(0, ls6.x(176.0f, i4, i7), i5, ls6.x(126.0f, i4, i7));
                return true;
            }
            if (s42Var.getVisibility() == 0) {
                azcVar.layout(ls6.x(310.0f, i3, i7), 0, i3 - gl.L(260.0f), i6 - i7);
                return true;
            }
            azcVar.layout(ls6.x(176.0f, i3, i7), 0, i3 - gl.L(126.0f), i6 - i7);
            return true;
        }
        if (view != textView) {
            if (view != s42Var) {
                return false;
            }
            if (z) {
                int x = ls6.x(88.0f, i6, i7);
                view.layout(0, x, view.getMeasuredWidth(), view.getMeasuredHeight() + x);
                return true;
            }
            int L2 = (i + i5) - gl.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z) {
            L = (i5 - textView.getMeasuredWidth()) / 2;
            int L3 = i4 - gl.L(167.0f);
            textView.setRotation(0.0f);
            if (s42Var.getVisibility() == 0) {
                L3 -= gl.L(96.0f);
            }
            measuredWidth = L3 - i7;
        } else {
            L = i3 - gl.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i6 / 2);
            textView.setRotation(-90.0f);
            if (s42Var.getVisibility() == 0) {
                L -= gl.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void h1() {
        int i = 0;
        this.c4 = false;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.E();
            }
            i++;
        }
        if (isShowing()) {
            this.W3.f0();
        }
        u02 u02Var = this.x3;
        if (u02Var != null) {
            u02Var.f();
        }
    }

    @Override // fx0
    public final boolean i0(View view, int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        e52 e52Var = chatAttachAlertPhotoLayout.w;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        s42 s42Var = chatAttachAlertPhotoLayout.r;
        zr zrVar = chatAttachAlertPhotoLayout.s;
        boolean z = i < i2;
        if (view != chatAttachAlertPhotoLayout.Q) {
            yc ycVar = chatAttachAlertPhotoLayout.k0;
            if (view == ycVar) {
                if (z) {
                    ycVar.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                ycVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
                return true;
            }
            azc azcVar = chatAttachAlertPhotoLayout.m0;
            if (view == azcVar) {
                if (z) {
                    azcVar.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                azcVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
                return true;
            }
            if (view == s42Var) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z) {
                    s42Var.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30));
                    if (zrVar.o) {
                        s42Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                        zrVar.i1(0);
                        e52Var.f();
                    }
                } else {
                    s42Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
                    if (!zrVar.o) {
                        s42Var.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
                        zrVar.i1(1);
                        e52Var.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
            chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec((x02Var.h != null ? (int) (r11.getSystemWindowInsetRight() * 1.0f) : 0) + x02Var.R() + i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void i1() {
        k27 k27Var = this.E3;
        d dVar = this.Z1;
        int i = this.G3;
        if (k27Var != null && k27Var.o5() && !hc2.z(i, 24, k27.B0(this.E3.k)) && (dVar instanceof mu1)) {
            mu1 mu1Var = (mu1) dVar;
            u47 u47Var = mu1Var.y5;
            if (u47Var == null) {
                u47Var = u47.b(this.E3.k.suggested_post);
            }
            if (!gta.Q(i, u47Var.a)) {
                mu1Var.ic(u47Var);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            gl.A3(this.t1);
            gl.A3(this.u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (na7.q1(i).E3() || na7.q1(i).k4.h1.f() <= this.F1) {
                return;
            }
            y1(dVar);
            return;
        }
        if (this.E3 == null && (dVar instanceof mu1)) {
            mu1 mu1Var2 = (mu1) dVar;
            if (mu1Var2.N7()) {
                ij.J(getContext(), mu1Var2.a(), new fz1(this, (byte) 14), this.J0);
                return;
            }
        }
        p02 p02Var = this.v2;
        if (p02Var == this.d2 || p02Var == this.k2) {
            p1(true, 0, 0, this.K2, a1());
        } else {
            if (p02Var.M(true, 0, 0, this.K2, a1())) {
                return;
            }
            this.A4 = true;
            dismiss();
        }
    }

    @Override // fx0
    public final boolean j0() {
        this.d2.setTranslationX(0.0f);
        this.k3.setAlpha(0.0f);
        this.i3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.n4 = animatorSet;
        byte b = 2;
        i02 i02Var = this.l4;
        byte b2 = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, i02Var, 0.0f, 400.0f));
        this.n4.setDuration(400L);
        this.n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        i02Var.getClass();
        i02Var.a(this, valueOf);
        this.n4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new gz1(this, b));
        yla ylaVar = this.m4;
        if (ylaVar != null) {
            ylaVar.d();
        }
        yla ylaVar2 = new yla((Object) this.b, (ri4) yla.p, 0.0f);
        this.m4 = ylaVar2;
        k27 k27Var = this.E3;
        zla zlaVar = ylaVar2.m;
        if (k27Var != null) {
            zlaVar.a(0.75f);
            this.m4.m.b(350.0f);
        } else {
            zlaVar.a(0.75f);
            this.m4.m.b(350.0f);
        }
        this.m4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = (byte) 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, rn.d, this.p0 ? this.q0 : 0));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        on onVar = new on(null);
        jn1 jn1Var = new jn1(this, onVar, this.z0, (byte) 12);
        this.m4.a(new o11(this, jn1Var, b2));
        this.A0.addListener(new u5(this, jn1Var, (byte) 14));
        onVar.d();
        kk7.e().k(kk7.i1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        u1(0.0f);
        ofFloat2.addUpdateListener(new gz1(this, (byte) 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(s33.f);
        ofFloat2.start();
        return true;
    }

    public final void j1(int i) {
        d dVar = this.Z1;
        if (i == 3) {
            if (this.K3 || !F0()) {
                Activity parentActivity = dVar != null ? dVar.getParentActivity() : null;
                if (parentActivity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                k1(true);
                return;
            }
            return;
        }
        if (i == 6 && gl.H1(dVar)) {
            if (this.i2 == null) {
                c42 c42Var = new c42(this, getContext(), this.J0, (this.B1 || this.O3) ? false : true);
                this.i2 = c42Var;
                this.t2[5] = c42Var;
                b42 b42Var = this.t4;
                if (b42Var != null) {
                    c42Var.setDelegate(b42Var);
                } else if (dVar instanceof mu1) {
                    c42Var.setDelegate(new fz1(this, (byte) 18));
                }
            }
            A1(this.i2);
        }
    }

    public final void k1(boolean z) {
        if (!this.K3 && z) {
            f72 f72Var = new f72(3, this, this.J0, getContext());
            this.N1 = f72Var;
            A1(f72Var);
        }
        int i = 1;
        if (this.f2 == null) {
            h12 h12Var = new h12(this, this.J0, getContext());
            this.f2 = h12Var;
            this.t2[3] = h12Var;
            h12Var.setupBlurredSearchField(this.E4);
            this.f2.setDelegate(new fz1(this, (byte) 15));
            if (this.B1) {
                this.f2.setMaxSelectedFiles(1);
            }
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            TLRPC.Chat chat = ((mu1) dVar).e;
            h12 h12Var2 = this.f2;
            if ((chat == null || hc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i = -1;
            }
            h12Var2.setMaxSelectedFiles(i);
        }
        if (z) {
            A1(this.f2);
        }
    }

    @Override // fx0
    public final void l0() {
        if (this.v2.t()) {
            dismiss();
        }
    }

    public final void l1() {
        if (!this.N3) {
            f72 f72Var = new f72(5, this, this.J0, getContext());
            this.N1 = f72Var;
            A1(f72Var);
        }
        if (this.e2 == null) {
            k22 k22Var = new k22(this, this.J0, getContext());
            this.e2 = k22Var;
            this.t2[2] = k22Var;
            k22Var.setupBlurredSearchField(this.E4);
            this.e2.setDelegate(new g02(this));
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            TLRPC.Chat chat = ((mu1) dVar).e;
            this.e2.setMultipleSelectionAllowed(chat == null || hc2.N(chat) || !chat.slowmode_enabled);
        }
        A1(this.e2);
    }

    public final void m1(boolean z) {
        if (!this.H3 && z) {
            f72 f72Var = new f72(4, this, this.J0, getContext());
            this.N1 = f72Var;
            A1(f72Var);
        }
        boolean z2 = false;
        if (this.j2 == null) {
            d32 d32Var = new d32(this.H1 ? 2 : 0, this, this.J0, getContext());
            this.j2 = d32Var;
            this.t2[4] = d32Var;
            d32Var.setDelegate(new h02(this));
        }
        int i = 1;
        if (this.B1) {
            this.j2.setMaxSelectedFiles(1);
        } else {
            d dVar = this.Z1;
            if (dVar instanceof mu1) {
                TLRPC.Chat chat = ((mu1) dVar).e;
                d32 d32Var2 = this.j2;
                if ((chat == null || hc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i = -1;
                }
                d32Var2.setMaxSelectedFiles(i);
            } else {
                this.j2.setMaxSelectedFiles(this.P3);
                d32 d32Var3 = this.j2;
                if (!this.H1 && !this.Q1) {
                    z2 = true;
                }
                d32Var3.setCanSelectOnlyImageFiles(z2);
            }
        }
        d32 d32Var4 = this.j2;
        d32Var4.e0 = this.H1;
        if (z) {
            A1(d32Var4);
        }
    }

    public final void o1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        x10 x10Var = this.U2;
        int i = 1;
        if (x10Var.o0) {
            x10Var.n(true);
        }
        this.e2 = null;
        this.m2 = null;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = null;
        this.q2 = null;
        while (true) {
            p02[] p02VarArr = this.t2;
            if (i >= p02VarArr.length) {
                break;
            }
            p02 p02Var = p02VarArr[i];
            if (p02Var != null) {
                p02Var.q();
                this.b.removeView(p02VarArr[i]);
                p02VarArr[i] = null;
            }
            i++;
        }
        D1(false, false);
        super.I();
        if (this.r2) {
            this.r2 = false;
            this.s2 = 0.0f;
            d dVar = this.Z1;
            if (dVar == null || dVar.getFragmentView() == null) {
                return;
            }
            View fragmentView = dVar.getFragmentView();
            WeakHashMap weakHashMap = jdc.a;
            zcc.c(fragmentView);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        if (this.M1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        x10 x10Var = this.U2;
        if (x10Var.o0) {
            x10Var.n(true);
            return;
        }
        if (this.v2.k()) {
            return;
        }
        if (U0() == null || !U0().e) {
            super.onBackPressed();
        } else {
            U0().k(true);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.Z1;
        if (dVar != null) {
            gl.m3(this, dVar.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.v2.H(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // fx0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.M1);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.M1);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        if (i == 0) {
            N0();
            J0();
            return;
        }
        int i3 = 1;
        if (i == 2) {
            J0();
            k62 k62Var = this.g2;
            if (k62Var != null) {
                if (this.w2 == k62Var) {
                    i2 = 1;
                } else if (this.v2 == k62Var) {
                    i2 = 0;
                }
                K1(i2);
            }
            k62 k62Var2 = this.h2;
            if (k62Var2 != null) {
                if (this.w2 != k62Var2) {
                    if (this.v2 != k62Var2) {
                        return;
                    } else {
                        i3 = 0;
                    }
                }
                K1(i3);
                return;
            }
            return;
        }
        if (i == 1) {
            J0();
            return;
        }
        if (i == 3) {
            M0();
            return;
        }
        if (i == 4) {
            M0();
            return;
        }
        if (i == 5) {
            M0();
            e02 e02Var = this.F2;
            if (e02Var != null) {
                e02Var.setEphemeralFactor(f);
                e02Var.setSameWidthFactor(f);
            }
        }
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            H0();
            ql0 ql0Var = this.V1;
            if (ql0Var != null) {
                ql0Var.updateColors();
            }
            int v0 = bkb.v0(bkb.i5, this.J0);
            r7 r7Var = this.h3;
            if (r7Var == null || v0 == this.o4) {
                return;
            }
            this.o4 = v0;
            r7Var.setIconColor(v0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final boolean p1(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.F3) {
            return false;
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            mu1 mu1Var = (mu1) dVar;
            TLRPC.Chat chat = mu1Var.e;
            if (mu1Var.h() != null || ((hc2.T(chat) && chat.megagroup) || !hc2.T(chat))) {
                na7.q1(this.G3).W3.edit().putBoolean("silent_" + mu1Var.a(), !z).commit();
            }
        }
        if (G0(U0().getText())) {
            return true;
        }
        E0();
        if (this.q1.f) {
            this.F3 = true;
            this.W3.B1(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        long V0 = V0();
        p02 p02Var = this.v2;
        return ij.Y(this.G3, V0, R0() + (p02Var != null ? p02Var.getSelectedItemsCount() : 1), new p8c() { // from class: sz1
            @Override // p8c
            public final void a(Object obj) {
                x02 x02Var = x02.this;
                x02Var.F3 = true;
                x02Var.W3.B1(7, true, z, i, i2, j, z2, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void q1(boolean z, boolean z2) {
        this.l1.a(z, z2);
        rt3 U0 = U0();
        this.W1 = z;
        rt3 U02 = U0();
        final byte b = 1;
        final boolean z3 = this.A2.getTag() != null;
        p02 p02Var = this.v2;
        final boolean z4 = this.W1 && (p02Var == this.d2 || p02Var == this.k2);
        st stVar = this.L2;
        u31 u31Var = this.z2;
        if (z2) {
            stVar.setVisibility(z3 ? 0 : 8);
            ViewPropertyAnimator duration = stVar.animate().alpha((z4 && z3) ? 1.0f : 0.0f).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).setUpdateListener(new gz1(this, r3)).withEndAction(new Runnable(this) { // from class: hz1
                public final /* synthetic */ x02 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = r4;
                    boolean z5 = z3;
                    boolean z6 = z4;
                    x02 x02Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!z6 || !z5) {
                                x02Var.L2.setVisibility(8);
                            }
                            x02Var.L1();
                            break;
                        default:
                            if (z6 || !z5) {
                                x02Var.z2.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            u31Var.setVisibility(0);
            u31Var.animate().translationY((z4 || !z3) ? u31Var.getMeasuredHeight() : 0.0f).alpha((z4 || !z3) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(s33Var).setUpdateListener(new gz1(this, b)).withEndAction(new Runnable(this) { // from class: hz1
                public final /* synthetic */ x02 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z5 = z3;
                    boolean z6 = z4;
                    x02 x02Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!z6 || !z5) {
                                x02Var.L2.setVisibility(8);
                            }
                            x02Var.L1();
                            break;
                        default:
                            if (z6 || !z5) {
                                x02Var.z2.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
        } else {
            stVar.setVisibility((z4 && z3) ? 0 : 8);
            stVar.setAlpha((z4 && z3) ? 1.0f : 0.0f);
            L1();
            u31Var.setAlpha((z4 || !z3) ? 0.0f : 1.0f);
            u31Var.setTranslationY((z4 || !z3) ? u31Var.getMeasuredHeight() : 0.0f);
            u31Var.setVisibility((z4 || !z3) ? (byte) 8 : (byte) 0);
        }
        if (U0 != U02) {
            U0.k(true);
            U02.setText(gm.cloneSpans(U0.getText()));
            U02.getEditText().setAllowTextEntitiesIntersection(U0.getEditText().getAllowTextEntitiesIntersection());
            if (U0.getEditText().isFocused()) {
                U02.getEditText().requestFocus();
                U02.getEditText().setSelection(U0.getEditText().getSelectionStart(), U0.getEditText().getSelectionEnd());
            }
        }
        gl.d3(new vq0(this, b));
    }

    @Override // fx0
    public final void r0(boolean z) {
        this.r0 = true;
    }

    public final void r1(int i, k27 k27Var) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (k27Var != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.a0();
        }
        if (this.E3 == k27Var && this.D3 == i) {
            return;
        }
        this.E3 = k27Var;
        if (k27Var != null && k27Var.z2()) {
            i = this.E3.I3() ? 2 : this.E3.U2() ? 1 : 0;
        }
        this.D3 = i;
        if (this.E3 != null) {
            this.P3 = 1;
            this.Q3 = false;
        } else {
            this.P3 = -1;
            this.Q3 = true;
        }
        this.x3.f();
        F1(0);
    }

    public final void s1(float f) {
        int i;
        float translationY = this.b.getTranslationY() - this.s2;
        this.s2 = this.b.getHeight() * f;
        this.b.setTranslationY(translationY);
        r32 r32Var = this.q2;
        if (r32Var != null) {
            r32Var.setSendTransitionProgress(f);
        }
        if (this.p0) {
            i = Math.round((1.0f - f) * this.q0);
        } else {
            i = 0;
        }
        this.Z.setAlpha(i);
        this.D0 = 1.0f - f;
        this.c.invalidate();
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        this.F3 = false;
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            this.i0 = ((mu1) dVar).O7();
        }
        G1();
        this.p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o = bm2.o(bkb.v0(bkb.Z6, this.J0), 0);
            this.H0 = o;
            gl.p3(this, o, false, null);
            gl.j3(this, ((double) gl.B(this.H0)) > 0.721d);
        }
        if (this.j4) {
            this.j4 = false;
            x10 x10Var = this.U2;
            x10Var.updateColors();
            x10Var.invalidate();
            d1();
        }
    }

    public final void t1(int i, boolean z) {
        if (this.E3 != null) {
            return;
        }
        this.P3 = i;
        this.Q3 = z;
    }

    public final void u1(float f) {
        int o = bm2.o(bkb.v0(bkb.Z6, this.J0), Math.min(kk7.d4, Math.max(0, (int) (f * 255.0f))));
        this.H0 = o;
        gl.p3(this, o, false, null);
        gl.j3(this, ((double) gl.B(this.H0)) > 0.721d);
        this.c.invalidate();
    }

    public final void v1(String str) {
        this.N2 = (byte) 1;
        this.z1 = true;
        this.P2 = false;
        this.J3 = false;
        this.u3.setVisibility(8);
        this.g3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            x02 x02Var = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.h1 = (x02Var.N2 == 0 || x02Var.z1) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1(boolean z) {
        boolean z2;
        byte b = 1;
        if (z) {
            d dVar = this.Z1;
            if ((dVar instanceof mu1) && !((mu1) dVar).y()) {
                z2 = true;
                if (this.y4 == z2) {
                    if (z2) {
                        na7.q1(this.G3).O1().b();
                    }
                    this.y4 = z2;
                    ImageView imageView = this.v1;
                    imageView.setVisibility(0);
                    ImageView imageView2 = this.x1;
                    imageView2.setVisibility(0);
                    ViewPropertyAnimator scaleY = imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f);
                    s33 s33Var = s33.h;
                    scaleY.setInterpolator(s33Var).setDuration(420L).withEndAction(new qz1(this, z2, b)).start();
                    imageView2.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(s33Var).setDuration(420L).withEndAction(new qz1(this, z2, (byte) 2)).start();
                    if (z2) {
                        gc gcVar = this.w1;
                        Objects.requireNonNull(gcVar);
                        imageView.postDelayed(new fc(gcVar, b), 220L);
                        gc gcVar2 = this.y1;
                        Objects.requireNonNull(gcVar2);
                        imageView2.postDelayed(new fc(gcVar2, b), 220L);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (this.y4 == z2) {
        }
    }

    @Override // fx0
    public final void x() {
        if (this.Z1 instanceof mu1) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.v2.y();
        gl.g2(k96.M0(2131754921, "AccDescrAttachButton"));
        this.p3 = true;
        if (this.J3 || this.I3) {
            return;
        }
        F0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(long j, String str, boolean z, boolean z2) {
        TLRPC.ChatFull L0;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.u2;
        byte b = 1;
        if (longSparseArray.get(j) != null && Objects.equals(str, ((s12) longSparseArray.get(j)).getStartCommand())) {
            s12 s12Var = (s12) longSparseArray.get(j);
            if (s12Var.I) {
                s12Var.I = false;
            }
            if (longSparseArray.get(j) == null) {
                ((s12) longSparseArray.get(j)).K.setSwipeOffsetAnimationDisallowed(true);
                B1((p02) longSparseArray.get(j), -j, z2);
                if (z) {
                    s12 s12Var2 = (s12) longSparseArray.get(j);
                    TLRPC.User V1 = na7.q1(s12Var2.G).V1(Long.valueOf(s12Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(s12Var2.G).b.bots;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                        i++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == s12Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot != null) {
                        gl.e3(new kx1(s12Var2, tL_attachMenuBot.show_in_side_menu ? tL_attachMenuBot.show_in_attach_menu ? k96.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753135, V1.first_name) : k96.a0("BotAttachMenuShortcatAddedSide", null, 2131753134, V1.first_name) : k96.a0("BotAttachMenuShortcatAddedAttach", null, 2131753136, V1.first_name), (byte) 11), 200L);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar = this.Z1;
        if (dVar instanceof mu1) {
            Context context = getContext();
            wjb wjbVar = this.J0;
            s12 s12Var3 = new s12(this, wjbVar, context);
            s12Var3.V = new i12(s12Var3, (byte) 2);
            r7 a = s12Var3.b.U2.t().a(0, R.drawable.ic_ab_other);
            s12Var3.L = a;
            a.e(R.id.menu_open_bot, R.drawable.msg_bot, k96.M0(2131752900, null));
            a8 e = a.e(R.id.menu_settings, R.drawable.msg_settings, k96.M0(2131752885, null));
            s12Var3.M = e;
            e.setVisibility(8);
            a.e(R.id.menu_reload_page, R.drawable.msg_retry, k96.M0(2131752899, null));
            a8 e2 = a.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, k96.M0(2131754387, null));
            s12Var3.N = e2;
            e2.setVisibility(8);
            a.e(R.id.menu_tos_bot, R.drawable.menu_intro, k96.M0(2131752882, null));
            a.e(R.id.menu_report_bot, R.drawable.msg_report, k96.M0(2131752898, null));
            a.e(R.id.menu_delete_bot, R.drawable.msg_delete, k96.M0(2131752903, null));
            gw0 gw0Var = new gw0(s12Var3, context, wjbVar, bkb.v0(bkb.g5, s12Var3.a), (byte) 1);
            s12Var3.n = gw0Var;
            fw0 fw0Var = new fw0(b, context, s12Var3);
            s12Var3.K = fw0Var;
            fw0Var.addView(gw0Var, nme.c(-1.0f, -1));
            fw0Var.setScrollListener(new i12(s12Var3, (byte) 3));
            fw0Var.setScrollEndListener(new i12(s12Var3, (byte) 4));
            fw0Var.setDelegate(new k12(s12Var3));
            fw0Var.setIsKeyboardVisible(new k12(s12Var3));
            s12Var3.addView(fw0Var, nme.c(-1.0f, -1));
            m12 m12Var = new m12(context, wjbVar);
            s12Var3.J = m12Var;
            s12Var3.addView(m12Var, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            gw0Var.setWebViewProgressListener(new gw(s12Var3, (byte) 5));
            kk7.e().b(s12Var3, kk7.p4);
            longSparseArray.put(j, s12Var3);
            ((s12) longSparseArray.get(j)).setDelegate(new c02(this, s12Var3, str, j));
            mu1 mu1Var = (mu1) dVar;
            k27 replyingMessageObject = mu1Var.a0.getReplyingMessageObject();
            s12 s12Var4 = (s12) longSparseArray.get(j);
            long a2 = mu1Var.a();
            int i2 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long a7 = mu1Var.a7();
            gw0 gw0Var2 = s12Var4.n;
            int i3 = this.G3;
            s12Var4.G = i3;
            s12Var4.x = a2;
            s12Var4.w = j;
            s12Var4.E = i2;
            s12Var4.F = a7;
            s12Var4.H = str;
            a8 a8Var = s12Var4.N;
            if (a8Var != null) {
                hq6.d0(i3);
                a8Var.setVisibility(0);
            }
            gw0Var2.setBotUser(na7.q1(i3).V1(Long.valueOf(j)));
            gw0Var2.p(i3, j);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = na7.q1(i3).h1(a2);
            tL_messages_requestWebView.bot = na7.q1(i3).m1(j);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a2 < 0 && (L0 = na7.q1(i3).L0(-a2)) != null && (peer = L0.default_send_as) != null) {
                tL_messages_requestWebView.send_as = na7.q1(i3).k1(peer);
                tL_messages_requestWebView.flags |= TLObject.FLAG_13;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i2 != 0) {
                z3a.B(i3);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i2;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (a7 != 0) {
                    tL_inputReplyToMessage.monoforum_peer_id = na7.q1(i3).h1(a7);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (a7 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = na7.q1(i3).h1(a7);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u = ow0.u(s12Var4.a, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_requestWebView, new l12(s12Var4, i3, (byte) 0));
            kk7.f(i3).b(s12Var4, kk7.y1);
        }
        if (longSparseArray.get(j) == null) {
        }
    }

    @Override // ax0
    public final boolean y() {
        return true;
    }

    public final void y1(d dVar) {
        if ((dVar instanceof mu1) && hc2.V(((mu1) dVar).e)) {
            new u21(this.o3, this.J0).f(na7.q1(this.G3).k4.h1.f(), new kx1(this, dVar, (byte) 5)).j();
        }
    }

    public final boolean z1(boolean z, boolean z2) {
        float f;
        int i;
        p02 p02Var;
        x10 x10Var;
        this.m1.a(z, true);
        wz1 wz1Var = this.A2;
        if (z == (wz1Var.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        wz1Var.setTag(z ? 1 : null);
        zz1 zz1Var = this.B2;
        if (zz1Var.getEditText().isFocused()) {
            gl.t1(zz1Var.getEditText());
        }
        zz1Var.k(true);
        this.M2.k(true);
        wz1 wz1Var2 = this.u3;
        wz1 wz1Var3 = this.E2;
        if (z) {
            if (!this.H1) {
                wz1Var.setVisibility(0);
            }
            wz1Var3.setVisibility(0);
        } else if (this.P2) {
            wz1Var2.setVisibility(0);
        }
        p02 p02Var2 = this.v2;
        boolean z3 = (p02Var2 == this.d2 || p02Var2 == this.k2) && this.W1;
        x10 x10Var2 = this.U2;
        st stVar = this.L2;
        u31 u31Var = this.z2;
        e02 e02Var = this.F2;
        if (z2) {
            this.J2 = new AnimatorSet();
            if (z3) {
                stVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(wz1Var, (Property<wz1, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(u31Var, (Property<u31, Float>) property, (!z || z3) ? 0.0f : 1.0f));
            if (!z || z3) {
                x10Var = x10Var2;
            } else {
                u31Var.setVisibility(0);
                x10Var = x10Var2;
                arrayList.add(ObjectAnimator.ofFloat(u31Var, (Property<u31, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(stVar, (Property<st, Float>) property, (z && z3) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(wz1Var3, (Property<wz1, Float>) property2, z ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(wz1Var3, (Property<wz1, Float>) property3, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(wz1Var3, (Property<wz1, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(e02Var, (Property<e02, Float>) property2, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(e02Var, (Property<e02, Float>) property3, z ? 1.0f : 0.2f));
            if (x10Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(wz1Var, (Property<wz1, Float>) View.TRANSLATION_Y, z ? 0.0f : gl.L(48.0f)));
            } else if (this.P2) {
                arrayList.add(ObjectAnimator.ofFloat(wz1Var2, (Property<wz1, Float>) View.TRANSLATION_Y, z ? gl.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(wz1Var2, (Property<wz1, Float>) property, z ? 0.0f : 1.0f));
            }
            if (z3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gz1(this, (byte) 5));
                arrayList.add(ofFloat);
            }
            this.J2.playTogether(arrayList);
            this.J2.setInterpolator(new DecelerateInterpolator());
            this.J2.setDuration(180L);
            this.J2.addListener(new x5(this, z, z3, (byte) 3));
            this.J2.start();
            i = 0;
        } else {
            wz1Var.setAlpha(z ? 1.0f : 0.0f);
            u31Var.setAlpha((z && z3) ? 1.0f : 0.0f);
            if (!z || z3) {
                f = 0.0f;
                i = 0;
            } else {
                i = 0;
                u31Var.setVisibility(0);
                f = 0.0f;
                u31Var.setTranslationY(0.0f);
            }
            wz1Var3.setScaleX(z ? 1.0f : 0.2f);
            wz1Var3.setScaleY(z ? 1.0f : 0.2f);
            wz1Var3.setAlpha(z ? 1.0f : f);
            stVar.setVisibility((z && z3) ? i : 8);
            stVar.setAlpha((z && z3) ? 1.0f : f);
            e02Var.setScaleX(z ? 1.0f : 0.2f);
            e02Var.setScaleY(z ? 1.0f : 0.2f);
            if (x10Var2.getTag() != null) {
                wz1Var.setTranslationY(z ? f : gl.L(48.0f));
            } else if (this.P2 && ((p02Var = this.v2) == null || p02Var.N())) {
                wz1Var2.setTranslationY(z ? gl.L(84.0f) : f);
            }
            if (!z) {
                wz1Var.setVisibility(4);
                wz1Var3.setVisibility(4);
            }
            if (z3) {
                L1();
            }
        }
        if (z) {
            i = Math.max(1, this.v2.getSelectedItemsCount());
        }
        e02Var.f(i, z2);
        e02Var.i(R0() + this.v2.getSelectedItemsCount(), this.E3 != null ? 0L : na7.q1(this.G3).K1(V0()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zz1Var.getLayoutParams();
        int max = Math.max(gl.L(48.0f), e02Var.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zz1Var.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override // x74
    public final void D(float f, int i) {
    }

    public x02(Activity activity, d dVar, boolean z, boolean z2) {
        this(activity, dVar, z, z2, true, null);
    }
}
