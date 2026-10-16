package yh;

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
import di.a7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.zc;
import org.telegram.ui.df;
import org.telegram.ui.fo;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k0 extends org.telegram.ui.ActionBar.e3 {
    public final int E;
    public int F;
    public boolean G;
    public final j0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public df K;
    public boolean L;
    public final y4 b;
    public final ih.k c;
    public final gh.e d;
    public final bh.b e;
    public final ih.f f;
    public final qh.i h;
    public final h0 n;
    public final FrameLayout r;
    public final aq s;
    public final TextView v;
    public final s6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (c6) null, true, true);
        fo foVar;
        final int i10 = 1;
        this.c = new ih.k();
        final int i11 = 0;
        qh.i iVar = new qh.i(new e0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        gh.e eVar = new gh.e();
        this.d = eVar;
        bh.b bVar = new bh.b(eVar);
        this.e = bVar;
        g0 g0Var = new g0(this, context);
        this.containerView = g0Var;
        int i12 = this.backgroundPaddingLeft;
        g0Var.setPadding(i12, 0, i12, 0);
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f = jVar;
        bVar.g = viewGroup;
        qh.e eVar2 = new qh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e = a7.e(null, this.currentAccount, j10, g6.I.q());
        this.y = e;
        g0Var.V(e);
        y4 y4Var = new y4(context, this.currentAccount, c6Var);
        this.b = y4Var;
        y4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        y4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        y4Var.setLayoutBackground(new t5(y4Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        g0Var.addView(y4Var, z5.e(-2, -2, 48));
        ih.f fVar = new ih.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, fh.b.b(c6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, fh.b.b(c6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        h0 h0Var = new h0(this, AndroidUtilities.getActivity(), g0Var);
        this.n = h0Var;
        h0Var.setInAppInsetsController(iVar);
        h0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        h0Var.y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        h0Var.x4 = false;
        h0Var.i2 = !AndroidUtilities.isInMultiwindow && ((foVar = h0Var.P2) == null || !foVar.isInBubbleMode());
        h0Var.S0(false, false, false);
        h0Var.d1(true, false);
        h0Var.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        h0Var.getSendButton().setAlpha(0.0f);
        h0Var.getEditField().setMaxLines(3);
        h0Var.setCustomWindowView(this.container);
        h0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(h0Var, z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), z5.d(-1.0f, -1));
        this.containerView.addView(fVar, z5.d(-1.0f, -1));
        h0Var.setDelegate(new i0(this, tL_starGiftUnique));
        rf rfVar = h0Var.E0;
        wd wdVar = new wd();
        InputFilter[] filters = rfVar.getFilters();
        if (filters == null) {
            rfVar.setFilters(new InputFilter[]{wdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = wdVar;
            rfVar.setFilters(inputFilterArr);
        }
        s6 s6Var = new s6(context, false, false, false);
        this.w = s6Var;
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        s6Var.setVisibility(8);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(getThemedColor(g6.y6));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(17);
        this.containerView.addView(s6Var, z5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        j0 j0Var = new j0(R.drawable.send_plane_24, context, c6Var, false);
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
        this.containerView.addView(j0Var, z5.e(110, 50, 85));
        j0Var.setScrimViewBackgroundColor(getThemedColor(g6.d6));
        j0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh.f0
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
                            df dfVar = k0Var.K;
                            if (dfVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.n.getTextWithEntities();
                                boolean z10 = k0Var.G;
                                zh.r3 r3Var = (zh.r3) dfVar.c;
                                k0 k0Var2 = (k0) dfVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) dfVar.e;
                                long j11 = dfVar.b;
                                ag.b bVar2 = (ag.b) dfVar.f;
                                if (!k0Var2.L) {
                                    r3Var.d2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, k0Var2);
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
        int i13 = g6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new t5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, z5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        aq aqVar = new aq(context, 18, c6Var);
        this.s = aqVar;
        aqVar.getCheckBoxBase().j(true);
        aqVar.getCheckBoxBase().e = 0.9f;
        aqVar.b(i13, i13, g6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(!this.G, false);
        y4Var.getLayout().R = new e0(this, i10);
        aqVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(aqVar, z5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new t5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: yh.f0
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
                            df dfVar = k0Var.K;
                            if (dfVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.n.getTextWithEntities();
                                boolean z10 = k0Var.G;
                                zh.r3 r3Var = (zh.r3) dfVar.c;
                                k0 k0Var2 = (k0) dfVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) dfVar.e;
                                long j11 = dfVar.b;
                                ag.b bVar2 = (ag.b) dfVar.f;
                                if (!k0Var2.L) {
                                    r3Var.d2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, k0Var2);
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
        this.containerView.addView(frameLayout, z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        t5 t5Var = new t5(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = hh.d.a;
        imageView.setBackground(new hh.c(dp5, dp6, t5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yh.f0
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
                            df dfVar = k0Var.K;
                            if (dfVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.n.getTextWithEntities();
                                boolean z10 = k0Var.G;
                                zh.r3 r3Var = (zh.r3) dfVar.c;
                                k0 k0Var2 = (k0) dfVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) dfVar.e;
                                long j11 = dfVar.b;
                                ag.b bVar2 = (ag.b) dfVar.f;
                                if (!k0Var2.L) {
                                    r3Var.d2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, k0Var2);
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
        this.containerView.addView(imageView, z5.e(56, 56, 53));
        b6.b(frameLayout, 0.05f, 1.2f);
        b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        rg.b0 b0Var = new rg.b0(this, 20);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, b0Var);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        h0 h0Var = this.n;
        if (h0Var == null || !h0Var.r0()) {
            super.onBackPressed();
        } else {
            h0Var.k0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        sc.a(this.container, new ah.m0(this, 11));
        w40 w40Var = w40.s;
        if (w40Var.c()) {
            w40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new zc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.g0.h(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final void q() {
        qh.i iVar = this.h;
        int i10 = iVar.f(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        y4 y4Var = this.b;
        FrameLayout frameLayout = this.r;
        y4Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - y4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - y4Var.getHeight()));
        y4Var.invalidate();
        float y3 = y4Var.getY() - AndroidUtilities.dp(33.0f);
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

    public final Paint r(String str) {
        c6 c6Var = this.resourcesProvider;
        Paint F = c6Var != null ? c6Var.F("paintChatActionBackground") : null;
        return F != null ? F : g6.T0("paintChatActionBackground");
    }
}
