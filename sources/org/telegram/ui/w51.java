package org.telegram.ui;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class w51 extends Dialog {
    public final int A;
    public final int B;
    public final int[] C;
    public boolean D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public boolean K;
    public final /* synthetic */ a61 L;
    public final j51 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Runnable f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final n0 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout v;
    public org.telegram.ui.ActionBar.e3 w;
    public boolean x;
    public final int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w51(a61 a61Var, Context context, Runnable runnable, View view, j51 j51Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        boolean z10;
        ImageLocation forDocument;
        String str;
        ColorFilter colorFilter;
        this.L = a61Var;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.C = iArr;
        final int i10 = 0;
        this.D = false;
        this.K = false;
        this.a = j51Var;
        this.f = runnable;
        this.h = view;
        final p41 p41Var = (p41) this;
        n0 n0Var = new n0(p41Var, context, 23);
        this.s = n0Var;
        setContentView(n0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new aj0(p41Var, context, 8), h7.z5.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, c6Var);
        this.v = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.v0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, c6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 1;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, c6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 2;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, c6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i13 = 3;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, c6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        p41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, c6Var).setOnClickListener(new u70(20, p41Var, context));
        n0Var.addView(linearLayout, h7.z5.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z10 = true;
            n0Var.setOnApplyWindowInsetsListener(new p31(p41Var, 1 == true ? 1 : 0));
            attributes.flags |= 1024;
            n0Var.setFitsSystemWindows(true);
            n0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (j51Var != null) {
            j51Var.b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        imageReceiver.setParentView(n0Var);
        imageReceiver.setLayerNum(7);
        TLRPC.Document document = j51Var.d;
        if (document == null) {
            Drawable drawable = j51Var.A;
            if (drawable instanceof org.telegram.ui.Components.k5) {
                document = ((org.telegram.ui.Components.k5) drawable).e;
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "160_160_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", null, null, svgThumb, document.size, null, document2, 1);
            if ((j51Var.A instanceof org.telegram.ui.Components.k5) && (MessageObject.isTextColorEmoji(document2) || ((org.telegram.ui.Components.k5) j51Var.A).c())) {
                if (!MessageObject.isTextColorEmoji(document2)) {
                    org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) j51Var.A;
                    SparseArray sparseArray = org.telegram.ui.Components.k5.q;
                    if (k5Var == null || !k5Var.l()) {
                        colorFilter = org.telegram.ui.ActionBar.g6.n0(c6Var);
                        imageReceiver.setColorFilter(colorFilter);
                    }
                }
                colorFilter = a61Var.g1;
                imageReceiver.setColorFilter(colorFilter);
            }
        }
        j51Var.getLocationOnScreen(iArr);
        rect.left = j51Var.getPaddingLeft() + iArr[0];
        rect.top = j51Var.getPaddingTop() + iArr[1];
        rect.right = (j51Var.getWidth() + iArr[0]) - j51Var.getPaddingRight();
        rect.bottom = (j51Var.getHeight() + iArr[1]) - j51Var.getPaddingBottom();
        AndroidUtilities.lerp(rect, rect2, this.E, rect3);
        view.getLocationOnScreen(iArr);
        this.y = iArr[0];
        int i14 = iArr[1];
        this.A = i14;
        this.B = view.getHeight() + i14;
    }

    public static void a(w51 w51Var, Integer num) {
        Runnable runnable;
        p41 p41Var = (p41) w51Var;
        if (num != null && (runnable = p41Var.O.e.P1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(p41 p41Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            if (this.I == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.I = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z10 ? 1.0f : 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new w01(this, 10));
        this.J.addListener(new n40(9, this, z10));
        if (z10) {
            this.J.setDuration(360L);
            this.J.setInterpolator(org.telegram.ui.Components.er.h);
        } else {
            this.J.setDuration(240L);
            this.J.setInterpolator(org.telegram.ui.Components.er.g);
        }
        this.J.start();
    }

    public final void d(final boolean z10, s51 s51Var, final s51 s51Var2, final boolean z11) {
        j51 j51Var = this.a;
        if (j51Var == null) {
            if (s51Var != null) {
                s51Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            if (this.F == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.F = z10;
        if (z10) {
            j51Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.u51
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                w51 w51Var = w51.this;
                w51Var.E = floatValue;
                AndroidUtilities.lerp(w51Var.c, w51Var.d, floatValue, w51Var.e);
                w51Var.s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    w51Var.v.setAlpha(w51Var.E);
                }
                if (w51Var.E < 0.025f && !z12) {
                    if (z11) {
                        w51Var.a.b = false;
                        w51Var.L.d0.invalidate();
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                }
                if (w51Var.E >= 0.5f || z12 || (runnable = s51Var2) == null) {
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                runnable.run();
            }
        });
        this.G.addListener(new v51(this, z10, s51Var2, zArr, z11, s51Var));
        this.G.setDuration(420L);
        this.G.setInterpolator(org.telegram.ui.Components.er.h);
        this.G.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.K) {
            return;
        }
        e(null);
        this.K = true;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Integer num) {
        boolean z10;
        Runnable runnable;
        if (this.D) {
            return;
        }
        this.D = true;
        Rect rect = this.c;
        if (num != null) {
            q41 q41Var = ((p41) this).O;
            a61 a61Var = q41Var.e;
            if (a61Var.j1 != null && q41Var.d != null) {
                rect.set(a61Var.k1);
                z10 = true;
                this.x = z10;
                int[] iArr = this.C;
                if (z10) {
                    j51 j51Var = this.a;
                    j51Var.getLocationOnScreen(iArr);
                    rect.left = j51Var.getPaddingLeft() + iArr[0];
                    rect.top = j51Var.getPaddingTop() + iArr[1];
                    rect.right = (j51Var.getWidth() + iArr[0]) - j51Var.getPaddingRight();
                    rect.bottom = (j51Var.getHeight() + iArr[1]) - j51Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new s51(this, num, 0), new s51(this, num, 1), !z10);
                c(false);
            }
        }
        z10 = false;
        this.x = z10;
        int[] iArr2 = this.C;
        if (z10) {
        }
        if (num != null) {
            runnable.run();
        }
        d(false, new s51(this, num, 0), new s51(this, num, 1), !z10);
        c(false);
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
        canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.O().getLastFragment().getVisibleDialog() != null) {
                launchActivity.O().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.C);
            canvas.save();
            canvas.translate(r2[0], r2[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        d(true, null, null, true);
        c(true);
    }
}
