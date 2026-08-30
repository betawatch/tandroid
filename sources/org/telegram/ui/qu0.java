package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qu0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final kb.a n;
    public final o1.j r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        kb.a aVar = new kb.a(0.0f);
        this.n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.u = yh.n(0.0f, 750.0f, 1.0f);
        jVar.b(new ld0(this, 3));
        this.r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.s;
        photoViewer.l3.setAlpha(f10);
        photoViewer.m3.setAlpha(f10);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
            }
            photoViewer.o3.setAlpha(f10);
            return;
        }
        photoViewer.l3.setPivotX(r1.getWidth());
        photoViewer.l3.setPivotY(r1.getHeight());
        float f11 = 1.0f - f10;
        float f12 = 1.0f - (0.1f * f11);
        photoViewer.l3.setScaleX(f12);
        photoViewer.l3.setScaleY(f12);
        org.telegram.ui.Components.k71 k71Var = photoViewer.n3;
        if (k71Var.y != f11) {
            k71Var.y = f11;
            k71Var.v.invalidate();
        }
    }

    public final void b(float f10) {
        if (this.a != f10) {
            this.a = f10;
            a(f10);
        }
    }

    public final void c(boolean z4) {
        if (this.b != z4) {
            this.b = z4;
            PhotoViewer photoViewer = this.s;
            if (z4) {
                setTranslationY(0.0f);
                photoViewer.o3.setAlpha(1.0f);
            } else {
                photoViewer.l3.setScaleX(1.0f);
                photoViewer.l3.setScaleY(1.0f);
                org.telegram.ui.Components.k71 k71Var = photoViewer.n3;
                if (k71Var.y != 0.0f) {
                    k71Var.y = 0.0f;
                    k71Var.v.invalidate();
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.s;
        float n10 = photoViewer.C2 != null ? r3.n() / photoViewer.C2.p() : 0.0f;
        if (photoViewer.T2) {
            photoViewer.n3.h(n10, false);
        }
        photoViewer.O7.setProgress(n10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.l3.getLayoutParams();
        if (this.e > this.f) {
            if (photoViewer.m3.getVisibility() != 0) {
                photoViewer.m3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.m3.getVisibility() != 4) {
                photoViewer.m3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        long j10 = 0;
        if (i71Var != null) {
            long p10 = i71Var.p();
            if (p10 != -9223372036854775807L) {
                j10 = p10;
            }
        } else {
            nt0 nt0Var = photoViewer.c0;
            if (nt0Var != null && nt0Var.x) {
                j10 = nt0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.l3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        o1.j jVar = this.r;
        jVar.c();
        int i13 = this.h;
        kb.a aVar = this.n;
        if (i13 != 0) {
            float f10 = ceil;
            if (aVar.a != f10) {
                jVar.u.i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.k71 k71Var = photoViewer.n3;
        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        int measuredHeight = getMeasuredHeight();
        k71Var.h = measuredWidth;
        k71Var.i = measuredHeight;
        View view = k71Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.a = ceil;
        this.h = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.n3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.o3.invalidate();
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
