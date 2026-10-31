package th;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.el0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o7 implements us, org.telegram.ui.ActionBar.g2, lf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public s0 A0;
    public g7 B0;
    public SurfaceView C0;
    public vh.s2 D0;
    public boolean E;
    public vh.s2 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public k2.t0 G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public final e2.f J0;
    public float K;
    public boolean K0;
    public float L;
    public boolean L0;
    public k5 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public x4 O0;
    public float P;
    public int P0;
    public float Q;
    public TL_stories.PeerStories Q0;
    public float R;
    public boolean R0;
    public float S;
    public boolean S0;
    public TL_stories.StoryItem T0;
    public float U;
    public int U0;
    public float V;
    public boolean V0;
    public float W;
    public int[] W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean a0;
    public boolean a1;
    public float b0;
    public final i2 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public b6 d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final org.telegram.ui.ActionBar.k2 f;
    public boolean f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public int h;
    public boolean h0;
    public boolean h1;
    public GestureDetector i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public boolean l0;
    public boolean l1;
    public boolean m0;
    public boolean m1;
    public WindowManager n;
    public e7 n0;
    public sg.v n1;
    public i2 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public c7 s;
    public final l7 s0;
    public boolean s1;
    public k7 t0;
    public long t1;
    public Dialog u0;
    public i5 u1;
    public org.telegram.ui.ActionBar.g2 v0;
    public ValueAnimator v1;
    public d7 w;
    public boolean w0;
    public boolean w1;
    public f4 x;
    public final ArrayList x0;
    public boolean y;
    public org.telegram.ui.k4 y0;
    public n7 z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = tz.b0;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b D = new b();
    public final RectF T = new RectF();
    public final float[] o0 = new float[2];

    public o7(org.telegram.ui.ActionBar.k2 k2Var) {
        l7 l7Var = new l7();
        l7Var.k = 1.0f;
        this.s0 = l7Var;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new e2.f(null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new i2(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = k2Var;
    }

    public static CharSequence I(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean L(jj jjVar) {
        return z1 != null && (jjVar.D == 23 || jjVar.Z4()) && !A1 && z1.messageId == jjVar.f1() && z1.messageType != 3;
    }

    public static void X(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        E1.put(j10 + (j10 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean u(o7 o7Var, c7 c7Var, float f7, float f10, boolean z10) {
        t1 t1Var;
        t1 t1Var2;
        if (c7Var == null) {
            return false;
        }
        if (o7Var.X0) {
            return true;
        }
        if (o7Var.x != null && o7Var.e0 != 0.0f) {
            return true;
        }
        z2 currentPeerView = o7Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.E0(currentPeerView, ((f7 - o7Var.w.getX()) - o7Var.n0.getX()) - currentPeerView.getX(), ((f10 - o7Var.w.getY()) - o7Var.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.e2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (t1Var2 = currentPeerView.K1) != null && t1Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.K1.getY() + currentPeerView.getY() + o7Var.n0.getY() + o7Var.w.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (t1Var = currentPeerView.K1) == null || !t1Var.t0()) && o7Var.u1 == null) {
            return org.telegram.messenger.i0.Y(c7Var, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void v(o7 o7Var) {
        el0 el0Var;
        mt editField;
        z2 currentPeerView = o7Var.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.K1 == null || (((el0Var = currentPeerView.K2) != null && el0Var.getVisibility() == 0) || (editField = currentPeerView.K1.getEditField()) == null)) {
            o7Var.y();
            return;
        }
        editField.requestFocus();
        org.telegram.messenger.i0.J3(editField);
        org.telegram.messenger.i0.h3(new i2(o7Var, 6), 200L);
    }

    public static void w(o7 o7Var) {
        float l4 = Utilities.l(Math.abs(Math.max(o7Var.X, o7Var.W) / org.telegram.messenger.i0.L(80.0f)));
        if (o7Var.V != l4) {
            o7Var.V = l4;
            o7Var.B();
            z2 currentPeerView = o7Var.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.g2) {
                currentPeerView.invalidate();
            }
            s0 s0Var = o7Var.A0;
            if (s0Var != null) {
                s0Var.v((1.0f - o7Var.V) * o7Var.U);
            }
        }
        c7 c7Var = o7Var.s;
        if (c7Var != null) {
            c7Var.invalidate();
        }
    }

    public final void A(boolean z10) {
        if (this.v1 != null) {
            return;
        }
        if (this.p0 != 0) {
            org.telegram.messenger.i0.v1(this.x);
            return;
        }
        if (this.c0 || this.e0 != 0.0f) {
            this.J0.d();
            if (!z10) {
                float f7 = this.e0;
                f4 f4Var = this.x;
                float f10 = f4Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    f4Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.x.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new w6(this, 3));
            this.v1.addListener(new sg.y(4, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(gr.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(gr.f);
            }
            this.v1.start();
        }
    }

    public final void B() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.I1) == null) {
            return;
        }
        launchActivity.F(true, true, true);
    }

    public final void C() {
        if (this.x == null) {
            f4 f4Var = new f4(this.w.getContext(), this);
            this.x = f4Var;
            this.w.addView(f4Var, 0);
        }
        z2 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 == null) {
                this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.O0.i.size(); i10++) {
                arrayList.add(((jj) this.O0.i.get(i10)).l);
            }
            this.x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
        }
    }

    public final void D(boolean z10) {
        org.telegram.messenger.i0.v1(this.s);
        this.H0 = true;
        this.h1 = true;
        d0();
        a0(false);
        e0();
        this.J0.d();
        this.b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new w6(this, 0));
        if (z10) {
            M();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            l7 l7Var = this.s0;
            ImageReceiver imageReceiver = l7Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = l7Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            l7Var.c = null;
            l7Var.b = null;
        }
        org.telegram.messenger.i0.h3(new i2(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void E() {
        z2 z2Var;
        e7 e7Var = this.n0;
        if (e7Var != null) {
            ArrayList arrayList = e7Var.P0;
            for (int i10 = 0; i10 < e7Var.getChildCount(); i10++) {
                View childAt = e7Var.getChildAt(i10);
                if ((childAt instanceof z5) && (z2Var = ((z5) childAt).a) != null && !z2Var.E3) {
                    z2Var.E3 = true;
                    t1 t1Var = z2Var.K1;
                    if (t1Var != null) {
                        t1Var.z0();
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                z2 z2Var2 = (z2) arrayList.get(i11);
                if (!z2Var2.E3) {
                    z2Var2.E3 = true;
                    t1 t1Var2 = z2Var2.K1;
                    if (t1Var2 != null) {
                        t1Var2.z0();
                    }
                }
            }
        }
    }

    public final void F(KeyEvent keyEvent) {
        if (D1) {
            c0();
            return;
        }
        z2 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            y2 y2Var = currentPeerView.x1;
            if (!y2Var.j() && y2Var.e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void G(Runnable runnable) {
        if (runnable != null) {
            this.x0.add(runnable);
        }
    }

    public final z2 H() {
        e7 e7Var = this.n0;
        if (e7Var == null) {
            return null;
        }
        return e7Var.getCurrentPeerView();
    }

    public final void J() {
        if (this.m0) {
            org.telegram.messenger.i0.v1(this.s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            d0();
            this.O = 0.0f;
            this.N = 0.0f;
            l7 l7Var = this.s0;
            ImageReceiver imageReceiver = l7Var.b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = l7Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            l7Var.c = null;
            l7Var.b = null;
            d7 d7Var = this.w;
            if (d7Var != null) {
                d7Var.a(true);
            }
            this.J0.e();
            k2.t0 t0Var = this.G0;
            if (t0Var != null) {
                t0Var.b();
            }
            W();
            if (this.b) {
                org.telegram.messenger.i0.E2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            E();
            this.m0 = false;
            this.d = false;
            B();
            i2 i2Var = this.o1;
            if (i2Var != null) {
                i2Var.run();
                this.o1 = null;
            }
        }
    }

    public final boolean K() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (this.X0 || this.Z0 || this.Y0 || this.L0 || this.q0 || this.y || this.u0 != null || this.v0 != null || this.H0 || this.I0 || this.U != 1.0f || this.e0 != 0.0f || this.i1) {
            return true;
        }
        if ((this.l1 && this.a) || this.k1 || this.j1 || this.p1 || this.V != 0.0f || this.u1 != null) {
            return true;
        }
        return (!this.b || (k2Var = this.f) == null || k2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        TL_stories.StoryItem storyItem;
        z2 currentPeerView;
        int selectedPosition;
        this.d = true;
        l7 l7Var = this.s0;
        ImageReceiver imageReceiver = l7Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = l7Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            l7Var.c.O0(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((jj) this.O0.i.get(selectedPosition)).f1();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof z4) {
                z2 currentPeerView2 = this.n0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.e1;
                    if (selectedPosition2 >= 0 && selectedPosition2 < arrayList.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                        if (storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        }
                    }
                }
                storyItem = null;
                if (storyItem != null) {
                }
            }
            this.t0.d(currentDialogId, i10, new i2(this, 5));
        }
    }

    public final void N(boolean z10) {
        Activity W = org.telegram.messenger.i0.W(this.f.getContext());
        if (W != null) {
            try {
                W.setRequestedOrientation(z10 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z10) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void O(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, x4 x4Var, TL_stories.PeerStories peerStories, k7 k7Var, boolean z10) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E12 = org.telegram.messenger.i0.E1(context);
        ArrayList arrayList2 = this.x0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (this.m0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        n7 n7Var = this.z0;
        if (n7Var != null) {
            n7Var.setSpeed(1.0f);
        }
        boolean z11 = (org.telegram.messenger.i0.Q1() || this.r1) ? false : true;
        this.b = z11;
        this.a = tz.b0 && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && x4Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = x4Var;
        this.Q0 = peerStories;
        this.t0 = k7Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        e7 e7Var = this.n0;
        if (e7Var != null) {
            e7Var.setHorizontalProgressToDismiss(0.0f);
            this.n0.F0 = 0;
        }
        this.d0 = 0.0f;
        this.Z = 0.0f;
        this.l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.a1 = false;
        this.Z0 = false;
        this.e1.clear();
        org.telegram.messenger.i0.r(this.b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.i0.m(layoutParams);
        this.r.flags = -2147417728;
        this.H0 = false;
        this.c1 = false;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (this.s == null) {
            this.i0 = new GestureDetector(new y6(this));
            this.s = new c7(this, context, Q);
        }
        if (this.w == null) {
            this.w = new d7(context, this);
            e7 e7Var2 = new e7(this, this.h, context, this, this.D);
            this.n0 = e7Var2;
            e7Var2.setDelegate(new f7(this, x4Var, arrayList, context));
            this.w.addView(this.n0, w7.b6.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.k4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                g7 g7Var = new g7(context, this);
                this.B0 = g7Var;
                this.y0.addView(g7Var);
            }
            vh.s2 s2Var = new vh.s2(context, this.h);
            this.D0 = s2Var;
            s2Var.setVisibility(8);
            this.y0.addView(this.D0);
            b6 b6Var = new b6(context);
            Paint paint = new Paint(1);
            b6Var.a = paint;
            b6Var.c = new ew(b6Var, 29);
            b6Var.d = new org.telegram.ui.Components.t5(b6Var);
            b6Var.e = new org.telegram.ui.Components.t5(b6Var);
            paint.setColor(-1);
            this.d1 = b6Var;
            this.w.addView(b6Var, w7.b6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        vh.s2 s2Var2 = this.D0;
        if (s2Var2 != null) {
            s2Var2.setAccount(this.h);
        }
        org.telegram.messenger.i0.E2(this.y0);
        this.s.addView(this.y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.i0.E2(this.w);
        this.s.addView(this.w);
        this.s.setClipChildren(false);
        if (this.N0) {
            e0();
        }
        if (x4Var != null) {
            this.n0.D(this.h, x4Var.d, x4Var.h());
        } else {
            e7 e7Var3 = this.n0;
            int i12 = this.h;
            e7Var3.A0 = arrayList;
            e7Var3.y0 = i12;
            e7Var3.setAdapter(null);
            e7Var3.setAdapter(e7Var3.z0);
            e7Var3.setCurrentItem(i11);
            e7Var3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && Q != null && Q.isSupportEdgeToEdge();
        d7 d7Var = this.w;
        rh.d0 d0Var = new rh.d0(this, 18);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(d7Var, d0Var);
        if (this.b) {
            org.telegram.messenger.i0.E2(this.s);
            this.s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            Q.getLayoutContainer().addView(this.s);
            if (!this.c) {
                org.telegram.messenger.i0.Z2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.s.setFocusable(false);
            this.w.setFocusable(false);
            this.w.setSystemUiVisibility(1792);
            org.telegram.messenger.i0.x3(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
            }
        }
        this.s.requestLayout();
        A1 = true;
        e0();
        this.U = 0.0f;
        B();
        x1 = true;
        if (C1) {
            C1 = false;
            D1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            N(true);
        }
        if (!this.b) {
            y1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.i0.v1(Q.getFragmentView());
        }
    }

    public final void P(int i10, Context context, TL_stories.StoryItem storyItem, k7 k7Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || vp.r1(i10).Z1(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || vp.r1(this.h).L0(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                O(i10, context, storyItem, arrayList, 0, null, null, k7Var, false);
            }
        }
    }

    public final void Q(Context context, int i10, x4 x4Var, n5 n5Var) {
        this.h = d20.s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(x4Var.d));
        this.P0 = i10;
        T(context, null, arrayList, 0, x4Var, null, n5Var, false);
    }

    public final void R(Context context, long j10, k7 k7Var) {
        this.h = d20.s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        e5 O1 = vp.r1(this.h).O1();
        int i10 = O1.a;
        TL_stories.PeerStories y3 = O1.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (w5.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !O1.L(j10)) {
                O1.g.remove(y3);
                O1.h.remove(y3);
                zs.f(i10).k(zs.v5, new Object[0]);
            }
        }
        T(context, null, arrayList, 0, null, null, k7Var, false);
    }

    public final void S(Context context, TL_stories.PeerStories peerStories, k7 k7Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = d20.s0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(org.telegram.messenger.o5.o(peerStories.peer)));
        T(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, k7Var, false);
    }

    public final void T(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, x4 x4Var, TL_stories.PeerStories peerStories, k7 k7Var, boolean z10) {
        O(d20.s0, context, storyItem, arrayList, i10, x4Var, peerStories, k7Var, z10);
    }

    public final void U(Context context, TL_stories.StoryItem storyItem, n5 n5Var) {
        P(d20.s0, context, storyItem, n5Var);
    }

    public final void V(org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.b) {
            Q.presentFragment(k2Var);
        } else {
            Q.presentFragment(k2Var);
            D(false);
        }
    }

    public final void W() {
        ArrayList arrayList;
        this.F0 = null;
        Y(false);
        x(true);
        n7 n7Var = this.z0;
        if (n7Var != null) {
            n7Var.release(null);
            this.z0 = null;
        }
        vh.s2 s2Var = this.D0;
        if (s2Var != null) {
            s2Var.d(0L, null);
        }
        s0 s0Var = this.A0;
        if (s0Var != null) {
            w0 w0Var = w0.Z;
            if (!w0Var.S || w0Var.w != s0Var) {
                if (s0Var.n) {
                    s0Var.s(null);
                } else {
                    s0Var.e();
                }
            }
        }
        this.A0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n7) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = vp.r1(this.h).O1().m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((x7) hVar.n(i11)).b(false);
        }
        if (this.b) {
            N(false);
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.f;
        if (k2Var != null) {
            k2Var.removeSheet(this);
        }
        y1.remove(this);
        this.x0.clear();
        this.e0 = 0.0f;
        z1 = null;
    }

    public final void Y(boolean z10) {
        this.q0 = z10;
        if (z10) {
            ew ewVar = this.d1.c;
            org.telegram.messenger.i0.r(ewVar);
            ewVar.run();
        }
        d0();
    }

    public final void Z(boolean z10) {
        z2 currentPeerView;
        z2 currentPeerView2;
        y2 y2Var;
        n7 n7Var;
        k2.t0 t0Var;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (y2Var = currentPeerView2.x1) != null && !y2Var.f && y2Var.b == null) {
                if (!this.k0 && !this.j0 && (t0Var = this.G0) != null && ((n7) t0Var.c) != null) {
                    currentPeerView2.L0.invalidate();
                    org.telegram.messenger.t2.e.a();
                }
                k2.t0 t0Var2 = this.G0;
                if (t0Var2 != null && (n7Var = (n7) t0Var2.c) != null && !this.k0) {
                    n7Var.setSeeking(true);
                }
                this.k0 = true;
            }
            d0();
            e7 e7Var = this.n0;
            if (e7Var == null || (currentPeerView = e7Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.a1);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void a(boolean z10) {
        D(true);
    }

    public final void a0(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z10) {
            Window window = launchActivity.getWindow();
            Typeface typeface = org.telegram.messenger.i0.a;
            this.w0 = Build.VERSION.SDK_INT >= 26 ? v7.u7.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        }
        if (this.w0) {
            org.telegram.messenger.i0.l3(launchActivity, !z10);
        }
    }

    public final void b0() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (this.A0 == null || (k2Var = this.f) == null || this.D0 == null) {
            return;
        }
        Activity W = org.telegram.messenger.i0.W(k2Var.getContext());
        if (mf.b.a(W) > 0) {
            s0 s0Var = this.A0;
            w0 w0Var = w0.Z;
            if (s0Var != null && !w0Var.S) {
                w0Var.S = true;
                w0Var.w = s0Var;
                int i10 = s0Var.e;
                w0Var.x = i10;
                zs.f(i10).b(w0Var, zs.G2);
                w0Var.J = w0Var.h();
                w0Var.K = w0Var.f();
                w0Var.M = 1.0f;
                w0Var.H = false;
                o1.j jVar = new o1.j(w0Var, w0.X);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.m = kVar;
                w0Var.P = jVar;
                o1.j jVar2 = new o1.j(w0Var, w0.Y);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.m = kVar2;
                w0Var.Q = jVar2;
                Context context = W != null ? W : org.telegram.messenger.w0.b;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new t0());
                w0Var.y = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                w0Var.y.setStylusScaleEnabled(false);
                w0Var.D = new m2.t(context, new u0(scaledTouchSlop));
                org.telegram.ui.Wallet.f6 f6Var = new org.telegram.ui.Wallet.f6(context, 1);
                f6Var.b = new Path();
                w0Var.e = f6Var;
                v0 v0Var = new v0(context);
                w0Var.d = v0Var;
                v0Var.addView(w0Var.e, w7.b6.c(-1.0f, -1));
                w0Var.e.setOutlineProvider(new bi.d2(24));
                w0Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Ug, w0Var.e, null);
                g9 g9Var = new g9(context);
                w0Var.n = g9Var;
                w0Var.e.addView(g9Var, w7.b6.c(-1.0f, -1));
                vh.s2 s2Var = new vh.s2(context, w0Var.x);
                w0Var.f = s2Var;
                s2Var.setAlpha(0.0f);
                w0Var.e.addView(w0Var.f, w7.b6.c(-1.0f, -1));
                bn bnVar = new bn(context, 25);
                w0Var.r = bnVar;
                w0Var.e.addView(bnVar, w7.b6.c(-1.0f, -1));
                FrameLayout frameLayout = new FrameLayout(context);
                w0Var.h = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                w0Var.h.addView(view, w7.b6.c(-1.0f, -1));
                int L = org.telegram.messenger.i0.L(8.0f);
                ImageView e = z20.e(context, R.drawable.pip_video_close);
                int i11 = org.telegram.ui.ActionBar.t6.Vg;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                org.telegram.ui.ActionBar.a7.t(e, i11, null, mode);
                int i12 = org.telegram.ui.ActionBar.t6.i6;
                e.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1));
                e.setPadding(L, L, L, L);
                e.setOnClickListener(new bh.c(25));
                float f7 = 38;
                float f10 = 4;
                w0Var.h.addView(e, w7.b6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.a7.t(imageView, i11, null, mode);
                imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1));
                imageView.setPadding(L, L, L, L);
                imageView.setOnClickListener(new rh.u1(4, s0Var, context));
                w0Var.h.addView(imageView, w7.b6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
                w0Var.e.addView(w0Var.h, w7.b6.c(-1.0f, -1));
                w0Var.b = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams b10 = mf.b.b(context, false);
                w0Var.c = b10;
                int i13 = w0Var.J;
                b10.width = i13;
                b10.height = w0Var.K;
                Point point = org.telegram.messenger.i0.q;
                float L2 = (point.x - i13) - org.telegram.messenger.i0.L(16.0f);
                w0Var.N = L2;
                b10.x = (int) L2;
                WindowManager.LayoutParams layoutParams = w0Var.c;
                float L3 = (point.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f);
                w0Var.O = L3;
                layoutParams.y = (int) L3;
                WindowManager.LayoutParams layoutParams2 = w0Var.c;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                w0Var.d.setAlpha(0.0f);
                w0Var.d.setScaleX(0.1f);
                w0Var.d.setScaleY(0.1f);
                org.telegram.messenger.i0.x3(w0Var.b, w0Var.d, w0Var.c);
                w0Var.b.addView(w0Var.d, w0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(gr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(w0Var.d, (Property<v0, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(w0Var.d, (Property<v0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(w0Var.d, (Property<v0, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new e00(1));
                animatorSet.start();
                w0Var.a();
                zs.e().k(zs.F2, new Object[0]);
                jf.f fVar = w0Var.L;
                if (fVar != null) {
                    fVar.c();
                    w0Var.L = null;
                }
                if (W != null && mf.b.a(W) == 1) {
                    jf.e eVar = new jf.e(W, w0Var);
                    eVar.c = "pip-live-story";
                    eVar.e = 1;
                    eVar.d = org.telegram.messenger.i0.L(10.0f);
                    eVar.j = w0Var.d;
                    eVar.k = w0Var.f.getPlaceholderView();
                    w0Var.L = eVar.a();
                }
            }
            D(true);
        }
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        vh.s2 s2Var = this.E0;
        if (s2Var != null) {
            s2Var.setOnFirstFrameCallback(oVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.b) {
            org.telegram.messenger.i0.E2(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    public final void c0() {
        boolean z10 = D1;
        D1 = !z10;
        n7 n7Var = this.z0;
        int i10 = 0;
        if (n7Var != null) {
            n7Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n7) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        z2 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.g1.a(D1, true);
        }
        if (D1) {
            return;
        }
        this.d1.b();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View d() {
        return this.s;
    }

    public final void d0() {
        if (this.n0 == null) {
            return;
        }
        boolean K = K();
        if (this.b) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f;
            if (k2Var.isPaused() || !k2Var.isLastFragment()) {
                K = true;
            }
        }
        if (org.telegram.ui.h4.v().V) {
            K = true;
        }
        this.n0.setPaused(K);
        n7 n7Var = this.z0;
        if (n7Var != null) {
            if (K) {
                n7Var.pause();
            } else {
                n7Var.play(B1);
            }
        }
        this.n0.D0 = (this.y || this.H0 || this.I0 || this.a1 || this.f1 || this.e0 != 0.0f || this.j1) ? false : true;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == zs.x5) {
            if (this.O0 == ((x4) objArr[0])) {
                H();
                e7 e7Var = this.n0;
                x4 x4Var = this.O0;
                e7Var.D(this.h, x4Var.d, x4Var.h());
                f4 f4Var = this.x;
                if (f4Var != null) {
                    TL_stories.StoryItem selectedStory = f4Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((jj) this.O0.i.get(i12)).l.id) {
                            i13 = i12;
                        }
                        arrayList.add(((jj) this.O0.i.get(i12)).l);
                        i12++;
                    }
                    this.x.b(i13, this.O0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == zs.v5) {
            k7 k7Var = this.t0;
            if (k7Var instanceof n5) {
                n5 n5Var = (n5) k7Var;
                if (!n5Var.r || n5Var.n) {
                    return;
                }
                e5 O1 = vp.r1(this.h).O1();
                ArrayList arrayList2 = n5Var.f ? O1.h : O1.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!n5Var.h || O1.L(o10)) && !dialogIds.contains(Long.valueOf(o10))) {
                        dialogIds.add(Long.valueOf(o10));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            f4 f4Var2 = this.x;
            if (f4Var2 != null) {
                ArrayList arrayList3 = f4Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((e3) arrayList3.get(i12)).b();
                    i12++;
                }
                return;
            }
            return;
        }
        int i15 = zs.c1;
        if (i10 != i15 && i10 != zs.d1) {
            if (i10 == zs.w5) {
                long longValue = ((Long) objArr[0]).longValue();
                int intValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.T0;
                if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                    this.S0 = true;
                    return;
                }
                return;
            }
            return;
        }
        d0();
        if (i10 != i15) {
            if (this.s1 || H() == null) {
                return;
            }
            H().d1(false);
            return;
        }
        n7 n7Var = this.z0;
        if (n7Var == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = n7Var.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.g2, android.content.DialogInterface
    public final void dismiss() {
        D(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int e(int i10) {
        return i0.b.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        int i10;
        TL_stories.StoryItem storyItem;
        x4 x4Var;
        long j10;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        l7 l7Var = this.s0;
        ImageReceiver imageReceiver = l7Var.b;
        if (imageReceiver != null) {
            imageReceiver.O0(true, true);
        }
        ImageReceiver imageReceiver2 = l7Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            l7Var.c.O0(true, true);
        }
        z2 currentPeerView = this.n0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.e1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i10 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.e1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.N0) {
                            storyItem = this.T0;
                        }
                        long currentDialogId = this.n0.getCurrentDialogId();
                        x4Var = this.O0;
                        if (!(x4Var instanceof r4) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(x4Var instanceof z4) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (x4Var != null) {
                            i10 = this.P0;
                        }
                        j10 = currentDialogId;
                        i11 = i10;
                        l7Var.a = null;
                        l7Var.m = null;
                        l7Var.b = null;
                        l7Var.c = null;
                        l7Var.e = null;
                        l7Var.f = null;
                        l7Var.g = null;
                        l7Var.d = null;
                        l7Var.l = null;
                        l7Var.h = 0.0f;
                        l7Var.i = 0.0f;
                        l7Var.o = 0;
                        l7Var.j = null;
                        l7Var.k = 1.0f;
                        if (!this.t0.v(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, l7Var)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        l7Var.o = i11;
                        View view = l7Var.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = l7Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = l7Var.a;
                        if (callback instanceof k5) {
                            this.M = (k5) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = l7Var.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.r() + f7;
                            this.O = l7Var.b.s() + iArr[1];
                            ImageReceiver imageReceiver4 = l7Var.b;
                            float f10 = imageReceiver4.M0;
                            this.R = f10;
                            this.S = imageReceiver4.N0;
                            t5 t5Var = l7Var.m;
                            if (t5Var != null) {
                                this.R = t5Var.b() * f10;
                                this.S = l7Var.m.b() * this.S;
                            }
                            if (l7Var.a.getParent() instanceof View) {
                                View view3 = (View) l7Var.a.getParent();
                                this.N = (view3.getScaleX() * l7Var.b.r()) + iArr[0];
                                this.O = (view3.getScaleY() * l7Var.b.s()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver5 = l7Var.c;
                            if (imageReceiver5 != null) {
                                this.N = imageReceiver5.r() + f7;
                                this.O = l7Var.c.s() + iArr[1];
                                ImageReceiver imageReceiver6 = l7Var.c;
                                this.R = imageReceiver6.M0;
                                this.S = imageReceiver6.N0;
                                this.W0 = imageReceiver6.W0;
                            }
                        }
                        l7Var.g.getLocationOnScreen(iArr);
                        float f11 = l7Var.h;
                        if (f11 == 0.0f && l7Var.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f12 = iArr[1];
                            this.P = f11 + f12;
                            this.Q = f12 + l7Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                x4Var = this.O0;
                if (!(x4Var instanceof r4)) {
                }
                if (!(x4Var instanceof z4)) {
                }
                if (x4Var != null) {
                }
                j10 = currentDialogId2;
                i11 = i10;
                l7Var.a = null;
                l7Var.m = null;
                l7Var.b = null;
                l7Var.c = null;
                l7Var.e = null;
                l7Var.f = null;
                l7Var.g = null;
                l7Var.d = null;
                l7Var.l = null;
                l7Var.h = 0.0f;
                l7Var.i = 0.0f;
                l7Var.o = 0;
                l7Var.j = null;
                l7Var.k = 1.0f;
                if (!this.t0.v(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, l7Var)) {
                }
            }
        }
        i10 = 0;
        if (currentPeerView != null) {
        }
        storyItem = null;
        if (storyItem == null) {
        }
        long currentDialogId22 = this.n0.getCurrentDialogId();
        x4Var = this.O0;
        if (!(x4Var instanceof r4)) {
        }
        if (!(x4Var instanceof z4)) {
        }
        if (x4Var != null) {
        }
        j10 = currentDialogId22;
        i11 = i10;
        l7Var.a = null;
        l7Var.m = null;
        l7Var.b = null;
        l7Var.c = null;
        l7Var.e = null;
        l7Var.f = null;
        l7Var.g = null;
        l7Var.d = null;
        l7Var.l = null;
        l7Var.h = 0.0f;
        l7Var.i = 0.0f;
        l7Var.o = 0;
        l7Var.j = null;
        l7Var.k = 1.0f;
        if (!this.t0.v(j10, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, l7Var)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean f() {
        return false;
    }

    @Override // lf.a
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        vh.s2 s2Var = this.E0;
        if (s2Var != null) {
            s2Var.setOnFirstFrameCallback(oVar);
        }
        if (this.b) {
            org.telegram.messenger.i0.E2(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        vh.s2 s2Var2 = this.E0;
        if (s2Var2 != null) {
            s2Var2.b();
            this.E0 = null;
        }
        this.s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void h(int i10) {
        if (this.p0 != i10) {
            this.p0 = i10;
            this.n0.setKeyboardHeight(i10);
            this.n0.requestLayout();
            f4 f4Var = this.x;
            if (f4Var != null) {
                f4Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // lf.a
    public final Bitmap i() {
        vh.s2 s2Var = this.E0;
        if (s2Var == null || !s2Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean j() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final /* synthetic */ cc k() {
        return null;
    }

    @Override // lf.a
    public final Bitmap m() {
        vh.s2 s2Var = this.D0;
        if (s2Var == null || !s2Var.a()) {
            return null;
        }
        return this.D0.getBitmap();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void p() {
        z2 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            e7 e7Var = this.n0;
            if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.q0();
            }
            if (z10) {
                return;
            }
            D(true);
            return;
        }
        f4 f4Var = this.x;
        if (f4Var.y > 0) {
            org.telegram.messenger.i0.v1(f4Var);
            return;
        }
        y3 currentPage = f4Var.getCurrentPage();
        if (currentPage != null) {
            g3 g3Var = currentPage.r;
            o3 o3Var = currentPage.f;
            if (o3Var != null && o3Var.a) {
                o3Var.a();
                return;
            } else if (Math.abs(currentPage.c.getTranslationY() - g3Var.getPaddingTop()) > org.telegram.messenger.i0.L(2.0f)) {
                g3Var.dispatchTouchEvent(org.telegram.messenger.i0.R());
                g3Var.y0(0);
                return;
            }
        }
        A(false);
    }

    @Override // lf.a
    public final boolean q() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f;
        return (k2Var == null || H() == null || org.telegram.messenger.i0.W(k2Var.getContext()) == null || this.A0 == null || this.D0 == null || this.H0) ? false : true;
    }

    @Override // lf.a
    public final View r() {
        vh.s2 s2Var = new vh.s2(this.D0.getContext(), this.h);
        this.E0 = s2Var;
        return s2Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean s() {
        return !this.H0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean t(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new ag.x(this, 15));
            dialog.show();
            d0();
            return true;
        } catch (Throwable th2) {
            f8.g(th2, true);
            this.u0 = null;
            return false;
        }
    }

    public final void x(boolean z10) {
        boolean z11 = org.telegram.messenger.v2.a;
        boolean z12 = !this.m0 || z10;
        if (this.e != z12) {
            this.e = z12;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z12);
            }
            vh.s2 s2Var = this.D0;
            if (s2Var != null) {
                s2Var.setSecure(!z12);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.k2 k2Var = this.f;
                if (k2Var.getParentActivity() != null) {
                    if (z12) {
                        k2Var.getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                        org.telegram.messenger.i0.h2();
                        return;
                    } else {
                        k2Var.getParentActivity().getWindow().addFlags(TLObject.FLAG_13);
                        org.telegram.messenger.i0.h2();
                        return;
                    }
                }
                return;
            }
            if (z12) {
                this.r.flags &= -8193;
                org.telegram.messenger.i0.h2();
            } else {
                this.r.flags |= TLObject.FLAG_13;
                org.telegram.messenger.i0.h2();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void y() {
        if (this.H == null) {
            this.j0 = false;
            this.l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new w6(this, 2));
            this.H.addListener(new x6(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.m1.w);
            this.H.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean z() {
        return this.b && this.s != null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final /* synthetic */ void b(boolean z10) {
    }

    @Override // lf.a
    public final /* synthetic */ void l(Canvas canvas) {
    }

    @Override // lf.a
    public final /* synthetic */ void n(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void o(Runnable runnable) {
    }
}
