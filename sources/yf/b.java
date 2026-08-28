package yf;

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
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final kq s;
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
        this.s = new kq();
        this.h = 0;
        setInputType(getInputType() | 655360);
        this.f = true;
        this.x = true;
        setFrameRoundRadius(AndroidUtilities.dp(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f10) {
        if (Math.abs(this.y - f10) > 0.1f) {
            this.y = f10;
            this.d.setPathEffect(new CornerPathEffect(f10));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i9 = 0;
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
                float f10 = this.n;
                if (f10 <= 0.0f) {
                    f10 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f10);
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
            int i10 = this.r;
            Paint paint = this.d;
            paint.setColor(i10);
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
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    RectF[] rectFArr2 = this.v;
                    if (rectFArr2[i11] == null) {
                        rectFArr2[i11] = new RectF();
                    }
                    this.v[i11].set(layout.getLineLeft(i11), layout.getLineTop(i11), layout.getLineRight(i11), layout.getLineBottom(i11));
                    if (this.v[i11].width() > AndroidUtilities.dp(1.0f)) {
                        this.v[i11].inset((-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF = this.v[i11];
                        rectF.top = AndroidUtilities.dpf2(1.2f) + rectF.top;
                        RectF rectF2 = this.v[i11];
                        rectF2.bottom = AndroidUtilities.dpf2(1.0f) + rectF2.bottom;
                        this.v[i11].left = Math.max(-getPaddingLeft(), this.v[i11].left);
                        this.v[i11].right = Math.min(getWidth() - getPaddingLeft(), this.v[i11].right);
                    } else {
                        RectF rectF3 = this.v[i11];
                        rectF3.left = rectF3.right;
                    }
                    if (i11 > 0) {
                        int i12 = i11 - 1;
                        if (this.v[i12].width() > 0.0f) {
                            RectF[] rectFArr3 = this.v;
                            rectFArr3[i12].bottom = rectFArr3[i11].top;
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
                for (int i13 = 0; i13 < this.v.length; i13++) {
                    RectF rectF5 = this.w;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.v[i13].left);
                    RectF rectF6 = this.w;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.v[i13].top);
                    RectF rectF7 = this.w;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.v[i13].right);
                    RectF rectF8 = this.w;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.v[i13].bottom);
                }
                RectF rectF9 = this.w;
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF10 = this.w;
                rectF9.right = measuredWidth2 - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.w.bottom;
            }
            kq kqVar = this.s;
            kqVar.rewind();
            float textSize = getTextSize() / 3.0f;
            float f11 = 1.5f * textSize;
            int i14 = 1;
            while (true) {
                RectF[] rectFArr4 = this.v;
                if (i14 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i14 - 1];
                RectF rectF12 = rectFArr4[i14];
                if (rectF11.width() >= AndroidUtilities.dp(1.0f) && rectF12.width() >= AndroidUtilities.dp(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f11) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f11) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z10 = true;
                    }
                    if (z10) {
                        for (int i15 = i14; i15 >= 1; i15--) {
                            RectF[] rectFArr5 = this.v;
                            RectF rectF13 = rectFArr5[i15 - 1];
                            RectF rectF14 = rectFArr5[i15];
                            if (rectF13.width() >= AndroidUtilities.dp(1.0f) && rectF14.width() >= AndroidUtilities.dp(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f11) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f11) {
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
                RectF[] rectFArr6 = this.v;
                if (i9 >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i9].width() != 0.0f) {
                    kqVar.addRect(this.v[i9], Path.Direction.CW);
                }
                i9++;
            }
            kqVar.a();
            setFrameRoundRadius(textSize);
            canvas.drawPath(kqVar, paint);
            canvas.restore();
        } else {
            this.w = null;
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ot, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 <= 0 || i10 <= 0) {
            this.e = null;
            return;
        }
        this.f = true;
        this.x = true;
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.e = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        this.f = true;
        this.x = true;
    }

    public void setFrameColor(int i9) {
        int i10 = this.r;
        if (i10 == 0 && i9 != 0) {
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        } else if (i10 != 0 && i9 == 0) {
            setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        }
        this.r = i9;
        if (i9 != 0) {
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i9);
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
    public void setGravity(int i9) {
        super.setGravity(i9);
        this.f = true;
        this.x = true;
        invalidate();
    }

    public void setStrokeColor(int i9) {
        this.h = i9;
        this.f = true;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.n = f10;
        this.f = true;
        invalidate();
    }
}
