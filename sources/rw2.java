// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rw2 {
    public static TextPaint f0;
    public static volatile rw2 g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public qx7 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public nk8 O;
    public d21 P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final nw2 U;
    public int V;
    public TLRPC.Document W;
    public k7a X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public vnb c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public gp6 j;
    public n8 k;
    public pw2 l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final nz4 s;
    public final ll0 t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public zc y;
    public tt z;
    public float e = 0.0f;
    public mq5 q = mq5.e;

    public rw2() {
        nz4 nz4Var = new nz4();
        this.s = nz4Var;
        this.t = new ll0(nz4Var, nz4Var, nz4Var);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = hl.L(200.0f);
        this.N = new Paint(1);
        this.U = new nw2(this);
    }

    public static rw2 e() {
        rw2 rw2Var;
        rw2 rw2Var2 = g0;
        if (rw2Var2 != null) {
            return rw2Var2;
        }
        synchronized (PhotoViewer.class) {
            rw2Var = g0;
            if (rw2Var == null) {
                rw2Var = new rw2();
                g0 = rw2Var;
            }
        }
        return rw2Var;
    }

    public final boolean a(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f;
        int i;
        float f2;
        int i2;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        r59 r59Var;
        String str2;
        r59 r59Var2;
        pw2 pw2Var = this.l;
        if (pw2Var == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = pw2Var.d();
        TLRPC.PollAnswer g = this.l.g();
        if (d == null || d.poll == null || g == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = r47.E1(d, g.option);
        boolean z = E1 != null && E1.voters > 0 && r47.A(d);
        boolean z2 = (r47.V4(d) || d.poll.closed || this.l.c()) ? false : true;
        boolean z3 = !z2 && r47.D(d);
        if (z) {
            r59 r59Var3 = new r59(this.r, this.c0, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
            fu5 fu5Var = new fu5(actionBarPopupWindow$ActionBarPopupWindowLayout, this.c0);
            View view = fu5Var.B;
            int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i3 = aob.E8;
            fu5Var.U(aob.p1(0.06f, aob.v0(i3, this.c0)));
            ol0 k = dtd.k(this.c0);
            if (view != null) {
                r59Var = r59Var3;
                str2 = null;
                jl0 c = this.t.c(view, null, true);
                c.p(k);
                view.setBackground(c);
            } else {
                r59Var = r59Var3;
                str2 = null;
            }
            fu5Var.b(R.drawable.ic_ab_back, ob6.M0(2131753749, str2), new fw2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0), false);
            fu5Var.j();
            r47 x = this.l.x();
            Activity activity = this.w;
            if ((activity instanceof LaunchActivity) && x != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                e lastFragment = (launchActivity.N() == null || launchActivity.N().getLastFragment() == null) ? null : launchActivity.N().getLastFragment();
                if (lastFragment != null) {
                    q9c a = r59Var.a(lastFragment, r47.B0(x.k), x.e1(), g.option, E1.voters, new rx1((Object) this, (Object) lastFragment, (byte) 11));
                    r59Var2 = r59Var;
                    fu5Var.p(a);
                    r59Var2.setText(ob6.G(E1.voters, "PollVotesCount", new Object[0]));
                    r59Var2.a.d(E1.recent_voters, false);
                    r59Var2.setLayoutParams(tre.o(-1, 48));
                    int i4 = aob.I5;
                    hf0 Y = aob.Y(aob.v0(i4, this.c0), 12, 0);
                    uob M = yob.M(i4);
                    vnb vnbVar = this.c0;
                    r59Var2.setBackground(Y);
                    yob.j(r59Var2, Y, null, M, vnbVar);
                    r59Var2.setOnClickListener(new w0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(r59Var2);
                    View k8Var = new k8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                    k8Var.setTag(R.id.fit_width_tag, 1);
                    f = 0.06f;
                    yob.i(k8Var, yob.K(0.06f, i3), this.c0);
                    i = -1;
                    k8Var.setLayoutParams(tre.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k8Var);
                }
            }
            r59Var2 = r59Var;
            r59Var2.setText(ob6.G(E1.voters, "PollVotesCount", new Object[0]));
            r59Var2.a.d(E1.recent_voters, false);
            r59Var2.setLayoutParams(tre.o(-1, 48));
            int i42 = aob.I5;
            hf0 Y2 = aob.Y(aob.v0(i42, this.c0), 12, 0);
            uob M2 = yob.M(i42);
            vnb vnbVar2 = this.c0;
            r59Var2.setBackground(Y2);
            yob.j(r59Var2, Y2, null, M2, vnbVar2);
            r59Var2.setOnClickListener(new w0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(r59Var2);
            View k8Var2 = new k8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
            k8Var2.setTag(R.id.fit_width_tag, 1);
            f = 0.06f;
            yob.i(k8Var2, yob.K(0.06f, i3), this.c0);
            i = -1;
            k8Var2.setLayoutParams(tre.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k8Var2);
        } else {
            f = 0.06f;
            i = -1;
        }
        if (z2) {
            i2 = i;
            str = null;
            f2 = f;
            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, ob6.M0(2131746883, null), false, this.c0).setOnClickListener(new ew2(this, (byte) 2));
        } else {
            f2 = f;
            i2 = i;
            str = null;
        }
        if (z3) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, ob6.M0(2131743479, str), false, this.c0).setOnClickListener(new ew2(this, (byte) 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z && (z2 || z3)) {
            View k8Var3 = new k8(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), this.c0);
            k8Var3.setTag(R.id.fit_width_tag, 1);
            yob.i(k8Var3, yob.K(f2, aob.E8), this.c0);
            k8Var3.setLayoutParams(tre.o(i2, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(k8Var3);
        }
        return z || z2 || z3;
    }

    public final void b() {
        if (this.w == null || this.K) {
            return;
        }
        hl.r(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        hl.d3(new cw2(this, (byte) 0), 200L);
        nk8 nk8Var = this.O;
        if (nk8Var != null) {
            nk8Var.animate().alpha(0.0f).translationY(hl.L(56.0f)).setDuration(150L).setInterpolator(k43.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(k43.f).start();
        }
        jn7.e().k(jn7.k1, 8);
    }

    public final void c() {
        e53 reactionsWindow;
        d21 d21Var = this.P;
        if (d21Var != null && (reactionsWindow = d21Var.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        d();
        b();
    }

    public final void d() {
        n8 n8Var = this.k;
        if (n8Var != null) {
            n8Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            ik8.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(hl.L(-12.0f)), k43.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                b();
            }
        }
    }

    public final /* synthetic */ void f(Bitmap bitmap, Bitmap bitmap2) {
        this.A.v0(true, false);
        this.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = this.N;
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        nz4 nz4Var = this.s;
        nz4Var.a(bitmap2);
        uk0.c(nz4Var, this.y);
        this.t.d();
        this.e0 = false;
        tt ttVar = this.z;
        if (ttVar != null) {
            ttVar.invalidate();
        }
    }

    public final boolean g(MotionEvent motionEvent, d79 d79Var, pw2 pw2Var, vnb vnbVar) {
        int i;
        this.l = pw2Var;
        if (pw2Var != null) {
            this.m = pw2Var.i();
            this.n = this.l.n();
        }
        pw2 pw2Var2 = this.l;
        if ((pw2Var2 == null || pw2Var2.h()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = d79Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = d79Var.getChildAt(i2);
                    if (childAt == null) {
                        break;
                    }
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (top > y || bottom < y || left > x || right < x) {
                        i2++;
                    } else {
                        boolean z = childAt instanceof x2b;
                        ImageReceiver imageReceiver = this.A;
                        if (z) {
                            if (((x2b) childAt).a.E()) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else if (childAt instanceof u2b) {
                            if (((u2b) childAt).a.getImageReceiver().n() != null) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else {
                            i = 2;
                            if (childAt instanceof vw2) {
                                vw2 vw2Var = (vw2) childAt;
                                if (vw2Var.a.n() != null) {
                                    byte b = vw2Var.Q;
                                    if (b == 6) {
                                        imageReceiver.q0(0);
                                        i = 0;
                                    } else if (b == 2 && vw2Var.w) {
                                        imageReceiver.q0(hl.L(6.0f));
                                        i = 1;
                                    }
                                }
                                i = -1;
                            } else if (childAt instanceof ey3) {
                                imageReceiver.q0(0);
                            } else if (!(childAt instanceof x14) || ((x14) childAt).getSpan() == null) {
                                if ((childAt instanceof yeb) && (((yeb) childAt).b instanceof wl)) {
                                    imageReceiver.q0(0);
                                }
                                i = -1;
                            } else {
                                imageReceiver.q0(0);
                            }
                        }
                        if (i != -1) {
                            this.a = x;
                            this.b = y;
                            this.h = childAt;
                            gp6 gp6Var = new gp6((Object) this, (Object) d79Var, i, (Object) vnbVar, (byte) 18);
                            this.j = gp6Var;
                            hl.d3(gp6Var, 200L);
                            return true;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(MotionEvent motionEvent, d79 d79Var, Object obj, pw2 pw2Var, vnb vnbVar) {
        int i;
        int i2;
        pw2 pw2Var2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = pw2Var;
        if (pw2Var != null) {
            this.m = pw2Var.i();
            this.n = this.l.n();
        }
        pw2 pw2Var3 = this.l;
        if ((pw2Var3 == null || pw2Var3.h()) && (this.j != null || this.E)) {
            byte b = 2;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                hl.d3(new bv2(d79Var, obj, b), 150L);
                gp6 gp6Var = this.j;
                if (gp6Var != null) {
                    hl.r(gp6Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    b();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof x2b) {
                            ((x2b) view3).setScaled(false);
                        } else if (view3 instanceof u2b) {
                            ((u2b) view3).setScaled(false);
                        } else if (view3 instanceof vw2) {
                            ((vw2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x = (int) motionEvent.getX();
                            int y = (int) motionEvent.getY();
                            int childCount = d79Var.getChildCount();
                            int i3 = 0;
                            while (true) {
                                if (i3 < childCount) {
                                    View childAt = d79Var.getChildAt(i3);
                                    if (childAt == null) {
                                        break;
                                    }
                                    int top = childAt.getTop();
                                    int bottom = childAt.getBottom();
                                    int left = childAt.getLeft();
                                    int right = childAt.getRight();
                                    if (top > y || bottom < y || left > x || right < x) {
                                        i3++;
                                    } else {
                                        boolean z = childAt instanceof x2b;
                                        ImageReceiver imageReceiver = this.A;
                                        if (z) {
                                            imageReceiver.q0(0);
                                        } else if (childAt instanceof u2b) {
                                            imageReceiver.q0(0);
                                        } else {
                                            if (childAt instanceof vw2) {
                                                vw2 vw2Var = (vw2) childAt;
                                                byte b2 = vw2Var.Q;
                                                if (b2 == 6) {
                                                    imageReceiver.q0(0);
                                                    i2 = 0;
                                                } else if (b2 == 2 && vw2Var.w) {
                                                    imageReceiver.q0(hl.L(6.0f));
                                                    i2 = 1;
                                                } else {
                                                    i2 = -1;
                                                }
                                                i = i2;
                                            } else {
                                                if (childAt instanceof ey3) {
                                                    imageReceiver.q0(0);
                                                } else if (!(childAt instanceof x14) || ((x14) childAt).getSpan() == null) {
                                                    i = -1;
                                                } else {
                                                    imageReceiver.q0(0);
                                                }
                                                i = 2;
                                            }
                                            if (i != -1 && childAt != this.h) {
                                                pw2Var2 = this.l;
                                                if (pw2Var2 != null) {
                                                    pw2Var2.r();
                                                }
                                                view = this.h;
                                                if (!(view instanceof x2b)) {
                                                    ((x2b) view).setScaled(false);
                                                } else if (view instanceof u2b) {
                                                    ((u2b) view).setScaled(false);
                                                } else if (view instanceof vw2) {
                                                    ((vw2) view).setScaled(false);
                                                }
                                                this.h = childAt;
                                                this.i = false;
                                                this.K = false;
                                                this.R = false;
                                                d();
                                                hl.R3(this.O, false);
                                                view2 = this.h;
                                                if (!(view2 instanceof x2b)) {
                                                    x2b x2bVar = (x2b) view2;
                                                    TLRPC.Document sticker = x2bVar.getSticker();
                                                    k7a stickerPath = x2bVar.getStickerPath();
                                                    String V = r47.V(x2bVar.getSticker(), null, Integer.valueOf(this.r));
                                                    pw2 pw2Var4 = this.l;
                                                    i(sticker, stickerPath, V, pw2Var4 != null ? pw2Var4.E(false) : null, null, i, x2bVar.E, x2bVar.getParentObject(), vnbVar, 0);
                                                    x2bVar.setScaled(true);
                                                } else if (view2 instanceof u2b) {
                                                    u2b u2bVar = (u2b) view2;
                                                    TLRPC.Document sticker2 = u2bVar.getSticker();
                                                    String V2 = r47.V(u2bVar.getSticker(), null, Integer.valueOf(this.r));
                                                    pw2 pw2Var5 = this.l;
                                                    i(sticker2, null, V2, pw2Var5 != null ? pw2Var5.E(false) : null, null, i, false, u2bVar.getParentObject(), vnbVar, 0);
                                                    u2bVar.setScaled(true);
                                                    this.i = u2bVar.h;
                                                } else if (view2 instanceof vw2) {
                                                    vw2 vw2Var2 = (vw2) view2;
                                                    TLRPC.Document document2 = vw2Var2.getDocument();
                                                    pw2 pw2Var6 = this.l;
                                                    i(document2, null, null, pw2Var6 != null ? pw2Var6.E(true) : null, vw2Var2.getBotInlineResult(), i, false, vw2Var2.getBotInlineResult() != null ? vw2Var2.getInlineBot() : vw2Var2.getParentObject(), vnbVar, 0);
                                                    if (i != 1 || this.m) {
                                                        vw2Var2.setScaled(true);
                                                    }
                                                } else if (view2 instanceof ey3) {
                                                    TLRPC.Document document3 = ((ey3) view2).getDocument();
                                                    if (document3 != null) {
                                                        i(document3, null, r47.V(document3, null, Integer.valueOf(this.r)), null, null, i, false, null, vnbVar, 0);
                                                    }
                                                } else if (view2 instanceof x14) {
                                                    hm span = ((x14) view2).getSpan();
                                                    if (span != null) {
                                                        TLRPC.Document document4 = span.document;
                                                        if (document4 == null) {
                                                            document4 = wl.e(this.r, span.getDocumentId());
                                                        }
                                                        document = document4;
                                                    } else {
                                                        document = null;
                                                    }
                                                    if (document != null) {
                                                        i(document, null, r47.V(document, null, Integer.valueOf(this.r)), null, null, i, false, null, vnbVar, 0);
                                                    }
                                                } else if (view2 instanceof yeb) {
                                                    Drawable drawable = ((yeb) view2).b;
                                                    TLRPC.Document document5 = drawable instanceof wl ? ((wl) drawable).e : null;
                                                    if (document5 != null) {
                                                        i(document5, null, r47.V(document5, null, Integer.valueOf(this.r)), null, null, i, false, null, vnbVar, 0);
                                                    }
                                                }
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    Vibrator vibrator = (Vibrator) this.z.getContext().getSystemService("vibrator");
                                                    if (this.d0 == null) {
                                                        this.d0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                                    }
                                                    vibrator.cancel();
                                                    vibrator.vibrate(this.d0);
                                                    return true;
                                                }
                                            }
                                        }
                                        i = 0;
                                        if (i != -1) {
                                            pw2Var2 = this.l;
                                            if (pw2Var2 != null) {
                                            }
                                            view = this.h;
                                            if (!(view instanceof x2b)) {
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            d();
                                            hl.R3(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof x2b)) {
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else if (!this.K) {
                            if (this.F == 1.0f) {
                                if (this.c == -10000.0f) {
                                    this.c = motionEvent.getY();
                                    this.d = 0.0f;
                                    this.e = 0.0f;
                                    return true;
                                }
                                float y2 = motionEvent.getY();
                                float f = (y2 - this.c) + this.d;
                                this.d = f;
                                this.c = y2;
                                if (f > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f < (-hl.L(60.0f))) {
                                    this.d = -hl.L(60.0f);
                                }
                                float f2 = this.d;
                                float L = hl.L(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f2) * 0.55f) / L) + 1.0f))) * L)) * (f2 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-hl.L(55.0f))) {
                                    nw2 nw2Var = this.U;
                                    hl.r(nw2Var);
                                    nw2Var.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        hl.r(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > hl.L(10.0f)) {
                        hl.r(this.j);
                        this.j = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028c  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(TLRPC.Document document, k7a k7aVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, vnb vnbVar, int i2) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ?? r14;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver4;
        ImageReceiver imageReceiver5;
        String str3;
        int i3;
        boolean z2;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = vnbVar;
        this.p = z;
        this.G = null;
        this.u.setColor((hl.B(aob.v0(aob.d6, vnbVar)) > 0.721f ? 1 : (hl.B(aob.v0(aob.d6, vnbVar)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.p1 = null;
        ImageReceiver imageReceiver7 = this.B;
        nw2 nw2Var = this.U;
        if (i == 0 || i == 2 || i == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && k7aVar == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(hl.L(24.0f));
            }
            imageReceiver.f();
            this.S = false;
            if (document != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= document.attributes.size()) {
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                    int i5 = i4;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    } else {
                        i4 = i5 + 1;
                    }
                }
                if (str != null) {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                    this.G = new StaticLayout(hl.G2(TextUtils.ellipsize(pv3.m(str, f0.getFontMetricsInt(), false, null, 0), f0, hl.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, hl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                }
                if (inputStickerSet != null || i == 2) {
                    hl.r(nw2Var);
                    str3 = "…";
                    hl.d3(nw2Var, i2 > 0 ? i2 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet n0 = ls6.d0(this.r).n0(inputStickerSet, true);
                if (n0 != null && n0.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                if (r47.N4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.Z(jn5.b(document), null, jn5.c(w, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.b0(jn5.b(document), null, jn5.c(w, document), null, "webp", this.a0, 1);
                    if (r47.W3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.b0(jn5.d(r47.F1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (r47.B4(document)) {
                            imageReceiver6.p1 = aob.n0(vnbVar);
                        }
                        if (this.G == null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i6);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(hl.G2(TextUtils.ellipsize(pv3.m(documentAttribute2.alt, f0.getFontMetricsInt(), false, null, 0), f0, hl.L(200.0f), TextUtils.TruncateAt.END), "", str3), f0, hl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                }
                imageReceiver = imageReceiver4;
                if (r47.B4(document)) {
                }
                if (this.G == null) {
                }
            } else if (k7aVar != null) {
                imageReceiver6.e0(k7aVar.a, null, null, k7aVar.e ? "tgs" : null, 0L);
                if (k7aVar.g != null) {
                    if (this.C == null) {
                        qx7 qx7Var = new qx7(this.z.getContext());
                        this.C = qx7Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(qx7Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(k7aVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(hl.G2(TextUtils.ellipsize(pv3.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, hl.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, hl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                hl.r(nw2Var);
                hl.d3(nw2Var, i2 > 0 ? i2 : 1300L);
                if (imageReceiver3.y() == null) {
                    i3 = 0;
                    imageReceiver3.y().H(0);
                } else {
                    i3 = 0;
                }
                if (this.S && imageReceiver2.y() != null) {
                    imageReceiver2.y().H(i3);
                }
                this.V = i;
                this.W = document;
                this.X = k7aVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = vnbVar;
                this.z.invalidate();
                if (this.E) {
                    hl.d2(this.w);
                    try {
                        if (this.y.getParent() != null) {
                            ((WindowManager) this.w.getSystemService("window")).removeView(this.y);
                        }
                        z2 = true;
                    } catch (Exception e) {
                        z2 = true;
                        cc4.g(e, true);
                    }
                    ((WindowManager) this.w.getSystemService("window")).addView(this.y, this.x);
                    this.E = z2;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    jn7.e().k(jn7.j1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = r47.J0(document);
                jn5 b = jn5.b(document);
                b.p = (byte) 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.Y(b, null, jn5.d(J0, document), null, jn5.c(w2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.Z(b, null, jn5.c(w2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.Y(jn5.p(jxc.c(botInlineResult.content)), null, jn5.p(jxc.c(botInlineResult.thumb)), null, jn5.p(jxc.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.Z(jn5.p(jxc.c(botInlineResult.content)), null, jn5.p(jxc.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            hl.r(nw2Var);
            hl.d3(nw2Var, 2000L);
        }
        imageReceiver2 = imageReceiver;
        imageReceiver3 = imageReceiver6;
        if (imageReceiver3.y() == null) {
        }
        if (this.S) {
            imageReceiver2.y().H(i3);
        }
        this.V = i;
        this.W = document;
        this.X = k7aVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = vnbVar;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void j() {
        gp6 gp6Var = this.j;
        if (gp6Var != null) {
            hl.r(gp6Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof x2b) {
                ((x2b) view).setScaled(false);
            } else if (view instanceof u2b) {
                ((u2b) view).setScaled(false);
            } else if (view instanceof vw2) {
                ((vw2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void k(pw2 pw2Var) {
        this.l = pw2Var;
        if (pw2Var != null) {
            this.m = pw2Var.i();
            this.n = this.l.n();
        }
    }

    public final void l(Activity activity) {
        int i = yac.t0;
        this.r = i;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i;
        imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i2 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i2;
        imageReceiver2.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.y = new zc((byte) 16, (Context) activity, (Object) this);
        yic yicVar = new yic(this.y);
        zc zcVar = this.y;
        ll0 ll0Var = this.t;
        ll0Var.h = yicVar;
        ll0Var.i = zcVar;
        ll0Var.g = new r89(0, false);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        zc zcVar2 = this.y;
        dw2 dw2Var = new dw2(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(zcVar2, dw2Var);
        tt ttVar = new tt(this, activity);
        this.z = ttVar;
        ttVar.setFocusable(false);
        this.y.addView(this.z, tre.e(-1, -1, 51));
        this.z.setOnTouchListener(new b7(this, (byte) 3));
        uc7.s1(this.r);
        this.I = uc7.d1().getInt("kbd_height", hl.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        hl.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.p0(this.z);
    }

    public final boolean m(View view) {
        if (!(view instanceof x2b)) {
            return false;
        }
        Activity W = hl.W(view.getContext());
        if (W == null) {
            return true;
        }
        l(W);
        x2b x2bVar = (x2b) view;
        View view2 = this.h;
        if (view2 instanceof x2b) {
            ((x2b) view2).setScaled(false);
        } else if (view2 instanceof u2b) {
            ((u2b) view2).setScaled(false);
        } else if (view2 instanceof vw2) {
            ((vw2) view2).setScaled(false);
        }
        this.h = x2bVar;
        TLRPC.Document sticker = x2bVar.getSticker();
        k7a stickerPath = x2bVar.getStickerPath();
        String V = r47.V(x2bVar.getSticker(), null, Integer.valueOf(this.r));
        pw2 pw2Var = this.l;
        i(sticker, stickerPath, V, pw2Var != null ? pw2Var.E(false) : null, null, 0, x2bVar.E, x2bVar.getParentObject(), this.c0, 0);
        nw2 nw2Var = this.U;
        hl.r(nw2Var);
        hl.d3(nw2Var, 16L);
        x2bVar.setScaled(true);
        return true;
    }
}
