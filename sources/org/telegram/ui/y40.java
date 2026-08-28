package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y40 extends Dialog {
    public final ih.b3 a;
    public final fh.l2 b;
    public Bitmap c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f;
    public float h;
    public ValueAnimator n;
    public boolean r;

    public y40(Context context, fh.l2 l2Var) {
        super(context, R.style.TransparentDialog);
        this.f = new Matrix();
        this.b = l2Var;
        l2Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new df(29, this, l2Var), 14.0f);
        ih.b3 b3Var = new ih.b3(this, context, l2Var);
        this.a = b3Var;
        b3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f10, x40 x40Var) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new f3(this, 16));
        this.n.addListener(new gh.o5(this, f10, x40Var, 4));
        this.n.setDuration(420L);
        this.n.setInterpolator(org.telegram.ui.Components.gr.h);
        this.n.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.r) {
            return;
        }
        this.r = true;
        b(0.0f, new x40(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i9 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i9;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i9 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        b(1.0f, null);
        AndroidUtilities.runOnUIThread(new x40(this, 1), 16L);
    }
}
