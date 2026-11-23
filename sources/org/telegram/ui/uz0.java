package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class uz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.ys F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.h6 M;
    public org.telegram.messenger.gj N;
    public sz0 O;
    public org.telegram.ui.Cells.r1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.g8 W;
    public boolean X;
    public he Y;
    public bi.q2 Z;
    public final Context a;
    public final pz0 a0;
    public final k0 b;
    public float b0;
    public final ai.l0 c;
    public boolean c0;
    public org.telegram.ui.Components.oz0 d;
    public org.telegram.ui.ActionBar.t1 d0;
    public i0.b e;
    public ValueAnimator e0;
    public Bitmap f;
    public ValueAnimator f0;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public org.telegram.ui.Components.i61 x;
    public hi.l3 y;

    public uz0(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        int i7 = 0;
        this.a0 = new pz0(this, i7);
        this.b0 = 0.0f;
        this.c0 = false;
        this.a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.b = k0Var;
        k0Var.setOnClickListener(new qz0(this, i7));
        ai.l0 l0Var = new ai.l0(this, activity);
        this.c = l0Var;
        l0Var.setClipToPadding(false);
        k0Var.addView(l0Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        rz0 rz0Var = new rz0(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, rz0Var);
        if (org.telegram.messenger.cz.s0) {
            this.F = new org.telegram.ui.Components.ys();
        }
    }

    public final void c(boolean z10, pz0 pz0Var) {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(11, this, z10));
        this.e0.addListener(new androidx.fragment.app.g(this, z10, pz0Var, 13));
        long j3 = (z10 || this.Z != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.e0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.e0.setDuration(j3);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new iz0(this, 3));
        this.f0.addListener(new c30(8, this, z10));
        this.f0.setDuration((long) (j3 * 1.5f));
        this.f0.setInterpolator(nrVar);
        this.f0.start();
    }

    public final void d() {
        if (this.I) {
            return;
        }
        k0 k0Var = this.b;
        if (k0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = this.P;
        if (r1Var != null) {
            int[] iArr = new int[2];
            r1Var.getLocationOnScreen(iArr);
            float f10 = iArr[0] - this.e.a;
            int width = k0Var.getWidth();
            i0.b bVar = this.e;
            this.G = f10 - ((((width - bVar.a) - bVar.c) - this.P.getWidth()) / 2.0f);
            float f11 = iArr[1] - this.e.b;
            int height = k0Var.getHeight();
            i0.b bVar2 = this.e;
            this.H = org.telegram.messenger.f3.y(((height - bVar2.b) - bVar2.d) - this.P.getHeight(), this.L, 2.0f, f11);
            if (!this.K) {
                this.K = true;
                float i7 = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.P.getHeight()) / 2.0f);
                this.J = i7;
                if (this.T) {
                    this.J = 0.0f;
                } else {
                    this.J = org.telegram.messenger.g0.T1(0.0f, i7, 0.78f);
                }
            }
            e();
        } else {
            this.H = 0.0f;
            this.G = 0.0f;
        }
        this.I = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        sz0 sz0Var;
        if (this.c0) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.d0 = null;
        }
        this.c0 = true;
        hi.l3 l3Var = this.y;
        if (l3Var != null) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.i61 i61Var = this.x;
        if (i61Var != null) {
            i61Var.g0();
            this.x.m0();
            this.x = null;
        }
        if (!this.T && (sz0Var = this.O) != null && sz0Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.en0 seekBarWaveform = this.O.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.n;
            if (r1Var != null) {
                r1Var.invalidate();
            }
        }
        this.I = false;
        d();
        c(false, new pz0(this, 3));
        k0 k0Var = this.b;
        k0Var.invalidate();
        bi.q2 q2Var = this.Z;
        if (q2Var != null) {
            org.telegram.ui.Cells.r1 r1Var2 = this.P;
            if (r1Var2 != null) {
                r1Var2.ob = true;
            }
            org.telegram.messenger.g0.g3(q2Var);
            this.Z = null;
            org.telegram.ui.Components.oz0 oz0Var = new org.telegram.ui.Components.oz0(this.a, null);
            this.d = oz0Var;
            k0Var.addView(oz0Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
            org.telegram.ui.Components.oz0 oz0Var2 = this.d;
            sz0 sz0Var2 = this.O;
            pz0 pz0Var = new pz0(this, 1);
            org.telegram.ui.Components.mz0 mz0Var = oz0Var2.a;
            if (mz0Var != null) {
                mz0Var.b(1.5f, sz0Var2, pz0Var);
                Choreographer.getInstance().postFrameCallback(oz0Var2.b);
            } else {
                org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(sz0Var2, pz0Var);
                nz0Var.g = 1.5f;
                oz0Var2.c.add(nz0Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.ys ysVar = this.F;
        if (ysVar != null) {
            PowerManager.WakeLock wakeLock = ysVar.h;
            SensorManager sensorManager = ysVar.a;
            if (ysVar.n) {
                Sensor sensor = ysVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(ysVar, sensor);
                }
                Sensor sensor2 = ysVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(ysVar, sensor2);
                }
                Sensor sensor3 = ysVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(ysVar, sensor3);
                }
                sensorManager.unregisterListener(ysVar, ysVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                ysVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.s));
        this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.s));
        hi.l3 l3Var = this.y;
        if (l3Var != null) {
            l3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.s));
            this.y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.ActionBar.t1 t1Var = this.d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.d0 = null;
            return;
        }
        if (this.c0 || (gjVar = this.N) == null || gjVar.P3()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
        String N0 = org.telegram.messenger.hd.N0(this.T ? 2131743347 : 2131743272, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
        t1Var2.S = N0;
        t1Var2.U = org.telegram.messenger.hd.N0(this.T ? 2131743348 : 2131743273, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751759, null), new rz0(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751586, null), new rz0(this, 2));
        this.d0 = t1Var2;
        t1Var2.show();
        TextView textView = (TextView) this.d0.d(-2);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        k0 k0Var = this.b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.ls.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.s2.a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(k0Var, !org.telegram.ui.ActionBar.m6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.r1 r1Var = this.P;
            if (r1Var != null) {
                r1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.rh(28, this, r1Var), 14.0f);
            this.X = true;
            c(true, null);
            he heVar = this.Y;
            if (heVar != null) {
                org.telegram.messenger.g0.g3(heVar);
                this.Y = null;
            }
            org.telegram.ui.Components.ys ysVar = this.F;
            if (ysVar != null) {
                PowerManager.WakeLock wakeLock = ysVar.h;
                SensorManager sensorManager = ysVar.a;
                if (ysVar.n) {
                    return;
                }
                Sensor sensor = ysVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(ysVar, sensor, 30000);
                }
                Sensor sensor2 = ysVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(ysVar, sensor2, 30000);
                }
                Sensor sensor3 = ysVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(ysVar, sensor3, 30000);
                }
                sensorManager.registerListener(ysVar, ysVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                ysVar.n = true;
            }
        }
    }
}
