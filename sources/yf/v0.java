package yf;

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
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.qu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class v0 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public float D;
    public final ArrayList E;
    public final Rect F;
    public final int a;
    public final xf.t1 b;
    public final DispatchQueue c;
    public final MediaController.CropState d;
    public final xf.c1 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView v;
    public final w1 w;
    public qu0 x;
    public boolean y;

    public v0(Context context, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, MediaController.CropState cropState) {
        super(context);
        m5.c0 c0Var = new m5.c0(this, 29);
        this.E = new ArrayList();
        this.F = new Rect();
        this.a = i9;
        this.n = context instanceof BubbleActivity;
        xf.t1 t1Var = new xf.t1();
        this.b = t1Var;
        t1Var.a = new t0();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.c = dispatchQueue;
        this.d = cropState;
        this.f = bitmap;
        this.h = i10;
        xf.q0 q0Var = new xf.q0(getPaintingSize(), bitmap2, i10, null);
        q0Var.G = true;
        xf.c1 c1Var = new xf.c1(context, q0Var, bitmap, null, null);
        this.e = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setDelegate(new u0(this));
        c1Var.setUndoStore(t1Var);
        c1Var.setQueue(dispatchQueue);
        c1Var.setVisibility(4);
        c1Var.setBrush(new xf.f());
        c1Var.setBrushSize(c0Var.get());
        c1Var.setColor(-65536);
        addView(c1Var, e6.e(-1, -1, 51));
        w1 w1Var = new w1(context);
        this.w = w1Var;
        w1Var.b(0.05f, 1.0f);
        w1Var.setBrushWeight(c0Var.get());
        w1Var.setRenderView(c1Var);
        w1Var.setValueOverride(c0Var);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, e6.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(f6.f0(f6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, e6.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = g10;
        j3.r0.u(15.0f, 1, g10);
        int i11 = f6.zf;
        g10.setBackground(f6.f0(f6.l1(0.15f, f6.w0(null, i11, false)), 3, -1));
        g10.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        g10.setText(LocaleController.getString(R.string.Save).toUpperCase());
        g10.setTextColor(f6.w0(null, i11, false));
        g10.setGravity(17);
        frameLayout.addView(g10, e6.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private qu0 getPaintingSize() {
        qu0 qu0Var = this.x;
        if (qu0Var != null) {
            return qu0Var;
        }
        Bitmap bitmap = this.f;
        qu0 qu0Var2 = new qu0(bitmap.getWidth(), bitmap.getHeight());
        float f10 = 1280;
        qu0Var2.a = f10;
        float floor = (float) Math.floor((f10 * r0) / r1);
        qu0Var2.b = floor;
        if (floor > f10) {
            qu0Var2.b = f10;
            qu0Var2.a = (float) Math.floor((f10 * r1) / r0);
        }
        this.x = qu0Var2;
        return qu0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        xf.c1 c1Var = this.e;
        float translationX = ((x10 - c1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c1Var.getScaleX();
        float y10 = ((motionEvent.getY() - c1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / c1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c1Var.getRotation());
        double d9 = y10;
        float measuredWidth = (c1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        float measuredHeight = (c1Var.getMeasuredHeight() / 2.0f) + ((float) j3.r0.b(radians, d9, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        this.A = f11;
        float f18 = 0.0f + f12;
        this.B = f18;
        xf.c1 c1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f19 = cropState.cropScale * 1.0f;
            int measuredWidth = c1Var.getMeasuredWidth();
            int measuredHeight = c1Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i9 = cropState.transformRotation;
            if (i9 == 90 || i9 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f14 / ((int) (cropState.cropPw * r5)), f15 / ((int) (cropState.cropPh * r6)));
            f16 = f19 * max;
            float C = e2.c.C(cropState.cropPx, measuredWidth, f10, max);
            float f20 = cropState.cropScale;
            f11 += C * f20;
            f18 += cropState.cropPy * measuredHeight * f10 * max * f20;
            f17 = cropState.cropRotate + i9 + f13;
        } else {
            f16 = this.D * 1.0f;
            f17 = f13;
        }
        float f21 = f10 * f16;
        float f22 = Float.isNaN(f21) ? 1.0f : f21;
        c1Var.setScaleX(f22);
        c1Var.setScaleY(f22);
        c1Var.setTranslationX(f11);
        c1Var.setTranslationY(f18);
        c1Var.setRotation(f17);
        c1Var.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i9 = cropState.transformRotation;
            if (i9 == 90 || i9 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.A;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + this.B;
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
        Bitmap c10 = this.e.c(false, false);
        int i9 = this.h;
        if (i9 == 0) {
            return c10;
        }
        int width = c10.getWidth();
        int height = c10.getHeight();
        if ((i9 / 90) % 2 != 0) {
            width = c10.getHeight();
            height = c10.getWidth();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i9);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-c10.getWidth()) / 2.0f, (-c10.getHeight()) / 2.0f, c10.getWidth() / 2.0f, c10.getHeight() / 2.0f);
        canvas.drawBitmap(c10, (Rect) null, rectF, new Paint(3));
        c10.recycle();
        return createBitmap;
    }

    public xf.c1 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (!this.n) {
            int i15 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        xf.c1 c1Var = this.e;
        int ceil = (int) Math.ceil((i13 - c1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - c1Var.getMeasuredHeight()) / 2;
        c1Var.layout(ceil, measuredHeight, c1Var.getMeasuredWidth() + ceil, c1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i14 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        float f10;
        float f11;
        this.C = true;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int i11 = AndroidUtilities.displaySize.y;
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
        this.D = 1.0f;
        measureChild(this.w, i9, i10);
        measureChild(this.r, i9, i10);
        this.C = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.E;
            arrayList.clear();
            Rect rect = this.F;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.e.setBrush(z10 ? new xf.d() : new xf.f());
    }
}
