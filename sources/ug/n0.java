package ug;

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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.q5;
import org.telegram.messenger.re;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class n0 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int a;
    public final tg.k1 b;
    public final q5 c;
    public final re d;
    public final tg.u0 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView w;
    public final l1 x;
    public lt0 y;

    public n0(Context context, int i3, Bitmap bitmap, Bitmap bitmap2, int i10, re reVar) {
        super(context);
        i9 i9Var = new i9(this, 25);
        this.J = new ArrayList();
        this.K = new Rect();
        this.a = i3;
        this.n = context instanceof BubbleActivity;
        tg.k1 k1Var = new tg.k1();
        this.b = k1Var;
        k1Var.a = new nb.a(25);
        q5 q5Var = new q5("MaskPaint", true);
        this.c = q5Var;
        this.d = reVar;
        this.f = bitmap;
        this.h = i10;
        tg.i0 i0Var = new tg.i0(getPaintingSize(), bitmap2, i10, null);
        i0Var.G = true;
        tg.u0 u0Var = new tg.u0(context, i0Var, bitmap, null, null);
        this.e = u0Var;
        u0Var.setAlpha(0.0f);
        u0Var.setDelegate(new y00(this));
        u0Var.setUndoStore(k1Var);
        u0Var.setQueue(q5Var);
        u0Var.setVisibility(4);
        u0Var.setBrush(new tg.f());
        u0Var.setBrushSize(i9Var.get());
        u0Var.setColor(-65536);
        addView(u0Var, mf.e(-1, -1, 51));
        l1 l1Var = new l1(context);
        this.x = l1Var;
        l1Var.b(0.05f, 1.0f);
        l1Var.setBrushWeight(i9Var.get());
        l1Var.setRenderView(u0Var);
        l1Var.setValueOverride(i9Var);
        l1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        l1Var.setAlpha(0.0f);
        addView(l1Var, mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, mf.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(k6.h0(k6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(bd.M0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.w = m10;
        k2.p1.t(m10, 1, 15.0f);
        int i11 = k6.ng;
        org.telegram.ui.Cells.y h02 = k6.h0(k6.r1(0.15f, k6.x0(null, i11, false)), 3, -1);
        n6 L = r6.L(0.15f, i11);
        m10.setBackground(h02);
        r6.k(m10, h02, null, L, null);
        m10.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        m10.setText(bd.M0(2131745956, null).toUpperCase());
        r6.V(m10, i11, null);
        m10.setGravity(17);
        frameLayout.addView(m10, mf.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private lt0 getPaintingSize() {
        lt0 lt0Var = this.y;
        if (lt0Var != null) {
            return lt0Var;
        }
        Bitmap bitmap = this.f;
        lt0 lt0Var2 = new lt0(bitmap.getWidth(), bitmap.getHeight());
        float f10 = 1280;
        lt0Var2.a = f10;
        float floor = (float) Math.floor((f10 * r0) / r1);
        lt0Var2.b = floor;
        if (floor > f10) {
            lt0Var2.b = f10;
            lt0Var2.a = (float) Math.floor((f10 * r1) / r0);
        }
        this.y = lt0Var2;
        return lt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        tg.u0 u0Var = this.e;
        float translationX = ((x10 - u0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / u0Var.getScaleX();
        float y9 = ((motionEvent.getY() - u0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / u0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-u0Var.getRotation());
        double d10 = y9;
        float measuredWidth = (u0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (u0Var.getMeasuredHeight() / 2.0f) + ((float) k2.p1.c(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        u0Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        this.F = f11;
        float f18 = 0.0f + f12;
        this.G = f18;
        tg.u0 u0Var = this.e;
        re reVar = this.d;
        if (reVar != null) {
            float f19 = reVar.c * 1.0f;
            int measuredWidth = u0Var.getMeasuredWidth();
            int measuredHeight = u0Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i3 = reVar.k;
            if (i3 == 90 || i3 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f14 / ((int) (reVar.e * r5)), f15 / ((int) (reVar.f * r6)));
            f16 = f19 * max;
            float C = com.google.android.recaptcha.internal.a.C(reVar.a, measuredWidth, f10, max);
            float f20 = reVar.c;
            f11 += C * f20;
            f18 += reVar.b * measuredHeight * f10 * max * f20;
            f17 = reVar.d + i3 + f13;
        } else {
            f16 = this.I * 1.0f;
            f17 = f13;
        }
        float f21 = f10 * f16;
        float f22 = Float.isNaN(f21) ? 1.0f : f21;
        u0Var.setScaleX(f22);
        u0Var.setScaleY(f22);
        u0Var.setTranslationX(f11);
        u0Var.setTranslationY(f18);
        u0Var.setRotation(f17);
        u0Var.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        re reVar;
        if (view == this.e && (reVar = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : org.telegram.messenger.g0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i3 = reVar.k;
            if (i3 == 90 || i3 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * reVar.e)) / reVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * reVar.f)) / reVar.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.F;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r1 + this.G;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
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
        Bitmap c2 = this.e.c(false, false);
        int i3 = this.h;
        if (i3 == 0) {
            return c2;
        }
        int width = c2.getWidth();
        int height = c2.getHeight();
        if ((i3 / 90) % 2 != 0) {
            width = c2.getHeight();
            height = c2.getWidth();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i3);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((-c2.getWidth()) / 2.0f, (-c2.getHeight()) / 2.0f, c2.getWidth() / 2.0f, c2.getHeight() / 2.0f);
        canvas.drawBitmap(c2, (Rect) null, rectF, new Paint(3));
        c2.recycle();
        return createBitmap;
    }

    public tg.u0 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        if (!this.n) {
            Typeface typeface = org.telegram.messenger.g0.a;
        }
        tg.u0 u0Var = this.e;
        int ceil = (int) Math.ceil((i13 - u0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - u0Var.getMeasuredHeight()) / 2;
        u0Var.layout(ceil, measuredHeight, u0Var.getMeasuredWidth() + ceil, u0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i14 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        float f10;
        float f11;
        this.H = true;
        int size = View.MeasureSpec.getSize(i3);
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
        this.I = 1.0f;
        measureChild(this.x, i3, i10);
        measureChild(this.r, i3, i10);
        this.H = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.J;
            arrayList.clear();
            Rect rect = this.K;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.e.setBrush(z10 ? new tg.d() : new tg.f());
    }
}
