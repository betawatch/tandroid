package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z10 extends bg.c {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public z10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.n.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        x10 x10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (x10Var = (x10) filtersSetupActivity.n.get(i10)) != null) {
                return x10Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c4  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        char c3;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        x10 x10Var = (x10) arrayList.get(i10);
        if (x10Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z4 = i11 < arrayList.size() && ((x10) arrayList.get(i11)).a != 3;
        boolean z10 = i11 >= arrayList.size();
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(x10Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (TextUtils.isEmpty(x10Var.c)) {
                    a9Var.setText(null);
                    a9Var.setFixedSize(12);
                } else {
                    a9Var.setFixedSize(0);
                    a9Var.setText(x10Var.c);
                }
                a9Var.setBottomPadding(z10 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    s8Var.f(x10Var.c, filtersSetupActivity.getMessagesController().folderTags, z4);
                    s8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                a20 a20Var = (a20) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = x10Var.e;
                a20Var.d = z4;
                a20Var.e = tL_dialogFilterSuggested;
                a20Var.setWillNotDraw(!z4);
                a20Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                a20Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            b20 b20Var = (b20) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(drawable, drawable2);
            b20Var.a.l(((Object) x10Var.c) + "", false);
            b20Var.b.setImageDrawable(nqVar);
            return;
        }
        v10 v10Var = (v10) view;
        MessagesController.DialogFilter dialogFilter = x10Var.d;
        ImageView imageView = v10Var.h;
        org.telegram.ui.ActionBar.k5 k5Var = v10Var.a;
        ImageView imageView2 = v10Var.c;
        View view2 = v10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = v10Var.B;
        MessagesController.DialogFilter dialogFilter2 = v10Var.x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        v10Var.x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z11 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0) {
            c3 = 0;
            if (dialogFilter.color != v10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.j6.r8;
                v10Var.e = i15;
                view2.setBackground(org.telegram.ui.ActionBar.j6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length])));
            }
        } else {
            c3 = 0;
        }
        if (i15 != v10Var.d) {
            ValueAnimator valueAnimator = v10Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                float alpha = imageView2.getAlpha();
                float f10 = i15 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c3] = alpha;
                fArr[1] = f10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                v10Var.y = ofFloat;
                ofFloat.addUpdateListener(new e3(v10Var, 14));
                v10Var.y.setInterpolator(org.telegram.ui.Components.nr.h);
                v10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = v10Var.y;
                if (i15 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(0, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                v10Var.y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            v10Var.d = i15;
        }
        v10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i16 = dialogFilter.flags;
            int i17 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i16 & i17) != i17) {
                if ((i16 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.FilterContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.FilterNonContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.FilterGroups));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.FilterChannels));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.FilterBots));
                }
                if (dialogFilter.alwaysShow.isEmpty() || !dialogFilter.neverShow.isEmpty()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
                }
                if (sb.length() == 0) {
                    sb.append(LocaleController.getString(R.string.FilterNoChats));
                }
                String str = dialogFilter.name;
                if (dialogFilter.isDefault()) {
                    str = LocaleController.getString(R.string.FilterAllChats);
                }
                if (!z11) {
                    v10Var.w = v10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, k5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, k5Var.getPaint().getFontMetricsInt());
                k5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                k5Var.l(replaceAnimatedEmoji, false);
                v10Var.b.setText(sb);
                v10Var.v = z4;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                v10Var.invalidate();
            }
        }
        sb.append(LocaleController.getString(R.string.FilterAllChats));
        if (dialogFilter.alwaysShow.isEmpty()) {
        }
        if (sb.length() != 0) {
        }
        sb.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
        if (sb.length() == 0) {
        }
        String str2 = dialogFilter.name;
        if (dialogFilter.isDefault()) {
        }
        if (!z11) {
        }
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, k5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, k5Var.getPaint().getFontMetricsInt());
        k5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        k5Var.l(replaceAnimatedEmoji2, false);
        v10Var.b.setText(sb);
        v10Var.v = z4;
        if (dialogFilter.isDefault()) {
        }
        v10Var.invalidate();
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 1) {
            if (i10 == 2) {
                v10 v10Var = new v10(this.e, context);
                v10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                v10Var.setOnReorderButtonTouchListener(new org.telegram.ui.ActionBar.i1(r8, this, v10Var));
                v10Var.setOnOptionsClick(new a(this, 28));
                frameLayout = v10Var;
            } else if (i10 == 3) {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            } else if (i10 == 4) {
                b20 b20Var = new b20(context);
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                b20Var.a = k5Var;
                k5Var.setTextSize(16);
                k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                int i11 = org.telegram.ui.ActionBar.j6.o6;
                k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                k5Var.setTag(Integer.valueOf(i11));
                b20Var.addView(k5Var);
                ImageView imageView = new ImageView(context);
                b20Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                b20Var.addView(imageView);
                frameLayout = b20Var;
            } else if (i10 != 6) {
                a20 a20Var = new a20(context);
                TextView textView = new TextView(context);
                a20Var.a = textView;
                b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                a20Var.addView(textView, k7.b6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(context);
                a20Var.b = textView2;
                b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), 1, 13.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                a20Var.addView(textView2, k7.b6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
                a20Var.c = ei0Var;
                ei0Var.setText(LocaleController.getString(R.string.Add));
                ei0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                ei0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                ei0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
                a20Var.addView(ei0Var, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                a20Var.setAddOnClickListener(new org.telegram.ui.Components.rx0(21, this, a20Var));
                frameLayout = a20Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.s8(context);
            }
        } else {
            int i12 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            w10 w10Var = new w10(context);
            org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
            w10Var.a = jj0Var;
            jj0Var.f(i12, 90, 90, null);
            jj0Var.setScaleType(ImageView.ScaleType.CENTER);
            jj0Var.d();
            jj0Var.setImportantForAccessibility(2);
            w10Var.addView(jj0Var, k7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            jj0Var.setOnClickListener(new a(w10Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            w10Var.addView(textView3, k7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = w10Var;
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
