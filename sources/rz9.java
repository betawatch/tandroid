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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class rz9 extends Dialog {
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
    public final /* synthetic */ vz9 Q;
    public final fz9 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final lz9 f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final ne6 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout w;
    public my0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz9(vz9 vz9Var, Context context, lz9 lz9Var, View view, fz9 fz9Var, ylb ylbVar) {
        super(context);
        boolean z;
        gn5 b;
        String str;
        ColorFilter colorFilter;
        this.Q = vz9Var;
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
        this.a = fz9Var;
        this.f = lz9Var;
        this.h = view;
        final ly9 ly9Var = (ly9) this;
        ne6 ne6Var = new ne6((byte) 19, context, ly9Var);
        this.s = ne6Var;
        setContentView(ne6Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new xd9((byte) 3, context, ly9Var), qoe.t(nm7.p2, nm7.p2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, ylbVar, context);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.t(-2, -2, 17, 0, 0, 0, 0));
        final byte b2 = 0;
        r7.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131745266, null), false, ylbVar).setOnClickListener(new View.OnClickListener() { // from class: oz9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                ly9 ly9Var2 = ly9Var;
                switch (b3) {
                    case 0:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b3 = 1;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131745264, null), false, ylbVar).setOnClickListener(new View.OnClickListener() { // from class: oz9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                ly9 ly9Var2 = ly9Var;
                switch (b32) {
                    case 0:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b4 = 2;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131745263, null), false, ylbVar).setOnClickListener(new View.OnClickListener() { // from class: oz9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b4;
                ly9 ly9Var2 = ly9Var;
                switch (b32) {
                    case 0:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b5 = 3;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131745265, null), false, ylbVar).setOnClickListener(new View.OnClickListener() { // from class: oz9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b5;
                ly9 ly9Var2 = ly9Var;
                switch (b32) {
                    case 0:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        ly9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        r7.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, jb6.M0(2131745261, null), false, ylbVar).setOnClickListener(new r39(ly9Var, context, (byte) 4));
        ne6Var.addView(linearLayout, qoe.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            ne6Var.setOnApplyWindowInsetsListener(new wt(ly9Var));
            attributes.flags |= 1024;
            z = true;
            ne6Var.setFitsSystemWindows(true);
            ne6Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z = true;
        }
        fz9Var.b = z;
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.p0(ne6Var);
        imageReceiver.m0(7);
        TLRPC.Document document = fz9Var.d;
        if (document == null) {
            Drawable drawable = fz9Var.F;
            if (drawable instanceof vm) {
                document = ((vm) drawable).e;
            }
        }
        if (document != null) {
            meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
            TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b = gn5.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && k47.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b = gn5.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.Y(b, str, gn5.c(w, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((fz9Var.F instanceof vm) && (k47.B4(document2) || ((vm) fz9Var.F).c())) {
                if (!k47.B4(document2)) {
                    vm vmVar = (vm) fz9Var.F;
                    SparseArray sparseArray = vm.r;
                    if (vmVar == null || !vmVar.k()) {
                        colorFilter = cmb.n0(ylbVar);
                        imageReceiver.p1 = colorFilter;
                    }
                }
                colorFilter = vz9Var.l1;
                imageReceiver.p1 = colorFilter;
            }
        }
        fz9Var.getLocationOnScreen(iArr);
        rect.left = fz9Var.getPaddingLeft() + iArr[0];
        rect.top = fz9Var.getPaddingTop() + iArr[1];
        rect.right = (fz9Var.getWidth() + iArr[0]) - fz9Var.getPaddingRight();
        rect.bottom = (fz9Var.getHeight() + iArr[1]) - fz9Var.getPaddingBottom();
        gm.V1(rect, rect2, this.J, rect3);
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
        ofFloat.addUpdateListener(new p29(this, (byte) 20));
        this.O.addListener(new sw9((byte) 1, this, z));
        ValueAnimator valueAnimator2 = this.O;
        if (z) {
            valueAnimator2.setDuration(360L);
            this.O.setInterpolator(d53.h);
        } else {
            valueAnimator2.setDuration(240L);
            this.O.setInterpolator(d53.g);
        }
        this.O.start();
    }

    public final void b(final boolean z, nz9 nz9Var, final nz9 nz9Var2, final boolean z2) {
        fz9 fz9Var = this.a;
        if (fz9Var == null) {
            if (nz9Var != null) {
                nz9Var.run();
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
            fz9Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z ? 1.0f : 0.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pz9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                nz9 nz9Var3;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                rz9 rz9Var = rz9.this;
                rz9Var.J = floatValue;
                gm.V1(rz9Var.c, rz9Var.d, floatValue, rz9Var.e);
                rz9Var.s.invalidate();
                boolean z3 = z;
                if (!z3) {
                    rz9Var.w.setAlpha(rz9Var.J);
                }
                if (rz9Var.J < 0.025f && !z3) {
                    if (z2) {
                        rz9Var.a.b = false;
                        rz9Var.Q.i0.invalidate();
                    }
                    nm7.e().k(nm7.k1, 4);
                }
                if (rz9Var.J >= 0.5f || z3 || (nz9Var3 = nz9Var2) == null) {
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                nz9Var3.run();
            }
        });
        this.L.addListener(new qz9(this, z, nz9Var2, zArr, z2, nz9Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(d53.h);
        this.L.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Integer num) {
        boolean z;
        lz9 lz9Var;
        if (this.I) {
            return;
        }
        byte b = 1;
        this.I = true;
        byte b2 = 0;
        Rect rect = this.c;
        if (num != null) {
            my9 my9Var = ((ly9) this).T;
            vz9 vz9Var = my9Var.e;
            if (vz9Var.p1 != null && my9Var.d != null) {
                rect.set(vz9Var.q1);
                z = true;
                this.y = z;
                int[] iArr = this.H;
                if (z) {
                    fz9 fz9Var = this.a;
                    fz9Var.getLocationOnScreen(iArr);
                    rect.left = fz9Var.getPaddingLeft() + iArr[0];
                    rect.top = fz9Var.getPaddingTop() + iArr[1];
                    rect.right = (fz9Var.getWidth() + iArr[0]) - fz9Var.getPaddingRight();
                    rect.bottom = (fz9Var.getHeight() + iArr[1]) - fz9Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (lz9Var = this.f) != null) {
                    lz9Var.run();
                }
                b(false, new nz9(this, num, b2), new nz9(this, num, b), !z);
                a(false);
            }
        }
        z = false;
        this.y = z;
        int[] iArr2 = this.H;
        if (z) {
        }
        if (num != null) {
            lz9Var.run();
        }
        b(false, new nz9(this, num, b2), new nz9(this, num, b), !z);
        a(false);
    }

    public final void d(Integer num) {
        lz9 lz9Var;
        ly9 ly9Var = (ly9) this;
        if (num != null && (lz9Var = ly9Var.T.e.V1) != null) {
            lz9Var.run();
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
        canvas.drawColor(cmb.w0(null, cmb.c6, false));
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
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / nm7.J2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        nm7.e().k(nm7.j1, 4);
        b(true, null, null, true);
        a(true);
    }
}
