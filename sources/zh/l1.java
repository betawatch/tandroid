package zh;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.pb;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ l1(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a2  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder replaceTags;
        boolean z10;
        h5 h5Var;
        int i10 = this.a;
        a3 a3Var = this.b;
        switch (i10) {
            case 0:
                u7 u7Var = a3Var.J0;
                u7Var.p();
                AndroidUtilities.runOnUIThread(new j2(u7Var, 1), 30L);
                break;
            case 1:
                a3Var.L0.q(!r1.f0, true);
                break;
            case 2:
                h2 h2Var = a3Var.c1;
                TL_stories.StoryItem storyItem = a3Var.O1.a;
                if (storyItem != null) {
                    if (a3Var.C1) {
                        a3Var.F0(storyItem.privacy.isEmpty() ? new pb(3, a3Var.C2, new ArrayList()) : new pb(a3Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (a3Var.F0 == null) {
                            bi.x4 x4Var = new bi.x4(a3Var.getContext(), 1);
                            x4Var.p(true);
                            x4Var.K = Layout.Alignment.ALIGN_CENTER;
                            x4Var.l0 = new j1(a3Var, 9);
                            a3Var.F0 = x4Var;
                            x4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            h2Var.addView(a3Var.F0, w7.a6.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                a3Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                a3Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, a3Var.F0.getTextPaint().getFontMetricsInt(), false);
                                bi.x4 x4Var2 = a3Var.F0;
                                x4Var2.h = !z10 ? bi.x4.a(replaceEmoji, x4Var2.getTextPaint()) : h2Var.getMeasuredWidth();
                                a3Var.F0.s(replaceEmoji);
                                a3Var.F0.l(1.0f, (-(h2Var.getWidth() - a3Var.C0.getCenterX())) / AndroidUtilities.density);
                                u7 u7Var2 = ((l7) a3Var.Q1).d;
                                u7Var2.i1 = true;
                                u7Var2.P();
                                if (a3Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                a3Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                a3Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, a3Var.F0.getTextPaint().getFontMetricsInt(), false);
                            bi.x4 x4Var22 = a3Var.F0;
                            x4Var22.h = !z10 ? bi.x4.a(replaceEmoji2, x4Var22.getTextPaint()) : h2Var.getMeasuredWidth();
                            a3Var.F0.s(replaceEmoji2);
                            a3Var.F0.l(1.0f, (-(h2Var.getWidth() - a3Var.C0.getCenterX())) / AndroidUtilities.density);
                            u7 u7Var22 = ((l7) a3Var.Q1).d;
                            u7Var22.i1 = true;
                            u7Var22.P();
                            if (a3Var.F0.V) {
                            }
                            a3Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(a3Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        nf.f.s(a3Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                z2 z2Var = a3Var.O1;
                if (z2Var != null && (h5Var = z2Var.b) != null) {
                    h5Var.I = false;
                    h5Var.d = false;
                    h5Var.h = 0.0f;
                    h5Var.r = 0.0f;
                    h5Var.n = 0.0f;
                    if (h5Var.e != null) {
                        try {
                            new File(h5Var.e).delete();
                            h5Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    h5Var.d();
                    a3Var.f1(false);
                    break;
                }
                break;
            case 5:
                t0 t0Var = t0.W;
                if (t0Var != null) {
                    boolean o9 = t0Var.o();
                    t0 t0Var2 = t0.W;
                    boolean z11 = !o9;
                    if (t0Var2.n && t0Var2.r != z11) {
                        t0Var2.r = z11;
                        NativeInstance nativeInstance = t0Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    a3Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                o1 o1Var = a3Var.L0;
                if (!a3Var.D0(false)) {
                    xh.v5 y3 = xh.v5.y(a3Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        o1Var.k(a3Var.D0(false));
                        break;
                    } else {
                        o1Var.p();
                        break;
                    }
                } else {
                    o1Var.k(a3Var.D0(false));
                    break;
                }
            case 7:
                Context context = a3Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = a3Var.B0;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, f6Var, false);
                h3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                LinearLayout linearLayout = new LinearLayout(a3Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                w9 w9Var = new w9(a3Var.getContext());
                w9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(a3Var.C2).setPlaceholderImage(w9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(w9Var, w7.a6.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(a3Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                em.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(a3Var.getContext());
                textView2.setGravity(17);
                em.n(org.telegram.ui.ActionBar.j6.r5, f6Var, textView2, 1, 14.0f);
                org.telegram.messenger.a2.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.a6.t(-1, -2, 1, 32, 9, 32, 19));
                bi.d dVar = new bi.d(a3Var.getContext(), f6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                uq uqVar = new uq(R.drawable.mini_switch_lock, 0);
                uqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.a6.q(-1, 48, 1));
                dVar.setOnClickListener(new xh.s1(6, a3Var, h3Var));
                h3Var.setCustomView(linearLayout);
                ((l7) a3Var.Q1).h(h3Var);
                v2 v2Var = a3Var.t1;
                if (v2Var != null) {
                    v2Var.a();
                    break;
                }
                break;
            case 8:
                if (a3Var.k3) {
                    i4.p();
                } else {
                    ((l7) a3Var.Q1).h(new i4(a3Var.getContext(), a3Var.c1.getY() + a3Var.getY(), 0, a3Var.B0));
                }
                v2 v2Var2 = a3Var.t1;
                if (v2Var2 != null) {
                    v2Var2.a();
                    break;
                }
                break;
            case 9:
                ((l7) a3Var.Q1).h(new i4(a3Var.getContext(), a3Var.c1.getY() + a3Var.getY(), 0, a3Var.B0));
                v2 v2Var3 = a3Var.t1;
                if (v2Var3 != null) {
                    v2Var3.a();
                    break;
                }
                break;
            case 10:
                l2 l2Var = a3Var.K0;
                boolean z12 = l2Var.v0;
                ca caVar = l2Var.W;
                if (!z12) {
                    a3Var.h3 = true;
                    l2Var.D(false);
                    break;
                } else if (!caVar.y()) {
                    l2Var.C();
                    break;
                } else if (caVar.y() && Math.abs(l2Var.g0 - l2Var.i0) < AndroidUtilities.touchSlop && Math.abs(l2Var.h0 - l2Var.j0) < AndroidUtilities.touchSlop) {
                    fa faVar = caVar.o(l2Var.getContext()).r;
                    faVar.m();
                    if (!faVar.i && faVar.e) {
                        faVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                a3Var.Y0(true);
                break;
            case 12:
                a3Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = a3Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    a3Var.n0(new j1(a3Var, 10));
                    break;
                } else {
                    a3Var.L0(null);
                    break;
                }
                break;
        }
    }
}
