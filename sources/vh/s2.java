package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ic;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.yv0;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s2 extends FrameLayout implements RendererCommon.RendererEvents, us {
    public boolean D;
    public int a;
    public final kg.x b;
    public final SurfaceViewRenderer c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.g9 e;
    public final TextureView f;
    public View h;
    public Runnable n;
    public boolean r;
    public long s;
    public k2.t0 w;
    public boolean x;
    public float y;

    public s2(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setAlpha(0.75f);
        addView(g9Var, w7.b6.e(-1, -1, zs.E1));
        TextureView textureView = new TextureView(context);
        this.f = textureView;
        addView(textureView, w7.b6.e(-1, -1, zs.E1));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, w7.b6.e(-1, -1, zs.E1));
        textureViewRenderer.setAlpha(1.0f);
        this.c = null;
        kg.x xVar = new kg.x(context);
        this.b = xVar;
        xVar.setAlpha(0.0f);
        xVar.setVisibility(8);
        addView(xVar, w7.b6.e(-1, -1, zs.E1));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        return textureViewRenderer != null ? textureViewRenderer.isAvailable() : this.c != null;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        kg.x xVar = this.b;
        xVar.setVisibility(0);
        d dVar = (d) xVar.d;
        xVar.animate().alpha(this.D ? 1.0f : 0.0f).setInterpolator(gr.h).setDuration(320L).withEndAction(new yv0(11, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 0);
        dVar.setOnClickListener(runnable == null ? null : new og.u(4, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10, k2.t0 t0Var) {
        int i10;
        th.n0 n0Var;
        th.s0 s0Var;
        th.s0 s0Var2;
        TextureViewRenderer textureViewRenderer;
        int L;
        int width;
        if (t0Var == null) {
            long j11 = this.s;
            if (j11 != 0 && this.r && (textureViewRenderer = this.d) != null) {
                File file = new File(org.telegram.messenger.b8.z(4), org.telegram.ui.Cells.f1.n(j11, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = org.telegram.messenger.i0.L(100.0f);
                        i10 = 4;
                        L = (int) ((bitmap.getHeight() / bitmap.getWidth()) * org.telegram.messenger.i0.L(100.0f));
                    } else {
                        i10 = 4;
                        L = org.telegram.messenger.i0.L(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * org.telegram.messenger.i0.L(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, L, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, org.telegram.messenger.i0.L(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    if (this.s != j10) {
                        org.telegram.ui.Components.g9 g9Var = this.e;
                        if (j10 == 0) {
                            g9Var.b();
                        } else {
                            String absolutePath = new File(org.telegram.messenger.b8.z(i10), org.telegram.ui.Cells.f1.n(j10, "live", ".jpg")).getAbsolutePath();
                            if (j10 > 0) {
                                TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(j10));
                                ic l4 = ic.l(this.a, 1, Z1);
                                int d = Z1 != null ? org.telegram.ui.Components.r8.d(Z1.id) : i0.b.f(0.2f, -16777216, -1);
                                g9Var.getImageReceiver().u0(ic.g(absolutePath), "500_500_nocache", l4, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, d, -16777216), i0.b.f(0.4f, d, -16777216)}), 0L, null, Z1, 0);
                            } else {
                                TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-j10));
                                ic a2 = ic.a(1, L0);
                                int d10 = L0 != null ? org.telegram.ui.Components.r8.d(L0.id) : i0.b.f(0.2f, -16777216, -1);
                                g9Var.getImageReceiver().u0(ic.g(absolutePath), "500_500_nocache", a2, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, d10, -16777216), i0.b.f(0.4f, d10, -16777216)}), 0L, null, L0, 0);
                            }
                        }
                    }
                    this.s = j10;
                    this.w = t0Var;
                    if (this.r && t0Var != null && !t0Var.b) {
                        t0Var.b = true;
                        t0Var.b();
                    }
                    boolean z10 = t0Var == null && (s0Var2 = (th.s0) t0Var.a) != null && s0Var2.n();
                    if (t0Var == null && (s0Var = (th.s0) t0Var.a) != null && s0Var.a()) {
                        th.s0 s0Var3 = (th.s0) t0Var.a;
                        Objects.requireNonNull(s0Var3);
                        n0Var = new th.n0(s0Var3, 12);
                    } else {
                        n0Var = null;
                    }
                    c(n0Var, z10);
                }
            }
        }
        i10 = 4;
        if (this.s != j10) {
        }
        this.s = j10;
        this.w = t0Var;
        if (this.r) {
            t0Var.b = true;
            t0Var.b();
        }
        if (t0Var == null) {
        }
        if (t0Var == null) {
        }
        n0Var = null;
        c(n0Var, z10);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        th.s0 s0Var;
        th.n0 n0Var;
        if (i10 == zs.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            k2.t0 t0Var = this.w;
            if (t0Var == null || (s0Var = (th.s0) t0Var.a) == null || s0Var.g() != longValue) {
                return;
            }
            boolean n10 = ((th.s0) this.w.a).n();
            if (((th.s0) this.w.a).a()) {
                th.s0 s0Var2 = (th.s0) this.w.a;
                Objects.requireNonNull(s0Var2);
                n0Var = new th.n0(s0Var2, 12);
            } else {
                n0Var = null;
            }
            c(n0Var, n10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!org.telegram.messenger.i0.m0) {
            super.draw(canvas);
            return;
        }
        TextureView textureView = this.f;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        canvas.save();
        canvas.translate(textureView.getX(), textureView.getY());
        canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (org.telegram.messenger.i0.m0) {
            TextureViewRenderer textureViewRenderer = this.d;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(textureViewRenderer.getX(), textureViewRenderer.getY());
                    canvas.scale((textureViewRenderer.getScaleX() * textureViewRenderer.getWidth()) / bitmap.getWidth(), (textureViewRenderer.getScaleY() * textureViewRenderer.getHeight()) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
            TextureView textureView = this.f;
            if (view == textureView) {
                Bitmap bitmap2 = textureView.getBitmap();
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(textureView.getX(), textureView.getY());
                    canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap2.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10, boolean z11) {
        if (z10 || !z11) {
            if (z11) {
                z20.m(getTextureView().animate().alpha(z10 ? 1.0f : 0.0f), gr.h, 320L);
            } else {
                getTextureView().animate().cancel();
                getTextureView().setAlpha(z10 ? 1.0f : 0.0f);
            }
        }
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        View view = this.d;
        if (view == null) {
            view = this.c;
        }
        TextureView textureView = this.f;
        int measuredWidth2 = textureView.getMeasuredWidth();
        int measuredHeight2 = textureView.getMeasuredHeight();
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        float f7 = measuredWidth;
        float f10 = measuredWidth2;
        float f11 = measuredHeight;
        float f12 = measuredHeight2;
        float max = Math.max(f7 / f10, f11 / f12);
        textureView.setScaleX(max);
        textureView.setScaleY(max);
        textureView.setTranslationX((f7 - (f10 * max)) / 2.0f);
        textureView.setTranslationY(((f11 - (f12 * max)) / 2.0f) - (this.y / 2.0f));
        float measuredWidth3 = view.getMeasuredWidth();
        float measuredHeight3 = view.getMeasuredHeight();
        float max2 = Math.max(measuredWidth3 / f7, measuredHeight3 / f11);
        view.setScaleX(max2);
        view.setScaleY(max2);
        view.setTranslationX((f7 - (measuredWidth3 * max2)) / 2.0f);
        view.setTranslationY(((f11 - (measuredHeight3 * max2)) / 2.0f) - (this.y / 2.0f));
    }

    public Bitmap getBitmap() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.h == null) {
            View view = new View(getContext());
            this.h = view;
            addView(view, w7.b6.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f);
        }
        zs.f(this.a).c(this, zs.G2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        zs.f(this.a).n(this, zs.G2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.r) {
            k2.t0 t0Var = this.w;
            if (t0Var != null && !t0Var.b) {
                t0Var.b = true;
                t0Var.b();
            }
            this.r = true;
        }
        e(true, true);
        Runnable runnable = this.n;
        if (runnable != null) {
            runnable.run();
            this.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.e.layout(0, 0, i14, i15);
        this.b.layout(0, 0, i14, i15);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i14, i15);
        }
        TextureView textureView = this.f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.x = false;
        super.onMeasure(i10, i11);
        View view = textureViewRenderer != null ? textureViewRenderer : this.c;
        TextureView textureView = this.f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i10) {
        if (this.a == i10) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.a = i10;
            return;
        }
        zs f7 = zs.f(this.a);
        int i11 = zs.G2;
        f7.n(this, i11);
        this.a = i10;
        zs.f(i10).c(this, i11);
    }

    public void setKeyboardOffset(float f7) {
        this.y = f7;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
