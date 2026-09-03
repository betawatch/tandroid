package vh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.dy0;
import org.telegram.ui.lk;
import org.telegram.ui.ui0;
import org.telegram.ui.zn;
import ph.ga;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q extends di implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] N = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int B;
    public e1 C;
    public int D;
    public p70 E;
    public int F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public ui0 L;
    public final e M;
    public final int n;
    public final s3 r;
    public final w3 s;
    public m.s3 v;
    public kz w;
    public boolean x;
    public boolean y;

    public q(int i10, Context context, f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        l lVar = new l(this);
        this.G = true;
        this.M = new e(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        s3 s3Var = new s3(context, i10, f6Var, new q5.c0(this, f6Var, false, 13));
        this.r = s3Var;
        s3Var.setAdaptiveLinkDialogs(false);
        s3Var.setAllowTapAboveContent(false);
        addView(s3Var, b6.e(-1, -1, 119));
        addView(s3Var.getOverlayView(), b6.e(-1, -1, 119));
        s3Var.y4();
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        w3 w3Var = new w3(context, lVar);
        this.s = w3Var;
        w3Var.setBackVisible(false);
        w3Var.setTopGradientVisible(false);
        Y();
        addView(w3Var, b6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void J(q qVar) {
        int i10 = 0;
        if (!(qVar.r.j3() || qVar.x)) {
            li liVar = qVar.b;
            if (!liVar.O && liVar.P0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (qVar.H != i10) {
            qVar.H = i10;
            qVar.S();
        }
    }

    public static void K(q qVar) {
        s3 s3Var = qVar.r;
        if (qVar.x) {
            e1 O2 = s3Var.O2();
            if (O2 != null) {
                O2.r();
                AndroidUtilities.showKeyboard(O2);
            }
            qVar.R(true);
            return;
        }
        li liVar = qVar.b;
        if (qVar.w == null) {
            kz kzVar = new kz(liVar.c0, true, false, false, qVar.getContext(), true, null, liVar.o1, true, qVar.a, false, false);
            qVar.w = kzVar;
            kzVar.setVisibility(8);
            kz kzVar2 = qVar.w;
            kzVar2.u2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.w.setDelegate(new o(qVar));
            qVar.addView(qVar.w, b6.e(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.w.setLayoutParams(layoutParams);
        qVar.w.setTranslationY(0.0f);
        qVar.w.setVisibility(0);
        qVar.x = true;
        qVar.B = emojiPanelHeight;
        e1 O22 = s3Var.O2();
        if (O22 != null) {
            AndroidUtilities.hideKeyboard(O22);
        }
        w3 w3Var = qVar.s;
        if (w3Var != null) {
            w3Var.setEmojiOpened(true);
        }
        qVar.V(false);
        qVar.requestLayout();
    }

    public static e1 M(q qVar) {
        s3 s3Var = qVar.r;
        e1 focusedEditTextOrNull = s3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            e1 e1Var = qVar.C;
            return e1Var != null ? e1Var : s3Var.O2();
        }
        qVar.C = focusedEditTextOrNull;
        qVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int N(q qVar, e1 e1Var) {
        return (e1Var != qVar.C || qVar.r.getFocusedEditTextOrNull() == e1Var) ? Math.max(0, e1Var.getSelectionEnd()) : Math.min(qVar.D, e1Var.length());
    }

    public static void O(q qVar, int i10, int i11) {
        li liVar = qVar.b;
        if (liVar.c0 == null) {
            return;
        }
        li liVar2 = new li(qVar.getContext(), liVar.c0, false, false, true, qVar.a);
        liVar2.W1 = new m(qVar, liVar2);
        liVar2.g0.f0();
        liVar2.J1(1, true);
        liVar2.h1(i10);
        liVar2.q2 = new f(qVar, liVar2);
        liVar2.V = new f(qVar, liVar2);
        liVar2.U = new n(qVar, liVar2);
        liVar2.r1();
        if (i11 != 0) {
            liVar2.A1(i11);
        }
        liVar2.setFocusable(true);
        liVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, f6 f6Var) {
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, true, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(j6.b0(AndroidUtilities.dp(8.0f), j6.l1(0.05f, j6.v0(j6.G6, f6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, b6.t(-1, -2, 49, 12, 2, 12, 0));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        gg.k0 k0Var = new gg.k0(strArr, horizontalScrollView, p10, zArr2, new ph.d4(strArr, 27), imageView, f6Var, new int[]{6}, 6);
        final org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.f3 f3Var = h3Var.b;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        h3Var.setBackground(j6.b0(AndroidUtilities.dp(24.0f), j6.v0(j6.d6, f6Var)));
        h3Var.setText(strArr[0]);
        f3Var.addTextChangedListener(new p(strArr, k0Var));
        f10.addView(h3Var, b6.t(-1, -2, 55, 12, 8, 12, 0));
        p10.setText(LocaleController.getString(R.string.Done));
        f10.addView(p10, b6.t(-1, 48, 55, 12, 12, 12, 12));
        k0Var.run();
        o10.customView = f10;
        o10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: vh.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.f3 f3Var2 = org.telegram.ui.Cells.h3.this.b;
                f3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(f3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                callback.run(strArr2[0]);
            }
        });
        o10.show();
        int i10 = j6.a7;
        o10.setBackgroundColor(j6.v0(i10, f6Var));
        o10.fixNavigationBar(j6.v0(i10, f6Var));
        p10.setOnClickListener(new nh.c0(p10, zArr, callback, strArr, o10, 15));
        AndroidUtilities.runOnUIThread(new ga(h3Var, 25), 200L);
    }

    private int getEmojiPanelHeight() {
        int R = this.b.o1.R();
        if (R <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            R = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (R <= 0) {
            R = AndroidUtilities.dp(200.0f);
        }
        return R + AndroidUtilities.navigationBarHeight;
    }

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
        this.b.U0.setTitle("");
        this.r.V2.N(false);
        V(false);
        post(new e(this, 4));
    }

    @Override // org.telegram.ui.Components.di
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.di
    public final boolean H(int i10, boolean z4, int i11, boolean z10, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        lk lkVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        s3 s3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && x4.f(s3Var.i3, s3Var.j3)) {
            y1.p0(getContext(), new b(s3Var, 0), new e(this, 2), this.a);
            return false;
        }
        if (s3Var.j3() && !s3Var.l3()) {
            if (s3Var.L3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                li liVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList Y2 = s3Var.Y2();
                    if (!Y2.isEmpty()) {
                        ArrayList A2 = s3Var.A2();
                        ArrayList x22 = s3Var.x2();
                        ArrayList a2 = w4.a(i12, Y2);
                        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                        if (p2Var instanceof zn) {
                            zn znVar = (zn) p2Var;
                            MessageObject messageObject3 = znVar.k5;
                            MessageObject messageObject4 = znVar.U3;
                            j11 = znVar.N8();
                            sendMessageChatArguments = znVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(liVar.G1), Y2, A2, x22, a2, false, liVar.n1(), messageObject, messageObject2, z4, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        liVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var2 = liVar.c0;
                    if ((p2Var2 instanceof zn) && (lkVar = ((zn) p2Var2).V) != null) {
                        lkVar.R0(x4.k(s3Var.i3), z4, i10, i11);
                        liVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                w3 w3Var = this.s;
                if (w3Var != null) {
                    w3Var.setSendEnabled(s3Var.L3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean I() {
        return !this.r.j3();
    }

    public final void P(p70 p70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, p70 p70Var2) {
        p70Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new dy0(this, aVar, pageBlock, p70Var2, 27));
        p70Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        p70Var.y().a.setTextSize(1, i11);
    }

    public final boolean Q() {
        s3 s3Var = this.r;
        if (s3Var == null || !s3Var.j3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: vh.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.T();
                        qVar.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) { // from class: vh.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.T();
                        qVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void R(boolean z4) {
        if (this.y) {
            this.y = false;
            kz kzVar = this.w;
            if (kzVar != null) {
                kzVar.t(false);
                if (!z4) {
                    this.w.B();
                }
            }
        }
        this.C = null;
        kz kzVar2 = this.w;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.B = 0;
        w3 w3Var = this.s;
        if (w3Var != null) {
            w3Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        float f10;
        float f11;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.B;
        kz kzVar = this.w;
        li liVar = this.b;
        if (kzVar != null) {
            if (this.x) {
                f11 = (this.B - dp) + (this.y ? -liVar.i2 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            kzVar.setTranslationY(f11);
        }
        w3 w3Var = this.s;
        if (w3Var != null) {
            boolean z4 = this.x;
            if (z4) {
                f10 = dp;
            } else {
                f10 = (this.I || this.B > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z4 || this.y) {
                f10 += liVar.i2;
            }
            w3Var.getBottomContainer().animate().cancel();
            w3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.x;
            float f12 = z10 ? dp : 0.0f;
            if (!z10 || this.y) {
                f12 += liVar.i2;
            }
            w3Var.setBottomGradientTranslationY(-f12);
            if (this.J != this.H) {
                ViewPropertyAnimator animate = w3Var.getBottomInnerContainer().animate();
                this.J = this.H;
                animate.translationY(-r1).setDuration(320L).setInterpolator(mr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.c0;
        if (!(p2Var instanceof zn)) {
            return false;
        }
        zn znVar = (zn) p2Var;
        s3 s3Var = this.r;
        if (!s3Var.q2()) {
            return false;
        }
        TL_iv.RichMessage i22 = s3Var.i2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(znVar.a(), znVar.B7(znVar.k5), "", null, null, null, null, 0L, false, false, i22);
        lk lkVar = znVar.V;
        if (lkVar == null) {
            return true;
        }
        lkVar.setRichDraftPreview(i22);
        return true;
    }

    public final void V(boolean z4) {
        int i10 = 0;
        boolean z10 = this.r.j3() || this.x;
        li liVar = this.b;
        mh mhVar = liVar.u1;
        if (liVar.r2 != z10) {
            liVar.r2 = z10;
            if (liVar.P0) {
                mhVar.animate().cancel();
                if (!z10) {
                    mhVar.setVisibility(0);
                }
                if (z4) {
                    mhVar.animate().alpha(z10 ? 0.0f : 1.0f).translationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new fh(liVar, z10, 3)).start();
                } else {
                    mhVar.setAlpha(z10 ? 0.0f : 1.0f);
                    mhVar.setTranslationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    mhVar.setVisibility(z10 ? 4 : 0);
                }
            }
        }
        if (!z10 && !liVar.O && liVar.P0) {
            i10 = AndroidUtilities.dp(62.0f);
        }
        this.H = i10;
        S();
        if (this.G == z10) {
            this.G = !z10;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i10;
        boolean z4;
        boolean z10;
        int i11;
        s3 s3Var = this.r;
        l9 textSelectionHelper = s3Var.getTextSelectionHelper();
        w3 w3Var = this.s;
        if (w3Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] A4 = s3Var.A4();
        w3Var.setQuoteState(A4 != null && s3Var.G3(A4[0], A4[1]));
        boolean K3 = s3Var.K3();
        int[] iArr = N;
        if (K3) {
            l9 textSelectionHelper2 = s3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.u0;
            int i13 = textSelectionHelper2.v0;
            int i14 = textSelectionHelper2.y0;
            int i15 = textSelectionHelper2.w0;
            int i16 = textSelectionHelper2.z0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.J3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z11 = i13 == i14;
            e1 M4 = z11 ? s3Var.M4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = M4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), M4.length()));
            this.s.c(i17, M4 != null && max < max2 && y5.h(M4.getText(), max, max2), M4 != null && max < max2 && y5.g(M4.getText(), max, max2), z11, s3Var.k2(), true);
            return;
        }
        if (s3Var.v3()) {
            l9 textSelectionHelper3 = s3Var.getTextSelectionHelper();
            e1 r22 = s3Var.r2(textSelectionHelper3.u0);
            int i20 = textSelectionHelper3.w0;
            int i21 = textSelectionHelper3.z0;
            int max3 = r22 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), r22.length()));
            int max4 = r22 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), r22.length()));
            if (r22 == null || max3 >= max4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((r22.getCurrentStyle(max3, max4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.s.c(i11, r22 != null && max3 < max4 && y5.h(r22.getText(), max3, max4), r22 != null && max3 < max4 && y5.g(r22.getText(), max3, max4), true, s3Var.k2(), true);
            return;
        }
        int i25 = textSelectionHelper.u0;
        int i26 = textSelectionHelper.x0;
        int i27 = textSelectionHelper.w0;
        int i28 = textSelectionHelper.z0;
        boolean z12 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < s3Var.m4.size();
        if (z12) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.r.I3(i31, i25, i27, i26, i32)) {
                    i30 |= i31;
                }
                i29++;
                i28 = i32;
            }
            i10 = i30;
        } else {
            i10 = 0;
        }
        int i33 = i28;
        if (z12) {
            Editable G4 = s3Var.G4(i25, i27, i26, i33);
            if (G4 == null ? false : y5.h(G4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z4 = true;
                if (z12) {
                    Editable G42 = s3Var.G4(i25, i27, i26, i33);
                    if (G42 == null ? false : y5.g(G42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z10 = true;
                        this.s.c(i10, z4, z10, !z12 && i25 == i26, s3Var.k2(), !s3Var.H3());
                    }
                }
                z10 = false;
                if (z12) {
                }
                this.s.c(i10, z4, z10, !z12 && i25 == i26, s3Var.k2(), !s3Var.H3());
            }
        }
        z4 = false;
        if (z12) {
        }
        z10 = false;
        if (z12) {
        }
        this.s.c(i10, z4, z10, !z12 && i25 == i26, s3Var.k2(), !s3Var.H3());
    }

    public final void X() {
        w3 w3Var = this.s;
        if (w3Var != null) {
            s3 s3Var = this.r;
            boolean q22 = s3Var.q2();
            d2 d2Var = s3Var.G3;
            boolean z4 = (d2Var == null || d2Var.c.isEmpty()) ? false : true;
            ImageView imageView = w3Var.r;
            ImageView imageView2 = w3Var.n;
            imageView2.setEnabled(q22);
            imageView2.setAlpha(q22 ? 1.0f : 0.35f);
            imageView.setEnabled(z4);
            imageView.setAlpha(z4 ? 1.0f : 0.35f);
        }
    }

    public final void Y() {
        w3 w3Var = this.s;
        if (w3Var != null) {
            int i10 = this.n;
            boolean z4 = false;
            boolean z10 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            lg sendButton = w3Var.getSendButton();
            if (z10) {
                s3 s3Var = this.r;
                if (x4.f(s3Var.i3, s3Var.j3)) {
                    z4 = true;
                }
            }
            sendButton.setLocked(z4);
            w3Var.setPremiumLocked(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        a P2;
        w3 w3Var = this.s;
        if (w3Var == null) {
            return;
        }
        s3 s3Var = this.r;
        l9 textSelectionHelper = s3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            P2 = s3Var.P2();
        } else {
            int i10 = textSelectionHelper.u0;
            P2 = i10 == textSelectionHelper.x0 ? s3Var.x4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (s3Var.Q2() == null) {
            if (P2 != null) {
                if (!P2.a() && !P2.b() && !P2.c()) {
                    TL_iv.PageBlock pageBlock = P2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!s3.B3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = P2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i11 = 1;
                            }
                        }
                    }
                }
                i11 = 2;
            }
            i11 = 0;
        }
        if (P2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = P2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i12 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i12 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i12 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i12 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i12 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i12 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i12 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i12 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i12 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i12 = R.drawable.iv_footer;
                }
            } else if (i11 == 2) {
                if (P2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (P2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        w3Var.d(i11, i12);
    }

    public final void a0() {
        int paddingTop;
        w3 w3Var = this.s;
        if (w3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        s3 s3Var = this.r;
        if (s3Var.getChildCount() <= 0) {
            paddingTop = s3Var.getPaddingTop();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < s3Var.getChildCount(); i11++) {
                View childAt = s3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? s3Var.getPaddingTop() : i10;
        }
        w3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            Y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        s3 s3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.c0 instanceof zn) && s3Var.q2() && T()) {
                kf.k0.v(R.string.RichEditorDraftSaved, new qc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!s3Var.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kz kzVar;
        s3 s3Var = this.r;
        g3 g3Var = s3Var.k3;
        x9 x9Var = s3Var.l3;
        if (g3Var.y() && x9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (kzVar = this.w) == null) ? getHeight() - this.B : (int) kzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.H;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && x9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !s3Var.h3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        s3 s3Var = this.r;
        if (s3Var.getChildCount() <= 0) {
            int paddingTop = s3Var.getPaddingTop();
            this.F = paddingTop;
            s3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z4 = false;
        for (int i11 = 0; i11 < s3Var.getChildCount(); i11++) {
            View childAt = s3Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z4 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        s3Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i12 < AndroidUtilities.dp(7.0f) || !z4) {
            i12 = dp;
        }
        this.F = i12;
        return i12;
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public l9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 0;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean i() {
        boolean z4 = this.y;
        if (z4) {
            if (z4) {
                this.y = false;
                kz kzVar = this.w;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.w.B();
                }
                S();
                return false;
            }
        } else {
            if (this.x) {
                R(false);
                return false;
            }
            if (!this.r.E2() && !Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.di
    public final void k(float f10) {
        S();
    }

    @Override // org.telegram.ui.Components.di
    public final void m() {
        ui0 ui0Var = this.L;
        if (ui0Var != null) {
            ui0Var.i();
            this.L = null;
        }
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.c();
        }
        s3 s3Var2 = this.r;
        if (s3Var2 != null) {
            s3Var2.u2();
        }
        kz kzVar = this.w;
        if (kzVar != null) {
            kzVar.D();
        }
    }

    @Override // org.telegram.ui.Components.di
    public final boolean n() {
        s3 s3Var = this.r;
        if (s3Var == null) {
            return false;
        }
        s3Var.u2();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.Components.di
    public final boolean p() {
        return Q();
    }

    @Override // org.telegram.ui.Components.di
    public final void r() {
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.c();
        }
        if (this.x) {
            R(false);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.di
    public final void v() {
        this.I = this.b.o1.R() > AndroidUtilities.dp(20.0f);
        S();
        a0();
    }

    @Override // org.telegram.ui.Components.di
    public final void w(int i10, boolean z4) {
        this.I = z4;
        S();
        if (z4 && this.x && !this.y) {
            R(false);
        }
        a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        p70 p70Var;
        boolean z4 = this.I;
        li liVar = this.b;
        boolean z10 = liVar.o1.R() > AndroidUtilities.dp(20.0f);
        this.I = z10;
        if (!z10 && z4 && (p70Var = this.E) != null) {
            p70Var.u();
            this.E = null;
        }
        if (this.I || this.B > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    liVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            liVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        s3 s3Var = this.r;
        int C = org.telegram.messenger.y3.C(110.0f, (this.I || this.B > 0) ? 0 : AndroidUtilities.navigationBarHeight, (s3Var.j3() || this.x || !liVar.P0) ? 0 : AndroidUtilities.dp(62.0f)) + this.B;
        if (s3Var.getPaddingTop() != currentActionBarHeight || s3Var.getPaddingBottom() != C) {
            this.K = true;
            s3Var.n1(0, currentActionBarHeight, 0, C);
            this.K = false;
        }
        a0();
    }

    @Override // org.telegram.ui.Components.di
    public final void q() {
    }
}
