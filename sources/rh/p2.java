package rh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ p2(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y2 y2Var;
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
                a3Var.b((q2) view);
                break;
            case 3:
                a3Var.getClass();
                a3Var.b((q2) view);
                break;
            case 4:
                a3 a3Var2 = this.b;
                LinearLayout linearLayout = a3Var2.G;
                y2[] y2VarArr = a3Var2.n;
                if (a3Var2.getAlpha() >= 1.0f && !a3Var2.h0) {
                    if (a3Var2.j0) {
                        a3Var2.a(a3Var2.W, a3Var2.a0, a3Var2.b0, a3Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (y2 y2Var2 : y2VarArr) {
                            if (y2Var2 != null) {
                                TL_stars.StarGift starGift = y2Var2.h;
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
                            vh.p2 p2Var = a3Var2.T;
                            if (p2Var != null) {
                                p2Var.e(true);
                                a3Var2.T = null;
                            }
                            textView.setText("");
                            a3Var2.L.setText(cd.a0(null, null, 2131749785, xh.i.I0(a3Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < y2VarArr.length; i11++) {
                                y2 y2Var3 = y2VarArr[i11];
                                if (y2Var3 != null) {
                                    y2Var3.setClickable(false);
                                    y2 y2Var4 = y2VarArr[i11];
                                    TL_stars.StarGift starGift2 = y2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        y2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < y2VarArr.length) {
                                    y2 y2Var5 = y2VarArr[i12];
                                    if (y2Var5 != null) {
                                        TL_stars.StarGift starGift3 = y2Var5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + cd.E(starGift3.num, ','));
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
                            for (y2 y2Var6 : y2VarArr) {
                                TL_stars.StarGift starGift4 = y2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            a3Var2.e0.a(arrayList2, new ih.s(29, a3Var2, arrayList2), new ph.x1(a3Var2, 16));
                            break;
                        } else {
                            org.telegram.messenger.i0.G3(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                y2 y2Var7 = (y2) view;
                TL_stars.StarGift starGift5 = y2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !y2Var7.n) {
                    y2Var7.a(null, true);
                    a3Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        y2[] y2VarArr2 = a3Var.n;
                        if (i13 < y2VarArr2.length && (y2Var = y2VarArr2[i13]) != view) {
                            if (y2Var != null) {
                                TL_stars.StarGift starGift6 = y2Var.h;
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
                    a3Var.f0.a(new f11(29, a3Var, y2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
