package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.jv0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class z0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int a;
    public final pg.u1 b;
    public final DispatchQueue c;
    public final MediaController.CropState d;
    public final pg.d1 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView v;
    public final z1 w;
    public jv0 x;
    public boolean y;

    public z0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        ja jaVar = new ja(this, 8);
        this.I = new ArrayList();
        this.J = new Rect();
        this.a = i10;
        this.n = context instanceof BubbleActivity;
        pg.u1 u1Var = new pg.u1();
        this.b = u1Var;
        u1Var.a = new x0();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.c = dispatchQueue;
        this.d = cropState;
        this.f = bitmap;
        this.h = i11;
        pg.r0 r0Var = new pg.r0(getPaintingSize(), bitmap2, i11, null);
        r0Var.G = true;
        pg.d1 d1Var = new pg.d1(context, r0Var, bitmap, null, null);
        this.e = d1Var;
        d1Var.setAlpha(0.0f);
        d1Var.setDelegate(new y0(this));
        d1Var.setUndoStore(u1Var);
        d1Var.setQueue(dispatchQueue);
        d1Var.setVisibility(4);
        d1Var.setBrush(new pg.f());
        d1Var.setBrushSize(jaVar.get());
        d1Var.setColor(-65536);
        addView(d1Var, x5.e(-1, -1, 51));
        z1 z1Var = new z1(context);
        this.w = z1Var;
        z1Var.b(0.05f, 1.0f);
        z1Var.setBrushWeight(jaVar.get());
        z1Var.setRenderView(d1Var);
        z1Var.setValueOverride(jaVar);
        z1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        z1Var.setAlpha(0.0f);
        addView(z1Var, x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, x5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(h6.f0(h6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView f7 = q3.f(frameLayout, textView, x5.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = f7;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, f7);
        int i12 = h6.zf;
        f7.setBackground(h6.f0(h6.l1(0.15f, h6.w0(null, i12, false)), 3, -1));
        f7.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        f7.setText(LocaleController.getString(R.string.Save).toUpperCase());
        f7.setTextColor(h6.w0(null, i12, false));
        f7.setGravity(17);
        frameLayout.addView(f7, x5.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private jv0 getPaintingSize() {
        jv0 jv0Var = this.x;
        if (jv0Var != null) {
            return jv0Var;
        }
        Bitmap bitmap = this.f;
        jv0 jv0Var2 = new jv0(bitmap.getWidth(), bitmap.getHeight());
        float f7 = 1280;
        jv0Var2.a = f7;
        float floor = (float) Math.floor((f7 * r0) / r1);
        jv0Var2.b = floor;
        if (floor > f7) {
            jv0Var2.b = f7;
            jv0Var2.a = (float) Math.floor((f7 * r1) / r0);
        }
        this.x = jv0Var2;
        return jv0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        pg.d1 d1Var = this.e;
        float translationX = ((x10 - d1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / d1Var.getScaleX();
        float y3 = ((motionEvent.getY() - d1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / d1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-d1Var.getRotation());
        double d10 = y3;
        float measuredWidth = (d1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (d1Var.getMeasuredHeight() / 2.0f) + ((float) hg.c.e(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        d1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        this.E = f10;
        float f17 = 0.0f + f11;
        this.F = f17;
        pg.d1 d1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f18 = cropState.cropScale * 1.0f;
            int measuredWidth = d1Var.getMeasuredWidth();
            int measuredHeight = d1Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f13 / ((int) (cropState.cropPw * r5)), f14 / ((int) (cropState.cropPh * r6)));
            f15 = f18 * max;
            float C = com.google.android.gms.internal.vision.e2.C(cropState.cropPx, measuredWidth, f7, max);
            float f19 = cropState.cropScale;
            f10 += C * f19;
            f17 += cropState.cropPy * measuredHeight * f7 * max * f19;
            f16 = cropState.cropRotate + i10 + f12;
        } else {
            f15 = this.H * 1.0f;
            f16 = f12;
        }
        float f20 = f7 * f15;
        float f21 = Float.isNaN(f20) ? 1.0f : f20;
        d1Var.setScaleX(f21);
        d1Var.setScaleY(f21);
        d1Var.setTranslationX(f10);
        d1Var.setTranslationY(f17);
        d1Var.setRotation(f16);
        d1Var.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        MediaController.CropState cropState;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.E;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + this.F;
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
        int i10 = this.h;
        if (i10 == 0) {
            return c10;
        }
        int width = c10.getWidth();
        int height = c10.getHeight();
        if ((i10 / 90) % 2 != 0) {
            width = c10.getHeight();
            height = c10.getWidth();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-c10.getWidth()) / 2.0f, (-c10.getHeight()) / 2.0f, c10.getWidth() / 2.0f, c10.getHeight() / 2.0f);
        canvas.drawBitmap(c10, (Rect) null, rectF, new Paint(3));
        c10.recycle();
        return createBitmap;
    }

    public pg.d1 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        pg.d1 d1Var = this.e;
        int ceil = (int) Math.ceil((i14 - d1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - d1Var.getMeasuredHeight()) / 2;
        d1Var.layout(ceil, measuredHeight, d1Var.getMeasuredWidth() + ceil, d1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        this.G = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            f7 = bitmap.getHeight();
        } else {
            f7 = size2;
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * f7) / f10);
        float f12 = i12;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / f7);
            floor = f12;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) floor, TLObject.FLAG_30));
        this.H = 1.0f;
        measureChild(this.w, i10, i11);
        measureChild(this.r, i10, i11);
        this.G = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.I;
            arrayList.clear();
            Rect rect = this.J;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
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

    public void setEraser(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.e.setBrush(z10 ? new pg.d() : new pg.f());
    }
}
