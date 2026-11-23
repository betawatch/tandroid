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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.x9;
import org.telegram.ui.bn;
import v4.p;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k extends Dialog {
    public final j E;
    public final /* synthetic */ l F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final hg0 h;
    public final i n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public q9 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Activity activity, ek0 ek0Var, h6 h6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.F = lVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        j jVar = new j(this, getContext());
        this.E = jVar;
        final int i7 = 1;
        setCancelable(true);
        jVar.setVisibility(4);
        int i10 = m6.G8;
        g2 g2Var = lVar.g;
        m6.w0(i10, g2Var.getResourceProvider());
        t6.x(jVar, mutate, i10, g2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, h6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        t6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, g2Var.getResourceProvider());
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        i iVar = new i(getContext());
        this.n = iVar;
        hg0 hg0Var = new hg0(activity, g2Var.getActionBar(), ek0Var, iVar);
        this.h = hg0Var;
        hg0Var.setCreateThumbFromParent(true);
        jVar.addView(hg0Var);
        iVar.setProfileGalleryView(hg0Var);
        jVar.addView(iVar);
        textView.setMaxLines(1);
        t6.U(textView, m6.G6, g2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        jVar.addView(textView);
        t6.U(textView2, m6.y6, g2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        y0 y0Var = new y0(0, activity, h6Var, true, false);
        int i11 = m6.E8;
        int i12 = m6.F8;
        y0Var.c(i11, i12);
        int i13 = m6.I5;
        y0Var.h(1.0f, i13);
        y0Var.j(hd.N0(z10 ? 2131754375 : 2131754370, null), R.drawable.msg_requests, null);
        final int i14 = 0;
        y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        k kVar = this.b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.s.e(false);
                        lVar2.r = null;
                        break;
                    case 1:
                        k.a(this.b);
                        break;
                    default:
                        k kVar2 = this.b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.s.e(false);
                        lVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        y0 y0Var2 = new y0(0, activity, h6Var, false, false);
        y0Var2.c(i11, i12);
        y0Var2.h(1.0f, i13);
        y0Var2.j(hd.N0(2131745405, null), R.drawable.msg_msgbubble3, null);
        y0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        k kVar = this.b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.s.e(false);
                        lVar2.r = null;
                        break;
                    case 1:
                        k.a(this.b);
                        break;
                    default:
                        k kVar2 = this.b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.s.e(false);
                        lVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
        y0 y0Var3 = new y0(0, activity, h6Var, false, true);
        y0Var3.c(m6.q7, m6.p7);
        y0Var3.h(1.0f, i13);
        y0Var3.j(hd.N0(2131751356, null), R.drawable.msg_remove, null);
        final int i15 = 2;
        y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        k kVar = this.b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.s.e(false);
                        lVar2.r = null;
                        break;
                    case 1:
                        k.a(this.b);
                        break;
                    default:
                        k kVar2 = this.b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.s.e(false);
                        lVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
    }

    public static /* synthetic */ void a(k kVar) {
        l lVar = kVar.F;
        if (kVar.r != null) {
            lVar.b = true;
            g2 g2Var = lVar.g;
            super.dismiss();
            g2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.r.user_id);
            g2Var.presentFragment(new bn(bundle));
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
        hg0 hg0Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / hg0Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        float f10 = 1.0f - width;
        float left = iArr[0] - (hg0Var.getLeft() + ((int) ((hg0Var.getMeasuredWidth() * f10) / 2.0f)));
        int i7 = 1;
        float top = iArr[1] - (hg0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        int i10 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new x9(this, width, left, top, width2, i10, 1));
        this.s.addListener(new dl0(this, z10, width, i7));
        this.s.setDuration(220L);
        this.s.setInterpolator(nr.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : ls.e4;
        Resources resources = getContext().getResources();
        j jVar = this.E;
        int measuredWidth = (int) (jVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (jVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        g2 g2Var = this.F.g;
        ((LaunchActivity) g2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = g2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / ls.K2));
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
        int i7 = attributes.flags & (-3);
        attributes.flags = i7;
        attributes.gravity = 51;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i7 | (-2147417856);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        g0.h3(new p(this, 15), 80L);
    }
}
