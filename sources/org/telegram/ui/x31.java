package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x31 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final gb.a f;
    public final o1.j h;
    public final v0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        gb.a aVar = new gb.a(0.0f);
        this.f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        jVar.b(new ad0(this, 5));
        this.h = jVar;
        this.n = new v0("progress", 6);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
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
    public final void onMeasure(int i9, int i10) {
        long j10;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.O.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        this.d = false;
        super.onMeasure(i9, i10);
        v31 v31Var = secretMediaViewer.y;
        if (v31Var != null) {
            j10 = v31Var.q();
        }
        j10 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.O.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        o1.j jVar = this.h;
        jVar.c();
        int i11 = this.e;
        gb.a aVar = this.f;
        if (i11 != 0) {
            float f10 = ceil;
            if (aVar.a != f10) {
                jVar.u.i = f10;
                jVar.f();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.m61 m61Var = secretMediaViewer.M;
        int B = org.telegram.messenger.l0.B(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        m61Var.h = B;
        m61Var.i = measuredHeight;
        View view = m61Var.v;
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
