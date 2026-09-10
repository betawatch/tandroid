package vh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import qg.q0;
import w7.q;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o extends Dialog {
    public final /* synthetic */ p E;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final yh0 h;
    public final l n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public w9 v;
    public BitmapDrawable w;
    public float x;
    public final n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Activity activity, vl0 vl0Var, f6 f6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.E = pVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        n nVar = new n(this, getContext());
        this.y = nVar;
        setCancelable(true);
        nVar.setVisibility(4);
        int i10 = j6.G8;
        p2 p2Var = pVar.g;
        int v02 = j6.v0(i10, p2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(nVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        nVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        l lVar = new l(getContext());
        this.n = lVar;
        yh0 yh0Var = new yh0(activity, p2Var.getActionBar(), vl0Var, lVar);
        this.h = yh0Var;
        yh0Var.setCreateThumbFromParent(true);
        nVar.addView(yh0Var);
        lVar.setProfileGalleryView(yh0Var);
        nVar.addView(lVar);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, p2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        nVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.y6, p2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        nVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i11 = j6.E8;
        int v03 = j6.v0(i11, f6Var);
        int i12 = j6.F8;
        g1Var.c(v03, j6.v0(i12, f6Var));
        int i13 = j6.I5;
        g1Var.setSelectorColor(j6.v0(i13, f6Var));
        g1Var.g(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: vh.k
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        o oVar = this.b;
                        p pVar2 = oVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = oVar.r;
                        if (tL_chatInviteImporter != null) {
                            pVar2.d(tL_chatInviteImporter, true);
                        }
                        pVar2.s.e(false);
                        pVar2.r = null;
                        break;
                    case 1:
                        o.a(this.b);
                        break;
                    default:
                        o oVar2 = this.b;
                        p pVar3 = oVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = oVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            pVar3.d(tL_chatInviteImporter2, false);
                        }
                        pVar3.s.e(false);
                        pVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(j6.v0(i11, f6Var), j6.v0(i12, f6Var));
        g1Var2.setSelectorColor(j6.v0(i13, f6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: vh.k
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        o oVar = this.b;
                        p pVar2 = oVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = oVar.r;
                        if (tL_chatInviteImporter != null) {
                            pVar2.d(tL_chatInviteImporter, true);
                        }
                        pVar2.s.e(false);
                        pVar2.r = null;
                        break;
                    case 1:
                        o.a(this.b);
                        break;
                    default:
                        o oVar2 = this.b;
                        p pVar3 = oVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = oVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            pVar3.d(tL_chatInviteImporter2, false);
                        }
                        pVar3.s.e(false);
                        pVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(j6.v0(j6.q7, f6Var), j6.v0(j6.p7, f6Var));
        g1Var3.setSelectorColor(j6.v0(i13, f6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: vh.k
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        o oVar = this.b;
                        p pVar2 = oVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = oVar.r;
                        if (tL_chatInviteImporter != null) {
                            pVar2.d(tL_chatInviteImporter, true);
                        }
                        pVar2.s.e(false);
                        pVar2.r = null;
                        break;
                    case 1:
                        o.a(this.b);
                        break;
                    default:
                        o oVar2 = this.b;
                        p pVar3 = oVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = oVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            pVar3.d(tL_chatInviteImporter2, false);
                        }
                        pVar3.s.e(false);
                        pVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static /* synthetic */ void a(o oVar) {
        p pVar = oVar.E;
        if (oVar.r != null) {
            pVar.b = true;
            p2 p2Var = pVar.g;
            super.dismiss();
            p2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", oVar.r.user_id);
            p2Var.presentFragment(new eo(bundle));
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
        yh0 yh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / yh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f7 = 1.0f - width;
        final float left = iArr[0] - (yh0Var.getLeft() + ((int) ((yh0Var.getMeasuredWidth() * f7) / 2.0f)));
        int i10 = 1;
        final float top = iArr[1] - (yh0Var.getTop() + ((int) ((d() * f7) / 2.0f)));
        final int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vh.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                o oVar = o.this;
                oVar.x = floatValue;
                float f10 = width;
                float z11 = e2.z(1.0f, f10, floatValue, f10);
                n nVar = oVar.y;
                nVar.setScaleX(z11);
                nVar.setScaleY(z11);
                nVar.setTranslationX((1.0f - oVar.x) * left);
                nVar.setTranslationY((1.0f - oVar.x) * top);
                int i12 = (int) ((1.0f - oVar.x) * width2);
                oVar.h.N(i12, i12);
                float a2 = q.a((oVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
                oVar.c.setAlpha((int) (a2 * 255.0f));
                oVar.d.setAlpha(a2);
                oVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - oVar.x) * i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = oVar.w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (oVar.x * 255.0f));
                }
                oVar.n.setAlpha(a2);
            }
        });
        this.s.addListener(new pm0(this, z10, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(wr.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        n nVar = this.y;
        int measuredWidth = (int) (nVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (nVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        p2 p2Var = this.E.g;
        ((LaunchActivity) p2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = p2Var.getVisibleDialog();
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
        AndroidUtilities.runOnUIThread(new q0(this, 17), 80L);
    }
}
