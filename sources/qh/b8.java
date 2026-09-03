package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b8 extends FrameLayout {
    public Path B;
    public Paint C;
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.z8 b;
    public final org.telegram.ui.Components.p9 c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final np f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean v;
    public final boolean[] w;
    public long x;
    public boolean y;

    public b8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.b = z8Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.v = true;
        this.w = new boolean[1];
        this.a = g6Var;
        z8Var.r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(l5Var);
        addView(l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.e = l5Var2;
        l5Var2.setTextSize(14);
        l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        l5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(l5Var2);
        addView(l5Var2);
        np npVar = new np(context, 21, g6Var);
        this.f = npVar;
        int i11 = org.telegram.ui.ActionBar.k6.B5;
        int i12 = org.telegram.ui.ActionBar.k6.j7;
        npVar.b(i11, i12, org.telegram.ui.ActionBar.k6.C5);
        npVar.setDrawUnchecked(true);
        npVar.setDrawBackgroundAsArc(10);
        addView(npVar);
        npVar.a(false, false);
        npVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E5, g6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.e;
        if (charSequence == null) {
            l5Var.setTranslationY(0.0f);
            l5Var2.setVisibility(8);
        } else {
            l5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            l5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
            l5Var2.l(charSequence, false);
            l5Var2.setVisibility(0);
        }
    }

    public final void a(int i10, TLRPC.Chat chat) {
        String formatPluralStringComma;
        this.x = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.p9 p9Var = this.c;
        p9Var.setRoundRadius(dp);
        p9Var.e(chat, z8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.l(Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.w;
        zArr[0] = false;
        if (this.r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i10 >= 1) {
                formatPluralStringComma = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i10, new Object[0]);
            } else {
                formatPluralStringComma = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
        } else {
            formatPluralStringComma = (!ChatObject.isChannel(chat) || chat.megagroup) ? i10 >= 1 ? LocaleController.formatPluralStringComma("Members", i10 - 1) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : i10 >= 1 ? LocaleController.formatPluralStringComma("Subscribers", i10 - 1) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
        }
        setSubtitle(formatPluralStringComma);
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.v0(zArr[0] ? org.telegram.ui.ActionBar.k6.n5 : org.telegram.ui.ActionBar.k6.r5, this.a));
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void b(float f10, boolean z4) {
        RadioButton radioButton = this.h;
        np npVar = this.f;
        if (!z4) {
            npVar.animate().cancel();
            npVar.setAlpha(f10);
            radioButton.animate().cancel();
            radioButton.setAlpha(f10);
            return;
        }
        if (Math.abs(npVar.getAlpha() - f10) > 0.1d) {
            npVar.animate().cancel();
            npVar.animate().alpha(f10).start();
        }
        if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f10).start();
        }
    }

    public final void c(boolean z4, boolean z10) {
        np npVar = this.f;
        if (npVar.getVisibility() == 0) {
            npVar.a(z4, z10);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z4, z10);
        }
    }

    public final void d(boolean z4, boolean z10) {
        this.r = z4;
        if (z10 != this.s) {
            this.s = z10;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        setWillNotDraw(!this.y && (this.s || !this.r));
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.e;
        org.telegram.ui.Components.z8 z8Var = this.b;
        if (i10 == 4) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n5, g6Var));
            z8Var.g(7);
            z8Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n5, g6Var));
            z8Var.g(4);
            z8Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n5, g6Var));
            z8Var.g(15);
            z8Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            l5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n5, g6Var));
            z8Var.g(6);
            z8Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.p9 p9Var = this.c;
        p9Var.setImageDrawable(z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = (LocaleController.isRTL ? 5 : 3) | 16;
        boolean z4 = this.s;
        this.c.setLayoutParams(k7.c6.d(40, 40.0f, i10, z4 ? 53.0f : 16.0f, 0.0f, z4 ? 53.0f : 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        int i11 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = this.s ? 105 : 68;
        }
        if (z10) {
            f11 = this.s ? 105 : 68;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(k7.c6.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i12 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = this.s ? 105 : 68;
        }
        if (z11) {
            f13 = this.s ? 105 : 68;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(k7.c6.d(-1, -2.0f, i12, f12, 0.0f, f13, 0.0f));
        this.f.setLayoutParams(k7.c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(k7.c6.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        oq oqVar = new oq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.y) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v02);
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(AndroidUtilities.dp(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.B;
        if (path == null || (paint = this.C) == null || this.s || !this.r || !this.v) {
            return;
        }
        canvas2.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002b A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        RadioButton radioButton;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z10 = false;
        np npVar = this.f;
        if (npVar != null) {
            try {
                if (npVar.getVisibility() == 0) {
                    z4 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z10 = true;
                    }
                    if (!z4 || z10) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z4 ? npVar.a.q : radioButton.f);
                        accessibilityNodeInfo.setClassName(!z4 ? "android.widget.CheckBox" : "android.widget.RadioButton");
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        z4 = false;
        radioButton = this.h;
        if (radioButton != null) {
            z10 = true;
        }
        if (z4) {
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(!z4 ? npVar.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z4 ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.B;
        if (path == null) {
            this.B = new Path();
        } else {
            path.rewind();
        }
        float dp = LocaleController.isRTL ? AndroidUtilities.dp(31.0f) : getMeasuredWidth() - AndroidUtilities.dp(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        this.B.moveTo(dp, measuredHeight - AndroidUtilities.dp(6.0f));
        this.B.lineTo((f10 * AndroidUtilities.dp(6.0f)) + dp, measuredHeight);
        this.B.lineTo(dp, measuredHeight + AndroidUtilities.dp(6.0f));
        if (this.C == null) {
            Paint paint = new Paint(1);
            this.C = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.C.setStrokeCap(Paint.Cap.ROUND);
        }
        this.C.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
        this.C.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z4 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        if (z4) {
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            l5Var.setTypeface(null);
            l5Var.setTranslationX((-AndroidUtilities.dp(52.0f)) * (LocaleController.isRTL ? -1 : 1));
            l5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z4) {
        this.y = z4;
        setWillNotDraw(!z4 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z4) {
        this.f.b(z4 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.x = user == null ? 0L : user.id;
        org.telegram.ui.Components.z8 z8Var = this.b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.p9 p9Var = this.c;
        p9Var.setRoundRadius(dp);
        p9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.l(Emoji.replaceEmoji(userName, l5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.w;
        zArr[0] = false;
        boolean z4 = this.r;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.e;
        if (z4) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.r5, g6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(zArr[0] ? org.telegram.ui.ActionBar.k6.n5 : org.telegram.ui.ActionBar.k6.r5, g6Var));
        }
        int i10 = this.s ? 0 : 8;
        np npVar = this.f;
        npVar.setVisibility(i10);
        npVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
