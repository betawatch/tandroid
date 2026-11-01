package rh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ p2(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z2 z2Var;
        int i10 = this.a;
        boolean z10 = true;
        b3 b3Var = this.b;
        switch (i10) {
            case 0:
                if (b3Var.P.getAlpha() >= 1.0f) {
                    b3Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (b3Var.P.getAlpha() >= 1.0f) {
                    b3Var.g0.run();
                    break;
                }
                break;
            case 2:
                b3Var.getClass();
                b3Var.b((r2) view);
                break;
            case 3:
                b3Var.getClass();
                b3Var.b((r2) view);
                break;
            case 4:
                b3 b3Var2 = this.b;
                LinearLayout linearLayout = b3Var2.G;
                z2[] z2VarArr = b3Var2.n;
                if (b3Var2.getAlpha() >= 1.0f && !b3Var2.h0) {
                    if (b3Var2.j0) {
                        b3Var2.a(b3Var2.W, b3Var2.a0, b3Var2.b0, b3Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (z2 z2Var2 : z2VarArr) {
                            if (z2Var2 != null) {
                                TL_stars.StarGift starGift = z2Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && b3Var2.e0 != null) {
                            TextView textView = b3Var2.K;
                            b3Var2.h0 = true;
                            b3Var2.j0 = false;
                            vh.p2 p2Var = b3Var2.T;
                            if (p2Var != null) {
                                p2Var.e(true);
                                b3Var2.T = null;
                            }
                            textView.setText("");
                            b3Var2.L.setText(dd.a0(null, null, 2131749785, xh.i.J0(b3Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < z2VarArr.length; i11++) {
                                z2 z2Var3 = z2VarArr[i11];
                                if (z2Var3 != null) {
                                    z2Var3.setClickable(false);
                                    z2 z2Var4 = z2VarArr[i11];
                                    TL_stars.StarGift starGift2 = z2Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        z2Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < z2VarArr.length) {
                                    z2 z2Var5 = z2VarArr[i12];
                                    if (z2Var5 != null) {
                                        TL_stars.StarGift starGift3 = z2Var5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + dd.E(starGift3.num, ','));
                                        }
                                    }
                                    i12++;
                                }
                            }
                            b3Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            b3Var2.R.animate().alpha(1.0f).start();
                            b3Var2.P.animate().alpha(0.25f).start();
                            b3Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (z2 z2Var6 : z2VarArr) {
                                TL_stars.StarGift starGift4 = z2Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            b3Var2.e0.a(arrayList2, new ih.s(29, b3Var2, arrayList2), new ph.x1(b3Var2, 16));
                            break;
                        } else {
                            org.telegram.messenger.i0.G3(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                z2 z2Var7 = (z2) view;
                TL_stars.StarGift starGift5 = z2Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !z2Var7.n) {
                    z2Var7.a(null, true);
                    b3Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        z2[] z2VarArr2 = b3Var.n;
                        if (i13 < z2VarArr2.length && (z2Var = z2VarArr2[i13]) != view) {
                            if (z2Var != null) {
                                TL_stars.StarGift starGift6 = z2Var.h;
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
                    b3Var.f0.a(new q2(0, b3Var, z2Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
