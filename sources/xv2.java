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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xv2 {
    public static TextPaint f0;
    public static volatile xv2 g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public ju7 C;
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
    public zg8 O;
    public u11 P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final tv2 U;
    public int V;
    public TLRPC.Document W;
    public s3a X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public wjb c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public tn6 j;
    public m8 k;
    public vv2 l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final hx4 s;
    public final kl0 t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public yc y;
    public st z;
    public float e = 0.0f;
    public io5 q = io5.e;

    public xv2() {
        hx4 hx4Var = new hx4();
        this.s = hx4Var;
        this.t = new kl0(hx4Var, hx4Var, hx4Var);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = gl.L(200.0f);
        this.N = new Paint(1);
        this.U = new tv2(this);
    }

    public static xv2 e() {
        xv2 xv2Var;
        xv2 xv2Var2 = g0;
        if (xv2Var2 != null) {
            return xv2Var2;
        }
        synchronized (PhotoViewer.class) {
            xv2Var = g0;
            if (xv2Var == null) {
                xv2Var = new xv2();
                g0 = xv2Var;
            }
        }
        return xv2Var;
    }

    public final boolean a(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f;
        int i;
        float f2;
        int i2;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        c29 c29Var;
        String str2;
        c29 c29Var2;
        vv2 vv2Var = this.l;
        if (vv2Var == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = vv2Var.d();
        TLRPC.PollAnswer g = this.l.g();
        if (d == null || d.poll == null || g == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = k27.E1(d, g.option);
        boolean z = E1 != null && E1.voters > 0 && k27.A(d);
        boolean z2 = (k27.V4(d) || d.poll.closed || this.l.c()) ? false : true;
        boolean z3 = !z2 && k27.D(d);
        if (z) {
            c29 c29Var3 = new c29(this.r, this.c0, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
            cs5 cs5Var = new cs5(actionBarPopupWindow$ActionBarPopupWindowLayout, this.c0);
            View view = cs5Var.B;
            int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i3 = bkb.D8;
            cs5Var.U(bkb.p1(0.06f, bkb.v0(i3, this.c0)));
            nl0 k = nod.k(this.c0);
            if (view != null) {
                c29Var = c29Var3;
                str2 = null;
                il0 c = this.t.c(view, null, true);
                c.p(k);
                view.setBackground(c);
            } else {
                c29Var = c29Var3;
                str2 = null;
            }
            cs5Var.b(R.drawable.ic_ab_back, k96.M0(2131753753, str2), new lv2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0), false);
            cs5Var.j();
            k27 w = this.l.w();
            Activity activity = this.w;
            if ((activity instanceof LaunchActivity) && w != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                d lastFragment = (launchActivity.N() == null || launchActivity.N().getLastFragment() == null) ? null : launchActivity.N().getLastFragment();
                if (lastFragment != null) {
                    q5c a = c29Var.a(lastFragment, k27.B0(w.k), w.e1(), g.option, E1.voters, new pz1((Object) this, (Object) lastFragment, (byte) 10));
                    c29Var2 = c29Var;
                    cs5Var.p(a);
                    c29Var2.setText(k96.G(E1.voters, "PollVotesCount", new Object[0]));
                    c29Var2.a.d(E1.recent_voters, false);
                    c29Var2.setLayoutParams(nme.o(-1, 48));
                    int i4 = bkb.H5;
                    ff0 Y = bkb.Y(bkb.v0(i4, this.c0), 12, 0);
                    vkb M = zkb.M(i4);
                    wjb wjbVar = this.c0;
                    c29Var2.setBackground(Y);
                    zkb.j(c29Var2, Y, null, M, wjbVar);
                    c29Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c29Var2);
                    View j8Var = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                    j8Var.setTag(R.id.fit_width_tag, 1);
                    f = 0.06f;
                    zkb.i(j8Var, zkb.K(0.06f, i3), this.c0);
                    i = -1;
                    j8Var.setLayoutParams(nme.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var);
                }
            }
            c29Var2 = c29Var;
            c29Var2.setText(k96.G(E1.voters, "PollVotesCount", new Object[0]));
            c29Var2.a.d(E1.recent_voters, false);
            c29Var2.setLayoutParams(nme.o(-1, 48));
            int i42 = bkb.H5;
            ff0 Y2 = bkb.Y(bkb.v0(i42, this.c0), 12, 0);
            vkb M2 = zkb.M(i42);
            wjb wjbVar2 = this.c0;
            c29Var2.setBackground(Y2);
            zkb.j(c29Var2, Y2, null, M2, wjbVar2);
            c29Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c29Var2);
            View j8Var2 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
            j8Var2.setTag(R.id.fit_width_tag, 1);
            f = 0.06f;
            zkb.i(j8Var2, zkb.K(0.06f, i3), this.c0);
            i = -1;
            j8Var2.setLayoutParams(nme.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var2);
        } else {
            f = 0.06f;
            i = -1;
        }
        if (z2) {
            i2 = i;
            str = null;
            f2 = f;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, k96.M0(2131746963, null), false, this.c0).setOnClickListener(new kv2(this, (byte) 2));
        } else {
            f2 = f;
            i2 = i;
            str = null;
        }
        if (z3) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, k96.M0(2131743585, str), false, this.c0).setOnClickListener(new kv2(this, (byte) 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z && (z2 || z3)) {
            View j8Var3 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), this.c0);
            j8Var3.setTag(R.id.fit_width_tag, 1);
            zkb.i(j8Var3, zkb.K(f2, bkb.D8), this.c0);
            j8Var3.setLayoutParams(nme.o(i2, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j8Var3);
        }
        return z || z2 || z3;
    }

    public final void b() {
        if (this.w == null || this.K) {
            return;
        }
        gl.r(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        gl.e3(new iv2(this, (byte) 0), 200L);
        zg8 zg8Var = this.O;
        if (zg8Var != null) {
            zg8Var.animate().alpha(0.0f).translationY(gl.L(56.0f)).setDuration(150L).setInterpolator(s33.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(s33.f).start();
        }
        kk7.e().k(kk7.j1, 8);
    }

    public final void c() {
        m43 reactionsWindow;
        u11 u11Var = this.P;
        if (u11Var != null && (reactionsWindow = u11Var.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        d();
        b();
    }

    public final void d() {
        m8 m8Var = this.k;
        if (m8Var != null) {
            m8Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            ug8.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(gl.L(-12.0f)), s33.h, 320L);
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
        hx4 hx4Var = this.s;
        hx4Var.a(bitmap2);
        tk0.c(hx4Var, this.y);
        this.t.d();
        this.e0 = false;
        st stVar = this.z;
        if (stVar != null) {
            stVar.invalidate();
        }
    }

    public final boolean g(MotionEvent motionEvent, o39 o39Var, vv2 vv2Var, wjb wjbVar) {
        int i;
        this.l = vv2Var;
        if (vv2Var != null) {
            this.m = vv2Var.i();
            this.n = this.l.n();
        }
        vv2 vv2Var2 = this.l;
        if ((vv2Var2 == null || vv2Var2.h()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = o39Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = o39Var.getChildAt(i2);
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
                        boolean z = childAt instanceof xya;
                        ImageReceiver imageReceiver = this.A;
                        if (z) {
                            if (((xya) childAt).a.E()) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else if (childAt instanceof uya) {
                            if (((uya) childAt).a.getImageReceiver().n() != null) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else {
                            i = 2;
                            if (childAt instanceof bw2) {
                                bw2 bw2Var = (bw2) childAt;
                                if (bw2Var.a.n() != null) {
                                    byte b = bw2Var.Q;
                                    if (b == 6) {
                                        imageReceiver.q0(0);
                                        i = 0;
                                    } else if (b == 2 && bw2Var.w) {
                                        imageReceiver.q0(gl.L(6.0f));
                                        i = 1;
                                    }
                                }
                                i = -1;
                            } else if (childAt instanceof ix3) {
                                imageReceiver.q0(0);
                            } else if (!(childAt instanceof c14) || ((c14) childAt).getSpan() == null) {
                                if ((childAt instanceof cbb) && (((cbb) childAt).b instanceof vl)) {
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
                            tn6 tn6Var = new tn6((Object) this, (Object) o39Var, i, (Object) wjbVar, (byte) 18);
                            this.j = tn6Var;
                            gl.e3(tn6Var, 200L);
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
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(MotionEvent motionEvent, o39 o39Var, Object obj, vv2 vv2Var, wjb wjbVar) {
        int i;
        int i2;
        vv2 vv2Var2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = vv2Var;
        if (vv2Var != null) {
            this.m = vv2Var.i();
            this.n = this.l.n();
        }
        vv2 vv2Var3 = this.l;
        if ((vv2Var3 == null || vv2Var3.h()) && (this.j != null || this.E)) {
            byte b = 3;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                gl.e3(new gu2(o39Var, obj, b), 150L);
                tn6 tn6Var = this.j;
                if (tn6Var != null) {
                    gl.r(tn6Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    b();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof xya) {
                            ((xya) view3).setScaled(false);
                        } else if (view3 instanceof uya) {
                            ((uya) view3).setScaled(false);
                        } else if (view3 instanceof bw2) {
                            ((bw2) view3).setScaled(false);
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
                            int childCount = o39Var.getChildCount();
                            int i3 = 0;
                            while (true) {
                                if (i3 < childCount) {
                                    View childAt = o39Var.getChildAt(i3);
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
                                        boolean z = childAt instanceof xya;
                                        ImageReceiver imageReceiver = this.A;
                                        if (z) {
                                            imageReceiver.q0(0);
                                        } else if (childAt instanceof uya) {
                                            imageReceiver.q0(0);
                                        } else {
                                            if (childAt instanceof bw2) {
                                                bw2 bw2Var = (bw2) childAt;
                                                byte b2 = bw2Var.Q;
                                                if (b2 == 6) {
                                                    imageReceiver.q0(0);
                                                    i2 = 0;
                                                } else if (b2 == 2 && bw2Var.w) {
                                                    imageReceiver.q0(gl.L(6.0f));
                                                    i2 = 1;
                                                } else {
                                                    i2 = -1;
                                                }
                                                i = i2;
                                            } else {
                                                if (childAt instanceof ix3) {
                                                    imageReceiver.q0(0);
                                                } else if (!(childAt instanceof c14) || ((c14) childAt).getSpan() == null) {
                                                    i = -1;
                                                } else {
                                                    imageReceiver.q0(0);
                                                }
                                                i = 2;
                                            }
                                            if (i != -1 && childAt != this.h) {
                                                vv2Var2 = this.l;
                                                if (vv2Var2 != null) {
                                                    vv2Var2.q();
                                                }
                                                view = this.h;
                                                if (!(view instanceof xya)) {
                                                    ((xya) view).setScaled(false);
                                                } else if (view instanceof uya) {
                                                    ((uya) view).setScaled(false);
                                                } else if (view instanceof bw2) {
                                                    ((bw2) view).setScaled(false);
                                                }
                                                this.h = childAt;
                                                this.i = false;
                                                this.K = false;
                                                this.R = false;
                                                d();
                                                gl.S3(this.O, false);
                                                view2 = this.h;
                                                if (!(view2 instanceof xya)) {
                                                    xya xyaVar = (xya) view2;
                                                    TLRPC.Document sticker = xyaVar.getSticker();
                                                    s3a stickerPath = xyaVar.getStickerPath();
                                                    String V = k27.V(xyaVar.getSticker(), null, Integer.valueOf(this.r));
                                                    vv2 vv2Var4 = this.l;
                                                    i(sticker, stickerPath, V, vv2Var4 != null ? vv2Var4.C(false) : null, null, i, xyaVar.E, xyaVar.getParentObject(), wjbVar, 0);
                                                    xyaVar.setScaled(true);
                                                } else if (view2 instanceof uya) {
                                                    uya uyaVar = (uya) view2;
                                                    TLRPC.Document sticker2 = uyaVar.getSticker();
                                                    String V2 = k27.V(uyaVar.getSticker(), null, Integer.valueOf(this.r));
                                                    vv2 vv2Var5 = this.l;
                                                    i(sticker2, null, V2, vv2Var5 != null ? vv2Var5.C(false) : null, null, i, false, uyaVar.getParentObject(), wjbVar, 0);
                                                    uyaVar.setScaled(true);
                                                    this.i = uyaVar.h;
                                                } else if (view2 instanceof bw2) {
                                                    bw2 bw2Var2 = (bw2) view2;
                                                    TLRPC.Document document2 = bw2Var2.getDocument();
                                                    vv2 vv2Var6 = this.l;
                                                    i(document2, null, null, vv2Var6 != null ? vv2Var6.C(true) : null, bw2Var2.getBotInlineResult(), i, false, bw2Var2.getBotInlineResult() != null ? bw2Var2.getInlineBot() : bw2Var2.getParentObject(), wjbVar, 0);
                                                    if (i != 1 || this.m) {
                                                        bw2Var2.setScaled(true);
                                                    }
                                                } else if (view2 instanceof ix3) {
                                                    TLRPC.Document document3 = ((ix3) view2).getDocument();
                                                    if (document3 != null) {
                                                        i(document3, null, k27.V(document3, null, Integer.valueOf(this.r)), null, null, i, false, null, wjbVar, 0);
                                                    }
                                                } else if (view2 instanceof c14) {
                                                    gm span = ((c14) view2).getSpan();
                                                    if (span != null) {
                                                        TLRPC.Document document4 = span.document;
                                                        if (document4 == null) {
                                                            document4 = vl.e(this.r, span.getDocumentId());
                                                        }
                                                        document = document4;
                                                    } else {
                                                        document = null;
                                                    }
                                                    if (document != null) {
                                                        i(document, null, k27.V(document, null, Integer.valueOf(this.r)), null, null, i, false, null, wjbVar, 0);
                                                    }
                                                } else if (view2 instanceof cbb) {
                                                    Drawable drawable = ((cbb) view2).b;
                                                    TLRPC.Document document5 = drawable instanceof vl ? ((vl) drawable).e : null;
                                                    if (document5 != null) {
                                                        i(document5, null, k27.V(document5, null, Integer.valueOf(this.r)), null, null, i, false, null, wjbVar, 0);
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
                                            vv2Var2 = this.l;
                                            if (vv2Var2 != null) {
                                            }
                                            view = this.h;
                                            if (!(view instanceof xya)) {
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            d();
                                            gl.S3(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof xya)) {
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
                                } else if (f < (-gl.L(60.0f))) {
                                    this.d = -gl.L(60.0f);
                                }
                                float f2 = this.d;
                                float L = gl.L(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f2) * 0.55f) / L) + 1.0f))) * L)) * (f2 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-gl.L(55.0f))) {
                                    tv2 tv2Var = this.U;
                                    gl.r(tv2Var);
                                    tv2Var.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        gl.r(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > gl.L(10.0f)) {
                        gl.r(this.j);
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
    public final void i(TLRPC.Document document, s3a s3aVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, wjb wjbVar, int i2) {
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
        this.c0 = wjbVar;
        this.p = z;
        this.G = null;
        this.u.setColor((gl.B(bkb.v0(bkb.c6, wjbVar)) > 0.721f ? 1 : (gl.B(bkb.v0(bkb.c6, wjbVar)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.p1 = null;
        ImageReceiver imageReceiver7 = this.B;
        tv2 tv2Var = this.U;
        if (i == 0 || i == 2 || i == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && s3aVar == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(gl.L(24.0f));
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
                    this.G = new StaticLayout(gl.H2(TextUtils.ellipsize(vu3.m(str, f0.getFontMetricsInt(), false, null, 0), f0, gl.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, gl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                }
                if (inputStickerSet != null || i == 2) {
                    gl.r(tv2Var);
                    str3 = "…";
                    gl.e3(tv2Var, i2 > 0 ? i2 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet n0 = hq6.d0(this.r).n0(inputStickerSet, true);
                if (n0 != null && n0.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                if (k27.N4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.Z(gl5.b(document), null, gl5.c(w, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.b0(gl5.b(document), null, gl5.c(w, document), null, "webp", this.a0, 1);
                    if (k27.W3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.b0(gl5.d(k27.F1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (k27.B4(document)) {
                            imageReceiver6.p1 = bkb.n0(wjbVar);
                        }
                        if (this.G == null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i6);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(gl.H2(TextUtils.ellipsize(vu3.m(documentAttribute2.alt, f0.getFontMetricsInt(), false, null, 0), f0, gl.L(200.0f), TextUtils.TruncateAt.END), "", str3), f0, gl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                }
                imageReceiver = imageReceiver4;
                if (k27.B4(document)) {
                }
                if (this.G == null) {
                }
            } else if (s3aVar != null) {
                imageReceiver6.e0(s3aVar.a, null, null, s3aVar.e ? "tgs" : null, 0L);
                if (s3aVar.g != null) {
                    if (this.C == null) {
                        ju7 ju7Var = new ju7(this.z.getContext());
                        this.C = ju7Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(ju7Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(s3aVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(gl.H2(TextUtils.ellipsize(vu3.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, gl.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, gl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                gl.r(tv2Var);
                gl.e3(tv2Var, i2 > 0 ? i2 : 1300L);
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
                this.X = s3aVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = wjbVar;
                this.z.invalidate();
                if (this.E) {
                    gl.d2(this.w);
                    try {
                        if (this.y.getParent() != null) {
                            ((WindowManager) this.w.getSystemService("window")).removeView(this.y);
                        }
                        z2 = true;
                    } catch (Exception e) {
                        z2 = true;
                        fa4.g(e, true);
                    }
                    ((WindowManager) this.w.getSystemService("window")).addView(this.y, this.x);
                    this.E = z2;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    kk7.e().k(kk7.i1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w2 = ba4.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = k27.J0(document);
                gl5 b = gl5.b(document);
                b.p = (byte) 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.Y(b, null, gl5.d(J0, document), null, gl5.c(w2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.Z(b, null, gl5.c(w2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.Y(gl5.p(usc.c(botInlineResult.content)), null, gl5.p(usc.c(botInlineResult.thumb)), null, gl5.p(usc.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.Z(gl5.p(usc.c(botInlineResult.content)), null, gl5.p(usc.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            gl.r(tv2Var);
            gl.e3(tv2Var, 2000L);
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
        this.X = s3aVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = wjbVar;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void j() {
        tn6 tn6Var = this.j;
        if (tn6Var != null) {
            gl.r(tn6Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof xya) {
                ((xya) view).setScaled(false);
            } else if (view instanceof uya) {
                ((uya) view).setScaled(false);
            } else if (view instanceof bw2) {
                ((bw2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void k(vv2 vv2Var) {
        this.l = vv2Var;
        if (vv2Var != null) {
            this.m = vv2Var.i();
            this.n = this.l.n();
        }
    }

    public final void l(Activity activity) {
        int i = y6c.t0;
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
        this.y = new yc((byte) 16, (Context) activity, (Object) this);
        zec zecVar = new zec(this.y);
        yc ycVar = this.y;
        kl0 kl0Var = this.t;
        kl0Var.h = zecVar;
        kl0Var.i = ycVar;
        kl0Var.g = new e59(0, false);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        yc ycVar2 = this.y;
        jv2 jv2Var = new jv2(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(ycVar2, jv2Var);
        st stVar = new st(this, activity);
        this.z = stVar;
        stVar.setFocusable(false);
        this.y.addView(this.z, nme.e(-1, -1, 51));
        this.z.setOnTouchListener(new a7(this, (byte) 3));
        na7.q1(this.r);
        this.I = na7.b1().getInt("kbd_height", gl.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        gl.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.p0(this.z);
    }

    public final boolean m(View view) {
        if (!(view instanceof xya)) {
            return false;
        }
        Activity W = gl.W(view.getContext());
        if (W == null) {
            return true;
        }
        l(W);
        xya xyaVar = (xya) view;
        View view2 = this.h;
        if (view2 instanceof xya) {
            ((xya) view2).setScaled(false);
        } else if (view2 instanceof uya) {
            ((uya) view2).setScaled(false);
        } else if (view2 instanceof bw2) {
            ((bw2) view2).setScaled(false);
        }
        this.h = xyaVar;
        TLRPC.Document sticker = xyaVar.getSticker();
        s3a stickerPath = xyaVar.getStickerPath();
        String V = k27.V(xyaVar.getSticker(), null, Integer.valueOf(this.r));
        vv2 vv2Var = this.l;
        i(sticker, stickerPath, V, vv2Var != null ? vv2Var.C(false) : null, null, 0, xyaVar.E, xyaVar.getParentObject(), this.c0, 0);
        tv2 tv2Var = this.U;
        gl.r(tv2Var);
        gl.e3(tv2Var, 16L);
        xyaVar.setScaled(true);
        return true;
    }
}
