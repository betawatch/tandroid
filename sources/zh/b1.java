package zh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ b1(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        e3 e3Var;
        int i10 = this.a;
        w3 w3Var = this.b;
        switch (i10) {
            case 0:
                w3.q0(w3Var);
                break;
            case 1:
                new s(w3Var.getContext()).show();
                break;
            case 2:
                w3Var.dismiss();
                break;
            case 3:
                w3.W(w3Var);
                break;
            case 4:
                w3.Y(w3Var);
                break;
            case 5:
                w3Var.j0.setLoading(false);
                w3Var.q2(0, true, null);
                break;
            case 6:
                new s(w3Var.getContext()).show();
                break;
            case 7:
                w3.w0(w3Var);
                break;
            case 8:
                w3.b0(w3Var);
                break;
            case 9:
                w3Var.onBackPressed();
                break;
            case 10:
                w3.g1(w3Var);
                break;
            case 11:
                w3Var.W1(true);
                break;
            case 12:
                w3Var.U1();
                break;
            case 13:
                w3Var.S1();
                break;
            case 14:
                w3.o0(w3Var);
                break;
            case 15:
                w3Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = w3Var.K1();
                if (U != null && K1 != null) {
                    uy uyVar = new uy(org.telegram.messenger.w1.e(4, "onlySelect", "dialogsType", true));
                    uyVar.C2 = new s50(w3Var, K1, uyVar, 11);
                    U.presentFragment(uyVar);
                    break;
                }
                break;
            case 16:
                w3Var.Y1();
                break;
            case 17:
                long A1 = w3Var.A1();
                if (A1 != 0) {
                    w3Var.X1(A1);
                    break;
                }
                break;
            case 18:
                w3Var.onBackPressed();
                break;
            case 19:
                w3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 20:
                if (w3Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w3Var.B1().title);
                    sb2.append(" #");
                    str = i2.g.k(w3Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                qc M = w3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.j = 5000;
                M.t = true;
                M.j();
                r00 r00Var = w3Var.a0;
                if (r00Var != null) {
                    r00Var.c(true);
                    break;
                }
                break;
            case 21:
                w3Var.d.u0(((w3) w3Var.Q0.d).P0.length - 1);
                break;
            case 22:
                w3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 23:
                t3 t3Var = w3Var.e0;
                di.d dVar = w3Var.j0;
                f3 f3Var = w3Var.M0.h;
                ImageReceiver imageReceiver = (f3Var == null || (e3Var = f3Var.c) == null) ? null : ((h3) e3Var).d;
                x9 x9Var = t3Var.d[0];
                if (imageReceiver != null && x9Var != null && x9Var.getImageReceiver() != null) {
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    xi0 lottieAnimation2 = x9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        x9Var.setImageDrawable(lottieAnimation);
                    }
                }
                t3Var.b.setAlpha(1.0f);
                t3Var.c.setAlpha(0.0f);
                if (w3Var.q0 && w3Var.Z != null && w3Var.D0 != null && w3Var.G1() >= 0 && w3Var.D0.b(w3Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = w3Var.D0.b(w3Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = w3Var.D0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new e1(w3Var, b10, 0));
                    break;
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(w3Var, 2));
                    break;
                }
                break;
            default:
                w3Var.getClass();
                new sg.a1((org.telegram.ui.ActionBar.n2) new bi.l3(w3Var, 12), 12, false).show();
                break;
        }
    }
}
