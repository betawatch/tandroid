package tf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import kh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public String f;
    public final TextPaint h;
    public float n;
    public final RectF r;
    public float s;
    public d v;

    public e(Context context) {
        super(context);
        this.r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(f6.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final int i9 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: tf.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        e eVar = this.b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            break;
                        }
                        break;
                    case 1:
                        d dVar2 = this.b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setOnLongClickListener(new d5(this, 5));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, e6.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(f6.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        final int i10 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: tf.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e eVar = this.b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            break;
                        }
                        break;
                    case 1:
                        d dVar2 = this.b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(imageView2, e6.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(f6.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final int i11 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: tf.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e eVar = this.b;
                        d dVar = eVar.v;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            break;
                        }
                        break;
                    case 1:
                        d dVar2 = this.b.v;
                        if (dVar2 != null) {
                            dVar2.b();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.b;
                        d dVar3 = eVar2.v;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(imageView3, e6.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i9, float f10, int i10, int i11, boolean z10, Paint paint) {
        int dp = (int) ((i10 / 2.0f) - AndroidUtilities.dp(70.0f));
        int cos = (i10 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i9 * 5) + f10))) * dp));
        float abs = Math.abs(r8) / dp;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        int i12 = z10 ? 4 : 2;
        int dp2 = AndroidUtilities.dp(z10 ? 16.0f : 12.0f);
        int i13 = i12 / 2;
        canvas.drawRect(cos - i13, (i11 - dp2) / 2, cos + i13, (i11 + dp2) / 2, paint2);
    }

    public final void b(float f10) {
        this.n = f10;
        if (Math.abs(f10) < 0.099d) {
            f10 = Math.abs(f10);
        }
        this.f = String.format("%.1fº", Float.valueOf(f10));
        invalidate();
    }

    @Override // android.view.View
    public float getRotation() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f10 = ((-this.n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(r0 / 5.0f);
        int i9 = 0;
        while (true) {
            Paint paint = this.b;
            if (i9 >= 16) {
                Canvas canvas2 = canvas;
                paint.setAlpha(255);
                float dp = (width - AndroidUtilities.dp(2.5f)) / 2;
                RectF rectF = this.r;
                rectF.left = dp;
                rectF.top = ll.y(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                String str = this.f;
                TextPaint textPaint = this.h;
                canvas2.drawText(this.f, (width - textPaint.measureText(str)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.a;
            Canvas canvas3 = canvas;
            a(canvas3, i9, f10, width, height, i9 == floor || (i9 == 0 && floor == -1), (i9 < floor || (i9 == 0 && f10 < 0.0f)) ? paint : paint2);
            int i10 = i9;
            if (i10 != 0) {
                int i11 = -i10;
                a(canvas3, i11, f10, width, height, i11 == floor + 1, i11 > floor ? paint : paint2);
            }
            i9 = i10 + 1;
            canvas = canvas3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(400.0f)), TLObject.FLAG_30), i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.s = x10;
            d dVar = this.v;
            if (dVar != null) {
                dVar.e();
                return true;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                d dVar2 = this.v;
                if (dVar2 != null) {
                    dVar2.c();
                }
                AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.n)));
                return true;
            }
            if (actionMasked == 2) {
                float max = Math.max(-45.0f, Math.min(45.0f, this.n + ((float) ((((this.s - x10) / AndroidUtilities.density) / 3.141592653589793d) / 1.649999976158142d))));
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(max - 45.0f) < 0.001f && Math.abs(this.n - 45.0f) >= 0.001f) || (Math.abs(max - (-45.0f)) < 0.001f && Math.abs(this.n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.n / 2.5f) != Math.floor(max / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(max - this.n) > 0.001d) {
                    if (Math.abs(max) < 0.05d) {
                        max = 0.0f;
                    }
                    b(max);
                    d dVar3 = this.v;
                    if (dVar3 != null) {
                        dVar3.f(this.n);
                    }
                    this.s = x10;
                }
            }
        }
        return true;
    }

    public void setAspectLock(boolean z10) {
        this.c.setColorFilter(z10 ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setListener(d dVar) {
        this.v = dVar;
    }

    public void setMirrored(boolean z10) {
        this.e.setColorFilter(z10 ? new PorterDuffColorFilter(f6.w0(null, f6.zf, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z10) {
        this.d.setColorFilter(z10 ? new PorterDuffColorFilter(f6.w0(null, f6.zf, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z10) {
    }
}
