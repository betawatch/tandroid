package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class ql0 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public ql0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.h = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.n = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.E = new Paint(1);
        this.b = i6Var;
        this.a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, i6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp bpVar = null;
        if (i10 >= 0 && i7 >= 0 && (cpVar = org.telegram.messenger.mp.u1(i7).u4) != null) {
            bpVar = cpVar.d(i10);
        }
        c(bpVar, z10);
    }

    public final void c(org.telegram.messenger.bp bpVar, boolean z10) {
        this.d = false;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (bpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, i6Var);
            this.f = w02;
            this.e = w02;
        } else {
            boolean b10 = i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
            this.e = bpVar.c(b10);
            this.f = bpVar.d(b10);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.f5 f5Var = this.n;
        org.telegram.ui.Components.f5 f5Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, this.b)) || this.f != w02)) {
            this.f = w02;
            this.e = w02;
            f5Var2.a(w02, true);
            f5Var.a(w02, true);
        }
        int a10 = f5Var2.a(this.e, false);
        int a11 = f5Var.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.E;
        if (radialGradient == null || this.r != a10 || this.s != a11 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f10 = this.w;
            float f11 = f10 / 2.0f;
            float f12 = this.x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            float sqrt = ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f;
            this.s = a11;
            this.r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, sqrt, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.c >= 1.0f || this.F) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        }
        paint.setAlpha(this.F ? org.telegram.messenger.ks.e4 : (int) (this.c * 255.0f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7 = org.telegram.ui.ActionBar.n6.v8;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        return i0.a.f(this.c, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), this.d ? org.telegram.ui.ActionBar.n6.w0(i7, i6Var) : -1);
    }

    public int getColor() {
        return i0.a.f(this.c, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, this.b), i0.a.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i7 = org.telegram.ui.ActionBar.n6.s8;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int w02 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) > 0.721f ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v8, i6Var) : org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.Components.f5 f5Var = this.h;
        int i10 = f5Var.c;
        org.telegram.ui.Components.f5 f5Var2 = this.n;
        return i0.a.f(this.c, w02, org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, f5Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var) : org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, i0.a.f(0.75f, f5Var.c, f5Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.m10.C(230.0f, org.telegram.messenger.g0.m, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.c - f10) > 0.001f) {
            this.c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
