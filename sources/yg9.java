// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class yg9 extends e implements fn7 {
    public xq2 A0;
    public o24 B0;
    public boolean C0;
    public boolean D0;
    public RectF E;
    public int E0;
    public boolean F;
    public int F0;
    public final int[] G;
    public int G0;
    public int[] H;
    public boolean H0;
    public int[] I;
    public kg9 I0;
    public float J;
    public int J0;
    public zu1 K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public lg9 O0;
    public rg9 P;
    public q67 P0;
    public pi9 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public dg9 S0;
    public FrameLayout T;
    public int T0;
    public ImageView U;
    public int U0;
    public LinearLayout V;
    public int V0;
    public ImageView W;
    public boolean W0;
    public ImageView X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public int Z0;
    public final Editable a;
    public FrameLayout a0;
    public boolean a1;
    public final TL_iv.RichMessage b;
    public LinearLayout b0;
    public int c;
    public iz1 c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public sg9 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public oob i0;
    public LinearLayout j0;
    public tg9 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public ug9 q0;
    public r47 r;
    public ug9 r0;
    public z92 s;
    public ug9 s0;
    public ug9 t0;
    public ug9 u0;
    public ug9 v0;
    public nr1 w;
    public FrameLayout w0;
    public final Rect x;
    public e29 x0;
    public jl0 y;
    public fu5 y0;
    public di3 z0;

    public yg9(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new gg9(this, (byte) 0);
        this.a = editable;
    }

    public static String c0(int i) {
        if (i == 1) {
            return ob6.M0(2131754849, null);
        }
        if (i == 2) {
            return ob6.M0(2131754855, null);
        }
        if (i == 4) {
            return ob6.M0(2131754850, null);
        }
        if (i == 7) {
            return ob6.M0(2131754859, null);
        }
        if (i != 9) {
            return null;
        }
        return ob6.M0(2131754864, null);
    }

    public static String e0(int i) {
        if (i == 1) {
            return ob6.M0(2131753664, null);
        }
        if (i == 2) {
            return ob6.M0(2131748841, null);
        }
        if (i == 16) {
            return ob6.M0(2131743544, null);
        }
        if (i == 8) {
            return ob6.M0(2131744090, null);
        }
        if (i == 256) {
            return ob6.M0(2131744919, null);
        }
        if (i == 4) {
            return ob6.M0(2131748104, null);
        }
        if (i == 65536) {
            return ob6.M0(2131749057, null);
        }
        if (i == 16384) {
            return ob6.M0(2131744078, null);
        }
        if (i == 32768) {
            return ob6.M0(2131743980, null);
        }
        return null;
    }

    public static void q0(vnb vnbVar, Context context, final Runnable runnable, final Runnable runnable2) {
        final byte b = 1;
        final byte b2 = 0;
        final nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j = uh9.j(context, 1);
        h.O = j;
        ImageView k = qd4.k(context, R.drawable.large_article);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int L = hl.L(80.0f);
        int i = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        k.setBackground(K);
        yob.j(k, K, M, null, vnbVar);
        j.addView(k, tre.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131754034, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        TextView m = ik8.m(j, textView, tre.t(-1, -2, 49, 25, 16, 25, 0), context);
        m.setText(hl.S2(ob6.M0(2131754035, null)));
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        yob.X(m, i2, vnbVar);
        j.addView(m, tre.t(-1, -2, 49, 25, 11, 25, 0));
        c51 i3 = xnb.i(24, vnbVar, context, true);
        i3.setText(ob6.M0(2131754036, null));
        j.addView(i3, tre.t(-1, 48, 49, 14, 31, 14, 0));
        c51 i4 = xnb.i(24, vnbVar, context, false);
        i4.setText(ob6.M0(2131754037, null));
        j.addView(i4, tre.t(-1, 48, 49, 14, 2, 14, 6));
        h.show();
        i3.setOnClickListener(new View.OnClickListener() { // from class: hg9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                Runnable runnable3 = runnable2;
                nx0 nx0Var = h;
                switch (b3) {
                    case 0:
                        nx0Var.dismiss();
                        runnable3.run();
                        break;
                    default:
                        nx0Var.dismiss();
                        runnable3.run();
                        break;
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() { // from class: hg9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                Runnable runnable3 = runnable;
                nx0 nx0Var = h;
                switch (b3) {
                    case 0:
                        nx0Var.dismiss();
                        runnable3.run();
                        break;
                    default:
                        nx0Var.dismiss();
                        runnable3.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
        this.s.getLocationInWindow(this.G);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.y.getBounds());
        this.E = rectF;
        rectF.offset(r1[0], r1[1]);
        int[] iArr = this.H;
        if (iArr == null) {
            iArr = new int[2];
            this.H = iArr;
        }
        this.w.getLocationInWindow(iArr);
        int[] iArr2 = this.I;
        if (iArr2 == null) {
            iArr2 = new int[2];
            this.I = iArr2;
        }
        iArr2[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        this.I[0] = (int) (r0[0] - (this.w.F0.getX() - hl.L(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() {
        mk0 N2;
        int i;
        int size;
        int i2;
        amb textSelectionHelper = this.Q.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.w()) {
            N2 = this.Q.N2();
        } else {
            int i3 = textSelectionHelper.p0;
            N2 = i3 == textSelectionHelper.s0 ? this.Q.B4(i3) : null;
        }
        if (this.Q.O2() == null) {
            if (N2 != null) {
                if (!N2.a() && !N2.b() && !N2.c()) {
                    TL_iv.PageBlock pageBlock = N2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i = 7;
                            }
                            ArrayList arrayList = this.g0;
                            size = arrayList.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                ug9 ug9Var = (ug9) obj;
                                int intValue = ((Integer) ug9Var.getTag()).intValue();
                                ug9Var.setSelected(i == intValue);
                                if (i == intValue) {
                                    ug9Var.setEnabled(true);
                                    if (N2 == null) {
                                        ug9Var.a();
                                    } else if (i == 1) {
                                        TL_iv.PageBlock pageBlock2 = N2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            ug9Var.e(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            ug9Var.e(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            ug9Var.e(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            ug9Var.e(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            ug9Var.e(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            ug9Var.e(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            ug9Var.e(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            ug9Var.e(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            ug9Var.e(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            ug9Var.e(R.drawable.iv_footer);
                                        } else {
                                            ug9Var.a();
                                        }
                                    } else if (i == 2) {
                                        if (N2.a()) {
                                            ug9Var.e(R.drawable.iv_todo);
                                        } else if (N2.c()) {
                                            ug9Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            ug9Var.a();
                                        }
                                    } else if (i == 8) {
                                        ug9Var.e(R.drawable.iv_details);
                                    } else {
                                        ug9Var.a();
                                    }
                                } else {
                                    ug9Var.setEnabled(i != 4);
                                    ug9Var.a();
                                }
                            }
                        }
                    }
                }
                i = 2;
                ArrayList arrayList2 = this.g0;
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                }
            }
            i = 0;
            ArrayList arrayList22 = this.g0;
            size = arrayList22.size();
            i2 = 0;
            while (i2 < size) {
            }
        }
        i = 4;
        ArrayList arrayList222 = this.g0;
        size = arrayList222.size();
        i2 = 0;
        while (i2 < size) {
        }
    }

    public final void C0(int i, boolean z) {
        if (this.L0 == i) {
            return;
        }
        this.L0 = i;
        LinearLayout linearLayout = this.b0;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = this.b0.animate().alpha(this.L0 == 0 ? 1.0f : 0.0f).scaleX(this.L0 == 0 ? 1.0f : 0.8f).scaleY(this.L0 == 0 ? 1.0f : 0.8f).translationY(this.L0 == 0 ? 0.0f : hl.L(30.0f)).setDuration(420L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new gg9(this, (byte) 1)).start();
            this.i0.setVisibility(0);
            this.i0.animate().alpha(this.L0 == 1 ? 1.0f : 0.0f).scaleX(this.L0 == 1 ? 1.0f : 0.8f).scaleY(this.L0 == 1 ? 1.0f : 0.8f).translationY(this.L0 == 1 ? 0.0f : hl.L(30.0f)).setDuration(420L).setInterpolator(k43Var).withEndAction(new gg9(this, (byte) 2)).start();
            this.w0.setVisibility(0);
            this.w0.animate().alpha(this.L0 == 2 ? 1.0f : 0.0f).scaleX(this.L0 == 2 ? 1.0f : 0.8f).scaleY(this.L0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(k43Var).withEndAction(new gg9(this, (byte) 3)).start();
            return;
        }
        linearLayout.setVisibility(i == 0 ? 0 : 8);
        this.b0.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.b0.setScaleX(i == 0 ? 1.0f : 0.8f);
        this.b0.setScaleY(i == 0 ? 1.0f : 0.8f);
        this.b0.setTranslationY(i == 0 ? 0.0f : hl.L(30.0f));
        this.i0.setVisibility(i == 1 ? 0 : 8);
        this.i0.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.i0.setScaleX(i == 1 ? 1.0f : 0.8f);
        this.i0.setScaleY(i == 1 ? 1.0f : 0.8f);
        this.i0.setTranslationY(i == 1 ? 0.0f : hl.L(30.0f));
        this.w0.setVisibility(i != 2 ? 8 : 0);
        this.w0.setAlpha(i == 2 ? 1.0f : 0.0f);
        this.w0.setScaleX(i == 2 ? 1.0f : 0.8f);
        this.w0.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public final void D0() {
        boolean z;
        boolean z2;
        int max;
        int max2;
        amb textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.w()) {
            return;
        }
        ug9 ug9Var = this.v0;
        boolean z3 = false;
        if (ug9Var != null) {
            pi9 pi9Var = this.Q;
            int[] E4 = pi9Var.E4();
            ug9Var.setSelected(E4 != null && pi9Var.E3(E4[0], E4[1]));
        }
        boolean I3 = this.Q.I3();
        pi9 pi9Var2 = this.Q;
        if (I3) {
            amb textSelectionHelper2 = pi9Var2.getTextSelectionHelper();
            int i = textSelectionHelper2.p0;
            int i2 = textSelectionHelper2.q0;
            int i3 = textSelectionHelper2.t0;
            int i4 = textSelectionHelper2.r0;
            int i5 = textSelectionHelper2.u0;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ug9 ug9Var2 = (ug9) obj;
                ug9Var2.setSelected(this.Q.H3(((Integer) ug9Var2.getTag()).intValue(), i, i2, i4, i3, i5));
            }
            boolean z4 = i2 == i3;
            dg9 R4 = z4 ? this.Q.R4(i, i2) : null;
            int max3 = Math.max(0, Math.min(i4, i5));
            int max4 = R4 == null ? 0 : Math.max(0, Math.min(Math.max(i4, i5), R4.length()));
            ug9 ug9Var3 = this.r0;
            if (ug9Var3 != null) {
                ug9Var3.setSelected(R4 != null && max3 < max4 && mm9.h(R4.getText(), max3, max4));
            }
            ug9 ug9Var4 = this.t0;
            if (ug9Var4 != null) {
                if (R4 != null && max3 < max4 && mm9.g(R4.getText(), max3, max4)) {
                    z3 = true;
                }
                ug9Var4.setSelected(z3);
            }
            x0(true);
            y0(z4, this.Q.h2());
            return;
        }
        if (pi9Var2.t3()) {
            amb textSelectionHelper3 = this.Q.getTextSelectionHelper();
            dg9 p2 = this.Q.p2(textSelectionHelper3.p0);
            int i7 = textSelectionHelper3.r0;
            int i8 = textSelectionHelper3.u0;
            if (p2 == null) {
                max2 = 0;
                max = 0;
            } else {
                max = Math.max(0, Math.min(Math.min(i7, i8), p2.length()));
                max2 = Math.max(0, Math.min(Math.max(i7, i8), p2.length()));
            }
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                ug9 ug9Var5 = (ug9) obj2;
                ug9Var5.setSelected((p2 == null || max >= max2 || (p2.c(max, max2) & ((Integer) ug9Var5.getTag()).intValue()) == 0) ? false : true);
            }
            ug9 ug9Var6 = this.r0;
            if (ug9Var6 != null) {
                ug9Var6.setSelected(p2 != null && max < max2 && mm9.h(p2.getText(), max, max2));
            }
            ug9 ug9Var7 = this.t0;
            if (ug9Var7 != null) {
                if (p2 != null && max < max2 && mm9.g(p2.getText(), max, max2)) {
                    z3 = true;
                }
                ug9Var7.setSelected(z3);
            }
            x0(true);
            y0(true, this.Q.h2());
            return;
        }
        int i10 = textSelectionHelper.p0;
        int i11 = textSelectionHelper.s0;
        int i12 = textSelectionHelper.r0;
        int i13 = textSelectionHelper.u0;
        boolean z5 = i10 >= 0 && i11 >= 0 && i11 >= i10 && i11 < this.Q.x4.size();
        int size3 = arrayList.size();
        int i14 = 0;
        while (i14 < size3) {
            int i15 = i14 + 1;
            ug9 ug9Var8 = (ug9) arrayList.get(i14);
            ug9Var8.setSelected(z5 && this.Q.G3(((Integer) ug9Var8.getTag()).intValue(), i10, i12, i11, i13));
            i14 = i15;
        }
        x0(!this.Q.F3());
        ug9 ug9Var9 = this.r0;
        if (ug9Var9 != null) {
            if (z5) {
                Editable K4 = this.Q.K4(i10, i12, i11, i13);
                if (K4 == null ? false : mm9.h(K4, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13))) {
                    z2 = true;
                    ug9Var9.setSelected(z2);
                }
            }
            z2 = false;
            ug9Var9.setSelected(z2);
        }
        ug9 ug9Var10 = this.t0;
        if (ug9Var10 != null) {
            if (z5) {
                Editable K42 = this.Q.K4(i10, i12, i11, i13);
                if (K42 == null ? false : mm9.g(K42, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13))) {
                    z = true;
                    ug9Var10.setSelected(z);
                }
            }
            z = false;
            ug9Var10.setSelected(z);
        }
        if (z5 && i10 == i11) {
            z3 = true;
        }
        y0(z3, this.Q.h2());
    }

    public final void E0() {
        boolean n2 = this.Q.n2();
        ch9 ch9Var = this.Q.R3;
        boolean z = (ch9Var == null || ch9Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setEnabled(n2);
            this.W.setAlpha(n2 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.X;
        if (imageView2 != null) {
            imageView2.setEnabled(z);
            this.X.setAlpha(z ? 1.0f : 0.35f);
        }
    }

    public final void F0() {
        int i = 0;
        boolean z = (uc7.s1(this.currentAccount).D4() || yac.h(this.currentAccount).p()) ? false : true;
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ug9) obj).setPremiumLocked(z);
        }
    }

    public final void G0() {
        if (this.z0 == null) {
            return;
        }
        boolean J3 = this.Q.J3();
        this.z0.setEnabled(J3);
        ik8.s(this.z0.animate(), J3 ? 1.0f : 0.5f, 150L);
    }

    public final ug9 Y(int i, int i2, boolean z) {
        ug9 ug9Var = new ug9(i, getResourceProvider(), this.f0.getContext());
        if (z) {
            ug9Var.d();
            this.O.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(c0(i2));
        this.g0.add(ug9Var);
        LinearLayout linearLayout = this.f0;
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return ug9Var;
    }

    public final void Z(Context context, int i, int i2, boolean z) {
        ug9 ug9Var = new ug9(i, getResourceProvider(), context);
        if (z) {
            ug9Var.d();
            this.O.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(e0(i2));
        ug9Var.setOnClickListener(new w0(this, i2, (byte) 22));
        this.m0.add(ug9Var);
        LinearLayout linearLayout = this.j0;
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    public final void a0(boolean z) {
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, z ? 1.0f : 0.0f);
        this.Q0 = ofFloat;
        ofFloat.addUpdateListener(new ig9(this, (byte) 1));
        this.Q0.setInterpolator(k43.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void b0() {
        FrameLayout.LayoutParams layoutParams;
        o24 o24Var = this.B0;
        if (o24Var == null || (layoutParams = (FrameLayout.LayoutParams) o24Var.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.P == null ? f0() : Math.max(f0(), ((r2.getMeasuredHeight() - this.P.getPaddingTop()) - hl.L(240.0f)) - this.U0)) - r1) * this.R0) + f0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.B0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new rg9(this, context);
        byte b2 = 1;
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
        this.G0 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
        kg9 kg9Var = new kg9();
        this.I0 = kg9Var;
        this.P.r.add(kg9Var);
        pi9 pi9Var = new pi9(context, this.currentAccount, getResourceProvider(), new j09((Object) this, (byte) 5));
        this.Q = pi9Var;
        pi9Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, tre.e(-1, -1, jn7.D1));
        this.P.addView(this.Q.getOverlayView(), tre.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            pi9 pi9Var2 = this.Q;
            ArrayList arrayList2 = pi9Var2.t3;
            pi9Var2.s3 = richMessage;
            pi9.T2(arrayList2, richMessage.blocks, pi9Var2.u3);
            pi9Var2.T3();
            for (int i = 0; i < arrayList2.size(); i++) {
                pi9Var2.x4((mk0) arrayList2.get(i));
            }
            pi9Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                pi9 pi9Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = pi9Var3.u3;
                ArrayList arrayList3 = pi9Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    pi9.T2(arrayList3, uj9.b(charSequence), hashMap);
                }
                arrayList3.addAll(pi9Var3.y4(wi9.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    pi9.T2(arrayList3, uj9.b(charSequence2), hashMap);
                }
                pi9Var3.T3();
                pi9Var3.g3.O(false);
            } else {
                Editable editable = this.a;
                if (editable != null) {
                    this.Q.setInitialText(editable);
                }
            }
        }
        ch9 ch9Var = this.Q.R3;
        if (ch9Var != null) {
            ch9Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i2 = aob.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i2), aob.p1(0.0f, getThemedColor(i2))}));
        this.P.addView(this.R, tre.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{aob.p1(0.0f, getThemedColor(i2)), getThemedColor(i2)}));
        this.P.addView(this.S, tre.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, tre.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = aob.i6;
        imageView3.setBackground(new xg9(aob.Z(themedColor, aob.v(themedColor2, getThemedColor(i3)), hl.L(22.0f), hl.L(22.0f))));
        ImageView imageView4 = this.U;
        int i4 = aob.G6;
        vnb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView4, i4, resourceProvider, mode);
        iye.a(this.U);
        this.U.setContentDescription(ob6.M0(2131754874, null));
        this.U.setOnClickListener(new fg9(this, (byte) 2));
        this.T.addView(this.U, tre.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.T.addView(this.V, tre.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.W.setScaleType(scaleType);
        yob.R(this.W, aob.f0(getThemedColor(i3), 1, -1), null, yob.M(i3), getResourceProvider());
        yob.s(this.W, i4, getResourceProvider(), mode);
        iye.a(this.W);
        this.W.setContentDescription(ob6.M0(2131743542, null));
        this.W.setOnClickListener(new fg9(this, (byte) 3));
        this.V.addView(this.W, tre.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.X.setScaleType(scaleType);
        yob.R(this.X, aob.f0(getThemedColor(i3), 1, -1), null, yob.M(i3), getResourceProvider());
        yob.s(this.X, i4, getResourceProvider(), mode);
        iye.a(this.X);
        this.X.setContentDescription(ob6.M0(2131746069, null));
        this.X.setOnClickListener(new fg9(this, (byte) 4));
        this.V.addView(this.X, tre.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, tre.e(-1, jn7.p2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, tre.e(-1, jn7.p2, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.a0.addView(this.b0, tre.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new hc(context));
        this.d0.setScaleType(scaleType);
        yob.s(this.d0, i4, getResourceProvider(), mode);
        this.d0.setBackground(new xg9(aob.Z(getThemedColor(i2), aob.v(getThemedColor(i2), getThemedColor(i3)), hl.L(22.0f), hl.L(22.0f))));
        this.b0.addView(this.d0, tre.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        iye.a(this.d0);
        this.d0.setContentDescription(ob6.M0(2131755003, null));
        this.d0.setOnClickListener(new fg9(this, (byte) 5));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        frameLayout5.addView(frameLayout6, tre.e(-2, 44, 81));
        sg9 sg9Var = new sg9(context, (byte) 0);
        this.e0 = sg9Var;
        sg9Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new yi((byte) 13));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, tre.c(-1.0f, -1));
        iz1 iz1Var = new iz1(context, 24);
        this.c0 = iz1Var;
        iz1Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        yob.s(this.c0, i4, getResourceProvider(), mode);
        yob.R(this.c0, aob.Z(getThemedColor(i2), getThemedColor(i3), hl.L(20.0f), hl.L(20.0f)), yob.M(i2), yob.M(i3), getResourceProvider());
        this.c0.j(gz1.e, false);
        this.f0.addView(this.c0, tre.r(38, 38, 16));
        iye.a(this.c0);
        this.c0.setContentDescription(ob6.M0(2131754880, null));
        this.c0.setOnClickListener(new fg9(this, (byte) 6));
        Y(R.drawable.iv_text, 1, false).setOnClickListener(new jy8(this, context, (byte) 5));
        Y(R.drawable.iv_lists, 2, true).setOnClickListener(new fg9(this, (byte) 7));
        Y(R.drawable.iv_table, 4, true).setOnClickListener(new fg9(this, (byte) 8));
        Y(R.drawable.iv_math, 7, true).setOnClickListener(new fg9(this, (byte) 9));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.h0.setScaleType(scaleType);
        yob.s(this.h0, i4, getResourceProvider(), mode);
        yob.R(this.h0, aob.Z(getThemedColor(i2), getThemedColor(i3), hl.L(20.0f), hl.L(20.0f)), yob.M(i2), yob.M(i3), getResourceProvider());
        this.f0.addView(this.h0, tre.t(38, 38, 16, 2, 0, 0, 0));
        iye.a(this.h0);
        this.h0.setContentDescription(ob6.M0(2131754917, null));
        this.h0.setOnClickListener(new fg9(this, (byte) 11));
        this.b0.addView(frameLayout5, tre.l(1.0f, 0, 44));
        oob oobVar = new oob((byte) 13, context, this);
        this.i0 = oobVar;
        oobVar.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.Z.addView(this.i0, tre.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.Z.addView(this.w0, tre.e(80, 60, 81));
        e29 e29Var = new e29(context);
        this.x0 = e29Var;
        e29Var.f(R.raw.group_pip_delete_icon, hl.L(16.0f), hl.L(16.0f), null);
        b29 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        this.x0.setScaleType(scaleType);
        yob.s(this.x0, i4, getResourceProvider(), mode);
        this.x0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.w0.addView(this.x0, tre.e(-1, -1, jn7.D1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(frameLayout8, tre.c(44.0f, -2));
        tg9 tg9Var = new tg9(this, context);
        this.k0 = tg9Var;
        tg9Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        byte b3 = 14;
        this.k0.setOutlineProvider(new yi(b3));
        frameLayout8.addView(this.k0, tre.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.j0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.k0.addView(this.j0, new FrameLayout.LayoutParams(-2, -1));
        Z(context, R.drawable.formatting_bold, 1, false);
        Z(context, R.drawable.formatting_italic, 2, false);
        Z(context, R.drawable.formatting_underline, 16, false);
        Z(context, R.drawable.formatting_strikethrough, 8, false);
        Z(context, R.drawable.formatting_spoiler, 256, false);
        Z(context, R.drawable.iv_code, 4, false);
        Z(context, R.drawable.formatting_marked, 65536, true);
        Z(context, R.drawable.iv_sub, TLObject.FLAG_14, true);
        Z(context, R.drawable.iv_super, 32768, true);
        ug9 ug9Var = new ug9(R.drawable.iv_quote, getResourceProvider(), context);
        this.v0 = ug9Var;
        ug9Var.setContentDescription(ob6.M0(2131746167, null));
        this.v0.setOnClickListener(new fg9(this, (byte) 12));
        LinearLayout linearLayout5 = this.j0;
        linearLayout5.addView(this.v0, tre.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        ug9 ug9Var2 = new ug9(R.drawable.iv_button, getResourceProvider(), context);
        this.s0 = ug9Var2;
        ug9Var2.setContentDescription(ob6.M0(2131745738, null));
        this.s0.setOnClickListener(new fg9(this, (byte) 13));
        LinearLayout linearLayout6 = this.j0;
        linearLayout6.addView(this.s0, tre.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.o0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.o0, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var3 = new ug9(R.drawable.media_link_24, getResourceProvider(), context);
        this.r0 = ug9Var3;
        ug9Var3.setContentDescription(ob6.M0(2131751709, null));
        this.r0.setOnClickListener(new fg9(this, b3));
        this.o0.addView(this.r0, tre.r(38, 38, 16));
        ug9 ug9Var4 = new ug9(R.drawable.msg_calendar2, getResourceProvider(), context);
        this.t0 = ug9Var4;
        ug9Var4.setContentDescription(ob6.M0(2131754857, null));
        this.t0.setOnClickListener(new fg9(this, (byte) 15));
        this.o0.addView(this.t0, tre.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.p0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.p0, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var5 = new ug9(R.drawable.iv_math, getResourceProvider(), context);
        this.u0 = ug9Var5;
        ug9Var5.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(ob6.M0(2131754859, null));
        this.u0.setOnClickListener(new fg9(this, (byte) 16));
        this.p0.addView(this.u0, tre.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.n0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.n0, 0, tre.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ug9 ug9Var6 = new ug9(0, getResourceProvider(), context);
        this.q0 = ug9Var6;
        ug9Var6.setImageDrawable(new hc(context));
        this.q0.setContentDescription(ob6.M0(2131755003, null));
        this.q0.setOnClickListener(new fg9(this, b));
        this.n0.addView(this.q0, tre.r(38, 38, 16));
        di3 di3Var = new di3(this, context, this.r != null ? R.drawable.input_done : h0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider());
        this.z0 = di3Var;
        di3Var.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(aob.Pe))));
        iye.a(this.z0);
        this.b0.addView(this.z0, tre.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(ob6.M0(2131745368, null));
        this.z0.setOnClickListener(new fg9(this, b2));
        this.z0.setOnLongClickListener(new zs(this, (byte) 13));
        di3 di3Var2 = this.z0;
        if (di3Var2 != null) {
            di3Var2.setLocked(i0());
        }
        this.P.setPadding(0, hl.m, 0, 0);
        d0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new o72(this, (byte) 2));
        F0();
        if (this.e) {
            this.Q.z2();
            this.e = false;
        }
        rg9 rg9Var = this.P;
        this.fragmentView = rg9Var;
        return rg9Var;
    }

    public final void d0() {
        FrameLayout.LayoutParams layoutParams;
        o24 o24Var = this.B0;
        if (o24Var != null && (layoutParams = (FrameLayout.LayoutParams) o24Var.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.U0;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        b0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, hl.L(60.0f), 0, hl.L(110.0f) + max);
        pi9 pi9Var = this.Q;
        int i3 = this.U0;
        int i4 = this.V0;
        int i5 = this.E0;
        pi9Var.W3 = i3;
        pi9Var.X3 = i4;
        pi9Var.Y3 = i5;
        this.Z.setTranslationY(-max);
        this.S.setTranslationY(r0 + this.U0);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.i5) {
            di3 di3Var = this.z0;
            if (di3Var != null) {
                di3Var.setLocked(i0());
            }
            F0();
        }
    }

    public final int f0() {
        Point point = hl.q;
        int i = point.x > point.y ? this.G0 : this.F0;
        return i <= 0 ? hl.L(200.0f) : i;
    }

    public final void g0(boolean z) {
        if (this.D0) {
            this.D0 = false;
            o24 o24Var = this.B0;
            if (o24Var != null) {
                o24Var.r(false);
                this.B0.z();
            }
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        this.R0 = 0.0f;
        this.S0 = null;
        o24 o24Var2 = this.B0;
        if (o24Var2 != null) {
            o24Var2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            d0();
        }
        iz1 iz1Var = this.c0;
        if (iz1Var != null) {
            iz1Var.j(gz1.e, z);
        }
    }

    public final boolean h0() {
        zu1 zu1Var;
        return this.r == null && (zu1Var = this.K) != null && zu1Var.X7();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final boolean i0() {
        if (uc7.s1(this.currentAccount).D4() || yac.h(this.currentAccount).p()) {
            return false;
        }
        pi9 pi9Var = this.Q;
        return uj9.d(pi9Var.t3, pi9Var.u3);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        pi9 pi9Var = this.Q;
        if (pi9Var == null || !pi9Var.v3.w()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(Context context, View view) {
        fu5 fu5Var = this.y0;
        if (fu5Var != null) {
            fu5Var.u();
            this.y0 = null;
        }
        final byte b = 0;
        final byte b2 = 1;
        boolean z = (uc7.s1(this.currentAccount).D4() || yac.h(this.currentAccount).p()) ? false : true;
        final mk0 N2 = this.Q.N2();
        final fu5 J = fu5.J(this, view);
        J.W = true;
        fu5 K = J.K();
        K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(J, (byte) 10), false);
        K.j();
        K.i(N2 != null && (N2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, ob6.M0(2131754023, null), new Runnable(this) { // from class: jg9
            public final /* synthetic */ yg9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b3) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        break;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        break;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        break;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        break;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        break;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        final byte b3 = 2;
        K.z().a.setTextSize(1, xea.S0 + 2);
        K.i(N2 != null && (N2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, ob6.M0(2131754022, null), new Runnable(this) { // from class: jg9
            public final /* synthetic */ yg9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b2;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b32) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        break;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        break;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        break;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        break;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        break;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 + 1);
        K.i(N2 != null && (N2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, ob6.M0(2131754021, null), new Runnable(this) { // from class: jg9
            public final /* synthetic */ yg9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b32) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        break;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        break;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        break;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        break;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        break;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0);
        final byte b4 = 3;
        K.i(N2 != null && (N2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, ob6.M0(2131754020, null), new Runnable(this) { // from class: jg9
            public final /* synthetic */ yg9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b32) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        break;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        break;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        break;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        break;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        break;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 - 1);
        final byte b5 = 4;
        K.i(N2 != null && (N2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, ob6.M0(2131754019, null), new Runnable(this) { // from class: jg9
            public final /* synthetic */ yg9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b5;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b32) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        break;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        break;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        break;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        break;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        break;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 - 2);
        final byte b6 = 5;
        K.i(N2 != null && (N2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, ob6.M0(2131754018, null), new Runnable(this) { // from class: jg9
            public final /* synthetic */ yg9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b6;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b32) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        break;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        break;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        break;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        break;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        break;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 - 3);
        boolean z2 = N2 != null && pi9.z3(N2.b);
        wg9 wg9Var = new wg9(context, R.drawable.iv_h);
        wg9Var.a(z);
        int i = aob.G8;
        wg9Var.d = i;
        J.i(z2, 0, wg9Var, ob6.M0(2131754024, null), new c10(J, K, (byte) 8));
        J.z().a.setTypeface(hl.o());
        J.z().setPadding(hl.L(ob6.a0 ? 18.0f : 9.0f), 0, hl.L(ob6.a0 ? 9.0f : 18.0f), 0);
        J.i(N2 != null && (N2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, ob6.M0(2131753981, null), new eg9(this, N2, b5));
        J.i(N2 != null && (N2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, ob6.M0(2131753989, null), new eg9(this, N2, (byte) 5));
        boolean z3 = N2 != null && (N2.b instanceof TL_iv.pageBlockPullquote);
        wg9 wg9Var2 = new wg9(context, R.drawable.iv_pullquote);
        wg9Var2.a(z);
        wg9Var2.d = i;
        J.i(z3, 0, wg9Var2, ob6.M0(2131753990, null), new eg9(this, N2, b2));
        J.z().setPadding(hl.L(ob6.a0 ? 18.0f : 9.0f), 0, hl.L(ob6.a0 ? 9.0f : 18.0f), 0);
        J.i(N2 != null && (N2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, ob6.M0(2131754048, null), new eg9(this, N2, b3));
        boolean z4 = N2 != null && (N2.b instanceof TL_iv.pageBlockFooter);
        wg9 wg9Var3 = new wg9(context, R.drawable.iv_footer);
        wg9Var3.a(z);
        wg9Var3.d = i;
        J.i(z4, 0, wg9Var3, ob6.M0(2131754025, null), new eg9(this, N2, b4));
        J.z().setPadding(hl.L(ob6.a0 ? 18.0f : 9.0f), 0, hl.L(ob6.a0 ? 9.0f : 18.0f), 0);
        J.a0();
        this.y0 = J;
    }

    public final void k0() {
        di9 di9Var = this.Q.v3;
        if (di9Var != null && di9Var.w()) {
            n0();
        } else {
            new ue9(this.currentAccount, getResourceProvider(), new ji7(this, (byte) 29), getParentActivity()).show();
        }
    }

    public final void l0(r47 r47Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, r47 r47Var2, r47 r47Var3, ou1 ou1Var, boolean z, int i, int i2, c5a c5aVar, long j2) {
        int i3 = this.currentAccount;
        if (r47Var == null) {
            r7a.Q(k5.a(i3), arrayList, arrayList2, arrayList3, arrayList4, j, r47Var2, r47Var3, ou1Var, z, i, i2, c5aVar, 0L, j2, 0L);
            return;
        }
        k5 a = k5.a(i3);
        zu1 zu1Var = this.K;
        to3 to3Var = r7a.J;
        if (arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i4 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i4 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i4);
            i4++;
            r7a.j(pageBlock2, identityHashMap);
        }
        r7a.B(a.a).u(r47Var, richMessage, arrayList4, zu1Var, false);
    }

    public final /* synthetic */ void m0() {
        if (yac.h(this.currentAccount).p()) {
            return;
        }
        showDialog(new xk8((e) this, 43, true));
    }

    public final void n0() {
        gi9 d2 = this.Q.d2();
        if (d2 != null) {
            TL_iv.RichMessage a = d2.a();
            if (a.blocks.isEmpty()) {
                return;
            }
            b1 b1Var = new b1(getParentActivity(), getResourceProvider());
            b1Var.p1(a);
            b1Var.f2 = new te2(d2, (byte) 20);
            b1Var.show();
        }
    }

    public final boolean o0(View view) {
        zu1 zu1Var = this.K;
        if (zu1Var != null && this.r == null && !zu1Var.X7() && this.Q.h3() && !this.Q.j3()) {
            if (!this.Q.J3()) {
                G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> W2 = this.Q.W2();
            if (!W2.isEmpty()) {
                q67 q67Var = this.P0;
                if (q67Var != null) {
                    q67Var.f(false);
                    this.P0 = null;
                }
                q67 q67Var2 = new q67(getParentActivity(), getResourceProvider());
                this.P0 = q67Var2;
                q67Var2.setOnDismissListener(new dl8(this, (byte) 4));
                long a = this.K.a();
                r47 r47Var = this.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = uc7.s1(this.currentAccount).y1(a);
                tL_message.from_id = uc7.s1(this.currentAccount).y1(yac.h(this.currentAccount).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = W2;
                richMessage.photos = this.Q.y2();
                tL_message.rich_message.documents = this.Q.v2();
                if (r47Var != null && !r47Var.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = r47Var.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                r47 r47Var2 = new r47(this.currentAccount, tL_message, false, false);
                if (r47Var != null && !r47Var.p) {
                    r47Var2.C = r47Var;
                }
                r47Var2.B0 = true;
                r47Var2.W2 = Boolean.TRUE;
                r47Var2.n0(null);
                r47Var2.w1 = true;
                this.P0.r(qd4.t(r47Var2));
                this.z0.setScaleX(1.0f);
                this.z0.setScaleY(1.0f);
                bz1 s = this.P0.s(this.z0, true, new fg9(this, (byte) 10));
                if (s != null) {
                    s.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(aob.Fi))));
                    q67 q67Var3 = this.P0;
                    int L = hl.L(44.0f);
                    q67Var3.p0 = true;
                    q67Var3.Y = L;
                }
                fu5 I = fu5.I(this, this.z0);
                boolean D = lbc.D(this.K.h());
                if (this.K.M4()) {
                    I.b(R.drawable.msg_calendar2, ob6.M0(D ? 2131745242 : 2131745587, null), new kt((Object) this, a, (byte) 28), false);
                    if (!D && a > 0) {
                        I.b(R.drawable.msg_online, ob6.M0(2131745314, null), new gg9(this, (byte) 5), false);
                    }
                }
                if (!D) {
                    I.b(R.drawable.input_notify_off, ob6.M0(2131745311, null), new gg9(this, (byte) 6), false);
                }
                I.Z();
                this.P0.q(I);
                this.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 21) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                pi9 pi9Var = this.Q;
                Uri data = intent.getData();
                if (data == null) {
                    pi9Var.getClass();
                    return;
                } else {
                    if (pi9Var.getContext() != null) {
                        Utilities.e.c(new yz8(pi9Var, data, (byte) 19));
                        return;
                    }
                    return;
                }
            }
            if (i == 1 || i == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.Q.a2(intent.getData());
                return;
            }
        }
        super.onActivityResultFragment(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.D0;
        if (z2) {
            if (z2) {
                this.D0 = false;
                o24 o24Var = this.B0;
                if (o24Var != null) {
                    o24Var.r(false);
                    this.B0.z();
                }
                a0(false);
                return false;
            }
        } else {
            if (this.C0) {
                g0(true);
                return false;
            }
            if (!this.Q.C2()) {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (!z && !this.W0) {
            r0();
            this.W0 = true;
        }
        if (hl.O1() || this.s == null || this.w == null) {
            return super.onCustomTransitionAnimation(z, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        z92 z92Var = this.s;
        this.y = z92Var.r;
        byte b = 0;
        z92Var.e = false;
        z92Var.invalidate();
        this.w.setAlpha(0.0f);
        this.w.p2.setVisibility(4);
        A0();
        float f = z ? 0.0f : 1.0f;
        this.J = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        this.F = true;
        this.P.invalidate();
        ofFloat.addUpdateListener(new ig9(this, b));
        ofFloat.addListener(new wd8((Object) this, (Object) runnable, (byte) 9));
        FrameLayout frameLayout = this.T;
        if (z) {
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.T;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -hl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property2, hl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<pi9, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout3 = this.T;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property4, -hl.L(16.0f)), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property4, hl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<pi9, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(k43.h);
        this.P.post(new at(animatorSet, (byte) 1));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.i5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        kg9 kg9Var;
        jn7.f(this.currentAccount).n(this, jn7.i5);
        if (!this.W0) {
            r0();
            this.W0 = true;
        }
        lg9 lg9Var = this.O0;
        if (lg9Var != null) {
            this.O0 = null;
            hl.c3(lg9Var);
        }
        q67 q67Var = this.P0;
        if (q67Var != null) {
            q67Var.g();
            this.P0 = null;
        }
        pi9 pi9Var = this.Q;
        if (pi9Var != null) {
            pi9Var.D2();
        }
        xq2 xq2Var = this.A0;
        if (xq2Var != null) {
            xq2Var.n();
        }
        super.onFragmentDestroy();
        o24 o24Var = this.B0;
        if (o24Var != null) {
            o24Var.A();
        }
        rg9 rg9Var = this.P;
        if (rg9Var == null || (kg9Var = this.I0) == null) {
            return;
        }
        rg9Var.r.remove(kg9Var);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.U0 = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = hl.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        d0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final l2d onInsetsInternal(View view, l2d l2dVar) {
        fu5 fu5Var;
        mq5 f = l2dVar.a.f(3);
        int i = l2dVar.a.f(8).d;
        this.V0 = i;
        int i2 = i - f.d;
        boolean z = this.H0;
        boolean z2 = i2 > hl.L(20.0f);
        this.H0 = z2;
        if (z2 && i2 > hl.L(50.0f) && !hl.E && !hl.O1()) {
            Point point = hl.q;
            if (point.x > point.y) {
                this.G0 = i2;
                uc7.d1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i2;
                uc7.d1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z && this.C0 && !this.D0) {
            g0(false);
        }
        if (!this.H0 && z && (fu5Var = this.y0) != null) {
            fu5Var.u();
            this.y0 = null;
        }
        onInsets(f.a, f.b, f.c, f.d);
        return l2d.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i = aob.d6;
            int themedColor = getThemedColor(i);
            int i2 = aob.i6;
            int themedColor2 = getThemedColor(i2);
            int i3 = aob.Pe;
            int themedColor3 = getThemedColor(i3);
            if (this.a1 && themedColor == this.X0 && themedColor2 == this.Y0 && themedColor3 == this.Z0) {
                return;
            }
            this.a1 = true;
            this.X0 = themedColor;
            this.Y0 = themedColor2;
            this.Z0 = themedColor3;
            View view = this.R;
            if (view != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i), aob.p1(0.0f, getThemedColor(i))}));
            }
            View view2 = this.S;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, getThemedColor(i)), getThemedColor(i)}));
            }
            ImageView imageView = this.U;
            if (imageView != null) {
                imageView.setBackground(new xg9(aob.Z(getThemedColor(i), aob.v(getThemedColor(i), getThemedColor(i2)), hl.L(22.0f), hl.L(22.0f))));
            }
            LinearLayout linearLayout = this.V;
            if (linearLayout != null) {
                linearLayout.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
            }
            ImageView imageView2 = this.d0;
            if (imageView2 != null) {
                imageView2.setBackground(new xg9(aob.Z(getThemedColor(i), aob.v(getThemedColor(i), getThemedColor(i2)), hl.L(22.0f), hl.L(22.0f))));
            }
            e29 e29Var = this.x0;
            if (e29Var != null) {
                e29Var.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
            }
            LinearLayout linearLayout2 = this.o0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
            }
            LinearLayout linearLayout3 = this.p0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
            }
            LinearLayout linearLayout4 = this.n0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
            }
            di3 di3Var = this.z0;
            if (di3Var != null) {
                di3Var.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i3))));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        pi9 pi9Var;
        int i;
        pi9 pi9Var2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.c) >= 0 && (pi9Var2 = this.Q) != null) {
            int i2 = this.d;
            this.d = -1;
            this.c = -1;
            if (pi9Var2.V1(i, i2)) {
                return;
            }
            pi9Var2.post(new mh9(pi9Var2, i, i2, (byte) 0));
            return;
        }
        if (!z || z2) {
            return;
        }
        if ((this.b == null && this.f == null) || (pi9Var = this.Q) == null || pi9Var.X2()) {
            return;
        }
        pi9Var.post(new m72(pi9Var, (byte) 5));
    }

    public final void p0(int i, int i2) {
        pi9 pi9Var = this.Q;
        pi9Var.k4 = pi9Var.N2();
        n12 n12Var = new n12(getParentActivity(), this, false, false, true, getResourceProvider());
        n12Var.W3 = new og9(this, n12Var);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
        chatAttachAlertPhotoLayout.setIncludeVideosInGallery(true);
        chatAttachAlertPhotoLayout.g0();
        n12Var.u1(1, true);
        n12Var.Q0(i);
        n12Var.t4 = new ng9(this, n12Var);
        n12Var.S1 = new ng9(this, n12Var);
        n12Var.R1 = new pg9(this, n12Var);
        n12Var.a1();
        if (i2 != 0) {
            n12Var.k1(i2);
        }
        n12Var.w0(true);
        n12Var.show();
    }

    public final boolean r0() {
        Runnable runnable;
        if (this.K == null || this.r != null || !this.Q.n2()) {
            return false;
        }
        TL_iv.RichMessage f2 = this.N ? null : this.Q.f2();
        if (f2 == null && (runnable = this.M) != null) {
            runnable.run();
        }
        nr1 nr1Var = this.K.a0;
        if (f2 != null && !this.N) {
            pi9 pi9Var = this.Q;
            if (pi9Var.h3() && !uj9.d(pi9Var.t3, pi9Var.u3) && nr1Var != null) {
                SpannableStringBuilder g = uj9.g(this.Q.t3);
                zu1 zu1Var = nr1Var.E3;
                if (nr1Var.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g);
                pv3.m(spannableStringBuilder, nr1Var.F0.getPaint().getFontMetricsInt(), false, null, 0);
                hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class);
                if (hmVarArr != null) {
                    for (hm hmVar : hmVarArr) {
                        hmVar.applyFontMetrics(nr1Var.F0.getPaint().getFontMetricsInt(), wl.f());
                    }
                }
                r19.a(spannableStringBuilder);
                if (zu1Var != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    ls6.d0(nr1Var.R).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), charSequenceArr[0], ls6.d0(nr1Var.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                nr1Var.setRichDraftPreview(null);
                if (nr1Var.F0.getText() != null) {
                    nr1Var.F0.getText().clear();
                }
                nr1Var.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        ls6 mediaDataController = getMediaDataController();
        long a = this.K.a();
        zu1 zu1Var2 = this.K;
        mediaDataController.T1(a, zu1Var2.N5(zu1Var2.F5), "", null, null, null, null, 0L, false, false, f2);
        TL_iv.RichMessage richMessage = f2;
        if (nr1Var == null) {
            return true;
        }
        nr1Var.setRichDraftPreview(richMessage);
        return true;
    }

    public final dg9 s0() {
        dg9 focusedEditTextOrNull = this.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            dg9 dg9Var = this.S0;
            return dg9Var != null ? dg9Var : this.Q.M2();
        }
        this.S0 = focusedEditTextOrNull;
        this.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public final int t0(dg9 dg9Var) {
        return (dg9Var != this.S0 || this.Q.getFocusedEditTextOrNull() == dg9Var) ? Math.max(0, dg9Var.getSelectionEnd()) : Math.min(this.T0, dg9Var.length());
    }

    public final void u0() {
        byte b = 0;
        if (!i0()) {
            if (h0()) {
                jj.J(getParentActivity(), this.K.a(), new pq8((Object) this, (byte) 7), getResourceProvider());
                return;
            } else {
                w0(0, 0, true);
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        pi9 pi9Var = this.Q;
        Objects.requireNonNull(pi9Var);
        q0(getResourceProvider(), parentActivity, new m72(pi9Var, b), new gg9(this, (byte) 4));
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [lg9] */
    public final void w0(final int i, final int i2, final boolean z) {
        nr1 nr1Var;
        xy1 xy1Var;
        if (i0()) {
            Activity parentActivity = getParentActivity();
            pi9 pi9Var = this.Q;
            Objects.requireNonNull(pi9Var);
            q0(getResourceProvider(), parentActivity, new m72(pi9Var, (byte) 0), new gg9(this, (byte) 4));
            return;
        }
        if (this.K == null || !this.Q.h3() || this.Q.j3()) {
            return;
        }
        if (!this.Q.J3()) {
            G0();
            return;
        }
        if (!uc7.s1(this.currentAccount).D4()) {
            nr1 nr1Var2 = this.K.a0;
            if (nr1Var2 != null) {
                this.N = true;
                Runnable runnable = this.L;
                if (runnable != null) {
                    runnable.run();
                }
                nr1Var2.D1(uj9.g(this.Q.t3), z, i, i2);
                finishFragment();
                return;
            }
            return;
        }
        this.N = true;
        final ArrayList W2 = this.Q.W2();
        if (W2.isEmpty()) {
            return;
        }
        final ArrayList y2 = this.Q.y2();
        final ArrayList v2 = this.Q.v2();
        final ArrayList a = tj9.a(this.currentAccount, W2);
        final long a2 = this.K.a();
        zu1 zu1Var = this.K;
        final r47 r47Var = zu1Var.F5;
        final r47 r47Var2 = zu1Var.m4;
        final ou1 ou1Var = zu1Var.D5;
        final long k7 = zu1Var.k7();
        final c5a X6 = this.K.X6();
        final r47 r47Var3 = this.r;
        ?? r0 = new Runnable() { // from class: lg9
            @Override // java.lang.Runnable
            public final void run() {
                yg9.this.l0(r47Var3, W2, y2, v2, a, a2, r47Var, r47Var2, ou1Var, z, i, i2, X6, k7);
            }
        };
        Runnable runnable2 = this.L;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (r47Var3 == null && (nr1Var = this.K.a0) != null && (xy1Var = nr1Var.O3) != null) {
            xy1Var.x(null, z, i, i2, 0L);
        }
        if (i == 0 || r47Var3 != null) {
            r0.run();
            finishFragment();
        } else {
            this.O0 = r0;
            finishFragment();
        }
    }

    public final void x0(boolean z) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ug9 ug9Var = (ug9) obj;
            if (((Integer) ug9Var.getTag()).intValue() == 1) {
                ug9Var.setEnabled(z);
            }
        }
    }

    public final void y0(boolean z, boolean z2) {
        ug9 ug9Var = this.r0;
        if (ug9Var != null) {
            ug9Var.setEnabled(z);
        }
        ug9 ug9Var2 = this.s0;
        if (ug9Var2 != null) {
            ug9Var2.setEnabled(z2);
        }
        ug9 ug9Var3 = this.t0;
        if (ug9Var3 != null) {
            ug9Var3.setEnabled(z);
        }
        ug9 ug9Var4 = this.u0;
        if (ug9Var4 != null) {
            ug9Var4.setEnabled(z);
        }
    }

    public final void z0(boolean z, boolean z2) {
        if (this.K0 == z && z2) {
            return;
        }
        this.K0 = z;
        float f = z ? 1.15f : 1.0f;
        e29 e29Var = this.x0;
        if (z2) {
            e29Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(k43.h).start();
        } else {
            e29Var.animate().cancel();
            this.x0.setScaleX(f);
            this.x0.setScaleY(f);
        }
        yob.s(this.x0, z ? aob.q7 : aob.G6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        b29 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.I(0, false, false);
                }
                animatedDrawable.K(33);
            } else {
                animatedDrawable.K(0);
            }
            animatedDrawable.start();
        }
    }

    public yg9(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new gg9(this, (byte) 0);
        this.f = str;
    }

    public yg9(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new gg9(this, (byte) 0);
        this.b = richMessage;
    }
}
