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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.h9;
import org.telegram.ui.an;
import wg.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l extends Dialog {
    public final k D;
    public final /* synthetic */ m E;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final sf0 h;
    public final j n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public l9 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Activity activity, pj0 pj0Var, f6 f6Var, boolean z9) {
        super(activity, R.style.TransparentDialog2);
        this.E = mVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        k kVar = new k(this, getContext());
        this.D = kVar;
        final int i7 = 1;
        setCancelable(true);
        kVar.setVisibility(4);
        int i10 = k6.G8;
        f2 f2Var = mVar.g;
        k6.w0(i10, f2Var.getResourceProvider());
        r6.y(kVar, mutate, i10, f2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(kVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        r6.i(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, f2Var.getResourceProvider());
        kVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        j jVar = new j(getContext());
        this.n = jVar;
        sf0 sf0Var = new sf0(activity, f2Var.getActionBar(), pj0Var, jVar);
        this.h = sf0Var;
        sf0Var.setCreateThumbFromParent(true);
        kVar.addView(sf0Var);
        jVar.setProfileGalleryView(sf0Var);
        kVar.addView(jVar);
        textView.setMaxLines(1);
        r6.V(textView, k6.G6, f2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        kVar.addView(textView);
        r6.V(textView2, k6.y6, f2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        kVar.addView(textView2);
        z0 z0Var = new z0(0, activity, f6Var, true, false);
        int i11 = k6.E8;
        int i12 = k6.F8;
        z0Var.c(i11, i12);
        int i13 = k6.I5;
        z0Var.h(1.0f, i13);
        z0Var.j(hd.M0(z9 ? 2131754378 : 2131754373, null), R.drawable.msg_requests, null);
        final int i14 = 0;
        z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        l lVar = this.b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.s.e(false);
                        mVar2.r = null;
                        break;
                    case 1:
                        l.a(this.b);
                        break;
                    default:
                        l lVar2 = this.b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.s.e(false);
                        mVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        z0 z0Var2 = new z0(0, activity, f6Var, false, false);
        z0Var2.c(i11, i12);
        z0Var2.h(1.0f, i13);
        z0Var2.j(hd.M0(2131745602, null), R.drawable.msg_msgbubble3, null);
        z0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: yh.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        l lVar = this.b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.s.e(false);
                        mVar2.r = null;
                        break;
                    case 1:
                        l.a(this.b);
                        break;
                    default:
                        l lVar2 = this.b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.s.e(false);
                        mVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        z0 z0Var3 = new z0(0, activity, f6Var, false, true);
        z0Var3.c(k6.q7, k6.p7);
        z0Var3.h(1.0f, i13);
        z0Var3.j(hd.M0(2131751369, null), R.drawable.msg_remove, null);
        final int i15 = 2;
        z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: yh.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        l lVar = this.b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.s.e(false);
                        mVar2.r = null;
                        break;
                    case 1:
                        l.a(this.b);
                        break;
                    default:
                        l lVar2 = this.b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.s.e(false);
                        mVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
    }

    public static /* synthetic */ void a(l lVar) {
        m mVar = lVar.E;
        if (lVar.r != null) {
            mVar.b = true;
            f2 f2Var = mVar.g;
            super.dismiss();
            f2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", lVar.r.user_id);
            f2Var.presentFragment(new an(bundle));
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

    public final void e(boolean z9) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.w.getLocationOnScreen(iArr);
        sf0 sf0Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / sf0Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        float f10 = 1.0f - width;
        float left = iArr[0] - (sf0Var.getLeft() + ((int) ((sf0Var.getMeasuredWidth() * f10) / 2.0f)));
        int i7 = 1;
        float top = iArr[1] - (sf0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        int i10 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new h9(this, width, left, top, width2, i10, 1));
        this.s.addListener(new ok0(this, z9, width, i7));
        this.s.setDuration(220L);
        this.s.setInterpolator(xq.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : qs.e4;
        Resources resources = getContext().getResources();
        k kVar = this.D;
        int measuredWidth = (int) (kVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (kVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        f2 f2Var = this.E.g;
        ((LaunchActivity) f2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = f2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / qs.K2));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.D, new ViewGroup.LayoutParams(-1, -1));
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
        g0.i3(new p(this, 4), 80L);
    }
}
