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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w41 extends Dialog {
    public final org.telegram.ui.Components.et B;
    public float C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
    public float H;
    public org.telegram.ui.ActionBar.f6 I;
    public MessageObject J;
    public u41 K;
    public org.telegram.ui.Cells.s1 L;
    public TextureView M;
    public boolean N;
    public final RectF O;
    public boolean P;
    public float Q;
    public float R;
    public org.telegram.ui.Components.d8 S;
    public boolean T;
    public te U;
    public i5.v V;
    public final r41 W;
    public float X;
    public boolean Y;
    public org.telegram.ui.ActionBar.d2 Z;
    public final Context a;
    public ValueAnimator a0;
    public final n0 b;
    public ValueAnimator b0;
    public final ah.e c;
    public org.telegram.ui.Components.a11 d;
    public i0.b e;
    public Bitmap f;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float v;
    public org.telegram.ui.Components.i71 w;
    public ph.f3 x;
    public TextView y;

    public w41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.O = new RectF();
        this.Q = 0.0f;
        this.R = 0.0f;
        int i10 = 0;
        this.W = new r41(this, i10);
        this.X = 0.0f;
        this.Y = false;
        this.a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        n0 n0Var = new n0(this, activity, 22);
        this.b = n0Var;
        n0Var.setOnClickListener(new s41(this, i10));
        ah.e eVar = new ah.e(this, activity);
        this.c = eVar;
        eVar.setClipToPadding(false);
        n0Var.addView(eVar, k7.b6.e(-1, -1, 119));
        t41 t41Var = new t41(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var, t41Var);
        if (SharedConfig.raiseToListen) {
            this.B = new org.telegram.ui.Components.et();
        }
    }

    public final void c(boolean z4, r41 r41Var) {
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z4 ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        int i10 = 11;
        ofFloat.addUpdateListener(new dg.b1(i10, this, z4));
        this.a0.addListener(new androidx.fragment.app.g(this, z4, r41Var, i10));
        long j10 = (z4 || this.V != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.a0;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        valueAnimator3.setInterpolator(mrVar);
        this.a0.setDuration(j10);
        this.a0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v, z4 ? 1.0f : 0.0f);
        this.b0 = ofFloat2;
        ofFloat2.addUpdateListener(new o11(this, 7));
        this.b0.addListener(new org.telegram.ui.Components.m00(29, this, z4));
        this.b0.setDuration((long) (j10 * 1.5f));
        this.b0.setInterpolator(mrVar);
        this.b0.start();
    }

    public final void d() {
        if (this.E) {
            return;
        }
        n0 n0Var = this.b;
        if (n0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.L;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            float f10 = iArr[0] - this.e.a;
            int width = n0Var.getWidth();
            i0.b bVar = this.e;
            this.C = f10 - ((((width - bVar.a) - bVar.c) - this.L.getWidth()) / 2.0f);
            float f11 = iArr[1] - this.e.b;
            int height = n0Var.getHeight();
            i0.b bVar2 = this.e;
            this.D = org.telegram.messenger.y3.a(((height - bVar2.b) - bVar2.d) - this.L.getHeight(), this.H, 2.0f, f11);
            if (!this.G) {
                this.G = true;
                float clamp = (Utilities.clamp((this.L.getHeight() / 2.0f) + iArr[1], n0Var.getHeight() * 0.7f, n0Var.getHeight() * 0.3f) - (this.L.getHeight() / 2.0f)) - ((n0Var.getHeight() - this.L.getHeight()) / 2.0f);
                this.F = clamp;
                if (this.P) {
                    this.F = 0.0f;
                } else {
                    this.F = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
                }
            }
            e();
        } else {
            this.D = 0.0f;
            this.C = 0.0f;
        }
        this.E = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        u41 u41Var;
        if (this.Y) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.Z;
        if (d2Var != null) {
            d2Var.dismiss();
            this.Z = null;
        }
        this.Y = true;
        ph.f3 f3Var = this.x;
        if (f3Var != null) {
            f3Var.e(true);
        }
        org.telegram.ui.Components.i71 i71Var = this.w;
        if (i71Var != null) {
            i71Var.B();
            this.w.H();
            this.w = null;
        }
        if (!this.P && (u41Var = this.K) != null && u41Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.lo0 seekBarWaveform = this.K.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
        this.E = false;
        d();
        c(false, new r41(this, 3));
        n0 n0Var = this.b;
        n0Var.invalidate();
        i5.v vVar = this.V;
        if (vVar != null) {
            org.telegram.ui.Cells.s1 s1Var2 = this.L;
            if (s1Var2 != null) {
                s1Var2.cd = true;
            }
            AndroidUtilities.runOnUIThread(vVar);
            this.V = null;
            org.telegram.ui.Components.a11 a11Var = new org.telegram.ui.Components.a11(this.a, null);
            this.d = a11Var;
            n0Var.addView(a11Var, k7.b6.e(-1, -1, 119));
            org.telegram.ui.Components.a11 a11Var2 = this.d;
            u41 u41Var2 = this.K;
            r41 r41Var = new r41(this, 1);
            org.telegram.ui.Components.y01 y01Var = a11Var2.a;
            if (y01Var != null) {
                y01Var.e(u41Var2, 1.5f, r41Var);
                Choreographer.getInstance().postFrameCallback(a11Var2.b);
            } else {
                org.telegram.ui.Components.z01 z01Var = new org.telegram.ui.Components.z01(u41Var2, r41Var);
                z01Var.g = 1.5f;
                a11Var2.c.add(z01Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.et etVar = this.B;
        if (etVar != null) {
            PowerManager.WakeLock wakeLock = etVar.h;
            SensorManager sensorManager = etVar.a;
            if (etVar.n) {
                Sensor sensor = etVar.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(etVar, sensor);
                }
                Sensor sensor2 = etVar.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(etVar, sensor2);
                }
                Sensor sensor3 = etVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(etVar, sensor3);
                }
                sensorManager.unregisterListener(etVar, etVar.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                etVar.n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.K.setTranslationX(AndroidUtilities.lerp(this.C, 0.0f, this.s));
        this.K.setTranslationY(AndroidUtilities.lerp(this.D, this.F, this.s));
        ph.f3 f3Var = this.x;
        if (f3Var != null) {
            f3Var.setTranslationX(AndroidUtilities.lerp(this.C, 0.0f, this.s));
            this.x.setTranslationY(AndroidUtilities.lerp(this.D, this.F, this.s));
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.d2 d2Var = this.Z;
        if (d2Var != null) {
            d2Var.dismiss();
            this.Z = null;
            return;
        }
        if (this.Y || (messageObject = this.J) == null || messageObject.isOutOwner()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.I);
        alertDialog$Builder.a.O = LocaleController.getString(this.P ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(this.P ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new t41(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new t41(this, 2));
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        this.Z = d2Var2;
        d2Var2.show();
        TextView textView = (TextView) this.Z.d(-2);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        n0 n0Var = this.b;
        setContentView(n0Var, layoutParams);
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
        n0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(n0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.s1 s1Var = this.L;
            if (s1Var != null) {
                s1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.vk(25, this, s1Var), 14.0f);
            this.T = true;
            c(true, null);
            te teVar = this.U;
            if (teVar != null) {
                AndroidUtilities.runOnUIThread(teVar);
                this.U = null;
            }
            org.telegram.ui.Components.et etVar = this.B;
            if (etVar != null) {
                PowerManager.WakeLock wakeLock = etVar.h;
                SensorManager sensorManager = etVar.a;
                if (etVar.n) {
                    return;
                }
                Sensor sensor = etVar.f;
                if (sensor != null) {
                    sensorManager.registerListener(etVar, sensor, 30000);
                }
                Sensor sensor2 = etVar.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(etVar, sensor2, 30000);
                }
                Sensor sensor3 = etVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(etVar, sensor3, 30000);
                }
                sensorManager.registerListener(etVar, etVar.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                etVar.n = true;
            }
        }
    }
}
