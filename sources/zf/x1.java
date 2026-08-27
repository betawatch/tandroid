package zf;

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
import g7.o8;
import h7.z5;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.di1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final tu0 r0;
    public final int s0;
    public boolean t0;
    public final y5 u0;
    public final qg.f v0;
    public final Bitmap w0;
    public boolean x0;
    public boolean y0;
    public final Rect z0;

    public x1(Context context, PointF pointF, tu0 tu0Var, String str, int i10) {
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
        this.r0 = tu0Var;
        qg.f fVar = new qg.f(this, context);
        this.v0 = fVar;
        addView(fVar, z5.c(-1.0f, -1));
        er erVar = er.h;
        this.q0 = new y5(fVar, 0L, 500L, erVar);
        this.u0 = new y5(fVar, 0L, 350L, erVar);
        this.s0 = i10;
        Bitmap q6 = z7.q(new t0.c(str, 11), 1920, 1920, 0, false);
        this.w0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.l(round, "_", round);
    }

    @Override // zf.j
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAnchor() {
        return this.o0;
    }

    public tu0 getBaseSize() {
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

    @Override // zf.j
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float dp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float t10 = rl.t(dp, 2.0f, getPositionX(), scaleX);
        return new yj0(t10, rl.t(dp2, 2.0f, getPositionY(), scaleX), ((dp3 * scaleX) + t10) - t10, dp2 * scaleX);
    }

    @Override // zf.j
    public final void k() {
        tu0 tu0Var = this.r0;
        float f10 = tu0Var.a / 2.0f;
        float f11 = tu0Var.b / 2.0f;
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
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.r0;
        float f10 = tu0Var.a;
        float f11 = tu0Var.b;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30));
    }

    public final String q(int i10) {
        TLObject tLObject = this.m0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), true).getAbsolutePath();
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
        qg.f fVar = this.v0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.y0 || this.x0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        jb.d dVar = new jb.d();
        dVar.a = true;
        zzd a2 = o8.a(new jb.e(dVar));
        this.x0 = true;
        a2.g(eb.a.a(bitmap, this.s0)).addOnSuccessListener(new t0.c(this, 12)).addOnFailureListener(new di1(14, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        qg.f fVar = this.v0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public x1(Context context, PointF pointF, tu0 tu0Var, TLObject tLObject) {
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
        this.r0 = tu0Var;
        qg.f fVar = new qg.f(this, context);
        this.v0 = fVar;
        addView(fVar, z5.c(-1.0f, -1));
        er erVar = er.h;
        this.q0 = new y5(fVar, 0L, 500L, erVar);
        this.u0 = new y5(fVar, 0L, 350L, erVar);
        k();
    }
}
