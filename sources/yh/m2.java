package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.mj0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ m2(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w2 w2Var;
        int i10 = this.a;
        boolean z10 = true;
        z2 z2Var = this.b;
        switch (i10) {
            case 0:
                if (z2Var.P.getAlpha() >= 1.0f) {
                    z2Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (z2Var.P.getAlpha() >= 1.0f) {
                    z2Var.g0.run();
                    break;
                }
                break;
            case 2:
                z2Var.getClass();
                z2Var.b((n2) view);
                break;
            case 3:
                z2Var.getClass();
                z2Var.b((n2) view);
                break;
            case 4:
                z2 z2Var2 = this.b;
                LinearLayout linearLayout = z2Var2.G;
                w2[] w2VarArr = z2Var2.n;
                if (z2Var2.getAlpha() >= 1.0f && !z2Var2.h0) {
                    if (z2Var2.j0) {
                        z2Var2.a(z2Var2.W, z2Var2.a0, z2Var2.b0, z2Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (w2 w2Var2 : w2VarArr) {
                            if (w2Var2 != null) {
                                TL_stars.StarGift starGift = w2Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && z2Var2.e0 != null) {
                            TextView textView = z2Var2.K;
                            z2Var2.h0 = true;
                            z2Var2.j0 = false;
                            ci.f4 f4Var = z2Var2.T;
                            if (f4Var != null) {
                                f4Var.e(true);
                                z2Var2.T = null;
                            }
                            textView.setText("");
                            z2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.G0(z2Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < w2VarArr.length; i11++) {
                                w2 w2Var3 = w2VarArr[i11];
                                if (w2Var3 != null) {
                                    w2Var3.setClickable(false);
                                    w2 w2Var4 = w2VarArr[i11];
                                    TL_stars.StarGift starGift2 = w2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        w2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < w2VarArr.length) {
                                    w2 w2Var5 = w2VarArr[i12];
                                    if (w2Var5 != null) {
                                        TL_stars.StarGift starGift3 = w2Var5.h;
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
                            z2Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            z2Var2.R.animate().alpha(1.0f).start();
                            z2Var2.P.animate().alpha(0.25f).start();
                            z2Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (w2 w2Var6 : w2VarArr) {
                                TL_stars.StarGift starGift4 = w2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            z2Var2.e0.run(arrayList2, new ai.m0(23, z2Var2, arrayList2), new rg.w1(z2Var2, 26));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                w2 w2Var7 = (w2) view;
                TL_stars.StarGift starGift5 = w2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !w2Var7.n) {
                    w2Var7.a(null, true);
                    z2Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        w2[] w2VarArr2 = z2Var.n;
                        if (i13 < w2VarArr2.length && (w2Var = w2VarArr2[i13]) != view) {
                            if (w2Var != null) {
                                TL_stars.StarGift starGift6 = w2Var.h;
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
                    z2Var.f0.run(new mj0(19, z2Var, w2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
