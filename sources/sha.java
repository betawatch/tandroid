// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class sha extends FrameLayout {
    public static long F0;
    public static boolean G0;
    public Path A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D0;
    public boolean E;
    public final ln E0;
    public boolean F;
    public StaticLayout G;
    public String H;
    public boolean I;
    public int J;
    public Bitmap K;
    public Paint L;
    public boolean M;
    public final ln N;
    public final ho O;
    public uib P;
    public CheckBoxBase Q;
    public final jd4 R;
    public boolean S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public int a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final ImageReceiver c;
    public GradientDrawable c0;
    public final ImageReceiver d;
    public boolean d0;
    public cba e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public boolean h;
    public final Path h0;
    public rna i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public k47 n;
    public qna n0;
    public final Path o0;
    public uib p0;
    public uib q0;
    public int r;
    public uib r0;
    public tk4 s;
    public int s0;
    public final Paint t0;
    public final Paint u0;
    public final ln v0;
    public sha w;
    public zb1 w0;
    public float x;
    public boolean x0;
    public float y;
    public boolean y0;
    public final RectF z0;

    public sha(Context context, jd4 jd4Var, int i) {
        super(context);
        this.a = 0;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.d = imageReceiver3;
        this.x = 1.0f;
        this.y = 1.0f;
        this.I = true;
        d53 d53Var = d53.h;
        this.N = new ln(this, 0L, 350L, d53Var);
        ho hoVar = new ho(false, true, true);
        this.O = hoVar;
        this.h0 = new Path();
        this.o0 = new Path();
        this.s0 = 0;
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new ln(this, 0L, 200L, d53Var);
        this.z0 = new RectF();
        this.E0 = new ln(this, 0L, 320L, d53Var);
        this.R = jd4Var;
        this.f = i;
        i(false, false);
        imageReceiver2.p0(this);
        imageReceiver.p0(this);
        imageReceiver3.p0(this);
        imageReceiver2.h1 = new yf9(this, (byte) 21);
        hoVar.setCallback(this);
        hoVar.w(gm.L(12.0f));
        hoVar.u(-1);
        hoVar.x(gm.o());
        hoVar.N = gm.q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.T != 0.0f) {
            float f = this.U;
            if (f == 9.0f || this.r == 9) {
                if (f == 9.0f) {
                    return td4.A(1.0f, this.T, gm.N(2.0f), gm.N(1.0f) * this.T);
                }
                return td4.A(1.0f, this.T, gm.N(1.0f), gm.N(2.0f) * this.T);
            }
        }
        return this.r == 9 ? gm.N(1.0f) : gm.N(2.0f);
    }

    private void setPrivacyType(int i) {
        if (this.J == i) {
            return;
        }
        this.J = i;
        this.K = null;
        int i2 = i != 1 ? i != 2 ? i != 3 ? i != 100 ? 0 : R.drawable.msg_pin_mini : R.drawable.msg_folders_groups : R.drawable.msg_folders_private : R.drawable.msg_stories_closefriends;
        if (i2 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.R.g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i2));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, gm.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i2), createBitmap2);
                bitmap = createBitmap2;
            }
            this.K = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        canvas.save();
        Path path = this.A0;
        if (path == null) {
            path = new Path();
            this.A0 = path;
        }
        path.rewind();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, f, f2);
        float L = gm.L(12.0f) * f3;
        this.A0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.A0.close();
        canvas.clipPath(this.A0);
        canvas.scale(f / getWidth(), f2 / getHeight());
        boolean C = this.b.C();
        if (!C || f3 < 1.0f) {
            float f4 = 1.0f - f3;
            d(f4, 1.0f, f4, canvas, false);
        }
        if (C && f3 > 0.0f) {
            d(1.0f - f3, f3, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f) {
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.h && this.P != null) {
                float L = gm.L(5.33f);
                uib uibVar = this.P;
                uibVar.p = (int) (rectF.width() - (2.0f * L));
                uibVar.t = gm.L(14.0f);
                uibVar.a.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.66f), cmb.p1(0.4f * f, -16777216));
                uibVar.c(rectF.left + L, rectF.top + gm.L(this.r <= 2 ? 15.0f : 11.33f), 1.0f, cmb.p1(f, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f) {
        String str;
        float f2 = f;
        if (this.E) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.R0) {
                float L = (gm.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L;
                if (f2 < 1.0f) {
                    f2 = (float) Math.pow(f2, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i = this.r;
                jd4 jd4Var = this.R;
                if (i != 9 && this.G == null && (str = this.H) != null) {
                    this.G = new StaticLayout(this.H, (TextPaint) jd4Var.a, (int) Math.ceil(((TextPaint) jd4Var.a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i >= 9 || this.H == null) && this.G != null) {
                    this.G = null;
                }
                boolean q = q(L);
                int L2 = gm.L(8.0f);
                StaticLayout staticLayout = this.G;
                int width2 = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.I ? gm.L(10.0f) : 0);
                canvas.translate(gm.L(5.0f), (((rectF.height() + gm.L(1.0f)) - gm.L(17.0f)) - gm.L(4.0f)) - (q ? gm.L(22.0f) : 0));
                RectF rectF2 = gm.P;
                rectF2.set(0.0f, 0.0f, width2, gm.L(17.0f));
                int alpha = cmb.h2.getAlpha();
                cmb.h2.setAlpha((int) (alpha * f2));
                canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                cmb.h2.setAlpha(alpha);
                if (this.I) {
                    canvas.save();
                    float L3 = this.G == null ? gm.L(5.0f) : gm.L(4.0f);
                    int L4 = gm.L(17.0f);
                    Drawable drawable = (Drawable) jd4Var.c;
                    Drawable drawable2 = (Drawable) jd4Var.c;
                    canvas.translate(L3, (L4 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f2));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.G != null) {
                    canvas.translate(gm.L((this.I ? 10 : 0) + 4), (gm.L(17.0f) - this.G.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) jd4Var.a;
                    TextPaint textPaint2 = (TextPaint) jd4Var.a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f2));
                    this.G.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x05fc, code lost:
    
        if (r0.getProgress() != 0.0f) goto L191;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, float f3, Canvas canvas, boolean z) {
        float f4;
        float f5;
        boolean z2;
        RectF rectF;
        Canvas canvas2;
        float f6;
        float f7;
        float f8;
        ImageReceiver imageReceiver;
        float f9;
        RectF rectF2;
        sha shaVar;
        float L;
        float f10;
        Drawable drawable;
        float f11;
        Canvas canvas3;
        float f12;
        int i;
        int i2;
        int i3;
        int i4;
        tk4 tk4Var;
        float padding = getPadding() * f;
        float f13 = this.W ? padding : 0.0f;
        float d = this.E0.d(this.D0);
        float measuredWidth = ((getMeasuredWidth() - f13) - padding) * this.y;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.y;
        ImageReceiver imageReceiver2 = z ? this.b : this.c;
        imageReceiver2.setAlpha(f2);
        RectF rectF3 = imageReceiver2.Q0;
        if (this.T > 0.5f && this.U != 9.0f && this.r != 9) {
            float f14 = f * 2.0f;
            measuredWidth -= f14;
            measuredHeight -= f14;
        }
        if ((this.n != null || this.s0 == 1) && imageReceiver2.B() && imageReceiver2.i1 == 1.0f && this.x == 1.0f) {
            f4 = 1.0f;
            f5 = 0.0f;
            z2 = true;
        } else {
            if (getParent() == null || (tk4Var = this.s) == null) {
                f4 = 1.0f;
                f5 = 0.0f;
                z2 = true;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f15 = -getX();
                tk4Var.P = measuredWidth2;
                tk4Var.Q = measuredHeight2;
                tk4Var.R = f15;
                this.s.updateColors();
                this.s.f();
                float f16 = (this.T <= 0.5f || this.U == 9.0f || this.r == 9) ? 0.0f : 1.0f;
                float f17 = f13 + f16;
                float f18 = f16 + padding;
                f4 = 1.0f;
                f5 = 0.0f;
                z2 = true;
                canvas.drawRect(f17, f18, f17 + measuredWidth, f18 + measuredHeight, this.s.getPaint());
            }
            invalidate();
        }
        float f19 = this.x;
        if (f19 != f4) {
            rectF = rectF3;
            canvas.saveLayerAlpha(0.0f, 0.0f, f13 + padding + measuredWidth, padding + f5 + measuredHeight, (int) (f19 * 255.0f), 31);
        } else {
            rectF = rectF3;
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.Q;
        jd4 jd4Var = this.R;
        if (((checkBoxBase == null || !checkBoxBase.q) && !PhotoViewer.P0(this.n)) || this.x0) {
            canvas2 = canvas;
            f6 = f13;
        } else {
            canvas2 = canvas;
            f6 = f13;
            canvas2.drawRect(f6, 0.0f, (f13 + measuredWidth) - padding, (measuredHeight + f5) - padding, (Paint) jd4Var.b);
        }
        boolean z3 = this.e0;
        ImageReceiver imageReceiver3 = this.d;
        if (z3 && this.r == z2) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.c0;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.c0.draw(canvas2);
            } else if (!this.d0 && imageReceiver2.n() != null) {
                this.d0 = z2;
                Bitmap n = imageReceiver2.n();
                boolean o = cmb.I.o();
                if (n == null) {
                    int[] iArr = {0, 0};
                    if (this.d0) {
                        this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.d0 = false;
                    }
                } else {
                    int[] b = lge.b(n, o);
                    if (this.d0) {
                        this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b);
                        invalidate();
                        this.d0 = false;
                    }
                }
            }
            imageReceiver2.i0((measuredWidth - height) / 2.0f, f5, height, getHeight());
        } else if (this.C0 > f5) {
            float L2 = gm.L(this.x0 ? 7.0f : 10.0f) * this.C0;
            float f20 = f6 + L2;
            float f21 = padding + L2;
            float f22 = L2 * 2.0f;
            float f23 = measuredWidth - f22;
            float f24 = measuredHeight - f22;
            imageReceiver2.i0(f20, f21, f23, f24);
            imageReceiver3.i0(f20, f21, f23, f24);
        } else {
            float f25 = (this.T <= 0.5f || this.U == 9.0f || this.r == 9) ? 0.0f : f4;
            float f26 = f6 + f25;
            float f27 = f25 + padding;
            imageReceiver2.i0(f26, f27, measuredWidth, measuredHeight);
            imageReceiver3.i0(f26, f27, measuredWidth, measuredHeight);
        }
        imageReceiver2.r0(gm.U1(this.C0, (this.W && this.b0) ? gm.L(18.0f) : gm.L(f4), gm.L(8.0f)), gm.U1(this.C0, (this.a0 && this.b0) ? gm.L(18.0f) : gm.L(f4), gm.L(8.0f)), gm.U1(this.C0, gm.L(f4), gm.L(8.0f)), gm.U1(this.C0, gm.L(f4), gm.L(8.0f)));
        if (this.x0) {
            canvas2.save();
            if (this.y0 || this.D0) {
                canvas2.translate(imageReceiver2.r(), imageReceiver2.s());
                cba cbaVar = this.e;
                if (cbaVar == null) {
                    cbaVar = new cba(this);
                    this.e = cbaVar;
                }
                cbaVar.a(canvas2, Math.max(this.C0, d));
                float f28 = f4 - (d * 0.075f);
                canvas2.scale(f28, f28);
                canvas2.translate(-imageReceiver2.r(), -imageReceiver2.s());
            }
        }
        if (PhotoViewer.P0(this.n)) {
            f7 = d;
            f8 = measuredWidth;
            imageReceiver = imageReceiver2;
            f9 = 0.075f;
            rectF2 = rectF;
            shaVar = this;
        } else {
            imageReceiver2.h(canvas2, null);
            k47 k47Var = this.n;
            if (k47Var == null || !k47Var.t2() || this.n.P0) {
                f7 = d;
                f8 = measuredWidth;
                imageReceiver = imageReceiver2;
                f9 = 0.075f;
                shaVar = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f6, 0.0f, (f6 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.j0 != 0.0f) {
                    Path path = this.h0;
                    path.rewind();
                    path.addCircle(this.k0, this.l0, this.m0 * this.j0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.h(canvas2, null);
                if (this.n0 != null) {
                    canvas2.clipRect(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), imageReceiver2.x());
                    f11 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f12 = d;
                    this.n0.c(canvas4, this, (int) imageReceiver2.N0, (int) imageReceiver2.O0, 1.0f, false);
                    canvas3 = canvas4;
                    shaVar = this;
                } else {
                    f11 = measuredWidth;
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    shaVar = this;
                    f12 = d;
                    rna rnaVar = shaVar.i0;
                    if (rnaVar == null) {
                        rnaVar = new rna();
                        shaVar.i0 = rnaVar;
                    }
                    rnaVar.h(on2.p(-1, 82));
                    shaVar.i0.setBounds((int) imageReceiver.L0, (int) imageReceiver.M0, (int) imageReceiver.w(), (int) imageReceiver.x());
                    shaVar.i0.draw(canvas3);
                }
                canvas3.restore();
                if (shaVar.n.o4()) {
                    uib uibVar = shaVar.p0;
                    if (uibVar == null) {
                        f9 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ".concat(jb6.M0(2131748242, null)));
                        i = 1;
                        spannableStringBuilder.setSpan(new pn2(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        uib uibVar2 = new uib(spannableStringBuilder, 14.0f, gm.n1("fonts/rmedium.ttf"));
                        shaVar.p0 = uibVar2;
                        uibVar = uibVar2;
                    } else {
                        f9 = 0.075f;
                        i = 1;
                    }
                    if (f11 >= (gm.L(13.0f) << i) + uibVar.c || (uibVar = shaVar.q0) != null) {
                        i2 = 1;
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ".concat(jb6.M0(2131748241, null)));
                        i2 = 1;
                        spannableStringBuilder2.setSpan(new pn2(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        uib uibVar3 = new uib(spannableStringBuilder2, 14.0f, gm.n1("fonts/rmedium.ttf"));
                        shaVar.q0 = uibVar3;
                        uibVar = uibVar3;
                    }
                    if (f11 < (gm.L(26.0f) << i2) + uibVar.c) {
                        uibVar = shaVar.r0;
                        if (uibVar == null) {
                            uib uibVar4 = new uib(new SpannableStringBuilder(jb6.M0(2131748241, null)), 13.0f, gm.n1("fonts/rmedium.ttf"));
                            shaVar.r0 = uibVar4;
                            uibVar = uibVar4;
                        }
                        i3 = 10;
                        i4 = 28;
                    } else {
                        i3 = 13;
                        i4 = 32;
                    }
                    float f29 = (imageReceiver.N0 / 2.0f) + imageReceiver.L0;
                    float f30 = (imageReceiver.O0 / 2.0f) + imageReceiver.M0;
                    float L3 = uibVar.c + gm.L(i3 << 1);
                    float L4 = gm.L(i4) / 2.0f;
                    uib uibVar5 = uibVar;
                    float R1 = gm.R1(0.8f, f4, f4 - shaVar.j0);
                    RectF rectF4 = gm.P;
                    float f31 = L3 / 2.0f;
                    float f32 = f31 * R1;
                    float f33 = L4 * R1;
                    f8 = f11;
                    f7 = f12;
                    rectF4.set(f29 - f32, f30 - f33, f32 + f29, f30 + f33);
                    Path path2 = shaVar.o0;
                    path2.reset();
                    path2.addRoundRect(rectF4, L4, L4, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - shaVar.j0) * alpha);
                    imageReceiver3.h(canvas3, null);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint T0 = cmb.T0("paintChatTimeBackground");
                    int alpha2 = T0.getAlpha();
                    T0.setAlpha((int) td4.z(1.0f, shaVar.j0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF4, L4, L4, T0);
                    T0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(R1, R1, f29, f30);
                    Canvas canvas5 = canvas3;
                    uibVar5.c(gm.L(i3) + (f29 - f31), f30, 1.0f - shaVar.j0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f7 = f12;
                    f8 = f11;
                    f9 = 0.075f;
                    canvas2 = canvas3;
                }
                shaVar.invalidate();
            }
            if (!shaVar.h) {
                float f34 = shaVar.V;
                if (f34 > 0.0f) {
                    ((Paint) jd4Var.e).setColor(on2.p(-16777216, (int) (f34 * 0.5f * 255.0f)));
                    rectF2 = rectF;
                    canvas2.drawRect(rectF2, (Paint) jd4Var.e);
                }
            }
            rectF2 = rectF;
        }
        if (shaVar.f0) {
            Paint paint = shaVar.t0;
            paint.setColor(805306368);
            canvas2.drawRect(rectF2, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = shaVar.u0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(gm.L(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float L5 = gm.L(18.0f);
            RectF rectF5 = gm.P;
            rectF5.set(imageReceiver.r() - L5, imageReceiver.s() - L5, imageReceiver.r() + L5, imageReceiver.s() + L5);
            float currentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            k47 k47Var2 = shaVar.n;
            canvas2.drawArc(rectF5, currentTimeMillis, shaVar.v0.e(false, gm.R1(0.15f, 0.95f, k47Var2 != null ? k47Var2.G1() : 0.0f)) * 360.0f, false, paint2);
            shaVar.invalidate();
        }
        float f35 = imageReceiver.L0;
        float f36 = imageReceiver.M0;
        float w = imageReceiver.w();
        float x = imageReceiver.x();
        RectF rectF6 = shaVar.z0;
        rectF6.set(f35, f36, w, x);
        if (shaVar.F && (drawable = cmb.k3) != null) {
            drawable.setBounds((int) (rectF6.left + gm.L(8.0f)), (int) (rectF6.top + gm.L(8.0f)), (int) ((cmb.k3.getIntrinsicWidth() * 0.75f) + rectF6.left + gm.L(8.0f)), (int) ((cmb.k3.getIntrinsicHeight() * 0.75f) + rectF6.top + gm.L(8.0f)));
            cmb.k3.draw(canvas2);
        }
        shaVar.c(canvas2, rectF6, f3);
        shaVar.f(canvas2, rectF6, f3);
        if (shaVar.h) {
            shaVar.b(canvas2, rectF6, f3);
        } else {
            shaVar.e(canvas2, rectF6, f3);
        }
        if (shaVar.x0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = shaVar.Q;
        if (checkBoxBase2 != null) {
            float f37 = shaVar.s0 != 1 ? 0.0f : 0.0f;
            canvas2.save();
            if (shaVar.x0 && (shaVar.y0 || shaVar.D0)) {
                canvas2.translate(imageReceiver.r(), imageReceiver.s());
                cba cbaVar2 = shaVar.e;
                if (cbaVar2 == null) {
                    cbaVar2 = new cba(shaVar);
                    shaVar.e = cbaVar2;
                }
                float f38 = f7;
                cbaVar2.a(canvas2, Math.max(shaVar.C0, f38) * 0.5f);
                float f39 = 1.0f - (f38 * f9);
                canvas2.scale(f39, f39);
                canvas2.translate(-imageReceiver.r(), -imageReceiver.s());
            }
            if (shaVar.s0 == 1) {
                L = ((f8 + gm.L(2.0f)) - gm.L(25.0f)) - gm.L(4.0f);
                f10 = gm.L(4.0f);
            } else if (shaVar.x0) {
                L = (f8 + gm.L(2.0f)) - gm.L((shaVar.C0 * 5.0f) + 22.0f);
                f10 = (gm.L(5.0f) * shaVar.C0) + gm.L(-2.0f);
            } else {
                L = (f8 + gm.L(2.0f)) - gm.L(25.0f);
                f10 = f37;
            }
            canvas2.translate(L, f10);
            shaVar.Q.a(canvas2);
            if (shaVar.w0 != null) {
                RectF rectF7 = gm.P;
                rectF7.set(L, f10, shaVar.Q.b.width() + L, shaVar.Q.b.height() + f10);
                zb1 zb1Var = shaVar.w0;
                zb1Var.i = false;
                zb1Var.c = 0;
                zb1Var.a(rectF7);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f) {
        Bitmap bitmap;
        if (!this.e0 || (bitmap = this.K) == null || bitmap.isRecycled()) {
            return;
        }
        int L = gm.L((rectF.width() / ((gm.L(20.0f) * this.C0) + rectF.width())) * 17.33f);
        canvas.save();
        float f2 = L;
        canvas.translate((rectF.right - f2) - gm.L(5.66f), rectF.top + gm.L(5.66f));
        Paint paint = this.L;
        if (paint == null) {
            paint = new Paint(3);
            this.L = paint;
        }
        paint.setAlpha((int) (f * 255.0f));
        RectF rectF2 = gm.P;
        rectF2.set(0.0f, 0.0f, f2, f2);
        canvas.drawBitmap(this.K, (Rect) null, rectF2, this.L);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f) {
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.r < 5) {
                float L = (gm.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L;
                boolean q = q(L);
                float d = this.N.d(this.M);
                float f2 = f * d;
                if (f2 < 1.0f) {
                    f2 = (float) Math.pow(f2, 8.0d);
                }
                if (d > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    canvas.scale(width, width, q ? 0.0f : rectF.width(), rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    float L2 = gm.L(26.0f);
                    ho hoVar = this.O;
                    float c = hoVar.c() + L2;
                    canvas.translate(q ? gm.L(5.0f) : (rectF.width() - gm.L(5.0f)) - c, ((rectF.height() + gm.L(1.0f)) - gm.L(17.0f)) - gm.L(4.0f));
                    RectF rectF2 = gm.P;
                    rectF2.set(0.0f, 0.0f, c, gm.L(17.0f));
                    int alpha = cmb.h2.getAlpha();
                    cmb.h2.setAlpha((int) (alpha * f2));
                    canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                    cmb.h2.setAlpha(alpha);
                    canvas.save();
                    float L3 = gm.L(3.0f);
                    int L4 = gm.L(17.0f);
                    jd4 jd4Var = this.R;
                    Drawable drawable = (Drawable) jd4Var.d;
                    Drawable drawable2 = (Drawable) jd4Var.d;
                    canvas.translate(L3, (L4 - drawable.getBounds().height()) / 2.0f);
                    drawable2.setAlpha((int) (this.x * 255.0f * f2));
                    drawable2.draw(canvas);
                    canvas.restore();
                    canvas.translate(gm.L(22.0f), 0.0f);
                    hoVar.setBounds(0, 0, (int) c, gm.L(17.0f));
                    hoVar.C = (int) (f2 * 255.0f);
                    hoVar.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(k47 k47Var) {
        TL_stories.StoryItem storyItem;
        if (this.g0) {
            return 100;
        }
        if (!this.e0 || k47Var == null || (storyItem = k47Var.l) == null) {
            return -1;
        }
        y7b y7bVar = storyItem.parsedPrivacy;
        if (y7bVar == null) {
            y7bVar = new y7b(this.f, storyItem.privacy);
            storyItem.parsedPrivacy = y7bVar;
        }
        int i = y7bVar.a;
        if (i == 2 || i == 1 || i == 3) {
            return i;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.w;
    }

    public int getMessageId() {
        k47 k47Var = this.n;
        if (k47Var != null) {
            return k47Var.e1();
        }
        return 0;
    }

    public k47 getMessageObject() {
        return this.n;
    }

    public int getStyle() {
        return this.s0;
    }

    public final void i(boolean z, boolean z2) {
        int i;
        CheckBoxBase checkBoxBase = this.Q;
        if ((checkBoxBase != null && checkBoxBase.q) == z) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, null, this);
            this.Q = checkBoxBase2;
            checkBoxBase2.h(-1, cmb.Bi, cmb.j7);
            if (this.x0 && (i = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.Q;
                int v = cmb.v(i, cmb.p1(0.25f, -1));
                if (checkBoxBase3.x != v) {
                    checkBoxBase3.x = v;
                    checkBoxBase3.b();
                }
            }
            this.Q.k(false);
            this.Q.d(1);
            this.Q.e(0, 0, gm.L(24.0f), gm.L(24.0f));
            if (this.S) {
                this.Q.l = true;
            }
        }
        this.Q.f(-1, z, z2);
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            this.B0 = null;
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, z ? 1.0f : 0.0f);
            this.B0 = ofFloat;
            ofFloat.addUpdateListener(new af0(this, (byte) 13));
            this.B0.setDuration(200L);
            this.B0.addListener(new sw9((byte) 4, this, z));
            this.B0.start();
        } else {
            this.C0 = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(boolean z, float f) {
        if (this.y != f) {
            this.y = f;
            if (z) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x045a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(k47 k47Var, int i, boolean z) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem;
        String str;
        boolean z2;
        float f;
        TLRPC.WebPage webPage;
        String str2;
        TL_stories.StoryViews storyViews;
        int i2 = i;
        if (i2 < 1) {
            i2 = 1;
        }
        int i3 = this.r;
        this.r = i2;
        k47 k47Var2 = this.n;
        if (k47Var2 == null) {
            if (k47Var == null) {
                return;
            }
        } else if (k47Var != null && k47Var2.e1() == k47Var.e1()) {
            k47 k47Var3 = this.n;
            if ((k47Var3 != null ? k47Var3.m : null) == k47Var.m) {
                if ((k47Var3 != null ? k47Var3.j : null) == k47Var.j) {
                    TLRPC.MessageMedia messageMedia = (k47Var3 == null || (storyItem = k47Var3.l) == null) ? null : storyItem.media;
                    TL_stories.StoryItem storyItem2 = k47Var.l;
                    TLRPC.MessageMedia messageMedia2 = storyItem2 == null ? null : storyItem2.media;
                    if (messageMedia != null ? !(messageMedia2 == null || ((document = messageMedia.document) == null ? (photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id : (document2 = messageMedia2.document) == null || document2.id != document.id)) : messageMedia2 == null) {
                        if (i3 == i2) {
                            int i4 = this.J;
                            if ((i4 == 100) == this.g0 && i4 == g(k47Var) && !z) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        this.n = k47Var;
        this.e0 = k47Var != null && k47Var.w4();
        k47 k47Var4 = this.n;
        this.f0 = (k47Var4 == null || k47Var4.m == null) ? false : true;
        p();
        ho hoVar = this.O;
        ln lnVar = this.N;
        ImageReceiver imageReceiver = this.b;
        ImageReceiver imageReceiver2 = this.c;
        ImageReceiver imageReceiver3 = this.d;
        if (k47Var == null) {
            imageReceiver2.K();
            imageReceiver.K();
            imageReceiver3.K();
            this.H = null;
            this.M = false;
            lnVar.e(true, 0.0f);
            hoVar.t("", false, true);
            this.G = null;
            this.E = false;
            this.F = false;
            this.d0 = false;
            this.c0 = null;
            this.J = -1;
            this.K = null;
            this.P = null;
            o();
            return;
        }
        TL_stories.StoryItem storyItem3 = k47Var.l;
        if (this.S) {
            imageReceiver2.I();
            imageReceiver.I();
            imageReceiver3.I();
        }
        ImageReceiver imageReceiver4 = z ? imageReceiver : imageReceiver2;
        int i5 = this.f;
        String D1 = oc7.r1(i5).D1(k47Var.k.restriction_reason);
        int i6 = gm.q.x;
        float f2 = gm.p;
        int i7 = (int) ((i6 / i2) / f2);
        if (z) {
            i7 = (((int) (i6 / f2)) * 3) / 5;
        }
        SparseArray sparseArray = (SparseArray) this.R.f;
        String str3 = (String) sparseArray.get(i7);
        if (str3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i7);
            str = D1;
            sb.append("_");
            sb.append(i7);
            sb.append("_isc");
            String sb2 = sb.toString();
            sparseArray.put(i7, sb2);
            str3 = sb2;
        } else {
            str = D1;
        }
        int Y0 = (i2 <= 2 || z) ? gm.Y0(false) : nm7.q5;
        this.H = null;
        this.G = null;
        this.E = false;
        this.F = false;
        imageReceiver2.e();
        imageReceiver.e();
        if (!this.e0 || (storyViews = storyItem3.views) == null) {
            z2 = true;
            this.M = false;
            f = 0.0f;
            lnVar.e(true, 0.0f);
            hoVar.t("", false, true);
        } else {
            int i8 = storyViews.views_count;
            this.M = i8 > 0;
            z2 = true;
            hoVar.t(gm.o0(i8, 0), false, true);
            f = 0.0f;
        }
        lnVar.e(z2, this.M ? 1.0f : f);
        k47 k47Var5 = k47Var.j != null ? storyItem3 : k47Var;
        if (TextUtils.isEmpty(str)) {
            if (storyItem3 == 0 || !(storyItem3.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                g4b g4bVar = k47Var.m;
                if (g4bVar == null || (str2 = g4bVar.f) == null) {
                    String str4 = str3;
                    TLRPC.Document F02 = k47Var.F0();
                    TLRPC.Photo C1 = k47.C1(k47Var.k);
                    if (k47.J4(F02)) {
                        this.E = !k47Var.D3();
                        this.F = k47Var.D3();
                        if (i2 != 9 && !k47Var.D3()) {
                            this.H = gm.g0((int) k47Var.L0(), false, false);
                        }
                        TLRPC.MessageMedia m1 = k47.m1(k47Var);
                        if ((m1 instanceof TLRPC.TL_messageMediaDocument ? ((TLRPC.TL_messageMediaDocument) m1).video_cover : (m1 == null || (webPage = m1.webpage) == null || !webPage.video_cover_photo) ? null : webPage.photo) != null) {
                            TLRPC.PhotoSize w = bc4.w(k47Var.p0, 50, false, null, false);
                            TLRPC.PhotoSize w2 = bc4.w(k47Var.p0, Y0, false, w, this.e0);
                            if (w2 == w) {
                                w = null;
                            }
                            BitmapDrawable bitmapDrawable = k47Var.I1;
                            TLObject tLObject = k47Var.n0;
                            if (bitmapDrawable != null) {
                                imageReceiver4.Z(gn5.f(w2, tLObject), str4, null, null, k47Var.I1, w2 != null ? w2.size : 0L, null, k47Var5, k47.Q5(k47Var.k) ? 2 : 1);
                            } else {
                                imageReceiver4.Z(gn5.f(w2, tLObject), str4, gn5.f(w, k47Var.n0), str4.concat("_b"), null, w2 != null ? w2.size : 0L, null, k47Var5, k47.Q5(k47Var.k) ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document F03 = k47Var.F0();
                            TLRPC.PhotoSize w3 = bc4.w(F03.thumbs, 50, false, null, false);
                            TLRPC.PhotoSize w4 = bc4.w(F03.thumbs, Y0, false, null, this.e0);
                            if (w3 == w4 && !this.e0) {
                                w4 = null;
                            }
                            if (w3 != null) {
                                if (k47Var.I1 != null) {
                                    imageReceiver4.d0(gn5.c(w4, F03), str4, k47Var.I1, null, k47Var5, 0);
                                } else {
                                    imageReceiver4.Z(gn5.c(w4, F03), str4, gn5.c(w3, F03), str4.concat("_b"), null, 0L, null, k47Var5, 0);
                                }
                            }
                        }
                    } else if (C1 != null && !k47Var.p0.isEmpty()) {
                        if (!k47Var.z0) {
                            if (System.currentTimeMillis() - F0 > 5000) {
                                F0 = System.currentTimeMillis();
                                G0 = er3.q(i5).d(k47Var);
                            }
                            if (!G0 && !this.e0) {
                                BitmapDrawable bitmapDrawable2 = k47Var.I1;
                                if (bitmapDrawable2 != null) {
                                    imageReceiver4.Z(null, null, null, null, bitmapDrawable2, 0L, null, k47Var5, 0);
                                } else {
                                    imageReceiver4.Z(null, null, gn5.f(bc4.w(k47Var.p0, 50, false, null, false), k47Var.n0), "b", null, 0L, null, k47Var5, 0);
                                }
                            }
                        }
                        TLRPC.PhotoSize w5 = bc4.w(k47Var.p0, 50, false, null, false);
                        TLRPC.PhotoSize w6 = bc4.w(k47Var.p0, Y0, false, w5, this.e0);
                        if (w6 == w5) {
                            w5 = null;
                        }
                        BitmapDrawable bitmapDrawable3 = k47Var.I1;
                        TLObject tLObject2 = k47Var.n0;
                        if (bitmapDrawable3 != null) {
                            imageReceiver4.Z(gn5.f(w6, tLObject2), str4, null, null, k47Var.I1, w6 != null ? w6.size : 0L, null, k47Var5, k47.Q5(k47Var.k) ? 2 : 1);
                        } else {
                            imageReceiver4.Z(gn5.f(w6, tLObject2), str4, z ? null : gn5.f(w5, k47Var.n0), str4.concat("_b"), null, w6 != null ? w6.size : 0L, null, k47Var5, k47.Q5(k47Var.k) ? 2 : 1);
                        }
                    }
                } else {
                    imageReceiver4.d0(gn5.g(str2), str3, null, null, k47Var5, 0);
                }
            } else {
                storyItem3.dialogId = k47.B0(k47Var.k);
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.g0(new sn2(new ColorDrawable(-13421773), mutate));
            }
            if (imageReceiver3.n() != null) {
                imageReceiver3.n().recycle();
                imageReceiver3.g0(null);
            }
            if (imageReceiver4.n() != null && this.n.t2() && !this.n.O0) {
                imageReceiver3.f0(Utilities.D(imageReceiver4.n(), false));
            }
            if (storyItem3 != 0) {
                imageReceiver4.a(new tab(storyItem3));
            }
            setPrivacyType(g(k47Var));
            if (this.h) {
                long B0 = k47.B0(k47Var.k);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                spannableStringBuilder.append((CharSequence) oc7.r1(i5).z1(B0, false));
                ed0 ed0Var = new ed0(i2 == 2 ? 16.0f : 13.66f, i5, this);
                ed0Var.c(B0);
                spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
                this.P = new uib(spannableStringBuilder, i2 == 2 ? 14.0f : 10.1666f, gm.o());
            }
            o();
            invalidate();
        }
        imageReceiver4.g0(getContext().getDrawable(R.drawable.photo_placeholder_in));
        if (imageReceiver3.n() != null) {
        }
        if (imageReceiver4.n() != null) {
            imageReceiver3.f0(Utilities.D(imageReceiver4.n(), false));
        }
        if (storyItem3 != 0) {
        }
        setPrivacyType(g(k47Var));
        if (this.h) {
        }
        o();
        invalidate();
    }

    public final void l(boolean z, boolean z2) {
        if (this.D0 == z) {
            return;
        }
        this.D0 = z;
        if (!z2) {
            this.E0.a(z);
        }
        invalidate();
    }

    public final void m(String str, boolean z) {
        this.H = str;
        this.E = true;
        this.F = false;
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.G = null;
        }
        this.I = z;
    }

    public final void n(float f, float f2) {
        this.k0 = f;
        this.l0 = f2;
        this.m0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) pqe.a(this.m0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(d53.j);
        duration.addUpdateListener(new rha(this, (byte) 0));
        duration.addListener(new c39((Object) this, (byte) 18));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: Exception -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00dc, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000a, B:10:0x0017, B:12:0x001b, B:13:0x0025, B:15:0x002c, B:17:0x0080, B:20:0x0088, B:21:0x008b, B:23:0x0090, B:26:0x009e, B:28:0x00a2, B:30:0x00a6, B:31:0x00b8, B:33:0x00bc, B:34:0x00d4, B:36:0x0034, B:38:0x003a, B:39:0x007c, B:40:0x0046, B:42:0x004e, B:44:0x0056, B:46:0x005a, B:48:0x005e, B:50:0x0068, B:52:0x0071), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000a, B:10:0x0017, B:12:0x001b, B:13:0x0025, B:15:0x002c, B:17:0x0080, B:20:0x0088, B:21:0x008b, B:23:0x0090, B:26:0x009e, B:28:0x00a2, B:30:0x00a6, B:31:0x00b8, B:33:0x00bc, B:34:0x00d4, B:36:0x0034, B:38:0x003a, B:39:0x007c, B:40:0x0046, B:42:0x004e, B:44:0x0056, B:46:0x005a, B:48:0x005e, B:50:0x0068, B:52:0x0071), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000a, B:10:0x0017, B:12:0x001b, B:13:0x0025, B:15:0x002c, B:17:0x0080, B:20:0x0088, B:21:0x008b, B:23:0x0090, B:26:0x009e, B:28:0x00a2, B:30:0x00a6, B:31:0x00b8, B:33:0x00bc, B:34:0x00d4, B:36:0x0034, B:38:0x003a, B:39:0x007c, B:40:0x0046, B:42:0x004e, B:44:0x0056, B:46:0x005a, B:48:0x005e, B:50:0x0068, B:52:0x0071), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        String M0;
        double L0;
        String M02;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        int i;
        TL_stories.StoryViews storyViews;
        try {
            k47 k47Var = this.n;
            if (k47Var == null) {
                setContentDescription(null);
                return;
            }
            TL_stories.StoryItem storyItem2 = k47Var.l;
            boolean w4 = k47Var.w4();
            StringBuilder sb = new StringBuilder();
            if (w4 && this.g0) {
                sb.append(jb6.M0(2131754752, null));
            }
            if (!k47Var.D3()) {
                if (k47Var.g4()) {
                    M0 = jb6.M0(2131754781, null);
                    L0 = k47Var.L0();
                } else {
                    if (!k47.K4(k47Var.k)) {
                        TLRPC.MessageMedia n1 = k47.n1(k47Var.k);
                        if (!((n1 == null || (storyItem = n1.storyItem) == null || (messageMedia = storyItem.media) == null) ? false : k47.J4(messageMedia.document))) {
                            M02 = jb6.M0(2131753913, null);
                        }
                    }
                    M0 = jb6.M0(2131753898, null);
                    L0 = k47Var.L0();
                }
                String str = M0;
                i = (int) L0;
                M02 = str;
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(M02);
                if (i > 0) {
                    sb.append(", ");
                    sb.append(jb6.z(i));
                }
                if (w4 && storyItem2 != null) {
                    storyViews = storyItem2.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb.append(", ");
                        sb.append(jb6.G(storyItem2.views.views_count, "Views", new Object[0]));
                    }
                    if (storyItem2.date > 0) {
                        sb.append(", ");
                        sb.append(jb6.a0(null, null, 2131754802, jb6.s(storyItem2.date, false)));
                    }
                }
                setContentDescription(sb.toString());
            }
            M02 = jb6.M0(2131754847, null);
            i = 0;
            if (sb.length() > 0) {
            }
            sb.append(M02);
            if (i > 0) {
            }
            if (w4) {
                storyViews = storyItem2.views;
                if (storyViews != null) {
                    sb.append(", ");
                    sb.append(jb6.G(storyItem2.views.views_count, "Views", new Object[0]));
                }
                if (storyItem2.date > 0) {
                }
            }
            setContentDescription(sb.toString());
        } catch (Exception e) {
            fc4.g(e, true);
            try {
                setContentDescription(null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        if (this.n != null) {
            this.c.I();
            this.b.I();
            this.d.I();
        }
        qna qnaVar = this.n0;
        if (qnaVar != null) {
            if (qnaVar.i) {
                this.n0 = qna.e(this);
            } else {
                qnaVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        if (this.n != null) {
            this.c.K();
            this.b.K();
            this.d.K();
        }
        qna qnaVar = this.n0;
        if (qnaVar != null) {
            qnaVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(1.0f, 1.0f, 1.0f, canvas, false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            if (this.n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.e0;
        int i3 = z ? (int) (size * 1.25f) : size;
        if (z && this.r == 1) {
            i3 /= 2;
        }
        setMeasuredDimension(size, i3);
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zb1 zb1Var = this.w0;
        if (zb1Var == null || !zb1Var.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        k47 k47Var = this.n;
        if (k47Var != null && k47Var.t2()) {
            if (this.n0 == null) {
                this.n0 = qna.e(this);
            }
        } else {
            qna qnaVar = this.n0;
            if (qnaVar != null) {
                qnaVar.b(this);
                this.n0 = null;
            }
        }
    }

    public final boolean q(float f) {
        int i;
        if (this.e0 && this.r < 5) {
            int L = gm.L(26.0f) + ((int) this.O.c());
            if (this.E) {
                int L2 = gm.L(8.0f);
                StaticLayout staticLayout = this.G;
                i = L2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.I ? gm.L(10.0f) : 0);
            } else {
                i = 0;
            }
            if (L + ((L <= 0 || i <= 0) ? 0 : gm.L(8.0f)) + i > f) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(tk4 tk4Var) {
        this.s = tk4Var;
    }

    public void setHighlightProgress(float f) {
        if (this.V != f) {
            this.V = f;
            invalidate();
        }
    }

    public void setReorder(boolean z) {
        this.y0 = z;
        invalidate();
    }

    public void setStyle(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            if (i == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, null, this);
                this.Q = checkBoxBase;
                checkBoxBase.h(-1, cmb.Bi, cmb.j7);
                this.Q.k(true);
                this.Q.d(0);
                this.Q.e(0, 0, gm.L(24.0f), gm.L(24.0f));
                if (this.S) {
                    this.Q.l = true;
                }
                zb1 zb1Var = new zb1(this);
                this.w0 = zb1Var;
                zb1Var.h = new c0a(this, (byte) 18);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
