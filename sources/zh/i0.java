package zh;

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
import bi.h7;
import fi.o6;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i0 extends org.telegram.ui.ActionBar.k3 {
    public final int E;
    public int F;
    public boolean G;
    public final h0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public bi.m4 K;
    public boolean L;
    public final z4 b;
    public final jh.m c;
    public final hh.e d;
    public final ch.b e;
    public final jh.f f;
    public final rh.i h;
    public final f0 n;
    public final FrameLayout r;
    public final aq s;
    public final TextView v;
    public final s6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, u6 u6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (u6) null, true, true);
        wn wnVar;
        final int i10 = 1;
        this.c = new jh.m();
        rh.i iVar = new rh.i(new bi.a4(this, i10));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        hh.e eVar = new hh.e();
        this.d = eVar;
        ch.b bVar = new ch.b(eVar);
        this.e = bVar;
        e0 e0Var = new e0(this, context);
        this.containerView = e0Var;
        int i11 = this.backgroundPaddingLeft;
        final int i12 = 0;
        e0Var.setPadding(i11, 0, i11, 0);
        jh.k kVar = new jh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f = kVar;
        bVar.g = viewGroup;
        rh.e eVar2 = new rh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e = o6.e(null, this.currentAccount, j10, y6.I.q());
        this.y = e;
        e0Var.U(e);
        z4 z4Var = new z4(context, this.currentAccount, u6Var);
        this.b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new l6(z4Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        e0Var.addView(z4Var, kb1.i(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, gh.c.b(u6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, gh.c.b(u6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f0 f0Var = new f0(this, AndroidUtilities.getActivity(), e0Var);
        this.n = f0Var;
        f0Var.setInAppInsetsController(iVar);
        f0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        f0Var.y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        f0Var.x4 = false;
        f0Var.i2 = !AndroidUtilities.isInMultiwindow && ((wnVar = f0Var.P2) == null || !wnVar.isInBubbleMode());
        f0Var.R0(false, false, false);
        f0Var.c1(true, false);
        f0Var.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        f0Var.getSendButton().setAlpha(0.0f);
        f0Var.getEditField().setMaxLines(3);
        f0Var.setCustomWindowView(this.container);
        f0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f0Var, kb1.h(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), kb1.g(-1.0f, -1));
        this.containerView.addView(fVar, kb1.g(-1.0f, -1));
        f0Var.setDelegate(new g0(this, tL_starGiftUnique));
        pf pfVar = f0Var.E0;
        vd vdVar = new vd();
        InputFilter[] filters = pfVar.getFilters();
        if (filters == null) {
            pfVar.setFilters(new InputFilter[]{vdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = vdVar;
            pfVar.setFilters(inputFilterArr);
        }
        s6 s6Var = new s6(context, false, false, false);
        this.w = s6Var;
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        s6Var.setVisibility(8);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        f7.Z(s6Var, y6.y6, u6Var);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(17);
        this.containerView.addView(s6Var, kb1.h(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        h0 h0Var = new h0(R.drawable.send_plane_24, context, u6Var, false);
        this.H = h0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        h0Var.I = dp;
        h0Var.J = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        h0Var.M = dp3;
        h0Var.N = dp4;
        h0Var.h0 = true;
        this.containerView.addView(h0Var, kb1.i(110, 50, 85));
        h0Var.setScrimViewBackgroundColor(getThemedColor(y6.d6));
        h0Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i0 i0Var = this.b;
                        if (i0Var.E - i0Var.F >= 0) {
                            bi.m4 m4Var = i0Var.K;
                            if (m4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i0Var.n.getTextWithEntities();
                                boolean z10 = i0Var.G;
                                h7 h7Var = (h7) m4Var.c;
                                i0 i0Var2 = (i0) m4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) m4Var.e;
                                long j11 = m4Var.b;
                                bg.b bVar2 = (bg.b) m4Var.f;
                                if (!i0Var2.L) {
                                    h7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, i0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(i0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        i0 i0Var3 = this.b;
                        boolean z11 = i0Var3.G;
                        i0Var3.G = !z11;
                        i0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = y6.ic;
        org.telegram.messenger.t.r(textView, i13, u6Var, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new l6(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, kb1.i(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        f7.V(textView2, i13, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, kb1.h(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        aq aqVar = new aq(context, 18, u6Var);
        this.s = aqVar;
        aqVar.getCheckBoxBase().j(true);
        aqVar.getCheckBoxBase().e = 0.9f;
        aqVar.b(i13, i13, y6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(!this.G, false);
        z4Var.getLayout().V = new bi.a4(this, i14);
        z4Var.getLayout().U = new bi.a4(this, 3);
        aqVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(aqVar, kb1.h(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new l6(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i0 i0Var = this.b;
                        if (i0Var.E - i0Var.F >= 0) {
                            bi.m4 m4Var = i0Var.K;
                            if (m4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i0Var.n.getTextWithEntities();
                                boolean z10 = i0Var.G;
                                h7 h7Var = (h7) m4Var.c;
                                i0 i0Var2 = (i0) m4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) m4Var.e;
                                long j11 = m4Var.b;
                                bg.b bVar2 = (bg.b) m4Var.f;
                                if (!i0Var2.L) {
                                    h7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, i0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(i0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        i0 i0Var3 = this.b;
                        boolean z11 = i0Var3.G;
                        i0Var3.G = !z11;
                        i0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, kb1.i(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        l6 l6Var = new l6(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = ih.d.a;
        imageView.setBackground(new ih.c(dp5, dp6, l6Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        i0 i0Var = this.b;
                        if (i0Var.E - i0Var.F >= 0) {
                            bi.m4 m4Var = i0Var.K;
                            if (m4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i0Var.n.getTextWithEntities();
                                boolean z10 = i0Var.G;
                                h7 h7Var = (h7) m4Var.c;
                                i0 i0Var2 = (i0) m4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) m4Var.e;
                                long j11 = m4Var.b;
                                bg.b bVar2 = (bg.b) m4Var.f;
                                if (!i0Var2.L) {
                                    h7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, i0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(i0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        i0 i0Var3 = this.b;
                        boolean z11 = i0Var3.G;
                        i0Var3.G = !z11;
                        i0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, kb1.i(56, 56, 53));
        kb1.c(frameLayout, 0.05f, 1.2f);
        kb1.b(imageView);
        ViewGroup viewGroup3 = this.containerView;
        x2.e eVar3 = new x2.e(this, 6);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, eVar3);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        this.n.y0();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        f0 f0Var = this.n;
        if (f0Var == null || !f0Var.p0()) {
            super.onBackPressed();
        } else {
            f0Var.i0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new bh.c0(this, 12));
        u40 u40Var = u40.s;
        if (u40Var.c()) {
            u40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new wc(this.container, this.resourcesProvider).W(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.t.i(r3.num, ',', sb2))), null).k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.setScrimViewBackgroundColor(getThemedColor(y6.d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q() {
        rh.i iVar = this.h;
        int i10 = iVar.f(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
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

    public final Paint r(String str) {
        u6 u6Var = this.resourcesProvider;
        Paint d = u6Var != null ? u6Var.d("paintChatActionBackground") : null;
        return d != null ? d : y6.U0("paintChatActionBackground");
    }
}
