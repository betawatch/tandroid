// default package

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
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class u76 extends FrameLayout implements RendererCommon.RendererEvents, gk7 {
    public long E;
    public c30 F;
    public boolean G;
    public float H;
    public boolean I;
    public int a;
    public final oi3 b;
    public TextureViewRenderer c;
    public TextureView d;
    public a86 e;
    public s71 f;
    public Bitmap h;
    public long n;
    public boolean r;
    public final be0 s;
    public View w;
    public Runnable x;
    public boolean y;

    public u76(Context context, int i) {
        super(context);
        this.a = i;
        be0 be0Var = new be0(context);
        this.s = be0Var;
        be0Var.setAlpha(0.75f);
        addView(be0Var, nme.e(-1, -1, kk7.D1));
        oi3 oi3Var = new oi3(context);
        this.b = oi3Var;
        oi3Var.setAlpha(0.0f);
        oi3Var.setVisibility(8);
        addView(oi3Var, nme.e(-1, -1, kk7.D1));
    }

    private void setStreamMode(boolean z) {
        View view = this.b;
        if (z) {
            if (this.e == null) {
                int indexOfChild = indexOfChild(view);
                s71 s71Var = new s71(getContext(), (byte) 14);
                this.f = s71Var;
                addView(s71Var, indexOfChild, nme.e(-1, -1, kk7.D1));
                a86 a86Var = new a86(getContext(), new gi3(this));
                this.e = a86Var;
                addView(a86Var, indexOfChild + 1, nme.e(-1, -1, kk7.D1));
                this.e.setAlpha(0.0f);
            }
        } else if (this.d == null) {
            int indexOfChild2 = indexOfChild(view);
            TextureView textureView = new TextureView(getContext());
            this.d = textureView;
            addView(textureView, indexOfChild2, nme.e(-1, -1, kk7.D1));
            TextureViewRenderer textureViewRenderer = new TextureViewRenderer(getContext());
            this.c = textureViewRenderer;
            textureViewRenderer.setOpaque(false);
            this.c.setEnableHardwareScaler(true);
            this.c.setIsCamera(true);
            this.c.setRotateTextureWithScreen(true);
            this.c.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(this.c, indexOfChild2 + 1, nme.e(-1, -1, kk7.D1));
            this.c.setAlpha(1.0f);
            if (isAttachedToWindow()) {
                c();
            }
        }
        a86 a86Var2 = this.e;
        if (a86Var2 != null) {
            a86Var2.setVisibility(z ? 0 : 8);
            this.f.setVisibility(z ? 0 : 8);
        }
        TextureViewRenderer textureViewRenderer2 = this.c;
        if (textureViewRenderer2 == null) {
            textureViewRenderer2 = null;
        }
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.setVisibility(z ? 8 : 0);
            this.d.setVisibility(z ? 8 : 0);
        }
        if (this.r != z) {
            this.r = z;
            this.y = false;
            f(false, false);
            requestLayout();
        }
    }

    public final void a(t76 t76Var) {
        if (t76Var instanceof um9) {
            setStreamMode(true);
            ((um9) t76Var).L(this.e);
        } else if (t76Var instanceof nm9) {
            setStreamMode(false);
            ((nm9) t76Var).L(getSink());
        }
    }

    public final void b(View view, int i, int i2) {
        float measuredWidth = view.getMeasuredWidth();
        float f = i;
        float measuredHeight = view.getMeasuredHeight();
        float f2 = i2;
        float max = Math.max(measuredWidth / f, measuredHeight / f2);
        view.setScaleX(max);
        view.setScaleY(max);
        view.setTranslationX((f - (measuredWidth * max)) / 2.0f);
        view.setTranslationY(((f2 - (measuredHeight * max)) / 2.0f) - (this.H / 2.0f));
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            this.c.setBackgroundRenderer(this.d);
        }
    }

    public final void d(Runnable runnable, boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        oi3 oi3Var = this.b;
        oi3Var.setVisibility(0);
        u41 u41Var = (u41) oi3Var.d;
        oi3Var.animate().alpha(this.I ? 1.0f : 0.0f).setInterpolator(s33.h).setDuration(320L).withEndAction(new x6c((byte) 23, this, z)).start();
        u41Var.setVisibility((!z || runnable == null) ? 8 : 0);
        u41Var.setOnClickListener(runnable == null ? null : new nk3(runnable, (byte) 5));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        t76 t76Var;
        r76 r76Var;
        if (i == kk7.F2) {
            long longValue = ((Long) objArr[0]).longValue();
            c30 c30Var = this.F;
            if (c30Var == null || (t76Var = (t76) c30Var.b) == null || t76Var.j() != longValue) {
                return;
            }
            boolean p = ((t76) this.F.b).p();
            if (((t76) this.F.b).b()) {
                t76 t76Var2 = (t76) this.F.b;
                Objects.requireNonNull(t76Var2);
                r76Var = new r76(t76Var2, (byte) 9);
            } else {
                r76Var = null;
            }
            d(r76Var, p);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!gl.m0) {
            super.draw(canvas);
            return;
        }
        if (this.r) {
            if (this.f != null) {
                canvas.save();
                canvas.translate(this.f.getX(), this.f.getY());
                this.f.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        TextureView textureView = this.d;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.scale((this.d.getScaleX() * this.d.getWidth()) / bitmap.getWidth(), (this.d.getScaleY() * this.d.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!gl.m0 || !(view instanceof TextureView) || view.getVisibility() != 0) {
            return super.drawChild(canvas, view, j);
        }
        TextureView textureView = (TextureView) view;
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return true;
        }
        canvas.save();
        canvas.translate(textureView.getX(), textureView.getY());
        canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j, c30 c30Var) {
        int i;
        r76 r76Var;
        t76 t76Var;
        t76 t76Var2;
        int L;
        int width;
        TextureView videoTextureView = getVideoTextureView();
        if (c30Var == null) {
            long j2 = this.E;
            if (j2 != 0 && this.y && videoTextureView != null) {
                File file = new File(ba4.z(4), ug8.n(j2, "live", ".jpg"));
                Bitmap bitmap = videoTextureView.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = gl.L(100.0f);
                        i = 4;
                        L = (int) ((bitmap.getHeight() / bitmap.getWidth()) * gl.L(100.0f));
                    } else {
                        i = 4;
                        L = gl.L(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * gl.L(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, L, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, gl.L(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    if (this.E != j) {
                        be0 be0Var = this.s;
                        if (j == 0) {
                            be0Var.b();
                        } else {
                            String absolutePath = new File(ba4.z(i), ug8.n(j, "live", ".jpg")).getAbsolutePath();
                            int i2 = this.a;
                            if (j > 0) {
                                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                                gl5 l = gl5.l(this.a, 1, V1);
                                int c = V1 != null ? pb0.c(V1.id) : bm2.f(0.2f, -16777216, -1);
                                be0Var.getImageReceiver().Y(gl5.g(absolutePath), "500_500_nocache", l, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.f(0.2f, c, -16777216), bm2.f(0.4f, c, -16777216)}), 0L, null, V1, 0);
                            } else {
                                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
                                gl5 a = gl5.a(1, K0);
                                int c2 = K0 != null ? pb0.c(K0.id) : bm2.f(0.2f, -16777216, -1);
                                be0Var.getImageReceiver().Y(gl5.g(absolutePath), "500_500_nocache", a, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.f(0.2f, c2, -16777216), bm2.f(0.4f, c2, -16777216)}), 0L, null, K0, 0);
                            }
                        }
                    }
                    this.E = j;
                    this.F = c30Var;
                    if (this.y && c30Var != null && !c30Var.a) {
                        c30Var.a = true;
                        c30Var.m();
                    }
                    boolean z = c30Var == null && (t76Var2 = (t76) c30Var.b) != null && t76Var2.p();
                    if (c30Var == null && (t76Var = (t76) c30Var.b) != null && t76Var.b()) {
                        t76 t76Var3 = (t76) c30Var.b;
                        Objects.requireNonNull(t76Var3);
                        r76Var = new r76(t76Var3, (byte) 9);
                    } else {
                        r76Var = null;
                    }
                    d(r76Var, z);
                }
            }
        }
        i = 4;
        if (this.E != j) {
        }
        this.E = j;
        this.F = c30Var;
        if (this.y) {
            c30Var.a = true;
            c30Var.m();
        }
        if (c30Var == null) {
        }
        if (c30Var == null) {
        }
        r76Var = null;
        d(r76Var, z);
    }

    public final void f(boolean z, boolean z2) {
        View textureView;
        if ((z || !z2) && (textureView = getTextureView()) != null) {
            if (z2) {
                ug8.t(textureView.animate().alpha(z ? 1.0f : 0.0f), s33.h, 320L);
            } else {
                textureView.animate().cancel();
                textureView.setAlpha(z ? 1.0f : 0.0f);
            }
        }
    }

    public final void g() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        if (this.r) {
            if (this.e != null) {
                this.f.setTranslationY((-this.H) / 2.0f);
                b(this.e, measuredWidth, measuredHeight);
                return;
            }
            return;
        }
        TextureView textureView = this.d;
        if (textureView != null) {
            TextureViewRenderer textureViewRenderer = this.c;
            if (textureViewRenderer == null) {
                textureViewRenderer = null;
            }
            int measuredWidth2 = textureView.getMeasuredWidth();
            int measuredHeight2 = this.d.getMeasuredHeight();
            this.d.setPivotX(0.0f);
            this.d.setPivotY(0.0f);
            float f = measuredWidth;
            float f2 = measuredWidth2;
            float f3 = measuredHeight;
            float f4 = measuredHeight2;
            float max = Math.max(f / f2, f3 / f4);
            this.d.setScaleX(max);
            this.d.setScaleY(max);
            this.d.setTranslationX((f - (f2 * max)) / 2.0f);
            this.d.setTranslationY(b00.b(f4, max, f3, 2.0f) - (this.H / 2.0f));
            b(textureViewRenderer, measuredWidth, measuredHeight);
        }
    }

    public Bitmap getBitmap() {
        TextureView videoTextureView = getVideoTextureView();
        if (videoTextureView != null) {
            return videoTextureView.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.w == null) {
            View view = new View(getContext());
            this.w = view;
            addView(view, nme.g());
        }
        return this.w;
    }

    public VideoSink getSink() {
        setStreamMode(false);
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        if (this.r) {
            return this.e;
        }
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public TextureView getVideoTextureView() {
        return this.r ? this.e : this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        kk7.f(this.a).b(this, kk7.F2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        f(false, false);
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        kk7.f(this.a).n(this, kk7.F2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.y) {
            c30 c30Var = this.F;
            if (c30Var != null && !c30Var.a) {
                c30Var.a = true;
                c30Var.m();
            }
            this.y = true;
        }
        f(true, true);
        Runnable runnable = this.x;
        if (runnable != null) {
            runnable.run();
            this.x = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.s.layout(0, 0, i5, i6);
        this.b.layout(0, 0, i5, i6);
        View view = this.w;
        if (view != null) {
            view.layout(0, 0, i5, i6);
        }
        TextureView textureView = this.d;
        if (textureView != null) {
            textureView.layout(0, 0, textureView.getMeasuredWidth(), this.d.getMeasuredHeight());
            TextureViewRenderer textureViewRenderer = this.c;
            if (textureViewRenderer == null) {
                textureViewRenderer = null;
            }
            textureViewRenderer.layout(0, 0, textureViewRenderer.getMeasuredWidth(), textureViewRenderer.getMeasuredHeight());
        }
        if (this.e != null) {
            this.f.layout(0, 0, i5, i6);
            a86 a86Var = this.e;
            a86Var.layout(0, 0, a86Var.getMeasuredWidth(), this.e.getMeasuredHeight());
        }
        g();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.r || this.d == null) {
            super.onMeasure(i, i2);
            return;
        }
        this.G = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.G = false;
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer2 = this.c;
        if (textureViewRenderer2 == null) {
            textureViewRenderer2 = null;
        }
        this.d.getLayoutParams().width = textureViewRenderer2.getMeasuredWidth();
        this.d.getLayoutParams().height = textureViewRenderer2.getMeasuredHeight();
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer3 = this.c;
        if (textureViewRenderer3 != null) {
            textureViewRenderer3.updateRotation();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i) {
        if (this.a == i) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.a = i;
            return;
        }
        kk7 f = kk7.f(this.a);
        int i2 = kk7.F2;
        f.n(this, i2);
        this.a = i;
        kk7.f(i).b(this, i2);
    }

    public void setKeyboardOffset(float f) {
        this.H = f;
        g();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.x = runnable;
    }

    public void setSecure(boolean z) {
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
