package zh;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.g9;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends Dialog {
    public final i E;
    public final /* synthetic */ k F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final vf0 h;
    public final h n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public k9 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Activity activity, tj0 tj0Var, e6 e6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.F = kVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        i iVar = new i(this, getContext());
        this.E = iVar;
        final int i3 = 1;
        setCancelable(true);
        iVar.setVisibility(4);
        int i10 = k6.G8;
        d2 d2Var = kVar.g;
        k6.w0(i10, d2Var.getResourceProvider());
        r6.y(iVar, mutate, i10, d2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(iVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, e6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        r6.i(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, d2Var.getResourceProvider());
        iVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        h hVar = new h(getContext());
        this.n = hVar;
        vf0 vf0Var = new vf0(activity, d2Var.getActionBar(), tj0Var, hVar);
        this.h = vf0Var;
        vf0Var.setCreateThumbFromParent(true);
        iVar.addView(vf0Var);
        hVar.setProfileGalleryView(vf0Var);
        iVar.addView(hVar);
        textView.setMaxLines(1);
        r6.V(textView, k6.G6, d2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        iVar.addView(textView);
        r6.V(textView2, k6.y6, d2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        iVar.addView(textView2);
        y0 y0Var = new y0(0, activity, e6Var, true, false);
        int i11 = k6.E8;
        int i12 = k6.F8;
        y0Var.c(i11, i12);
        int i13 = k6.I5;
        y0Var.h(1.0f, i13);
        y0Var.j(bd.M0(z10 ? 2131754378 : 2131754373, null), R.drawable.msg_requests, null);
        final int i14 = 0;
        y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        j jVar = this.b;
                        k kVar2 = jVar.F;
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
                        k kVar3 = jVar2.F;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        y0 y0Var2 = new y0(0, activity, e6Var, false, false);
        y0Var2.c(i11, i12);
        y0Var2.h(1.0f, i13);
        y0Var2.j(bd.M0(2131745611, null), R.drawable.msg_msgbubble3, null);
        y0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: zh.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        j jVar = this.b;
                        k kVar2 = jVar.F;
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
                        k kVar3 = jVar2.F;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
        y0 y0Var3 = new y0(0, activity, e6Var, false, true);
        y0Var3.c(k6.q7, k6.p7);
        y0Var3.h(1.0f, i13);
        y0Var3.j(bd.M0(2131751369, null), R.drawable.msg_remove, null);
        final int i15 = 2;
        y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: zh.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        j jVar = this.b;
                        k kVar2 = jVar.F;
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
                        k kVar3 = jVar2.F;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
    }

    public static /* synthetic */ void a(j jVar) {
        k kVar = jVar.F;
        if (jVar.r != null) {
            kVar.b = true;
            d2 d2Var = kVar.g;
            super.dismiss();
            d2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", jVar.r.user_id);
            d2Var.presentFragment(new wm(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
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
        this.w.getLocationOnScreen(iArr);
        vf0 vf0Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / vf0Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        float f10 = 1.0f - width;
        float left = iArr[0] - (vf0Var.getLeft() + ((int) ((vf0Var.getMeasuredWidth() * f10) / 2.0f)));
        int i3 = 1;
        float top = iArr[1] - (vf0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        int i10 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new g9(this, width, left, top, width2, i10, 1));
        this.s.addListener(new sk0(this, z10, width, i3));
        this.s.setDuration(220L);
        this.s.setInterpolator(xq.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : hs.e4;
        Resources resources = getContext().getResources();
        i iVar = this.E;
        int measuredWidth = (int) (iVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (iVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        d2 d2Var = this.F.g;
        ((LaunchActivity) d2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = d2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / hs.K2));
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
        int i3 = attributes.flags & (-3);
        attributes.flags = i3;
        attributes.gravity = 51;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i3 | (-2147417856);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        g0.i3(new xf.c(this, 9), 80L);
    }
}
