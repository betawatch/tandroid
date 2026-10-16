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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.d8;
import org.telegram.ui.fo;
import ri.h0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k extends Dialog {
    public final /* synthetic */ l E;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final pi0 h;
    public final i n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public z9 v;
    public BitmapDrawable w;
    public float x;
    public final j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Activity activity, mm0 mm0Var, c6 c6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.E = lVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        j jVar = new j(this, getContext());
        this.y = jVar;
        setCancelable(true);
        jVar.setVisibility(4);
        int i10 = g6.G8;
        m2 m2Var = lVar.g;
        int w02 = g6.w0(i10, m2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, c6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(w02);
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        i iVar = new i(getContext());
        this.n = iVar;
        pi0 pi0Var = new pi0(activity, m2Var.getActionBar(), mm0Var, iVar);
        this.h = pi0Var;
        pi0Var.setCreateThumbFromParent(true);
        jVar.addView(pi0Var);
        iVar.setProfileGalleryView(pi0Var);
        jVar.addView(iVar);
        textView.setMaxLines(1);
        textView.setTextColor(g6.w0(g6.G6, m2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        jVar.addView(textView);
        textView2.setTextColor(g6.w0(g6.y6, m2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        e1 e1Var = new e1(activity, true, false);
        int i11 = g6.E8;
        int w03 = g6.w0(i11, c6Var);
        int i12 = g6.F8;
        e1Var.c(w03, g6.w0(i12, c6Var));
        int i13 = g6.I5;
        e1Var.setSelectorColor(g6.w0(i13, c6Var));
        e1Var.g(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        e1Var.setOnClickListener(new View.OnClickListener(this) { // from class: xh.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        k kVar = this.b;
                        l lVar2 = kVar.E;
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
                        l lVar3 = kVar2.E;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        e1 e1Var2 = new e1(activity, false, false);
        e1Var2.c(g6.w0(i11, c6Var), g6.w0(i12, c6Var));
        e1Var2.setSelectorColor(g6.w0(i13, c6Var));
        e1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        e1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: xh.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        k kVar = this.b;
                        l lVar2 = kVar.E;
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
                        l lVar3 = kVar2.E;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        e1 e1Var3 = new e1(activity, false, true);
        e1Var3.c(g6.w0(g6.q7, c6Var), g6.w0(g6.p7, c6Var));
        e1Var3.setSelectorColor(g6.w0(i13, c6Var));
        e1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: xh.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        k kVar = this.b;
                        l lVar2 = kVar.E;
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
                        l lVar3 = kVar2.E;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
    }

    public static /* synthetic */ void a(k kVar) {
        l lVar = kVar.E;
        if (kVar.r != null) {
            lVar.b = true;
            m2 m2Var = lVar.g;
            super.dismiss();
            m2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.r.user_id);
            m2Var.presentFragment(new fo(bundle));
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
        pi0 pi0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / pi0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f7 = 1.0f - width;
        float left = iArr[0] - (pi0Var.getLeft() + ((int) ((pi0Var.getMeasuredWidth() * f7) / 2.0f)));
        int i10 = 1;
        float top = iArr[1] - (pi0Var.getTop() + ((int) ((d() * f7) / 2.0f)));
        int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new d8(this, width, left, top, width2, i11, 1));
        this.s.addListener(new hn0(this, z10, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(es.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        j jVar = this.y;
        int measuredWidth = (int) (jVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (jVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        m2 m2Var = this.E.g;
        ((LaunchActivity) m2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = m2Var.getVisibleDialog();
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
        AndroidUtilities.runOnUIThread(new h0(this, 21), 80L);
    }
}
