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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class r51 extends Dialog {
    public final org.telegram.ui.Components.wt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.c6 L;
    public MessageObject M;
    public p51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.n8 V;
    public boolean W;
    public bf X;
    public a3.i0 Y;
    public final m51 Z;
    public final Context a;
    public float a0;
    public final l0 b;
    public boolean b0;
    public final ah.v c;
    public org.telegram.ui.ActionBar.a2 c0;
    public org.telegram.ui.Components.z11 d;
    public ValueAnimator d0;
    public i0.b e;
    public ValueAnimator e0;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.i81 w;
    public di.d4 x;
    public TextView y;

    public r51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        int i10 = 0;
        this.Z = new m51(this, i10);
        this.a0 = 0.0f;
        this.b0 = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        l0 l0Var = new l0(this, activity, 22);
        this.b = l0Var;
        l0Var.setOnClickListener(new n51(this, i10));
        ah.v vVar = new ah.v(this, activity);
        this.c = vVar;
        vVar.setClipToPadding(false);
        l0Var.addView(vVar, w7.z5.e(-1, -1, 119));
        o51 o51Var = new o51(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l0Var, o51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.wt();
        }
    }

    public final void c(boolean z10, m51 m51Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        int i10 = 11;
        ofFloat.addUpdateListener(new ah.k0(i10, this, z10));
        this.d0.addListener(new ah.q0(this, z10, m51Var, i10));
        long j10 = (z10 || this.Y != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.d0.setDuration(j10);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new f21(this, 7));
        this.e0.addListener(new i50(8, this, z10));
        this.e0.setDuration((long) (j10 * 1.5f));
        this.e0.setInterpolator(esVar);
        this.e0.start();
    }

    public final void d() {
        if (this.H) {
            return;
        }
        l0 l0Var = this.b;
        if (l0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = this.O;
        if (u1Var != null) {
            int[] iArr = new int[2];
            u1Var.getLocationOnScreen(iArr);
            float f7 = iArr[0] - this.e.a;
            int width = l0Var.getWidth();
            i0.b bVar = this.e;
            this.F = f7 - ((((width - bVar.a) - bVar.c) - this.O.getWidth()) / 2.0f);
            float f10 = iArr[1] - this.e.b;
            int height = l0Var.getHeight();
            i0.b bVar2 = this.e;
            this.G = org.telegram.messenger.g0.x(((height - bVar2.b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, f10);
            if (!this.J) {
                this.J = true;
                float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.O.getHeight()) / 2.0f);
                this.I = clamp;
                if (this.S) {
                    this.I = 0.0f;
                } else {
                    this.I = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
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
        p51 p51Var;
        if (this.b0) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = this.c0;
        if (a2Var != null) {
            a2Var.dismiss();
            this.c0 = null;
        }
        this.b0 = true;
        di.d4 d4Var = this.x;
        if (d4Var != null) {
            d4Var.e(true);
        }
        org.telegram.ui.Components.i81 i81Var = this.w;
        if (i81Var != null) {
            i81Var.B();
            this.w.H();
            this.w = null;
        }
        if (!this.S && (p51Var = this.N) != null && p51Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.jp0 seekBarWaveform = this.N.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
        this.H = false;
        d();
        c(false, new m51(this, 3));
        l0 l0Var = this.b;
        l0Var.invalidate();
        a3.i0 i0Var = this.Y;
        if (i0Var != null) {
            org.telegram.ui.Cells.u1 u1Var2 = this.O;
            if (u1Var2 != null) {
                u1Var2.fd = true;
            }
            AndroidUtilities.runOnUIThread(i0Var);
            this.Y = null;
            org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(this.a, null);
            this.d = z11Var;
            l0Var.addView(z11Var, w7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.z11 z11Var2 = this.d;
            p51 p51Var2 = this.N;
            m51 m51Var = new m51(this, 1);
            org.telegram.ui.Components.x11 x11Var = z11Var2.a;
            if (x11Var != null) {
                x11Var.d(p51Var2, 1.5f, m51Var);
                Choreographer.getInstance().postFrameCallback(z11Var2.b);
            } else {
                org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(p51Var2, m51Var);
                y11Var.g = 1.5f;
                z11Var2.c.add(y11Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.wt wtVar = this.E;
        if (wtVar != null) {
            PowerManager.WakeLock wakeLock = wtVar.h;
            SensorManager sensorManager = wtVar.a;
            if (wtVar.n) {
                Sensor sensor = wtVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(wtVar, sensor);
                }
                Sensor sensor2 = wtVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(wtVar, sensor2);
                }
                Sensor sensor3 = wtVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(wtVar, sensor3);
                }
                sensorManager.unregisterListener(wtVar, wtVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                wtVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
        this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        di.d4 d4Var = this.x;
        if (d4Var != null) {
            d4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.s));
            this.x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.a2 a2Var = this.c0;
        if (a2Var != null) {
            a2Var.dismiss();
            this.c0 = null;
            return;
        }
        if (this.b0 || (messageObject = this.M) == null || messageObject.isOutOwner()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
        alertDialog$Builder.a.R = LocaleController.getString(this.S ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle);
        alertDialog$Builder.a.T = LocaleController.getString(this.S ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new o51(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new o51(this, 2));
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
        this.c0 = a2Var2;
        a2Var2.show();
        TextView textView = (TextView) this.c0.d(-2);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        l0 l0Var = this.b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(l0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new mt(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            bf bfVar = this.X;
            if (bfVar != null) {
                AndroidUtilities.runOnUIThread(bfVar);
                this.X = null;
            }
            org.telegram.ui.Components.wt wtVar = this.E;
            if (wtVar != null) {
                PowerManager.WakeLock wakeLock = wtVar.h;
                SensorManager sensorManager = wtVar.a;
                if (wtVar.n) {
                    return;
                }
                Sensor sensor = wtVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(wtVar, sensor, 30000);
                }
                Sensor sensor2 = wtVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(wtVar, sensor2, 30000);
                }
                Sensor sensor3 = wtVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(wtVar, sensor3, 30000);
                }
                sensorManager.registerListener(wtVar, wtVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                wtVar.n = true;
            }
        }
    }
}
