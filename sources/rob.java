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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class rob extends d implements cr3, jm7 {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public iob B1;
    public ig5 C0;
    public iob C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public tc0 E0;
    public Bitmap E1;
    public final int F;
    public rnb F0;
    public boolean F1;
    public final int G;
    public rnb G0;
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
    public qob K1;
    public final long L;
    public tsc[] L0;
    public long L1;
    public final long M;
    public tsc[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public p09 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public r7 Q1;
    public long R;
    public smb R0;
    public ValueAnimator R1;
    public c45 S;
    public pob S0;
    public jp0 S1;
    public final plb T;
    public u46 T0;
    public qnb T1;
    public final plb U;
    public jf5 U0;
    public final ou4 U1;
    public final plb V;
    public a01 V0;
    public boolean V1;
    public final plb W;
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
    public final tnb a;
    public final Runnable a0;
    public TLRPC.TL_wallPaper a1;
    public float a2;
    public final byte b;
    public boolean b0;
    public int b1;
    public float b2;
    public Scroller c;
    public a91 c0;
    public int c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout d0;
    public int d1;
    public int d2;
    public h62 e;
    public TextView e0;
    public int e1;
    public ValueAnimator e2;
    public r7 f;
    public TextView f0;
    public int f1;
    public boolean f2;
    public final bmb g0;
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
    public fi1 j2;
    public ArrayList k0;
    public int k1;
    public float k2;
    public ggc l0;
    public int l1;
    public ValueAnimator l2;
    public qw9 m0;
    public int m1;
    public int n;
    public UndoView n0;
    public float n1;
    public FrameLayout o0;
    public float o1;
    public r59 p0;
    public float p1;
    public s30 q0;
    public float q1;
    public Drawable r;
    public wp4 r0;
    public job r1;
    public int s;
    public k47 s0;
    public pn2 s1;
    public boolean t0;
    public AnimatorSet t1;
    public a u0;
    public final PorterDuff.Mode u1;
    public k7 v0;
    public int v1;
    public final amb w;
    public onb w0;
    public se0 w1;
    public boolean x;
    public nob x0;
    public dtc x1;
    public final int y;
    public final hob[] y0;
    public Bitmap y1;
    public hob z0;
    public Bitmap z1;

    /* JADX WARN: Multi-variable type inference failed */
    public rob(bmb bmbVar, boolean z, int i, boolean z2, boolean z3) {
        super(null);
        amb i2;
        this.a = new tnb(this);
        this.d = true;
        this.n = 1;
        plb plbVar = new plb(this, 0, false);
        this.T = plbVar;
        plb plbVar2 = new plb(this, 0, true);
        this.U = plbVar2;
        plb plbVar3 = new plb(this, 1, false);
        this.V = plbVar3;
        plb plbVar4 = new plb(this, 1, true);
        this.W = plbVar4;
        this.Z = -1;
        this.a0 = new gnb(this, (byte) 0);
        this.y0 = new hob[2];
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
        this.U1 = new ou4(getParentActivity(), new cf9((Object) this, (byte) 14));
        this.V1 = false;
        this.W1 = false;
        this.b = i;
        this.h0 = z3;
        this.g0 = bmbVar;
        this.j0 = z;
        this.i0 = z2;
        if (i == 1) {
            i2 = bmbVar.i(!z2);
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
            i2 = bmbVar.i(false);
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
            cmb.M = cmb.B0();
            cmb.O = true;
            cmb.P = true;
            cmb.t(bmbVar, false, false);
        }
        nm7.e().k(nm7.y4, new Object[0]);
        plbVar.v = true;
        plbVar3.v = true;
        plbVar2.v = true;
        plbVar4.v = true;
    }

    @Override // cr3
    public final void A(boolean z) {
        o1();
    }

    @Override // cr3
    public final void N(String str) {
        o1();
    }

    public final void N0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        boolean z = this.G1;
        hob hobVar = this.z0;
        byte b = 1;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hobVar, (Property<hob, Float>) View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.z0, (Property<hob, Float>) View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hobVar, (Property<hob, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.z0, (Property<hob, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.z0, (Property<hob, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.z0, (Property<hob, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(d53.g);
        this.D0.addListener(new wnb(this, b));
        this.D0.start();
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
    public final void O0(boolean z) {
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
        TLRPC.UserFull X1;
        byte b = 2;
        if (this.L1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < T0()) {
                getMessagesController().F0().b(this.L1, this.X1, new jnb(this, b));
                return;
            } else if (this.X1 == null) {
                return;
            }
        }
        if (!getUserConfig().p() && z) {
            showDialog(new kj8((d) this, 22, true));
            return;
        }
        bmb bmbVar = cmb.I;
        String h = bmbVar.h(null, this.H1);
        int i8 = 0;
        String h2 = this.H1 ? bmbVar.h(null, false) : h;
        File e = usc.e(h);
        Object obj3 = this.D1;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
            Bitmap bitmap = this.z1;
            if (bitmap != null) {
                try {
                    usc.c(bitmap, Bitmap.CompressFormat.JPEG, e);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                if (imageReceiver.E() || imageReceiver.n0 != null) {
                    try {
                        usc.c(imageReceiver.n(), Bitmap.CompressFormat.JPEG, e);
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                }
                z2 = false;
                if (!z2) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) this.D1;
                    bc4.G(this.currentAccount);
                    try {
                        z2 = usc.a(bc4.J(tL_wallPaper3.document, null, true, true), e);
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                        z2 = false;
                    }
                }
                j = 0;
            }
            z2 = true;
            if (!z2) {
            }
            j = 0;
        } else if (obj3 instanceof mtc) {
            TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
            if (tL_wallPaper4 == null || tL_wallPaper4.document == null) {
                j = 0;
            } else {
                try {
                    bc4.G(this.currentAccount);
                    j = 0;
                    try {
                        btc.e(mi5.c(zsc.b(this.Y0)), new d6b(bc4.J(this.Y0.document, null, true, true), (byte) 4));
                    } catch (Throwable th) {
                        th = th;
                        fc4.g(th, true);
                        z2 = true;
                        z3 = false;
                        i = 4;
                        if (this.H1) {
                        }
                        obj = this.D1;
                        int i9 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        xlb xlbVar = new xlb();
                        xlbVar.a = h2;
                        xlbVar.b = h;
                        xlbVar.c = str;
                        xlbVar.i = this.H1;
                        xlbVar.j = this.G1;
                        xlbVar.d = i8;
                        xlbVar.e = i4;
                        xlbVar.f = i3;
                        xlbVar.g = i5;
                        xlbVar.h = i2;
                        if (this.O1) {
                        }
                        xlbVar.k = this.n1;
                        obj2 = this.D1;
                        if (obj2 instanceof mtc) {
                        }
                        j2 = this.L1;
                        xlbVar.n = j2;
                        if (j2 != j) {
                        }
                        xlbVar.o = z;
                        oc7.r1(this.currentAccount).F4(file2, xlbVar, str == null && this.L1 == j, 0L);
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
            if (obj3 instanceof ntc) {
                ntc ntcVar = (ntc) obj3;
                if (ntcVar.b != 0 || "t".equals(ntcVar.a)) {
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
                            File file3 = ntcVar.e;
                            file = file3 != null ? file3 : ntcVar.d;
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap((int) this.b2, this.E1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            i = 4;
                            canvas.translate(-((this.Z1 / this.Y1) * (this.E1.getWidth() - createBitmap.getWidth())), 0.0f);
                            canvas.drawBitmap(this.E1, 0.0f, 0.0f, (Paint) null);
                            File file4 = new File(bc4.z(4), Utilities.b.nextInt() + ".jpg");
                            ntcVar.d = file4;
                            usc.c(createBitmap, Bitmap.CompressFormat.JPEG, file4);
                            createBitmap.recycle();
                            file = ntcVar.d;
                        }
                        z3 = file.equals(e);
                        if (z3) {
                            z2 = true;
                        } else {
                            try {
                                z2 = usc.a(file, e);
                            } catch (Exception e6) {
                                e = e6;
                                fc4.g(e, true);
                                z2 = false;
                                if (this.H1) {
                                }
                                obj = this.D1;
                                int i92 = 45;
                                if (obj instanceof TLRPC.TL_wallPaper) {
                                }
                                xlb xlbVar2 = new xlb();
                                xlbVar2.a = h2;
                                xlbVar2.b = h;
                                xlbVar2.c = str;
                                xlbVar2.i = this.H1;
                                xlbVar2.j = this.G1;
                                xlbVar2.d = i8;
                                xlbVar2.e = i4;
                                xlbVar2.f = i3;
                                xlbVar2.g = i5;
                                xlbVar2.h = i2;
                                if (this.O1) {
                                }
                                xlbVar2.k = this.n1;
                                obj2 = this.D1;
                                if (obj2 instanceof mtc) {
                                }
                                j2 = this.L1;
                                xlbVar2.n = j2;
                                if (j2 != j) {
                                }
                                xlbVar2.o = z;
                                oc7.r1(this.currentAccount).F4(file2, xlbVar2, str == null && this.L1 == j, 0L);
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
                        fc4.g(e, true);
                        z2 = false;
                        if (this.H1) {
                        }
                        obj = this.D1;
                        int i922 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        xlb xlbVar22 = new xlb();
                        xlbVar22.a = h2;
                        xlbVar22.b = h;
                        xlbVar22.c = str;
                        xlbVar22.i = this.H1;
                        xlbVar22.j = this.G1;
                        xlbVar22.d = i8;
                        xlbVar22.e = i4;
                        xlbVar22.f = i3;
                        xlbVar22.g = i5;
                        xlbVar22.h = i2;
                        if (this.O1) {
                        }
                        xlbVar22.k = this.n1;
                        obj2 = this.D1;
                        if (obj2 instanceof mtc) {
                        }
                        j2 = this.L1;
                        xlbVar22.n = j2;
                        if (j2 != j) {
                        }
                        xlbVar22.o = z;
                        oc7.r1(this.currentAccount).F4(file2, xlbVar22, str == null && this.L1 == j, 0L);
                        if (z5) {
                        }
                        z7 = z6;
                        if (z7) {
                        }
                    }
                }
            } else {
                i = 4;
                if (obj3 instanceof no6) {
                    no6 no6Var = (no6) obj3;
                    TLRPC.Photo photo = no6Var.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w3 = bc4.w(photo.sizes, this.J1, true, null, false);
                        bc4.G(this.currentAccount);
                        w = bc4.J(w3, null, true, true);
                    } else {
                        w = fn5.w(no6Var.C);
                    }
                    try {
                        z2 = usc.a(w, e);
                    } catch (Exception e8) {
                        fc4.g(e8, true);
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
                    usc.c(this.y1, Bitmap.CompressFormat.JPEG, usc.e(h2));
                    z2 = true;
                } catch (Throwable th3) {
                    fc4.g(th3, true);
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
            } else if (obj instanceof mtc) {
                if ("d".equals(((mtc) obj).a)) {
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
                if (obj instanceof ntc) {
                    ntc ntcVar2 = (ntc) obj;
                    String str5 = ntcVar2.a;
                    z4 = z3;
                    file2 = ntcVar2.d;
                    str = str5;
                    i2 = 45;
                    tL_wallPaper = null;
                } else {
                    if (obj instanceof no6) {
                        no6 no6Var2 = (no6) obj;
                        TLRPC.Photo photo2 = no6Var2.K;
                        if (photo2 != null) {
                            tL_wallPaper2 = null;
                            TLRPC.PhotoSize w4 = bc4.w(photo2.sizes, this.J1, true, null, false);
                            bc4.G(this.currentAccount);
                            w2 = bc4.J(w4, null, true, true);
                        } else {
                            tL_wallPaper2 = null;
                            w2 = fn5.w(no6Var2.C);
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
            xlb xlbVar222 = new xlb();
            xlbVar222.a = h2;
            xlbVar222.b = h;
            xlbVar222.c = str;
            xlbVar222.i = this.H1;
            xlbVar222.j = this.G1;
            xlbVar222.d = i8;
            xlbVar222.e = i4;
            xlbVar222.f = i3;
            xlbVar222.g = i5;
            xlbVar222.h = i2;
            if (this.O1) {
                float f3 = this.p1;
                if (f3 >= f) {
                    xlbVar222.k = f3;
                    obj2 = this.D1;
                    if (obj2 instanceof mtc) {
                        mtc mtcVar = (mtc) obj2;
                        String str6 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                        float f4 = mtcVar.h;
                        if (f4 < f && !cmb.I.o()) {
                            f4 *= -1.0f;
                        }
                        if (mtcVar.k != null && mtcVar.b == i8 && mtcVar.c == i4 && mtcVar.d == i3 && mtcVar.e == i5 && TextUtils.equals(mtcVar.a, str6) && mtcVar.f == i2 && (this.Y0 == null || Math.abs(f4 - this.n1) < 0.001f)) {
                            TLRPC.WallPaper wallPaper = mtcVar.k;
                            xlbVar222.l = wallPaper.id;
                            xlbVar222.m = wallPaper.access_hash;
                        }
                    }
                    j2 = this.L1;
                    xlbVar222.n = j2;
                    if (j2 != j && (X1 = getMessagesController().X1(this.L1)) != null) {
                        xlbVar222.t = X1.wallpaper;
                    }
                    xlbVar222.o = z;
                    oc7.r1(this.currentAccount).F4(file2, xlbVar222, str == null && this.L1 == j, 0L);
                    if (z5) {
                        z6 = true;
                    } else {
                        if (this.L1 != j) {
                            if (file2 == null || getMessagesController().K2 != xlbVar222) {
                                z8 = false;
                                uf2.e(this.currentAccount).s(this.L1, null, xlbVar222, this.s0, new jd((byte) 10));
                            } else {
                                tL_wallPaper = new TLRPC.TL_wallPaper();
                                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                tL_wallPaper.settings = tL_wallPaperSettings;
                                tL_wallPaperSettings.intensity = (int) (xlbVar222.k * 100.0f);
                                tL_wallPaperSettings.blur = xlbVar222.i;
                                tL_wallPaperSettings.motion = xlbVar222.j;
                                tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                Bitmap createBitmap2 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(createBitmap2);
                                float max = Math.max(50.0f / this.z0.getMeasuredWidth(), 50.0f / this.z0.getMeasuredHeight());
                                canvas2.scale(max, max);
                                int measuredHeight = this.z0.getMeasuredHeight();
                                int measuredWidth = this.z0.getMeasuredWidth();
                                hob hobVar = this.z0;
                                if (measuredHeight > measuredWidth) {
                                    f2 = f;
                                    canvas2.translate(f2, (-(hobVar.getMeasuredHeight() - this.z0.getMeasuredWidth())) / 2.0f);
                                } else {
                                    f2 = f;
                                    canvas2.translate((-(hobVar.getMeasuredWidth() - this.z0.getMeasuredHeight())) / 2.0f, f2);
                                }
                                float f5 = this.p1;
                                this.p1 = f2;
                                this.z0.draw(canvas2);
                                this.p1 = f5;
                                Utilities.blurBitmap(createBitmap2, 3);
                                tL_wallPaper.stripedThumb = createBitmap2;
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                a6a.B(this.currentAccount);
                                tL_messageService.random_id = a6a.D();
                                tL_messageService.dialog_id = this.L1;
                                tL_messageService.unread = true;
                                tL_messageService.out = true;
                                int i12 = getUserConfig().i();
                                tL_messageService.id = i12;
                                tL_messageService.local_id = i12;
                                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.L1));
                                if (sd2.T(L0)) {
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_messageService.from_id = tL_peerChannel;
                                    tL_peerChannel.channel_id = L0.id;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_messageService.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = L0.id;
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
                                arrayList.add(new k47(this.currentAccount, tL_messageService, false, false));
                                new ArrayList().add(tL_messageService);
                                oc7.r1(this.currentAccount).t5(0, this.L1, arrayList);
                                if (this.L1 >= j) {
                                    TLRPC.UserFull X12 = getMessagesController().X1(this.L1);
                                    if (X12 != null) {
                                        X12.wallpaper = tL_wallPaper;
                                        nm7.f(this.currentAccount).k(nm7.E0, Long.valueOf(this.L1), X12);
                                    }
                                } else {
                                    TLRPC.ChatFull M0 = getMessagesController().M0(-this.L1);
                                    if (M0 != null) {
                                        M0.wallpaper = tL_wallPaper;
                                        nm7 f6 = nm7.f(this.currentAccount);
                                        z8 = false;
                                        Object[] objArr = new Object[i];
                                        objArr[0] = M0;
                                        objArr[1] = 0;
                                        Boolean bool = Boolean.FALSE;
                                        objArr[2] = bool;
                                        objArr[3] = bool;
                                        f6.k(nm7.T, objArr);
                                    }
                                }
                                z8 = false;
                            }
                            this.f2 = true;
                            qob qobVar = this.K1;
                            if (qobVar != null) {
                                qobVar.a(tL_wallPaper);
                            }
                            finishFragment();
                            z7 = z8;
                            if (z7) {
                                qob qobVar2 = this.K1;
                                if (qobVar2 != null) {
                                    qobVar2.a(tL_wallPaper);
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        cmb.b0 = getThemedColor(cmb.bd);
                        cmb.I.v("t".equals(xlbVar222.c) ? null : xlbVar222);
                        z6 = true;
                        cmb.s1(true);
                        if (!z4) {
                            fn5.z().M(Utilities.a(e.getAbsolutePath()) + "@100_100");
                        }
                    }
                    z7 = z6;
                    if (z7) {
                    }
                }
            }
            xlbVar222.k = this.n1;
            obj2 = this.D1;
            if (obj2 instanceof mtc) {
            }
            j2 = this.L1;
            xlbVar222.n = j2;
            if (j2 != j) {
                xlbVar222.t = X1.wallpaper;
            }
            xlbVar222.o = z;
            oc7.r1(this.currentAccount).F4(file2, xlbVar222, str == null && this.L1 == j, 0L);
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
        xlb xlbVar2222 = new xlb();
        xlbVar2222.a = h2;
        xlbVar2222.b = h;
        xlbVar2222.c = str;
        xlbVar2222.i = this.H1;
        xlbVar2222.j = this.G1;
        xlbVar2222.d = i8;
        xlbVar2222.e = i4;
        xlbVar2222.f = i3;
        xlbVar2222.g = i5;
        xlbVar2222.h = i2;
        if (this.O1) {
        }
        xlbVar2222.k = this.n1;
        obj2 = this.D1;
        if (obj2 instanceof mtc) {
        }
        j2 = this.L1;
        xlbVar2222.n = j2;
        if (j2 != j) {
        }
        xlbVar2222.o = z;
        oc7.r1(this.currentAccount).F4(file2, xlbVar2222, str == null && this.L1 == j, 0L);
        if (z5) {
        }
        z7 = z6;
        if (z7) {
        }
    }

    public final void P0(boolean z) {
        byte b = this.b;
        if (b == 2) {
            if (z) {
                return;
            }
            finishFragment();
            return;
        }
        cmb.o();
        nm7.e().n(this, nm7.D4);
        amb ambVar = this.w;
        if (b == 1) {
            if (this.i0) {
                ambVar.c = this.y;
                ambVar.d = this.E;
                ambVar.e = this.F;
                ambVar.f = this.G;
                ambVar.g = this.H;
                ambVar.h = this.I;
                ambVar.i = this.J;
                ambVar.j = this.K;
                ambVar.k = this.L;
                ambVar.l = this.M;
                ambVar.m = this.N;
                ambVar.n = this.Q;
                ambVar.o = this.P;
                ambVar.p = this.O;
            }
            cmb.x1(this.g0, false, true, false, false, false);
        } else {
            if (ambVar != null) {
                cmb.x1(this.g0, false, this.j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.j0) {
                bmb bmbVar = this.g0;
                if (bmbVar.b != null && cmb.H.get(bmbVar.k()) == null) {
                    new File(bmbVar.b).delete();
                }
            }
        }
        if (z) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable Q0(Drawable drawable) {
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
        gm.l2(colorMatrix, 0.94f);
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
    public final boolean R0(boolean z) {
        if (this.b == 1) {
            amb ambVar = this.w;
            if (ambVar.c == this.y && ambVar.d == this.E && ambVar.e == this.F && ambVar.f == this.G && ambVar.g == this.H && ambVar.h == this.I && ambVar.i == this.J && ambVar.j == this.K && ambVar.k == this.L && ambVar.l == this.M && ambVar.m == this.N && Math.abs(ambVar.p - this.O) <= 0.001f && ambVar.n == this.Q) {
                String str = ambVar.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    if (this.Y0 != null) {
                        if (ambVar.q == this.G1) {
                        }
                    }
                }
            }
            if (!z) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131745678, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131745679, null);
            alertDialog$Builder.j(jb6.M0(2131745680, null), new inb(this, (byte) 3));
            alertDialog$Builder.g(jb6.M0(2131747313, null), new inb(this, (byte) 4));
            showDialog(heVar);
            return false;
        }
        return true;
    }

    public final void S0() {
        int themedColor;
        h62 h62Var = this.e;
        int i = 0;
        if (h62Var != null) {
            h62Var.I(getThemedColor(cmb.F8));
            this.e.O(getThemedColor(cmb.D8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(cmb.c6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        tc0 tc0Var = this.E0;
        if (tc0Var != null) {
            tc0Var.invalidate();
        }
        if (this.r1 != null) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var == null || tk5Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(cmb.g5));
            } else {
                this.parentLayout.getBottomSheet().K(getThemedColor(cmb.g5));
                if (this.b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().x0(-16777216);
                }
            }
        }
        if (this.L0 != null) {
            int i2 = 0;
            while (true) {
                tsc[] tscVarArr = this.L0;
                if (i2 >= tscVarArr.length) {
                    break;
                }
                tsc tscVar = tscVarArr[i2];
                if (tscVar != null) {
                    tscVar.invalidate();
                }
                i2++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                tsc[] tscVarArr2 = this.M0;
                if (i >= tscVarArr2.length) {
                    break;
                }
                tsc tscVar2 = tscVarArr2[i];
                if (tscVar2 != null) {
                    tscVar2.invalidate();
                }
                i++;
            }
        }
        TextView textView = this.g2;
        if (textView != null) {
            anb.X(textView, cmb.F6, this.a);
        }
        p pVar = this.X;
        if (pVar != null) {
            pVar.invalidate();
        }
        wp4 wp4Var = this.r0;
        if (wp4Var != null) {
            wp4Var.updateColors();
        }
    }

    public final int T0() {
        return sd2.U(this.currentAccount, -this.L1) ? getMessagesController().l4.g2.f() : getMessagesController().l4.Y1.f();
    }

    public final ArrayList U0() {
        t10 t10Var = new t10(this, (byte) 22);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        arrayList.add(new cnb(this.u0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.F8));
        arrayList.add(new cnb(this.u0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.D8));
        p pVar = this.X;
        if (pVar != null) {
            r7 r7Var = pVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = pVar.F;
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                arrayList.add(new cnb(editTextBoldCursorArr[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
                arrayList.add(new cnb(editTextBoldCursorArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
                arrayList.add(new cnb(editTextBoldCursorArr[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
            }
            arrayList.add(new cnb(pVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.H5));
            if (r7Var != null) {
                t10 t10Var2 = new t10(pVar, (byte) 5);
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.F6));
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.D8));
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.E8));
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.F8));
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
            plb plbVar = this.T;
            plb plbVar2 = this.V;
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{plbVar, plbVar2}, (bnb) null, cmb.tb));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{plbVar, plbVar2}, (bnb) null, cmb.ub));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{plbVar, plbVar2}, (bnb) null, cmb.vb));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((cnb) arrayList.get(i6)).n = this.a;
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
    
        r5 = cmb.C0(cmb.Ee);
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
    
        r5 = cmb.C0(cmb.Fe);
        r8 = r2.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0057, code lost:
    
        r5 = cmb.C0(cmb.Ge);
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
    public final boolean V0(int i) {
        if (!this.i0) {
            amb ambVar = this.w;
            if (i == 1 || i == 2) {
                long j = this.K;
                if (j == 0) {
                    int C0 = cmb.C0(cmb.De);
                    int i2 = (int) ambVar.j;
                    if (i2 == 0) {
                        i2 = C0;
                    }
                }
            }
            if (i == 1 || i == 3) {
                if (this.y == ambVar.d) {
                    int i3 = ambVar.e;
                    int i4 = this.F;
                    if (i4 == 0 ? i3 == 0 || i3 == ambVar.c : i4 == i3) {
                        int i5 = ambVar.f;
                        int i6 = this.G;
                        if (i6 == 0 ? i5 == 0 : i6 == i5) {
                            int i7 = ambVar.g;
                            int i8 = this.H;
                            if (i8 == 0 ? i7 == 0 : i8 == i7) {
                                int i9 = ambVar.h;
                                int i10 = this.I;
                                if (i10 == 0 ? i9 == 0 : i10 == i9) {
                                    if (this.J == ambVar.i) {
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

    public boolean W0() {
        tk5 tk5Var = this.parentLayout;
        return (tk5Var == null || tk5Var.getBottomSheet() == null) ? false : true;
    }

    public final void X0() {
        jp0 jp0Var = this.S1;
        if (jp0Var != null) {
            jp0Var.invalidate();
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
                tsc[] tscVarArr = this.L0;
                if (i3 >= tscVarArr.length) {
                    break;
                }
                tsc tscVar = tscVarArr[i3];
                if (tscVar != null) {
                    tscVar.setDimAmount(this.O1 ? this.p1 * this.q1 : 0.0f);
                    this.L0[i3].invalidate();
                }
                i3++;
            }
        }
        if (this.p0 != null) {
            for (int i4 = 0; i4 < this.p0.getChildCount(); i4++) {
                View childAt = this.p0.getChildAt(i4);
                if (childAt instanceof cm1) {
                    i1((cm1) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.w0 != null) {
            for (int i5 = 0; i5 < this.w0.getChildCount(); i5++) {
                View childAt2 = this.w0.getChildAt(i5);
                if (childAt2 instanceof cm1) {
                    i1((cm1) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        iob iobVar = this.B1;
        if (iobVar != null) {
            iobVar.invalidate();
        }
        iob iobVar2 = this.C1;
        if (iobVar2 != null) {
            iobVar2.invalidate();
        }
        tc0 tc0Var = this.E0;
        if (tc0Var != null) {
            tc0Var.invalidate();
        }
    }

    public final void Y0(vh1 vh1Var) {
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(23, this.currentAccount, this.a, getParentActivity(), this);
        i46Var.r1(vh1Var);
        i46Var.q1(this.X1, true);
        i46Var.s1(this.L1);
        if (!W0()) {
            i46Var.L2 = new gnb(this, (byte) 1);
        }
        showDialog(i46Var);
    }

    public final void Z0() {
        bmb bmbVar = cmb.M;
        if (bmbVar == null) {
            return;
        }
        int i = bmbVar.a0;
        amb i2 = i >= 0 ? (amb) bmbVar.b0.get(i) : bmbVar.i(false);
        if (this.w != null) {
            b1();
            cmb.x1(this.g0, true, false, false, false, false);
            if (cmb.M != null) {
                cmb.O = false;
                cmb.P = false;
                cmb.M = null;
            }
            cmb.t(this.g0, true, this.h0);
            ((ActionBarLayout) this.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) this.parentLayout).W(false, false);
            File file = new File(this.g0.b);
            bmb bmbVar2 = this.g0;
            cmb.u(file, bmbVar2.a, bmbVar2.G, false);
            oc7.r1(this.g0.F).C4(this.g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", this.g0.k());
            edit.commit();
        }
        d dVar = (d) getParentLayout().getFragmentStack().get(Math.max(0, getParentLayout().getFragmentStack().size() - 2));
        finishFragment();
        if (this.b == 0) {
            nm7.e().k(nm7.t4, bmbVar, i2, Boolean.valueOf(this.j0));
        }
        cmb.K1(dVar);
    }

    public final /* synthetic */ void a1(TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        boolean z = tLObject instanceof TL_account.TL_wallPapers;
        amb ambVar = this.w;
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
                        if (ambVar != null && (str = ambVar.o) != null && str.equals(tL_wallPaper2.slug)) {
                            this.Y0 = tL_wallPaper2;
                            g1(false);
                            o1();
                        } else if (ambVar == null) {
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
            pob pobVar = this.S0;
            if (pobVar != null) {
                pobVar.f();
            }
            cf7.Y(this.currentAccount).m1(1, tL_wallPapers.wallpapers);
        }
        if (this.Y0 != null || ambVar == null || TextUtils.isEmpty(ambVar.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = ambVar.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(getConnectionsManager().sendRequest(getwallpaper, new mnb(this, b)), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.h5));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.dc));
        hashSet.add(Integer.valueOf(cmb.ee));
        hashSet.add(Integer.valueOf(cmb.ic));
        hashSet.add(Integer.valueOf(cmb.de));
        hashSet.add(Integer.valueOf(cmb.Vb));
        hashSet.add(Integer.valueOf(cmb.Qd));
        hashSet.add(Integer.valueOf(cmb.Tb));
        hashSet.add(Integer.valueOf(cmb.Od));
        hashSet.add(Integer.valueOf(cmb.Qb));
        hashSet.add(Integer.valueOf(cmb.Kd));
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.Vc));
        hashSet.add(Integer.valueOf(cmb.Uc));
        hashSet.add(Integer.valueOf(cmb.sb));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.sa));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.Jj));
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.Je));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.A8));
    }

    public final void b1() {
        TLRPC.TL_wallPaper tL_wallPaper;
        amb ambVar = this.w;
        if (ambVar == null || TextUtils.isEmpty(ambVar.o) || (tL_wallPaper = this.Y0) == null || tL_wallPaper.document == null) {
            return;
        }
        try {
            bc4.G(this.currentAccount);
            btc.e(mi5.c(ambVar.o), new d6b(bc4.J(this.Y0.document, null, true, true), (byte) 3));
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    public final void c1() {
        d1(2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0fa4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x090f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x091a A[EDGE_INSN: B:246:0x091a->B:247:0x091a BREAK  A[LOOP:2: B:197:0x082f->B:223:0x090f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06d3  */
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
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e12  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0e4c  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v21 */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z;
        tk5 tk5Var;
        final byte b;
        byte b2;
        int i;
        hob[] hobVarArr;
        boolean z2;
        int i2;
        float f;
        int i3;
        int i4;
        Object obj;
        int i5;
        byte b3;
        amb ambVar;
        int i6;
        final int i7;
        tnb tnbVar;
        byte b4;
        amb ambVar2;
        final int i8;
        FrameLayout.LayoutParams e;
        float f2;
        float f3;
        bmb bmbVar;
        ?? r14;
        amb ambVar3;
        final byte b5;
        tk5 tk5Var2;
        int i9;
        this.T.p = getResourceProvider();
        this.U.p = getResourceProvider();
        this.V.p = getResourceProvider();
        this.W.p = getResourceProvider();
        byte b6 = 1;
        this.hasOwnBackground = true;
        job jobVar = this.r1;
        byte b7 = 0;
        boolean z3 = (jobVar == null || this.L1 == 0) ? false : true;
        this.N1 = z3;
        if (z3) {
            Object obj2 = this.D1;
            if (!(obj2 instanceof ntc)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z = true;
            this.O1 = z;
            if (z) {
                this.q1 = jobVar.a() ? 1.0f : 0.0f;
            }
            tk5Var = this.parentLayout;
            if (tk5Var != null && ((ActionBarLayout) tk5Var).y()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.o0 = new FrameLayout(context);
            b = 3;
            if (this.O1 && gda.R < 3) {
                gm.d3(new gnb(this, b), 2000L);
            }
            this.actionBar.t().a(0, R.drawable.outline_header_search).M().K(new dob()).setSearchFieldHint(jb6.L0(2131745570));
            this.actionBar.setBackButtonDrawable(new a27());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(jb6.L0(2131743857));
            bdb bdbVar = new bdb(b6, context, this);
            this.o0 = bdbVar;
            anb.h(cmb.c6, getResourceProvider(), bdbVar);
            this.o0.addView(this.actionBar, qoe.c(-2.0f, -1));
            r59 r59Var = new r59(context);
            this.p0 = r59Var;
            r59Var.setVerticalScrollBarEnabled(true);
            this.p0.setItemAnimator(null);
            this.p0.setLayoutAnimation(null);
            this.p0.setLayoutManager(new u46(1, false));
            final byte b8 = 2;
            this.p0.setVerticalScrollbarPosition(!jb6.a0 ? 1 : 2);
            r59 r59Var2 = this.p0;
            b2 = this.b;
            r59Var2.setPadding(0, 0, 0, gm.L(b2 == 0 ? 12.0f : 0.0f));
            this.p0.setOnItemClickListener(new l5(b7));
            this.o0.addView(this.p0, qoe.e(-1, -1, 51));
            wp4 wp4Var = new wp4(context, this.resourceProvider);
            this.r0 = wp4Var;
            wp4Var.setImageResource(R.drawable.floating_pencil);
            this.o0.addView(this.r0, wp4.b());
            s30 s30Var = new s30(context);
            this.q0 = s30Var;
            this.p0.setAdapter(s30Var);
            this.v0 = new k7(b, context, this);
            this.x0 = new nob(this, context);
            this.u0 = createActionBar(context);
            if (gm.O1()) {
                this.u0.setOccupyStatusBar(false);
            }
            this.u0.setBackButtonDrawable(new ee0(false));
            this.u0.setActionBarMenuOnItemClick(new gob(this));
            i = 0;
            while (true) {
                hobVarArr = this.y0;
                if (i < 2) {
                    break;
                }
                hobVarArr[i] = new hob(this, (Activity) getContext());
                this.v0.addView(hobVarArr[i], qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i++;
            }
            hob hobVar = hobVarArr[0];
            this.z0 = hobVar;
            hobVar.setVisibility(0);
            hobVarArr[1].setVisibility(8);
            if (b2 == 2) {
                this.z0.getImageReceiver().h1 = new inb(this, b7);
            }
            z2 = this.x0.e;
            bmb bmbVar2 = this.g0;
            final byte b9 = 4;
            if (!z2) {
                this.u0.setTitle("Telegram Beta Chat");
                this.u0.setSubtitle(jb6.G(505, "Members", new Object[0]));
            } else if (b2 == 2) {
                long j = this.L1;
                a aVar = this.u0;
                if (j != 0) {
                    aVar.setTitle(jb6.L0(2131742615));
                } else {
                    aVar.setTitle(jb6.L0(2131753706));
                }
                r6 t = this.u0.t();
                Object obj3 = this.D1;
                if ((obj3 instanceof ntc) && ((ntc) obj3).e != null) {
                    t.a(7, R.drawable.msg_header_draw);
                }
                if (this.L1 == 0) {
                    boolean z4 = e21.a;
                    Object obj4 = this.D1;
                    if (((obj4 instanceof mtc) && !"d".equals(((mtc) obj4).a)) || (this.D1 instanceof TLRPC.TL_wallPaper)) {
                        t.a(5, R.drawable.msg_header_share);
                    }
                }
                if (this.L1 != 0 && this.N1) {
                    p09 p09Var = new p09(R.raw.sun, gm.L(28.0f), gm.L(28.0f), true, null);
                    this.P1 = p09Var;
                    this.Q1 = t.d(6, p09Var);
                    this.P1.h = true;
                    job jobVar2 = this.r1;
                    if (jobVar2 == null || jobVar2.a()) {
                        this.P1.H(35);
                        this.P1.K(36);
                    } else {
                        this.P1.K(0);
                        this.P1.H(0);
                    }
                    this.P1.a0 = true;
                    int u0 = cmb.u0(cmb.I9);
                    this.P1.L(u0, "Sunny");
                    this.P1.L(u0, "Path 6");
                    this.P1.L(u0, "Path");
                    this.P1.L(u0, "Path 5");
                    this.P1.j();
                }
            } else if (b2 == 1) {
                r6 t2 = this.u0.t();
                this.f = t2.e(4, jb6.L0(2131745680));
                h62 h62Var = new h62(this, context, t2);
                this.e = h62Var;
                h62Var.setSubMenuOpenSide(1);
                this.e.g(2, jb6.L0(2131751953));
                this.e.g(1, jb6.L0(2131751952));
                this.e.g(3, jb6.L0(2131751951));
                h62 h62Var2 = this.e;
                h62Var2.S = false;
                h62Var2.setForceSmoothKeyboard(true);
                this.u0.addView(this.e, qoe.d(-2, -1.0f, 51, gm.O1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: hnb
                    public final /* synthetic */ rob b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b10 = b8;
                        rob robVar = this.b;
                        switch (b10) {
                            case 0:
                                robVar.P0(false);
                                break;
                            case 1:
                                robVar.Z0();
                                break;
                            case 2:
                                robVar.e.U(null, null);
                                break;
                            case 3:
                                robVar.O0(false);
                                break;
                            default:
                                robVar.O0(true);
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
                int i10 = cmb.z8;
                anb.X(textView2, i10, getResourceProvider());
                this.h.setTypeface(gm.o());
                this.h.setText(jb6.L0(2131751952));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                anb.x(this.h, mutate, i10, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(gm.L(4.0f));
                this.h.setPadding(0, 0, gm.L(10.0f), 0);
                this.e.addView(this.h, qoe.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = bmbVar2.G;
                String l = tL_theme != null ? tL_theme.title : bmbVar2.l();
                int lastIndexOf = l.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    l = l.substring(0, lastIndexOf);
                }
                this.u0.setTitle(l);
                TLRPC.TL_theme tL_theme2 = bmbVar2.G;
                if (tL_theme2 == null || (i2 = tL_theme2.installs_count) <= 0) {
                    this.u0.setSubtitle(jb6.w((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.u0.setSubtitle(jb6.G(i2, "ThemeInstallCount", new Object[0]));
                }
            }
            this.w0 = new onb(this, context);
            pnb pnbVar = new pnb(this);
            pnbVar.C = false;
            this.w0.setItemAnimator(pnbVar);
            this.w0.setVerticalScrollBarEnabled(true);
            this.w0.setOverScrollMode(2);
            onb onbVar = this.w0;
            if (b2 != 2) {
                onbVar.setPadding(0, gm.L(4.0f), 0, (gm.L(72 + ((this.M1 || this.L1 <= 0) ? 0 : 58)) - 12) + (W0() ? gm.n : 0));
            } else if (b2 == 1) {
                onbVar.setPadding(0, gm.L(4.0f), 0, gm.L(16.0f));
            } else {
                onbVar.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
            }
            this.w0.setClipToPadding(false);
            this.w0.setLayoutManager(new u46(1, true));
            this.w0.setVerticalScrollbarPosition(!jb6.a0 ? 1 : 2);
            k7 k7Var = this.v0;
            onb onbVar2 = this.w0;
            if (b2 != 1) {
                k7Var.addView(onbVar2, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.w0.setOnItemClickListener(new inb(this, b6));
                f = 16.0f;
                i3 = -1;
            } else {
                f = 16.0f;
                i3 = -1;
                k7Var.addView(onbVar2, qoe.e(-1, -1, 51));
            }
            this.w0.setOnScrollListener(new k2b(this, b8));
            this.v0.addView(this.u0, qoe.c(-2.0f, i3));
            dtc dtcVar = new dtc(context);
            this.x1 = dtcVar;
            dtcVar.n = new inb(this, b8);
            amb ambVar4 = this.w;
            if (b2 != 1 || b2 == 2) {
                if (b2 != 2) {
                    tc0 tc0Var = new tc0(this, context, W0());
                    this.E0 = tc0Var;
                    tc0Var.setWillNotDraw(false);
                    i4 = 2;
                    this.E0.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f) + (W0() ? gm.n : 0));
                    this.v0.addView(this.E0, qoe.e(-1, 0, 81));
                    iob iobVar = new iob(this, context);
                    this.B1 = iobVar;
                    rve.b(iobVar, 0.033f, 1.2f);
                    m1(false);
                    this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: hnb
                        public final /* synthetic */ rob b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b10 = b;
                            rob robVar = this.b;
                            switch (b10) {
                                case 0:
                                    robVar.P0(false);
                                    break;
                                case 1:
                                    robVar.Z0();
                                    break;
                                case 2:
                                    robVar.e.U(null, null);
                                    break;
                                case 3:
                                    robVar.O0(false);
                                    break;
                                default:
                                    robVar.O0(true);
                                    break;
                            }
                        }
                    });
                    if (this.L1 <= 0 || this.M1 || this.s0 != null) {
                        this.E0.addView(this.B1, qoe.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        iob iobVar2 = new iob(this, context);
                        this.C1 = iobVar2;
                        rve.b(iobVar2, 0.033f, 1.2f);
                        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.L1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().p()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new pn2(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) jb6.Z(2131754176, m9c.r(W1)));
                        this.C1.c(spannableStringBuilder);
                        try {
                            iob iobVar3 = this.C1;
                            iobVar3.c(gw3.l(iobVar3.a(), this.C1.a.g(), false));
                        } catch (Exception unused) {
                        }
                        this.C1.setOnClickListener(new View.OnClickListener(this) { // from class: hnb
                            public final /* synthetic */ rob b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b10 = b9;
                                rob robVar = this.b;
                                switch (b10) {
                                    case 0:
                                        robVar.P0(false);
                                        break;
                                    case 1:
                                        robVar.Z0();
                                        break;
                                    case 2:
                                        robVar.e.U(null, null);
                                        break;
                                    case 3:
                                        robVar.O0(false);
                                        break;
                                    default:
                                        robVar.O0(true);
                                        break;
                                }
                            }
                        });
                        this.E0.addView(this.B1, qoe.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.E0.addView(this.C1, qoe.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.O1) {
                        jp0 jp0Var = new jp0(this, (Activity) getContext());
                        this.S1 = jp0Var;
                        jp0Var.setPadding(gm.L(f), gm.L(f), gm.L(f), gm.L(f));
                        this.v0.addView(this.S1, qoe.e(nm7.y3, 76, 49));
                        qnb qnbVar = new qnb(getContext(), 3);
                        this.T1 = qnbVar;
                        qnbVar.c(this.p1);
                        this.T1.b();
                        qnb qnbVar2 = this.T1;
                        qnbVar2.h = new jnb(this, b7);
                        this.S1.addView(qnbVar2);
                        job jobVar3 = this.r1;
                        if (jobVar3 != null) {
                            this.T1.setVisibility(jobVar3.a() ? 0 : 8);
                            this.T1.setAlpha(this.r1.a() ? 1.0f : 0.0f);
                            this.T1.c(this.r1.a() ? this.p1 : 0.0f);
                        }
                    }
                } else {
                    i4 = 2;
                }
                Rect rect = new Rect();
                Drawable d = b10.d(context, R.drawable.sheet_shadow_round);
                this.r = d;
                d.getPadding(rect);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(cmb.c6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                hg9.o(new TextPaint(1), gm.L(14.0f));
                obj = this.D1;
                if (b2 != 1 || (obj instanceof mtc)) {
                    if ((obj instanceof mtc) || !"d".equals(((mtc) obj).a)) {
                        i5 = 3;
                        String[] strArr = new String[i5];
                        int[] iArr = new int[i5];
                        this.L0 = new tsc[i5];
                        if (i5 != 0) {
                            this.A0 = new FrameLayout(context);
                            if (b2 == 1 || (this.D1 instanceof mtc)) {
                                strArr[0] = jb6.L0(2131753710);
                                strArr[1] = jb6.L0(2131753707);
                                strArr[i4] = jb6.L0(2131753708);
                            } else {
                                strArr[0] = jb6.L0(2131753715);
                                strArr[1] = jb6.L0(2131753708);
                            }
                            int i11 = 0;
                            i6 = 0;
                            while (i11 < i5) {
                                byte b10 = b6;
                                int ceil = (int) Math.ceil(r10.measureText(strArr[i11]));
                                iArr[i11] = ceil;
                                i6 = Math.max(i6, ceil);
                                i11++;
                                b6 = b10;
                                ambVar4 = ambVar4;
                            }
                            b3 = b6;
                            ambVar = ambVar4;
                            rnb rnbVar = new rnb(this, context, (byte) 0);
                            this.F0 = rnbVar;
                            rnbVar.setWillNotDraw(false);
                            this.F0.setVisibility(this.d1 != 0 ? 0 : 4);
                            this.F0.setScaleX(this.d1 != 0 ? 1.0f : 0.1f);
                            this.F0.setScaleY(this.d1 != 0 ? 1.0f : 0.1f);
                            this.F0.setAlpha(this.d1 != 0 ? 1.0f : 0.0f);
                            this.F0.setTag(this.d1 != 0 ? Integer.valueOf(b3) : null);
                            this.A0.addView(this.F0, qoe.e(48, 48, 17));
                            this.F0.setOnClickListener(new snb(this, b7));
                            ImageView imageView = new ImageView(context);
                            this.H0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.H0.setImageResource(R.drawable.bg_rotate_large);
                            this.F0.addView(this.H0, qoe.e(-2, -2, 17));
                        } else {
                            b3 = 1;
                            ambVar = ambVar4;
                            i6 = 0;
                        }
                        i7 = 0;
                        while (true) {
                            tnbVar = this.a;
                            if (i7 >= i5) {
                                break;
                            }
                            this.L0[i7] = new tsc(context, ((b2 == b3 || (this.D1 instanceof mtc)) && i7 == 0) ? b7 : 1, this.z0, tnbVar);
                            this.L0[i7].setBackgroundColor(this.b1);
                            tsc tscVar = this.L0[i7];
                            String str = strArr[i7];
                            int i12 = iArr[i7];
                            tscVar.f = str;
                            tscVar.h = i12;
                            tscVar.n = i6;
                            int i13 = 1;
                            if (b2 != 1) {
                                if (this.D1 instanceof mtc) {
                                    i13 = 1;
                                } else {
                                    tscVar.a(i7 == 0 ? this.H1 : this.G1, false);
                                    ambVar3 = ambVar;
                                    int L = gm.L(56.0f) + i6;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, -2);
                                    layoutParams.gravity = 17;
                                    if (i5 != 3) {
                                        if (i7 == 0 || i7 == 2) {
                                            layoutParams.leftMargin = gm.L(10.0f) + (L / 2);
                                        } else {
                                            layoutParams.rightMargin = gm.L(10.0f) + (L / 2);
                                        }
                                    } else if (i7 == 1) {
                                        layoutParams.leftMargin = gm.L(10.0f) + (L / 2);
                                    } else {
                                        layoutParams.rightMargin = gm.L(10.0f) + (L / 2);
                                    }
                                    this.A0.addView(this.L0[i7], layoutParams);
                                    final tsc tscVar2 = this.L0[i7];
                                    final byte b11 = 0;
                                    tscVar2.setOnClickListener(new View.OnClickListener(this) { // from class: knb
                                        public final /* synthetic */ rob b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b12 = b11;
                                            tsc tscVar3 = tscVar2;
                                            int i14 = i7;
                                            rob robVar = this.b;
                                            switch (b12) {
                                                case 0:
                                                    byte b13 = robVar.b;
                                                    FrameLayout[] frameLayoutArr = robVar.N0;
                                                    if (robVar.A0.getAlpha() == 1.0f && robVar.t1 == null) {
                                                        if ((b13 != 1 && !(robVar.D1 instanceof mtc)) || i14 != 2) {
                                                            if (i14 != 1 || (b13 != 1 && !(robVar.D1 instanceof mtc))) {
                                                                if (!(robVar.D1 instanceof mtc)) {
                                                                    if (b13 != 1) {
                                                                        tscVar3.a(!tscVar3.s, true);
                                                                        boolean z5 = tscVar3.s;
                                                                        if (i14 != 0) {
                                                                            robVar.G1 = z5;
                                                                            robVar.x1.b(z5);
                                                                            robVar.N0();
                                                                            break;
                                                                        } else {
                                                                            robVar.H1 = z5;
                                                                            if (z5) {
                                                                                robVar.z0.getImageReceiver().V0 = true;
                                                                            }
                                                                            robVar.n1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    robVar.k1(i14, frameLayoutArr[i14].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (robVar.L0[1].s) {
                                                                    robVar.a1 = robVar.Y0;
                                                                    robVar.z0.setImageDrawable(null);
                                                                    robVar.Y0 = null;
                                                                    robVar.G1 = false;
                                                                    robVar.o1();
                                                                    robVar.N0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (b13 == 1) {
                                                                            robVar.k1(0, true, true);
                                                                        } else {
                                                                            robVar.k1(i14, frameLayoutArr[i14].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    robVar.e1(robVar.a1 != null ? -1 : 0);
                                                                    if (b13 == 1) {
                                                                        robVar.k1(1, true, true);
                                                                    } else {
                                                                        robVar.k1(i14, frameLayoutArr[i14].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                robVar.L0[1].a(robVar.Y0 != null, true);
                                                                robVar.s1();
                                                                robVar.R0.h1();
                                                                robVar.q1();
                                                                break;
                                                            }
                                                        } else {
                                                            tscVar3.a(!tscVar3.s, true);
                                                            boolean z6 = tscVar3.s;
                                                            robVar.G1 = z6;
                                                            robVar.x1.b(z6);
                                                            robVar.N0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (robVar.B0.getAlpha() == 1.0f && i14 == 0) {
                                                        tscVar3.a(!tscVar3.s, true);
                                                        robVar.w.i = tscVar3.s;
                                                        cmb.r1(true, true);
                                                        robVar.w0.h1();
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
                                    ambVar = ambVar3;
                                    b7 = 0;
                                    i4 = 2;
                                    b3 = 1;
                                }
                            }
                            if (i7 == i13) {
                                ambVar3 = ambVar;
                                tscVar.a((this.Y0 == null && (ambVar == null || TextUtils.isEmpty(ambVar3.o))) ? false : true, false);
                            } else {
                                ambVar3 = ambVar;
                                if (i7 == i4) {
                                    tscVar.a(this.G1, false);
                                }
                            }
                            int L2 = gm.L(56.0f) + i6;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L2, -2);
                            layoutParams2.gravity = 17;
                            if (i5 != 3) {
                            }
                            this.A0.addView(this.L0[i7], layoutParams2);
                            final tsc tscVar22 = this.L0[i7];
                            final byte b112 = 0;
                            tscVar22.setOnClickListener(new View.OnClickListener(this) { // from class: knb
                                public final /* synthetic */ rob b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b12 = b112;
                                    tsc tscVar3 = tscVar22;
                                    int i14 = i7;
                                    rob robVar = this.b;
                                    switch (b12) {
                                        case 0:
                                            byte b13 = robVar.b;
                                            FrameLayout[] frameLayoutArr = robVar.N0;
                                            if (robVar.A0.getAlpha() == 1.0f && robVar.t1 == null) {
                                                if ((b13 != 1 && !(robVar.D1 instanceof mtc)) || i14 != 2) {
                                                    if (i14 != 1 || (b13 != 1 && !(robVar.D1 instanceof mtc))) {
                                                        if (!(robVar.D1 instanceof mtc)) {
                                                            if (b13 != 1) {
                                                                tscVar3.a(!tscVar3.s, true);
                                                                boolean z5 = tscVar3.s;
                                                                if (i14 != 0) {
                                                                    robVar.G1 = z5;
                                                                    robVar.x1.b(z5);
                                                                    robVar.N0();
                                                                    break;
                                                                } else {
                                                                    robVar.H1 = z5;
                                                                    if (z5) {
                                                                        robVar.z0.getImageReceiver().V0 = true;
                                                                    }
                                                                    robVar.n1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            robVar.k1(i14, frameLayoutArr[i14].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (robVar.L0[1].s) {
                                                            robVar.a1 = robVar.Y0;
                                                            robVar.z0.setImageDrawable(null);
                                                            robVar.Y0 = null;
                                                            robVar.G1 = false;
                                                            robVar.o1();
                                                            robVar.N0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (b13 == 1) {
                                                                    robVar.k1(0, true, true);
                                                                } else {
                                                                    robVar.k1(i14, frameLayoutArr[i14].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            robVar.e1(robVar.a1 != null ? -1 : 0);
                                                            if (b13 == 1) {
                                                                robVar.k1(1, true, true);
                                                            } else {
                                                                robVar.k1(i14, frameLayoutArr[i14].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        robVar.L0[1].a(robVar.Y0 != null, true);
                                                        robVar.s1();
                                                        robVar.R0.h1();
                                                        robVar.q1();
                                                        break;
                                                    }
                                                } else {
                                                    tscVar3.a(!tscVar3.s, true);
                                                    boolean z6 = tscVar3.s;
                                                    robVar.G1 = z6;
                                                    robVar.x1.b(z6);
                                                    robVar.N0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (robVar.B0.getAlpha() == 1.0f && i14 == 0) {
                                                tscVar3.a(!tscVar3.s, true);
                                                robVar.w.i = tscVar3.s;
                                                cmb.r1(true, true);
                                                robVar.w0.h1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i7 != 2) {
                            }
                            i7++;
                            ambVar = ambVar3;
                            b7 = 0;
                            i4 = 2;
                            b3 = 1;
                        }
                        b4 = b3;
                        ambVar2 = ambVar;
                        if (b2 == b4) {
                            int[] iArr2 = new int[2];
                            this.M0 = new tsc[2];
                            this.B0 = new FrameLayout(context);
                            String[] strArr2 = {jb6.L0(2131753717), jb6.L0(2131753710)};
                            int i14 = 0;
                            int i15 = 0;
                            for (int i16 = 2; i14 < i16; i16 = 2) {
                                int ceil2 = (int) Math.ceil(r10.measureText(strArr2[i14]));
                                iArr2[i14] = ceil2;
                                i15 = Math.max(i15, ceil2);
                                i14++;
                            }
                            if (ambVar2 != null) {
                                rnb rnbVar2 = new rnb(this, context, (byte) 1);
                                this.G0 = rnbVar2;
                                rnbVar2.setWillNotDraw(false);
                                this.G0.setVisibility(ambVar2.f != 0 ? 0 : 4);
                                this.G0.setScaleX(ambVar2.f != 0 ? 1.0f : 0.1f);
                                this.G0.setScaleY(ambVar2.f != 0 ? 1.0f : 0.1f);
                                this.G0.setAlpha(ambVar2.f != 0 ? 1.0f : 0.0f);
                                this.B0.addView(this.G0, qoe.e(48, 48, 17));
                                this.G0.setOnClickListener(new snb(this, (byte) 1));
                                ImageView imageView2 = new ImageView(context);
                                this.I0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.I0.setImageResource(R.drawable.bg_rotate_large);
                                this.G0.addView(this.I0, qoe.e(-2, -2, 17));
                                final int i17 = 0;
                                while (i17 < 2) {
                                    this.M0[i17] = new tsc(context, i17 == 0, this.z0, tnbVar);
                                    tsc tscVar3 = this.M0[i17];
                                    String str2 = strArr2[i17];
                                    int i18 = iArr2[i17];
                                    tscVar3.f = str2;
                                    tscVar3.h = i18;
                                    tscVar3.n = i15;
                                    if (i17 == 0) {
                                        tscVar3.a(ambVar2.i, false);
                                    }
                                    int L3 = gm.L(56.0f) + i15;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(L3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i17 == 1) {
                                        layoutParams3.leftMargin = gm.L(10.0f) + (L3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = gm.L(10.0f) + (L3 / 2);
                                    }
                                    this.B0.addView(this.M0[i17], layoutParams3);
                                    final tsc tscVar4 = this.M0[i17];
                                    final byte b12 = 1;
                                    tscVar4.setOnClickListener(new View.OnClickListener(this) { // from class: knb
                                        public final /* synthetic */ rob b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b122 = b12;
                                            tsc tscVar32 = tscVar4;
                                            int i142 = i17;
                                            rob robVar = this.b;
                                            switch (b122) {
                                                case 0:
                                                    byte b13 = robVar.b;
                                                    FrameLayout[] frameLayoutArr = robVar.N0;
                                                    if (robVar.A0.getAlpha() == 1.0f && robVar.t1 == null) {
                                                        if ((b13 != 1 && !(robVar.D1 instanceof mtc)) || i142 != 2) {
                                                            if (i142 != 1 || (b13 != 1 && !(robVar.D1 instanceof mtc))) {
                                                                if (!(robVar.D1 instanceof mtc)) {
                                                                    if (b13 != 1) {
                                                                        tscVar32.a(!tscVar32.s, true);
                                                                        boolean z5 = tscVar32.s;
                                                                        if (i142 != 0) {
                                                                            robVar.G1 = z5;
                                                                            robVar.x1.b(z5);
                                                                            robVar.N0();
                                                                            break;
                                                                        } else {
                                                                            robVar.H1 = z5;
                                                                            if (z5) {
                                                                                robVar.z0.getImageReceiver().V0 = true;
                                                                            }
                                                                            robVar.n1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    robVar.k1(i142, frameLayoutArr[i142].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (robVar.L0[1].s) {
                                                                    robVar.a1 = robVar.Y0;
                                                                    robVar.z0.setImageDrawable(null);
                                                                    robVar.Y0 = null;
                                                                    robVar.G1 = false;
                                                                    robVar.o1();
                                                                    robVar.N0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (b13 == 1) {
                                                                            robVar.k1(0, true, true);
                                                                        } else {
                                                                            robVar.k1(i142, frameLayoutArr[i142].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    robVar.e1(robVar.a1 != null ? -1 : 0);
                                                                    if (b13 == 1) {
                                                                        robVar.k1(1, true, true);
                                                                    } else {
                                                                        robVar.k1(i142, frameLayoutArr[i142].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                robVar.L0[1].a(robVar.Y0 != null, true);
                                                                robVar.s1();
                                                                robVar.R0.h1();
                                                                robVar.q1();
                                                                break;
                                                            }
                                                        } else {
                                                            tscVar32.a(!tscVar32.s, true);
                                                            boolean z6 = tscVar32.s;
                                                            robVar.G1 = z6;
                                                            robVar.x1.b(z6);
                                                            robVar.N0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (robVar.B0.getAlpha() == 1.0f && i142 == 0) {
                                                        tscVar32.a(!tscVar32.s, true);
                                                        robVar.w.i = tscVar32.s;
                                                        cmb.r1(true, true);
                                                        robVar.w0.h1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i17++;
                                }
                            }
                            b4 = 1;
                        }
                        if (b2 != b4 || (this.D1 instanceof mtc)) {
                            this.H1 = false;
                            i8 = 0;
                            while (i8 < 2) {
                                unb unbVar = new unb(this, context, i8, rect);
                                ViewGroup[] viewGroupArr = this.N0;
                                viewGroupArr[i8] = unbVar;
                                if (i8 == 1 || b2 == 2) {
                                    unbVar.setVisibility(4);
                                }
                                viewGroupArr[i8].setWillNotDraw(false);
                                int i19 = nm7.v4;
                                int i20 = nm7.m5;
                                if (b2 == 2) {
                                    if (i8 == 0) {
                                        i20 = 321;
                                    }
                                    e = qoe.e(-1, i20, 83);
                                } else {
                                    if (i8 == 0) {
                                        i20 = 273;
                                    }
                                    e = qoe.e(-1, i20, 83);
                                }
                                if (i8 == 0) {
                                    if (b2 == 2) {
                                        i19 = 321;
                                    }
                                    f2 = i19;
                                } else {
                                    f2 = 316.0f;
                                }
                                e.height = gm.L(f2);
                                if (W0()) {
                                    e.height += gm.n;
                                }
                                if (i8 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect2 = gm.Q;
                                    drawable2.getPadding(rect2);
                                    e.height = gm.L(12.0f) + rect2.top + e.height;
                                }
                                viewGroupArr[i8].setPadding(0, i8 == 0 ? gm.L(12.0f) + rect.top : 0, 0, W0() ? gm.n : 0);
                                this.v0.addView(viewGroupArr[i8], e);
                                if (i8 == 1 || b2 == 2) {
                                    qw9 qw9Var = new qw9(this, context, (byte) 4);
                                    ViewGroup[] viewGroupArr2 = this.Q0;
                                    viewGroupArr2[i8] = qw9Var;
                                    qw9Var.setWillNotDraw(false);
                                    viewGroupArr2[i8].setPadding(0, gm.L(3.0f), 0, 0);
                                    viewGroupArr2[i8].setClickable(true);
                                    f3 = 21.0f;
                                    viewGroupArr[i8].addView(viewGroupArr2[i8], qoe.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.O0;
                                    textViewArr[i8] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i8].setTypeface(gm.o());
                                    TextView textView4 = textViewArr[i8];
                                    int i21 = cmb.rf;
                                    anb.X(textView4, i21, getResourceProvider());
                                    textViewArr[i8].setText(jb6.L0(2131752542));
                                    textViewArr[i8].setGravity(17);
                                    textViewArr[i8].setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
                                    TextView textView5 = textViewArr[i8];
                                    int i22 = cmb.h6;
                                    bmbVar = bmbVar2;
                                    anb.R(textView5, cmb.e0(getThemedColor(i22), 0), null, anb.M(i22), getResourceProvider());
                                    viewGroupArr2[i8].addView(textViewArr[i8], qoe.e(-2, -1, 51));
                                    final byte b13 = 0;
                                    textViewArr[i8].setOnClickListener(new View.OnClickListener(this) { // from class: nnb
                                        public final /* synthetic */ rob b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b14 = b13;
                                            int i23 = i8;
                                            rob robVar = this.b;
                                            switch (b14) {
                                                case 0:
                                                    if (robVar.t1 == null) {
                                                        if (i23 == 0) {
                                                            robVar.j1 = robVar.k1;
                                                            robVar.f1(robVar.i1, 3, true);
                                                            robVar.f1(robVar.h1, 2, true);
                                                            robVar.f1(robVar.g1, 1, true);
                                                            robVar.f1(robVar.c1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = robVar.Z0;
                                                            robVar.Y0 = tL_wallPaper2;
                                                            hob hobVar2 = robVar.z0;
                                                            if (tL_wallPaper2 == null) {
                                                                hobVar2.setImageDrawable(null);
                                                            } else {
                                                                gn5 b15 = gn5.b(tL_wallPaper2.document);
                                                                String str3 = robVar.I1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = robVar.Y0;
                                                                hobVar2.g(1, tL_wallPaper3.document.size, b15, null, tL_wallPaper3, str3, null, "jpg");
                                                            }
                                                            robVar.L0[1].a(robVar.Y0 != null, false);
                                                            float f4 = robVar.o1;
                                                            robVar.n1 = f4;
                                                            robVar.V0.setProgress(f4);
                                                            robVar.z0.getImageReceiver().setAlpha(robVar.n1);
                                                            robVar.o1();
                                                            robVar.s1();
                                                        }
                                                        if (robVar.b != 2) {
                                                            if (robVar.Y0 == null) {
                                                                if (robVar.G1) {
                                                                    robVar.G1 = false;
                                                                    robVar.L0[0].a(false, true);
                                                                    robVar.N0();
                                                                }
                                                                robVar.q1();
                                                            }
                                                            robVar.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            robVar.k1(i23, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (robVar.t1 == null) {
                                                        if (robVar.b != 2) {
                                                            robVar.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            robVar.k1(i23, false, true);
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
                                    textViewArr2[i8].setTypeface(gm.o());
                                    anb.X(textViewArr2[i8], i21, getResourceProvider());
                                    textViewArr2[i8].setText(jb6.L0(2131754181));
                                    textViewArr2[i8].setGravity(17);
                                    textViewArr2[i8].setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
                                    anb.R(textViewArr2[i8], cmb.e0(getThemedColor(i22), 0), null, anb.M(i22), getResourceProvider());
                                    viewGroupArr2[i8].addView(textViewArr2[i8], qoe.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i8];
                                    r14 = 1;
                                    final char c = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: nnb
                                        public final /* synthetic */ rob b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b14 = c;
                                            int i23 = i8;
                                            rob robVar = this.b;
                                            switch (b14) {
                                                case 0:
                                                    if (robVar.t1 == null) {
                                                        if (i23 == 0) {
                                                            robVar.j1 = robVar.k1;
                                                            robVar.f1(robVar.i1, 3, true);
                                                            robVar.f1(robVar.h1, 2, true);
                                                            robVar.f1(robVar.g1, 1, true);
                                                            robVar.f1(robVar.c1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = robVar.Z0;
                                                            robVar.Y0 = tL_wallPaper2;
                                                            hob hobVar2 = robVar.z0;
                                                            if (tL_wallPaper2 == null) {
                                                                hobVar2.setImageDrawable(null);
                                                            } else {
                                                                gn5 b15 = gn5.b(tL_wallPaper2.document);
                                                                String str3 = robVar.I1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = robVar.Y0;
                                                                hobVar2.g(1, tL_wallPaper3.document.size, b15, null, tL_wallPaper3, str3, null, "jpg");
                                                            }
                                                            robVar.L0[1].a(robVar.Y0 != null, false);
                                                            float f4 = robVar.o1;
                                                            robVar.n1 = f4;
                                                            robVar.V0.setProgress(f4);
                                                            robVar.z0.getImageReceiver().setAlpha(robVar.n1);
                                                            robVar.o1();
                                                            robVar.s1();
                                                        }
                                                        if (robVar.b != 2) {
                                                            if (robVar.Y0 == null) {
                                                                if (robVar.G1) {
                                                                    robVar.G1 = false;
                                                                    robVar.L0[0].a(false, true);
                                                                    robVar.N0();
                                                                }
                                                                robVar.q1();
                                                            }
                                                            robVar.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            robVar.k1(i23, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (robVar.t1 == null) {
                                                        if (robVar.b != 2) {
                                                            robVar.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            robVar.k1(i23, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    bmbVar = bmbVar2;
                                    r14 = 1;
                                    f3 = 21.0f;
                                }
                                if (i8 == r14) {
                                    TextView textView8 = new TextView(context);
                                    this.g2 = textView8;
                                    textView8.setLines(r14);
                                    this.g2.setSingleLine(r14);
                                    this.g2.setText(jb6.L0(2131753714));
                                    anb.X(this.g2, cmb.F6, getResourceProvider());
                                    this.g2.setTextSize(r14, 20.0f);
                                    this.g2.setTypeface(gm.o());
                                    this.g2.setPadding(gm.L(f3), gm.L(6.0f), gm.L(f3), gm.L(8.0f));
                                    this.g2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.g2.setGravity(16);
                                    viewGroupArr[i8].addView(this.g2, qoe.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    smb smbVar = new smb(context);
                                    this.R0 = smbVar;
                                    u46 u46Var = new u46(0, false);
                                    this.T0 = u46Var;
                                    smbVar.setLayoutManager(u46Var);
                                    smb smbVar2 = this.R0;
                                    pob pobVar = new pob(this, context);
                                    this.S0 = pobVar;
                                    smbVar2.setAdapter(pobVar);
                                    this.R0.i(new as1((byte) 15));
                                    viewGroupArr[i8].addView(this.R0, qoe.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.R0.setOnItemClickListener(new s19(this, (byte) 23));
                                    jf5 jf5Var = new jf5(context);
                                    this.U0 = jf5Var;
                                    jf5Var.setText(jb6.L0(2131753709));
                                    viewGroupArr[i8].addView(this.U0, qoe.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    a01 a01Var = new a01(context, (tnb) getResourceProvider());
                                    this.V0 = a01Var;
                                    a01Var.setProgress(this.n1);
                                    this.V0.setReportChanges(true);
                                    this.V0.setDelegate(new x59(this, (byte) 19));
                                    viewGroupArr[i8].addView(this.V0, qoe.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    p pVar = new p(context, this.i0, new vnb(this));
                                    this.X = pVar;
                                    pVar.setResourcesProvider(getResourceProvider());
                                    if (b2 == 1) {
                                        viewGroupArr[i8].addView(this.X, qoe.e(-1, -1, 1));
                                        boolean o = bmbVar.o();
                                        p pVar2 = this.X;
                                        if (o) {
                                            pVar2.setMinBrightness(0.2f);
                                        } else {
                                            pVar2.setMinBrightness(0.05f);
                                            this.X.setMaxBrightness(0.8f);
                                        }
                                        if (ambVar2 != null) {
                                            int i23 = ambVar2.d != 0 ? 2 : 1;
                                            p pVar3 = this.X;
                                            V0(1);
                                            pVar3.f(1, 2, i23, false);
                                            this.X.e(ambVar2.c, 0);
                                            int i24 = ambVar2.d;
                                            if (i24 != 0) {
                                                this.X.e(i24, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i8].addView(this.X, qoe.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i8++;
                                bmbVar2 = bmbVar;
                            }
                        }
                        o1();
                        if (!this.z0.getImageReceiver().B()) {
                            this.v0.setBackgroundColor(-16777216);
                        }
                        if (b2 != 1 && !(this.D1 instanceof mtc)) {
                            this.z0.getImageReceiver().B0 = true;
                        }
                    }
                    i5 = 0;
                    String[] strArr3 = new String[i5];
                    int[] iArr3 = new int[i5];
                    this.L0 = new tsc[i5];
                    if (i5 != 0) {
                    }
                    i7 = 0;
                    while (true) {
                        tnbVar = this.a;
                        if (i7 >= i5) {
                        }
                        i7++;
                        ambVar = ambVar3;
                        b7 = 0;
                        i4 = 2;
                        b3 = 1;
                    }
                    b4 = b3;
                    ambVar2 = ambVar;
                    if (b2 == b4) {
                    }
                    if (b2 != b4) {
                    }
                    this.H1 = false;
                    i8 = 0;
                    while (i8 < 2) {
                    }
                    o1();
                    if (!this.z0.getImageReceiver().B()) {
                    }
                    if (b2 != 1) {
                        this.z0.getImageReceiver().B0 = true;
                    }
                } else {
                    if (!(obj instanceof ntc) || !"t".equals(((ntc) obj).a)) {
                        i5 = i4;
                        String[] strArr32 = new String[i5];
                        int[] iArr32 = new int[i5];
                        this.L0 = new tsc[i5];
                        if (i5 != 0) {
                        }
                        i7 = 0;
                        while (true) {
                            tnbVar = this.a;
                            if (i7 >= i5) {
                            }
                            i7++;
                            ambVar = ambVar3;
                            b7 = 0;
                            i4 = 2;
                            b3 = 1;
                        }
                        b4 = b3;
                        ambVar2 = ambVar;
                        if (b2 == b4) {
                        }
                        if (b2 != b4) {
                        }
                        this.H1 = false;
                        i8 = 0;
                        while (i8 < 2) {
                        }
                        o1();
                        if (!this.z0.getImageReceiver().B()) {
                        }
                        if (b2 != 1) {
                        }
                    }
                    i5 = 0;
                    String[] strArr322 = new String[i5];
                    int[] iArr322 = new int[i5];
                    this.L0 = new tsc[i5];
                    if (i5 != 0) {
                    }
                    i7 = 0;
                    while (true) {
                        tnbVar = this.a;
                        if (i7 >= i5) {
                        }
                        i7++;
                        ambVar = ambVar3;
                        b7 = 0;
                        i4 = 2;
                        b3 = 1;
                    }
                    b4 = b3;
                    ambVar2 = ambVar;
                    if (b2 == b4) {
                    }
                    if (b2 != b4) {
                    }
                    this.H1 = false;
                    i8 = 0;
                    while (i8 < 2) {
                    }
                    o1();
                    if (!this.z0.getImageReceiver().B()) {
                    }
                    if (b2 != 1) {
                    }
                }
            } else {
                ambVar2 = ambVar4;
            }
            this.w0.setAdapter(this.x0);
            qw9 qw9Var2 = new qw9(this, context, (byte) 5);
            this.m0 = qw9Var2;
            qw9Var2.setWillNotDraw(false);
            qw9 qw9Var3 = this.m0;
            this.fragmentView = qw9Var3;
            ViewTreeObserver viewTreeObserver = qw9Var3.getViewTreeObserver();
            c45 c45Var = new c45(this, (byte) 3);
            this.S = c45Var;
            viewTreeObserver.addOnGlobalLayoutListener(c45Var);
            ggc ggcVar = new ggc(context);
            this.l0 = ggcVar;
            ggcVar.b(new lw(this, (byte) 5));
            this.l0.setAdapter(new db5(this, (byte) 4));
            gm.w3(this.l0, getThemedColor(cmb.r8));
            this.m0.addView(this.l0, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, b2 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(this, context);
            this.n0 = undoView;
            undoView.setAdditionalTranslationY(gm.L(51.0f));
            this.m0.addView(this.n0, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (b2 != 0) {
                View view = new View(context);
                anb.h(cmb.U5, getResourceProvider(), view);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = gm.L(48.0f);
                this.m0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.d0 = frameLayout;
                boolean z5 = this.d;
                if (z5) {
                    int i25 = cmb.c6;
                    frameLayout.setBackgroundColor(z5 ? cmb.D0(i25) : getThemedColor(i25));
                } else {
                    anb.h(cmb.c6, getResourceProvider(), frameLayout);
                }
                this.m0.addView(this.d0, qoe.e(-1, 48, 83));
                a91 a91Var = new a91(this, context);
                this.c0 = a91Var;
                this.d0.addView(a91Var, qoe.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.f0 = textView9;
                textView9.setTextSize(1, 14.0f);
                TextView textView10 = this.f0;
                if (z5) {
                    i9 = cmb.rf;
                    textView10.setTextColor(z5 ? cmb.D0(i9) : getThemedColor(i9));
                } else {
                    i9 = cmb.rf;
                    anb.X(textView10, i9, getResourceProvider());
                }
                this.f0.setGravity(17);
                this.f0.setBackgroundDrawable(cmb.e0(251658240, 0));
                this.f0.setPadding(gm.L(29.0f), 0, gm.L(29.0f), 0);
                this.f0.setText(jb6.L0(2131752542));
                this.f0.setTypeface(gm.o());
                this.d0.addView(this.f0, qoe.e(-2, -1, 51));
                final byte b14 = 0;
                this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: hnb
                    public final /* synthetic */ rob b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b102 = b14;
                        rob robVar = this.b;
                        switch (b102) {
                            case 0:
                                robVar.P0(false);
                                break;
                            case 1:
                                robVar.Z0();
                                break;
                            case 2:
                                robVar.e.U(null, null);
                                break;
                            case 3:
                                robVar.O0(false);
                                break;
                            default:
                                robVar.O0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.e0 = textView11;
                textView11.setTextSize(1, 14.0f);
                TextView textView12 = this.e0;
                if (z5) {
                    textView12.setTextColor(z5 ? cmb.D0(i9) : getThemedColor(i9));
                } else {
                    anb.X(textView12, i9, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(cmb.e0(251658240, 0));
                this.e0.setPadding(gm.L(29.0f), 0, gm.L(29.0f), 0);
                this.e0.setText(jb6.L0(2131754181));
                this.e0.setTypeface(gm.o());
                this.d0.addView(this.e0, qoe.e(-2, -1, 53));
                b5 = 1;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: hnb
                    public final /* synthetic */ rob b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b102 = b5;
                        rob robVar = this.b;
                        switch (b102) {
                            case 0:
                                robVar.P0(false);
                                break;
                            case 1:
                                robVar.Z0();
                                break;
                            case 2:
                                robVar.e.U(null, null);
                                break;
                            case 3:
                                robVar.O0(false);
                                break;
                            default:
                                robVar.O0(true);
                                break;
                        }
                    }
                });
            } else {
                b5 = 1;
            }
            if (b2 == b5 && !cmb.a1() && ambVar2 != null && ambVar2.j != 4294967296L) {
                c1();
            }
            this.k0 = U0();
            g1(true);
            r1(false);
            this.c = new Scroller(getContext());
            tk5Var2 = this.parentLayout;
            if (tk5Var2 != null && tk5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().K(getThemedColor(cmb.g5));
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
        tk5Var = this.parentLayout;
        if (tk5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.o0 = new FrameLayout(context);
        b = 3;
        if (this.O1) {
            gm.d3(new gnb(this, b), 2000L);
        }
        this.actionBar.t().a(0, R.drawable.outline_header_search).M().K(new dob()).setSearchFieldHint(jb6.L0(2131745570));
        this.actionBar.setBackButtonDrawable(new a27());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(jb6.L0(2131743857));
        bdb bdbVar2 = new bdb(b6, context, this);
        this.o0 = bdbVar2;
        anb.h(cmb.c6, getResourceProvider(), bdbVar2);
        this.o0.addView(this.actionBar, qoe.c(-2.0f, -1));
        r59 r59Var3 = new r59(context);
        this.p0 = r59Var3;
        r59Var3.setVerticalScrollBarEnabled(true);
        this.p0.setItemAnimator(null);
        this.p0.setLayoutAnimation(null);
        this.p0.setLayoutManager(new u46(1, false));
        final byte b82 = 2;
        this.p0.setVerticalScrollbarPosition(!jb6.a0 ? 1 : 2);
        r59 r59Var22 = this.p0;
        b2 = this.b;
        r59Var22.setPadding(0, 0, 0, gm.L(b2 == 0 ? 12.0f : 0.0f));
        this.p0.setOnItemClickListener(new l5(b7));
        this.o0.addView(this.p0, qoe.e(-1, -1, 51));
        wp4 wp4Var2 = new wp4(context, this.resourceProvider);
        this.r0 = wp4Var2;
        wp4Var2.setImageResource(R.drawable.floating_pencil);
        this.o0.addView(this.r0, wp4.b());
        s30 s30Var2 = new s30(context);
        this.q0 = s30Var2;
        this.p0.setAdapter(s30Var2);
        this.v0 = new k7(b, context, this);
        this.x0 = new nob(this, context);
        this.u0 = createActionBar(context);
        if (gm.O1()) {
        }
        this.u0.setBackButtonDrawable(new ee0(false));
        this.u0.setActionBarMenuOnItemClick(new gob(this));
        i = 0;
        while (true) {
            hobVarArr = this.y0;
            if (i < 2) {
            }
            hobVarArr[i] = new hob(this, (Activity) getContext());
            this.v0.addView(hobVarArr[i], qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i++;
        }
        hob hobVar2 = hobVarArr[0];
        this.z0 = hobVar2;
        hobVar2.setVisibility(0);
        hobVarArr[1].setVisibility(8);
        if (b2 == 2) {
        }
        z2 = this.x0.e;
        bmb bmbVar22 = this.g0;
        final byte b92 = 4;
        if (!z2) {
        }
        this.w0 = new onb(this, context);
        pnb pnbVar2 = new pnb(this);
        pnbVar2.C = false;
        this.w0.setItemAnimator(pnbVar2);
        this.w0.setVerticalScrollBarEnabled(true);
        this.w0.setOverScrollMode(2);
        onb onbVar3 = this.w0;
        if (b2 != 2) {
        }
        this.w0.setClipToPadding(false);
        this.w0.setLayoutManager(new u46(1, true));
        this.w0.setVerticalScrollbarPosition(!jb6.a0 ? 1 : 2);
        k7 k7Var2 = this.v0;
        onb onbVar22 = this.w0;
        if (b2 != 1) {
        }
        this.w0.setOnScrollListener(new k2b(this, b82));
        this.v0.addView(this.u0, qoe.c(-2.0f, i3));
        dtc dtcVar2 = new dtc(context);
        this.x1 = dtcVar2;
        dtcVar2.n = new inb(this, b82);
        amb ambVar42 = this.w;
        if (b2 != 1) {
        }
        if (b2 != 2) {
        }
        Rect rect3 = new Rect();
        Drawable d2 = b10.d(context, R.drawable.sheet_shadow_round);
        this.r = d2;
        d2.getPadding(rect3);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(cmb.c6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        hg9.o(new TextPaint(1), gm.L(14.0f));
        obj = this.D1;
        if (b2 != 1) {
        }
        if (obj instanceof mtc) {
        }
        i5 = 3;
        String[] strArr3222 = new String[i5];
        int[] iArr3222 = new int[i5];
        this.L0 = new tsc[i5];
        if (i5 != 0) {
        }
        i7 = 0;
        while (true) {
            tnbVar = this.a;
            if (i7 >= i5) {
            }
            i7++;
            ambVar = ambVar3;
            b7 = 0;
            i4 = 2;
            b3 = 1;
        }
        b4 = b3;
        ambVar2 = ambVar;
        if (b2 == b4) {
        }
        if (b2 != b4) {
        }
        this.H1 = false;
        i8 = 0;
        while (i8 < 2) {
        }
        o1();
        if (!this.z0.getImageReceiver().B()) {
        }
        if (b2 != 1) {
        }
        this.w0.setAdapter(this.x0);
        qw9 qw9Var22 = new qw9(this, context, (byte) 5);
        this.m0 = qw9Var22;
        qw9Var22.setWillNotDraw(false);
        qw9 qw9Var32 = this.m0;
        this.fragmentView = qw9Var32;
        ViewTreeObserver viewTreeObserver2 = qw9Var32.getViewTreeObserver();
        c45 c45Var2 = new c45(this, (byte) 3);
        this.S = c45Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(c45Var2);
        ggc ggcVar2 = new ggc(context);
        this.l0 = ggcVar2;
        ggcVar2.b(new lw(this, (byte) 5));
        this.l0.setAdapter(new db5(this, (byte) 4));
        gm.w3(this.l0, getThemedColor(cmb.r8));
        this.m0.addView(this.l0, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, b2 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(this, context);
        this.n0 = undoView2;
        undoView2.setAdditionalTranslationY(gm.L(51.0f));
        this.m0.addView(this.n0, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (b2 != 0) {
        }
        if (b2 == b5) {
            c1();
        }
        this.k0 = U0();
        g1(true);
        r1(false);
        this.c = new Scroller(getContext());
        tk5Var2 = this.parentLayout;
        if (tk5Var2 != null) {
            this.parentLayout.getBottomSheet().K(getThemedColor(cmb.g5));
            if (b2 == 2) {
                this.parentLayout.getBottomSheet().x0(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(int i, boolean z) {
        amb ambVar;
        int i2;
        if (getParentActivity() == null || this.n == i || this.t1 != null || (ambVar = this.w) == null) {
            return;
        }
        if (z && i == 2 && (cmb.a1() || ambVar.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131752503, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (!cmb.a1() || (cmb.a1() && cmb.I.j0.d != 0)) {
                heVar.U = jb6.M0(2131752502, null);
                alertDialog$Builder.j(jb6.M0(2131745851, null), new inb(this, (byte) 5));
                alertDialog$Builder.g(jb6.M0(2131751708, null), new inb(this, (byte) 6));
            } else {
                heVar.U = jb6.M0(2131752482, null);
                alertDialog$Builder.j(jb6.M0(2131752505, null), new inb(this, (byte) 7));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            }
            showDialog(heVar);
            return;
        }
        int i3 = this.n;
        this.n = i;
        if (i == 1) {
            i2 = i3;
            this.h.setText(jb6.M0(2131751952, null));
            int i4 = ambVar.d != 0 ? 2 : 1;
            p pVar = this.X;
            V0(1);
            pVar.f(1, 2, i4, false);
            this.X.e(ambVar.c, 0);
            int i5 = ambVar.d;
            if (i5 != 0) {
                this.X.e(i5, 1);
            }
            if (i2 == 2 || (i2 == 3 && ambVar.g != 0)) {
                this.x0.s(0);
            }
        } else if (i != 2) {
            if (i == 3) {
                this.h.setText(jb6.M0(2131751951, null));
                int i6 = ambVar.f != 0 ? ambVar.h != 0 ? 4 : ambVar.g != 0 ? 3 : 2 : 1;
                p pVar2 = this.X;
                V0(3);
                pVar2.f(2, 4, i6, true);
                this.X.e(ambVar.h, 3);
                this.X.e(ambVar.g, 2);
                this.X.e(ambVar.f, 1);
                p pVar3 = this.X;
                int i7 = ambVar.e;
                if (i7 == 0) {
                    i7 = ambVar.c;
                }
                pVar3.e(i7, 0);
                this.M0[1].b(0, ambVar.e);
                this.M0[1].b(1, ambVar.f);
                this.M0[1].b(2, ambVar.g);
                this.M0[1].b(3, ambVar.h);
                if (ambVar.g != 0) {
                    nob nobVar = this.x0;
                    if (i3 == 1) {
                        nobVar.i(0);
                    } else {
                        nobVar.g(0);
                    }
                } else if (i3 == 2) {
                    this.x0.s(0);
                }
                this.w0.x0(0, gm.L(60.0f), null);
                j1();
            }
            i2 = i3;
        } else {
            this.h.setText(jb6.M0(2131751953, null));
            int themedColor = getThemedColor(cmb.De);
            int i8 = cmb.Ee;
            int themedColor2 = cmb.d1(i8) ? getThemedColor(i8) : 0;
            int i9 = cmb.Fe;
            int themedColor3 = cmb.d1(i9) ? getThemedColor(i9) : 0;
            int i10 = cmb.Ge;
            int themedColor4 = cmb.d1(i10) ? getThemedColor(i10) : 0;
            long j = ambVar.k;
            int i11 = (int) j;
            if (i11 == 0 && j != 0) {
                themedColor2 = 0;
            }
            long j2 = ambVar.l;
            int i12 = (int) j2;
            if (i12 == 0 && j2 != 0) {
                themedColor3 = 0;
            }
            long j3 = ambVar.m;
            int i13 = (int) j3;
            if (i13 == 0 && j3 != 0) {
                themedColor4 = 0;
            }
            int i14 = (int) ambVar.j;
            int i15 = (i11 == 0 && themedColor2 == 0) ? 1 : (i13 == 0 && themedColor4 == 0) ? (i12 == 0 && themedColor3 == 0) ? 2 : 3 : 4;
            p pVar4 = this.X;
            V0(2);
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
            if (i2 == 1 || ambVar.g == 0) {
                this.x0.i(0);
            } else {
                this.x0.g(0);
            }
            this.w0.x0(0, gm.L(60.0f), null);
        }
        if (i != 1 && i != 3) {
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
            return;
        }
        if (i2 == 2 && this.N0[1].getVisibility() == 0) {
            k1(0, true, true);
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

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        byte b = 1;
        if (i == nm7.r3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
                return;
            }
            return;
        }
        if (i == nm7.m4) {
            r59 r59Var = this.p0;
            if (r59Var != null) {
                int childCount = r59Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.p0.getChildAt(i3);
                    if (childAt instanceof hg3) {
                        ((hg3) childAt).j0(0, true);
                    }
                }
                return;
            }
            return;
        }
        if (i == nm7.n4) {
            onb onbVar = this.w0;
            if (onbVar != null) {
                onbVar.h1();
                return;
            }
            return;
        }
        if (i == nm7.D4) {
            if (this.v0 != null) {
                g1(true);
                return;
            }
            return;
        }
        if (i == nm7.j4) {
            Object obj = this.D1;
            if (obj instanceof ntc) {
                ntc ntcVar = (ntc) obj;
                if (ntcVar.a == null) {
                    ntcVar.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j = 0;
        if (i != nm7.i4) {
            if (i != nm7.y5 || this.L1 == 0) {
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
                amb ambVar = this.w;
                if (ambVar != null && (str = ambVar.o) != null && str.equals(wallPaper.slug)) {
                    this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                    g1(false);
                    o1();
                } else if (ambVar == null) {
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
        pob pobVar = this.S0;
        if (pobVar != null) {
            pobVar.f();
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i5);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j = hs6.r(j, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new mnb(this, b)), this.classGuid);
    }

    public final void e1(int i) {
        TLRPC.TL_wallPaper tL_wallPaper = (i < 0 || i >= this.W0.size()) ? this.a1 : (TLRPC.TL_wallPaper) this.W0.get(i);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e2.cancel();
        }
        hob[] hobVarArr = this.y0;
        hob hobVar = hobVarArr[0];
        hob hobVar2 = hobVarArr[1];
        hobVarArr[0] = hobVar2;
        hobVarArr[1] = hobVar;
        this.v0.removeView(hobVar2);
        this.v0.addView(hobVarArr[0], this.v0.indexOfChild(hobVarArr[1]) + 1);
        hob hobVar3 = hobVarArr[0];
        this.z0 = hobVar3;
        hobVar3.setBackground(hobVarArr[1].getBackground());
        this.z0.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
        r1(false);
        p1();
        hobVarArr[1].setVisibility(0);
        hobVarArr[1].setAlpha(1.0f);
        this.z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e2 = ofFloat;
        ofFloat.addUpdateListener(new af0(this, (byte) 15));
        this.e2.addListener(new wnb(this, (byte) 0));
        this.e2.setInterpolator(d53.f);
        this.e2.setDuration(300L);
        this.e2.start();
        this.z0.getImageReceiver().t1 = (short) 300;
        this.z0.getImageReceiver().Z(gn5.b(tL_wallPaper.document), this.I1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.z0.e();
        this.Y0 = tL_wallPaper;
        this.G1 = this.L0[2].s;
        o1();
    }

    public final void f1(int i, int i2, boolean z) {
        ah7 ah7Var;
        if (i2 == 0) {
            this.b1 = i;
        } else if (i2 == 1) {
            this.d1 = i;
        } else if (i2 == 2) {
            this.e1 = i;
        } else if (i2 == 3) {
            this.f1 = i;
        }
        r1(z);
        if (this.L0 != null) {
            int i3 = 0;
            while (true) {
                tsc[] tscVarArr = this.L0;
                if (i3 >= tscVarArr.length) {
                    break;
                }
                tsc tscVar = tscVarArr[i3];
                if (tscVar != null) {
                    tscVar.b(i2, i);
                }
                i3++;
            }
        }
        if (this.e1 != 0) {
            if (this.V0 != null && cmb.I.o()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.z0.getBackground();
            if (background instanceof ah7) {
                ah7Var = (ah7) background;
            } else {
                ah7Var = new ah7();
                ah7Var.p(this.z0);
                if (this.F1) {
                    ah7Var.m(false);
                }
            }
            ah7 ah7Var2 = ah7Var;
            ah7Var2.n(true, this.b1, this.d1, this.e1, this.f1);
            this.z0.setBackground(ah7Var2);
            this.l1 = ah7Var2.f();
            this.m1 = 754974720;
        } else if (this.d1 != 0) {
            this.z0.setBackground(new GradientDrawable(we0.c(this.j1), new int[]{this.b1, this.d1}));
            int U0 = gm.U0(gm.w0(this.b1, this.d1), false);
            this.m1 = U0;
            this.l1 = U0;
        } else {
            this.z0.setBackgroundColor(this.b1);
            int U02 = gm.U0(this.b1, false);
            this.m1 = U02;
            this.l1 = U02;
        }
        int i4 = cmb.bd;
        boolean d1 = cmb.d1(i4);
        tnb tnbVar = this.a;
        if (!d1 || (this.z0.getBackground() instanceof ah7)) {
            tnbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        } else if (cmb.s0() instanceof ah7) {
            getThemedColor(i4);
            tnbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            anb.s(imageView, cmb.Yc, tnbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            anb.s(imageView2, cmb.Yc, tnbVar, PorterDuff.Mode.MULTIPLY);
        }
        hob hobVar = this.z0;
        if (hobVar != null) {
            hobVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
            this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.z0.invalidate();
            if (cmb.I.o() && (this.z0.getBackground() instanceof ah7)) {
                a01 a01Var = this.V0;
                if (a01Var != null) {
                    a01Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.z0.getImageReceiver().W(((ah7) this.z0.getBackground()).k);
                }
            } else {
                this.z0.getImageReceiver().W(null);
                a01 a01Var2 = this.V0;
                if (a01Var2 != null) {
                    a01Var2.setTwoSided(false);
                }
            }
            a01 a01Var3 = this.V0;
            if (a01Var3 != null) {
                a01Var3.setProgress(this.n1);
            }
        }
        onb onbVar = this.w0;
        if (onbVar != null) {
            onbVar.h1();
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
    public final void g1(boolean z) {
        int i;
        int i2;
        int i3;
        Drawable s0;
        hob hobVar;
        ImageView imageView;
        ImageView imageView2;
        ColorDrawable colorDrawable;
        ah7 ah7Var;
        amb ambVar = this.w;
        byte b = 0;
        byte b2 = this.b;
        if (b2 == 0 && ambVar == null) {
            this.z0.setBackground(cmb.r0());
        } else {
            if (b2 == 2) {
                Object obj = this.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize w = z ? bc4.w(tL_wallPaper.document.thumbs, 100, false, null, false) : null;
                    BitmapDrawable bitmapDrawable = w instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(fn5.B("b", w.bytes)) : null;
                    hob hobVar2 = this.z0;
                    hobVar2.a.Z(gn5.b(tL_wallPaper.document), this.I1, gn5.c(w, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    hobVar2.e();
                } else if (obj instanceof mtc) {
                    mtc mtcVar = (mtc) obj;
                    int i4 = mtcVar.f;
                    int i5 = mtcVar.e;
                    int i6 = mtcVar.d;
                    int i7 = mtcVar.c;
                    int i8 = mtcVar.b;
                    this.j1 = i4;
                    f1(i8, 0, false);
                    if (i7 != 0) {
                        f1(i7, 1, false);
                    }
                    f1(i6, 2, false);
                    f1(i5, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        hob hobVar3 = this.z0;
                        gn5 b3 = gn5.b(tL_wallPaper2.document);
                        String str = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                        hobVar3.g(1, tL_wallPaper3.document.size, b3, null, tL_wallPaper3, str, null, "jpg");
                    } else if ("d".equals(mtcVar.a)) {
                        Point point = gm.q;
                        this.z0.setImageBitmap(neb.d(R.raw.default_pattern, Math.min(point.x, point.y), Math.max(point.x, point.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : ah7.g(i8, i7, i6, i5)));
                    }
                } else if (obj instanceof ntc) {
                    Bitmap bitmap = this.E1;
                    if (bitmap != null) {
                        this.z0.setImageBitmap(bitmap);
                    } else {
                        ntc ntcVar = (ntc) obj;
                        File file = ntcVar.e;
                        if (file != null) {
                            this.z0.o(file.getAbsolutePath(), this.I1, null);
                        } else {
                            File file2 = ntcVar.d;
                            if (file2 != null) {
                                this.z0.o(file2.getAbsolutePath(), this.I1, null);
                            } else if ("t".equals(ntcVar.a)) {
                                this.z0.setImageDrawable(cmb.X0(false));
                            } else {
                                int i9 = ntcVar.b;
                                if (i9 != 0) {
                                    this.z0.setImageResource(i9);
                                }
                            }
                        }
                    }
                } else if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    TLRPC.Photo photo = no6Var.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w2 = bc4.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w3 = bc4.w(no6Var.K.sizes, this.J1, true, null, false);
                        TLRPC.PhotoSize photoSize = w3 != w2 ? w3 : null;
                        this.z0.g(1, photoSize != null ? photoSize.size : 0, gn5.i(photoSize, no6Var.K), gn5.i(w2, no6Var.K), no6Var, this.I1, "100_100_b", "jpg");
                    } else {
                        hob hobVar4 = this.z0;
                        String str2 = no6Var.C;
                        String str3 = this.I1;
                        String str4 = no6Var.D;
                        hobVar4.getClass();
                        hobVar4.k(gn5.g(str2), str3, gn5.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (ambVar == null) {
                this.z0.setBackground(cmb.r0());
            } else {
                se0 se0Var = this.w1;
                if (se0Var != null) {
                    se0Var.dispose();
                    this.w1 = null;
                }
                int C0 = cmb.C0(cmb.De);
                int i10 = (int) ambVar.j;
                int i11 = i10 != 0 ? i10 : C0;
                int C02 = cmb.C0(cmb.Ee);
                long j = ambVar.k;
                int i12 = (int) j;
                if (i12 != 0) {
                    C02 = i12;
                } else if (j != 0) {
                    C02 = 0;
                }
                int C03 = cmb.C0(cmb.Fe);
                long j2 = ambVar.l;
                int i13 = (int) j2;
                if (i13 != 0) {
                    C03 = i13;
                } else if (j2 != 0) {
                    C03 = 0;
                }
                int C04 = cmb.C0(cmb.Ge);
                long j3 = ambVar.m;
                int i14 = (int) j3;
                if (i14 != 0) {
                    C04 = i14;
                } else if (j3 != 0) {
                    i = 0;
                    if (!TextUtils.isEmpty(ambVar.o) || cmb.a1()) {
                        i2 = C02;
                        i3 = C03;
                        s0 = cmb.s0();
                        if (s0 != null) {
                            if (s0 instanceof ah7) {
                                ((ah7) s0).p(this.z0);
                            }
                            this.z0.setBackground(s0);
                        }
                    } else {
                        if (C03 != 0) {
                            Drawable background = this.z0.getBackground();
                            if (background instanceof ah7) {
                                ah7Var = (ah7) background;
                            } else {
                                ah7Var = new ah7();
                                ah7Var.p(this.z0);
                                if (this.F1) {
                                    ah7Var.m(false);
                                }
                            }
                            ah7 ah7Var2 = ah7Var;
                            i2 = C02;
                            i3 = C03;
                            ah7Var2.n(true, i11, i2, i3, i);
                            colorDrawable = ah7Var2;
                        } else {
                            i2 = C02;
                            i3 = C03;
                            if (i2 != 0) {
                                we0 we0Var = new we0(we0.c(ambVar.n), new int[]{i11, i2});
                                this.w1 = we0Var.f(ni6.A(3), new aob(this, b), 100L);
                                colorDrawable = we0Var;
                            } else {
                                colorDrawable = new ColorDrawable(i11);
                            }
                        }
                        this.z0.setBackground(colorDrawable);
                        TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
                        if (tL_wallPaper4 != null) {
                            hob hobVar5 = this.z0;
                            gn5 b4 = gn5.b(tL_wallPaper4.document);
                            String str5 = this.I1;
                            TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                            hobVar5.g(1, tL_wallPaper5.document.size, b4, null, tL_wallPaper5, str5, null, "jpg");
                        }
                    }
                    if (i2 != 0) {
                        int U0 = gm.U0(i11, false);
                        this.m1 = U0;
                        this.l1 = U0;
                    } else if (i3 != 0) {
                        this.l1 = ah7.g(i11, i2, i3, i);
                        this.m1 = 754974720;
                    } else {
                        int U02 = gm.U0(gm.w0(i11, i2), false);
                        this.m1 = U02;
                        this.l1 = U02;
                    }
                    hobVar = this.z0;
                    if (hobVar != null) {
                        hobVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
                        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
                        this.z0.invalidate();
                        if (cmb.I.o() && (this.z0.getBackground() instanceof ah7)) {
                            a01 a01Var = this.V0;
                            if (a01Var != null) {
                                a01Var.setTwoSided(true);
                            }
                            if (this.n1 < 0.0f) {
                                this.z0.getImageReceiver().W(((ah7) this.z0.getBackground()).k);
                            }
                        } else {
                            this.z0.getImageReceiver().W(null);
                            a01 a01Var2 = this.V0;
                            if (a01Var2 != null) {
                                a01Var2.setTwoSided(false);
                            }
                        }
                        a01 a01Var3 = this.V0;
                        if (a01Var3 != null) {
                            a01Var3.setProgress(this.n1);
                        }
                    }
                    if (this.L0 != null) {
                        int i15 = 0;
                        while (true) {
                            tsc[] tscVarArr = this.L0;
                            if (i15 >= tscVarArr.length) {
                                break;
                            }
                            tscVarArr[i15].b(0, i11);
                            this.L0[i15].b(1, i2);
                            this.L0[i15].b(2, i3);
                            this.L0[i15].b(3, i);
                            i15++;
                        }
                    }
                    imageView = this.H0;
                    tnb tnbVar = this.a;
                    if (imageView != null) {
                        anb.s(imageView, cmb.Yc, tnbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    imageView2 = this.I0;
                    if (imageView2 != null) {
                        anb.s(imageView2, cmb.Yc, tnbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    X0();
                }
                i = C04;
                if (TextUtils.isEmpty(ambVar.o)) {
                }
                i2 = C02;
                i3 = C03;
                s0 = cmb.s0();
                if (s0 != null) {
                }
                if (i2 != 0) {
                }
                hobVar = this.z0;
                if (hobVar != null) {
                }
                if (this.L0 != null) {
                }
                imageView = this.H0;
                tnb tnbVar2 = this.a;
                if (imageView != null) {
                }
                imageView2 = this.I0;
                if (imageView2 != null) {
                }
                X0();
            }
        }
        this.F1 = false;
    }

    @Override // cr3
    public final int getObserverTag() {
        return this.v1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return this.N1 ? U0() : super.getThemeDescriptions();
    }

    public final void h1(long j) {
        this.L1 = j;
        this.M1 = j == 0 || j == getUserConfig().e();
    }

    public final void i1(cm1 cm1Var) {
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
        float y = cm1Var.getY() - ((-this.z0.K) + 0.0f);
        int measuredHeight = this.z0.getMeasuredHeight();
        float f2 = this.O1 ? this.p1 * this.q1 : 0.0f;
        cm1Var.x0 = true;
        cm1Var.w0 = measuredHeight;
        cm1Var.u0 = y;
        cm1Var.v0 = f;
        cm1Var.h2 = f2;
        cm1Var.i2.setColor(on2.p(-16777216, (int) (f2 * 255.0f)));
        cm1Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.c2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (a.getCurrentActionBarHeight() + gm.m));
    }

    public final void j1() {
        if (this.v0 == null || this.M0 == null || this.w.g == 0) {
            return;
        }
        SharedPreferences d1 = oc7.d1();
        if (d1.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.C0 == null) {
            ig5 ig5Var = new ig5(getParentActivity(), 8);
            this.C0 = ig5Var;
            ig5Var.setShowingDuration(5000L);
            this.C0.setAlpha(0.0f);
            this.C0.setVisibility(4);
            this.C0.setText(jb6.M0(2131753716, null));
            this.C0.setExtraTranslationY(gm.L(6.0f));
            this.m0.addView(this.C0, qoe.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        gm.d3(new b7b((Object) this, (Object) d1, (byte) 11), 500L);
    }

    public final void k1(int i, boolean z, boolean z2) {
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
                    this.T0.g1(indexOf, (this.R0.getMeasuredWidth() - gm.L(124.0f)) / 2);
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
            a01 a01Var = this.V0;
            if (!a01Var.N) {
                float f = this.n1;
                if (f < 0.0f) {
                    float f2 = -f;
                    this.n1 = f2;
                    a01Var.setProgress(f2);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (!z2) {
            char c = i == 0 ? (char) 1 : (char) 0;
            if (z) {
                frameLayoutArr[i].setVisibility(0);
                if (b == 1) {
                    this.w0.setTranslationY(i == 1 ? -gm.L(21.0f) : 0.0f);
                    this.L0[2].setAlpha(z3 ? 1.0f : 0.0f);
                    this.L0[0].setAlpha(z3 ? 0.0f : 1.0f);
                    if (i == 1) {
                        frameLayoutArr[i].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        frameLayoutArr[c].setAlpha(0.0f);
                    }
                    gm.t1(this.X.F[1]);
                } else if (b == 2) {
                    this.w0.setTranslationY(gm.L((this.C1 == null ? 0 : 58) + 72) + (-gm.L(i == 0 ? 343.0f : 316.0f)) + (W0() ? gm.n : 0));
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
                    gm.t1(this.X.F[1]);
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
                arrayList2.add(ObjectAnimator.ofFloat(this.w0, (Property<onb, Float>) View.TRANSLATION_Y, i == 1 ? -gm.L(21.0f) : 0.0f));
                tsc tscVar = this.L0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(tscVar, (Property<tsc, Float>) property, z3 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[0], (Property<tsc, Float>) property, z3 ? 0.0f : 1.0f));
                if (i == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i5], (Property<FrameLayout, Float>) property, 0.0f));
                }
                gm.t1(this.X.F[1]);
            } else if (b == 2) {
                onb onbVar = this.w0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(onbVar, (Property<onb, Float>) property2, gm.L((this.C1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i].getMeasuredHeight()) + (W0() ? gm.n : 0)));
                tsc tscVar2 = this.L0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(tscVar2, (Property<tsc, Float>) property3, z3 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[0], (Property<tsc, Float>) property3, z3 ? 0.0f : 1.0f));
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
                gm.t1(this.X.F[1]);
            }
        } else {
            onb onbVar2 = this.w0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(onbVar2, (Property<onb, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            tsc tscVar3 = this.L0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(tscVar3, (Property<tsc, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], (Property<tsc, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.z0, (Property<hob, Float>) property5, 1.0f));
        }
        this.t1.playTogether(arrayList2);
        this.t1.addListener(new znb(this, z, i5, i, z3));
        this.t1.setInterpolator(d53.g);
        this.t1.setDuration(200L);
        this.t1.start();
    }

    public final void l1() {
        if (this.j2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (W0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
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
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        fi1 fi1Var = new fi1(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f, (this.Q1.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 2);
        this.j2 = fi1Var;
        fi1Var.setOnTouchListener(new w02((byte) 28));
        this.k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l2 = ofFloat;
        ofFloat.addUpdateListener(new gi1(this, (byte) 3));
        this.l2.addListener(new wnb(this, (byte) 4));
        this.l2.setDuration(400L);
        this.l2.setInterpolator(vt3.e);
        this.l2.start();
        frameLayout.addView(this.j2, new ViewGroup.LayoutParams(-1, -1));
        gm.c3(new gnb(this, (byte) 2));
    }

    public final void m1(boolean z) {
        long j = this.L1;
        if (j > 0) {
            this.B1.c(jb6.M0(2131754177, null));
            return;
        }
        if (j >= 0) {
            this.B1.c(jb6.M0(2131754179, null));
            return;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.L1));
        iob iobVar = this.B1;
        byte b = 1;
        if (L0 == null) {
            iobVar.c(jb6.a0(null, null, 2131754178, jb6.M0(2131754904, null).toLowerCase()));
            return;
        }
        iobVar.c(jb6.a0(null, null, 2131754178, L0.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < T0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            pn2 pn2Var = this.s1;
            if (pn2Var == null) {
                pn2Var = new pn2(R.drawable.mini_switch_lock, 0);
                this.s1 = pn2Var;
                pn2Var.n = 1;
            }
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.G(T0(), "ReactionLevelRequiredBtn", new Object[0]));
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
        getMessagesController().F0().a(this.L1, new jnb(this, b));
    }

    public final void n1() {
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
            g1(false);
            return;
        }
        Bitmap bitmap2 = this.y1;
        if (bitmap2 != null) {
            this.z0.setImageBitmap(bitmap2);
        }
    }

    public final void o1() {
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
            String r = bc4.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(r)) {
                return;
            }
            bc4.G(this.currentAccount);
            File J = bc4.J(tL_wallPaper.document, null, true, true);
            j = tL_wallPaper.document.size;
            str = r;
            file = J;
        } else {
            if (!(obj instanceof no6)) {
                return;
            }
            no6 no6Var = (no6) obj;
            TLRPC.Photo photo = no6Var.K;
            if (photo != null) {
                TLRPC.PhotoSize w = bc4.w(photo.sizes, this.J1, true, null, false);
                bc4.G(this.currentAccount);
                file = bc4.J(w, null, true, true);
                str = bc4.r(null, w);
                i = w.size;
            } else {
                file = fn5.w(no6Var.C);
                str = file.getName();
                i = no6Var.G;
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
            er3.q(i2).v(this);
            this.z0.invalidate();
            if (b == 2) {
                if (j == 0 || this.L1 != 0) {
                    this.u0.setSubtitle(null);
                } else {
                    this.u0.setSubtitle(gm.i0(j, false, false));
                }
            }
        } else {
            er3.q(i2).a(str, null, this);
            if (b == 2 && this.L1 == 0) {
                this.u0.setSubtitle(jb6.M0(2131748535, null));
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
        iob iobVar = this.B1;
        if (iobVar != null) {
            iobVar.setAlpha(exists ? 1.0f : 0.5f);
        }
        iob iobVar2 = this.C1;
        if (iobVar2 != null) {
            iobVar2.setAlpha(exists ? 1.0f : 0.5f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!R0(z)) {
            return false;
        }
        P0(true);
        return super.onBackPressed(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        tk5 tk5Var = this.parentLayout;
        if (tk5Var == null || tk5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().K(getThemedColor(cmb.g5));
        if (this.b != 2 || this.L1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().x0(-16777216);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.r3);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.n4);
        getNotificationCenter().b(this, nm7.y5);
        byte b = this.b;
        if (b == 1 || b == 0) {
            nm7.e().b(this, nm7.D4);
        }
        if (b == 2 || b == 1) {
            cmb.N = true;
        }
        if (b == 0 && this.w == null) {
            this.G1 = cmb.h0;
        } else {
            Point point = gm.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / gm.p));
            sb.append("_");
            this.I1 = hg9.k(sb, (int) (max / gm.p), "_f");
            this.J1 = Math.max(point.x, point.y);
            nm7.e().b(this, nm7.j4);
            nm7.e().b(this, nm7.i4);
            this.v1 = er3.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                cf7.Y(this.currentAccount).m0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        nm7.f(this.currentAccount).n(this, nm7.r3);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.n4);
        getNotificationCenter().n(this, nm7.y5);
        qw9 qw9Var = this.m0;
        if (qw9Var != null && this.S != null) {
            qw9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        byte b = this.b;
        if ((b == 2 || b == 1) && this.r1 == null) {
            gm.c3(new e1b((byte) 5));
        }
        int i = nm7.D4;
        if (b == 2) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.y1 = null;
            }
            this.a.k(null, null, null);
            nm7.e().k(i, new Object[0]);
        } else if (b == 1 || b == 0) {
            nm7.e().n(this, i);
        }
        if (b != 0 || this.w != null) {
            nm7.e().n(this, nm7.j4);
            nm7.e().n(this, nm7.i4);
        }
        super.onFragmentDestroy();
        Q0(null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.x1.b(false);
        }
        cmb.b = false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.q0;
        if (s30Var != null) {
            s30Var.f();
        }
        nob nobVar = this.x0;
        if (nobVar != null) {
            nobVar.f();
        }
        if (this.G1) {
            this.x1.b(true);
        }
        cmb.b = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            S0();
            try {
                ggc ggcVar = this.l0;
                if (ggcVar != null) {
                    gm.w3(ggcVar, getThemedColor(cmb.r8));
                }
                a01 a01Var = this.V0;
                if (a01Var != null) {
                    a01Var.setOuterColor(getThemedColor(cmb.Lj));
                    this.V0.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z || this.b != 2) {
            return;
        }
        this.a.k(null, null, null);
        nm7.e().k(nm7.D4, new Object[0]);
    }

    public final void p1() {
        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.z0.invalidate();
        this.R0.h1();
        if (this.n1 >= 0.0f) {
            this.z0.getImageReceiver().W(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.z0.getImageReceiver().P(null);
            }
            if (this.z0.getBackground() instanceof ah7) {
                this.z0.getImageReceiver().W(((ah7) this.z0.getBackground()).k);
            }
        }
        this.a.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        X0();
    }

    public final void q1() {
        byte b = this.b;
        if (b == 1 || b == 2) {
            if (this.Y0 == null && (this.D1 instanceof mtc)) {
                this.L0[2].a(false, true);
            }
            this.L0[this.Y0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            tsc tscVar = this.L0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(tscVar, (Property<tsc, Float>) property, this.Y0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.L0[0], (Property<tsc, Float>) property, this.Y0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new xnb(this));
            animatorSet.setInterpolator(d53.g);
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
        int L = (gm.L(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L0[0], (Property<tsc, Float>) View.ALPHA, this.Y0 == null ? 0.0f : 1.0f));
        tsc tscVar2 = this.L0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(tscVar2, (Property<tsc, Float>) property2, this.Y0 != null ? 0.0f : L));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L0[1], (Property<tsc, Float>) property2, this.Y0 == null ? -L : 0.0f));
        animatorSet2.setInterpolator(d53.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new ynb(this));
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
    public final void r1(boolean z) {
        int i;
        byte b;
        char c;
        float f;
        int i2;
        rnb rnbVar;
        boolean z2;
        int i3;
        BlendMode blendMode;
        int i4 = Build.VERSION.SDK_INT;
        byte b2 = this.b;
        amb ambVar = this.w;
        if (i4 >= 29) {
            if (b2 == 0) {
                i3 = ambVar != null ? (int) ambVar.l : getThemedColor(cmb.Fe);
            } else if (b2 == 1) {
                i3 = cmb.C0(cmb.Fe);
                long j = ambVar.l;
                int i5 = (int) j;
                if (i5 != 0) {
                    i3 = i5;
                }
            } else {
                if (this.D1 instanceof mtc) {
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
                    int C0 = cmb.C0(cmb.Ee);
                    long j2 = ambVar.k;
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
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, (Property<rnb, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
                    c = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<rnb, Float>) View.SCALE_X, z2 ? 1.0f : 0.0f);
                    f = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F0, (Property<rnb, Float>) View.SCALE_Y, z2 ? 1.0f : 0.0f);
                    tsc tscVar = this.L0[0];
                    Property property = View.TRANSLATION_X;
                    b = 3;
                    i2 = 5;
                    i = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(tscVar, (Property<tsc, Float>) property, z2 ? gm.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.L0[1], (Property<tsc, Float>) property, z2 ? -gm.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.L0[2], (Property<tsc, Float>) property, z2 ? gm.L(34.0f) : 0.0f));
                    this.J0.setDuration(180L);
                    this.J0.addListener(new wnb(this, b3));
                    this.J0.setInterpolator(d53.g);
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
                    this.L0[0].setTranslationX(z2 ? gm.L(34.0f) : 0.0f);
                    this.L0[1].setTranslationX(z2 ? -gm.L(34.0f) : 0.0f);
                    this.L0[2].setTranslationX(z2 ? gm.L(34.0f) : 0.0f);
                }
                rnbVar = this.G0;
                if (rnbVar == null) {
                    int i7 = rnbVar.getTag() != null ? 1 : i;
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
                            this.M0[0].setTranslationX(-gm.L(34.0f));
                            this.M0[1].setTranslationX(gm.L(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.K0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.G0, (Property<rnb, Float>) View.ALPHA, f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.G0, (Property<rnb, Float>) View.SCALE_X, f);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.G0, (Property<rnb, Float>) View.SCALE_Y, f);
                        tsc tscVar2 = this.M0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tscVar2, (Property<tsc, Float>) property2, -gm.L(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.M0[1], (Property<tsc, Float>) property2, gm.L(34.0f));
                        Animator[] animatorArr = new Animator[i2];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[b] = ofFloat7;
                        animatorArr[c] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.K0.setDuration(180L);
                        this.K0.addListener(new wnb(this, b));
                        this.K0.setInterpolator(d53.g);
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
        rnbVar = this.G0;
        if (rnbVar == null) {
        }
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.R0.getChildAt(i);
            if (childAt instanceof n08) {
                ((n08) childAt).v(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setResourceProvider(ylb ylbVar) {
        this.a.a = ylbVar;
    }

    @Override // cr3
    public final void i(long j, long j2) {
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }

    public rob(Object obj, Bitmap bitmap, boolean z) {
        super(null);
        this.a = new tnb(this);
        this.d = true;
        this.n = 1;
        plb plbVar = new plb(this, 0, false);
        this.T = plbVar;
        plb plbVar2 = new plb(this, 0, true);
        this.U = plbVar2;
        plb plbVar3 = new plb(this, 1, false);
        this.V = plbVar3;
        plb plbVar4 = new plb(this, 1, true);
        this.W = plbVar4;
        this.Z = -1;
        this.a0 = new gnb(this, (byte) 0);
        this.y0 = new hob[2];
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
        this.U1 = new ou4(getParentActivity(), new cf9((Object) this, (byte) 14));
        this.V1 = false;
        this.W1 = false;
        this.b = (byte) 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z;
        if (obj instanceof mtc) {
            mtc mtcVar = (mtc) obj;
            this.G1 = mtcVar.i;
            TLRPC.TL_wallPaper tL_wallPaper = mtcVar.g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f = mtcVar.h;
                this.n1 = f;
                if (f < 0.0f && !cmb.I.o()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        plbVar.v = true;
        plbVar3.v = true;
        plbVar2.v = true;
        plbVar4.v = true;
    }

    public rob(bmb bmbVar) {
        this(bmbVar, false, 0, false, false);
    }
}
