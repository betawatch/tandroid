// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class px9 extends Dialog {
    public final int E;
    public final int F;
    public final int G;
    public final int[] H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ tx9 Q;
    public final dx9 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final jx9 f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final oc6 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout w;
    public fx0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px9(tx9 tx9Var, Context context, jx9 jx9Var, View view, dx9 dx9Var, wjb wjbVar) {
        super(context);
        boolean z;
        gl5 b;
        String str;
        ColorFilter colorFilter;
        this.Q = tx9Var;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.a = dx9Var;
        this.f = jx9Var;
        this.h = view;
        final jw9 jw9Var = (jw9) this;
        oc6 oc6Var = new oc6((byte) 19, context, jw9Var);
        this.s = oc6Var;
        setContentView(oc6Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new si9((byte) 2, context, jw9Var), nme.t(kk7.p2, kk7.p2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, wjbVar, context);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.t(-2, -2, 17, 0, 0, 0, 0));
        final byte b2 = 0;
        r7.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745340, null), false, wjbVar).setOnClickListener(new View.OnClickListener() { // from class: mx9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                jw9 jw9Var2 = jw9Var;
                switch (b3) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b3 = 1;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745338, null), false, wjbVar).setOnClickListener(new View.OnClickListener() { // from class: mx9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                jw9 jw9Var2 = jw9Var;
                switch (b32) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b4 = 2;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745337, null), false, wjbVar).setOnClickListener(new View.OnClickListener() { // from class: mx9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b4;
                jw9 jw9Var2 = jw9Var;
                switch (b32) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b5 = 3;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745339, null), false, wjbVar).setOnClickListener(new View.OnClickListener() { // from class: mx9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b5;
                jw9 jw9Var2 = jw9Var;
                switch (b32) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        r7.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745335, null), false, wjbVar).setOnClickListener(new b99(jw9Var, context, b5));
        oc6Var.addView(linearLayout, nme.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            oc6Var.setOnApplyWindowInsetsListener(new vs(jw9Var));
            attributes.flags |= 1024;
            z = true;
            oc6Var.setFitsSystemWindows(true);
            oc6Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z = true;
        }
        dx9Var.b = z;
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.p0(oc6Var);
        imageReceiver.m0(7);
        TLRPC.Document document = dx9Var.d;
        if (document == null) {
            Drawable drawable = dx9Var.F;
            if (drawable instanceof vl) {
                document = ((vl) drawable).e;
            }
        }
        if (document != null) {
            kcb d = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b = gl5.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && k27.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b = gl5.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.Y(b, str, gl5.c(w, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((dx9Var.F instanceof vl) && (k27.B4(document2) || ((vl) dx9Var.F).c())) {
                if (!k27.B4(document2)) {
                    vl vlVar = (vl) dx9Var.F;
                    SparseArray sparseArray = vl.r;
                    if (vlVar == null || !vlVar.k()) {
                        colorFilter = bkb.n0(wjbVar);
                        imageReceiver.p1 = colorFilter;
                    }
                }
                colorFilter = tx9Var.l1;
                imageReceiver.p1 = colorFilter;
            }
        }
        dx9Var.getLocationOnScreen(iArr);
        rect.left = dx9Var.getPaddingLeft() + iArr[0];
        rect.top = dx9Var.getPaddingTop() + iArr[1];
        rect.right = (dx9Var.getWidth() + iArr[0]) - dx9Var.getPaddingRight();
        rect.bottom = (dx9Var.getHeight() + iArr[1]) - dx9Var.getPaddingBottom();
        gl.V1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i = iArr[1];
        this.F = i;
        this.G = view.getHeight() + i;
    }

    public static /* synthetic */ WindowInsets e(View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            if (this.N == z) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.N = z;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, z ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new x89(this, (byte) 18));
        this.O.addListener(new pu9((byte) 1, this, z));
        ValueAnimator valueAnimator2 = this.O;
        if (z) {
            valueAnimator2.setDuration(360L);
            this.O.setInterpolator(s33.h);
        } else {
            valueAnimator2.setDuration(240L);
            this.O.setInterpolator(s33.g);
        }
        this.O.start();
    }

    public final void b(final boolean z, lx9 lx9Var, final lx9 lx9Var2, final boolean z2) {
        dx9 dx9Var = this.a;
        if (dx9Var == null) {
            if (lx9Var != null) {
                lx9Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            if (this.K == z) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.K = z;
        if (z) {
            dx9Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z ? 1.0f : 0.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nx9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                lx9 lx9Var3;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                px9 px9Var = px9.this;
                px9Var.J = floatValue;
                gl.V1(px9Var.c, px9Var.d, floatValue, px9Var.e);
                px9Var.s.invalidate();
                boolean z3 = z;
                if (!z3) {
                    px9Var.w.setAlpha(px9Var.J);
                }
                if (px9Var.J < 0.025f && !z3) {
                    if (z2) {
                        px9Var.a.b = false;
                        px9Var.Q.i0.invalidate();
                    }
                    kk7.e().k(kk7.j1, 4);
                }
                if (px9Var.J >= 0.5f || z3 || (lx9Var3 = lx9Var2) == null) {
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                lx9Var3.run();
            }
        });
        this.L.addListener(new ox9(this, z, lx9Var2, zArr, z2, lx9Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(s33.h);
        this.L.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Integer num) {
        boolean z;
        jx9 jx9Var;
        if (this.I) {
            return;
        }
        byte b = 1;
        this.I = true;
        byte b2 = 0;
        Rect rect = this.c;
        if (num != null) {
            kw9 kw9Var = ((jw9) this).T;
            tx9 tx9Var = kw9Var.e;
            if (tx9Var.p1 != null && kw9Var.d != null) {
                rect.set(tx9Var.q1);
                z = true;
                this.y = z;
                int[] iArr = this.H;
                if (z) {
                    dx9 dx9Var = this.a;
                    dx9Var.getLocationOnScreen(iArr);
                    rect.left = dx9Var.getPaddingLeft() + iArr[0];
                    rect.top = dx9Var.getPaddingTop() + iArr[1];
                    rect.right = (dx9Var.getWidth() + iArr[0]) - dx9Var.getPaddingRight();
                    rect.bottom = (dx9Var.getHeight() + iArr[1]) - dx9Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (jx9Var = this.f) != null) {
                    jx9Var.run();
                }
                b(false, new lx9(this, num, b2), new lx9(this, num, b), !z);
                a(false);
            }
        }
        z = false;
        this.y = z;
        int[] iArr2 = this.H;
        if (z) {
        }
        if (num != null) {
            jx9Var.run();
        }
        b(false, new lx9(this, num, b2), new lx9(this, num, b), !z);
        a(false);
    }

    public final void d(Integer num) {
        jx9 jx9Var;
        jw9 jw9Var = (jw9) this;
        if (num != null && (jx9Var = jw9Var.T.e.V1) != null) {
            jx9Var.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.P) {
            return;
        }
        c(null);
        this.P = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || motionEvent.getAction() != 0) {
            return dispatchTouchEvent;
        }
        dismiss();
        return false;
    }

    public final void f() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
        int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.083333336f, 0.083333336f);
        canvas.drawColor(bkb.w0(null, bkb.c6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.N().getLastFragment().getVisibleDialog() != null) {
                launchActivity.N().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.H);
            canvas.save();
            canvas.translate(r2[0], r2[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / kk7.J2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        kk7.e().k(kk7.i1, 4);
        b(true, null, null, true);
        a(true);
    }
}
