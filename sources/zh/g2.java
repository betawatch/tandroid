package zh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ g2(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q2 q2Var;
        int i10 = this.a;
        boolean z10 = true;
        s2 s2Var = this.b;
        switch (i10) {
            case 0:
                if (s2Var.P.getAlpha() >= 1.0f) {
                    s2Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (s2Var.P.getAlpha() >= 1.0f) {
                    s2Var.g0.run();
                    break;
                }
                break;
            case 2:
                s2Var.getClass();
                s2Var.b((h2) view);
                break;
            case 3:
                s2Var.getClass();
                s2Var.b((h2) view);
                break;
            case 4:
                s2 s2Var2 = this.b;
                LinearLayout linearLayout = s2Var2.G;
                q2[] q2VarArr = s2Var2.n;
                if (s2Var2.getAlpha() >= 1.0f && !s2Var2.h0) {
                    if (s2Var2.j0) {
                        s2Var2.a(s2Var2.W, s2Var2.a0, s2Var2.b0, s2Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (q2 q2Var2 : q2VarArr) {
                            if (q2Var2 != null) {
                                TL_stars.StarGift starGift = q2Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && s2Var2.e0 != null) {
                            TextView textView = s2Var2.K;
                            s2Var2.h0 = true;
                            s2Var2.j0 = false;
                            di.d4 d4Var = s2Var2.T;
                            if (d4Var != null) {
                                d4Var.e(true);
                                s2Var2.T = null;
                            }
                            textView.setText("");
                            s2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, fi.l.H0(s2Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < q2VarArr.length; i11++) {
                                q2 q2Var3 = q2VarArr[i11];
                                if (q2Var3 != null) {
                                    q2Var3.setClickable(false);
                                    q2 q2Var4 = q2VarArr[i11];
                                    TL_stars.StarGift starGift2 = q2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        q2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < q2VarArr.length) {
                                    q2 q2Var5 = q2VarArr[i12];
                                    if (q2Var5 != null) {
                                        TL_stars.StarGift starGift3 = q2Var5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + LocaleController.formatNumber(starGift3.num, ','));
                                        }
                                    }
                                    i12++;
                                }
                            }
                            s2Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            s2Var2.R.animate().alpha(1.0f).start();
                            s2Var2.P.animate().alpha(0.25f).start();
                            s2Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (q2 q2Var6 : q2VarArr) {
                                TL_stars.StarGift starGift4 = q2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            s2Var2.e0.run(arrayList2, new rh.s(3, s2Var2, arrayList2), new zf.c(s2Var2, 8));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                q2 q2Var7 = (q2) view;
                TL_stars.StarGift starGift5 = q2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !q2Var7.n) {
                    q2Var7.a(null, true);
                    s2Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        q2[] q2VarArr2 = s2Var.n;
                        if (i13 < q2VarArr2.length && (q2Var = q2VarArr2[i13]) != view) {
                            if (q2Var != null) {
                                TL_stars.StarGift starGift6 = q2Var.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    z10 = false;
                                }
                            }
                            i13++;
                        }
                    }
                    s2Var.f0.run(new org.telegram.ui.Wallet.y6(14, s2Var, q2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
