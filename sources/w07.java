// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w07 extends Dialog {
    public final v07 E;
    public final /* synthetic */ x07 F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final tr8 h;
    public final t07 n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public bf0 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w07(x07 x07Var, Activity activity, r59 r59Var, ylb ylbVar, boolean z) {
        super(activity, R.style.TransparentDialog2);
        this.F = x07Var;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        v07 v07Var = new v07(this, getContext());
        this.E = v07Var;
        final byte b = 1;
        setCancelable(true);
        v07Var.setVisibility(4);
        int i = cmb.F8;
        d dVar = x07Var.g;
        cmb.v0(i, dVar.getResourceProvider());
        anb.x(v07Var, mutate, i, dVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(v07Var);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ylbVar);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        anb.h(i, dVar.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        v07Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        t07 t07Var = new t07(getContext());
        this.n = t07Var;
        tr8 tr8Var = new tr8(activity, dVar.getActionBar(), r59Var, t07Var);
        this.h = tr8Var;
        tr8Var.setCreateThumbFromParent(true);
        v07Var.addView(tr8Var);
        t07Var.setProfileGalleryView(tr8Var);
        v07Var.addView(t07Var);
        textView.setMaxLines(1);
        anb.X(textView, cmb.F6, dVar.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(gm.o());
        v07Var.addView(textView);
        anb.X(textView2, cmb.x6, dVar.getResourceProvider());
        textView2.setTextSize(14.0f);
        v07Var.addView(textView2);
        a8 a8Var = new a8(0, ylbVar, activity, true, false);
        int i2 = cmb.D8;
        int i3 = cmb.E8;
        a8Var.c(i2, i3);
        int i4 = cmb.H5;
        a8Var.h(1.0f, i4);
        a8Var.j(jb6.M0(z ? 2131754375 : 2131754370, null), R.drawable.msg_requests, null);
        final byte b2 = 0;
        a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: s07
            public final /* synthetic */ w07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                w07 w07Var = this.b;
                switch (b3) {
                    case 0:
                        x07 x07Var2 = w07Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = w07Var.r;
                        if (tL_chatInviteImporter != null) {
                            x07Var2.d(tL_chatInviteImporter, true);
                        }
                        x07Var2.s.e(false);
                        x07Var2.r = null;
                        break;
                    case 1:
                        w07Var.d();
                        break;
                    default:
                        x07 x07Var3 = w07Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = w07Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            x07Var3.d(tL_chatInviteImporter2, false);
                        }
                        x07Var3.s.e(false);
                        x07Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
        a8 a8Var2 = new a8(0, ylbVar, activity, false, false);
        a8Var2.c(i2, i3);
        a8Var2.h(1.0f, i4);
        a8Var2.j(jb6.M0(2131745335, null), R.drawable.msg_msgbubble3, null);
        a8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: s07
            public final /* synthetic */ w07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                w07 w07Var = this.b;
                switch (b3) {
                    case 0:
                        x07 x07Var2 = w07Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = w07Var.r;
                        if (tL_chatInviteImporter != null) {
                            x07Var2.d(tL_chatInviteImporter, true);
                        }
                        x07Var2.s.e(false);
                        x07Var2.r = null;
                        break;
                    case 1:
                        w07Var.d();
                        break;
                    default:
                        x07 x07Var3 = w07Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = w07Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            x07Var3.d(tL_chatInviteImporter2, false);
                        }
                        x07Var3.s.e(false);
                        x07Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
        a8 a8Var3 = new a8(0, ylbVar, activity, false, true);
        a8Var3.c(cmb.p7, cmb.o7);
        a8Var3.h(1.0f, i4);
        a8Var3.j(jb6.M0(2131751305, null), R.drawable.msg_remove, null);
        final byte b3 = 2;
        a8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: s07
            public final /* synthetic */ w07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                w07 w07Var = this.b;
                switch (b32) {
                    case 0:
                        x07 x07Var2 = w07Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = w07Var.r;
                        if (tL_chatInviteImporter != null) {
                            x07Var2.d(tL_chatInviteImporter, true);
                        }
                        x07Var2.s.e(false);
                        x07Var2.r = null;
                        break;
                    case 1:
                        w07Var.d();
                        break;
                    default:
                        x07 x07Var3 = w07Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = w07Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            x07Var3.d(tL_chatInviteImporter2, false);
                        }
                        x07Var3.s.e(false);
                        x07Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
    }

    public final int c() {
        int measuredHeight = this.d.getMeasuredHeight() + gm.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + gm.L(4.0f);
        }
        return this.f.getMeasuredHeight() + gm.L(12.0f) + measuredHeight;
    }

    public final /* synthetic */ void d() {
        x07 x07Var = this.F;
        d dVar = x07Var.g;
        if (this.r != null) {
            x07Var.b = true;
            super.dismiss();
            dVar.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.r.user_id);
            dVar.presentFragment(new yv1(bundle));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.w.getLocationOnScreen(iArr);
        float f = 1.0f;
        tr8 tr8Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / tr8Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        byte b = 0;
        float f2 = 1.0f - width;
        float left = iArr[0] - (tr8Var.getLeft() + ((int) ((tr8Var.getMeasuredWidth() * f2) / 2.0f)));
        float top = iArr[1] - (tr8Var.getTop() + ((int) ((c() * f2) / 2.0f)));
        int i = (-this.f.getTop()) / 2;
        float f3 = 0.0f;
        if (!z) {
            f3 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new r07(this, width, left, top, width2, i, (byte) 0));
        this.s.addListener(new u07(this, z, width, b));
        this.s.setDuration(220L);
        this.s.setInterpolator(d53.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : nm7.d4;
        Resources resources = getContext().getResources();
        v07 v07Var = this.E;
        int measuredWidth = (int) (v07Var.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (v07Var.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        d dVar = this.F.g;
        ((LaunchActivity) dVar.getParentActivity()).N().getView().draw(canvas);
        canvas.drawColor(on2.p(-16777216, 76));
        Dialog visibleDialog = dVar.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / nm7.J2));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.E, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.gravity = 51;
        attributes.flags = i | (-2147417856);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        gm.d3(new pg6(this, (byte) 15), 80L);
    }
}
