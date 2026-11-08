package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.q5;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class o0 extends FrameLayout {
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int a;
    public final sg.m1 b;
    public final q5 c;
    public final ye d;
    public final sg.w0 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView w;
    public final m1 x;
    public mt0 y;

    public o0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ye yeVar) {
        super(context);
        vy vyVar = new vy(this, 20);
        this.I = new ArrayList();
        this.J = new Rect();
        this.a = i7;
        this.n = context instanceof BubbleActivity;
        sg.m1 m1Var = new sg.m1();
        this.b = m1Var;
        m1Var.a = new w7.s(24, false);
        q5 q5Var = new q5("MaskPaint", true);
        this.c = q5Var;
        this.d = yeVar;
        this.f = bitmap;
        this.h = i10;
        sg.j0 j0Var = new sg.j0(getPaintingSize(), bitmap2, i10, null);
        j0Var.G = true;
        sg.w0 w0Var = new sg.w0(context, j0Var, bitmap, null, null);
        this.e = w0Var;
        w0Var.setAlpha(0.0f);
        w0Var.setDelegate(new rt(this, 17));
        w0Var.setUndoStore(m1Var);
        w0Var.setQueue(q5Var);
        w0Var.setVisibility(4);
        w0Var.setBrush(new sg.f());
        w0Var.setBrushSize(vyVar.get());
        w0Var.setColor(-65536);
        addView(w0Var, ha.e(-1, -1, 51));
        m1 m1Var2 = new m1(context);
        this.x = m1Var2;
        m1Var2.b(0.05f, 1.0f);
        m1Var2.setBrushWeight(vyVar.get());
        m1Var2.setRenderView(w0Var);
        m1Var2.setValueOverride(vyVar);
        m1Var2.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var2.setAlpha(0.0f);
        addView(m1Var2, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, ha.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(k6.h0(k6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(id.M0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.w = i11;
        com.google.android.recaptcha.internal.a.q(i11, 1, 15.0f);
        int i12 = k6.ng;
        org.telegram.ui.Cells.y h02 = k6.h0(k6.r1(0.15f, k6.x0(null, i12, false)), 3, -1);
        n6 L = r6.L(0.15f, i12);
        i11.setBackground(h02);
        r6.k(i11, h02, null, L, null);
        i11.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        i11.setText(id.M0(2131745949, null).toUpperCase());
        r6.V(i11, i12, null);
        i11.setGravity(17);
        frameLayout.addView(i11, ha.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private mt0 getPaintingSize() {
        mt0 mt0Var = this.y;
        if (mt0Var != null) {
            return mt0Var;
        }
        Bitmap bitmap = this.f;
        mt0 mt0Var2 = new mt0(bitmap.getWidth(), bitmap.getHeight());
        float f10 = 1280;
        mt0Var2.a = f10;
        float floor = (float) Math.floor((f10 * r0) / r1);
        mt0Var2.b = floor;
        if (floor > f10) {
            mt0Var2.b = f10;
            mt0Var2.a = (float) Math.floor((f10 * r1) / r0);
        }
        this.y = mt0Var2;
        return mt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.w0 w0Var = this.e;
        float translationX = ((x10 - w0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / w0Var.getScaleX();
        float y10 = ((motionEvent.getY() - w0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / w0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-w0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (w0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (w0Var.getMeasuredHeight() / 2.0f) + ((float) jg.g.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        w0Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        this.E = f11;
        float f18 = 0.0f + f12;
        this.F = f18;
        sg.w0 w0Var = this.e;
        ye yeVar = this.d;
        if (yeVar != null) {
            float f19 = yeVar.c * 1.0f;
            int measuredWidth = w0Var.getMeasuredWidth();
            int measuredHeight = w0Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i7 = yeVar.k;
            if (i7 == 90 || i7 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f14 / ((int) (yeVar.e * r5)), f15 / ((int) (yeVar.f * r6)));
            f16 = f19 * max;
            float D = com.google.android.recaptcha.internal.a.D(yeVar.a, measuredWidth, f10, max);
            float f20 = yeVar.c;
            f11 += D * f20;
            f18 += yeVar.b * measuredHeight * f10 * max * f20;
            f17 = yeVar.d + i7 + f13;
        } else {
            f16 = this.H * 1.0f;
            f17 = f13;
        }
        float f21 = f10 * f16;
        float f22 = Float.isNaN(f21) ? 1.0f : f21;
        w0Var.setScaleX(f22);
        w0Var.setScaleY(f22);
        w0Var.setTranslationX(f11);
        w0Var.setTranslationY(f18);
        w0Var.setRotation(f17);
        w0Var.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ye yeVar;
        if (view == this.e && (yeVar = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : org.telegram.messenger.g0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i7 = yeVar.k;
            if (i7 == 90 || i7 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * yeVar.e)) / yeVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * yeVar.f)) / yeVar.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.E;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r1 + this.F;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    public Bitmap getBitmap() {
        Bitmap c10 = this.e.c(false, false);
        int i7 = this.h;
        if (i7 == 0) {
            return c10;
        }
        int width = c10.getWidth();
        int height = c10.getHeight();
        if ((i7 / 90) % 2 != 0) {
            width = c10.getHeight();
            height = c10.getWidth();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i7);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((-c10.getWidth()) / 2.0f, (-c10.getHeight()) / 2.0f, c10.getWidth() / 2.0f, c10.getHeight() / 2.0f);
        canvas.drawBitmap(c10, (Rect) null, rectF, new Paint(3));
        c10.recycle();
        return createBitmap;
    }

    public sg.w0 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.n) {
            Typeface typeface = org.telegram.messenger.g0.a;
        }
        sg.w0 w0Var = this.e;
        int ceil = (int) Math.ceil((i13 - w0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - w0Var.getMeasuredHeight()) / 2;
        w0Var.layout(ceil, measuredHeight, w0Var.getMeasuredWidth() + ceil, w0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i14 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        this.G = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int i11 = org.telegram.messenger.g0.q.y;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            f11 = bitmap.getWidth();
            f10 = bitmap.getHeight();
        } else {
            f10 = size2;
            f11 = size;
        }
        float f12 = size;
        float floor = (float) Math.floor((f12 * f10) / f11);
        float f13 = i11;
        if (floor > f13) {
            f12 = (float) Math.floor((f11 * f13) / f10);
            floor = f13;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) floor, TLObject.FLAG_30));
        this.H = 1.0f;
        measureChild(this.x, i7, i10);
        measureChild(this.r, i7, i10);
        this.G = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.I;
            arrayList.clear();
            Rect rect = this.J;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z9) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        this.e.setBrush(z9 ? new sg.d() : new sg.f());
    }
}
