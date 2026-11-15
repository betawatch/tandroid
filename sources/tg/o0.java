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
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ou;
import org.telegram.messenger.q5;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.nt0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class o0 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int a;
    public final sg.k1 b;
    public final q5 c;
    public final xe d;
    public final sg.u0 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView w;
    public final m1 x;
    public nt0 y;

    public o0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, xe xeVar) {
        super(context);
        ou ouVar = new ou(this, 27);
        this.J = new ArrayList();
        this.K = new Rect();
        this.a = i7;
        this.n = context instanceof BubbleActivity;
        sg.k1 k1Var = new sg.k1();
        this.b = k1Var;
        k1Var.a = new qb.a(25);
        q5 q5Var = new q5("MaskPaint", true);
        this.c = q5Var;
        this.d = xeVar;
        this.f = bitmap;
        this.h = i10;
        sg.i0 i0Var = new sg.i0(getPaintingSize(), bitmap2, i10, null);
        i0Var.G = true;
        sg.u0 u0Var = new sg.u0(context, i0Var, bitmap, null, null);
        this.e = u0Var;
        u0Var.setAlpha(0.0f);
        u0Var.setDelegate(new ff(this, 19));
        u0Var.setUndoStore(k1Var);
        u0Var.setQueue(q5Var);
        u0Var.setVisibility(4);
        u0Var.setBrush(new sg.f());
        u0Var.setBrushSize(ouVar.get());
        u0Var.setColor(-65536);
        addView(u0Var, ja.e(-1, -1, 51));
        m1 m1Var = new m1(context);
        this.x = m1Var;
        m1Var.b(0.05f, 1.0f);
        m1Var.setBrushWeight(ouVar.get());
        m1Var.setRenderView(u0Var);
        m1Var.setValueOverride(ouVar);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ja.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, ja.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(j6.h0(j6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(hd.M0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, ja.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.w = k10;
        i5.c.v(k10, 1, 15.0f);
        int i11 = j6.qg;
        org.telegram.ui.Cells.y h02 = j6.h0(j6.r1(0.15f, j6.x0(null, i11, false)), 3, -1);
        m6 K = q6.K(0.15f, i11);
        k10.setBackground(h02);
        q6.j(k10, h02, null, K, null);
        k10.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        k10.setText(hd.M0(2131745946, null).toUpperCase());
        q6.U(k10, i11, null);
        k10.setGravity(17);
        frameLayout.addView(k10, ja.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private nt0 getPaintingSize() {
        nt0 nt0Var = this.y;
        if (nt0Var != null) {
            return nt0Var;
        }
        Bitmap bitmap = this.f;
        nt0 nt0Var2 = new nt0(bitmap.getWidth(), bitmap.getHeight());
        float f10 = 1280;
        nt0Var2.a = f10;
        float floor = (float) Math.floor((f10 * r0) / r1);
        nt0Var2.b = floor;
        if (floor > f10) {
            nt0Var2.b = f10;
            nt0Var2.a = (float) Math.floor((f10 * r1) / r0);
        }
        this.y = nt0Var2;
        return nt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.u0 u0Var = this.e;
        float translationX = ((x10 - u0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / u0Var.getScaleX();
        float y10 = ((motionEvent.getY() - u0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / u0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-u0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (u0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (u0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
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
        sg.u0 u0Var = this.e;
        xe xeVar = this.d;
        if (xeVar != null) {
            float f19 = xeVar.c * 1.0f;
            int measuredWidth = u0Var.getMeasuredWidth();
            int measuredHeight = u0Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i7 = xeVar.k;
            if (i7 == 90 || i7 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f14 / ((int) (xeVar.e * r5)), f15 / ((int) (xeVar.f * r6)));
            f16 = f19 * max;
            float D = com.google.android.gms.internal.vision.e2.D(xeVar.a, measuredWidth, f10, max);
            float f20 = xeVar.c;
            f11 += D * f20;
            f18 += xeVar.b * measuredHeight * f10 * max * f20;
            f17 = xeVar.d + i7 + f13;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        xe xeVar;
        if (view == this.e && (xeVar = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : org.telegram.messenger.g0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i7 = xeVar.k;
            if (i7 == 90 || i7 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * xeVar.e)) / xeVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * xeVar.f)) / xeVar.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.F;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r1 + this.G;
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

    public sg.u0 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.n) {
            Typeface typeface = org.telegram.messenger.g0.a;
        }
        sg.u0 u0Var = this.e;
        int ceil = (int) Math.ceil((i13 - u0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - u0Var.getMeasuredHeight()) / 2;
        u0Var.layout(ceil, measuredHeight, u0Var.getMeasuredWidth() + ceil, u0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i14 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        this.H = true;
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
        this.I = 1.0f;
        measureChild(this.x, i7, i10);
        measureChild(this.r, i7, i10);
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
        this.e.setBrush(z10 ? new sg.d() : new sg.f());
    }
}
