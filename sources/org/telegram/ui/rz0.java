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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rz0 extends Dialog {
    public TextView D;
    public final org.telegram.ui.Components.js E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public org.telegram.messenger.ij M;
    public pz0 N;
    public org.telegram.ui.Cells.q1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.c8 V;
    public boolean W;
    public ie X;
    public bi.d3 Y;
    public final mz0 Z;
    public final Context a;
    public float a0;
    public final k0 b;
    public boolean b0;
    public final bi.x5 c;
    public org.telegram.ui.ActionBar.u1 c0;
    public org.telegram.ui.Components.dz0 d;
    public ValueAnimator d0;
    public i0.b e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public org.telegram.ui.Components.t51 x;
    public fi.m3 y;

    public rz0(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i7 = 0;
        this.Z = new mz0(this, i7);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.b = k0Var;
        k0Var.setOnClickListener(new nz0(this, i7));
        bi.x5 x5Var = new bi.x5(this, activity);
        this.c = x5Var;
        x5Var.setClipToPadding(false);
        k0Var.addView(x5Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        oz0 oz0Var = new oz0(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, oz0Var);
        if (org.telegram.messenger.iz.s0) {
            this.E = new org.telegram.ui.Components.js();
        }
    }

    public final void c(boolean z9, mz0 mz0Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z9 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(11, this, z9));
        this.d0.addListener(new ai.g0(this, z9, mz0Var, 13));
        long j3 = (z9 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.d0.setDuration(j3);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, z9 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new gz0(this, 3));
        this.e0.addListener(new z40(7, this, z9));
        this.e0.setDuration((long) (j3 * 1.5f));
        this.e0.setInterpolator(xqVar);
        this.e0.start();
    }

    public final void d() {
        if (this.H) {
            return;
        }
        k0 k0Var = this.b;
        if (k0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.O;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            float f10 = iArr[0] - this.e.a;
            int width = k0Var.getWidth();
            i0.b bVar = this.e;
            this.F = f10 - ((((width - bVar.a) - bVar.c) - this.O.getWidth()) / 2.0f);
            float f11 = iArr[1] - this.e.b;
            int height = k0Var.getHeight();
            i0.b bVar2 = this.e;
            this.G = org.telegram.messenger.k5.y(((height - bVar2.b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, f11);
            if (!this.J) {
                this.J = true;
                float i7 = (Utilities.i((this.O.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.O.getHeight()) / 2.0f);
                this.I = i7;
                if (this.S) {
                    this.I = 0.0f;
                } else {
                    this.I = org.telegram.messenger.g0.T1(0.0f, i7, 0.78f);
                }
            }
            e();
        } else {
            this.G = 0.0f;
            this.F = 0.0f;
        }
        this.H = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        pz0 pz0Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.c0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        fi.m3 m3Var = this.y;
        if (m3Var != null) {
            m3Var.f(true);
        }
        org.telegram.ui.Components.t51 t51Var = this.x;
        if (t51Var != null) {
            t51Var.g0();
            this.x.m0();
            this.x = null;
        }
        if (!this.S && (pz0Var = this.N) != null && pz0Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.pm0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new mz0(this, 3));
        k0 k0Var = this.b;
        k0Var.invalidate();
        bi.d3 d3Var = this.Y;
        if (d3Var != null) {
            org.telegram.ui.Cells.q1 q1Var2 = this.O;
            if (q1Var2 != null) {
                q1Var2.nb = true;
            }
            org.telegram.messenger.g0.h3(d3Var);
            this.Y = null;
            org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(this.a, null);
            this.d = dz0Var;
            k0Var.addView(dz0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
            org.telegram.ui.Components.dz0 dz0Var2 = this.d;
            pz0 pz0Var2 = this.N;
            mz0 mz0Var = new mz0(this, 1);
            org.telegram.ui.Components.bz0 bz0Var = dz0Var2.a;
            if (bz0Var != null) {
                bz0Var.b(1.5f, pz0Var2, mz0Var);
                Choreographer.getInstance().postFrameCallback(dz0Var2.b);
            } else {
                org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(pz0Var2, mz0Var);
                cz0Var.g = 1.5f;
                dz0Var2.c.add(cz0Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.js jsVar = this.E;
        if (jsVar != null) {
            PowerManager.WakeLock wakeLock = jsVar.h;
            SensorManager sensorManager = jsVar.a;
            if (jsVar.n) {
                Sensor sensor = jsVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(jsVar, sensor);
                }
                Sensor sensor2 = jsVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(jsVar, sensor2);
                }
                Sensor sensor3 = jsVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(jsVar, sensor3);
                }
                sensorManager.unregisterListener(jsVar, jsVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                jsVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(org.telegram.messenger.g0.T1(this.F, 0.0f, this.s));
        this.N.setTranslationY(org.telegram.messenger.g0.T1(this.G, this.I, this.s));
        fi.m3 m3Var = this.y;
        if (m3Var != null) {
            m3Var.setTranslationX(org.telegram.messenger.g0.T1(this.F, 0.0f, this.s));
            this.y.setTranslationY(org.telegram.messenger.g0.T1(this.G, this.I, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.u1 u1Var = this.c0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.c0 = null;
            return;
        }
        if (this.b0 || (ijVar = this.M) == null || ijVar.Q3()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.L);
        String M0 = org.telegram.messenger.id.M0(this.S ? 2131743595 : 2131743520, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
        u1Var2.R = M0;
        u1Var2.T = org.telegram.messenger.id.M0(this.S ? 2131743596 : 2131743521, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new oz0(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751599, null), new oz0(this, 2));
        this.c0 = u1Var2;
        u1Var2.show();
        TextView textView = (TextView) this.c0.d(-2);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z9 = org.telegram.messenger.r2.a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(k0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.O;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.fx(24, this, q1Var), 14.0f);
            this.W = true;
            c(true, null);
            ie ieVar = this.X;
            if (ieVar != null) {
                org.telegram.messenger.g0.h3(ieVar);
                this.X = null;
            }
            org.telegram.ui.Components.js jsVar = this.E;
            if (jsVar != null) {
                PowerManager.WakeLock wakeLock = jsVar.h;
                SensorManager sensorManager = jsVar.a;
                if (jsVar.n) {
                    return;
                }
                Sensor sensor = jsVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(jsVar, sensor, 30000);
                }
                Sensor sensor2 = jsVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(jsVar, sensor2, 30000);
                }
                Sensor sensor3 = jsVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(jsVar, sensor3, 30000);
                }
                sensorManager.registerListener(jsVar, jsVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                jsVar.n = true;
            }
        }
    }
}
