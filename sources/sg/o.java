package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o extends View {
    public final Paint a;
    public final int[] b;
    public final Paint c;
    public final LongSparseArray d;
    public long e;
    public final Path f;
    public final float[] h;
    public final HashMap n;
    public final /* synthetic */ q r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Context context) {
        super(context);
        this.r = qVar;
        this.a = new Paint(1);
        this.b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new LongSparseArray();
        this.e = Long.MIN_VALUE;
        this.f = new Path();
        this.h = new float[8];
        this.n = new HashMap();
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i7 = 0; i7 < 12; i7++) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (i10 == 0) {
                    this.n.put(Long.valueOf((i7 << 16) + i10), Integer.valueOf(i0.a.f(i7 / 11.0f, -1, -16777216)));
                } else {
                    this.n.put(Long.valueOf((i7 << 16) + i10), Integer.valueOf(i10 < 6 ? i0.a.f(((5 - i10) / 4.0f) * 0.5f, this.b[i7], -16777216) : i0.a.f(org.telegram.messenger.camera.q.v(9 - i10, 5.0f, 0.5f, 0.5f), this.b[i7], -1)));
                }
            }
        }
    }

    public final void a(int i7) {
        for (Map.Entry entry : this.n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i7) {
                long longValue = ((Long) entry.getKey()).longValue();
                b((int) (longValue >> 16), (int) (longValue - (r5 << 16)));
                return;
            }
        }
        this.e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i7, int i10) {
        long j3 = (i7 << 16) + i10;
        this.e = j3;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j3) == null) {
            longSparseArray.put(this.e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12;
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10;
        int x10 = (int) ((motionEvent.getX() - getPaddingLeft()) / width);
        int y10 = (int) (motionEvent.getY() / height);
        Integer num = (Integer) this.n.get(Long.valueOf((x10 << 16) + y10));
        if (num != null) {
            int intValue = num.intValue();
            int i7 = q.q1;
            this.r.I0(intValue, 3);
            b(x10, y10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.r.l1;
        path.rewind();
        float f10 = 10.0f;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i7 = 0;
        while (true) {
            hashMap = this.n;
            if (i7 >= 12) {
                break;
            }
            for (int i10 = 0; i10 < 10; i10++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i7 << 16) + i10));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.a;
                    paint.setColor(intValue);
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set((i7 * width) + getPaddingLeft(), (i10 * height) + getPaddingTop(), ((i7 + 1) * width) + getPaddingLeft(), ((i10 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i7++;
        }
        canvas.restore();
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i11 >= longSparseArray.size()) {
                return;
            }
            long keyAt = longSparseArray.keyAt(i11);
            float floatValue = ((Float) longSparseArray.valueAt(i11)).floatValue();
            float min = this.e == keyAt ? Math.min(1.0f, floatValue + 0.045714285f) : Math.max(0.0f, floatValue - 0.10666667f);
            float f11 = f10;
            int i12 = (int) (keyAt >> 16);
            int i13 = (int) (keyAt - (i12 << 16));
            Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
            Paint paint2 = this.c;
            if (num2 != null) {
                paint2.setColor(org.telegram.messenger.g0.B(num2.intValue()) > 0.721f ? -15658735 : -1);
            }
            paint2.setStrokeWidth(xq.h.getInterpolation(min) * org.telegram.messenger.g0.L(3.0f));
            Path path2 = this.f;
            path2.rewind();
            RectF rectF3 = org.telegram.messenger.g0.P;
            float f12 = width;
            float f13 = height;
            HashMap hashMap2 = hashMap;
            rectF3.set((i12 * f12) + getPaddingLeft(), (i13 * f13) + getPaddingTop(), ((i12 + 1) * f12) + getPaddingLeft(), ((i13 + 1) * f13) + getPaddingTop());
            float L = (i12 == 0 && i13 == 0) ? org.telegram.messenger.g0.L(f11) : 0.0f;
            float[] fArr = this.h;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = (i12 == 11 && i13 == 0) ? org.telegram.messenger.g0.L(f11) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            float L3 = (i12 == 11 && i13 == 9) ? org.telegram.messenger.g0.L(f11) : 0.0f;
            fArr[5] = L3;
            fArr[4] = L3;
            float L4 = (i12 == 0 && i13 == 9) ? org.telegram.messenger.g0.L(f11) : 0.0f;
            fArr[7] = L4;
            fArr[6] = L4;
            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
            canvas.drawPath(path2, paint2);
            if (min > 0.0f || this.e == keyAt) {
                if (min < 1.0f) {
                    invalidate();
                }
                longSparseArray.setValueAt(i11, Float.valueOf(min));
            } else {
                longSparseArray.removeAt(i11);
                i11--;
                invalidate();
            }
            i11++;
            f10 = f11;
            width = f12;
            height = f13;
            hashMap = hashMap2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r0 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(motionEvent);
            } else if (actionMasked == 2) {
                c(motionEvent);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            c(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }
}
