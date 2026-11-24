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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class xya extends FrameLayout implements gk7, p39 {
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
    public final wjb N;
    public final wya a;
    public final oh8 b;
    public TLRPC.Document c;
    public s3a d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public xya(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.n = 1.0f;
        this.F = y6c.t0;
        this.I = 1.0f;
        this.N = wjbVar;
        this.G = z;
        wya wyaVar = new wya(this, wjbVar);
        this.a = wyaVar;
        wyaVar.S0 = true;
        wyaVar.A1 = true;
        wyaVar.m0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(bkb.w0(null, bkb.Ei, false));
        oh8 oh8Var = new oh8(1, null, context);
        this.b = oh8Var;
        oh8Var.setImageReceiver(wyaVar);
        oh8Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        oh8Var.setImageReceiver(wyaVar);
        addView(oh8Var, nme.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        int L = gl.L(12.0f);
        int i = bkb.p5;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, M, null, wjbVar);
        imageView.setAlpha(0.0f);
        addView(imageView, nme.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(s33.f).start();
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
        wya wyaVar = this.a;
        if (!z) {
            boolean z2 = this.w;
            float f2 = this.x;
            if (!z2) {
            }
            int min = Math.min(gl.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
            float measuredWidth = getMeasuredWidth() >> 1;
            float f3 = min;
            float f4 = f3 / 2.0f;
            float measuredHeight = getMeasuredHeight() >> 1;
            wyaVar.i0(measuredWidth - f4, measuredHeight - f4, f3, f3);
            wyaVar.setAlpha(this.n * f);
            if (this.x != 1.0f) {
                wyaVar.h(canvas, null);
                return;
            }
            canvas.save();
            float f5 = this.x;
            canvas.scale(f5, f5, measuredWidth, measuredHeight);
            wyaVar.h(canvas, null);
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
            wyaVar.setAlpha(interpolation * f);
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
        int min2 = Math.min(gl.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth2 = getMeasuredWidth() >> 1;
        float f32 = min2;
        float f42 = f32 / 2.0f;
        float measuredHeight2 = getMeasuredHeight() >> 1;
        wyaVar.i0(measuredWidth2 - f42, measuredHeight2 - f42, f32, f32);
        wyaVar.setAlpha(this.n * f);
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(s33.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, s3a s3aVar, Object obj, String str, boolean z, boolean z2) {
        int i;
        float f;
        boolean z3;
        boolean z4;
        int[] iArr;
        TextView textView;
        int i2;
        this.f = str;
        this.H = k27.W3(document);
        this.M = false;
        wya wyaVar = this.a;
        wyaVar.p1 = null;
        this.L = 0;
        int L = gl.L(12.0f);
        int i3 = bkb.p5;
        zkb.B(this.K, bkb.b0(L, bkb.w0(null, i3, false)), zkb.M(i3), null);
        if (z2) {
            c(false);
        } else {
            a(false);
        }
        if (this.H) {
            int w0 = bkb.w0(null, bkb.c6, false);
            oh8 oh8Var = this.b;
            oh8Var.setColor(w0);
            oh8Var.I = true;
            oh8Var.J = false;
            oh8Var.invalidate();
        }
        TextView textView2 = this.h;
        if (s3aVar != null) {
            this.d = s3aVar;
            if (s3aVar.c) {
                i2 = 4;
                iArr = null;
                textView = textView2;
                wyaVar.Z(gl5.g(s3aVar.a), "80_80", null, null, uo3.b(bkb.h5), 0L, s3aVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i2 = 4;
                wyaVar.Z(null, null, null, null, uo3.b(bkb.h5), 0L, s3aVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(vu3.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i2);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
            boolean z5 = this.G;
            if (z5) {
                i = bkb.b7;
                f = 0.2f;
            } else {
                i = bkb.Z6;
                f = 1.0f;
            }
            wjb wjbVar = this.N;
            kcb f2 = uo3.f(document, i, f, wjbVar);
            String str2 = z5 ? "66_66_pcache_compress" : "66_66";
            if (k27.B4(document)) {
                wyaVar.p1 = bkb.n0(wjbVar);
            }
            if (k27.p(document)) {
                if (z5) {
                    z4 = true;
                    this.M = true;
                } else {
                    z4 = true;
                }
                if (f2 != null) {
                    wyaVar.Y(gl5.b(document), str2, gl5.c(w, document), null, null, null, f2, 0L, null, this.e, 1);
                    z3 = z4;
                } else if (w != null) {
                    z3 = z4;
                    wyaVar.b0(gl5.b(document), str2, gl5.c(w, document), null, null, this.e, 1);
                } else {
                    z3 = z4;
                    wyaVar.d0(gl5.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z3 = true;
                if (f2 != null) {
                    if (w != null) {
                        wyaVar.d0(gl5.c(w, document), str2, f2, "webp", this.e, 1);
                    } else {
                        wyaVar.d0(gl5.b(document), str2, f2, "webp", this.e, 1);
                    }
                } else if (w != null) {
                    wyaVar.d0(gl5.c(w, document), str2, null, "webp", this.e, 1);
                } else {
                    wyaVar.d0(gl5.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(vu3.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
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
                            textView2.setText(vu3.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        i4++;
                    }
                }
                String str4 = (String) hq6.d0(this.F).d0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(vu3.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            wyaVar.setAlpha(this.n * this.I);
            if (this.M) {
                wyaVar.p0(this);
                return;
            } else {
                wyaVar.K0 = z3;
                wyaVar.p0((View) getParent());
                return;
            }
        }
        z3 = true;
        e(false);
        wyaVar.setAlpha(this.n * this.I);
        if (this.M) {
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.h5) {
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
        oh8 oh8Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh8Var.getLayoutParams();
        if (y6c.h(this.F).p()) {
            int L = gl.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = gl.L(8.0f);
            layoutParams.rightMargin = gl.L(8.0f);
            oh8Var.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
        } else {
            int L2 = gl.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = gl.L(8.0f);
            oh8Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        }
        oh8Var.setLocked(!y6c.h(r4).p());
        gl.U3(oh8Var, this.J, 0.9f, true, z);
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

    public g27 getSendAnimationData() {
        wya wyaVar = this.a;
        if (!wyaVar.E()) {
            return null;
        }
        g27 g27Var = new g27();
        getLocationInWindow(new int[2]);
        g27Var.a = wyaVar.r() + r2[0];
        g27Var.b = wyaVar.s() + r2[1];
        g27Var.c = wyaVar.N0;
        return g27Var;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public s3a getStickerPath() {
        s3a s3aVar = this.d;
        if (s3aVar == null || !s3aVar.c) {
            return null;
        }
        return s3aVar;
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
        wya wyaVar = this.a;
        if (z) {
            wyaVar.K0 = true;
            wyaVar.p0((View) getParent());
        } else {
            wyaVar.p0(this);
        }
        wyaVar.I();
        kk7.f(this.F).b(this, kk7.h5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        kk7.f(this.F).n(this, kk7.h5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = k96.M0(2131753933, null);
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
                        textView.setText(vu3.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = ls6.o(documentAttribute.alt, " ", M0, new StringBuilder());
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

    public void setSticker(s3a s3aVar) {
        String str = s3aVar.b;
        d(null, s3aVar, null, str, str != null, false);
    }
}
