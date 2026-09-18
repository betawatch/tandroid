package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.oj0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ n2(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x2 x2Var;
        int i10 = this.a;
        boolean z10 = true;
        a3 a3Var = this.b;
        switch (i10) {
            case 0:
                if (a3Var.P.getAlpha() >= 1.0f) {
                    a3Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (a3Var.P.getAlpha() >= 1.0f) {
                    a3Var.g0.run();
                    break;
                }
                break;
            case 2:
                a3Var.getClass();
                a3Var.b((o2) view);
                break;
            case 3:
                a3Var.getClass();
                a3Var.b((o2) view);
                break;
            case 4:
                a3 a3Var2 = this.b;
                LinearLayout linearLayout = a3Var2.G;
                x2[] x2VarArr = a3Var2.n;
                if (a3Var2.getAlpha() >= 1.0f && !a3Var2.h0) {
                    if (a3Var2.j0) {
                        a3Var2.a(a3Var2.W, a3Var2.a0, a3Var2.b0, a3Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (x2 x2Var2 : x2VarArr) {
                            if (x2Var2 != null) {
                                TL_stars.StarGift starGift = x2Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && a3Var2.e0 != null) {
                            TextView textView = a3Var2.K;
                            a3Var2.h0 = true;
                            a3Var2.j0 = false;
                            ci.f4 f4Var = a3Var2.T;
                            if (f4Var != null) {
                                f4Var.e(true);
                                a3Var2.T = null;
                            }
                            textView.setText("");
                            a3Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.G0(a3Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < x2VarArr.length; i11++) {
                                x2 x2Var3 = x2VarArr[i11];
                                if (x2Var3 != null) {
                                    x2Var3.setClickable(false);
                                    x2 x2Var4 = x2VarArr[i11];
                                    TL_stars.StarGift starGift2 = x2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        x2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < x2VarArr.length) {
                                    x2 x2Var5 = x2VarArr[i12];
                                    if (x2Var5 != null) {
                                        TL_stars.StarGift starGift3 = x2Var5.h;
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
                            a3Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            a3Var2.R.animate().alpha(1.0f).start();
                            a3Var2.P.animate().alpha(0.25f).start();
                            a3Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (x2 x2Var6 : x2VarArr) {
                                TL_stars.StarGift starGift4 = x2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            a3Var2.e0.run(arrayList2, new ai.m0(23, a3Var2, arrayList2), new rg.w1(a3Var2, 26));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                x2 x2Var7 = (x2) view;
                TL_stars.StarGift starGift5 = x2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !x2Var7.n) {
                    x2Var7.a(null, true);
                    a3Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        x2[] x2VarArr2 = a3Var.n;
                        if (i13 < x2VarArr2.length && (x2Var = x2VarArr2[i13]) != view) {
                            if (x2Var != null) {
                                TL_stars.StarGift starGift6 = x2Var.h;
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
                    a3Var.f0.run(new oj0(19, a3Var, x2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
