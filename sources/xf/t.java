package xf;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t extends View {
    public final Paint a;
    public final int[] b;
    public final Paint c;
    public final LongSparseArray d;
    public long e;
    public final Path f;
    public final float[] h;
    public final HashMap n;
    public final /* synthetic */ x r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, Context context) {
        super(context);
        this.r = xVar;
        this.a = new Paint(1);
        this.b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new LongSparseArray();
        this.e = Long.MIN_VALUE;
        this.f = new Path();
        this.h = new float[8];
        this.n = new HashMap();
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i9 = 0; i9 < 12; i9++) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (i10 == 0) {
                    this.n.put(Long.valueOf((i9 << 16) + i10), Integer.valueOf(i0.a.d(i9 / 11.0f, -1, -16777216)));
                } else {
                    this.n.put(Long.valueOf((i9 << 16) + i10), Integer.valueOf(i10 < 6 ? i0.a.d(((5 - i10) / 4.0f) * 0.5f, this.b[i9], -16777216) : i0.a.d(ll.c(9 - i10, 5.0f, 0.5f, 0.5f), this.b[i9], -1)));
                }
            }
        }
    }

    public final void a(int i9) {
        for (Map.Entry entry : this.n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i9) {
                long longValue = ((Long) entry.getKey()).longValue();
                b((int) (longValue >> 16), (int) (longValue - (r5 << 16)));
                return;
            }
        }
        this.e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i9, int i10) {
        long j10 = (i9 << 16) + i10;
        this.e = j10;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j10) == null) {
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
            int i9 = x.s;
            this.r.m(intValue, 3);
            b(x10, y10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.r.e;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i9 = 0;
        while (true) {
            hashMap = this.n;
            if (i9 >= 12) {
                break;
            }
            for (int i10 = 0; i10 < 10; i10++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i9 << 16) + i10));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.a;
                    paint.setColor(intValue);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set((i9 * width) + getPaddingLeft(), (i10 * height) + getPaddingTop(), ((i9 + 1) * width) + getPaddingLeft(), ((i10 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i9++;
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
            int i12 = (int) (keyAt >> 16);
            int i13 = (int) (keyAt - (i12 << 16));
            Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
            Paint paint2 = this.c;
            if (num2 != null) {
                paint2.setColor(AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f ? -15658735 : -1);
            }
            paint2.setStrokeWidth(gr.h.getInterpolation(min) * AndroidUtilities.dp(3.0f));
            Path path2 = this.f;
            path2.rewind();
            RectF rectF3 = AndroidUtilities.rectTmp;
            float f10 = width;
            float f11 = height;
            HashMap hashMap2 = hashMap;
            rectF3.set((i12 * f10) + getPaddingLeft(), (i13 * f11) + getPaddingTop(), ((i12 + 1) * f10) + getPaddingLeft(), ((i13 + 1) * f11) + getPaddingTop());
            float dp = (i12 == 0 && i13 == 0) ? AndroidUtilities.dp(10.0f) : 0.0f;
            float[] fArr = this.h;
            fArr[1] = dp;
            fArr[0] = dp;
            float dp2 = (i12 == 11 && i13 == 0) ? AndroidUtilities.dp(10.0f) : 0.0f;
            fArr[3] = dp2;
            fArr[2] = dp2;
            float dp3 = (i12 == 11 && i13 == 9) ? AndroidUtilities.dp(10.0f) : 0.0f;
            fArr[5] = dp3;
            fArr[4] = dp3;
            float dp4 = (i12 == 0 && i13 == 9) ? AndroidUtilities.dp(10.0f) : 0.0f;
            fArr[7] = dp4;
            fArr[6] = dp4;
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
            width = f10;
            height = f11;
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
