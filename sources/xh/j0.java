package xh;

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
import ci.d7;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xe;
import org.telegram.ui.zn;
import w7.a6;
import w7.y5;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public xe K;
    public boolean L;
    public final a5 b;
    public final hh.l c;
    public final fh.e d;
    public final ah.c e;
    public final hh.g f;
    public final ph.i h;
    public final g0 n;
    public final FrameLayout r;
    public final np s;
    public final TextView v;
    public final p6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (e6) null, true, true);
        zn znVar;
        final int i10 = 1;
        this.c = new hh.l();
        final int i11 = 0;
        ph.i iVar = new ph.i(new d0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        fh.e eVar = new fh.e();
        this.d = eVar;
        ah.c cVar = new ah.c(eVar);
        this.e = cVar;
        f0 f0Var = new f0(this, context);
        this.containerView = f0Var;
        int i12 = this.backgroundPaddingLeft;
        f0Var.setPadding(i12, 0, i12, 0);
        hh.k kVar = new hh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar.f = kVar;
        cVar.g = viewGroup;
        ph.e eVar2 = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e = d7.e(null, this.currentAccount, j3, j6.I.q());
        this.y = e;
        f0Var.V(e);
        a5 a5Var = new a5(context, this.currentAccount, e6Var);
        this.b = a5Var;
        a5Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        a5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        a5Var.setLayoutBackground(new v5(a5Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        f0Var.addView(a5Var, y5.e(-2, -2, 48));
        hh.g gVar = new hh.g(context);
        this.f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(cVar.c(gVar, eh.b.b(e6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(cVar.c(gVar, eh.b.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.x4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.w4 = false;
        g0Var.h2 = !AndroidUtilities.isInMultiwindow && ((znVar = g0Var.O2) == null || !znVar.isInBubbleMode());
        g0Var.U0(false, false, false);
        g0Var.f1(true, false);
        g0Var.y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, y5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), y5.c(-1.0f, -1));
        this.containerView.addView(gVar, y5.c(-1.0f, -1));
        g0Var.setDelegate(new h0(this, tL_starGiftUnique));
        pf pfVar = g0Var.E0;
        ud udVar = new ud();
        InputFilter[] filters = pfVar.getFilters();
        if (filters == null) {
            pfVar.setFilters(new InputFilter[]{udVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = udVar;
            pfVar.setFilters(inputFilterArr);
        }
        p6 p6Var = new p6(context, false, false, false);
        this.w = p6Var;
        p6Var.setAllowCancel(true);
        p6Var.setScaleProperty(0.6f);
        p6Var.setVisibility(8);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTextColor(getThemedColor(j6.y6));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setGravity(17);
        this.containerView.addView(p6Var, y5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        i0 i0Var = new i0(R.drawable.send_plane_24, context, e6Var, false);
        this.H = i0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        i0Var.I = dp;
        i0Var.J = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        i0Var.M = dp3;
        i0Var.N = dp4;
        i0Var.h0 = true;
        this.containerView.addView(i0Var, y5.e(110, 50, 85));
        i0Var.setScrimViewBackgroundColor(getThemedColor(j6.d6));
        i0Var.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            xe xeVar = j0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                yh.y3 y3Var = (yh.y3) xeVar.c;
                                j0 j0Var2 = (j0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar = (zf.b) xeVar.f;
                                if (!j0Var2.L) {
                                    y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, j0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(j0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        j0 j0Var3 = this.b;
                        boolean z11 = j0Var3.G;
                        j0Var3.G = !z11;
                        j0Var3.s.a(z11, true);
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
        textView.setBackground(new v5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, y5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, y5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        np npVar = new np(context, 18, e6Var);
        this.s = npVar;
        npVar.getCheckBoxBase().j(true);
        npVar.getCheckBoxBase().e = 0.9f;
        npVar.b(i13, i13, j6.k7);
        npVar.setDrawUnchecked(true);
        npVar.a(!this.G, false);
        a5Var.getLayout().R = new d0(this, i10);
        npVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(npVar, y5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new v5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            xe xeVar = j0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                yh.y3 y3Var = (yh.y3) xeVar.c;
                                j0 j0Var2 = (j0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar = (zf.b) xeVar.f;
                                if (!j0Var2.L) {
                                    y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, j0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(j0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        j0 j0Var3 = this.b;
                        boolean z11 = j0Var3.G;
                        j0Var3.G = !z11;
                        j0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, y5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        v5 v5Var = new v5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.a;
        imageView.setBackground(new gh.c(dp5, dp6, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            xe xeVar = j0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                yh.y3 y3Var = (yh.y3) xeVar.c;
                                j0 j0Var2 = (j0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar = (zf.b) xeVar.f;
                                if (!j0Var2.L) {
                                    y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, j0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(j0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        j0 j0Var3 = this.b;
                        boolean z11 = j0Var3.G;
                        j0Var3.G = !z11;
                        j0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, y5.e(56, 56, 53));
        a6.b(frameLayout, 0.05f, 1.2f);
        a6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r5.d dVar = new r5.d(this, 16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(viewGroup3, dVar);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ph.i iVar = this.h;
        int i10 = iVar.e(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        a5 a5Var = this.b;
        FrameLayout frameLayout = this.r;
        a5Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a5Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - a5Var.getHeight()));
        a5Var.invalidate();
        float y3 = a5Var.getY() - AndroidUtilities.dp(33.0f);
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        g0 g0Var = this.n;
        if (g0Var == null || !g0Var.t0()) {
            super.onBackPressed();
        } else {
            g0Var.m0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new ai.w4(this, 10));
        j40 j40Var = j40.s;
        if (j40Var.c()) {
            j40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.q.i(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        e6 e6Var = this.resourcesProvider;
        Paint G = e6Var != null ? e6Var.G("paintChatActionBackground") : null;
        return G != null ? G : j6.S0("paintChatActionBackground");
    }
}
