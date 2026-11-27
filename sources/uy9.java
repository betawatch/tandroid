// default package

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class uy9 extends FrameLayout implements snb {
    public static float[] l0;
    public static Path m0;
    public boolean E;
    public float F;
    public final hf0 G;
    public float H;
    public final int[] I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final vnb O;
    public final a20 P;
    public boolean Q;
    public float R;
    public float S;
    public int T;
    public ArrayList U;
    public CharSequence V;
    public long W;
    public int a;
    public float a0;
    public final v7 b;
    public int b0;
    public final Paint c;
    public StaticLayout[] c0;
    public final Paint d;
    public TextPaint d0;
    public final int e;
    public float e0;
    public final int f;
    public int f0;
    public long g0;
    public int h;
    public float h0;
    public final RectF i0;
    public int j0;
    public int k0;
    public final mm n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public ty9 y;

    public uy9(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.n = new mm(this, 0L, 60L, k43.g);
        this.s = -100.0f;
        this.w = -1.0f;
        this.I = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.J = 1.0f;
        this.M = 3;
        this.a0 = 0.0f;
        this.b0 = -1;
        this.e0 = 1.0f;
        this.h0 = -1.0f;
        this.i0 = new RectF();
        this.j0 = -1;
        this.O = vnbVar;
        setWillNotDraw(false);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i = aob.Mj;
        int v0 = aob.v0(i, vnbVar);
        this.a = v0;
        paint.setColor(v0);
        this.f = hl.L(32.0f);
        this.e = hl.L(24.0f);
        this.H = hl.L(6.0f);
        hf0 f0 = aob.f0(vm2.o(aob.v0(i, vnbVar), 40), 1, hl.L(16.0f));
        this.G = f0;
        f0.setCallback(this);
        f0.setVisible(true, false);
        a20 a20Var = new a20(this, context, context, (byte) 2);
        this.P = a20Var;
        a20Var.y = true;
        addView(a20Var, tre.c(-2.0f, -1));
        setImportantForAccessibility(1);
        v7 v7Var = new v7(this, z);
        this.b = v7Var;
        setAccessibilityDelegate(v7Var);
    }

    private int getTimestampLabelWidth() {
        int i = this.f;
        return (int) (Math.abs(((i / 2.0f) + (this.W > 600000 ? hl.L(42.0f) : 0)) - ((getMeasuredWidth() - (i / 2.0f)) - (this.W > 600000 ? hl.L(42.0f) : 0))) - hl.L(66.0f));
    }

    private void setTimestampIndex(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            if (i < 0 || i >= this.U.size()) {
                return;
            }
            this.P.setText((CharSequence) ((Pair) this.U.get(this.j0)).second);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        int i;
        char c;
        float floatValue;
        ?? r17;
        float f;
        float L = hl.L(2.0f);
        ArrayList arrayList = this.U;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, L, L, paint);
            return;
        }
        float f2 = rectF.bottom;
        int i2 = this.f;
        float f3 = i2 / 2.0f;
        float measuredWidth = getMeasuredWidth() - (i2 / 2.0f);
        hl.P.set(rectF);
        float L2 = hl.L(this.a0 * 1.0f) / 2.0f;
        Path path = m0;
        if (path == null) {
            path = new Path();
            m0 = path;
        }
        path.reset();
        float L3 = hl.L(4.0f) / (measuredWidth - f3);
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.U.size()) {
                i3 = -1;
                break;
            } else if (((Float) ((Pair) this.U.get(i3)).first).floatValue() >= L3) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            i3 = 0;
        }
        boolean z = true;
        int size = this.U.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) this.U.get(size)).first).floatValue() >= L3) {
                i = size + 1;
                break;
            }
            size--;
        }
        if (i < 0) {
            i = this.U.size();
        }
        int i4 = i3;
        while (i4 <= i) {
            if (i4 == i3) {
                floatValue = 0.0f;
                c = 0;
            } else {
                c = 0;
                floatValue = ((Float) ((Pair) this.U.get(i4 - 1)).first).floatValue();
            }
            float floatValue2 = i4 == i ? 1.0f : ((Float) ((Pair) this.U.get(i4)).first).floatValue();
            while (i4 != i && i4 != 0) {
                r17 = z;
                if (i4 >= this.U.size() - 1 || ((Float) ((Pair) this.U.get(i4)).first).floatValue() - floatValue > L3) {
                    break;
                }
                i4++;
                floatValue2 = ((Float) ((Pair) this.U.get(i4)).first).floatValue();
                z = r17 == true ? 1 : 0;
            }
            r17 = z;
            RectF rectF2 = hl.P;
            rectF2.left = hl.R1(f3, measuredWidth, floatValue) + (i4 > 0 ? L2 : 0.0f);
            float R1 = hl.R1(f3, measuredWidth, floatValue2) - (i4 < i ? L2 : 0.0f);
            rectF2.right = R1;
            float f4 = rectF.right;
            char c2 = R1 > f4 ? r17 : c;
            if (c2 != 0) {
                rectF2.right = f4;
                R1 = f4;
            }
            float f5 = rectF.left;
            if (R1 >= f5) {
                float f6 = rectF2.left;
                if (f6 < f5) {
                    rectF2.left = f5;
                } else {
                    f5 = f6;
                }
                float[] fArr = l0;
                if (fArr == null) {
                    fArr = new float[8];
                    l0 = fArr;
                }
                f = L3;
                if (i4 == i3 || (c2 != 0 && f5 >= rectF.left)) {
                    fArr[7] = L;
                    fArr[6] = L;
                    fArr[r17] = L;
                    fArr[c] = L;
                    float f7 = 0.7f * L * this.a0;
                    fArr[5] = f7;
                    fArr[4] = f7;
                    fArr[3] = f7;
                    fArr[2] = f7;
                } else {
                    float f8 = 0.7f * L * this.a0;
                    if (i4 >= i) {
                        fArr[7] = f8;
                        fArr[6] = f8;
                        fArr[r17] = f8;
                        fArr[c] = f8;
                        fArr[5] = L;
                        fArr[4] = L;
                        fArr[3] = L;
                        fArr[2] = L;
                    } else {
                        fArr[5] = f8;
                        fArr[4] = f8;
                        fArr[3] = f8;
                        fArr[2] = f8;
                        fArr[7] = f8;
                        fArr[6] = f8;
                        fArr[r17] = f8;
                        fArr[c] = f8;
                    }
                }
                m0.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (c2 != 0) {
                    break;
                }
            } else {
                f = L3;
            }
            i4++;
            z = r17;
            L3 = f;
        }
        canvas.drawPath(m0, paint);
    }

    public final StaticLayout b(int i, CharSequence charSequence) {
        if (this.d0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.d0 = textPaint;
            textPaint.setTextSize(hl.L(12.0f));
        }
        this.d0.setColor(aob.v0(aob.Jj, this.O));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.d0, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(hl.L(400.0f), i)).build();
    }

    public final int c() {
        return Math.max((int) (this.w * (getMeasuredWidth() - this.f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        hf0 hf0Var = this.G;
        int i = this.e;
        int i2 = this.f;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.Q = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.S) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i) / 2;
                    if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i + measuredHeight) {
                        int x = ((int) motionEvent.getX()) - (i / 2);
                        this.h = x;
                        if (x < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i2) {
                            this.h = getMeasuredWidth() - i2;
                        }
                    }
                    this.r = (int) (motionEvent.getX() - this.h);
                    this.x = true;
                }
            }
            if (this.x) {
                if (motionEvent.getAction() == 1) {
                    if (this.N) {
                        float measuredWidth = (getMeasuredWidth() - i2) / 2;
                        float f = this.h;
                        if (f >= measuredWidth) {
                            f(false, (f - measuredWidth) / measuredWidth);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth - f) / measuredWidth)));
                        }
                    } else {
                        f(true, this.h / (getMeasuredWidth() - i2));
                    }
                }
                if (hf0Var != null) {
                    hf0Var.setState(StateSet.NOTHING);
                }
                this.y.x();
                this.x = false;
                hl.d3(new pg6((Object) this, (byte) 23), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.Q) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.S) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.R) > viewConfiguration.getScaledTouchSlop()) {
                    this.Q = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i + measuredHeight2) {
                            int x2 = ((int) motionEvent.getX()) - (i / 2);
                            this.h = x2;
                            if (x2 < c()) {
                                this.h = c();
                            } else if (this.h > getMeasuredWidth() - i2) {
                                this.h = getMeasuredWidth() - i2;
                            }
                        }
                        this.r = (int) (motionEvent.getX() - this.h);
                        this.x = true;
                        this.y.x();
                        if (hf0Var != null) {
                            hf0Var.setState(this.I);
                            hf0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.x) {
                int x3 = (int) (motionEvent.getX() - this.r);
                this.h = x3;
                if (x3 < c()) {
                    this.h = c();
                } else if (this.h > getMeasuredWidth() - i2) {
                    this.h = getMeasuredWidth() - i2;
                }
                if (this.E) {
                    if (this.N) {
                        float measuredWidth2 = (getMeasuredWidth() - i2) / 2;
                        float f2 = this.h;
                        if (f2 >= measuredWidth2) {
                            f(false, (f2 - measuredWidth2) / measuredWidth2);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth2 - f2) / measuredWidth2)));
                        }
                    } else {
                        f(false, this.h / (getMeasuredWidth() - i2));
                    }
                }
                if (hf0Var != null) {
                    hf0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z, float f) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.s = f;
            return;
        }
        this.s = -100.0f;
        boolean z2 = this.N;
        int i = this.f;
        if (z2) {
            float measuredWidth = (getMeasuredWidth() - i) / 2;
            ceil = f < 0.0f ? Math.ceil(((-(f + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i) * f);
        }
        int i2 = (int) ceil;
        int i3 = this.h;
        if (i3 != i2) {
            if (z) {
                this.K = i3;
                this.J = 0.0f;
            }
            this.h = i2;
            if (i2 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i) {
                this.h = getMeasuredWidth() - i;
            }
            invalidate();
        }
    }

    public final void f(boolean z, float f) {
        ty9 ty9Var = this.y;
        if (ty9Var != null) {
            ty9Var.o(z, f);
        }
        if (this.L > 1) {
            int round = Math.round((r0 - 1) * f);
            if (!z && round != this.T) {
                hl.W3(this);
            }
            this.T = round;
        }
    }

    public final void g(r47 r47Var) {
        String str;
        if (r47Var == null) {
            this.U = null;
            this.b0 = -1;
            this.a0 = 0.0f;
            StaticLayout[] staticLayoutArr = this.c0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) r47Var.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.U = null;
            this.b0 = -1;
            this.a0 = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.c0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        CharSequence charSequence = r47Var.z;
        if (r47Var.d5()) {
            if (r47Var.B == null && (str = r47Var.k.media.webpage.description) != null) {
                r47Var.B = SpannableString.valueOf(str);
                r47.h(r47Var.N3(), r47Var.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = r47Var.B;
        }
        boolean z = charSequence != this.V;
        if (z || this.W != valueOf.longValue()) {
            this.V = charSequence;
            this.W = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.k0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.U = null;
                this.b0 = -1;
                this.a0 = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.c0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                f8c[] f8cVarArr = (f8c[]) spanned.getSpans(0, spanned.length(), f8c.class);
                this.U = new ArrayList();
                if (z) {
                    this.a0 = 0.0f;
                }
                if (this.d0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.d0 = textPaint;
                    textPaint.setTextSize(hl.L(12.0f));
                    this.d0.setColor(-1);
                }
                for (f8c f8cVar : f8cVarArr) {
                    if (f8cVar != null && f8cVar.getURL() != null && f8cVar.d != null && f8cVar.getURL().startsWith("audio?")) {
                        if (Utilities.z(f8cVar.getURL().substring(6)).intValue() >= 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f8cVar.d);
                            pv3.l(spannableStringBuilder, this.d0.getFontMetricsInt(), false);
                            this.U.add(new Pair(Float.valueOf((r4.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.U, new qq7((byte) 23));
            } catch (Exception e) {
                cc4.g(e, true);
                this.U = null;
                this.b0 = -1;
                this.a0 = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.c0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        return getMeasuredWidth() == 0 ? this.s : this.h / (getMeasuredWidth() - this.f);
    }

    public sy9 getSeekBarAccessibilityDelegate() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0307  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        ArrayList arrayList;
        int size;
        float f5;
        float f6;
        float f7;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        float x;
        Canvas canvas2 = canvas;
        int i = this.h;
        boolean z2 = this.N;
        int i2 = this.f;
        if (!z2 && this.L > 1) {
            i = (int) this.n.e(false, Math.round(i / r3) * ((getMeasuredWidth() - i2) / (this.L - 1.0f)));
        }
        int i3 = i;
        int measuredHeight = getMeasuredHeight();
        int i4 = this.e;
        int i5 = (measuredHeight - i4) / 2;
        int i6 = aob.Kj;
        vnb vnbVar = this.O;
        int v0 = aob.v0(i6, vnbVar);
        Paint paint = this.c;
        paint.setColor(v0);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f8 = i2 / 2.0f;
        int i7 = i2 / 2;
        float measuredWidth = getMeasuredWidth() - i7;
        float L = measuredHeight2 - (hl.L(this.M) / 2.0f);
        float L2 = (hl.L(this.M) / 2.0f) + measuredHeight2;
        RectF rectF = this.i0;
        rectF.set(f8, L, measuredWidth, L2);
        a(canvas2, rectF, paint);
        if (this.F > 0.0f) {
            paint.setColor(aob.v0(aob.Lj, vnbVar));
            f = 0.0f;
            rectF.set(f8, L, (this.F * (getMeasuredWidth() - i2)) + f8, L2);
            a(canvas2, rectF, paint);
        } else {
            f = 0.0f;
        }
        boolean z3 = this.N;
        Paint paint2 = this.d;
        if (z3) {
            canvas2.drawRect((getMeasuredWidth() / 2) - hl.L(1.0f), (getMeasuredHeight() / 2) - hl.L(6.0f), hl.L(1.0f) + (getMeasuredWidth() / 2), hl.L(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i3 > (getMeasuredWidth() - i2) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - hl.L(1.0f), i7 + i3, hl.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i7 + i3, (getMeasuredHeight() / 2) - hl.L(1.0f), getMeasuredWidth() / 2, hl.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f8 = f8;
        } else {
            float f9 = this.w;
            if (f9 >= f) {
                float f10 = measuredWidth - f8;
                rectF.set((f9 * f10) + f8, L, i3 + f8, L2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f8, L, (this.w * f10) + f8, L2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f8, L, i3 + f8, L2);
                a(canvas2, rectF, paint2);
            }
        }
        hf0 hf0Var = this.G;
        if (hf0Var != null) {
            int L3 = (i7 + i3) - hl.L(16.0f);
            int L4 = ((i4 / 2) + i5) - hl.L(16.0f);
            hf0Var.setBounds(L3, L4, hl.L(32.0f) + L3, hl.L(32.0f) + L4);
            hf0Var.draw(canvas2);
        }
        int L5 = hl.L(this.x ? 8.0f : 6.0f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f11 = this.H;
        float f12 = L5;
        if (f11 != f12) {
            f2 = 16.0f;
            if (f11 < f12) {
                f3 = 8.0f;
                x = c00.B(elapsedRealtime, 60.0f, hl.L(1.0f), f11);
                this.H = x;
                if (x > f12) {
                    this.H = f12;
                    f11 = f12;
                }
                f11 = x;
            } else {
                f3 = 8.0f;
                x = uh9.x(elapsedRealtime, 60.0f, hl.L(1.0f), f11);
                this.H = x;
                if (x < f12) {
                    this.H = f12;
                    f11 = f12;
                }
                f11 = x;
            }
            z = true;
        } else {
            f2 = 16.0f;
            f3 = 8.0f;
            z = false;
        }
        float f13 = this.J;
        if (f13 < 1.0f) {
            f4 = (elapsedRealtime / 225.0f) + f13;
            this.J = f4;
            if (f4 < 1.0f) {
                z = true;
                if (f4 >= 1.0f) {
                    float interpolation = 1.0f - dt3.c.getInterpolation(Math.min(1.0f, f4 * 3.0f));
                    float interpolation2 = dt3.d.getInterpolation(this.J);
                    if (interpolation > f) {
                        canvas2.drawCircle(i7 + this.K, (i4 / 2) + i5, this.H * interpolation, paint2);
                    }
                    canvas2.drawCircle(i7 + i3, (i4 / 2) + i5, this.H * interpolation2, paint2);
                } else {
                    canvas2.drawCircle(i7 + i3, (i4 / 2) + i5, f11, paint2);
                }
                arrayList = this.U;
                if (arrayList != null && !arrayList.isEmpty()) {
                    float progress = getProgress();
                    size = this.U.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            size = -1;
                            break;
                        } else if (((Float) ((Pair) this.U.get(size)).first).floatValue() - 0.001f <= progress) {
                            break;
                        }
                    }
                    setTimestampIndex(size);
                    if (this.c0 == null) {
                        this.c0 = new StaticLayout[2];
                    }
                    float L6 = (this.W <= 600000 ? hl.L(42.0f) : 0) + f8;
                    float abs = Math.abs(L6 - ((getMeasuredWidth() - f8) - (this.W <= 600000 ? hl.L(42.0f) : 0))) - hl.L(66.0f);
                    f5 = this.h0;
                    if (f5 > f && Math.abs(f5 - abs) > 0.01f) {
                        StaticLayout[] staticLayoutArr = this.c0;
                        staticLayout = staticLayoutArr[0];
                        if (staticLayout != null) {
                            staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                        }
                        StaticLayout[] staticLayoutArr2 = this.c0;
                        staticLayout2 = staticLayoutArr2[1];
                        if (staticLayout2 != null) {
                            staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                        }
                    }
                    this.h0 = abs;
                    if (size != this.b0) {
                        StaticLayout[] staticLayoutArr3 = this.c0;
                        staticLayoutArr3[1] = staticLayoutArr3[0];
                        if (this.x) {
                            hl.W3(this);
                        }
                        if (size < 0 || size >= this.U.size()) {
                            this.c0[0] = null;
                        } else {
                            CharSequence charSequence = (CharSequence) ((Pair) this.U.get(size)).second;
                            StaticLayout[] staticLayoutArr4 = this.c0;
                            if (charSequence == null) {
                                staticLayoutArr4[0] = null;
                            } else {
                                staticLayoutArr4[0] = b((int) abs, charSequence);
                            }
                        }
                        this.e0 = f;
                        if (size == -1) {
                            this.f0 = -1;
                        } else {
                            int i8 = this.b0;
                            if (i8 == -1) {
                                this.f0 = 1;
                            } else if (size < i8) {
                                this.f0 = -1;
                            } else if (size > i8) {
                                this.f0 = 1;
                            }
                        }
                        this.b0 = size;
                    }
                    if (this.e0 < 1.0f) {
                        this.e0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.g0)) / (this.U.size() > 8 ? 160.0f : 220.0f)) + this.e0, 1.0f);
                        invalidate();
                        this.g0 = SystemClock.elapsedRealtime();
                    }
                    if (this.a0 < 1.0f) {
                        this.a0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.g0)) / 200.0f) + this.a0, 1.0f);
                        invalidate();
                        SystemClock.elapsedRealtime();
                    }
                    float interpolation3 = k43.f.getInterpolation(this.e0);
                    canvas2.save();
                    canvas2.translate(L6 + hl.L(25.0f), (getMeasuredHeight() / 2.0f) + hl.L(14.0f));
                    this.d0.setColor(aob.v0(aob.Jj, vnbVar));
                    if (this.c0[1] != null) {
                        canvas2.save();
                        if (this.f0 != 0) {
                            f7 = 0.0f;
                            canvas2.translate((hl.L(f2) * (-this.f0) * interpolation3) + hl.L(f3), 0.0f);
                        } else {
                            f7 = 0.0f;
                        }
                        canvas2.translate(f7, (-this.c0[1].getHeight()) / 2.0f);
                        this.d0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.a0));
                        canvas2.restore();
                    }
                    if (this.c0[0] != null) {
                        canvas2.save();
                        if (this.f0 != 0) {
                            f6 = 0.0f;
                            canvas2.translate(qd4.A(1.0f, interpolation3, hl.L(f2) * this.f0, hl.L(f3)), 0.0f);
                        } else {
                            f6 = 0.0f;
                        }
                        canvas2.translate(f6, (-this.c0[0].getHeight()) / 2.0f);
                        this.d0.setAlpha((int) (interpolation3 * 255.0f * this.a0));
                        canvas2.restore();
                    }
                    canvas2.restore();
                }
                if (z) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
            this.J = 1.0f;
            f13 = 1.0f;
        }
        f4 = f13;
        if (f4 >= 1.0f) {
        }
        arrayList = this.U;
        if (arrayList != null) {
            float progress2 = getProgress();
            size = this.U.size();
            while (true) {
                size--;
                if (size >= 0) {
                }
            }
            setTimestampIndex(size);
            if (this.c0 == null) {
            }
            float L62 = (this.W <= 600000 ? hl.L(42.0f) : 0) + f8;
            float abs2 = Math.abs(L62 - ((getMeasuredWidth() - f8) - (this.W <= 600000 ? hl.L(42.0f) : 0))) - hl.L(66.0f);
            f5 = this.h0;
            if (f5 > f) {
                StaticLayout[] staticLayoutArr5 = this.c0;
                staticLayout = staticLayoutArr5[0];
                if (staticLayout != null) {
                }
                StaticLayout[] staticLayoutArr22 = this.c0;
                staticLayout2 = staticLayoutArr22[1];
                if (staticLayout2 != null) {
                }
            }
            this.h0 = abs2;
            if (size != this.b0) {
            }
            if (this.e0 < 1.0f) {
            }
            if (this.a0 < 1.0f) {
            }
            float interpolation32 = k43.f.getInterpolation(this.e0);
            canvas2.save();
            canvas2.translate(L62 + hl.L(25.0f), (getMeasuredHeight() / 2.0f) + hl.L(14.0f));
            this.d0.setColor(aob.v0(aob.Jj, vnbVar));
            if (this.c0[1] != null) {
            }
            if (this.c0[0] != null) {
            }
            canvas2.restore();
        }
        if (z) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = hl.L(14.0f) + (getMeasuredHeight() / 2);
        a20 a20Var = this.P;
        int measuredHeight = (a20Var.getMeasuredHeight() / 2) + L;
        int L2 = hl.L(8.0f) + hl.L(25.0f) + (this.f / 2) + (this.W > 600000 ? hl.L(42.0f) : 0);
        a20Var.layout(L2, measuredHeight - a20Var.getMeasuredHeight(), a20Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.k0 = timestampLabelWidth;
        this.P.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
        if (this.s == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.s);
        this.s = -100.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f) {
        this.F = f;
        invalidate();
    }

    public void setDelegate(ty9 ty9Var) {
        this.y = ty9Var;
    }

    public void setInnerColor(int i) {
        this.c.setColor(i);
    }

    public void setLineWidth(int i) {
        this.M = i;
    }

    public void setMinProgress(float f) {
        this.w = f;
        float progress = getProgress();
        float f2 = this.w;
        if (progress < f2) {
            e(false, f2);
        }
        invalidate();
    }

    public void setOuterColor(int i) {
        this.d.setColor(i);
        hf0 hf0Var = this.G;
        if (hf0Var != null) {
            aob.F1(hf0Var, vm2.o(i, 40), true);
        }
    }

    public void setProgress(float f) {
        e(false, f);
    }

    public void setReportChanges(boolean z) {
        this.E = z;
    }

    public void setSeparatorsCount(int i) {
        this.L = i;
    }

    public void setTwoSided(boolean z) {
        this.N = z;
    }

    @Override // snb
    public final void updateColors() {
        int v0;
        try {
            Paint paint = this.d;
            if (paint == null || paint.getColor() != this.a || (v0 = aob.v0(aob.Mj, this.O)) == this.a) {
                return;
            }
            this.a = v0;
            setOuterColor(v0);
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public uy9(Context context) {
        this(null, context, false);
    }
}
