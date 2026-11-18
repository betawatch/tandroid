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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout implements org.telegram.messenger.y5, org.telegram.ui.Cells.i9 {
    public static final /* synthetic */ int W = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public final int L;
    public TL_iv.pageBlockVideo M;
    public w2 N;
    public TL_iv.PageBlock O;
    public TLRPC.Document P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public org.telegram.messenger.xi U;
    public boolean V;
    public final p50 a;
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

    public v2(Context context, p50 p50Var, e4 e4Var, int i7) {
        super(context);
        this.a = p50Var;
        this.b = e4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.G0 = true;
        imageReceiver.H0 = true;
        this.w = i7;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.L = org.telegram.messenger.a6.q(((g4) p50Var).Y).k();
        a1 a1Var = new a1(context, p50Var, e4Var, 1);
        this.s = a1Var;
        j4 j4Var = new j4(context);
        this.h = j4Var;
        j4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        j4Var.addView(textureView, c8.ma.e(-1, -2, 1));
        frameLayout.addView(j4Var, c8.ma.e(-1, -1, 17));
        addView(frameLayout, c8.ma.c(-2.0f, -1));
        addView(a1Var, c8.ma.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i7 = this.J;
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

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        e(false);
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.r.p(true, 1.0f);
        if (!this.Q) {
            e(true);
        } else {
            this.J = 2;
            a();
        }
    }

    public final void a() {
        int i7 = ((g4) this.a).Y;
        int i10 = this.J;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i10 == 0) {
            this.T = false;
            radialProgress2.p(false, 0.0f);
            boolean z10 = this.Q;
            e4 e4Var = this.b;
            if (z10) {
                imageReceiver.r0(org.telegram.messenger.fc.b(this.P), null, org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(this.P.thumbs, 40, false, null, false), this.P), "80_80_b", null, this.P.size, null, e4Var.F, 1);
            } else {
                org.telegram.messenger.w7.G(i7).W(this.P, e4Var.F, 1, 1);
            }
            this.J = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                imageReceiver.u0 = true;
                imageReceiver.P0(false);
                this.J = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.T = true;
        if (this.Q) {
            imageReceiver.c();
        } else {
            org.telegram.messenger.w7.G(i7).f(this.P);
        }
        this.J = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, w2 w2Var, boolean z10, boolean z11) {
        p50 p50Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (p50Var = this.a).x) != null && p50Var.y == this) {
            a0.h hVar = p50Var.E;
            long j3 = pageblockvideo2.video_id;
            w2 a10 = w2.a(videoPlayerHolderBase, this);
            this.N = a10;
            hVar.k(a10, j3);
        }
        this.M = pageblockvideo;
        this.N = w2Var;
        this.O = null;
        this.R = z10;
        e4 e4Var = this.b;
        if (e4Var != null) {
            this.P = d4.a(e4Var.F, pageblockvideo.video_id);
        } else {
            this.P = null;
        }
        this.Q = org.telegram.messenger.fj.K4(this.P) || org.telegram.messenger.fj.s3(this.P, false);
        this.x = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(w2 w2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        w2 w2Var2 = this.N;
        if (w2Var2 != null && (bitmap2 = w2Var.b) != null && (bitmap3 = w2Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.N.b = null;
        }
        w2 w2Var3 = this.N;
        if (w2Var3 != null && w2Var.b == null && (bitmap = w2Var3.b) != null) {
            w2Var.a = w2Var3.a;
            w2Var.b = bitmap;
        }
        this.N = w2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.V) {
                return;
            }
            this.V = true;
            imageReceiver.P();
            e(false);
            return;
        }
        if (this.V) {
            this.V = false;
            TL_iv.pageBlockVideo pageblockvideo = this.M;
            p50 p50Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = p50Var.x) != null && p50Var.y == this) {
                a0.h hVar = p50Var.E;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(videoPlayerHolderBase, this);
                c(a10);
                hVar.k(a10, j3);
            }
            imageReceiver.R();
            org.telegram.messenger.a6.q(((g4) p50Var).Y).v(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z10) {
        int i7 = ((g4) this.a).Y;
        String r10 = org.telegram.messenger.w7.r(null, this.P);
        org.telegram.messenger.w7.G(i7);
        File I = org.telegram.messenger.w7.I(this.P);
        org.telegram.messenger.w7.G(i7);
        boolean z11 = true;
        boolean z12 = I.exists() || org.telegram.messenger.w7.J(this.P, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.a6.q(i7).v(this);
            if (this.Q) {
                this.J = -1;
            } else {
                this.J = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i7).a(r10, null, this);
            w2 w2Var = this.N;
            float f10 = 0.0f;
            if (w2Var == null || w2Var.b == null) {
                if (org.telegram.messenger.w7.G(i7).S(r10)) {
                    this.J = 1;
                    Float w10 = org.telegram.messenger.ec.D().w(r10);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                } else if (!this.T && this.S && this.Q) {
                    this.J = 1;
                } else {
                    this.J = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.p(false, f10);
            } else {
                this.J = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
            radialProgress2.p(false, f10);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.M;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.L;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.r.p(true, Math.min(1.0f, j3 / j10));
        if (this.J != 1) {
            e(true);
        }
    }

    @Override // org.telegram.ui.Cells.i9
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
        if (this.M == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.I() || imageReceiver.i1 != 1.0f) {
            canvas.drawRect(imageReceiver.Q0, g4.q1);
        }
        imageReceiver.h(canvas, null);
        z2 z2Var = this.c;
        p50 p50Var = this.a;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.y, this.E);
            g4.t(p50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.y, this.E + this.F);
            g4.t(p50Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, p50Var, this.M, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.R0) {
            this.r.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.M0(2131753931, null));
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
        boolean z10;
        float f10;
        int i16;
        int i17;
        int i18;
        Bitmap bitmap;
        boolean z11;
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
                int i22 = ((g4) this.a).Y;
                pageblockvideo = this.M;
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
                        i14 = org.telegram.messenger.n10.x(18.0f, i13, i11);
                        L = i14;
                    }
                    TLRPC.Document document = this.P;
                    e4 e4Var2 = this.b;
                    if (document != null) {
                        int L2 = org.telegram.messenger.g0.L(48.0f);
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.P.thumbs, 48, false, null, false);
                        if (i20 == 0) {
                            int size2 = this.P.attributes.size();
                            int i23 = 0;
                            f10 = 2.0f;
                            while (true) {
                                if (i23 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                char c11 = c10;
                                if (this.P.attributes.get(i23) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i12 = (int) ((i14 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                } else {
                                    i23++;
                                    c10 = c11;
                                }
                            }
                            float f12 = w10 != null ? w10.w : 100.0f;
                            float f13 = w10 != null ? w10.h : 100.0f;
                            if (!z11) {
                                i12 = (int) ((i14 / f12) * f13);
                            }
                            if (this.O instanceof TL_iv.pageBlockCover) {
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
                                if ((this.U.l & 2) == 0) {
                                    i14 -= org.telegram.messenger.g0.L(2.0f);
                                }
                                if ((this.U.l & 8) == 0) {
                                    int i24 = i14;
                                    i16 = i12;
                                    i12 -= org.telegram.messenger.g0.L(2.0f);
                                    i17 = i13;
                                    i18 = i24;
                                    imageReceiver.I0 = this.P;
                                    imageReceiver.y0(i17, (!this.x || i20 == 1 || i20 == 2 || this.M.level > 0) ? 0 : org.telegram.messenger.g0.L(8.0f), i18, i12);
                                    if (!this.R) {
                                        if (this.Q) {
                                            w2 w2Var = this.N;
                                            if (w2Var == null || (bitmap = w2Var.b) == null) {
                                                this.S = org.telegram.messenger.a6.q(i22).c(4, this.P.size);
                                                org.telegram.messenger.w7.G(i22);
                                                File I = org.telegram.messenger.w7.I(this.P);
                                                org.telegram.messenger.w7.G(i22);
                                                File J = org.telegram.messenger.w7.J(this.P, null, true, true);
                                                if (this.S || I.exists() || J.exists()) {
                                                    imageReceiver.O = null;
                                                    imageReceiver.u0(null, null, org.telegram.messenger.fc.b(this.P), "200_200_pframe", org.telegram.messenger.fc.c(w10, this.P), "80_80_b", null, this.P.size, null, e4Var2.F, 1);
                                                } else {
                                                    imageReceiver.O = org.telegram.messenger.fc.b(this.P);
                                                    imageReceiver.u0(null, null, null, null, org.telegram.messenger.fc.c(w10, this.P), "80_80_b", null, this.P.size, null, e4Var2.F, 1);
                                                }
                                            } else {
                                                imageReceiver.O = null;
                                                imageReceiver.v0(bitmap);
                                            }
                                        } else {
                                            imageReceiver.O = null;
                                            imageReceiver.r0(null, null, org.telegram.messenger.fc.c(w10, this.P), "80_80_b", null, 0L, null, e4Var2 != null ? e4Var2.F : null, 1);
                                        }
                                    }
                                    imageReceiver.S0 = true;
                                    float f14 = L2;
                                    float f15 = f10;
                                    int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, f14, f15, imageReceiver.L0);
                                    this.G = A;
                                    int A2 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.O0, f14, f15, imageReceiver.M0);
                                    this.H = A2;
                                    this.r.r(A, A2, A + L2, L2 + A2);
                                    i15 = i16;
                                }
                            }
                        }
                        i17 = i13;
                        i18 = i14;
                        i16 = i12;
                        imageReceiver.I0 = this.P;
                        imageReceiver.y0(i17, (!this.x || i20 == 1 || i20 == 2 || this.M.level > 0) ? 0 : org.telegram.messenger.g0.L(8.0f), i18, i12);
                        if (!this.R) {
                        }
                        imageReceiver.S0 = true;
                        float f142 = L2;
                        float f152 = f10;
                        int A3 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, f142, f152, imageReceiver.L0);
                        this.G = A3;
                        int A22 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.O0, f142, f152, imageReceiver.M0);
                        this.H = A22;
                        this.r.r(A3, A22, A3 + L2, L2 + A22);
                        i15 = i16;
                    } else {
                        i15 = i12;
                    }
                    int L3 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
                    this.E = L3;
                    if (i20 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
                        z2 o4 = g4.o(this.a, this, null, pageblockvideo2.caption.text, L, L3, pageblockvideo2, this.b);
                        this.c = o4;
                        if (o4 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                            this.F = height;
                            i15 = org.telegram.messenger.f3.C(4.0f, height, i15);
                            z2 z2Var = this.c;
                            z2Var.s = this.y;
                            z2Var.w = this.E;
                        }
                        int i25 = i15;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.M;
                        e4Var = e4Var2;
                        z2 n10 = g4.n(this.a, this, null, pageblockvideo3.caption.credit, L, 0, pageblockvideo3, (e4Var2 == null || !e4Var2.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.wu0.a(), 0, this.b);
                        this.d = n10;
                        if (n10 != null) {
                            i15 = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i25;
                            z2 z2Var2 = this.d;
                            z2Var2.s = this.y;
                            z2Var2.w = this.E + this.F;
                        } else {
                            i15 = i25;
                        }
                    } else {
                        e4Var = e4Var2;
                    }
                    if (!this.x && i20 == 0 && this.M.level <= 0) {
                        i15 += org.telegram.messenger.g0.L(8.0f);
                    }
                    if ((this.O instanceof TL_iv.pageBlockCover) && e4Var != null) {
                        ArrayList arrayList = e4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i21 = (i20 != 2 || z10) ? i15 : org.telegram.messenger.g0.L(8.0f) + i15;
                        }
                    }
                    z10 = false;
                    if (i20 != 2) {
                    }
                }
                a1 a1Var = this.s;
                a1Var.measure(i7, i10);
                a1Var.setTranslationY(imageReceiver.O0 - org.telegram.messenger.g0.L(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.L0;
                layoutParams.topMargin = (int) imageReceiver.M0;
                layoutParams.width = (int) imageReceiver.N0;
                layoutParams.height = (int) imageReceiver.O0;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
            }
            float f16 = this.U.f;
            Point point2 = org.telegram.messenger.g0.q;
            i12 = (int) Math.ceil(f16 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i11 = size;
        int i222 = ((g4) this.a).Y;
        pageblockvideo = this.M;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo != null) {
        }
        a1 a1Var2 = this.s;
        a1Var2.measure(i7, i10);
        a1Var2.setTranslationY(imageReceiver2.O0 - org.telegram.messenger.g0.L(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.L0;
        layoutParams2.topMargin = (int) imageReceiver2.M0;
        layoutParams2.width = (int) imageReceiver2.N0;
        layoutParams2.height = (int) imageReceiver2.O0;
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
                if (this.J != -1) {
                    if (x10 >= this.G && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                        if (y10 >= this.H) {
                        }
                    }
                }
                if (this.J != 0) {
                    this.I = true;
                }
                this.K = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.I) {
                    this.I = false;
                    this.a.b(this.M, e4Var);
                } else if (this.K == 1) {
                    this.K = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.I = false;
            }
            if (!this.I && this.K == 0) {
                if (!g4.j(this.a, this.b, motionEvent, this, this.c, this.y, this.E)) {
                    if (!g4.j(this.a, this.b, motionEvent, this, this.d, this.y, this.E + this.F) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (e4Var != null && e4Var.G != null) {
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

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
