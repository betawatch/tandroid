package rg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.tq;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class b extends EditTextBoldCursor {
    public final Canvas b;
    public final TextPaint c;
    public final Paint d;
    public Bitmap e;
    public boolean f;
    public int h;
    public float n;
    public int r;
    public final tq s;
    public RectF[] v;
    public RectF w;
    public boolean x;
    public float y;

    public b(Context context) {
        super(context);
        this.b = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.d = new Paint(1);
        this.s = new tq();
        this.h = 0;
        setInputType(getInputType() | 655360);
        this.f = true;
        this.x = true;
        setFrameRoundRadius(AndroidUtilities.dp(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f7) {
        if (Math.abs(this.y - f7) > 0.1f) {
            this.y = f7;
            this.d.setPathEffect(new CornerPathEffect(f7));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10 = 0;
        if (this.e != null && this.h != 0) {
            boolean z11 = this.f;
            TextPaint textPaint = this.c;
            if (z11) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.e;
                Canvas canvas2 = this.b;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f7 = this.n;
                if (f7 <= 0.0f) {
                    f7 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f7);
                textPaint.setColor(this.h);
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
                this.f = false;
            }
            canvas.drawBitmap(this.e, 0.0f, 0.0f, textPaint);
        }
        if (this.r != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i11 = this.r;
            Paint paint = this.d;
            paint.setColor(i11);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.v;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.v = new RectF[layout.getLineCount()];
                this.x = true;
            }
            if (this.x) {
                this.x = false;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    RectF[] rectFArr2 = this.v;
                    if (rectFArr2[i12] == null) {
                        rectFArr2[i12] = new RectF();
                    }
                    this.v[i12].set(layout.getLineLeft(i12), layout.getLineTop(i12), layout.getLineRight(i12), layout.getLineBottom(i12));
                    if (this.v[i12].width() > AndroidUtilities.dp(1.0f)) {
                        this.v[i12].inset((-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF = this.v[i12];
                        rectF.top = AndroidUtilities.dpf2(1.2f) + rectF.top;
                        RectF rectF2 = this.v[i12];
                        rectF2.bottom = AndroidUtilities.dpf2(1.0f) + rectF2.bottom;
                        this.v[i12].left = Math.max(-getPaddingLeft(), this.v[i12].left);
                        this.v[i12].right = Math.min(getWidth() - getPaddingLeft(), this.v[i12].right);
                    } else {
                        RectF rectF3 = this.v[i12];
                        rectF3.left = rectF3.right;
                    }
                    if (i12 > 0) {
                        int i13 = i12 - 1;
                        if (this.v[i13].width() > 0.0f) {
                            RectF[] rectFArr3 = this.v;
                            rectFArr3[i13].bottom = rectFArr3[i12].top;
                        }
                    }
                }
                if (this.w == null) {
                    this.w = new RectF();
                }
                this.w.left = getMeasuredWidth();
                this.w.top = getMeasuredHeight();
                RectF rectF4 = this.w;
                rectF4.bottom = 0.0f;
                rectF4.right = 0.0f;
                for (int i14 = 0; i14 < this.v.length; i14++) {
                    RectF rectF5 = this.w;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.v[i14].left);
                    RectF rectF6 = this.w;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.v[i14].top);
                    RectF rectF7 = this.w;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.v[i14].right);
                    RectF rectF8 = this.w;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.v[i14].bottom);
                }
                RectF rectF9 = this.w;
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF10 = this.w;
                rectF9.right = measuredWidth2 - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.w.bottom;
            }
            tq tqVar = this.s;
            tqVar.rewind();
            float textSize = getTextSize() / 3.0f;
            float f10 = 1.5f * textSize;
            int i15 = 1;
            while (true) {
                RectF[] rectFArr4 = this.v;
                if (i15 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i15 - 1];
                RectF rectF12 = rectFArr4[i15];
                if (rectF11.width() >= AndroidUtilities.dp(1.0f) && rectF12.width() >= AndroidUtilities.dp(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f10) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f10) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z10 = true;
                    }
                    if (z10) {
                        for (int i16 = i15; i16 >= 1; i16--) {
                            RectF[] rectFArr5 = this.v;
                            RectF rectF13 = rectFArr5[i16 - 1];
                            RectF rectF14 = rectFArr5[i16];
                            if (rectF13.width() >= AndroidUtilities.dp(1.0f) && rectF14.width() >= AndroidUtilities.dp(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f10) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f10) {
                                    float max2 = Math.max(rectF14.right, rectF13.right);
                                    rectF13.right = max2;
                                    rectF14.right = max2;
                                }
                            }
                        }
                    }
                }
                i15++;
            }
            while (true) {
                RectF[] rectFArr6 = this.v;
                if (i10 >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i10].width() != 0.0f) {
                    tqVar.addRect(this.v[i10], Path.Direction.CW);
                }
                i10++;
            }
            tqVar.a();
            setFrameRoundRadius(textSize);
            canvas.drawPath(tqVar, paint);
            canvas.restore();
        } else {
            this.w = null;
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.bu, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            this.e = null;
            return;
        }
        this.f = true;
        this.x = true;
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.e = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.f = true;
        this.x = true;
    }

    public void setFrameColor(int i10) {
        int i11 = this.r;
        if (i11 == 0 && i10 != 0) {
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        } else if (i11 != 0 && i10 == 0) {
            setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        }
        this.r = i10;
        if (i10 != 0) {
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i10);
            if (computePerceivedBrightness == 0.0f) {
                computePerceivedBrightness = Color.red(this.r) / 255.0f;
            }
            if (computePerceivedBrightness > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.x = true;
        }
        this.f = true;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        super.setGravity(i10);
        this.f = true;
        this.x = true;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        this.h = i10;
        this.f = true;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.n = f7;
        this.f = true;
        invalidate();
    }
}
