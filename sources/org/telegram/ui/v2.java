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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.h9 {
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
    public org.telegram.messenger.aj T;
    public boolean U;
    public final o50 a;
    public final e4 b;
    public z2 c;
    public z2 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final j4 h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final a1 s;
    public final int w;
    public boolean x;
    public int y;

    public v2(Context context, o50 o50Var, e4 e4Var, int i7) {
        super(context);
        this.a = o50Var;
        this.b = e4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.F0 = true;
        imageReceiver.G0 = true;
        this.w = i7;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = org.telegram.messenger.z5.q(((g4) o50Var).X).k();
        a1 a1Var = new a1(context, o50Var, e4Var, 1);
        this.s = a1Var;
        j4 j4Var = new j4(context);
        this.h = j4Var;
        j4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        j4Var.addView(textureView, c8.ha.e(-1, -2, 1));
        frameLayout.addView(j4Var, c8.ha.e(-1, -1, 17));
        addView(frameLayout, c8.ha.c(-2.0f, -1));
        addView(a1Var, c8.ha.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i7 = this.I;
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 8;
        }
        return i7 == 3 ? 0 : 4;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        e(false);
    }

    @Override // org.telegram.messenger.x5
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
        int i7 = ((g4) this.a).X;
        int i10 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i10 == 0) {
            this.S = false;
            radialProgress2.p(false, 0.0f);
            boolean z9 = this.P;
            e4 e4Var = this.b;
            if (z9) {
                imageReceiver.r0(org.telegram.messenger.hc.b(this.O), null, org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(this.O.thumbs, 40, false, null, false), this.O), "80_80_b", null, this.O.size, null, e4Var.E, 1);
            } else {
                org.telegram.messenger.w7.G(i7).W(this.O, e4Var.E, 1, 1);
            }
            this.I = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
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
            org.telegram.messenger.w7.G(i7).f(this.O);
        }
        this.I = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, w2 w2Var, boolean z9, boolean z10) {
        o50 o50Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (o50Var = this.a).x) != null && o50Var.y == this) {
            a0.h hVar = o50Var.D;
            long j3 = pageblockvideo2.video_id;
            w2 a10 = w2.a(videoPlayerHolderBase, this);
            this.M = a10;
            hVar.k(a10, j3);
        }
        this.L = pageblockvideo;
        this.M = w2Var;
        this.N = null;
        this.Q = z9;
        e4 e4Var = this.b;
        if (e4Var != null) {
            this.O = d4.a(e4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        this.P = org.telegram.messenger.ij.L4(this.O) || org.telegram.messenger.ij.t3(this.O, false);
        this.x = z10;
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
            o50 o50Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = o50Var.x) != null && o50Var.y == this) {
                a0.h hVar = o50Var.D;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(videoPlayerHolderBase, this);
                c(a10);
                hVar.k(a10, j3);
            }
            imageReceiver.R();
            org.telegram.messenger.z5.q(((g4) o50Var).X).v(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z9) {
        int i7 = ((g4) this.a).X;
        String r10 = org.telegram.messenger.w7.r(null, this.O);
        org.telegram.messenger.w7.G(i7);
        File I = org.telegram.messenger.w7.I(this.O);
        org.telegram.messenger.w7.G(i7);
        boolean z10 = true;
        boolean z11 = I.exists() || org.telegram.messenger.w7.J(this.O, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.z5.q(i7).v(this);
            if (this.P) {
                this.I = -1;
            } else {
                this.I = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            w2 w2Var = this.M;
            float f10 = 0.0f;
            if (w2Var == null || w2Var.b == null) {
                if (org.telegram.messenger.w7.G(i7).S(r10)) {
                    this.I = 1;
                    Float w10 = org.telegram.messenger.gc.D().w(r10);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                } else if (!this.S && this.R && this.P) {
                    this.I = 1;
                } else {
                    this.I = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z9);
                radialProgress2.p(false, f10);
            } else {
                this.I = -1;
            }
            z10 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z10, z9);
            radialProgress2.p(false, f10);
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

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.r.p(true, Math.min(1.0f, j3 / j10));
        if (this.I != 1) {
            e(true);
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
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
            canvas.drawRect(imageReceiver.P0, g4.p1);
        }
        imageReceiver.h(canvas, null);
        z2 z2Var = this.c;
        o50 o50Var = this.a;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.y, this.D);
            g4.t(o50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.y, this.D + this.E);
            g4.t(o50Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, o50Var, this.L, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.Q0) {
            this.r.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131753933, null));
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockVideo pageblockvideo;
        int L;
        int i13;
        int i14;
        int i15;
        e4 e4Var;
        boolean z9;
        float f10;
        int i16;
        int i17;
        int i18;
        Bitmap bitmap;
        boolean z10;
        float f11;
        int i19;
        int size = View.MeasureSpec.getSize(i7);
        char c10 = 2;
        int i20 = this.w;
        int i21 = 1;
        if (i20 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i12 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i20 != 2) {
                i11 = size;
                i12 = 0;
                int i22 = ((g4) this.a).X;
                pageblockvideo = this.L;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo != null) {
                    if (i20 != 0 || (i19 = pageblockvideo.level) <= 0) {
                        this.y = org.telegram.messenger.g0.L(18.0f);
                        L = i11 - org.telegram.messenger.g0.L(36.0f);
                        i13 = 0;
                        i14 = i11;
                    } else {
                        i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i19 * 14);
                        this.y = i13;
                        i14 = org.telegram.messenger.camera.q.w(18.0f, i13, i11);
                        L = i14;
                    }
                    TLRPC.Document document = this.O;
                    e4 e4Var2 = this.b;
                    if (document != null) {
                        int L2 = org.telegram.messenger.g0.L(48.0f);
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.O.thumbs, 48, false, null, false);
                        if (i20 == 0) {
                            int size2 = this.O.attributes.size();
                            int i23 = 0;
                            f10 = 2.0f;
                            while (true) {
                                if (i23 >= size2) {
                                    z10 = false;
                                    break;
                                }
                                char c11 = c10;
                                if (this.O.attributes.get(i23) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i12 = (int) ((i14 / r13.w) * r13.h);
                                    z10 = true;
                                    break;
                                } else {
                                    i23++;
                                    c10 = c11;
                                }
                            }
                            float f12 = w10 != null ? w10.w : 100.0f;
                            float f13 = w10 != null ? w10.h : 100.0f;
                            if (!z10) {
                                i12 = (int) ((i14 / f12) * f13);
                            }
                            if (this.N instanceof TL_iv.pageBlockCover) {
                                i12 = Math.min(i12, i14);
                                f11 = 100.0f;
                            } else {
                                Point point = org.telegram.messenger.g0.q;
                                f11 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
                                if (i12 > max) {
                                    i14 = (int) ((max / f13) * f12);
                                    i13 += ((i11 - i13) - i14) / 2;
                                    i12 = max;
                                }
                            }
                            if (i12 == 0) {
                                i12 = org.telegram.messenger.g0.L(f11);
                            } else if (i12 < L2) {
                                i12 = L2;
                            }
                        } else {
                            f10 = 2.0f;
                            if (i20 == 2) {
                                if ((this.T.l & 2) == 0) {
                                    i14 -= org.telegram.messenger.g0.L(2.0f);
                                }
                                if ((this.T.l & 8) == 0) {
                                    int i24 = i14;
                                    i16 = i12;
                                    i12 -= org.telegram.messenger.g0.L(2.0f);
                                    i17 = i13;
                                    i18 = i24;
                                    imageReceiver.H0 = this.O;
                                    imageReceiver.y0(i17, (!this.x || i20 == 1 || i20 == 2 || this.L.level > 0) ? 0 : org.telegram.messenger.g0.L(8.0f), i18, i12);
                                    if (!this.Q) {
                                        if (this.P) {
                                            w2 w2Var = this.M;
                                            if (w2Var == null || (bitmap = w2Var.b) == null) {
                                                this.R = org.telegram.messenger.z5.q(i22).c(4, this.O.size);
                                                org.telegram.messenger.w7.G(i22);
                                                File I = org.telegram.messenger.w7.I(this.O);
                                                org.telegram.messenger.w7.G(i22);
                                                File J = org.telegram.messenger.w7.J(this.O, null, true, true);
                                                if (this.R || I.exists() || J.exists()) {
                                                    imageReceiver.N = null;
                                                    imageReceiver.u0(null, null, org.telegram.messenger.hc.b(this.O), "200_200_pframe", org.telegram.messenger.hc.c(w10, this.O), "80_80_b", null, this.O.size, null, e4Var2.E, 1);
                                                } else {
                                                    imageReceiver.N = org.telegram.messenger.hc.b(this.O);
                                                    imageReceiver.u0(null, null, null, null, org.telegram.messenger.hc.c(w10, this.O), "80_80_b", null, this.O.size, null, e4Var2.E, 1);
                                                }
                                            } else {
                                                imageReceiver.N = null;
                                                imageReceiver.v0(bitmap);
                                            }
                                        } else {
                                            imageReceiver.N = null;
                                            imageReceiver.r0(null, null, org.telegram.messenger.hc.c(w10, this.O), "80_80_b", null, 0L, null, e4Var2 != null ? e4Var2.E : null, 1);
                                        }
                                    }
                                    imageReceiver.R0 = true;
                                    float f14 = L2;
                                    float f15 = f10;
                                    int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, f14, f15, imageReceiver.K0);
                                    this.F = A;
                                    int A2 = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.N0, f14, f15, imageReceiver.L0);
                                    this.G = A2;
                                    this.r.r(A, A2, A + L2, L2 + A2);
                                    i15 = i16;
                                }
                            }
                        }
                        i17 = i13;
                        i18 = i14;
                        i16 = i12;
                        imageReceiver.H0 = this.O;
                        imageReceiver.y0(i17, (!this.x || i20 == 1 || i20 == 2 || this.L.level > 0) ? 0 : org.telegram.messenger.g0.L(8.0f), i18, i12);
                        if (!this.Q) {
                        }
                        imageReceiver.R0 = true;
                        float f142 = L2;
                        float f152 = f10;
                        int A3 = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, f142, f152, imageReceiver.K0);
                        this.F = A3;
                        int A22 = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.N0, f142, f152, imageReceiver.L0);
                        this.G = A22;
                        this.r.r(A3, A22, A3 + L2, L2 + A22);
                        i15 = i16;
                    } else {
                        i15 = i12;
                    }
                    int L3 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.g0.L(8.0f));
                    this.D = L3;
                    if (i20 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
                        z2 o4 = g4.o(this.a, this, null, pageblockvideo2.caption.text, L, L3, pageblockvideo2, this.b);
                        this.c = o4;
                        if (o4 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                            this.E = height;
                            i15 = org.telegram.messenger.k5.C(4.0f, height, i15);
                            z2 z2Var = this.c;
                            z2Var.s = this.y;
                            z2Var.w = this.D;
                        }
                        int i25 = i15;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.L;
                        e4Var = e4Var2;
                        z2 n10 = g4.n(this.a, this, null, pageblockvideo3.caption.credit, L, 0, pageblockvideo3, (e4Var2 == null || !e4Var2.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.mu0.a(), 0, this.b);
                        this.d = n10;
                        if (n10 != null) {
                            i15 = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i25;
                            z2 z2Var2 = this.d;
                            z2Var2.s = this.y;
                            z2Var2.w = this.D + this.E;
                        } else {
                            i15 = i25;
                        }
                    } else {
                        e4Var = e4Var2;
                    }
                    if (!this.x && i20 == 0 && this.L.level <= 0) {
                        i15 += org.telegram.messenger.g0.L(8.0f);
                    }
                    if ((this.N instanceof TL_iv.pageBlockCover) && e4Var != null) {
                        ArrayList arrayList = e4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z9 = true;
                            i21 = (i20 != 2 || z9) ? i15 : org.telegram.messenger.g0.L(8.0f) + i15;
                        }
                    }
                    z9 = false;
                    if (i20 != 2) {
                    }
                }
                a1 a1Var = this.s;
                a1Var.measure(i7, i10);
                a1Var.setTranslationY(imageReceiver.N0 - org.telegram.messenger.g0.L(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.K0;
                layoutParams.topMargin = (int) imageReceiver.L0;
                layoutParams.width = (int) imageReceiver.M0;
                layoutParams.height = (int) imageReceiver.N0;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
            }
            float f16 = this.T.f;
            Point point2 = org.telegram.messenger.g0.q;
            i12 = (int) Math.ceil(f16 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i11 = size;
        int i222 = ((g4) this.a).X;
        pageblockvideo = this.L;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo != null) {
        }
        a1 a1Var2 = this.s;
        a1Var2.measure(i7, i10);
        a1Var2.setTranslationY(imageReceiver2.N0 - org.telegram.messenger.g0.L(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.K0;
        layoutParams2.topMargin = (int) imageReceiver2.L0;
        layoutParams2.width = (int) imageReceiver2.M0;
        layoutParams2.height = (int) imageReceiver2.N0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (org.telegram.messenger.g0.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        a1 a1Var = this.s;
        int visibility = a1Var.getVisibility();
        e4 e4Var = this.b;
        if (visibility != 0 || y10 <= a1Var.getTranslationY() || y10 >= a1Var.getTranslationY() + org.telegram.messenger.g0.L(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.O(x10, y10)) {
                if (this.I != -1) {
                    if (x10 >= this.F && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                        if (y10 >= this.G) {
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
                    this.a.b(this.L, e4Var);
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
                if (!g4.j(this.a, this.b, motionEvent, this, this.c, this.y, this.D)) {
                    if (!g4.j(this.a, this.b, motionEvent, this, this.d, this.y, this.D + this.E) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (e4Var != null && e4Var.F != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        d();
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
