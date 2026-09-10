package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hn0;
import org.telegram.ui.iw0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u7 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.l2, rf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public t0 A0;
    public m7 B0;
    public SurfaceView C0;
    public bi.f5 D0;
    public boolean E;
    public bi.f5 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public k2.v G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public final AnimationNotificationsLocker J0;
    public float K;
    public boolean K0;
    public float L;
    public boolean L0;
    public p5 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public a5 O0;
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
    public final j2 b1;
    public boolean c0;
    public boolean c1;
    public float d0;
    public g6 d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final org.telegram.ui.ActionBar.p2 f;
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
    public k7 n0;
    public k5 n1;
    public j2 o1;
    public int p0;
    public boolean p1;
    public boolean q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public float r0;
    public boolean r1;
    public i7 s;
    public final r7 s0;
    public boolean s1;
    public q7 t0;
    public long t1;
    public Dialog u0;
    public n5 u1;
    public j7 v;
    public org.telegram.ui.ActionBar.l2 v0;
    public ValueAnimator v1;
    public g4 w;
    public boolean w0;
    public boolean w1;
    public boolean x;
    public final ArrayList x0;
    public org.telegram.ui.m4 y0;
    public t7 z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = SharedConfig.useSurfaceInStories;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final b y = new b();
    public final RectF T = new RectF();
    public final float[] o0 = new float[2];

    public u7(org.telegram.ui.ActionBar.p2 p2Var) {
        r7 r7Var = new r7();
        r7Var.k = 1.0f;
        this.s0 = r7Var;
        this.x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new j2(this, 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = p2Var;
    }

    public static void J(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 == 0 || storyItem == null) {
            return;
        }
        E1.put(j3 + (j3 >> 16) + (storyItem.id << 16), editable);
    }

    public static boolean i(u7 u7Var, i7 i7Var, float f7, float f10, boolean z10) {
        t1 t1Var;
        t1 t1Var2;
        if (i7Var == null) {
            return false;
        }
        if (u7Var.X0) {
            return true;
        }
        if (u7Var.w != null && u7Var.e0 != 0.0f) {
            return true;
        }
        a3 currentPeerView = u7Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.G0(currentPeerView, ((f7 - u7Var.v.getX()) - u7Var.n0.getX()) - currentPeerView.getX(), ((f10 - u7Var.v.getY()) - u7Var.n0.getY()) - currentPeerView.getY(), z10)) {
                return true;
            }
            if (currentPeerView.v2) {
                return false;
            }
        }
        if (z10) {
            return false;
        }
        if (currentPeerView != null && (t1Var2 = currentPeerView.b2) != null && t1Var2.getVisibility() == 0) {
            if (f10 > currentPeerView.b2.getY() + currentPeerView.getY() + u7Var.n0.getY() + u7Var.v.getY()) {
                return true;
            }
        }
        if ((currentPeerView == null || (t1Var = currentPeerView.b2) == null || !t1Var.w0()) && u7Var.u1 == null) {
            return AndroidUtilities.findClickableView(i7Var, f7, f10, currentPeerView);
        }
        return true;
    }

    public static void j(u7 u7Var) {
        hn0 hn0Var;
        fu editField;
        a3 currentPeerView = u7Var.n0.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.b2 == null || (((hn0Var = currentPeerView.b3) != null && hn0Var.getVisibility() == 0) || (editField = currentPeerView.b2.getEditField()) == null)) {
            u7Var.m();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new j2(u7Var, 6), 200L);
    }

    public static void k(u7 u7Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(u7Var.X, u7Var.W) / AndroidUtilities.dp(80.0f)));
        if (u7Var.V != clamp01) {
            u7Var.V = clamp01;
            u7Var.o();
            a3 currentPeerView = u7Var.n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.x2) {
                currentPeerView.invalidate();
            }
            t0 t0Var = u7Var.A0;
            if (t0Var != null) {
                t0Var.v((1.0f - u7Var.V) * u7Var.U);
            }
        }
        i7 i7Var = u7Var.s;
        if (i7Var != null) {
            i7Var.invalidate();
        }
    }

    public static CharSequence u(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        return z1 != null && (messageObject.type == 23 || messageObject.isWebpage()) && !A1 && z1.messageId == messageObject.getId() && z1.messageType != 3;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, a5 a5Var, TL_stories.PeerStories peerStories, q7 q7Var, boolean z10) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.x0;
        if (!isContextSafe) {
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
        t7 t7Var = this.z0;
        if (t7Var != null) {
            t7Var.setSpeed(1.0f);
        }
        boolean z11 = (AndroidUtilities.isTablet() || this.r1) ? false : true;
        this.b = z11;
        this.a = SharedConfig.useSurfaceInStories && z11;
        this.U0 = storyItem == null ? 0 : storyItem.messageId;
        this.N0 = storyItem != null && a5Var == null && peerStories == null;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = a5Var;
        this.Q0 = peerStories;
        this.t0 = q7Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        k7 k7Var = this.n0;
        if (k7Var != null) {
            k7Var.setHorizontalProgressToDismiss(0.0f);
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
        AndroidUtilities.cancelRunOnUIThread(this.b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.r.flags = -2147417728;
        this.H0 = false;
        this.c1 = false;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (this.s == null) {
            this.i0 = new GestureDetector(new e7(this));
            this.s = new i7(this, context, R);
        }
        if (this.v == null) {
            this.v = new j7(context, this);
            k7 k7Var2 = new k7(this, this.h, context, this, this.y);
            this.n0 = k7Var2;
            k7Var2.setDelegate(new l7(this, a5Var, arrayList, context));
            this.v.addView(this.n0, w7.a6.e(-1, -1, 1));
            this.y0 = new org.telegram.ui.m4(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.y0.addView(this.C0);
            } else {
                m7 m7Var = new m7(context, this);
                this.B0 = m7Var;
                this.y0.addView(m7Var);
            }
            bi.f5 f5Var = new bi.f5(context, this.h);
            this.D0 = f5Var;
            f5Var.setVisibility(8);
            this.y0.addView(this.D0);
            g6 g6Var = new g6(context);
            Paint paint = new Paint(1);
            g6Var.a = paint;
            g6Var.c = new sg.a1(g6Var, 12);
            g6Var.d = new org.telegram.ui.Components.d6(g6Var);
            g6Var.e = new org.telegram.ui.Components.d6(g6Var);
            paint.setColor(-1);
            this.d1 = g6Var;
            this.v.addView(g6Var, w7.a6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        bi.f5 f5Var2 = this.D0;
        if (f5Var2 != null) {
            f5Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.y0);
        this.s.addView(this.y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.s.addView(this.v);
        this.s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (a5Var != null) {
            this.n0.D(this.h, a5Var.d, a5Var.h());
        } else {
            k7 k7Var3 = this.n0;
            int i12 = this.h;
            k7Var3.A0 = arrayList;
            k7Var3.y0 = i12;
            k7Var3.setAdapter(null);
            k7Var3.setAdapter(k7Var3.z0);
            k7Var3.setCurrentItem(i11);
            k7Var3.C0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.b = false;
        }
        this.c = this.b && R != null && R.isSupportEdgeToEdge();
        j7 j7Var = this.v;
        th.e eVar = new th.e(this, 27);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(j7Var, eVar);
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.s);
            if (!this.c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 4));
            }
        }
        this.s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        x1 = true;
        if (C1) {
            C1 = false;
            D1 = ((AudioManager) this.s.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() != 2;
        }
        if (this.b) {
            z(true);
        }
        if (!this.b) {
            y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, q7 q7Var) {
        if (storyItem == null) {
            return;
        }
        this.h = i10;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                A(i10, context, storyItem, arrayList, 0, null, null, q7Var, false);
            }
        }
    }

    public final void C(Context context, int i10, a5 a5Var, s5 s5Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(a5Var.d));
        this.P0 = i10;
        F(context, null, arrayList, 0, a5Var, null, s5Var, false);
    }

    public final void D(Context context, long j3, q7 q7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        i5 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (a6.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j3)) {
                storiesController.g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        F(context, null, arrayList, 0, null, null, q7Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, q7 q7Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.x0.clear();
            return;
        }
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        F(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, q7Var, false);
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, a5 a5Var, TL_stories.PeerStories peerStories, q7 q7Var, boolean z10) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, a5Var, peerStories, q7Var, z10);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, s5 s5Var) {
        B(UserConfig.selectedAccount, context, storyItem, s5Var);
    }

    public final void H(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.b) {
            R.presentFragment(p2Var);
        } else {
            R.presentFragment(p2Var);
            q(false);
        }
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        t7 t7Var = this.z0;
        if (t7Var != null) {
            t7Var.release(null);
            this.z0 = null;
        }
        bi.f5 f5Var = this.D0;
        if (f5Var != null) {
            f5Var.d(0L, null);
        }
        t0 t0Var = this.A0;
        if (t0Var != null) {
            x0 x0Var = x0.Z;
            if (!x0Var.S || x0Var.v != t0Var) {
                if (t0Var.n) {
                    t0Var.s(null);
                } else {
                    t0Var.e();
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
            ((t7) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((d8) iVar.n(i11)).b(false);
        }
        if (this.b) {
            z(false);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f;
        if (p2Var != null) {
            p2Var.removeSheet(this);
        }
        y1.remove(this);
        this.x0.clear();
        this.e0 = 0.0f;
        z1 = null;
    }

    public final void K(boolean z10) {
        this.q0 = z10;
        if (z10) {
            sg.a1 a1Var = this.d1.c;
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            a1Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        a3 currentPeerView;
        a3 currentPeerView2;
        z2 z2Var;
        t7 t7Var;
        k2.v vVar;
        if (this.a1 != z10) {
            this.a1 = z10;
            if (z10 && !this.f1 && (currentPeerView2 = this.n0.getCurrentPeerView()) != null && (z2Var = currentPeerView2.O1) != null && !z2Var.f && z2Var.b == null) {
                if (!this.k0 && !this.j0 && (vVar = this.G0) != null && ((t7) vVar.c) != null) {
                    currentPeerView2.c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                k2.v vVar2 = this.G0;
                if (vVar2 != null && (t7Var = (t7) vVar2.c) != null && !this.k0) {
                    t7Var.setSeeking(true);
                }
                this.k0 = true;
            }
            P();
            k7 k7Var = this.n0;
            if (k7Var == null || (currentPeerView = k7Var.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.a1);
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (!this.b || launchActivity == null) {
            return;
        }
        if (z10) {
            this.w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
        }
        if (this.w0) {
            AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.A0 == null || (p2Var = this.f) == null || this.D0 == null) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(p2Var.getContext());
        if (sf.c.a(findActivity) > 0) {
            x0.o(findActivity, this.A0);
            q(true);
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        t7 t7Var = this.z0;
        int i10 = 0;
        if (t7Var != null) {
            t7Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((t7) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        a3 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.x1.a(D1, true);
        }
        if (D1) {
            return;
        }
        this.d1.b();
    }

    public final void P() {
        if (this.n0 == null) {
            return;
        }
        boolean w10 = w();
        if (this.b) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f;
            if (p2Var.isPaused() || !p2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.j4.x().V) {
            w10 = true;
        }
        this.n0.setPaused(w10);
        t7 t7Var = this.z0;
        if (t7Var != null) {
            if (w10) {
                t7Var.pause();
            } else {
                t7Var.play(B1);
            }
        }
        this.n0.D0 = (this.x || this.H0 || this.I0 || this.a1 || this.f1 || this.e0 != 0.0f || this.j1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i10;
        TL_stories.StoryItem storyItem;
        a5 a5Var;
        long j3;
        int i11;
        if (this.t0 == null) {
            this.V0 = false;
            this.O = 0.0f;
            this.N = 0.0f;
            return;
        }
        r7 r7Var = this.s0;
        ImageReceiver imageReceiver = r7Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = r7Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            r7Var.c.setVisible(true, true);
        }
        a3 currentPeerView = this.n0.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView != null) {
            ArrayList arrayList = currentPeerView.v1;
            if (selectedPosition >= 0 && selectedPosition < arrayList.size()) {
                i10 = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
                if (currentPeerView != null) {
                    ArrayList arrayList2 = currentPeerView.v1;
                    if (selectedPosition >= 0 && selectedPosition < arrayList2.size()) {
                        storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
                        if (storyItem == null && this.N0) {
                            storyItem = this.T0;
                        }
                        long currentDialogId = this.n0.getCurrentDialogId();
                        a5Var = this.O0;
                        if (!(a5Var instanceof u4) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.messageId;
                        } else if (!(a5Var instanceof c5) && storyItem != null) {
                            currentDialogId = storyItem.dialogId;
                            i10 = storyItem.id;
                        } else if (a5Var != null) {
                            i10 = this.P0;
                        }
                        j3 = currentDialogId;
                        i11 = i10;
                        r7Var.a = null;
                        r7Var.m = null;
                        r7Var.b = null;
                        r7Var.c = null;
                        r7Var.e = null;
                        r7Var.f = null;
                        r7Var.g = null;
                        r7Var.d = null;
                        r7Var.l = null;
                        r7Var.h = 0.0f;
                        r7Var.i = 0.0f;
                        r7Var.o = 0;
                        r7Var.j = null;
                        r7Var.k = 1.0f;
                        if (!this.t0.y0(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, r7Var)) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        r7Var.o = i11;
                        View view = r7Var.a;
                        if (view == null) {
                            this.V0 = false;
                            this.O = 0.0f;
                            this.N = 0.0f;
                            return;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        View view2 = r7Var.a;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            iArr[1] = view2.getPaddingTop() + iArr[1];
                        }
                        float f7 = iArr[0];
                        this.K = f7;
                        this.L = iArr[1];
                        KeyEvent.Callback callback = r7Var.a;
                        if (callback instanceof p5) {
                            this.M = (p5) callback;
                        } else {
                            this.M = null;
                        }
                        this.V0 = false;
                        ImageReceiver imageReceiver3 = r7Var.b;
                        if (imageReceiver3 != null) {
                            this.N = imageReceiver3.getCenterX() + f7;
                            this.O = r7Var.b.getCenterY() + iArr[1];
                            this.R = r7Var.b.getImageWidth();
                            this.S = r7Var.b.getImageHeight();
                            x5 x5Var = r7Var.m;
                            if (x5Var != null) {
                                this.R = x5Var.b() * this.R;
                                this.S = r7Var.m.b() * this.S;
                            }
                            if (r7Var.a.getParent() instanceof View) {
                                View view3 = (View) r7Var.a.getParent();
                                this.N = (view3.getScaleX() * r7Var.b.getCenterX()) + iArr[0];
                                this.O = (view3.getScaleY() * r7Var.b.getCenterY()) + iArr[1];
                                this.R = view3.getScaleX() * this.R;
                                this.S = view3.getScaleY() * this.S;
                            }
                            this.V0 = true;
                        } else {
                            ImageReceiver imageReceiver4 = r7Var.c;
                            if (imageReceiver4 != null) {
                                this.N = imageReceiver4.getCenterX() + f7;
                                this.O = r7Var.c.getCenterY() + iArr[1];
                                this.R = r7Var.c.getImageWidth();
                                this.S = r7Var.c.getImageHeight();
                                this.W0 = r7Var.c.getRoundRadius();
                            }
                        }
                        r7Var.g.getLocationOnScreen(iArr);
                        float f10 = r7Var.h;
                        if (f10 == 0.0f && r7Var.i == 0.0f) {
                            this.P = 0.0f;
                            this.Q = 0.0f;
                            return;
                        } else {
                            float f11 = iArr[1];
                            this.P = f10 + f11;
                            this.Q = f11 + r7Var.i;
                            return;
                        }
                    }
                }
                storyItem = null;
                if (storyItem == null) {
                    storyItem = this.T0;
                }
                long currentDialogId2 = this.n0.getCurrentDialogId();
                a5Var = this.O0;
                if (!(a5Var instanceof u4)) {
                }
                if (!(a5Var instanceof c5)) {
                }
                if (a5Var != null) {
                }
                j3 = currentDialogId2;
                i11 = i10;
                r7Var.a = null;
                r7Var.m = null;
                r7Var.b = null;
                r7Var.c = null;
                r7Var.e = null;
                r7Var.f = null;
                r7Var.g = null;
                r7Var.d = null;
                r7Var.l = null;
                r7Var.h = 0.0f;
                r7Var.i = 0.0f;
                r7Var.o = 0;
                r7Var.j = null;
                r7Var.k = 1.0f;
                if (!this.t0.y0(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, r7Var)) {
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
        a5Var = this.O0;
        if (!(a5Var instanceof u4)) {
        }
        if (!(a5Var instanceof c5)) {
        }
        if (a5Var != null) {
        }
        j3 = currentDialogId22;
        i11 = i10;
        r7Var.a = null;
        r7Var.m = null;
        r7Var.b = null;
        r7Var.c = null;
        r7Var.e = null;
        r7Var.f = null;
        r7Var.g = null;
        r7Var.d = null;
        r7Var.l = null;
        r7Var.h = 0.0f;
        r7Var.i = 0.0f;
        r7Var.o = 0;
        r7Var.j = null;
        r7Var.k = 1.0f;
        if (!this.t0.y0(j3, this.U0, i11, storyItem == null ? -1 : storyItem.messageType, r7Var)) {
        }
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        bi.f5 f5Var = this.E0;
        if (f5Var != null) {
            f5Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
        } else {
            this.n.removeView(this.s);
        }
        this.s.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean attachedToParent() {
        return this.b && this.s != null;
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        bi.f5 f5Var = this.E0;
        if (f5Var != null) {
            f5Var.setOnFirstFrameCallback(pVar);
        }
        if (this.b) {
            AndroidUtilities.removeFromParent(this.s);
            this.f.getLayoutContainer().addView(this.s);
        } else {
            this.n.addView(this.s, this.r);
        }
        bi.f5 f5Var2 = this.E0;
        if (f5Var2 != null) {
            f5Var2.b();
            this.E0 = null;
        }
        this.s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override // rf.a
    public final Bitmap c() {
        bi.f5 f5Var = this.E0;
        if (f5Var == null || !f5Var.a()) {
            return null;
        }
        return this.E0.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((a5) objArr[0])) {
                t();
                k7 k7Var = this.n0;
                a5 a5Var = this.O0;
                k7Var.D(this.h, a5Var.d, a5Var.h());
                g4 g4Var = this.w;
                if (g4Var != null) {
                    TL_stories.StoryItem selectedStory = g4Var.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((MessageObject) this.O0.i.get(i12)).storyItem.id) {
                            i13 = i12;
                        }
                        arrayList.add(((MessageObject) this.O0.i.get(i12)).storyItem);
                        i12++;
                    }
                    this.w.b(i13, this.O0.d, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            q7 q7Var = this.t0;
            if (q7Var instanceof s5) {
                s5 s5Var = (s5) q7Var;
                if (!s5Var.r || s5Var.n) {
                    return;
                }
                i5 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                ArrayList arrayList2 = s5Var.f ? storiesController.h : storiesController.g;
                ArrayList<Long> dialogIds = this.n0.getDialogIds();
                boolean z10 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i14)).peer);
                    if ((!s5Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z10 = true;
                    }
                }
                if (z10) {
                    this.n0.getAdapter().g();
                }
            }
            g4 g4Var2 = this.w;
            if (g4Var2 != null) {
                ArrayList arrayList3 = g4Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((f3) arrayList3.get(i12)).b();
                    i12++;
                }
                return;
            }
            return;
        }
        int i15 = NotificationCenter.openArticle;
        if (i10 != i15 && i10 != NotificationCenter.articleClosed) {
            if (i10 == NotificationCenter.storyDeleted) {
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
        P();
        if (i10 != i15) {
            if (this.s1 || t() == null) {
                return;
            }
            t().f1(false);
            return;
        }
        t7 t7Var = this.z0;
        if (t7Var == null) {
            this.t1 = 0L;
            return;
        }
        this.t1 = t7Var.currentPosition;
        this.z0.release(null);
        this.z0 = null;
    }

    @Override // org.telegram.ui.ActionBar.l2, android.content.DialogInterface
    public final void dismiss() {
        q(true);
    }

    @Override // rf.a
    public final Bitmap e() {
        bi.f5 f5Var = this.D0;
        if (f5Var == null || !f5Var.a()) {
            return null;
        }
        return this.D0.getBitmap();
    }

    @Override // rf.a
    public final boolean g() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f;
        return (p2Var == null || t() == null || AndroidUtilities.findActivity(p2Var.getContext()) == null || this.A0 == null || this.D0 == null || this.H0) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final /* synthetic */ wc getBulletinFactory() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final View getWindowView() {
        return this.s;
    }

    @Override // rf.a
    public final View h() {
        bi.f5 f5Var = new bi.f5(this.D0.getContext(), this.h);
        this.E0 = f5Var;
        return f5Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isFullyVisible() {
        return this.K0;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isShown() {
        return !this.H0;
    }

    public final void l(boolean z10) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        boolean z11 = !this.m0 || z10;
        if (this.e != z11) {
            this.e = z11;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            bi.f5 f5Var = this.D0;
            if (f5Var != null) {
                f5Var.setSecure(!z11);
            }
            if (this.b) {
                org.telegram.ui.ActionBar.p2 p2Var = this.f;
                if (p2Var.getParentActivity() != null) {
                    if (z11) {
                        p2Var.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        p2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                }
                return;
            }
            if (z11) {
                this.r.flags &= -8193;
                AndroidUtilities.logFlagSecure();
            } else {
                this.r.flags |= 8192;
                AndroidUtilities.logFlagSecure();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.j0 = false;
            this.l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new c7(this, 2));
            this.H.addListener(new d7(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.v1 != null) {
            return;
        }
        if (this.p0 != 0) {
            AndroidUtilities.hideKeyboard(this.w);
            return;
        }
        if (this.c0 || this.e0 != 0.0f) {
            this.J0.lock();
            if (!z10) {
                float f7 = this.e0;
                g4 g4Var = this.w;
                float f10 = g4Var.c;
                if (f7 == f10) {
                    float f11 = f10 - 1.0f;
                    this.e0 = f11;
                    g4Var.setOffset(f11);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z10 ? this.w.c : 0.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new c7(this, 3));
            this.v1.addListener(new iw0(17, this, z10));
            if (z10) {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(wr.h);
            } else {
                this.v1.setDuration(350L);
                this.v1.setInterpolator(wr.f);
            }
            this.v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (!this.b || (launchActivity = LaunchActivity.G1) == null) {
            return;
        }
        launchActivity.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean onAttachedBackPressed() {
        a3 currentPeerView;
        boolean z10 = false;
        if (this.e0 == 0.0f) {
            k7 k7Var = this.n0;
            if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null) {
                z10 = currentPeerView.s0();
            }
            if (z10) {
                return true;
            }
            q(true);
            return true;
        }
        g4 g4Var = this.w;
        if (g4Var.x > 0) {
            AndroidUtilities.hideKeyboard(g4Var);
            return true;
        }
        z3 currentPage = g4Var.getCurrentPage();
        if (currentPage != null) {
            h3 h3Var = currentPage.r;
            p3 p3Var = currentPage.f;
            if (p3Var != null && p3Var.b) {
                p3Var.a();
                return true;
            }
            if (Math.abs(currentPage.c.getTranslationY() - h3Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                h3Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                h3Var.x0(0);
                return true;
            }
        }
        n(false);
        return true;
    }

    public final void p() {
        if (this.w == null) {
            g4 g4Var = new g4(this.v.getContext(), this);
            this.w = g4Var;
            this.v.addView(g4Var, 0);
        }
        a3 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 == null) {
                this.w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.O0.i.size(); i10++) {
                arrayList.add(((MessageObject) this.O0.i.get(i10)).storyItem);
            }
            this.w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.s);
        this.H0 = true;
        this.h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new c7(this, 0));
        if (z10) {
            y();
        } else {
            this.O = 0.0f;
            this.N = 0.0f;
            r7 r7Var = this.s0;
            ImageReceiver imageReceiver = r7Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = r7Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            r7Var.c = null;
            r7Var.b = null;
        }
        AndroidUtilities.runOnUIThread(new j2(this, 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        a3 currentPeerView = this.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            z2 z2Var = currentPeerView.O1;
            if (!z2Var.j() && z2Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.x0.add(runnable);
        }
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.p0 != i10) {
            this.p0 = i10;
            this.n0.setKeyboardHeight(i10);
            this.n0.requestLayout();
            g4 g4Var = this.w;
            if (g4Var != null) {
                g4Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean showDialog(Dialog dialog) {
        try {
            this.u0 = dialog;
            dialog.setOnDismissListener(new gg.o(this, 14));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.u0 = null;
            return false;
        }
    }

    public final a3 t() {
        k7 k7Var = this.n0;
        if (k7Var == null) {
            return null;
        }
        return k7Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            r7 r7Var = this.s0;
            ImageReceiver imageReceiver = r7Var.b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = r7Var.c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            r7Var.c = null;
            r7Var.b = null;
            j7 j7Var = this.v;
            if (j7Var != null) {
                j7Var.a(true);
            }
            this.J0.unlock();
            k2.v vVar = this.G0;
            if (vVar != null) {
                vVar.b();
            }
            I();
            if (this.b) {
                AndroidUtilities.removeFromParent(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            this.m0 = false;
            this.d = false;
            o();
            j2 j2Var = this.o1;
            if (j2Var != null) {
                j2Var.run();
                this.o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.X0 || this.Z0 || this.Y0 || this.L0 || this.q0 || this.x || this.u0 != null || this.v0 != null || this.H0 || this.I0 || this.U != 1.0f || this.e0 != 0.0f || this.i1) {
            return true;
        }
        if ((this.l1 && this.a) || this.k1 || this.j1 || this.p1 || this.V != 0.0f || this.u1 != null) {
            return true;
        }
        return (!this.b || (p2Var = this.f) == null || p2Var.getLastStoryViewer() == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TL_stories.StoryItem storyItem;
        a3 currentPeerView;
        int selectedPosition;
        this.d = true;
        r7 r7Var = this.s0;
        ImageReceiver imageReceiver = r7Var.b;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = r7Var.c;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            r7Var.c.setVisible(true, true);
        }
        if (this.O0 != null && (currentPeerView = this.n0.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.O0.i.size()) {
            this.U0 = ((MessageObject) this.O0.i.get(selectedPosition)).getId();
        }
        if (this.t0 != null) {
            long currentDialogId = this.n0.getCurrentDialogId();
            int i10 = this.U0;
            if (this.O0 instanceof c5) {
                a3 currentPeerView2 = this.n0.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                if (currentPeerView2 != null) {
                    ArrayList arrayList = currentPeerView2.v1;
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
            this.t0.H0(currentDialogId, i10, new j2(this, 5));
        }
    }

    public final void z(boolean z10) {
        Activity findActivity = AndroidUtilities.findActivity(this.f.getContext());
        if (findActivity != null) {
            try {
                findActivity.setRequestedOrientation(z10 ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z10) {
                findActivity.getWindow().addFlags(128);
            } else {
                findActivity.getWindow().clearFlags(128);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z10) {
        q(true);
    }

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
    }
}
