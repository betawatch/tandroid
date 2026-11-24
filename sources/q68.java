// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q68 extends FrameLayout {
    public static final Rect c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public jo6 I;
    public no6 J;
    public final Paint K;
    public AnimatorSet L;
    public final ylb M;
    public rna N;
    public qna O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public o68 W;
    public final m68 a;
    public SpannableString a0;
    public final ne6 b;
    public SpannableString b0;
    public final FrameLayout c;
    public final jh2 d;
    public final ImageView e;
    public final TextView f;
    public final n68 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public final kl7 w;
    public boolean x;
    public p68 y;

    public q68(Context context, ylb ylbVar) {
        super(context);
        this.w = new kl7(this, (byte) 26);
        this.H = true;
        this.K = new Paint();
        this.V = 1.0f;
        this.M = ylbVar;
        setWillNotDraw(false);
        ne6 ne6Var = new ne6((byte) 6, context, this);
        this.b = ne6Var;
        addView(ne6Var, qoe.c(80.0f, 80));
        m68 m68Var = new m68(this, context);
        this.a = m68Var;
        m68Var.setBlurAllowed(true);
        ne6Var.addView(m68Var, qoe.c(-1.0f, -1));
        n68 n68Var = new n68(context, (byte) 0);
        n68Var.b = new RectF();
        this.h = n68Var;
        n68Var.setWillNotDraw(false);
        n68Var.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        ne6Var.addView(n68Var, qoe.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        n68Var.addView(imageView, qoe.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n68Var.addView(textView, qoe.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        jh2 jh2Var = new jh2(24, ylbVar, context);
        this.d = jh2Var;
        jh2Var.setDrawBackgroundAsArc(7);
        jh2Var.b(cmb.V9, cmb.W9, cmb.U9);
        addView(jh2Var, qoe.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        jh2Var.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, qoe.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = gm.L(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i, boolean z, boolean z2) {
        this.d.a.f(i, z, z2);
        boolean z3 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            ne6 ne6Var = this.b;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) View.SCALE_X, z ? 0.787f : 1.0f), ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) View.SCALE_Y, z ? 0.787f : 1.0f));
                this.L.setDuration(200L);
                this.L.addListener(new jf4((byte) 20, this, z));
                this.L.start();
            } else {
                ne6Var.setScaleX(z ? 0.787f : 1.0f);
                ne6Var.setScaleY(z ? 0.787f : 1.0f);
            }
        }
        jo6 jo6Var = this.I;
        if (jo6Var != null && jo6Var.c() && a()) {
            z3 = true;
        }
        setHighQuality(z3);
    }

    public final void c(boolean z, Float f) {
        if (this.P != z) {
            boolean isLaidOut = isLaidOut();
            Bitmap bitmap = this.T;
            m68 m68Var = this.a;
            if (isLaidOut) {
                this.T = gm.H3(m68Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.V = 0.0f;
            } else {
                if (bitmap != null) {
                    bitmap.recycle();
                    this.T = null;
                }
                this.V = 1.0f;
            }
            this.P = z;
            this.U = f;
            m68Var.setHasBlur(z);
            m68Var.invalidate();
            if (z) {
                h(z);
            }
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
            jh2 jh2Var = this.d;
            float f = jh2Var.a.q ? 0.787f : 1.0f;
            ne6 ne6Var = this.b;
            ne6Var.setScaleX(f);
            ne6Var.setScaleY(jh2Var.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(jo6 jo6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.x = false;
        this.I = jo6Var;
        this.r = z3;
        this.s = z4;
        if (z4) {
            jo6Var.k(this.w);
        }
        jo6 jo6Var2 = this.I;
        boolean z6 = jo6Var2.b;
        ImageView imageView = this.e;
        TextView textView = this.f;
        n68 n68Var = this.h;
        m68 m68Var = this.a;
        if (z6 && !jo6Var2.d()) {
            m68Var.q();
            n68Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(13.0f);
            textView.setText(gm.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            n68Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(0.0f);
            textView.setText(jb6.M0(2131745099, null));
        } else {
            imageView.setVisibility(8);
            n68Var.setVisibility(4);
        }
        jo6 jo6Var3 = this.I;
        String str = jo6Var3.g;
        if (str != null) {
            m68Var.o(str, null, cmb.Q4);
        } else {
            String str2 = jo6Var3.c;
            if (str2 != null) {
                m68Var.o(str2, null, cmb.Q4);
            } else if (jo6Var3.I == null) {
                m68Var.setImageDrawable(cmb.Q4);
            } else if (!jo6Var3.b || jo6Var3.d()) {
                jo6 jo6Var4 = this.I;
                m68Var.r(jo6Var4.J, jo6Var4.K, true);
                m68Var.o("thumb://" + this.I.C + ":" + this.I.I, null, cmb.Q4);
            } else {
                m68Var.o("vthumb://" + this.I.C + ":" + this.I.I, null, cmb.Q4);
            }
        }
        boolean z7 = z2 && PhotoViewer.Q0(this.I.I);
        m68Var.getImageReceiver().v0(!z7, true);
        this.d.setAlpha(z7 ? 0.0f : 1.0f);
        n68Var.setAlpha(z7 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(jo6Var.M);
        if (jo6Var.c() && a()) {
            z5 = true;
        }
        setHighQuality(z5);
        f(jo6Var.N, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(no6 no6Var) {
        m68 m68Var;
        this.x = false;
        this.J = no6Var;
        this.r = false;
        Drawable drawable = this.H ? cmb.Q4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = no6Var.M;
        m68 m68Var2 = this.a;
        if (photoSize != null) {
            m68Var2.m(gn5.i(photoSize, no6Var.K), null, drawable, no6Var);
        } else {
            TLRPC.PhotoSize photoSize2 = no6Var.L;
            if (photoSize2 != null) {
                m68Var2.m(gn5.i(photoSize2, no6Var.K), "80_80", drawable, no6Var);
            } else {
                String str = no6Var.c;
                if (str != null) {
                    m68Var2.o(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(no6Var.D)) {
                        TLRPC.Document document = no6Var.J;
                        if (document != null) {
                            k47.J0(document);
                            TLRPC.VideoSize J0 = k47.J0(no6Var.J);
                            TLRPC.Document document2 = no6Var.J;
                            if (J0 != null) {
                                m68Var2.g(1, -1L, gn5.d(J0, no6Var.J), gn5.c(bc4.w(document2.thumbs, 90, false, null, false), no6Var.J), no6Var, null, "52_52", null);
                                m68Var = m68Var2;
                            } else {
                                m68Var = m68Var2;
                                m68Var.m(gn5.c(bc4.w(document2.thumbs, nm7.q5, false, null, false), no6Var.J), null, drawable, no6Var);
                            }
                        } else {
                            m68Var = m68Var2;
                            m68Var.setImageDrawable(drawable);
                        }
                        boolean Q0 = PhotoViewer.Q0(no6Var.g());
                        m68Var.getImageReceiver().v0(!Q0, true);
                        this.d.setAlpha(!Q0 ? 0.0f : 1.0f);
                        this.h.setAlpha(Q0 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    gn5 g = gn5.g(no6Var.D);
                    if (no6Var.H && no6Var.D.endsWith("mp4")) {
                        g.p = (byte) 2;
                    }
                    m68Var2.m(g, null, drawable, no6Var);
                }
            }
        }
        m68Var = m68Var2;
        boolean Q02 = PhotoViewer.Q0(no6Var.g());
        m68Var.getImageReceiver().v0(!Q02, true);
        this.d.setAlpha(!Q02 ? 0.0f : 1.0f);
        this.h.setAlpha(Q02 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (z == this.S && j == this.R) {
            return;
        }
        this.R = j;
        this.S = z;
        if (j > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.a0 == null) {
                this.a0 = new SpannableString("⭐");
                pn2 pn2Var = new pn2(R.drawable.star_small_inner, 0);
                pn2Var.I = 0.7f;
                pn2Var.J = 0.7f;
                SpannableString spannableString = this.a0;
                spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z) {
                if (this.b0 == null) {
                    this.b0 = new SpannableString("l");
                    pn2 pn2Var2 = new pn2(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.b0;
                    spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j));
            }
        } else {
            spannableStringBuilder = null;
        }
        m68 m68Var = this.a;
        m68Var.setBlurredText(spannableStringBuilder);
        m68Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z) {
        jh2 jh2Var = this.d;
        float alpha = jh2Var.getAlpha();
        if (z) {
            if (alpha == 1.0f) {
                return;
            }
        } else if (alpha == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        this.n.setDuration(180L);
        AnimatorSet animatorSet3 = this.n;
        float[] fArr = {z ? 1.0f : 0.0f};
        n68 n68Var = this.h;
        Property property = View.ALPHA;
        animatorSet3.playTogether(ObjectAnimator.ofFloat(n68Var, (Property<n68, Float>) property, fArr), ObjectAnimator.ofFloat(jh2Var, (Property<jh2, Float>) property, z ? 1.0f : 0.0f));
        this.n.addListener(new s38(this, (byte) 2));
        this.n.start();
    }

    public jh2 getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public bf0 getImageView() {
        return this.a;
    }

    public jo6 getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z) {
        m68 m68Var;
        ne6 ne6Var = this.b;
        if (ne6Var == null || (m68Var = this.a) == null || m68Var.getMeasuredHeight() <= 0 || m68Var.getMeasuredWidth() <= 0) {
            return;
        }
        qna qnaVar = this.O;
        if (z) {
            if (qnaVar == null) {
                this.O = qna.e(ne6Var);
            }
        } else if (qnaVar != null) {
            qnaVar.b(this);
            this.O = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qna qnaVar = this.O;
        if (qnaVar != null) {
            if (qnaVar.i) {
                this.O = qna.e(this);
            } else {
                qnaVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qna qnaVar = this.O;
        if (qnaVar != null) {
            qnaVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jo6 jo6Var;
        no6 no6Var;
        boolean z = this.d.a.q;
        m68 m68Var = this.a;
        if (!z && this.b.getScaleX() == 1.0f && m68Var.getImageReceiver().E() && m68Var.getImageReceiver().i1 == 1.0f && (((jo6Var = this.I) == null || !PhotoViewer.Q0(jo6Var.I)) && ((no6Var = this.J) == null || !PhotoViewer.Q0(no6Var.g())))) {
            return;
        }
        int v0 = cmb.v0(cmb.W9, this.M);
        Paint paint = this.K;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, m68Var.getMeasuredWidth(), m68Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        jo6 jo6Var = this.I;
        if (jo6Var != null && jo6Var.i() && this.I.d()) {
            sb.append(jb6.M0(2131753927, null));
        } else {
            jo6 jo6Var2 = this.I;
            if (jo6Var2 == null || !jo6Var2.b) {
                sb.append(jb6.M0(2131753913, null));
            } else {
                sb.append(jb6.M0(2131753898, null) + ", " + jb6.z(this.I.E));
            }
        }
        if (this.I != null) {
            sb.append(". ");
            sb.append(jb6.D0().y0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, jb6.M0(2131747550, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, TLObject.FLAG_30), wi8.E(2.0f, this.F, TLObject.FLAG_30));
            return;
        }
        if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), TLObject.FLAG_30));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.c;
        Rect rect = c0;
        frameLayout.getHitRect(rect);
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = true;
                invalidate();
                return z ? super.onTouchEvent(motionEvent) : z;
            }
        } else if (this.x) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.x = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.y.c(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.x = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = false;
                invalidate();
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setDelegate(p68 p68Var) {
        this.y = p68Var;
    }

    public void setFastScrollDelegate(o68 o68Var) {
        this.W = o68Var;
    }

    public void setHasSpoiler(boolean z) {
        c(z, null);
    }

    public void setHighQuality(boolean z) {
        boolean z2 = z && a();
        if (this.Q != z2) {
            this.Q = z2;
            jo6 jo6Var = this.I;
            if (jo6Var != null) {
                boolean z3 = jo6Var.b;
                ImageView imageView = this.e;
                n68 n68Var = this.h;
                TextView textView = this.f;
                if (z3 && !jo6Var.d()) {
                    this.a.q();
                    n68Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(13.0f);
                    textView.setText(gm.g0(this.I.E, false, false));
                    return;
                }
                if (!this.I.c()) {
                    imageView.setVisibility(8);
                    n68Var.setVisibility(4);
                } else {
                    n68Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(0.0f);
                    textView.setText(jb6.M0(2131745099, null));
                }
            }
        }
    }

    public void setIsVertical(boolean z) {
        this.G = z;
    }

    public void setItemSize(int i) {
        this.F = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i2 = this.F;
        layoutParams.height = i2;
        layoutParams.width = i2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        jh2 jh2Var = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) jh2Var.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = gm.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        jh2Var.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i) {
        this.d.setNum(i);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
