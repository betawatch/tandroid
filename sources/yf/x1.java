package yf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import f7.m8;
import g7.e6;
import kh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.ei1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x1 extends j {
    public final Rect A0;
    public final Paint B0;
    public MediaController.CropState C0;
    public final TLObject m0;
    public final String n0;
    public final int o0;
    public boolean p0;
    public final y5 q0;
    public final qu0 r0;
    public final int s0;
    public boolean t0;
    public final y5 u0;
    public final fh.d2 v0;
    public final Bitmap w0;
    public boolean x0;
    public boolean y0;
    public final Rect z0;

    public x1(Context context, PointF pointF, qu0 qu0Var, String str, int i9) {
        super(context, pointF);
        this.o0 = -1;
        this.p0 = false;
        this.t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.n0 = str;
        this.r0 = qu0Var;
        fh.d2 d2Var = new fh.d2(this, context);
        this.v0 = d2Var;
        addView(d2Var, e6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.q0 = new y5(d2Var, 0L, 500L, grVar);
        this.u0 = new y5(d2Var, 0L, 350L, grVar);
        this.s0 = i9;
        Bitmap q10 = a8.q(new t0.c(str, 11), 1920, 1920, 0, false);
        this.w0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return e2.c.l(round, "_", round);
    }

    @Override // yf.j
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAnchor() {
        return this.o0;
    }

    public qu0 getBaseSize() {
        return this.r0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.s0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // yf.j
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new wj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float dp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((dp3 * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override // yf.j
    public final void k() {
        qu0 qu0Var = this.r0;
        float f10 = qu0Var.a / 2.0f;
        float f11 = qu0Var.b / 2.0f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.r0;
        float f10 = qu0Var.a;
        float f11 = qu0Var.b;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30));
    }

    public final String q(int i9) {
        TLObject tLObject = this.m0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i9).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.n0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.p0;
        this.p0 = z11;
        if (!z10) {
            this.q0.f(z11, true);
        }
        fh.d2 d2Var = this.v0;
        if (d2Var != null) {
            d2Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.y0 || this.x0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ib.d dVar = new ib.d();
        dVar.a = true;
        zzd a2 = m8.a(new ib.e(dVar));
        this.x0 = true;
        a2.g(db.a.a(bitmap, this.s0)).addOnSuccessListener(new t0.c(this, 12)).addOnFailureListener(new ei1(13, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        fh.d2 d2Var = this.v0;
        if (d2Var != null) {
            d2Var.invalidate();
        }
    }

    public x1(Context context, PointF pointF, qu0 qu0Var, TLObject tLObject) {
        super(context, pointF);
        this.o0 = -1;
        this.p0 = false;
        this.t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.m0 = tLObject;
        this.r0 = qu0Var;
        fh.d2 d2Var = new fh.d2(this, context);
        this.v0 = d2Var;
        addView(d2Var, e6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.q0 = new y5(d2Var, 0L, 500L, grVar);
        this.u0 = new y5(d2Var, 0L, 350L, grVar);
        k();
    }
}
