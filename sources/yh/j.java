package yh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c9;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j extends Dialog {
    public final /* synthetic */ k E;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final oi0 h;
    public final h n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public y9 v;
    public BitmapDrawable w;
    public float x;
    public final i y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Activity activity, nm0 nm0Var, u6 u6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.E = kVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        i iVar = new i(this, getContext());
        this.y = iVar;
        setCancelable(true);
        iVar.setVisibility(4);
        int i10 = y6.G8;
        r2 r2Var = kVar.g;
        y6.w0(i10, r2Var.getResourceProvider());
        f7.y(iVar, mutate, i10, r2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(iVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, u6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        f7.i(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, r2Var.getResourceProvider());
        iVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        h hVar = new h(getContext());
        this.n = hVar;
        oi0 oi0Var = new oi0(activity, r2Var.getActionBar(), nm0Var, hVar);
        this.h = oi0Var;
        oi0Var.setCreateThumbFromParent(true);
        iVar.addView(oi0Var);
        hVar.setProfileGalleryView(oi0Var);
        iVar.addView(hVar);
        textView.setMaxLines(1);
        f7.V(textView, y6.G6, r2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        iVar.addView(textView);
        f7.V(textView2, y6.y6, r2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        iVar.addView(textView2);
        g1 g1Var = new g1(0, activity, u6Var, true, false);
        int i11 = y6.E8;
        int i12 = y6.F8;
        g1Var.c(i11, i12);
        int i13 = y6.I5;
        g1Var.h(1.0f, i13);
        g1Var.j(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        j jVar = this.b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.s.e(false);
                        kVar2.r = null;
                        break;
                    case 1:
                        j.a(this.b);
                        break;
                    default:
                        j jVar2 = this.b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.s.e(false);
                        kVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(0, activity, u6Var, false, false);
        g1Var2.c(i11, i12);
        g1Var2.h(1.0f, i13);
        g1Var2.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        j jVar = this.b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.s.e(false);
                        kVar2.r = null;
                        break;
                    case 1:
                        j.a(this.b);
                        break;
                    default:
                        j jVar2 = this.b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.s.e(false);
                        kVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(0, activity, u6Var, false, true);
        g1Var3.c(y6.q7, y6.p7);
        g1Var3.h(1.0f, i13);
        g1Var3.j(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        j jVar = this.b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.s.e(false);
                        kVar2.r = null;
                        break;
                    case 1:
                        j.a(this.b);
                        break;
                    default:
                        j jVar2 = this.b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.s.e(false);
                        kVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static /* synthetic */ void a(j jVar) {
        k kVar = jVar.E;
        if (jVar.r != null) {
            kVar.b = true;
            r2 r2Var = kVar.g;
            super.dismiss();
            r2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", jVar.r.user_id);
            r2Var.presentFragment(new wn(bundle));
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
        oi0 oi0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / oi0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f7 = 1.0f - width;
        float left = iArr[0] - (oi0Var.getLeft() + ((int) ((oi0Var.getMeasuredWidth() * f7) / 2.0f)));
        int i10 = 1;
        float top = iArr[1] - (oi0Var.getTop() + ((int) ((d() * f7) / 2.0f)));
        int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new c9(this, width, left, top, width2, i11, 1));
        this.s.addListener(new nn0(this, z10, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(ds.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        i iVar = this.y;
        int measuredWidth = (int) (iVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (iVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        r2 r2Var = this.E.g;
        ((LaunchActivity) r2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = r2Var.getVisibleDialog();
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
        AndroidUtilities.runOnUIThread(new ti.g(this, 15), 80L);
    }
}
