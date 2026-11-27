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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class x2b extends FrameLayout implements fn7, e79 {
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
    public final vnb N;
    public final w2b a;
    public final cl8 b;
    public TLRPC.Document c;
    public k7a d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public x2b(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.n = 1.0f;
        this.F = yac.t0;
        this.I = 1.0f;
        this.N = vnbVar;
        this.G = z;
        w2b w2bVar = new w2b(this, vnbVar);
        this.a = w2bVar;
        w2bVar.S0 = true;
        w2bVar.A1 = true;
        w2bVar.m0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(aob.w0(null, aob.Fi, false));
        cl8 cl8Var = new cl8(1, null, context);
        this.b = cl8Var;
        cl8Var.setImageReceiver(w2bVar);
        cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        cl8Var.setImageReceiver(w2bVar);
        addView(cl8Var, tre.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        int L = hl.L(12.0f);
        int i = aob.q5;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        imageView.setBackground(b0);
        yob.j(imageView, b0, M, null, vnbVar);
        imageView.setAlpha(0.0f);
        addView(imageView, tre.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(k43.f).start();
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
        w2b w2bVar = this.a;
        if (!z) {
            boolean z2 = this.w;
            float f2 = this.x;
            if (!z2) {
            }
            int min = Math.min(hl.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
            float measuredWidth = getMeasuredWidth() >> 1;
            float f3 = min;
            float f4 = f3 / 2.0f;
            float measuredHeight = getMeasuredHeight() >> 1;
            w2bVar.i0(measuredWidth - f4, measuredHeight - f4, f3, f3);
            w2bVar.setAlpha(this.n * f);
            if (this.x != 1.0f) {
                w2bVar.h(canvas, null);
                return;
            }
            canvas.save();
            float f5 = this.x;
            canvas.scale(f5, f5, measuredWidth, measuredHeight);
            w2bVar.h(canvas, null);
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
            w2bVar.setAlpha(interpolation * f);
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
        int min2 = Math.min(hl.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth2 = getMeasuredWidth() >> 1;
        float f32 = min2;
        float f42 = f32 / 2.0f;
        float measuredHeight2 = getMeasuredHeight() >> 1;
        w2bVar.i0(measuredWidth2 - f42, measuredHeight2 - f42, f32, f32);
        w2bVar.setAlpha(this.n * f);
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(k43.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, k7a k7aVar, Object obj, String str, boolean z, boolean z2) {
        int i;
        float f;
        boolean z3;
        boolean z4;
        int[] iArr;
        TextView textView;
        int i2;
        this.f = str;
        this.H = r47.W3(document);
        this.M = false;
        w2b w2bVar = this.a;
        w2bVar.p1 = null;
        this.L = 0;
        int L = hl.L(12.0f);
        int i3 = aob.q5;
        yob.B(this.K, aob.b0(L, aob.w0(null, i3, false)), yob.M(i3), null);
        if (z2) {
            c(false);
        } else {
            a(false);
        }
        if (this.H) {
            int w0 = aob.w0(null, aob.d6, false);
            cl8 cl8Var = this.b;
            cl8Var.setColor(w0);
            cl8Var.I = true;
            cl8Var.J = false;
            cl8Var.invalidate();
        }
        TextView textView2 = this.h;
        if (k7aVar != null) {
            this.d = k7aVar;
            if (k7aVar.c) {
                i2 = 4;
                iArr = null;
                textView = textView2;
                w2bVar.Z(jn5.g(k7aVar.a), "80_80", null, null, lp3.b(aob.i5), 0L, k7aVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i2 = 4;
                w2bVar.Z(null, null, null, null, lp3.b(aob.i5), 0L, k7aVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(pv3.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i2);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
            boolean z5 = this.G;
            if (z5) {
                i = aob.c7;
                f = 0.2f;
            } else {
                i = aob.a7;
                f = 1.0f;
            }
            vnb vnbVar = this.N;
            ggb f2 = lp3.f(document, i, f, vnbVar);
            String str2 = z5 ? "66_66_pcache_compress" : "66_66";
            if (r47.B4(document)) {
                w2bVar.p1 = aob.n0(vnbVar);
            }
            if (r47.p(document)) {
                if (z5) {
                    z4 = true;
                    this.M = true;
                } else {
                    z4 = true;
                }
                if (f2 != null) {
                    w2bVar.Y(jn5.b(document), str2, jn5.c(w, document), null, null, null, f2, 0L, null, this.e, 1);
                    z3 = z4;
                } else if (w != null) {
                    z3 = z4;
                    w2bVar.b0(jn5.b(document), str2, jn5.c(w, document), null, null, this.e, 1);
                } else {
                    z3 = z4;
                    w2bVar.d0(jn5.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z3 = true;
                if (f2 != null) {
                    if (w != null) {
                        w2bVar.d0(jn5.c(w, document), str2, f2, "webp", this.e, 1);
                    } else {
                        w2bVar.d0(jn5.b(document), str2, f2, "webp", this.e, 1);
                    }
                } else if (w != null) {
                    w2bVar.d0(jn5.c(w, document), str2, null, "webp", this.e, 1);
                } else {
                    w2bVar.d0(jn5.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(pv3.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
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
                            textView2.setText(pv3.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        i4++;
                    }
                }
                String str4 = (String) ls6.d0(this.F).d0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(pv3.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            w2bVar.setAlpha(this.n * this.I);
            if (this.M) {
                w2bVar.p0(this);
                return;
            } else {
                w2bVar.K0 = z3;
                w2bVar.p0((View) getParent());
                return;
            }
        }
        z3 = true;
        e(false);
        w2bVar.setAlpha(this.n * this.I);
        if (this.M) {
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.i5) {
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
        cl8 cl8Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cl8Var.getLayoutParams();
        if (yac.h(this.F).p()) {
            int L = hl.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = hl.L(8.0f);
            layoutParams.rightMargin = hl.L(8.0f);
            cl8Var.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
        } else {
            int L2 = hl.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = hl.L(8.0f);
            cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        }
        cl8Var.setLocked(!yac.h(r4).p());
        hl.T3(cl8Var, this.J, 0.9f, true, z);
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

    public n47 getSendAnimationData() {
        w2b w2bVar = this.a;
        if (!w2bVar.E()) {
            return null;
        }
        n47 n47Var = new n47();
        getLocationInWindow(new int[2]);
        n47Var.a = w2bVar.r() + r2[0];
        n47Var.b = w2bVar.s() + r2[1];
        n47Var.c = w2bVar.N0;
        return n47Var;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public k7a getStickerPath() {
        k7a k7aVar = this.d;
        if (k7aVar == null || !k7aVar.c) {
            return null;
        }
        return k7aVar;
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
        w2b w2bVar = this.a;
        if (z) {
            w2bVar.K0 = true;
            w2bVar.p0((View) getParent());
        } else {
            w2bVar.p0(this);
        }
        w2bVar.I();
        jn7.f(this.F).b(this, jn7.i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        jn7.f(this.F).n(this, jn7.i5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = ob6.M0(2131753929, null);
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
                        textView.setText(pv3.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = qu6.o(documentAttribute.alt, " ", M0, new StringBuilder());
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

    public void setSticker(k7a k7aVar) {
        String str = k7aVar.b;
        d(null, k7aVar, null, str, str != null, false);
    }
}
