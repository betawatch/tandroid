package zh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.oj0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ k2(x2 x2Var, int i10) {
        this.a = i10;
        this.b = x2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v2 v2Var;
        int i10 = this.a;
        boolean z10 = true;
        x2 x2Var = this.b;
        switch (i10) {
            case 0:
                if (x2Var.P.getAlpha() >= 1.0f) {
                    x2Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (x2Var.P.getAlpha() >= 1.0f) {
                    x2Var.g0.run();
                    break;
                }
                break;
            case 2:
                x2Var.getClass();
                x2Var.b((l2) view);
                break;
            case 3:
                x2Var.getClass();
                x2Var.b((l2) view);
                break;
            case 4:
                x2 x2Var2 = this.b;
                LinearLayout linearLayout = x2Var2.G;
                v2[] v2VarArr = x2Var2.n;
                if (x2Var2.getAlpha() >= 1.0f && !x2Var2.h0) {
                    if (x2Var2.j0) {
                        x2Var2.a(x2Var2.W, x2Var2.a0, x2Var2.b0, x2Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (v2 v2Var2 : v2VarArr) {
                            if (v2Var2 != null) {
                                TL_stars.StarGift starGift = v2Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && x2Var2.e0 != null) {
                            TextView textView = x2Var2.K;
                            x2Var2.h0 = true;
                            x2Var2.j0 = false;
                            di.f4 f4Var = x2Var2.T;
                            if (f4Var != null) {
                                f4Var.e(true);
                                x2Var2.T = null;
                            }
                            textView.setText("");
                            x2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, fi.m.G0(x2Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < v2VarArr.length; i11++) {
                                v2 v2Var3 = v2VarArr[i11];
                                if (v2Var3 != null) {
                                    v2Var3.setClickable(false);
                                    v2 v2Var4 = v2VarArr[i11];
                                    TL_stars.StarGift starGift2 = v2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        v2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < v2VarArr.length) {
                                    v2 v2Var5 = v2VarArr[i12];
                                    if (v2Var5 != null) {
                                        TL_stars.StarGift starGift3 = v2Var5.h;
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
                            x2Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            x2Var2.R.animate().alpha(1.0f).start();
                            x2Var2.P.animate().alpha(0.25f).start();
                            x2Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (v2 v2Var6 : v2VarArr) {
                                TL_stars.StarGift starGift4 = v2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            x2Var2.e0.run(arrayList2, new bi.f0(23, x2Var2, arrayList2), new sg.p0(x2Var2, 29));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                v2 v2Var7 = (v2) view;
                TL_stars.StarGift starGift5 = v2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !v2Var7.n) {
                    v2Var7.a(null, true);
                    x2Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        v2[] v2VarArr2 = x2Var.n;
                        if (i13 < v2VarArr2.length && (v2Var = v2VarArr2[i13]) != view) {
                            if (v2Var != null) {
                                TL_stars.StarGift starGift6 = v2Var.h;
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
                    x2Var.f0.run(new oj0(19, x2Var, v2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
