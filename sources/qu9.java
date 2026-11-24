// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qu9 extends Dialog {
    public TextView E;
    public final ks3 F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public wjb M;
    public k27 N;
    public ou9 O;
    public gb2 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public n40 W;
    public boolean X;
    public bl1 Y;
    public de2 Z;
    public final Activity a;
    public final ku9 a0;
    public final oc6 b;
    public float b0;
    public final st c;
    public boolean c0;
    public ijb d;
    public hd d0;
    public io5 e;
    public ValueAnimator e0;
    public Bitmap f;
    public ValueAnimator f0;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public lbc x;
    public je5 y;

    public qu9(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = io5.e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        byte b = 0;
        this.a0 = new ku9(this, b);
        this.b0 = 0.0f;
        this.c0 = false;
        this.a = activity;
        gl.S(getWindow());
        oc6 oc6Var = new oc6((byte) 18, activity, this);
        this.b = oc6Var;
        oc6Var.setOnClickListener(new lu9(this, b));
        st stVar = new st(this, activity);
        this.c = stVar;
        stVar.setClipToPadding(false);
        oc6Var.addView(stVar, nme.e(-1, -1, kk7.D1));
        mu9 mu9Var = new mu9(this, b);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(oc6Var, mu9Var);
        if (gba.p0) {
            this.F = new ks3();
        }
    }

    public final void a(boolean z, ku9 ku9Var) {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        byte b = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new d20((byte) 8, this, z));
        this.e0.addListener(new qw((Object) this, z, (Object) ku9Var, (byte) 12));
        long j = (z || this.Z != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.e0;
        s33 s33Var = s33.h;
        valueAnimator3.setInterpolator(s33Var);
        this.e0.setDuration(j);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, z ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new x89(this, (byte) 15));
        this.f0.addListener(new pu9(b, this, z));
        this.f0.setDuration((long) (j * 1.5f));
        this.f0.setInterpolator(s33Var);
        this.f0.start();
    }

    public final /* synthetic */ void b() {
        super.dismiss();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    public final void d() {
        if (this.I) {
            return;
        }
        oc6 oc6Var = this.b;
        if (oc6Var.getWidth() > 0) {
            gb2 gb2Var = this.P;
            if (gb2Var != null) {
                int[] iArr = new int[2];
                gb2Var.getLocationOnScreen(iArr);
                float f = iArr[0] - this.e.a;
                int width = oc6Var.getWidth();
                io5 io5Var = this.e;
                this.G = f - ((((width - io5Var.a) - io5Var.c) - this.P.getWidth()) / 2.0f);
                float f2 = iArr[1] - this.e.b;
                int height = oc6Var.getHeight();
                io5 io5Var2 = this.e;
                this.H = tb4.x(((height - io5Var2.b) - io5Var2.d) - this.P.getHeight(), this.L, 2.0f, f2);
                if (!this.K) {
                    this.K = true;
                    float i = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], oc6Var.getHeight() * 0.7f, oc6Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((oc6Var.getHeight() - this.P.getHeight()) / 2.0f);
                    this.J = i;
                    if (this.T) {
                        this.J = 0.0f;
                    } else {
                        this.J = gl.R1(0.0f, i, 0.78f);
                    }
                }
                e();
            } else {
                this.H = 0.0f;
                this.G = 0.0f;
            }
            this.I = true;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ou9 ou9Var;
        if (this.c0) {
            return;
        }
        hd hdVar = this.d0;
        if (hdVar != null) {
            hdVar.dismiss();
            this.d0 = null;
        }
        byte b = 1;
        this.c0 = true;
        je5 je5Var = this.y;
        if (je5Var != null) {
            je5Var.f(true);
        }
        lbc lbcVar = this.x;
        if (lbcVar != null) {
            lbcVar.f0();
            this.x.l0();
            this.x = null;
        }
        if (!this.T && (ou9Var = this.O) != null && ou9Var.getSeekBarWaveform() != null) {
            dv9 seekBarWaveform = this.O.getSeekBarWaveform();
            seekBarWaveform.L = this.s;
            gb2 gb2Var = seekBarWaveform.n;
            if (gb2Var != null) {
                gb2Var.invalidate();
            }
        }
        this.I = false;
        d();
        a(false, new ku9(this, (byte) 3));
        oc6 oc6Var = this.b;
        oc6Var.invalidate();
        de2 de2Var = this.Z;
        if (de2Var != null) {
            gb2 gb2Var2 = this.P;
            if (gb2Var2 != null) {
                gb2Var2.Ab = true;
            }
            gl.c3(de2Var);
            this.Z = null;
            ijb ijbVar = new ijb(this.a, null);
            this.d = ijbVar;
            oc6Var.addView(ijbVar, nme.e(-1, -1, kk7.D1));
            ijb ijbVar2 = this.d;
            ou9 ou9Var2 = this.O;
            ku9 ku9Var = new ku9(this, b);
            gjb gjbVar = ijbVar2.a;
            if (gjbVar != null) {
                gjbVar.b(1.5f, ou9Var2, ku9Var);
                Choreographer.getInstance().postFrameCallback(ijbVar2.b);
            } else {
                hjb hjbVar = new hjb(ou9Var2, ku9Var);
                hjbVar.g = 1.5f;
                ijbVar2.c.add(hjbVar);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        ks3 ks3Var = this.F;
        if (ks3Var != null) {
            PowerManager.WakeLock wakeLock = ks3Var.h;
            SensorManager sensorManager = ks3Var.a;
            if (ks3Var.n) {
                Sensor sensor = ks3Var.f;
                if (sensor != null) {
                    sensorManager.unregisterListener(ks3Var, sensor);
                }
                Sensor sensor2 = ks3Var.e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(ks3Var, sensor2);
                }
                Sensor sensor3 = ks3Var.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(ks3Var, sensor3);
                }
                sensorManager.unregisterListener(ks3Var, ks3Var.c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                ks3Var.n = false;
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(gl.R1(this.G, 0.0f, this.s));
            this.O.setTranslationY(gl.R1(this.H, this.J, this.s));
            je5 je5Var = this.y;
            if (je5Var != null) {
                je5Var.setTranslationX(gl.R1(this.G, 0.0f, this.s));
                this.y.setTranslationY(gl.R1(this.H, this.J, this.s));
            }
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        k27 k27Var;
        hd hdVar = this.d0;
        if (hdVar != null) {
            hdVar.dismiss();
            this.d0 = null;
            return;
        }
        if (this.c0 || (k27Var = this.N) == null || k27Var.O3()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, getContext());
        String M0 = k96.M0(this.T ? 2131743353 : 2131743275, null);
        hd hdVar2 = alertDialog$Builder.a;
        hdVar2.S = M0;
        hdVar2.U = k96.M0(this.T ? 2131743354 : 2131743276, null);
        alertDialog$Builder.j(k96.M0(2131751759, null), new mu9(this, (byte) 1));
        alertDialog$Builder.g(k96.M0(2131751586, null), new mu9(this, (byte) 2));
        this.d0 = hdVar2;
        hdVar2.show();
        TextView textView = (TextView) this.d0.c(-2);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        oc6 oc6Var = this.b;
        setContentView(oc6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = kk7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i;
        boolean z = w01.a;
        attributes.flags = i | (-2013060864);
        gl.f2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        oc6Var.setSystemUiVisibility(1284);
        gl.j3(oc6Var, !bkb.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gl.K1(getContext())) {
            super.show();
            gb2 gb2Var = this.P;
            if (gb2Var != null) {
                gb2Var.setVisibility(4);
            }
            gl.j2(new nu9(this, gb2Var, (byte) 0), 14.0f);
            this.X = true;
            a(true, null);
            bl1 bl1Var = this.Y;
            if (bl1Var != null) {
                gl.c3(bl1Var);
                this.Y = null;
            }
            ks3 ks3Var = this.F;
            if (ks3Var != null) {
                PowerManager.WakeLock wakeLock = ks3Var.h;
                SensorManager sensorManager = ks3Var.a;
                if (ks3Var.n) {
                    return;
                }
                Sensor sensor = ks3Var.f;
                if (sensor != null) {
                    sensorManager.registerListener(ks3Var, sensor, 30000);
                }
                Sensor sensor2 = ks3Var.e;
                if (sensor2 != null) {
                    sensorManager.registerListener(ks3Var, sensor2, 30000);
                }
                Sensor sensor3 = ks3Var.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(ks3Var, sensor3, 30000);
                }
                sensorManager.registerListener(ks3Var, ks3Var.c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                ks3Var.n = true;
            }
        }
    }
}
