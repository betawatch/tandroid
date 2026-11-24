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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wy6 extends Dialog {
    public final vy6 E;
    public final /* synthetic */ xy6 F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final sp8 h;
    public final ty6 n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public be0 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy6(xy6 xy6Var, Activity activity, o39 o39Var, wjb wjbVar, boolean z) {
        super(activity, R.style.TransparentDialog2);
        this.F = xy6Var;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        vy6 vy6Var = new vy6(this, getContext());
        this.E = vy6Var;
        final byte b = 1;
        setCancelable(true);
        vy6Var.setVisibility(4);
        int i = bkb.F8;
        d dVar = xy6Var.g;
        bkb.v0(i, dVar.getResourceProvider());
        zkb.x(vy6Var, mutate, i, dVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(vy6Var);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, wjbVar);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        zkb.h(i, dVar.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        vy6Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ty6 ty6Var = new ty6(getContext());
        this.n = ty6Var;
        sp8 sp8Var = new sp8(activity, dVar.getActionBar(), o39Var, ty6Var);
        this.h = sp8Var;
        sp8Var.setCreateThumbFromParent(true);
        vy6Var.addView(sp8Var);
        ty6Var.setProfileGalleryView(sp8Var);
        vy6Var.addView(ty6Var);
        textView.setMaxLines(1);
        zkb.X(textView, bkb.F6, dVar.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(gl.o());
        vy6Var.addView(textView);
        zkb.X(textView2, bkb.x6, dVar.getResourceProvider());
        textView2.setTextSize(14.0f);
        vy6Var.addView(textView2);
        a8 a8Var = new a8(0, wjbVar, activity, true, false);
        int i2 = bkb.D8;
        int i3 = bkb.E8;
        a8Var.c(i2, i3);
        int i4 = bkb.H5;
        a8Var.h(1.0f, i4);
        a8Var.j(k96.M0(z ? 2131754375 : 2131754370, null), R.drawable.msg_requests, null);
        final byte b2 = 0;
        a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: sy6
            public final /* synthetic */ wy6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                wy6 wy6Var = this.b;
                switch (b3) {
                    case 0:
                        xy6 xy6Var2 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wy6Var.r;
                        if (tL_chatInviteImporter != null) {
                            xy6Var2.d(tL_chatInviteImporter, true);
                        }
                        xy6Var2.s.e(false);
                        xy6Var2.r = null;
                        break;
                    case 1:
                        wy6Var.d();
                        break;
                    default:
                        xy6 xy6Var3 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wy6Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            xy6Var3.d(tL_chatInviteImporter2, false);
                        }
                        xy6Var3.s.e(false);
                        xy6Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
        a8 a8Var2 = new a8(0, wjbVar, activity, false, false);
        a8Var2.c(i2, i3);
        a8Var2.h(1.0f, i4);
        a8Var2.j(k96.M0(2131745409, null), R.drawable.msg_msgbubble3, null);
        a8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: sy6
            public final /* synthetic */ wy6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wy6 wy6Var = this.b;
                switch (b3) {
                    case 0:
                        xy6 xy6Var2 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wy6Var.r;
                        if (tL_chatInviteImporter != null) {
                            xy6Var2.d(tL_chatInviteImporter, true);
                        }
                        xy6Var2.s.e(false);
                        xy6Var2.r = null;
                        break;
                    case 1:
                        wy6Var.d();
                        break;
                    default:
                        xy6 xy6Var3 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wy6Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            xy6Var3.d(tL_chatInviteImporter2, false);
                        }
                        xy6Var3.s.e(false);
                        xy6Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
        a8 a8Var3 = new a8(0, wjbVar, activity, false, true);
        a8Var3.c(bkb.p7, bkb.o7);
        a8Var3.h(1.0f, i4);
        a8Var3.j(k96.M0(2131751356, null), R.drawable.msg_remove, null);
        final byte b3 = 2;
        a8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: sy6
            public final /* synthetic */ wy6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                wy6 wy6Var = this.b;
                switch (b32) {
                    case 0:
                        xy6 xy6Var2 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wy6Var.r;
                        if (tL_chatInviteImporter != null) {
                            xy6Var2.d(tL_chatInviteImporter, true);
                        }
                        xy6Var2.s.e(false);
                        xy6Var2.r = null;
                        break;
                    case 1:
                        wy6Var.d();
                        break;
                    default:
                        xy6 xy6Var3 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wy6Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            xy6Var3.d(tL_chatInviteImporter2, false);
                        }
                        xy6Var3.s.e(false);
                        xy6Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
    }

    public final int c() {
        int measuredHeight = this.d.getMeasuredHeight() + gl.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + gl.L(4.0f);
        }
        return this.f.getMeasuredHeight() + gl.L(12.0f) + measuredHeight;
    }

    public final /* synthetic */ void d() {
        xy6 xy6Var = this.F;
        d dVar = xy6Var.g;
        if (this.r != null) {
            xy6Var.b = true;
            super.dismiss();
            dVar.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.r.user_id);
            dVar.presentFragment(new mu1(bundle));
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
        sp8 sp8Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / sp8Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        byte b = 0;
        float f2 = 1.0f - width;
        float left = iArr[0] - (sp8Var.getLeft() + ((int) ((sp8Var.getMeasuredWidth() * f2) / 2.0f)));
        float top = iArr[1] - (sp8Var.getTop() + ((int) ((c() * f2) / 2.0f)));
        int i = (-this.f.getTop()) / 2;
        float f3 = 0.0f;
        if (!z) {
            f3 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ry6(this, width, left, top, width2, i, (byte) 0));
        this.s.addListener(new uy6(this, z, width, b));
        this.s.setDuration(220L);
        this.s.setInterpolator(s33.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : kk7.d4;
        Resources resources = getContext().getResources();
        vy6 vy6Var = this.E;
        int measuredWidth = (int) (vy6Var.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (vy6Var.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        d dVar = this.F.g;
        ((LaunchActivity) dVar.getParentActivity()).N().getView().draw(canvas);
        canvas.drawColor(bm2.o(-16777216, 76));
        Dialog visibleDialog = dVar.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / kk7.J2));
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
        gl.d3(new vl6(this, (byte) 8), 80L);
    }
}
