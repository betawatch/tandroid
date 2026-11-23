package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class f extends EditTextBoldCursor {
    public final Canvas M1;
    public final TextPaint N1;
    public final Paint O1;
    public Bitmap P1;
    public boolean Q1;
    public int R1;
    public float S1;
    public int T1;
    public final oq U1;
    public RectF[] V1;
    public RectF W1;
    public boolean X1;
    public float Y1;
    public boolean Z1;
    public int[] a2;
    public long b2;
    public int c2;
    public Paint d2;
    public final Path e2;
    public final RectF f2;
    public final RectF g2;

    public f(Context context) {
        super(context);
        this.M1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.N1 = textPaint;
        this.O1 = new Paint(1);
        this.U1 = new oq();
        this.c2 = TLObject.FLAG_31;
        this.e2 = new Path();
        this.f2 = new RectF();
        this.g2 = new RectF();
        this.R1 = 0;
        setInputType(getInputType() | 655360);
        this.Q1 = true;
        this.X1 = true;
        setFrameRoundRadius(org.telegram.messenger.g0.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f10) {
        if (Math.abs(this.Y1 - f10) > 0.1f) {
            this.Y1 = f10;
            this.O1.setPathEffect(new CornerPathEffect(f10));
        }
    }

    public final boolean A(long j3) {
        this.b2 = j3;
        if (this.a2 == null) {
            return false;
        }
        int B = B(j3);
        if (B < 0) {
            B = -1;
        } else if (j3 - this.a2[(B * 4) + 2] < Math.max(220L, 240L)) {
            B = -2;
        }
        if (B == this.c2 && B != -2) {
            return false;
        }
        this.c2 = B;
        invalidate();
        return true;
    }

    public final int B(long j3) {
        int i7;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            i7 = i10;
            i10 = i12;
            if ((i10 * 4) + 3 >= this.a2.length || r4[r2 + 2] > j3) {
                break;
            }
            i11 = i10 + 1;
        }
        return i7;
    }

    public final boolean C(Layout layout, int i7, RectF rectF) {
        int[] iArr = this.a2;
        int i10 = i7 * 4;
        int i11 = iArr[i10];
        int i12 = iArr[i10 + 1];
        if (i11 >= 0 && i11 < i12 && i12 <= layout.getText().length()) {
            Path path = this.e2;
            path.rewind();
            layout.getSelectionPath(i11, i12, path);
            path.computeBounds(rectF, false);
            if (!rectF.isEmpty()) {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i11));
                float textSize = getTextSize() * 0.14f;
                rectF.set(rectF.left - textSize, ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize, rectF.right + textSize, p5.c.e(fontMetrics.descent, 0.9f, lineBaseline, textSize));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0466  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int B;
        float f10;
        float f11;
        boolean z10;
        int i7 = 0;
        if (this.P1 != null && this.R1 != 0) {
            boolean z11 = this.Q1;
            TextPaint textPaint = this.N1;
            if (z11) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.P1;
                Canvas canvas2 = this.M1;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f12 = this.S1;
                if (f12 <= 0.0f) {
                    f12 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f12);
                textPaint.setColor(this.R1);
                textPaint.setTextSize(getTextSize());
                textPaint.setTypeface(getTypeface());
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (getLayout() != null) {
                    alignment = getLayout().getAlignment();
                }
                StaticLayout staticLayout = new StaticLayout(text, textPaint, measuredWidth, alignment, 1.0f, 0.0f, true);
                canvas2.save();
                canvas2.translate(getPaddingLeft(), ((((measuredHeight - getPaddingTop()) - getPaddingBottom()) - staticLayout.getHeight()) / 2.0f) + getPaddingTop());
                staticLayout.draw(canvas2);
                canvas2.restore();
                this.Q1 = false;
            }
            canvas.drawBitmap(this.P1, 0.0f, 0.0f, textPaint);
        }
        float f13 = 1.0f;
        if (this.T1 != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i10 = this.T1;
            Paint paint = this.O1;
            paint.setColor(i10);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.V1;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.V1 = new RectF[layout.getLineCount()];
                this.X1 = true;
            }
            if (this.X1) {
                this.X1 = false;
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    RectF[] rectFArr2 = this.V1;
                    if (rectFArr2[i11] == null) {
                        rectFArr2[i11] = new RectF();
                    }
                    this.V1[i11].set(layout.getLineLeft(i11), layout.getLineTop(i11), layout.getLineRight(i11), layout.getLineBottom(i11));
                    if (this.V1[i11].width() > org.telegram.messenger.g0.L(1.0f)) {
                        this.V1[i11].inset(this.Z1 ? (-getTextSize()) * 0.26f : (-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF = this.V1[i11];
                        rectF.top = org.telegram.messenger.g0.N(1.2f) + rectF.top;
                        RectF rectF2 = this.V1[i11];
                        rectF2.bottom = org.telegram.messenger.g0.N(1.0f) + rectF2.bottom;
                        this.V1[i11].left = Math.max(getScrollX() - getPaddingLeft(), this.V1[i11].left);
                        this.V1[i11].right = Math.min((getWidth() + getScrollX()) - getPaddingLeft(), this.V1[i11].right);
                    } else {
                        RectF rectF3 = this.V1[i11];
                        rectF3.left = rectF3.right;
                    }
                    if (this.Z1 && this.V1[i11].width() > 0.0f) {
                        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                        float lineBaseline = layout.getLineBaseline(i11);
                        float textSize = getTextSize() * 0.26f;
                        this.V1[i11].top = Math.max(-getPaddingTop(), ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize);
                        this.V1[i11].bottom = Math.min(getHeight() - getPaddingTop(), (fontMetrics.descent * 0.9f) + lineBaseline + textSize);
                    }
                    if (i11 > 0) {
                        int i12 = i11 - 1;
                        if (this.V1[i12].width() > 0.0f) {
                            RectF[] rectFArr3 = this.V1;
                            rectFArr3[i12].bottom = rectFArr3[i11].top;
                        }
                    }
                }
                if (this.W1 == null) {
                    this.W1 = new RectF();
                }
                this.W1.left = getMeasuredWidth();
                this.W1.top = getMeasuredHeight();
                RectF rectF4 = this.W1;
                rectF4.bottom = 0.0f;
                rectF4.right = 0.0f;
                for (int i13 = 0; i13 < this.V1.length; i13++) {
                    RectF rectF5 = this.W1;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.V1[i13].left);
                    RectF rectF6 = this.W1;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.V1[i13].top);
                    RectF rectF7 = this.W1;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.V1[i13].right);
                    RectF rectF8 = this.W1;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.V1[i13].bottom);
                }
                RectF rectF9 = this.W1;
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF10 = this.W1;
                rectF9.right = measuredWidth2 - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.W1.bottom;
            }
            oq oqVar = this.U1;
            oqVar.rewind();
            float textSize2 = getTextSize() / 3.0f;
            float f14 = 1.5f * textSize2;
            int i14 = 1;
            while (true) {
                RectF[] rectFArr4 = this.V1;
                if (i14 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i14 - 1];
                RectF rectF12 = rectFArr4[i14];
                if (rectF11.width() >= org.telegram.messenger.g0.L(1.0f) && rectF12.width() >= org.telegram.messenger.g0.L(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f14) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f14) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z10 = true;
                    }
                    if (z10) {
                        for (int i15 = i14; i15 >= 1; i15--) {
                            RectF[] rectFArr5 = this.V1;
                            RectF rectF13 = rectFArr5[i15 - 1];
                            RectF rectF14 = rectFArr5[i15];
                            if (rectF13.width() >= org.telegram.messenger.g0.L(1.0f) && rectF14.width() >= org.telegram.messenger.g0.L(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f14) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f14) {
                                    float max2 = Math.max(rectF14.right, rectF13.right);
                                    rectF13.right = max2;
                                    rectF14.right = max2;
                                }
                            }
                        }
                    }
                }
                i14++;
            }
            while (true) {
                RectF[] rectFArr6 = this.V1;
                if (i7 >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i7].width() != 0.0f) {
                    oqVar.addRect(this.V1[i7], Path.Direction.CW);
                }
                i7++;
            }
            oqVar.a();
            setFrameRoundRadius(textSize2);
            canvas.drawPath(oqVar, paint);
            canvas.restore();
        } else {
            this.W1 = null;
        }
        Layout layout2 = getLayout();
        if (this.a2 != null && layout2 != null && (B = B(this.b2)) >= 0) {
            RectF rectF15 = this.f2;
            if (C(layout2, B, rectF15)) {
                long j3 = this.b2 - this.a2[(B * 4) + 2];
                if (B > 0) {
                    RectF rectF16 = this.g2;
                    if (C(layout2, B - 1, rectF16) && Math.abs(rectF16.centerY() - rectF15.centerY()) < 1.0f) {
                        if (j3 < 240) {
                            float interpolation = kr.h.getInterpolation(j3 / 240.0f);
                            rectF15.set(org.telegram.messenger.g0.T1(rectF16.left, rectF15.left, interpolation), org.telegram.messenger.g0.T1(rectF16.top, rectF15.top, interpolation), org.telegram.messenger.g0.T1(rectF16.right, rectF15.right, interpolation), org.telegram.messenger.g0.T1(rectF16.bottom, rectF15.bottom, interpolation));
                            f10 = 1.0f - (((float) Math.sin(interpolation * 3.141592653589793d)) * 0.2f);
                            float f15 = f13;
                            f13 = f10;
                            f11 = f15;
                            if (this.d2 == null) {
                                this.d2 = new Paint(1);
                            }
                            this.d2.setColor(n6.r1(f11 * 0.3f, getCurrentTextColor()));
                            float textSize3 = getTextSize() * 0.25f;
                            canvas.save();
                            canvas.translate(getPaddingLeft(), getPaddingTop());
                            canvas.scale(f13, f13, rectF15.centerX(), rectF15.centerY());
                            canvas.drawRoundRect(rectF15, textSize3, textSize3, this.d2);
                            canvas.restore();
                        } else {
                            f11 = 1.0f;
                            if (this.d2 == null) {
                            }
                            this.d2.setColor(n6.r1(f11 * 0.3f, getCurrentTextColor()));
                            float textSize32 = getTextSize() * 0.25f;
                            canvas.save();
                            canvas.translate(getPaddingLeft(), getPaddingTop());
                            canvas.scale(f13, f13, rectF15.centerX(), rectF15.centerY());
                            canvas.drawRoundRect(rectF15, textSize32, textSize32, this.d2);
                            canvas.restore();
                        }
                    }
                }
                f13 = kr.h.getInterpolation(Math.min(1.0f, j3 / 220.0f));
                f10 = 0.75f + (f13 * 0.25f);
                float f152 = f13;
                f13 = f10;
                f11 = f152;
                if (this.d2 == null) {
                }
                this.d2.setColor(n6.r1(f11 * 0.3f, getCurrentTextColor()));
                float textSize322 = getTextSize() * 0.25f;
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                canvas.scale(f13, f13, rectF15.centerX(), rectF15.centerY());
                canvas.drawRoundRect(rectF15, textSize322, textSize322, this.d2);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            this.X1 = true;
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.pt, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 <= 0 || i10 <= 0) {
            this.P1 = null;
            return;
        }
        this.Q1 = true;
        this.X1 = true;
        Bitmap bitmap = this.P1;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.P1 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.Q1 = true;
        this.X1 = true;
    }

    public void setFrameColor(int i7) {
        int i10 = this.T1;
        if (i10 == 0 && i7 != 0) {
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(7.0f));
            setCursorColor(-1);
        } else if (i10 != 0 && i7 == 0) {
            setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            setCursorColor(-1);
        }
        this.T1 = i7;
        if (i7 != 0) {
            float B = org.telegram.messenger.g0.B(i7);
            if (B == 0.0f) {
                B = Color.red(this.T1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.X1 = true;
        }
        this.Q1 = true;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        super.setGravity(i7);
        this.Q1 = true;
        this.X1 = true;
        invalidate();
    }

    public void setSpokenWords(int[] iArr) {
        if (this.a2 == iArr) {
            return;
        }
        this.a2 = iArr;
        this.c2 = TLObject.FLAG_31;
        invalidate();
    }

    public void setStrokeColor(int i7) {
        this.R1 = i7;
        this.Q1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.S1 = f10;
        this.Q1 = true;
        invalidate();
    }

    public void setTallFrame(boolean z10) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        this.X1 = true;
        invalidate();
    }
}
