package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout implements org.telegram.messenger.z5, org.telegram.ui.Cells.j9 {
    public static final /* synthetic */ int V = 0;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public w2 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public org.telegram.messenger.bj T;
    public boolean U;
    public final m60 a;
    public final f4 b;
    public z2 c;
    public z2 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final k4 h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final c1 s;
    public final int w;
    public boolean x;
    public int y;

    public v2(Context context, m60 m60Var, f4 f4Var, int i10) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.F0 = true;
        imageReceiver.G0 = true;
        this.w = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = org.telegram.messenger.b6.q(((h4) m60Var).X).k();
        c1 c1Var = new c1(context, m60Var, f4Var, 1);
        this.s = c1Var;
        k4 k4Var = new k4(context);
        this.h = k4Var;
        k4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        k4Var.addView(textureView, w7.b6.e(-1, -2, 1));
        frameLayout.addView(k4Var, w7.b6.e(-1, -1, 17));
        addView(frameLayout, w7.b6.c(-2.0f, -1));
        addView(c1Var, w7.b6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.I;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        return i10 == 3 ? 0 : 4;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        e(false);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.r.p(true, 1.0f);
        if (!this.P) {
            e(true);
        } else {
            this.I = 2;
            a();
        }
    }

    public final void a() {
        int i10 = ((h4) this.a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.p(false, 0.0f);
            boolean z10 = this.P;
            f4 f4Var = this.b;
            if (z10) {
                imageReceiver.r0(org.telegram.messenger.ic.b(this.O), null, org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(this.O.thumbs, 40, false, null, false), this.O), "80_80_b", null, this.O.size, null, f4Var.E, 1);
            } else {
                org.telegram.messenger.b8.G(i10).X(this.O, f4Var.E, 1, 1);
            }
            this.I = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                imageReceiver.t0 = true;
                imageReceiver.P0(false);
                this.I = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.S = true;
        if (this.P) {
            imageReceiver.c();
        } else {
            org.telegram.messenger.b8.G(i10).f(this.O);
        }
        this.I = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, w2 w2Var, boolean z10, boolean z11) {
        m60 m60Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (m60Var = this.a).x) != null && m60Var.y == this) {
            a0.h hVar = m60Var.D;
            long j10 = pageblockvideo2.video_id;
            w2 a2 = w2.a(videoPlayerHolderBase, this);
            this.M = a2;
            hVar.k(a2, j10);
        }
        this.L = pageblockvideo;
        this.M = w2Var;
        this.N = null;
        this.Q = z10;
        f4 f4Var = this.b;
        if (f4Var != null) {
            this.O = e4.a(f4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        this.P = org.telegram.messenger.jj.K4(this.O) || org.telegram.messenger.jj.s3(this.O, false);
        this.x = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(w2 w2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        w2 w2Var2 = this.M;
        if (w2Var2 != null && (bitmap2 = w2Var.b) != null && (bitmap3 = w2Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.b = null;
        }
        w2 w2Var3 = this.M;
        if (w2Var3 != null && w2Var.b == null && (bitmap = w2Var3.b) != null) {
            w2Var.a = w2Var3.a;
            w2Var.b = bitmap;
        }
        this.M = w2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.U) {
                return;
            }
            this.U = true;
            imageReceiver.P();
            e(false);
            return;
        }
        if (this.U) {
            this.U = false;
            TL_iv.pageBlockVideo pageblockvideo = this.L;
            m60 m60Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = m60Var.x) != null && m60Var.y == this) {
                a0.h hVar = m60Var.D;
                long j10 = pageblockvideo.video_id;
                w2 a2 = w2.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.R();
            org.telegram.messenger.b6.q(((h4) m60Var).X).v(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        int i10 = ((h4) this.a).X;
        String r10 = org.telegram.messenger.b8.r(null, this.O);
        org.telegram.messenger.b8.G(i10);
        File I = org.telegram.messenger.b8.I(this.O);
        org.telegram.messenger.b8.G(i10);
        boolean z11 = true;
        boolean z12 = I.exists() || org.telegram.messenger.b8.K(this.O, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.b6.q(i10).v(this);
            if (this.P) {
                this.I = -1;
            } else {
                this.I = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            w2 w2Var = this.M;
            float f7 = 0.0f;
            if (w2Var == null || w2Var.b == null) {
                if (org.telegram.messenger.b8.G(i10).T(r10)) {
                    this.I = 1;
                    Float w9 = org.telegram.messenger.hc.D().w(r10);
                    if (w9 != null) {
                        f7 = w9.floatValue();
                    }
                } else if (!this.S && this.R && this.P) {
                    this.I = 1;
                } else {
                    this.I = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.p(false, f7);
            } else {
                this.I = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
            radialProgress2.p(false, f7);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.r.p(true, Math.min(1.0f, j10 / j11));
        if (this.I != 1) {
            e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.L == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.I() || imageReceiver.h1 != 1.0f) {
            canvas.drawRect(imageReceiver.P0, h4.p1);
        }
        imageReceiver.h(canvas, null);
        z2 z2Var = this.c;
        m60 m60Var = this.a;
        int i10 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.y, this.D);
            h4.t(m60Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.y, this.D + this.E);
            h4.t(m60Var, canvas, this, i10);
            this.d.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.L, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.Q0) {
            this.r.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131753933, null));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockVideo pageblockvideo;
        int L;
        int i14;
        int i15;
        int i16;
        f4 f4Var;
        boolean z10;
        float f7;
        int i17;
        int i18;
        int i19;
        Bitmap bitmap;
        boolean z11;
        float f10;
        int i20;
        int size = View.MeasureSpec.getSize(i10);
        char c10 = 2;
        int i21 = this.w;
        int i22 = 1;
        if (i21 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i21 != 2) {
                i12 = size;
                i13 = 0;
                int i23 = ((h4) this.a).X;
                pageblockvideo = this.L;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo != null) {
                    if (i21 != 0 || (i20 = pageblockvideo.level) <= 0) {
                        this.y = org.telegram.messenger.i0.L(18.0f);
                        L = i12 - org.telegram.messenger.i0.L(36.0f);
                        i14 = 0;
                        i15 = i12;
                    } else {
                        i14 = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(i20 * 14);
                        this.y = i14;
                        i15 = org.telegram.messenger.z20.w(18.0f, i14, i12);
                        L = i15;
                    }
                    TLRPC.Document document = this.O;
                    f4 f4Var2 = this.b;
                    if (document != null) {
                        int L2 = org.telegram.messenger.i0.L(48.0f);
                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(this.O.thumbs, 48, false, null, false);
                        if (i21 == 0) {
                            int size2 = this.O.attributes.size();
                            int i24 = 0;
                            f7 = 2.0f;
                            while (true) {
                                if (i24 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                char c11 = c10;
                                if (this.O.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i13 = (int) ((i15 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                } else {
                                    i24++;
                                    c10 = c11;
                                }
                            }
                            float f11 = w9 != null ? w9.w : 100.0f;
                            float f12 = w9 != null ? w9.h : 100.0f;
                            if (!z11) {
                                i13 = (int) ((i15 / f11) * f12);
                            }
                            if (this.N instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i15);
                                f10 = 100.0f;
                            } else {
                                Point point = org.telegram.messenger.i0.q;
                                f10 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.i0.L(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i15 = (int) ((max / f12) * f11);
                                    i14 += ((i12 - i14) - i15) / 2;
                                    i13 = max;
                                }
                            }
                            if (i13 == 0) {
                                i13 = org.telegram.messenger.i0.L(f10);
                            } else if (i13 < L2) {
                                i13 = L2;
                            }
                        } else {
                            f7 = 2.0f;
                            if (i21 == 2) {
                                if ((this.T.l & 2) == 0) {
                                    i15 -= org.telegram.messenger.i0.L(2.0f);
                                }
                                if ((this.T.l & 8) == 0) {
                                    int i25 = i15;
                                    i17 = i13;
                                    i13 -= org.telegram.messenger.i0.L(2.0f);
                                    i18 = i14;
                                    i19 = i25;
                                    imageReceiver.H0 = this.O;
                                    imageReceiver.y0(i18, (!this.x || i21 == 1 || i21 == 2 || this.L.level > 0) ? 0 : org.telegram.messenger.i0.L(8.0f), i19, i13);
                                    if (!this.Q) {
                                        if (this.P) {
                                            w2 w2Var = this.M;
                                            if (w2Var == null || (bitmap = w2Var.b) == null) {
                                                this.R = org.telegram.messenger.b6.q(i23).c(4, this.O.size);
                                                org.telegram.messenger.b8.G(i23);
                                                File I = org.telegram.messenger.b8.I(this.O);
                                                org.telegram.messenger.b8.G(i23);
                                                File K = org.telegram.messenger.b8.K(this.O, null, true, true);
                                                if (this.R || I.exists() || K.exists()) {
                                                    imageReceiver.N = null;
                                                    imageReceiver.u0(null, null, org.telegram.messenger.ic.b(this.O), "200_200_pframe", org.telegram.messenger.ic.c(w9, this.O), "80_80_b", null, this.O.size, null, f4Var2.E, 1);
                                                } else {
                                                    imageReceiver.N = org.telegram.messenger.ic.b(this.O);
                                                    imageReceiver.u0(null, null, null, null, org.telegram.messenger.ic.c(w9, this.O), "80_80_b", null, this.O.size, null, f4Var2.E, 1);
                                                }
                                            } else {
                                                imageReceiver.N = null;
                                                imageReceiver.v0(bitmap);
                                            }
                                        } else {
                                            imageReceiver.N = null;
                                            imageReceiver.r0(null, null, org.telegram.messenger.ic.c(w9, this.O), "80_80_b", null, 0L, null, f4Var2 != null ? f4Var2.E : null, 1);
                                        }
                                    }
                                    imageReceiver.R0 = true;
                                    float f13 = L2;
                                    float f14 = f7;
                                    int B = (int) c3.i0.B(imageReceiver.M0, f13, f14, imageReceiver.K0);
                                    this.F = B;
                                    int B2 = (int) c3.i0.B(imageReceiver.N0, f13, f14, imageReceiver.L0);
                                    this.G = B2;
                                    this.r.r(B, B2, B + L2, L2 + B2);
                                    i16 = i17;
                                }
                            }
                        }
                        i18 = i14;
                        i19 = i15;
                        i17 = i13;
                        imageReceiver.H0 = this.O;
                        imageReceiver.y0(i18, (!this.x || i21 == 1 || i21 == 2 || this.L.level > 0) ? 0 : org.telegram.messenger.i0.L(8.0f), i19, i13);
                        if (!this.Q) {
                        }
                        imageReceiver.R0 = true;
                        float f132 = L2;
                        float f142 = f7;
                        int B3 = (int) c3.i0.B(imageReceiver.M0, f132, f142, imageReceiver.K0);
                        this.F = B3;
                        int B22 = (int) c3.i0.B(imageReceiver.N0, f132, f142, imageReceiver.L0);
                        this.G = B22;
                        this.r.r(B3, B22, B3 + L2, L2 + B22);
                        i16 = i17;
                    } else {
                        i16 = i13;
                    }
                    int L3 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.i0.L(8.0f));
                    this.D = L3;
                    if (i21 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
                        z2 o10 = h4.o(this.a, this, null, pageblockvideo2.caption.text, L, L3, pageblockvideo2, this.b);
                        this.c = o10;
                        if (o10 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                            this.E = height;
                            i16 = org.telegram.messenger.m5.C(4.0f, height, i16);
                            z2 z2Var = this.c;
                            z2Var.s = this.y;
                            z2Var.w = this.D;
                        }
                        int i26 = i16;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.L;
                        f4Var = f4Var2;
                        z2 n10 = h4.n(this.a, this, null, pageblockvideo3.caption.credit, L, 0, pageblockvideo3, (f4Var2 == null || !f4Var2.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
                        this.d = n10;
                        if (n10 != null) {
                            i16 = this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f) + i26;
                            z2 z2Var2 = this.d;
                            z2Var2.s = this.y;
                            z2Var2.w = this.D + this.E;
                        } else {
                            i16 = i26;
                        }
                    } else {
                        f4Var = f4Var2;
                    }
                    if (!this.x && i21 == 0 && this.L.level <= 0) {
                        i16 += org.telegram.messenger.i0.L(8.0f);
                    }
                    if ((this.N instanceof TL_iv.pageBlockCover) && f4Var != null) {
                        ArrayList arrayList = f4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i22 = (i21 != 2 || z10) ? i16 : org.telegram.messenger.i0.L(8.0f) + i16;
                        }
                    }
                    z10 = false;
                    if (i21 != 2) {
                    }
                }
                c1 c1Var = this.s;
                c1Var.measure(i10, i11);
                c1Var.setTranslationY(imageReceiver.N0 - org.telegram.messenger.i0.L(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.K0;
                layoutParams.topMargin = (int) imageReceiver.L0;
                layoutParams.width = (int) imageReceiver.M0;
                layoutParams.height = (int) imageReceiver.N0;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
            }
            float f15 = this.T.f;
            Point point2 = org.telegram.messenger.i0.q;
            i13 = (int) Math.ceil(f15 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        int i232 = ((h4) this.a).X;
        pageblockvideo = this.L;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo != null) {
        }
        c1 c1Var2 = this.s;
        c1Var2.measure(i10, i11);
        c1Var2.setTranslationY(imageReceiver2.N0 - org.telegram.messenger.i0.L(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.K0;
        layoutParams2.topMargin = (int) imageReceiver2.L0;
        layoutParams2.width = (int) imageReceiver2.M0;
        layoutParams2.height = (int) imageReceiver2.N0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (org.telegram.messenger.i0.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        c1 c1Var = this.s;
        int visibility = c1Var.getVisibility();
        f4 f4Var = this.b;
        if (visibility != 0 || y3 <= c1Var.getTranslationY() || y3 >= c1Var.getTranslationY() + org.telegram.messenger.i0.L(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.O(x10, y3)) {
                if (this.I != -1) {
                    if (x10 >= this.F && x10 <= org.telegram.messenger.i0.L(48.0f) + r2) {
                        if (y3 >= this.G) {
                        }
                    }
                }
                if (this.I != 0) {
                    this.H = true;
                }
                this.J = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.H) {
                    this.H = false;
                    this.a.b(this.L, f4Var);
                } else if (this.J == 1) {
                    this.J = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.H = false;
            }
            if (!this.H && this.J == 0) {
                if (!h4.j(this.a, this.b, motionEvent, this, this.c, this.y, this.D)) {
                    if (!h4.j(this.a, this.b, motionEvent, this, this.d, this.y, this.D + this.E) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (f4Var != null && f4Var.F != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
