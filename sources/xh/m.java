package xh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import sg.p0;
import w7.p;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m extends Dialog {
    public final /* synthetic */ n E;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final oh0 h;
    public final j n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public x9 v;
    public BitmapDrawable w;
    public float x;
    public final l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Activity activity, ll0 ll0Var, f6 f6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.E = nVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        l lVar = new l(this, getContext());
        this.y = lVar;
        setCancelable(true);
        lVar.setVisibility(4);
        int i10 = j6.G8;
        n2 n2Var = nVar.g;
        int v02 = j6.v0(i10, n2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(lVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        lVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        j jVar = new j(getContext());
        this.n = jVar;
        oh0 oh0Var = new oh0(activity, n2Var.getActionBar(), ll0Var, jVar);
        this.h = oh0Var;
        oh0Var.setCreateThumbFromParent(true);
        lVar.addView(oh0Var);
        jVar.setProfileGalleryView(oh0Var);
        lVar.addView(jVar);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, n2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        lVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.y6, n2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        lVar.addView(textView2);
        f1 f1Var = new f1(activity, true, false);
        int i11 = j6.E8;
        int v03 = j6.v0(i11, f6Var);
        int i12 = j6.F8;
        f1Var.c(v03, j6.v0(i12, f6Var));
        int i13 = j6.I5;
        f1Var.setSelectorColor(j6.v0(i13, f6Var));
        f1Var.g(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) { // from class: xh.i
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        m mVar = this.b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.s.e(false);
                        nVar2.r = null;
                        break;
                    case 1:
                        m.a(this.b);
                        break;
                    default:
                        m mVar2 = this.b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.s.e(false);
                        nVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        f1 f1Var2 = new f1(activity, false, false);
        f1Var2.c(j6.v0(i11, f6Var), j6.v0(i12, f6Var));
        f1Var2.setSelectorColor(j6.v0(i13, f6Var));
        f1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        f1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: xh.i
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        m mVar = this.b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.s.e(false);
                        nVar2.r = null;
                        break;
                    case 1:
                        m.a(this.b);
                        break;
                    default:
                        m mVar2 = this.b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.s.e(false);
                        nVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        f1 f1Var3 = new f1(activity, false, true);
        f1Var3.c(j6.v0(j6.q7, f6Var), j6.v0(j6.p7, f6Var));
        f1Var3.setSelectorColor(j6.v0(i13, f6Var));
        f1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: xh.i
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        m mVar = this.b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.s.e(false);
                        nVar2.r = null;
                        break;
                    case 1:
                        m.a(this.b);
                        break;
                    default:
                        m mVar2 = this.b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.s.e(false);
                        nVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
    }

    public static /* synthetic */ void a(m mVar) {
        n nVar = mVar.E;
        if (mVar.r != null) {
            nVar.b = true;
            n2 n2Var = nVar.g;
            super.dismiss();
            n2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", mVar.r.user_id);
            n2Var.presentFragment(new co(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        oh0 oh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / oh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f7 = 1.0f - width;
        final float left = iArr[0] - (oh0Var.getLeft() + ((int) ((oh0Var.getMeasuredWidth() * f7) / 2.0f)));
        int i10 = 1;
        final float top = iArr[1] - (oh0Var.getTop() + ((int) ((d() * f7) / 2.0f)));
        final int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m mVar = m.this;
                mVar.x = floatValue;
                float f10 = width;
                float z11 = e2.z(1.0f, f10, floatValue, f10);
                l lVar = mVar.y;
                lVar.setScaleX(z11);
                lVar.setScaleY(z11);
                lVar.setTranslationX((1.0f - mVar.x) * left);
                lVar.setTranslationY((1.0f - mVar.x) * top);
                int i12 = (int) ((1.0f - mVar.x) * width2);
                mVar.h.N(i12, i12);
                float a2 = p.a((mVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
                mVar.c.setAlpha((int) (a2 * 255.0f));
                mVar.d.setAlpha(a2);
                mVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - mVar.x) * i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = mVar.w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (mVar.x * 255.0f));
                }
                mVar.n.setAlpha(a2);
            }
        });
        this.s.addListener(new fm0(this, z10, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(pr.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        l lVar = this.y;
        int measuredWidth = (int) (lVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (lVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        n2 n2Var = this.E.g;
        ((LaunchActivity) n2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = n2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.w);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.y, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.gravity = 51;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-2147417856);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new p0(this, 13), 80L);
    }
}
