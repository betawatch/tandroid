// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vs9 extends Dialog {
    public static final /* synthetic */ int P = 0;
    public ViewGroup E;
    public Drawable F;
    public im0 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context a;
    public final ylb b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final jz4 h;
    public final km0 n;
    public float r;
    public final ne6 s;
    public final ela w;
    public bu5 x;
    public FrameLayout y;

    public vs9(Context context, ylb ylbVar) {
        super(context, R.style.TransparentDialog);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.a = context;
        this.b = ylbVar;
        ne6 ne6Var = new ne6((byte) 16, context, this);
        this.s = ne6Var;
        ne6Var.setOnClickListener(new wk8(this, (byte) 15));
        ela elaVar = new ela(context, null);
        this.w = elaVar;
        elaVar.setClipToPadding(false);
        ne6Var.addView(elaVar, qoe.e(-1, -1, nm7.D1));
        jz4 jz4Var = new jz4();
        this.h = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.n = km0Var;
        km0Var.h = new zgc(ne6Var);
        km0Var.i = ne6Var;
        x59 x59Var = new x59(this, (byte) 8);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ne6Var, x59Var);
    }

    public static void d(jac jacVar) {
        gm.j2(new eg9(jacVar, (byte) 2), 15.0f);
    }

    public final void a(Runnable runnable, boolean z) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new p29(this, (byte) 9));
        this.O.addListener(new qx((Object) this, z, (Object) runnable, (byte) 11));
        this.O.setInterpolator(d53.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    public final /* synthetic */ void b() {
        super.dismiss();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        a(new hm1(this, (byte) 3), false);
        this.s.invalidate();
    }

    public final void e(bu5 bu5Var) {
        int i = cmb.D8;
        ylb ylbVar = this.b;
        bu5Var.U(cmb.p1(0.06f, cmb.v0(i, ylbVar)));
        bu5Var.R(this.n, qqd.k(ylbVar), false);
        this.x = bu5Var;
        this.E = bu5Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.E, qoe.c(-2.0f, -2));
        this.w.addView(this.y, qoe.c(-2.0f, -2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145 A[EDGE_INSN: B:52:0x0145->B:53:0x0145 BREAK  A[LOOP:2: B:45:0x0119->B:49:0x0142], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d7  */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r6v37, types: [android.graphics.Path, b66] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.graphics.Path, b66, zx2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(rc2 rc2Var, CharacterStyle characterStyle, SpannableString spannableString, boolean z) {
        float f;
        float f2;
        ArrayList arrayList;
        float f3;
        boolean z2;
        int i;
        int i2;
        int i3;
        ?? r15;
        float f4;
        int i4;
        float f5;
        ?? r5;
        RectF rectF;
        Layout layout;
        Paint paint;
        float f6;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i5;
        uj9 uj9Var;
        ii9 ii9Var;
        ArrayList<qc2> pollButtons;
        int i6;
        float f7;
        float f8;
        StaticLayout descriptionlayout;
        CharacterStyle[] characterStyleArr;
        int i7;
        if (rc2Var == null) {
            return;
        }
        rc2Var.getCurrentMessagesGroup();
        k47 messageObject = rc2Var.getMessageObject();
        int i8 = 0;
        boolean z3 = rc2Var.getExplanationLayout() != null && messageObject.L0;
        if (z3 && z) {
            f = rc2Var.getExplanationX();
            f2 = rc2Var.getExplanationY();
            arrayList = rc2Var.getExplanationLayout().e;
            f3 = rc2Var.getExplanationLayout().d;
        } else if (rc2Var.getCaptionLayout() != null) {
            f = rc2Var.getCaptionX();
            f2 = rc2Var.getCaptionY();
            arrayList = rc2Var.getCaptionLayout().e;
            f3 = rc2Var.getCaptionLayout().d;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            arrayList = null;
            f3 = 0.0f;
        }
        if (arrayList == null) {
            f = rc2Var.getTextX();
            f2 = rc2Var.getTextY() + rc2Var.Uc;
            arrayList = messageObject.B2;
            f3 = messageObject.x2;
        }
        if (arrayList != null) {
            int i9 = 0;
            while (i9 < arrayList.size()) {
                h47 h47Var = (h47) arrayList.get(i9);
                StaticLayout staticLayout = h47Var.e;
                if (staticLayout == null || !(staticLayout.getText() instanceof Spanned)) {
                    z2 = z3;
                } else {
                    z2 = z3;
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i8, staticLayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr2 != null) {
                        for (int i10 = i8; i10 < characterStyleArr2.length; i10++) {
                            if (characterStyleArr2[i10] == characterStyle) {
                                i = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                                i3 = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                                f += h47Var.l() ? (int) Math.ceil(f3) : 0;
                                f2 += h47Var.p(arrayList, rc2Var.ub) + h47Var.f;
                                i2 = h47Var.s;
                                r15 = staticLayout;
                                if (r15 == 0 && rc2Var.getDescriptionlayout() != null && (descriptionlayout = rc2Var.getDescriptionlayout()) != null && (descriptionlayout.getText() instanceof Spanned) && (characterStyleArr = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class)) != null) {
                                    i7 = 0;
                                    while (true) {
                                        if (i7 >= characterStyleArr.length) {
                                            break;
                                        }
                                        if (characterStyleArr[i7] == characterStyle) {
                                            i = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                            i3 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                            f = rc2Var.getDescriptionLayoutX();
                                            f2 = rc2Var.getDescriptionLayoutY();
                                            i2 = descriptionlayout.getWidth();
                                            r15 = descriptionlayout;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                if (r15 == 0 && ((messageObject.C4() || messageObject.S3()) && (pollButtons = rc2Var.getPollButtons()) != null)) {
                                    i6 = 0;
                                    r15 = r15;
                                    while (i6 < pollButtons.size()) {
                                        qc2 qc2Var = pollButtons.get(i6);
                                        StaticLayout staticLayout2 = qc2Var.p;
                                        int i11 = i;
                                        if (staticLayout2 != null && (staticLayout2.getText() instanceof Spanned)) {
                                            f7 = f;
                                            f8 = f2;
                                            CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr3 != null) {
                                                for (CharacterStyle characterStyle2 : characterStyleArr3) {
                                                    if (characterStyle2 == characterStyle) {
                                                        i = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                                        i3 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                                        f = qc2Var.m;
                                                        f2 = qc2Var.n;
                                                        i2 = staticLayout2.getWidth();
                                                        r15 = staticLayout2;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            f7 = f;
                                            f8 = f2;
                                        }
                                        i = i11;
                                        f2 = f8;
                                        f = f7;
                                        i6++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && messageObject != null && (uj9Var = messageObject.y2) != null) {
                                    ArrayList arrayList2 = uj9Var.g;
                                    if (characterStyle != null) {
                                        ii9Var = new ii9();
                                        int i12 = 0;
                                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                            qi9 qi9Var = (qi9) arrayList2.get(i13);
                                            if (qi9Var.R()) {
                                                if (qi9Var.t(characterStyle, i12, ii9Var)) {
                                                    break;
                                                } else {
                                                    i12 = qi9Var.H() + i12;
                                                }
                                            }
                                        }
                                    }
                                    ii9Var = null;
                                    if (ii9Var != null) {
                                        r15 = ii9Var.a;
                                        i = ii9Var.b;
                                        i3 = ii9Var.c;
                                        i2 = ii9Var.d;
                                        f = rc2Var.getTextX() + ii9Var.e;
                                        f2 = rc2Var.getTextY() + ii9Var.f;
                                    }
                                }
                                float f9 = f;
                                int i14 = i;
                                int i15 = i2;
                                if (r15 != 0 && z2 && !z) {
                                    f(rc2Var, characterStyle, spannableString, true);
                                    return;
                                }
                                if (r15 != 0) {
                                    return;
                                }
                                if (spannableString != null) {
                                    int lineForOffset = r15.getLineForOffset(i14);
                                    float lineTop = f2 + r15.getLineTop(lineForOffset);
                                    float primaryHorizontal = r15.getPrimaryHorizontal(i14);
                                    float lineWidth = r15.getLineWidth(lineForOffset);
                                    ?? b66Var = new b66(0);
                                    b66Var.d(r15, i14, 0.0f);
                                    r15.getSelectionPath(i14, i3, b66Var);
                                    RectF rectF2 = new RectF();
                                    b66Var.computeBounds(rectF2, true);
                                    TextPaint paint2 = r15.getPaint();
                                    rectF = rectF2;
                                    StaticLayout f52 = k47.f5(1.0f, 0.0f, r15.getWidth(), Layout.Alignment.ALIGN_NORMAL, paint2, spannableString, false);
                                    i3 = spannableString.length();
                                    float width = f52.getWidth();
                                    float f10 = 0.0f;
                                    for (int i16 = 0; i16 < f52.getLineCount(); i16++) {
                                        width = Math.min(width, f52.getLineLeft(i16));
                                        f10 = Math.max(f10, f52.getLineRight(i16));
                                    }
                                    f4 = f9 + Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f10 - width)));
                                    f5 = lineTop;
                                    i4 = 0;
                                    r5 = f52;
                                } else {
                                    f4 = f9;
                                    i4 = i14;
                                    f5 = f2;
                                    r5 = r15;
                                    rectF = null;
                                }
                                Paint paint3 = new Paint(1);
                                paint3.setColor(cmb.v0(messageObject.O3() ? cmb.qb : cmb.qa, this.b));
                                paint3.setPathEffect(new CornerPathEffect(gm.L(5.0f)));
                                ?? b66Var2 = new b66(0);
                                b66Var2.c = true;
                                b66Var2.d(r5, i4, 0.0f);
                                r5.getSelectionPath(i4, i3, b66Var2);
                                b66Var2.a();
                                RectF rectF3 = new RectF();
                                b66Var2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + gm.L(5.0f));
                                if (!rc2Var.L0() || width2 <= 0) {
                                    layout = r5;
                                    paint = paint3;
                                    f6 = 0.0f;
                                } else {
                                    f6 = 0.0f;
                                    if (rectF3.height() > 0.0f) {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
                                        ?? canvas = new Canvas(createBitmap);
                                        layout = r5;
                                        paint = paint3;
                                        Paint paint4 = new Paint(1);
                                        paint4.setColor(-1);
                                        canvas.drawRect(0.0f, 0.0f, width2, rectF3.height(), paint4);
                                        Paint paint5 = new Paint(1);
                                        paint5.setColor(-1);
                                        paint5.setPathEffect(new CornerPathEffect(gm.L(5.0f)));
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        canvas.translate(-rectF3.left, -rectF3.top);
                                        canvas.drawPath(b66Var2, paint5);
                                        bitmap = createBitmap;
                                        Paint paint6 = new Paint(3);
                                        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        rc2Var.F3();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        Bitmap bitmap2 = bitmap;
                                        spannableStringBuilder = new SpannableStringBuilder(gn.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i4 <= 0) {
                                            i5 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i4, 33);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i3 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i3, spannableStringBuilder.length(), 33);
                                        }
                                        if (messageObject.R1 >= 4) {
                                            f6 = -1.0f;
                                        }
                                        StaticLayout f53 = k47.f5(1.0f, f6, i15, Layout.Alignment.ALIGN_NORMAL, textPaint, spannableStringBuilder, false);
                                        int[] iArr = new int[2];
                                        rc2Var.getLocationOnScreen(iArr);
                                        float f11 = f5;
                                        this.F = new us9(b66Var2, new int[]{iArr[0] + ((int) f4), iArr[1] + ((int) f5)}, rc2Var, iArr, bitmap2, rectF3, paint6, paint, f53);
                                        int L = (int) ((gm.L(5.0f) / 2.0f) + iArr[0] + f4 + rectF3.left);
                                        int i17 = (int) (iArr[1] + f11 + rectF3.top);
                                        this.F.setBounds(L, i17, ((int) rectF3.width()) + L, ((int) rectF3.height()) + i17);
                                        if (spannableString == null) {
                                            float f12 = L;
                                            float width3 = rectF3.width() + f12;
                                            Point point = gm.q;
                                            if (width3 > point.x - gm.L(8.0f)) {
                                                this.I -= (rectF3.width() + f12) - (point.x - gm.L(8.0f));
                                            }
                                            float f13 = i17;
                                            if (rectF3.height() + f13 > ((point.y - gm.m) - gm.n) - gm.L(8.0f)) {
                                                this.J -= (rectF3.height() + f13) - (((point.y - gm.m) - gm.n) - gm.L(8.0f));
                                            }
                                            if (rectF != null) {
                                                this.K = rectF.width() / rectF3.width();
                                                this.L = rectF.height() / rectF3.height();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    layout = r5;
                                    paint = paint3;
                                }
                                bitmap = null;
                                Paint paint62 = new Paint(3);
                                paint62.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                rc2Var.F3();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                Bitmap bitmap22 = bitmap;
                                spannableStringBuilder = new SpannableStringBuilder(gn.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i4 <= 0) {
                                }
                                if (i3 < spannableStringBuilder.length()) {
                                }
                                if (messageObject.R1 >= 4) {
                                }
                                StaticLayout f532 = k47.f5(1.0f, f6, i15, Layout.Alignment.ALIGN_NORMAL, textPaint2, spannableStringBuilder, false);
                                int[] iArr2 = new int[2];
                                rc2Var.getLocationOnScreen(iArr2);
                                float f112 = f5;
                                this.F = new us9(b66Var2, new int[]{iArr2[0] + ((int) f4), iArr2[1] + ((int) f5)}, rc2Var, iArr2, bitmap22, rectF3, paint62, paint, f532);
                                int L2 = (int) ((gm.L(5.0f) / 2.0f) + iArr2[0] + f4 + rectF3.left);
                                int i172 = (int) (iArr2[1] + f112 + rectF3.top);
                                this.F.setBounds(L2, i172, ((int) rectF3.width()) + L2, ((int) rectF3.height()) + i172);
                                if (spannableString == null) {
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i9++;
                z3 = z2;
                i8 = 0;
            }
        }
        z2 = z3;
        i = 0;
        i2 = 0;
        i3 = 0;
        r15 = 0;
        if (r15 == 0) {
            i7 = 0;
            while (true) {
                if (i7 >= characterStyleArr.length) {
                }
                i7++;
            }
        }
        if (r15 == 0) {
            i6 = 0;
            r15 = r15;
            while (i6 < pollButtons.size()) {
            }
        }
        if (r15 == 0) {
            ArrayList arrayList22 = uj9Var.g;
            if (characterStyle != null) {
            }
            ii9Var = null;
            if (ii9Var != null) {
            }
        }
        float f92 = f;
        int i142 = i;
        int i152 = i2;
        if (r15 != 0) {
        }
        if (r15 != 0) {
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.N;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ne6 ne6Var = this.s;
        setContentView(ne6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = nm7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        gm.m(attributes);
        window.setAttributes(attributes);
        ne6Var.setSystemUiVisibility(256);
        gm.j3(ne6Var, !cmb.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gm.K1(getContext())) {
            super.show();
            d(new vh8(this, (byte) 14));
            a(null, true);
        }
    }
}
