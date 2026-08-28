package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class tk0 {
    public static org.telegram.ui.ActionBar.f3 a;

    public static org.telegram.ui.Components.oc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        HashSet hashSet = mh.c3.S0;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            mh.c3 c3Var = null;
            while (it.hasNext()) {
                mh.c3 c3Var2 = (mh.c3) it.next();
                if (c3Var2.R0) {
                    c3Var = c3Var2;
                }
            }
            if (c3Var != null) {
                if (U == null || U.getParentActivity() == null) {
                    context2 = LaunchActivity.C1;
                    if (context2 == null) {
                        context2 = ApplicationLoader.applicationContext;
                    }
                } else {
                    context2 = U.getParentActivity();
                }
                return new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(context2), null);
            }
        }
        HashSet hashSet2 = l4.X0;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            l4 l4Var = null;
            while (it2.hasNext()) {
                l4 l4Var2 = (l4) it2.next();
                if (l4Var2.R) {
                    l4Var = l4Var2;
                }
            }
            if (l4Var != null) {
                if (U == null || U.getParentActivity() == null) {
                    context = LaunchActivity.C1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                } else {
                    context = U.getParentActivity();
                }
                return new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(context), null);
            }
        }
        return (U == null || U.getLastSheet() == null || U.getLastSheet().getBulletinFactory() == null) ? org.telegram.ui.Components.oc.a0(U) : U.getLastSheet().getBulletinFactory();
    }

    public static void b(boolean z10, final int i9, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.y0 y0Var) {
        final Context context;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.b6 b6Var;
        boolean z12;
        org.telegram.ui.Cells.t8 t8Var;
        ArrayList arrayList;
        boolean z13;
        org.telegram.ui.ActionBar.o2 U;
        String str3;
        org.telegram.ui.ActionBar.o2 U2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (y0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(y0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (y0Var != null) {
                        y0Var.v("oauth_result_confirmed", org.telegram.ui.web.y0.x(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                    if (U3 == null) {
                        return;
                    }
                    ve.e.u(U3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z14 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z14) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    str3 = tL_urlAuthResultRequest.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest.domain;
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    a().M(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z14 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, str3), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Gi, false)), R.raw.contact_check).j();
                }
                if (y0Var != null) {
                    y0Var.v("oauth_result_confirmed", org.telegram.ui.web.y0.x(null, "result_url"));
                    return;
                } else {
                    if (!z10 || (U2 = LaunchActivity.U()) == null || (context2 = U2.getContext()) == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new cv(context2, r13 ? 1 : 0), 800L);
                    return;
                }
            }
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (y0Var != null) {
                return;
            }
            if (TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                if (TextUtils.isEmpty(str) || (U = LaunchActivity.U()) == null) {
                    return;
                }
                org.telegram.ui.Components.y4.q0(U, str, false, urlAuthResult2 == null);
                return;
            }
            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
            if (U4 == null) {
                return;
            }
            org.telegram.ui.Components.y4.q0(U4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.o2 U5 = LaunchActivity.U();
            if (U5 == null || (context = U5.getContext()) == null) {
                return;
            }
            org.telegram.ui.ActionBar.b6 resourceProvider = U5.getResourceProvider();
            final org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, U5.getResourceProvider(), false, false);
            FrameLayout frameLayout3 = new FrameLayout(context);
            j10.customView = frameLayout3;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i9).isTestBackend();
            arrayList2.clear();
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated() && ConnectionsManager.getInstance(i10).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i10));
                }
            }
            Collections.sort(arrayList2, new org.telegram.ui.Components.jn0(10));
            final boolean z15 = tL_messages_requestUrlAuth.peer != null;
            boolean z16 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(14.0f), U5.getThemedColor(org.telegram.ui.ActionBar.f6.i5)));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            o9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            final int[] iArr = {i9};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            z8Var.r(currentUser);
            o9Var.e(currentUser, z8Var);
            frameLayout5.addView(o9Var, g7.e6.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = U5.getThemedColor(org.telegram.ui.ActionBar.f6.r5);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout5.addView(imageView, g7.e6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout4.addView(frameLayout5, g7.e6.e(52, 28, 17));
            frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout3.addView(frameLayout4, g7.e6.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            g7.g6.a(frameLayout4);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout4.setVisibility(8);
            }
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
            frameLayout3.addView(f10, g7.e6.e(-1, -1, 119));
            org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
            o9Var2.setRoundRadius(AndroidUtilities.dp(40.0f));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var2.r(tL_urlAuthResultRequest2.bot);
            o9Var2.e(tL_urlAuthResultRequest2.bot, z8Var2);
            f10.addView(o9Var2, g7.e6.t(80, 80, 49, 0, 21, 0, 16));
            final String string = tL_urlAuthResultRequest2.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest2.domain;
            int i11 = org.telegram.ui.ActionBar.f6.j5;
            TextView b10 = g7.i6.b(context, 20.0f, i11, true, null);
            b10.setGravity(17);
            b10.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, string), U5.getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
            f10.addView(b10, g7.e6.r(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = g7.i6.b(context, 14.0f, i11, false, null);
            b11.setGravity(17);
            org.telegram.messenger.l0.m(z16 ? R.string.BotAuthAppSubtitle : z15 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle, b11);
            f10.addView(b11, g7.e6.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout = frameLayout4;
                frameLayout2 = frameLayout5;
                b6Var = resourceProvider;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(org.telegram.ui.ActionBar.f6.d0(AndroidUtilities.dp(16.0f), U5.getThemedColor(org.telegram.ui.ActionBar.f6.d6)));
                f10.addView(linearLayout, g7.e6.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    frameLayout = frameLayout4;
                    frameLayout2 = frameLayout5;
                    b6Var = resourceProvider;
                } else {
                    LinearLayout f11 = org.telegram.messenger.ll.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    frameLayout = frameLayout4;
                    imageView2.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i11), mode));
                    f11.addView(imageView2, g7.e6.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f11.addView(linearLayout2, g7.e6.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    frameLayout2 = frameLayout5;
                    TextView b12 = g7.i6.b(context, 16.0f, i11, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, g7.e6.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = g7.i6.b(context, 13.0f, org.telegram.ui.ActionBar.f6.y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    b6Var = resourceProvider;
                    linearLayout2.addView(b13, g7.e6.q(-1, -2, 55));
                    linearLayout.addView(f11, g7.e6.n(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z12 = false;
                } else {
                    LinearLayout f12 = org.telegram.messenger.ll.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i11), mode));
                    f12.addView(imageView3, g7.e6.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f12.addView(linearLayout3, g7.e6.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = g7.i6.b(context, 16.0f, i11, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, g7.e6.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z12 = false;
                    TextView b15 = g7.i6.b(context, 13.0f, org.telegram.ui.ActionBar.f6.y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, g7.e6.q(-1, -2, 55));
                    linearLayout.addView(f12, g7.e6.n(-1, -2));
                }
                TextView b16 = g7.i6.b(context, 14.0f, org.telegram.ui.ActionBar.f6.y6, z12, null);
                b16.setText(LocaleController.getString(R.string.BotAuthInfo));
                f10.addView(b16, g7.e6.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout6 = new FrameLayout(context);
                int dp = AndroidUtilities.dp(16.0f);
                int i12 = org.telegram.ui.ActionBar.f6.d6;
                frameLayout6.setBackground(org.telegram.ui.ActionBar.f6.d0(dp, U5.getThemedColor(i12)));
                org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, U5.getResourceProvider());
                t8Var2.f(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                t8Var2.setBackground(org.telegram.ui.ActionBar.f6.Z(U5.getThemedColor(i12), U5.getThemedColor(org.telegram.ui.ActionBar.f6.i6), 16, 16));
                t8Var2.setOnClickListener(new q50(t8Var2, 11));
                frameLayout6.addView(t8Var2, g7.e6.e(-1, -1, 119));
                f10.addView(frameLayout6, g7.e6.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = g7.i6.b(context, 14.0f, org.telegram.ui.ActionBar.f6.y6, false, null);
                b17.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                f10.addView(b17, g7.e6.t(-1, -2, 55, 22, 6, 22, 20));
                t8Var = t8Var2;
            } else {
                t8Var = null;
            }
            LinearLayout f13 = org.telegram.messenger.ll.f(context, 0);
            final kh.d dVar = new kh.d(context, U5.getResourceProvider(), true);
            dVar.setRoundRadius(24);
            dVar.setColor(U5.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
            dVar.setText(LocaleController.getString(R.string.Decline));
            f13.addView(dVar, g7.e6.p(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final kh.d dVar2 = new kh.d(context, U5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            dVar2.setText(LocaleController.getString(R.string.BotAuthLogin));
            f13.addView(dVar2, g7.e6.p(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f10.addView(f13, g7.e6.t(-1, -2, 7, 12, 12, 12, 8));
            j10.setBackgroundColor(U5.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
            final String[] strArr = {str2};
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout7 = frameLayout;
            final org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
            qk0 qk0Var = new qk0(iArr, tL_messages_requestUrlAuth, j10, z10, str, urlAuthResult2, strArr, z11, y0Var, string, b6Var2);
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && UserConfig.getInstance(i9).getClientUserId() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i13);
                    i13++;
                    Integer num = (Integer) obj;
                    z13 = z16;
                    if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                        qk0Var.run(num);
                        break;
                    } else {
                        arrayList3 = arrayList;
                        z16 = z13;
                    }
                }
            }
            arrayList = arrayList3;
            z13 = z16;
            frameLayout7.setOnClickListener(new ih.d0(j10, frameLayout2, arrayList, iArr, qk0Var));
            boolean[] zArr = new boolean[1];
            dVar.setOnClickListener(new gh.v8(tL_messages_requestUrlAuth, zArr, j10, dVar, y0Var, i9, 5));
            final boolean[] zArr2 = new boolean[1];
            final boolean z17 = z13;
            final ff.k0 k0Var = new ff.k0(tL_urlAuthResultRequest2, strArr, context, i9, new rk0(dVar2, dVar, tL_messages_requestUrlAuth, strArr, t8Var, zArr2, iArr, zArr, j10, string, b6Var2, z10, str, tL_urlAuthResultRequest2, y0Var), U5, 12);
            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (kh.d.this.J || dVar.J) {
                        return;
                    }
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                    boolean z18 = tL_urlAuthResultRequest3.request_phone_number;
                    final ff.k0 k0Var2 = k0Var;
                    if (!z18) {
                        k0Var2.run();
                        return;
                    }
                    final int i14 = 0;
                    TLRPC.User currentUser2 = UserConfig.getInstance(iArr[0]).getCurrentUser();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, U5.getResourceProvider());
                    String string2 = LocaleController.getString(R.string.BotAuthPhoneNumber);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string2;
                    int i15 = R.string.BotAuthPhoneNumberText;
                    String userName = (!z15 || z17) ? string : UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                    final int i16 = 1;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i15, userName, ne.b.c().b("+" + currentUser2.phone).replaceAll(" ", " ")));
                    String string3 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                    final boolean[] zArr3 = zArr2;
                    alertDialog$Builder.h(string3, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.pk0
                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                            switch (i14) {
                                case 0:
                                    zArr3[0] = false;
                                    k0Var2.run();
                                    break;
                                default:
                                    zArr3[0] = true;
                                    k0Var2.run();
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.pk0
                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                            switch (i16) {
                                case 0:
                                    zArr3[0] = false;
                                    k0Var2.run();
                                    break;
                                default:
                                    zArr3[0] = true;
                                    k0Var2.run();
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.d(-2);
                    alertDialog$Builder.o();
                }
            });
            j10.setOnDismissListener(new r5(new org.telegram.ui.ActionBar.f3[1], 9));
            org.telegram.ui.ActionBar.f3 f3Var = a;
            if (f3Var != null) {
                f3Var.dismiss();
                a = null;
            }
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                a = c(context, i9, tL_urlAuthResultRequest2.match_codes, string, new Utilities.Callback() { // from class: org.telegram.ui.ok0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        String str4 = (String) obj2;
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                        c2Var.q(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str4;
                        tL_messages_checkUrlAuthMatchCode.match_code = str4;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i9).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new org.telegram.messenger.a(), new gh.b2(c2Var, j10, string, b6Var2, 1));
                    }
                }, false, new org.telegram.ui.Components.y01(zArr, y0Var, tL_messages_requestUrlAuth, i9, 6), U5.getResourceProvider());
            } else {
                a = j10;
                j10.show();
            }
        }
    }

    public static org.telegram.ui.ActionBar.f3 c(Context context, int i9, ArrayList arrayList, String str, Utilities.Callback callback, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        Drawable drawable;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, null, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j10.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f));
        linearLayout.addView(linearLayout2, g7.e6.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i9).isTestBackend()) {
            i10 = 0;
            while (i10 < 4) {
                if (UserConfig.getInstance(i10).isClientActivated() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                    break;
                }
                i10++;
            }
        }
        i10 = i9;
        org.telegram.ui.Components.o9[] o9VarArr = new org.telegram.ui.Components.o9[arrayList.size()];
        int i11 = 0;
        boolean z11 = true;
        while (i11 < arrayList.size()) {
            String str2 = (String) arrayList.get(i11);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(70.0f), org.telegram.ui.ActionBar.f6.l1(0.05f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                drawable = new sk0(new org.telegram.ui.Components.nz0(str2, 30.0f, AndroidUtilities.bold()), b6Var);
                z11 = false;
            } else {
                drawable = emojiBigDrawable;
            }
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9VarArr[i11] = o9Var;
            o9Var.getImageReceiver().setCurrentAccount(i10);
            o9Var.l(null, null, null, null, drawable, null);
            NotificationCenter.listenEmojiLoading(o9Var);
            frameLayout.addView(o9Var, g7.e6.e(40, 40, 17));
            linearLayout2.addView(frameLayout, g7.e6.t(70, 70, 16, i11 == 0 ? 0 : 24, 0, 0, 0));
            g7.g6.a(frameLayout);
            frameLayout.setOnClickListener(new b0(f3VarArr, callback, str2));
            i11++;
        }
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, null, false, new eb0(4, arrayList, o9VarArr));
        textView.setText(LocaleController.getString(z11 ? R.string.BotAuthSelectEmoji : R.string.BotAuthSelectCode));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
        linearLayout.addView(textView2, g7.e6.t(-1, -2, 1, 0, 23, 0, 11));
        kh.d i12 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        if (z10) {
            i12.d();
            i12.setText(LocaleController.getString(R.string.Cancel));
        } else {
            i12.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var));
            i12.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(i12, g7.e6.t(-1, 48, 7, 12, 12, 12, 12));
        i12.setOnClickListener(new b0(i12, f3VarArr, runnable, 13));
        j10.show();
        f3VarArr[0] = j10;
        return j10;
    }
}
