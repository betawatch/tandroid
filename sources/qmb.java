// default package

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class qmb extends d implements sp3, gk7 {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public hmb B1;
    public ke5 C0;
    public hmb C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public tb0 E0;
    public Bitmap E1;
    public final int F;
    public qlb F0;
    public boolean F1;
    public final int G;
    public qlb G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public boolean H1;
    public final int I;
    public ImageView I0;
    public String I1;
    public final boolean J;
    public AnimatorSet J0;
    public int J1;
    public final long K;
    public AnimatorSet K0;
    public pmb K1;
    public final long L;
    public rqc[] L0;
    public long L1;
    public final long M;
    public rqc[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public oy8 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public r7 Q1;
    public long R;
    public rkb R0;
    public ValueAnimator R1;
    public c25 S;
    public omb S0;
    public jo0 S1;
    public final njb T;
    public t26 T0;
    public plb T1;
    public final njb U;
    public ld5 U0;
    public final ns4 U1;
    public final njb V;
    public ty0 V0;
    public boolean V1;
    public final njb W;
    public ArrayList W0;
    public boolean W1;
    public p X;
    public final HashMap X0;
    public TL_stories.TL_premium_boostsStatus X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public int Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final slb a;
    public final Runnable a0;
    public TLRPC.TL_wallPaper a1;
    public float a2;
    public final byte b;
    public boolean b0;
    public int b1;
    public float b2;
    public Scroller c;
    public s71 c0;
    public int c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout d0;
    public int d1;
    public int d2;
    public w42 e;
    public TextView e0;
    public int e1;
    public ValueAnimator e2;
    public r7 f;
    public TextView f0;
    public int f1;
    public boolean f2;
    public final akb g0;
    public int g1;
    public TextView g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public WeakReference h2;
    public final boolean i0;
    public int i1;
    public BitmapDrawable i2;
    public final boolean j0;
    public int j1;
    public xg1 j2;
    public ArrayList k0;
    public int k1;
    public float k2;
    public gec l0;
    public int l1;
    public ValueAnimator l2;
    public gw9 m0;
    public int m1;
    public int n;
    public UndoView n0;
    public float n1;
    public FrameLayout o0;
    public float o1;
    public o39 p0;
    public float p1;
    public s20 q0;
    public float q1;
    public Drawable r;
    public un4 r0;
    public imb r1;
    public int s;
    public k27 s0;
    public cm2 s1;
    public boolean t0;
    public AnimatorSet t1;
    public a u0;
    public final PorterDuff.Mode u1;
    public k7 v0;
    public int v1;
    public final zjb w;
    public nlb w0;
    public sd0 w1;
    public boolean x;
    public mmb x0;
    public brc x1;
    public final int y;
    public final gmb[] y0;
    public Bitmap y1;
    public gmb z0;
    public Bitmap z1;

    /* JADX WARN: Multi-variable type inference failed */
    public qmb(akb akbVar, boolean z, int i, boolean z2, boolean z3) {
        super(null);
        zjb i2;
        this.a = new slb(this);
        this.d = true;
        this.n = 1;
        njb njbVar = new njb(this, 0, false);
        this.T = njbVar;
        njb njbVar2 = new njb(this, 0, true);
        this.U = njbVar2;
        njb njbVar3 = new njb(this, 1, false);
        this.V = njbVar3;
        njb njbVar4 = new njb(this, 1, true);
        this.W = njbVar4;
        this.Z = -1;
        this.a0 = new flb(this, (byte) 0);
        this.y0 = new gmb[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.p1 = 0.0f;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new ns4(getParentActivity(), new ln8((Object) this, (byte) 20));
        this.V1 = false;
        this.W1 = false;
        this.b = i;
        this.h0 = z3;
        this.g0 = akbVar;
        this.j0 = z;
        this.i0 = z2;
        if (i == 1) {
            i2 = akbVar.i(!z2);
            this.w = i2;
            if (i2 != null) {
                this.d = false;
                this.y = i2.c;
                this.E = i2.d;
                this.F = i2.e;
                this.G = i2.f;
                this.H = i2.g;
                this.I = i2.h;
                this.J = i2.i;
                this.K = i2.j;
                this.L = i2.k;
                this.M = i2.l;
                this.N = i2.m;
                this.O = i2.p;
                this.P = i2.o;
                this.Q = i2.n;
            }
        } else {
            if (i == 0) {
                this.d = false;
            }
            i2 = akbVar.i(false);
            this.w = i2;
            if (i2 != null) {
                this.Y0 = i2.s;
            }
        }
        if (i2 != null) {
            this.G1 = i2.q;
            if (!TextUtils.isEmpty(i2.o)) {
                this.n1 = i2.p;
            }
            bkb.M = bkb.B0();
            bkb.O = true;
            bkb.P = true;
            bkb.t(akbVar, false, false);
        }
        kk7.e().k(kk7.w4, new Object[0]);
        njbVar.v = true;
        njbVar3.v = true;
        njbVar2.v = true;
        njbVar4.v = true;
    }

    @Override // sp3
    public final void B(boolean z) {
        n1();
    }

    public final void M0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        boolean z = this.G1;
        gmb gmbVar = this.z0;
        byte b = 1;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(gmbVar, (Property<gmb, Float>) View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.z0, (Property<gmb, Float>) View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(gmbVar, (Property<gmb, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.z0, (Property<gmb, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.z0, (Property<gmb, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.z0, (Property<gmb, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(s33.g);
        this.D0.addListener(new vlb(this, b));
        this.D0.start();
    }

    @Override // sp3
    public final void N(String str) {
        n1();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(boolean z) {
        long j;
        int i;
        boolean z2;
        boolean z3;
        File w;
        File file;
        Object obj;
        float f;
        boolean z4;
        TLRPC.TL_wallPaper tL_wallPaper;
        File file2;
        String str;
        int i2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        File w2;
        int i3;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        String str2;
        Object obj2;
        long j2;
        boolean z6;
        boolean z7;
        boolean z8;
        float f2;
        TLRPC.UserFull W1;
        byte b = 2;
        if (this.L1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < S0()) {
                getMessagesController().E0().b(this.L1, this.X1, new ilb(this, b));
                return;
            } else if (this.X1 == null) {
                return;
            }
        }
        if (!getUserConfig().p() && z) {
            showDialog(new jh8((d) this, 22, true));
            return;
        }
        akb akbVar = bkb.I;
        String h = akbVar.h(null, this.H1);
        int i8 = 0;
        String h2 = this.H1 ? akbVar.h(null, false) : h;
        File e = sqc.e(h);
        Object obj3 = this.D1;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
            Bitmap bitmap = this.z1;
            if (bitmap != null) {
                try {
                    sqc.c(bitmap, Bitmap.CompressFormat.JPEG, e);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                if (imageReceiver.E() || imageReceiver.n0 != null) {
                    try {
                        sqc.c(imageReceiver.n(), Bitmap.CompressFormat.JPEG, e);
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                }
                z2 = false;
                if (!z2) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) this.D1;
                    ba4.G(this.currentAccount);
                    try {
                        z2 = sqc.a(ba4.J(tL_wallPaper3.document, null, true, true), e);
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                        z2 = false;
                    }
                }
                j = 0;
            }
            z2 = true;
            if (!z2) {
            }
            j = 0;
        } else if (obj3 instanceof krc) {
            TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
            if (tL_wallPaper4 == null || tL_wallPaper4.document == null) {
                j = 0;
            } else {
                try {
                    ba4.G(this.currentAccount);
                    j = 0;
                    try {
                        zqc.e(ng5.c(xqc.b(this.Y0)), new c4b(ba4.J(this.Y0.document, null, true, true), (byte) 4));
                    } catch (Throwable th) {
                        th = th;
                        fa4.g(th, true);
                        z2 = true;
                        z3 = false;
                        i = 4;
                        if (this.H1) {
                        }
                        obj = this.D1;
                        int i9 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        vjb vjbVar = new vjb();
                        vjbVar.a = h2;
                        vjbVar.b = h;
                        vjbVar.c = str;
                        vjbVar.i = this.H1;
                        vjbVar.j = this.G1;
                        vjbVar.d = i8;
                        vjbVar.e = i4;
                        vjbVar.f = i3;
                        vjbVar.g = i5;
                        vjbVar.h = i2;
                        if (this.O1) {
                        }
                        vjbVar.k = this.n1;
                        obj2 = this.D1;
                        if (obj2 instanceof krc) {
                        }
                        j2 = this.L1;
                        vjbVar.n = j2;
                        if (j2 != j) {
                        }
                        vjbVar.o = z;
                        na7.q1(this.currentAccount).C4(file2, vjbVar, str == null && this.L1 == j, 0L);
                        if (z5) {
                        }
                        z7 = z6;
                        if (z7) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = 0;
                }
            }
            z2 = true;
        } else {
            j = 0;
            if (obj3 instanceof lrc) {
                lrc lrcVar = (lrc) obj3;
                if (lrcVar.b != 0 || "t".equals(lrcVar.a)) {
                    i = 4;
                    z2 = true;
                    z3 = false;
                } else {
                    try {
                    } catch (Exception e5) {
                        e = e5;
                        i = 4;
                    }
                    try {
                        if (!this.c2 || this.Z1 == this.a2) {
                            i = 4;
                            File file3 = lrcVar.e;
                            file = file3 != null ? file3 : lrcVar.d;
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap((int) this.b2, this.E1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            i = 4;
                            canvas.translate(-((this.Z1 / this.Y1) * (this.E1.getWidth() - createBitmap.getWidth())), 0.0f);
                            canvas.drawBitmap(this.E1, 0.0f, 0.0f, (Paint) null);
                            File file4 = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
                            lrcVar.d = file4;
                            sqc.c(createBitmap, Bitmap.CompressFormat.JPEG, file4);
                            createBitmap.recycle();
                            file = lrcVar.d;
                        }
                        z3 = file.equals(e);
                        if (z3) {
                            z2 = true;
                        } else {
                            try {
                                z2 = sqc.a(file, e);
                            } catch (Exception e6) {
                                e = e6;
                                fa4.g(e, true);
                                z2 = false;
                                if (this.H1) {
                                }
                                obj = this.D1;
                                int i92 = 45;
                                if (obj instanceof TLRPC.TL_wallPaper) {
                                }
                                vjb vjbVar2 = new vjb();
                                vjbVar2.a = h2;
                                vjbVar2.b = h;
                                vjbVar2.c = str;
                                vjbVar2.i = this.H1;
                                vjbVar2.j = this.G1;
                                vjbVar2.d = i8;
                                vjbVar2.e = i4;
                                vjbVar2.f = i3;
                                vjbVar2.g = i5;
                                vjbVar2.h = i2;
                                if (this.O1) {
                                }
                                vjbVar2.k = this.n1;
                                obj2 = this.D1;
                                if (obj2 instanceof krc) {
                                }
                                j2 = this.L1;
                                vjbVar2.n = j2;
                                if (j2 != j) {
                                }
                                vjbVar2.o = z;
                                na7.q1(this.currentAccount).C4(file2, vjbVar2, str == null && this.L1 == j, 0L);
                                if (z5) {
                                }
                                z7 = z6;
                                if (z7) {
                                }
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z3 = false;
                        fa4.g(e, true);
                        z2 = false;
                        if (this.H1) {
                        }
                        obj = this.D1;
                        int i922 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        vjb vjbVar22 = new vjb();
                        vjbVar22.a = h2;
                        vjbVar22.b = h;
                        vjbVar22.c = str;
                        vjbVar22.i = this.H1;
                        vjbVar22.j = this.G1;
                        vjbVar22.d = i8;
                        vjbVar22.e = i4;
                        vjbVar22.f = i3;
                        vjbVar22.g = i5;
                        vjbVar22.h = i2;
                        if (this.O1) {
                        }
                        vjbVar22.k = this.n1;
                        obj2 = this.D1;
                        if (obj2 instanceof krc) {
                        }
                        j2 = this.L1;
                        vjbVar22.n = j2;
                        if (j2 != j) {
                        }
                        vjbVar22.o = z;
                        na7.q1(this.currentAccount).C4(file2, vjbVar22, str == null && this.L1 == j, 0L);
                        if (z5) {
                        }
                        z7 = z6;
                        if (z7) {
                        }
                    }
                }
            } else {
                i = 4;
                if (obj3 instanceof nm6) {
                    nm6 nm6Var = (nm6) obj3;
                    TLRPC.Photo photo = nm6Var.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w3 = ba4.w(photo.sizes, this.J1, true, null, false);
                        ba4.G(this.currentAccount);
                        w = ba4.J(w3, null, true, true);
                    } else {
                        w = fl5.w(nm6Var.C);
                    }
                    try {
                        z2 = sqc.a(w, e);
                    } catch (Exception e8) {
                        fa4.g(e8, true);
                        z2 = false;
                    }
                    z3 = false;
                } else {
                    z2 = false;
                    z3 = false;
                }
            }
            if (this.H1) {
                try {
                    sqc.c(this.y1, Bitmap.CompressFormat.JPEG, sqc.e(h2));
                    z2 = true;
                } catch (Throwable th3) {
                    fa4.g(th3, true);
                    z2 = false;
                }
            }
            obj = this.D1;
            int i9222 = 45;
            if (obj instanceof TLRPC.TL_wallPaper) {
                tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                z4 = z3;
                str = tL_wallPaper.slug;
                file2 = null;
                i3 = 0;
                f = 0.0f;
                i2 = 45;
                z5 = z2;
                i5 = 0;
                i4 = 0;
            } else if (obj instanceof krc) {
                if ("d".equals(((krc) obj).a)) {
                    i6 = 0;
                    i7 = 0;
                    str2 = "d";
                    f = 0.0f;
                    i4 = 0;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                    String str3 = tL_wallPaper5 != null ? tL_wallPaper5.slug : "c";
                    int i10 = this.b1;
                    f = 0.0f;
                    i4 = this.d1;
                    i6 = this.e1;
                    i7 = this.f1;
                    i9222 = this.j1;
                    i8 = i10;
                    str2 = str3;
                }
                int i11 = i9222;
                z5 = z2;
                i5 = i7;
                i2 = i11;
                String str4 = str2;
                i3 = i6;
                str = str4;
                z4 = z3;
                tL_wallPaper = null;
                file2 = null;
            } else {
                f = 0.0f;
                if (obj instanceof lrc) {
                    lrc lrcVar2 = (lrc) obj;
                    String str5 = lrcVar2.a;
                    z4 = z3;
                    file2 = lrcVar2.d;
                    str = str5;
                    i2 = 45;
                    tL_wallPaper = null;
                } else {
                    if (obj instanceof nm6) {
                        nm6 nm6Var2 = (nm6) obj;
                        TLRPC.Photo photo2 = nm6Var2.K;
                        if (photo2 != null) {
                            tL_wallPaper2 = null;
                            TLRPC.PhotoSize w4 = ba4.w(photo2.sizes, this.J1, true, null, false);
                            ba4.G(this.currentAccount);
                            w2 = ba4.J(w4, null, true, true);
                        } else {
                            tL_wallPaper2 = null;
                            w2 = fl5.w(nm6Var2.C);
                        }
                        z4 = z3;
                        file2 = w2;
                        str = "";
                        tL_wallPaper = tL_wallPaper2;
                    } else {
                        z4 = z3;
                        tL_wallPaper = null;
                        file2 = null;
                        str = "d";
                    }
                    i2 = 45;
                }
                i3 = 0;
                i8 = 0;
                i4 = 0;
                z5 = z2;
                i5 = 0;
            }
            vjb vjbVar222 = new vjb();
            vjbVar222.a = h2;
            vjbVar222.b = h;
            vjbVar222.c = str;
            vjbVar222.i = this.H1;
            vjbVar222.j = this.G1;
            vjbVar222.d = i8;
            vjbVar222.e = i4;
            vjbVar222.f = i3;
            vjbVar222.g = i5;
            vjbVar222.h = i2;
            if (this.O1) {
                float f3 = this.p1;
                if (f3 >= f) {
                    vjbVar222.k = f3;
                    obj2 = this.D1;
                    if (obj2 instanceof krc) {
                        krc krcVar = (krc) obj2;
                        String str6 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                        float f4 = krcVar.h;
                        if (f4 < f && !bkb.I.o()) {
                            f4 *= -1.0f;
                        }
                        if (krcVar.k != null && krcVar.b == i8 && krcVar.c == i4 && krcVar.d == i3 && krcVar.e == i5 && TextUtils.equals(krcVar.a, str6) && krcVar.f == i2 && (this.Y0 == null || Math.abs(f4 - this.n1) < 0.001f)) {
                            TLRPC.WallPaper wallPaper = krcVar.k;
                            vjbVar222.l = wallPaper.id;
                            vjbVar222.m = wallPaper.access_hash;
                        }
                    }
                    j2 = this.L1;
                    vjbVar222.n = j2;
                    if (j2 != j && (W1 = getMessagesController().W1(this.L1)) != null) {
                        vjbVar222.t = W1.wallpaper;
                    }
                    vjbVar222.o = z;
                    na7.q1(this.currentAccount).C4(file2, vjbVar222, str == null && this.L1 == j, 0L);
                    if (z5) {
                        z6 = true;
                    } else {
                        if (this.L1 != j) {
                            if (file2 == null || getMessagesController().K2 != vjbVar222) {
                                z8 = false;
                                je2.e(this.currentAccount).s(this.L1, null, vjbVar222, this.s0, new jc((byte) 10));
                            } else {
                                tL_wallPaper = new TLRPC.TL_wallPaper();
                                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                tL_wallPaper.settings = tL_wallPaperSettings;
                                tL_wallPaperSettings.intensity = (int) (vjbVar222.k * 100.0f);
                                tL_wallPaperSettings.blur = vjbVar222.i;
                                tL_wallPaperSettings.motion = vjbVar222.j;
                                tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                Bitmap createBitmap2 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(createBitmap2);
                                float max = Math.max(50.0f / this.z0.getMeasuredWidth(), 50.0f / this.z0.getMeasuredHeight());
                                canvas2.scale(max, max);
                                int measuredHeight = this.z0.getMeasuredHeight();
                                int measuredWidth = this.z0.getMeasuredWidth();
                                gmb gmbVar = this.z0;
                                if (measuredHeight > measuredWidth) {
                                    f2 = f;
                                    canvas2.translate(f2, (-(gmbVar.getMeasuredHeight() - this.z0.getMeasuredWidth())) / 2.0f);
                                } else {
                                    f2 = f;
                                    canvas2.translate((-(gmbVar.getMeasuredWidth() - this.z0.getMeasuredHeight())) / 2.0f, f2);
                                }
                                float f5 = this.p1;
                                this.p1 = f2;
                                this.z0.draw(canvas2);
                                this.p1 = f5;
                                Utilities.blurBitmap(createBitmap2, 3);
                                tL_wallPaper.stripedThumb = createBitmap2;
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                z3a.B(this.currentAccount);
                                tL_messageService.random_id = z3a.D();
                                tL_messageService.dialog_id = this.L1;
                                tL_messageService.unread = true;
                                tL_messageService.out = true;
                                int i12 = getUserConfig().i();
                                tL_messageService.id = i12;
                                tL_messageService.local_id = i12;
                                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.L1));
                                if (hc2.T(K0)) {
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_messageService.from_id = tL_peerChannel;
                                    tL_peerChannel.channel_id = K0.id;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_messageService.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = K0.id;
                                } else {
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_messageService.from_id = tL_peerUser;
                                    tL_peerUser.user_id = getUserConfig().e();
                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                    tL_messageService.peer_id = tL_peerUser2;
                                    tL_peerUser2.user_id = this.L1;
                                }
                                tL_messageService.flags |= 256;
                                tL_messageService.date = getConnectionsManager().getCurrentTime();
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                tL_messageService.action = tL_messageActionSetChatWallPaper;
                                tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper;
                                tL_messageActionSetChatWallPaper.for_both = z;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new k27(this.currentAccount, tL_messageService, false, false));
                                new ArrayList().add(tL_messageService);
                                na7.q1(this.currentAccount).q5(0, this.L1, arrayList);
                                if (this.L1 >= j) {
                                    TLRPC.UserFull W12 = getMessagesController().W1(this.L1);
                                    if (W12 != null) {
                                        W12.wallpaper = tL_wallPaper;
                                        kk7.f(this.currentAccount).k(kk7.D0, Long.valueOf(this.L1), W12);
                                    }
                                } else {
                                    TLRPC.ChatFull L0 = getMessagesController().L0(-this.L1);
                                    if (L0 != null) {
                                        L0.wallpaper = tL_wallPaper;
                                        kk7 f6 = kk7.f(this.currentAccount);
                                        z8 = false;
                                        Object[] objArr = new Object[i];
                                        objArr[0] = L0;
                                        objArr[1] = 0;
                                        Boolean bool = Boolean.FALSE;
                                        objArr[2] = bool;
                                        objArr[3] = bool;
                                        f6.k(kk7.S, objArr);
                                    }
                                }
                                z8 = false;
                            }
                            this.f2 = true;
                            pmb pmbVar = this.K1;
                            if (pmbVar != null) {
                                pmbVar.a(tL_wallPaper);
                            }
                            finishFragment();
                            z7 = z8;
                            if (z7) {
                                pmb pmbVar2 = this.K1;
                                if (pmbVar2 != null) {
                                    pmbVar2.a(tL_wallPaper);
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        bkb.b0 = getThemedColor(bkb.bd);
                        bkb.I.v("t".equals(vjbVar222.c) ? null : vjbVar222);
                        z6 = true;
                        bkb.s1(true);
                        if (!z4) {
                            fl5.z().M(Utilities.a(e.getAbsolutePath()) + "@100_100");
                        }
                    }
                    z7 = z6;
                    if (z7) {
                    }
                }
            }
            vjbVar222.k = this.n1;
            obj2 = this.D1;
            if (obj2 instanceof krc) {
            }
            j2 = this.L1;
            vjbVar222.n = j2;
            if (j2 != j) {
                vjbVar222.t = W1.wallpaper;
            }
            vjbVar222.o = z;
            na7.q1(this.currentAccount).C4(file2, vjbVar222, str == null && this.L1 == j, 0L);
            if (z5) {
            }
            z7 = z6;
            if (z7) {
            }
        }
        z3 = false;
        i = 4;
        if (this.H1) {
        }
        obj = this.D1;
        int i92222 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
        }
        vjb vjbVar2222 = new vjb();
        vjbVar2222.a = h2;
        vjbVar2222.b = h;
        vjbVar2222.c = str;
        vjbVar2222.i = this.H1;
        vjbVar2222.j = this.G1;
        vjbVar2222.d = i8;
        vjbVar2222.e = i4;
        vjbVar2222.f = i3;
        vjbVar2222.g = i5;
        vjbVar2222.h = i2;
        if (this.O1) {
        }
        vjbVar2222.k = this.n1;
        obj2 = this.D1;
        if (obj2 instanceof krc) {
        }
        j2 = this.L1;
        vjbVar2222.n = j2;
        if (j2 != j) {
        }
        vjbVar2222.o = z;
        na7.q1(this.currentAccount).C4(file2, vjbVar2222, str == null && this.L1 == j, 0L);
        if (z5) {
        }
        z7 = z6;
        if (z7) {
        }
    }

    public final void O0(boolean z) {
        byte b = this.b;
        if (b == 2) {
            if (z) {
                return;
            }
            finishFragment();
            return;
        }
        bkb.o();
        kk7.e().n(this, kk7.B4);
        zjb zjbVar = this.w;
        if (b == 1) {
            if (this.i0) {
                zjbVar.c = this.y;
                zjbVar.d = this.E;
                zjbVar.e = this.F;
                zjbVar.f = this.G;
                zjbVar.g = this.H;
                zjbVar.h = this.I;
                zjbVar.i = this.J;
                zjbVar.j = this.K;
                zjbVar.k = this.L;
                zjbVar.l = this.M;
                zjbVar.m = this.N;
                zjbVar.n = this.Q;
                zjbVar.o = this.P;
                zjbVar.p = this.O;
            }
            bkb.x1(this.g0, false, true, false, false, false);
        } else {
            if (zjbVar != null) {
                bkb.x1(this.g0, false, this.j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.j0) {
                akb akbVar = this.g0;
                if (akbVar.b != null && bkb.H.get(akbVar.k()) == null) {
                    new File(akbVar.b).delete();
                }
            }
        }
        if (z) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.h2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.i2;
        }
        WeakReference weakReference2 = this.h2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.h2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.i2 = null;
            return null;
        }
        this.h2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        gl.l2(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(createBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(createBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
        this.i2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r0.p == r6.n1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(boolean z) {
        if (this.b == 1) {
            zjb zjbVar = this.w;
            if (zjbVar.c == this.y && zjbVar.d == this.E && zjbVar.e == this.F && zjbVar.f == this.G && zjbVar.g == this.H && zjbVar.h == this.I && zjbVar.i == this.J && zjbVar.j == this.K && zjbVar.k == this.L && zjbVar.l == this.M && zjbVar.m == this.N && Math.abs(zjbVar.p - this.O) <= 0.001f && zjbVar.n == this.Q) {
                String str = zjbVar.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    if (this.Y0 != null) {
                        if (zjbVar.q == this.G1) {
                        }
                    }
                }
            }
            if (!z) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131745752, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131745753, null);
            alertDialog$Builder.j(k96.M0(2131745754, null), new hlb(this, (byte) 3));
            alertDialog$Builder.g(k96.M0(2131747387, null), new hlb(this, (byte) 4));
            showDialog(hdVar);
            return false;
        }
        return true;
    }

    public final void R0() {
        int themedColor;
        w42 w42Var = this.e;
        int i = 0;
        if (w42Var != null) {
            w42Var.I(getThemedColor(bkb.F8));
            this.e.O(getThemedColor(bkb.D8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(bkb.c6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        tb0 tb0Var = this.E0;
        if (tb0Var != null) {
            tb0Var.invalidate();
        }
        if (this.r1 != null) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var == null || ui5Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(bkb.g5));
            } else {
                this.parentLayout.getBottomSheet().L(getThemedColor(bkb.g5));
                if (this.b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().x0(-16777216);
                }
            }
        }
        if (this.L0 != null) {
            int i2 = 0;
            while (true) {
                rqc[] rqcVarArr = this.L0;
                if (i2 >= rqcVarArr.length) {
                    break;
                }
                rqc rqcVar = rqcVarArr[i2];
                if (rqcVar != null) {
                    rqcVar.invalidate();
                }
                i2++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                rqc[] rqcVarArr2 = this.M0;
                if (i >= rqcVarArr2.length) {
                    break;
                }
                rqc rqcVar2 = rqcVarArr2[i];
                if (rqcVar2 != null) {
                    rqcVar2.invalidate();
                }
                i++;
            }
        }
        TextView textView = this.g2;
        if (textView != null) {
            zkb.X(textView, bkb.F6, this.a);
        }
        p pVar = this.X;
        if (pVar != null) {
            pVar.invalidate();
        }
        un4 un4Var = this.r0;
        if (un4Var != null) {
            un4Var.updateColors();
        }
    }

    public final int S0() {
        return hc2.U(this.currentAccount, -this.L1) ? getMessagesController().k4.g2.f() : getMessagesController().k4.Y1.f();
    }

    public final ArrayList T0() {
        t00 t00Var = new t00(this, (byte) 22);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C8));
        arrayList.add(new blb(this.u0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.F8));
        arrayList.add(new blb(this.u0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.D8));
        p pVar = this.X;
        if (pVar != null) {
            r7 r7Var = pVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = pVar.F;
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                arrayList.add(new blb(editTextBoldCursorArr[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
                arrayList.add(new blb(editTextBoldCursorArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
                arrayList.add(new blb(editTextBoldCursorArr[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
            }
            arrayList.add(new blb(pVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.H5));
            if (r7Var != null) {
                t00 t00Var2 = new t00(pVar, (byte) 5);
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.F6));
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.D8));
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.E8));
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.F8));
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (frameLayoutArr != null) {
            for (int i2 = 0; i2 < frameLayoutArr.length; i2++) {
            }
            for (int i3 = 0; i3 < this.Q0.length; i3++) {
            }
            for (int i4 = 0; i4 < this.P0.length; i4++) {
            }
            for (int i5 = 0; i5 < this.O0.length; i5++) {
            }
            njb njbVar = this.T;
            njb njbVar2 = this.V;
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{njbVar, njbVar2}, (alb) null, bkb.tb));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{njbVar, njbVar2}, (alb) null, bkb.ub));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{njbVar, njbVar2}, (alb) null, bkb.vb));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((blb) arrayList.get(i6)).n = this.a;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001a, code lost:
    
        if (r4 != r2.j) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002c, code lost:
    
        r4 = r13.L;
        r9 = r13.N;
        r11 = r13.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        if (r4 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0038, code lost:
    
        if (r11 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003c, code lost:
    
        if (r9 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003e, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003f, code lost:
    
        if (r4 >= 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0041, code lost:
    
        if (r4 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0043, code lost:
    
        r5 = bkb.C0(bkb.Ee);
        r8 = r2.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        r10 = (int) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0060, code lost:
    
        if (r10 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0064, code lost:
    
        if (r8 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0066, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0068, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0069, code lost:
    
        if (r10 != r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004c, code lost:
    
        if (r4 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004e, code lost:
    
        r5 = bkb.C0(bkb.Fe);
        r8 = r2.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0057, code lost:
    
        r5 = bkb.C0(bkb.Ge);
        r8 = r2.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0084, code lost:
    
        if (r2.n != r13.Q) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0072, code lost:
    
        if (r4 != r2.k) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0078, code lost:
    
        if (r11 != r2.l) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x007e, code lost:
    
        if (r9 != r2.m) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x002a, code lost:
    
        if (r5 == r4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(int i) {
        if (!this.i0) {
            zjb zjbVar = this.w;
            if (i == 1 || i == 2) {
                long j = this.K;
                if (j == 0) {
                    int C0 = bkb.C0(bkb.De);
                    int i2 = (int) zjbVar.j;
                    if (i2 == 0) {
                        i2 = C0;
                    }
                }
            }
            if (i == 1 || i == 3) {
                if (this.y == zjbVar.d) {
                    int i3 = zjbVar.e;
                    int i4 = this.F;
                    if (i4 == 0 ? i3 == 0 || i3 == zjbVar.c : i4 == i3) {
                        int i5 = zjbVar.f;
                        int i6 = this.G;
                        if (i6 == 0 ? i5 == 0 : i6 == i5) {
                            int i7 = zjbVar.g;
                            int i8 = this.H;
                            if (i8 == 0 ? i7 == 0 : i8 == i7) {
                                int i9 = zjbVar.h;
                                int i10 = this.I;
                                if (i10 == 0 ? i9 == 0 : i10 == i9) {
                                    if (this.J == zjbVar.i) {
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean V0() {
        ui5 ui5Var = this.parentLayout;
        return (ui5Var == null || ui5Var.getBottomSheet() == null) ? false : true;
    }

    public final void W0() {
        jo0 jo0Var = this.S1;
        if (jo0Var != null) {
            jo0Var.invalidate();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0.getChildAt(i).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                this.B0.getChildAt(i2).invalidate();
            }
        }
        if (this.L0 != null) {
            int i3 = 0;
            while (true) {
                rqc[] rqcVarArr = this.L0;
                if (i3 >= rqcVarArr.length) {
                    break;
                }
                rqc rqcVar = rqcVarArr[i3];
                if (rqcVar != null) {
                    rqcVar.setDimAmount(this.O1 ? this.p1 * this.q1 : 0.0f);
                    this.L0[i3].invalidate();
                }
                i3++;
            }
        }
        if (this.p0 != null) {
            for (int i4 = 0; i4 < this.p0.getChildCount(); i4++) {
                View childAt = this.p0.getChildAt(i4);
                if (childAt instanceof uk1) {
                    h1((uk1) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.w0 != null) {
            for (int i5 = 0; i5 < this.w0.getChildCount(); i5++) {
                View childAt2 = this.w0.getChildAt(i5);
                if (childAt2 instanceof uk1) {
                    h1((uk1) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        hmb hmbVar = this.B1;
        if (hmbVar != null) {
            hmbVar.invalidate();
        }
        hmb hmbVar2 = this.C1;
        if (hmbVar2 != null) {
            hmbVar2.invalidate();
        }
        tb0 tb0Var = this.E0;
        if (tb0Var != null) {
            tb0Var.invalidate();
        }
    }

    public final void X0(ng1 ng1Var) {
        if (getParentActivity() == null) {
            return;
        }
        h26 h26Var = new h26(23, this.currentAccount, this.a, getParentActivity(), this);
        h26Var.r1(ng1Var);
        h26Var.q1(this.X1, true);
        h26Var.s1(this.L1);
        if (!V0()) {
            h26Var.L2 = new flb(this, (byte) 1);
        }
        showDialog(h26Var);
    }

    public final void Y0() {
        akb akbVar = bkb.M;
        if (akbVar == null) {
            return;
        }
        int i = akbVar.a0;
        zjb i2 = i >= 0 ? (zjb) akbVar.b0.get(i) : akbVar.i(false);
        if (this.w != null) {
            a1();
            bkb.x1(this.g0, true, false, false, false, false);
            if (bkb.M != null) {
                bkb.O = false;
                bkb.P = false;
                bkb.M = null;
            }
            bkb.t(this.g0, true, this.h0);
            ((ActionBarLayout) this.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) this.parentLayout).W(false, false);
            File file = new File(this.g0.b);
            akb akbVar2 = this.g0;
            bkb.u(file, akbVar2.a, akbVar2.G, false);
            na7.q1(this.g0.F).z4(this.g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", this.g0.k());
            edit.commit();
        }
        d dVar = (d) getParentLayout().getFragmentStack().get(Math.max(0, getParentLayout().getFragmentStack().size() - 2));
        finishFragment();
        if (this.b == 0) {
            kk7.e().k(kk7.r4, akbVar, i2, Boolean.valueOf(this.j0));
        }
        bkb.K1(dVar);
    }

    public final /* synthetic */ void Z0(TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        boolean z = tLObject instanceof TL_account.TL_wallPapers;
        zjb zjbVar = this.w;
        byte b = 0;
        if (z) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            this.W0.clear();
            HashMap hashMap = this.X0;
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (tL_wallPapers.wallpapers.get(i) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            this.W0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (zjbVar != null && (str = zjbVar.o) != null && str.equals(tL_wallPaper2.slug)) {
                            this.Y0 = tL_wallPaper2;
                            f1(false);
                            n1();
                        } else if (zjbVar == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z2 = true;
                    }
                }
            }
            if (!z2 && (tL_wallPaper = this.Y0) != null) {
                this.W0.add(0, tL_wallPaper);
            }
            omb ombVar = this.S0;
            if (ombVar != null) {
                ombVar.f();
            }
            ad7.Y(this.currentAccount).m1(1, tL_wallPapers.wallpapers);
        }
        if (this.Y0 != null || zjbVar == null || TextUtils.isEmpty(zjbVar.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = zjbVar.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(getConnectionsManager().sendRequest(getwallpaper, new llb(this, b)), this.classGuid);
    }

    public final void a1() {
        TLRPC.TL_wallPaper tL_wallPaper;
        zjb zjbVar = this.w;
        if (zjbVar == null || TextUtils.isEmpty(zjbVar.o) || (tL_wallPaper = this.Y0) == null || tL_wallPaper.document == null) {
            return;
        }
        try {
            ba4.G(this.currentAccount);
            zqc.e(ng5.c(zjbVar.o), new c4b(ba4.J(this.Y0.document, null, true, true), (byte) 3));
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.h5));
        hashSet.add(Integer.valueOf(bkb.g5));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.dc));
        hashSet.add(Integer.valueOf(bkb.ee));
        hashSet.add(Integer.valueOf(bkb.ic));
        hashSet.add(Integer.valueOf(bkb.de));
        hashSet.add(Integer.valueOf(bkb.Vb));
        hashSet.add(Integer.valueOf(bkb.Qd));
        hashSet.add(Integer.valueOf(bkb.Tb));
        hashSet.add(Integer.valueOf(bkb.Od));
        hashSet.add(Integer.valueOf(bkb.Qb));
        hashSet.add(Integer.valueOf(bkb.Kd));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.Uc));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.Jj));
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.Je));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.A8));
    }

    public final void b1() {
        c1(2, true);
    }

    public final void c1(int i, boolean z) {
        zjb zjbVar;
        int i2;
        if (getParentActivity() == null || this.n == i || this.t1 != null || (zjbVar = this.w) == null) {
            return;
        }
        if (z && i == 2 && (bkb.a1() || zjbVar.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131752538, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (!bkb.a1() || (bkb.a1() && bkb.I.j0.d != 0)) {
                hdVar.U = k96.M0(2131752537, null);
                alertDialog$Builder.j(k96.M0(2131745925, null), new hlb(this, (byte) 5));
                alertDialog$Builder.g(k96.M0(2131751759, null), new hlb(this, (byte) 6));
            } else {
                hdVar.U = k96.M0(2131752517, null);
                alertDialog$Builder.j(k96.M0(2131752540, null), new hlb(this, (byte) 7));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
            }
            showDialog(hdVar);
            return;
        }
        int i3 = this.n;
        this.n = i;
        if (i == 1) {
            i2 = i3;
            this.h.setText(k96.M0(2131752003, null));
            int i4 = zjbVar.d != 0 ? 2 : 1;
            p pVar = this.X;
            U0(1);
            pVar.f(1, 2, i4, false);
            this.X.e(zjbVar.c, 0);
            int i5 = zjbVar.d;
            if (i5 != 0) {
                this.X.e(i5, 1);
            }
            if (i2 == 2 || (i2 == 3 && zjbVar.g != 0)) {
                this.x0.r(0);
            }
        } else if (i != 2) {
            if (i == 3) {
                this.h.setText(k96.M0(2131752002, null));
                int i6 = zjbVar.f != 0 ? zjbVar.h != 0 ? 4 : zjbVar.g != 0 ? 3 : 2 : 1;
                p pVar2 = this.X;
                U0(3);
                pVar2.f(2, 4, i6, true);
                this.X.e(zjbVar.h, 3);
                this.X.e(zjbVar.g, 2);
                this.X.e(zjbVar.f, 1);
                p pVar3 = this.X;
                int i7 = zjbVar.e;
                if (i7 == 0) {
                    i7 = zjbVar.c;
                }
                pVar3.e(i7, 0);
                this.M0[1].b(0, zjbVar.e);
                this.M0[1].b(1, zjbVar.f);
                this.M0[1].b(2, zjbVar.g);
                this.M0[1].b(3, zjbVar.h);
                if (zjbVar.g != 0) {
                    mmb mmbVar = this.x0;
                    if (i3 == 1) {
                        mmbVar.i(0);
                    } else {
                        mmbVar.g(0);
                    }
                } else if (i3 == 2) {
                    this.x0.r(0);
                }
                this.w0.x0(0, gl.L(60.0f), null);
                i1();
            }
            i2 = i3;
        } else {
            this.h.setText(k96.M0(2131752004, null));
            int themedColor = getThemedColor(bkb.De);
            int i8 = bkb.Ee;
            int themedColor2 = bkb.d1(i8) ? getThemedColor(i8) : 0;
            int i9 = bkb.Fe;
            int themedColor3 = bkb.d1(i9) ? getThemedColor(i9) : 0;
            int i10 = bkb.Ge;
            int themedColor4 = bkb.d1(i10) ? getThemedColor(i10) : 0;
            long j = zjbVar.k;
            int i11 = (int) j;
            if (i11 == 0 && j != 0) {
                themedColor2 = 0;
            }
            long j2 = zjbVar.l;
            int i12 = (int) j2;
            if (i12 == 0 && j2 != 0) {
                themedColor3 = 0;
            }
            long j3 = zjbVar.m;
            int i13 = (int) j3;
            if (i13 == 0 && j3 != 0) {
                themedColor4 = 0;
            }
            int i14 = (int) zjbVar.j;
            int i15 = (i11 == 0 && themedColor2 == 0) ? 1 : (i13 == 0 && themedColor4 == 0) ? (i12 == 0 && themedColor3 == 0) ? 2 : 3 : 4;
            p pVar4 = this.X;
            U0(2);
            pVar4.f(2, 4, i15, false);
            p pVar5 = this.X;
            if (i13 == 0) {
                i13 = themedColor4;
            }
            pVar5.e(i13, 3);
            p pVar6 = this.X;
            if (i12 == 0) {
                i12 = themedColor3;
            }
            pVar6.e(i12, 2);
            p pVar7 = this.X;
            if (i11 == 0) {
                i11 = themedColor2;
            }
            pVar7.e(i11, 1);
            p pVar8 = this.X;
            if (i14 != 0) {
                themedColor = i14;
            }
            pVar8.e(themedColor, 0);
            i2 = i3;
            if (i2 == 1 || zjbVar.g == 0) {
                this.x0.i(0);
            } else {
                this.x0.g(0);
            }
            this.w0.x0(0, gl.L(60.0f), null);
        }
        if (i != 1 && i != 3) {
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
            return;
        }
        if (i2 == 2 && this.N0[1].getVisibility() == 0) {
            j1(0, true, true);
        }
        if (i != 1) {
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
            return;
        }
        boolean o = this.g0.o();
        p pVar9 = this.X;
        if (o) {
            pVar9.setMinBrightness(0.2f);
        } else {
            pVar9.setMinBrightness(0.05f);
            this.X.setMaxBrightness(0.8f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x090c A[EDGE_INSN: B:246:0x090c->B:247:0x090c BREAK  A[LOOP:2: B:196:0x0827->B:223:0x0904], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0da0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0 A[LOOP:0: B:45:0x019c->B:47:0x01a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb A[EDGE_INSN: B:48:0x01cb->B:49:0x01cb BREAK  A[LOOP:0: B:45:0x019c->B:47:0x01a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0e3d  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v21 */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z;
        ui5 ui5Var;
        final byte b;
        byte b2;
        int i;
        gmb[] gmbVarArr;
        boolean z2;
        int i2;
        float f;
        int i3;
        int i4;
        Object obj;
        int i5;
        byte b3;
        int i6;
        final int i7;
        slb slbVar;
        byte b4;
        final int i8;
        FrameLayout.LayoutParams e;
        float f2;
        float f3;
        akb akbVar;
        ?? r14;
        final byte b5;
        ui5 ui5Var2;
        int i9;
        this.T.p = getResourceProvider();
        this.U.p = getResourceProvider();
        this.V.p = getResourceProvider();
        this.W.p = getResourceProvider();
        byte b6 = 1;
        this.hasOwnBackground = true;
        imb imbVar = this.r1;
        byte b7 = 0;
        boolean z3 = (imbVar == null || this.L1 == 0) ? false : true;
        this.N1 = z3;
        if (z3) {
            Object obj2 = this.D1;
            if (!(obj2 instanceof lrc)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z = true;
            this.O1 = z;
            if (z) {
                this.q1 = imbVar.a() ? 1.0f : 0.0f;
            }
            ui5Var = this.parentLayout;
            if (ui5Var != null && ((ActionBarLayout) ui5Var).y()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.o0 = new FrameLayout(context);
            b = 3;
            if (this.O1 && gba.R < 3) {
                gl.e3(new flb(this, b), 2000L);
            }
            this.actionBar.t().a(0, R.drawable.outline_header_search).M().K(new cmb()).setSearchFieldHint(k96.L0(2131745644));
            this.actionBar.setBackButtonDrawable(new a07());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(k96.L0(2131743931));
            zab zabVar = new zab(b6, context, this);
            this.o0 = zabVar;
            zkb.h(bkb.c6, getResourceProvider(), zabVar);
            this.o0.addView(this.actionBar, nme.c(-2.0f, -1));
            o39 o39Var = new o39(context);
            this.p0 = o39Var;
            o39Var.setVerticalScrollBarEnabled(true);
            this.p0.setItemAnimator(null);
            this.p0.setLayoutAnimation(null);
            this.p0.setLayoutManager(new t26(1, false));
            final byte b8 = 2;
            this.p0.setVerticalScrollbarPosition(!k96.a0 ? 1 : 2);
            o39 o39Var2 = this.p0;
            b2 = this.b;
            o39Var2.setPadding(0, 0, 0, gl.L(b2 == 0 ? 12.0f : 0.0f));
            this.p0.setOnItemClickListener(new l5(b7));
            this.o0.addView(this.p0, nme.e(-1, -1, 51));
            un4 un4Var = new un4(context, this.resourceProvider);
            this.r0 = un4Var;
            un4Var.setImageResource(R.drawable.floating_pencil);
            this.o0.addView(this.r0, un4.b());
            s20 s20Var = new s20(context);
            this.q0 = s20Var;
            this.p0.setAdapter(s20Var);
            this.v0 = new k7(b, context, this);
            this.x0 = new mmb(this, context);
            this.u0 = createActionBar(context);
            if (gl.O1()) {
                this.u0.setOccupyStatusBar(false);
            }
            this.u0.setBackButtonDrawable(new ed0(false));
            this.u0.setActionBarMenuOnItemClick(new fmb(this));
            i = 0;
            while (true) {
                gmbVarArr = this.y0;
                if (i < 2) {
                    break;
                }
                gmbVarArr[i] = new gmb(this, (Activity) getContext());
                this.v0.addView(gmbVarArr[i], nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i++;
            }
            gmb gmbVar = gmbVarArr[0];
            this.z0 = gmbVar;
            gmbVar.setVisibility(0);
            gmbVarArr[1].setVisibility(8);
            if (b2 == 2) {
                this.z0.getImageReceiver().h1 = new hlb(this, b7);
            }
            z2 = this.x0.e;
            akb akbVar2 = this.g0;
            final byte b9 = 4;
            if (!z2) {
                this.u0.setTitle("Telegram Beta Chat");
                this.u0.setSubtitle(k96.G(505, "Members", new Object[0]));
            } else if (b2 == 2) {
                long j = this.L1;
                a aVar = this.u0;
                if (j != 0) {
                    aVar.setTitle(k96.L0(2131742689));
                } else {
                    aVar.setTitle(k96.L0(2131753738));
                }
                r6 t = this.u0.t();
                Object obj3 = this.D1;
                if ((obj3 instanceof lrc) && ((lrc) obj3).e != null) {
                    t.a(7, R.drawable.msg_header_draw);
                }
                if (this.L1 == 0) {
                    boolean z4 = w01.a;
                    Object obj4 = this.D1;
                    if (((obj4 instanceof krc) && !"d".equals(((krc) obj4).a)) || (this.D1 instanceof TLRPC.TL_wallPaper)) {
                        t.a(5, R.drawable.msg_header_share);
                    }
                }
                if (this.L1 != 0 && this.N1) {
                    oy8 oy8Var = new oy8(R.raw.sun, gl.L(28.0f), gl.L(28.0f), true, null);
                    this.P1 = oy8Var;
                    this.Q1 = t.d(6, oy8Var);
                    this.P1.h = true;
                    imb imbVar2 = this.r1;
                    if (imbVar2 == null || imbVar2.a()) {
                        this.P1.H(35);
                        this.P1.K(36);
                    } else {
                        this.P1.K(0);
                        this.P1.H(0);
                    }
                    this.P1.a0 = true;
                    int u0 = bkb.u0(bkb.I9);
                    this.P1.L(u0, "Sunny");
                    this.P1.L(u0, "Path 6");
                    this.P1.L(u0, "Path");
                    this.P1.L(u0, "Path 5");
                    this.P1.j();
                }
            } else if (b2 == 1) {
                r6 t2 = this.u0.t();
                this.f = t2.e(4, k96.L0(2131745754));
                w42 w42Var = new w42(this, context, t2);
                this.e = w42Var;
                w42Var.setSubMenuOpenSide(1);
                this.e.g(2, k96.L0(2131752004));
                this.e.g(1, k96.L0(2131752003));
                this.e.g(3, k96.L0(2131752002));
                w42 w42Var2 = this.e;
                w42Var2.S = false;
                w42Var2.setForceSmoothKeyboard(true);
                this.u0.addView(this.e, nme.d(-2, -1.0f, 51, gl.O1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: glb
                    public final /* synthetic */ qmb b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b10 = b8;
                        qmb qmbVar = this.b;
                        switch (b10) {
                            case 0:
                                qmbVar.O0(false);
                                break;
                            case 1:
                                qmbVar.Y0();
                                break;
                            case 2:
                                qmbVar.e.U(null, null);
                                break;
                            case 3:
                                qmbVar.N0(false);
                                break;
                            default:
                                qmbVar.N0(true);
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
                int i10 = bkb.z8;
                zkb.X(textView2, i10, getResourceProvider());
                this.h.setTypeface(gl.o());
                this.h.setText(k96.L0(2131752003));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                zkb.x(this.h, mutate, i10, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(gl.L(4.0f));
                this.h.setPadding(0, 0, gl.L(10.0f), 0);
                this.e.addView(this.h, nme.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = akbVar2.G;
                String l = tL_theme != null ? tL_theme.title : akbVar2.l();
                int lastIndexOf = l.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    l = l.substring(0, lastIndexOf);
                }
                this.u0.setTitle(l);
                TLRPC.TL_theme tL_theme2 = akbVar2.G;
                if (tL_theme2 == null || (i2 = tL_theme2.installs_count) <= 0) {
                    this.u0.setSubtitle(k96.w((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.u0.setSubtitle(k96.G(i2, "ThemeInstallCount", new Object[0]));
                }
            }
            this.w0 = new nlb(this, context);
            olb olbVar = new olb(this);
            olbVar.C = false;
            this.w0.setItemAnimator(olbVar);
            this.w0.setVerticalScrollBarEnabled(true);
            this.w0.setOverScrollMode(2);
            nlb nlbVar = this.w0;
            if (b2 != 2) {
                nlbVar.setPadding(0, gl.L(4.0f), 0, (gl.L(72 + ((this.M1 || this.L1 <= 0) ? 0 : 58)) - 12) + (V0() ? gl.n : 0));
            } else if (b2 == 1) {
                nlbVar.setPadding(0, gl.L(4.0f), 0, gl.L(16.0f));
            } else {
                nlbVar.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
            }
            this.w0.setClipToPadding(false);
            this.w0.setLayoutManager(new t26(1, true));
            this.w0.setVerticalScrollbarPosition(!k96.a0 ? 1 : 2);
            k7 k7Var = this.v0;
            nlb nlbVar2 = this.w0;
            if (b2 != 1) {
                k7Var.addView(nlbVar2, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.w0.setOnItemClickListener(new hlb(this, b6));
                f = 16.0f;
                i3 = -1;
            } else {
                f = 16.0f;
                i3 = -1;
                k7Var.addView(nlbVar2, nme.e(-1, -1, 51));
            }
            this.w0.setOnScrollListener(new vdb(this, b6));
            this.v0.addView(this.u0, nme.c(-2.0f, i3));
            brc brcVar = new brc(context);
            this.x1 = brcVar;
            brcVar.n = new hlb(this, b8);
            zjb zjbVar = this.w;
            if (b2 != 1 || b2 == 2) {
                if (b2 != 2) {
                    tb0 tb0Var = new tb0(this, context, V0());
                    this.E0 = tb0Var;
                    tb0Var.setWillNotDraw(false);
                    i4 = 2;
                    this.E0.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f) + (V0() ? gl.n : 0));
                    this.v0.addView(this.E0, nme.e(-1, 0, 81));
                    hmb hmbVar = new hmb(this, context);
                    this.B1 = hmbVar;
                    ote.b(hmbVar, 0.033f, 1.2f);
                    l1(false);
                    this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: glb
                        public final /* synthetic */ qmb b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b10 = b;
                            qmb qmbVar = this.b;
                            switch (b10) {
                                case 0:
                                    qmbVar.O0(false);
                                    break;
                                case 1:
                                    qmbVar.Y0();
                                    break;
                                case 2:
                                    qmbVar.e.U(null, null);
                                    break;
                                case 3:
                                    qmbVar.N0(false);
                                    break;
                                default:
                                    qmbVar.N0(true);
                                    break;
                            }
                        }
                    });
                    if (this.L1 <= 0 || this.M1 || this.s0 != null) {
                        this.E0.addView(this.B1, nme.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        hmb hmbVar2 = new hmb(this, context);
                        this.C1 = hmbVar2;
                        ote.b(hmbVar2, 0.033f, 1.2f);
                        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.L1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().p()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new cm2(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) k96.Z(2131754208, l7c.q(V1)));
                        this.C1.c(spannableStringBuilder);
                        try {
                            hmb hmbVar3 = this.C1;
                            hmbVar3.c(vu3.l(hmbVar3.a(), this.C1.a.g(), false));
                        } catch (Exception unused) {
                        }
                        this.C1.setOnClickListener(new View.OnClickListener(this) { // from class: glb
                            public final /* synthetic */ qmb b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b10 = b9;
                                qmb qmbVar = this.b;
                                switch (b10) {
                                    case 0:
                                        qmbVar.O0(false);
                                        break;
                                    case 1:
                                        qmbVar.Y0();
                                        break;
                                    case 2:
                                        qmbVar.e.U(null, null);
                                        break;
                                    case 3:
                                        qmbVar.N0(false);
                                        break;
                                    default:
                                        qmbVar.N0(true);
                                        break;
                                }
                            }
                        });
                        this.E0.addView(this.B1, nme.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.E0.addView(this.C1, nme.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.O1) {
                        jo0 jo0Var = new jo0(this, (Activity) getContext());
                        this.S1 = jo0Var;
                        jo0Var.setPadding(gl.L(f), gl.L(f), gl.L(f), gl.L(f));
                        this.v0.addView(this.S1, nme.e(kk7.y3, 76, 49));
                        plb plbVar = new plb(getContext(), 3);
                        this.T1 = plbVar;
                        plbVar.c(this.p1);
                        this.T1.b();
                        plb plbVar2 = this.T1;
                        plbVar2.h = new ilb(this, b7);
                        this.S1.addView(plbVar2);
                        imb imbVar3 = this.r1;
                        if (imbVar3 != null) {
                            this.T1.setVisibility(imbVar3.a() ? 0 : 8);
                            this.T1.setAlpha(this.r1.a() ? 1.0f : 0.0f);
                            this.T1.c(this.r1.a() ? this.p1 : 0.0f);
                        }
                    }
                } else {
                    i4 = 2;
                }
                Rect rect = new Rect();
                Drawable d = b00.d(context, R.drawable.sheet_shadow_round);
                this.r = d;
                d.getPadding(rect);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(bkb.c6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                de9.p(new TextPaint(1), gl.L(14.0f));
                obj = this.D1;
                if (b2 != 1 || (obj instanceof krc)) {
                    if ((obj instanceof krc) || !"d".equals(((krc) obj).a)) {
                        i5 = 3;
                        String[] strArr = new String[i5];
                        int[] iArr = new int[i5];
                        this.L0 = new rqc[i5];
                        if (i5 != 0) {
                            this.A0 = new FrameLayout(context);
                            if (b2 == 1 || (this.D1 instanceof krc)) {
                                strArr[0] = k96.L0(2131753742);
                                strArr[1] = k96.L0(2131753739);
                                strArr[i4] = k96.L0(2131753740);
                            } else {
                                strArr[0] = k96.L0(2131753747);
                                strArr[1] = k96.L0(2131753740);
                            }
                            int i11 = 0;
                            i6 = 0;
                            while (i11 < i5) {
                                byte b10 = b6;
                                int i12 = i11;
                                int ceil = (int) Math.ceil(r10.measureText(strArr[i11]));
                                iArr[i12] = ceil;
                                i6 = Math.max(i6, ceil);
                                i11 = i12 + 1;
                                b6 = b10;
                            }
                            b3 = b6;
                            qlb qlbVar = new qlb(this, context, (byte) 0);
                            this.F0 = qlbVar;
                            qlbVar.setWillNotDraw(false);
                            this.F0.setVisibility(this.d1 != 0 ? 0 : 4);
                            this.F0.setScaleX(this.d1 != 0 ? 1.0f : 0.1f);
                            this.F0.setScaleY(this.d1 != 0 ? 1.0f : 0.1f);
                            this.F0.setAlpha(this.d1 != 0 ? 1.0f : 0.0f);
                            this.F0.setTag(this.d1 != 0 ? Integer.valueOf(b3) : null);
                            this.A0.addView(this.F0, nme.e(48, 48, 17));
                            this.F0.setOnClickListener(new rlb(this, (byte) 0));
                            ImageView imageView = new ImageView(context);
                            this.H0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.H0.setImageResource(R.drawable.bg_rotate_large);
                            this.F0.addView(this.H0, nme.e(-2, -2, 17));
                        } else {
                            b3 = 1;
                            i6 = 0;
                        }
                        i7 = 0;
                        while (true) {
                            slbVar = this.a;
                            if (i7 >= i5) {
                                break;
                            }
                            this.L0[i7] = new rqc(context, ((b2 == b3 || (this.D1 instanceof krc)) && i7 == 0) ? false : true, this.z0, slbVar);
                            this.L0[i7].setBackgroundColor(this.b1);
                            rqc rqcVar = this.L0[i7];
                            String str = strArr[i7];
                            int i13 = iArr[i7];
                            rqcVar.f = str;
                            rqcVar.h = i13;
                            rqcVar.n = i6;
                            int i14 = 1;
                            if (b2 != 1) {
                                if (this.D1 instanceof krc) {
                                    i14 = 1;
                                } else {
                                    rqcVar.a(i7 == 0 ? this.H1 : this.G1, false);
                                    int L = gl.L(56.0f) + i6;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, -2);
                                    layoutParams.gravity = 17;
                                    if (i5 != 3) {
                                        if (i7 == 0 || i7 == 2) {
                                            layoutParams.leftMargin = gl.L(10.0f) + (L / 2);
                                        } else {
                                            layoutParams.rightMargin = gl.L(10.0f) + (L / 2);
                                        }
                                    } else if (i7 == 1) {
                                        layoutParams.leftMargin = gl.L(10.0f) + (L / 2);
                                    } else {
                                        layoutParams.rightMargin = gl.L(10.0f) + (L / 2);
                                    }
                                    this.A0.addView(this.L0[i7], layoutParams);
                                    final rqc rqcVar2 = this.L0[i7];
                                    final byte b11 = 0;
                                    rqcVar2.setOnClickListener(new View.OnClickListener(this) { // from class: jlb
                                        public final /* synthetic */ qmb b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b12 = b11;
                                            rqc rqcVar3 = rqcVar2;
                                            int i15 = i7;
                                            qmb qmbVar = this.b;
                                            switch (b12) {
                                                case 0:
                                                    byte b13 = qmbVar.b;
                                                    FrameLayout[] frameLayoutArr = qmbVar.N0;
                                                    if (qmbVar.A0.getAlpha() == 1.0f && qmbVar.t1 == null) {
                                                        if ((b13 != 1 && !(qmbVar.D1 instanceof krc)) || i15 != 2) {
                                                            if (i15 != 1 || (b13 != 1 && !(qmbVar.D1 instanceof krc))) {
                                                                if (!(qmbVar.D1 instanceof krc)) {
                                                                    if (b13 != 1) {
                                                                        rqcVar3.a(!rqcVar3.s, true);
                                                                        boolean z5 = rqcVar3.s;
                                                                        if (i15 != 0) {
                                                                            qmbVar.G1 = z5;
                                                                            qmbVar.x1.b(z5);
                                                                            qmbVar.M0();
                                                                            break;
                                                                        } else {
                                                                            qmbVar.H1 = z5;
                                                                            if (z5) {
                                                                                qmbVar.z0.getImageReceiver().V0 = true;
                                                                            }
                                                                            qmbVar.m1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    qmbVar.j1(i15, frameLayoutArr[i15].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (qmbVar.L0[1].s) {
                                                                    qmbVar.a1 = qmbVar.Y0;
                                                                    qmbVar.z0.setImageDrawable(null);
                                                                    qmbVar.Y0 = null;
                                                                    qmbVar.G1 = false;
                                                                    qmbVar.n1();
                                                                    qmbVar.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (b13 == 1) {
                                                                            qmbVar.j1(0, true, true);
                                                                        } else {
                                                                            qmbVar.j1(i15, frameLayoutArr[i15].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    qmbVar.d1(qmbVar.a1 != null ? -1 : 0);
                                                                    if (b13 == 1) {
                                                                        qmbVar.j1(1, true, true);
                                                                    } else {
                                                                        qmbVar.j1(i15, frameLayoutArr[i15].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                qmbVar.L0[1].a(qmbVar.Y0 != null, true);
                                                                qmbVar.r1();
                                                                qmbVar.R0.h1();
                                                                qmbVar.p1();
                                                                break;
                                                            }
                                                        } else {
                                                            rqcVar3.a(!rqcVar3.s, true);
                                                            boolean z6 = rqcVar3.s;
                                                            qmbVar.G1 = z6;
                                                            qmbVar.x1.b(z6);
                                                            qmbVar.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (qmbVar.B0.getAlpha() == 1.0f && i15 == 0) {
                                                        rqcVar3.a(!rqcVar3.s, true);
                                                        qmbVar.w.i = rqcVar3.s;
                                                        bkb.r1(true, true);
                                                        qmbVar.w0.h1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i7 != 2) {
                                        this.L0[i7].setAlpha(0.0f);
                                        this.L0[i7].setVisibility(4);
                                    }
                                    i7++;
                                    i4 = 2;
                                    b3 = 1;
                                }
                            }
                            if (i7 == i14) {
                                rqcVar.a((this.Y0 == null && (zjbVar == null || TextUtils.isEmpty(zjbVar.o))) ? false : true, false);
                            } else if (i7 == i4) {
                                rqcVar.a(this.G1, false);
                            }
                            int L2 = gl.L(56.0f) + i6;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L2, -2);
                            layoutParams2.gravity = 17;
                            if (i5 != 3) {
                            }
                            this.A0.addView(this.L0[i7], layoutParams2);
                            final rqc rqcVar22 = this.L0[i7];
                            final byte b112 = 0;
                            rqcVar22.setOnClickListener(new View.OnClickListener(this) { // from class: jlb
                                public final /* synthetic */ qmb b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b12 = b112;
                                    rqc rqcVar3 = rqcVar22;
                                    int i15 = i7;
                                    qmb qmbVar = this.b;
                                    switch (b12) {
                                        case 0:
                                            byte b13 = qmbVar.b;
                                            FrameLayout[] frameLayoutArr = qmbVar.N0;
                                            if (qmbVar.A0.getAlpha() == 1.0f && qmbVar.t1 == null) {
                                                if ((b13 != 1 && !(qmbVar.D1 instanceof krc)) || i15 != 2) {
                                                    if (i15 != 1 || (b13 != 1 && !(qmbVar.D1 instanceof krc))) {
                                                        if (!(qmbVar.D1 instanceof krc)) {
                                                            if (b13 != 1) {
                                                                rqcVar3.a(!rqcVar3.s, true);
                                                                boolean z5 = rqcVar3.s;
                                                                if (i15 != 0) {
                                                                    qmbVar.G1 = z5;
                                                                    qmbVar.x1.b(z5);
                                                                    qmbVar.M0();
                                                                    break;
                                                                } else {
                                                                    qmbVar.H1 = z5;
                                                                    if (z5) {
                                                                        qmbVar.z0.getImageReceiver().V0 = true;
                                                                    }
                                                                    qmbVar.m1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            qmbVar.j1(i15, frameLayoutArr[i15].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (qmbVar.L0[1].s) {
                                                            qmbVar.a1 = qmbVar.Y0;
                                                            qmbVar.z0.setImageDrawable(null);
                                                            qmbVar.Y0 = null;
                                                            qmbVar.G1 = false;
                                                            qmbVar.n1();
                                                            qmbVar.M0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (b13 == 1) {
                                                                    qmbVar.j1(0, true, true);
                                                                } else {
                                                                    qmbVar.j1(i15, frameLayoutArr[i15].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            qmbVar.d1(qmbVar.a1 != null ? -1 : 0);
                                                            if (b13 == 1) {
                                                                qmbVar.j1(1, true, true);
                                                            } else {
                                                                qmbVar.j1(i15, frameLayoutArr[i15].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        qmbVar.L0[1].a(qmbVar.Y0 != null, true);
                                                        qmbVar.r1();
                                                        qmbVar.R0.h1();
                                                        qmbVar.p1();
                                                        break;
                                                    }
                                                } else {
                                                    rqcVar3.a(!rqcVar3.s, true);
                                                    boolean z6 = rqcVar3.s;
                                                    qmbVar.G1 = z6;
                                                    qmbVar.x1.b(z6);
                                                    qmbVar.M0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (qmbVar.B0.getAlpha() == 1.0f && i15 == 0) {
                                                rqcVar3.a(!rqcVar3.s, true);
                                                qmbVar.w.i = rqcVar3.s;
                                                bkb.r1(true, true);
                                                qmbVar.w0.h1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i7 != 2) {
                            }
                            i7++;
                            i4 = 2;
                            b3 = 1;
                        }
                        b4 = b3;
                        if (b2 == b4) {
                            int[] iArr2 = new int[2];
                            this.M0 = new rqc[2];
                            this.B0 = new FrameLayout(context);
                            String[] strArr2 = {k96.L0(2131753749), k96.L0(2131753742)};
                            int i15 = 0;
                            int i16 = 0;
                            for (int i17 = 2; i15 < i17; i17 = 2) {
                                int ceil2 = (int) Math.ceil(r10.measureText(strArr2[i15]));
                                iArr2[i15] = ceil2;
                                i16 = Math.max(i16, ceil2);
                                i15++;
                            }
                            if (zjbVar != null) {
                                qlb qlbVar2 = new qlb(this, context, (byte) 1);
                                this.G0 = qlbVar2;
                                qlbVar2.setWillNotDraw(false);
                                this.G0.setVisibility(zjbVar.f != 0 ? 0 : 4);
                                this.G0.setScaleX(zjbVar.f != 0 ? 1.0f : 0.1f);
                                this.G0.setScaleY(zjbVar.f != 0 ? 1.0f : 0.1f);
                                this.G0.setAlpha(zjbVar.f != 0 ? 1.0f : 0.0f);
                                this.B0.addView(this.G0, nme.e(48, 48, 17));
                                this.G0.setOnClickListener(new rlb(this, (byte) 1));
                                ImageView imageView2 = new ImageView(context);
                                this.I0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.I0.setImageResource(R.drawable.bg_rotate_large);
                                this.G0.addView(this.I0, nme.e(-2, -2, 17));
                                final int i18 = 0;
                                while (i18 < 2) {
                                    this.M0[i18] = new rqc(context, i18 == 0, this.z0, slbVar);
                                    rqc rqcVar3 = this.M0[i18];
                                    String str2 = strArr2[i18];
                                    int i19 = iArr2[i18];
                                    rqcVar3.f = str2;
                                    rqcVar3.h = i19;
                                    rqcVar3.n = i16;
                                    if (i18 == 0) {
                                        rqcVar3.a(zjbVar.i, false);
                                    }
                                    int L3 = gl.L(56.0f) + i16;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(L3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i18 == 1) {
                                        layoutParams3.leftMargin = gl.L(10.0f) + (L3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = gl.L(10.0f) + (L3 / 2);
                                    }
                                    this.B0.addView(this.M0[i18], layoutParams3);
                                    final rqc rqcVar4 = this.M0[i18];
                                    final byte b12 = 1;
                                    rqcVar4.setOnClickListener(new View.OnClickListener(this) { // from class: jlb
                                        public final /* synthetic */ qmb b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b122 = b12;
                                            rqc rqcVar32 = rqcVar4;
                                            int i152 = i18;
                                            qmb qmbVar = this.b;
                                            switch (b122) {
                                                case 0:
                                                    byte b13 = qmbVar.b;
                                                    FrameLayout[] frameLayoutArr = qmbVar.N0;
                                                    if (qmbVar.A0.getAlpha() == 1.0f && qmbVar.t1 == null) {
                                                        if ((b13 != 1 && !(qmbVar.D1 instanceof krc)) || i152 != 2) {
                                                            if (i152 != 1 || (b13 != 1 && !(qmbVar.D1 instanceof krc))) {
                                                                if (!(qmbVar.D1 instanceof krc)) {
                                                                    if (b13 != 1) {
                                                                        rqcVar32.a(!rqcVar32.s, true);
                                                                        boolean z5 = rqcVar32.s;
                                                                        if (i152 != 0) {
                                                                            qmbVar.G1 = z5;
                                                                            qmbVar.x1.b(z5);
                                                                            qmbVar.M0();
                                                                            break;
                                                                        } else {
                                                                            qmbVar.H1 = z5;
                                                                            if (z5) {
                                                                                qmbVar.z0.getImageReceiver().V0 = true;
                                                                            }
                                                                            qmbVar.m1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    qmbVar.j1(i152, frameLayoutArr[i152].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (qmbVar.L0[1].s) {
                                                                    qmbVar.a1 = qmbVar.Y0;
                                                                    qmbVar.z0.setImageDrawable(null);
                                                                    qmbVar.Y0 = null;
                                                                    qmbVar.G1 = false;
                                                                    qmbVar.n1();
                                                                    qmbVar.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (b13 == 1) {
                                                                            qmbVar.j1(0, true, true);
                                                                        } else {
                                                                            qmbVar.j1(i152, frameLayoutArr[i152].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    qmbVar.d1(qmbVar.a1 != null ? -1 : 0);
                                                                    if (b13 == 1) {
                                                                        qmbVar.j1(1, true, true);
                                                                    } else {
                                                                        qmbVar.j1(i152, frameLayoutArr[i152].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                qmbVar.L0[1].a(qmbVar.Y0 != null, true);
                                                                qmbVar.r1();
                                                                qmbVar.R0.h1();
                                                                qmbVar.p1();
                                                                break;
                                                            }
                                                        } else {
                                                            rqcVar32.a(!rqcVar32.s, true);
                                                            boolean z6 = rqcVar32.s;
                                                            qmbVar.G1 = z6;
                                                            qmbVar.x1.b(z6);
                                                            qmbVar.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (qmbVar.B0.getAlpha() == 1.0f && i152 == 0) {
                                                        rqcVar32.a(!rqcVar32.s, true);
                                                        qmbVar.w.i = rqcVar32.s;
                                                        bkb.r1(true, true);
                                                        qmbVar.w0.h1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i18++;
                                }
                            }
                            b4 = 1;
                        }
                        if (b2 != b4 || (this.D1 instanceof krc)) {
                            this.H1 = false;
                            i8 = 0;
                            while (i8 < 2) {
                                tlb tlbVar = new tlb(this, context, i8, rect);
                                ViewGroup[] viewGroupArr = this.N0;
                                viewGroupArr[i8] = tlbVar;
                                if (i8 == 1 || b2 == 2) {
                                    tlbVar.setVisibility(4);
                                }
                                viewGroupArr[i8].setWillNotDraw(false);
                                int i20 = kk7.v4;
                                int i21 = kk7.m5;
                                if (b2 == 2) {
                                    if (i8 == 0) {
                                        i21 = 321;
                                    }
                                    e = nme.e(-1, i21, 83);
                                } else {
                                    if (i8 == 0) {
                                        i21 = 273;
                                    }
                                    e = nme.e(-1, i21, 83);
                                }
                                if (i8 == 0) {
                                    if (b2 == 2) {
                                        i20 = 321;
                                    }
                                    f2 = i20;
                                } else {
                                    f2 = 316.0f;
                                }
                                e.height = gl.L(f2);
                                if (V0()) {
                                    e.height += gl.n;
                                }
                                if (i8 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect2 = gl.Q;
                                    drawable2.getPadding(rect2);
                                    e.height = gl.L(12.0f) + rect2.top + e.height;
                                }
                                viewGroupArr[i8].setPadding(0, i8 == 0 ? gl.L(12.0f) + rect.top : 0, 0, V0() ? gl.n : 0);
                                this.v0.addView(viewGroupArr[i8], e);
                                if (i8 == 1 || b2 == 2) {
                                    gw9 gw9Var = new gw9(this, context, (byte) 3);
                                    ViewGroup[] viewGroupArr2 = this.Q0;
                                    viewGroupArr2[i8] = gw9Var;
                                    gw9Var.setWillNotDraw(false);
                                    viewGroupArr2[i8].setPadding(0, gl.L(3.0f), 0, 0);
                                    viewGroupArr2[i8].setClickable(true);
                                    f3 = 21.0f;
                                    viewGroupArr[i8].addView(viewGroupArr2[i8], nme.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.O0;
                                    textViewArr[i8] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i8].setTypeface(gl.o());
                                    TextView textView4 = textViewArr[i8];
                                    int i22 = bkb.rf;
                                    zkb.X(textView4, i22, getResourceProvider());
                                    textViewArr[i8].setText(k96.L0(2131752577));
                                    textViewArr[i8].setGravity(17);
                                    textViewArr[i8].setPadding(gl.L(21.0f), 0, gl.L(21.0f), 0);
                                    TextView textView5 = textViewArr[i8];
                                    int i23 = bkb.h6;
                                    akbVar = akbVar2;
                                    zkb.R(textView5, bkb.e0(getThemedColor(i23), 0), null, zkb.M(i23), getResourceProvider());
                                    viewGroupArr2[i8].addView(textViewArr[i8], nme.e(-2, -1, 51));
                                    final byte b13 = 0;
                                    textViewArr[i8].setOnClickListener(new View.OnClickListener(this) { // from class: mlb
                                        public final /* synthetic */ qmb b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b14 = b13;
                                            int i24 = i8;
                                            qmb qmbVar = this.b;
                                            switch (b14) {
                                                case 0:
                                                    if (qmbVar.t1 == null) {
                                                        if (i24 == 0) {
                                                            qmbVar.j1 = qmbVar.k1;
                                                            qmbVar.e1(qmbVar.i1, 3, true);
                                                            qmbVar.e1(qmbVar.h1, 2, true);
                                                            qmbVar.e1(qmbVar.g1, 1, true);
                                                            qmbVar.e1(qmbVar.c1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = qmbVar.Z0;
                                                            qmbVar.Y0 = tL_wallPaper2;
                                                            gmb gmbVar2 = qmbVar.z0;
                                                            if (tL_wallPaper2 == null) {
                                                                gmbVar2.setImageDrawable(null);
                                                            } else {
                                                                gl5 b15 = gl5.b(tL_wallPaper2.document);
                                                                String str3 = qmbVar.I1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = qmbVar.Y0;
                                                                gmbVar2.g(1, tL_wallPaper3.document.size, b15, null, tL_wallPaper3, str3, null, "jpg");
                                                            }
                                                            qmbVar.L0[1].a(qmbVar.Y0 != null, false);
                                                            float f4 = qmbVar.o1;
                                                            qmbVar.n1 = f4;
                                                            qmbVar.V0.setProgress(f4);
                                                            qmbVar.z0.getImageReceiver().setAlpha(qmbVar.n1);
                                                            qmbVar.n1();
                                                            qmbVar.r1();
                                                        }
                                                        if (qmbVar.b != 2) {
                                                            if (qmbVar.Y0 == null) {
                                                                if (qmbVar.G1) {
                                                                    qmbVar.G1 = false;
                                                                    qmbVar.L0[0].a(false, true);
                                                                    qmbVar.M0();
                                                                }
                                                                qmbVar.p1();
                                                            }
                                                            qmbVar.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            qmbVar.j1(i24, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (qmbVar.t1 == null) {
                                                        if (qmbVar.b != 2) {
                                                            qmbVar.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            qmbVar.j1(i24, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.P0;
                                    textViewArr2[i8] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i8].setTypeface(gl.o());
                                    zkb.X(textViewArr2[i8], i22, getResourceProvider());
                                    textViewArr2[i8].setText(k96.L0(2131754213));
                                    textViewArr2[i8].setGravity(17);
                                    textViewArr2[i8].setPadding(gl.L(21.0f), 0, gl.L(21.0f), 0);
                                    zkb.R(textViewArr2[i8], bkb.e0(getThemedColor(i23), 0), null, zkb.M(i23), getResourceProvider());
                                    viewGroupArr2[i8].addView(textViewArr2[i8], nme.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i8];
                                    r14 = 1;
                                    final char c = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: mlb
                                        public final /* synthetic */ qmb b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b14 = c;
                                            int i24 = i8;
                                            qmb qmbVar = this.b;
                                            switch (b14) {
                                                case 0:
                                                    if (qmbVar.t1 == null) {
                                                        if (i24 == 0) {
                                                            qmbVar.j1 = qmbVar.k1;
                                                            qmbVar.e1(qmbVar.i1, 3, true);
                                                            qmbVar.e1(qmbVar.h1, 2, true);
                                                            qmbVar.e1(qmbVar.g1, 1, true);
                                                            qmbVar.e1(qmbVar.c1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = qmbVar.Z0;
                                                            qmbVar.Y0 = tL_wallPaper2;
                                                            gmb gmbVar2 = qmbVar.z0;
                                                            if (tL_wallPaper2 == null) {
                                                                gmbVar2.setImageDrawable(null);
                                                            } else {
                                                                gl5 b15 = gl5.b(tL_wallPaper2.document);
                                                                String str3 = qmbVar.I1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = qmbVar.Y0;
                                                                gmbVar2.g(1, tL_wallPaper3.document.size, b15, null, tL_wallPaper3, str3, null, "jpg");
                                                            }
                                                            qmbVar.L0[1].a(qmbVar.Y0 != null, false);
                                                            float f4 = qmbVar.o1;
                                                            qmbVar.n1 = f4;
                                                            qmbVar.V0.setProgress(f4);
                                                            qmbVar.z0.getImageReceiver().setAlpha(qmbVar.n1);
                                                            qmbVar.n1();
                                                            qmbVar.r1();
                                                        }
                                                        if (qmbVar.b != 2) {
                                                            if (qmbVar.Y0 == null) {
                                                                if (qmbVar.G1) {
                                                                    qmbVar.G1 = false;
                                                                    qmbVar.L0[0].a(false, true);
                                                                    qmbVar.M0();
                                                                }
                                                                qmbVar.p1();
                                                            }
                                                            qmbVar.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            qmbVar.j1(i24, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (qmbVar.t1 == null) {
                                                        if (qmbVar.b != 2) {
                                                            qmbVar.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            qmbVar.j1(i24, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    akbVar = akbVar2;
                                    r14 = 1;
                                    f3 = 21.0f;
                                }
                                if (i8 == r14) {
                                    TextView textView8 = new TextView(context);
                                    this.g2 = textView8;
                                    textView8.setLines(r14);
                                    this.g2.setSingleLine(r14);
                                    this.g2.setText(k96.L0(2131753746));
                                    zkb.X(this.g2, bkb.F6, getResourceProvider());
                                    this.g2.setTextSize(r14, 20.0f);
                                    this.g2.setTypeface(gl.o());
                                    this.g2.setPadding(gl.L(f3), gl.L(6.0f), gl.L(f3), gl.L(8.0f));
                                    this.g2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.g2.setGravity(16);
                                    viewGroupArr[i8].addView(this.g2, nme.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    rkb rkbVar = new rkb(context);
                                    this.R0 = rkbVar;
                                    t26 t26Var = new t26(0, false);
                                    this.T0 = t26Var;
                                    rkbVar.setLayoutManager(t26Var);
                                    rkb rkbVar2 = this.R0;
                                    omb ombVar = new omb(this, context);
                                    this.S0 = ombVar;
                                    rkbVar2.setAdapter(ombVar);
                                    this.R0.i(new oq1((byte) 15));
                                    viewGroupArr[i8].addView(this.R0, nme.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.R0.setOnItemClickListener(new f09(this, (byte) 22));
                                    ld5 ld5Var = new ld5(context);
                                    this.U0 = ld5Var;
                                    ld5Var.setText(k96.L0(2131753741));
                                    viewGroupArr[i8].addView(this.U0, nme.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    ty0 ty0Var = new ty0(context, (slb) getResourceProvider());
                                    this.V0 = ty0Var;
                                    ty0Var.setProgress(this.n1);
                                    this.V0.setReportChanges(true);
                                    this.V0.setDelegate(new u39(this, (byte) 19));
                                    viewGroupArr[i8].addView(this.V0, nme.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    p pVar = new p(context, this.i0, new ulb(this));
                                    this.X = pVar;
                                    pVar.setResourcesProvider(getResourceProvider());
                                    if (b2 == 1) {
                                        viewGroupArr[i8].addView(this.X, nme.e(-1, -1, 1));
                                        boolean o = akbVar.o();
                                        p pVar2 = this.X;
                                        if (o) {
                                            pVar2.setMinBrightness(0.2f);
                                        } else {
                                            pVar2.setMinBrightness(0.05f);
                                            this.X.setMaxBrightness(0.8f);
                                        }
                                        if (zjbVar != null) {
                                            int i24 = zjbVar.d != 0 ? 2 : 1;
                                            p pVar3 = this.X;
                                            U0(1);
                                            pVar3.f(1, 2, i24, false);
                                            this.X.e(zjbVar.c, 0);
                                            int i25 = zjbVar.d;
                                            if (i25 != 0) {
                                                this.X.e(i25, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i8].addView(this.X, nme.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i8++;
                                akbVar2 = akbVar;
                            }
                        }
                        n1();
                        if (!this.z0.getImageReceiver().B()) {
                            this.v0.setBackgroundColor(-16777216);
                        }
                        if (b2 != 1 && !(this.D1 instanceof krc)) {
                            this.z0.getImageReceiver().B0 = true;
                        }
                    }
                    i5 = 0;
                    String[] strArr3 = new String[i5];
                    int[] iArr3 = new int[i5];
                    this.L0 = new rqc[i5];
                    if (i5 != 0) {
                    }
                    i7 = 0;
                    while (true) {
                        slbVar = this.a;
                        if (i7 >= i5) {
                        }
                        i7++;
                        i4 = 2;
                        b3 = 1;
                    }
                    b4 = b3;
                    if (b2 == b4) {
                    }
                    if (b2 != b4) {
                    }
                    this.H1 = false;
                    i8 = 0;
                    while (i8 < 2) {
                    }
                    n1();
                    if (!this.z0.getImageReceiver().B()) {
                    }
                    if (b2 != 1) {
                        this.z0.getImageReceiver().B0 = true;
                    }
                } else {
                    if (!(obj instanceof lrc) || !"t".equals(((lrc) obj).a)) {
                        i5 = i4;
                        String[] strArr32 = new String[i5];
                        int[] iArr32 = new int[i5];
                        this.L0 = new rqc[i5];
                        if (i5 != 0) {
                        }
                        i7 = 0;
                        while (true) {
                            slbVar = this.a;
                            if (i7 >= i5) {
                            }
                            i7++;
                            i4 = 2;
                            b3 = 1;
                        }
                        b4 = b3;
                        if (b2 == b4) {
                        }
                        if (b2 != b4) {
                        }
                        this.H1 = false;
                        i8 = 0;
                        while (i8 < 2) {
                        }
                        n1();
                        if (!this.z0.getImageReceiver().B()) {
                        }
                        if (b2 != 1) {
                        }
                    }
                    i5 = 0;
                    String[] strArr322 = new String[i5];
                    int[] iArr322 = new int[i5];
                    this.L0 = new rqc[i5];
                    if (i5 != 0) {
                    }
                    i7 = 0;
                    while (true) {
                        slbVar = this.a;
                        if (i7 >= i5) {
                        }
                        i7++;
                        i4 = 2;
                        b3 = 1;
                    }
                    b4 = b3;
                    if (b2 == b4) {
                    }
                    if (b2 != b4) {
                    }
                    this.H1 = false;
                    i8 = 0;
                    while (i8 < 2) {
                    }
                    n1();
                    if (!this.z0.getImageReceiver().B()) {
                    }
                    if (b2 != 1) {
                    }
                }
            }
            this.w0.setAdapter(this.x0);
            gw9 gw9Var2 = new gw9(this, context, (byte) 4);
            this.m0 = gw9Var2;
            gw9Var2.setWillNotDraw(false);
            gw9 gw9Var3 = this.m0;
            this.fragmentView = gw9Var3;
            ViewTreeObserver viewTreeObserver = gw9Var3.getViewTreeObserver();
            c25 c25Var = new c25(this, (byte) 3);
            this.S = c25Var;
            viewTreeObserver.addOnGlobalLayoutListener(c25Var);
            gec gecVar = new gec(context);
            this.l0 = gecVar;
            gecVar.b(new lv(this, (byte) 5));
            this.l0.setAdapter(new f95(this, (byte) 4));
            gl.x3(this.l0, getThemedColor(bkb.r8));
            this.m0.addView(this.l0, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, b2 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(this, context);
            this.n0 = undoView;
            undoView.setAdditionalTranslationY(gl.L(51.0f));
            this.m0.addView(this.n0, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (b2 != 0) {
                View view = new View(context);
                zkb.h(bkb.U5, getResourceProvider(), view);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = gl.L(48.0f);
                this.m0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.d0 = frameLayout;
                boolean z5 = this.d;
                if (z5) {
                    int i26 = bkb.c6;
                    frameLayout.setBackgroundColor(z5 ? bkb.D0(i26) : getThemedColor(i26));
                } else {
                    zkb.h(bkb.c6, getResourceProvider(), frameLayout);
                }
                this.m0.addView(this.d0, nme.e(-1, 48, 83));
                s71 s71Var = new s71(this, context);
                this.c0 = s71Var;
                this.d0.addView(s71Var, nme.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.f0 = textView9;
                textView9.setTextSize(1, 14.0f);
                TextView textView10 = this.f0;
                if (z5) {
                    i9 = bkb.rf;
                    textView10.setTextColor(z5 ? bkb.D0(i9) : getThemedColor(i9));
                } else {
                    i9 = bkb.rf;
                    zkb.X(textView10, i9, getResourceProvider());
                }
                this.f0.setGravity(17);
                this.f0.setBackgroundDrawable(bkb.e0(251658240, 0));
                this.f0.setPadding(gl.L(29.0f), 0, gl.L(29.0f), 0);
                this.f0.setText(k96.L0(2131752577));
                this.f0.setTypeface(gl.o());
                this.d0.addView(this.f0, nme.e(-2, -1, 51));
                final byte b14 = 0;
                this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: glb
                    public final /* synthetic */ qmb b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b102 = b14;
                        qmb qmbVar = this.b;
                        switch (b102) {
                            case 0:
                                qmbVar.O0(false);
                                break;
                            case 1:
                                qmbVar.Y0();
                                break;
                            case 2:
                                qmbVar.e.U(null, null);
                                break;
                            case 3:
                                qmbVar.N0(false);
                                break;
                            default:
                                qmbVar.N0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.e0 = textView11;
                textView11.setTextSize(1, 14.0f);
                TextView textView12 = this.e0;
                if (z5) {
                    textView12.setTextColor(z5 ? bkb.D0(i9) : getThemedColor(i9));
                } else {
                    zkb.X(textView12, i9, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(bkb.e0(251658240, 0));
                this.e0.setPadding(gl.L(29.0f), 0, gl.L(29.0f), 0);
                this.e0.setText(k96.L0(2131754213));
                this.e0.setTypeface(gl.o());
                this.d0.addView(this.e0, nme.e(-2, -1, 53));
                b5 = 1;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: glb
                    public final /* synthetic */ qmb b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b102 = b5;
                        qmb qmbVar = this.b;
                        switch (b102) {
                            case 0:
                                qmbVar.O0(false);
                                break;
                            case 1:
                                qmbVar.Y0();
                                break;
                            case 2:
                                qmbVar.e.U(null, null);
                                break;
                            case 3:
                                qmbVar.N0(false);
                                break;
                            default:
                                qmbVar.N0(true);
                                break;
                        }
                    }
                });
            } else {
                b5 = 1;
            }
            if (b2 == b5 && !bkb.a1() && zjbVar != null && zjbVar.j != 4294967296L) {
                b1();
            }
            this.k0 = T0();
            f1(true);
            q1(false);
            this.c = new Scroller(getContext());
            ui5Var2 = this.parentLayout;
            if (ui5Var2 != null && ui5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().L(getThemedColor(bkb.g5));
                if (b2 == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().x0(-16777216);
                }
            }
            return this.fragmentView;
        }
        z = false;
        this.O1 = z;
        if (z) {
        }
        ui5Var = this.parentLayout;
        if (ui5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.o0 = new FrameLayout(context);
        b = 3;
        if (this.O1) {
            gl.e3(new flb(this, b), 2000L);
        }
        this.actionBar.t().a(0, R.drawable.outline_header_search).M().K(new cmb()).setSearchFieldHint(k96.L0(2131745644));
        this.actionBar.setBackButtonDrawable(new a07());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(k96.L0(2131743931));
        zab zabVar2 = new zab(b6, context, this);
        this.o0 = zabVar2;
        zkb.h(bkb.c6, getResourceProvider(), zabVar2);
        this.o0.addView(this.actionBar, nme.c(-2.0f, -1));
        o39 o39Var3 = new o39(context);
        this.p0 = o39Var3;
        o39Var3.setVerticalScrollBarEnabled(true);
        this.p0.setItemAnimator(null);
        this.p0.setLayoutAnimation(null);
        this.p0.setLayoutManager(new t26(1, false));
        final byte b82 = 2;
        this.p0.setVerticalScrollbarPosition(!k96.a0 ? 1 : 2);
        o39 o39Var22 = this.p0;
        b2 = this.b;
        o39Var22.setPadding(0, 0, 0, gl.L(b2 == 0 ? 12.0f : 0.0f));
        this.p0.setOnItemClickListener(new l5(b7));
        this.o0.addView(this.p0, nme.e(-1, -1, 51));
        un4 un4Var2 = new un4(context, this.resourceProvider);
        this.r0 = un4Var2;
        un4Var2.setImageResource(R.drawable.floating_pencil);
        this.o0.addView(this.r0, un4.b());
        s20 s20Var2 = new s20(context);
        this.q0 = s20Var2;
        this.p0.setAdapter(s20Var2);
        this.v0 = new k7(b, context, this);
        this.x0 = new mmb(this, context);
        this.u0 = createActionBar(context);
        if (gl.O1()) {
        }
        this.u0.setBackButtonDrawable(new ed0(false));
        this.u0.setActionBarMenuOnItemClick(new fmb(this));
        i = 0;
        while (true) {
            gmbVarArr = this.y0;
            if (i < 2) {
            }
            gmbVarArr[i] = new gmb(this, (Activity) getContext());
            this.v0.addView(gmbVarArr[i], nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i++;
        }
        gmb gmbVar2 = gmbVarArr[0];
        this.z0 = gmbVar2;
        gmbVar2.setVisibility(0);
        gmbVarArr[1].setVisibility(8);
        if (b2 == 2) {
        }
        z2 = this.x0.e;
        akb akbVar22 = this.g0;
        final byte b92 = 4;
        if (!z2) {
        }
        this.w0 = new nlb(this, context);
        olb olbVar2 = new olb(this);
        olbVar2.C = false;
        this.w0.setItemAnimator(olbVar2);
        this.w0.setVerticalScrollBarEnabled(true);
        this.w0.setOverScrollMode(2);
        nlb nlbVar3 = this.w0;
        if (b2 != 2) {
        }
        this.w0.setClipToPadding(false);
        this.w0.setLayoutManager(new t26(1, true));
        this.w0.setVerticalScrollbarPosition(!k96.a0 ? 1 : 2);
        k7 k7Var2 = this.v0;
        nlb nlbVar22 = this.w0;
        if (b2 != 1) {
        }
        this.w0.setOnScrollListener(new vdb(this, b6));
        this.v0.addView(this.u0, nme.c(-2.0f, i3));
        brc brcVar2 = new brc(context);
        this.x1 = brcVar2;
        brcVar2.n = new hlb(this, b82);
        zjb zjbVar2 = this.w;
        if (b2 != 1) {
        }
        if (b2 != 2) {
        }
        Rect rect3 = new Rect();
        Drawable d2 = b00.d(context, R.drawable.sheet_shadow_round);
        this.r = d2;
        d2.getPadding(rect3);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(bkb.c6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        de9.p(new TextPaint(1), gl.L(14.0f));
        obj = this.D1;
        if (b2 != 1) {
        }
        if (obj instanceof krc) {
        }
        i5 = 3;
        String[] strArr3222 = new String[i5];
        int[] iArr3222 = new int[i5];
        this.L0 = new rqc[i5];
        if (i5 != 0) {
        }
        i7 = 0;
        while (true) {
            slbVar = this.a;
            if (i7 >= i5) {
            }
            i7++;
            i4 = 2;
            b3 = 1;
        }
        b4 = b3;
        if (b2 == b4) {
        }
        if (b2 != b4) {
        }
        this.H1 = false;
        i8 = 0;
        while (i8 < 2) {
        }
        n1();
        if (!this.z0.getImageReceiver().B()) {
        }
        if (b2 != 1) {
        }
        this.w0.setAdapter(this.x0);
        gw9 gw9Var22 = new gw9(this, context, (byte) 4);
        this.m0 = gw9Var22;
        gw9Var22.setWillNotDraw(false);
        gw9 gw9Var32 = this.m0;
        this.fragmentView = gw9Var32;
        ViewTreeObserver viewTreeObserver2 = gw9Var32.getViewTreeObserver();
        c25 c25Var2 = new c25(this, (byte) 3);
        this.S = c25Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(c25Var2);
        gec gecVar2 = new gec(context);
        this.l0 = gecVar2;
        gecVar2.b(new lv(this, (byte) 5));
        this.l0.setAdapter(new f95(this, (byte) 4));
        gl.x3(this.l0, getThemedColor(bkb.r8));
        this.m0.addView(this.l0, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, b2 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(this, context);
        this.n0 = undoView2;
        undoView2.setAdditionalTranslationY(gl.L(51.0f));
        this.m0.addView(this.n0, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (b2 != 0) {
        }
        if (b2 == b5) {
            b1();
        }
        this.k0 = T0();
        f1(true);
        q1(false);
        this.c = new Scroller(getContext());
        ui5Var2 = this.parentLayout;
        if (ui5Var2 != null) {
            this.parentLayout.getBottomSheet().L(getThemedColor(bkb.g5));
            if (b2 == 2) {
                this.parentLayout.getBottomSheet().x0(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(int i) {
        TLRPC.TL_wallPaper tL_wallPaper = (i < 0 || i >= this.W0.size()) ? this.a1 : (TLRPC.TL_wallPaper) this.W0.get(i);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e2.cancel();
        }
        gmb[] gmbVarArr = this.y0;
        gmb gmbVar = gmbVarArr[0];
        gmb gmbVar2 = gmbVarArr[1];
        gmbVarArr[0] = gmbVar2;
        gmbVarArr[1] = gmbVar;
        this.v0.removeView(gmbVar2);
        this.v0.addView(gmbVarArr[0], this.v0.indexOfChild(gmbVarArr[1]) + 1);
        gmb gmbVar3 = gmbVarArr[0];
        this.z0 = gmbVar3;
        gmbVar3.setBackground(gmbVarArr[1].getBackground());
        this.z0.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
        q1(false);
        o1();
        gmbVarArr[1].setVisibility(0);
        gmbVarArr[1].setAlpha(1.0f);
        this.z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e2 = ofFloat;
        ofFloat.addUpdateListener(new ae0(this, (byte) 15));
        this.e2.addListener(new vlb(this, (byte) 0));
        this.e2.setInterpolator(s33.f);
        this.e2.setDuration(300L);
        this.e2.start();
        this.z0.getImageReceiver().t1 = (short) 300;
        this.z0.getImageReceiver().Z(gl5.b(tL_wallPaper.document), this.I1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.z0.e();
        this.Y0 = tL_wallPaper;
        this.G1 = this.L0[2].s;
        n1();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        byte b = 1;
        if (i == kk7.q3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                l1(true);
                return;
            }
            return;
        }
        if (i == kk7.k4) {
            o39 o39Var = this.p0;
            if (o39Var != null) {
                int childCount = o39Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.p0.getChildAt(i3);
                    if (childAt instanceof ue3) {
                        ((ue3) childAt).k0(0, true);
                    }
                }
                return;
            }
            return;
        }
        if (i == kk7.l4) {
            nlb nlbVar = this.w0;
            if (nlbVar != null) {
                nlbVar.h1();
                return;
            }
            return;
        }
        if (i == kk7.B4) {
            if (this.v0 != null) {
                f1(true);
                return;
            }
            return;
        }
        if (i == kk7.h4) {
            Object obj = this.D1;
            if (obj instanceof lrc) {
                lrc lrcVar = (lrc) obj;
                if (lrcVar.a == null) {
                    lrcVar.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j = 0;
        if (i != kk7.g4) {
            if (i != kk7.w5 || this.L1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.W0.clear();
        HashMap hashMap = this.X0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i4);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.W0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                zjb zjbVar = this.w;
                if (zjbVar != null && (str = zjbVar.o) != null && str.equals(wallPaper.slug)) {
                    this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                    f1(false);
                    n1();
                } else if (zjbVar == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        String str2 = tL_wallPaper2.slug;
                        if (str2 != null) {
                            if (!str2.equals(wallPaper.slug)) {
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (!z && (tL_wallPaper = this.Y0) != null) {
            this.W0.add(0, tL_wallPaper);
        }
        omb ombVar = this.S0;
        if (ombVar != null) {
            ombVar.f();
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i5);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j = hq6.r(j, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new llb(this, b)), this.classGuid);
    }

    public final void e1(int i, int i2, boolean z) {
        ye7 ye7Var;
        if (i2 == 0) {
            this.b1 = i;
        } else if (i2 == 1) {
            this.d1 = i;
        } else if (i2 == 2) {
            this.e1 = i;
        } else if (i2 == 3) {
            this.f1 = i;
        }
        q1(z);
        if (this.L0 != null) {
            int i3 = 0;
            while (true) {
                rqc[] rqcVarArr = this.L0;
                if (i3 >= rqcVarArr.length) {
                    break;
                }
                rqc rqcVar = rqcVarArr[i3];
                if (rqcVar != null) {
                    rqcVar.b(i2, i);
                }
                i3++;
            }
        }
        if (this.e1 != 0) {
            if (this.V0 != null && bkb.I.o()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.z0.getBackground();
            if (background instanceof ye7) {
                ye7Var = (ye7) background;
            } else {
                ye7Var = new ye7();
                ye7Var.p(this.z0);
                if (this.F1) {
                    ye7Var.m(false);
                }
            }
            ye7 ye7Var2 = ye7Var;
            ye7Var2.n(true, this.b1, this.d1, this.e1, this.f1);
            this.z0.setBackground(ye7Var2);
            this.l1 = ye7Var2.f();
            this.m1 = 754974720;
        } else if (this.d1 != 0) {
            this.z0.setBackground(new GradientDrawable(wd0.c(this.j1), new int[]{this.b1, this.d1}));
            int U0 = gl.U0(gl.w0(this.b1, this.d1), false);
            this.m1 = U0;
            this.l1 = U0;
        } else {
            this.z0.setBackgroundColor(this.b1);
            int U02 = gl.U0(this.b1, false);
            this.m1 = U02;
            this.l1 = U02;
        }
        int i4 = bkb.bd;
        boolean d1 = bkb.d1(i4);
        slb slbVar = this.a;
        if (!d1 || (this.z0.getBackground() instanceof ye7)) {
            slbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        } else if (bkb.s0() instanceof ye7) {
            getThemedColor(i4);
            slbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            zkb.s(imageView, bkb.Yc, slbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            zkb.s(imageView2, bkb.Yc, slbVar, PorterDuff.Mode.MULTIPLY);
        }
        gmb gmbVar = this.z0;
        if (gmbVar != null) {
            gmbVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
            this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.z0.invalidate();
            if (bkb.I.o() && (this.z0.getBackground() instanceof ye7)) {
                ty0 ty0Var = this.V0;
                if (ty0Var != null) {
                    ty0Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.z0.getImageReceiver().W(((ye7) this.z0.getBackground()).k);
                }
            } else {
                this.z0.getImageReceiver().W(null);
                ty0 ty0Var2 = this.V0;
                if (ty0Var2 != null) {
                    ty0Var2.setTwoSided(false);
                }
            }
            ty0 ty0Var3 = this.V0;
            if (ty0Var3 != null) {
                ty0Var3.setProgress(this.n1);
            }
        }
        nlb nlbVar = this.w0;
        if (nlbVar != null) {
            nlbVar.h1();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.A0.getChildAt(i5).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                this.B0.getChildAt(i6).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z) {
        int i;
        int i2;
        int i3;
        Drawable s0;
        gmb gmbVar;
        ImageView imageView;
        ImageView imageView2;
        ColorDrawable colorDrawable;
        ye7 ye7Var;
        zjb zjbVar = this.w;
        byte b = 0;
        byte b2 = this.b;
        if (b2 == 0 && zjbVar == null) {
            this.z0.setBackground(bkb.r0());
        } else {
            if (b2 == 2) {
                Object obj = this.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize w = z ? ba4.w(tL_wallPaper.document.thumbs, 100, false, null, false) : null;
                    BitmapDrawable bitmapDrawable = w instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(fl5.B("b", w.bytes)) : null;
                    gmb gmbVar2 = this.z0;
                    gmbVar2.a.Z(gl5.b(tL_wallPaper.document), this.I1, gl5.c(w, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    gmbVar2.e();
                } else if (obj instanceof krc) {
                    krc krcVar = (krc) obj;
                    int i4 = krcVar.f;
                    int i5 = krcVar.e;
                    int i6 = krcVar.d;
                    int i7 = krcVar.c;
                    int i8 = krcVar.b;
                    this.j1 = i4;
                    e1(i8, 0, false);
                    if (i7 != 0) {
                        e1(i7, 1, false);
                    }
                    e1(i6, 2, false);
                    e1(i5, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        gmb gmbVar3 = this.z0;
                        gl5 b3 = gl5.b(tL_wallPaper2.document);
                        String str = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                        gmbVar3.g(1, tL_wallPaper3.document.size, b3, null, tL_wallPaper3, str, null, "jpg");
                    } else if ("d".equals(krcVar.a)) {
                        Point point = gl.q;
                        this.z0.setImageBitmap(lcb.d(R.raw.default_pattern, Math.min(point.x, point.y), Math.max(point.x, point.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : ye7.g(i8, i7, i6, i5)));
                    }
                } else if (obj instanceof lrc) {
                    Bitmap bitmap = this.E1;
                    if (bitmap != null) {
                        this.z0.setImageBitmap(bitmap);
                    } else {
                        lrc lrcVar = (lrc) obj;
                        File file = lrcVar.e;
                        if (file != null) {
                            this.z0.o(file.getAbsolutePath(), this.I1, null);
                        } else {
                            File file2 = lrcVar.d;
                            if (file2 != null) {
                                this.z0.o(file2.getAbsolutePath(), this.I1, null);
                            } else if ("t".equals(lrcVar.a)) {
                                this.z0.setImageDrawable(bkb.X0(false));
                            } else {
                                int i9 = lrcVar.b;
                                if (i9 != 0) {
                                    this.z0.setImageResource(i9);
                                }
                            }
                        }
                    }
                } else if (obj instanceof nm6) {
                    nm6 nm6Var = (nm6) obj;
                    TLRPC.Photo photo = nm6Var.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w2 = ba4.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w3 = ba4.w(nm6Var.K.sizes, this.J1, true, null, false);
                        TLRPC.PhotoSize photoSize = w3 != w2 ? w3 : null;
                        this.z0.g(1, photoSize != null ? photoSize.size : 0, gl5.i(photoSize, nm6Var.K), gl5.i(w2, nm6Var.K), nm6Var, this.I1, "100_100_b", "jpg");
                    } else {
                        gmb gmbVar4 = this.z0;
                        String str2 = nm6Var.C;
                        String str3 = this.I1;
                        String str4 = nm6Var.D;
                        gmbVar4.getClass();
                        gmbVar4.k(gl5.g(str2), str3, gl5.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (zjbVar == null) {
                this.z0.setBackground(bkb.r0());
            } else {
                sd0 sd0Var = this.w1;
                if (sd0Var != null) {
                    sd0Var.dispose();
                    this.w1 = null;
                }
                int C0 = bkb.C0(bkb.De);
                int i10 = (int) zjbVar.j;
                int i11 = i10 != 0 ? i10 : C0;
                int C02 = bkb.C0(bkb.Ee);
                long j = zjbVar.k;
                int i12 = (int) j;
                if (i12 != 0) {
                    C02 = i12;
                } else if (j != 0) {
                    C02 = 0;
                }
                int C03 = bkb.C0(bkb.Fe);
                long j2 = zjbVar.l;
                int i13 = (int) j2;
                if (i13 != 0) {
                    C03 = i13;
                } else if (j2 != 0) {
                    C03 = 0;
                }
                int C04 = bkb.C0(bkb.Ge);
                long j3 = zjbVar.m;
                int i14 = (int) j3;
                if (i14 != 0) {
                    C04 = i14;
                } else if (j3 != 0) {
                    i = 0;
                    if (!TextUtils.isEmpty(zjbVar.o) || bkb.a1()) {
                        i2 = C02;
                        i3 = C03;
                        s0 = bkb.s0();
                        if (s0 != null) {
                            if (s0 instanceof ye7) {
                                ((ye7) s0).p(this.z0);
                            }
                            this.z0.setBackground(s0);
                        }
                    } else {
                        if (C03 != 0) {
                            Drawable background = this.z0.getBackground();
                            if (background instanceof ye7) {
                                ye7Var = (ye7) background;
                            } else {
                                ye7Var = new ye7();
                                ye7Var.p(this.z0);
                                if (this.F1) {
                                    ye7Var.m(false);
                                }
                            }
                            ye7 ye7Var2 = ye7Var;
                            i2 = C02;
                            i3 = C03;
                            ye7Var2.n(true, i11, i2, i3, i);
                            colorDrawable = ye7Var2;
                        } else {
                            i2 = C02;
                            i3 = C03;
                            if (i2 != 0) {
                                wd0 wd0Var = new wd0(wd0.c(zjbVar.n), new int[]{i11, i2});
                                this.w1 = wd0Var.f(l69.y(3), new zlb(this, b), 100L);
                                colorDrawable = wd0Var;
                            } else {
                                colorDrawable = new ColorDrawable(i11);
                            }
                        }
                        this.z0.setBackground(colorDrawable);
                        TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
                        if (tL_wallPaper4 != null) {
                            gmb gmbVar5 = this.z0;
                            gl5 b4 = gl5.b(tL_wallPaper4.document);
                            String str5 = this.I1;
                            TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                            gmbVar5.g(1, tL_wallPaper5.document.size, b4, null, tL_wallPaper5, str5, null, "jpg");
                        }
                    }
                    if (i2 != 0) {
                        int U0 = gl.U0(i11, false);
                        this.m1 = U0;
                        this.l1 = U0;
                    } else if (i3 != 0) {
                        this.l1 = ye7.g(i11, i2, i3, i);
                        this.m1 = 754974720;
                    } else {
                        int U02 = gl.U0(gl.w0(i11, i2), false);
                        this.m1 = U02;
                        this.l1 = U02;
                    }
                    gmbVar = this.z0;
                    if (gmbVar != null) {
                        gmbVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
                        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
                        this.z0.invalidate();
                        if (bkb.I.o() && (this.z0.getBackground() instanceof ye7)) {
                            ty0 ty0Var = this.V0;
                            if (ty0Var != null) {
                                ty0Var.setTwoSided(true);
                            }
                            if (this.n1 < 0.0f) {
                                this.z0.getImageReceiver().W(((ye7) this.z0.getBackground()).k);
                            }
                        } else {
                            this.z0.getImageReceiver().W(null);
                            ty0 ty0Var2 = this.V0;
                            if (ty0Var2 != null) {
                                ty0Var2.setTwoSided(false);
                            }
                        }
                        ty0 ty0Var3 = this.V0;
                        if (ty0Var3 != null) {
                            ty0Var3.setProgress(this.n1);
                        }
                    }
                    if (this.L0 != null) {
                        int i15 = 0;
                        while (true) {
                            rqc[] rqcVarArr = this.L0;
                            if (i15 >= rqcVarArr.length) {
                                break;
                            }
                            rqcVarArr[i15].b(0, i11);
                            this.L0[i15].b(1, i2);
                            this.L0[i15].b(2, i3);
                            this.L0[i15].b(3, i);
                            i15++;
                        }
                    }
                    imageView = this.H0;
                    slb slbVar = this.a;
                    if (imageView != null) {
                        zkb.s(imageView, bkb.Yc, slbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    imageView2 = this.I0;
                    if (imageView2 != null) {
                        zkb.s(imageView2, bkb.Yc, slbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    W0();
                }
                i = C04;
                if (TextUtils.isEmpty(zjbVar.o)) {
                }
                i2 = C02;
                i3 = C03;
                s0 = bkb.s0();
                if (s0 != null) {
                }
                if (i2 != 0) {
                }
                gmbVar = this.z0;
                if (gmbVar != null) {
                }
                if (this.L0 != null) {
                }
                imageView = this.H0;
                slb slbVar2 = this.a;
                if (imageView != null) {
                }
                imageView2 = this.I0;
                if (imageView2 != null) {
                }
                W0();
            }
        }
        this.F1 = false;
    }

    public final void g1(long j) {
        this.L1 = j;
        this.M1 = j == 0 || j == getUserConfig().e();
    }

    @Override // sp3
    public final int getObserverTag() {
        return this.v1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return this.N1 ? T0() : super.getThemeDescriptions();
    }

    public final void h1(uk1 uk1Var) {
        float f;
        if (this.z0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f = ((this.z0.getMeasuredWidth() - (Math.max(this.z0.getMeasuredWidth() / width, this.z0.getMeasuredHeight() / r0.i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f = this.Z1 + 0.0f;
        }
        float y = uk1Var.getY() - ((-this.z0.K) + 0.0f);
        int measuredHeight = this.z0.getMeasuredHeight();
        float f2 = this.O1 ? this.p1 * this.q1 : 0.0f;
        uk1Var.x0 = true;
        uk1Var.w0 = measuredHeight;
        uk1Var.u0 = y;
        uk1Var.v0 = f;
        uk1Var.h2 = f2;
        uk1Var.i2.setColor(bm2.o(-16777216, (int) (f2 * 255.0f)));
        uk1Var.invalidate();
    }

    public final void i1() {
        if (this.v0 == null || this.M0 == null || this.w.g == 0) {
            return;
        }
        SharedPreferences c1 = na7.c1();
        if (c1.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.C0 == null) {
            ke5 ke5Var = new ke5(getParentActivity(), 8);
            this.C0 = ke5Var;
            ke5Var.setShowingDuration(5000L);
            this.C0.setAlpha(0.0f);
            this.C0.setVisibility(4);
            this.C0.setText(k96.M0(2131753748, null));
            this.C0.setExtraTranslationY(gl.L(6.0f));
            this.m0.addView(this.C0, nme.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        gl.e3(new a5b((Object) this, (Object) c1, (byte) 9), 500L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.c2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (a.getCurrentActionBarHeight() + gl.m));
    }

    public final void j1(int i, boolean z, boolean z2) {
        int indexOf;
        boolean z3 = z && i == 1 && this.Y0 != null;
        byte b = this.b;
        if (z) {
            if (i != 0) {
                this.Z0 = this.Y0;
                this.o1 = this.n1;
                this.S0.f();
                ArrayList arrayList = this.W0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (b == 2 ? 1 : 0);
                    }
                    this.T0.g1(indexOf, (this.R0.getMeasuredWidth() - gl.L(124.0f)) / 2);
                }
            } else if (b == 2) {
                this.c1 = this.b1;
                int i2 = this.d1;
                this.g1 = i2;
                int i3 = this.e1;
                this.h1 = i3;
                int i4 = this.f1;
                this.i1 = i4;
                this.k1 = this.Q;
                this.X.f(0, 4, i4 != 0 ? 4 : i3 != 0 ? 3 : i2 != 0 ? 2 : 1, false);
                this.X.e(this.f1, 3);
                this.X.e(this.e1, 2);
                this.X.e(this.d1, 1);
                this.X.e(this.b1, 0);
            }
        }
        if (b == 1 || b == 2) {
            this.L0[z3 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i == 1) {
            ty0 ty0Var = this.V0;
            if (!ty0Var.N) {
                float f = this.n1;
                if (f < 0.0f) {
                    float f2 = -f;
                    this.n1 = f2;
                    ty0Var.setProgress(f2);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (!z2) {
            char c = i == 0 ? (char) 1 : (char) 0;
            if (z) {
                frameLayoutArr[i].setVisibility(0);
                if (b == 1) {
                    this.w0.setTranslationY(i == 1 ? -gl.L(21.0f) : 0.0f);
                    this.L0[2].setAlpha(z3 ? 1.0f : 0.0f);
                    this.L0[0].setAlpha(z3 ? 0.0f : 1.0f);
                    if (i == 1) {
                        frameLayoutArr[i].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        frameLayoutArr[c].setAlpha(0.0f);
                    }
                    gl.t1(this.X.F[1]);
                } else if (b == 2) {
                    this.w0.setTranslationY(gl.L((this.C1 == null ? 0 : 58) + 72) + (-gl.L(i == 0 ? 343.0f : 316.0f)) + (V0() ? gl.n : 0));
                    this.L0[2].setAlpha(z3 ? 1.0f : 0.0f);
                    this.L0[0].setAlpha(z3 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c].getVisibility() == 0) {
                        frameLayoutArr[c].setAlpha(0.0f);
                        frameLayoutArr[i].setAlpha(1.0f);
                        frameLayoutArr[i].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i].setTranslationY(0.0f);
                    }
                } else {
                    if (i == 1) {
                        frameLayoutArr[i].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        frameLayoutArr[c].setAlpha(0.0f);
                    }
                    gl.t1(this.X.F[1]);
                }
            } else {
                this.w0.setTranslationY(0.0f);
                frameLayoutArr[i].setTranslationY(r9.getMeasuredHeight());
                this.L0[0].setAlpha(1.0f);
                this.L0[2].setAlpha(1.0f);
                this.z0.setAlpha(1.0f);
            }
            if (!z) {
                frameLayoutArr[i].setVisibility(4);
            } else if (frameLayoutArr[c].getVisibility() == 0) {
                frameLayoutArr[c].setAlpha(1.0f);
                frameLayoutArr[c].setVisibility(4);
            }
            if (b == 1 || b == 2) {
                this.L0[z3 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i == 1) {
                    frameLayoutArr[c].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.t1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i5 = i == 0 ? 1 : 0;
        if (z) {
            frameLayoutArr[i].setVisibility(0);
            if (b == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.w0, (Property<nlb, Float>) View.TRANSLATION_Y, i == 1 ? -gl.L(21.0f) : 0.0f));
                rqc rqcVar = this.L0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(rqcVar, (Property<rqc, Float>) property, z3 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[0], (Property<rqc, Float>) property, z3 ? 0.0f : 1.0f));
                if (i == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i5], (Property<FrameLayout, Float>) property, 0.0f));
                }
                gl.t1(this.X.F[1]);
            } else if (b == 2) {
                nlb nlbVar = this.w0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(nlbVar, (Property<nlb, Float>) property2, gl.L((this.C1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i].getMeasuredHeight()) + (V0() ? gl.n : 0)));
                rqc rqcVar2 = this.L0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(rqcVar2, (Property<rqc, Float>) property3, z3 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[0], (Property<rqc, Float>) property3, z3 ? 0.0f : 1.0f));
                if (frameLayoutArr[i5].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i5], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i5], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                gl.t1(this.X.F[1]);
            }
        } else {
            nlb nlbVar2 = this.w0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(nlbVar2, (Property<nlb, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            rqc rqcVar3 = this.L0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(rqcVar3, (Property<rqc, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], (Property<rqc, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.z0, (Property<gmb, Float>) property5, 1.0f));
        }
        this.t1.playTogether(arrayList2);
        this.t1.addListener(new ylb(this, z, i5, i, z3));
        this.t1.setInterpolator(s33.g);
        this.t1.setDuration(200L);
        this.t1.start();
    }

    public final void k1() {
        if (this.j2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (V0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.Q1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.Q1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.Q1.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        xg1 xg1Var = new xg1(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f, (this.Q1.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 2);
        this.j2 = xg1Var;
        xg1Var.setOnTouchListener(new jz1((byte) 28));
        this.k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l2 = ofFloat;
        ofFloat.addUpdateListener(new yg1(this, (byte) 3));
        this.l2.addListener(new vlb(this, (byte) 4));
        this.l2.setDuration(400L);
        this.l2.setInterpolator(ls3.e);
        this.l2.start();
        frameLayout.addView(this.j2, new ViewGroup.LayoutParams(-1, -1));
        gl.d3(new flb(this, (byte) 2));
    }

    public final void l1(boolean z) {
        long j = this.L1;
        if (j > 0) {
            this.B1.c(k96.M0(2131754209, null));
            return;
        }
        if (j >= 0) {
            this.B1.c(k96.M0(2131754211, null));
            return;
        }
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.L1));
        hmb hmbVar = this.B1;
        byte b = 1;
        if (K0 == null) {
            hmbVar.c(k96.a0(null, null, 2131754210, k96.M0(2131754904, null).toLowerCase()));
            return;
        }
        hmbVar.c(k96.a0(null, null, 2131754210, K0.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < S0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            cm2 cm2Var = this.s1;
            if (cm2Var == null) {
                cm2Var = new cm2(R.drawable.mini_switch_lock, 0);
                this.s1 = cm2Var;
                cm2Var.n = 1;
            }
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.G(S0(), "ReactionLevelRequiredBtn", new Object[0]));
            this.B1.b(spannableStringBuilder, z);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
        if (tL_premium_boostsStatus2 != null) {
            this.B1.b(null, z);
            return;
        }
        if (this.L1 >= 0 || this.V1 || this.W1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.V1 = true;
        getMessagesController().E0().a(this.L1, new ilb(this, b));
    }

    public final void m1() {
        if (this.H1 && this.y1 == null) {
            Bitmap bitmap = this.E1;
            if (bitmap != null) {
                this.z1 = bitmap;
                this.y1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                if (imageReceiver.E() || imageReceiver.n0 != null) {
                    this.z1 = imageReceiver.n();
                    this.y1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (!this.H1) {
            f1(false);
            return;
        }
        Bitmap bitmap2 = this.y1;
        if (bitmap2 != null) {
            this.z0.setImageBitmap(bitmap2);
        }
    }

    public final void n1() {
        long j;
        String str;
        File file;
        FrameLayout frameLayout;
        int i;
        Object obj = this.Y0;
        if (obj == null) {
            obj = this.D1;
        }
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            String r = ba4.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(r)) {
                return;
            }
            ba4.G(this.currentAccount);
            File J = ba4.J(tL_wallPaper.document, null, true, true);
            j = tL_wallPaper.document.size;
            str = r;
            file = J;
        } else {
            if (!(obj instanceof nm6)) {
                return;
            }
            nm6 nm6Var = (nm6) obj;
            TLRPC.Photo photo = nm6Var.K;
            if (photo != null) {
                TLRPC.PhotoSize w = ba4.w(photo.sizes, this.J1, true, null, false);
                ba4.G(this.currentAccount);
                file = ba4.J(w, null, true, true);
                str = ba4.r(null, w);
                i = w.size;
            } else {
                file = fl5.w(nm6Var.C);
                str = file.getName();
                i = nm6Var.G;
            }
            j = i;
            if (TextUtils.isEmpty(str)) {
                return;
            }
        }
        boolean exists = file.exists();
        int i2 = this.currentAccount;
        byte b = this.b;
        if (exists) {
            up3.q(i2).v(this);
            this.z0.invalidate();
            if (b == 2) {
                if (j == 0 || this.L1 != 0) {
                    this.u0.setSubtitle(null);
                } else {
                    this.u0.setSubtitle(gl.i0(j, false, false));
                }
            }
        } else {
            up3.q(i2).a(str, null, this);
            if (b == 2 && this.L1 == 0) {
                this.u0.setSubtitle(k96.M0(2131748586, null));
            }
            this.z0.invalidate();
        }
        if (this.Y0 == null && (frameLayout = this.A0) != null) {
            frameLayout.setAlpha(exists ? 1.0f : 0.5f);
        }
        if (b == 0) {
            this.e0.setEnabled(exists);
            this.e0.setAlpha(exists ? 1.0f : 0.5f);
            return;
        }
        if (b != 2) {
            this.f.setEnabled(exists);
            this.f.setAlpha(exists ? 1.0f : 0.5f);
            return;
        }
        this.E0.setEnabled(exists);
        hmb hmbVar = this.B1;
        if (hmbVar != null) {
            hmbVar.setAlpha(exists ? 1.0f : 0.5f);
        }
        hmb hmbVar2 = this.C1;
        if (hmbVar2 != null) {
            hmbVar2.setAlpha(exists ? 1.0f : 0.5f);
        }
    }

    public final void o1() {
        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.z0.invalidate();
        this.R0.h1();
        if (this.n1 >= 0.0f) {
            this.z0.getImageReceiver().W(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.z0.getImageReceiver().P(null);
            }
            if (this.z0.getBackground() instanceof ye7) {
                this.z0.getImageReceiver().W(((ye7) this.z0.getBackground()).k);
            }
        }
        this.a.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        W0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!Q0(z)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        ui5 ui5Var = this.parentLayout;
        if (ui5Var == null || ui5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().L(getThemedColor(bkb.g5));
        if (this.b != 2 || this.L1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().x0(-16777216);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.q3);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.l4);
        getNotificationCenter().b(this, kk7.w5);
        byte b = this.b;
        if (b == 1 || b == 0) {
            kk7.e().b(this, kk7.B4);
        }
        if (b == 2 || b == 1) {
            bkb.N = true;
        }
        if (b == 0 && this.w == null) {
            this.G1 = bkb.h0;
        } else {
            Point point = gl.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / gl.p));
            sb.append("_");
            this.I1 = de9.l(sb, (int) (max / gl.p), "_f");
            this.J1 = Math.max(point.x, point.y);
            kk7.e().b(this, kk7.h4);
            kk7.e().b(this, kk7.g4);
            this.v1 = up3.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                ad7.Y(this.currentAccount).m0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        kk7.f(this.currentAccount).n(this, kk7.q3);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.l4);
        getNotificationCenter().n(this, kk7.w5);
        gw9 gw9Var = this.m0;
        if (gw9Var != null && this.S != null) {
            gw9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        byte b = this.b;
        if ((b == 2 || b == 1) && this.r1 == null) {
            gl.d3(new cza((byte) 5));
        }
        int i = kk7.B4;
        if (b == 2) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.y1 = null;
            }
            this.a.k(null, null, null);
            kk7.e().k(i, new Object[0]);
        } else if (b == 1 || b == 0) {
            kk7.e().n(this, i);
        }
        if (b != 0 || this.w != null) {
            kk7.e().n(this, kk7.h4);
            kk7.e().n(this, kk7.g4);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.x1.b(false);
        }
        bkb.b = false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.q0;
        if (s20Var != null) {
            s20Var.f();
        }
        mmb mmbVar = this.x0;
        if (mmbVar != null) {
            mmbVar.f();
        }
        if (this.G1) {
            this.x1.b(true);
        }
        bkb.b = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            R0();
            try {
                gec gecVar = this.l0;
                if (gecVar != null) {
                    gl.x3(gecVar, getThemedColor(bkb.r8));
                }
                ty0 ty0Var = this.V0;
                if (ty0Var != null) {
                    ty0Var.setOuterColor(getThemedColor(bkb.Lj));
                    this.V0.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z || this.b != 2) {
            return;
        }
        this.a.k(null, null, null);
        kk7.e().k(kk7.B4, new Object[0]);
    }

    public final void p1() {
        byte b = this.b;
        if (b == 1 || b == 2) {
            if (this.Y0 == null && (this.D1 instanceof krc)) {
                this.L0[2].a(false, true);
            }
            this.L0[this.Y0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            rqc rqcVar = this.L0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(rqcVar, (Property<rqc, Float>) property, this.Y0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.L0[0], (Property<rqc, Float>) property, this.Y0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new wlb(this));
            animatorSet.setInterpolator(s33.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.L0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.L0[0].a(false, true);
        }
        this.L0[0].setEnabled(this.Y0 != null);
        if (this.Y0 != null) {
            this.L0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int L = (gl.L(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L0[0], (Property<rqc, Float>) View.ALPHA, this.Y0 == null ? 0.0f : 1.0f));
        rqc rqcVar2 = this.L0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(rqcVar2, (Property<rqc, Float>) property2, this.Y0 != null ? 0.0f : L));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L0[1], (Property<rqc, Float>) property2, this.Y0 == null ? -L : 0.0f));
        animatorSet2.setInterpolator(s33.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new xlb(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x008a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0088, code lost:
    
        if (r3 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r12 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r23.d1 != 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(boolean z) {
        int i;
        byte b;
        char c;
        float f;
        int i2;
        qlb qlbVar;
        boolean z2;
        int i3;
        BlendMode blendMode;
        int i4 = Build.VERSION.SDK_INT;
        byte b2 = this.b;
        zjb zjbVar = this.w;
        if (i4 >= 29) {
            if (b2 == 0) {
                i3 = zjbVar != null ? (int) zjbVar.l : getThemedColor(bkb.Fe);
            } else if (b2 == 1) {
                i3 = bkb.C0(bkb.Fe);
                long j = zjbVar.l;
                int i5 = (int) j;
                if (i5 != 0) {
                    i3 = i5;
                }
            } else {
                if (this.D1 instanceof krc) {
                    i3 = this.e1;
                }
                i3 = 0;
            }
            if (i3 == 0 || this.n1 < 0.0f) {
                this.z0.getImageReceiver().P(null);
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.P(blendMode);
            }
        }
        byte b3 = 2;
        if (this.F0 != null) {
            if (b2 != 2) {
                if (b2 == 1) {
                    int C0 = bkb.C0(bkb.Ee);
                    long j2 = zjbVar.k;
                    int i6 = (int) j2;
                    if (i6 != 0) {
                        C0 = i6;
                    } else if (j2 != 0) {
                        C0 = 0;
                    }
                }
                z2 = false;
            }
            boolean z3 = this.F0.getTag() != null;
            this.F0.setTag(z2 ? 1 : null);
            if (z3 != z2) {
                if (z2) {
                    this.F0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.J0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.J0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, (Property<qlb, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
                    c = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<qlb, Float>) View.SCALE_X, z2 ? 1.0f : 0.0f);
                    f = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F0, (Property<qlb, Float>) View.SCALE_Y, z2 ? 1.0f : 0.0f);
                    rqc rqcVar = this.L0[0];
                    Property property = View.TRANSLATION_X;
                    b = 3;
                    i2 = 5;
                    i = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(rqcVar, (Property<rqc, Float>) property, z2 ? gl.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.L0[1], (Property<rqc, Float>) property, z2 ? -gl.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.L0[2], (Property<rqc, Float>) property, z2 ? gl.L(34.0f) : 0.0f));
                    this.J0.setDuration(180L);
                    this.J0.addListener(new vlb(this, b3));
                    this.J0.setInterpolator(s33.g);
                    this.J0.start();
                } else {
                    i = 0;
                    b = 3;
                    c = 4;
                    f = 1.0f;
                    i2 = 5;
                    this.F0.setAlpha(z2 ? 1.0f : 0.0f);
                    this.F0.setScaleX(z2 ? 1.0f : 0.0f);
                    this.F0.setScaleY(z2 ? 1.0f : 0.0f);
                    this.L0[0].setTranslationX(z2 ? gl.L(34.0f) : 0.0f);
                    this.L0[1].setTranslationX(z2 ? -gl.L(34.0f) : 0.0f);
                    this.L0[2].setTranslationX(z2 ? gl.L(34.0f) : 0.0f);
                }
                qlbVar = this.G0;
                if (qlbVar == null) {
                    int i7 = qlbVar.getTag() != null ? 1 : i;
                    this.G0.setTag(1);
                    if (i7 != 1) {
                        this.G0.setVisibility(i);
                        AnimatorSet animatorSet3 = this.K0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z) {
                            float f2 = f;
                            this.G0.setAlpha(f2);
                            this.G0.setScaleX(f2);
                            this.G0.setScaleY(f2);
                            this.M0[0].setTranslationX(-gl.L(34.0f));
                            this.M0[1].setTranslationX(gl.L(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.K0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.G0, (Property<qlb, Float>) View.ALPHA, f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.G0, (Property<qlb, Float>) View.SCALE_X, f);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.G0, (Property<qlb, Float>) View.SCALE_Y, f);
                        rqc rqcVar2 = this.M0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(rqcVar2, (Property<rqc, Float>) property2, -gl.L(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.M0[1], (Property<rqc, Float>) property2, gl.L(34.0f));
                        Animator[] animatorArr = new Animator[i2];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[b] = ofFloat7;
                        animatorArr[c] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.K0.setDuration(180L);
                        this.K0.addListener(new vlb(this, b));
                        this.K0.setInterpolator(s33.g);
                        this.K0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i = 0;
        b = 3;
        c = 4;
        f = 1.0f;
        i2 = 5;
        qlbVar = this.G0;
        if (qlbVar == null) {
        }
    }

    public final void r1() {
        int childCount = this.R0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.R0.getChildAt(i);
            if (childAt instanceof ly7) {
                ((ly7) childAt).v(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setResourceProvider(wjb wjbVar) {
        this.a.a = wjbVar;
    }

    @Override // sp3
    public final void i(long j, long j2) {
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }

    public qmb(Object obj, Bitmap bitmap, boolean z) {
        super(null);
        this.a = new slb(this);
        this.d = true;
        this.n = 1;
        njb njbVar = new njb(this, 0, false);
        this.T = njbVar;
        njb njbVar2 = new njb(this, 0, true);
        this.U = njbVar2;
        njb njbVar3 = new njb(this, 1, false);
        this.V = njbVar3;
        njb njbVar4 = new njb(this, 1, true);
        this.W = njbVar4;
        this.Z = -1;
        this.a0 = new flb(this, (byte) 0);
        this.y0 = new gmb[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.p1 = 0.0f;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new ns4(getParentActivity(), new ln8((Object) this, (byte) 20));
        this.V1 = false;
        this.W1 = false;
        this.b = (byte) 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z;
        if (obj instanceof krc) {
            krc krcVar = (krc) obj;
            this.G1 = krcVar.i;
            TLRPC.TL_wallPaper tL_wallPaper = krcVar.g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f = krcVar.h;
                this.n1 = f;
                if (f < 0.0f && !bkb.I.o()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        njbVar.v = true;
        njbVar3.v = true;
        njbVar2.v = true;
        njbVar4.v = true;
    }

    public qmb(akb akbVar) {
        this(akbVar, false, 0, false, false);
    }
}
