// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qgc extends View {
    public static final Object U = new Object();
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public Rect K;
    public Rect L;
    public int M;
    public Bitmap N;
    public final ArrayList O;
    public boolean P;
    public ogc Q;
    public Path R;
    public final Paint S;
    public boolean T;
    public long a;
    public float b;
    public float c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public boolean h;
    public float n;
    public MediaMetadataRetriever r;
    public pgc s;
    public final ArrayList w;
    public ngc x;
    public long y;

    public qgc(Context context) {
        super(context);
        this.c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.w = new ArrayList();
        this.H = 1.0f;
        this.I = 0.0f;
        this.O = new ArrayList();
        Paint paint3 = new Paint(1);
        this.S = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(hl.N(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(aob.w0(null, aob.a7, false));
        this.M = 0;
        ogc ogcVar = this.Q;
        if (ogcVar != null) {
            ogcVar.b();
        }
    }

    public final void a(boolean z) {
        synchronized (U) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.r = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (z) {
            int i = 0;
            if (this.O.isEmpty()) {
                while (i < this.w.size()) {
                    Bitmap bitmap = (Bitmap) this.w.get(i);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i++;
                }
            } else {
                while (i < this.O.size()) {
                    Bitmap bitmap2 = (Bitmap) this.O.get(i);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i++;
                }
            }
        }
        this.O.clear();
        this.w.clear();
        ngc ngcVar = this.x;
        if (ngcVar != null) {
            ngcVar.cancel(true);
            this.x = null;
        }
    }

    public final void b(int i) {
        if (this.r != null) {
            if (i == 0) {
                if (this.J) {
                    int L = hl.L(56.0f);
                    this.E = L;
                    this.F = L;
                    this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - hl.L(16.0f)) / (this.F / 2.0f)));
                } else {
                    this.F = hl.L(40.0f);
                    this.G = Math.max(1, (getMeasuredWidth() - hl.L(16.0f)) / this.F);
                    this.E = (int) Math.ceil((getMeasuredWidth() - hl.L(16.0f)) / this.G);
                }
                this.y = this.a / this.G;
                ArrayList arrayList = this.O;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.G;
                    float f = 0.0f;
                    for (int i2 = 0; i2 < this.G; i2++) {
                        this.w.add((Bitmap) arrayList.get((int) f));
                        f += size;
                    }
                    return;
                }
            }
            this.P = false;
            ngc ngcVar = new ngc(this);
            this.x = ngcVar;
            ngcVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
        }
    }

    public float getLeftProgress() {
        return this.b;
    }

    public float getRightProgress() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.save();
            Path path = this.R;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - hl.L(24.0f);
        int L = hl.L(12.0f) + ((int) (this.b * measuredWidth));
        int L2 = hl.L(12.0f) + ((int) (measuredWidth * this.c));
        float f = 32.0f;
        int measuredHeight = (getMeasuredHeight() - hl.L(32.0f)) >> 1;
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty() && this.x == null) {
            b(0);
        }
        if (arrayList.isEmpty()) {
            if (this.T) {
                canvas.restore();
                return;
            }
            return;
        }
        if (!this.P) {
            canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.e);
        }
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            Bitmap bitmap = (Bitmap) arrayList.get(i);
            if (bitmap != null && !bitmap.isRecycled()) {
                boolean z = this.J;
                int i3 = this.E;
                if (z) {
                    i3 /= 2;
                }
                int i4 = i3 * i2;
                if (z) {
                    this.L.set(i4, measuredHeight, hl.L(28.0f) + i4, hl.L(f) + measuredHeight);
                    canvas.drawBitmap(bitmap, this.K, this.L, (Paint) null);
                } else {
                    canvas.drawBitmap(bitmap, i4, measuredHeight, (Paint) null);
                }
            }
            i2++;
            i++;
            f = 32.0f;
        }
        float f2 = measuredHeight;
        float measuredHeight2 = getMeasuredHeight() - measuredHeight;
        Paint paint = this.d;
        canvas.drawRect(0.0f, f2, L, measuredHeight2, paint);
        canvas.drawRect(L2, f2, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
        float L3 = L - hl.L(4.0f);
        float L4 = hl.L(10.0f) + measuredHeight;
        float L5 = L - hl.L(4.0f);
        float x = qu6.x(10.0f, getMeasuredHeight(), measuredHeight);
        Paint paint2 = this.S;
        canvas.drawLine(L3, L4, L5, x, paint2);
        canvas.drawLine(hl.L(4.0f) + L2, hl.L(10.0f) + measuredHeight, hl.L(4.0f) + L2, qu6.x(10.0f, getMeasuredHeight(), measuredHeight), paint2);
        if (this.T) {
            canvas.restore();
            return;
        }
        int measuredHeight3 = getMeasuredHeight() - (measuredHeight << 1);
        int measuredWidth2 = getMeasuredWidth();
        if (hl.L(6.0f) != this.M) {
            this.M = hl.L(6.0f);
            this.N = Bitmap.createBitmap(hl.L(6.0f), hl.L(6.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.N);
            Paint paint3 = new Paint(1);
            paint3.setColor(0);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawColor(aob.w0(null, aob.Je, false));
            float f3 = this.M;
            canvas2.drawCircle(f3, f3, f3, paint3);
        }
        int i5 = this.M >> 1;
        canvas.save();
        canvas.drawBitmap(this.N, 0.0f, f2, (Paint) null);
        float f4 = (measuredHeight3 + measuredHeight) - i5;
        canvas.rotate(-90.0f, i5, f4);
        canvas.drawBitmap(this.N, 0.0f, r2 - this.M, (Paint) null);
        canvas.restore();
        canvas.save();
        float f5 = measuredWidth2 - i5;
        canvas.rotate(180.0f, f5, f4);
        Bitmap bitmap2 = this.N;
        int i6 = this.M;
        canvas.drawBitmap(bitmap2, measuredWidth2 - i6, r2 - i6, (Paint) null);
        canvas.restore();
        canvas.save();
        canvas.rotate(90.0f, f5, measuredHeight + i5);
        canvas.drawBitmap(this.N, measuredWidth2 - this.M, f2, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.T) {
            Path path = this.R;
            if (path == null) {
                path = new Path();
                this.R = path;
            }
            path.rewind();
            int measuredHeight = (getMeasuredHeight() - hl.L(32.0f)) >> 1;
            RectF rectF = hl.P;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.R.addRoundRect(rectF, hl.L(7.0f), hl.L(7.0f), Path.Direction.CCW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pgc pgcVar;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - hl.L(24.0f);
            float f = measuredWidth;
            int L = hl.L(12.0f) + ((int) (this.b * f));
            int L2 = hl.L(12.0f) + ((int) (this.c * f));
            float f2 = 0.0f;
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.r != null) {
                    int L3 = hl.L(24.0f);
                    if (L - L3 <= x && x <= L + L3 && y >= 0.0f && y <= getMeasuredHeight()) {
                        pgc pgcVar2 = this.s;
                        if (pgcVar2 != null) {
                            ((ex1) pgcVar2).b.O3.B(0.0f, 1);
                        }
                        this.f = true;
                        this.n = (int) (x - L);
                        this.Q.setTime((int) ((this.a / 1000.0f) * this.b));
                        this.Q.setCx(hl.L(4.0f) + getLeft() + L);
                        this.Q.a(true);
                        invalidate();
                        return true;
                    }
                    if (L2 - L3 > x || x > L3 + L2 || y < 0.0f || y > getMeasuredHeight()) {
                        this.Q.a(false);
                        return false;
                    }
                    pgc pgcVar3 = this.s;
                    if (pgcVar3 != null) {
                        ((ex1) pgcVar3).b.O3.B(0.0f, 1);
                    }
                    this.h = true;
                    this.n = (int) (x - L2);
                    this.Q.setTime((int) ((this.a / 1000.0f) * this.c));
                    this.Q.setCx((getLeft() + L2) - hl.L(4.0f));
                    this.Q.a(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f) {
                    pgc pgcVar4 = this.s;
                    if (pgcVar4 != null) {
                        ((ex1) pgcVar4).b.O3.B(0.0f, 0);
                    }
                    this.f = false;
                    invalidate();
                    this.Q.a(false);
                    return true;
                }
                if (this.h) {
                    pgc pgcVar5 = this.s;
                    if (pgcVar5 != null) {
                        ((ex1) pgcVar5).b.O3.B(0.0f, 0);
                    }
                    this.h = false;
                    invalidate();
                    this.Q.a(false);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.f) {
                    int i = (int) (x - this.n);
                    if (i < hl.L(16.0f)) {
                        L2 = hl.L(16.0f);
                    } else if (i <= L2) {
                        L2 = i;
                    }
                    float L4 = (L2 - hl.L(16.0f)) / f;
                    this.b = L4;
                    float f3 = this.c;
                    float f4 = f3 - L4;
                    float f5 = this.H;
                    if (f4 > f5) {
                        this.c = f5 + L4;
                    } else {
                        float f6 = this.I;
                        if (f6 != 0.0f && f4 < f6) {
                            float f7 = f3 - f6;
                            this.b = f7;
                            if (f7 < 0.0f) {
                                this.b = 0.0f;
                            } else {
                                f2 = f7;
                            }
                            this.Q.setCx(((hl.N(12.0f) + (f * f2)) + getLeft()) - hl.L(4.0f));
                            this.Q.setTime((int) ((this.a / 1000.0f) * this.b));
                            this.Q.a(true);
                            pgcVar = this.s;
                            if (pgcVar != null) {
                                float f8 = this.b;
                                ChatActivityEnterView chatActivityEnterView = ((ex1) pgcVar).b;
                                oec oecVar = chatActivityEnterView.T3;
                                if (oecVar != null) {
                                    oecVar.a = (long) (oecVar.r * f8);
                                    chatActivityEnterView.O3.B(f8, 2);
                                }
                            }
                            invalidate();
                            return true;
                        }
                    }
                    f2 = L4;
                    this.Q.setCx(((hl.N(12.0f) + (f * f2)) + getLeft()) - hl.L(4.0f));
                    this.Q.setTime((int) ((this.a / 1000.0f) * this.b));
                    this.Q.a(true);
                    pgcVar = this.s;
                    if (pgcVar != null) {
                    }
                    invalidate();
                    return true;
                }
                if (this.h) {
                    int i2 = (int) (x - this.n);
                    if (i2 >= L) {
                        L = i2 > hl.L(16.0f) + measuredWidth ? hl.L(16.0f) + measuredWidth : i2;
                    }
                    float L5 = (L - hl.L(16.0f)) / f;
                    this.c = L5;
                    float f9 = this.b;
                    float f10 = L5 - f9;
                    float f11 = this.H;
                    if (f10 > f11) {
                        this.b = L5 - f11;
                    } else {
                        float f12 = this.I;
                        if (f12 != 0.0f && f10 < f12) {
                            L5 = f9 + f12;
                            this.c = L5;
                            if (L5 > 1.0f) {
                                this.c = 1.0f;
                                L5 = 1.0f;
                            }
                        }
                    }
                    this.Q.setCx(hl.N(12.0f) + (f * L5) + getLeft() + hl.L(4.0f));
                    this.Q.a(true);
                    this.Q.setTime((int) ((this.a / 1000.0f) * this.c));
                    pgc pgcVar6 = this.s;
                    if (pgcVar6 != null) {
                        float f13 = this.c;
                        ChatActivityEnterView chatActivityEnterView2 = ((ex1) pgcVar6).b;
                        oec oecVar2 = chatActivityEnterView2.T3;
                        if (oecVar2 != null) {
                            oecVar2.b = (long) (oecVar2.r * f13);
                            chatActivityEnterView2.O3.B(f13, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setDelegate(pgc pgcVar) {
        this.s = pgcVar;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.O;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f) {
        this.H = f;
        float f2 = this.c;
        float f3 = this.b;
        if (f2 - f3 > f) {
            this.c = f3 + f;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f) {
        this.I = f;
    }

    public void setRoundFrames(boolean z) {
        this.J = z;
        if (z) {
            this.K = new Rect(hl.L(14.0f), hl.L(14.0f), hl.L(42.0f), hl.L(42.0f));
            this.L = new Rect();
        }
    }

    public void setTimeHintView(ogc ogcVar) {
        this.Q = ogcVar;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        this.b = 0.0f;
        this.c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.a = Long.parseLong(this.r.extractMetadata(9));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        invalidate();
    }
}
