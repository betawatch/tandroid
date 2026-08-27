package zf;

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
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.tu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class v0 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public float D;
    public final ArrayList E;
    public final Rect F;
    public final int a;
    public final yf.s1 b;
    public final DispatchQueue c;
    public final MediaController.CropState d;
    public final yf.b1 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView v;
    public final w1 w;
    public tu0 x;
    public boolean y;

    public v0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        o0.b bVar = new o0.b(this, 22);
        this.E = new ArrayList();
        this.F = new Rect();
        this.a = i10;
        this.n = context instanceof BubbleActivity;
        yf.s1 s1Var = new yf.s1();
        this.b = s1Var;
        s1Var.a = new t0();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.c = dispatchQueue;
        this.d = cropState;
        this.f = bitmap;
        this.h = i11;
        yf.p0 p0Var = new yf.p0(getPaintingSize(), bitmap2, i11, null);
        p0Var.G = true;
        yf.b1 b1Var = new yf.b1(context, p0Var, bitmap, null, null);
        this.e = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setDelegate(new u0(this));
        b1Var.setUndoStore(s1Var);
        b1Var.setQueue(dispatchQueue);
        b1Var.setVisibility(4);
        b1Var.setBrush(new yf.f());
        b1Var.setBrushSize(bVar.get());
        b1Var.setColor(-65536);
        addView(b1Var, z5.e(-1, -1, 51));
        w1 w1Var = new w1(context);
        this.w = w1Var;
        w1Var.b(0.05f, 1.0f);
        w1Var.setBrushWeight(bVar.get());
        w1Var.setRenderView(b1Var);
        w1Var.setValueOverride(bVar);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, z5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(g6.f0(g6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView h = pa.h(frameLayout, textView, z5.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = h;
        pa.m(15.0f, 1, h);
        int i12 = g6.zf;
        h.setBackground(g6.f0(g6.l1(0.15f, g6.w0(null, i12, false)), 3, -1));
        h.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        h.setText(LocaleController.getString(R.string.Save).toUpperCase());
        h.setTextColor(g6.w0(null, i12, false));
        h.setGravity(17);
        frameLayout.addView(h, z5.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private tu0 getPaintingSize() {
        tu0 tu0Var = this.x;
        if (tu0Var != null) {
            return tu0Var;
        }
        Bitmap bitmap = this.f;
        tu0 tu0Var2 = new tu0(bitmap.getWidth(), bitmap.getHeight());
        float f10 = 1280;
        tu0Var2.a = f10;
        float floor = (float) Math.floor((f10 * r0) / r1);
        tu0Var2.b = floor;
        if (floor > f10) {
            tu0Var2.b = f10;
            tu0Var2.a = (float) Math.floor((f10 * r1) / r0);
        }
        this.x = tu0Var2;
        return tu0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        yf.b1 b1Var = this.e;
        float translationX = ((x8 - b1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b1Var.getScaleX();
        float y10 = ((motionEvent.getY() - b1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / b1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b1Var.getRotation());
        double d10 = y10;
        float measuredWidth = (b1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (b1Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.b(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        this.A = f11;
        float f18 = 0.0f + f12;
        this.B = f18;
        yf.b1 b1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f19 = cropState.cropScale * 1.0f;
            int measuredWidth = b1Var.getMeasuredWidth();
            int measuredHeight = b1Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f14 / ((int) (cropState.cropPw * r5)), f15 / ((int) (cropState.cropPh * r6)));
            f16 = f19 * max;
            float C = com.google.android.recaptcha.internal.a.C(cropState.cropPx, measuredWidth, f10, max);
            float f20 = cropState.cropScale;
            f11 += C * f20;
            f18 += cropState.cropPy * measuredHeight * f10 * max * f20;
            f17 = cropState.cropRotate + i10 + f13;
        } else {
            f16 = this.D * 1.0f;
            f17 = f13;
        }
        float f21 = f10 * f16;
        float f22 = Float.isNaN(f21) ? 1.0f : f21;
        b1Var.setScaleX(f22);
        b1Var.setScaleY(f22);
        b1Var.setTranslationX(f11);
        b1Var.setTranslationY(f18);
        b1Var.setRotation(f17);
        b1Var.invalidate();
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
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
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

    public yf.b1 getRenderView() {
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
        yf.b1 b1Var = this.e;
        int ceil = (int) Math.ceil((i14 - b1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - b1Var.getMeasuredHeight()) / 2;
        b1Var.layout(ceil, measuredHeight, b1Var.getMeasuredWidth() + ceil, b1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        this.C = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
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
        float f13 = i12;
        if (floor > f13) {
            f12 = (float) Math.floor((f11 * f13) / f10);
            floor = f13;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) floor, TLObject.FLAG_30));
        this.D = 1.0f;
        measureChild(this.w, i10, i11);
        measureChild(this.r, i10, i11);
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
        this.e.setBrush(z10 ? new yf.d() : new yf.f());
    }
}
