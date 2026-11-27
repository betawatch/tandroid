// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class xw3 extends View {
    public final Paint a;
    public final TextPaint b;
    public final ArrayList c;
    public float[] d;
    public uv3 e;
    public final /* synthetic */ zw3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw3(zw3 zw3Var, Context context) {
        super(context);
        this.f = zw3Var;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(hl.n1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(hl.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        boolean z = false;
        setPadding(0, 0, 0, 0);
        if (zw3Var.F0(4)) {
            uw3 uw3Var = new uw3(this, 4, R.drawable.msg_limit_links, ob6.M0(2131744096, null));
            int i = zw3.C1;
            if (!yac.h(zw3Var.a).p()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                uw3Var.j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(aob.p1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                uw3Var.n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(uw3Var);
        }
        if (zw3Var.F0(0)) {
            arrayList.add(new uw3(this, 0, R.drawable.map_pin3, ob6.M0(2131744095, null)));
        }
        if (zw3Var.F0(5)) {
            vwc vwcVar = wwc.b;
            uw3[] uw3VarArr = {null};
            StringBuilder sb = new StringBuilder();
            sb.append(vwcVar == null ? "🌤" : vwcVar.c);
            sb.append(" ");
            sb.append(vwcVar == null ? wwc.a() ? "24°C" : "72°F" : vwcVar.a());
            CharSequence m = pv3.m(sb.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            CharSequence charSequence = m;
            if (uc7.s1(zw3Var.a).k4.D2.f) {
                charSequence = m;
                charSequence = m;
                if (jve.d("android.permission.ACCESS_COARSE_LOCATION") && vwcVar == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("___");
                    spannableStringBuilder.setSpan(new ya6(hl.L(68.0f), this), 0, spannableStringBuilder.length(), 33);
                    uw3VarArr[0] = new uw3(this, spannableStringBuilder);
                    jve.c(R.raw.permission_request_location, 2131747029, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new sa((byte) 10, new sa((byte) 9, new rx1((Object) this, (Object) uw3VarArr, (byte) 15), z), z));
                    charSequence = spannableStringBuilder;
                }
            }
            uw3 uw3Var2 = uw3VarArr[0];
            arrayList.add(uw3Var2 == null ? new uw3(this, charSequence) : uw3Var2);
        }
        if (zw3Var.F0(6)) {
            arrayList.add(new uw3(this, 6, R.drawable.filled_widget_captions, ob6.M0(2131744097, null)));
        }
        if (zw3Var.F0(1)) {
            arrayList.add(new uw3(this, 1, R.drawable.filled_widget_music, ob6.M0(2131744098, null)));
        }
        if (zw3Var.F0(2)) {
            arrayList.add(new uw3(this, 2, R.drawable.filled_premium_camera, ob6.M0(2131744094, null)));
        }
        if (zw3Var.F0(3)) {
            arrayList.add(new ww3(this));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = 0.0f;
                i2++;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            tw3 tw3Var = (tw3) obj;
            int i4 = tw3Var.e - 1;
            float[] fArr2 = this.d;
            float f = fArr2[i4];
            if (f > 0.0f) {
                fArr2[i4] = f + hl.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i4] = fArr3[i4] + tw3Var.h.e(false, tw3Var.b);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            tw3 tw3Var2 = (tw3) obj2;
            tw3Var2.a(canvas, bp1.z((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[tw3Var2.e - 1], 2.0f, getPaddingLeft()) + tw3Var2.d, uh9.y(48.0f, tw3Var2.e - 1, hl.L(12.0f)));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tw3) obj).b(true);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tw3) obj).b(false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.c;
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 1;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList.get(i5);
            i5++;
            tw3 tw3Var = (tw3) obj;
            tw3Var.d = f;
            float L = tw3Var.b + hl.L(10.0f) + f;
            if (L > paddingLeft) {
                i4++;
                tw3Var.d = 0.0f;
                f = tw3Var.b + hl.L(10.0f) + 0.0f;
            } else {
                f = L;
            }
            tw3Var.e = i4;
        }
        float[] fArr = this.d;
        if (fArr == null || fArr.length != i4) {
            this.d = new float[i4];
        } else {
            Arrays.fill(fArr, 0.0f);
        }
        int size3 = arrayList.size();
        while (i3 < size3) {
            Object obj2 = arrayList.get(i3);
            i3++;
            tw3 tw3Var2 = (tw3) obj2;
            int i6 = tw3Var2.e - 1;
            float[] fArr2 = this.d;
            float f2 = fArr2[i6];
            if (f2 > 0.0f) {
                fArr2[i6] = f2 + hl.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i6] = fArr3[i6] + tw3Var2.b;
        }
        setMeasuredDimension(size, uh9.y(12.0f, i4 - 1, uh9.y(36.0f, i4, hl.L(24.0f))));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tw3 tw3Var;
        uv3 uv3Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tw3Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            tw3Var = (tw3) obj;
            if (tw3Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            tw3 tw3Var2 = (tw3) obj2;
            if (tw3Var2 != tw3Var) {
                tw3Var2.g.c(false);
            }
        }
        if (tw3Var != null) {
            tw3Var.g.c((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
        }
        if (motionEvent.getAction() == 1 && tw3Var != null && (uv3Var = this.e) != null) {
            byte b = tw3Var.a;
            zw3 zw3Var = uv3Var.b;
            int i3 = zw3.C1;
            zw3Var.I0(b);
        }
        return tw3Var != null;
    }
}
