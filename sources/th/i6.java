package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i6 extends View implements s9 {
    public final boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ j6 J;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final h6[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(j6 j6Var, Context context) {
        super(context);
        this.J = j6Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new h6[]{new h6(this), null};
        this.s = 0;
        new Path();
        this.D = true;
        this.H = false;
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(i6 i6Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
        if (cd.X) {
            alignment = ov0.a();
        } else {
            Layout.Alignment[] alignmentArr = ov0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, e6 e6Var, e6 e6Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        h6[] h6VarArr = this.r;
        CharSequence charSequence2 = h6VarArr[0].n;
        Pattern pattern = ui.R1;
        if ((charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) ? false : ui.K(ui.b0(d20.s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ui.b0(d20.s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true))) {
            h6 h6Var = h6VarArr[0];
            if (h6Var.o == e6Var && h6Var.p == e6Var2) {
                h6Var.q = z10;
                invalidate();
                return;
            }
        }
        this.y = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (!z11) {
            h6VarArr[0].g(charSequence, e6Var, e6Var2);
            h6VarArr[0].q = z10;
            invalidate();
            this.G = 0.0f;
            return;
        }
        if (h6VarArr[1] == null) {
            h6VarArr[1] = new h6(this);
        }
        h6 h6Var2 = h6VarArr[1];
        h6 h6Var3 = h6VarArr[0];
        h6Var2.g(h6Var3.n, h6Var3.o, h6Var3.p);
        h6 h6Var4 = h6VarArr[1];
        h6 h6Var5 = h6VarArr[0];
        h6Var4.q = h6Var5.q;
        h6Var4.r.e(true, h6Var5.r.c);
        h6VarArr[0].g(charSequence, e6Var, e6Var2);
        h6 h6Var6 = h6VarArr[0];
        h6Var6.q = z10;
        h6Var6.r.e(true, 0.0f);
        this.G = 1.0f;
        ValueAnimator valueAnimator2 = this.I;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 22));
        this.I.addListener(new sg.r(this, 12));
        this.I.setDuration(180L);
        this.I.setInterpolator(gr.g);
        this.I.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r8v14, types: [th.e6] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h6[] h6VarArr;
        h6 h6Var;
        ?? r13;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        Layout staticTextLayout;
        h6 h6Var2;
        h6 h6Var3;
        boolean contains;
        ?? r132;
        e6 e6Var;
        boolean z14;
        j6 j6Var = this.J;
        t9 t9Var = j6Var.W;
        if (motionEvent.getAction() == 0) {
            j6Var.g0 = motionEvent.getX();
            j6Var.h0 = motionEvent.getY();
        }
        j6Var.i0 = motionEvent.getX();
        j6Var.j0 = motionEvent.getY();
        if (this.w != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            float f7 = this.n;
            rectF.set(f7, this.h, r4.getWidth() + f7, this.h + this.w.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = false;
                h6VarArr = this.r;
                h6Var = h6VarArr[0];
                if (h6Var != null || (e6Var = h6Var.o) == null) {
                    r13 = 0;
                    z11 = false;
                    i10 = 0;
                } else {
                    i10 = org.telegram.messenger.i0.L(8.0f) + e6Var.b();
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    int i11 = this.E;
                    int i12 = this.F;
                    e6 e6Var2 = h6VarArr[0].o;
                    rectF2.set(i11, i12, i11 + e6Var2.x, e6Var2.b() + i12);
                    z11 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z11) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() == 0 && z11) {
                        h6VarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                        r13 = 0;
                    } else if (motionEvent.getAction() == 2) {
                        e6 e6Var3 = h6VarArr[0].o;
                        if (e6Var3.i.i && !z11) {
                            r13 = 0;
                            e6Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                        r13 = 0;
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1 && z11) {
                                z14 = false;
                                z14 = false;
                                e6 e6Var4 = h6VarArr[0].o;
                                if (e6Var4.i.i) {
                                    j6Var.I(e6Var4);
                                }
                            } else {
                                z14 = false;
                            }
                            h6VarArr[z14 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z14);
                            r13 = z14;
                        }
                        r13 = 0;
                    }
                }
                if (!z11 && (h6Var3 = h6VarArr[r13]) != null && h6Var3.p != null) {
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    float f10 = this.E;
                    float W1 = (org.telegram.messenger.i0.W1(this.x, h6Var3.m, h6Var3.l) + this.F) - h6VarArr[0].p.b();
                    int i13 = this.E;
                    h6 h6Var4 = h6VarArr[0];
                    rectF3.set(f10, W1, i13 + h6Var4.p.x, org.telegram.messenger.i0.W1(this.x, h6Var4.m, h6Var4.l) + this.F);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        h6VarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        e6 e6Var5 = h6VarArr[0].p;
                        if (e6Var5.i.i && !contains) {
                            e6Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            e6 e6Var6 = h6VarArr[0].p;
                            if (e6Var6.i.i) {
                                j6Var.I(e6Var6);
                            }
                        } else {
                            r132 = 0;
                        }
                        h6VarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z10 && (j6Var.v0 || (h6Var2 = h6VarArr[0]) == null || h6Var2.g == null)) {
                    float f11 = this.E;
                    float f12 = this.F + i10;
                    Rect rect = t9Var.B;
                    s9 s9Var = t9Var.p0;
                    staticTextLayout = s9Var.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        t9Var.X = null;
                    } else {
                        t9Var.X = s9Var;
                        int i14 = (int) f11;
                        t9Var.c = i14;
                        int i15 = (int) f12;
                        t9Var.d = i15;
                        ge.b bVar = t9Var.a0;
                        bVar.d = staticTextLayout;
                        bVar.c = f11;
                        bVar.b = f12;
                        bVar.a = 0;
                        rect.set(i14, i15, (int) (f11 + staticTextLayout.getWidth()), (int) (f12 + staticTextLayout.getHeight()));
                    }
                    t9Var.M(motionEvent);
                }
                if (t9Var.x() && z10 && this.D) {
                    z13 = false;
                    if (((GestureDetector) ((m2.t) h6VarArr[0].k.d).b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        t9Var.f(false);
                        return true;
                    }
                    z12 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                return (super.dispatchTouchEvent(motionEvent) || z11) ? z12 : z13;
            }
        }
        z10 = true;
        h6VarArr = this.r;
        h6Var = h6VarArr[0];
        if (h6Var != null) {
        }
        r13 = 0;
        z11 = false;
        i10 = 0;
        if (!z11) {
            RectF rectF32 = org.telegram.messenger.i0.P;
            float f102 = this.E;
            float W12 = (org.telegram.messenger.i0.W1(this.x, h6Var3.m, h6Var3.l) + this.F) - h6VarArr[0].p.b();
            int i132 = this.E;
            h6 h6Var42 = h6VarArr[0];
            rectF32.set(f102, W12, i132 + h6Var42.p.x, org.telegram.messenger.i0.W1(this.x, h6Var42.m, h6Var42.l) + this.F);
            contains = rectF32.contains(motionEvent.getX(), motionEvent.getY());
            if (contains) {
            }
            if (motionEvent.getAction() != 0) {
            }
            if (motionEvent.getAction() != 2) {
            }
            if (contains) {
            }
        }
        if (z10) {
            float f112 = this.E;
            float f122 = this.F + i10;
            Rect rect2 = t9Var.B;
            s9 s9Var2 = t9Var.p0;
            staticTextLayout = s9Var2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            t9Var.M(motionEvent);
        }
        if (t9Var.x()) {
        }
        z12 = true;
        z13 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z12;
        }
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        h6[] h6VarArr = this.r;
        int i11 = h6VarArr[0].l;
        return org.telegram.messenger.i0.W1(this.G, i11, h6VarArr[1] != null ? r1.l : 0) + i10;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.s9
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // org.telegram.ui.Cells.s9
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        h6 h6Var = this.r[0];
        i6 i6Var = h6Var.v;
        org.telegram.ui.Components.o5.release(i6Var, h6Var.d);
        org.telegram.ui.Components.o5.release(i6Var, h6Var.f);
        if (h6Var.h == null) {
            return;
        }
        while (true) {
            f6[] f6VarArr = h6Var.h;
            if (i10 >= f6VarArr.length) {
                return;
            }
            f6 f6Var = f6VarArr[i10];
            if (f6Var != null) {
                org.telegram.ui.Components.o5.release(i6Var, f6Var.a);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zs.e4, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        h6[] h6VarArr = this.r;
        h6VarArr[0].b(canvas2, 1.0f - this.G);
        h6 h6Var = h6VarArr[1];
        if (h6Var != null) {
            h6Var.b(canvas2, this.G);
        }
        if (this.w != null) {
            float scrollY = this.h + this.J.getScrollY();
            int i10 = (int) ((1.0f - Utilities.i(this.x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(i10);
            Paint paint2 = this.e;
            paint2.setAlpha(i10);
            this.d.setAlpha(i10);
            canvas2.save();
            canvas2.translate(this.n - org.telegram.messenger.i0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(32.0f), this.w.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - org.telegram.messenger.i0.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.n, scrollY);
            this.w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.E = org.telegram.messenger.i0.L(16.0f);
        this.F = org.telegram.messenger.i0.L(8.0f);
        int i13 = this.s;
        h6[] h6VarArr = this.r;
        if (i13 != i12) {
            this.s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            h6VarArr[0].e(max);
            h6 h6Var = h6VarArr[1];
            if (h6Var != null) {
                h6Var.e(max);
            }
        }
        int i14 = this.F * 2;
        int i15 = h6VarArr[0].l;
        h6 h6Var2 = h6VarArr[1];
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.W1(this.G, i15, h6Var2 != null ? h6Var2.l : 0) + i14, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r9.contains(r20.getX(), r20.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r1.a != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r1.b == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r20.getAction() != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r3 = r4.r;
        r3[0].c.f(true);
        r3[0].a = null;
        r4.invalidate();
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01bf, code lost:
    
        if (r4 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01c5, code lost:
    
        if (super.onTouchEvent(r20) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r20.getAction() != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r5 = r1.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r5 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r5 = r1.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r5 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        r5 = (int) (r20.getX() - r4.E);
        r9 = (int) ((r20.getY() - r4.F) - (r10 + r9));
        r10 = r1.e.getLineForVertical(r9);
        r5 = r5;
        r11 = r1.e.getOffsetForHorizontal(r10, r5);
        r12 = r1.e.getLineLeft(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r12 > r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if ((r1.e.getLineWidth(r10) + r12) < r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r9 < 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r9 > r1.e.getHeight()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        r5 = new android.text.SpannableString(r1.n);
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, android.text.style.ClickableSpan.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r9 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        if (r9.length != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        if (r9 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
    
        if (r9.length == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        r10 = r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        if (r20.getAction() != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        r3.f(true);
        r1.b = null;
        r13 = new org.telegram.ui.Components.q80(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(org.telegram.ui.ActionBar.t6.r1(0.2f, -1));
        r3.b(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.W.f(false);
        r4.postDelayed(new th.o0(22, r1, r9), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r1.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        r5 = (org.telegram.ui.Components.o5[]) r5.getSpans(r11, r11, org.telegram.ui.Components.o5.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0184, code lost:
    
        if (r5.length == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
    
        r9 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018c, code lost:
    
        if (r20.getAction() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018e, code lost:
    
        r1.a = null;
        r1.b = r5[0];
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019f, code lost:
    
        if (r20.getAction() != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r3.f(true);
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a6, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a8, code lost:
    
        r3 = r3.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01aa, code lost:
    
        if (r3 != r10) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ac, code lost:
    
        r6.G(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b9, code lost:
    
        r1.a = null;
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b0, code lost:
    
        r3 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b2, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b4, code lost:
    
        if (r3 != r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b6, code lost:
    
        r6.F(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0171, code lost:
    
        r4 = false;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, org.telegram.ui.Components.d51.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r4 = false;
        r9 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0096, code lost:
    
        r9 = org.telegram.messenger.i0.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0087, code lost:
    
        r10 = org.telegram.messenger.i0.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004f, code lost:
    
        if (r20.getAction() != 0) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h6[] h6VarArr;
        if (!this.J.s0 && (h6VarArr = this.r) != null) {
            h6 h6Var = h6VarArr[0];
            if (h6Var.e != null) {
                ji.a aVar = h6Var.c;
                i6 i6Var = h6Var.v;
                StaticLayout staticLayout = i6Var.w;
                j6 j6Var = i6Var.J;
                if (staticLayout != null) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f7 = i6Var.n;
                    rectF.set(f7, i6Var.h, staticLayout.getWidth() + f7, i6Var.h + i6Var.w.getHeight());
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        boolean z11 = z10 != isPressed();
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.J.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        h6 h6Var;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        e6 e6Var4;
        h6[] h6VarArr = this.r;
        h6 h6Var2 = h6VarArr[0];
        if ((h6Var2 == null || (h6Var2.s != drawable && (((e6Var3 = h6Var2.o) == null || e6Var3.j != drawable) && ((e6Var4 = h6Var2.p) == null || e6Var4.j != drawable)))) && ((h6Var = h6VarArr[1]) == null || (h6Var.s != drawable && (((e6Var = h6Var.o) == null || e6Var.j != drawable) && ((e6Var2 = h6Var.p) == null || e6Var2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
