// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w14 extends FrameLayout implements vlb, jm7 {
    public Paint E;
    public byte F;
    public AnimatorSet G;
    public final /* synthetic */ e34 H;
    public int a;
    public int b;
    public final s09 c;
    public final lka d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final cj8 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public s14 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w14(e34 e34Var, Context context) {
        super(context);
        this.H = e34Var;
        zmb zmbVar = anb.a;
        s09 s09Var = new s09(context);
        this.c = s09Var;
        s09Var.f(R.raw.unlock_icon, 24, 24, null);
        int i = cmb.Kf;
        ylb ylbVar = e34Var.a2;
        anb.s(s09Var, i, ylbVar, PorterDuff.Mode.SRC_ATOP);
        addView(s09Var, qoe.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTextSize(15);
        anb.W(lkaVar, i, ylbVar);
        lkaVar.setTypeface(gm.o());
        lkaVar.setOnClickListener(new v14(this, (byte) 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        anb.X(textView, i, ylbVar);
        textView.setTypeface(gm.o());
        int L = gm.L(8.0f);
        int i2 = cmb.Df;
        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.12f, e34Var.x(i2)));
        wmb K = anb.K(0.12f, i2);
        textView.setBackground(b0);
        anb.j(textView, b0, K, null, ylbVar);
        textView.setPadding(gm.L(6.0f), gm.L(1.5f), gm.L(6.0f), gm.L(1.5f));
        textView.setText(jb6.M0(2131749201, null));
        lkaVar.setEllipsizeByGradient(true);
        addView(lkaVar, qoe.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, qoe.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(gm.L(11.0f), gm.L(11.0f), gm.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new v14(this, (byte) 1));
        addView(frameLayout, qoe.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setText(jb6.M0(2131754483, null));
        anb.X(textView2, cmb.Ii, ylbVar);
        int i3 = cmb.Ei;
        textView2.setBackground(ulb.d(e34Var.x(i3), e34Var.x(cmb.Gi), 16.0f));
        textView2.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new v14(this, (byte) 2));
        frameLayout.addView(textView2, qoe.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gm.o());
        textView3.setText(jb6.M0(2131744544, null));
        anb.X(textView3, cmb.Hi, ylbVar);
        textView3.setBackground(ulb.d(0, e34Var.x(i3) & 452984831, 16.0f));
        textView3.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(gm.L(4.0f));
        textView3.setOnClickListener(new v14(this, (byte) 3));
        frameLayout.addView(textView3, qoe.h(-2.0f, 26.0f, 8388661));
        cj8 cj8Var = new cj8(gm.L(16.0f), ylbVar, context, false);
        this.r = cj8Var;
        cj8Var.setIcon(R.raw.unlock_icon);
        cj8Var.b(jb6.M0(2131743563, null), new v14(this, (byte) 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cj8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = gm.L(1.0f);
            marginLayoutParams.topMargin = gm.L(1.0f);
            int L2 = gm.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) cj8Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = gm.L(5.0f);
            marginLayoutParams2.topMargin = gm.L(-0.5f);
            cj8Var.getChildAt(0).setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, qoe.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z) {
        char c;
        float f;
        s14 s14Var = this.x;
        if (s14Var == null) {
            return;
        }
        boolean z2 = s14Var.f;
        e34 e34Var = this.H;
        byte b = (this.x.e || z8c.h(e34Var.d1).p() || e34Var.V0) ? this.x.g ? z2 || e34Var.q1.contains(Long.valueOf(s14Var.b.id)) ? (byte) 3 : (byte) 2 : (byte) 0 : (byte) 1;
        if ((b == 0) != (this.F == 0)) {
            requestLayout();
        }
        this.F = b;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        boolean z3 = b == 1;
        cj8 cj8Var = this.r;
        cj8Var.setEnabled(z3);
        boolean z4 = b == 2;
        TextView textView = this.h;
        textView.setEnabled(z4);
        boolean z5 = b == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z5);
        lka lkaVar = this.d;
        s09 s09Var = this.c;
        if (!z) {
            s09Var.setAlpha(b == 1 ? 1.0f : 0.0f);
            s09Var.setTranslationX(b == 1 ? 0.0f : -gm.L(16.0f));
            lkaVar.setTranslationX(b == 1 ? gm.L(16.0f) : 0.0f);
            cj8Var.setAlpha(b == 1 ? 1.0f : 0.0f);
            cj8Var.setScaleX(b == 1 ? 1.0f : 0.6f);
            cj8Var.setScaleY(b == 1 ? 1.0f : 0.6f);
            cj8Var.setVisibility(b == 1 ? 0 : 8);
            textView.setAlpha(b == 2 ? 1.0f : 0.0f);
            textView.setScaleX(b == 2 ? 1.0f : 0.6f);
            textView.setScaleY(b == 2 ? 1.0f : 0.6f);
            textView.setVisibility(b == 2 ? 0 : 8);
            textView2.setAlpha(b == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(b == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(b == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(b == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        if (b == 1) {
            f = 0.0f;
            c = 0;
        } else {
            c = 0;
            f = -gm.L(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c] = f;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c] = b == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c] = b == 1 ? gm.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c] = b == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cj8Var, (Property<cj8, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c] = b == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cj8Var, (Property<cj8, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c] = b == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(cj8Var, (Property<cj8, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c] = b == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c] = b == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c] = b == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c] = b == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c] = b == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c] = b == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[2] = ofFloat3;
        animatorArr[3] = ofFloat4;
        animatorArr[4] = ofFloat5;
        animatorArr[5] = ofFloat6;
        animatorArr[6] = ofFloat7;
        animatorArr[7] = ofFloat8;
        animatorArr[8] = ofFloat9;
        animatorArr[9] = ofFloat10;
        animatorArr[10] = ofFloat11;
        animatorArr[11] = ofFloat12;
        animatorSet2.playTogether(animatorArr);
        this.G.addListener(new oz1(this, b, (byte) 1));
        this.G.setDuration(250L);
        this.G.setInterpolator(new OvershootInterpolator(1.02f));
        this.G.start();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_messages_stickerSet p0;
        TLRPC.TL_messages_stickerSet p02;
        e34 e34Var = this.H;
        int i3 = e34Var.d1;
        if (i == nm7.B0) {
            if (this.s != null && (p02 = hs6.d0(i3).p0(this.s.id)) != null && p02.set != null) {
                d dVar = e34Var.Z1;
                if (dVar == null) {
                    dVar = new qv0(this, (byte) 5);
                }
                az3.E0(dVar, p02, true, null, new a14(this, (byte) 2));
                this.s = null;
            }
            if (this.w == null || (p0 = hs6.d0(i3).p0(this.w.id)) == null || p0.set == null) {
                return;
            }
            d dVar2 = e34Var.Z1;
            if (dVar2 == null) {
                dVar2 = new qv0(this, (byte) 5);
            }
            d dVar3 = dVar2;
            pv3 pv3Var = new pv3(this, p0, (byte) 7);
            Pattern pattern = az3.P1;
            if (dVar3.getFragmentView() != null) {
                hs6.d0(dVar3.getCurrentAccount()).i2(dVar3.getFragmentView().getContext(), p0, null, 0, dVar3, null, true, true, pv3Var, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.H.d1).n(this, nm7.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.x(cmb.c7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = gm.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = L + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        lka lkaVar = this.d;
        lkaVar.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(gm.L(4.0f) + lkaVar.getTextWidth());
            float L2 = gm.L(4.0f) + (lkaVar.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = gm.L(this.F == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.F == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        e34 e34Var = this.H;
        try {
            int x = e34Var.x(cmb.Ei);
            int x2 = e34Var.x(cmb.Gi);
            if (x != this.a || x2 != this.b) {
                this.a = x;
                this.b = x2;
                TextView textView = this.h;
                if (textView != null) {
                    cmb.F1(textView.getBackground(), x, false);
                    cmb.F1(textView.getBackground(), x2, true);
                    textView.invalidate();
                }
                TextView textView2 = this.n;
                if (textView2 != null) {
                    cmb.F1(textView2.getBackground(), x & 452984831, true);
                    textView2.invalidate();
                }
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
