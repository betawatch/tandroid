package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.oj0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        o0 o0Var = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) obj;
                Context context = (Context) obj2;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = a0.w0;
                    if (i11 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(a0Var, 21);
                        Pattern pattern = org.telegram.ui.Components.e5.a;
                        ig.f2 b10 = ig.f2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.f6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            vc0 vc0Var = new vc0(context, null);
                            vc0Var.setAllItemsCount(6);
                            vc0Var.setItemCount(Math.min(6, 8));
                            vc0Var.setTextColor(w02);
                            vc0Var.setGravity(17);
                            vc0Var.setMinValue(0);
                            vc0Var.setMaxValue(5);
                            vc0Var.setValue(i12);
                            linearLayout.addView(vc0Var, w7.x5.l(1.0f, 0, 432));
                            int i13 = 7;
                            vc0Var.setFormatter(new org.telegram.ui.Components.t(strArr, i13));
                            org.telegram.ui.Components.w4 w4Var = new org.telegram.ui.Components.w4(context, vc0Var);
                            w4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ci.d(10));
                            w4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            w4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.d dVar = new di.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r3, 1));
                            w4Var.addView(dVar, w7.x5.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = w4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new fi.e0(i13, b1Var, vc0Var));
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
                            break;
                        }
                    } else {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == a0Var.n0) {
                            i12 = i11;
                        }
                        i11++;
                    }
                }
                break;
            case 1:
                i0 i0Var = (i0) obj;
                oj0 oj0Var = (oj0) obj2;
                di.d dVar2 = i0Var.f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(i0Var.c);
                    dVar2.setLoading(true);
                    oj0Var.run(i0Var.E);
                    break;
                }
                break;
            case 2:
                s0 s0Var = (s0) obj;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj2;
                m0 m0Var = s0Var.o0;
                int i14 = s0Var.C0;
                if (i14 != 2) {
                    if (i14 == 1) {
                        o0 o0Var2 = new o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                        s0Var.v0 = o0Var2;
                        m0Var.setPreviewAttributes(o0Var2);
                        s0Var.S(2);
                        break;
                    }
                } else {
                    m0Var.setPreviewingAttributes(arrayList);
                    s0Var.S(1);
                    break;
                }
                break;
            case 3:
                o0 o0Var3 = (o0) obj2;
                s0 s0Var2 = ((n0) obj).N;
                int i15 = s0Var2.C0;
                m0 m0Var2 = s0Var2.o0;
                if (i15 == 1) {
                    s0Var2.v0 = new o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    s0Var2.S(2);
                }
                int i16 = s0Var2.j0.r;
                o0 o0Var4 = s0Var2.v0;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.b;
                    if (i16 == 1) {
                        o0Var = new o0(o0Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i16 == 2) {
                        o0Var = new o0(stargiftattributebackdrop, o0Var3.b, stargiftattributemodel);
                    } else if (i16 == 0) {
                        o0Var = new o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.c);
                    }
                }
                s0Var2.v0 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                s0Var2.U();
                break;
            case 4:
                of.f.u(((w3) obj).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj2).fragment_listed_url);
                break;
            case 5:
                ((w3) obj).n2((CharSequence) obj2);
                break;
            case 6:
                x2 x2Var = (x2) obj;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                if (x2Var.E.getAlpha() >= 1.0f && !x2Var.h0 && !x2Var.j0 && x2Var.d0 != null) {
                    new s0(x2Var.getContext(), f6Var, x2Var.W, x2Var.c0, x2Var.d0, true).show();
                    break;
                }
                break;
            default:
                of.f.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                break;
        }
    }

    public /* synthetic */ w(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = 7;
        this.c = context;
        this.b = starsTransaction;
    }
}
