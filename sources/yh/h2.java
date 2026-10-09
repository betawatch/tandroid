package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ h2(t2 t2Var, int i10) {
        this.a = i10;
        this.b = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r2 r2Var;
        int i10 = this.a;
        boolean z10 = false;
        t2 t2Var = this.b;
        switch (i10) {
            case 0:
                if (t2Var.P.getAlpha() >= 1.0f) {
                    t2Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (t2Var.P.getAlpha() >= 1.0f) {
                    t2Var.g0.run();
                    break;
                }
                break;
            case 2:
                t2Var.getClass();
                t2Var.b((i2) view);
                break;
            case 3:
                t2Var.getClass();
                t2Var.b((i2) view);
                break;
            case 4:
                t2 t2Var2 = this.b;
                LinearLayout linearLayout = t2Var2.G;
                r2[] r2VarArr = t2Var2.n;
                if (t2Var2.getAlpha() >= 1.0f && !t2Var2.h0) {
                    if (t2Var2.j0) {
                        t2Var2.a(t2Var2.W, t2Var2.a0, t2Var2.b0, t2Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (r2 r2Var2 : r2VarArr) {
                            if (r2Var2 != null) {
                                TL_stars.StarGift starGift = r2Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && t2Var2.e0 != null) {
                            TextView textView = t2Var2.K;
                            t2Var2.h0 = true;
                            t2Var2.j0 = false;
                            ci.d4 d4Var = t2Var2.T;
                            if (d4Var != null) {
                                d4Var.e(true);
                                t2Var2.T = null;
                            }
                            textView.setText("");
                            t2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.H0(t2Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < r2VarArr.length; i11++) {
                                r2 r2Var3 = r2VarArr[i11];
                                if (r2Var3 != null) {
                                    r2Var3.setClickable(false);
                                    r2 r2Var4 = r2VarArr[i11];
                                    TL_stars.StarGift starGift2 = r2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        r2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < r2VarArr.length) {
                                    r2 r2Var5 = r2VarArr[i12];
                                    if (r2Var5 != null) {
                                        TL_stars.StarGift starGift3 = r2Var5.h;
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
                            t2Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            t2Var2.R.animate().alpha(1.0f).start();
                            t2Var2.P.animate().alpha(0.25f).start();
                            t2Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (r2 r2Var6 : r2VarArr) {
                                TL_stars.StarGift starGift4 = r2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            t2Var2.e0.run(arrayList2, new qh.r(3, t2Var2, arrayList2), new f0(t2Var2, 1));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                r2 r2Var7 = (r2) view;
                TL_stars.StarGift starGift5 = r2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !r2Var7.n) {
                    r2Var7.a(null, true);
                    t2Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        r2[] r2VarArr2 = t2Var.n;
                        if (i13 < r2VarArr2.length && (r2Var = r2VarArr2[i13]) != view) {
                            if (r2Var != null) {
                                TL_stars.StarGift starGift6 = r2Var.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                }
                            }
                            i13++;
                        }
                    }
                    z10 = true;
                    t2Var.f0.run(new org.telegram.ui.Wallet.z6(14, t2Var, r2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
