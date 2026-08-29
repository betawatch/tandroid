package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z31 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final ib.a f;
    public final o1.k h;
    public final w0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        ib.a aVar = new ib.a(0.0f);
        this.f = aVar;
        o1.k kVar = new o1.k(aVar);
        kVar.u = th.l(0.0f, 750.0f, 1.0f);
        kVar.b(new cd0(this, 5));
        this.h = kVar;
        this.n = new w0("progress", 6);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.r;
        secretMediaViewer.M.h(secretMediaViewer.y != null ? r3.o() / secretMediaViewer.y.q() : 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r12 == (-9223372036854775807L)) goto L6;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        long j10;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.O.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        this.d = false;
        super.onMeasure(i10, i11);
        x31 x31Var = secretMediaViewer.y;
        if (x31Var != null) {
            j10 = x31Var.q();
        }
        j10 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.O.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        o1.k kVar = this.h;
        kVar.c();
        int i12 = this.e;
        ib.a aVar = this.f;
        if (i12 != 0) {
            float f9 = ceil;
            if (aVar.a != f9) {
                kVar.u.i = f9;
                kVar.f();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.z61 z61Var = secretMediaViewer.M;
        int B = org.telegram.messenger.x3.B(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        z61Var.h = B;
        z61Var.i = measuredHeight;
        View view = z61Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.a = ceil;
        this.e = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.M.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.N.invalidate();
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
