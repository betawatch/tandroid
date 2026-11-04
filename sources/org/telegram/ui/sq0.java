package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sq0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final q1.f n;
    public final q1.g r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        q1.f fVar = new q1.f(0.0f);
        this.n = fVar;
        q1.g gVar = new q1.g(fVar);
        gVar.m = org.telegram.ui.Cells.f1.s(0.0f, 750.0f, 1.0f);
        gVar.b(new wa0(this, 3));
        this.r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.s;
        photoViewer.p3.setAlpha(f10);
        photoViewer.q3.setAlpha(f10);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
            }
            photoViewer.s3.setAlpha(f10);
            return;
        }
        photoViewer.p3.setPivotX(r1.getWidth());
        photoViewer.p3.setPivotY(r1.getHeight());
        float f11 = 1.0f - f10;
        float f12 = 1.0f - (0.1f * f11);
        photoViewer.p3.setScaleX(f12);
        photoViewer.p3.setScaleY(f12);
        org.telegram.ui.Components.o51 o51Var = photoViewer.r3;
        if (o51Var.y != f11) {
            o51Var.y = f11;
            o51Var.v.invalidate();
        }
    }

    public final void b(float f10) {
        if (this.a != f10) {
            this.a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.b != z10) {
            this.b = z10;
            PhotoViewer photoViewer = this.s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.s3.setAlpha(1.0f);
            } else {
                photoViewer.p3.setScaleX(1.0f);
                photoViewer.p3.setScaleY(1.0f);
                org.telegram.ui.Components.o51 o51Var = photoViewer.r3;
                if (o51Var.y != 0.0f) {
                    o51Var.y = 0.0f;
                    o51Var.v.invalidate();
                }
            }
            a(this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.a = 0.0f;
        this.h = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        PhotoViewer photoViewer = this.s;
        float S = photoViewer.G2 != null ? r3.S() / photoViewer.G2.U() : 0.0f;
        if (photoViewer.X2) {
            photoViewer.r3.h(false, S);
        }
        photoViewer.T7.setProgress(S);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.p3.getLayoutParams();
        if (this.e > this.f) {
            if (photoViewer.q3.getVisibility() != 0) {
                photoViewer.q3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.q3.getVisibility() != 4) {
                photoViewer.q3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i3, i10);
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        long j10 = 0;
        if (m51Var != null) {
            long U = m51Var.U();
            if (U != -9223372036854775807L) {
                j10 = U;
            }
        } else {
            tp0 tp0Var = photoViewer.g0;
            if (tp0Var != null && tp0Var.y) {
                j10 = tp0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.p3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        q1.g gVar = this.r;
        gVar.d();
        int i12 = this.h;
        q1.f fVar = this.n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.a != f10) {
                gVar.m.i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.o51 o51Var = photoViewer.r3;
        int measuredWidth = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        int measuredHeight = getMeasuredHeight();
        o51Var.h = measuredWidth;
        o51Var.i = measuredHeight;
        View view = o51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.a = ceil;
        this.h = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.r3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.s3.invalidate();
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
