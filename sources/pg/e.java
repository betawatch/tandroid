package pg;

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
import b8.mf;
import gi.p4;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public d w;

    public e(Context context) {
        super(context);
        this.r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(hs.e4);
        final int i3 = 1;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(hs.e4);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: pg.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e eVar = this.b;
                        d dVar = eVar.w;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            break;
                        }
                        break;
                    case 1:
                        d dVar2 = this.b.w;
                        if (dVar2 != null) {
                            dVar2.b();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.b;
                        d dVar3 = eVar2.w;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setOnLongClickListener(new p4(this, 5));
        imageView.setContentDescription(bd.M0(2131754840, null));
        addView(imageView, mf.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: pg.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        e eVar = this.b;
                        d dVar = eVar.w;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            break;
                        }
                        break;
                    case 1:
                        d dVar2 = this.b.w;
                        if (dVar2 != null) {
                            dVar2.b();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.b;
                        d dVar3 = eVar2.w;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(bd.M0(2131754922, null));
        addView(imageView2, mf.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final int i11 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: pg.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e eVar = this.b;
                        d dVar = eVar.w;
                        if (dVar != null) {
                            eVar.setMirrored(dVar.a());
                            break;
                        }
                        break;
                    case 1:
                        d dVar2 = this.b.w;
                        if (dVar2 != null) {
                            dVar2.b();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.b;
                        d dVar3 = eVar2.w;
                        if (dVar3 != null) {
                            eVar2.setRotated(dVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setContentDescription(bd.M0(2131754783, null));
        addView(imageView3, mf.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(g0.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i3, float f10, int i10, int i11, boolean z10, Paint paint) {
        int L = (int) ((i10 / 2.0f) - g0.L(70.0f));
        int cos = (i10 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i3 * 5) + f10))) * L));
        float abs = Math.abs(r8) / L;
        int min = Math.min(hs.e4, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        int i12 = z10 ? 4 : 2;
        int L2 = g0.L(z10 ? 16.0f : 12.0f);
        int i13 = i12 / 2;
        canvas.drawRect(cos - i13, (i11 - L2) / 2, cos + i13, (i11 + L2) / 2, paint2);
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
        int i3 = 0;
        while (true) {
            Paint paint = this.b;
            if (i3 >= 16) {
                Canvas canvas2 = canvas;
                paint.setAlpha(hs.e4);
                float L = (width - g0.L(2.5f)) / 2;
                RectF rectF = this.r;
                rectF.left = L;
                rectF.top = q.y(22.0f, height, 2);
                rectF.right = (g0.L(2.5f) + width) / 2;
                rectF.bottom = (g0.L(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, g0.L(2.0f), g0.L(2.0f), paint);
                String str = this.f;
                TextPaint textPaint = this.h;
                canvas2.drawText(this.f, (width - textPaint.measureText(str)) / 2.0f, g0.L(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.a;
            Canvas canvas3 = canvas;
            a(canvas3, i3, f10, width, height, i3 == floor || (i3 == 0 && floor == -1), (i3 < floor || (i3 == 0 && f10 < 0.0f)) ? paint : paint2);
            int i10 = i3;
            if (i10 != 0) {
                int i11 = -i10;
                a(canvas3, i11, f10, width, height, i11 == floor + 1, i11 > floor ? paint : paint2);
            }
            i3 = i10 + 1;
            canvas = canvas3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), g0.L(400.0f)), TLObject.FLAG_30), i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.s = x10;
            d dVar = this.w;
            if (dVar != null) {
                dVar.e();
                return true;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                d dVar2 = this.w;
                if (dVar2 != null) {
                    dVar2.c();
                }
                g0.i2(String.format("%.1f°", Float.valueOf(this.n)));
                return true;
            }
            if (actionMasked == 2) {
                float z10 = q.z(this.n, (float) ((((this.s - x10) / g0.p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(z10 - 45.0f) < 0.001f && Math.abs(this.n - 45.0f) >= 0.001f) || (Math.abs(z10 - (-45.0f)) < 0.001f && Math.abs(this.n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.n / 2.5f) != Math.floor(z10 / 2.5f)) {
                            g0.c4(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(z10 - this.n) > 0.001d) {
                    if (Math.abs(z10) < 0.05d) {
                        z10 = 0.0f;
                    }
                    b(z10);
                    d dVar3 = this.w;
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
        this.w = dVar;
    }

    public void setMirrored(boolean z10) {
        this.e.setColorFilter(z10 ? new PorterDuffColorFilter(k6.x0(null, k6.ng, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z10) {
        this.d.setColorFilter(z10 ? new PorterDuffColorFilter(k6.x0(null, k6.ng, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z10) {
    }
}
