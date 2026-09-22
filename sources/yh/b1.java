package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ b1(z3 z3Var, int i10) {
        this.a = i10;
        this.b = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        g3 g3Var;
        int i10 = this.a;
        z3 z3Var = this.b;
        switch (i10) {
            case 0:
                z3.q0(z3Var);
                break;
            case 1:
                new s(z3Var.getContext()).show();
                break;
            case 2:
                z3Var.dismiss();
                break;
            case 3:
                z3.W(z3Var);
                break;
            case 4:
                z3.Y(z3Var);
                break;
            case 5:
                z3Var.j0.setLoading(false);
                z3Var.q2(0, true, null);
                break;
            case 6:
                new s(z3Var.getContext()).show();
                break;
            case 7:
                z3.w0(z3Var);
                break;
            case 8:
                z3.b0(z3Var);
                break;
            case 9:
                z3Var.onBackPressed();
                break;
            case 10:
                z3.g1(z3Var);
                break;
            case 11:
                z3Var.W1(true);
                break;
            case 12:
                z3Var.U1();
                break;
            case 13:
                z3Var.S1();
                break;
            case 14:
                z3.o0(z3Var);
                break;
            case 15:
                z3Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = z3Var.K1();
                if (U != null && K1 != null) {
                    uy uyVar = new uy(org.telegram.messenger.y0.e(4, "onlySelect", "dialogsType", true));
                    uyVar.C2 = new s50(z3Var, K1, uyVar, 11);
                    U.presentFragment(uyVar);
                    break;
                }
                break;
            case 16:
                z3Var.Y1();
                break;
            case 17:
                long A1 = z3Var.A1();
                if (A1 != 0) {
                    z3Var.X1(A1);
                    break;
                }
                break;
            case 18:
                z3Var.onBackPressed();
                break;
            case 19:
                z3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 20:
                if (z3Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z3Var.B1().title);
                    sb2.append(" #");
                    str = hg.c.k(z3Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                oc M = z3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.j = 5000;
                M.t = true;
                M.j();
                r00 r00Var = z3Var.a0;
                if (r00Var != null) {
                    r00Var.c(true);
                    break;
                }
                break;
            case 21:
                z3Var.d.u0(((z3) z3Var.Q0.d).P0.length - 1);
                break;
            case 22:
                z3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 23:
                w3 w3Var = z3Var.e0;
                ci.d dVar = z3Var.j0;
                h3 h3Var = z3Var.M0.h;
                ImageReceiver imageReceiver = (h3Var == null || (g3Var = h3Var.c) == null) ? null : ((j3) g3Var).d;
                u9 u9Var = w3Var.d[0];
                if (imageReceiver != null && u9Var != null && u9Var.getImageReceiver() != null) {
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    xi0 lottieAnimation2 = u9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        u9Var.setImageDrawable(lottieAnimation);
                    }
                }
                w3Var.b.setAlpha(1.0f);
                w3Var.c.setAlpha(0.0f);
                if (z3Var.q0 && z3Var.Z != null && z3Var.D0 != null && z3Var.G1() >= 0 && z3Var.D0.b(z3Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = z3Var.D0.b(z3Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = z3Var.D0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new e1(z3Var, b10, 0));
                    break;
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(z3Var, 2));
                    break;
                }
                break;
            default:
                z3Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(z3Var, 12), 12, false).show();
                break;
        }
    }
}
