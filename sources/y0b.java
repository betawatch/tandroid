// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class y0b extends FrameLayout implements jm7, s59 {
    public static final AccelerateInterpolator O = new AccelerateInterpolator(0.5f);
    public boolean E;
    public final int F;
    public final boolean G;
    public boolean H;
    public final float I;
    public boolean J;
    public final ImageView K;
    public int L;
    public boolean M;
    public final ylb N;
    public final x0b a;
    public final pj8 b;
    public TLRPC.Document c;
    public t5a d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public y0b(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.n = 1.0f;
        this.F = z8c.t0;
        this.I = 1.0f;
        this.N = ylbVar;
        this.G = z;
        x0b x0bVar = new x0b(this, ylbVar);
        this.a = x0bVar;
        x0bVar.S0 = true;
        x0bVar.A1 = true;
        x0bVar.m0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(cmb.w0(null, cmb.Ei, false));
        pj8 pj8Var = new pj8(1, null, context);
        this.b = pj8Var;
        pj8Var.setImageReceiver(x0bVar);
        pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        pj8Var.setImageReceiver(x0bVar);
        addView(pj8Var, qoe.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        int L = gm.L(12.0f);
        int i = cmb.p5;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        imageView.setBackground(b0);
        anb.j(imageView, b0, M, null, ylbVar);
        imageView.setAlpha(0.0f);
        addView(imageView, qoe.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(d53.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z = this.r;
        float f = this.I;
        x0b x0bVar = this.a;
        if (!z) {
            boolean z2 = this.w;
            float f2 = this.x;
            if (!z2) {
            }
            int min = Math.min(gm.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
            float measuredWidth = getMeasuredWidth() >> 1;
            float f3 = min;
            float f4 = f3 / 2.0f;
            float measuredHeight = getMeasuredHeight() >> 1;
            x0bVar.i0(measuredWidth - f4, measuredHeight - f4, f3, f3);
            x0bVar.setAlpha(this.n * f);
            if (this.x != 1.0f) {
                x0bVar.h(canvas, null);
                return;
            }
            canvas.save();
            float f5 = this.x;
            canvas.scale(f5, f5, measuredWidth, measuredHeight);
            x0bVar.h(canvas, null);
            canvas.restore();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.s;
        this.s = currentTimeMillis;
        if (this.r) {
            long j2 = this.y + j;
            this.y = j2;
            if (j2 > 1050) {
                this.y = 1050L;
                j2 = 1050;
            }
            float interpolation = (O.getInterpolation(j2 / 150.0f) * 0.5f) + 0.5f;
            this.n = interpolation;
            if (interpolation >= 1.0f) {
                this.r = false;
                this.n = 1.0f;
                interpolation = 1.0f;
            }
            x0bVar.setAlpha(interpolation * f);
        } else {
            if (this.w) {
                float f6 = this.x;
                if (f6 != 0.8f) {
                    float f7 = f6 - (j / 400.0f);
                    this.x = f7;
                    if (f7 < 0.8f) {
                        this.x = 0.8f;
                    }
                }
            }
            float f8 = (j / 400.0f) + this.x;
            this.x = f8;
            if (f8 > 1.0f) {
                this.x = 1.0f;
            }
        }
        viewGroup.invalidate();
        int min2 = Math.min(gm.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth2 = getMeasuredWidth() >> 1;
        float f32 = min2;
        float f42 = f32 / 2.0f;
        float measuredHeight2 = getMeasuredHeight() >> 1;
        x0bVar.i0(measuredWidth2 - f42, measuredHeight2 - f42, f32, f32);
        x0bVar.setAlpha(this.n * f);
        if (this.x != 1.0f) {
        }
    }

    public final void c(boolean z) {
        ImageView imageView = this.K;
        if (!z) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(d53.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, t5a t5aVar, Object obj, String str, boolean z, boolean z2) {
        int i;
        float f;
        boolean z3;
        boolean z4;
        int[] iArr;
        TextView textView;
        int i2;
        this.f = str;
        this.H = k47.W3(document);
        this.M = false;
        x0b x0bVar = this.a;
        x0bVar.p1 = null;
        this.L = 0;
        int L = gm.L(12.0f);
        int i3 = cmb.p5;
        anb.B(this.K, cmb.b0(L, cmb.w0(null, i3, false)), anb.M(i3), null);
        if (z2) {
            c(false);
        } else {
            a(false);
        }
        if (this.H) {
            int w0 = cmb.w0(null, cmb.c6, false);
            pj8 pj8Var = this.b;
            pj8Var.setColor(w0);
            pj8Var.I = true;
            pj8Var.J = false;
            pj8Var.invalidate();
        }
        TextView textView2 = this.h;
        if (t5aVar != null) {
            this.d = t5aVar;
            if (t5aVar.c) {
                i2 = 4;
                iArr = null;
                textView = textView2;
                x0bVar.Z(gn5.g(t5aVar.a), "80_80", null, null, eq3.b(cmb.h5), 0L, t5aVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i2 = 4;
                x0bVar.Z(null, null, null, null, eq3.b(cmb.h5), 0L, t5aVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(gw3.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i2);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
            boolean z5 = this.G;
            if (z5) {
                i = cmb.b7;
                f = 0.2f;
            } else {
                i = cmb.Z6;
                f = 1.0f;
            }
            ylb ylbVar = this.N;
            meb f2 = eq3.f(document, i, f, ylbVar);
            String str2 = z5 ? "66_66_pcache_compress" : "66_66";
            if (k47.B4(document)) {
                x0bVar.p1 = cmb.n0(ylbVar);
            }
            if (k47.p(document)) {
                if (z5) {
                    z4 = true;
                    this.M = true;
                } else {
                    z4 = true;
                }
                if (f2 != null) {
                    x0bVar.Y(gn5.b(document), str2, gn5.c(w, document), null, null, null, f2, 0L, null, this.e, 1);
                    z3 = z4;
                } else if (w != null) {
                    z3 = z4;
                    x0bVar.b0(gn5.b(document), str2, gn5.c(w, document), null, null, this.e, 1);
                } else {
                    z3 = z4;
                    x0bVar.d0(gn5.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z3 = true;
                if (f2 != null) {
                    if (w != null) {
                        x0bVar.d0(gn5.c(w, document), str2, f2, "webp", this.e, 1);
                    } else {
                        x0bVar.d0(gn5.b(document), str2, f2, "webp", this.e, 1);
                    }
                } else if (w != null) {
                    x0bVar.d0(gn5.c(w, document), str2, null, "webp", this.e, 1);
                } else {
                    x0bVar.d0(gn5.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(gw3.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else if (z) {
                int i4 = 0;
                while (true) {
                    if (i4 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str3 = documentAttribute.alt;
                        if (str3 != null && str3.length() > 0) {
                            textView2.setText(gw3.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        i4++;
                    }
                }
                String str4 = (String) hs6.d0(this.F).d0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(gw3.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            x0bVar.setAlpha(this.n * this.I);
            if (this.M) {
                x0bVar.p0(this);
                return;
            } else {
                x0bVar.K0 = z3;
                x0bVar.p0((View) getParent());
                return;
            }
        }
        z3 = true;
        e(false);
        x0bVar.setAlpha(this.n * this.I);
        if (this.M) {
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j5) {
            e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z) {
        if (this.H) {
            this.J = true;
        } else {
            this.J = false;
        }
        pj8 pj8Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pj8Var.getLayoutParams();
        if (z8c.h(this.F).p()) {
            int L = gm.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = gm.L(8.0f);
            layoutParams.rightMargin = gm.L(8.0f);
            pj8Var.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
        } else {
            int L2 = gm.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = gm.L(8.0f);
            pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        }
        pj8Var.setLocked(!z8c.h(r4).p());
        gm.T3(pj8Var, this.J, 0.9f, true, z);
        invalidate();
    }

    public String getEmoji() {
        return this.f;
    }

    public ImageReceiver getImageView() {
        return this.a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public g47 getSendAnimationData() {
        x0b x0bVar = this.a;
        if (!x0bVar.E()) {
            return null;
        }
        g47 g47Var = new g47();
        getLocationInWindow(new int[2]);
        g47Var.a = x0bVar.r() + r2[0];
        g47Var.b = x0bVar.s() + r2[1];
        g47Var.c = x0bVar.N0;
        return g47Var;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public t5a getStickerPath() {
        t5a t5aVar = this.d;
        if (t5aVar == null || !t5aVar.c) {
            return null;
        }
        return t5aVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.M && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.M;
        x0b x0bVar = this.a;
        if (z) {
            x0bVar.K0 = true;
            x0bVar.p0((View) getParent());
        } else {
            x0bVar.p0(this);
        }
        x0bVar.I();
        nm7.f(this.F).b(this, nm7.j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        nm7.f(this.F).n(this, nm7.j5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = jb6.M0(2131753901, null);
        if (this.c != null) {
            int i = 0;
            while (true) {
                if (i >= this.c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.c.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(gw3.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = kt6.p(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(M0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z) {
        this.E = z;
    }

    public void setScaled(boolean z) {
        this.w = z;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(t5a t5aVar) {
        String str = t5aVar.b;
        d(null, t5aVar, null, str, str != null, false);
    }
}
