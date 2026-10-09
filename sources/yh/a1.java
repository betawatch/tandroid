package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ a1(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        a3 a3Var;
        int i10 = this.a;
        s3 s3Var = this.b;
        switch (i10) {
            case 0:
                s3.q0(s3Var);
                break;
            case 1:
                new s(s3Var.getContext()).show();
                break;
            case 2:
                s3Var.dismiss();
                break;
            case 3:
                s3.X(s3Var);
                break;
            case 4:
                s3.Z(s3Var);
                break;
            case 5:
                s3Var.k0.setLoading(false);
                s3Var.s2(0, true, null);
                break;
            case 6:
                new s(s3Var.getContext()).show();
                break;
            case 7:
                s3.x0(s3Var);
                break;
            case 8:
                s3.c0(s3Var);
                break;
            case 9:
                s3Var.onBackPressed();
                break;
            case 10:
                s3.h1(s3Var);
                break;
            case 11:
                s3Var.X1(true);
                break;
            case 12:
                s3Var.V1();
                break;
            case 13:
                s3Var.T1();
                break;
            case 14:
                s3.o0(s3Var);
                break;
            case 15:
                s3Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique L1 = s3Var.L1();
                if (U != null && L1 != null) {
                    ty tyVar = new ty(bi.d(4, "onlySelect", "dialogsType", true));
                    tyVar.C2 = new rz(s3Var, L1, tyVar, 13);
                    U.presentFragment(tyVar);
                    break;
                }
                break;
            case 16:
                s3Var.Z1();
                break;
            case 17:
                long B1 = s3Var.B1();
                if (B1 != 0) {
                    s3Var.Y1(B1);
                    break;
                }
                break;
            case 18:
                s3Var.onBackPressed();
                break;
            case 19:
                s3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 20:
                if (s3Var.C1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(s3Var.C1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.q.h(s3Var.C1().num, ',', sb2);
                } else {
                    str = "";
                }
                tc M = s3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.j = 5000;
                M.t = true;
                M.j();
                h10 h10Var = s3Var.a0;
                if (h10Var != null) {
                    h10Var.c(true);
                    break;
                }
                break;
            case 21:
                s3Var.d.u0(((s3) s3Var.R0.d).Q0.length - 1);
                break;
            case 22:
                s3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 23:
                p3 p3Var = s3Var.f0;
                ci.d dVar = s3Var.k0;
                b3 b3Var = s3Var.N0.h;
                ImageReceiver imageReceiver = (b3Var == null || (a3Var = b3Var.c) == null) ? null : ((d3) a3Var).d;
                y9 y9Var = p3Var.d[0];
                if (imageReceiver != null && y9Var != null && y9Var.getImageReceiver() != null) {
                    ck0 lottieAnimation = imageReceiver.getLottieAnimation();
                    ck0 lottieAnimation2 = y9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        y9Var.setImageDrawable(lottieAnimation);
                    }
                }
                p3Var.b.setAlpha(1.0f);
                p3Var.c.setAlpha(0.0f);
                if (s3Var.r0 && s3Var.Z != null && s3Var.E0 != null && s3Var.H1() >= 0 && s3Var.E0.b(s3Var.H1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = s3Var.E0.b(s3Var.H1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = s3Var.E0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new d1(s3Var, b10, 0));
                    break;
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new t0(s3Var, 2));
                    break;
                }
                break;
            default:
                s3Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) new ai.z3(s3Var, 12), 12, false).show();
                break;
        }
    }
}
