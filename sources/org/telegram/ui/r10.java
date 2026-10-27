package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r10 extends qg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public r10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.n.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        p10 p10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (p10Var = (p10) filtersSetupActivity.n.get(i10)) != null) {
                return p10Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c7  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        p10 p10Var = (p10) arrayList.get(i10);
        if (p10Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((p10) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.q4) view).setText(p10Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (TextUtils.isEmpty(p10Var.c)) {
                    i9Var.setText(null);
                    i9Var.setFixedSize(12);
                } else {
                    i9Var.setFixedSize(0);
                    i9Var.setText(p10Var.c);
                }
                i9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    a9Var.f(p10Var.c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    a9Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                s10 s10Var = (s10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = p10Var.e;
                s10Var.d = z10;
                s10Var.e = tL_dialogFilterSuggested;
                s10Var.setWillNotDraw(!z10);
                s10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                s10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            t10 t10Var = (t10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k7, false), mode));
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
            t10Var.a.l(((Object) p10Var.c) + "", false);
            t10Var.b.setImageDrawable(arVar);
            return;
        }
        n10 n10Var = (n10) view;
        MessagesController.DialogFilter dialogFilter = p10Var.d;
        ImageView imageView = n10Var.h;
        org.telegram.ui.ActionBar.b6 b6Var = n10Var.a;
        ImageView imageView2 = n10Var.c;
        View view2 = n10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = n10Var.H;
        MessagesController.DialogFilter dialogFilter2 = n10Var.x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        n10Var.x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0 && dialogFilter.color != n10Var.e) {
            int dp = AndroidUtilities.dp(22.0f);
            int[] iArr = org.telegram.ui.ActionBar.y6.r8;
            n10Var.e = i15;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
            n10Var.e = i15;
            org.telegram.ui.ActionBar.f7.C(view2, K, org.telegram.ui.ActionBar.f7.N(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
        }
        if (i15 != n10Var.d) {
            ValueAnimator valueAnimator = n10Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(imageView2.getAlpha(), i15 >= 0 ? 0.0f : 1.0f);
                n10Var.y = ofFloat;
                ofFloat.addUpdateListener(new b3(n10Var, 12));
                n10Var.y.setInterpolator(org.telegram.ui.Components.ds.h);
                n10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = n10Var.y;
                if (i15 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(0, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                n10Var.y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            n10Var.d = i15;
        }
        n10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i16 = dialogFilter.flags;
            int i17 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i16 & i17) != i17) {
                if ((i16 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterNonContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterGroups));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterChannels));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterBots));
                }
                if (dialogFilter.alwaysShow.isEmpty() || !dialogFilter.neverShow.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
                }
                if (sb2.length() == 0) {
                    sb2.append(LocaleController.getString(R.string.FilterNoChats));
                }
                String str = dialogFilter.name;
                if (dialogFilter.isDefault()) {
                    str = LocaleController.getString(R.string.FilterAllChats);
                }
                if (!z12) {
                    n10Var.w = n10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, b6Var.getPaint().getFontMetricsInt());
                b6Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                b6Var.l(replaceAnimatedEmoji, false);
                n10Var.b.setText(sb2);
                n10Var.v = z10;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                n10Var.invalidate();
            }
        }
        sb2.append(LocaleController.getString(R.string.FilterAllChats));
        if (dialogFilter.alwaysShow.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
        if (sb2.length() == 0) {
        }
        String str2 = dialogFilter.name;
        if (dialogFilter.isDefault()) {
        }
        if (!z12) {
        }
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, b6Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, b6Var.getPaint().getFontMetricsInt());
        b6Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        b6Var.l(replaceAnimatedEmoji2, false);
        n10Var.b.setText(sb2);
        n10Var.v = z10;
        if (dialogFilter.isDefault()) {
        }
        n10Var.invalidate();
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 17;
            if (i10 != 1) {
                int i12 = 6;
                if (i10 != 2) {
                    if (i10 == 3) {
                        frameLayout = new org.telegram.ui.Cells.i9(context);
                    } else if (i10 == 4) {
                        t10 t10Var = new t10(context);
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
                        t10Var.a = b6Var;
                        b6Var.setTextSize(16);
                        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
                        int i13 = org.telegram.ui.ActionBar.y6.o6;
                        org.telegram.ui.ActionBar.f7.Y(b6Var, i13, null);
                        b6Var.setTag(Integer.valueOf(i13));
                        t10Var.addView(b6Var);
                        ImageView imageView = new ImageView(context);
                        t10Var.b = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        t10Var.addView(imageView);
                        frameLayout = t10Var;
                    } else if (i10 != 6) {
                        s10 s10Var = new s10(context);
                        TextView textView = new TextView(context);
                        s10Var.a = textView;
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                        org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        s10Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                        TextView textView2 = new TextView(context);
                        s10Var.b = textView2;
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, null);
                        org.telegram.messenger.wh.r(textView2, 1, 13.0f, 1, 1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(truncateAt);
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        s10Var.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(context);
                        s10Var.c = xi0Var;
                        xi0Var.setText(LocaleController.getString(R.string.Add));
                        org.telegram.ui.ActionBar.f7.V(xi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
                        xi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
                        int i14 = org.telegram.ui.ActionBar.y6.Oh;
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i14, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                        xi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, x02));
                        Drawable background = xi0Var.getBackground();
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                        xi0Var.setBackground(background);
                        org.telegram.ui.ActionBar.f7.k(xi0Var, background, N, null, null);
                        s10Var.addView(xi0Var, org.telegram.ui.Components.kb1.m(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                        s10Var.setAddOnClickListener(new org.telegram.ui.Components.l51(i11, this, s10Var));
                        frameLayout = s10Var;
                    } else {
                        frameLayout = new org.telegram.ui.Cells.a9(context);
                    }
                } else {
                    n10 n10Var = new n10(this.e, context);
                    n10Var.setOnReorderButtonTouchListener(new fi.o1(i12, this, n10Var));
                    n10Var.setOnOptionsClick(new a(this, 28));
                    frameLayout = n10Var;
                }
            } else {
                int i15 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                o10 o10Var = new o10(context);
                org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                o10Var.a = bk0Var;
                bk0Var.f(i15, 90, 90, null);
                bk0Var.setScaleType(ImageView.ScaleType.CENTER);
                bk0Var.d();
                bk0Var.setImportantForAccessibility(2);
                o10Var.addView(bk0Var, org.telegram.ui.Components.kb1.h(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                bk0Var.setOnClickListener(new a(o10Var, 27));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                o10Var.addView(textView3, org.telegram.ui.Components.kb1.h(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                frameLayout = o10Var;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.q4(context);
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
