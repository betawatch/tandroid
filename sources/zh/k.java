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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.x9;
import org.telegram.ui.bn;
import v4.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
    public final fg0 h;
    public final i n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public q9 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Activity activity, ck0 ck0Var, i6 i6Var, boolean z10) {
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
        int i10 = n6.G8;
        h2 h2Var = lVar.g;
        n6.w0(i10, h2Var.getResourceProvider());
        u6.x(jVar, mutate, i10, h2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, i6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        u6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, h2Var.getResourceProvider());
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        i iVar = new i(getContext());
        this.n = iVar;
        fg0 fg0Var = new fg0(activity, h2Var.getActionBar(), ck0Var, iVar);
        this.h = fg0Var;
        fg0Var.setCreateThumbFromParent(true);
        jVar.addView(fg0Var);
        iVar.setProfileGalleryView(fg0Var);
        jVar.addView(iVar);
        textView.setMaxLines(1);
        u6.U(textView, n6.G6, h2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        jVar.addView(textView);
        u6.U(textView2, n6.y6, h2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        z0 z0Var = new z0(0, activity, i6Var, true, false);
        int i11 = n6.E8;
        int i12 = n6.F8;
        z0Var.c(i11, i12);
        int i13 = n6.I5;
        z0Var.h(1.0f, i13);
        z0Var.j(gd.M0(z10 ? 2131754376 : 2131754371, null), R.drawable.msg_requests, null);
        final int i14 = 0;
        z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        z0 z0Var2 = new z0(0, activity, i6Var, false, false);
        z0Var2.c(i11, i12);
        z0Var2.h(1.0f, i13);
        z0Var2.j(gd.M0(2131745406, null), R.drawable.msg_msgbubble3, null);
        z0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        z0 z0Var3 = new z0(0, activity, i6Var, false, true);
        z0Var3.c(n6.q7, n6.p7);
        z0Var3.h(1.0f, i13);
        z0Var3.j(gd.M0(2131751357, null), R.drawable.msg_remove, null);
        final int i15 = 2;
        z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
    }

    public static /* synthetic */ void a(k kVar) {
        l lVar = kVar.F;
        if (kVar.r != null) {
            lVar.b = true;
            h2 h2Var = lVar.g;
            super.dismiss();
            h2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.r.user_id);
            h2Var.presentFragment(new bn(bundle));
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
        fg0 fg0Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / fg0Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        float f10 = 1.0f - width;
        float left = iArr[0] - (fg0Var.getLeft() + ((int) ((fg0Var.getMeasuredWidth() * f10) / 2.0f)));
        int i7 = 1;
        float top = iArr[1] - (fg0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        int i10 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new x9(this, width, left, top, width2, i10, 1));
        this.s.addListener(new bl0(this, z10, width, i7));
        this.s.setDuration(220L);
        this.s.setInterpolator(lr.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : ks.e4;
        Resources resources = getContext().getResources();
        j jVar = this.E;
        int measuredWidth = (int) (jVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (jVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        h2 h2Var = this.F.g;
        ((LaunchActivity) h2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = h2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / ks.K2));
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
