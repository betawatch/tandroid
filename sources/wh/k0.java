package wh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.e8;
import bi.rd;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
import org.telegram.ui.ze;
import w7.a6;
import w7.c6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k0 extends org.telegram.ui.ActionBar.h3 {
    public final int E;
    public int F;
    public boolean G;
    public final j0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ze K;
    public boolean L;
    public final z4 b;
    public final gh.l c;
    public final eh.e d;
    public final zg.a e;
    public final gh.g f;
    public final oh.i h;
    public final h0 n;
    public final FrameLayout r;
    public final tp s;
    public final TextView v;
    public final o6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (f6) null, true, true);
        eo eoVar;
        final int i10 = 1;
        this.c = new gh.l();
        final int i11 = 0;
        oh.i iVar = new oh.i(new e0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        eh.e eVar = new eh.e();
        this.d = eVar;
        zg.a aVar = new zg.a(eVar);
        this.e = aVar;
        g0 g0Var = new g0(this, context);
        this.containerView = g0Var;
        int i12 = this.backgroundPaddingLeft;
        g0Var.setPadding(i12, 0, i12, 0);
        gh.k kVar = new gh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = kVar;
        aVar.e = viewGroup;
        oh.e eVar2 = new oh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e = e8.e(null, this.currentAccount, j3, j6.I.q());
        this.y = e;
        g0Var.V(e);
        z4 z4Var = new z4(context, this.currentAccount, f6Var);
        this.b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new w5(z4Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        g0Var.addView(z4Var, a6.e(-2, -2, 48));
        gh.g gVar = new gh.g(context);
        this.f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(aVar.c(gVar, dh.c.b(f6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(aVar.c(gVar, dh.c.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        h0 h0Var = new h0(this, AndroidUtilities.getActivity(), g0Var);
        this.n = h0Var;
        h0Var.setInAppInsetsController(iVar);
        h0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        h0Var.x4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        h0Var.w4 = false;
        h0Var.h2 = !AndroidUtilities.isInMultiwindow && ((eoVar = h0Var.O2) == null || !eoVar.isInBubbleMode());
        h0Var.V0(false, false, false);
        h0Var.g1(true, false);
        h0Var.y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        h0Var.getSendButton().setAlpha(0.0f);
        h0Var.getEditField().setMaxLines(3);
        h0Var.setCustomWindowView(this.container);
        h0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(h0Var, a6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), a6.c(-1.0f, -1));
        this.containerView.addView(gVar, a6.c(-1.0f, -1));
        h0Var.setDelegate(new i0(this, tL_starGiftUnique));
        rf rfVar = h0Var.E0;
        td tdVar = new td();
        InputFilter[] filters = rfVar.getFilters();
        if (filters == null) {
            rfVar.setFilters(new InputFilter[]{tdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = tdVar;
            rfVar.setFilters(inputFilterArr);
        }
        o6 o6Var = new o6(context, false, false, false);
        this.w = o6Var;
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        o6Var.setVisibility(8);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(getThemedColor(j6.y6));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        this.containerView.addView(o6Var, a6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        j0 j0Var = new j0(R.drawable.send_plane_24, context, f6Var, false);
        this.H = j0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        j0Var.I = dp;
        j0Var.J = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        j0Var.M = dp3;
        j0Var.N = dp4;
        j0Var.h0 = true;
        this.containerView.addView(j0Var, a6.e(110, 50, 85));
        j0Var.setScrimViewBackgroundColor(getThemedColor(j6.d6));
        j0Var.setOnClickListener(new View.OnClickListener(this) { // from class: wh.f0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k0 k0Var = this.b;
                        if (k0Var.E - k0Var.F >= 0) {
                            ze zeVar = k0Var.K;
                            if (zeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.n.getTextWithEntities();
                                boolean z10 = k0Var.G;
                                xh.x3 x3Var = (xh.x3) zeVar.c;
                                k0 k0Var2 = (k0) zeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.e;
                                long j10 = zeVar.b;
                                yf.b bVar = (yf.b) zeVar.f;
                                if (!k0Var2.L) {
                                    x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, k0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(k0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var3 = this.b;
                        boolean z11 = k0Var3.G;
                        k0Var3.G = !z11;
                        k0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = j6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new w5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, a6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, a6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        tp tpVar = new tp(context, 18, f6Var);
        this.s = tpVar;
        tpVar.getCheckBoxBase().j(true);
        tpVar.getCheckBoxBase().e = 0.9f;
        tpVar.b(i13, i13, j6.k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(!this.G, false);
        z4Var.getLayout().R = new e0(this, i10);
        tpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(tpVar, a6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new w5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: wh.f0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k0 k0Var = this.b;
                        if (k0Var.E - k0Var.F >= 0) {
                            ze zeVar = k0Var.K;
                            if (zeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.n.getTextWithEntities();
                                boolean z10 = k0Var.G;
                                xh.x3 x3Var = (xh.x3) zeVar.c;
                                k0 k0Var2 = (k0) zeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.e;
                                long j10 = zeVar.b;
                                yf.b bVar = (yf.b) zeVar.f;
                                if (!k0Var2.L) {
                                    x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, k0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(k0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var3 = this.b;
                        boolean z11 = k0Var3.G;
                        k0Var3.G = !z11;
                        k0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, a6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        w5 w5Var = new w5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = fh.d.a;
        imageView.setBackground(new fh.c(dp5, dp6, w5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: wh.f0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        k0 k0Var = this.b;
                        if (k0Var.E - k0Var.F >= 0) {
                            ze zeVar = k0Var.K;
                            if (zeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.n.getTextWithEntities();
                                boolean z10 = k0Var.G;
                                xh.x3 x3Var = (xh.x3) zeVar.c;
                                k0 k0Var2 = (k0) zeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.e;
                                long j10 = zeVar.b;
                                yf.b bVar = (yf.b) zeVar.f;
                                if (!k0Var2.L) {
                                    x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, k0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(k0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var3 = this.b;
                        boolean z11 = k0Var3.G;
                        k0Var3.G = !z11;
                        k0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, a6.e(56, 56, 53));
        c6.b(frameLayout, 0.05f, 1.2f);
        c6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        th.e eVar3 = new th.e(this, 5);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(viewGroup3, eVar3);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        oh.i iVar = this.h;
        int i10 = iVar.e(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.b;
        FrameLayout frameLayout = this.r;
        z4Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        h0 h0Var = this.n;
        if (h0Var == null || !h0Var.t0()) {
            super.onBackPressed();
        } else {
            h0Var.m0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        pc.a(this.container, new rd(this, 7));
        t40 t40Var = t40.s;
        if (t40Var.c()) {
            t40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new wc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), hc.b.l(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        f6 f6Var = this.resourcesProvider;
        Paint F = f6Var != null ? f6Var.F("paintChatActionBackground") : null;
        return F != null ? F : j6.S0("paintChatActionBackground");
    }
}
