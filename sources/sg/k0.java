package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gc1;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k0 extends qg.m1 {
    public final ArrayList Q0;

    public k0(p2 p2Var, int i10, ArrayList arrayList, f6 f6Var) {
        super(p2Var, i10, null, null, null, f6Var);
        ArrayList arrayList2 = new ArrayList();
        this.Q0 = arrayList2;
        arrayList2.addAll(arrayList);
        b0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        ug.a aVar = new ug.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new org.telegram.ui.web.c(this, 7));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, a6.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = j0.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, a6.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            j0 j0Var = new j0(context, 47.0f);
            j0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            g9 g9Var = j0Var.e;
            g9Var.r(user);
            j0Var.a.e(user, g9Var);
            frameLayout2.addView(j0Var, 0, a6.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, a6.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                j0 j0Var2 = new j0(context, 41.5f);
                g9 g9Var2 = j0Var2.e;
                g9Var2.r(user2);
                j0Var2.a.e(user2, g9Var2);
                frameLayout2.addView(j0Var2, 0, a6.e(83, 83, 17));
                j0Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    i0 i0Var = j0Var2.b;
                    i0Var.setAlpha(1.0f);
                    i0Var.b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.B0 = frameLayout;
        fixNavigationBar();
    }

    public static void c0(ArrayList arrayList) {
        p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        k0 k0Var = new k0(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        k0Var.J0 = true;
        k0Var.K0 = true;
        k0Var.show();
    }

    @Override // qg.m1
    public final void V(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new bi.g(18));
            view.setClipToOutline(true);
            view.setBackgroundColor(j6.v0(j6.a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override // qg.m1
    public final void W(gc1 gc1Var) {
        View view = this.B0;
        ArrayList arrayList = this.Q0;
        gc1Var.addView(view, a6.k(0.0f, arrayList.size() == 1 ? 28.0f : 34.0f, 0.0f, arrayList.size() == 1 ? 9.0f : 14.0f, -1, arrayList.size() == 1 ? 94 : 83));
    }

    @Override // qg.m1
    public final void a0(boolean z10) {
        String formatString;
        this.O0[0].setTextSize(1, 20.0f);
        this.P0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m90 m90Var = this.O0[0];
        ArrayList arrayList = this.Q0;
        m90Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = arrayList.size();
        if (size == 1) {
            formatString = LocaleController.formatString(R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString(R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC.User) arrayList.get(0))));
        } else if (size == 2) {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1))));
        } else if (size != 3) {
            formatString = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", arrayList.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        } else {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        }
        this.P0.setText(AndroidUtilities.replaceTags(formatString));
        this.P0.append("\n");
        this.P0.append("\n");
        if (arrayList.size() == 1) {
            this.P0.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.P0.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override // qg.m1
    public final void b0() {
        this.f0 = 1;
        this.g0 = 0;
        this.j0 = 1;
        int size = this.X.size();
        int i10 = 1 + size;
        this.k0 = i10;
        this.f0 = size + 2;
        this.n0 = i10;
    }
}
