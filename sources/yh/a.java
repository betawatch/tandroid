package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ck;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Wallet.y6;
import w7.a6;
import zh.d7;
import zh.f5;
import zh.p7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i10 = this.a;
        zh.n0 n0Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                d.Q((d) obj2, (TL_stars.TL_StarGiftAuctionAcquiredGift) obj);
                break;
            case 1:
                g4 g4Var = (g4) obj2;
                g4Var.getClass();
                if (((d7) obj).f > 0) {
                    g4Var.presentFragment(new p7());
                    break;
                }
                break;
            case 2:
                f4.Q((f4) obj2, (e4) obj);
                break;
            case 3:
                k4 k4Var = (k4) obj2;
                fi.r4 r4Var = (fi.r4) obj;
                HashSet hashSet = k4Var.Z;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = k4Var.Y.l;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj3 = arrayList2.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if ((i12 == 0 || i12 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                    }
                    r4Var.run(arrayList);
                    k4Var.dismiss();
                    break;
                }
                break;
            case 4:
                f5 f5Var = ((h4) obj2).c.Y;
                f5Var.e = !f5Var.e;
                ((ck) obj).run();
                f5Var.i(true);
                break;
            case 5:
                zh.g.X((zh.g) obj2, (Context) obj, view);
                break;
            case 6:
                zh.z zVar = (zh.z) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = zh.z.w0;
                    if (i13 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ji.p1 p1Var = new ji.p1(zVar, 24);
                        Pattern pattern = g5.a;
                        ig.f2 b10 = ig.f2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = g6.x0(null, g6.j5, false);
                            int x03 = g6.x0(null, g6.h5, false);
                            g6.x0(null, g6.Ji, false);
                            g6.x0(null, g6.Ni, false);
                            g6.x0(null, g6.E8, false);
                            g6.x0(null, g6.G8, false);
                            g6.x0(null, g6.i6, false);
                            g6.x0(null, g6.Sh, false);
                            g6.x0(null, g6.Oh, false);
                            g6.x0(null, g6.Qh, false);
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (c6) null, false);
                            e3Var.fixNavigationBar();
                            e3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ud0 ud0Var = new ud0(context, null);
                            ud0Var.setAllItemsCount(6);
                            ud0Var.setItemCount(Math.min(6, 8));
                            ud0Var.setTextColor(x02);
                            ud0Var.setGravity(17);
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(5);
                            ud0Var.setValue(i14);
                            linearLayout.addView(ud0Var, a6.l(1.0f, 0, 432));
                            int i15 = 7;
                            ud0Var.setFormatter(new org.telegram.ui.Components.s(strArr, i15));
                            org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(context, ud0Var);
                            y4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new ci.d(10));
                            y4Var.addView(frameLayout, a6.t(-1, -2, 51, 22, 0, 0, 4));
                            y4Var.addView(linearLayout, a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.d dVar = new di.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.m2(r3, 1));
                            y4Var.addView(dVar, a6.t(-1, 48, 0, 16, 12, 16, 12));
                            e3Var.customView = y4Var;
                            e3Var.show();
                            e3Var.setOnDismissListener(new fi.d0(i15, p1Var, ud0Var));
                            e3Var.setBackgroundColor(x03);
                            e3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
                            break;
                        }
                    } else {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == zVar.n0) {
                            i14 = i13;
                        }
                        i13++;
                    }
                }
                break;
            case 7:
                zh.h0 h0Var = (zh.h0) obj2;
                y6 y6Var = (y6) obj;
                di.d dVar2 = h0Var.f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(h0Var.c);
                    dVar2.setLoading(true);
                    y6Var.run(h0Var.E);
                    break;
                }
                break;
            case 8:
                zh.r0 r0Var = (zh.r0) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) obj;
                zh.l0 l0Var = r0Var.o0;
                int i16 = r0Var.C0;
                if (i16 != 2) {
                    if (i16 == 1) {
                        zh.n0 n0Var2 = new zh.n0(l0Var.getUpgradeBackdropAttribute(), l0Var.getUpgradePatternAttribute(), l0Var.getUpgradeImageViewAttribute());
                        r0Var.v0 = n0Var2;
                        l0Var.setPreviewAttributes(n0Var2);
                        r0Var.T(2);
                        break;
                    }
                } else {
                    l0Var.setPreviewingAttributes(arrayList3);
                    r0Var.T(1);
                    break;
                }
                break;
            case 9:
                zh.n0 n0Var3 = (zh.n0) obj;
                zh.r0 r0Var2 = ((zh.m0) obj2).N;
                int i17 = r0Var2.C0;
                zh.l0 l0Var2 = r0Var2.o0;
                if (i17 == 1) {
                    r0Var2.v0 = new zh.n0(l0Var2.getUpgradeBackdropAttribute(), l0Var2.getUpgradePatternAttribute(), l0Var2.getUpgradeImageViewAttribute());
                    r0Var2.T(2);
                }
                int i18 = r0Var2.j0.r;
                zh.n0 n0Var4 = r0Var2.v0;
                if (n0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var4.b;
                    if (i18 == 1) {
                        n0Var = new zh.n0(n0Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i18 == 2) {
                        n0Var = new zh.n0(stargiftattributebackdrop, n0Var3.b, stargiftattributemodel);
                    } else if (i18 == 0) {
                        n0Var = new zh.n0(stargiftattributebackdrop, stargiftattributepattern, n0Var3.c);
                    }
                }
                r0Var2.v0 = n0Var;
                l0Var2.setPreviewAttributes(n0Var);
                r0Var2.V();
                break;
            case 10:
                pf.d.u(((zh.r3) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                break;
            case 11:
                ((zh.r3) obj2).p2((CharSequence) obj);
                break;
            case 12:
                zh.s2 s2Var = (zh.s2) obj2;
                c6 c6Var = (c6) obj;
                if (s2Var.E.getAlpha() >= 1.0f && !s2Var.h0 && !s2Var.j0 && s2Var.d0 != null) {
                    new zh.r0(s2Var.getContext(), c6Var, s2Var.W, s2Var.c0, s2Var.d0, true).show();
                    break;
                }
                break;
            default:
                pf.d.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                break;
        }
    }
}
